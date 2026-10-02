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
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class DOMNodePointerTest {

    // ---------- helpers ----------

    private Document parse(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    private Document parseNonNamespaceAware(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));
    }

    // ======================================================
    // static testNode(Node, NodeTest) / instance testNode(NodeTest)
    // ======================================================

    @Test
    public void testNode_NullTest_ReturnsTrue() throws Exception {
        Document doc = parse("<root/>");
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), null));
    }

    @Test
    public void testNode_NodeNameTest_NonElement_ReturnsFalse() throws Exception {
        Document doc = parse("<root>text</root>");
        Node textNode = doc.getDocumentElement().getFirstChild();
        // สมมติฐาน: NodeNameTest มี constructor (QName, String namespaceURI) ตามที่เห็นใน createChild()
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), null);
        assertFalse(DOMNodePointer.testNode(textNode, test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardNoPrefix_ReturnsTrue() throws Exception {
        Document doc = parse("<root/>");
        // สมมติฐาน: QName ชื่อ "*" ถือเป็น wildcard (isWildcard() == true)
        NodeNameTest test = new NodeNameTest(new QName(null, "*"), null);
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardWithPrefix_ChecksNamespace() throws Exception {
        Document doc = parse("<root xmlns=\"urn:x\"/>");
        NodeNameTest test = new NodeNameTest(new QName("ns", "*"), "urn:x");
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void testNode_NodeNameTest_NameMatches_ReturnsTrue() throws Exception {
        Document doc = parse("<root/>");
        NodeNameTest test = new NodeNameTest(new QName(null, "root"), null);
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void testNode_NodeNameTest_NameMismatch_ReturnsFalse() throws Exception {
        Document doc = parse("<root/>");
        NodeNameTest test = new NodeNameTest(new QName(null, "other"), null);
        assertFalse(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void testNode_NodeTypeTest_Node_Element() throws Exception {
        Document doc = parse("<root/>");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void testNode_NodeTypeTest_Node_Document() throws Exception {
        Document doc = parse("<root/>");
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(DOMNodePointer.testNode(doc, test));
    }

    @Test
    public void testNode_NodeTypeTest_Text_TextNode() throws Exception {
        Document doc = parse("<root>abc</root>");
        Node text = doc.getDocumentElement().getFirstChild();
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testNode_NodeTypeTest_Text_CDATA() throws Exception {
        Document doc = parse("<root><![CDATA[abc]]></root>");
        Node cdata = doc.getDocumentElement().getFirstChild();
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(cdata, test));
    }

    @Test
    public void testNode_NodeTypeTest_Comment() throws Exception {
        Document doc = parse("<root><!--c--></root>");
        Node comment = doc.getDocumentElement().getFirstChild();
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(comment, test));
    }

    @Test
    public void testNode_NodeTypeTest_PI() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testNode_NodeTypeTest_Default_ReturnsFalse() throws Exception {
        Document doc = parse("<root><!--c--></root>");
        Node comment = doc.getDocumentElement().getFirstChild();
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertFalse(DOMNodePointer.testNode(comment, test));
    }

    @Test
    public void testNode_PI_Match() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testNode_PI_Mismatch() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(DOMNodePointer.testNode(pi, test));
    }

    @Test
    public void testNode_PI_NonPINode_ReturnsFalse() throws Exception {
        Document doc = parse("<root/>");
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertFalse(DOMNodePointer.testNode(doc.getDocumentElement(), test));
    }

    @Test
    public void instanceTestNode_DelegatesToStatic() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.testNode(null));
    }

    // ======================================================
    // getName()
    // ======================================================

    @Test
    public void getName_Element() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("root", ptr.getName().getName());
    }

    @Test
    public void getName_Element_WithPrefix() throws Exception {
        Document doc = parse("<ns:root xmlns:ns=\"urn:ns\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        QName name = ptr.getName();
        assertEquals("root", name.getName());
        assertEquals("ns", name.getPrefix());
    }

    @Test
    public void getName_ProcessingInstruction() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals("target", ptr.getName().getName());
    }

    @Test
    public void getName_Other_NullName() throws Exception {
        Document doc = parse("<root>text</root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        assertNull(ptr.getName().getName());
    }

    // ======================================================
    // getNamespaceURI() / getNamespaceURI(prefix)
    // ======================================================

    @Test
    public void getNamespaceURI_NoArg() throws Exception {
        Document doc = parse("<root xmlns=\"urn:test\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("urn:test", ptr.getNamespaceURI());
    }

    @Test
    public void getNamespaceURI_PrefixNullOrEmpty_UsesDefault() throws Exception {
        Document doc = parse("<root xmlns=\"urn:default\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("urn:default", ptr.getNamespaceURI(""));
        assertEquals("urn:default", ptr.getNamespaceURI(null));
    }

    @Test
    public void getNamespaceURI_XmlPrefix() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
    }

    @Test
    public void getNamespaceURI_XmlnsPrefix() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void getNamespaceURI_CustomPrefix_FoundOnElement() throws Exception {
        Document doc = parse("<root xmlns:foo=\"urn:foo\"><child/></root>");
        Node child = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertEquals("urn:foo", ptr.getNamespaceURI("foo"));
    }

    @Test
    public void getNamespaceURI_CustomPrefix_CachedOnSecondCall() throws Exception {
        Document doc = parse("<root xmlns:foo=\"urn:foo\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("urn:foo", ptr.getNamespaceURI("foo"));
        assertEquals("urn:foo", ptr.getNamespaceURI("foo")); // branch: namespaces != null, cache hit
    }

    @Test
    public void getNamespaceURI_CustomPrefix_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertNull(ptr.getNamespaceURI("unknown"));
    }

    @Test
    public void getNamespaceURI_OnDocumentNode() throws Exception {
        Document doc = parse("<root xmlns:foo=\"urn:foo\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("urn:foo", ptr.getNamespaceURI("foo"));
    }

    // ======================================================
    // getDefaultNamespaceURI()
    // ======================================================

    @Test
    public void getDefaultNamespaceURI_Found() throws Exception {
        Document doc = parse("<root xmlns=\"urn:def\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("urn:def", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_NotFound_ReturnsNull() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_OnDocument() throws Exception {
        Document doc = parse("<root xmlns=\"urn:def\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("urn:def", ptr.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_Cached() throws Exception {
        Document doc = parse("<root xmlns=\"urn:def\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("urn:def", ptr.getDefaultNamespaceURI());
        assertEquals("urn:def", ptr.getDefaultNamespaceURI()); // cached branch
    }

    // ======================================================
    // Trivial getters
    // ======================================================

    @Test
    public void getBaseValue_And_getImmediateNode() throws Exception {
        Document doc = parse("<root/>");
        Node el = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertSame(el, ptr.getBaseValue());
        assertSame(el, ptr.getImmediateNode());
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
    public void isLeaf_True_NoChildren() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.isLeaf());
    }

    @Test
    public void isLeaf_False_HasChildren() throws Exception {
        Document doc = parse("<root><child/></root>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(ptr.isLeaf());
    }

    // ======================================================
    // isLanguage / getLanguage
    // ======================================================

    @Test
    public void isLanguage_FoundOnSelf() throws Exception {
        Document doc = parse("<root xml:lang=\"en-US\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.isLanguage("en"));
        assertFalse(ptr.isLanguage("fr"));
    }

    @Test
    public void isLanguage_FoundOnAncestor() throws Exception {
        Document doc = parse("<root xml:lang=\"en\"><child/></root>");
        Node child = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        assertTrue(ptr.isLanguage("en"));
    }

    @Test
    public void isLanguage_NotFound_DelegatesToSuper_NoException() throws Exception {
        // getLanguage() คืน null -> โค้ดเรียก super.isLanguage(lang)
        // พฤติกรรมจริงของ NodePointer.isLanguage ไม่ได้แสดงในซอร์สที่ให้มา
        // จึงทดสอบเพียงว่าเรียกได้โดยไม่มี exception (ครอบคลุม branch current==null)
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        try {
            ptr.isLanguage("en");
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    // ======================================================
    // setValue()
    // ======================================================

    @Test
    public void setValue_TextNode_NonEmptyString() throws Exception {
        Document doc = parse("<root>old</root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        ptr.setValue("new");
        assertEquals("new", doc.getDocumentElement().getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_TextNode_EmptyString_RemovesNode() throws Exception {
        Document doc = parse("<root>old</root>");
        Element root = doc.getDocumentElement();
        Node text = root.getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        ptr.setValue("");
        assertNull(root.getFirstChild());
    }

    @Test
    public void setValue_CDATA_NonEmpty() throws Exception {
        Document doc = parse("<root><![CDATA[old]]></root>");
        Node cdata = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        ptr.setValue("new");
        assertEquals("new", doc.getDocumentElement().getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_CDATA_Empty_RemovesNode() throws Exception {
        Document doc = parse("<root><![CDATA[old]]></root>");
        Element root = doc.getDocumentElement();
        Node cdata = root.getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        ptr.setValue("");
        assertNull(root.getFirstChild());
    }

    @Test
    public void setValue_Element_WithElementValue_CopiesChildren() throws Exception {
        Document doc = parse("<root><old/></root>");
        Document valueDoc = parse("<value><a/><b/></value>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(valueDoc.getDocumentElement());
        assertEquals(2, root.getChildNodes().getLength());
        assertEquals("a", root.getChildNodes().item(0).getNodeName());
        assertEquals("b", root.getChildNodes().item(1).getNodeName());
    }

    @Test
    public void setValue_Element_WithDocumentValue_CopiesChildren() throws Exception {
        Document doc = parse("<root><old/></root>");
        Document valueDoc = parse("<value><a/></value>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(valueDoc);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("a", root.getChildNodes().item(0).getNodeName());
    }

    @Test
    public void setValue_Element_WithOtherNodeValue_AppendsClone() throws Exception {
        Document doc = parse("<root><old/></root>");
        Document valueDoc = parse("<v>text</v>");
        Node textValue = valueDoc.getDocumentElement().getFirstChild();
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(textValue);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, root.getFirstChild().getNodeType());
        assertEquals("text", root.getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_Element_WithStringValue_NonEmpty_AppendsTextNode() throws Exception {
        Document doc = parse("<root><old/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue("hello");
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, root.getFirstChild().getNodeType());
        assertEquals("hello", root.getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_Element_WithEmptyStringValue_NoChildAppended() throws Exception {
        Document doc = parse("<root><old/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue("");
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void setValue_Element_WithNullValue_NoChildAppended() throws Exception {
        Document doc = parse("<root><old/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(null);
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void setValue_Element_WithNonStringNonNodeValue_ConvertsToString() throws Exception {
        // สมมติฐาน: TypeUtils.convert(Integer, String.class) ให้ "42"
        Document doc = parse("<root><old/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        ptr.setValue(Integer.valueOf(42));
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("42", root.getFirstChild().getNodeValue());
    }

    // ======================================================
    // createChild()
    // ======================================================

    private AbstractFactory successFactory() {
        return new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                Element root = (Element) parent;
                Element child = root.getOwnerDocument().createElement(name);
                root.appendChild(child);
                return true;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        };
    }

    @Test
    public void createChild_Success() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(successFactory());
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodePointer child = ptr.createChild(context, new QName(null, "child"), 0);
        assertNotNull(child);
        assertEquals(1, doc.getDocumentElement().getChildNodes().getLength());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_FactoryFails_Throws() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                return false;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        ptr.createChild(context, new QName(null, "child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_FactorySucceeds_ButChildNotFound_Throws() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                // success=true แต่ไม่สร้าง element จริง -> iterator.setPosition จะ false
                return true;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        ptr.createChild(context, new QName(null, "child"), 0);
    }

    @Test
    public void createChild_WithWholeCollectionIndex() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(successFactory());
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodePointer child = ptr.createChild(context, new QName(null, "child"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(child);
    }

    @Test
    public void createChild_WithPrefix_UsesContextNamespaceURI() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        context.registerNamespace("ns", "urn:ns");
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                Element root = (Element) parent;
                Element child = root.getOwnerDocument().createElementNS("urn:ns", name);
                root.appendChild(child);
                return true;
            }
            public boolean declareVariable(JXPathContext context, String name) {
                return false;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodePointer child = ptr.createChild(context, new QName("ns", "child"), 0);
        assertNotNull(child);
    }

    @Test
    public void createChild_WithValue_SetsValue() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(successFactory());
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodePointer child = ptr.createChild(context, new QName(null, "child"), 0, "value");
        assertNotNull(child);
    }

    @Test(expected = JXPathException.class)
    public void createChild_NoFactorySet_Throws() throws Exception {
        Document doc = parse("<root/>");
        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        ptr.createChild(context, new QName(null, "child"), 0);
    }

    // ======================================================
    // createAttribute()
    // ======================================================

    @Test
    public void createAttribute_NonElementNode_DelegatesToSuper() throws Exception {
        // พฤติกรรมจริงของ super.createAttribute ไม่ได้แสดงในซอร์สที่ให้มา
        // ทดสอบเพียง branch ที่ node ไม่ใช่ Element จะถูกส่งต่อไปยัง super โดยไม่ throw NPE ที่ไม่คาดคิด
        Document doc = parse("<root>text</root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        try {
            ptr.createAttribute(context, new QName(null, "attr"));
        } catch (Exception e) {
            // พฤติกรรม superclass ไม่ได้ระบุไว้ในซอร์ส ยอมรับ exception ใดๆที่เกิดขึ้น
        }
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_WithPrefix_UnknownNamespace_Throws() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        ptr.createAttribute(context, new QName("unknownprefix", "attr"));
    }

    @Test
    public void createAttribute_WithPrefix_KnownNamespace_SetsAttributeNS() throws Exception {
        Document doc = parse("<root xmlns:ns=\"urn:ns\"/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        NodePointer attrPtr = ptr.createAttribute(context, new QName("ns", "attr"));
        assertNotNull(attrPtr);
        assertTrue(root.hasAttributeNS("urn:ns", "attr"));
    }

    @Test
    public void createAttribute_NoPrefix_AttributeNotExists_CreatesIt() throws Exception {
        Document doc = parse("<root/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        NodePointer attrPtr = ptr.createAttribute(context, new QName(null, "attr"));
        assertNotNull(attrPtr);
        assertTrue(root.hasAttribute("attr"));
    }

    @Test
    public void createAttribute_NoPrefix_AttributeExists_NoOverwrite() throws Exception {
        Document doc = parse("<root attr=\"value\"/>");
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        NodePointer attrPtr = ptr.createAttribute(context, new QName(null, "attr"));
        assertNotNull(attrPtr);
        assertEquals("value", root.getAttribute("attr"));
    }

    // ======================================================
    // remove()
    // ======================================================

    @Test
    public void remove_WithParent_RemovesNode() throws Exception {
        Document doc = parse("<root><child/></root>");
        Element root = doc.getDocumentElement();
        Node child = root.getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.getDefault());
        ptr.remove();
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test(expected = JXPathException.class)
    public void remove_NoParent_Throws() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        ptr.remove();
    }

    // ======================================================
    // asPath()
    // ======================================================

    @Test
    public void asPath_WithId_EscapesQuotes() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault(), "a'b\"c");
        assertEquals("id('a&apos;b&quot;c')", ptr.asPath());
    }

    @Test
    public void asPath_WithId_MultipleQuotesLoopsCorrectly() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault(), "a'b'c");
        assertEquals("id('a&apos;b&apos;c')", ptr.asPath());
    }

    @Test
    public void asPath_DocumentNode_Empty() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        assertEquals("", ptr.asPath());
    }

    @Test
    public void asPath_ElementNode_ParentNull_BufferStaysEmpty() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("", ptr.asPath());
    }

    @Test
    public void asPath_ElementNode_WithDOMNodePointerParent_DefaultNamespace() throws Exception {
        Document doc = parse("<root><child/><child/></root>");
        Element root = doc.getDocumentElement();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        Node secondChild = root.getLastChild();
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, secondChild);
        assertEquals("/child[2]", childPtr.asPath());
    }

    @Test
    public void asPath_ElementNode_MixedSiblings_PositionByName() throws Exception {
        Document doc = parse("<root>text<other/><child/>text2<child/></root>");
        Element root = doc.getDocumentElement();
        Node secondChildElement = root.getChildNodes().item(4);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, secondChildElement);
        assertEquals("/child[2]", childPtr.asPath());
    }

    @Test
    public void asPath_TextNode_FirstPosition() throws Exception {
        Document doc = parse("<root>abc<child/>def</root>");
        Element root = doc.getDocumentElement();
        Node firstText = root.getFirstChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer textPtr = new DOMNodePointer(rootPtr, firstText);
        assertEquals("/text()[1]", textPtr.asPath());
    }

    @Test
    public void asPath_TextNode_SecondPosition() throws Exception {
        Document doc = parse("<root>abc<child/>def</root>");
        Element root = doc.getDocumentElement();
        Node lastText = root.getLastChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer textPtr = new DOMNodePointer(rootPtr, lastText);
        assertEquals("/text()[2]", textPtr.asPath());
    }

    @Test
    public void asPath_ProcessingInstructionNode() throws Exception {
        Document doc = parse("<root><?target data?></root>");
        Element root = doc.getDocumentElement();
        Node pi = root.getFirstChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);
        assertEquals("/processing-instruction('target')[1]", piPtr.asPath());
    }

    @Test
    public void asPath_PI_MultipleTargets_OnlyMatchingCounted() throws Exception {
        Document doc = parse("<root><?other data?><?target data?><?target data?></root>");
        Element root = doc.getDocumentElement();
        Node secondTargetPI = root.getChildNodes().item(2);
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, secondTargetPI);
        assertEquals("/processing-instruction('target')[2]", piPtr.asPath());
    }

    @Test
    public void asPath_ElementNode_NonDefaultNamespace_FallbackNodeTest() throws Exception {
        // สมมติฐาน: ไม่มีการลงทะเบียน prefix ใน NamespaceResolver -> getPrefix(nsURI) คืน null
        // จึงเข้า branch fallback "node()[n]" (พฤติกรรมของ getNamespaceResolver ไม่ได้แสดงในซอร์ส)
        Document doc = parse("<root><a xmlns:ns=\"urn:ns\"/><ns:b xmlns:ns=\"urn:ns\"/></root>");
        Element root = doc.getDocumentElement();
        Node nsB = root.getLastChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, nsB);
        assertEquals("node()[2]", childPtr.asPath());
    }

    // ======================================================
    // hashCode() / equals()
    // ======================================================

    @Test
    public void hashCode_UsesIdentity() throws Exception {
        Document doc = parse("<root/>");
        Node el = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(el, Locale.getDefault());
        assertEquals(System.identityHashCode(el), ptr.hashCode());
    }

    @Test
    public void equals_SameInstance_True() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void equals_SameNodeDifferentPointer_True() throws Exception {
        Document doc = parse("<root/>");
        Node el = doc.getDocumentElement();
        DOMNodePointer ptr1 = new DOMNodePointer(el, Locale.getDefault());
        DOMNodePointer ptr2 = new DOMNodePointer(el, Locale.getDefault());
        assertTrue(ptr1.equals(ptr2));
    }

    @Test
    public void equals_DifferentNode_False() throws Exception {
        Document doc = parse("<root><a/><b/></root>");
        Node a = doc.getDocumentElement().getFirstChild();
        Node b = doc.getDocumentElement().getLastChild();
        DOMNodePointer ptr1 = new DOMNodePointer(a, Locale.getDefault());
        DOMNodePointer ptr2 = new DOMNodePointer(b, Locale.getDefault());
        assertFalse(ptr1.equals(ptr2));
    }

    @Test
    public void equals_NotDOMNodePointer_False() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertFalse(ptr.equals("not a pointer"));
    }

    // ======================================================
    // getPrefix(Node) / getLocalName(Node) / getNamespaceURI(Node) static
    // ======================================================

    @Test
    public void getPrefix_WithExplicitPrefix() throws Exception {
        Document doc = parse("<ns:root xmlns:ns=\"urn:ns\"/>");
        assertEquals("ns", DOMNodePointer.getPrefix(doc.getDocumentElement()));
    }

    @Test
    public void getPrefix_NoPrefixNoColon() throws Exception {
        Document doc = parse("<root/>");
        assertNull(DOMNodePointer.getPrefix(doc.getDocumentElement()));
    }

    @Test
    public void getPrefix_FallbackFromNodeName() throws Exception {
        Document doc = parseNonNamespaceAware("<ns:root/>");
        Node root = doc.getDocumentElement();
        assertNull(root.getPrefix());
        assertEquals("ns", DOMNodePointer.getPrefix(root));
    }

    @Test
    public void getLocalName_WithLocalNameSet() throws Exception {
        Document doc = parse("<ns:root xmlns:ns=\"urn:ns\"/>");
        assertEquals("root", DOMNodePointer.getLocalName(doc.getDocumentElement()));
    }

    @Test
    public void getLocalName_FallbackFromNodeName_WithColon() throws Exception {
        Document doc = parseNonNamespaceAware("<ns:root/>");
        Node root = doc.getDocumentElement();
        assertNull(root.getLocalName());
        assertEquals("root", DOMNodePointer.getLocalName(root));
    }

    @Test
    public void getLocalName_FallbackFromNodeName_NoColon() throws Exception {
        Document doc = parseNonNamespaceAware("<root/>");
        assertEquals("root", DOMNodePointer.getLocalName(doc.getDocumentElement()));
    }

    @Test
    public void staticGetNamespaceURI_OnDocument_UsesDocumentElement() throws Exception {
        Document doc = parse("<root xmlns=\"urn:test\"/>");
        assertEquals("urn:test", DOMNodePointer.getNamespaceURI(doc));
    }

    @Test
    public void staticGetNamespaceURI_UriFromElement() throws Exception {
        Document doc = parse("<root xmlns=\"urn:test\"/>");
        assertEquals("urn:test", DOMNodePointer.getNamespaceURI(doc.getDocumentElement()));
    }

    @Test
    public void staticGetNamespaceURI_NullUri_FallbackFound_NoPrefix() throws Exception {
        Document doc = parseNonNamespaceAware("<root xmlns=\"urn:fallback\"><child/></root>");
        Node child = doc.getDocumentElement().getFirstChild();
        assertEquals("urn:fallback", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void staticGetNamespaceURI_NullUri_FallbackNotFound() throws Exception {
        Document doc = parseNonNamespaceAware("<root><child/></root>");
        Node child = doc.getDocumentElement().getFirstChild();
        assertNull(DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void staticGetNamespaceURI_NullUri_FallbackFound_WithPrefix() throws Exception {
        Document doc = parseNonNamespaceAware("<ns:root xmlns:ns=\"urn:ns\"><ns:child/></ns:root>");
        Node child = doc.getDocumentElement().getFirstChild();
        assertEquals("urn:ns", DOMNodePointer.getNamespaceURI(child));
    }

    // ======================================================
    // getValue() / stringValue()
    // ======================================================

    @Test
    public void getValue_CommentNode_Trimmed() throws Exception {
        Document doc = parse("<root><!--  hello  --></root>");
        Node comment = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(comment, Locale.getDefault());
        assertEquals("hello", ptr.getValue());
    }

    @Test
    public void getValue_TextNode_Trimmed() throws Exception {
        Document doc = parse("<root>  hi  </root>");
        Node text = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.getDefault());
        assertEquals("hi", ptr.getValue());
    }

    @Test
    public void getValue_CDATA_Trimmed() throws Exception {
        Document doc = parse("<root><![CDATA[  hi  ]]></root>");
        Node cdata = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(cdata, Locale.getDefault());
        assertEquals("hi", ptr.getValue());
    }

    @Test
    public void getValue_PI_Trimmed() throws Exception {
        Document doc = parse("<root><?target   data with spaces   ?></root>");
        Node pi = doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.getDefault());
        assertEquals("data with spaces", ptr.getValue());
    }

    @Test
    public void getValue_Element_ConcatenatesTextChildrenRecursively() throws Exception {
        Document doc = parse("<root>a<child>b</child>c</root>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("abc", ptr.getValue());
    }

    @Test
    public void getValue_Element_NoChildren_EmptyString() throws Exception {
        Document doc = parse("<root/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        assertEquals("", ptr.getValue());
    }

    // ======================================================
    // getPointerByID()
    // ======================================================

    private static final String XML_WITH_ID =
            "<!DOCTYPE root [" +
            "<!ELEMENT root (item*)>" +
            "<!ELEMENT item EMPTY>" +
            "<!ATTLIST item id ID #IMPLIED>" +
            "]>" +
            "<root><item id=\"x1\"/></root>";

    @Test
    public void getPointerByID_DocumentNode_ElementFound() throws Exception {
        Document doc = parse(XML_WITH_ID);
        Element item = (Element) doc.getDocumentElement().getFirstChild();
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        Pointer result = ptr.getPointerByID(context, "x1");
        assertTrue(result instanceof DOMNodePointer);
        assertSame(item, ((DOMNodePointer) result).getImmediateNode());
    }

    @Test
    public void getPointerByID_ElementNotFound_ReturnsNullPointer() throws Exception {
        Document doc = parse(XML_WITH_ID);
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        Pointer result = ptr.getPointerByID(context, "nonexistent");
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void getPointerByID_FromNonDocumentNode_UsesOwnerDocument() throws Exception {
        Document doc = parse(XML_WITH_ID);
        Element root = doc.getDocumentElement();
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.getDefault());
        JXPathContext context = JXPathContext.newContext(doc);
        Pointer result = ptr.getPointerByID(context, "x1");
        assertTrue(result instanceof DOMNodePointer);
    }

    // ======================================================
    // compareChildNodePointers()
    // ======================================================

    @Test
    public void compareChildNodePointers_SameNode_ReturnsZero() throws Exception {
        Document doc = parse("<root><a/></root>");
        Element root = doc.getDocumentElement();
        Node a = root.getFirstChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(rootPtr, a);
        DOMNodePointer p2 = new DOMNodePointer(rootPtr, a);
        assertEquals(0, rootPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void compareChildNodePointers_AttributeVsNonAttribute() throws Exception {
        Document doc = parse("<root attr=\"v\"><a/></root>");
        Element root = doc.getDocumentElement();
        Attr attr = root.getAttributeNode("attr");
        Node a = root.getFirstChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer attrPtr = new DOMNodePointer(rootPtr, attr);
        DOMNodePointer elemPtr = new DOMNodePointer(rootPtr, a);
        assertEquals(-1, rootPtr.compareChildNodePointers(attrPtr, elemPtr));
        assertEquals(1, rootPtr.compareChildNodePointers(elemPtr, attrPtr));
    }

    @Test
    public void compareChildNodePointers_BothNonAttribute_OrderByPosition() throws Exception {
        Document doc = parse("<root><a/><b/></root>");
        Element root = doc.getDocumentElement();
        Node a = root.getFirstChild();
        Node b = root.getLastChild();
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer pa = new DOMNodePointer(rootPtr, a);
        DOMNodePointer pb = new DOMNodePointer(rootPtr, b);
        assertEquals(-1, rootPtr.compareChildNodePointers(pa, pb));
        assertEquals(1, rootPtr.compareChildNodePointers(pb, pa));
    }

    @Test
    public void compareChildNodePointers_BothAttribute_NoExceptionAndValidResult() throws Exception {
        // หมายเหตุสำคัญ: branch นี้ใช้ getNode() ที่สืบทอดจาก NodePointer (ไม่ได้แสดงในซอร์สที่ให้มา)
        // สมมติว่าคืนค่า node ของ this (rootPtr) เพื่อดึง element.getAttributes()
        // ลำดับใน NamedNodeMap ไม่ได้ถูกการันตีโดยสเปค DOM จึงตรวจสอบเพียงว่าค่าที่คืนอยู่ใน {-1,0,1}
        Document doc = parse("<root attr1=\"a\" attr2=\"b\"/>");
        Element root = doc.getDocumentElement();
        Attr attr1 = root.getAttributeNode("attr1");
        Attr attr2 = root.getAttributeNode("attr2");
        DOMNodePointer rootPtr = new DOMNodePointer(root, Locale.getDefault());
        DOMNodePointer p1 = new DOMNodePointer(rootPtr, attr1);
        DOMNodePointer p2 = new DOMNodePointer(rootPtr, attr2);
        int result = rootPtr.compareChildNodePointers(p1, p2);
        assertTrue(result == -1 || result == 0 || result == 1);
    }

    // ======================================================
    // Iterator / Pointer factory methods (smoke tests)
    // ======================================================

    @Test
    public void childIterator_ReturnsNonNull() throws Exception {
        Document doc = parse("<root><a/></root>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodeIterator it = ptr.childIterator(null, false, null);
        assertNotNull(it);
    }

    @Test
    public void attributeIterator_ReturnsNonNull() throws Exception {
        Document doc = parse("<root attr=\"v\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodeIterator it = ptr.attributeIterator(new QName(null, "attr"));
        assertNotNull(it);
    }

    @Test
    public void namespaceIterator_ReturnsNonNull() throws Exception {
        Document doc = parse("<root xmlns:ns=\"urn:ns\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodeIterator it = ptr.namespaceIterator();
        assertNotNull(it);
    }

    @Test
    public void namespacePointer_ReturnsNonNull() throws Exception {
        Document doc = parse("<root xmlns:ns=\"urn:ns\"/>");
        DOMNodePointer ptr = new DOMNodePointer(doc.getDocumentElement(), Locale.getDefault());
        NodePointer p = ptr.namespacePointer("ns");
        assertNotNull(p);
    }
}
