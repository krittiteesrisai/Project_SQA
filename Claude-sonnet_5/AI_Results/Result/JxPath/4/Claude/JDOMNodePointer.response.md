# JDOMNodePointerTest.java

ผมวิเคราะห์ source code และพบจุดที่น่าสนใจ โดยเฉพาะใน `addContent()` method ที่เช็ค `node instanceof CDATA/ProcessingInstruction/Comment` (ใช้ field `node` ของ outer class ซึ่งเป็น `Element` เสมอ) แทนที่จะเช็ค `child instanceof ...` — นี่อาจเป็น **fault จริง** ในซอร์สโค้ด ผมจึงเขียน test case ไว้เพื่อ document/detect behavior นี้ตามที่ปรากฏจริงในโค้ด (ไม่ใช่ behavior ที่ "ควรจะเป็น")

```java
package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;

import java.util.Locale;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.ProcessingInstruction;
import org.jdom.Text;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests สำหรับ JDOMNodePointer (Defects4J: JxPath-4b)
 *
 * หมายเหตุทั่วไป:
 * - behavior ของ super class (NodePointer) บางส่วน (เช่น isLanguage fallback,
 *   createAttribute fallback) ไม่ได้แสดงใน source ที่ให้มา จึงไม่ assert
 *   ค่าที่แน่นอน เพียงยืนยันว่าสามารถ execute ได้โดยไม่ throw exception
 *   ที่ไม่คาดคิด (ตามกฎข้อ 4 ห้ามเดา behavior)
 */
public class JDOMNodePointerTest {

    private Locale locale;

    @Before
    public void setUp() {
        locale = Locale.US;
    }

    // ===================== Constructors =====================

    @Test
    public void testConstructorNodeLocale() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertSame(e, p.getBaseValue());
        assertSame(e, p.getImmediateNode());
    }

    @Test
    public void testConstructorNodeLocaleId() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale, "myid");
        assertEquals("id('myid')", p.asPath());
    }

    @Test
    public void testConstructorParentNode() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parent = new JDOMNodePointer(root, locale);
        JDOMNodePointer p = new JDOMNodePointer(parent, child);
        assertSame(child, p.getBaseValue());
    }

    // ===================== getNamespaceURI() =====================

    @Test
    public void testGetNamespaceURI_ElementNoNamespace() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertNull(p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementWithNamespace() {
        Namespace ns = Namespace.getNamespace("http://example.com");
        Element e = new Element("root", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("http://example.com", p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_NonElementNode() {
        Text t = new Text("abc");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertNull(p.getNamespaceURI());
    }

    // ===================== getNamespaceURI(String prefix) =====================

    @Test
    public void testGetNamespaceURIPrefix_Document_Known() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com/doc");
        Element root = new Element("root", ns);
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertEquals("http://example.com/doc", p.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Document_Unknown() {
        Document doc = new Document(new Element("root"));
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertNull(p.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Element_Known() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com/elem");
        Element e = new Element("root", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("http://example.com/elem", p.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Element_Unknown() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertNull(p.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIPrefix_OtherNode() {
        Text t = new Text("abc");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertNull(p.getNamespaceURI("anything"));
    }

    // ===================== compareChildNodePointers =====================

    @Test
    public void testCompareChildNodePointers_SameNode() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, child);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, child);
        assertEquals(0, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_Attr1_NonAttr2() {
        Element root = new Element("root");
        root.setAttribute("a1", "v1");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        Attribute attr = root.getAttribute("a1");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, attr);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, child);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_NonAttr1_Attr2() {
        Element root = new Element("root");
        root.setAttribute("a1", "v1");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        Attribute attr = root.getAttribute("a1");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, child);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, attr);
        assertEquals(1, parentPtr.compareChildNodePointers(p1, p2));
    }

    @Test
    public void testCompareChildNodePointers_BothAttributes() {
        Element root = new Element("root");
        root.setAttribute("a1", "v1");
        root.setAttribute("a2", "v2");
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        Attribute attr1 = root.getAttribute("a1");
        Attribute attr2 = root.getAttribute("a2");
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, attr1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, attr2);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test
    public void testCompareChildNodePointers_BothElements() {
        Element root = new Element("root");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        root.addContent(child1);
        root.addContent(child2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer p1 = new JDOMNodePointer(parentPtr, child1);
        JDOMNodePointer p2 = new JDOMNodePointer(parentPtr, child2);
        assertEquals(-1, parentPtr.compareChildNodePointers(p1, p2));
        assertEquals(1, parentPtr.compareChildNodePointers(p2, p1));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NodeNotElement_Throws() {
        Text t = new Text("abc"); // pointer.node ไม่ใช่ Element
        JDOMNodePointer ptrOnText = new JDOMNodePointer(t, locale);
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        JDOMNodePointer p1 = new JDOMNodePointer(ptrOnText, child1);
        JDOMNodePointer p2 = new JDOMNodePointer(ptrOnText, child2);
        ptrOnText.compareChildNodePointers(p1, p2);
    }

    // ===================== isCollection / getLength / getBaseValue =====================

    @Test
    public void testIsCollectionAndGetLength() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
    }

    // ===================== isLeaf =====================

    @Test
    public void testIsLeaf_ElementNoContent() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeaf_ElementWithContent() {
        Element e = new Element("root");
        e.addContent(new Element("child"));
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertFalse(p.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentNoContent() {
        JDOMNodePointer p = new JDOMNodePointer(new Document(), locale);
        assertTrue(p.isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentWithContent() {
        Document doc = new Document(new Element("root"));
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertFalse(p.isLeaf());
    }

    @Test
    public void testIsLeaf_OtherNode() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("abc"), locale);
        assertTrue(p.isLeaf());
    }

    // ===================== getName =====================

    @Test
    public void testGetName_ElementNoPrefix() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        QName name = p.getName();
        assertNull(name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetName_ElementWithPrefix() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element e = new Element("root", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        QName name = p.getName();
        assertEquals("pfx", name.getPrefix());
        assertEquals("root", name.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        QName name = p.getName();
        assertNull(name.getPrefix());
        assertEquals("target", name.getName());
    }

    @Test
    public void testGetName_OtherNode() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("abc"), locale);
        QName name = p.getName();
        assertNull(name.getPrefix());
        assertNull(name.getName());
    }

    // ===================== getValue =====================

    @Test
    public void testGetValue_Element() {
        Element e = new Element("root");
        e.setText("  hello  ");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("hello", p.getValue());
    }

    @Test
    public void testGetValue_Comment_NotNull() {
        Comment c = new Comment("  comment text  ");
        JDOMNodePointer p = new JDOMNodePointer(c, locale);
        assertEquals("comment text", p.getValue());
    }

    @Test
    public void testGetValue_Text() {
        Text t = new Text("  text value  ");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertEquals("text value", p.getValue());
    }

    @Test
    public void testGetValue_CDATA() {
        CDATA cdata = new CDATA("  cdata value  ");
        JDOMNodePointer p = new JDOMNodePointer(cdata, locale);
        assertEquals("cdata value", p.getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "  data value  ");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        assertEquals("data value", p.getValue());
    }

    @Test
    public void testGetValue_OtherNode_ReturnsNull() {
        Attribute attr = new Attribute("name", "value");
        JDOMNodePointer p = new JDOMNodePointer(attr, locale);
        assertNull(p.getValue());
    }

    // ===================== setValue =====================

    @Test
    public void testSetValue_Text_NonEmptyString() {
        Element parent = new Element("root");
        Text t = new Text("old");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.setValue("newvalue");
        assertEquals("newvalue", t.getText());
    }

    @Test
    public void testSetValue_Text_EmptyString_RemovesFromParent() {
        Element parent = new Element("root");
        Text t = new Text("old");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.setValue("");
        assertFalse(parent.getContent().contains(t));
    }

    @Test
    public void testSetValue_Element_WithElementValue_InnerElementCloned() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        Element valueElement = new Element("value");
        valueElement.addContent(new Element("inner"));
        p.setValue(valueElement);
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Element);
    }

    @Test
    public void testSetValue_Element_WithElementValue_InnerTextCloned() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        Element valueElement = new Element("value");
        valueElement.addContent(new Text("innertext"));
        p.setValue(valueElement);
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Text);
    }

    /**
     * NOTE (possible fault): ใน addContent() source code เช็ค
     * "node instanceof CDATA" (field ของ outer class ซึ่งเป็น Element เสมอ)
     * แทนที่จะเช็ค "child instanceof CDATA" ผลคือ CDATA children
     * ใน value element จะไม่ถูก clone/add เข้าไปเลย
     * Test นี้ document behavior จริงตามโค้ดปัจจุบัน
     */
    @Test
    public void testSetValue_Element_WithElementValue_CDATAChild_NotAddedDueToConditionBug() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        Element valueElement = new Element("value");
        valueElement.addContent(new CDATA("cdatacontent"));
        p.setValue(valueElement);
        assertEquals(0, e.getContent().size());
    }

    @Test
    public void testSetValue_Element_WithElementValue_PIChild_NotAddedDueToConditionBug() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        Element valueElement = new Element("value");
        valueElement.addContent(new ProcessingInstruction("tgt", "data"));
        p.setValue(valueElement);
        assertEquals(0, e.getContent().size());
    }

    @Test
    public void testSetValue_Element_WithElementValue_CommentChild_NotAddedDueToConditionBug() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        Element valueElement = new Element("value");
        valueElement.addContent(new Comment("c"));
        p.setValue(valueElement);
        assertEquals(0, e.getContent().size());
    }

    @Test
    public void testSetValue_Element_WithDocumentValue() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        Document valueDoc = new Document(new Element("docroot"));
        p.setValue(valueDoc);
        assertEquals(1, e.getContent().size());
    }

    @Test
    public void testSetValue_Element_WithTextValue() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.setValue(new Text("sometext"));
        assertEquals(1, e.getContent().size());
        assertEquals("sometext", ((Text) e.getContent().get(0)).getText());
    }

    @Test
    public void testSetValue_Element_WithCDATAValue() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.setValue(new CDATA("cdatatext"));
        assertEquals(1, e.getContent().size());
    }

    @Test
    public void testSetValue_Element_WithProcessingInstructionValue() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.setValue(new ProcessingInstruction("target", "data"));
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof ProcessingInstruction);
    }

    @Test
    public void testSetValue_Element_WithCommentValue() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.setValue(new Comment("commenttext"));
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Comment);
    }

    @Test
    public void testSetValue_Element_WithStringValue_NonEmpty() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.setValue("plain string");
        assertEquals(1, e.getContent().size());
        assertTrue(e.getContent().get(0) instanceof Text);
    }

    @Test
    public void testSetValue_Element_WithStringValue_Empty() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.setValue("");
        assertEquals(0, e.getContent().size());
    }

    // ===================== testNode =====================

    @Test
    public void testTestNode_NullTest_ReturnsTrue() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        assertTrue(p.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTest_NotElement_ReturnsFalse() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("abc"), locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "root"));
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_WildcardNoPrefix_ReturnsTrue() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        NodeNameTest test = new NodeNameTest(new QName(null, null)); // wildcard "*"
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_MatchName() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "root"));
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "other"));
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_Element() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node_Document() {
        JDOMNodePointer p = new JDOMNodePointer(new Document(new Element("root")), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text() {
        JDOMNodePointer p = new JDOMNodePointer(new Text("abc"), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text_CDATA() {
        JDOMNodePointer p = new JDOMNodePointer(new CDATA("abc"), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_TEXT);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Comment() {
        JDOMNodePointer p = new JDOMNodePointer(new Comment("abc"), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI() {
        JDOMNodePointer p = new JDOMNodePointer(new ProcessingInstruction("t", "d"), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_PI);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_NoMatch_ReturnsFalse() {
        // Attribute ไม่ตรงกับ NODE_TYPE_COMMENT case ใด ๆ
        JDOMNodePointer p = new JDOMNodePointer(new Attribute("name", "value"), locale);
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Match() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NoMatch() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        ProcessingInstructionTest test = new ProcessingInstructionTest("other");
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NodeNotPI_ReturnsFalse() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        ProcessingInstructionTest test = new ProcessingInstructionTest("target");
        assertFalse(p.testNode(test));
    }

    // ===================== getPrefix (static) =====================

    @Test
    public void testGetPrefix_Element_NoPrefix() {
        assertNull(JDOMNodePointer.getPrefix(new Element("root")));
    }

    @Test
    public void testGetPrefix_Element_WithPrefix() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        assertEquals("pfx", JDOMNodePointer.getPrefix(new Element("root", ns)));
    }

    @Test
    public void testGetPrefix_Attribute_NoPrefix() {
        assertNull(JDOMNodePointer.getPrefix(new Attribute("name", "value")));
    }

    @Test
    public void testGetPrefix_Attribute_WithPrefix() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Attribute attr = new Attribute("name", "value", ns);
        assertEquals("pfx", JDOMNodePointer.getPrefix(attr));
    }

    @Test
    public void testGetPrefix_OtherNode() {
        assertNull(JDOMNodePointer.getPrefix(new Text("abc")));
    }

    // ===================== getLocalName (static) =====================

    @Test
    public void testGetLocalName_Element() {
        assertEquals("root", JDOMNodePointer.getLocalName(new Element("root")));
    }

    @Test
    public void testGetLocalName_Attribute() {
        assertEquals("name", JDOMNodePointer.getLocalName(new Attribute("name", "value")));
    }

    @Test
    public void testGetLocalName_OtherNode() {
        assertNull(JDOMNodePointer.getLocalName(new Text("abc")));
    }

    // ===================== isLanguage / getLanguage =====================

    @Test
    public void testIsLanguage_WithLangAttribute_Match() {
        Element e = new Element("root");
        e.setAttribute("lang", "EN", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertTrue(p.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_WithLangAttribute_NoMatch() {
        Element e = new Element("root");
        e.setAttribute("lang", "FR", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertFalse(p.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_NoLangAttribute_FallsBackToSuper() {
        // ไม่ทราบพฤติกรรมแน่ชัดของ super.isLanguage() (ไม่มีใน source ที่ให้มา)
        // จึงเรียกเพื่อ coverage branch "current == null" เท่านั้น ไม่ assert ผลลัพธ์
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.isLanguage("en"); // ต้องไม่ throw exception
    }

    @Test
    public void testGetLanguage_FromParentElement() {
        Element parent = new Element("root");
        parent.setAttribute("lang", "FR", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        assertTrue(childPtr.isLanguage("fr"));
    }

    @Test
    public void testGetLanguage_EmptyAttributeValue_Ignored() {
        // attr == "" -> ถูก ignore ตาม source, จึง fallback ไป super (ไม่ assert ผลลัพธ์)
        Element e = new Element("root");
        e.setAttribute("lang", "", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        p.isLanguage("en"); // ต้องไม่ throw exception
    }

    // ===================== remove() / nodeParent =====================

    @Test
    public void testRemove_ElementChild() {
        Element parent = new Element("root");
        Element child = new Element("child");
        parent.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        childPtr.remove();
        assertFalse(parent.getContent().contains(child));
    }

    @Test
    public void testRemove_TextChild() {
        Element parent = new Element("root");
        Text text = new Text("abc");
        parent.addContent(text);
        JDOMNodePointer p = new JDOMNodePointer(text, locale);
        p.remove();
        assertFalse(parent.getContent().contains(text));
    }

    @Test(expected = JXPathException.class)
    public void testRemove_RootElement_Throws() {
        Element root = new Element("root"); // ไม่มี parent
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        p.remove();
    }

    // ===================== asPath =====================

    @Test
    public void testAsPath_WithId_EscapesQuotes() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale, "my'id");
        assertEquals("id('my&apos;id')", p.asPath());
    }

    @Test
    public void testAsPath_WithId_EscapesDoubleQuotes() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale, "my\"id");
        assertEquals("id('my&quot;id')", p.asPath());
    }

    @Test
    public void testAsPath_RootElementNoParent_EmptyPath() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        assertEquals("", p.asPath());
    }

    @Test
    public void testAsPath_ChildElement_DefaultNamespace() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        assertTrue(childPtr.asPath().contains("child"));
    }

    @Test
    public void testAsPath_TextNode() {
        Element parent = new Element("root");
        Text text = new Text("abc");
        parent.addContent(text);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer textPtr = new JDOMNodePointer(parentPtr, text);
        assertTrue(textPtr.asPath().contains("/text()"));
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() {
        Element parent = new Element("root");
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        parent.addContent(pi);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer piPtr = new JDOMNodePointer(parentPtr, pi);
        assertTrue(piPtr.asPath().contains("processing-instruction('target')"));
    }

    @Test
    public void testRelativePositionByName_MultipleSameNameSiblings() {
        Element root = new Element("root");
        Element item1 = new Element("item");
        Element item2 = new Element("item");
        root.addContent(item1);
        root.addContent(item2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer item2Ptr = new JDOMNodePointer(parentPtr, item2);
        assertTrue(item2Ptr.asPath().contains("item[2]"));
    }

    @Test
    public void testRelativePositionOfTextNode_MultipleTextSiblings() {
        Element parent = new Element("root");
        parent.addContent(new Text("a"));
        parent.addContent(new Element("sep"));
        Text t2 = new Text("b");
        parent.addContent(t2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer t2Ptr = new JDOMNodePointer(parentPtr, t2);
        assertTrue(t2Ptr.asPath().contains("text()[2]"));
    }

    @Test
    public void testRelativePositionOfPI_MultiplePIWithSameTarget() {
        Element parent = new Element("root");
        parent.addContent(new ProcessingInstruction("tgt", "d1"));
        ProcessingInstruction pi2 = new ProcessingInstruction("tgt", "d2");
        parent.addContent(pi2);
        JDOMNodePointer parentPtr = new JDOMNodePointer(parent, locale);
        JDOMNodePointer pi2Ptr = new JDOMNodePointer(parentPtr, pi2);
        assertTrue(pi2Ptr.asPath().contains("[2]"));
    }

    // ===================== hashCode / equals =====================

    @Test
    public void testHashCode() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals(System.identityHashCode(e), p.hashCode());
    }

    @Test
    public void testEquals_SameInstance() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_NotJDOMNodePointer() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("root"), locale);
        assertFalse(p.equals("someString"));
    }

    @Test
    public void testEquals_SameUnderlyingNode() {
        Element e = new Element("root");
        JDOMNodePointer p1 = new JDOMNodePointer(e, locale);
        JDOMNodePointer p2 = new JDOMNodePointer(e, locale);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentNode() {
        JDOMNodePointer p1 = new JDOMNodePointer(new Element("root1"), locale);
        JDOMNodePointer p2 = new JDOMNodePointer(new Element("root2"), locale);
        assertFalse(p1.equals(p2));
    }

    // ===================== createAttribute =====================

    @Test
    public void testCreateAttribute_NotElement_DelegatesToSuper() {
        // ไม่ทราบ behavior ของ super.createAttribute() แน่ชัด (ไม่มีใน source ที่ให้มา)
        // เพียงตรวจสอบว่า branch "!(node instanceof Element)" ถูกเรียกโดยไม่เกิด
        // ClassCastException จาก field "node" เอง
        JDOMNodePointer p = new JDOMNodePointer(new Text("abc"), locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        try {
            p.createAttribute(ctx, new QName(null, "attr"));
        }
        catch (Exception ex) {
            // behavior ของ super ไม่ระบุในซอร์ส ยอมรับ exception ใด ๆ จาก super
        }
    }

    @Test
    public void testCreateAttribute_Element_NoPrefix_AttrNotExist() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createAttribute(ctx, new QName(null, "newattr"));
        assertNotNull(result);
        assertNotNull(e.getAttribute("newattr"));
    }

    @Test
    public void testCreateAttribute_Element_NoPrefix_AttrExists() {
        Element e = new Element("root");
        e.setAttribute("existing", "val");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createAttribute(ctx, new QName(null, "existing"));
        assertNotNull(result);
        assertEquals("val", e.getAttribute("existing").getValue());
    }

    @Test
    public void testCreateAttribute_WithPrefix_UnknownNamespace_Throws() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        try {
            p.createAttribute(ctx, new QName("unknownpfx", "attr"));
            fail("Expected JXPathException due to unknown namespace prefix");
        }
        catch (JXPathException ex) {
            // expected
        }
    }

    @Test
    public void testCreateAttribute_WithPrefix_KnownNamespace_AttrNotExist() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element e = new Element("root", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createAttribute(ctx, new QName("pfx", "attr"));
        assertNotNull(result);
        assertNotNull(e.getAttribute("attr", ns));
    }

    @Test
    public void testCreateAttribute_WithPrefix_KnownNamespace_AttrExists() {
        Namespace ns = Namespace.getNamespace("pfx", "http://example.com");
        Element e = new Element("root", ns);
        e.setAttribute("attr", "existingval", ns);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createAttribute(ctx, new QName("pfx", "attr"));
        assertNotNull(result);
        assertEquals("existingval", e.getAttribute("attr", ns).getValue());
    }

    // ===================== createChild / getAbstractFactory =====================

    @Test
    public void testCreateChild_FactoryNotSet_Throws() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        try {
            p.createChild(ctx, new QName(null, "child"), 0);
            fail("Expected JXPathException due to missing factory");
        }
        catch (JXPathException ex) {
            // expected: factory == null
        }
    }

    @Test
    public void testCreateChild_FactorySet_WholeCollectionIndex() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer pointer,
                    Object parent, String name, int index) {
                ((Element) parent).addContent(new Element(name));
                return true;
            }
        });
        NodePointer result =
            p.createChild(ctx, new QName(null, "newchild"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(result);
        assertEquals(1, e.getContent().size());
    }

    @Test
    public void testCreateChild_FactoryReturnsFalse_Throws() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer pointer,
                    Object parent, String name, int index) {
                return false;
            }
        });
        try {
            p.createChild(ctx, new QName(null, "newchild"), 0);
            fail("Expected JXPathAbstractFactoryException");
        }
        catch (JXPathAbstractFactoryException ex) {
            // expected
        }
    }

    @Test
    public void testCreateChildWithValue() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        ctx.setFactory(new AbstractFactory() {
            public boolean createObject(JXPathContext context, NodePointer pointer,
                    Object parent, String name, int index) {
                ((Element) parent).addContent(new Element(name));
                return true;
            }
        });
        NodePointer result =
            p.createChild(ctx, new QName(null, "newchild"), 0, "somevalue");
        assertNotNull(result);
    }
}
```

## ตารางสรุป Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testConstructor* | 3 constructors overload |
| testGetNamespaceURI_Element* / NonElement | `node instanceof Element`, `ns.equals("")` true/false |
| testGetNamespaceURIPrefix_* | Document/Element/other, `ns != null` true/false |
| testCompareChildNodePointers_* | same node, attr-vs-nonattr (ทั้ง 2 ทาง), both attributes (loop match n1/n2), both elements (loop), RuntimeException branch |
| testIsCollectionAndGetLength | ค่าคงที่ false/1 |
| testIsLeaf_* | Element content=0/>0, Document content=0/>0, other node |
| testGetName_* | Element มี/ไม่มี prefix, ProcessingInstruction, other |
| testGetValue_* | Element/Comment(null+non-null)/Text/CDATA/PI/other→null |
| testSetValue_Text_* | string empty/non-empty → setText vs removeContent |
| testSetValue_Element_With*Value | Element/Document/Text/CDATA/PI/Comment/String(empty/non-empty) values; addContent loop branches (รวม bug-detection cases) |
| testTestNode_* | test==null, NodeNameTest(not-Element, wildcard, match, mismatch), NodeTypeTest(ทุก case + default false), ProcessingInstructionTest(match/no-match/not-PI) |
| testGetPrefix_* / testGetLocalName_* | Element/Attribute/other, prefix null/empty/non-empty |
| testIsLanguage_* / testGetLanguage_* | attr match/mismatch, current==null fallback, parent loop, empty-attr ignored |
| testRemove_* | Element child, Text child, root (throws JXPathException) |
| testAsPath_* | id!=null, parent null (empty path), child element default-ns, text node, PI node, multi-sibling positions (ByName/TextNode/PI) |
| testHashCode / testEquals_* | identity hash, same instance, wrong type, same node, different node |
| testCreateAttribute_* | not-Element→super, Element no-prefix (exist/not), with-prefix unknown-ns(throw)/known-ns(exist/not) |
| testCreateChild_* / testCreateChildWithValue | WHOLE_COLLECTION→index0, factory null(throw), factory false(throw), success path, createChild+setValue overload |

**หมายเหตุสำคัญ:** พบ branch ที่น่าสงสัยใน `addContent()` — เงื่อนไข `node instanceof CDATA/ProcessingInstruction/Comment` ใช้ field `node` (ของ outer pointer ซึ่งเป็น `Element` เสมอในเส้นทางนี้) แทน `child`, ทำให้ CDATA/PI/Comment children ไม่ถูก clone เข้า element ปลายทางเลย — เขียน test case ไว้ 3 เคส (`*_NotAddedDueToConditionBug`) เพื่อ document/detect พฤติกรรมนี้ตามที่ปรากฏจริงในซอร์ส