package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class SerializerProviderTest {

    private SerializerProvider provider;

    @Before
    public void setUp() {
        // ใช้ DefaultSerializerProvider.Impl สำหรับสร้าง instance จริงที่ใช้งานได้
        ObjectMapper mapper = new ObjectMapper();
        provider = mapper.getSerializerProviderInstance();
    }

    // --- Tests for Setter Validation (Edge Cases: Null checks) ---

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultKeySerializer_Null() {
        provider.setDefaultKeySerializer(null);
    }

    @Test
    public void testSetDefaultKeySerializer_Valid() {
        JsonSerializer<Object> dummySerializer = new UnknownSerializer();
        provider.setDefaultKeySerializer(dummySerializer);
        assertEquals(dummySerializer, provider._keySerializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullValueSerializer_Null() {
        provider.setNullValueSerializer(null);
    }

    @Test
    public void testSetNullValueSerializer_Valid() {
        JsonSerializer<Object> dummySerializer = new UnknownSerializer();
        provider.setNullValueSerializer(dummySerializer);
        assertEquals(dummySerializer, provider._nullValueSerializer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullKeySerializer_Null() {
        provider.setNullKeySerializer(null);
    }

    @Test
    public void testSetNullKeySerializer_Valid() {
        JsonSerializer<Object> dummySerializer = new UnknownSerializer();
        provider.setNullKeySerializer(dummySerializer);
        assertEquals(dummySerializer, provider._nullKeySerializer);
    }

    // --- Tests for isUnknownTypeSerializer Branch Coverage ---

    @Test
    public void testIsUnknownTypeSerializer_WithNull() {
        assertTrue("Null serializer should be recognized as unknown", 
                provider.isUnknownTypeSerializer(null));
    }

    @Test
    public void testIsUnknownTypeSerializer_WithDefaultUnknown() {
        JsonSerializer<Object> unknownSer = provider.getUnknownTypeSerializer(Object.class);
        assertTrue("Default unknown serializer should be recognized", 
                provider.isUnknownTypeSerializer(unknownSer));
    }

    @Test
    public void testIsUnknownTypeSerializer_FailOnEmptyBeans() {
        // เปิด Feature FAIL_ON_EMPTY_BEANS และทดสอบ UnknownSerializer ธรรมดา
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        SerializerProvider customProvider = mapper.getSerializerProviderInstance();
        
        JsonSerializer<?> emptyBeanSer = new UnknownSerializer(String.class);
        assertTrue("UnknownSerializer with FAIL_ON_EMPTY_BEANS should be recognized",
                customProvider.isUnknownTypeSerializer(emptyBeanSer));
    }

    @Test
    public void testIsUnknownTypeSerializer_FalseBranch() {
        JsonSerializer<Object> normalSer = new com.fasterxml.jackson.databind.ser.std.ToStringSerializer();
        assertFalse("Standard serializer should not be recognized as unknown", 
                provider.isUnknownTypeSerializer(normalSer));
    }

    // --- Tests for _reportIncompatibleRootType Branch Coverage ---

    @Test
    public void testReportIncompatibleRootType_PrimitiveCoercionSuccess() throws Exception {
        JavaType primitiveIntType = TypeFactory.defaultInstance().constructType(int.class);
        // ส่ง Integer wrapper มาเทียบกับ primitive int ควรผ่านโดยไม่โยน Exception
        invokeReportIncompatibleRootType(Integer.valueOf(5), primitiveIntType);
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testReportIncompatibleRootType_IncompatibleThrowsException() throws Throwable {
        JavaType primitiveIntType = TypeFactory.defaultInstance().constructType(int.class);
        // ส่ง String มาเทียบกับ primitive int ควรโยน InvalidDefinitionException
        try {
            invokeReportIncompatibleRootType("not-an-int", primitiveIntType);
        } catch (java.lang.reflect.InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    // Helper method เพื่อเรียก protected method _reportIncompatibleRootType ผ่าน Reflection
    private void invokeReportIncompatibleRootType(Object value, JavaType rootType) throws Exception {
        java.lang.reflect.Method method = SerializerProvider.class.getDeclaredMethod(
                "_reportIncompatibleRootType", Object.class, JavaType.class);
        method.setAccessible(true);
        method.invoke(provider, value, rootType);
    }

    // --- Minimal Concrete Subclass for Blueprint / Abstract testing if needed ---
    @Test
    public void testBlueprintConstructor() {
        SerializerProvider blueprint = new ConcreteBlueprintSerializerProvider();
        assertNull(blueprint.getConfig());
    }

    private static class ConcreteBlueprintSerializerProvider extends SerializerProvider {
        public ConcreteBlueprintSerializerProvider() {
            super();
        }
        @Override
        public WritableObjectId findObjectId(Object forPojo, ObjectIdGenerator<?> generatorType) {
            return null;
        }
        @Override
        public JsonSerializer<Object> serializerInstance(Annotated annotated, Object serDef) {
            return null;
        }
        @Override
        public Object includeFilterInstance(BeanPropertyDefinition forProperty, Class<?> filterClass) {
            return null;
        }
        @Override
        public boolean includeFilterSuppressNulls(Object filter) {
            return false;
        }
    }
}