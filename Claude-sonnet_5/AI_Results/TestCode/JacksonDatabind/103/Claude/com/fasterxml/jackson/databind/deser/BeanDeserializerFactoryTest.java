package com.fasterxml.jackson.databind.deser;

import static org.junit.Assert.*;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class BeanDeserializerFactoryTest
{
    /* =========================================================
     * Fixture classes
     * ========================================================= */

    public static class SimpleBean {
        private int id;
        private String name;
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static class CustomException extends Exception {
        private static final long serialVersionUID = 1L;
        private String extra;
        public CustomException() { super(); }
        public String getExtra() { return extra; }
        public void setExtra(String extra) { this.extra = extra; }
    }

    public static abstract class AbstractThing {
        public String name;
    }

    public interface SomeInterface {
        String getName();
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    public static class IdentityBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    public static class IdentityPropBean {
        public int id;
        public String name;
    }

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "doesNotExist")
    public static class IdentityPropBeanInvalid {
        public int id;
    }

    @JsonDeserialize(builder = ValueClass.Builder.class)
    public static class ValueClass {
        private final int x;
        private final String y;
        private ValueClass(int x, String y) { this.x = x; this.y = y; }
        public int getX() { return x; }
        public String getY() { return y; }

        public static class Builder {
            private int x;
            private String y;
            public Builder withX(int x) { this.x = x; return this; }
            public Builder withY(String y) { this.y = y; return this; }
            public ValueClass build() { return new ValueClass(x, y); }
        }
    }

    public static class AnySetterMethodBean {
        private Map<String, Object> props = new HashMap<String, Object>();
        @JsonAnySetter
        public void setProp(String key, Object value) { props.put(key, value); }
        public Map<String, Object> getProps() { return props; }
    }

    public static class AnySetterFieldBean {
        @JsonAnySetter
        public Map<String, Object> props = new HashMap<String, Object>();
    }

    public static class ParentBean {
        public String name;
        @JsonManagedReference
        public List<ChildBean> children;
    }

    public static class ChildBean {
        public String name;
        @JsonBackReference
        public ParentBean parent;
    }

    public static class InjectBean {
        @JacksonInject("injKey")
        public String injected;
        public String name;
    }

    public static class SetterlessBean {
        private List<String> items = new ArrayList<String>();
        public List<String> getItems() { return items; }
    }

    @JsonIgnoreProperties(ignoreUnknown = true, value = { "ignoredField" })
    public static class IgnorePropsBean {
        public String name;
        public String ignoredField;
    }

    @JsonIgnoreType
    public static class IgnorableType {
        public String secret;
    }

    public static class IgnoreTypeBean {
        public String name;
        public IgnorableType ignoredProp;
    }

    public interface ProxyIface {
        void foo();
    }

    /* =========================================================
     * withConfig()
     * ========================================================= */

    @Test
    public void testWithConfig_sameReferenceReturnsSameInstance() throws Exception {
        DeserializerFactoryConfig sameConfig = BeanDeserializerFactory.instance._factoryConfig;
        DeserializerFactory result = BeanDeserializerFactory.instance.withConfig(sameConfig);
        // branch: _factoryConfig == config -> return this
        assertSame(BeanDeserializerFactory.instance, result);
    }

    @Test
    public void testWithConfig_differentConfigReturnsNewInstance() throws Exception {
        DeserializerFactoryConfig newConfig = new DeserializerFactoryConfig();
        DeserializerFactory result = BeanDeserializerFactory.instance.withConfig(newConfig);
        // branch: config differs -> verifyMustOverride passes (exact runtime type) -> new instance
        assertNotSame(BeanDeserializerFactory.instance, result);
        assertTrue(result instanceof BeanDeserializerFactory);
        assertEquals(BeanDeserializerFactory.class, result.getClass());
    }

    /* =========================================================
     * isPotentialBeanType() - protected, called directly (same package)
     * ========================================================= */

    @Test
    public void testIsPotentialBeanType_normalClassReturnsTrue() throws Exception {
        boolean result = BeanDeserializerFactory.instance.isPotentialBeanType(SimpleBean.class);
        assertTrue(result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_primitiveThrows() throws Exception {
        // Based on javadoc: primitives are rejected via ClassUtil.canBeABeanType
        BeanDeserializerFactory.instance.isPotentialBeanType(int.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_arrayThrows() throws Exception {
        // Based on javadoc: Arrays are rejected via ClassUtil.canBeABeanType
        BeanDeserializerFactory.instance.isPotentialBeanType(int[].class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_proxyThrows() throws Exception {
        ProxyIface proxy = (ProxyIface) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[] { ProxyIface.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object p, Method m, Object[] a) { return null; }
                });
        // branch: ClassUtil.isProxyType(type) == true
        BeanDeserializerFactory.instance.isPotentialBeanType(proxy.getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIsPotentialBeanType_localClassThrows() throws Exception {
        class LocalClass { public String x; }
        // branch: ClassUtil.isLocalType(type, true) != null
        BeanDeserializerFactory.instance.isPotentialBeanType(LocalClass.class);
    }

    /* =========================================================
     * isIgnorableType() - protected, called directly
     * ========================================================= */

    @Test
    public void testIsIgnorableType_stringIsNotIgnorable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, String.class, cache);
        // branch: (type == String.class) -> false, directly
        assertFalse(result);
        assertEquals(Boolean.FALSE, cache.get(String.class));
    }

    @Test
    public void testIsIgnorableType_primitiveIsNotIgnorable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, int.class, cache);
        // branch: type.isPrimitive() -> false
        assertFalse(result);
    }

    @Test
    public void testIsIgnorableType_annotatedIgnoreTypeIsIgnorable() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, IgnorableType.class, cache);
        // branch: status from config override is null -> go to annotation introspector -> true
        assertTrue(result);
        assertEquals(Boolean.TRUE, cache.get(IgnorableType.class));
    }

    @Test
    public void testIsIgnorableType_cachedResultIsReusedWithoutRecompute() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationConfig config = mapper.getDeserializationConfig();
        Map<Class<?>, Boolean> cache = new HashMap<Class<?>, Boolean>();
        // pre-populate: SimpleBean is NOT actually ignorable, but cache says TRUE
        cache.put(SimpleBean.class, Boolean.TRUE);
        boolean result = BeanDeserializerFactory.instance
                .isIgnorableType(config, null, SimpleBean.class, cache);
        // branch: status != null -> return cached value directly
        assertTrue(result);
    }

    /* =========================================================
     * createBeanDeserializer() / buildBeanDeserializer() via ObjectMapper
     * ========================================================= */

    @Test
    public void testCreateBeanDeserializer_simpleBean() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleBean result = mapper.readValue("{\"id\":7,\"name\":\"foo\"}", SimpleBean.class);
        assertEquals(7, result.getId());
        assertEquals("foo", result.getName());
    }

    @Test
    public void testCreateBeanDeserializer_customDeserializerOverride() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addDeserializer(SimpleBean.class, new JsonDeserializer<SimpleBean>() {
            @Override
            public SimpleBean deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                SimpleBean b = new SimpleBean();
                b.setId(-1);
                b.setName("CUSTOM");
                return b;
            }
        });
        mapper.registerModule(module);
        // branch: custom != null -> return custom directly
        SimpleBean result = mapper.readValue("{\"id\":1,\"name\":\"X\"}", SimpleBean.class);
        assertEquals(-1, result.getId());
        assertEquals("CUSTOM", result.getName());
    }

    @Test
    public void testCreateBeanDeserializer_throwableBranch() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // localizedMessage / suppressed must be ignored (buildThrowableDeserializer)
        CustomException result = mapper.readValue(
                "{\"extra\":\"val\",\"localizedMessage\":\"ignored\",\"suppressed\":[]}",
                CustomException.class);
        assertEquals("val", result.getExtra());
    }

    @Test
    public void testCreateBeanDeserializer_abstractTypeWithoutResolverThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{\"name\":\"x\"}", AbstractThing.class);
            fail("Expected exception for abstract type without concrete resolution");
        } catch (Exception e) {
            // branch: type.isAbstract() true, materializeAbstractType -> null,
            // buildAbstract() path triggers failure on actual construction
            assertTrue("Expected JsonMappingException subtype, got: " + e.getClass(),
                    e instanceof JsonMappingException);
        }
    }

    @Test
    public void testCreateBeanDeserializer_interfaceTypeThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.readValue("{}", SomeInterface.class);
            fail("Expected exception for interface type");
        } catch (Exception e) {
            assertTrue("Expected JsonMappingException subtype, got: " + e.getClass(),
                    e instanceof JsonMappingException);
        }
    }

    /* =========================================================
     * addObjectIdReader()
     * ========================================================= */

    @Test
    public void testObjectIdReader_defaultGeneratorBranch() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IdentityBean result = mapper.readValue(
                "{\"@id\":1,\"id\":5,\"name\":\"Bar\"}", IdentityBean.class);
        assertEquals(5, result.id);
        assertEquals("Bar", result.name);
    }

    @Test
    public void testObjectIdReader_propertyGeneratorBranch() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IdentityPropBean result = mapper.readValue(
                "{\"id\":9,\"name\":\"Foo\"}", IdentityPropBean.class);
        assertEquals(9, result.id);
        assertEquals("Foo", result.name);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testObjectIdReader_propertyGeneratorInvalidPropertyThrows() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // branch: idProp == null -> throws IllegalArgumentException
        mapper.readValue("{\"id\":9}", IdentityPropBeanInvalid.class);
    }

    /* =========================================================
     * createBuilderBasedDeserializer() / buildBuilderBasedDeserializer()
     * ========================================================= */

    @Test
    public void testBuilderBasedDeserializer() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ValueClass result = mapper.readValue("{\"x\":5,\"y\":\"hello\"}", ValueClass.class);
        assertEquals(5, result.getX());
        assertEquals("hello", result.getY());
    }

    /* =========================================================
     * constructAnySetter() - method-based and field-based mutator
     * ========================================================= */

    @Test
    public void testAnySetter_methodBased() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnySetterMethodBean result = mapper.readValue(
                "{\"foo\":\"bar\",\"num\":5}", AnySetterMethodBean.class);
        assertEquals("bar", result.getProps().get("foo"));
        assertEquals(5, result.getProps().get("num"));
    }

    @Test
    public void testAnySetter_fieldBased() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        AnySetterFieldBean result = mapper.readValue("{\"a\":\"b\"}", AnySetterFieldBean.class);
        assertEquals("b", result.props.get("a"));
    }

    /* =========================================================
     * addBackReferenceProperties()
     * ========================================================= */

    @Test
    public void testBackReferenceProperties() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        ParentBean result = mapper.readValue(
                "{\"name\":\"P\",\"children\":[{\"name\":\"C1\"},{\"name\":\"C2\"}]}",
                ParentBean.class);
        assertEquals(2, result.children.size());
        assertSame(result, result.children.get(0).parent);
        assertSame(result, result.children.get(1).parent);
    }

    /* =========================================================
     * addInjectables()
     * ========================================================= */

    @Test
    public void testInjectables() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setInjectableValues(new InjectableValues.Std().addValue("injKey", "INJECTED_VALUE"));
        InjectBean result = mapper.readValue("{\"name\":\"X\"}", InjectBean.class);
        assertEquals("INJECTED_VALUE", result.injected);
        assertEquals("X", result.name);
    }

    /* =========================================================
     * _isSetterlessType() + constructSetterlessProperty()
     * ========================================================= */

    @Test
    public void testSetterlessProperty_getterAsSetterForCollection() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        // default: USE_GETTERS_AS_SETTERS + AUTO_DETECT_GETTERS enabled
        SetterlessBean result = mapper.readValue("{\"items\":[\"a\",\"b\"]}", SetterlessBean.class);
        assertTrue(result.getItems().contains("a"));
        assertTrue(result.getItems().contains("b"));
    }

    /* =========================================================
     * addBeanProps() - ignoral branches (explicit + ignoreUnknown)
     * ========================================================= */

    @Test
    public void testIgnoreProperties_explicitAndUnknownIgnored() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnorePropsBean result = mapper.readValue(
                "{\"name\":\"foo\",\"ignoredField\":\"bar\",\"unknownField\":\"baz\"}",
                IgnorePropsBean.class);
        assertEquals("foo", result.name);
        // branch: explicitly ignored -> never set even though present in JSON
        assertNull(result.ignoredField);
    }

    /* =========================================================
     * filterBeanProps() -> isIgnorableType() integration branch
     * ========================================================= */

    @Test
    public void testIgnoreType_propertyWithIgnorableTypeIsSkipped() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        IgnoreTypeBean result = mapper.readValue(
                "{\"name\":\"foo\",\"ignoredProp\":{\"secret\":\"x\"}}",
                IgnoreTypeBean.class);
        assertEquals("foo", result.name);
        // branch: isIgnorableType(...) == true -> builder.addIgnorable(name) -> never populated
        assertNull(result.ignoredProp);
    }
}
