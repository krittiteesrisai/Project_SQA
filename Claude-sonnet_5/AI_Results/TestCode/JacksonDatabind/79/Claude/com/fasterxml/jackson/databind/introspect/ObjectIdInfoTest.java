package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;

/**
 * Unit tests for {@link ObjectIdInfo}.
 *
 * หมายเหตุ:
 * - ObjectIdGenerator และ ObjectIdResolver เป็น abstract class/interface
 *   จึงใช้ concrete implementation ที่มีอยู่จริงใน jackson-annotations
 *   (ObjectIdGenerators.IntSequenceGenerator) สำหรับ generator
 *   และเขียน DummyResolver แบบง่าย ๆ สำหรับ resolver ที่ไม่ใช่ null/default
 */
public class ObjectIdInfoTest {

    // ---------- Dummy implementations used only for testing ----------

    /**
     * Resolver แบบ dummy ที่ไม่ใช่ SimpleObjectIdResolver
     * เพื่อพิสูจน์ว่า constructor ไม่ได้ override resolver ที่ไม่เป็น null
     */
    public static class DummyResolver implements ObjectIdResolver {
        @Override
        public void bindItem(ObjectIdGenerator.IdKey id, Object pojo) {
            // no-op
        }

        @Override
        public Object resolveId(ObjectIdGenerator.IdKey id) {
            return null;
        }

        @Override
        public ObjectIdResolver newForDeserialization(Object context) {
            return this;
        }

        @Override
        public boolean canUseFor(ObjectIdResolver resolverType) {
            return false;
        }
    }

    private static final Class<? extends ObjectIdGenerator<?>> GEN_TYPE =
            ObjectIdGenerators.IntSequenceGenerator.class;

    // ==========================================================
    // 1) Public constructor: (name, scope, gen, resolver)
    //    -> delegate ไปยัง (name, scope, gen, false, resolver)
    // ==========================================================

    @Test
    public void testConstructor4Args_NonNullResolver_KeepsGivenResolver() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, DummyResolver.class);

        assertEquals(pn, info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(GEN_TYPE, info.getGeneratorType());
        assertEquals(DummyResolver.class, info.getResolverType());
        assertFalse("alwaysAsId ต้องเป็น false โดย default", info.getAlwaysAsId());
    }

    @Test
    public void testConstructor4Args_NullResolver_DefaultsToSimpleObjectIdResolver() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, null);

        // ตรวจ branch: if (resolver == null) resolver = SimpleObjectIdResolver.class;
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    // ==========================================================
    // 2) Deprecated constructor: (name, scope, gen)
    //    -> delegate ไปยัง (name, scope, gen, false)
    //    -> protected ctor (prop, scope, gen, alwaysAsId)
    //    -> เรียก ctor resolver=SimpleObjectIdResolver.class เสมอ
    // ==========================================================

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructor3Args_PropertyName() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE);

        assertEquals(pn, info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(GEN_TYPE, info.getGeneratorType());
        assertFalse(info.getAlwaysAsId());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    // ==========================================================
    // 3) Deprecated constructor: (String name, scope, gen)
    //    -> ต้องแปลง String -> PropertyName
    // ==========================================================

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructorStringName_WrapsIntoPropertyName() {
        ObjectIdInfo info = new ObjectIdInfo("id", Object.class, GEN_TYPE);

        assertEquals(new PropertyName("id"), info.getPropertyName());
        assertEquals(Object.class, info.getScope());
        assertEquals(GEN_TYPE, info.getGeneratorType());
        assertFalse(info.getAlwaysAsId());
        assertEquals(SimpleObjectIdResolver.class, info.getResolverType());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testDeprecatedConstructorStringName_EmptyString() {
        // boundary case: empty string name
        ObjectIdInfo info = new ObjectIdInfo("", Object.class, GEN_TYPE);
        assertEquals(new PropertyName(""), info.getPropertyName());
    }

    // ==========================================================
    // 4) withAlwaysAsId(state)
    //    - branch: state == _alwaysAsId -> return this (same instance)
    //    - branch: state != _alwaysAsId -> return new instance with new state
    // ==========================================================

    @Test
    public void testWithAlwaysAsId_SameState_ReturnsSameInstance() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, DummyResolver.class);
        // info.getAlwaysAsId() == false อยู่แล้ว (default)
        ObjectIdInfo result = info.withAlwaysAsId(false);

        assertSame("เมื่อ state เท่ากับค่าเดิม ต้อง return this", info, result);
    }

    @Test
    public void testWithAlwaysAsId_DifferentState_ReturnsNewInstanceWithUpdatedValue() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, DummyResolver.class);

        ObjectIdInfo result = info.withAlwaysAsId(true);

        assertNotSame("เมื่อ state ต่างจากเดิม ต้อง return instance ใหม่", info, result);
        assertTrue(result.getAlwaysAsId());
        // ค่าอื่น ๆ ต้องคงเดิม
        assertEquals(info.getPropertyName(), result.getPropertyName());
        assertEquals(info.getScope(), result.getScope());
        assertEquals(info.getGeneratorType(), result.getGeneratorType());
        assertEquals(info.getResolverType(), result.getResolverType());
    }

    @Test
    public void testWithAlwaysAsId_ToggleTwice_ReturnsToOriginalState() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, DummyResolver.class);

        ObjectIdInfo toggled = info.withAlwaysAsId(true);
        ObjectIdInfo toggledBack = toggled.withAlwaysAsId(false);

        assertNotSame(info, toggled);
        assertNotSame(toggled, toggledBack);
        assertFalse(toggledBack.getAlwaysAsId());
    }

    // ==========================================================
    // 5) Getters
    // ==========================================================

    @Test
    public void testGetters_ReturnCorrectValues() {
        PropertyName pn = new PropertyName("myId");
        ObjectIdInfo info = new ObjectIdInfo(pn, String.class, GEN_TYPE, DummyResolver.class);

        assertEquals(pn, info.getPropertyName());
        assertEquals(String.class, info.getScope());
        assertEquals(GEN_TYPE, info.getGeneratorType());
        assertEquals(DummyResolver.class, info.getResolverType());
        assertFalse(info.getAlwaysAsId());
    }

    @Test
    public void testGetters_NullScopeAndGenerator() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, null, null, DummyResolver.class);

        assertNull(info.getScope());
        assertNull(info.getGeneratorType());
        assertEquals(pn, info.getPropertyName());
    }

    // ==========================================================
    // 6) toString()
    //    - branch: scope == null vs scope != null
    //    - branch: generator == null vs generator != null
    // ==========================================================

    @Test
    public void testToString_WithNonNullScopeAndGenerator() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, DummyResolver.class);

        String s = info.toString();

        assertTrue(s.contains("propName=" + pn));
        assertTrue("ต้องแสดง scope name เมื่อ scope ไม่เป็น null",
                s.contains("scope=" + Object.class.getName()));
        assertTrue("ต้องแสดง generator name เมื่อ generator ไม่เป็น null",
                s.contains("generatorType=" + GEN_TYPE.getName()));
        assertTrue(s.contains("alwaysAsId=false"));
    }

    @Test
    public void testToString_WithNullScopeAndNullGenerator() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, null, null, DummyResolver.class);

        String s = info.toString();

        assertTrue("ต้องแสดง 'null' เมื่อ scope เป็น null", s.contains("scope=null"));
        assertTrue("ต้องแสดง 'null' เมื่อ generator เป็น null", s.contains("generatorType=null"));
    }

    @Test
    public void testToString_AfterWithAlwaysAsId_ReflectsNewState() {
        PropertyName pn = new PropertyName("id");
        ObjectIdInfo info = new ObjectIdInfo(pn, Object.class, GEN_TYPE, DummyResolver.class)
                .withAlwaysAsId(true);

        String s = info.toString();
        assertTrue(s.contains("alwaysAsId=true"));
    }
}
