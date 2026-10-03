package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeTest {

    // --- 1. Line and Character Number Encoding / Decoding Tests ---

    @Test
    public void testMergeLineCharNo_Negative() {
        assertEquals(-1, Node.mergeLineCharNo(-1, 5));
        assertEquals(-1, Node.mergeLineCharNo(5, -1));
        assertEquals(-1, Node.extractLineno(-1));
        assertEquals(-1, Node.extractCharno(-1));
    }

    @Test
    public void testMergeLineCharNo_ExceedColumnMask() {
        int largeCharno = Node.MAX_COLUMN_NUMBER + 10;
        int encoded = Node.mergeLineCharNo(10, largeCharno);
        // Should cap charno to COLUMN_MASK and shift lineno
        assertEquals(10, Node.extractLineno(encoded));
        assertEquals(Node.MAX_COLUMN_NUMBER, Node.extractCharno(encoded));
    }

    @Test
    public void testMergeLineCharNo_Normal() {
        int encoded = Node.mergeLineCharNo(5, 100);
        assertEquals(5, Node.extractLineno(encoded));
        assertEquals(100, Node.extractCharno(encoded));
    }

    // --- 2. Qualified Name Tests ---

    @Test
    public void testGetQualifiedName_NameNode() {
        Node nameNode = Node.newString(Token.NAME, "myVar");
        assertEquals("myVar", nameNode.getQualifiedName());

        Node emptyName = Node.newString(Token.NAME, "");
        assertNull(emptyName.getQualifiedName());
    }

    @Test
    public void testGetQualifiedName_GetPropAndThis() {
        Node left = Node.newString(Token.NAME, "a");
        Node right = Node.newString(Token.STRING_KEY, "b");
        Node getProp = new Node(Token.GETPROP, left, right);
        assertEquals("a.b", getProp.getQualifiedName());

        Node thisNode = new Node(Token.THIS);
        assertEquals("this", thisNode.getQualifiedName());

        Node invalidNode = Node.newNumber(123);
        assertNull(invalidNode.getQualifiedName());
    }

    @Test
    public void testIsQualifiedName_EdgeCases() {
        assertTrue(new Node(Token.THIS).isQualifiedName());
        assertTrue(Node.newString(Token.NAME, "foo").isQualifiedName());
        assertFalse(Node.newString(Token.NAME, "").isQualifiedName());
        assertFalse(Node.newNumber(42).isQualifiedName());

        Node left = Node.newString(Token.NAME, "a");
        Node right = Node.newString(Token.STRING_KEY, "b");
        Node getProp = new Node(Token.GETPROP, left, right);
        assertTrue(getProp.isQualifiedName());
    }

    @Test
    public void testIsUnscopedQualifiedName() {
        assertTrue(Node.newString(Token.NAME, "foo").isUnscopedQualifiedName());
        assertFalse(new Node(Token.THIS).isUnscopedQualifiedName());
    }

    // --- 3. Equivalence Tests ---

    @Test
    public void testIsEquivalentTo_BasicBranches() {
        Node n1 = Node.newNumber(10.0);
        Node n2 = Node.newNumber(10.0);
        Node n3 = Node.newNumber(20.0);

        assertTrue(n1.isEquivalentTo(n2));
        assertFalse(n1.isEquivalentTo(n3));
        assertFalse(n1.isEquivalentTo(Node.newString("10"))); // Different class/type
    }

    @Test
    public void testIsEquivalentTo_IncDecAndCall() {
        Node inc1 = new Node(Token.INC);
        inc1.putIntProp(Node.INCRDECR_PROP, Node.DECR_FLAG);
        Node inc2 = new Node(Token.INC);
        inc2.putIntProp(Node.INCRDECR_PROP, Node.POST_FLAG);

        assertFalse(inc1.isEquivalentTo(inc2));

        Node call1 = new Node(Token.CALL);
        call1.putBooleanProp(Node.FREE_CALL, true);
        Node call2 = new Node(Token.CALL);
        call2.putBooleanProp(Node.FREE_CALL, false);

        assertFalse(call1.isEquivalentTo(call2));
    }

    // --- 4. Node Mutation & Tree Manipulation Tests ---

    @Test(expected = IllegalArgumentException.class)
    public void testAddChildBefore_NullNodeOrInvalidParent() {
        Node parent = new Node(Token.BLOCK);
        Node child = Node.newNumber(1);
        parent.addChildBefore(child, null); // Should trigger Preconditions
    }

    @Test
    public void testRemoveChildAndReplace() {
        Node child1 = Node.newNumber(1);
        Node child2 = Node.newNumber(2);
        Node parent = new Node(Token.BLOCK, child1, child2);

        parent.removeChild(child1);
        assertNull(parent.getChildBefore(child2));

        Node newChild = Node.newNumber(3);
        parent.replaceChild(child2, newChild);
        assertEquals(newChild, parent.getLastChild());
    }

    @Test
    public void testNumberNodeOperations() {
        Node numNode = Node.newNumber(5.5);
        assertEquals(5.5, numNode.getDouble(), 0.001);
        numNode.setDouble(6.6);
        assertEquals(6.6, numNode.getDouble(), 0.001);
    }

    @Test
    public void testStringNodeOperations() {
        Node strNode = Node.newString("test");
        assertEquals("test", strNode.getString());
        strNode.setString("newTest");
        assertEquals("newTest", strNode.getString());
        
        strNode.setQuotedString();
        assertTrue(strNode.isQuotedString());
    }
}