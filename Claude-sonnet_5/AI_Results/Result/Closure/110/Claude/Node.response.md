# JUnit 4 Test Suite — `NodeTest` (Defects4J Closure-110b)

หมายเหตุสำคัญก่อนโค้ด:
- คลาสทดสอบอยู่ใน package เดียวกับ `Node` (`com.google.javascript.rhino`) เพื่อให้เข้าถึง package-private members (`next`, `NodeMismatch`, `checkTreeEqualsImpl`, `isEquivalentTo(...)` แบบ 4 พารามิเตอร์, `getPropListHeadForTesting`) ได้ตรงตาม source
- บาง behavior ที่ไม่ได้ระบุไว้ชัดเจนในซอร์ส (เช่น `JSType.isEquivalent(null,null)`, `StaticSourceFile#getLineOffset` เนื้อหาไฟล์จริง, `InputId` constructor) จะ**คอมเมนต์กำกับ**และหลีกเลี่ยงการเดา assertion ที่เสี่ยงผิด

```java
package com.google.javascript.rhino;

import static org.junit.Assert.*;

import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;

import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class NodeTest {

  // ================= Constructors =================

  @Test
  public void testConstructorSingle() {
    Node n = new Node(Token.NAME);
    assertEquals(Token.NAME, n.getType());
    assertNull(n.getParent());
    assertEquals(-1, n.getSourcePosition());
  }

  @Test
  public void testConstructorWithLineCharno() {
    Node n = new Node(Token.NAME, 3, 4);
    assertEquals(3, n.getLineno());
    assertEquals(4, n.getCharno());
  }

  @Test
  public void testConstructorOneChild() {
    Node child = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, child);
    assertSame(child, parent.getFirstChild());
    assertSame(child, parent.getLastChild());
    assertSame(parent, child.getParent());
    assertNull(child.getNext());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorOneChildExistingParentThrows() {
    Node child = new Node(Token.NAME);
    new Node(Token.BLOCK, child); // gives child a parent
    new Node(Token.BLOCK, child); // should throw
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorOneChildExistingSiblingThrows() {
    Node child = new Node(Token.NAME);
    Node sibling = new Node(Token.NAME);
    child.next = sibling; // package-private field, same package access
    new Node(Token.BLOCK, child);
  }

  @Test
  public void testConstructorTwoChildren() {
    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, left, right);
    assertSame(left, parent.getFirstChild());
    assertSame(right, parent.getLastChild());
    assertSame(right, left.getNext());
    assertNull(right.getNext());
  }

  @Test
  public void testConstructorThreeChildren() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, left, mid, right);
    assertSame(left, parent.getFirstChild());
    assertSame(right, parent.getLastChild());
    assertSame(mid, left.getNext());
    assertSame(right, mid.getNext());
  }

  @Test
  public void testConstructorFourChildren() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node mid2 = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, left, mid, mid2, right);
    assertSame(left, parent.getFirstChild());
    assertSame(right, parent.getLastChild());
    assertSame(mid, left.getNext());
    assertSame(mid2, mid.getNext());
    assertSame(right, mid2.getNext());
  }

  @Test
  public void testConstructorWithLinenoVariants() {
    Node child = new Node(Token.NAME);
    Node p1 = new Node(Token.BLOCK, child, 1, 2);
    assertEquals(1, p1.getLineno());

    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node p2 = new Node(Token.BLOCK, left, right, 5, 6);
    assertEquals(5, p2.getLineno());

    Node l = new Node(Token.NAME);
    Node m = new Node(Token.NAME);
    Node r = new Node(Token.NAME);
    Node p3 = new Node(Token.BLOCK, l, m, r, 7, 8);
    assertEquals(7, p3.getLineno());

    Node l2 = new Node(Token.NAME);
    Node m2 = new Node(Token.NAME);
    Node m3 = new Node(Token.NAME);
    Node r2 = new Node(Token.NAME);
    Node p4 = new Node(Token.BLOCK, l2, m2, m3, r2, 9, 10);
    assertEquals(9, p4.getLineno());
  }

  @Test
  public void testConstructorNodeArrayEmpty() {
    Node[] children = new Node[0];
    Node parent = new Node(Token.BLOCK, children);
    assertFalse(parent.hasChildren());
  }

  @Test
  public void testConstructorNodeArrayNormal() {
    Node a = new Node(Token.NAME);
    Node b = new Node(Token.NAME);
    Node[] children = new Node[] { a, b };
    Node parent = new Node(Token.BLOCK, children, 1, 1);
    assertSame(a, parent.getFirstChild());
    assertSame(b, parent.getLastChild());
    assertEquals(1, parent.getLineno());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testConstructorNodeArrayDuplicateThrows() {
    Node a = new Node(Token.NAME);
    Node[] children = new Node[] { a, a };
    new Node(Token.BLOCK, children);
  }

  // ================= newNumber / newString =================

  @Test
  public void testNewNumber() {
    Node n = Node.newNumber(3.14);
    assertEquals(Token.NUMBER, n.getType());
    assertEquals(3.14, n.getDouble(), 0.0);
  }

  @Test
  public void testNewNumberWithPos() {
    Node n = Node.newNumber(2.0, 1, 2);
    assertEquals(1, n.getLineno());
    assertEquals(2.0, n.getDouble(), 0.0);
  }

  @Test
  public void testNewStringDefault() {
    Node n = Node.newString("hello");
    assertEquals(Token.STRING, n.getType());
    assertEquals("hello", n.getString());
  }

  @Test
  public void testNewStringWithType() {
    Node n = Node.newString(Token.STRING_KEY, "key");
    assertEquals(Token.STRING_KEY, n.getType());
    assertEquals("key", n.getString());
  }

  @Test
  public void testNewStringWithPos() {
    Node n = Node.newString("s", 1, 2);
    assertEquals(1, n.getLineno());
  }

  @Test
  public void testNewStringWithTypeAndPos() {
    Node n = Node.newString(Token.STRING_KEY, "s", 1, 2);
    assertEquals(Token.STRING_KEY, n.getType());
    assertEquals(1, n.getLineno());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNewStringNullThrows() {
    Node.newString(null);
  }

  // ================= getType/setType =================

  @Test
  public void testGetSetType() {
    Node n = new Node(Token.NAME);
    n.setType(Token.STRING);
    assertEquals(Token.STRING, n.getType());
  }

  // ================= children accessors =================

  @Test
  public void testHasChildrenFalseTrue() {
    Node n = new Node(Token.BLOCK);
    assertFalse(n.hasChildren());
    n.addChildToBack(new Node(Token.NAME));
    assertTrue(n.hasChildren());
  }

  @Test
  public void testGetChildBeforeFirst() {
    Node child1 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, child1);
    assertNull(parent.getChildBefore(child1));
  }

  @Test
  public void testGetChildBeforeLoop() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    assertSame(c1, parent.getChildBefore(c2));
  }

  @Test(expected = RuntimeException.class)
  public void testGetChildBeforeNotChildThrows() {
    Node c1 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1);
    parent.getChildBefore(new Node(Token.NAME));
  }

  @Test
  public void testGetChildAtIndex() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    assertSame(c1, parent.getChildAtIndex(0));
    assertSame(c2, parent.getChildAtIndex(1));
  }

  @Test
  public void testGetIndexOfChildFoundAndNotFound() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    assertEquals(0, parent.getIndexOfChild(c1));
    assertEquals(1, parent.getIndexOfChild(c2));
    assertEquals(-1, parent.getIndexOfChild(new Node(Token.NAME)));
  }

  @Test
  public void testGetLastSibling() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    new Node(Token.BLOCK, c1, c2);
    assertSame(c2, c1.getLastSibling());
    assertSame(c2, c2.getLastSibling());
  }

  // ================= addChildToFront/Back =================

  @Test
  public void testAddChildToFrontEmptyParent() {
    Node parent = new Node(Token.BLOCK);
    Node child = new Node(Token.NAME);
    parent.addChildToFront(child);
    assertSame(child, parent.getFirstChild());
    assertSame(child, parent.getLastChild());
  }

  @Test
  public void testAddChildToFrontNonEmptyParent() {
    Node existing = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, existing);
    Node newChild = new Node(Token.NAME);
    parent.addChildToFront(newChild);
    assertSame(newChild, parent.getFirstChild());
    assertSame(existing, parent.getLastChild());
    assertSame(existing, newChild.getNext());
  }

  @Test
  public void testAddChildToBackEmptyParent() {
    Node parent = new Node(Token.BLOCK);
    Node child = new Node(Token.NAME);
    parent.addChildToBack(child);
    assertSame(child, parent.getFirstChild());
    assertSame(child, parent.getLastChild());
  }

  @Test
  public void testAddChildToBackNonEmptyParent() {
    Node existing = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, existing);
    Node newChild = new Node(Token.NAME);
    parent.addChildToBack(newChild);
    assertSame(newChild, parent.getLastChild());
    assertSame(newChild, existing.getNext());
  }

  // ================= addChildrenToFront/Back =================

  @Test
  public void testAddChildrenToFrontOnEmptyParent() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    c1.next = c2; // manual sibling chain without parent
    parent.addChildrenToFront(c1);
    assertSame(c1, parent.getFirstChild());
    assertSame(c2, parent.getLastChild());
  }

  @Test
  public void testAddChildrenToFrontOnNonEmptyParent() {
    Node existing = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, existing);
    Node newC = new Node(Token.NAME);
    parent.addChildrenToFront(newC);
    assertSame(newC, parent.getFirstChild());
    assertSame(existing, parent.getLastChild());
  }

  @Test
  public void testAddChildrenToBack() {
    Node existing = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, existing);
    Node newC = new Node(Token.NAME);
    parent.addChildrenToBack(newC);
    assertSame(newC, parent.getLastChild());
  }

  // ================= addChildBefore/After, addChildrenAfter =================

  @Test
  public void testAddChildBeforeFirst() {
    Node existing = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, existing);
    Node newC = new Node(Token.NAME);
    parent.addChildBefore(newC, existing);
    assertSame(newC, parent.getFirstChild());
    assertSame(existing, newC.getNext());
  }

  @Test
  public void testAddChildBeforeMiddle() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    Node newC = new Node(Token.NAME);
    parent.addChildBefore(newC, c2);
    assertSame(c1, parent.getFirstChild());
    assertSame(newC, c1.getNext());
    assertSame(c2, newC.getNext());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testAddChildBeforeNodeNotChildThrows() {
    Node parent = new Node(Token.BLOCK);
    parent.addChildBefore(new Node(Token.NAME), new Node(Token.NAME));
  }

  @Test
  public void testAddChildAfter() {
    Node c1 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1);
    Node newC = new Node(Token.NAME);
    parent.addChildAfter(newC, c1);
    assertSame(newC, parent.getLastChild());
  }

  @Test
  public void testAddChildrenAfterNodeNullAppendFront() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildrenAfter(c1, null);
    assertSame(c1, parent.getFirstChild());
    assertSame(c1, parent.getLastChild());
  }

  @Test
  public void testAddChildrenAfterNodeNullWithExistingFirst() {
    Node existing = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, existing);
    Node newC = new Node(Token.NAME);
    parent.addChildrenAfter(newC, null);
    assertSame(newC, parent.getFirstChild());
    assertSame(existing, newC.getNext());
  }

  @Test
  public void testAddChildrenAfterMiddleNode() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    Node newC = new Node(Token.NAME);
    parent.addChildrenAfter(newC, c1);
    assertSame(newC, c1.getNext());
    assertSame(c2, newC.getNext());
  }

  @Test
  public void testAddChildrenAfterLastNodeUpdatesLast() {
    Node c1 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1);
    Node newC = new Node(Token.NAME);
    parent.addChildrenAfter(newC, c1);
    assertSame(newC, parent.getLastChild());
  }

  // ================= removeChild =================

  @Test
  public void testRemoveChildFirst() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    parent.removeChild(c1);
    assertSame(c2, parent.getFirstChild());
    assertNull(c1.getParent());
  }

  @Test
  public void testRemoveChildLast() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    parent.removeChild(c2);
    assertSame(c1, parent.getLastChild());
    assertNull(c1.getNext());
  }

  // ================= replaceChild / replaceChildAfter =================

  @Test
  public void testReplaceChildFirst() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    Node repl = new Node(Token.NAME);
    parent.replaceChild(c1, repl);
    assertSame(repl, parent.getFirstChild());
    assertSame(c2, repl.getNext());
  }

  @Test
  public void testReplaceChildLast() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    Node repl = new Node(Token.NAME);
    parent.replaceChild(c2, repl);
    assertSame(repl, parent.getLastChild());
  }

  @Test
  public void testReplaceChildAfter() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);
    Node repl = new Node(Token.NAME);
    parent.replaceChildAfter(c1, repl);
    assertSame(repl, parent.getLastChild());
    assertSame(repl, c1.getNext());
  }

  // ================= Properties =================

  @Test
  public void testPutGetRemoveProp() {
    Node n = new Node(Token.NAME);
    assertNull(n.getProp(Node.ORIGINALNAME_PROP));
    n.putProp(Node.ORIGINALNAME_PROP, "orig");
    assertEquals("orig", n.getProp(Node.ORIGINALNAME_PROP));
    n.removeProp(Node.ORIGINALNAME_PROP);
    assertNull(n.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testPutPropNullValueRemoves() {
    Node n = new Node(Token.NAME);
    n.putProp(Node.ORIGINALNAME_PROP, "orig");
    n.putProp(Node.ORIGINALNAME_PROP, null);
    assertNull(n.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testRemovePropChainedRecursion() {
    Node n = new Node(Token.NAME);
    n.putProp(Node.ORIGINALNAME_PROP, "a");
    n.putIntProp(Node.QUOTED_PROP, 1);
    n.putIntProp(Node.SLASH_V, 1);
    n.removeProp(Node.QUOTED_PROP); // triggers recursive chain() branch
    assertEquals(0, n.getIntProp(Node.QUOTED_PROP));
    assertEquals("a", n.getProp(Node.ORIGINALNAME_PROP));
    assertEquals(1, n.getIntProp(Node.SLASH_V));
  }

  @Test
  public void testRemovePropNotFoundNoChange() {
    Node n = new Node(Token.NAME);
    n.putProp(Node.ORIGINALNAME_PROP, "a");
    n.removeProp(Node.QUOTED_PROP);
    assertEquals("a", n.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test
  public void testGetBooleanIntProp() {
    Node n = new Node(Token.NAME);
    assertFalse(n.getBooleanProp(Node.QUOTED_PROP));
    n.putBooleanProp(Node.QUOTED_PROP, true);
    assertTrue(n.getBooleanProp(Node.QUOTED_PROP));
    assertEquals(1, n.getIntProp(Node.QUOTED_PROP));
  }

  @Test
  public void testGetExistingIntProp() {
    Node n = new Node(Token.NAME);
    n.putIntProp(Node.QUOTED_PROP, 5);
    assertEquals(5, n.getExistingIntProp(Node.QUOTED_PROP));
  }

  @Test(expected = IllegalStateException.class)
  public void testGetExistingIntPropMissingThrows() {
    new Node(Token.NAME).getExistingIntProp(Node.QUOTED_PROP);
  }

  @Test
  public void testPutIntPropZeroRemoves() {
    Node n = new Node(Token.NAME);
    n.putIntProp(Node.QUOTED_PROP, 5);
    n.putIntProp(Node.QUOTED_PROP, 0);
    assertEquals(0, n.getIntProp(Node.QUOTED_PROP));
  }

  @Test
  public void testClonePropsFrom() {
    Node other = new Node(Token.NAME);
    other.putProp(Node.ORIGINALNAME_PROP, "orig");
    Node n = new Node(Token.NAME);
    n.clonePropsFrom(other);
    assertEquals("orig", n.getProp(Node.ORIGINALNAME_PROP));
  }

  @Test(expected = IllegalStateException.class)
  public void testClonePropsFromExistingPropsThrows() {
    Node n = new Node(Token.NAME);
    n.putProp(Node.ORIGINALNAME_PROP, "x");
    n.clonePropsFrom(new Node(Token.NAME));
  }

  @Test
  public void testGetPropListHeadForTesting() {
    Node n = new Node(Token.NAME);
    assertNull(n.getPropListHeadForTesting());
    n.putProp(Node.ORIGINALNAME_PROP, "x");
    assertNotNull(n.getPropListHeadForTesting());
  }

  // ================= getDouble/setDouble =================

  @Test(expected = IllegalStateException.class)
  public void testGetDoubleOnRawNumberTypeThrows() {
    new Node(Token.NUMBER).getDouble(); // plain Node, not NumberNode
  }

  @Test