package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class DefaultDeserializationContextTest {

    private DefaultDeserializationContext context;
    private ObjectMapper objectMapper;

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
        DeserializationContext baseContext = objectMapper.getDeserializationContext();
        // สร้าง Impl ผ่าน ObjectMapper เสมือนใช้งานจริง
        context = new DefaultDeserializationContext.Impl(objectMapper.getDeserializationConfig().getDeserializerFactory());
    }

    @Test
    public void testCopy_Success() {
        DefaultDeserializationContext copied = context.copy();
        assertNotNull(copied);
        assertNotSame(context, copied);
    }

    @Test(expected = IllegalStateException.class)
    public void testCopy_SubclassNotOverriding() {
        DefaultDeserializationContext customSubclass = new DefaultDeserializationContext(
                objectMapper.getDeserializationConfig().getDeserializerFactory(), null) {
            @Override
            public DefaultDeserializationContext with(DeserializerFactory factory) {
                return null;
            }

            @Override
            public DefaultDeserializationContext createInstance(DeserializationConfig config, JsonParser jp, InjectableValues values) {
                return null;
            }
        };
        // เรียก copy บนคลาสย่อยที่ไม่ได้ Override ควรจะโยน IllegalStateException จาก base implementation
        customSubclass.copy();
    }

    @Test
    public void testFindObjectId_NewAndCached() {
        ObjectIdGenerator<String> gen = new ObjectIdGenerator<String>() {
            @Override public Class<?> getScope() { return Object.class; }
            @Override public boolean canUseFor(ObjectIdGenerator<?> gen) { return true; }
            @Override public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }
            @Override public IdKey key(Object key) { return new IdKey(getClass(), getScope(), key); }
            @Override public Object generateId(Object forPojo) { return "id1"; }
        };

        ObjectIdResolver resolver = new SimpleObjectIdResolver();

        // ครั้งแรก: สร้างใหม่
        ReadableObjectId roid1 = context.findObjectId("test-id", gen, resolver);
        assertNotNull(roid1);

        // ครั้งที่สอง: ดึงจาก Cache (Branch entry != null)
        ReadableObjectId roid2 = context.findObjectId("test-id", gen, resolver);
        assertSame(roid1, roid2);
    }

    @Test
    public void testFindObjectId_DeprecatedMethod() {
        ObjectIdGenerator<String> gen = new ObjectIdGenerator<String>() {
            @Override public Class<?> getScope() { return Object.class; }
            @Override public boolean canUseFor(ObjectIdGenerator<?> gen) { return true; }
            @Override public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }
            @Override public IdKey key(Object key) { return new IdKey(getClass(), getScope(), key); }
            @Override public Object generateId(Object forPojo) { return "id2"; }
        };

        ReadableObjectId roid = context.findObjectId("test-id-deprecated", gen);
        assertNotNull(roid);
    }

    @Test
    public void testCheckUnresolvedObjectId_NullObjectIds() throws Exception {
        // กรณี _objectIds ยังเป็น null ไม่ควรเกิด Exception ใดๆ
        context.checkUnresolvedObjectId();
    }

    @Test
    public void testCheckUnresolvedObjectId_FeatureDisabled() throws Exception {
        ObjectIdGenerator<String> gen = new ObjectIdGenerator<String>() {
            @Override public Class<?> getScope() { return Object.class; }
            @Override public boolean canUseFor(ObjectIdGenerator<?> gen) { return true; }
            @Override public ObjectIdGenerator<String> forScope(Class<?> scope) { return this; }
            @Override public IdKey key(Object key) { return new IdKey(getClass(), getScope(), key); }
            @Override public Object generateId(Object forPojo) { return "id3"; }
        };
        context.findObjectId("unresolved", gen, new SimpleObjectIdResolver());
        
        // ปิดฟีเจอร์ FAIL_ON_UNRESOLVED_OBJECT_IDS
        DeserializationConfig config = objectMapper.getDeserializationConfig()
                .without(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        
        DefaultDeserializationContext customCtx = context.createInstance(config, null, null);
        customCtx.findObjectId("unresolved", gen, new SimpleObjectIdResolver());
        customCtx.checkUnresolvedObjectId(); // ควรผ่านโดยไม่โยน Exception
    }

    @Test
    public void testDeserializerInstance_Null() throws Exception {
        assertNull(context.deserializerInstance(null, null));
    }

    @Test
    public void testDeserializerInstance_DirectInstance() throws Exception {
        JsonDeserializer<Object> dummyDeser = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return "dummy";
            }
        };
        JsonDeserializer<Object> result = context.deserializerInstance(null, dummyDeser);
        assertSame(dummyDeser, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_InvalidType() throws Exception {
        // ส่ง Object ที่ไม่ใช่ทั้ง JsonDeserializer หรือ Class
        context.deserializerInstance(null, new Object());
    }

    @Test
    public void testDeserializerInstance_NoneClass() throws Exception {
        assertNull(context.deserializerInstance(null, JsonDeserializer.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testDeserializerInstance_NotAssignable() throws Exception {
        // ส่ง Class ที่ไม่ได้สืบทอดมาจาก JsonDeserializer
        context.deserializerInstance(null, String.class);
    }

    @Test
    public void testKeyDeserializerInstance_Null() throws Exception {
        assertNull(context.keyDeserializerInstance(null, null));
    }

    @Test
    public void testKeyDeserializerInstance_DirectInstance() throws Exception {
        KeyDeserializer dummyKeyDeser = new KeyDeserializer() {
            @Override
            public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException {
                return key;
            }
        };
        KeyDeserializer result = context.keyDeserializerInstance(null, dummyKeyDeser);
        assertSame(dummyKeyDeser, result);
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_InvalidType() throws Exception {
        context.keyDeserializerInstance(null, new Object());
    }

    @Test
    public void testKeyDeserializerInstance_NoneClass() throws Exception {
        assertNull(context.keyDeserializerInstance(null, KeyDeserializer.None.class));
    }

    @Test(expected = IllegalStateException.class)
    public void testKeyDeserializerInstance_NotAssignable() throws Exception {
        context.keyDeserializerInstance(null, String.class);
    }

    @Test
    public void testWithAndCreateInstance() {
        DeserializerFactory newFactory = objectMapper.getDeserializationConfig().getDeserializerFactory();
        DefaultDeserializationContext newContext = context.with(newFactory);
        assertNotNull(newContext);

        DefaultDeserializationContext createdInstance = context.createInstance(
                objectMapper.getDeserializationConfig(), null, null);
        assertNotNull(createdInstance);
    }
}