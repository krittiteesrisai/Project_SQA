package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

/**
 * Unit tests for {@link DOMNodePointer} (Defects4J JXPath-13b).
 *
 * หมายเหตุทั่วไป:
 * - ใช้ javax.xml.parsers (JAXP, backed by xerces-2.4.0.jar) สร้าง DOM Document
 *   โดยไม่เปิด namespace-aware ของ parser เนื่องจาก DOMNodePointer ทำ namespace
 *   resolution ของตัวเองด้วยการไล่หา attribute "xmlns:" แบบ manual (ไม่พึ่งพา
 *   DOM namespace API ของ parser) - แต่สำหรับ Element ที่สร้างด้วย createElementNS
 *   โดยตรง DOM จะ set prefix/localName/namespaceURI ให้เสมอไม่ว่า parser จะ
 *   namespace-aware หรือไม่
 * - บาง branch (เช่น NodeTest ที่ไม่ใช่ NodeNameTest/NodeTypeTest/
 *   ProcessingInstructionTest, การ resolve prefix ผ่าน getNamespaceResolver()
 *   ใน asPath()) ไม่สามารถทดสอบได้อย่างแน่ชัดจากซอร์สที่ให้มาเพียงอย่างเดียว
 *   จึงมีคอมเมนต์กำกับไว้ และ/หรือ assert แบบกว้าง ๆ เท่าที่มั่นใจ
 */
public class DOMNodePointerTest {

    private Document doc;

    private Document parse(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    private Document parseNsAware(String xml, boolean nsAware) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(nsAware);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    private Node findChild(Element parent, String name, int occurrence) {
        NodeList children = parent.getChildNodes();
        int count = 0;
        for (int i = 0; i < children.getLength(); i++) {
            Node n = children.item(i);
            if (n.getNodeType() == Node.ELEMENT_NODE && n.getNodeName().equals(name)) {
                if (count == occurrence) {
                    return n;
                }
                count++;
            }
        }
        return null;
    }

    private Node findPI(Element parent, String target) {
        NodeList children = parent.getChildNodes();
        for (int i = 0; i < children.getLength(); i++) {
            Node n = children.item(i);
            if (n.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE
                    && ((ProcessingInstruction) n).getTarget().equals(target)) {
                return n;
            }
        }
        return null;
    }

    /** Stub AbstractFactory used by createChild() tests. */
    private static class StubFactory extends AbstractFactory {
        boolean createResult;

        public boolean createObject(JXPathContext context, Pointer pointer,
                Object parent, String name, int index) {
            if (createResult) {
                Node parentNode = (Node) parent;
                Document ownerDoc = parentNode instanceof Document
                        ? (Document) parentNode : parentNode.getOwnerDocument();
                Element el = ownerDoc.createElement(name);
                parentNode.appendChild(el);
            }
            return createResult;
        }
    }

    @Before
    public void setUp() throws Exception {
        doc = parse("<root xmlns:a='urn:a' a:attr='v'>"
                + "<child1/><child1/>"
                + "<child2 xml:lang='en-US'>Text</child2>"
                + "<!--comment-->"
                + "<?pi1 data?>"
                + "</root>");
    }

    // ===================== testNode() =====================

    @Test
    public void testTestNode_NullTest_ReturnsTrue() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertTrue(ptr.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTest_NotElementNode_ReturnsFalse() {
        Node textNode = doc.createTextNode("abc");
        QName qn = new QName(null, "child1");
        NodeNameTest test = new NodeNameTest(qn, null);
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardNoPrefix_ReturnsTrue() {
        Element el = doc.createElement("foo");
        QName qn = new QName(null, "*");
        NodeNameTest test = new NodeNameTest(qn, null);
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_MatchName_NoNamespace_ReturnsTrue() {
        Element el = doc.createElement("child1");
        QName qn = new QName(null, "child1");
        NodeNameTest test = new NodeNameTest(qn, null);
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch_ReturnsFalse() {
        Element el = doc.createElement("child1");
        QName qn = new QName(null, "child2");
        NodeNameTest test = new NodeNameTest(qn, null);
        assertFalse(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_NamespaceMatch_ReturnsTrue() {
        Element el = doc.createElementNS("urn:ns1", "p:child1");
        QName qn = new QName("p", "child1");
        NodeNameTest test = new NodeNameTest(qn, "urn:ns1");
        assertTrue(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeNameTest_NamespaceMismatch_ReturnsFalse() {
        Element el = doc.createElementNS("urn:ns1", "p:child1");
        QName qn = new QName("p", "child1");
        NodeNameTest test = new NodeNameTest(qn, "urn:other");
        assertFalse(DOMNodePointer.testNode(el, test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_Element_True() {
        Element el = doc.createElement("x");
        assertTrue(DOMNodePointer.testNode(el, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_Document_True() {
        assertTrue(DOMNodePointer.testNode(doc, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_Other_False() {
        Node textNode = doc.createTextNode("abc");
        assertFalse(DOMNodePointer.testNode(textNode, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text_TextNode_True() {
        Node textNode = doc.createTextNode("abc");
        assertTrue(DOMNodePointer.testNode(textNode, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text_CDATA_True() {
        Node cdata = doc.createCDATASection("abc");
        assertTrue(DOMNodePointer.testNode(cdata, new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Comment_True() {
        Node comment = doc.createComment("c");
        assertTrue(DOMNodePointer.testNode(comment, new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI_True() {
        Node pi = doc.createProcessingInstruction("t1", "d");
        assertTrue(DOMNodePointer.testNode(pi, new NodeTypeTest(Compiler.NODE_TYPE_PI)));
    }

    @Test
    public void testTestNode_NodeTypeTest_DefaultCase_False() {
        // ค่า constant ที่ไม่ตรง case ใด ๆ ใน switch -> ตก default -> false
        Element el = doc.createElement("x");
        assertFalse(DOMNodePointer.testNode(el, new NodeTypeTest(9999)));
    }

    @Test
    public void testTestNode_PITest_TargetMatch_True() {
        Node pi = doc.createProcessingInstruction("target1", "data");
        assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("target1")));
    }

    @Test
    public void testTestNode_PITest_TargetMismatch_False() {
        Node pi = doc.createProcessingInstruction("target1", "data");
        assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("other")));
    }

    @Test
    public void testTestNode_PITest_NotPINode_False() {
        Node el = doc.createElement("x");
        assertFalse(DOMNodePointer.testNode(el, new ProcessingInstructionTest("target1")));
    }

    // หมายเหตุ: branch "return false" สุดท้ายของ testNode() (เมื่อ test ไม่ใช่
    // instance ของ NodeNameTest/NodeTypeTest/ProcessingInstructionTest เลย)
    // ไม่สามารถทดสอบได้โดยไม่สร้าง custom subclass ของ NodeTest ซึ่งไม่มีข้อมูล
    // constructor/visibility ยืนยันในซอร์สที่ให้มา จึงข้ามไว้

    // ===================== getName() =====================

    @Test
    public void testGetName_Element() {
        Element el = doc.createElementNS("urn:ns", "p:child1");
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        QName qn = ptr.getName();
        assertEquals("p", qn.getPrefix());
        assertEquals("child1", qn.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        Node pi = doc.createProcessingInstruction("target1", "data");
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.US);
        QName qn = ptr.getName();
        assertNull(qn.getPrefix());
        assertEquals("target1", qn.getName());
    }

    @Test
    public void testGetName_OtherNodeType() {
        Node textNode = doc.createTextNode("abc");
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        QName qn = ptr.getName();
        assertNull(qn.getPrefix());
        assertNull(qn.getName());
    }

    // ===================== getNamespaceURI(String prefix) / getDefaultNamespaceURI() ====

    @Test
    public void testGetNamespaceURI_NullPrefix_DelegatesToDefault() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertNull(ptr.getNamespaceURI(null));
    }

    @Test
    public void testGetNamespaceURI_EmptyPrefix_DelegatesToDefault() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertNull(ptr.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURI_XmlPrefix() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
    }

    @Test
    public void testGetNamespaceURI_XmlnsPrefix() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void testGetNamespaceURI_FoundInTree() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertEquals("urn:a", ptr.getNamespaceURI("a"));
    }

    @Test
    public void testGetNamespaceURI_NotFound_ReturnsNull() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertNull(ptr.getNamespaceURI("unknownprefix"));
    }

    @Test
    public void testGetNamespaceURI_CachedValue_SecondCallUsesMap() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        String uri1 = ptr.getNamespaceURI("a");
        String uri2 = ptr.getNamespaceURI("a"); // hits "namespace = map.get(prefix)" branch
        assertEquals(uri1, uri2);
    }

    @Test
    public void testGetNamespaceURI_DocumentNodeAsRoot() {
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.US);
        assertEquals("urn:a", ptr.getNamespaceURI("a"));
    }

    @Test
    public void testGetDefaultNamespaceURI_NotSet_ReturnsNull() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_SetOnParent() throws Exception {
        Document d2 = parse("<root xmlns='urn:default'><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.US);
        assertEquals("urn:default", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_DocumentNode() throws Exception {
        Document d2 = parse("<root xmlns='urn:default'/>");
        DOMNodePointer ptr = new DOMNodePointer(d2, Locale.US);
        assertEquals("urn:default", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void testGetDefaultNamespaceURI_CachedOnSecondCall() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        String v1 = ptr.getDefaultNamespaceURI();
        String v2 = ptr.getDefaultNamespaceURI();
        assertEquals(v1, v2);
    }

    // ===================== trivial getters =====================

    @Test
    public void testSimpleGetters() {
        Element el = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        assertSame(el, ptr.getBaseValue());
        assertSame(el, ptr.getImmediateNode());
        assertTrue(ptr.isActual());
        assertFalse(ptr.isCollection());
        assertEquals(1, ptr.getLength());
    }

    @Test
    public void testIsLeaf_NoChildren_True() {
        Node textNode = doc.createTextNode("abc");
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void testIsLeaf_HasChildren_False() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertFalse(ptr.isLeaf());
    }

    // ===================== isLanguage() / findEnclosingAttribute() =====================

    @Test
    public void testIsLanguage_HasLangAttrOnAncestor_Match() throws Exception {
        Document d2 = parse("<root xml:lang='en-US'><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.US);
        assertTrue(ptr.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_HasLangAttrOnAncestor_NoMatch() throws Exception {
        Document d2 = parse("<root xml:lang='en-US'><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.US);
        assertFalse(ptr.isLanguage("fr"));
    }

    @Test
    public void testIsLanguage_NoLangAttr_DelegatesToSuper() throws Exception {
        // current == null -> super.isLanguage(lang); ไม่ assert ค่าเจาะจงเพราะ
        // พฤติกรรมของ superclass ไม่ได้แสดงในซอร์สที่ให้มา - เช็คแค่ไม่ throw
        Document d2 = parse("<root><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.US);
        ptr.isLanguage("en");
    }

    @Test
    public void testFindEnclosingAttribute_NullNode_ReturnsNull() {
        assertNull(DOMNodePointer.findEnclosingAttribute(null, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttribute_NotFoundAnywhere_ReturnsNull() throws Exception {
        Document d2 = parse("<root><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        assertNull(DOMNodePointer.findEnclosingAttribute(child, "xml:lang"));
    }

    @Test
    public void testFindEnclosingAttribute_FoundOnParent() throws Exception {
        Document d2 = parse("<root xml:lang='en'><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        assertEquals("en", DOMNodePointer.findEnclosingAttribute(child, "xml:lang"));
    }

    // ===================== setValue() =====================

    @Test
    public void testSetValue_TextNode_NonEmptyString_SetsNodeValue() {
        Node textNode = doc.createTextNode("old");
        doc.getDocumentElement().appendChild(textNode);
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        ptr.setValue("new");
        assertEquals("new", textNode.getNodeValue());
    }

    @Test
    public void testSetValue_TextNode_EmptyString_RemovesNode() {
        Element parentEl = doc.createElement("p");
        doc.getDocumentElement().appendChild(parentEl);
        Node textNode = doc.createTextNode("old");
        parentEl.appendChild(textNode);
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        ptr.setValue("");
        assertEquals(0, parentEl.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_CDATA_NullValue_RemovesNode() {
        Element parentEl = doc.createElement("p");
        doc.getDocumentElement().appendChild(parentEl);
        Node cdata = doc.createCDATASection("old");
        parentEl.appendChild(cdata);
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.US);
        ptr.setValue(null);
        assertEquals(0, parentEl.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_Element_StringValue_ReplacesChildren() {
        Element el = doc.createElement("p");
        doc.getDocumentElement().appendChild(el);
        el.appendChild(doc.createTextNode("existing"));
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        ptr.setValue("hello");
        assertEquals(1, el.getChildNodes().getLength());
        assertEquals("hello", el.getFirstChild().getNodeValue());
    }

    @Test
    public void testSetValue_Element_EmptyStringValue_NoChildAppended() {
        Element el = doc.createElement("p");
        doc.getDocumentElement().appendChild(el);
        el.appendChild(doc.createTextNode("existing"));
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        ptr.setValue("");
        assertEquals(0, el.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_Element_ElementNodeValue_AppendsClonedChildren() throws Exception {
        Element el = doc.createElement("p");
        doc.getDocumentElement().appendChild(el);
        el.appendChild(doc.createTextNode("existing"));

        Document srcDoc = parse("<src><a>1</a><b>2</b></src>");
        Element srcEl = srcDoc.getDocumentElement();

        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        ptr.setValue(srcEl);
        assertEquals(2, el.getChildNodes().getLength());
        assertEquals("a", el.getChildNodes().item(0).getNodeName());
    }

    @Test
    public void testSetValue_Element_DocumentNodeValue_AppendsClonedChildren() throws Exception {
        Element el = doc.createElement("p");
        doc.getDocumentElement().appendChild(el);

        Document srcDoc = parse("<src><a>1</a></src>");

        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        ptr.setValue(srcDoc);
        assertEquals(1, el.getChildNodes().getLength());
    }

    @Test
    public void testSetValue_Element_OtherNodeValue_ClonesDirectly() {
        Element el = doc.createElement("p");
        doc.getDocumentElement().appendChild(el);

        Node commentNode = doc.createComment("c");

        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        ptr.setValue(commentNode);
        assertEquals(1, el.getChildNodes().getLength());
        assertEquals(Node.COMMENT_NODE, el.getFirstChild().getNodeType());
    }

    // ===================== createChild() =====================

    @Test
    public void testCreateChild_FactorySuccess_ReturnsPointer() {
        Element parentEl = doc.createElement("parent");
        doc.getDocumentElement().appendChild(parentEl);
        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.US);

        JXPathContext context = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.createResult = true;
        context.setFactory(factory);

        QName name = new QName(null, "newchild");
        NodePointer result = parentPtr.createChild(context, name, 0);
        assertNotNull(result);
        assertEquals("newchild", ((Node) result.getImmediateNode()).getNodeName());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryFails_Throws() {
        Element parentEl = doc.createElement("parent");
        doc.getDocumentElement().appendChild(parentEl);
        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.US);

        JXPathContext context = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.createResult = false;
        context.setFactory(factory);

        parentPtr.createChild(context, new QName(null, "newchild"), 0);
    }

    @Test
    public void testCreateChild_WholeCollectionIndex_TreatedAsZero() {
        Element parentEl = doc.createElement("parent");
        doc.getDocumentElement().appendChild(parentEl);
        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.US);

        JXPathContext context = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.createResult = true;
        context.setFactory(factory);

        NodePointer result = parentPtr.createChild(
                context, new QName(null, "newchild"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(result);
    }

    @Test
    public void testCreateChild_WithValue_SetsValueAfterCreate() {
        Element parentEl = doc.createElement("parent");
        doc.getDocumentElement().appendChild(parentEl);
        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.US);

        JXPathContext context = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.createResult = true;
        context.setFactory(factory);

        NodePointer result = parentPtr.createChild(
                context, new QName(null, "newchild"), 0, "textvalue");
        assertNotNull(result);
        assertEquals("textvalue", ((Node) result.getImmediateNode()).getFirstChild().getNodeValue());
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_NoFactorySet_Throws() {
        Element parentEl = doc.createElement("parent");
        doc.getDocumentElement().appendChild(parentEl);
        DOMNodePointer parentPtr = new DOMNodePointer(parentEl, Locale.US);

        JXPathContext context = JXPathContext.newContext(new Object());
        // factory not set -> getAbstractFactory() ควร throw JXPathException
        parentPtr.createChild(context, new QName(null, "newchild"), 0);
    }

    // ===================== createAttribute() =====================

    @Test
    public void testCreateAttribute_NotElement_DelegatesToSuper() {
        // node ไม่ใช่ Element -> super.createAttribute(...) ถูกเรียก
        // พฤติกรรมจริงของ super ไม่ปรากฏในซอร์สที่ให้มา จึงรับทั้งกรณี exception
        // หรือค่า return โดยไม่ assert ผลลัพธ์เฉพาะเจาะจง
        Node textNode = doc.createTextNode("abc");
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        try {
            ptr.createAttribute(context, new QName(null, "attr1"));
        } catch (RuntimeException e) {
            // acceptable - behavior defined in superclass, not shown here
        }
    }

    @Test
    public void testCreateAttribute_Element_NoPrefix_NotExisting_SetsAttribute() {
        Element el = doc.createElement("elem");
        doc.getDocumentElement().appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = ptr.createAttribute(context, new QName(null, "attr1"));
        assertNotNull(result);
        assertTrue(el.hasAttribute("attr1"));
    }

    @Test
    public void testCreateAttribute_Element_NoPrefix_AlreadyExisting_DoesNotOverwrite() {
        Element el = doc.createElement("elem");
        el.setAttribute("attr1", "existingvalue");
        doc.getDocumentElement().appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = ptr.createAttribute(context, new QName(null, "attr1"));
        assertNotNull(result);
        assertEquals("existingvalue", el.getAttribute("attr1"));
    }

    @Test
    public void testCreateAttribute_Element_WithPrefix_KnownNamespace() {
        Element el = doc.getDocumentElement(); // ประกาศ xmlns:a='urn:a'
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        NodePointer result = ptr.createAttribute(context, new QName("a", "attr2"));
        assertNotNull(result);
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_Element_WithPrefix_UnknownNamespace_Throws() {
        Element el = doc.createElement("elem");
        doc.getDocumentElement().appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        ptr.createAttribute(context, new QName("unknownprefix", "attr2"));
    }

    // ===================== remove() =====================

    @Test(expected = JXPathException.class)
    public void testRemove_RootNode_Throws() {
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.US);
        ptr.remove();
    }

    @Test
    public void testRemove_NonRootNode_RemovesFromParent() {
        Element el = doc.createElement("toremove");
        doc.getDocumentElement().appendChild(el);
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        ptr.remove();
        assertNull(el.getParentNode());
    }

    // ===================== asPath() =====================

    @Test
    public void testAsPath_WithId_SimpleCase() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US, "myid");
        assertEquals("id('myid')", ptr.asPath());
    }

    @Test
    public void testAsPath_WithId_EscapesQuotes() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US, "my'id\"x");
        assertEquals("id('my&apos;id&quot;x')", ptr.asPath());
    }

    @Test
    public void testAsPath_DocumentNode_EmptyPath() {
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.US);
        assertEquals("", ptr.asPath());
    }

    @Test
    public void testAsPath_ElementNode_ParentNotDOMNodePointer_NothingAppended() {
        // parent == null -> ไม่ใช่ instance ของ DOMNodePointer -> ไม่ append อะไรใน
        // case ELEMENT_NODE
        Element el = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        assertEquals("", ptr.asPath());
    }

    @Test
    public void testAsPath_ElementNode_FirstOccurrence() {
        Element rootEl = doc.getDocumentElement();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        Node child1a = findChild(rootEl, "child1", 0);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child1a);
        assertTrue(childPtr.asPath().endsWith("/child1[1]"));
    }

    @Test
    public void testAsPath_ElementNode_SecondOccurrence_SameName() {
        Element rootEl = doc.getDocumentElement();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        Node child1b = findChild(rootEl, "child1", 1);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child1b);
        assertTrue(childPtr.asPath().endsWith("/child1[2]"));
    }

    @Test
    public void testAsPath_TextNode() {
        Element rootEl = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(rootEl, Locale.US);
        Node child2 = findChild(rootEl, "child2", 0);
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, child2);
        Node textChild = child2.getFirstChild();
        DOMNodePointer textPtr = new DOMNodePointer(child2Ptr, textChild);
        assertTrue(textPtr.asPath().endsWith("/text()[1]"));
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() {
        Element rootEl = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(rootEl, Locale.US);
        Node pi = findPI(rootEl, "pi1");
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);
        String path = piPtr.asPath();
        assertTrue(path.contains("/processing-instruction('pi1')[1]"));
    }

    // หมายเหตุ: กรณี ELEMENT_NODE ที่มี namespace URI และ parent เป็น DOMNodePointer
    // (prefix พบ/ไม่พบผ่าน getNamespaceResolver().getPrefix(nsURI)) ขึ้นกับ
    // NamespaceResolver ซึ่งไม่ได้แสดง implementation ในซอร์สที่ให้มา จึงไม่ assert
    // ค่าที่แน่ชัด เพียงยืนยันว่าไม่ throw และได้ string ที่ไม่ null
    @Test
    public void testAsPath_ElementNode_WithNamespace_NoAssertOnExactPrefixBranch() throws Exception {
        Document d2 = parse("<root xmlns:p='urn:p'><p:child/></root>");
        Element rootEl = d2.getDocumentElement();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        Node child = rootEl.getFirstChild();
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child);
        String path = childPtr.asPath();
        assertNotNull(path);
    }

    // ===================== hashCode() / equals() =====================

    @Test
    public void testHashCode_UsesIdentityHashCode() {
        Node el = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.US);
        assertEquals(System.identityHashCode(el), ptr.hashCode());
    }

    @Test
    public void testEquals_SameInstance_True() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void testEquals_SameUnderlyingNode_True() {
        Node el = doc.getDocumentElement();
        DOMNodePointer ptr1 = new DOMNodePointer(el, Locale.US);
        DOMNodePointer ptr2 = new DOMNodePointer(el, Locale.US);
        assertTrue(ptr1.equals(ptr2));
    }

    @Test
    public void testEquals_DifferentNode_False() {
        DOMNodePointer ptr1 = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        DOMNodePointer ptr2 = new DOMNodePointer(doc.createElement("other"), Locale.US);
        assertFalse(ptr1.equals(ptr2));
    }

    @Test
    public void testEquals_DifferentType_False() {
        DOMNodePointer ptr1 = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertFalse(ptr1.equals("not a pointer"));
    }

    @Test
    public void testEquals_Null_False() {
        DOMNodePointer ptr1 = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        assertFalse(ptr1.equals(null));
    }

    // ===================== getPrefix(Node) / getLocalName(Node) static =====================

    @Test
    public void testGetPrefix_HasPrefix_FromNS() {
        Element el = doc.createElementNS("urn:ns", "p:child");
        assertEquals("p", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefix_NoPrefix_NameHasColon() {
        Element el = doc.createElement("p:child"); // non-NS-aware creation; getPrefix() null
        assertEquals("p", DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetPrefix_NoPrefix_NoColon_ReturnsNull() {
        Element el = doc.createElement("child");
        assertNull(DOMNodePointer.getPrefix(el));
    }

    @Test
    public void testGetLocalName_HasLocalName_FromNS() {
        Element el = doc.createElementNS("urn:ns", "p:child");
        assertEquals("child", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalName_NoLocalName_NameHasColon() {
        Element el = doc.createElement("p:child");
        assertEquals("child", DOMNodePointer.getLocalName(el));
    }

    @Test
    public void testGetLocalName_NoLocalName_NoColon() {
        Element el = doc.createElement("child");
        assertEquals("child", DOMNodePointer.getLocalName(el));
    }

    // ===================== getNamespaceURI(Node) static =====================

    @Test
    public void testGetNamespaceURI_Static_DocumentNode_UsesDocumentElement() throws Exception {
        Document d2 = parse("<root xmlns='urn:default'/>");
        assertEquals("urn:default", DOMNodePointer.getNamespaceURI(d2));
    }

    @Test
    public void testGetNamespaceURI_Static_HasNamespaceURI_DirectlyFromElement() throws Exception {
        Document d2 = parseNsAware("<root xmlns='urn:default'/>", true);
        assertEquals("urn:default", DOMNodePointer.getNamespaceURI(d2.getDocumentElement()));
    }

    @Test
    public void testGetNamespaceURI_Static_NoNamespace_WalkUpFindsXmlns() throws Exception {
        Document d2 = parse("<root xmlns='urn:default'><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        assertEquals("urn:default", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetNamespaceURI_Static_NoNamespace_NotFound_ReturnsNull() throws Exception {
        Document d2 = parse("<root><child/></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        assertNull(DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void testGetNamespaceURI_Static_WithPrefix_FoundViaAttr() throws Exception {
        Document d2 = parseNsAware("<root xmlns:p='urn:p'><p:child/></root>", false);
        Node child = d2.getDocumentElement().getFirstChild();
        assertEquals("urn:p", DOMNodePointer.getNamespaceURI(child));
    }

    // ===================== getValue() / stringValue() =====================

    @Test
    public void testGetValue_CommentNode_TrimsData() {
        Node comment = doc.createComment("  hello  ");
        DOMNodePointer ptr = new DOMNodePointer(comment, Locale.US);
        assertEquals("hello", ptr.getValue());
    }

    @Test
    public void testGetValue_TextNode_Trim() {
        Node textNode = doc.createTextNode("  hello  ");
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        assertEquals("hello", ptr.getValue());
    }

    @Test
    public void testGetValue_TextNode_PreserveSpace_NoTrim() throws Exception {
        Document d2 = parse("<root xml:space='preserve'><child> hello </child></root>");
        Node child = d2.getDocumentElement().getFirstChild();
        Node textNode = child.getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.US);
        assertEquals(" hello ", ptr.getValue());
    }

    @Test
    public void testGetValue_CDATA_Trim() {
        Node cdata = doc.createCDATASection("  cdatatext  ");
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.US);
        assertEquals("cdatatext", ptr.getValue());
    }

    @Test
    public void testGetValue_PI_Trim() {
        Node pi = doc.createProcessingInstruction("target1", "  data  ");
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.US);
        assertEquals("data", ptr.getValue());
    }

    @Test
    public void testGetValue_Element_ConcatenatesDescendantText() throws Exception {
        Document d2 = parse("<root>Hello <b>World</b>!</root>");
        DOMNodePointer ptr = new DOMNodePointer(d2.getDocumentElement(), Locale.US);
        String val = (String) ptr.getValue();
        assertTrue(val.contains("Hello"));
        assertTrue(val.contains("World"));
    }

    // ===================== getPointerByID() =====================

    @Test
    public void testGetPointerByID_NotFound_ReturnsNullPointer() {
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer result = ptr.getPointerByID(context, "nonexistent");
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void testGetPointerByID_Found_FromDocumentNode() throws Exception {
        String xml = "<!DOCTYPE root ["
                + "<!ELEMENT root (withid)>"
                + "<!ELEMENT withid EMPTY>"
                + "<!ATTLIST withid id ID #REQUIRED>"
                + "]>"
                + "<root><withid id=\"theid\"/></root>";
        Document d2 = parse(xml);
        Element withEl = (Element) d2.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(d2, Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer result = ptr.getPointerByID(context, "theid");
        assertTrue(result instanceof DOMNodePointer);
        assertEquals(withEl, ((DOMNodePointer) result).getImmediateNode());
    }

    @Test
    public void testGetPointerByID_FromNonDocumentNode_UsesOwnerDocument() throws Exception {
        String xml = "<!DOCTYPE root ["
                + "<!ELEMENT root (withid)>"
                + "<!ELEMENT withid EMPTY>"
                + "<!ATTLIST withid id ID #REQUIRED>"
                + "]>"
                + "<root><withid id=\"theid2\"/></root>";
        Document d2 = parse(xml);
        DOMNodePointer ptr = new DOMNodePointer(d2.getDocumentElement(), Locale.US);
        JXPathContext context = JXPathContext.newContext(new Object());
        Pointer result = ptr.getPointerByID(context, "theid2");
        assertTrue(result instanceof DOMNodePointer);
    }

    // ===================== compareChildNodePointers() =====================

    @Test
    public void testCompareChildNodePointers_SameNode_ReturnsZero() {
        Element rootEl = doc.getDocumentElement();
        Node child = findChild(rootEl, "child1", 0);
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, child);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, child);
        assertEquals(0, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_Node1IsAttr_Node2IsNot_ReturnsMinus1() throws Exception {
        Document d2 = parse("<root attr1='v1'><child/></root>");
        Element rootEl = d2.getDocumentElement();
        Attr attr = rootEl.getAttributeNode("attr1");
        Node child = rootEl.getFirstChild();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        DOMNodePointer attrPtr = new DOMNodePointer(parentPtr, attr);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child);
        assertEquals(-1, parentPtr.compareChildNodePointers(attrPtr, childPtr));
    }

    @Test
    public void testCompareChildNodePointers_Node2IsAttr_Node1IsNot_ReturnsPlus1() throws Exception {
        Document d2 = parse("<root attr1='v1'><child/></root>");
        Element rootEl = d2.getDocumentElement();
        Attr attr = rootEl.getAttributeNode("attr1");
        Node child = rootEl.getFirstChild();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        DOMNodePointer attrPtr = new DOMNodePointer(parentPtr, attr);
        DOMNodePointer childPtr = new DOMNodePointer(parentPtr, child);
        assertEquals(1, parentPtr.compareChildNodePointers(childPtr, attrPtr));
    }

    @Test
    public void testCompareChildNodePointers_BothAttr_ConsistentOrdering() throws Exception {
        Document d2 = parse("<root attr1='v1' attr2='v2'/>");
        Element rootEl = d2.getDocumentElement();
        Attr attr1 = rootEl.getAttributeNode("attr1");
        Attr attr2 = rootEl.getAttributeNode("attr2");
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, attr1);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, attr2);
        int result = parentPtr.compareChildNodePointers(p1, p2);
        int resultReversed = parentPtr.compareChildNodePointers(p2, p1);
        // ลำดับจริงใน NamedNodeMap ขึ้นกับ implementation ของ parser แต่ผลลัพธ์
        // ของการสลับ pointer1/pointer2 ต้องตรงข้ามกันเสมอ (-1 <-> 1) หรือทั้งคู่ 0
        assertEquals(-result, resultReversed);
    }

    @Test
    public void testCompareChildNodePointers_NeitherAttr_Node1First_ReturnsMinus1() throws Exception {
        Document d2 = parse("<root><a/><b/></root>");
        Element rootEl = d2.getDocumentElement();
        Node a = rootEl.getFirstChild();
        Node b = a.getNextSibling();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        DOMNodePointer pa = new DOMNodePointer(parentPtr, a);
        DOMNodePointer pb = new DOMNodePointer(parentPtr, b);
        assertEquals(-1, parentPtr.compareChildNodePointers(pa, pb));
        assertEquals(1, parentPtr.compareChildNodePointers(pb, pa));
    }

    @Test
    public void testCompareChildNodePointers_NeitherFound_ReturnsZero() throws Exception {
        Document d2 = parse("<root><a/></root>");
        Element rootEl = d2.getDocumentElement();
        Document otherDoc1 = parse("<other1><x/></other1>");
        Document otherDoc2 = parse("<other2><y/></other2>");
        Node x = otherDoc1.getDocumentElement().getFirstChild();
        Node y = otherDoc2.getDocumentElement().getFirstChild();
        DOMNodePointer parentPtr = new DOMNodePointer(rootEl, Locale.US);
        DOMNodePointer px = new DOMNodePointer(parentPtr, x);
        DOMNodePointer py = new DOMNodePointer(parentPtr, y);
        assertEquals(0, parentPtr.compareChildNodePointers(px, py));
    }
}
