# วิเคราะห์และแผนการทดสอบ

จากการวิเคราะห์ซอร์สโค้ด `DOMNodePointer` พบว่ามีหลาย method ที่พึ่งพาคลาสภายนอกที่ **ไม่ได้ให้ source มา** เช่น `NodeTest` (abstract), `DOMAttributeIterator`, `NamespaceResolver`, `AbstractFactory`, `escape()` (inherited), `getAbstractFactory()` (inherited) — ผมจะ**หลีกเลี่ยงการเดา behavior ภายในของคลาสเหล่านี้** และจะ:
- ข้าม `createChild(...)` ทั้งสอง overload เพราะพึ่งพา `getAbstractFactory(context)` ที่ไม่มี source ให้
- สำหรับ `createAttribute` จะทดสอบเฉพาะกรณีที่ไม่ต้องพึ่ง `NamespaceResolver` (prefix == null)
- สำหรับ `asPath()` กรณี namespace+prefix จะตรวจสอบแบบ "รูปแบบที่เป็นไปได้" (regex) แทนการ assert ค่าตายตัว เนื่องจาก logic ขึ้นกับ `NamespaceResolver.getPrefix()`
- ใช้ `javax.xml.parsers.DocumentBuilderFactory` (มาตรฐาน JDK) สร้าง DOM จริงเพื่อทดสอบ แทนการ mock DOM node (ลด false-positive จาก mock)

```java
package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;

/**
 * Unit tests for {@link DOMNodePointer} (Defects4J JXPath-22b).
 *
 * หมายเหตุสำคัญ:
 * - บางส่วนของ behavior ขึ้นกับคลาสที่ไม่มี source ให้ (เช่น NamespaceResolver,
 *   DOMAttributeIterator, AbstractFactory, escape()) จึงหลีกเลี่ยงการเดา exact
 *   behavior ของคลาสเหล่านั้น และ comment ไว้ในแต่ละจุด
 * - createChild(...) ถูกข้ามทั้งหมด เนื่องจากพึ่งพา getAbstractFactory(context)
 *   ที่ implementation ไม่ได้แสดงใน source ที่ให้มา
 */
public class DOMNodePointerTest {

    private Document doc;

    @Before
    public void setUp() throws Exception {
        doc = newDocument();
    }

    private Document newDocument() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.newDocument();
    }

    private Document parse(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    // ---------------------------------------------------------------
    // testNode(Node, NodeTest) - static
    // ---------------------------------------------------------------

    @Test
    public void testTestNode_NullTest_ReturnsTrue() {
        Element el = doc.createElement("foo");
        assertTrue(DOMNodePointer.testNode(el, null));
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTest_NonElementNode_ReturnsFalse() {
        Text text = doc.createTextNode("abc");
        NodeNameTest nnt = new NodeNameTest(new QName(null, "foo"));
        assertFalse(DOMNodePointer.testNode(text, nnt));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardNullPrefix_ReturnsTrue() {
        Element el = doc.createElement("foo");
        NodeNameTest nnt = new NodeNameTest(new QName(null, "*"));
        assertTrue(DOMNodePointer.testNode(el, nnt));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardWithPrefix_NamespaceMatches() {
        Element nsEl = doc.createElementNS("http://example.com/ns", "ns:foo");
        NodeNameTest nnt = new NodeNameTest(new QName("ns", "*"), "http://example.com/ns");
        assertTrue(DOMNodePointer.testNode(nsEl, nnt));
    }

    @Test
    public void testTestNode_NodeNameTest_ExactMatch_NamespaceEquals_ReturnsTrue() {
        Element el = doc.createElementNS("http://A", "foo");
        NodeNameTest nnt = new NodeNameTest(new QName(null, "foo"), "http://A");
        assertTrue(DOMNodePointer.testNode(el, nnt));
    }

    @Test
    public void testTestNode_NodeNameTest_ExactMatch_NamespaceMismatch_ReturnsFalse() {
        Element el = doc.createElementNS("http://A", "foo");
        NodeNameTest nnt = new NodeNameTest(new QName(null, "foo"), "http://B");
        assertFalse(DOMNodePointer.testNode(el, nnt));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch_ReturnsFalse() {
        Element el = doc.createElement("foo");
        NodeNameTest nnt = new NodeNameTest(new QName(null, "bar"));
        assertFalse(DOMNodePointer.testNode(el, nnt));
    }

    @Test
    public void testTestNode_NodeTypeTest_AllBranches() {
        Element el = doc.createElement("foo");
        Text txt = doc.createTextNode("x");
        CDATASection cdata = doc.createCDATASection("y");
        Comment comment = doc.createComment("c");
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");

        assertTrue(DOMNodePointer.testNode(el, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
        assertTrue(DOMNodePointer.testNode(txt, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertFalse(DOMNodePointer.testNode(el, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
        assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
        // default case ของ switch (ไม่มี constant ตรงกัน)
        assertFalse(DOMNodePointer.testNode(el, new NodeTypeTest(9999)));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Branches() {
        ProcessingInstruction pi1 = doc.createProcessingInstruction("target1", "data");
        ProcessingInstructionTest matching = new ProcessingInstructionTest("target1");
        ProcessingInstructionTest notMatching = new ProcessingInstructionTest("other");

        assertTrue(DOMNodePointer.testNode(pi1, matching));
        assertFalse(DOMNodePointer.testNode(pi1, notMatching));

        // node ไม่ใช่ PI type -> ตก default return false
        Element el = doc.createElement("foo");
        assertFalse(DOMNodePointer.testNode(el, matching));
    }

    // ---------------------------------------------------------------
    // getName()
    // ---------------------------------------------------------------

    @Test
    public void testGetName_ElementNode() {
        Element el = doc.createElementNS("http://ns", "p:foo");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        QName qn = ptr.getName();
        assertEquals("p", qn.getPrefix());
        assertEquals("foo", qn.getName());
    }

    @Test
    public void testGetName_ProcessingInstructionNode() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        QName qn = ptr.getName();
        assertNull(qn.getPrefix());
        assertEquals("target", qn.getName());
    }

    @Test
    public void testGetName_OtherNodeType_NullParts() {
        Text txt = doc.createTextNode("abc");
        DOMNodePointer ptr = new DOMNodePointer(txt, Locale.getDefault());
        QName qn = ptr.getName();
        assertNull(qn.getName());
    }

    // ---------------------------------------------------------------
    // getNamespaceURI(Node) static / getNamespaceURI() instance
    // ---------------------------------------------------------------

    @Test
    public void testGetNamespaceURIStatic_DirectURI() {
        Element el = doc.createElementNS("http://A", "foo");
        assertEquals("http://A", DOMNodePointer.getNamespaceURI(el));
    }

    @Test
    public void testGetNamespaceURIStatic_DocumentNode_DelegatesToRoot() {
        Element el = doc.createElementNS("http://A", "foo");
        doc.appendChild(el);
        assertEquals("http://A", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void testGetNamespaceURIStatic_FallbackViaXmlnsAttribute() {
        Element noNs = doc.createElement("bar");
        noNs.setAttribute("xmlns", "http://B");
        assertEquals("http://B", DOMNodePointer.getNamespaceURI(noNs));
    }

    @Test
    public void testGetNamespaceURIStatic_FallbackViaAncestorPrefixedXmlns() {
        Element parentEl = doc.createElement("parent");
        parentEl.setAttribute("xmlns:p", "http://C");
        Element child = doc.createElement("p:child");
        parentEl.appendChild(child);
        assertEquals("http://C", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetNamespaceURIStatic_NotFound_ReturnsNull() {
        Element isolated = doc.createElement("iso");
        assertNull(DOMNodePointer.getNamespaceURI(isolated));
    }

    @Test
    public void testGetNamespaceURIInstance_DelegatesToStatic() {
        Element el = doc.createElementNS("http://instNS", "foo");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals("http://instNS", ptr.getNamespaceURI());
    }

    // ---------------------------------------------------------------
    // getNamespaceURI(String prefix) instance
    // ---------------------------------------------------------------

    @Test
    public void testGetNamespaceURIByPrefix_EmptyOrNull_DelegatesToDefault() {
        Element el = doc.createElement("root");
        el.setAttribute("xmlns", "http://default");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals("http://default", ptr.getNamespaceURI(""));
        assertEquals("http://default", ptr.getNamespaceURI((String) null));
    }

    @Test
    public void testGetNamespaceURIByPrefix_XmlAndXmlnsConstants() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURIByPrefix_FoundOnAncestor_AndCached() {
        Element parent = doc.createElement("parent");
        parent.setAttribute("xmlns:p", "http://ns-p");
        Element child = doc.createElement("child");
        parent.appendChild(child);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("http://ns-p", ptr.getNamespaceURI("p"));
        // เรียกซ้ำเพื่อครอบ branch cache (namespaces map ไม่เป็น null แล้ว)
        assertEquals("http://ns-p", ptr.getNamespaceURI("p"));
    }

    @Test
    public void testGetNamespaceURIByPrefix_NotFound_ReturnsNull_AndCached() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertNull(ptr.getNamespaceURI("unknownPrefix"));
        assertNull(ptr.getNamespaceURI("unknownPrefix")); // cached UNKNOWN_NAMESPACE branch
    }

    @Test
    public void testGetNamespaceURIByPrefix_NodeIsDocument() {
        Element root = doc.createElement("root");
        root.setAttribute("xmlns:q", "http://q-ns");
        doc.appendChild(root);
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("http://q-ns", ptr.getNamespaceURI("q"));
    }

    // ---------------------------------------------------------------
    // getDefaultNamespaceURI()
    // ---------------------------------------------------------------

    @Test
    public void testGetDefaultNamespaceURI_FoundAndCached() {
        Element el = doc.createElement("root");
        el.setAttribute("xmlns", "http://def-ns");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals("http://def-ns", ptr.getDefaultNamespaceURI());
        assertEquals("http://def-ns", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_NotFound_ReturnsNull() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_DocumentNode() {
        Element el = doc.createElement("root");
        el.setAttribute("xmlns", "http://doc-def-ns");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("http://doc-def-ns", ptr.getDefaultNamespaceURI());
    }

    // ---------------------------------------------------------------
    // Simple getters
    // ---------------------------------------------------------------

    @Test
    public void testSimpleGetters() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertSame(el, ptr.getBaseValue());
        assertSame(el, ptr.getImmediateNode());
        assertTrue(ptr.isActual());
        assertFalse(ptr.isCollection());
        assertEquals(1, ptr.getLength());
        assertTrue(ptr.isLeaf());

        Element child = doc.createElement("child");
        el.appendChild(child);
        assertFalse(ptr.isLeaf());
    }

    // ---------------------------------------------------------------
    // isLanguage()
    // ---------------------------------------------------------------

    @Test
    public void testIsLanguage_WithXmlLangAttribute() {
        Element el = doc.createElement("root");
        el.setAttribute("xml:lang", "en-US");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr.isLanguage("en"));
        assertFalse(ptr.isLanguage("fr"));
    }

    @Test
    public void testIsLanguage_NoAttribute_DelegatesToSuper_NoException() {
        // NOTE: behavior ของ super.isLanguage() ไม่มีใน source ที่ให้มา
        // จึง assert เพียงว่าไม่เกิด exception ระหว่างเรียก
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        ptr.isLanguage("en"); // ไม่ assert ค่า return เพราะ behavior ไม่ชัดเจนจาก source
    }

    // ---------------------------------------------------------------
    // findEnclosingAttribute() (protected static)
    // ---------------------------------------------------------------

    @Test
    public void testFindEnclosingAttribute_FoundOnSelf() {
        Element el = doc.createElement("root");
        el.setAttribute("xml:lang", "en");
        assertEquals("en", DOMNodePointer.findEnclosingAttribute(el, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttribute_FoundOnAncestor() {
        Element parent = doc.createElement("parent");
        parent.setAttribute("xml:lang", "fr");
        Element child = doc.createElement("child");
        parent.appendChild(child);
        assertEquals("fr", DOMNodePointer.findEnclosingAttribute(child, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttribute_NotFound_ReturnsNull() {
        Element el = doc.createElement("root");
        assertNull(DOMNodePointer.findEnclosingAttribute(el, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttribute_EmptyAttributeSkipped_SearchesAncestor() {
        Element parent = doc.createElement("parent");
        parent.setAttribute("xml:lang", "de");
        Element child = doc.createElement("child"); // ไม่มี attribute -> getAttribute คืน ""
        parent.appendChild(child);
        assertEquals("de", DOMNodePointer.findEnclosingAttribute(child, "xml:lang"));
    }

    // ---------------------------------------------------------------
    // getLanguage() (protected)
    // ---------------------------------------------------------------

    @Test
    public void testGetLanguage() {
        Element el = doc.createElement("root");
        el.setAttribute("xml:lang", "ja");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals("ja", ptr.getLanguage());
    }

    // ---------------------------------------------------------------
    // setValue()
    // ---------------------------------------------------------------

    @Test
    public void testSetValue_TextNode_NonEmptyString() {
        Text txt = doc.createTextNode("old");
        Element parent = doc.createElement("parent");
        parent.appendChild(txt);
        DOMNodePointer ptr = new DOMNodePointer(txt, Locale.getDefault());
        ptr.setValue("new-value");
        assertEquals("new-value", txt.getNodeValue());
    }

    @Test
    public void testSetValue_TextNode_EmptyString_RemovesNode() {
        Text txt = doc.createTextNode("old");
        Element parent = doc.createElement("parent");
        parent.appendChild(txt);
        DOMNodePointer ptr = new DOMNodePointer(txt, Locale.getDefault());
        ptr.setValue("");
        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_TextNode_NullValue_RemovesNode() {
        Text txt = doc.createTextNode("old");
        Element parent = doc.createElement("parent");
        parent.appendChild(txt);
        DOMNodePointer ptr = new DOMNodePointer(txt, Locale.getDefault());
        ptr.setValue(null);
        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_CDATASection_NonEmptyString() {
        CDATASection cdata = doc.createCDATASection("old");
        Element parent = doc.createElement("parent");
        parent.appendChild(cdata);
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        ptr.setValue("newcdata");
        assertEquals("newcdata", cdata.getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_StringValue_AppendsTextChild() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        ptr.setValue("hello");
        assertEquals(1, el.getChildNodes().getLength());
        assertEquals("hello", el.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_EmptyStringValue_NoChildAppended() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        ptr.setValue("");
        assertEquals(0, el.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_ElementNode_RemovesExistingChildrenFirst() {
        Element el = doc.createElement("root");
        el.appendChild(doc.createTextNode("existing1"));
        el.appendChild(doc.createTextNode("existing2"));
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        ptr.setValue("replaced");
        assertEquals(1, el.getChildNodes().getLength());
        assertEquals("replaced", el.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_ValueIsElementNode_CopiesChildren() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());

        Element sourceEl = doc.createElement("source");
        sourceEl.appendChild(doc.createTextNode("child-text"));
        ptr.setValue(sourceEl);

        assertEquals(1, el.getChildNodes().getLength());
        assertEquals("child-text", el.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValue_ElementNode_ValueIsDocumentNode_CopiesChildren() throws Exception {
        Document sourceDoc = newDocument();
        Element sourceRoot = sourceDoc.createElement("sroot");
        sourceRoot.appendChild(sourceDoc.createTextNode("doc-text"));
        sourceDoc.appendChild(sourceRoot);

        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        ptr.setValue(sourceDoc);

        assertEquals(1, el.getChildNodes().getLength());
        assertEquals("sroot", ((Element) el.getFirstChild()).getTagName());
    }

    @Test
    public void testSetValue_ElementNode_ValueIsOtherNodeType_AppendsClone() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());

        Comment comment = doc.createComment("a comment");
        ptr.setValue(comment);

        assertEquals(1, el.getChildNodes().getLength());
        assertEquals(Node.COMMENT_NODE, el.getFirstChild().getNodeType());
    }

    // ---------------------------------------------------------------
    // createAttribute() - เฉพาะ branch ที่ไม่พึ่ง NamespaceResolver
    // ---------------------------------------------------------------

    @Test
    public void testCreateAttribute_ElementNode_NoPrefix_NewAttribute() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);

        NodePointer attrPtr = ptr.createAttribute(context, new QName(null, "attr1"));
        assertNotNull(attrPtr);
        assertTrue(el.hasAttribute("attr1"));
    }

    @Test
    public void testCreateAttribute_ElementNode_NoPrefix_AttributeAlreadyExists_NotOverwritten() {
        Element el = doc.createElement("root");
        el.setAttribute("attr1", "existing-value");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);

        NodePointer attrPtr = ptr.createAttribute(context, new QName(null, "attr1"));
        assertNotNull(attrPtr);
        assertEquals("existing-value", el.getAttribute("attr1"));
    }

    // ---------------------------------------------------------------
    // remove()
    // ---------------------------------------------------------------

    @Test
    public void testRemove_WithParent() {
        Element parent = doc.createElement("parent");
        Element child = doc.createElement("child");
        parent.appendChild(child);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        ptr.remove();
        assertEquals(0, parent.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void testRemove_NoParent_ThrowsException() {
        Element root = doc.createElement("root"); // ไม่ได้ attach เข้า document
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.remove();
    }

    // ---------------------------------------------------------------
    // asPath()
    // ---------------------------------------------------------------

    @Test
    public void testAsPath_WithId() {
        Element el = doc.createElement("foo");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault(), "myid123");
        String path = ptr.asPath();
        // NOTE: escape(id) ไม่มี source ให้ จึงตรวจแค่ pattern โดยรวม
        assertTrue(path.startsWith("id('"));
        assertTrue(path.contains("myid123"));
        assertTrue(path.endsWith("')"));
    }

    @Test
    public void testAsPath_DocumentNode_ReturnsEmptyString() {
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("", ptr.asPath());
    }

    @Test
    public void testAsPath_ElementWithNoParentPointer_EmptyResult() {
        // parent == null -> "parent instanceof DOMNodePointer" == false
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals("", ptr.asPath());
    }

    @Test
    public void testAsPath_ElementChild_NoNamespace() {
        Element parentEl = doc.createElement("parent");
        Element childEl = doc.createElement("childname");
        parentEl.appendChild(childEl);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, childEl);

        assertEquals("/childname[1]", childPtr.asPath());
    }

    @Test
    public void testAsPath_ElementWithNamespace_PrefixOrNodeFallback() {
        // NOTE: logic การหา prefix อยู่ใน NamespaceResolver (ไม่มี source ให้)
        // จึงตรวจสอบเพียงว่า format ตรงกับหนึ่งในสอง branch ที่ asPath() รองรับ
        Element parentEl = doc.createElementNS("http://ns-test", "p:parent");
        parentEl.setAttribute("xmlns:p", "http://ns-test");
        Element childEl = doc.createElementNS("http://ns-test", "p:child");
        parentEl.appendChild(childEl);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, childEl);

        String path = childPtr.asPath();
        boolean prefixForm = path.matches(".*/p:child\\[\\d+\\]$");
        boolean nodeForm = path.matches(".*/node\\(\\)\\[\\d+\\]$");
        assertTrue("unexpected path format: " + path, prefixForm || nodeForm);
    }

    @Test
    public void testAsPath_TextNode() {
        Element parentEl = doc.createElement("parent");
        Text textNode = doc.createTextNode("hello");
        parentEl.appendChild(textNode);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer textPtr = new DOMNodePointer(parentPtr, textNode);

        assertEquals("/text()[1]", textPtr.asPath());
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() {
        Element parentEl = doc.createElement("parent");
        ProcessingInstruction pi = doc.createProcessingInstruction("tgt", "data");
        parentEl.appendChild(pi);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer piPtr = new DOMNodePointer(parentPtr, pi);

        assertEquals("/processing-instruction('tgt')[1]", piPtr.asPath());
    }

    @Test
    public void testAsPath_MultipleSameNameSiblings_PositionIncrement() {
        Element parentEl = doc.createElement("parent");
        Element c1 = doc.createElement("item");
        Element c2 = doc.createElement("item");
        Element c3 = doc.createElement("item");
        parentEl.appendChild(c1);
        parentEl.appendChild(c2);
        parentEl.appendChild(c3);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer ptr3 = new DOMNodePointer(parentPtr, c3);

        assertEquals("/item[3]", ptr3.asPath());
    }

    @Test
    public void testAsPath_DifferentNameSiblings_PositionResetPerName() {
        Element parentEl = doc.createElement("parent");
        Element a1 = doc.createElement("a");
        Element b1 = doc.createElement("b");
        Element a2 = doc.createElement("a");
        parentEl.appendChild(a1);
        parentEl.appendChild(b1);
        parentEl.appendChild(a2);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer a2Ptr = new DOMNodePointer(parentPtr, a2);
        DOMNodePointer b1Ptr = new DOMNodePointer(parentPtr, b1);

        assertEquals("/a[2]", a2Ptr.asPath());
        assertEquals("/b[1]", b1Ptr.asPath());
    }

    @Test
    public void testAsPath_MultipleTextSiblings_PositionIncrement() {
        Element parentEl = doc.createElement("parent");
        Text t1 = doc.createTextNode("a");
        Text t2 = doc.createTextNode("b");
        parentEl.appendChild(t1);
        parentEl.appendChild(t2);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer t2Ptr = new DOMNodePointer(parentPtr, t2);

        assertEquals("/text()[2]", t2Ptr.asPath());
    }

    @Test
    public void testAsPath_MultiplePISiblingsSameTarget_PositionIncrement() {
        Element parentEl = doc.createElement("parent");
        ProcessingInstruction pi1 = doc.createProcessingInstruction("tgt", "d1");
        ProcessingInstruction pi2 = doc.createProcessingInstruction("tgt", "d2");
        parentEl.appendChild(pi1);
        parentEl.appendChild(pi2);
        doc.appendChild(parentEl);

        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.getDefault());
        DOMNodePointer pi2Ptr = new DOMNodePointer(parentPtr, pi2);

        assertEquals("/processing-instruction('tgt')[2]", pi2Ptr.asPath());
    }

    // ---------------------------------------------------------------
    // hashCode() / equals()
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_MatchesNodeHashCode() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals(el.hashCode(), ptr.hashCode());
    }

    @Test
    public void testEquals_SameInstance() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void testEquals_SameNodeDifferentPointerInstances() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr1 = new DOMNodePointer(el, Locale.getDefault());
        DOMNodePointer ptr2 = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr1.equals(ptr2));
    }

    @Test
    public void testEquals_DifferentNode() {
        Element el1 = doc.createElement("root1");
        Element el2 = doc.createElement("root2");
        DOMNodePointer ptr1 = new DOMNodePointer(el1, Locale.getDefault());
        DOMNodePointer ptr2 = new DOMNodePointer(el2, Locale.getDefault());
        assertFalse(ptr1.equals(ptr2));
    }

    @Test
    public void testEquals_NotADOMNodePointer() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertFalse(ptr.equals("someString"));
    }

    @Test
    public void testEquals_Null() {
        Element el = doc.createElement("root");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertFalse(ptr.equals(null));
    }

    // ---------------------------------------------------------------
    // getPrefix(Node) / getLocalName(Node) static
    // ---------------------------------------------------------------

    @Test
    public void testGetPrefix_FromNamespaceAwareElement() {
        Element el = doc.createElementNS("http://ns", "p:foo");
        assertEquals("p", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefix_FallbackFromNodeNameColon() {
        Element el = doc.createElement("q:bar");
        assertEquals("q", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefix_NoPrefix_ReturnsNull() {
        Element el = doc.createElement("bar");
        assertNull(DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetLocalName_FromNamespaceAwareElement() {
        Element el = doc.createElementNS("http://ns", "p:foo");
        assertEquals("foo", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalName_FallbackFromNodeName() {
        Element el = doc.createElement("q:bar");
        assertEquals("bar", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalName_NoColon_ReturnsFullName() {
        Element el = doc.createElement("bar");
        assertEquals("bar", DOMNodePointer.getLocalName(el));
    }

    // ---------------------------------------------------------------
    // getValue() / stringValue()
    // ---------------------------------------------------------------

    @Test
    public void testGetValue_CommentNode_Trimmed() {
        Comment c = doc.createComment("  hello world  ");
        DOMNodePointer ptr = new DOMNodePointer(c, Locale.getDefault());
        assertEquals("hello world", ptr.getValue());
    }

    @Test
    public void testGetValue_TextNode_TrimmedByDefault() {
        Element parent = doc.createElement("p");
        Text t = doc.createTextNode("  padded text  ");
        parent.appendChild(t);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(t, Locale.getDefault());
        assertEquals("padded text", ptr.getValue());
    }

    @Test
    public void testGetValue_TextNode_PreservedWithXmlSpacePreserve() {
        Element parent = doc.createElement("p");
        parent.setAttribute("xml:space", "preserve");
        Text t = doc.createTextNode("  padded text  ");
        parent.appendChild(t);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(t, Locale.getDefault());
        assertEquals("  padded text  ", ptr.getValue());
    }

    @Test
    public void testGetValue_CDATASection_Trimmed() {
        Element parent = doc.createElement("p");
        CDATASection cdata = doc.createCDATASection("  cdata text  ");
        parent.appendChild(cdata);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        assertEquals("cdata text", ptr.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction_Trimmed() {
        Element parent = doc.createElement("p");
        ProcessingInstruction pi = doc.createProcessingInstruction("tgt", "  pidata  ");
        parent.appendChild(pi);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals("pidata", ptr.getValue());
    }

    @Test
    public void testGetValue_ElementNode_ConcatenatesChildrenRecursively() {
        Element parent = doc.createElement("p");
        parent.appendChild(doc.createTextNode("Hello "));
        Element inner = doc.createElement("b");
        inner.appendChild(doc.createTextNode("World"));
        parent.appendChild(inner);
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(parent, Locale.getDefault());
        assertEquals("Hello World", ptr.getValue());
    }

    @Test
    public void testGetValue_ElementNode_WithCommentChild_ContributesEmptyString() {
        Element parent = doc.createElement("p");
        parent.appendChild(doc.createTextNode("A"));
        parent.appendChild(doc.createComment("ignored comment"));
        parent.appendChild(doc.createTextNode("B"));
        doc.appendChild(parent);
        DOMNodePointer ptr = new DOMNodePointer(parent, Locale.getDefault());
        assertEquals("AB", ptr.getValue());
    }

    // ---------------------------------------------------------------
    // getPointerByID()
    // ---------------------------------------------------------------

    @Test
    public void testGetPointerByID_Found_FromDocumentNode() throws Exception {
        String xml = "<!DOCTYPE root [<!ELEMENT root (child)*><!ELEMENT child EMPTY>"
                + "<!ATTLIST child id ID #IMPLIED>]>"
                + "<root><child id='abc'/></root>";
        Document d = parse(xml);

        DOMNodePointer ptr = new DOMNodePointer(d, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(d);
        Pointer p = ptr.getPointerByID(ctx, "abc");

        assertNotNull(p);
        assertTrue(p instanceof DOMNodePointer);
        Element found = (Element) ((DOMNodePointer) p).getImmediateNode();
        assertEquals("child", found.getTagName());
    }

    @Test
    public void testGetPointerByID_NotFound_ReturnsNullPointer() throws Exception {
        String xml = "<root><child/></root>";
        Document d = parse(xml);
        DOMNodePointer ptr = new DOMNodePointer(d, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(d);
        Pointer p = ptr.getPointerByID(ctx, "doesNotExist");
        assertNotNull(p);
        assertTrue(p instanceof NullPointer);
    }

    @Test
    public void testGetPointerByID_FromNonDocumentNode_UsesOwnerDocument() throws Exception {
        String xml = "<!DOCTYPE root [<!ELEMENT root (child)*><!ELEMENT child EMPTY>"
                + "<!ATTLIST child id ID #IMPLIED>]>"
                + "<root><child id='xyz'/></root>";
        Document d = parse(xml);
        Element rootEl = d.getDocumentElement();

        DOMNodePointer ptr = new DOMNodePointer(rootEl, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(d);
        Pointer p = ptr.getPointerByID(ctx, "xyz");
        assertTrue(p instanceof DOMNodePointer);
    }

    // ---------------------------------------------------------------
    // compareChildNodePointers()
    // ---------------------------------------------------------------

    @Test
    public void testCompareChildNodePointers_SameNode_ReturnsZero() {
        Element parent = doc.createElement("parent");
        Element child = doc.createElement("child");
        parent.appendChild(child);
        doc.appendChild(parent);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, child);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, child);

        assertEquals(0, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_AttrBeforeElement_Both() {
        Element parent = doc.createElement("parent");
        parent.setAttribute("attrX", "val");
        Attr attrNode = parent.getAttributeNode("attrX");
        Element child = doc.createElement("child");
        parent.appendChild(child);
        doc.appendChild(parent);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.getDefault());
        DOMNodePointer attrPtr = new DOMNodePointer(parentPtr, attrNode);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child);

        assertEquals(-1, parentPtr.compareChildNodePointers(attrPtr, childPtr));
        assertEquals(1, parentPtr.compareChildNodePointers(childPtr, attrPtr));
    }

    @Test
    public void testCompareChildNodePointers_BothAttributes_OrderConsistent() {
        // NOTE: getNode() ใน branch นี้ไม่มี source ให้ตรง ๆ (สันนิษฐานว่า
        // คืนค่า node ของ pointer เดียวกับฟิลด์ node ภายในคลาส)
        Element parent = doc.createElement("parent");
        parent.setAttribute("a1", "v1");
        parent.setAttribute("a2", "v2");
        doc.appendChild(parent);

        Attr attr1 = parent.getAttributeNode("a1");
        Attr attr2 = parent.getAttributeNode("a2");

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, attr1);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, attr2);

        int r1 = parentPtr.compareChildNodePointers(p1, p2);
        int r2 = parentPtr.compareChildNodePointers(p2, p1);
        assertTrue((r1 == -1 && r2 == 1) || (r1 == 1 && r2 == -1));
    }

    @Test
    public void testCompareChildNodePointers_ElementChildren_OrderByPosition() {
        Element parent = doc.createElement("parent");
        Element child1 = doc.createElement("c1");
        Element child2 = doc.createElement("c2");
        parent.appendChild(child1);
        parent.appendChild(child2);
        doc.appendChild(parent);

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, child1);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, child2);

        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointers_NeitherNodeIsActualChild_ReturnsZero() {
        Element parent = doc.createElement("parent");
        doc.appendChild(parent);

        Element outsider1 = doc.createElement("out1");
        Element outsider2 = doc.createElement("out2");
        // ไม่ append เข้า parent -> ครอบ "should not happen" fallback path

        DOMNodePointer parentPtr = new DOMNodePointer(parent, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, outsider1);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, outsider2);

        assertEquals(0, parentPtr.compareChildNodePointers(p1, p2));
    }

    // ---------------------------------------------------------------
    // childIterator / attributeIterator / namespacePointer / namespaceIterator
    // (instantiation & basic behaviour)
    // ---------------------------------------------------------------

    @Test
    public void testChildIterator_IteratesChildren() {
        Element el = doc.createElement("root");
        Element child1 = doc.createElement("child1");
        Element child2 = doc.createElement("child2");
        el.appendChild(child1);
        el.appendChild(child2);
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());

        NodeIterator it = ptr.childIterator(null, false, null);
        assertNotNull(it);
        int count = 0;
        int pos = 1;
        while (it.setPosition(pos)) {
            count++;
            pos++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testAttributeIterator_ReturnsIteratorOverAttribute() {
        Element el = doc.createElement("root");
        el.setAttribute("attrA", "valueA");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());

        NodeIterator it = ptr.attributeIterator(new QName(null, "attrA"));
        assertNotNull(it);
        assertTrue(it.setPosition(1));
    }

    @Test
    public void testNamespacePointer_ReturnsNonNull() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        NodePointer nsPtr = ptr.namespacePointer("p");
        assertNotNull(nsPtr);
    }

    @Test
    public void testNamespaceIterator_ReturnsNonNull() {
        Element el = doc.createElement("root");
        el.setAttribute("xmlns:p", "http://p-ns");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        NodeIterator it = ptr.namespaceIterator();
        assertNotNull(it);
    }

    // ---------------------------------------------------------------
    // getNamespaceResolver() caching
    // ---------------------------------------------------------------

    @Test
    public void testGetNamespaceResolver_CachedInstance() {
        Element el = doc.createElement("root");
        doc.appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        NamespaceResolver r1 = ptr.getNamespaceResolver();
        NamespaceResolver r2 = ptr.getNamespaceResolver();
        assertSame(r1, r2);
    }
}
```

## ตารางสรุปการครอบคลุม (Branch / Condition)

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testTestNode_NullTest...` | `test == null` → true |
| `testTestNode_NodeNameTest_NonElementNode...` | node type != ELEMENT_NODE → false |
| `testTestNode_NodeNameTest_WildcardNullPrefix...` | wildcard && testPrefix==null → true |
| `testTestNode_NodeNameTest_WildcardWithPrefix...` | wildcard=true, prefix!=null, namespace match |
| `testTestNode_NodeNameTest_ExactMatch_NamespaceEquals/Mismatch` | non-wildcard name match + namespace equal/ไม่เท่า |
| `testTestNode_NodeNameTest_NameMismatch...` | ชื่อไม่ตรง → false (early return) |
| `testTestNode_NodeTypeTest_AllBranches` | switch ทุก case: NODE/TEXT(TEXT,CDATA)/COMMENT/PI/default |
| `testTestNode_ProcessingInstructionTest_Branches` | target ตรง/ไม่ตรง/node ไม่ใช่ PI |
| `testGetName_*` | ELEMENT_NODE, PI_NODE, other type (null) |
| `testGetNamespaceURIStatic_*` | document delegate, direct URI, fallback xmlns(self/ancestor), not found |
| `testGetNamespaceURIByPrefix_*` | prefix null/empty, "xml", "xmlns", cache hit/miss, not found, document node |
| `testGetDefaultNamespaceURI_*` | found+cache, not found, document node |
| `testSimpleGetters` | getBaseValue/getImmediateNode/isActual/isCollection/getLength/isLeaf(ก่อน-หลังมี child) |
| `testIsLanguage_*` | current != null (match/mismatch), current == null (super) |
| `testFindEnclosingAttribute_*` | found self, found ancestor, not found, empty attr skip |
| `testGetLanguage` | เรียกใช้ findEnclosingAttribute ผ่าน getLanguage |
| `testSetValue_TextNode_*` / `CDATASection_*` | TEXT/CDATA + string ว่าง/ไม่ว่าง/null → setNodeValue vs removeChild |
| `testSetValue_ElementNode_*` | remove children loop, value เป็น Element/Document/Node อื่น/ไม่ใช่ Node (string ว่าง/ไม่ว่าง) |
| `testCreateAttribute_*` | element branch, attribute exists/not exists (prefix==null เท่านั้น) |
| `testRemove_*` | parent != null / parent == null → exception |
| `testAsPath_*` | id!=null, DOCUMENT_NODE, parent not DOMNodePointer, ELEMENT with/without namespace, TEXT, PI, multi-sibling positions |
| `testHashCode_*`, `testEquals_*` | same instance, same node, different node, wrong type, null |
| `testGetPrefix_*`, `testGetLocalName_*` | มี prefix จริง, fallback จาก nodeName (มี/ไม่มี colon) |
| `testGetValue_*` | COMMENT top-level, TEXT/CDATA/PI (trim/preserve), ELEMENT recursive, comment ใน recursive (="") |
| `testGetPointerByID_*` | DOCUMENT_NODE path, ownerDocument path, found/not found |
| `testCompareChildNodePointers_*` | node1==node2, attr-vs-nonattr ทั้งสองด้าน, attr-attr (map order), ธรรมดา (first/nextSibling), fallback 0 |
| `testChildIterator/AttributeIterator/NamespacePointer/NamespaceIterator` | การสร้าง instance และพฤติกรรมพื้นฐานของแต่ละ iterator/pointer factory method |
| `testGetNamespaceResolver_CachedInstance` | lazy-init + cache (`localNamespaceResolver == null` ทั้งสอง branch) |

**หมายเหตุสิ่งที่ข้าม/ไม่ assert แน่นอน:** `createChild(...)` (ต้องพึ่ง `getAbstractFactory` ที่ไม่มี source), รายละเอียด exact prefix resolution ใน `asPath()` namespace branch (พึ่ง `NamespaceResolver`), และ `super.isLanguage()` behavior — ทั้งหมดมีคอมเมนต์กำกับไว้ในโค้ดตามข้อกำหนด