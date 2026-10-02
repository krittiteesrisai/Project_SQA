# วิเคราะห์และออกแบบ Test Suite

เนื่องจาก `NodePointer` เป็น abstract class ผมจึงต้องสร้าง concrete subclass (`TNP`) เพื่อใช้ทดสอบ instance methods และควบคุมค่าต่าง ๆ (isContainer, isCollection, getLength, getImmediateValuePointer, getNamespaceURI ฯลฯ) เพื่อบังคับให้ branch ต่าง ๆ ถูก execute

**ข้อสังเกต/ข้อจำกัดที่ต้องกำกับด้วยคอมเมนต์:**
- `getPointerByID`/`getPointerByKey` เป็นแค่ delegation ไปยัง `JXPathContext` ซึ่งพฤติกรรมจริงขึ้นกับ implementation ที่ไม่ได้ให้มาในซอร์ส → ข้ามการ assert ผลลัพธ์เฉพาะเจาะจง
- Branch exception ของ `newNodePointer`/`newChildNodePointer` (ไม่มี factory รองรับ) พึ่งพา global state ของ `JXPathContextReferenceImpl` ที่ไม่ได้ให้มา → ข้ามเพื่อไม่เดา behavior
- Micro-branch "buffer ลงท้ายด้วย '/' อยู่แล้ว" ใน `asPath()` ไม่สามารถ trigger ได้ง่ายด้วย QName ปกติ → ข้ามพร้อมคอมเมนต์

```java
package org.apache.commons.jxpath.ri.model;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.junit.Test;

/**
 * Unit tests for {@link NodePointer}.
 * ใช้ concrete subclass TNP (Test Node Pointer) เพื่อเข้าถึง/ควบคุม
 * พฤติกรรมของ abstract methods และ hook points ต่าง ๆ
 */
public class NodePointerTest {

    /** Concrete implementation ของ NodePointer สำหรับทดสอบ */
    private static class TNP extends NodePointer {
        Object node;
        QName name;
        boolean leaf;
        boolean container;
        boolean collection;
        int length = 1;
        NodePointer immediateValuePointer; // null => คืน this เอง (ค่า default)
        Map<String, String> nsMap = new HashMap<String, String>();
        String defaultNsURI;
        int compareResult = 0;

        TNP(NodePointer parent, QName name, Object node) {
            super(parent);
            this.name = name;
            this.node = node;
        }

        TNP(NodePointer parent, Locale locale, QName name, Object node) {
            super(parent, locale);
            this.name = name;
            this.node = node;
        }

        public boolean isLeaf() { return leaf; }
        public boolean isContainer() { return container; }
        public boolean isCollection() { return collection; }
        public int getLength() { return length; }
        public QName getName() { return name; }
        public Object getBaseValue() { return node; }
        public Object getImmediateNode() { return node; }
        public void setValue(Object value) { this.node = value; }

        public int compareChildNodePointers(NodePointer p1, NodePointer p2) {
            return compareResult;
        }

        public NodePointer getImmediateValuePointer() {
            return immediateValuePointer == null ? this : immediateValuePointer;
        }

        public String getNamespaceURI(String prefix) {
            return nsMap.get(prefix);
        }

        protected String getDefaultNamespaceURI() {
            return defaultNsURI;
        }
    }

    // ---------- isRoot / getParent / getImmediateParentPointer ----------

    @Test
    public void testIsRoot_noParent_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertTrue(p.isRoot());
    }

    @Test
    public void testIsRoot_withParent_false() {
        TNP parent = new TNP(null, new QName(null, "p"), "pn");
        TNP child = new TNP(parent, new QName(null, "c"), "cn");
        assertFalse(child.isRoot());
    }

    @Test
    public void testGetParent_nullParent_returnsNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.getParent());
    }

    @Test
    public void testGetParent_skipsContainerParents() {
        TNP grandParent = new TNP(null, new QName(null, "gp"), "gpn");
        TNP containerParent = new TNP(grandParent, new QName(null, "cp"), "cpn");
        containerParent.container = true;
        TNP child = new TNP(containerParent, new QName(null, "c"), "cn");
        // parent.isContainer() == true -> ต้องข้ามไปหา grandParent
        assertSame(grandParent, child.getParent());
    }

    @Test
    public void testGetParent_nonContainerParent_returnsDirectParent() {
        TNP parent = new TNP(null, new QName(null, "p"), "pn");
        parent.container = false;
        TNP child = new TNP(parent, new QName(null, "c"), "cn");
        assertSame(parent, child.getParent());
    }

    @Test
    public void testGetImmediateParentPointer_returnsRawParent() {
        TNP parent = new TNP(null, new QName(null, "p"), "pn");
        parent.container = true;
        TNP child = new TNP(parent, new QName(null, "c"), "cn");
        // ไม่ skip container เหมือน getParent()
        assertSame(parent, child.getImmediateParentPointer());
    }

    // ---------- attribute / isNode ----------

    @Test
    public void testAttribute_defaultFalse_thenSetTrue() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertFalse(p.isAttribute());
        p.setAttribute(true);
        assertTrue(p.isAttribute());
    }

    @Test
    public void testIsNode_whenNotContainer_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.container = false;
        assertTrue(p.isNode());
    }

    @Test
    public void testIsNode_whenContainer_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.container = true;
        assertFalse(p.isNode());
    }

    // ---------- index ----------

    @Test
    public void testGetIndex_defaultWholeCollection() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertEquals(NodePointer.WHOLE_COLLECTION, p.getIndex());
    }

    @Test
    public void testSetIndex_thenGetIndex() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.setIndex(5);
        assertEquals(5, p.getIndex());
    }

    // ---------- isActual (boundary) ----------

    @Test
    public void testIsActual_wholeCollection_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.length = 0;
        // index == WHOLE_COLLECTION
        assertTrue(p.isActual());
    }

    @Test
    public void testIsActual_indexWithinRange_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.length = 3;
        p.setIndex(2); // boundary: index == length-1
        assertTrue(p.isActual());
    }

    @Test
    public void testIsActual_indexEqualsLength_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.length = 3;
        p.setIndex(3); // boundary: index == length
        assertFalse(p.isActual());
    }

    @Test
    public void testIsActual_negativeIndex_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.length = 3;
        p.setIndex(-1); // ไม่ใช่ WHOLE_COLLECTION แต่ < 0
        assertFalse(p.isActual());
    }

    @Test
    public void testIsActual_emptyCollection_indexZero_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.length = 0;
        p.setIndex(0);
        assertFalse(p.isActual());
    }

    // ---------- getValue / getValuePointer / getImmediateValuePointer / getNode ----------

    @Test
    public void testGetValuePointer_default_returnsSelf() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertSame(p, p.getValuePointer());
    }

    @Test
    public void testGetValue_default_equalsNode() {
        TNP p = new TNP(null, new QName(null, "a"), "hello");
        assertEquals("hello", p.getValue());
    }

    @Test
    public void testGetValue_delegatesToValuePointer() {
        TNP inner = new TNP(null, new QName(null, "inner"), "innerNode");
        TNP outer = new TNP(null, new QName(null, "outer"), "outerNode");
        outer.immediateValuePointer = inner;
        // valuePointer != this -> ต้อง delegate ไป inner.getValue()
        assertEquals("innerNode", outer.getValue());
        assertSame(inner, outer.getValuePointer());
    }

    @Test
    public void testGetNode_default_equalsImmediateNode() {
        TNP p = new TNP(null, new QName(null, "a"), "hello");
        assertEquals("hello", p.getNode());
    }

    @Test
    public void testGetNode_delegatesThroughValuePointer() {
        TNP inner = new TNP(null, new QName(null, "inner"), "innerNode");
        TNP outer = new TNP(null, new QName(null, "outer"), "outerNode");
        outer.immediateValuePointer = inner;
        assertEquals("innerNode", outer.getNode());
    }

    // ---------- getRootNode ----------

    @Test
    public void testGetRootNode_noParent() {
        TNP p = new TNP(null, new QName(null, "a"), "rootVal");
        assertEquals("rootVal", p.getRootNode());
    }

    @Test
    public void testGetRootNode_withParent_delegates() {
        TNP root = new TNP(null, new QName(null, "root"), "rootVal");
        TNP child = new TNP(root, new QName(null, "c"), "childVal");
        assertEquals("rootVal", child.getRootNode());
    }

    // ---------- childIterator / attributeIterator (default branch + delegate branch) ----------

    @Test
    public void testChildIterator_valuePointerIsSelf_returnsNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.childIterator(null, false, null));
    }

    @Test
    public void testChildIterator_delegatesToValuePointer() {
        TNP inner = new TNP(null, new QName(null, "inner"), "innerNode");
        TNP outer = new TNP(null, new QName(null, "outer"), "outerNode");
        outer.immediateValuePointer = inner;
        // valuePointer != this -> เดิน branch delegate (inner ก็ resolve เป็นตัวเอง -> null)
        assertNull(outer.childIterator(null, false, null));
    }

    @Test
    public void testAttributeIterator_valuePointerIsSelf_returnsNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.attributeIterator(new QName(null, "attr")));
    }

    @Test
    public void testAttributeIterator_delegatesToValuePointer() {
        TNP inner = new TNP(null, new QName(null, "inner"), "innerNode");
        TNP outer = new TNP(null, new QName(null, "outer"), "outerNode");
        outer.immediateValuePointer = inner;
        assertNull(outer.attributeIterator(new QName(null, "attr")));
    }

    // ---------- namespaceIterator / namespacePointer / getNamespaceURI (default) ----------

    @Test
    public void testNamespaceIterator_defaultNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.namespaceIterator());
    }

    @Test
    public void testNamespacePointer_defaultNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.namespacePointer("ns"));
    }

    @Test
    public void testGetNamespaceURI_noArg_defaultNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.getNamespaceURI());
    }

    // ---------- isDefaultNamespace ----------

    @Test
    public void testIsDefaultNamespace_nullPrefix_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        // เรียกผ่าน testNode อ้อม ๆ ไม่ได้ เพราะ protected -> ทดสอบผ่านพฤติกรรมจริงของ class เดียวกัน (same package)
        assertTrue(invokeIsDefaultNamespace(p, null));
    }

    @Test
    public void testIsDefaultNamespace_namespaceNull_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.defaultNsURI = "urn:default";
        // getNamespaceURI("pfx") == null -> false
        assertFalse(invokeIsDefaultNamespace(p, "pfx"));
    }

    @Test
    public void testIsDefaultNamespace_matchesDefault_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.nsMap.put("pfx", "urn:default");
        p.defaultNsURI = "urn:default";
        assertTrue(invokeIsDefaultNamespace(p, "pfx"));
    }

    @Test
    public void testIsDefaultNamespace_differsFromDefault_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.nsMap.put("pfx", "urn:other");
        p.defaultNsURI = "urn:default";
        assertFalse(invokeIsDefaultNamespace(p, "pfx"));
    }

    private boolean invokeIsDefaultNamespace(TNP p, String prefix) {
        // isDefaultNamespace เป็น protected method ใน NodePointer, class นี้อยู่ package เดียวกัน
        return p.isDefaultNamespace(prefix);
    }

    // ---------- testNode ----------

    @Test
    public void testTestNode_nullTest_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertTrue(p.testNode(null));
    }

    @Test
    public void testTestNode_NodeNameTest_containerIsFalseEarly() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.container = true;
        NodeNameTest test = new NodeNameTest(new QName(null, "a"));
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_nameNull_false() {
        TNP p = new TNP(null, null, "n"); // getName() == null
        NodeNameTest test = new NodeNameTest(new QName(null, "a"));
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_samePrefix_nameMatches_true() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        NodeNameTest test = new NodeNameTest(new QName(null, "foo"));
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_samePrefix_nameMismatch_false() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        NodeNameTest test = new NodeNameTest(new QName(null, "bar"));
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_wildcard_true() {
        TNP p = new TNP(null, new QName(null, "anything"), "n");
        NodeNameTest test = new NodeNameTest(new QName(null, "*"));
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_differentPrefix_sameNS_passesToNameCheck() {
        // getNamespaceURI default คืน null เสมอไม่ว่า prefix ใด -> equalStrings(null,null)=true
        TNP p = new TNP(null, new QName("px1", "foo"), "n");
        NodeNameTest test = new NodeNameTest(new QName("px2", "foo"));
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeNameTest_differentPrefix_differentNS_false() {
        TNP p = new TNP(null, new QName("px1", "foo"), "n");
        p.nsMap.put("px1", "urn:ns1");
        p.nsMap.put("px2", "urn:ns2");
        NodeNameTest test = new NodeNameTest(new QName("px2", "foo"));
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_matches_isNode_true() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.container = false; // isNode() == true
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertTrue(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_matches_butIsContainer_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.container = true; // isNode() == false
        NodeTypeTest test = new NodeTypeTest(Compiler.NODE_TYPE_NODE);
        assertFalse(p.testNode(test));
    }

    @Test
    public void testTestNode_NodeTypeTest_typeMismatch_false() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.container = false;
        NodeTypeTest test = new NodeTypeTest(-999); // ไม่ตรงกับ NODE_TYPE_NODE
        assertFalse(p.testNode(test));
    }

    // ---------- createPath / createChild / createAttribute ----------

    @Test
    public void testCreatePath_withValue_setsValueAndReturnsThis() {
        TNP p = new TNP(null, new QName(null, "a"), "old");
        JXPathContext ctx = JXPathContext.newContext(new Object());
        NodePointer result = p.createPath(ctx, "newVal");
        assertSame(p, result);
        assertEquals("newVal", p.getBaseValue());
    }

    @Test
    public void testCreatePath_noValue_returnsThis() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        JXPathContext ctx = JXPathContext.newContext(new Object());
        assertSame(p, p.createPath(ctx));
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_withIndexAndValue_throws() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createChild(ctx, new QName(null, "child"), 0, "v");
    }

    @Test(expected = JXPathException.class)
    public void testCreateChild_withIndex_throws() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createChild(ctx, new QName(null, "child"), 0);
    }

    @Test(expected = JXPathException.class)
    public void testCreateAttribute_throws() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        JXPathContext ctx = JXPathContext.newContext(new Object());
        p.createAttribute(ctx, new QName(null, "attr"));
    }

    // ---------- remove() (no-op) ----------

    @Test
    public void testRemove_isNoOp() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.remove(); // ไม่ควร throw หรือเปลี่ยนสถานะใด ๆ
        assertEquals("n", p.getBaseValue());
    }

    // ---------- getLocale ----------

    @Test
    public void testGetLocale_ownLocaleSet() {
        TNP p = new TNP(null, Locale.FRANCE, new QName(null, "a"), "n");
        assertEquals(Locale.FRANCE, p.getLocale());
    }

    @Test
    public void testGetLocale_noParentNoLocale_returnsNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.getLocale());
    }

    @Test
    public void testGetLocale_inheritsFromParent() {
        TNP parent = new TNP(null, Locale.GERMANY, new QName(null, "p"), "pn");
        TNP child = new TNP(parent, new QName(null, "c"), "cn"); // locale ของ child ไม่ได้ set
        assertEquals(Locale.GERMANY, child.getLocale());
    }

    // ---------- isLanguage ----------

    @Test
    public void testIsLanguage_matchCaseInsensitive_true() {
        TNP p = new TNP(null, Locale.US, new QName(null, "a"), "n");
        assertTrue(p.isLanguage("en"));
        assertTrue(p.isLanguage("EN"));
    }

    @Test
    public void testIsLanguage_noMatch_false() {
        TNP p = new TNP(null, Locale.US, new QName(null, "a"), "n");
        assertFalse(p.isLanguage("fr"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsLanguage_localeNull_throwsNPE() {
        // ตามซอร์ส: getLocale() อาจคืน null แล้ว loc.toString() จะ NPE
        // นี่คือข้อสังเกตจาก source ตรง ๆ ไม่ใช่การเดา
        TNP p = new TNP(null, new QName(null, "a"), "n");
        p.isLanguage("en");
    }

    // ---------- NamespaceResolver ----------

    @Test
    public void testGetNamespaceResolver_defaultNull() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        assertNull(p.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolver_ownSet() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        NamespaceResolver res = new NamespaceResolver();
        p.setNamespaceResolver(res);
        assertSame(res, p.getNamespaceResolver());
    }

    @Test
    public void testGetNamespaceResolver_inheritsFromParent() {
        TNP parent = new TNP(null, new QName(null, "p"), "pn");
        NamespaceResolver res = new NamespaceResolver();
        parent.setNamespaceResolver(res);
        TNP child = new TNP(parent, new QName(null, "c"), "cn");
        assertSame(res, child.getNamespaceResolver());
    }

    // ---------- asPath ----------

    @Test
    public void testAsPath_rootNoAttributeNoIndex() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        assertEquals("/foo", p.asPath());
    }

    @Test
    public void testAsPath_withAttribute() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        p.setAttribute(true);
        assertEquals("/@foo", p.asPath());
    }

    @Test
    public void testAsPath_withIndexAndCollection() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        p.collection = true;
        p.setIndex(2);
        assertEquals("/foo[3]", p.asPath());
    }

    @Test
    public void testAsPath_indexSetButNotCollection_noBracket() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        p.collection = false;
        p.setIndex(2);
        assertEquals("/foo", p.asPath());
    }

    @Test
    public void testAsPath_withNonContainerParent() {
        TNP parent = new TNP(null, new QName(null, "parent"), "pn");
        TNP child = new TNP(parent, new QName(null, "child"), "cn");
        assertEquals("/parent/child", child.asPath());
    }

    @Test
    public void testAsPath_parentIsContainer_delegatesEntirely() {
        TNP parent = new TNP(null, new QName(null, "pcontainer"), "pn");
        parent.container = true;
        TNP child = new TNP(parent, new QName(null, "ignoredChildName"), "cn");
        child.setAttribute(true); // ค่าพวกนี้ต้องถูกมองข้าม เพราะ parent.isContainer()==true
        assertEquals(parent.asPath(), child.asPath());
        assertEquals("/pcontainer", child.asPath());
    }

    // ---------- clone (ตาม comment ในซอร์ส "Of course it is supported") ----------

    @Test
    public void testClone_noParent() {
        TNP p = new TNP(null, new QName(null, "a"), "n");
        Object cloned = p.clone();
        assertNotNull(cloned);
        assertTrue(cloned instanceof TNP);
        assertNotSame(p, cloned);
        TNP cp = (TNP) cloned;
        assertEquals(p.getName(), cp.getName());
        assertNull(cp.getImmediateParentPointer());
    }

    @Test
    public void testClone_withParent_clonesParentRecursively() {
        TNP parent = new TNP(null, new QName(null, "p"), "pn");
        TNP child = new TNP(parent, new QName(null, "c"), "cn");
        TNP clonedChild = (TNP) child.clone();
        assertNotSame(child, clonedChild);
        NodePointer clonedParent = clonedChild.getImmediateParentPointer();
        assertNotSame(parent, clonedParent);
        assertEquals(parent.getName(), clonedParent.getName());
    }

    // ---------- toString ----------

    @Test
    public void testToString_equalsAsPath() {
        TNP p = new TNP(null, new QName(null, "foo"), "n");
        assertEquals(p.asPath(), p.toString());
    }

    // ---------- compareTo ----------

    @Test
    public void testCompareTo_sameParent_delegatesToCompareChildNodePointers() {
        TNP parent = new TNP(null, new QName(null, "p"), "pn");
        TNP c1 = new TNP(parent, new QName(null, "c1"), "n1");
        TNP c2 = new TNP(parent, new QName(null, "c2"), "n2");
        parent.compareResult = 7;
        assertEquals(7, c1.compareTo(c2));
    }

    @Test
    public void testCompareTo_bothRoot_sameNullParent_zero() {
        TNP r1 = new TNP(null, new QName(null, "r1"), "n1");
        TNP r2 = new TNP(null, new QName(null, "r2"), "n2");
        // r1.parent == r2.parent (ทั้งคู่ null) -> parent==null -> return 0
        assertEquals(0, r1.compareTo(r2));
    }

    @Test
    public void testCompareTo_depth1LessThanDepth2_returnsNegative() {
        TNP rootShared = new TNP(null, new QName(null, "root"), "rootN");
        TNP child = new TNP(rootShared, new QName(null, "child"), "childN");
        // p1 = rootShared (depth 1), p2 = child (depth 2)
        int result = rootShared.compareTo(child);
        assertTrue("expected negative, got " + result, result < 0);
    }

    @Test
    public void testCompareTo_depth1GreaterThanDepth2_returnsPositive() {
        TNP rootShared = new TNP(null, new QName(null, "root"), "rootN");
        TNP child = new TNP(rootShared, new QName(null, "child"), "childN");
        int result = child.compareTo(rootShared);
        assertTrue("expected positive, got " + result, result > 0);
    }

    @Test
    public void testCompareTo_unrelatedRoots_throwsException() {
        TNP root1 = new TNP(null, new QName(null, "root1"), "n1");
        TNP root2 = new TNP(null, new QName(null, "root2"), "n2");
        TNP leaf1 = new TNP(root1, new QName(null, "l1"), "ln1");
        TNP leaf2 = new TNP(root2, new QName(null, "l2"), "ln2");
        try {
            leaf1.compareTo(leaf2);
            fail("Expected JXPathException เพราะ pointers ไม่ได้อยู่ใน tree เดียวกัน");
        } catch (JXPathException expected) {
            // ok - ตรงตาม branch depth1==1 ใน compareNodePointers
        }
    }

    @Test
    public void testCompareTo_deepCommonAncestor_returnsZero() {
        TNP grandParent = new TNP(null, new QName(null, "g"), "gn");
        TNP m1 = new TNP(grandParent, new QName(null, "m1"), "m1n");
        TNP m2 = new TNP(grandParent, new QName(null, "m2"), "m2n");
        TNP l1 = new TNP(m1, new QName(null, "l1"), "l1n");
        TNP l2 = new TNP(m2, new QName(null, "l2"), "l2n");
        grandParent.compareResult = 0;
        m1.compareResult = 0;
        // ลึกเท่ากัน (depth=3), ไม่มี parent ร่วมตรง ๆ แต่สืบไปเจอ grandParent ร่วมกัน
        // -> ครอบคลุม recursive branch ที่ r==0 แล้ววิ่งต่อไปยัง compareChildNodePointers สุดท้าย
        assertEquals(0, l1.compareTo(l2));
    }

    // ---------- newNodePointer (static factory) ----------

    @Test
    public void testNewNodePointer_beanNull_returnsNullPointer() {
        QName name = new QName(null, "x");
        NodePointer p = NodePointer.newNodePointer(name, null, Locale.getDefault());
        assertTrue(p instanceof NullPointer);
    }

    @Test
    public void testNewNodePointer_beanNotNull_returnsSomePointer() {
        // สร้าง context ก่อนเพื่อให้ factory ถูก register ตามกลไกจริงของไลบรารี
        JXPathContext.newContext(new Object());
        QName name = new QName(null, "x");
        NodePointer p = NodePointer.newNodePointer(name, new Object(), Locale.getDefault());
        assertNotNull(p);
        // ไม่ assert class ที่แน่ชัดเพราะเป็น internal detail ที่ไม่ได้ระบุในซอร์สที่ให้มา
    }

    @Test
    public void testNewChildNodePointer_returnsSomePointer() {
        JXPathContext.newContext(new Object());
        TNP parent = new TNP(null, new QName(null, "parent"), "pn");
        QName childName = new QName(null, "child");
        NodePointer p = NodePointer.newChildNodePointer(parent, childName, new Object());
        assertNotNull(p);
    }

    // หมายเหตุ: ไม่ได้เขียนเทสสำหรับ branch ที่ throw JXPathException ใน
    // newNodePointer/newChildNodePointer (กรณีไม่มี factory ใดสร้าง pointer ได้)
    // เพราะพฤติกรรมขึ้นกับ global factory registration ของ
    // JXPathContextReferenceImpl ซึ่งไม่ได้ระบุไว้ในซอร์สที่ให้มา
    // การเดา object ที่ "ไม่มี factory รองรับ" จะเป็นการเดา behavior
    // จึงขอข้ามตามข้อกำหนดที่ 4
}
```

# สรุปตาราง Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testIsRoot_* | `isRoot()`: parent==null true/false |
| testGetParent_* | `getParent()`: loop while(container), skip container, parent null |
| testGetImmediateParentPointer_* | คืน parent ตรง ๆ ไม่ skip container |
| testAttribute_* | `isAttribute()` default/true |
| testIsNode_* | `isNode()` = !isContainer() ทั้ง 2 branch |
| testGetIndex/SetIndex | ค่า default WHOLE_COLLECTION, set/get |
| testIsActual_* | `isActual()`: WHOLE_COLLECTION, index ใน/นอกช่วง, boundary index=length-1/length, negative index, empty collection |
| testGetValuePointer_default | `ivp==this` → return this |
| testGetValue_default / delegatesToValuePointer | `getValue()`: valuePointer==this vs !=this |
| testGetNode_* | `getNode()` ผ่าน getValuePointer chain |
| testGetRootNode_* | `rootNode`: parent==null vs parent!=null (recursive + cache) |
| testChildIterator_* / testAttributeIterator_* | ternary `valuePointer==this` true/false |
| testNamespaceIterator/Pointer/getNamespaceURI | default null implementations |
| testIsDefaultNamespace_* | prefix null, namespace null, match, mismatch (4 branches) |
| testTestNode_nullTest | `test==null` → true |
| testTestNode_NodeNameTest_* | isContainer early-false, name null, prefix match/mismatch, NS match/mismatch, wildcard true, exact-match true/false |
| testTestNode_NodeTypeTest_* | type match & isNode true/false, type mismatch |
| testCreatePath_* | setValue + return this (ทั้ง 2 overload) |
| testCreateChild_*/testCreateAttribute_* | throw JXPathException ทั้ง 3 overload |
| testRemove_isNoOp | no-op behavior |
| testGetLocale_* | own locale, null (no parent), inherit from parent |
| testIsLanguage_* | match (case-insensitive), no match, NPE เมื่อ locale null (fault-sensitive) |
| testGetNamespaceResolver_* | default null, own set, inherit from parent |
| testAsPath_* | root, attribute, index+collection, index ไม่ใช่ collection, parent ไม่ใช่ container, parent เป็น container (early delegate) |
| testClone_* | clone สำเร็จ (ตาม comment "Of course it is supported"), parent clone แบบ recursive, root ไม่มี parent |
| testToString_equalsAsPath | delegate ไป asPath() |
| testCompareTo_* | same parent branch, both-root-null-parent, depth1<depth2, depth1>depth2, unrelated roots throw exception, deep common ancestor (r==0 ต่อเนื่องจนถึง final compareChildNodePointers) |
| testNewNodePointer_beanNull | คืน NullPointer |
| testNewNodePointer_beanNotNull / testNewChildNodePointer | branch ที่ factory สร้าง pointer สำเร็จ (ไม่ครอบคลุม exception branch – ระบุเหตุผลในคอมเมนต์) |