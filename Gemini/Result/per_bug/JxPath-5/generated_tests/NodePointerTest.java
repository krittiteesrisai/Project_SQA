package org.apache.commons.jxpath.ri.model;

import java.util.Locale;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;

import junit.framework.TestCase;

public class NodePointerTest extends TestCase {

    public void testNewNodePointerNullBean() {
        QName qName = new QName("test");
        Locale locale = Locale.US;
        NodePointer pointer = NodePointer.newNodePointer(qName, null, locale);
        assertNotNull(pointer);
        assertTrue(pointer instanceof NullPointer);
        assertEquals(locale, pointer.getLocale());
    }

    public void testNewNodePointerUnsupportedBean() {
        QName qName = new QName("test");
        try {
            NodePointer.newNodePointer(qName, new Object(), Locale.US);
            fail("Expected JXPathException for unsupported bean type");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Could not allocate a NodePointer"));
        }
    }

    public void testNewChildNodePointerUnsupportedBean() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US);
        QName qName = new QName("child");
        try {
            NodePointer.newChildNodePointer(parent, qName, new Object());
            fail("Expected JXPathException for unsupported child bean type");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Could not allocate a NodePointer"));
        }
    }

    public void testNamespaceResolverInheritance() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.US);
        NodePointer child = new NullPointer(parent, new QName("child"));
        
        assertNull(child.getNamespaceResolver());
        // Parent is NullPointer, so namespaceResolver might be null, but we test the branch logic
        // when parent has a resolver.
        org.apache.commons.jxpath.ri.NamespaceResolver resolver = new org.apache.commons.jxpath.ri.NamespaceResolver();
        parent.setNamespaceResolver(resolver);
        assertEquals(resolver, child.getNamespaceResolver());
    }

    public void testLocaleInheritance() {
        NodePointer parent = new NullPointer(new QName("parent"), Locale.CANADA);
        NodePointer child = new NullPointer(parent, new QName("child"));
        
        // child locale is null initially, should inherit from parent
        assertEquals(Locale.CANADA, child.getLocale());
    }

    public void testIsActualAndCollectionEdges() {
        BeanPointer parent = new BeanPointer(new QName("bean"), new Object(), Locale.US);
        TestNodePointer pointer = new TestNodePointer(parent, new QName("test"));
        
        // WHOLE_COLLECTION
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertTrue(pointer.isActual());

        // Valid index within length
        pointer.setIndex(0);
        assertTrue(pointer.isActual());

        // Invalid index >= length
        pointer.setIndex(5);
        assertFalse(pointer.isActual());

        // Invalid index < 0 (and not WHOLE_COLLECTION)
        pointer.setIndex(-2);
        assertFalse(pointer.isActual());
    }

    public void testTestNodeNullAndTypes() {
        TestNodePointer pointer = new TestNodePointer(null, new QName("test"));
        
        // null test
        assertTrue(pointer.testNode(null));

        // NodeTypeTest matching NODE
        NodeTypeTest nodeTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(pointer.testNode(nodeTypeTest));

        // NodeTypeTest not matching
        NodeTypeTest commentTypeTest = new NodeTypeTest(Compiler.NODE_TYPE_COMMENT);
        assertFalse(pointer.testNode(commentTypeTest));
    }

    public void testTestNodeNameTest() {
        TestNodePointer pointer = new TestNodePointer(null, new QName("ns", "localName"));

        // Matching wildcard
        NodeNameTest wildcardTest = new NodeNameTest(new QName(null, "*"));
        assertTrue(pointer.testNode(wildcardTest));

        // Matching exact name
        NodeNameTest exactTest = new NodeNameTest(new QName("ns", "localName"));
        assertTrue(pointer.testNode(exactTest));

        // Non-matching name
        NodeNameTest diffNameTest = new NodeNameTest(new QName("ns", "otherName"));
        assertFalse(pointer.testNode(diffNameTest));

        // Null node name
        TestNodePointer nullNamePointer = new TestNodePointer(null, null);
        NodeNameTest anyTest = new NodeNameTest(new QName("local"));
        assertFalse(nullNamePointer.testNode(anyTest));
    }

    public void testAsPathVariations() {
        TestNodePointer pointer = new TestNodePointer(null, new QName("myNode"));
        assertEquals("/myNode", pointer.asPath());

        pointer.setAttribute(true);
        assertEquals("/@myNode", pointer.asPath());

        pointer.setIndex(0);
        assertEquals("/@myNode[1]", pointer.asPath());
    }

    public void testCompareToDifferentTrees() {
        TestNodePointer p1 = new TestNodePointer(null, new QName("p1"));
        TestNodePointer p2 = new TestNodePointer(null, new QName("p2"));

        try {
            p1.compareTo(p2);
            fail("Expected JXPathException when comparing pointers from different trees at root level");
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("Cannot compare pointers that do not belong to the same tree"));
        }
    }

    public void testClonePointer() {
        TestNodePointer pointer = new TestNodePointer(null, new QName("cloneTest"));
        Object cloned = pointer.clone();
        assertNotNull(cloned);
        assertTrue(cloned instanceof TestNodePointer);
    }

    public void testCreatePathAndExceptions() {
        TestNodePointer pointer = new TestNodePointer(null, new QName("test"));
        JXPathContext context = JXPathContext.newContext(new Object());

        assertEquals(pointer, pointer.createPath(context));
        assertEquals(pointer, pointer.createPath(context, "value"));

        try {
            pointer.createChild(context, new QName("child"), 0);
            fail();
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("operation is not allowed"));
        }

        try {
            pointer.createChild(context, new QName("child"), 0, "val");
            fail();
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("operation is not allowed"));
        }

        try {
            pointer.createAttribute(context, new QName("attr"));
            fail();
        } catch (JXPathException e) {
            assertTrue(e.getMessage().contains("operation is not allowed"));
        }
    }

    public void testLanguageAndValueDefaults() {
        TestNodePointer pointer = new TestNodePointer(null, new QName("langTest")) {
            @Override
            public Object getNode() {
                return "resolvedValue";
            }
        };
        pointer.locale = Locale.forLanguageTag("en-US");
        assertTrue(pointer.isLanguage("en"));
        assertFalse(pointer.isLanguage("fr"));
        assertEquals("resolvedValue", pointer.getValue());
    }

    // Helper concrete subclass to test abstract methods of NodePointer
    private static class TestNodePointer extends NodePointer {
        private QName name;
        private Object value = "testValue";

        protected TestNodePointer(NodePointer parent, QName name) {
            super(parent);
            this.name = name;
        }

        @Override
        public QName getName() {
            return name;
        }

        @Override
        public Object getBaseValue() {
            return value;
        }

        @Override
        public Object getImmediateNode() {
            return value;
        }

        @Override
        public boolean isCollection() {
            return true;
        }

        @Override
        public int getLength() {
            return 2;
        }

        @Override
        public boolean isLeaf() {
            return true;
        }

        @Override
        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) {
            return 0;
        }
    }
}