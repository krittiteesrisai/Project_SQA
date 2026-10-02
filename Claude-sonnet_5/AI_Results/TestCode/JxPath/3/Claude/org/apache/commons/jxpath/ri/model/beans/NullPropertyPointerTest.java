package org.apache.commons.jxpath.ri.model.beans;

// import ที่จำเป็น (import ซ้ำคลาสเป้าหมาย ตามข้อกำหนด แม้จะอยู่ package เดียวกัน)
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ชุดทดสอบสำหรับ {@link NullPropertyPointer}
 *
 * สมมติฐานที่ใช้ (เนื่องจาก NodePointer / PropertyPointer / PropertyOwnerPointer
 * ไม่ได้ถูกให้มาในซอร์สโค้ดต้นฉบับ แต่ถูกอ้างอิงใน NullPropertyPointer):
 *  - NodePointer มี constructor ที่รับ (NodePointer parent)
 *  - NodePointer มีเมธอด public: isContainer(), createPath(ctx), createPath(ctx,value),
 *    createChild(ctx,name,idx), createChild(ctx,name,idx,value), createAttribute(ctx,name),
 *    asPath(), getImmediateParentPointer()  -> public เพราะถูกเรียกข้าม package จาก
 *    NullPropertyPointer (package .beans) ไปยัง object ชนิด NodePointer (package .model)
 *  - PropertyPointer มี constructor (NodePointer parent), field/constant WHOLE_COLLECTION,
 *    getIndex()/setIndex(int) (อนุมานจากการใช้ getIndex()/index แบบไม่ qualify ในซอร์ส)
 *  - PropertyOwnerPointer มี constructor (NodePointer parent),
 *    getPropertyPointer(), isDynamicPropertyDeclarationSupported()
 *  - NullPointer มี constructor (NodePointer parent, QName name) – ยืนยันได้จากซอร์สจริง
 *  - QName มี constructor (String name) และเมธอด getName() – ยืนยันได้จากซอร์สจริง
 *
 * ข้อจำกัดที่ทราบ: ไม่มี public API ใดในซอร์สที่ให้มาเพื่อกำหนด isAttribute()=true
 * จึงไม่สามารถทดสอบ branch isAttribute()==true ใน createPath()/createPath(ctx,value) ได้
 * (ถูกข้ามโดยเจตนาและมีคอมเมนต์กำกับในแต่ละเทสที่เกี่ยวข้อง)
 */
public class NullPropertyPointerTest {

    private JXPathContext context;

    @Before
    public void setUp() {
        context = JXPathContext.newContext(new Object());
    }

    // =========================================================
    // Stub classes (test doubles)
    // =========================================================

    /** Stub ทั่วไปของ NodePointer สำหรับควบคุม isContainer()/asPath()/createPath()/createChild() */
    static class StubNodePointer extends NodePointer {
        boolean containerFlag;
        String asPathValue = "/stub";
        NodePointer createPathResult;
        NodePointer childResult;

        boolean createChildCalled = false;
        boolean createChildWithValueCalled = false;
        boolean createAttributeCalled = false;
        QName lastChildName;
        int lastChildIndex;
        Object lastChildValue;

        StubNodePointer(NodePointer parent, boolean containerFlag) {
            super(parent);
            this.containerFlag = containerFlag;
        }

        public boolean isContainer() {
            return containerFlag;
        }

        public String asPath() {
            return asPathValue;
        }

        public QName getName() {
            return new QName("stub");
        }

        public Object getBaseValue() {
            return null;
        }

        public Object getImmediateNode() {
            return null;
        }

        public boolean isLeaf() {
            return true;
        }

        public boolean isActual() {
            return true;
        }

        public NodePointer createPath(JXPathContext ctx) {
            return createPathResult != null ? createPathResult : this;
        }

        public NodePointer createPath(JXPathContext ctx, Object value) {
            return createPathResult != null ? createPathResult : this;
        }

        public NodePointer createChild(JXPathContext ctx, QName name, int index) {
            createChildCalled = true;
            lastChildName = name;
            lastChildIndex = index;
            return childResult != null ? childResult : this;
        }

        public NodePointer createChild(JXPathContext ctx, QName name, int index, Object value) {
            createChildWithValueCalled = true;
            lastChildName = name;
            lastChildIndex = index;
            lastChildValue = value;
            return childResult != null ? childResult : this;
        }

        public NodePointer createAttribute(JXPathContext ctx, QName name) {
            createAttributeCalled = true;
            lastChildName = name;
            return childResult != null ? childResult : this;
        }
    }

    /** Stub ของ PropertyOwnerPointer สำหรับ branch "dynamic property declaration" */
    static class StubPropertyOwnerPointer extends PropertyOwnerPointer {
        boolean containerFlag;
        boolean dynamicSupported;
        PropertyPointer propertyPointerToReturn;
        NodePointer createPathResult;

        StubPropertyOwnerPointer(NodePointer parent, boolean containerFlag, boolean dynamicSupported) {
            super(parent);
            this.containerFlag = containerFlag;
            this.dynamicSupported = dynamicSupported;
        }

        public boolean isContainer() {
            return containerFlag;
        }

        public boolean isDynamicPropertyDeclarationSupported() {
            return dynamicSupported;
        }

        public PropertyPointer getPropertyPointer() {
            return propertyPointerToReturn;
        }

        public QName getName() {
            return new QName("owner");
        }

        public Object getBaseValue() {
            return null;
        }

        public Object getImmediateNode() {
            return null;
        }

        public boolean isLeaf() {
            return true;
        }

        public boolean isActual() {
            return true;
        }

        public NodePointer createPath(JXPathContext ctx) {
            return createPathResult != null ? createPathResult : this;
        }

        public NodePointer createPath(JXPathContext ctx, Object value) {
            return createPathResult != null ? createPathResult : this;
        }

        public String asPath() {
            return "/owner";
        }
    }

    /** Stub ของ PropertyPointer สำหรับตรวจสอบการ delegate ของ setValue()/createChild() */
    static class StubPropertyPointer extends PropertyPointer {
        String propertyNameSet;
        Object valueSet;
        boolean setValueCalled = false;

        boolean createChildCalled = false;
        boolean createChildWithValueCalled = false;
        QName lastChildName;
        int lastChildIndex;
        Object lastChildValue;

        StubPropertyPointer(NodePointer parent) {
            super(parent);
        }

        public String getPropertyName() {
            return propertyNameSet;
        }

        public void setPropertyName(String propertyName) {
            this.propertyNameSet = propertyName;
        }

        public void setValue(Object value) {
            this.valueSet = value;
            this.setValueCalled = true;
        }

        public Object getBaseValue() {
            return null;
        }

        public int getLength() {
            return 0;
        }

        public boolean isCollection() {
            return false;
        }

        public int getPropertyCount() {
            return 0;
        }

        public String[] getPropertyNames() {
            return new String[0];
        }

        public void setPropertyIndex(int index) {
        }

        protected boolean isActualProperty() {
            return true;
        }

        public QName getName() {
            return new QName(propertyNameSet == null ? "x" : propertyNameSet);
        }

        public Object getImmediateNode() {
            return null;
        }

        public boolean isLeaf() {
            return true;
        }

        public boolean isActual() {
            return true;
        }

        public NodePointer createPath(JXPathContext ctx) {
            return this;
        }

        public NodePointer createPath(JXPathContext ctx, Object value) {
            return this;
        }

        public NodePointer createChild(JXPathContext ctx, QName name, int index) {
            createChildCalled = true;
            lastChildName = name;
            lastChildIndex = index;
            return this;
        }

        public NodePointer createChild(JXPathContext ctx, QName name, int index, Object value) {
            createChildWithValueCalled = true;
            lastChildName = name;
            lastChildIndex = index;
            lastChildValue = value;
            return this;
        }
    }

    // =========================================================
    // 1) Default state / simple getters
    // =========================================================

    @Test
    public void testDefaultPropertyNameAndName() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        assertEquals("*", p.getPropertyName());
        assertEquals("*", p.getName().getName());
    }

    @Test
    public void testSetGetPropertyName() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setPropertyName("foo");
        assertEquals("foo", p.getPropertyName());
        assertEquals("foo", p.getName().getName());
    }

    @Test
    public void testSetPropertyIndexIsNoOp() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setPropertyIndex(5);
        p.setPropertyIndex(-1);
        p.setPropertyIndex(Integer.MAX_VALUE);
        // ไม่มีผลข้างเคียงที่สังเกตได้ - ตรวจสอบว่าไม่ throw และค่าที่เกี่ยวข้องยังคงเดิม
        assertEquals(0, p.getPropertyCount());
    }

    @Test
    public void testConstantReturnValues() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        assertEquals(0, p.getLength());
        assertNull(p.getBaseValue());
        assertNull(p.getImmediateNode());
        assertTrue(p.isLeaf());
        assertFalse(p.isActual());
        assertTrue(p.isContainer());
        assertEquals(0, p.getPropertyCount());
        assertEquals(0, p.getPropertyNames().length);
    }

    @Test
    public void testIsAttribute_defaultFalse() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        assertFalse(p.isAttribute());
        // หมายเหตุ: ไม่มีทางกำหนด isAttribute()=true จาก public API ในซอร์สที่ให้มา
        // จึงไม่ทดสอบ branch isAttribute()==true ใน createPath()
    }

    @Test
    public void testGetValuePointerReturnsNullPointerWithCurrentPropertyName() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setPropertyName("abc");
        NodePointer vp = p.getValuePointer();
        assertTrue(vp instanceof NullPointer);
        // สมมติฐาน: NullPointer เก็บชื่อที่รับมาและคืนผ่าน getName()
        assertEquals("abc", vp.getName().getName());
    }

    // =========================================================
    // 2) isCollection() - boundary WHOLE_COLLECTION
    // =========================================================

    @Test
    public void testIsCollection_defaultIndexWholeCollection_returnsFalse() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        assertFalse(p.isCollection());
    }

    @Test
    public void testIsCollection_explicitWholeCollection_returnsFalse() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setIndex(PropertyPointer.WHOLE_COLLECTION);
        assertFalse(p.isCollection());
    }

    @Test
    public void testIsCollection_indexSet_returnsTrue() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setIndex(2);
        assertTrue(p.isCollection());
    }

    // =========================================================
    // 3) asPath() - byNameAttribute == false (default)
    // =========================================================

    @Test
    public void testAsPath_defaultSuperImplementation_doesNotThrow() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setPropertyName("abc");
        // ไม่ assert รูปแบบ string ตรง ๆ เพราะ super.asPath() ไม่ได้ให้มาในซอร์ส (หลีกเลี่ยงการเดา)
        String path = p.asPath();
        assertNotNull(path);
    }

    // =========================================================
    // 4) asPath() - byNameAttribute == true (ตรวจตาม logic ที่ให้มาตรง ๆ)
    // =========================================================

    @Test
    public void testAsPath_withNameAttribute_noIndex() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("simple");
        assertEquals("/root[@name='simple']", p.asPath());
    }

    @Test
    public void testAsPath_withNameAttribute_andIndex() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("simple");
        p.setIndex(3);
        assertEquals("/root[@name='simple'][4]", p.asPath());
    }

    @Test
    public void testAsPath_escape_noQuotes_loopNotEntered() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("plain");
        assertEquals("/root[@name='plain']", p.asPath());
    }

    @Test
    public void testAsPath_escape_onlySingleQuote() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("it's");
        assertEquals("/root[@name='it&apos;s']", p.asPath());
    }

    @Test
    public void testAsPath_escape_onlyDoubleQuote() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("a\"b");
        assertEquals("/root[@name='a&quot;b']", p.asPath());
    }

    @Test
    public void testAsPath_escape_multipleSingleQuotes_loopIteratesMultipleTimes() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("a'b'c");
        assertEquals("/root[@name='a&apos;b&apos;c']", p.asPath());
    }

    @Test
    public void testAsPath_escape_bothSingleAndDoubleQuotes() {
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.asPathValue = "/root";
        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setNameAttributeValue("it's \"quoted\"");
        assertEquals("/root[@name='it&apos;s &quot;quoted&quot;']", p.asPath());
    }

    // =========================================================
    // 5) setValue() - ทุก branch
    // =========================================================

    @Test
    public void testSetValue_parentNull_throws() {
        NullPropertyPointer p = new NullPropertyPointer(null);
        try {
            p.setValue("x");
            fail("คาดว่าต้อง throw JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("Cannot set property"));
        }
    }

    @Test
    public void testSetValue_parentIsContainer_throws() {
        StubNodePointer parent = new StubNodePointer(null, true); // isContainer() = true
        NullPropertyPointer p = new NullPropertyPointer(parent);
        try {
            p.setValue("x");
            fail("คาดว่าต้อง throw JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("the target object is null"));
        }
    }

    @Test
    public void testSetValue_dynamicPropertyOwner_delegatesToPropertyPointer() {
        StubPropertyPointer childPointer = new StubPropertyPointer(null);
        StubPropertyOwnerPointer parent = new StubPropertyOwnerPointer(null, false, true);
        parent.propertyPointerToReturn = childPointer;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("dynProp");
        p.setValue("hello");

        assertEquals("dynProp", childPointer.propertyNameSet);
        assertTrue(childPointer.setValueCalled);
        assertEquals("hello", childPointer.valueSet);
    }

    @Test
    public void testSetValue_propertyOwnerWithoutDynamicSupport_throws() {
        StubPropertyOwnerPointer parent = new StubPropertyOwnerPointer(null, false, false);
        NullPropertyPointer p = new NullPropertyPointer(parent);
        try {
            p.setValue("x");
            fail("คาดว่าต้อง throw JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("does not match a changeable location"));
        }
    }

    @Test
    public void testSetValue_plainParentNotPropertyOwner_throws() {
        StubNodePointer parent = new StubNodePointer(null, false); // ไม่ใช่ PropertyOwnerPointer, isContainer=false
        NullPropertyPointer p = new NullPropertyPointer(parent);
        try {
            p.setValue("x");
            fail("คาดว่าต้อง throw JXPathInvalidAccessException");
        } catch (JXPathInvalidAccessException e) {
            assertTrue(e.getMessage().contains("does not match a changeable location"));
        }
    }

    // =========================================================
    // 6) createPath(context) - ทุก branch (ยกเว้น isAttribute()==true ตามที่ระบุไว้)
    // =========================================================

    @Test
    public void testCreatePath_newParentIsPropertyOwnerPointer_usesItsPropertyPointer() {
        StubPropertyPointer propPointer = new StubPropertyPointer(null);
        StubPropertyOwnerPointer createdParent = new StubPropertyOwnerPointer(null, false, false);
        createdParent.propertyPointerToReturn = propPointer;

        StubNodePointer parent = new StubNodePointer(null, false);
        parent.createPathResult = createdParent;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("x");

        NodePointer result = p.createPath(context);

        assertTrue(propPointer.createChildCalled);
        assertEquals("x", propPointer.lastChildName.getName());
        assertSame(propPointer, result);
    }

    @Test
    public void testCreatePath_newParentNotPropertyOwnerPointer_callsCreateChildDirectly() {
        StubNodePointer createdParent = new StubNodePointer(null, false);
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.createPathResult = createdParent;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("y");

        NodePointer result = p.createPath(context);

        assertTrue(createdParent.createChildCalled);
        assertEquals("y", createdParent.lastChildName.getName());
        assertSame(createdParent, result);
    }

    // =========================================================
    // 7) createPath(context, value) - ทุก branch
    // =========================================================

    @Test
    public void testCreatePathWithValue_newParentIsPropertyOwnerPointer() {
        StubPropertyPointer propPointer = new StubPropertyPointer(null);
        StubPropertyOwnerPointer createdParent = new StubPropertyOwnerPointer(null, false, false);
        createdParent.propertyPointerToReturn = propPointer;

        StubNodePointer parent = new StubNodePointer(null, false);
        parent.createPathResult = createdParent;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("z");
        p.setIndex(1);

        p.createPath(context, "val");

        assertTrue(propPointer.createChildWithValueCalled);
        assertEquals("val", propPointer.lastChildValue);
        assertEquals(1, propPointer.lastChildIndex);
    }

    @Test
    public void testCreatePathWithValue_newParentNotPropertyOwnerPointer() {
        StubNodePointer createdParent = new StubNodePointer(null, false);
        StubNodePointer parent = new StubNodePointer(null, false);
        parent.createPathResult = createdParent;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("w");

        p.createPath(context, "val2");

        assertTrue(createdParent.createChildWithValueCalled);
        assertEquals("val2", createdParent.lastChildValue);
    }

    // =========================================================
    // 8) createChild(...) - delegate ผ่าน createPath(context)
    // =========================================================

    @Test
    public void testCreateChild_delegatesToCreatePathThenCreateChild() {
        StubNodePointer childResultPointer = new StubNodePointer(null, false);
        StubNodePointer createdParent = new StubNodePointer(null, false);
        createdParent.childResult = childResultPointer;

        StubNodePointer parent = new StubNodePointer(null, false);
        parent.createPathResult = createdParent;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("c");

        QName childName = new QName("child");
        NodePointer result = p.createChild(context, childName, 0);

        assertTrue(createdParent.createChildCalled);
        assertSame(childResultPointer, result);
    }

    @Test
    public void testCreateChildWithValue_delegatesToCreatePathThenCreateChild() {
        StubNodePointer childResultPointer = new StubNodePointer(null, false);
        StubNodePointer createdParent = new StubNodePointer(null, false);
        createdParent.childResult = childResultPointer;

        StubNodePointer parent = new StubNodePointer(null, false);
        parent.createPathResult = createdParent;

        NullPropertyPointer p = new NullPropertyPointer(parent);
        p.setPropertyName("c2");

        QName childName = new QName("child2");
        NodePointer result = p.createChild(context, childName, 0, "val3");

        assertTrue(createdParent.createChildWithValueCalled);
        assertEquals("val3", createdParent.lastChildValue);
        assertSame(childResultPointer, result);
    }

    // =========================================================
    // 9) setNameAttributeValue
    // =========================================================

    @Test
    public void testSetNameAttributeValue_setsPropertyName() {
        NullPropertyPointer p = new NullPropertyPointer(new StubNodePointer(null, false));
        p.setNameAttributeValue("attrVal");
        assertEquals("attrVal", p.getPropertyName());
        // byNameAttribute เป็น private - ตรวจสอบผลลัพธ์ผ่าน asPath() ในกลุ่มเทสด้านบนแล้ว
    }
}
