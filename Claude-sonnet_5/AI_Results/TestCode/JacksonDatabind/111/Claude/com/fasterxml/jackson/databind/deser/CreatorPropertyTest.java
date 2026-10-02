package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;

/**
 * JUnit4 test suite for {@link CreatorProperty} (Defects4J JacksonDatabind-111b).
 *
 * หมายเหตุสมมติฐาน (เนื่องจาก source ของ SettableBeanProperty / PropertyMetadata
 * ไม่ได้ถูกให้มาโดยตรง):
 *  - ใช้ {@code PropertyMetadata.STD_REQUIRED} ซึ่งเป็น static field สาธารณะที่มีมาตั้งแต่
 *    jackson-databind 2.6+ (ไม่พบใน source ที่ให้มาโดยตรง แต่จำเป็นต้องใช้สร้าง instance)
 *  - เมธอด {@code deserialize(JsonParser, DeserializationContext)} ที่ถูก inherit มาจาก
 *    SettableBeanProperty ไม่ได้อยู่ใน source ที่ให้มา จึงใช้ Mockito.spy() เพื่อ stub
 *    เมธอดนี้โดยตรง แทนการเดา internal logic ของมัน
 */
public class CreatorPropertyTest {

    private Annotations mockAnnotations;
    private AnnotatedParameter mockAnnotatedParam;
    private JavaType stringType;

    @Before
    public void setUp() {
        mockAnnotations = mock(Annotations.class);
        mockAnnotatedParam = mock(AnnotatedParameter.class);
        stringType = TypeFactory.defaultInstance().constructType(String.class);
    }

    /** Helper เพื่อสร้าง CreatorProperty พื้นฐาน */
    private CreatorProperty createProperty(String name, Object injectableId,
            AnnotatedParameter param, int index, PropertyMetadata metadata) {
        PropertyName pname = new PropertyName(name);
        return new CreatorProperty(pname, stringType, null, null,
                mockAnnotations, param, index, injectableId, metadata);
    }

    private CreatorProperty createDefault() {
        return createProperty("foo", null, mockAnnotatedParam, 0, PropertyMetadata.STD_REQUIRED);
    }

    // ---------------------------------------------------------------
    // Constructor / basic getters
    // ---------------------------------------------------------------

    @Test
    public void testConstructorAndBasicGetters() {
        CreatorProperty prop = createProperty("fieldA", "injId", mockAnnotatedParam, 3,
                PropertyMetadata.STD_REQUIRED);

        assertEquals("fieldA", prop.getName());
        assertEquals(3, prop.getCreatorIndex());
        assertEquals("injId", prop.getInjectableValueId());
        assertSame(mockAnnotatedParam, prop.getMember());
        assertFalse(prop.isIgnorable()); // default false
    }

    @Test
    public void testGetInjectableValueId_null() {
        CreatorProperty prop = createDefault(); // injectableId = null
        assertNull(prop.getInjectableValueId());
    }

    // ---------------------------------------------------------------
    // withName()
    // ---------------------------------------------------------------

    @Test
    public void testWithName_createsNewInstanceWithNewNamePreservingOtherFields() {
        CreatorProperty original = createProperty("oldName", "inj1", mockAnnotatedParam, 5,
                PropertyMetadata.STD_REQUIRED);
        original.markAsIgnorable();

        SettableBeanProperty renamed = original.withName(new PropertyName("newName"));

        assertNotSame(original, renamed);
        assertTrue(renamed instanceof CreatorProperty);
        assertEquals("newName", renamed.getName());
        assertEquals(5, ((CreatorProperty) renamed).getCreatorIndex());
        assertEquals("inj1", renamed.getInjectableValueId());
        assertTrue(((CreatorProperty) renamed).isIgnorable()); // _ignorable ต้อง copy มาด้วย
        assertSame(mockAnnotatedParam, renamed.getMember());
    }

    // ---------------------------------------------------------------
    // withValueDeserializer()
    // ---------------------------------------------------------------

    @Test
    public void testWithValueDeserializer_sameInstance_returnsThis() {
        CreatorProperty prop = createDefault();
        // _valueDeserializer เริ่มต้นเป็น null -> ส่ง null เข้าไปต้อง "เท่ากัน" จึงได้ this คืน
        SettableBeanProperty result = prop.withValueDeserializer(null);
        assertSame(prop, result);
    }

    @Test
    public void testWithValueDeserializer_differentInstance_returnsNewCreatorProperty() {
        CreatorProperty prop = createDefault();
        JsonDeserializer<?> deser = mock(JsonDeserializer.class);

        SettableBeanProperty result = prop.withValueDeserializer(deser);

        assertNotSame(prop, result);
        assertTrue(result instanceof CreatorProperty);
        // ตรวจสอบว่า field อื่น ๆ ถูก copy มาด้วย
        assertEquals(prop.getCreatorIndex(), ((CreatorProperty) result).getCreatorIndex());
        assertEquals(prop.getInjectableValueId(), result.getInjectableValueId());
    }

    // ---------------------------------------------------------------
    // withNullProvider()
    // ---------------------------------------------------------------

    @Test
    public void testWithNullProvider_returnsNewCreatorPropertyInstance() {
        CreatorProperty prop = createDefault();
        NullValueProvider nvp = mock(NullValueProvider.class);

        SettableBeanProperty result = prop.withNullProvider(nvp);

        assertNotSame(prop, result);
        assertTrue(result instanceof CreatorProperty);
    }

    // ---------------------------------------------------------------
    // fixAccess()
    // ---------------------------------------------------------------

    @Test
    public void testFixAccess_withFallbackSetter_delegates() {
        CreatorProperty prop = createDefault();
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        prop.setFallbackSetter(fallback);

        DeserializationConfig config = mock(DeserializationConfig.class);
        prop.fixAccess(config);

        verify(fallback, times(1)).fixAccess(config);
    }

    @Test
    public void testFixAccess_withoutFallbackSetter_isNoOp() {
        CreatorProperty prop = createDefault(); // _fallbackSetter == null
        DeserializationConfig config = mock(DeserializationConfig.class);
        // ไม่ควร throw exception ใด ๆ
        prop.fixAccess(config);
    }

    // ---------------------------------------------------------------
    // setFallbackSetter / markAsIgnorable / isIgnorable
    // ---------------------------------------------------------------

    @Test
    public void testSetFallbackSetter() throws Exception {
        CreatorProperty prop = createDefault();
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        prop.setFallbackSetter(fallback);

        // ตรวจสอบ indirect ผ่าน set()
        Object instance = new Object();
        Object value = "someValue";
        prop.set(instance, value);
        verify(fallback, times(1)).set(instance, value);
    }

    @Test
    public void testMarkAsIgnorable_togglesIsIgnorable() {
        CreatorProperty prop = createDefault();
        assertFalse(prop.isIgnorable());
        prop.markAsIgnorable();
        assertTrue(prop.isIgnorable());
    }

    // ---------------------------------------------------------------
    // findInjectableValue()
    // ---------------------------------------------------------------

    @Test(expected = RuntimeException.class)
    public void testFindInjectableValue_nullInjectableId_reportsBadDefinition() throws Exception {
        CreatorProperty prop = createDefault(); // injectableId == null
        DeserializationContext ctx = mock(DeserializationContext.class);
        Object beanInstance = new Object();

        // simulate ว่า reportBadDefinition (ของจริง) จะ throw exception
        when(ctx.reportBadDefinition(any(Class.class), anyString()))
                .thenThrow(new RuntimeException("Simulated bad definition"));

        prop.findInjectableValue(ctx, beanInstance);
    }

    @Test
    public void testFindInjectableValue_withInjectableId_delegatesToContext() throws Exception {
        CreatorProperty prop = createProperty("foo", "injectId", mockAnnotatedParam, 0,
                PropertyMetadata.STD_REQUIRED);
        DeserializationContext ctx = mock(DeserializationContext.class);
        Object beanInstance = new Object();

        when(ctx.findInjectableValue(eq("injectId"), eq(prop), eq(beanInstance)))
                .thenReturn("resolvedValue");

        Object result = prop.findInjectableValue(ctx, beanInstance);

        assertEquals("resolvedValue", result);
        verify(ctx, never()).reportBadDefinition(any(Class.class), anyString());
    }

    // ---------------------------------------------------------------
    // inject()
    // ---------------------------------------------------------------

    @Test
    public void testInject_findsValueAndCallsSetThroughFallback() throws Exception {
        CreatorProperty prop = createProperty("foo", "injId", mockAnnotatedParam, 0,
                PropertyMetadata.STD_REQUIRED);
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        prop.setFallbackSetter(fallback);

        DeserializationContext ctx = mock(DeserializationContext.class);
        Object beanInstance = new Object();
        when(ctx.findInjectableValue(eq("injId"), eq(prop), eq(beanInstance)))
                .thenReturn("injectedVal");

        prop.inject(ctx, beanInstance);

        verify(fallback, times(1)).set(beanInstance, "injectedVal");
    }

    // ---------------------------------------------------------------
    // getAnnotation()
    // ---------------------------------------------------------------

    @Test
    public void testGetAnnotation_annotatedNull_returnsNull() {
        CreatorProperty prop = createProperty("foo", null, null, 0, PropertyMetadata.STD_REQUIRED);
        assertNull(prop.getAnnotation(Deprecated.class));
    }

    @Test
    public void testGetAnnotation_delegatesToAnnotatedParameter() {
        Deprecated ann = mock(Deprecated.class);
        when(mockAnnotatedParam.getAnnotation(Deprecated.class)).thenReturn(ann);

        CreatorProperty prop = createProperty("foo", null, mockAnnotatedParam, 0,
                PropertyMetadata.STD_REQUIRED);

        assertSame(ann, prop.getAnnotation(Deprecated.class));
    }

    // ---------------------------------------------------------------
    // getMember() / getCreatorIndex()
    // ---------------------------------------------------------------

    @Test
    public void testGetMember() {
        CreatorProperty prop = createProperty("foo", null, mockAnnotatedParam, 7,
                PropertyMetadata.STD_REQUIRED);
        assertSame(mockAnnotatedParam, prop.getMember());
        assertEquals(7, prop.getCreatorIndex());
    }

    // ---------------------------------------------------------------
    // set() / setAndReturn() — with & without fallback setter
    // ---------------------------------------------------------------

    @Test
    public void testSet_withFallbackSetter_delegates() throws Exception {
        CreatorProperty prop = createDefault();
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        prop.setFallbackSetter(fallback);

        Object instance = new Object();
        prop.set(instance, "val");

        verify(fallback).set(instance, "val");
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testSet_withoutFallbackSetter_throwsInvalidDefinitionException() throws Exception {
        CreatorProperty prop = createDefault(); // _fallbackSetter == null
        prop.set(new Object(), "val");
    }

    @Test
    public void testSetAndReturn_withFallbackSetter_delegatesAndReturnsValue() throws Exception {
        CreatorProperty prop = createDefault();
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        Object instance = new Object();
        when(fallback.setAndReturn(instance, "val")).thenReturn("returnedVal");
        prop.setFallbackSetter(fallback);

        Object result = prop.setAndReturn(instance, "val");

        assertEquals("returnedVal", result);
        verify(fallback).setAndReturn(instance, "val");
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testSetAndReturn_withoutFallbackSetter_throwsInvalidDefinitionException() throws Exception {
        CreatorProperty prop = createDefault();
        prop.setAndReturn(new Object(), "val");
    }

    // ---------------------------------------------------------------
    // deserializeAndSet() / deserializeSetAndReturn()
    //   -- ใช้ spy เพื่อ stub deserialize() เนื่องจากเมธอดนี้ inherit มาจาก
    //      SettableBeanProperty ซึ่งไม่ได้อยู่ใน source ที่ให้มา
    // ---------------------------------------------------------------

    @Test
    public void testDeserializeAndSet_withFallbackSetter_callsSetWithDeserializedValue()
            throws Exception {
        CreatorProperty prop = createDefault();
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        prop.setFallbackSetter(fallback);

        CreatorProperty spyProp = spy(prop);
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctx = mock(DeserializationContext.class);
        Object instance = new Object();

        doReturn("deserializedValue").when(spyProp).deserialize(parser, ctx);

        spyProp.deserializeAndSet(parser, ctx, instance);

        verify(fallback, times(1)).set(instance, "deserializedValue");
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testDeserializeAndSet_withoutFallbackSetter_throwsInvalidDefinitionException()
            throws Exception {
        CreatorProperty prop = createDefault(); // _fallbackSetter == null
        CreatorProperty spyProp = spy(prop);
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctx = mock(DeserializationContext.class);

        // ไม่ควรไปถึง deserialize() เลย เพราะ _verifySetter() throw ก่อน
        spyProp.deserializeAndSet(parser, ctx, new Object());
    }

    @Test
    public void testDeserializeSetAndReturn_withFallbackSetter_returnsFallbackResult()
            throws Exception {
        CreatorProperty prop = createDefault();
        SettableBeanProperty fallback = mock(SettableBeanProperty.class);
        prop.setFallbackSetter(fallback);

        CreatorProperty spyProp = spy(prop);
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctx = mock(DeserializationContext.class);
        Object instance = new Object();

        doReturn("desVal").when(spyProp).deserialize(parser, ctx);
        when(fallback.setAndReturn(instance, "desVal")).thenReturn("finalResult");

        Object result = spyProp.deserializeSetAndReturn(parser, ctx, instance);

        assertEquals("finalResult", result);
        verify(fallback).setAndReturn(instance, "desVal");
    }

    @Test(expected = InvalidDefinitionException.class)
    public void testDeserializeSetAndReturn_withoutFallbackSetter_throwsInvalidDefinitionException()
            throws Exception {
        CreatorProperty prop = createDefault();
        CreatorProperty spyProp = spy(prop);
        JsonParser parser = mock(JsonParser.class);
        DeserializationContext ctx = mock(DeserializationContext.class);

        spyProp.deserializeSetAndReturn(parser, ctx, new Object());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    public void testToString_containsNameAndInjectId() {
        CreatorProperty prop = createProperty("myProp", "myInjId", mockAnnotatedParam, 0,
                PropertyMetadata.STD_REQUIRED);

        String result = prop.toString();

        assertEquals("[creator property, name 'myProp'; inject id 'myInjId']", result);
    }

    @Test
    public void testToString_withNullInjectId() {
        CreatorProperty prop = createDefault(); // injectableId = null

        String result = prop.toString();

        assertEquals("[creator property, name 'foo'; inject id 'null']", result);
    }
}
