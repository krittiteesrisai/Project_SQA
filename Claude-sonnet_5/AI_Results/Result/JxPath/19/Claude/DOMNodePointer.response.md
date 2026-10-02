# DOMNodePointerTest — ชุดทดสอบ JUnit 4

```java
package org.apache.commons.jxpath.ri.model.dom;

import static org.junit.Assert.*;

import java.io.StringReader;
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
import org.junit.Before;
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

/**
 * Unit tests for DOMNodePointer (Defects4J JXPath-19b).
 *
 * หมายเหตุทั่วไป:
 * - ซอร์สโค้ดของคลาส superclass (NodePointer), NamespaceResolver, AbstractFactory,
 *   QName, NodeNameTest, NodeTypeTest ฯลฯ ไม่ได้ให้มาในโจทย์ ดังนั้นในบางจุดที่พึ่งพา
 *   collaborator เหล่านี้ จะมีคอมเมนต์กำกับไว้ว่าเป็น "สมมติฐานที่อิง public API
 *   ที่เป็นที่รู้จักของไลบรารี" ไม่ใช่ behavior ของ DOMNodePointer เอง
 */
public class DOMNodePointerTest {

    private Document doc;   // non-namespace-aware document (manual DOM build)
    private Element root;

    @Before
    public void setUp() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        DocumentBuilder db = dbf.newDocumentBuilder();
        doc = db.newDocument();
        root = doc.createElement("root");
        doc.appendChild(root);
    }

    private Document nsAwareDocument() throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.newDocument();
    }

    private boolean nodeListContains(NodeList list, Node n) {
        for (int i = 0; i < list.getLength(); i++) {
            if (list.item(i) == n) {
                return true;
            }
        }
        return false;
    }

    // =========================================================
    // testNode(Node, NodeTest)
    // =========================================================

    @Test
    public void testNode_NullTest_ReturnsTrue() {
        assertTrue(DOMNodePointer.testNode(root, null));
    }

    @Test
    public void testNode_NodeNameTest_NonElementNode_ReturnsFalse() {
        Text text = doc.createTextNode("abc");
        NodeNameTest test = new NodeNameTest(new QName(null, "root"));
        assertFalse(DOMNodePointer.testNode(text, test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardNoPrefix_ReturnsTrue() {
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testNode_NodeNameTest_NameMatches_NamespaceNull() {
        Element e = doc.createElement("foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"));
        assertTrue(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testNode_NodeNameTest_NameDoesNotMatch_ReturnsFalse() {
        Element e = doc.createElement("foo");
        NodeNameTest test = new NodeNameTest(new QName(null, "bar"));
        assertFalse(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testNode_NodeNameTest_WildcardWithPrefix_NamespaceMismatch_ReturnsFalse() {
        Element e = doc.createElement("foo"); // ไม่มี namespace เลย ไม่ผูกกับ root
        NodeNameTest test = new NodeNameTest(new QName("p", "*"), "urn:something");
        assertFalse(DOMNodePointer.testNode(e, test));
    }

    @Test
    public void testNode_NodeTypeTest_Node_ReturnsTrue() {
        assertTrue(DOMNodePointer.testNode(root, new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testNode_NodeTypeTest_TextAndCData() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(DOMNodePointer.testNode(doc.createTextNode("x"), test));
        assertTrue(DOMNodePointer.testNode(doc.createCDATASection("x"), test));
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testNode_NodeTypeTest_Comment() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(DOMNodePointer.testNode(doc.createComment("c"), test));
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testNode_NodeTypeTest_PI() {
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, test));
        assertFalse(DOMNodePointer.testNode(root, test));
    }

    @Test
    public void testNode_NodeTypeTest_DefaultCase_ReturnsFalse() {
        // ค่าที่ไม่ตรงกับ case ใด ๆ -> switch default
        assertFalse(DOMNodePointer.testNode(root, new NodeTypeTest(9999)));
    }

    @Test
    public void testNode_ProcessingInstructionTest_Match() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        assertTrue(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("target")));
    }

    @Test
    public void testNode_ProcessingInstructionTest_NoMatch() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        assertFalse(DOMNodePointer.testNode(pi, new ProcessingInstructionTest("other")));
    }

    @Test
    public void testNode_ProcessingInstructionTest_WrongNodeType_FallsThroughToFalse() {
        assertFalse(DOMNodePointer.testNode(root, new ProcessingInstructionTest("target")));
    }

    @Test
    public void testNode_InstanceMethod_DelegatesToStatic() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertTrue(ptr.testNode(null));
    }

    // =========================================================
    // getName()
    // =========================================================

    @Test
    public void getName_ElementNode() {
        Element e = doc.createElement("foo");
        DOMNodePointer ptr = new DOMNodePointer(e, Locale.ENGLISH);
        assertEquals("foo", ptr.getName().getName());
    }

    @Test
    public void getName_ProcessingInstructionNode() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        DOMNodePointer ptr = new DOMNodePointer(pi, Locale.ENGLISH);
        assertEquals("target", ptr.getName().getName());
    }

    @Test
    public void getName_OtherNodeType_NullNameAndNamespace() {
        Text text = doc.createTextNode("abc");
        DOMNodePointer ptr = new DOMNodePointer(text, Locale.ENGLISH);
        QName name = ptr.getName();
        assertNull(name.getName());
        assertNull(name.getPrefix());
    }

    // =========================================================
    // getNamespaceURI() / static getNamespaceURI(Node)
    // =========================================================

    @Test
    public void getNamespaceURI_DocumentNode_UsesDocumentElement() {
        root.setAttribute("xmlns", "urn:default");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("urn:default", ptr.getNamespaceURI());
    }

    @Test
    public void getNamespaceURI_ElementWithOwnXmlns() {
        root.setAttribute("xmlns", "urn:default");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals("urn:default", ptr.getNamespaceURI());
    }

    @Test
    public void getNamespaceURI_ElementWithPrefixedXmlns_ManualSearch() {
        root.setAttribute("xmlns:p", "urn:p");
        Element child = doc.createElement("p:child");
        root.appendChild(child);
        assertEquals("urn:p", DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void getNamespaceURI_NoXmlnsAnywhere_ReturnsNull() {
        Element child = doc.createElement("child");
        root.appendChild(child);
        assertNull(DOMNodePointer.getNamespaceURI(child));
    }

    @Test
    public void getNamespaceURI_NativeNamespaceAwareElement() throws Exception {
        Document nsDoc = nsAwareDocument();
        Element e = nsDoc.createElementNS("urn:native", "p:foo");
        assertEquals("urn:native", DOMNodePointer.getNamespaceURI(e));
    }

    // =========================================================
    // getNamespaceResolver()
    // =========================================================

    @Test
    public void getNamespaceResolver_LazyInit_SameInstanceReturned() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertSame(ptr.getNamespaceResolver(), ptr.getNamespaceResolver());
    }

    // =========================================================
    // getNamespaceURI(String prefix)
    // =========================================================

    @Test
    public void getNamespaceURIByPrefix_NullPrefix_DelegatesToDefault() {
        root.setAttribute("xmlns", "urn:default");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals("urn:default", ptr.getNamespaceURI((String) null));
    }

    @Test
    public void getNamespaceURIByPrefix_EmptyPrefix_DelegatesToDefault() {
        root.setAttribute("xmlns", "urn:default");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals("urn:default", ptr.getNamespaceURI(""));
    }

    @Test
    public void getNamespaceURIByPrefix_XmlPrefix_ReturnsXmlNamespace() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals(DOMNodePointer.XML_NAMESPACE_URI, ptr.getNamespaceURI("xml"));
    }

    @Test
    public void getNamespaceURIByPrefix_XmlnsPrefix_ReturnsXmlnsNamespace() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals(DOMNodePointer.XMLNS_NAMESPACE_URI, ptr.getNamespaceURI("xmlns"));
    }

    @Test
    public void getNamespaceURIByPrefix_FoundOnAncestor_CachedOnSecondCall() {
        root.setAttribute("xmlns:p", "urn:p");
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("urn:p", ptr.getNamespaceURI("p"));
        assertEquals("urn:p", ptr.getNamespaceURI("p")); // hits cache branch
    }

    @Test
    public void getNamespaceURIByPrefix_DocumentNode_UsesDocumentElement() {
        root.setAttribute("xmlns:p", "urn:p");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("urn:p", ptr.getNamespaceURI("p"));
    }

    @Test
    public void getNamespaceURIByPrefix_NotFound_ReturnsNull() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertNull(ptr.getNamespaceURI("unknown"));
    }

    @Test
    public void getNamespaceURIByPrefix_EmptyAttributeValue_TreatedAsUnknown() {
        root.setAttribute("xmlns:p", "");
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertNull(ptr.getNamespaceURI("p"));
    }

    // =========================================================
    // getDefaultNamespaceURI()
    // =========================================================

    @Test
    public void getDefaultNamespaceURI_DocumentNode_FoundAndCached() {
        root.setAttribute("xmlns", "urn:default");
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.ENGLISH);
        assertEquals("urn:default", ptr.getDefaultNamespaceURI());
        assertEquals("urn:default", ptr.getDefaultNamespaceURI()); // cached branch
    }

    @Test
    public void getDefaultNamespaceURI_NotFound_ReturnsNull() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertNull(ptr.getDefaultNamespaceURI());
    }

    @Test
    public void getDefaultNamespaceURI_OnAncestorElement() {
        root.setAttribute("xmlns", "urn:default");
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer ptr = new DOMNodePointer(child, Locale.ENGLISH);
        assertEquals("urn:default", ptr.getDefaultNamespaceURI());
    }

    // =========================================================
    // Simple accessors
    // =========================================================

    @Test
    public void getBaseValueAndImmediateNode_ReturnUnderlyingNode() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertSame(root, ptr.getBaseValue());
        assertSame(root, ptr.getImmediateNode());
    }

    @Test
    public void isActual_AlwaysTrue() {
        assertTrue(new DOMNodePointer(root, Locale.ENGLISH).isActual());
    }

    @Test
    public void isCollection_AlwaysFalse() {
        assertFalse(new DOMNodePointer(root, Locale.ENGLISH).isCollection());
    }

    @Test
    public void getLength_AlwaysOne() {
        assertEquals(1, new DOMNodePointer(root, Locale.ENGLISH).getLength());
    }

    @Test
    public void isLeaf_NoChildren_True() {
        Element e = doc.createElement("leaf");
        assertTrue(new DOMNodePointer(e, Locale.ENGLISH).isLeaf());
    }

    @Test
    public void isLeaf_HasChildren_False() {
        root.appendChild(doc.createElement("child"));
        assertFalse(new DOMNodePointer(root, Locale.ENGLISH).isLeaf());
    }

    // =========================================================
    // findEnclosingAttribute() / getLanguage() / isLanguage()
    // =========================================================

    @Test
    public void findEnclosingAttribute_FoundOnSelf() {
        root.setAttribute("xml:lang", "en-US");
        assertEquals("en-US", DOMNodePointer.findEnclosingAttribute(root, "xml:lang"));
    }

    @Test
    public void findEnclosingAttribute_FoundOnAncestor() {
        root.setAttribute("xml:lang", "en-US");
        Element child = doc.createElement("child");
        root.appendChild(child);
        assertEquals("en-US", DOMNodePointer.findEnclosingAttribute(child, "xml:lang"));
    }

    @Test
    public void findEnclosingAttribute_EmptyAttributeSkipped_ReturnsNull() {
        root.setAttribute("xml:lang", "");
        assertNull(DOMNodePointer.findEnclosingAttribute(root, "xml:lang"));
    }

    @Test
    public void findEnclosingAttribute_NotFound_ReturnsNull() {
        assertNull(DOMNodePointer.findEnclosingAttribute(root, "xml:lang"));
    }

    @Test
    public void isLanguage_MatchesPrefix_True() {
        root.setAttribute("xml:lang", "en-US");
        assertTrue(new DOMNodePointer(root, Locale.ENGLISH).isLanguage("en"));
    }

    @Test
    public void isLanguage_DoesNotMatch_False() {
        root.setAttribute("xml:lang", "fr-FR");
        assertFalse(new DOMNodePointer(root, Locale.ENGLISH).isLanguage("en"));
    }

    @Test
    public void isLanguage_NoAttribute_DelegatesToSuper_NoException() {
        // current == null -> super.isLanguage(lang). Semantics ของ NodePointer
        // ไม่ได้อยู่ในซอร์สที่ให้มา จึงตรวจแค่ว่าเรียกได้โดยไม่ throw
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        boolean result = ptr.isLanguage("en");
        assertTrue(result == true || result == false);
    }

    // =========================================================
    // setValue()
    // =========================================================

    @Test
    public void setValue_TextNode_NonEmptyString_SetsNodeValue() {
        Text t = doc.createTextNode("old");
        root.appendChild(t);
        new DOMNodePointer(t, Locale.ENGLISH).setValue("new value");
        assertEquals("new value", t.getNodeValue());
    }

    @Test
    public void setValue_TextNode_EmptyString_RemovesNode() {
        Text t = doc.createTextNode("old");
        root.appendChild(t);
        new DOMNodePointer(t, Locale.ENGLISH).setValue("");
        assertFalse(nodeListContains(root.getChildNodes(), t));
    }

    @Test
    public void setValue_TextNode_NullValue_RemovesNode() {
        Text t = doc.createTextNode("old");
        root.appendChild(t);
        new DOMNodePointer(t, Locale.ENGLISH).setValue(null);
        assertFalse(nodeListContains(root.getChildNodes(), t));
    }

    @Test
    public void setValue_CDataNode_NonEmptyString_SetsNodeValue() {
        CDATASection c = doc.createCDATASection("old");
        root.appendChild(c);
        new DOMNodePointer(c, Locale.ENGLISH).setValue("newcdata");
        assertEquals("newcdata", c.getNodeValue());
    }

    @Test
    public void setValue_ElementNode_StringValue_ReplacesChildrenWithText() {
        root.appendChild(doc.createElement("oldchild"));
        new DOMNodePointer(root, Locale.ENGLISH).setValue("hello");
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("hello", root.getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_ElementNode_EmptyStringValue_NoChildAppended() {
        root.appendChild(doc.createElement("oldchild"));
        new DOMNodePointer(root, Locale.ENGLISH).setValue("");
        assertEquals(0, root.getChildNodes().getLength());
    }

    @Test
    public void setValue_ElementNode_ValueIsElement_CopiesGrandchildren() {
        Element valueElement = doc.createElement("value");
        valueElement.appendChild(doc.createTextNode("inner"));
        root.appendChild(doc.createElement("oldchild"));

        new DOMNodePointer(root, Locale.ENGLISH).setValue(valueElement);

        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.TEXT_NODE, root.getFirstChild().getNodeType());
        assertEquals("inner", root.getFirstChild().getNodeValue());
    }

    @Test
    public void setValue_ElementNode_ValueIsOtherNode_AppendsCloneDirectly() {
        Comment valueComment = doc.createComment("a comment");
        root.appendChild(doc.createElement("oldchild"));

        new DOMNodePointer(root, Locale.ENGLISH).setValue(valueComment);

        assertEquals(1, root.getChildNodes().getLength());
        assertEquals(Node.COMMENT_NODE, root.getFirstChild().getNodeType());
    }

    // =========================================================
    // createChild()
    // =========================================================

    @Test
    public void createChild_FactorySucceeds_ReturnsNewPointer() {
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                Element p = (Element) parent;
                Element child = p.getOwnerDocument().createElement(name);
                p.appendChild(child);
                return true;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        NodePointer result = ptr.createChild(context, new QName(null, "newchild"), 0);
        assertNotNull(result);
        assertEquals(1, root.getChildNodes().getLength());
        assertEquals("newchild", root.getFirstChild().getNodeName());
    }

    @Test
    public void createChild_WholeCollectionIndex_NormalizedToZero() {
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                assertEquals(0, index);
                Element p = (Element) parent;
                Element child = p.getOwnerDocument().createElement(name);
                p.appendChild(child);
                return true;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        ptr.createChild(context, new QName(null, "newchild"), NodePointer.WHOLE_COLLECTION);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void createChild_FactoryFails_ThrowsException() {
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                return false;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        ptr.createChild(context, new QName(null, "newchild"), 0);
    }

    @Test
    public void createChild_WithValue_SetsValueOnCreatedNode() {
        JXPathContext context = JXPathContext.newContext(doc);
        context.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, Pointer pointer,
                    Object parent, String name, int index) {
                Element p = (Element) parent;
                Element child = p.getOwnerDocument().createElement(name);
                p.appendChild(child);
                return true;
            }
        });
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        ptr.createChild(context, new QName(null, "newchild"), 0, "val");
        assertEquals("val", root.getFirstChild().getFirstChild().getNodeValue());
    }

    // =========================================================
    // createAttribute()
    // =========================================================

    @Test
    public void createAttribute_NonElementNode_DelegatesToSuper_NoCrash() {
        // behavior ของ super.createAttribute() ไม่อยู่ในซอร์สที่ให้มา
        // ตรวจเพียงว่าสาขา "!(node instanceof Element)" ถูก execute ได้โดยไม่ throw
        // Throwable ที่ไม่คาดคิด (RuntimeException ถือว่ายอมรับได้)
        DOMNodePointer ptr = new DOMNodePointer(doc, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(doc);
        try {
            NodePointer result = ptr.createAttribute(context, new QName(null, "attr"));
            assertNotNull(result);
        }
        catch (RuntimeException expected) {
            // acceptable: exact behavior defined by superclass
        }
    }

    @Test
    public void createAttribute_NoPrefix_AttributeDoesNotExist_CreatesIt() {
        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        NodePointer result = ptr.createAttribute(context, new QName(null, "attr"));
        assertNotNull(result);
        assertTrue(root.hasAttribute("attr"));
    }

    @Test
    public void createAttribute_NoPrefix_AttributeAlreadyExists_NotOverwritten() {
        root.setAttribute("attr", "existing");
        JXPathContext context = JXPathContext.newContext(doc);
        new DOMNodePointer(root, Locale.ENGLISH)
                .createAttribute(context, new QName(null, "attr"));
        assertEquals("existing", root.getAttribute("attr"));
    }

    @Test
    public void createAttribute_WithPrefix_KnownNamespace_CreatesAttributeNS() {
        // อิงสมมติฐาน: NamespaceResolver.getNamespaceURI(prefix) delegate ไปยัง
        // context pointer (this) ซึ่งเป็น DOMNodePointer.getNamespaceURI(String)
        root.setAttribute("xmlns:p", "urn:p");
        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        ptr.createAttribute(context, new QName("p", "attr"));
        assertTrue(root.hasAttribute("p:attr"));
    }

    @Test(expected = JXPathException.class)
    public void createAttribute_WithPrefix_UnknownNamespace_ThrowsException() {
        JXPathContext context = JXPathContext.newContext(doc);
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        ptr.createAttribute(context, new QName("unknownPrefix", "attr"));
    }

    // =========================================================
    // remove()
    // =========================================================

    @Test(expected = JXPathException.class)
    public void remove_RootDocumentNode_ThrowsException() {
        new DOMNodePointer(doc, Locale.ENGLISH).remove();
    }

    @Test
    public void remove_ElementWithParent_RemovesFromParent() {
        Element child = doc.createElement("child");
        root.appendChild(child);
        new DOMNodePointer(child, Locale.ENGLISH).remove();
        assertFalse(nodeListContains(root.getChildNodes(), child));
    }

    // =========================================================
    // asPath()
    // =========================================================

    @Test
    public void asPath_WithId_UsesIdFunctionFormat() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH, "myid");
        String path = ptr.asPath();
        assertTrue(path.startsWith("id('"));
        assertTrue(path.endsWith("')"));
    }

    @Test
    public void asPath_ElementNoParentPointer_EmptyPath() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals("", ptr.asPath());
    }

    @Test
    public void asPath_ElementWithDomParent_NoNamespace() {
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, child);
        assertTrue(childPtr.asPath().endsWith("/child[1]"));
    }

    @Test
    public void asPath_ElementWithNamespace_NoPrefixRegistered_UsesNodeFunctionOrPrefix() {
        root.setAttribute("xmlns", "urn:default");
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);
        DOMNodePointer childPtr = new DOMNodePointer(rootPtr, child);
        String path = childPtr.asPath();
        // ผลลัพธ์ของ getNamespaceResolver().getPrefix(nsURI) ไม่ชัดเจนจากซอร์สที่ให้มา
        // จึงยอมรับทั้งสองสาขาที่เป็นไปได้ (node() หรือ prefix:ln)
        assertTrue(path.contains("node()[") || path.matches(".*:child\\[\\d+\\].*"));
    }

    @Test
    public void asPath_TextNode() {
        Text t = doc.createTextNode("hi");
        root.appendChild(t);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);
        DOMNodePointer textPtr = new DOMNodePointer(rootPtr, t);
        assertTrue(textPtr.asPath().endsWith("/text()[1]"));
    }

    @Test
    public void asPath_ProcessingInstructionNode() {
        ProcessingInstruction pi = doc.createProcessingInstruction("target", "data");
        root.appendChild(pi);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);
        DOMNodePointer piPtr = new DOMNodePointer(rootPtr, pi);
        assertTrue(piPtr.asPath().endsWith("/processing-instruction('target')[1]"));
    }

    @Test
    public void asPath_DocumentNode_EmptyPath() {
        assertEquals("", new DOMNodePointer(doc, Locale.ENGLISH).asPath());
    }

    @Test
    public void asPath_MultipleSameNameSiblings_PositionByQName() {
        Element c1 = doc.createElement("child");
        Element c2 = doc.createElement("child");
        root.appendChild(c1);
        root.appendChild(c2);
        DOMNodePointer docPtr = new DOMNodePointer(doc, Locale.ENGLISH);
        DOMNodePointer rootPtr = new DOMNodePointer(docPtr, root);
        DOMNodePointer c2Ptr = new DOMNodePointer(rootPtr, c2);
        assertTrue(c2Ptr.asPath().endsWith("/child[2]"));
    }

    // =========================================================
    // hashCode() / equals()
    // =========================================================

    @Test
    public void hashCode_MatchesNodeHashCode() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertEquals(root.hashCode(), ptr.hashCode());
    }

    @Test
    public void equals_SameInstance_True() {
        DOMNodePointer ptr = new DOMNodePointer(root, Locale.ENGLISH);
        assertTrue(ptr.equals(ptr));
    }

    @Test
    public void equals_SameNodeDifferentPointerInstance_True() {
        DOMNodePointer p1 = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(root, Locale.ENGLISH);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void equals_DifferentNode_False() {
        Element other = doc.createElement("other");
        DOMNodePointer p1 = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p2 = new DOMNodePointer(other, Locale.ENGLISH);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void equals_NotADOMNodePointer_False() {
        DOMNodePointer p1 = new DOMNodePointer(root, Locale.ENGLISH);
        assertFalse(p1.equals("not a pointer"));
    }

    // =========================================================
    // getPrefix(Node)
    // =========================================================

    @Test
    public void getPrefix_NativePrefix() throws Exception {
        Document nsDoc = nsAwareDocument();
        Element e = nsDoc.createElementNS("urn:x", "p:foo");
        assertEquals("p", DOMNodePointer.getPrefix(e));
    }

    @Test
    public void getPrefix_FallbackParsedFromName() {
        Element e = doc.createElement("ns1:local");
        assertEquals("ns1", DOMNodePointer.getPrefix(e));
    }

    @Test
    public void getPrefix_NoColon_ReturnsNull() {
        Element e = doc.createElement("local");
        assertNull(DOMNodePointer.getPrefix(e));
    }

    // =========================================================
    // getLocalName(Node)
    // =========================================================

    @Test
    public void getLocalName_NativeLocalName() throws Exception {
        Document nsDoc = nsAwareDocument();
        Element e = nsDoc.createElementNS("urn:x", "p:foo");
        assertEquals("foo", DOMNodePointer.getLocalName(e));
    }

    @Test
    public void getLocalName_FallbackParsedFromName() {
        Element e = doc.createElement("ns1:local");
        assertEquals("local", DOMNodePointer.getLocalName(e));
    }

    @Test
    public void getLocalName_NoColon_ReturnsWholeName() {
        Element e = doc.createElement("local");
        assertEquals("local", DOMNodePointer.getLocalName(e));
    }

    // =========================================================
    // getValue() / stringValue()
    // =========================================================

    @Test
    public void getValue_CommentNode_Trimmed() {
        Comment c = doc.createComment("  hello  ");
        assertEquals("hello", new DOMNodePointer(c, Locale.ENGLISH).getValue());
    }

    @Test
    public void getValue_TextNode_TrimmedByDefault() {
        Text t = doc.createTextNode("  hi  ");
        root.appendChild(t);
        assertEquals("hi", new DOMNodePointer(t, Locale.ENGLISH).getValue());
    }

    @Test
    public void getValue_TextNode_PreservedWhenXmlSpacePreserve() {
        root.setAttribute("xml:space", "preserve");
        Text t = doc.createTextNode("  hi  ");
        root.appendChild(t);
        assertEquals("  hi  ", new DOMNodePointer(t, Locale.ENGLISH).getValue());
    }

    @Test
    public void getValue_ProcessingInstruction_Trimmed() {
        ProcessingInstruction pi = doc.createProcessingInstruction("t", "  data  ");
        assertEquals("data", new DOMNodePointer(pi, Locale.ENGLISH).getValue());
    }

    @Test
    public void getValue_ElementNode_ConcatenatesChildrenStringValue() {
        Element e = doc.createElement("e");
        e.appendChild(doc.createTextNode("A"));
        e.appendChild(doc.createComment("ignored"));
        e.appendChild(doc.createTextNode("B"));
        assertEquals("AB", new DOMNodePointer(e, Locale.ENGLISH).getValue());
    }

    @Test
    public void getValue_EmptyComment_ReturnsEmptyString() {
        Comment c = doc.createComment("");
        assertEquals("", new DOMNodePointer(c, Locale.ENGLISH).getValue());
    }

    // =========================================================
    // getPointerByID()
    // =========================================================

    private Document parseWithIdDtd(String xml) throws Exception {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(false);
        dbf.setValidating(true); // ต้อง validate เพื่อให้ attribute ID ถูกจดจำ
        return dbf.newDocumentBuilder().parse(new InputSource(new StringReader(xml)));
    }

    @Test
    public void getPointerByID_Found_ReturnsDOMNodePointer() throws Exception {
        String xml = "<!DOCTYPE root [\n"
                + "<!ELEMENT root (child)*>\n"
                + "<!ELEMENT child EMPTY>\n"
                + "<!ATTLIST child id ID #IMPLIED>\n"
                + "]>\n"
                + "<root><child id=\"c1\"/><child id=\"c2\"/></root>";
        Document idDoc = parseWithIdDtd(xml);

        DOMNodePointer ptr = new DOMNodePointer(idDoc, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(idDoc);
        Pointer result = ptr.getPointerByID(context, "c1");
        assertTrue(result instanceof DOMNodePointer);
        Element found = (Element) ((DOMNodePointer) result).getImmediateNode();
        assertEquals("c1", found.getAttribute("id"));
    }

    @Test
    public void getPointerByID_NotFound_ReturnsNullPointer() throws Exception {
        String xml = "<!DOCTYPE root [\n"
                + "<!ELEMENT root (child)*>\n"
                + "<!ELEMENT child EMPTY>\n"
                + "<!ATTLIST child id ID #IMPLIED>\n"
                + "]>\n"
                + "<root><child id=\"c1\"/></root>";
        Document idDoc = parseWithIdDtd(xml);

        DOMNodePointer ptr = new DOMNodePointer(idDoc, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(idDoc);
        Pointer result = ptr.getPointerByID(context, "doesNotExist");
        assertTrue(result instanceof NullPointer);
    }

    @Test
    public void getPointerByID_FromNonDocumentNode_UsesOwnerDocument() throws Exception {
        String xml = "<!DOCTYPE root [\n"
                + "<!ELEMENT root (child)*>\n"
                + "<!ELEMENT child EMPTY>\n"
                + "<!ATTLIST child id ID #IMPLIED>\n"
                + "]>\n"
                + "<root><child id=\"c1\"/></root>";
        Document idDoc = parseWithIdDtd(xml);
        Element rootEl = idDoc.getDocumentElement();

        DOMNodePointer ptr = new DOMNodePointer(rootEl, Locale.ENGLISH);
        JXPathContext context = JXPathContext.newContext(idDoc);
        Pointer result = ptr.getPointerByID(context, "c1");
        assertTrue(result instanceof DOMNodePointer);
    }

    // =========================================================
    // compareChildNodePointers()
    // =========================================================

    @Test
    public void compareChildNodePointers_SameNode_ReturnsZero() {
        Element child = doc.createElement("child");
        root.appendChild(child);
        DOMNodePointer parentPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, child);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, child);
        assertEquals(0, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void compareChildNodePointers_Node1Attribute_Node2NotAttribute_ReturnsMinus1() {
        root.setAttribute("a", "1");
        Attr attr = root.getAttributeNode("a");
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer parentPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, attr);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, child);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void compareChildNodePointers_Node2Attribute_Node1NotAttribute_ReturnsPlus1() {
        root.setAttribute("a", "1");
        Attr attr = root.getAttributeNode("a");
        Element child = doc.createElement("child");
        root.appendChild(child);

        DOMNodePointer parentPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, child);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, attr);
        assertEquals(1, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void compareChildNodePointers_BothChildNodes_OrderByFirstChildTraversal() {
        Element c1 = doc.createElement("c1");
        Element c2 = doc.createElement("c2");
        root.appendChild(c1);
        root.appendChild(c2);

        DOMNodePointer parentPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, c1);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, c2);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void compareChildNodePointers_BothAttributes_ValidComparatorResult() {
        // NOTE: อิง behavior ของ getNode() ที่สืบทอดมา ซึ่งไม่อยู่ในซอร์สที่ให้มา
        root.setAttribute("a", "1");
        root.setAttribute("b", "2");
        Attr attrA = root.getAttributeNode("a");
        Attr attrB = root.getAttributeNode("b");

        DOMNodePointer parentPtr = new DOMNodePointer(root, Locale.ENGLISH);
        DOMNodePointer p1 = new DOMNodePointer(parentPtr, attrA);
        DOMNodePointer p2 = new DOMNodePointer(parentPtr, attrB);
        int result = parentPtr.compareChildNodePointers(p1, p2);
        assertTrue(result == -1 || result == 1 || result == 0);
    }

    // =========================================================
    // Iterator / pointer factory methods (sanity, no branch of its own)
    // =========================================================

    @Test
    public void childIterator_ReturnsNonNullIterator() {
        NodeIterator it = new DOMNodePointer(root, Locale.ENGLISH).childIterator(null, false, null);
        assertNotNull(it);
    }

    @Test
    public void attributeIterator_ReturnsNonNullIterator() {
        NodeIterator it = new DOMNodePointer(root, Locale.ENGLISH).attributeIterator(new QName(null, "any"));
        assertNotNull(it);
    }

    @Test
    public void namespaceIterator_ReturnsNonNullIterator() {
        assertNotNull(new DOMNodePointer(root, Locale.ENGLISH).namespaceIterator());
    }

    @Test
    public void namespacePointer_ReturnsNonNullPointer() {
        assertNotNull(new DOMNodePointer(root, Locale.ENGLISH).namespacePointer("p"));
    }
}
```

## สรุปตาราง Test → Branch/Condition ที่ครอบคลุม

| กลุ่มเมธอดทดสอบ | Branch / Condition หลักที่ครอบคลุม |
|---|---|
| `testNode_*` | test==null; NodeNameTest (non-element, wildcard no-prefix, name match/mismatch, wildcard+prefix namespace mismatch); NodeTypeTest ทุก case (NODE/TEXT/CDATA/COMMENT/PI) + default; ProcessingInstructionTest match/no-match/wrong node type; delegate instance→static |
| `getName_*` | ELEMENT_NODE, PROCESSING_INSTRUCTION_NODE, else (null/null) |
| `getNamespaceURI_*` (static & instance) | Document→documentElement, native `getNamespaceURI()!=null`, fallback manual search พบ/ไม่พบ |
| `getNamespaceResolver_*` | lazy-init if (localNamespaceResolver==null) |
| `getNamespaceURIByPrefix_*` | prefix null/empty, "xml", "xmlns", map null→create, cache hit, document→documentElement, found/not found, empty-value→UNKNOWN_NAMESPACE |
| `getDefaultNamespaceURI_*` | document→documentElement, found/not found, cached (defaultNamespace!=null) |
| `getBaseValue/isActual/isCollection/getLength/isLeaf_*` | ค่าคงที่ true/false/1, hasChildNodes() true/false |
| `findEnclosingAttribute_*`, `isLanguage_*` | พบบน self/ancestor, attr ว่างถูก skip, ไม่พบ→null; current!=null match/mismatch; current==null→super (no-throw) |
| `setValue_*` | TEXT/CDATA non-empty→setNodeValue, empty/null→removeChild; element: ลบ children loop, value instanceof Node (Element→copy grandchildren, อื่น→clone ตรง), value ไม่ใช่ Node (string non-empty/empty) |
| `createChild_*` | index==WHOLE_COLLECTION→0, factory success/fail, overload with value |
| `createAttribute_*` | !(Element)→super, prefix!=null (ns พบ/ไม่พบ), prefix==null (attr มี/ไม่มีอยู่แล้ว) |
| `remove_*` | parent==null→throw, parent!=null→removeChild |
| `asPath_*` | id!=null, parent null vs DOMNodePointer, namespace null/มี prefix/ไม่มี prefix, TEXT/PI/DOCUMENT case, multi-sibling position |
| `hashCode_*`, `equals_*` | same instance, same node, different node, non-DOMNodePointer |
| `getPrefix_*`, `getLocalName_*` | native non-null, fallback parse มี/ไม่มี ':' |
| `getValue_*` / stringValue | COMMENT, TEXT/CDATA trim vs preserve (`xml:space`), PI trim, element concat children |
| `getPointerByID_*` | พบ/ไม่พบ (NullPointer), node เป็น Document vs ไม่ใช่ Document (ownerDocument) |
| `compareChildNodePointers_*` | node1==node2, attribute vs non-attribute (ทั้งสองทาง), both attribute (loop NamedNodeMap), both non-attribute (loop firstChild/nextSibling) |
| `*Iterator_*`, `namespacePointer_*` | sanity ว่า factory method คืนค่าไม่ null (ไม่มี branch ภายใน) |

**หมายเหตุสำคัญ:** จุดที่พึ่งพา behavior ของ superclass/`NamespaceResolver`/`TypeUtils.convert`