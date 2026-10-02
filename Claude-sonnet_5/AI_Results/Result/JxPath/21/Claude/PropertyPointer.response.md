# แนวคิดการออกแบบเทส

`PropertyPointer` เป็น abstract class ที่ extends `NodePointer` (abstract เช่นกัน) ซึ่ง source ของ `NodePointer` ไม่ได้ให้มาในโจทย์ จึงต้องสร้าง **test double (concrete subclass)** ของทั้งสองคลาสเพื่อให้ compile และทดสอบ logic ที่อยู่ใน `PropertyPointer` ได้จริง

> **หมายเหตุสำคัญ (assumption ที่ไม่สามารถยืนยันจาก source ที่ให้มาได้ 100%)**
> - สมมติว่า `NodePointer` มี `protected NodePointer(NodePointer parent)`, `public int getIndex()`, `public void setIndex(int)`, `public Object clone()`, และ abstract methods ที่เกี่ยวข้อง (`getName()`, `getBaseValue()`, `getImmediateNode()`, `isCollection()`, `getLength()`, `setValue(Object)`) ตามแบบมาตรฐานของ Apache Commons JXPath ที่เป็นที่รู้จักทั่วไป
> - สมมติว่า `QName` มี constructor `(String prefix, String name)` ตามที่ปรากฏตรงในซอร์สที่ให้มา (`new QName(null, getPropertyName())`) และมี `getPrefix()/getName()`
> - สมมติว่า `AbstractFactory.createObject(JXPathContext, Pointer, Object, String, int)` และ `JXPathContext.newContext(Object)/setFactory(AbstractFactory)` เป็น public API มาตรฐาน
> - จุดที่ไม่มั่นใจ ได้ comment ไว้ในโค้ดเป็นจุด ๆ

```java
package org.apache.commons.jxpath.ri.model.beans;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit4 tests for {@link PropertyPointer} (Defects4J JxPath-21b).
 *
 * เนื่องจาก PropertyPointer และ NodePointer เป็น abstract class ที่ซอร์สของ
 * NodePointer ไม่ได้ให้มาในโจทย์ จึงต้องสร้าง concrete test double
 * (RootPointer, SimplePropertyPointer, StubFactory) เพื่อให้สามารถ
 * instantiate และทดสอบ logic จริงของ PropertyPointer ได้
 */
public class PropertyPointerTest {

    // =======================================================================
    // Test doubles
    // =======================================================================

    /**
     * Concrete root/parent NodePointer แบบง่าย ใช้เป็น parent ของ
     * PropertyPointer ที่ต้องการทดสอบ
     *
     * หมายเหตุ: override equals()/hashCode() ตาม "ค่า node" เพื่อให้สามารถ
     * ทดสอบ branch ของ PropertyPointer.equals() ที่เปรียบเทียบ parent ด้วย
     * parent.equals(other.parent) (กรณี parent คนละ instance แต่ "เท่ากัน")
     */
    static class RootPointer extends NodePointer {
        private Object node;

        protected RootPointer(Object node) {
            super(null);
            this.node = node;
        }

        public Object getImmediateNode() {
            return node;
        }

        public Object getBaseValue() {
            return node;
        }

        public boolean isCollection() {
            return false;
        }

        public int getLength() {
            return 1;
        }

        public QName getName() {
            return null;
        }

        public void setValue(Object value) {
            this.node = value;
        }

        public boolean isLeaf() {
            return true;
        }

        public boolean isActual() {
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof RootPointer)) {
                return false;
            }
            RootPointer other = (RootPointer) obj;
            return node == null ? other.node == null : node.equals(other.node);
        }

        public int hashCode() {
            return node == null ? 0 : node.hashCode();
        }
    }

    /**
     * Concrete PropertyPointer จำลอง property เดียวชื่อ "value" โดยเก็บค่า
     * baseValue ไว้ใน field ภายใน (คล้าย BeanPropertyPointer แบบง่าย)
     */
    static class SimplePropertyPointer extends PropertyPointer {
        private String propertyName = "value";
        private String[] propertyNames = new String[] { "value" };
        private Object baseValue;
        private boolean actualProperty = true;
        private Object lastSetValue;
        private Integer lengthOverride; // test seam สำหรับ control getLength()

        protected SimplePropertyPointer(NodePointer parent) {
            super(parent);
        }

        public String getPropertyName() {
            return propertyName;
        }

        public void setPropertyName(String propertyName) {
            this.propertyName = propertyName;
        }

        public int getPropertyCount() {
            return propertyNames.length;
        }

        public String[] getPropertyNames() {
            return propertyNames;
        }

        protected boolean isActualProperty() {
            return actualProperty;
        }

        public Object getBaseValue() {
            return baseValue;
        }

        public void setValue(Object value) {
            this.lastSetValue = value;
            this.baseValue = value;
        }

        /**
         * ใช้ override ชั้นนี้เป็น "test seam" เพื่อควบคุมผลลัพธ์ของ
         * getLength() ให้อิสระจาก ValueUtils จริง ๆ สำหรับทดสอบ branch
         * ของ createPath(context, value) โดยไม่ต้องเดา behavior ของ
         * ValueUtils ที่ขอบเขต/กรณีแปลก ๆ
         */
        public int getLength() {
            if (lengthOverride != null) {
                return lengthOverride.intValue();
            }
            return super.getLength();
        }

        // ---------- test-only helper methods ----------
        void setBaseValueForTest(Object value) {
            this.baseValue = value;
        }

        void setActualPropertyForTest(boolean value) {
            this.actualProperty = value;
        }

        void setLengthOverrideForTest(Integer len) {
            this.lengthOverride = len;
        }

        Object getLastSetValue() {
            return lastSetValue;
        }
    }

    /** AbstractFactory stub ที่ควบคุมผลลัพธ์ createObject() ได้ */
    static class StubFactory extends AbstractFactory {
        private final boolean result;
        private boolean called;

        StubFactory(boolean result) {
            this.result = result;
        }

        public boolean createObject(JXPathContext context, Pointer pointer,
                Object parent, String name, int index) {
            this.called = true;
            return result;
        }

        boolean wasCalled() {
            return called;
        }
    }

    // =======================================================================
    // Fixtures
    // =======================================================================

    private RootPointer root;
    private SimplePropertyPointer pointer;

    @Before
    public void setUp() {
        root = new RootPointer("rootBean");
        pointer = new SimplePropertyPointer(root);
    }

    // =======================================================================
    // getPropertyIndex / setPropertyIndex
    // =======================================================================

    @Test
    public void testGetPropertyIndex_defaultUnspecified() {
        assertEquals(PropertyPointer.UNSPECIFIED_PROPERTY, pointer.getPropertyIndex());
    }

    @Test
    public void testSetPropertyIndex_changesIndex_resetsToWholeCollection() {
        pointer.setIndex(3);
        assertEquals(3, pointer.getIndex());

        pointer.setPropertyIndex(7); // ค่าต่างจากเดิม -> เข้า if -> reset index
        assertEquals(7, pointer.getPropertyIndex());
        assertEquals(NodePointer.WHOLE_COLLECTION, pointer.getIndex());
    }

    @Test
    public void testSetPropertyIndex_sameValue_doesNotResetIndex() {
        pointer.setPropertyIndex(2);
        pointer.setIndex(9);
        pointer.setPropertyIndex(2); // ค่าเดิม -> ไม่เข้า if
        assertEquals(9, pointer.getIndex());
    }

    @Test
    public void testSetPropertyIndex_toSameUnspecifiedValue_noReset() {
        pointer.setIndex(4);
        pointer.setPropertyIndex(PropertyPointer.UNSPECIFIED_PROPERTY);
        assertEquals(4, pointer.getIndex());
    }

    // =======================================================================
    // getBean
    // =======================================================================

    @Test
    public void testGetBean_lazyFromParentWhenNull() {
        assertEquals("rootBean", pointer.getBean());
    }

    @Test
    public void testGetBean_cachedAfterFirstCall() {
        Object first = pointer.getBean();
        root.setValue("changedBean");
        Object second = pointer.getBean();
        assertSame(first, second); // bean ถูก cache ไว้ ไม่ดึงใหม่จาก parent
    }

    @Test(expected = NullPointerException.class)
    public void testGetBean_withNullParent_throwsNPE() {
        // ตาม logic จริงใน source: ไม่มี null-check ก่อนเรียก
        // getImmediateParentPointer().getNode() -> ถ้า parent เป็น null จะ NPE
        SimplePropertyPointer orphan = new SimplePropertyPointer(null);
        orphan.getBean();
    }

    // =======================================================================
    // getName
    // =======================================================================

    @Test
    public void testGetName_wrapsPropertyName() {
        pointer.setPropertyName("foo");
        QName qname = pointer.getName();
        assertNull(qname.getPrefix());
        assertEquals("foo", qname.getName());
    }

    @Test
    public void testGetName_withNullPropertyName() {
        pointer.setPropertyName(null);
        QName qname = pointer.getName();
        assertNull(qname.getName());
    }

    // =======================================================================
    // isActual
    // =======================================================================

    @Test
    public void testIsActual_falseWhenNotActualProperty() {
        pointer.setActualPropertyForTest(false);
        assertFalse(pointer.isActual()); // isActualProperty()==false -> return false ทันที
    }

    @Test
    public void testIsActual_trueWhenActualPropertyAndSuperActual() {
        pointer.setActualPropertyForTest(true);
        assertTrue(pointer.isActual()); // ผ่าน isActualProperty() แล้วไปที่ super.isActual()
    }

    // =======================================================================
    // getImmediateNode (รวม cache ด้วย UNINITIALIZED)
    // =======================================================================

    @Test
    public void testGetImmediateNode_wholeCollection() {
        pointer.setBaseValueForTest("hello");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertEquals("hello", pointer.getImmediateNode());
    }

    @Test
    public void testGetImmediateNode_withSpecificIndex() {
        pointer.setBaseValueForTest(new String[] { "a", "b", "c" });
        pointer.setIndex(1);
        assertEquals("b", pointer.getImmediateNode());
    }

    @Test
    public void testGetImmediateNode_cachesValueAfterFirstCall() {
        pointer.setBaseValueForTest("x");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        Object first = pointer.getImmediateNode();
        pointer.setBaseValueForTest("changed");
        Object second = pointer.getImmediateNode();
        assertSame(first, second); // ค่าถูก cache ไว้ใน field value
    }

    // =======================================================================
    // isCollection
    // =======================================================================

    @Test
    public void testIsCollection_nullBaseValue_false() {
        pointer.setBaseValueForTest(null);
        assertFalse(pointer.isCollection());
    }

    @Test
    public void testIsCollection_arrayBaseValue_true() {
        pointer.setBaseValueForTest(new int[] { 1, 2, 3 });
        assertTrue(pointer.isCollection());
    }

    @Test
    public void testIsCollection_scalarBaseValue_false() {
        pointer.setBaseValueForTest("scalar");
        assertFalse(pointer.isCollection());
    }

    // =======================================================================
    // isLeaf
    // =======================================================================

    @Test
    public void testIsLeaf_nullNode_true() {
        pointer.setBaseValueForTest(null);
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        assertTrue(pointer.isLeaf());
    }

    @Test
    public void testIsLeaf_nonNullNode_smokeTest() {
        // หมายเหตุ: ผลลัพธ์จริงขึ้นกับ JXPathIntrospector.getBeanInfo(...).isAtomic()
        // ซึ่งไม่ได้ระบุไว้ในซอร์สที่ให้มา จึงทำเพียง smoke test (ไม่ throw exception)
        pointer.setBaseValueForTest("x");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        pointer.isLeaf();
    }

    // =======================================================================
    // getLength
    // =======================================================================

    @Test
    public void testGetLength_array() {
        pointer.setBaseValueForTest(new Object[] { 1, 2, 3, 4 });
        assertEquals(4, pointer.getLength());
    }

    // =======================================================================
    // getImmediateValuePointer
    // =======================================================================

    @Test
    public void testGetImmediateValuePointer_returnsPointerWithSameValue() {
        pointer.setPropertyName("foo");
        pointer.setBaseValueForTest("bar");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);

        NodePointer valuePointer = pointer.getImmediateValuePointer();
        assertNotNull(valuePointer);
        assertEquals("bar", valuePointer.getImmediateNode());
    }

    // =======================================================================
    // createPath(context)
    // =======================================================================

    @Test
    public void testCreatePath_nodeAlreadyExists_returnsSelfWithoutFactory() {
        pointer.setBaseValueForTest("existing");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer result = pointer.createPath(context);
        assertSame(pointer, result);
    }

    @Test
    public void testCreatePath_nodeNull_factorySucceeds_returnsSelf() {
        pointer.setBaseValueForTest(null);
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        JXPathContext context = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory(true);
        context.setFactory(factory);

        NodePointer result = pointer.createPath(context);
        assertSame(pointer, result);
        assertTrue(factory.wasCalled());
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreatePath_nodeNull_factoryFails_throws() {
        pointer.setBaseValueForTest(null);
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        JXPathContext context = JXPathContext.newContext(new Object());
        StubFactory factory = new StubFactory(false);
        context.setFactory(factory);

        pointer.createPath(context);
    }

    @Test(expected = JXPathAbstractFactoryException.class)
    public void testCreatePath_noFactorySet_throws() {
        // หมายเหตุ: getAbstractFactory(context) เป็นเมธอดของ NodePointer ที่ไม่ได้แสดง
        // ในซอร์สที่ให้มา สมมติตาม public behavior มาตรฐานของ JXPath ว่าจะ throw
        // JXPathAbstractFactoryException เมื่อไม่มี factory ถูก set
        pointer.setBaseValueForTest(null);
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        JXPathContext context = JXPathContext.newContext(new Object());

        pointer.createPath(context);
    }

    // =======================================================================
    // createPath(context, value)
    // =======================================================================

    @Test
    public void testCreatePathWithValue_wholeCollection_setsValueDirectly() {
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        pointer.setBaseValueForTest("ignored");
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer result = pointer.createPath(context, "newValue");
        assertSame(pointer, result);
        assertEquals("newValue", pointer.getLastSetValue());
    }

    @Test
    public void testCreatePathWithValue_indexWithinLength_setsValueDirectly() {
        pointer.setBaseValueForTest(new Object[] { "a", "b", "c" }); // length 3 จริง
        pointer.setIndex(1); // 1 < 3 -> ไม่เข้า branch ขยาย collection
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer result = pointer.createPath(context, "newValue");
        assertSame(pointer, result);
        assertEquals("newValue", pointer.getLastSetValue());
    }

    @Test
    public void testCreatePathWithValue_indexBeyondLength_expandsThenSetsValue() {
        // ใช้ array จริงที่ index ยัง valid (เพื่อให้ getImmediateNode() ภายใน
        // createPath(context) คืนค่า non-null และไม่ต้องพึ่ง factory)
        // แต่บังคับ getLength() ให้รายงานค่าต่ำกว่าจริง ด้วย test seam
        // เพื่อ trigger branch "index >= getLength()" อย่างปลอดภัย
        pointer.setBaseValueForTest(new Object[] { "a", "b", "c", "d", "e" });
        pointer.setIndex(1);
        pointer.setLengthOverrideForTest(0); // บังคับ getLength() = 0 -> 1 >= 0 -> true
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer result = pointer.createPath(context, "expandedValue");
        assertSame(pointer, result);
        assertEquals("expandedValue", pointer.getLastSetValue());
    }

    // =======================================================================
    // createChild(context, name, index, value)
    // =======================================================================

    @Test
    public void testCreateChildWithValue_setsPropertyNameAndIndex() {
        pointer.setBaseValueForTest(new Object[] { "x", "y" });
        QName name = new QName(null, "newProp");
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, name, 0, "val");
        assertNotNull(child);
        assertTrue(child instanceof SimplePropertyPointer);
        SimplePropertyPointer sp = (SimplePropertyPointer) child;
        assertEquals("newProp", sp.getPropertyName());
        assertEquals(0, sp.getIndex());
    }

    @Test
    public void testCreateChildWithValue_nullName_keepsOriginalPropertyName() {
        pointer.setPropertyName("original");
        pointer.setBaseValueForTest("abc");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, null, NodePointer.WHOLE_COLLECTION, "newVal");
        SimplePropertyPointer sp = (SimplePropertyPointer) child;
        assertEquals("original", sp.getPropertyName()); // name==null -> ไม่เปลี่ยนชื่อ property
    }

    // =======================================================================
    // createChild(context, name, index) [ไม่มี value]
    // =======================================================================

    @Test
    public void testCreateChildWithoutValue_setsPropertyName() {
        pointer.setBaseValueForTest("exists");
        QName name = new QName(null, "anotherProp");
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, name, NodePointer.WHOLE_COLLECTION);
        SimplePropertyPointer sp = (SimplePropertyPointer) child;
        assertEquals("anotherProp", sp.getPropertyName());
    }

    @Test
    public void testCreateChildWithoutValue_nullName_keepsOriginalPropertyName() {
        pointer.setPropertyName("kept");
        pointer.setBaseValueForTest("exists");
        JXPathContext context = JXPathContext.newContext(new Object());

        NodePointer child = pointer.createChild(context, null, NodePointer.WHOLE_COLLECTION);
        SimplePropertyPointer sp = (SimplePropertyPointer) child;
        assertEquals("kept", sp.getPropertyName());
    }

    // =======================================================================
    // hashCode
    // =======================================================================

    @Test
    public void testHashCode_combinesParentPropertyIndexAndIndex() {
        pointer.setPropertyIndex(2);
        pointer.setIndex(3);
        int expected = root.hashCode() + 2 + 3;
        assertEquals(expected, pointer.hashCode());
    }

    // =======================================================================
    // equals
    // =======================================================================

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(pointer.equals(pointer));
    }

    @Test
    public void testEquals_notInstanceOfPropertyPointer_false() {
        assertFalse(pointer.equals("not a pointer"));
    }

    @Test
    public void testEquals_sameReferenceParent_differentPropertyIndex_false() {
        SimplePropertyPointer other = new SimplePropertyPointer(root);
        pointer.setPropertyName("same");
        other.setPropertyName("same");
        pointer.setPropertyIndex(1);
        other.setPropertyIndex(2);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEquals_differentPropertyName_false() {
        SimplePropertyPointer other = new SimplePropertyPointer(root);
        pointer.setPropertyName("a");
        other.setPropertyName("b");
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEquals_wholeCollectionTreatedAsIndexZero_true() {
        SimplePropertyPointer other = new SimplePropertyPointer(root);
        pointer.setPropertyName("same");
        other.setPropertyName("same");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        other.setIndex(0);
        assertTrue(pointer.equals(other));
    }

    @Test
    public void testEquals_differentIndex_false() {
        SimplePropertyPointer other = new SimplePropertyPointer(root);
        pointer.setPropertyName("same");
        other.setPropertyName("same");
        pointer.setIndex(1);
        other.setIndex(2);
        assertFalse(pointer.equals(other));
    }

    @Test
    public void testEquals_bothNullParent_true() {
        SimplePropertyPointer p1 = new SimplePropertyPointer(null);
        SimplePropertyPointer p2 = new SimplePropertyPointer(null);
        p1.setPropertyName("same");
        p2.setPropertyName("same");
        assertTrue(p1.equals(p2)); // parent == other.parent (ทั้งคู่ null) -> ข้าม return false
    }

    @Test
    public void testEquals_oneNullParentOneNonNull_false() {
        SimplePropertyPointer p1 = new SimplePropertyPointer(null);
        SimplePropertyPointer p2 = new SimplePropertyPointer(root);
        p1.setPropertyName("same");
        p2.setPropertyName("same");
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEquals_differentParentInstancesButEqualValue_true() {
        RootPointer rootA = new RootPointer("sameBean");
        RootPointer rootB = new RootPointer("sameBean");
        SimplePropertyPointer p1 = new SimplePropertyPointer(rootA);
        SimplePropertyPointer p2 = new SimplePropertyPointer(rootB);
        p1.setPropertyName("same");
        p2.setPropertyName("same");
        assertTrue(p1.equals(p2)); // parent คนละ reference แต่ equals() กันได้
    }

    @Test
    public void testEquals_differentParentValue_false() {
        RootPointer otherRoot = new RootPointer("otherBean");
        SimplePropertyPointer other = new SimplePropertyPointer(otherRoot);
        pointer.setPropertyName("same");
        other.setPropertyName("same");
        assertFalse(pointer.equals(other));
    }

    // =======================================================================
    // compareChildNodePointers (smoke test)
    // =======================================================================

    @Test
    public void testCompareChildNodePointers_smoke() {
        // หมายเหตุ: พฤติกรรมจริงของ getValuePointer()/compareChildNodePointers()
        // ที่สืบทอดจาก NodePointer ไม่ได้แสดงในซอร์สที่ให้มา จึงทำเพียง
        // smoke test ยืนยันว่าเรียกใช้งานได้โดยไม่ throw exception ที่ไม่คาดคิด
        pointer.setBaseValueForTest("abc");
        pointer.setIndex(NodePointer.WHOLE_COLLECTION);
        pointer.compareChildNodePointers(pointer, pointer);
    }
}
```

# สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุมใน `PropertyPointer` |
|---|---|
| `testGetPropertyIndex_defaultUnspecified` | ค่าเริ่มต้น `propertyIndex = UNSPECIFIED_PROPERTY` |
| `testSetPropertyIndex_changesIndex_resetsToWholeCollection` | `setPropertyIndex`: if-true (index เปลี่ยน → reset index) |
| `testSetPropertyIndex_sameValue_doesNotResetIndex` | `setPropertyIndex`: if-false (ค่าเดิม → ไม่ reset) |
| `testSetPropertyIndex_toSameUnspecifiedValue_noReset` | boundary: เซ็ตค่าเท่ากับ default UNSPECIFIED_PROPERTY |
| `testGetBean_lazyFromParentWhenNull` | `getBean`: if-true (`bean==null` → ดึงจาก parent) |
| `testGetBean_cachedAfterFirstCall` | `getBean`: if-false (ครั้งที่สอง bean ไม่ null → cache) |
| `testGetBean_withNullParent_throwsNPE` | edge case: parent null → NPE (fault-finding) |
| `testGetName_wrapsPropertyName` / `testGetName_withNullPropertyName` | `getName()` + boundary null propertyName |
| `testIsActual_falseWhenNotActualProperty` | `isActual`: if-true (`!isActualProperty()` → false) |
| `testIsActual_trueWhenActualPropertyAndSuperActual` | `isActual`: if-false → `super.isActual()` |
| `testGetImmediateNode_wholeCollection` | `getImmediateNode`: ternary branch `WHOLE_COLLECTION` |
| `testGetImmediateNode_withSpecificIndex` | `getImmediateNode`: ternary branch index เจาะจง |
| `testGetImmediateNode_cachesValueAfterFirstCall` | `getImmediateNode`: cache guard `UNINITIALIZED` |
| `testIsCollection_nullBaseValue_false` | `isCollection`: `value==null` → false |
| `testIsCollection_arrayBaseValue_true` | `isCollection`: `value!=null && isCollection(value)` → true |
| `testIsCollection_scalarBaseValue_false` | `isCollection`: non-collection scalar → false |
| `testIsLeaf_nullNode_true` / `testIsLeaf_nonNullNode_smokeTest` | `isLeaf`: if-true (null) / smoke-test non-null |
| `testGetLength_array` | `getLength()` กับ array |
| `testGetImmediateValuePointer_returnsPointerWithSameValue` | `getImmediateValuePointer()` |
| `testCreatePath_nodeAlreadyExists_returnsSelfWithoutFactory` | `createPath(context)`: if-false (node != null) |
| `testCreatePath_nodeNull_factorySucceeds_returnsSelf` | `createPath(context)`: if-true + factory success |
| `testCreatePath_nodeNull_factoryFails_throws` | `createPath(context)`: factory fail → throw |
| `testCreatePath_noFactorySet_throws` | `getAbstractFactory` fail path (inherited) |
| `testCreatePathWithValue_wholeCollection_setsValueDirectly` | `createPath(context,value)`: index==WHOLE_COLLECTION → skip expand |
| `testCreatePathWithValue_indexWithinLength_setsValueDirectly` | `createPath(context,value)`: `index < getLength()` → skip expand |
| `testCreatePathWithValue_indexBeyondLength_expandsThenSetsValue` | `createPath(context,value)`: `index >= getLength()` → expand branch |
| `testCreateChildWithValue_setsPropertyNameAndIndex` / `..._nullName_keeps...` | `createChild(ctx,name,index,value)`: name!=null / name==null |
| `testCreateChildWithoutValue_setsPropertyName` / `..._nullName_keeps...` | `createChild(ctx,name,index)`: name!=null / name==null |
| `testHashCode_combinesParentPropertyIndexAndIndex` | `hashCode()` |
| `testEquals_sameInstance_true` | `equals`: `object==this` |
| `testEquals_notInstanceOfPropertyPointer_false` | `equals`: `!(instanceof)` |
| `testEquals_sameReferenceParent_differentPropertyIndex_false` | `equals`: propertyIndex mismatch |
| `testEquals_differentPropertyName_false` | `equals`: propertyName mismatch |
| `testEquals_wholeCollectionTreatedAsIndexZero_true` | `equals`: ternary index-normalization เท่ากัน |
| `testEquals_differentIndex_false` | `equals`: ternary index-normalization ไม่เท่ากัน |
| `testEquals_bothNullParent_true` | `equals`: parent==other.parent (ทั้งคู่ null) |
| `testEquals_oneNullParentOneNonNull_false` | `equals`: parent null vs non-null |
| `testEquals_differentParentInstancesButEqualValue_true` | `equals`: parent คนละ ref แต่ `.equals()` true |
| `testEquals_differentParentValue_false` | `equals`: parent คนละ ref และ `.equals()` false |
| `testCompareChildNodePointers_smoke` | `compareChildNodePointers()` (smoke) |

**ข้อจำกัดที่ควรทราบ:** เนื่องจากไม่มีซอร์สของ `NodePointer`, `ValueUtils`, `AbstractFactory`, `JXPathContext`, `QName` ให้ในโจทย์ จึงต้องอ้างอิง public API ที่เป็นที่รู้จักทั่วไปของ Apache Commons JXPath ในบางจุด (ได้ comment ไว้ในโค้ดทุกจุดที่มีความไม่แน่นอน) หากพบว่า signature จริงต่างจากที่สมมติ อาจต้องปรับ test double ให้ตรงกับ source จริงของโปรเจกต์