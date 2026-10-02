package com.fasterxml.jackson.databind;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper; // explicit import ตามข้อกำหนด (แม้จะอยู่ package เดียวกัน)
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ObjectMapperTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private ObjectMapper mapper;

    // ---------- Helper types ----------

    public static class SimpleBean implements Serializable {
        private static final long serialVersionUID = 1L;
        public int id;
        public String name;
        public SimpleBean() {}
        public SimpleBean(int id, String name) { this.id = id; this.name = name; }
    }

    public static class CloseableBean implements Closeable {
        public String value = "abc";
        private boolean closed = false;
        @Override
        public void close() throws IOException { closed = true; }
        public boolean isClosed() { return closed; }
    }

    private JavaType type(Class<?> c) {
        return TypeFactory.defaultInstance().constructType(c);
    }

    private void writeToFile(File f, String content) throws IOException {
        FileWriter w = new FileWriter(f);
        try { w.write(content); } finally { w.close(); }
    }

    private String readFile(File f) throws IOException {
        FileReader r = new FileReader(f);
        StringBuilder sb = new StringBuilder();
        int c;
        try {
            while ((c = r.read()) != -1) sb.append((char) c);
        } finally { r.close(); }
        return sb.toString();
    }

    private Module simpleModule(final String name) {
        return new Module() {
            @Override public String getModuleName() { return name; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) {}
        };
    }

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
    }

    // ==================================================================
    // Constructors / copy
    // ==================================================================

    @Test
    public void testDefaultConstructor() {
        assertNotNull(mapper.getFactory());
        assertNotNull(mapper.getSerializationConfig());
        assertNotNull(mapper.getDeserializationConfig());
    }

    @Test
    public void testConstructorWithJsonFactory() {
        JsonFactory jf = new JsonFactory();
        ObjectMapper m = new ObjectMapper(jf);
        assertSame(jf, m.getFactory());
        assertSame(m, jf.getCodec()); // covers jf.getCodec()==null branch
    }

    @Test
    public void testConstructorWithJsonFactory_CodecAlreadySet() {
        JsonFactory jf = new JsonFactory();
        ObjectMapper other = new ObjectMapper();
        jf.setCodec(other);
        ObjectMapper m = new ObjectMapper(jf); // codec != null -> skip setCodec branch
        assertSame(other, jf.getCodec());
        assertSame(jf, m.getFactory());
    }

    @Test
    public void testCopyConstructor() {
        mapper.addMixIn(String.class, Integer.class);
        ObjectMapper copy = mapper.copy();
        assertNotSame(mapper, copy);
        assertEquals(Integer.class, copy.findMixInClassFor(String.class));
    }

    // ==================================================================
    // registerModule / registerModules / findModules
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_NullName_Throws() {
        Module m = new Module() {
            @Override public String getModuleName() { return null; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) {}
        };
        mapper.registerModule(m);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRegisterModule_NullVersion_Throws() {
        Module m = new Module() {
            @Override public String getModuleName() { return "test-module"; }
            @Override public Version version() { return null; }
            @Override public void setupModule(SetupContext context) {}
        };
        mapper.registerModule(m);
    }

    @Test
    public void testRegisterModule_Success_AndSetupContextWiring() {
        Module m = new Module() {
            @Override public String getModuleName() { return "ok-module"; }
            @Override public Version version() { return Version.unknownVersion(); }
            @Override public void setupModule(SetupContext context) {
                context.setMixInAnnotations(SimpleBean.class, SimpleBean.class);
                assertTrue(context.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
                assertNotNull(context.getTypeFactory());
                assertEquals(mapper.version(), context.getMapperVersion());
            }
        };
        ObjectMapper result = mapper.registerModule(m);
        assertSame(mapper, result);
        assertEquals(SimpleBean.class, mapper.findMixInClassFor(SimpleBean.class));
    }

    @Test
    public void testRegisterModules_Varargs() {
        ObjectMapper result = mapper.registerModules(simpleModule("m1"), simpleModule("m2"));
        assertSame(mapper, result);
    }

    @Test
    public void testRegisterModules_Iterable() {
        List<Module> modules = new ArrayList<Module>();
        modules.add(simpleModule("m1"));
        modules.add(simpleModule("m2"));
        ObjectMapper result = mapper.registerModules(modules);
        assertSame(mapper, result);
    }

    @Test
    public void testFindModules() {
        // สมมติ: ไม่มี module ประกาศใน META-INF/services บน classpath ทดสอบ
        List<Module> modules = ObjectMapper.findModules();
        assertNotNull(modules);
    }

    @Test
    public void testFindAndRegisterModules() {
        ObjectMapper result = mapper.findAndRegisterModules();
        assertSame(mapper, result);
    }

    // ==================================================================
    // Mix-in annotations
    // ==================================================================

    @Test
    public void testMixInAnnotations_SetGetFind() {
        Map<Class<?>, Class<?>> mixins = new HashMap<Class<?>, Class<?>>();
        mixins.put(SimpleBean.class, Integer.class);
        mapper.setMixInAnnotations(mixins);
        assertEquals(Integer.class, mapper.findMixInClassFor(SimpleBean.class));
        assertEquals(1, mapper.mixInCount());
    }

    @Test
    public void testMixInAnnotations_NullMap() {
        mapper.setMixInAnnotations(null);
        assertEquals(0, mapper.mixInCount());
        assertNull(mapper.findMixInClassFor(SimpleBean.class));
    }

    @Test
    public void testMixInAnnotations_EmptyMap() {
        mapper.setMixInAnnotations(new HashMap<Class<?>, Class<?>>());
        assertEquals(0, mapper.mixInCount());
    }

    @Test
    public void testAddMixInAnnotations() {
        mapper.addMixInAnnotations(SimpleBean.class, String.class);
        assertEquals(String.class, mapper.findMixInClassFor(SimpleBean.class));
    }

    @Test
    public void testAddMixIn() {
        ObjectMapper result = mapper.addMixIn(SimpleBean.class, String.class);
        assertSame(mapper, result);
        assertEquals(String.class, mapper.findMixInClassFor(SimpleBean.class));
    }

    // ==================================================================
    // Visibility
    // ==================================================================

    @Test
    public void testVisibilityChecker() {
        assertNotNull(mapper.getVisibilityChecker());
        ObjectMapper result = mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        assertSame(mapper, result);
    }

    @Test
    public void testSetVisibilityChecker() {
        VisibilityChecker<?> vc = mapper.getVisibilityChecker();
        mapper.setVisibilityChecker(vc);
        assertNotNull(mapper.getVisibilityChecker());
    }

    // ==================================================================
    // Subtypes
    // ==================================================================

    @Test
    public void testSubtypeResolver_GetSet() {
        assertNotNull(mapper.getSubtypeResolver());
        SubtypeResolver custom = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
        ObjectMapper result = mapper.setSubtypeResolver(custom);
        assertSame(mapper, result);
        assertSame(custom, mapper.getSubtypeResolver());
    }

    @Test
    public void testRegisterSubtypesClasses() {
        mapper.registerSubtypes(SimpleBean.class); // no exception expected
    }

    @Test
    public void testRegisterSubtypesNamedTypes() {
        mapper.registerSubtypes(new com.fasterxml.jackson.databind.jsontype.NamedType(SimpleBean.class, "simple"));
    }

    // ==================================================================
    // AnnotationIntrospector / naming / inclusion
    // ==================================================================

    @Test
    public void testSetAnnotationIntrospector() {
        AnnotationIntrospector ai = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        ObjectMapper result = mapper.setAnnotationIntrospector(ai);
        assertSame(mapper, result);
    }

    @Test
    public void testSetAnnotationIntrospectors() {
        AnnotationIntrospector ai1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        AnnotationIntrospector ai2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
        ObjectMapper result = mapper.setAnnotationIntrospectors(ai1, ai2);
        assertSame(mapper, result);
    }

    @Test
    public void testSetPropertyNamingStrategy() {
        ObjectMapper result = mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        assertSame(mapper, result);
    }

    @Test
    public void testSetSerializationInclusion() {
        ObjectMapper result = mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        assertSame(mapper, result);
    }

    // ==================================================================
    // Default typing (incl. DefaultTypeResolverBuilder.useForType branches)
    // ==================================================================

    @Test
    public void testEnableDefaultTyping_Default() {
        assertSame(mapper, mapper.enableDefaultTyping());
    }

    @Test
    public void testEnableDefaultTyping_WithType() {
        assertSame(mapper, mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL));
    }

    @Test
    public void testEnableDefaultTyping_WithTypeAndAs() {
        assertSame(mapper, mapper.enableDefaultTyping(
                ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE, JsonTypeInfo.As.PROPERTY));
    }

    @Test
    public void testEnableDefaultTypingAsProperty() {
        assertSame(mapper, mapper.enableDefaultTypingAsProperty(
                ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT, "@type"));
    }

    @Test
    public void testDisableDefaultTyping() {
        assertSame(mapper, mapper.disableDefaultTyping());
    }

    @Test
    public void testUseForType_JavaLangObject_ObjectClass_True() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertTrue(b.useForType(type(Object.class)));
    }

    @Test
    public void testUseForType_JavaLangObject_NonObjectClass_False() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
        assertFalse(b.useForType(type(String.class)));
    }

    @Test
    public void testUseForType_ObjectAndNonConcrete_Interface_True() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertTrue(b.useForType(type(List.class)));
    }

    @Test
    public void testUseForType_ObjectAndNonConcrete_ConcreteFinal_False() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
        assertFalse(b.useForType(type(String.class)));
    }

    @Test
    public void testUseForType_NonConcreteAndArrays_ObjectArray_True() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertTrue(b.useForType(type(Object[].class)));
    }

    @Test
    public void testUseForType_NonConcreteAndArrays_StringArray_False() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
        assertFalse(b.useForType(type(String[].class)));
    }

    @Test
    public void testUseForType_NonFinal_FinalClass_False() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertFalse(b.useForType(type(String.class)));
    }

    @Test
    public void testUseForType_NonFinal_NonFinalClass_True() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertTrue(b.useForType(type(ArrayList.class)));
    }

    @Test
    public void testUseForType_NonFinal_ArrayUnwrap_False() {
        ObjectMapper.DefaultTypeResolverBuilder b =
                new ObjectMapper.DefaultTypeResolverBuilder(ObjectMapper.DefaultTyping.NON_FINAL);
        assertFalse(b.useForType(type(String[].class)));
    }

    // ==================================================================
    // TypeFactory
    // ==================================================================

    @Test
    public void testTypeFactoryGetSet() {
        TypeFactory tf = TypeFactory.defaultInstance();
        assertSame(mapper, mapper.setTypeFactory(tf));
        assertSame(tf, mapper.getTypeFactory());
    }

    @Test
    public void testConstructType() {
        JavaType t = mapper.constructType(String.class);
        assertEquals(String.class, t.getRawClass());
    }

    // ==================================================================
    // Deserialization config helpers
    // ==================================================================

    @Test
    public void testSetNodeFactory() {
        JsonNodeFactory f = JsonNodeFactory.instance;
        assertSame(mapper, mapper.setNodeFactory(f));
        assertSame(f, mapper.getNodeFactory());
    }

    @Test
    public void testAddHandlerAndClearProblemHandlers() {
        DeserializationProblemHandler h = new DeserializationProblemHandler() {};
        assertSame(mapper, mapper.addHandler(h));
        assertSame(mapper, mapper.clearProblemHandlers());
    }

    @Test
    public void testSetConfigDeserialization() {
        DeserializationConfig cfg = mapper.getDeserializationConfig();
        assertSame(mapper, mapper.setConfig(cfg));
        assertSame(cfg, mapper.getDeserializationConfig());
    }

    // ==================================================================
    // Serialization config helpers
    // ==================================================================

    @Test
    public void testSetFilters() {
        mapper.setFilters(new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider());
        assertNotNull(mapper.getSerializationConfig());
    }

    @Test
    public void testSetBase64Variant() {
        assertSame(mapper, mapper.setBase64Variant(Base64Variants.MODIFIED_FOR_URL));
    }

    @Test
    public void testSetConfigSerialization() {
        SerializationConfig cfg = mapper.getSerializationConfig();
        assertSame(mapper, mapper.setConfig(cfg));
        assertSame(cfg, mapper.getSerializationConfig());
    }

    // ==================================================================
    // Other config
    // ==================================================================

    @Test
    public void testGetFactoryAndDeprecatedGetJsonFactory() {
        assertSame(mapper.getFactory(), mapper.getJsonFactory());
    }

    @Test
    public void testSetDateFormat() {
        assertSame(mapper, mapper.setDateFormat(null));
    }

    @Test
    public void testSetHandlerInstantiator() {
        Object result = mapper.setHandlerInstantiator(null);
        assertSame(mapper, result);
    }

    @Test
    public void testSetInjectableValues() {
        InjectableValues iv = new InjectableValues.Std();
        assertSame(mapper, mapper.setInjectableValues(iv));
    }

    @Test
    public void testSetLocale() {
        assertSame(mapper, mapper.setLocale(Locale.US));
    }

    @Test
    public void testSetTimeZone() {
        assertSame(mapper, mapper.setTimeZone(TimeZone.getTimeZone("UTC")));
    }

    // ==================================================================
    // Feature toggles (if/else branches)
    // ==================================================================

    @Test
    public void testConfigureMapperFeature_TrueFalse() {
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, false);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.configure(MapperFeature.AUTO_DETECT_FIELDS, true);
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testConfigureSerializationFeature_TrueFalse() {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testConfigureDeserializationFeature_TrueFalse() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testConfigureJsonParserFeature() {
        mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, false);
        assertFalse(mapper.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));
        mapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        assertTrue(mapper.isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE));
    }

    @Test
    public void testConfigureJsonGeneratorFeature() {
        mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);
        assertFalse(mapper.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
        mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, true);
        assertTrue(mapper.isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET));
    }

    @Test
    public void testEnableDisableMapperFeatureVarargs() {
        mapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
        assertFalse(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
        mapper.enable(MapperFeature.AUTO_DETECT_FIELDS);
        assertTrue(mapper.isEnabled(MapperFeature.AUTO_DETECT_FIELDS));
    }

    @Test
    public void testEnableDisableDeserializationFeature_Single() {
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertFalse(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        assertTrue(mapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
    }

    @Test
    public void testEnableDisableDeserializationFeature_Varargs() {
        mapper.enable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertTrue(mapper.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE);
        assertFalse(mapper.isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE));
    }

    @Test
    public void testEnableDisableSerializationFeature_Single() {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        assertTrue(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
        mapper.disable(SerializationFeature.INDENT_OUTPUT);
        assertFalse(mapper.isEnabled(SerializationFeature.INDENT_OUTPUT));
    }

    @Test
    public void testEnableDisableSerializationFeature_Varargs() {
        mapper.enable(SerializationFeature.INDENT_OUTPUT, SerializationFeature.WRAP_ROOT_VALUE);
        assertTrue(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
        mapper.disable(SerializationFeature.INDENT_OUTPUT, SerializationFeature.WRAP_ROOT_VALUE);
        assertFalse(mapper.isEnabled(SerializationFeature.WRAP_ROOT_VALUE));
    }

    @Test
    public void testGetNodeFactory() {
        assertNotNull(mapper.getNodeFactory());
    }

    // ==================================================================
    // readValue via JsonParser (multiple overloads)
    // ==================================================================

    @Test
    public void testReadValue_JsonParser_Class() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("{\"id\":1,\"name\":\"a\"}");
        SimpleBean bean = mapper.readValue(jp, SimpleBean.class);
        assertEquals(1, bean.id);
        assertEquals("a", bean.name);
        jp.close();
    }

    @Test
    public void testReadValue_JsonParser_TypeReference() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("{\"a\":1}");
        Map<String, Integer> map = mapper.readValue(jp, new TypeReference<Map<String, Integer>>() {});
        assertEquals(Integer.valueOf(1), map.get("a"));
        jp.close();
    }

    @Test
    public void testReadValue_JsonParser_JavaType() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("\"hello\"");
        String s = mapper.readValue(jp, mapper.constructType(String.class));
        assertEquals("hello", s);
        jp.close();
    }

    @Test
    public void testReadValue_JsonParser_ResolvedType() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("123");
        JavaType t = mapper.constructType(Integer.class);
        Integer i = mapper.readValue(jp, (com.fasterxml.jackson.core.type.ResolvedType) t);
        assertEquals(Integer.valueOf(123), i);
        jp.close();
    }

    @Test
    public void testReadValue_NullLiteral_ReturnsNull() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("null");
        SimpleBean bean = mapper.readValue(jp, SimpleBean.class);
        assertNull(bean);
        jp.close();
    }

    // ==================================================================
    // readTree(JsonParser)
    // ==================================================================

    @Test
    public void testReadTree_JsonParser_EOF_ReturnsNull() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("");
        JsonNode n = mapper.readTree(jp);
        assertNull(n);
        jp.close();
    }

    @Test
    public void testReadTree_JsonParser_WithContent() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("{\"a\":1}");
        JsonNode n = mapper.readTree(jp);
        assertTrue(n.isObject());
        assertEquals(1, n.get("a").asInt());
        jp.close();
    }

    @Test
    public void testReadTree_JsonParser_NullLiteral_ReturnsNullNode() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("null");
        JsonNode n = mapper.readTree(jp);
        assertNotNull(n);
        assertTrue(n.isNull());
        jp.close();
    }

    // ==================================================================
    // readValues
    // ==================================================================

    @Test
    public void testReadValues_JsonParser_Class() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("[1,2,3]");
        jp.nextToken();
        jp.nextToken();
        MappingIterator<Integer> it = mapper.readValues(jp, Integer.class);
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) results.add(it.next());
        assertEquals(Arrays.asList(1, 2, 3), results);
        it.close();
    }

    @Test
    public void testReadValues_JsonParser_TypeReference() throws Exception {
        JsonParser jp = mapper.getFactory().createParser("[1,2]");
        jp.nextToken();
        jp.nextToken();
        MappingIterator<Integer> it = mapper.readValues(jp, new TypeReference<Integer>() {});
        List<Integer> results = new ArrayList<Integer>();
        while (it.hasNext()) results.add(it.next());
        assertEquals(Arrays.asList(1, 2), results);
        it.close();
    }

    // ==================================================================
    // readTree(various sources)
    // ==================================================================

    @Test
    public void testReadTree_String() throws Exception {
        JsonNode n = mapper.readTree("{\"x\":true}");
        assertTrue(n.get("x").asBoolean());
    }

    @Test(expected = JsonProcessingException.class)
    public void testReadTree_String_Empty_Throws() throws Exception {
        mapper.readTree(""); // no content -> JsonMappingException
    }

    @Test
    public void testReadTree_String_NullLiteral() throws Exception {
        JsonNode n = mapper.readTree("null");
        assertTrue(n.isNull());
    }

    @Test
    public void testReadTree_InputStream() throws Exception {
        InputStream in = new ByteArrayInputStream("{\"y\":5}".getBytes("UTF-8"));
        JsonNode n = mapper.readTree(in);
        assertEquals(5, n.get("y").asInt());
    }

    @Test
    public void testReadTree_Reader() throws Exception {
        JsonNode n = mapper.readTree(new StringReader("[1,2,3]"));
        assertTrue(n.isArray());
        assertEquals(3, n.size());
    }

    @Test
    public void testReadTree_ByteArray() throws Exception {
        JsonNode n = mapper.readTree("{\"z\":\"v\"}".getBytes("UTF-8"));
        assertEquals("v", n.get("z").asText());
    }

    @Test
    public void testReadTree_File() throws Exception {
        File f = tempFolder.newFile("tree.json");
        writeToFile(f, "{\"k\":1}");
        JsonNode n = mapper.readTree(f);
        assertEquals(1, n.get("k").asInt());
    }

    @Test
    public void testReadTree_URL() throws Exception {
        File f = tempFolder.newFile("treeUrl.json");
        writeToFile(f, "{\"k\":2}");
        JsonNode n = mapper.readTree(f.toURI().toURL());
        assertEquals(2, n.get("k").asInt());
    }

    // ==================================================================
    // writeValue(JsonGenerator, ...)
    // ==================================================================

    @Test
    public void testWriteValue_JsonGenerator_Basic() throws Exception {
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(jgen, new SimpleBean(1, "abc"));
        jgen.close();
        assertTrue(sw.toString().contains("\"id\":1"));
    }

    @Test
    public void testWriteValue_JsonGenerator_IndentOutput() throws Exception {
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(jgen, new SimpleBean(1, "abc"));
        jgen.close();
        assertTrue(sw.toString().contains("\n"));
    }

    @Test
    public void testWriteValue_JsonGenerator_CloseCloseable() throws Exception {
        mapper.configure(SerializationFeature.CLOSE_CLOSEABLE, true);
        CloseableBean bean = new CloseableBean();
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = mapper.getFactory().createGenerator(sw);
        mapper.writeValue(jgen, bean);
        assertTrue(bean.isClosed());
        jgen.close();
    }

    // ==================================================================
    // writeTree / createNode / treeAsTokens
    // ==================================================================

    @Test
    public void testWriteTree_TreeNode() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("a", 1);
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(jgen, (com.fasterxml.jackson.core.TreeNode) node);
        jgen.close();
        assertTrue(sw.toString().contains("\"a\":1"));
    }

    @Test
    public void testWriteTree_JsonNode() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("b", 2);
        StringWriter sw = new StringWriter();
        JsonGenerator jgen = mapper.getFactory().createGenerator(sw);
        mapper.writeTree(jgen, (JsonNode) node);
        jgen.close();
        assertTrue(sw.toString().contains("\"b\":2"));
    }

    @Test
    public void testCreateObjectAndArrayNode() {
        assertTrue(mapper.createObjectNode().isObject());
        assertTrue(mapper.createArrayNode().isArray());
    }

    @Test
    public void testTreeAsTokens() {
        ObjectNode node = mapper.createObjectNode();
        node.put("v", 9);
        assertNotNull(mapper.treeAsTokens(node));
    }

    // ==================================================================
    // treeToValue / valueToTree
    // ==================================================================

    @Test
    public void testTreeToValue_AssignableShortcut() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("id", 1);
        ObjectNode result = mapper.treeToValue(node, ObjectNode.class);
        assertSame(node, result); // shortcut branch: valueType.isAssignableFrom(n.getClass())
    }

    @Test
    public void testTreeToValue_ActualConversion() throws Exception {
        ObjectNode node = mapper.createObjectNode();
        node.put("id", 7);
        node.put("name", "n");
        SimpleBean bean = mapper.treeToValue(node, SimpleBean.class);
        assertEquals(7, bean.id);
        assertEquals("n", bean.name);
    }

    @Test
    public void testValueToTree_Null() {
        assertNull(mapper.valueToTree(null));
    }

    @Test
    public void testValueToTree_Object() {
        JsonNode n = mapper.valueToTree(new SimpleBean(3, "x"));
        assertEquals(3, n.get("id").asInt());
        assertEquals("x", n.get("name").asText());
    }

    // ==================================================================
    // canSerialize / canDeserialize
    // ==================================================================

    @Test
    public void testCanSerialize() {
        assertTrue(mapper.canSerialize(SimpleBean.class));
    }

    @Test
    public void testCanSerialize_WithCause() {
        assertTrue(mapper.canSerialize(SimpleBean.class, new AtomicReference<Throwable>()));
    }

    @Test
    public void testCanDeserialize() {
        assertTrue(mapper.canDeserialize(mapper.constructType(SimpleBean.class)));
    }

    @Test
    public void testCanDeserialize_WithCause() {
        assertTrue(mapper.canDeserialize(mapper.constructType(SimpleBean.class),
                new AtomicReference<Throwable>()));
    }

    // ==================================================================
    // readValue convenience overloads
    // ==================================================================

    @Test
    public void testReadValue_String_Class() throws Exception {
        SimpleBean bean = mapper.readValue("{\"id\":10,\"name\":\"s\"}", SimpleBean.class);
        assertEquals(10, bean.id);
    }

    @Test
    public void testReadValue_String_TypeReference() throws Exception {
        List<Integer> list = mapper.readValue("[1,2,3]", new TypeReference<List<Integer>>() {});
        assertEquals(3, list.size());
    }

    @Test
    public void testReadValue_String_JavaType() throws Exception {
        SimpleBean bean = mapper.readValue("{\"id\":11,\"name\":\"j\"}", mapper.constructType(SimpleBean.class));
        assertEquals(11, bean.id);
    }

    @Test
    public void testReadValue_ByteArray_Class() throws Exception {
        byte[] data = "{\"id\":20,\"name\":\"b\"}".getBytes("UTF-8");
        SimpleBean bean = mapper.readValue(data, SimpleBean.class);
        assertEquals(20, bean.id);
    }

    @Test
    public void testReadValue_ByteArray_OffsetLen_Class() throws Exception {
        byte[] data = "XX{\"id\":21,\"name\":\"c\"}YY".getBytes("UTF-8");
        SimpleBean bean = mapper.readValue(data, 2, data.length - 4, SimpleBean.class);
        assertEquals(21, bean.id);
    }

    @Test
    public void testReadValue_Reader_Class() throws Exception {
        SimpleBean bean = mapper.readValue(new StringReader("{\"id\":30,\"name\":\"r\"}"), SimpleBean.class);
        assertEquals(30, bean.id);
    }

    @Test
    public void testReadValue_InputStream_Class() throws Exception {
        InputStream in = new ByteArrayInputStream("{\"id\":40,\"name\":\"i\"}".getBytes("UTF-8"));
        SimpleBean bean = mapper.readValue(in, SimpleBean.class);
        assertEquals(40, bean.id);
    }

    @Test
    public void testReadValue_File_Class() throws Exception {
        File f = tempFolder.newFile("val.json");
        writeToFile(f, "{\"id\":50,\"name\":\"f\"}");
        SimpleBean bean = mapper.readValue(f, SimpleBean.class);
        assertEquals(50, bean.id);
    }

    @Test
    public void testReadValue_URL_Class() throws Exception {
        File f = tempFolder.newFile("valUrl.json");
        writeToFile(f, "{\"id\":60,\"name\":\"u\"}");
        SimpleBean bean = mapper.readValue(f.toURI().toURL(), SimpleBean.class);
        assertEquals(60, bean.id);
    }

    // ==================================================================
    // writeValue convenience overloads
    // ==================================================================

    @Test
    public void testWriteValue_File() throws Exception {
        File f = tempFolder.newFile("out.json");
        mapper.writeValue(f, new SimpleBean(1, "a"));
        assertTrue(readFile(f).contains("\"id\":1"));
    }

    @Test
    public void testWriteValue_OutputStream() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        mapper.writeValue(out, new SimpleBean(2, "b"));
        assertTrue(out.toString("UTF-8").contains("\"id\":2"));
    }

    @Test
    public void testWriteValue_Writer() throws Exception {
        StringWriter sw = new StringWriter();
        mapper.writeValue(sw, new SimpleBean(3, "c"));
        assertTrue(sw.toString().contains("\"id\":3"));
    }

    @Test
    public void testWriteValueAsString() throws Exception {
        assertTrue(mapper.writeValueAsString(new SimpleBean(4, "d")).contains("\"id\":4"));
    }

    @Test
    public void testWriteValueAsBytes() throws Exception {
        byte[] b = mapper.writeValueAsBytes(new SimpleBean(5, "e"));
        assertTrue(new String(b, "UTF-8").contains("\"id\":5"));
    }

    // ==================================================================
    // writer()/reader() factories
    // ==================================================================

    @Test
    public void testWriterVariants() {
        assertNotNull(mapper.writer());
        assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT));
        assertNotNull(mapper.writer(SerializationFeature.INDENT_OUTPUT, SerializationFeature.WRAP_ROOT_VALUE));
        assertNotNull(mapper.writer((java.text.DateFormat) null));
        assertNotNull(mapper.writerWithView(Object.class));
        assertNotNull(mapper.writerWithType(SimpleBean.class));
        assertNotNull(mapper.writerWithType(new TypeReference<SimpleBean>() {}));
        assertNotNull(mapper.writerWithType(mapper.constructType(SimpleBean.class)));
        assertNotNull(mapper.writer((PrettyPrinter) null)); // covers pp==null -> NULL_PRETTY_PRINTER branch
        assertNotNull(mapper.writerWithDefaultPrettyPrinter());
        assertNotNull(mapper.writer(new com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider()));
        assertNotNull(mapper.writer(Base64Variants.getDefaultVariant()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWriter_FormatSchema_InvalidThrows() {
        FormatSchema schema = new FormatSchema() {
            @Override public String getSchemaType() { return "not-supported"; }
        };
        mapper.writer(schema); // covers _verifySchemaType throwing branch
    }

    @Test
    public void testReaderVariants() {
        assertNotNull(mapper.reader());
        assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES));
        assertNotNull(mapper.reader(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                DeserializationFeature.UNWRAP_ROOT_VALUE));
        assertNotNull(mapper.reader(mapper.constructType(SimpleBean.class)));
        assertNotNull(mapper.reader(SimpleBean.class));
        assertNotNull(mapper.reader(new TypeReference<SimpleBean>() {}));
        assertNotNull(mapper.reader(JsonNodeFactory.instance));
        assertNotNull(mapper.reader(new InjectableValues.Std()));
        assertNotNull(mapper.readerWithView(Object.class));
        assertNotNull(mapper.reader(Base64Variants.getDefaultVariant()));
    }

    @Test
    public void testReaderForUpdating() throws Exception {
        SimpleBean bean = new SimpleBean(1, "old");
        ObjectReader r = mapper.readerForUpdating(bean);
        SimpleBean updated = r.readValue("{\"name\":\"new\"}");
        assertSame(bean, updated);
        assertEquals("new", updated.name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReader_FormatSchema_InvalidThrows() {
        FormatSchema schema = new FormatSchema() {
            @Override public String getSchemaType() { return "not-supported"; }
        };
        mapper.reader(schema);
    }

    // ==================================================================
    // convertValue
    // ==================================================================

    @Test
    public void testConvertValue_Null() {
        assertNull(mapper.convertValue(null, String.class)); // covers fromValue==null branch
    }

    @Test
    public void testConvertValue_SameTypeShortcut() {
        SimpleBean bean = new SimpleBean(1, "a");
        Object result = mapper.convertValue(bean, SimpleBean.class);
        assertSame(bean, result); // covers isAssignableFrom shortcut branch
    }

    @Test
    public void testConvertValue_ActualConversion() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 9);
        map.put("name", "m");
        SimpleBean bean = mapper.convertValue(map, SimpleBean.class);
        assertEquals(9, bean.id);
        assertEquals("m", bean.name);
    }

    @Test
    public void testConvertValue_TypeReference() {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Integer> result = mapper.convertValue(src, new TypeReference<List<Integer>>() {});
        assertEquals(src, result);
    }

    // ==================================================================
    // acceptJsonFormatVisitor
    // ==================================================================

    @Test(expected = IllegalArgumentException.class)
    public void testAcceptJsonFormatVisitor_NullJavaType_Throws() throws Exception {
        mapper.acceptJsonFormatVisitor((JavaType) null, null);
        // NOTE: เส้นทาง success ไม่ครอบคลุมเนื่องจากต้อง mock JsonFormatVisitorWrapper
        // ซึ่งมีหลายเมธอด และ behavior ไม่ได้ระบุชัดในซอร์สที่ให้มา
    }

    // ==================================================================
    // version
    // ==================================================================

    @Test
    public void testVersion() {
        assertNotNull(mapper.version());
    }
}
