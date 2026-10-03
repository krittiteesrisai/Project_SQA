package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.EnumValues;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.EnumSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class EnumSerializerTest {

    private ObjectMapper objectMapper;

    private enum TestEnum {
        FIRST, SECOND;
        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    @Before
    public void setUp() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testConstructAndGetEnumValues() {
        SerializationConfig config = objectMapper.getSerializationConfig();
        BeanDescription beanDesc = objectMapper.getSerializationConfig().introspect(objectMapper.constructType(TestEnum.class));
        
        JsonFormat.Value format = JsonFormat.Value.forShape(JsonFormat.Shape.STRING);
        EnumSerializer serializer = EnumSerializer.construct(TestEnum.class, config, beanDesc, format);
        
        assertNotNull(serializer);
        assertNotNull(serializer.getEnumValues());
    }

    @Test
    public void testShapeWrittenUsingIndex_EdgeCases() {
        // Test null format and null shape
        EnumSerializer serializer = EnumSerializer.construct(TestEnum.class, objectMapper.getSerializationConfig(), null, null);
        assertNotNull(serializer);

        // Test Shape.ANY and Shape.SCALAR
        JsonFormat.Value formatAny = JsonFormat.Value.forShape(JsonFormat.Shape.ANY);
        EnumSerializer serAny = EnumSerializer.construct(TestEnum.class, objectMapper.getSerializationConfig(), null, formatAny);
        assertNotNull(serAny);

        JsonFormat.Value formatScalar = JsonFormat.Value.forShape(JsonFormat.Shape.SCALAR);
        EnumSerializer serScalar = EnumSerializer.construct(TestEnum.class, objectMapper.getSerializationConfig(), null, formatScalar);
        assertNotNull(serScalar);

        // Test Shape.NATURAL
        JsonFormat.Value formatNatural = JsonFormat.Value.forShape(JsonFormat.Shape.NATURAL);
        EnumSerializer serNatural = EnumSerializer.construct(TestEnum.class, objectMapper.getSerializationConfig(), null, formatNatural);
        assertNotNull(serNatural);

        // Test Shape.ARRAY
        JsonFormat.Value formatArray = JsonFormat.Value.forShape(JsonFormat.Shape.ARRAY);
        EnumSerializer serArray = EnumSerializer.construct(TestEnum.class, objectMapper.getSerializationConfig(), null, formatArray);
        assertNotNull(serArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnsupportedShapeClassAnnotation() {
        // Shape.OBJECT is not supported, triggers exception with fromClass = true
        JsonFormat.Value formatObject = JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT);
        EnumSerializer.construct(TestEnum.class, objectMapper.getSerializationConfig(), null, formatObject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnsupportedShapePropertyAnnotation() throws Exception {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        EnumSerializer serializer = new EnumSerializer(v, null);

        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        BeanProperty property = mock(BeanProperty.class);
        JavaType type = objectMapper.constructType(TestEnum.class);
        when(property.getType()).thenReturn(type);

        JsonFormat.Value formatObject = JsonFormat.Value.forShape(JsonFormat.Shape.OBJECT);
        // Mock findFormatOverrides via contextual setup or direct call if accessible; 
        // since findFormatOverrides requires a provider, we test via createContextual with mocked property
        // But findFormatOverrides calls AnnotationIntrospector. Let's test _isShapeWrittenUsingIndex via exception handling on property annotation:
        // We can invoke createContextual with a property that returns OBJECT shape via annotation or mock.
        // Actually, let's call helper or use a mock AnnotationIntrospector if needed. 
        // Simpler way: trigger through createContextual by mocking property and annotation introspector or using actual config if possible.
        // Alternatively, invoke directly via subclass or reflection if needed, but since it's protected static, we can test via standard API call if annotation introspector returns it.
        // Let's force an exception by mocking SerializerProvider/BeanProperty if findFormatOverrides evaluates it.
        // To be safe and direct on the branch:
        // We can create an anonymous subclass or just rely on an unsupported shape configuration.
        // Let's invoke a condition where fromClass = false:
        // Since findFormatOverrides uses AnnotationIntrospector, let's mock it:
        AnnotationIntrospector ai = mock(AnnotationIntrospector.class);
        when(ai.findFormat(any())).thenReturn(formatObject);
        SerializationConfig cfg = objectMapper.getSerializationConfig().with(ai);
        SerializerProvider sp = objectMapper.getSerializerProviderInstance().createInstance(cfg, objectMapper.getSerializationConfig(), objectMapper.getSerializerFactory());
        
        serializer.createContextual(sp, property);
    }

    @Test
    public void testCreateContextualBranches() throws Exception {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        EnumSerializer serializer = new EnumSerializer(v, null);

        // property == null -> returns 'this'
        JsonSerializer<?> resultNullProp = serializer.createContextual(objectMapper.getSerializerProviderInstance(), null);
        assertSame(serializer, resultNullProp);

        // property != null but format == null
        BeanProperty property = mock(BeanProperty.class);
        JavaType type = objectMapper.constructType(TestEnum.class);
        when(property.getType()).thenReturn(type);
        
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();
        JsonSerializer<?> resultNoFormat = serializer.createContextual(provider, property);
        assertNotNull(resultNoFormat);
    }

    @Test
    public void testSerializeAsIndex() throws Exception {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        EnumSerializer serializer = new EnumSerializer(v, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = objectMapper.getFactory().createGenerator(sw);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        serializer.serialize(TestEnum.SECOND, gen, provider);
        gen.flush();
        assertEquals("1", sw.toString());
    }

    @Test
    public void testSerializeUsingToString() throws Exception {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        EnumSerializer serializer = new EnumSerializer(v, Boolean.FALSE);

        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = customMapper.getFactory().createGenerator(sw);
        SerializerProvider provider = customMapper.getSerializerProviderInstance();

        serializer.serialize(TestEnum.FIRST, gen, provider);
        gen.flush();
        assertEquals("\"first\"", sw.toString()); // TestEnum.toString() returns lower case
    }

    @Test
    public void testSerializeDefaultName() throws Exception {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        EnumSerializer serializer = new EnumSerializer(v, Boolean.FALSE);

        StringWriter sw = new StringWriter();
        JsonGenerator gen = objectMapper.getFactory().createGenerator(sw);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        serializer.serialize(TestEnum.FIRST, gen, provider);
        gen.flush();
        assertEquals("\"FIRST\"", sw.toString());
    }

    @Test
    public void testGetSchemaBranches() {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        // As index = true
        EnumSerializer serIndex = new EnumSerializer(v, Boolean.TRUE);
        com.fasterxml.jackson.databind.JsonNode schemaIndex = serIndex.getSchema(provider, null);
        assertNotNull(schemaIndex);

        // As index = false with typeHint != null and isEnumType()
        EnumSerializer serString = new EnumSerializer(v, Boolean.FALSE);
        Type typeHint = TestEnum.class;
        JsonNode schemaString = serString.getSchema(provider, typeHint);
        assertNotNull(schemaString);
        assertTrue(schemaString instanceof ObjectNode);
    }

    @Test
    public void testAcceptJsonFormatVisitorBranches() throws JsonMappingException {
        EnumValues v = EnumValues.constructFromName(objectMapper.getSerializationConfig(), TestEnum.class);
        SerializerProvider provider = objectMapper.getSerializerProviderInstance();

        JsonFormatVisitorWrapper visitor = mock(JsonFormatVisitorWrapper.class);
        when(visitor.getProvider()).thenReturn(provider);

        // Branch 1: _serializeAsIndex = true
        EnumSerializer serIndex = new EnumSerializer(v, Boolean.TRUE);
        serIndex.acceptJsonFormatVisitor(visitor, objectMapper.constructType(TestEnum.class));
        verify(visitor, times(1)).expectIntFormat(any(), eq(JsonParser.NumberType.INT));

        // Branch 2: _serializeAsIndex = false, WRITE_ENUMS_USING_TO_STRING = true
        ObjectMapper customMapper = new ObjectMapper();
        customMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
        SerializerProvider customProvider = customMapper.getSerializerProviderInstance();
        
        JsonFormatVisitorWrapper visitorToString = mock(JsonFormatVisitorWrapper.class);
        when(visitorToString.getProvider()).thenReturn(customProvider);
        JsonStringFormatVisitor stringVisitor = mock(JsonStringFormatVisitor.class);
        when(visitorToString.expectStringFormat(any())).thenReturn(stringVisitor);

        EnumSerializer serString = new EnumSerializer(v, Boolean.FALSE);
        serString.acceptJsonFormatVisitor(visitorToString, objectMapper.constructType(TestEnum.class));
        verify(stringVisitor, times(1)).enumTypes(any());

        // Branch 3: stringVisitor == null
        JsonFormatVisitorWrapper visitorNullString = mock(JsonFormatVisitorWrapper.class);
        when(visitorNullString.getProvider()).thenReturn(provider);
        when(visitorNullString.expectStringFormat(any())).thenReturn(null);
        serString.acceptJsonFormatVisitor(visitorNullString, objectMapper.constructType(TestEnum.class));
    }
}