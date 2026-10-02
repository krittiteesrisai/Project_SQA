package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;

/**
 * Unit test สำหรับ {@link DefaultDeserializationContext}
 * ทดสอบผ่านคลาส concrete {@link DefaultDeserializationContext.Impl}
 */
public class DefaultDeserializationContextTest
{
    // ------------------------------------------------------------------
    // Helper test doubles
    // ------------------------------------------------------------------

    /** ObjectIdGenerator ที่ควบคุมได้เต็มที่สำหรับทดสอบ key() */
    static class TestIdGenerator extends ObjectIdGenerator<Object> {
        private static final long serialVersionUID = 1L;
        private final Class<?> scope;
        TestIdGenerator(Class<?> scope) { this.scope = scope; }
        @Override public Class<?> getScope() { return scope; }
        @Override public boolean canUseFor(ObjectIdGenerator<?> gen) { return false; }
        @Override public ObjectIdGenerator<Object> forScope(Class<?> scope) { return this; }
        @Override public ObjectIdGenerator<Object> newForSerialization(Object context) { return this; }
        @Override public IdKey key(Object key) { return new IdKey(getClass(), scope, key); }
        @Override public Object generateId(Object forPojo) { return null; }
    }

    /** ObjectIdResolver ที่ควบคุม canUseFor ได้ และนับจำนวนครั้งที่ newForDeserialization ถูกเรียก */
    static class TestResolver implements ObjectIdResolver {
        final boolean canUseForAny;
        int newForDeserializationCalls = 0;
        TestResolver(boolean canUseForAny) { this.canUseForAny = canUseForAny; }
        @Override public void bindItem(IdKey id, Object pojo) { }
        @Override public Object resolveId(IdKey id) { return null; }
        @Override public ObjectIdResolver newForDeserialization(Object context) {
            newForDeserializationCalls++;
            return this;
        }
        @Override public boolean canUseFor(ObjectIdResolver resolverType) { return canUseForAny; }
    }

    public static class SimpleDeser extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
    }

    public static class ResolvableDeser extends JsonDeserializer<Object> implements ResolvableDeserializer {
        boolean resolved = false;
        @Override
        public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            return null;
        }
        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            resolved = true;
        }
    }

    public static class SimpleKeyDeser extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
            return key;
        }
    }

    public static class ResolvableKeyDeser extends KeyDeserializer implements ResolvableDeserializer {
        boolean resolved = false;
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
            return key;
        }
        @Override
        public void resolve(DeserializationContext ctxt) throws JsonMappingException {
            resolved = true;
        }
    }

    /** subclass ของ base abstract class ที่ไม่ override copy() -> ใช้ทดสอบ base.copy() */
    static class MinimalContext extends DefaultDeserializationContext {
        private static final long serialVersionUID = 1L;
        protected MinimalContext(DeserializerFactory df) { super(df, null); }
        @Override
        public DefaultDeserializationContext with(DeserializerFactory factory) { return null; }
        @Override
        public DefaultDeserializationContext createInstance(DeserializationConfig config,
                JsonParser jp, InjectableValues values) { return null; }
    }

    /** subclass ของ Impl ที่ไม่ override copy() -> ใช้ทดสอบ Impl.copy() เมื่อ getClass()!=Impl.class */
    static class ImplSubclass extends DefaultDeserializationContext.Impl {
        private static final long serialVersionUID = 1L;
        protected ImplSubclass(DeserializerFactory df) { super(df); }
    }

    // ------------------------------------------------------------------
    // Helpers
    // ------------------------------------------------------------------

    private DefaultDeserializationContext.Impl newBlueprint() {
        return new DefaultDeserializationContext.Impl(BeanDeserializerFactory.instance);
    }

    private DefaultDeserializationContext newFullContext(ObjectMapper mapper) throws IOException {
        JsonParser p = mapper.getFactory().createParser("{}");
        return newBlueprint().createInstance(mapper.getDeserializationConfig(), p, null);
    }

    private DefaultDeserializationContext newFullContext() throws IOException {
        return newFullContext(new ObjectMapper());
    }

    // ==================================================================
    // findObjectId(Object, ObjectIdGenerator, ObjectIdResolver)
    // ==================================================================

    @Test
    public void testFindObjectId_firstCall_createsEntryAndResolver() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);
        TestResolver resolverType = new TestResolver(false);

        ReadableObjectId roid = ctxt.findObjectId(1, gen, resolverType);

        assertNotNull(roid);
        assertEquals(1, resolverType.newForDeserializationCalls);
    }

    @Test
    public void testFindObjectId_sameKeyReturnsSameEntry() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);
        TestResolver resolverType = new TestResolver(false);

        ReadableObjectId roid1 = ctxt.findObjectId(5, gen, resolverType);
        ReadableObjectId roid2 = ctxt.findObjectId(5, gen, resolverType);

        // key ซ้ำกัน -> ต้อง return entry เดิม (early-return branch)
        assertSame(roid1, roid2);
        // ไม่ควรสร้าง resolver ใหม่อีกครั้งเพราะ short-circuit ก่อนถึง resolver-lookup
        assertEquals(1, resolverType.newForDeserializationCalls);
    }

    @Test
    public void testFindObjectId_existingResolverMatches_reused() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);

        TestResolver resolverA = new TestResolver(true); // canUseFor -> true เสมอ
        ctxt.findObjectId(10, gen, resolverA); // สร้าง entry แรก, list=[resolverA]

        TestResolver resolverB = new TestResolver(false);
        ReadableObjectId roid2 = ctxt.findObjectId(20, gen, resolverB); // key ต่างกัน

        assertNotNull(roid2);
        // resolverA.canUseFor(resolverB)==true -> reuse, resolverB.newForDeserialization ไม่ถูกเรียก
        assertEquals(0, resolverB.newForDeserializationCalls);
    }

    @Test
    public void testFindObjectId_existingResolverNoMatch_createsNewResolver() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);

        TestResolver resolverA = new TestResolver(false); // canUseFor -> false เสมอ
        ctxt.findObjectId(30, gen, resolverA);

        TestResolver resolverB = new TestResolver(false);
        ctxt.findObjectId(40, gen, resolverB);

        // ไม่มี resolver ใน list match -> ต้องสร้าง resolverB ใหม่ (newForDeserialization ถูกเรียก)
        assertEquals(1, resolverB.newForDeserializationCalls);
    }

    @Test
    public void testFindObjectId_multipleResolvers_loopContinuesUntilMatch() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);

        TestResolver resolverA = new TestResolver(false);
        ctxt.findObjectId(100, gen, resolverA); // list=[A]

        TestResolver resolverB = new TestResolver(true);
        ctxt.findObjectId(200, gen, resolverB); // A ไม่ match -> สร้าง B ใหม่ -> list=[A,B]

        TestResolver resolverC = new TestResolver(false);
        ctxt.findObjectId(300, gen, resolverC); // A ไม่ match, B match -> reuse B

        // resolverC ไม่ถูกสร้างเพราะ loop เจอ match ที่ B (การวนซ้ำผ่าน false แล้วเจอ true)
        assertEquals(0, resolverC.newForDeserializationCalls);
    }

    @Test
    public void testFindObjectId_withNullId_allowed() throws Exception {
        // ตาม comment ในซอร์ส: "should allow 'null', similar to how missing id already works"
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);
        ReadableObjectId roid = ctxt.findObjectId(null, gen, new SimpleObjectIdResolver());
        assertNotNull(roid);
    }

    // ==================================================================
    // findObjectId(Object, ObjectIdGenerator) - deprecated overload
    // ==================================================================

    @Test
    public void testFindObjectIdDeprecated_delegatesCorrectly() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        TestIdGenerator gen = new TestIdGenerator(Object.class);
        ReadableObjectId roid = ctxt.findObjectId(999, gen);
        assertNotNull(roid);
    }

    // ==================================================================
    // checkUnresolvedObjectId()
    // ==================================================================

    @Test
    public void testCheckUnresolvedObjectId_noObjectIds_returnsSilently() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        // _objectIds == null -> return ทันที ไม่ควร throw
        ctxt.checkUnresolvedObjectId();
    }

    @Test
    public void testCheckUnresolvedObjectId_featureDisabled_returnsSilently() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext ctxt = newFullContext(mapper);

        TestIdGenerator gen = new TestIdGenerator(Object.class);
        ctxt.findObjectId(1, gen, new SimpleObjectIdResolver()); // populate _objectIds

        // feature ปิดอยู่ -> ต้อง return ก่อน loop แม้ _objectIds != null
        ctxt.checkUnresolvedObjectId();
    }

    @Test
    public void testCheckUnresolvedObjectId_enabledButNoReferring_noException() throws Exception {
        // สมมติฐาน: ReadableObjectId ใหม่ (ยังไม่ถูก append referring property ใดๆ)
        // มี hasReferringProperties() == false โดย default ตามพฤติกรรมทั่วไปของคลาสนี้
        // (ไม่มีซอร์สโค้ดของ ReadableObjectId ให้ตรวจสอบตรงๆ จึงทดสอบผ่าน public behavior เท่าที่ทำได้)
        ObjectMapper mapper = new ObjectMapper(); // FAIL_ON_UNRESOLVED_OBJECT_IDS default = enabled
        DefaultDeserializationContext ctxt = newFullContext(mapper);

        TestIdGenerator gen = new TestIdGenerator(Object.class);
        ctxt.findObjectId(1, gen, new SimpleObjectIdResolver());

        // ไม่ควร throw เพราะไม่มี referring property ใดๆ ถูกตั้งค่า
        ctxt.checkUnresolvedObjectId();
    }

    // NOTE: การ throw UnresolvedForwardReference (branch ที่ hasReferringProperties()==true)
    // ไม่ได้ถูกทดสอบ เนื่องจากซอร์สโค้ดที่ให้มาไม่มี public API ของ ReadableObjectId
    // สำหรับตั้งค่า referring property จึงไม่สามารถ trigger branch นี้ได้โดยไม่เดา behavior

    // ==================================================================
    // deserializerInstance(Annotated, Object)
    // ==================================================================

    @Test
    public void testDeserializerInstance_nullDeserDef_returnsNull() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        assertNull(ctxt.deserializerInstance((Annotated) null, null));
    }

    @Test
    public void testDeserializerInstance_instanceGiven_returnedAsIs_noResolve() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        SimpleDeser instance = new SimpleDeser();
        JsonDeserializer<Object> result = ctxt.deserializerInstance((Annotated) null, instance);
        assertSame(instance, result);
    }

    @Test
    public void testDeserializerInstance_instanceGiven_resolvableCallsResolve() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        ResolvableDeser instance = new ResolvableDeser();
        JsonDeserializer<Object> result = ctxt.deserializerInstance((Annotated) null, instance);
        assertSame(instance, result);
        assertTrue(instance.resolved);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_invalidType_throwsIllegalState() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        ctxt.deserializerInstance((Annotated) null, "not-a-deserializer-or-class-of-it");
    }

    @Test
    public void testDeserializerInstance_noneClass_returnsNull() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        assertNull(ctxt.deserializerInstance((Annotated) null, JsonDeserializer.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_classNotAssignable_throwsIllegalState() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        ctxt.deserializerInstance((Annotated) null, String.class);
    }

    @Test
    public void testDeserializerInstance_classAssignable_createsInstance() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        JsonDeserializer<Object> result = ctxt.deserializerInstance((Annotated) null, SimpleDeser.class);
        assertNotNull(result);
        assertTrue(result instanceof SimpleDeser);
    }

    @Test
    public void testDeserializerInstance_classAssignableResolvable_resolveCalled() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        JsonDeserializer<Object> result = ctxt.deserializerInstance((Annotated) null, ResolvableDeser.class);
        assertTrue(result instanceof ResolvableDeser);
        assertTrue(((ResolvableDeser) result).resolved);
    }

    // ==================================================================
    // keyDeserializerInstance(Annotated, Object)
    // ==================================================================

    @Test
    public void testKeyDeserializerInstance_nullDeserDef_returnsNull() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        assertNull(ctxt.keyDeserializerInstance((Annotated) null, null));
    }

    @Test
    public void testKeyDeserializerInstance_instanceGiven_returnedAsIs() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        SimpleKeyDeser instance = new SimpleKeyDeser();
        KeyDeserializer result = ctxt.keyDeserializerInstance((Annotated) null, instance);
        assertSame(instance, result);
    }

    @Test
    public void testKeyDeserializerInstance_instanceGiven_resolvableCallsResolve() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        ResolvableKeyDeser instance = new ResolvableKeyDeser();
        KeyDeserializer result = ctxt.keyDeserializerInstance((Annotated) null, instance);
        assertSame(instance, result);
        assertTrue(instance.resolved);
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_invalidType_throwsIllegalState() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        ctxt.keyDeserializerInstance((Annotated) null, Integer.valueOf(42));
    }

    @Test
    public void testKeyDeserializerInstance_noneClass_returnsNull() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        assertNull(ctxt.keyDeserializerInstance((Annotated) null, KeyDeserializer.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_classNotAssignable_throwsIllegalState() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        ctxt.keyDeserializerInstance((Annotated) null, String.class);
    }

    @Test
    public void testKeyDeserializerInstance_classAssignable_createsInstance() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        KeyDeserializer result = ctxt.keyDeserializerInstance((Annotated) null, SimpleKeyDeser.class);
        assertNotNull(result);
        assertTrue(result instanceof SimpleKeyDeser);
    }

    @Test
    public void testKeyDeserializerInstance_classAssignableResolvable_resolveCalled() throws Exception {
        DefaultDeserializationContext ctxt = newFullContext();
        KeyDeserializer result = ctxt.keyDeserializerInstance((Annotated) null, ResolvableKeyDeser.class);
        assertTrue(result instanceof ResolvableKeyDeser);
        assertTrue(((ResolvableKeyDeser) result).resolved);
    }

    // ==================================================================
    // copy()
    // ==================================================================

    @Test(expected = IllegalStateException.class)
    public void testCopy_baseClassThrowsWhenNotOverridden() throws Exception {
        MinimalContext ctxt = new MinimalContext(BeanDeserializerFactory.instance);
        ctxt.copy();
    }

    @Test
    public void testCopy_implClass_returnsNewInstance() throws Exception {
        DefaultDeserializationContext.Impl ctxt = newBlueprint();
        DefaultDeserializationContext copy = ctxt.copy();
        assertNotNull(copy);
        assertNotSame(ctxt, copy);
        assertTrue(copy instanceof DefaultDeserializationContext.Impl);
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_implSubclassNotOverriding_throws() throws Exception {
        ImplSubclass ctxt = new ImplSubclass(BeanDeserializerFactory.instance);
        // getClass() != Impl.class -> ต้อง delegate ไป super.copy() ซึ่ง throw
        ctxt.copy();
    }

    // ==================================================================
    // createInstance() / with()
    // ==================================================================

    @Test
    public void testCreateInstance_returnsNewContext() throws Exception {
        DefaultDeserializationContext.Impl blueprint = newBlueprint();
        ObjectMapper mapper = new ObjectMapper();
        JsonParser p = mapper.getFactory().createParser("{}");
        DefaultDeserializationContext ctxt = blueprint.createInstance(
                mapper.getDeserializationConfig(), p, null);
        assertNotNull(ctxt);
        assertNotSame(blueprint, ctxt);
        assertTrue(ctxt instanceof DefaultDeserializationContext.Impl);
    }

    @Test
    public void testWith_returnsNewContextWithFactory() throws Exception {
        DefaultDeserializationContext.Impl blueprint = newBlueprint();
        DefaultDeserializationContext ctxt2 = blueprint.with(BeanDeserializerFactory.instance);
        assertNotNull(ctxt2);
        assertNotSame(blueprint, ctxt2);
        assertTrue(ctxt2 instanceof DefaultDeserializationContext.Impl);
    }
}
