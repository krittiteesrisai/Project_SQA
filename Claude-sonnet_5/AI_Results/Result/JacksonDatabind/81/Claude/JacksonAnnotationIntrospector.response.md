# JUnit 4 Test Suite: `JacksonAnnotationIntrospectorTest`

หมายเหตุสำคัญก่อนเริ่ม:
- คลาสทดสอบถูกวางไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.introspect`) เพื่อให้เข้าถึง protected method (เช่น `_classIfExplicit`, `_propertyName`, `_findConstructorName`, `readResolve`) ได้โดยตรงตามที่ JUnit4/Java อนุญาต
- ใช้ Mockito mock สำหรับ `Annotated`/`AnnotatedMember`/`AnnotatedClass`/`AnnotatedMethod` เพื่อ stub `getAnnotation(...)` ตาม contract ที่ใช้จริงในซอร์ส (`_findAnnotation` เรียก `ann.getAnnotation(cls)`)
- บาง branch ที่พึ่งพา class ภายนอกที่ไม่มีซอร์สให้ (เช่น `Java7Support`, `MapperConfig.typeResolverBuilderInstance`, `ObjectIdInfo` internal fields, `ReferenceProperty` internal fields) จะ**ถูกคอมเมนต์กำกับว่าข้าม**เพื่อไม่เดา behavior ที่ไม่มีอยู่ในซอร์ส
- ใช้เฉพาะ public/stable API ของ jackson-annotations/jackson-databind ที่ปรากฏโดยตรงในซอร์สที่ให้มา

```java
package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.StdConverter;

@SuppressWarnings({"deprecation","rawtypes","unchecked"})
public class JacksonAnnotationIntrospectorTest {

    private JacksonAnnotationIntrospector intr;

    @Before
    public void setUp() {
        intr = new JacksonAnnotationIntrospector();
    }

    /* ======================================================================
     * Helper annotation / holder classes
     * ====================================================================== */

    @Retention(RetentionPolicy.RUNTIME)
    @JacksonAnnotationsInside
    @interface BundleAnno {}

    static class BundleHolder {
        @BundleAnno public int f;
    }

    static class NonBundleHolder {
        @JsonProperty("x") public int f;
    }

    enum SampleEnum {
        @JsonProperty("Alpha") A,
        B
    }

    enum SampleEnum2 {
        @JsonProperty("one") ONE,
        TWO,
        @JsonProperty("") THREE
    }

    enum PlainEnum { X, Y }

    enum DefaultEnum {
        A,
        @JsonEnumDefaultValue B
    }

    enum NoDefaultEnum { A, B }

    @JsonRootName(value = "root", namespace = "ns1") static class RootWithNs {}
    @JsonRootName(value = "root2", namespace = "") static class RootEmptyNs {}

    @JsonIgnoreProperties({"a", "b"}) static class IgnorePropsHolder {}

    @JsonIgnoreType static class IgnoreTypeTrueHolder {}
    @JsonIgnoreType(false) static class IgnoreTypeFalseHolder {}

    @JsonFilter("myFilter") static class FilterHolder {}
    @JsonFilter("") static class EmptyFilterHolder {}

    @JsonNaming static class NamingHolder {}

    @JsonClassDescription("desc") static class DescClassHolder {}

    @JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
    static class AutoDetectHolder {}

    @JsonSubTypes({@JsonSubTypes.Type(value = String.class, name = "str")})
    static class SubTypesHolder {}

    @JsonTypeName("tname") static class TypeNameHolder {}

    @JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
    static class IdInfoHolder {}
    @JsonIdentityInfo(generator = ObjectIdGenerators.None.class)
    static class IdInfoNoneHolder {}

    @JsonIdentityReference(alwaysAsId = true) static class RefTrueHolder {}

    @JsonPropertyOrder({"a", "b"}) static class OrderHolder {}
    @JsonPropertyOrder(alphabetic = true) static class AlphaTrueHolder {}
    @JsonPropertyOrder(alphabetic = false) static class AlphaFalseHolder {}

    @JsonPOJOBuilder(withPrefix = "with", buildMethodName = "build")
    static class PojoBuilderHolder {}

    @JsonValueInstantiator(StdValueInstantiator.class) static class InstHolder {}

    static class MyBuilder {}
    @JsonDeserialize(builder = MyBuilder.class) static class BuilderHolder {}
    @JsonDeserialize static class NoBuilderHolder {}

    @JsonTypeInfo(use = JsonTypeInfo.Id.NONE) static class TypeInfoNoneHolder {}
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@type") static class TypeInfoStdHolder {}
    @JsonTypeResolver(ClassNameIdResolver.class) static class TypeResolverOnlyHolder {}

    @JsonInclude(JsonInclude.Include.NON_NULL) static class InclNonNullHolder {}
    @JsonSerialize(include = JsonSerialize.Inclusion.ALWAYS) static class SerInclAlwaysHolder {}
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL) static class SerInclNonNullHolder {}
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT) static class SerInclNonDefaultHolder {}
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY) static class SerInclNonEmptyHolder {}
    @JsonSerialize(include = JsonSerialize.Inclusion.DEFAULT_INCLUSION) static class SerInclDefaultHolder {}

    @JsonSerialize(typing = JsonSerialize.Typing.STATIC) static class TypingHolder {}

    static class CustomSer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object value, com.fasterxml.jackson.core.JsonGenerator gen,
                SerializerProvider serializers) throws java.io.IOException { }
    }
    static class CustomDeser extends JsonDeserializer<Object> {
        @Override
        public Object deserialize(com.fasterxml.jackson.core.JsonParser p, DeserializationContext ctxt)
                throws java.io.IOException { return null; }
    }
    static class CustomKeyDeser extends KeyDeserializer {
        @Override
        public Object deserializeKey(String key, DeserializationContext ctxt) throws java.io.IOException {
            return key;
        }
    }
    static class MyConverter extends StdConverter<Object, Object> {
        @Override public Object convert(Object value) { return value; }
    }

    static class SerUsingHolder { @JsonSerialize(using = CustomSer.class) public int a; }
    static class KeySerUsingHolder { @JsonSerialize(keyUsing = CustomSer.class) public int a; }
    static class ContentSerUsingHolder { @JsonSerialize(contentUsing = CustomSer.class) public int a; }
    static class NullSerUsingHolder { @JsonSerialize(nullsUsing = CustomSer.class) public int a; }

    static class DeserUsingHolder { @JsonDeserialize(using = CustomDeser.class) public int a; }
    static class KeyDeserUsingHolder { @JsonDeserialize(keyUsing = CustomKeyDeser.class) public int a; }
    static class ContentDeserUsingHolder { @JsonDeserialize(contentUsing = CustomDeser.class) public int a; }

    static class ConvHolder {
        @JsonSerialize(converter = MyConverter.class) public int a;
        @JsonSerialize public int b;
    }
    static class ContentConvHolder {
        @JsonSerialize(contentConverter = MyConverter.class) public int a;
    }
    static class DeserConvHolder {
        @JsonDeserialize(converter = MyConverter.class) public int a;
        @JsonDeserialize public int b;
    }
    static class DeserContentConvHolder {
        @JsonDeserialize(contentConverter = MyConverter.class) public int a;
    }

    static class ViewA {}
    static class ViewB {}

    static class PropHolder {
        @JsonProperty(required = true) public int reqTrue;
        @JsonProperty(required = false) public int reqFalse;
        @JsonProperty(access = JsonProperty.Access.READ_ONLY) public int accessField;
        @JsonProperty(index = 7) public int idxField;
        @JsonProperty public int noIdxField;
        @JsonProperty(defaultValue = "abc") public int defValField;
        @JsonProperty public int noDefValField;
        @JsonPropertyDescription("descX") public int descField;
        @JsonFormat(shape = JsonFormat.Shape.STRING) public int fmtField;
        @JsonAlias({"a1", "a2"}) public int aliasField;
        @JsonAlias({}) public int emptyAliasField;
        @JsonIgnore public int ignoreTrueField;
        @JsonIgnore(false) public int ignoreFalseField;
        @JsonUnwrapped(enabled = true, prefix = "p_", suffix = "_s") public int unwrapEnabledField;
        @JsonUnwrapped(enabled = false) public int unwrapDisabledField;
        @JsonTypeId public int typeIdField;
        @JsonMerge(OptBoolean.TRUE) public int mergeTrueField;
        @JsonMerge(OptBoolean.FALSE) public int mergeFal