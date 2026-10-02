แผนการทดสอบ: วางคลาสทดสอบไว้ใน package เดียวกับคลาสเป้าหมาย (`com.fasterxml.jackson.databind.introspect`) เพื่อให้เข้าถึง class ภายใน package เช่น `AnnotationMap`, `AnnotatedMethodMap`, `ClassIntrospector.MixInResolver` ได้ตรงตาม source ที่ให้มา และใช้ Mockito mock `AnnotationIntrospector` / `MixInResolver` เพื่อควบคุม branch โดยไม่เดา behavior ที่ไม่มีในซอร์ส

```java
package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver;

/**
 * หมายเหตุสมมติฐาน (ตามที่ระบุในซอร์ส/พฤติกรรมมาตรฐานของ Jackson ที่ปรากฏชัดจาก signature การเรียกใช้):
 * - AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember m)
 * - AnnotationIntrospector.isAnnotationBundle(Annotation ann)
 * - MixInResolver.findMixInClassFor(Class<?> cls)
 * - Object.class ถูกตัดออกจาก _superTypes เสมอ (ระบุไว้ตรง ๆ ในคอมเมนต์ของซอร์สต้นฉบับ)
 * ไม่มีการเดาลำดับภายในของ ClassUtil.findSuperTypes ระหว่าง superclass/interface
 * จึงหลีกเลี่ยงการเขียนแอสเสิร์ตที่พึ่งพาลำดับดังกล่าว
 */
public class AnnotatedClassTest {

    // ---------------- Fixtures: annotations ----------------

    @Retention(RetentionPolicy.RUNTIME)
    @interface MetaAnno {}

    @MetaAnno
    @Retention(RetentionPolicy.RUNTIME)
    @interface BundleAnno {}

    @Retention(RetentionPolicy.RUNTIME)
    @interface SimpleAnno { String value(); }

    // ---------------- Fixtures: class hierarchy for methods/fields ----------------

    interface SimpleInterface { void ifaceMethod(); }

    static class Base {
        public int baseField;
        public void baseMethod() {}
    }

    static class Simple extends Base implements SimpleInterface {
        public int field1;
        private String field2;
        public static int staticField;
        public transient int transientField;

        public Simple() {}
        public Simple(int x) {}

        public void method1() {}
        public int method2(String s) { return 0; }
        public void method3(String s, int i) {}
        public void method4(String s, int i, int j) {}

        public static void staticMethod() {}
        public static Simple factory(String s) { return new Simple(); }

        @Override public void ifaceMethod() {}
    }

    // ---------------- Fixtures: class-level annotation inheritance/mixin ----------------

    @SimpleAnno("base")
    static class AnnoBase {}

    @SimpleAnno("child")
    static class AnnoChildOwn extends AnnoBase {}

    static class AnnoChildNoOwn extends AnnoBase {}

    static class PlainNoSuperAnno extends AnnoBase {}

    @BundleAnno
    static class BundleAnnotated {}

    @SimpleAnno("mixin")
    static class MixinForChildNoOwn {}

    @SimpleAnno("supermixin")
    static class MixinForBase {}

    @SimpleAnno("objectmixin")
    static class ObjectMixinClass {}

    static class NoAnnoAtAll {}

    // ---------------- Fixtures: creators ----------------

    static class OneArgOnly {
        public OneArgOnly(String s) {}
    }

    static class CreatorHolder {
        public CreatorHolder() {}
        public CreatorHolder(int x) {}
        public static CreatorHolder make() { return new CreatorHolder(); }
    }

    // ---------------- Fixtures: member methods filtering ----------------

    static class MethodHolder {
        public void zeroArg() {}
        public void oneArg(String s) {}
        public void twoArg(String s, int i) {}
        public void threeArg(String s, int i, int j) {}
        public static void staticM() {}
    }

    // ---------------- Fixtures: fields filtering ----------------

    static class FieldHolder {
        public int pubField;
        private String privField;
        public static int staticField;
        public transient int transField;
    }

    // ---------------- Helpers ----------------

    private AnnotationIntrospector newAI() {
        return mock(AnnotationIntrospector.class);
    }

    // ================= Tests =================

    @Test
    public void testBasicGetters() {
        AnnotatedClass ac = AnnotatedClass.construct(Simple.class, newAI(), null);
        assertEquals(Simple.class, ac.getAnnotated());
        assertEquals(Simple.class, ac.getRawType());
        assertEquals(Simple.class, ac.getGenericType());
        assertEquals(Simple.class.getName(), ac.getName());
        assertEquals(Simple.class.getModifiers(), ac.getModifiers());
    }

    @Test
    public void testToString() {
        AnnotatedClass ac = AnnotatedClass.construct(Simple.class, newAI(), null);
        assertEquals("[AnnotedClass " + Simple.class.getName() + "]", ac.toString());
    }

    @Test
    public void testGetAnnotation_NullIntrospector_SkipsAllGathering() {
        AnnotatedClass ac = AnnotatedClass.construct(AnnoChildOwn.class, null, null);
        assertNull(ac.getAnnotation(SimpleAnno.class));
        assertFalse(ac.hasAnnotations());
    }

    @Test
    public void testAnnotation_OwnOverridesSuperclass() {
        AnnotatedClass ac = AnnotatedClass.construct(AnnoChildOwn.class, newAI(), null);
        SimpleAnno ann = ac.getAnnotation(SimpleAnno.class);
        assertNotNull(ann);
        assertEquals("child", ann.value());
    }

    @Test
    public void testAnnotation_InheritedFromSuperclassWhenNoOwn() {
        AnnotatedClass ac = AnnotatedClass.construct(AnnoChildNoOwn.class, newAI(), null);
        SimpleAnno ann = ac.getAnnotation(SimpleAnno.class);
        assertNotNull(ann);
        assertEquals("base", ann.value());
    }

    @Test
    public void testAnnotation_ExcludedWhenNoSuperTypes() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(PlainNoSuperAnno.class, newAI(), null);
        assertNull(ac.getAnnotation(SimpleAnno.class));
        assertFalse(ac.hasAnnotations());
    }

    @Test
    public void testAnnotationBundle_ExpandsMetaAnnotationButNotBundleItself() {
        AnnotationIntrospector ai = newAI();
        when(ai.isAnnotationBundle(isA(BundleAnno.class))).thenReturn(true);
        AnnotatedClass ac = AnnotatedClass.construct(BundleAnnotated.class, ai, null);
        assertNotNull(ac.getAnnotation(MetaAnno.class));
        assertNull(ac.getAnnotation(BundleAnno.class));
    }

    @Test
    public void testPrimaryMixIn_OverridesOwnAndSuperclassAnnotation() {
        MixInResolver mir = mock(MixInResolver.class);
        when(mir.findMixInClassFor(AnnoChildNoOwn.class)).thenReturn(MixinForChildNoOwn.class);
        AnnotatedClass ac = AnnotatedClass.construct(AnnoChildNoOwn.class, newAI(), mir);
        SimpleAnno ann = ac.getAnnotation(SimpleAnno.class);
        assertNotNull(ann);
        assertEquals("mixin", ann.value());
    }

    @Test
    public void testSuperTypeMixIn_AddedBeforeSuperclassOwnAnnotation() {
        MixInResolver mir = mock(MixInResolver.class);
        when(mir.findMixInClassFor(AnnoBase.class)).thenReturn(MixinForBase.class);
        AnnotatedClass ac = AnnotatedClass.construct(AnnoChildNoOwn.class, newAI(), mir);
        SimpleAnno ann = ac.getAnnotation(SimpleAnno.class);
        assertNotNull(ann);
        assertEquals("supermixin", ann.value());
    }

    @Test
    public void testObjectClassMixIn_AppliesWhenNothingElsePresent() {
        MixInResolver mir = mock(MixInResolver.class);
        when(mir.findMixInClassFor(Object.class)).thenReturn(ObjectMixinClass.class);
        AnnotatedClass ac = AnnotatedClass.construct(NoAnnoAtAll.class, newAI(), mir);
        SimpleAnno ann = ac.getAnnotation(SimpleAnno.class);
        assertNotNull(ann);
        assertEquals("objectmixin", ann.value());
    }

    @Test
    public void testWithAnnotations_UsesProvidedMapDirectly() {
        AnnotationMap map = new AnnotationMap();
        Annotation ann = AnnoBase.class.getAnnotation(SimpleAnno.class);
        map.addIfNotPresent(ann);

        AnnotatedClass base = AnnotatedClass.construct(Simple.class, newAI(), null);
        AnnotatedClass ac2 = base.withAnnotations(map);

        assertSame(Simple.class, ac2.getRawType());
        SimpleAnno got = ac2.getAnnotation(SimpleAnno.class);
        assertNotNull(got);
        assertEquals("base", got.value());
    }

    @Test
    public void testHasAnnotations_FalseWhenEmpty() {
        AnnotatedClass ac = AnnotatedClass.construct(NoAnnoAtAll.class, newAI(), null);
        assertFalse(ac.hasAnnotations());
        assertNull(ac.getAnnotation(SimpleAnno.class));
        int count = 0;
        for (Annotation a : ac.annotations()) { count++; }
        assertEquals(0, count);
    }

    @Test
    public void testDefaultConstructorAndConstructors_WithAnnotationsEnabled() {
        AnnotatedClass ac = AnnotatedClass.construct(CreatorHolder.class, newAI(), null);
        assertNotNull(ac.getDefaultConstructor());
        List<AnnotatedConstructor> ctors = ac.getConstructors();
        assertEquals(1, ctors.size());
        List<AnnotatedMethod> statics = ac.getStaticMethods();
        assertEquals(1, statics.size());
    }

    @Test
    public void testDefaultConstructorNull_WhenOnlyParamCtorExists() {
        AnnotatedClass ac = AnnotatedClass.construct(OneArgOnly.class, newAI(), null);
        assertNull(ac.getDefaultConstructor());
        assertEquals(1, ac.getConstructors().size());
    }

    @Test
    public void testCreators_IgnoreMarkerRemovesAll() {
        AnnotationIntrospector ai = newAI();
        when(ai.hasIgnoreMarker(any(AnnotatedMember.class))).thenReturn(true);
        AnnotatedClass ac = AnnotatedClass.construct(CreatorHolder.class, ai, null);
        assertNull(ac.getDefaultConstructor());
        assertTrue(ac.getConstructors().isEmpty());
        assertTrue(ac.getStaticMethods().isEmpty());
    }

    @Test
    public void testCreators_NullIntrospectorSkipsIgnoreFiltering() {
        AnnotatedClass ac = AnnotatedClass.construct(CreatorHolder.class, null, null);
        assertNotNull(ac.getDefaultConstructor());
        assertEquals(1, ac.getConstructors().size());
        assertEquals(1, ac.getStaticMethods().size());
    }

    @Test
    public void testMemberMethods_FullHierarchy() {
        AnnotatedClass ac = AnnotatedClass.construct(Simple.class, newAI(), null);
        // method1(0), method2(1), method3(2), baseMethod(0), ifaceMethod(0) = 5
        // method4(3 args) excluded, staticMethod/factory (static) excluded
        assertEquals(5, ac.getMemberMethodCount());
        assertNotNull(ac.findMethod("baseMethod", new Class<?>[0]));
        assertNotNull(ac.findMethod("ifaceMethod", new Class<?>[0]));
    }

    @Test
    public void testMemberMethods_WithoutSuperTypes_ExcludesInheritedButFieldsRemain() {
        AnnotatedClass ac = AnnotatedClass.constructWithoutSuperTypes(Simple.class, newAI(), null);
        // baseMethod excluded since Base is not part of _superTypes; ifaceMethod remains
        // (declared directly in Simple itself)
        assertEquals(4, ac.getMemberMethodCount());
        assertNull(ac.findMethod("baseMethod", new Class<?>[0]));
        assertNotNull(ac.findMethod("ifaceMethod", new Class<?>[0]));

        // _findFields walks real Java superclass chain regardless of _superTypes list
        assertEquals(3, ac.getFieldCount());
    }

    @Test
    public void testMemberMethods_FilteringByArgCountAndStatic() {
        AnnotatedClass ac = AnnotatedClass.construct(MethodHolder.class, newAI(), null);
        assertEquals(3, ac.getMemberMethodCount()); // zeroArg, oneArg, twoArg
        assertNotNull(ac.findMethod("zeroArg", new Class<?>[0]));
        assertNotNull(ac.findMethod("oneArg", new Class<?>[]{String.class}));
        assertNotNull(ac.findMethod("twoArg", new Class<?>[]{String.class, int.class}));
        assertNull(ac.findMethod("threeArg", new Class<?>[]{String.class, int.class, int.class}));
        assertNull(ac.findMethod("staticM", new Class<?>[0]));
    }

    @Test
    public void testFindMethod_NotFoundAndWrongParamType() {
        AnnotatedClass ac = AnnotatedClass.construct(MethodHolder.class, newAI(), null);
        assertNull(ac.findMethod("nonexistent", new Class<?>[0]));
        assertNull(ac.findMethod("oneArg", new Class<?>[]{Integer.class}));
    }

    @Test
    public void testFields_Filtering() {
        AnnotatedClass ac = AnnotatedClass.construct(FieldHolder.class, newAI(), null);
        assertEquals(2, ac.getFieldCount());
        List<String> names = new ArrayList<String>();
        for (AnnotatedField f : ac.fields()) {
            names.add(f.getName());
        }
        assertTrue(names.contains("pubField"));
        assertTrue(names.contains("privField"));
        assertFalse(names.contains("staticField"));
        assertFalse(names.contains("transField"));
    }

    @Test
    public void testFields_InheritedFromRealSuperclass() {
        AnnotatedClass ac = AnnotatedClass.construct(Simple.class, newAI(), null);
        assertEquals(3, ac.getFieldCount()); // baseField, field1, field2
        boolean hasBaseField = false;
        for (AnnotatedField f : ac.fields()) {
            if ("baseField".equals(f.getName())) { hasBaseField = true; }
        }
        assertTrue(hasBaseField);
    }
}
```

## สรุปผลการครอบคลุม Branch/Condition

| # | เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| 1 | testBasicGetters | getAnnotated/getRawType/getGenericType/getName/getModifiers (baseline, ไม่มี branch) |
| 2 | testToString | toString() format |
| 3 | testGetAnnotation_NullIntrospector_SkipsAllGathering | resolveClassAnnotations: `_annotationIntrospector == null` (skip ทั้ง block), getAnnotation lazy-resolve, hasAnnotations false |
| 4 | testAnnotation_OwnOverridesSuperclass | `_addAnnotationsIfNotPresent` ของคลาสตัวเอง มาก่อน loop superTypes (addIfNotPresent ไม่ทับ) |
| 5 | testAnnotation_InheritedFromSuperclassWhenNoOwn | loop `for (Class<?> cls : _superTypes)` เพิ่ม annotation จาก superclass |
| 6 | testAnnotation_ExcludedWhenNoSuperTypes | constructWithoutSuperTypes → `_superTypes` ว่าง, loop ไม่ execute |
| 7 | testAnnotationBundle_ExpandsMetaAnnotationButNotBundleItself | `_isAnnotationBundle(ann)==true` branch, expand meta-annotation แทนการเพิ่ม annotation ตรง |
| 8 | testPrimaryMixIn_OverridesOwnAndSuperclassAnnotation | `_primaryMixIn != null` branch ใน constructor และ resolveClassAnnotations, `_addClassMixIns(...,_class,_primaryMixIn)` ก่อนอื่น |
| 9 | testSuperTypeMixIn_AddedBeforeSuperclassOwnAnnotation | `_addClassMixIns(annotations, cls)` (`_mixInResolver != null` branch) ภายใน loop superTypes |
| 10 | testObjectClassMixIn_AppliesWhenNothingElsePresent | `_addClassMixIns(_classAnnotations, Object.class)` ท้าย method |
| 11 | testWithAnnotations_UsesProvidedMapDirectly | `withAnnotations()` สร้าง instance ใหม่, `_classAnnotations != null` ข้าม resolveClassAnnotations |
| 12 | testHasAnnotations_FalseWhenEmpty | hasAnnotations()/annotations() เมื่อ map ว่าง |
| 13 | testDefaultConstructorAndConstructors_WithAnnotationsEnabled | resolveCreators: ctor param=0 → `_defaultConstructor`, param>0 → `_constructors`, static method → `_creatorMethods`, `_annotationIntrospector != null` ไม่ ignore |
| 14 | testDefaultConstructorNull_WhenOnlyParamCtorExists | ไม่มี default ctor → `_defaultConstructor == null` |
| 15 | testCreators_IgnoreMarkerRemovesAll | `hasIgnoreMarker()==true` ลบ default ctor / loop remove constructors / loop remove creatorMethods (`--i>=0`) |
| 16 | testCreators_NullIntrospectorSkipsIgnoreFiltering | `_annotationIntrospector == null` ข้าม ignore-filter ทั้งหมด, `_constructConstructor/_constructCreatorMethod` ใช้ `_emptyAnnotationMap()` |
| 17 | testMemberMethods_FullHierarchy | resolveMemberMethods: `_addMemberMethods(_class,...)` + loop superTypes, interface-override branch (old ไม่ใช่ interface → ไม่ replace) |
| 18 | testMemberMethods_WithoutSuperTypes_ExcludesInheritedButFieldsRemain | `_superTypes` ว่าง → memberMethods ไม่รวม superclass method, แต่ `_findFields` ยังใช้ reflection จริงจึงไม่กระทบ field count |
| 19 | testMemberMethods_FilteringByArgCountAndStatic | `_isIncludableMemberMethod`: static → false, pcount<=2 true/false (0,1,2 vs 3 args) |
| 20 | testFindMethod_NotFoundAndWrongParamType | `AnnotatedMethodMap.find()` ไม่พบชื่อ/พารามิเตอร์ไม่ตรง → null |
| 21 | testFields_Filtering | `_isIncludableField`: static/transient excluded, public/private included (ไม่มี filter ด้าน visibility) |
| 22 | testFields_InheritedFromRealSuperclass | `_findFields` recursive ผ่าน `c.getSuperclass()` รวม field จาก superclass จริง |

**หมายเหตุ:** ไม่ได้เขียนเทสสำหรับกรณี `_addConstructorMixIns` / `_addFactoryMixIns` ที่ต้องอิงกับ `MemberKey` matching logic โดยตรง (คลาส `MemberKey` ไม่มีซอร์สให้) และไม่ได้ทดสอบลำดับ `ClassUtil.findSuperTypes` ระหว่าง superclass/interface อย่างเจาะจง เพื่อหลีกเลี่ยงการเดา behavior ที่ไม่มีอยู่ในซอร์สที่ให้มา