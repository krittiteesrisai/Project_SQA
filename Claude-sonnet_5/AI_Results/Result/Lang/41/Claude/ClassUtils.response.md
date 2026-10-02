# JUnit 4 Test Suite สำหรับ `ClassUtils` (Lang-41b)

```java
package org.apache.commons.lang;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class ClassUtilsTest {

    // ---------- helper types for interface-hierarchy / inner-class tests ----------
    interface IA { }
    interface IB extends IA { }
    interface IC extends IA { }
    static class ID implements IB, IC { }
    static class PlainClass { }
    static class Inner { } // inner static class -> name contains '$'

    // =========================================================
    // getShortClassName
    // =========================================================
    @Test
    public void testGetShortClassName_ObjectValueIfNull_Null() {
        assertEquals("NULL", ClassUtils.getShortClassName((Object) null, "NULL"));
    }

    @Test
    public void testGetShortClassName_ObjectValueIfNull_NonNull() {
        assertEquals("String", ClassUtils.getShortClassName("abc", "NULL"));
    }

    @Test
    public void testGetShortClassName_Class_Null() {
        assertEquals("", ClassUtils.getShortClassName((Class<?>) null));
    }

    @Test
    public void testGetShortClassName_Class_NonNull() {
        assertEquals("String", ClassUtils.getShortClassName(String.class));
    }

    @Test
    public void testGetShortClassName_String_Null() {
        assertEquals("", ClassUtils.getShortClassName((String) null));
    }

    @Test
    public void testGetShortClassName_String_Empty() {
        assertEquals("", ClassUtils.getShortClassName(""));
    }

    @Test
    public void testGetShortClassName_String_NoPackage_NoInner() {
        // lastDotIdx == -1, innerIdx == -1
        assertEquals("String", ClassUtils.getShortClassName("String"));
    }

    @Test
    public void testGetShortClassName_String_WithPackage() {
        assertEquals("String", ClassUtils.getShortClassName("java.lang.String"));
    }

    @Test
    public void testGetShortClassName_String_InnerClass() {
        // innerIdx != -1 branch -> '$' replaced with '.'
        assertEquals("Map.Entry", ClassUtils.getShortClassName("java.util.Map$Entry"));
    }

    // =========================================================
    // getPackageName
    // =========================================================
    @Test
    public void testGetPackageName_ObjectValueIfNull_Null() {
        assertEquals("NULL", ClassUtils.getPackageName((Object) null, "NULL"));
    }

    @Test
    public void testGetPackageName_ObjectValueIfNull_NonNull() {
        assertEquals("java.lang", ClassUtils.getPackageName("abc", "NULL"));
    }

    @Test
    public void testGetPackageName_Class_Null() {
        assertEquals("", ClassUtils.getPackageName((Class<?>) null));
    }

    @Test
    public void testGetPackageName_Class_NonNull() {
        assertEquals("java.lang", ClassUtils.getPackageName(String.class));
    }

    @Test
    public void testGetPackageName_String_Null() {
        assertEquals("", ClassUtils.getPackageName((String) null));
    }

    @Test
    public void testGetPackageName_String_NoDot() {
        assertEquals("", ClassUtils.getPackageName("String"));
    }

    @Test
    public void testGetPackageName_String_WithDot() {
        assertEquals("java.lang", ClassUtils.getPackageName("java.lang.String"));
    }

    // =========================================================
    // getAllSuperclasses
    // =========================================================
    @Test
    public void testGetAllSuperclasses_Null() {
        assertNull(ClassUtils.getAllSuperclasses(null));
    }

    @Test
    public void testGetAllSuperclasses_NoSuper() {
        // Object has no superclass -> while loop never executes
        List<Class<?>> result = ClassUtils.getAllSuperclasses(Object.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAllSuperclasses_WithSupers() {
        List<Class<?>> result = ClassUtils.getAllSuperclasses(String.class);
        assertEquals(Arrays.asList(Object.class), result);
    }

    // =========================================================
    // getAllInterfaces
    // =========================================================
    @Test
    public void testGetAllInterfaces_Null() {
        assertNull(ClassUtils.getAllInterfaces(null));
    }

    @Test
    public void testGetAllInterfaces_NoInterfaces() {
        List<Class<?>> result = ClassUtils.getAllInterfaces(PlainClass.class);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGetAllInterfaces_Diamond() {
        // covers recursion + "found.add() == false" (duplicate skip) branch
        List<Class<?>> result = ClassUtils.getAllInterfaces(ID.class);
        assertEquals(3, result.size());
        assertTrue(result.contains(IA.class));
        assertTrue(result.contains(IB.class));
        assertTrue(result.contains(IC.class));
    }

    // =========================================================
    // convertClassNamesToClasses
    // =========================================================
    @Test
    public void testConvertClassNamesToClasses_Null() {
        assertNull(ClassUtils.convertClassNamesToClasses(null));
    }

    @Test
    public void testConvertClassNamesToClasses_Valid() {
        List<String> names = Arrays.asList("java.lang.String", "java.lang.Integer");
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        assertEquals(String.class, result.get(0));
        assertEquals(Integer.class, result.get(1));
    }

    @Test
    public void testConvertClassNamesToClasses_InvalidName() {
        // Class.forName throws -> caught -> null stored
        List<String> names = Arrays.asList("not.a.real.ClassXYZ");
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        assertNull(result.get(0));
    }

    @Test
    public void testConvertClassNamesToClasses_NullEntry() {
        // Class.forName(null) throws NPE -> caught by catch(Exception) -> null stored
        List<String> names = Arrays.asList((String) null);
        List<Class<?>> result = ClassUtils.convertClassNamesToClasses(names);
        assertNull(result.get(0));
    }

    // =========================================================
    // convertClassesToClassNames
    // =========================================================
    @Test
    public void testConvertClassesToClassNames_Null() {
        assertNull(ClassUtils.convertClassesToClassNames(null));
    }

    @Test
    public void testConvertClassesToClassNames_WithNullEntry() {
        List<Class<?>> classes = Arrays.asList((Class<?>) null);
        List<String> result = ClassUtils.convertClassesToClassNames(classes);
        assertNull(result.get(0));
    }

    @Test
    public void testConvertClassesToClassNames_Valid() {
        List<Class<?>> classes = Arrays.<Class<?>>asList(String.class, Integer.class);
        List<String> result = ClassUtils.convertClassesToClassNames(classes);
        assertEquals("java.lang.String", result.get(0));
        assertEquals("java.lang.Integer", result.get(1));
    }

    // =========================================================
    // isAssignable (array overloads)
    // =========================================================
    @Test
    public void testIsAssignableArray_DifferentLength() {
        assertFalse(ClassUtils.isAssignable(new Class[]{int.class},
                new Class[]{int.class, String.class}));
    }

    @Test
    public void testIsAssignableArray_BothNull() {
        assertTrue(ClassUtils.isAssignable((Class[]) null, (Class[]) null));
    }

    @Test
    public void testIsAssignableArray_TrueCase() {
        assertTrue(ClassUtils.isAssignable(
                new Class[]{int.class, String.class},
                new Class[]{long.class, Object.class}));
    }

    @Test
    public void testIsAssignableArray_FalseCase_LoopBreaksEarly() {
        assertFalse(ClassUtils.isAssignable(
                new Class[]{int.class}, new Class[]{short.class}));
    }

    @Test
    public void testIsAssignableArray_AutoboxingDefaultFalse() {
        // 2-arg overload delegates with autoboxing=false
        assertFalse(ClassUtils.isAssignable(
                new Class[]{Integer.class}, new Class[]{int.class}));
    }

    @Test
    public void testIsAssignableArray_AutoboxingTrue() {
        assertTrue(ClassUtils.isAssignable(
                new Class[]{Integer.class}, new Class[]{int.class}, true));
    }

    // =========================================================
    // isAssignable (single Class overloads) - 2-arg delegate
    // =========================================================
    @Test
    public void testIsAssignable_TwoArgDelegate_False() {
        assertFalse(ClassUtils.isAssignable(Integer.class, int.class)); // autoboxing=false
    }

    @Test
    public void testIsAssignable_ToClassNull() {
        assertFalse(ClassUtils.isAssignable(String.class, null, false));
    }

    @Test
    public void testIsAssignable_ClsNullToClassPrimitive() {
        assertFalse(ClassUtils.isAssignable(null, int.class, false));
    }

    @Test
    public void testIsAssignable_ClsNullToClassNonPrimitive() {
        assertTrue(ClassUtils.isAssignable(null, String.class, false));
    }

    @Test
    public void testIsAssignable_Autobox_PrimitiveToWrapper() {
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, true));
    }

    @Test
    public void testIsAssignable_Autobox_WrapperToPrimitive() {
        assertTrue(ClassUtils.isAssignable(Integer.class, int.class, true));
    }

    @Test
    public void testIsAssignable_Autobox_NonWrapperToPrimitiveFails() {
        // wrapperToPrimitive(Object.class) == null -> return false
        assertFalse(ClassUtils.isAssignable(Object.class, int.class, true));
    }

    @Test
    public void testIsAssignable_PrimitiveEqualsWithoutAutobox() {
        assertTrue(ClassUtils.isAssignable(int.class, Integer.class, false) == false);
        // cls.equals(toClass) branch
        assertTrue(ClassUtils.isAssignable(int.class, int.class, false));
    }

    @Test
    public void testIsAssignable_PrimitiveToNonPrimitiveFalse() {
        assertFalse(ClassUtils.isAssignable(int.class, String.class, false));
    }

    @Test
    public void testIsAssignable_IntWidening() {
        assertTrue(ClassUtils.isAssignable(int.class, long.class));
        assertTrue(ClassUtils.isAssignable(int.class, float.class));
        assertTrue(ClassUtils.isAssignable(int.class, double.class));
        assertFalse(ClassUtils.isAssignable(int.class, short.class));
    }

    @Test
    public void testIsAssignable_LongWidening() {
        assertTrue(ClassUtils.isAssignable(long.class, float.class));
        assertTrue(ClassUtils.isAssignable(long.class, double.class));
        assertFalse(ClassUtils.isAssignable(long.class, int.class));
    }

    @Test
    public void testIsAssignable_BooleanAlwaysFalse() {
        assertFalse(ClassUtils.isAssignable(boolean.class, int.class));
    }

    @Test
    public void testIsAssignable_DoubleAlwaysFalse() {
        assertFalse(ClassUtils.isAssignable(double.class, float.class));
    }

    @Test
    public void testIsAssignable_FloatWidening() {
        assertTrue(ClassUtils.isAssignable(float.class, double.class));
        assertFalse(ClassUtils.isAssignable(float.class, int.class));
    }

    @Test
    public void testIsAssignable_CharWidening() {
        assertTrue(ClassUtils.isAssignable(char.class, int.class));
        assertTrue(ClassUtils.isAssignable(char.class, long.class));
        assertTrue(ClassUtils.isAssignable(char.class, float.class));
        assertTrue(ClassUtils.isAssignable(char.class, double.class));
        assertFalse(ClassUtils.isAssignable(char.class, byte.class));
    }

    @Test
    public void testIsAssignable_ShortWidening() {
        assertTrue(ClassUtils.isAssignable(short.class, int.class));
        assertTrue(ClassUtils.isAssignable(short.class, long.class));
        assertTrue(ClassUtils.isAssignable(short.class, float.class));
        assertTrue(ClassUtils.isAssignable(short.class, double.class));
        assertFalse(ClassUtils.isAssignable(short.class, byte.class));
    }

    @Test
    public void testIsAssignable_ByteWidening() {
        assertTrue(ClassUtils.isAssignable(byte.class, short.class));
        assertTrue(ClassUtils.isAssignable(byte.class, int.class));
        assertTrue(ClassUtils.isAssignable(byte.class, long.class));
        assertTrue(ClassUtils.isAssignable(byte.class, float.class));
        assertTrue(ClassUtils.isAssignable(byte.class, double.class));
        assertFalse(ClassUtils.isAssignable(byte.class, boolean.class));
    }

    @Test
    public void testIsAssignable_VoidFallThrough() {
        // void.class.isPrimitive() == true but matches none of the explicit checks
        // -> falls to final "return false" ("should never get here" line)
        assertFalse(ClassUtils.isAssignable(void.class, int.class));
    }

    @Test
    public void testIsAssignable_ReferenceAssignableFrom_True() {
        assertTrue(ClassUtils.isAssignable(String.class, Object.class));
    }

    @Test
    public void testIsAssignable_ReferenceAssignableFrom_False() {
        assertFalse(ClassUtils.isAssignable(Object.class, String.class));
    }

    // =========================================================
    // primitiveToWrapper / primitivesToWrappers
    // =========================================================
    @Test
    public void testPrimitiveToWrapper_Null() {
        assertNull(ClassUtils.primitiveToWrapper(null));
    }

    @Test
    public void testPrimitiveToWrapper_Primitive() {
        assertEquals(Integer.class, ClassUtils.primitiveToWrapper(int.class));
    }

    @Test
    public void testPrimitiveToWrapper_NonPrimitive() {
        assertEquals(String.class, ClassUtils.primitiveToWrapper(String.class));
    }

    @Test
    public void testPrimitivesToWrappers_Null() {
        assertNull(ClassUtils.primitivesToWrappers(null));
    }

    @Test
    public void testPrimitivesToWrappers_Empty() {
        Class<?>[] empty = new Class[0];
        assertSame(empty, ClassUtils.primitivesToWrappers(empty));
    }

    @Test
    public void testPrimitivesToWrappers_WithNullElement() {
        Class<?>[] input = new Class[]{null, int.class};
        Class<?>[] result = ClassUtils.primitivesToWrappers(input);
        assertNull(result[0]);
        assertEquals(Integer.class, result[1]);
    }

    // =========================================================
    // wrapperToPrimitive / wrappersToPrimitives
    // =========================================================
    @Test
    public void testWrapperToPrimitive_Wrapper() {
        assertEquals(int.class, ClassUtils.wrapperToPrimitive(Integer.class));
    }

    @Test
    public void testWrapperToPrimitive_NonWrapper() {
        assertNull(ClassUtils.wrapperToPrimitive(String.class));
    }

    @Test
    public void testWrapperToPrimitive_Null() {
        assertNull(ClassUtils.wrapperToPrimitive(null));
    }

    @Test
    public void testWrappersToPrimitives_Null() {
        assertNull(ClassUtils.wrappersToPrimitives(null));
    }

    @Test
    public void testWrappersToPrimitives_Empty() {
        Class<?>[] empty = new Class[0];
        assertSame(empty, ClassUtils.wrappersToPrimitives(empty));
    }

    @Test
    public void testWrappersToPrimitives_WithElements() {
        Class<?>[] input = new Class[]{Integer.class, String.class};
        Class<?>[] result = ClassUtils.wrappersToPrimitives(input);
        assertEquals(int.class, result[0]);
        assertNull(result[1]); // String is not a wrapper -> null
    }

    // =========================================================
    // isInnerClass
    // =========================================================
    @Test
    public void testIsInnerClass_Null() {
        assertFalse(ClassUtils.isInnerClass(null));
    }

    @Test
    public void testIsInnerClass_True() {
        assertTrue(ClassUtils.isInnerClass(Inner.class));
    }

    @Test
    public void testIsInnerClass_False() {
        assertFalse(ClassUtils.isInnerClass(String.class));
    }

    // =========================================================
    // getClass(...)
    // =========================================================
    @Test
    public void testGetClass_Abbreviation() throws Exception {
        Class<?> cls = ClassUtils.getClass(Thread.currentThread().getContextClassLoader(), "int", true);
        assertEquals(int.class, cls);
    }

    @Test
    public void testGetClass_NormalName() throws Exception {
        Class<?> cls = ClassUtils.getClass(Thread.currentThread().getContextClassLoader(),
                "java.lang.String", true);
        assertEquals(String.class, cls);
    }

    @Test
    public void testGetClass_ArrayCanonicalName() throws Exception {
        Class<?> cls = ClassUtils.getClass(Thread.currentThread().getContextClassLoader(),
                "java.lang.String[]", true);
        assertEquals(String[].class, cls);
    }

    @Test(expected = ClassNotFoundException.class)
    public void testGetClass_InvalidName_Throws() throws Exception {
        ClassUtils.getClass("com.totally.fake.NoSuchClassXYZ");
    }

    @Test
    public void testGetClass_TwoArgClassLoaderOverload() throws Exception {
        Class<?> cls = ClassUtils.getClass(Thread.currentThread().getContextClassLoader(),
                "java.lang.String");
        assertEquals(String.class, cls);
    }

    @Test
    public void testGetClass_OneArgOverload() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String"));
    }

    @Test
    public void testGetClass_StringBooleanOverload() throws Exception {
        assertEquals(String.class, ClassUtils.getClass("java.lang.String", true));
    }

    // =========================================================
    // getPublicMethod
    // =========================================================
    @Test
    public void testGetPublicMethod_DirectPublicClass() throws Exception {
        Method m = ClassUtils.getPublicMethod(String.class, "length", new Class[0]);
        assertNotNull(m);
        assertTrue(Modifier.isPublic(m.getDeclaringClass().getModifiers()));
    }

    @Test
    public void testGetPublicMethod_ViaInterfaceOnNonPublicImpl() throws Exception {
        // Collections.unmodifiableSet returns a package-private class;
        // "isEmpty" must be resolved via the public Set interface.
        Object obj = Collections.unmodifiableSet(new HashSet<Object>());
        Method m = ClassUtils.getPublicMethod(obj.getClass(), "isEmpty", new Class[0]);
        assertNotNull(m);
        assertTrue(Modifier.isPublic(m.getDeclaringClass().getModifiers()));
    }

    @Test(expected = NoSuchMethodException.class)
    public void testGetPublicMethod_NoSuchMethod() throws Exception {
        ClassUtils.getPublicMethod(String.class, "thisMethodDoesNotExist123", new Class[0]);
    }

    // =========================================================
    // toClass
    // =========================================================
    @Test
    public void testToClass_Null() {
        assertNull(ClassUtils.toClass(null));
    }

    @Test
    public void testToClass_Empty() {
        Class<?>[] result = ClassUtils.toClass(new Object[0]);
        assertEquals(0, result.length);
    }

    @Test
    public void testToClass_WithElements() {
        Class<?>[] result = ClassUtils.toClass(new Object[]{"a", Integer.valueOf(1)});
        assertEquals(String.class, result[0]);
        assertEquals(Integer.class, result[1]);
    }

    // =========================================================
    // getShortCanonicalName
    // =========================================================
    @Test
    public void testGetShortCanonicalName_ObjectValueIfNull_Null() {
        assertEquals("NULL", ClassUtils.getShortCanonicalName((Object) null, "NULL"));
    }

    @Test
    public void testGetShortCanonicalName_ObjectValueIfNull_NonNull() {
        assertEquals("String", ClassUtils.getShortCanonicalName("abc", "NULL"));
    }

    @Test
    public void testGetShortCanonicalName_Class_Null() {
        assertEquals("", ClassUtils.getShortCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetShortCanonicalName_Class_NonNull() {
        assertEquals("String", ClassUtils.getShortCanonicalName(String.class));
    }

    @Test
    public void testGetShortCanonicalName_String_PrimitiveArray() {
        // "[I" -> canonical "int[]" -> short "int[]"
        assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
    }

    @Test
    public void testGetShortCanonicalName_String_ObjectArray() {
        // "[Ljava.lang.String;" -> canonical "java.lang.String[]" -> short "String[]"
        assertEquals("String[]", ClassUtils.getShortCanonicalName("[Ljava.lang.String;"));
    }

    @Test
    public void testGetShortCanonicalName_String_NullInput() {
        // getCanonicalName(null) -> null ; getShortClassName(null) -> ""
        assertEquals("", ClassUtils.getShortCanonicalName((String) null));
    }

    // NOTE: "[X" is not a recognised abbreviation; reverseAbbreviationMap.get("X") == null,
    // then `new StringBuffer(null)` in getCanonicalName throws NullPointerException.
    // This looks like a latent fault in the source; we assert the actual (buggy) behaviour
    // to make sure a regression/fix is detected by this test.
    @Test(expected = NullPointerException.class)
    public void testGetShortCanonicalName_String_InvalidAbbreviation_TriggersNPE() {
        ClassUtils.getShortCanonicalName("[X");
    }

    @Test
    public void testGetShortCanonicalName_String_MultiDimArray() {
        // "[[I" -> dim=2, base "I" -> "int" -> "int[][]"
        assertEquals("int[][]", ClassUtils.getShortCanonicalName("[[I"));
    }

    @Test
    public void testGetShortCanonicalName_String_PlainNoArray() {
        // dim < 1 branch -> unchanged
        assertEquals("String", ClassUtils.getShortCanonicalName("java.lang.String"));
    }

    // =========================================================
    // getPackageCanonicalName
    // =========================================================
    @Test
    public void testGetPackageCanonicalName_ObjectValueIfNull_Null() {
        assertEquals("NULL", ClassUtils.getPackageCanonicalName((Object) null, "NULL"));
    }

    @Test
    public void testGetPackageCanonicalName_ObjectValueIfNull_NonNull() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("abc", "NULL"));
    }

    @Test
    public void testGetPackageCanonicalName_Class_Null() {
        assertEquals("", ClassUtils.getPackageCanonicalName((Class<?>) null));
    }

    @Test
    public void testGetPackageCanonicalName_Class_NonNull() {
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName(String.class));
    }

    @Test
    public void testGetPackageCanonicalName_String_ObjectArray() {
        // "[Ljava.lang.String;" -> "java.lang.String[]" -> package "java.lang"
        assertEquals("java.lang", ClassUtils.getPackageCanonicalName("[Ljava.lang.String;"));
    }

    @Test
    public void testGetPackageCanonicalName_String_NoDot() {
        assertEquals("", ClassUtils.getPackageCanonicalName("String"));
    }
}
```

## สรุป Branch/Condition Coverage

| เมธอดทดสอบ (กลุ่ม) | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testGetShortClassName_*` | null object/class/string, empty string, no-dot, with-dot, inner-class `$` replace (`innerIdx != -1`) |
| `testGetPackageName_*` | null object/class/string, `lastIndexOf == -1`, มี dot |
| `testGetAllSuperclasses_*` | null input, superclass == null (loop ไม่รัน), มี superclass (loop รัน) |
| `testGetAllInterfaces_*` | null input, ไม่มี interface, diamond hierarchy (`interfacesFound.add()` ทั้ง true/false + recursion) |
| `testConvertClassNamesToClasses_*` | null list, ชื่อ valid, ชื่อ invalid (catch Exception), null entry (NPE ถูก catch) |
| `testConvertClassesToClassNames_*` | null list, element null, element valid |
| `testIsAssignableArray_*` | length ไม่เท่ากัน, ทั้งคู่ null, true/false ตาม loop, autoboxing true/false |
| `testIsAssignable_*` (single Class) | `toClass==null`, `cls==null` (primitive/non-primitive), autoboxing ทุกเงื่อนไข (`cls.isPrimitive()&&!toClass.isPrimitive()` และกลับกัน, wrapper/primitive map ได้ null), `cls.equals(toClass)`, primitive→non-primitive false, Integer/Long/Boolean/Double/Float/Character/Short/Byte TYPE ทุก branch ทั้ง true/false, void fallthrough ("should never get here"), `toClass.isAssignableFrom(cls)` true/false |
| `testPrimitiveToWrapper_*`, `testPrimitivesToWrappers_*` | null, primitive, non-primitive, array null/empty/with-null-element |
| `testWrapperToPrimitive_*`, `testWrappersToPrimitives_*` | wrapper, non-wrapper, null, array null/empty/mixed |
| `testIsInnerClass_*` | null, มี `$`, ไม่มี `$` |
| `testGetClass_*` | abbreviation map hit, canonical name ปกติ, canonical array name (`toCanonicalName` loop), ชื่อไม่ถูกต้อง (`ClassNotFoundException`), overload ต่าง ๆ |
| `testGetPublicMethod_*` | public class ตรง (`Modifier.isPublic` true ทันที), ผ่าน interface candidate (`continue` ใน loop ถูกข้าม/ไม่ข้าม), `NoSuchMethodException` จาก `cls.getMethod` แรก |
| `testToClass_*` | null, empty array, array มี element |
| `testGetShortCanonicalName_*` / `testGetPackageCanonicalName_*` | array encoding `[I`, `[Ljava...;`, multi-dim `[[I`, ไม่ใช่ array (`dim<1`), null input, **กรณี abbreviation ไม่พบ (`reverseAbbreviationMap.get` == null) ทำให้เกิด NPE ใน `new StringBuffer(null)`** (แฟลก fault ที่พบในซอร์ส) |

**หมายเหตุ:** กรณี `getPublicMethod` ที่ทุก candidate class ไม่ public (เข้าสู่ `throw new NoSuchMethodException(...)` ท้ายเมธอดหลัง loop หมด) ไม่ได้ถูกจำลองเนื่องจากต้องสร้าง hierarchy ที่ซับซ้อนมาก (ไม่มี public class/interface ใดประกาศ method นั้นเลย) ซึ่งหายากในคลาส JDK มาตรฐาน — ทำเครื่องหมายเป็นข้อจำกัดที่ทราบ (ไม่ได้เดา behavior เพิ่ม)