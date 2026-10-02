package com.fasterxml.jackson.databind.jsontype.impl;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver; // target class

public class StdSubtypeResolverTest {

    // =====================================================================
    // Fixture classes: สร้าง hierarchy ที่ครอบคลุมทุก branch ที่วิเคราะห์ได้
    // =====================================================================

    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class),                     // ไม่มีชื่อ -> ทดสอบ findTypeName
            @JsonSubTypes.Type(value = Bird.class, name = "bird"),
            @JsonSubTypes.Type(value = EmptySubtypesHolder.class, name = "empty")
    })
    public static abstract class Animal { }

    @JsonTypeName("dog")
    @JsonSubTypes(@JsonSubTypes.Type(value = Puppy.class, name = "puppy"))
    public static class Dog extends Animal { }

    public static class Puppy extends Dog { }      // ไม่มี @JsonSubTypes -> st == null branch
    public static class Cat extends Animal { }     // ไม่มี @JsonTypeName -> findTypeName == null
    public static class Bird extends Animal { }     // ไม่มี @JsonTypeName เมื่อถูก register แบบไม่มีชื่อ

    @JsonSubTypes({})                               // st != null && isEmpty() branch
    public static class EmptySubtypesHolder extends Animal { }

    public static class Fish extends Animal { }     // concrete, ไม่มี annotation
    public static class Unrelated { }               // ไม่ extends Animal -> isAssignableFrom == false

    @JsonSubTypes(@JsonSubTypes.Type(value = Puppy.class, name = "puppyProp"))
    private static class PropAnnHolder { }           // ใช้ดึง annotation จริงมา stub ใส่ mock

    // =====================================================================
    // Setup / helpers
    // =====================================================================

    private ObjectMapper mapper;
    private MapperConfig<?> config;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        config = mapper.getSerializationConfig();
    }

    private AnnotatedClass ac(Class<?> cls) {
        return AnnotatedClassResolver.resolveWithoutSuperTypes(config, cls);
    }

    private JavaType jt(Class<?> cls) {
        return mapper.getTypeFactory().constructType(cls);
    }

    @SuppressWarnings("unchecked")
    private LinkedHashSet<NamedType> registeredSet(StdSubtypeResolver r) throws Exception {
        Field f = StdSubtypeResolver.class.getDeclaredField("_registeredSubtypes");
        f.setAccessible(true);
        return (LinkedHashSet<NamedType>) f.get(r);
    }

    private NamedType findByClass(Collection<NamedType> col, Class<?> cls) {
        for (NamedType nt : col) {
            if (nt.getType() == cls) return nt;
        }
        return null;
    }

    private int countByClass(Collection<NamedType> col, Class<?> cls) {
        int c = 0;
        for (NamedType nt : col) {
            if (nt.getType() == cls) c++;
        }
        return c;
    }

    // =====================================================================
    // registerSubtypes(NamedType...) / registerSubtypes(Class<?>...)
    // =====================================================================

    @Test
    public void testRegisterSubtypes_NamedTypeVarargs_EmptyCreatesSet() throws Exception {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(); // boundary: zero-length varargs
        LinkedHashSet<NamedType> set = registeredSet(r);
        assertNotNull(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void testRegisterSubtypes_NamedTypeVarargs_AddsTypes() throws Exception {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(new NamedType(Fish.class, "fish"));
        LinkedHashSet<NamedType> set = registeredSet(r);
        assertEquals(1, set.size());
        assertTrue(set.contains(new NamedType(Fish.class))); // equals ใช้ class เท่านั้น
    }

    @Test
    public void testRegisterSubtypes_ClassVarargs_EmptyCreatesSet() throws Exception {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(new Class<?>[0]); // boundary
        LinkedHashSet<NamedType> set = registeredSet(r);
        assertNotNull(set);
        assertTrue(set.isEmpty());
    }

    @Test
    public void testRegisterSubtypes_ClassVarargs_AddsTypes() throws Exception {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(Bird.class);
        LinkedHashSet<NamedType> set = registeredSet(r);
        assertEquals(1, set.size());
        assertTrue(set.contains(new NamedType(Bird.class)));
    }

    // =====================================================================
    // collectAndResolveSubtypesByClass(config, AnnotatedClass)
    // =====================================================================

    @Test
    public void testCollectByClass_AnnotatedClass_NoRegistered() {
        StdSubtypeResolver r = new StdSubtypeResolver(); // _registeredSubtypes == null -> skip loop
        Collection<NamedType> result = r.collectAndResolveSubtypesByClass(config, ac(Animal.class));

        assertEquals(6, result.size());
        assertEquals("dog", findByClass(result, Dog.class).getName());
        assertEquals("puppy", findByClass(result, Puppy.class).getName());
        assertFalse(findByClass(result, Cat.class).hasName());
        assertEquals("bird", findByClass(result, Bird.class).getName());
        assertEquals("empty", findByClass(result, EmptySubtypesHolder.class).getName());
        assertFalse(findByClass(result, Animal.class).hasName());
    }

    @Test
    public void testCollectByClass_AnnotatedClass_RegisteredAssignableAndNot() {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(new NamedType(Fish.class, "fish"), new NamedType(Unrelated.class));

        Collection<NamedType> result = r.collectAndResolveSubtypesByClass(config, ac(Animal.class));

        assertNotNull(findByClass(result, Fish.class));
        assertEquals("fish", findByClass(result, Fish.class).getName());
        assertNull(findByClass(result, Unrelated.class)); // isAssignableFrom == false -> skip
    }

    @Test
    public void testCollectByClass_AnnotatedClass_DuplicateUpdateBranch() {
        StdSubtypeResolver r = new StdSubtypeResolver();
        // register Bird แบบไม่มีชื่อก่อน แล้ว base-type annotation จะพบ Bird พร้อมชื่อ "bird" ทีหลัง
        r.registerSubtypes(Bird.class);

        Collection<NamedType> result = r.collectAndResolveSubtypesByClass(config, ac(Animal.class));

        NamedType birdEntry = findByClass(result, Bird.class);
        assertNotNull(birdEntry);
        assertEquals("bird", birdEntry.getName()); // ต้องถูกอัปเดตจาก unnamed -> named
    }

    // =====================================================================
    // collectAndResolveSubtypesByClass(config, property, baseType)
    // =====================================================================

    @Test
    public void testCollectByClass_Property_BaseTypeProvided_NoPropertyAnnotation() {
        StdSubtypeResolver r = new StdSubtypeResolver();
        AnnotatedMember property = mock(AnnotatedMember.class); // getAnnotation(...) == null (default)

        Collection<NamedType> result = r.collectAndResolveSubtypesByClass(config, property, jt(Animal.class));

        assertEquals(6, result.size());
        assertEquals("dog", findByClass(result, Dog.class).getName());
    }

    @Test
    public void testCollectByClass_Property_BaseTypeNull_UsesPropertyRawType() {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(Fish.class, Unrelated.class); // Fish assignable, Unrelated ไม่

        AnnotatedMember property = mock(AnnotatedMember.class);
        doReturn(Animal.class).when(property).getRawType(); // baseType == null -> ใช้ property.getRawType()
        JsonSubTypes propAnn = PropAnnHolder.class.getAnnotation(JsonSubTypes.class);
        doReturn(propAnn).when(property).getAnnotation(JsonSubTypes.class);

        Collection<NamedType> result = r.collectAndResolveSubtypesByClass(config, property, null);

        assertNotNull(findByClass(result, Fish.class));
        assertNull(findByClass(result, Unrelated.class));
        // ชื่อจาก property ต้องชนะชื่อที่พบทีหลังจาก base-type (containsKey==true, prev.hasName()==true -> ไม่อัปเดต)
        NamedType puppyEntry = findByClass(result, Puppy.class);
        assertNotNull(puppyEntry);
        assertEquals("puppyProp", puppyEntry.getName());
    }

    // =====================================================================
    // collectAndResolveSubtypesByTypeId(config, property, baseType)
    // =====================================================================

    @Test
    public void testCollectByTypeId_Property_Full() {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(new NamedType(Puppy.class)); // ทดสอบ typesHandled.add()==false (ซ้ำ) และ byName.put skip

        AnnotatedMember property = mock(AnnotatedMember.class);
        JsonSubTypes propAnn = PropAnnHolder.class.getAnnotation(JsonSubTypes.class);
        doReturn(propAnn).when(property).getAnnotation(JsonSubTypes.class);

        Collection<NamedType> result = r.collectAndResolveSubtypesByTypeId(config, property, jt(Animal.class));

        assertEquals(6, result.size());
        // byName ถูก key ด้วยชื่อ ไม่ใช่ class -> Puppy ปรากฏ 2 ครั้ง ("puppy" และ "puppyProp")
        assertEquals(2, countByClass(result, Puppy.class));
        assertEquals(1, countByClass(result, Dog.class));
        assertEquals(1, countByClass(result, Cat.class));   // anonymous leftover
        assertEquals(1, countByClass(result, Bird.class));
        assertEquals(1, countByClass(result, EmptySubtypesHolder.class));
        assertEquals(0, countByClass(result, Animal.class)); // abstract root -> skip
    }

    // =====================================================================
    // collectAndResolveSubtypesByTypeId(config, AnnotatedClass)
    // =====================================================================

    @Test
    public void testCollectByTypeId_AnnotatedClass_AbstractRootSkipped() {
        StdSubtypeResolver r = new StdSubtypeResolver();

        Collection<NamedType> result = r.collectAndResolveSubtypesByTypeId(config, ac(Animal.class));

        assertEquals(5, result.size());
        assertEquals(0, countByClass(result, Animal.class)); // cls==rawBase && abstract -> skip
        assertEquals(1, countByClass(result, Cat.class));    // concrete, unnamed -> added anonymous
        assertEquals("dog", findByClass(result, Dog.class).getName());
        assertEquals("puppy", findByClass(result, Puppy.class).getName());
        assertEquals("bird", findByClass(result, Bird.class).getName());
        assertEquals("empty", findByClass(result, EmptySubtypesHolder.class).getName());
    }

    @Test
    public void testCollectByTypeId_AnnotatedClass_ConcreteRootAdded() {
        StdSubtypeResolver r = new StdSubtypeResolver();

        Collection<NamedType> result = r.collectAndResolveSubtypesByTypeId(config, ac(Fish.class));

        assertEquals(1, result.size());
        NamedType fishEntry = findByClass(result, Fish.class);
        assertNotNull(fishEntry);
        assertFalse(fishEntry.hasName()); // cls==rawBase แต่ concrete -> ไม่ skip, เพิ่มแบบ anonymous
    }

    @Test
    public void testCollectByTypeId_AnnotatedClass_RegisteredAssignableAndNot() {
        StdSubtypeResolver r = new StdSubtypeResolver();
        r.registerSubtypes(Bird.class, Unrelated.class);

        Collection<NamedType> result = r.collectAndResolveSubtypesByTypeId(config, ac(Animal.class));

        assertNull(findByClass(result, Unrelated.class));      // isAssignableFrom == false -> skip ทั้งหมด
        assertEquals(1, countByClass(result, Bird.class));     // typesHandled.add==false ครั้งที่ 2 -> ไม่ซ้ำ
        assertEquals("bird", findByClass(result, Bird.class).getName());
    }
}
