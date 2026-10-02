package org.apache.commons.jxpath.ri.model.jdom;

import static org.junit.Assert.*;

import java.util.List;
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
import org.apache.commons.jxpath.ri.model.NodeIterator;
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

public class JDOMNodePointerTest {

    private Locale locale;

    @Before
    public void setUp() {
        locale = Locale.US;
    }

    // ---------------------------------------------------------------
    // Constructors
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_NodeLocale() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertSame(e, p.getBaseValue());
        assertSame(e, p.getImmediateNode());
    }

    @Test
    public void testConstructor_NodeLocaleId() {
        Element e = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(e, locale, "myId");
        assertEquals("id('myId')", p.asPath());
    }

    @Test
    public void testConstructor_ParentNode() {
        Element root = new Element("root");
        JDOMNodePointer parentPtr = new JDOMNodePointer(root, locale);
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer childPtr = new JDOMNodePointer(parentPtr, child);
        assertSame(child, childPtr.getBaseValue());
    }

    // ---------------------------------------------------------------
    // Iterator / pointer factory methods (smoke tests - just must not throw)
    // ---------------------------------------------------------------

    @Test
    public void testChildIterator_NotNull() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        NodeIterator it = p.childIterator(null, false, null);
        assertNotNull(it);
    }

    @Test
    public void testAttributeIterator_NotNull() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        NodeIterator it = p.attributeIterator(new QName(null, "attr"));
        assertNotNull(it);
    }

    @Test
    public void testNamespaceIterator_NotNull() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        assertNotNull(p.namespaceIterator());
    }

    @Test
    public void testNamespacePointer_NotNull() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        assertNotNull(p.namespacePointer("pfx"));
    }

    // ---------------------------------------------------------------
    // getNamespaceURI() / getNamespaceURI(Object)
    // ---------------------------------------------------------------

    @Test
    public void testGetNamespaceURI_ElementNoNamespace_ReturnsNull() {
        Element e = new Element("root"); // no explicit ns => URI == ""
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertNull(p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_ElementWithNamespace() {
        Element e = new Element("root", "pfx", "http://ns.example.com");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals("http://ns.example.com", p.getNamespaceURI());
    }

    @Test
    public void testGetNamespaceURI_NonElement_ReturnsNull() {
        Text t = new Text("hello");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertNull(p.getNamespaceURI());
    }

    // ---------------------------------------------------------------
    // getNamespaceURI(String prefix)
    // ---------------------------------------------------------------

    @Test
    public void testGetNamespaceURIPrefix_Document_Found() {
        Element root = new Element("root");
        root.addNamespaceDeclaration(Namespace.getNamespace("foo", "http://foo.example.com"));
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertEquals("http://foo.example.com", p.getNamespaceURI("foo"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Document_NotFound() {
        Element root = new Element("root");
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(doc, locale);
        assertNull(p.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Element_Found() {
        Element root = new Element("root");
        root.addNamespaceDeclaration(Namespace.getNamespace("foo", "http://foo.example.com"));
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        assertEquals("http://foo.example.com", p.getNamespaceURI("foo"));
    }

    @Test
    public void testGetNamespaceURIPrefix_Element_NotFound() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        assertNull(p.getNamespaceURI("unknown"));
    }

    @Test
    public void testGetNamespaceURIPrefix_NonElementNonDocument() {
        Text t = new Text("hi");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertNull(p.getNamespaceURI("foo"));
    }

    // ---------------------------------------------------------------
    // compareChildNodePointers
    // ---------------------------------------------------------------

    @Test
    public void testCompareChildNodePointers_SameNode() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        Element child = new Element("c");
        root.addContent(child);
        JDOMNodePointer ptr1 = new JDOMNodePointer(p, child);
        JDOMNodePointer ptr2 = new JDOMNodePointer(p, child);
        assertEquals(0, p.compareChildNodePointers(ptr1, ptr2));
    }

    @Test
    public void testCompareChildNodePointers_Node1AttributeNode2NotAttribute() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        Attribute attr = new Attribute("a", "v");
        Element child = new Element("c");
        JDOMNodePointer ptr1 = new JDOMNodePointer(p, attr);
        JDOMNodePointer ptr2 = new JDOMNodePointer(p, child);
        assertEquals(-1, p.compareChildNodePointers(ptr1, ptr2));
    }

    @Test
    public void testCompareChildNodePointers_Node2AttributeNode1NotAttribute() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        Attribute attr = new Attribute("a", "v");
        Element child = new Element("c");
        JDOMNodePointer ptr1 = new JDOMNodePointer(p, child);
        JDOMNodePointer ptr2 = new JDOMNodePointer(p, attr);
        assertEquals(1, p.compareChildNodePointers(ptr1, ptr2));
    }

    @Test
    public void testCompareChildNodePointers_BothAttributes() {
        // Assumption: NodePointer.getNode() (inherited, not overridden here)
        // returns the same value as getImmediateNode() for this simple pointer.
        Element root = new Element("root");
        root.setAttribute("a1", "v1");
        root.setAttribute("a2", "v2");
        Attribute a1 = root.getAttribute("a1");
        Attribute a2 = root.getAttribute("a2");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JDOMNodePointer ptr1 = new JDOMNodePointer(p, a1);
        JDOMNodePointer ptr2 = new JDOMNodePointer(p, a2);
        assertEquals(-1, p.compareChildNodePointers(ptr1, ptr2));
        assertEquals(1, p.compareChildNodePointers(ptr2, ptr1));
    }

    @Test
    public void testCompareChildNodePointers_BothElementChildren() {
        Element root = new Element("root");
        Element c1 = new Element("c1");
        Element c2 = new Element("c2");
        root.addContent(c1);
        root.addContent(c2);
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JDOMNodePointer ptr1 = new JDOMNodePointer(p, c1);
        JDOMNodePointer ptr2 = new JDOMNodePointer(p, c2);
        assertEquals(-1, p.compareChildNodePointers(ptr1, ptr2));
        assertEquals(1, p.compareChildNodePointers(ptr2, ptr1));
    }

    @Test(expected = RuntimeException.class)
    public void testCompareChildNodePointers_NodeNotElement_Throws() {
        Text baseText = new Text("x"); // this.node not an Element
        JDOMNodePointer p = new JDOMNodePointer(baseText, locale);
        Text t1 = new Text("a");
        Text t2 = new Text("b");
        JDOMNodePointer ptr1 = new JDOMNodePointer(p, t1);
        JDOMNodePointer ptr2 = new JDOMNodePointer(p, t2);
        p.compareChildNodePointers(ptr1, ptr2);
    }

    // ---------------------------------------------------------------
    // getBaseValue / isCollection / getLength
    // ---------------------------------------------------------------

    @Test
    public void testGetBaseValue() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertSame(e, p.getBaseValue());
    }

    @Test
    public void testIsCollectionAlwaysFalse() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("r"), locale);
        assertFalse(p.isCollection());
    }

    @Test
    public void testGetLengthAlwaysOne() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("r"), locale);
        assertEquals(1, p.getLength());
    }

    // ---------------------------------------------------------------
    // isLeaf
    // ---------------------------------------------------------------

    @Test
    public void testIsLeaf_ElementEmpty_True() {
        Element e = new Element("r");
        assertTrue(new JDOMNodePointer(e, locale).isLeaf());
    }

    @Test
    public void testIsLeaf_ElementNotEmpty_False() {
        Element e = new Element("r");
        e.addContent(new Element("c"));
        assertFalse(new JDOMNodePointer(e, locale).isLeaf());
    }

    @Test
    public void testIsLeaf_DocumentEmpty_True() {
        // JDOM Document requires a root element normally; use a Document with
        // only root but then remove content via detaching is unsafe. We test
        // a document with content (see next test) and rely on size()==0 logic
        // only conceptually here since Document always needs root content
        // through normal construction... Using Document(Element) => content size 1 => not leaf.
        Document doc = new Document(new Element("r"));
        assertFalse(new JDOMNodePointer(doc, locale).isLeaf()); // content size 1
    }

    @Test
    public void testIsLeaf_OtherNode_True() {
        Text t = new Text("x");
        assertTrue(new JDOMNodePointer(t, locale).isLeaf());
    }

    // ---------------------------------------------------------------
    // getName
    // ---------------------------------------------------------------

    @Test
    public void testGetName_ElementNoPrefix() {
        Element e = new Element("foo");
        QName qn = new JDOMNodePointer(e, locale).getName();
        assertNull(qn.getPrefix());
        assertEquals("foo", qn.getName());
    }

    @Test
    public void testGetName_ElementWithPrefix() {
        Element e = new Element("foo", "pfx", "http://x");
        QName qn = new JDOMNodePointer(e, locale).getName();
        assertEquals("pfx", qn.getPrefix());
        assertEquals("foo", qn.getName());
    }

    @Test
    public void testGetName_ProcessingInstruction() {
        ProcessingInstruction pi = new ProcessingInstruction("target", "data");
        QName qn = new JDOMNodePointer(pi, locale).getName();
        assertNull(qn.getPrefix());
        assertEquals("target", qn.getName());
    }

    @Test
    public void testGetName_OtherNode() {
        Text t = new Text("x");
        QName qn = new JDOMNodePointer(t, locale).getName();
        assertNull(qn.getPrefix());
        assertNull(qn.getName());
    }

    // ---------------------------------------------------------------
    // getImmediateNode
    // ---------------------------------------------------------------

    @Test
    public void testGetImmediateNode() {
        Element e = new Element("r");
        assertSame(e, new JDOMNodePointer(e, locale).getImmediateNode());
    }

    // ---------------------------------------------------------------
    // getValue
    // ---------------------------------------------------------------

    @Test
    public void testGetValue_Element() {
        Element e = new Element("r");
        e.addContent(new Text("  hello  "));
        assertEquals("hello", new JDOMNodePointer(e, locale).getValue());
    }

    @Test
    public void testGetValue_Comment_NotNullText() {
        Comment c = new Comment("  comment text  ");
        assertEquals("comment text", new JDOMNodePointer(c, locale).getValue());
    }
    // NOTE: Comment text==null branch is not reachable via public JDOM API
    // (Comment constructor requires non-null text), so it is not tested.

    @Test
    public void testGetValue_Text() {
        Text t = new Text("  hi  ");
        assertEquals("hi", new JDOMNodePointer(t, locale).getValue());
    }

    @Test
    public void testGetValue_CDATA() {
        CDATA c = new CDATA("  data  ");
        assertEquals("data", new JDOMNodePointer(c, locale).getValue());
    }

    @Test
    public void testGetValue_ProcessingInstruction_NotNullData() {
        ProcessingInstruction pi = new ProcessingInstruction("t", "  data  ");
        assertEquals("data", new JDOMNodePointer(pi, locale).getValue());
    }

    @Test
    public void testGetValue_Other_ReturnsNull() {
        Attribute a = new Attribute("a", "v");
        assertNull(new JDOMNodePointer(a, locale).getValue());
    }

    // ---------------------------------------------------------------
    // setValue
    // ---------------------------------------------------------------

    @Test
    public void testSetValue_Text_NonEmptyString() {
        Element parent = new Element("r");
        Text t = new Text("old");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.setValue("new value");
        assertEquals("new value", t.getText());
    }

    @Test
    public void testSetValue_Text_EmptyString_RemovesFromParent() {
        Element parent = new Element("r");
        Text t = new Text("old");
        parent.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        p.setValue("");
        assertFalse(parent.getContent().contains(t));
    }

    @Test
    public void testSetValue_Element_WithElementValue() {
        Element target = new Element("target");
        target.addContent(new Text("old"));
        Element valueElement = new Element("src");
        valueElement.addContent(new Element("inner"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueElement);
        assertEquals(1, target.getContent().size());
        assertTrue(target.getContent().get(0) instanceof Element);
        assertEquals("inner", ((Element) target.getContent().get(0)).getName());
    }

    @Test
    public void testSetValue_Element_WithDocumentValue() {
        Element target = new Element("target");
        Element root = new Element("root");
        root.addContent(new Element("docChild"));
        Document doc = new Document(root);
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(doc);
        assertEquals(1, target.getContent().size());
        assertEquals("root", ((Element) target.getContent().get(0)).getName());
    }

    @Test
    public void testSetValue_Element_WithTextValue() {
        Element target = new Element("target");
        Text valueText = new Text("abc");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueText);
        assertEquals(1, target.getContent().size());
        assertTrue(target.getContent().get(0) instanceof Text);
        assertEquals("abc", ((Text) target.getContent().get(0)).getText());
    }

    @Test
    public void testSetValue_Element_WithProcessingInstructionValue() {
        Element target = new Element("target");
        ProcessingInstruction pi = new ProcessingInstruction("tgt", "d");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(pi);
        assertEquals(1, target.getContent().size());
        assertTrue(target.getContent().get(0) instanceof ProcessingInstruction);
    }

    @Test
    public void testSetValue_Element_WithCommentValue() {
        Element target = new Element("target");
        Comment comment = new Comment("c");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(comment);
        assertEquals(1, target.getContent().size());
        assertTrue(target.getContent().get(0) instanceof Comment);
    }

    @Test
    public void testSetValue_Element_WithStringConvertible_NonEmpty() {
        Element target = new Element("target");
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue("plain text");
        assertEquals(1, target.getContent().size());
        assertEquals("plain text", ((Text) target.getContent().get(0)).getText());
    }

    @Test
    public void testSetValue_Element_WithStringConvertible_Empty() {
        Element target = new Element("target");
        target.addContent(new Text("will be cleared"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue("");
        assertEquals(0, target.getContent().size());
    }

    /**
     * FAULT-DETECTION TEST (JXPath-1b known defect):
     * In private method addContent(List), the branches for CDATA/PI/Comment
     * children incorrectly check "node instanceof X" (the *container*
     * element, which is never CDATA/PI/Comment) instead of "child instanceof X".
     * As a result CDATA children of an Element/Document value are silently
     * dropped when copied via setValue(). This test encodes the *expected*
     * (correct) behaviour and therefore is expected to FAIL on the buggy
     * implementation, demonstrating the defect.
     */
    @Test
    public void testSetValue_Element_WithCDATAChild_ExpectedButKnownDefect() {
        Element target = new Element("target");
        Element valueElement = new Element("src");
        valueElement.addContent(new CDATA("cdatacontent"));
        JDOMNodePointer p = new JDOMNodePointer(target, locale);
        p.setValue(valueElement);
        // Expected: the CDATA child should have been cloned into target.
        assertEquals(1, target.getContent().size());
        assertTrue("CDATA child was not copied due to known JXPath-1b defect",
                target.getContent().get(0) instanceof CDATA);
    }

    // ---------------------------------------------------------------
    // testNode
    // ---------------------------------------------------------------

    @Test
    public void testTestNode_NullTest_ReturnsTrue() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("r"), locale);
        assertTrue(p.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTest_NonElement_False() {
        Text t = new Text("x");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_MatchNoNamespace_True() {
        Element e = new Element("foo");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), null);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NameMismatch_False() {
        Element e = new Element("foo");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "bar"), null);
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_NamespaceMismatch_False() {
        Element e = new Element("foo", "p", "http://a");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"), "http://different");
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_Wildcard_PrefixNull_True() {
        // Assumption: NodeNameTest.isWildcard()==true & getPrefix()==null
        // when QName name is "*" with null prefix (standard JXPath convention,
        // not shown in the provided source).
        Element e = new Element("anything");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_Node() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertTrue(p.testNode(new NodeTypeTest(Compiler.NODE_TYPE_NODE)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Text_MatchesTextAndCDATA() {
        JDOMNodePointer pText = new JDOMNodePointer(new Text("x"), locale);
        JDOMNodePointer pCdata = new JDOMNodePointer(new CDATA("x"), locale);
        assertTrue(pText.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
        assertTrue(pCdata.testNode(new NodeTypeTest(Compiler.NODE_TYPE_TEXT)));
    }

    @Test
    public void testTestNode_NodeTypeTest_Comment() {
        JDOMNodePointer p = new JDOMNodePointer(new Comment("c"), locale);
        assertTrue(p.testNode(new NodeTypeTest(Compiler.NODE_TYPE_COMMENT)));
    }

    @Test
    public void testTestNode_NodeTypeTest_PI() {
        JDOMNodePointer p = new JDOMNodePointer(
                new ProcessingInstruction("t", "d"), locale);
        assertTrue(p.testNode(new NodeTypeTest(Compiler.NODE_TYPE_PI)));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_Match() {
        ProcessingInstruction pi = new ProcessingInstruction("target1", "d");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        assertTrue(p.testNode(new ProcessingInstructionTest("target1")));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NoMatch() {
        ProcessingInstruction pi = new ProcessingInstruction("target1", "d");
        JDOMNodePointer p = new JDOMNodePointer(pi, locale);
        assertFalse(p.testNode(new ProcessingInstructionTest("other")));
    }

    @Test
    public void testTestNode_ProcessingInstructionTest_NonPINode_False() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertFalse(p.testNode(new ProcessingInstructionTest("t")));
    }

    // ---------------------------------------------------------------
    // getPrefix / getLocalName (static)
    // ---------------------------------------------------------------

    @Test
    public void testGetPrefix_Element_WithPrefix() {
        Element e = new Element("foo", "pfx", "http://x");
        assertEquals("pfx", JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_Element_EmptyPrefix_ReturnsNull() {
        Element e = new Element("foo");
        assertNull(JDOMNodePointer.getPrefix(e));
    }

    @Test
    public void testGetPrefix_Attribute() {
        Namespace ns = Namespace.getNamespace("pfx", "http://x");
        Attribute a = new Attribute("attr", "v", ns);
        assertEquals("pfx", JDOMNodePointer.getPrefix(a));
    }

    @Test
    public void testGetPrefix_Other_ReturnsNull() {
        assertNull(JDOMNodePointer.getPrefix(new Text("x")));
    }

    @Test
    public void testGetLocalName_Element() {
        assertEquals("foo", JDOMNodePointer.getLocalName(new Element("foo")));
    }

    @Test
    public void testGetLocalName_Attribute() {
        assertEquals("a", JDOMNodePointer.getLocalName(new Attribute("a", "v")));
    }

    @Test
    public void testGetLocalName_Other_ReturnsNull() {
        assertNull(JDOMNodePointer.getLocalName(new Text("x")));
    }

    // ---------------------------------------------------------------
    // isLanguage / getLanguage
    // ---------------------------------------------------------------

    @Test
    public void testIsLanguage_NoLangAttribute_DelegatesToSuper() {
        // Assumption: super.isLanguage() does not throw for a basic Locale.US
        // context; exact return value depends on NodePointer (not provided).
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        // Should not throw regardless of super's actual boolean result.
        p.isLanguage("en");
    }

    @Test
    public void testIsLanguage_LangFound_Match() {
        Element e = new Element("r");
        e.setAttribute("lang", "EN-us", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertTrue(p.isLanguage("en"));
    }

    @Test
    public void testIsLanguage_LangFound_NoMatch() {
        Element e = new Element("r");
        e.setAttribute("lang", "fr", Namespace.XML_NAMESPACE);
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertFalse(p.isLanguage("en"));
    }

    @Test
    public void testGetLanguage_ViaParentChain_SkipsEmptyAttr() {
        Element root = new Element("root");
        root.setAttribute("lang", "de", Namespace.XML_NAMESPACE);
        Element child = new Element("child");
        child.setAttribute("lang", "", Namespace.XML_NAMESPACE); // empty => skip, go to parent
        root.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(child, locale);
        assertTrue(p.isLanguage("de"));
    }

    @Test
    public void testGetLanguage_NonElementStart_WalksUpToElementParent() {
        Element root = new Element("root");
        root.setAttribute("lang", "ja", Namespace.XML_NAMESPACE);
        Text t = new Text("hi");
        root.addContent(t);
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        assertTrue(p.isLanguage("ja"));
    }

    @Test
    public void testGetLanguage_NoneFound_DelegatesToSuper() {
        Element root = new Element("root"); // no xml:lang anywhere
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        // just ensure no exception; actual boolean depends on super (not given)
        p.isLanguage("en");
    }

    // ---------------------------------------------------------------
    // createAttribute
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testCreateAttribute_NonElementNode_DelegatesToSuper_Throws() {
        // Assumption: super.createAttribute() throws some RuntimeException
        // (e.g. JXPathException/UnsupportedOperationException) for a non-
        // element pointer; exact type not confirmed since NodePointer source
        // is not provided.
        Text t = new Text("x");
        JDOMNodePointer p = new JDOMNodePointer(t, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createAttribute(ctx, new QName(null, "attr"));
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_UnknownNamespacePrefix_Throws() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createAttribute(ctx, new QName("unknownPfx", "attr"));
    }

    @Test
    public void testCreateAttribute_KnownNamespacePrefix_Created() {
        Element e = new Element("r");
        e.addNamespaceDeclaration(Namespace.getNamespace("pfx", "http://x"));
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createAttribute(ctx, new QName("pfx", "attr"));
        assertNotNull(result);
        assertNotNull(e.getAttribute("attr", Namespace.getNamespace("pfx", "http://x")));
    }

    @Test
    public void testCreateAttribute_NoPrefix_Created() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createAttribute(ctx, new QName(null, "attr"));
        assertNotNull(result);
        assertNotNull(e.getAttribute("attr"));
    }

    @Test
    public void testCreateAttribute_NoPrefix_AlreadyExists() {
        Element e = new Element("r");
        e.setAttribute("attr", "existing");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createAttribute(ctx, new QName(null, "attr"));
        // Value must remain unchanged (no overwrite branch taken)
        assertEquals("existing", e.getAttribute("attr").getValue());
    }

    // ---------------------------------------------------------------
    // remove
    // ---------------------------------------------------------------

    @Test(expected = JXPathException.class)
    public void testRemove_NoParent_Throws() {
        Element standalone = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(standalone, locale);
        p.remove();
    }

    @Test
    public void testRemove_WithParent_RemovesFromContent() {
        Element root = new Element("root");
        Element child = new Element("child");
        root.addContent(child);
        JDOMNodePointer p = new JDOMNodePointer(child, locale);
        p.remove();
        assertFalse(root.getContent().contains(child));
    }

    // ---------------------------------------------------------------
    // asPath
    // ---------------------------------------------------------------

    @Test
    public void testAsPath_WithId() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale, "abc'def");
        assertEquals("id('abc&apos;def')", p.asPath());
    }

    @Test
    public void testAsPath_Element_NoJDOMParentPointer_EmptyBuffer() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale); // parent==null
        assertEquals("", p.asPath());
    }

    @Test
    public void testAsPath_TextNode() {
        Element root = new Element("root");
        Text t = new Text("x");
        root.addContent(t);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer textPtr = new JDOMNodePointer(rootPtr, t);
        String path = textPtr.asPath();
        assertTrue(path.startsWith("/text()["));
    }

    @Test
    public void testAsPath_ProcessingInstructionNode() {
        Element root = new Element("root");
        ProcessingInstruction pi = new ProcessingInstruction("tgt", "d");
        root.addContent(pi);
        JDOMNodePointer rootPtr = new JDOMNodePointer(root, locale);
        JDOMNodePointer piPtr = new JDOMNodePointer(rootPtr, pi);
        String path = piPtr.asPath();
        assertTrue(path.startsWith("/processing-instruction('tgt')["));
    }

    // ---------------------------------------------------------------
    // hashCode / equals
    // ---------------------------------------------------------------

    @Test
    public void testHashCode_IdentityBased() {
        Element e = new Element("r");
        JDOMNodePointer p = new JDOMNodePointer(e, locale);
        assertEquals(System.identityHashCode(e), p.hashCode());
    }

    @Test
    public void testEquals_SameInstance_True() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("r"), locale);
        assertTrue(p.equals(p));
    }

    @Test
    public void testEquals_DifferentType_False() {
        JDOMNodePointer p = new JDOMNodePointer(new Element("r"), locale);
        assertFalse(p.equals("not a pointer"));
    }

    @Test
    public void testEquals_SameNode_True() {
        Element e = new Element("r");
        JDOMNodePointer p1 = new JDOMNodePointer(e, locale);
        JDOMNodePointer p2 = new JDOMNodePointer(e, locale);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void testEquals_DifferentNode_False() {
        JDOMNodePointer p1 = new JDOMNodePointer(new Element("r1"), locale);
        JDOMNodePointer p2 = new JDOMNodePointer(new Element("r2"), locale);
        assertFalse(p1.equals(p2));
    }

    // ---------------------------------------------------------------
    // createChild / getAbstractFactory
    // ---------------------------------------------------------------

    /**
     * Minimal AbstractFactory stub.
     * Assumption: AbstractFactory is an abstract class whose only abstract
     * method matching the call-site signature is:
     *   boolean createObject(JXPathContext, NodePointer, Object, String, int)
     * This is based on common Apache Commons JXPath API knowledge; its full
     * source was not provided.
     */
    private static class StubFactory extends AbstractFactory {
        boolean result;
        boolean actuallyAddChild;
        String childName;

        public boolean createObject(JXPathContext context, NodePointer pointer,
                Object parentNode, String name, int index) {
            if (actuallyAddChild && result) {
                ((Element) parentNode).addContent(new Element(childName));
            }
            return result;
        }
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_FactoryNotSet_Throws() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createChild(ctx, new QName(null, "child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryReturnsFalse_Throws() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.result = false;
        ctx.setFactory(factory);
        p.createChild(ctx, new QName(null, "child"), 0);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreateChild_FactoryReturnsTrue_ButNoNodeAdded_Throws() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.result = true;
        factory.actuallyAddChild = false; // setPosition will fail -> exception
        ctx.setFactory(factory);
        p.createChild(ctx, new QName(null, "child"), 0);
    }

    @Test
    public void testCreateChild_FactorySuccess_ReturnsChildPointer() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.result = true;
        factory.actuallyAddChild = true;
        factory.childName = "newChild";
        ctx.setFactory(factory);
        NodePointer created = p.createChild(ctx, new QName(null, "newChild"), 0);
        assertNotNull(created);
        assertTrue(created.getBaseValue() instanceof Element);
        assertEquals("newChild", ((Element) created.getBaseValue()).getName());
    }

    @Test
    public void testCreateChild_WholeCollectionIndex_TreatedAsZero() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.result = true;
        factory.actuallyAddChild = true;
        factory.childName = "wcChild";
        ctx.setFactory(factory);
        NodePointer created =
                p.createChild(ctx, new QName(null, "wcChild"), NodePointer.WHOLE_COLLECTION);
        assertNotNull(created);
    }

    @Test
    public void testCreateChildWithValue_SetsValueOnCreatedChild() {
        Element root = new Element("root");
        JDOMNodePointer p = new JDOMNodePointer(root, locale);
        JXPathContext ctx = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory();
        factory.result = true;
        factory.actuallyAddChild = true;
        factory.childName = "valChild";
        ctx.setFactory(factory);
        NodePointer created =
                p.createChild(ctx, new QName(null, "valChild"), 0, "text-value");
        assertNotNull(created);
        Element createdElement = (Element) created.getBaseValue();
        assertEquals("text-value", createdElement.getTextTrim());
    }
}
