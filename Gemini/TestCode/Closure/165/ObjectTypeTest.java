package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ObjectTypeTest {

    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        // ใช้ Constructor พื้นฐานของ JSTypeRegistry ตามที่มีในโปรเจกต์
        registry = new JSTypeRegistry(null, null);
    }

    // --- Helper Stub classes สำหรับทดสอบ Abstract Methods ---
    private static class TestObjectType extends ObjectType {
        private String referenceName;
        private ObjectType implicitPrototype;
        private FunctionType constructor;
        private boolean nativeObject = false;

        public TestObjectType(JSTypeRegistry registry, String referenceName, ObjectType implicitPrototype) {
            super(registry);
            this.referenceName = referenceName;
            this.implicitPrototype = implicitPrototype;
        }

        public void setNativeObject(boolean nativeObject) {
            this.nativeObject = nativeObject;
        }

        @Override
        public Property getSlot(String name) { return null; }

        @Override
        public String getReferenceName() { return referenceName; }

        @Override
        public FunctionType getConstructor() { return constructor; }

        @Override
        public ObjectType getImplicitPrototype() { return implicitPrototype; }

        @Override
        boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) {
            return true;
        }

        @Override
        public JSType getPropertyType(String propertyName) { return null; }

        @Override
        public boolean hasProperty(String propertyName) { return false; }

        @Override
        public boolean isPropertyTypeInferred(String propertyName) { return false; }

        @Override
        public boolean isPropertyTypeDeclared(String propertyName) { return false; }

        @Override
        public int getPropertiesCount() { return 0; }

        @Override
        void collectPropertyNames(Set<String> props) {}

        @Override
        public boolean isNativeObjectType() { return nativeObject; }
    }

    @Test
    public void testNormalizedReferenceNameEdges() {
        TestObjectType nullNameObj = new TestObjectType(registry, null, null);
        assertNull("Null reference name should return null", nullNameObj.getNormalizedReferenceName());

        TestObjectType normalObj = new TestObjectType(registry, "MyConstructor", null);
        assertEquals("Normal name should remain unchanged", "MyConstructor", normalObj.getNormalizedReferenceName());

        TestObjectType delegateObj = new TestObjectType(registry, "MyConstructor(Delegate)", null);
        assertEquals("Delegate name should be stripped at '('", "MyConstructor", delegateObj.getNormalizedReferenceName());

        assertEquals("Create delegate suffix utility", "(Proxy)", ObjectType.createDelegateSuffix("Proxy"));
    }

    @Test
    public void testDetectImplicitPrototypeCycleFalse() {
        // Linear chain: A -> B -> null (No cycle)
        TestObjectType objB = new TestObjectType(registry, "B", null);
        TestObjectType objA = new TestObjectType(registry, "A", objB);

        assertFalse("Should not detect cycle in a linear prototype chain", objA.detectImplicitPrototypeCycle());
    }

    @Test
    public void testDetectImplicitPrototypeCycleTrue() {
        // Cyclic chain: A -> B -> A (Cycle!)
        TestObjectType objA = new TestObjectType(registry, "A", null);
        TestObjectType objB = new TestObjectType(registry, "B", objA);
        objA.implicitPrototype = objB; // สร้าง Cycle ทางอ้อม

        assertTrue("Should successfully detect implicit prototype cycle", objA.detectImplicitPrototypeCycle());
    }

    @Test
    public void testGetJSDocInfoHierarchy() {
        TestObjectType objC = new TestObjectType(registry, "C", null);
        JSDocInfo infoC = new JSDocInfo();
        objC.setJSDocInfo(infoC);

        // 1. Own docInfo is present
        assertEquals("Should return own docInfo", infoC, objC.getJSDocInfo());

        // 2. Own docInfo is null, fallback to prototype's docInfo
        TestObjectType objChild = new TestObjectType(registry, "Child", objC);
        assertEquals("Should fallback to prototype's docInfo", infoC, objChild.getJSDocInfo());

        // 3. Both null -> super.getJSDocInfo() (null)
        TestObjectType objEmpty = new TestObjectType(registry, "Empty", null);
        assertNull("Should return null when no docInfo exists anywhere in chain", objEmpty.getJSDocInfo());
    }

    @Test
    public void testIsUnknownTypeBranches() {
        // Test case: implicitProto == null or native object
        TestObjectType nativeObj = new TestObjectType(registry, "Native", null);
        nativeObj.setNativeObject(true);
        assertTrue("Native or null proto object handles unknown evaluation", nativeObj.isUnknownType());

        // Test case: implicitProto is present and not native
        TestObjectType protoObj = new TestObjectType(registry, "Proto", null);
        TestObjectType childObj = new TestObjectType(registry, "Child", protoObj);
        assertTrue("Unknown state propagates from implicit proto", childObj.isUnknownType());
    }

    @Test
    public void testCastUtility() {
        assertNull("Casting null JSType should return null", ObjectType.cast(null));
    }

    @Test
    public void testPropertyEdgeCasesWithNullNode() {
        // ทดสอบ Property Inner class เมื่อ Node เป็น null (Edge Case ปกป้อง NullPointerException)
        ObjectType.Property prop = new ObjectType.Property("testProp", null, false, null);

        assertEquals("testProp", prop.getName());
        assertNull(prop.getNode());
        assertNull(prop.getSourceFile());
        assertEquals(prop, prop.getSymbol());
        assertNull(prop.getDeclaration());
        assertNull(prop.getJSDocInfo());
        assertFalse(prop.isFromExterns());

        // Test setters
        prop.setJSDocInfo(new JSDocInfo());
        assertNotNull(prop.getJSDocInfo());

        Node dummyNode = new Node(Token.BLOCK);
        prop.setNode(dummyNode);
        assertEquals(dummyNode, prop.getNode());
    }
}