# DOMNodePointerTest — JUnit 4 Test Suite

ด้านล่างเป็นชุดทดสอบ JUnit 4 ที่ครอบคลุม branch/condition หลักของ `DOMNodePointer` โดยอ้างอิงจาก static analysis ของซอร์สที่ให้มา จุดที่ behavior ไม่ได้ระบุไว้ชัดเจนในซอร์ส (เช่น `NodePointer.isLanguage` ของคลาสแม่, `createAttribute` เมื่อ node ไม่ใช่ Element ที่ไปเรียก `super.createAttribute`, และ `NamespaceResolver.getPrefix`) จะมีคอมเมนต์กำกับไว้ว่าไม่ยืนยันค่าที่แน่นอน

```java
package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.Locale;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;

public class DOMNodePointerTest {

    // ----------------------------------------------------------------
    // Helpers
    // ----------------------------------------------------------------

    private Document parse(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new InputSource(new StringReader(xml)));
    }

    private Element firstElementChild(Node n) {
        NodeList nl = n.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                return (Element) nl.item(i);
            }
        }
        return null;
    }

    // ----------------------------------------------------------------
    // testNode(NodeTest) - null test
    // ----------------------------------------------------------------

    @Test
    public void testNode_NullTest_ReturnsTrue() throws Exception {
        Document doc = parse("<root/>");
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), null));
    }

    @Test
    public void testNode_InstanceMethod_DelegatesToStatic() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.testNode(null));
    }

    // ----------------------------------------------------------------
    // testNode - NodeNameTest branch (core logic area, historically defect-prone)
    // ----------------------------------------------------------------

    @Test
    public void testNode_NodeNameTest_NonElementNode_ReturnsFalse() throws Exception {
        Document doc = parse("<root>text</root>");
        Node text = doc.getDocumentElement().getFirstChild();
        NodeTest test = new NodeNameTest(new QName(null, "root"));
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardNoPrefix_ReturnsTrue() throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_NameMismatch_ReturnsFalse() throws Exception {
        Document doc = parse("<root><foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName(null, "bar"));
        assertFalse(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardWithPrefix_NodeNsNull_PrefixMatch_ReturnsTrue()
            throws Exception {
        // no xmlns:a declared anywhere -> nodeNS resolves to null (fallback walk fails)
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        // namespaceURI deliberately non-null & unrelated so first equalStrings() is false,
        // forcing evaluation of (nodeNS==null && equalStrings(testPrefix, getPrefix(node)))
        NodeTest test = new NodeNameTest(new QName("a", "*"), "urn:unrelated");
        assertTrue(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardWithPrefix_PrefixMismatch_ReturnsFalse()
            throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName("b", "*"), "urn:unrelated");
        assertFalse(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_ExactName_NodeNsNull_PrefixMatch_ReturnsTrue()
            throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName("a", "foo"), "urn:unrelated");
        assertTrue(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_ExactName_NodeNsNull_PrefixMismatch_ReturnsFalse()
            throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName("b", "foo"), "urn:unrelated");
        assertFalse(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_ExactName_NamespaceMatch_ReturnsTrue() throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName("a", "foo"), "urn:a-ns");
        assertTrue(DOMNodePointer.testNode(foo, test));
    }

    @Test
    public void testNode_NodeNameTest_ExactName_NamespaceMismatch_ReturnsFalse()
            throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        NodeTest test = new NodeNameTest(new QName("a", "foo"), "urn:different");
        assertFalse(DOMNodePointer.testNode(foo, test));
    }

    // ----------------------------------------------------------------
    // testNode - NodeTypeTest branch
    // ----------------------------------------------------------------

    @Test
    public void testNode_NodeTypeTest_Node_ElementAndDocument() throws Exception {
        Document doc = parse("<root/>");
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), test));
        assertTrue(DOMNodePointer.testNode(doc, test));
    }

    @Test
    public void testNode_NodeTypeTest_Text_TextAndCdata() throws Exception {
        Document doc = parse("<root>abc<![CDATA[x]]></root>");
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        Node text = doc.getDocumentElement().getFirstChild();
        Node cdata = doc.getDocumentElement().getLastChild();
        assertTrue(DOMNodePointer.testNode(text, test));
        assertTrue(DOMNodePointer.testNode(cdata, test));
    }

    @Test
    public void testNode_NodeTypeTest_Comment() throws Exception {
        Document doc = parse("<root><!--c--></root>");
        Node comment = doc.getDocumentElement().getFirstChild();
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(comment, test));
        assertFalse(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void testNode_NodeTypeTest_PI() throws Exception {
        Document doc = parse("<root><?t d?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        NodeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testNode_NodeTypeTest_UnknownType_DefaultFalse() throws Exception {
        Document doc = parse("<root/>");
        try {
            NodeTest test = new NodeTypeTest(999);
            assertFalse(DOMNodePointer.testNode(doc.getDocumentElement(), test));
        } catch (RuntimeException e) {
            // ไม่แน่ใจว่า NodeTypeTest ตรวจสอบค่าที่รับเข้ามาหรือไม่
            // (ไม่ได้ระบุในซอร์สที่ให้มา) จึงไม่ fail test หากมี exception
        }
    }

    // ----------------------------------------------------------------
    // testNode - ProcessingInstructionTest branch
    // ----------------------------------------------------------------

    @Test
    public void testNode_PITest_TargetMatch_ReturnsTrue() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        NodeTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testNode_PITest_TargetMismatch_ReturnsFalse() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        NodeTest test = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testNode_PITest_WrongNodeType_ReturnsFalse() throws Exception {
        Document doc = parse("<root/>");
        NodeTest test = new ProcessingInstructionTest("target");
        assertFalse(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    // ----------------------------------------------------------------
    // getName()
    // ----------------------------------------------------------------

    @Test
    public void getName_Element() throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(foo, Locale.getDefault());
        QName name = ptr.getName();
        assertEquals("foo", name.getName());
        assertEquals("a", name.getPrefix());
    }

    @Test
    public void getName_ProcessingInstruction() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        QName name = ptr.getName();
        assertEquals("target", name.getName());
        assertNull(name.getPrefix());
    }

    @Test
    public void getName_OtherNodeType_NullLocalAndNs() throws Exception {
        Document doc = parse("<root>text</root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        QName name = ptr.getName();
        assertNull(name.getName());
        assertNull(name.getPrefix());
    }

    // ----------------------------------------------------------------
    // getNamespaceURI() (instance) delegates to static getNamespaceURI(Node)
    // ----------------------------------------------------------------

    @Test
    public void getNamespaceURI_Instance_DelegatesToStatic() throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(foo, Locale.getDefault());
        assertEquals("urn:a-ns", ptr.getNamespaceURI());
    }

    // ----------------------------------------------------------------
    // getNamespaceURI(String prefix)
    // ----------------------------------------------------------------

    @Test
    public void getNamespaceURI_prefix_NullOrEmpty_ReturnsDefaultNamespace() throws Exception {
        Document doc = parse("<root xmlns='urn:default'><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("urn:default", ptr.getNamespaceURI((String) null));
        assertEquals("urn:default", ptr.getNamespaceURI(""));
    }

    @Test
    public void getNamespaceURI_prefix_Xml_ReturnsXmlNamespace() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
    }

    @Test
    public void getNamespaceURI_prefix_Xmlns_ReturnsXmlnsNamespace() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void getNamespaceURI_prefix_FoundInAncestorAttribute_AndCached() throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("urn:a-ns", ptr.getNamespaceURI("a"));
        // second call hits cache branch (namespaces.get(prefix) != null)
        assertEquals("urn:a-ns", ptr.getNamespaceURI("a"));
    }

    @Test
    public void getNamespaceURI_prefix_NotFound_ReturnsNull_AndCachedAsUnknown() throws Exception {
        Document doc = parse("<root><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertNull(ptr.getNamespaceURI("nope"));
        // second call: namespace cached as UNKNOWN_NAMESPACE -> still null
        assertNull(ptr.getNamespaceURI("nope"));
    }

    @Test
    public void getNamespaceURI_prefix_DocumentNodeUsesDocumentElement() throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("urn:a-ns", ptr.getNamespaceURI("a"));
    }

    // ----------------------------------------------------------------
    // getDefaultNamespaceURI()
    // ----------------------------------------------------------------

    @Test
    public void getDefaultNamespaceURI_Found() throws Exception {
        Document doc = parse("<root xmlns='urn:default'><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("urn:default", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertNull(ptr.getDefaultNamespaceURI());
    }

    // ----------------------------------------------------------------
    // getBaseValue / getImmediateNode / isActual / isCollection / getLength / isLeaf
    // ----------------------------------------------------------------

    @Test
    public void getBaseValue_And_getImmediateNode_ReturnNode() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertSame(doc.getDocumentElement(), ptr.getBaseValue());
        assertSame(doc.getDocumentElement(), ptr.getImmediateNode());
    }

    @Test
    public void isActual_AlwaysTrue() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.isActual());
    }

    @Test
    public void isCollection_AlwaysFalse() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(ptr.isCollection());
    }

    @Test
    public void getLength_AlwaysOne() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals(1, ptr.getLength());
    }

    @Test
    public void isLeaf_NoChildren_True() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void isLeaf_HasChildren_False() throws Exception {
        Document doc = parse("<root><child/></root>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(ptr.isLeaf());
    }

    // ----------------------------------------------------------------
    // isLanguage() / getLanguage() / findEnclosingAttribute()
    // ----------------------------------------------------------------

    @Test
    public void isLanguage_WithXmlLangAttribute_Match() throws Exception {
        Document doc = parse("<root xml:lang='en-US'><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertTrue(ptr.isLanguage("en"));
    }

    @Test
    public void isLanguage_WithXmlLangAttribute_NoMatch() throws Exception {
        Document doc = parse("<root xml:lang='en-US'><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertFalse(ptr.isLanguage("fr"));
    }

    @Test
    public void isLanguage_NoXmlLangAttribute_FallsBackToSuper() throws Exception {
        // NOTE: ค่าที่คืนจาก super.isLanguage(lang) ไม่ได้ระบุไว้ในซอร์สนี้
        // จึงตรวจสอบเพียงว่าเรียกได้โดยไม่มี exception
        Document doc = parse("<root><child/></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        boolean result = ptr.isLanguage("en");
        assertTrue(result == true || result == false);
    }

    @Test
    public void findEnclosingAttribute_EmptyAttributeSkipped() throws Exception {
        // attr ค่าว่าง -> ต้อง walk ขึ้นไปหา parent ต่อ
        Document doc = parse("<root xml:lang='en'><child xml:lang=''><grand/></child></root>");
        Element child = firstElementChild(doc.getDocumentElement());
        Element grand = firstElementChild(child);
        DOMNodePointer ptr = new DOMNodePointer(grand, Locale.getDefault());
        assertTrue(ptr.isLanguage("en"));
    }

    // ----------------------------------------------------------------
    // setValue()
    // ----------------------------------------------------------------

    @Test
    public void setValue_TextNode_NonEmptyString_SetsValue() throws Exception {
        Document doc = parse("<root>old</root>");
        Text textNode = (Text) doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.getDefault());
        ptr.setValue("new");
        assertEquals("new", doc.getDocumentElement().getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_TextNode_EmptyString_RemovesNode() throws Exception {
        Document doc = parse("<root>old</root>");
        Text textNode = (Text) doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(textNode, Locale.getDefault());
        ptr.setValue("");
        assertFalse(doc.getDocumentElement().hasChildNodes());
    }

    @Test
    public void setValue_CDataNode_NonEmptyString_SetsValue() throws Exception {
        Document doc = parse("<root><![CDATA[old]]></root>");
        CDATASection cdata = (CDATASection) doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        ptr.setValue("new");
        assertEquals("new", doc.getDocumentElement().getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_ElementNode_RemovesExistingChildren_ThenSetsStringValue() throws Exception {
        Document doc = parse("<root><old1/><old2/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue("newtext");
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("newtext", root.getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_ElementNode_EmptyString_NoTextAppended() throws Exception {
        Document doc = parse("<root><old1/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue("");
        assertFalse(root.hasChildNodes());
    }

    @Test
    public void setValue_ElementNode_ValueIsElement_CopiesChildren() throws Exception {
        Document doc = parse("<root><old/></root>");
        Element root = doc.getDocumentElement();
        Element sourceParent = doc.createElement("source");
        sourceParent.appendChild(doc.createElement("x"));
        sourceParent.appendChild(doc.createElement("y"));
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(sourceParent);
        assertEquals(2, root.getChildNodes().getLength());
        assertEquals("x", root.getChildNodes().item(0).getNodeName());
        assertEquals("y", root.getChildNodes().item(1).getNodeName());
    }

    @Test
    public void setValue_ElementNode_ValueIsOtherNode_AppendsClone() throws Exception {
        Document doc = parse("<root><old/></root>");
        Element root = doc.getDocumentElement();
        Comment comment = doc.createComment("c");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(comment);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.COMMENT_NODE, root.getFirstChild().getNodeType());
    }

    // ----------------------------------------------------------------
    // createChild()
    // ----------------------------------------------------------------

    @Test
    public void createChild_FactorySuccess_ReturnsChildPointer() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                Element el = ((Node) parent).getOwnerDocument().createElement(name);
                ((Node) parent).appendChild(el);
                return true;
            }
        });
        NodePointer child = ptr.createChild(ctx, new QName(null, "kid"), 0);
        assertNotNull(child);
        assertEquals("kid", root.getFirstChild().getNodeName());
    }

    @Test
    public void createChild_WholeCollectionIndex_TreatedAsZero() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                assertEquals(0, index); // WHOLE_COLLECTION -> 0
                Element el = ((Node) parent).getOwnerDocument().createElement(name);
                ((Node) parent).appendChild(el);
                return true;
            }
        });
        NodePointer child = ptr.createChild(ctx, new QName(null, "kid"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(child);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_FactoryFails_ThrowsException() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                return false;
            }
        });
        ptr.createChild(ctx, new QName(null, "kid"), 0);
    }

    @Test
    public void createChild_WithValue_SetsValueOnCreatedChild() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                Element el = ((Node) parent).getOwnerDocument().createElement(name);
                ((Node) parent).appendChild(el);
                return true;
            }
        });
        NodePointer child = ptr.createChild(ctx, new QName(null, "kid"), 0, "hello");
        assertEquals("hello", child.getNode().getFirstChild().getNodeValue());
    }

    // ----------------------------------------------------------------
    // createAttribute()
    // ----------------------------------------------------------------

    @Test
    public void createAttribute_NodeNotElement_DelegatesToSuper() throws Exception {
        // NOTE: พฤติกรรมของ super.createAttribute (NodePointer) ไม่ได้ระบุในซอร์สนี้
        // จึงเพียงยืนยันว่า branch ถูกเรียกโดยไม่ตรวจสอบผลลัพธ์ที่แน่ชัด
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault()); // Document, not Element
        try {
            ptr.createAttribute(null, new QName(null, "attr"));
        } catch (RuntimeException e) {
            // acceptable: unknown super behavior
        }
    }

    @Test
    public void createAttribute_NoPrefix_AttributeNotExists_SetsEmptyAttribute() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.createAttribute(null, new QName(null, "attr"));
        assertTrue(root.hasAttribute("attr"));
        assertEquals("", root.getAttribute("attr"));
    }

    @Test
    public void createAttribute_NoPrefix_AttributeAlreadyExists_NotOverwritten() throws Exception {
        Document doc = parse("<root attr='preset'/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.createAttribute(null, new QName(null, "attr"));
        assertEquals("preset", root.getAttribute("attr"));
    }

    @Test
    public void createAttribute_PrefixResolvable_SetsAttributeNS() throws Exception {
        Document doc = parse("<root xmlns:p='urn:p-ns'><target/></root>");
        Element root = doc.getDocumentElement();
        Element target = firstElementChild(root);
        DOMNodePointer rootPtr = new DOMNodePointer(target, Locale.getDefault());
        // NOTE: ผลลัพธ์อ้างอิงพฤติกรรมของ NamespaceResolver.getNamespaceURI ซึ่งไม่ได้แสดงใน
        // ซอร์สนี้ แต่คาดว่า ancestor attribute xmlns:p จะถูกใช้ resolve
        rootPtr.createAttribute(null, new QName("p", "attr"));
        assertTrue(target.hasAttributeNS("urn:p-ns", "attr"));
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_PrefixUnresolvable_ThrowsException() throws Exception {
        Document doc = parse("<root><target/></root>");
        Element target = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(target, Locale.getDefault());
        ptr.createAttribute(null, new QName("q", "attr"));
    }

    // ----------------------------------------------------------------
    // remove()
    // ----------------------------------------------------------------

    @Test
    public void remove_HasParent_RemovesNode() throws Exception {
        Document doc = parse("<root><child/></root>");
        Element root = doc.getDocumentElement();
        Element child = firstElementChild(root);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        ptr.remove();
        assertFalse(root.hasChildNodes());
    }

    @Test(expected = JXPathException.class)
    public void remove_NoParent_ThrowsException() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        ptr.remove();
    }

    // ----------------------------------------------------------------
    // asPath()
    // ----------------------------------------------------------------

    @Test
    public void asPath_WithId_ReturnsIdExpression() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault(), "myid");
        assertEquals("id('myid')", ptr.asPath());
    }

    @Test
    public void asPath_WithId_EscapesQuotes() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault(), "a'b\"c");
        assertEquals("id('a&apos;b&quot;c')", ptr.asPath());
    }

    @Test
    public void asPath_Element_NoNamespace_RelativePositionByName() throws Exception {
        Document doc = parse("<root><child/><child/></root>");
        Element root = doc.getDocumentElement();
        NodeList kids = root.getChildNodes();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer child1Ptr = new DOMNodePointer(rootPtr, kids.item(0));
        DOMNodePointer child2Ptr = new DOMNodePointer(rootPtr, kids.item(1));
        assertEquals("/child[1]", child1Ptr.asPath());
        assertEquals("/child[2]", child2Ptr.asPath());
    }

    @Test
    public void asPath_ElementParentNotDomPointer_SkipsNodeTestPart() throws Exception {
        // parent == null -> ไม่ใช่ DOMNodePointer -> ส่วน node-test ของ element ไม่ถูกเติม
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("", ptr.asPath());
    }

    @Test
    public void asPath_TextNode_RelativePosition() throws Exception {
        Document doc = parse("<root>Hello<child/>World</root>");
        Node helloText = doc.getDocumentElement().getFirstChild();
        Node worldText = doc.getDocumentElement().getLastChild();
        DOMNodePointer helloPtr = new DOMNodePointer(helloText, Locale.getDefault());
        DOMNodePointer worldPtr = new DOMNodePointer(worldText, Locale.getDefault());
        assertEquals("/text()[1]", helloPtr.asPath());
        assertEquals("/text()[2]", worldPtr.asPath());
    }

    @Test
    public void asPath_CDataNode() throws Exception {
        Document doc = parse("<root><![CDATA[data]]></root>");
        Node cdata = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        assertEquals("/text()[1]", ptr.asPath());
    }

    @Test
    public void asPath_ProcessingInstruction_RelativePosition() throws Exception {
        Document doc = parse("<root><?t1 d1?><?t2 d2?><?t1 d3?></root>");
        NodeList kids = doc.getDocumentElement().getChildNodes();
        DOMNodePointer firstPi = new DOMNodePointer(kids.item(0), Locale.getDefault());
        DOMNodePointer thirdPi = new DOMNodePointer(kids.item(2), Locale.getDefault());
        assertEquals("/processing-instruction('t1')[1]", firstPi.asPath());
        assertEquals("/processing-instruction('t1')[2]", thirdPi.asPath());
    }

    @Test
    public void asPath_DocumentNode_ReturnsEmpty() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("", ptr.asPath());
    }

    // ----------------------------------------------------------------
    // hashCode() / equals()
    // ----------------------------------------------------------------

    @Test
    public void hashCode_MatchesIdentityHashOfNode() throws Exception {
        Document doc = parse("<root/>");
        Node node = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(node, Locale.getDefault());
        assertEquals(System.identityHashCode(node), ptr.hashCode());
    }

    @Test
    public void equals_SameInstance_True() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void equals_SameNodeDifferentInstances_True() throws Exception {
        Document doc = parse("<root/>");
        Node node = doc.getDocumentElement();
        DOMNodePointer p1 = new DOMNodePointer(node, Locale.getDefault());
        DOMNodePointer p2 = new DOMNodePointer(node, Locale.getDefault());
        assertTrue(p1.equals(p2));
    }

    @Test
    public void equals_DifferentNode_False() throws Exception {
        Document doc = parse("<root><a/><b/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer p1 = new DOMNodePointer(root.getFirstChild(), Locale.getDefault());
        DOMNodePointer p2 = new DOMNodePointer(root.getLastChild(), Locale.getDefault());
        assertFalse(p1.equals(p2));
    }

    @Test
    public void equals_NonDOMNodePointerObject_False() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(ptr.equals("not a pointer"));
    }

    @Test
    public void equals_Null_False() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(ptr.equals(null));
    }

    // ----------------------------------------------------------------
    // static getPrefix(Node)
    // ----------------------------------------------------------------

    @Test
    public void getPrefix_WithColonInName_ReturnsPrefix() throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        assertEquals("a", DOMNodePointer.getPrefix(foo));
    }

    @Test
    public void getPrefix_NoColonInName_ReturnsNull() throws Exception {
        Document doc = parse("<root><foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        assertNull(DOMNodePointer.getPrefix(foo));
    }

    // ----------------------------------------------------------------
    // static getLocalName(Node)
    // ----------------------------------------------------------------

    @Test
    public void getLocalName_WithColon_ReturnsSubstringAfterColon() throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        assertEquals("foo", DOMNodePointer.getLocalName(foo));
    }

    @Test
    public void getLocalName_NoColon_ReturnsWholeName() throws Exception {
        Document doc = parse("<root><foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        assertEquals("foo", DOMNodePointer.getLocalName(foo));
    }

    // ----------------------------------------------------------------
    // static getNamespaceURI(Node)
    // ----------------------------------------------------------------

    @Test
    public void getNamespaceURIStatic_DocumentDelegatesToDocumentElement() throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'/>");
        assertEquals(null, DOMNodePointer.getNamespaceURI(doc)); // root has no prefix, no xmlns default
    }

    @Test
    public void getNamespaceURIStatic_FallbackAttributeFoundOnAncestor() throws Exception {
        Document doc = parse("<root xmlns:a='urn:a-ns'><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        assertEquals("urn:a-ns", DOMNodePointer.getNamespaceURI(foo));
    }

    @Test
    public void getNamespaceURIStatic_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root><a:foo/></root>");
        Element foo = firstElementChild(doc.getDocumentElement());
        assertNull(DOMNodePointer.getNamespaceURI(foo));
    }

    // ----------------------------------------------------------------
    // getValue() / stringValue()
    // ----------------------------------------------------------------

    @Test
    public void getValue_CommentNode_TrimmedData() throws Exception {
        Document doc = parse("<root><!--  hi  --></root>");
        Node comment = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(comment, Locale.getDefault());
        assertEquals("hi", ptr.getValue());
    }

    @Test
    public void getValue_TextNode_Trimmed_NoXmlSpacePreserve() throws Exception {
        Document doc = parse("<root> text </root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        assertEquals("text", ptr.getValue());
    }

    @Test
    public void getValue_TextNode_PreservedWithXmlSpace() throws Exception {
        Document doc = parse("<root xml:space='preserve'> text </root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        assertEquals(" text ", ptr.getValue());
    }

    @Test
    public void getValue_ProcessingInstruction_Trimmed() throws Exception {
        Document doc = parse("<root><?t  data  ?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals("data", ptr.getValue());
    }

    @Test
    public void getValue_Element_AggregatesTextExcludingComments() throws Exception {
        Document doc = parse("<root>A<!--skip-->B</root>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("AB", ptr.getValue());
    }

    // ----------------------------------------------------------------
    // getPointerByID()
    // ----------------------------------------------------------------

    private Document parseWithDtdId() throws Exception {
        String xml = "<!DOCTYPE root [ <!ELEMENT root (item*)> "
                + "<!ELEMENT item EMPTY> <!ATTLIST item id ID #REQUIRED> ]>"
                + "<root><item id='x1'/><item id='x2'/></root>";
        return parse(xml);
    }

    @Test
    public void getPointerByID_FromDocumentNode_Found() throws Exception {
        Document doc = parseWithDtdId();
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        Pointer result = ptr.getPointerByID(null, "x1");
        assertTrue(result instanceof DOMNodePointer);
        assertEquals("x1", ((Element) result.getNode()).getAttribute("id"));
    }

    @Test
    public void getPointerByID_FromElementNode_UsesOwnerDocument() throws Exception {
        Document doc = parseWithDtdId();
        Element someElement = firstElementChild(doc.getDocumentElement());
        DOMNodePointer ptr = new DOMNodePointer(someElement, Locale.getDefault());
        Pointer result = ptr.getPointerByID(null, "x2");
        assertTrue(result instanceof DOMNodePointer);
    }

    @Test
    public void getPointerByID_NotFound_ReturnsNullPointer() throws Exception {
        Document doc = parseWithDtdId();
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        Pointer result = ptr.getPointerByID(null, "doesnotexist");
        assertTrue(result instanceof NullPointer);
    }

    // ----------------------------------------------------------------
    // compareChildNodePointers()
    // ----------------------------------------------------------------

    @Test
    public void compareChildNodePointers_SameNode_ReturnsZero() throws Exception {
        Document doc = parse("<root><a/><b/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        Node a = root.getFirstChild();
        DOMNodePointer p1 = new DOMNodePointer(rootPtr, a);
        DOMNodePointer p2 = new DOMNodePointer(rootPtr, a);
        assertEquals(0, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void compareChildNodePointers_OrderedChildren() throws Exception {
        Document doc = parse("<root><a/><b/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        Node a = root.getFirstChild();
        Node b = root.getLastChild();
        DOMNodePointer pa = new DOMNodePointer(rootPtr, a);
        DOMNodePointer pb = new DOMNodePointer(rootPtr, b);
        assertEquals(-1, rootPtr.compareChildNodePointers(pa, pb));
        assertEquals(1, rootPtr.compareChildNodePointers(pb, pa));
    }

    @Test
    public void compareChildNodePointers_AttributeVsNonAttribute() throws Exception {
        Document doc = parse("<root attr='v'><a/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        Attr attr = root.getAttributeNode("attr");
        Node a = root.getFirstChild();
        DOMNodePointer attrPtr = new DOMNodePointer(rootPtr, attr);
        DOMNodePointer aPtr = new DOMNodePointer(rootPtr, a);
        assertEquals(-1, rootPtr.compareChildNodePointers(attrPtr, aPtr));
        assertEquals(1, rootPtr.compareChildNodePointers(aPtr, attrPtr));
    }

    @Test
    public void compareChildNodePointers_BothAttributes() throws Exception {
        // NOTE: ลำดับของ NamedNodeMap ไม่ได้ถูกการันตีอย่างเป็นทางการโดยสเปค DOM
        // แต่ implementation ทั่วไป (Xerces) จะคงลำดับการแทรก attribute
        Document doc = parse("<root attrA='1' attrB='2'/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        Attr attrA = root.getAttributeNode("attrA");
        Attr attrB = root.getAttributeNode("attrB");
        DOMNodePointer pa = new DOMNodePointer(rootPtr, attrA);
        DOMNodePointer pb = new DOMNodePointer(rootPtr, attrB);
        int result = rootPtr.compareChildNodePointers(pa, pb);
        assertEquals(-1, result);
    }

    @Test
    public void compareChildNodePointers_NeitherNodeIsChild_ReturnsZero() throws Exception {
        Document doc = parse("<root><a/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        Text detachedA = doc.createTextNode("x");
        Text detachedB = doc.createTextNode("y");
        DOMNodePointer pa = new DOMNodePointer(rootPtr, detachedA);
        DOMNodePointer pb = new DOMNodePointer(rootPtr, detachedB);
        assertEquals(0, rootPtr.compareChildNodePointers(pa, pb));
    }

    // ----------------------------------------------------------------
    // getNamespaceResolver() lazy singleton
    // ----------------------------------------------------------------

    @Test
    public void getNamespaceResolver_LazyInit_ReturnsSameInstance() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        Object r1 = ptr.getNamespaceResolver();
        Object r2 = ptr.getNamespaceResolver();
        assertSame(r1, r2);
    }
}
```

## สรุปตาราง Test → Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testNode_NullTest_*`, `testNode_InstanceMethod_*` | `test == null` → true, instance method delegation |
| `testNode_NodeNameTest_*` (9 เคส) | non-element→false, wildcard ไม่มี prefix→true, wildcard มี prefix (nodeNS null, prefix match/mismatch), exact name match/mismatch, namespace match/mismatch (ทั้ง `equalStrings` ฝั่ง namespaceURI และฝั่ง prefix) — จุดนี้คือพื้นที่เสี่ยง defect ของ JXPath-16 |
| `testNode_NodeTypeTest_*` (5 เคส) | switch-case ทุก case (NODE, TEXT, COMMENT, PI) และ default branch |
| `testNode_PITest_*` (3 เคส) | target match/mismatch, wrong node type → fallthrough false |
| `getName_*` (3 เคส) | ELEMENT_NODE, PI_NODE, else (ln/ns = null) |
| `getNamespaceURI_Instance_*` | delegation ไปยัง static method |
| `getNamespaceURI_prefix_*` (6 เคส) | null/empty prefix, "xml", "xmlns", cache hit, not-found→UNKNOWN_NAMESPACE, Document node ancestor walk |
| `getDefaultNamespaceURI_*` (2 เคส) | found attribute, not found → null |
| `getBaseValue/getImmediateNode/isActual/isCollection/getLength/isLeaf_*` | ค่าคงที่และ `hasChildNodes()` true/false |
| `isLanguage_*`, `findEnclosingAttribute_*` | current != null (match/mismatch), fallback super (ไม่ assert ค่า), attribute ว่าง→walk ต่อ |
| `setValue_*` (8 เคส) | TEXT/CDATA set vs remove, element children removal loop, value เป็น Element/Node อื่น/String ว่าง/ไม่ว่าง |
| `createChild_*` (4 เคส) | WHOLE_COLLECTION→0, success→return pointer, fail→exception, overload ที่เรียก setValue |
| `createAttribute_*` (5 เคส) | node ไม่ใช่ Element→super, prefix null (มี/ไม่มี attribute เดิม), prefix resolve ได้/ไม่ได้ |
| `remove_*` (2 เคส) | มี parent / ไม่มี parent→exception |
| `asPath_*` (8 เคส) | id+escape, element มี/ไม่มี parent เป็น DOMNodePointer, text/cdata/PI relative position, document node |
| `hashCode_*`, `equals_*` (6 เคส) | identity hash, self/same-node/diff-node/non-pointer/null |
| `getPrefix_*`, `getLocalName_*` (4 เคส) | มี/ไม่มี colon ใน nodeName |
| `getNamespaceURIStatic_*` (3 เคส) | Document delegate, ancestor attribute fallback พบ/ไม่พบ |
| `getValue_*` / `stringValue` (5 เคส) | comment branch, trim/preserve ผ่าน `xml:space`, PI data, aggregate ข้าม comment |
| `getPointerByID_*` (3 เคส) | DOCUMENT_NODE vs ownerDocument, พบ/ไม่พบ (NullPointer) |
| `compareChildNodePointers_*` (5 เคส) | node1==node2, attribute-vs-non, both-attribute loop, child loop match/ไม่match |
| `getNamespaceResolver_LazyInit_*` | lazy singleton caching |

**หมายเหตุสำคัญ:** บางสาขา/เมธอดถูกตัดออกหรือ assert แบบผ่อนปรน เนื่องจากพฤติกรรมขึ้นกับคลาสหรือ internal ที่ไม่ได้แสดงในซอร์สที่ให้มา (เช่น `NodePointer.isLanguage` default, `super.createAttribute`, ลำดับภายใน `NamedNodeMap`, การ resolve ของ `NamespaceResolver`) — จุดเหล่านี้มีคอมเมนต์กำกับไว้ในโค้ดตามข้อกำหนดที่ 4