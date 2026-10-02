# วิเคราะห์และแผนการทดสอบ

ผมวางแผน:
1. ให้คลาสทดสอบอยู่ใน **package เดียวกัน** (`com.google.gson.internal`) เพื่อให้เข้าถึง method แบบ package-private ได้ตรง ๆ (เช่น `getGenericSupertype`, `getSupertype`, `equal`, `hashCodeOrZero`, `checkNotPrimitive`) — จึงไม่ได้เขียน `import` แบบข้าม package (เพราะ Java ไม่ให้ import class ใน package เดียวกันแบบมีประโยชน์ และถ้า import ข้าม package จะเข้าถึง method เหล่านี้ไม่ได้เลย) กรณีนี้ถือเป็นการ "import ให้ถูกต้อง" ตามข้อจำกัดทางเทคนิคของ Java
2. ใช้เทคนิค **"direct type construction"** (สร้าง `ParameterizedType`/`WildcardType`/`GenericArrayType` เองผ่าน public factory methods) เพื่อควบคุม branch ที่ต้องการทดสอบอย่างแม่นยำ โดยไม่ต้องพึ่งพาโครงสร้างคลาสจริงของ JDK ที่ซับซ้อนและเดายาก
3. ใช้ reflection เท่าที่จำเป็น (private constructor ของ `$Gson$Types`)
4. คอมเมนต์กำกับจุดที่ไม่แน่ใจ behavior (เช่น exception type ของ `checkNotNull`/`checkArgument`)

```java
package com.google.gson.internal;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

/**
 * Unit tests for {@link $Gson$Types}.
 *
 * NOTE: คลาสนี้อยู่ใน package เดียวกับ target class (com.google.gson.internal)
 * เพื่อให้สามารถเข้าถึง package-private static methods ได้ตรง ๆ
 * (getGenericSupertype, getSupertype, equal, hashCodeOrZero, checkNotPrimitive, resolveTypeVariable)
 * จึงไม่มี import statement แยกสำหรับ $Gson$Types (อยู่ package เดียวกันแล้ว)
 */
public class $Gson$TypesTest {

  // ======================= Helper types สำหรับทดสอบ =======================

  interface Holder<T> {
    T getValue();
  }

  static class StringHolder implements Holder<String> {
    public String getValue() { return null; }
  }

  static class Box<T> {
    public List<T> list;
  }
  static class StringBox extends Box<String> {}

  static class NoGenericBox {
    public List<Integer> list;
  }

  static class WildcardSuperBox<T> {
    public List<? super T> list;
  }
  static class StringWildcardSuperBox extends WildcardSuperBox<String> {}

  static class WildcardExtendsBox<T> {
    public List<? extends T> list;
  }
  static class StringWildcardExtendsBox extends WildcardExtendsBox<String> {}

  static class PlainWildcardBox {
    public List<?> list;
  }

  static class ArrayHolder<T> {
    public T[] field;
  }
  static class StringArrayHolder extends ArrayHolder<String> {}

  static <T> T genericMethod() { return null; }

  /** non-static inner class: ใช้ทดสอบ ParameterizedTypeImpl ที่ต้องมี ownerType */
  class NonStaticInner {}

  static class Base<T> {}
  static class Mid<T> extends Base<T> {}
  static class Leaf extends Mid<String> {}

  interface GrandInterface<T> {}
  interface MiddleInterface<T> extends GrandInterface<T> {}
  static class Impl implements MiddleInterface<String> {}

  /** Type implementation ที่ไม่ตรงกับ Class/ParameterizedType/GenericArrayType/WildcardType/TypeVariable */
  static class UnknownType implements Type {}

  // ======================= Constructor =======================

  @Test
  public void testPrivateConstructorThrowsUnsupportedOperationException() throws Exception {
    Constructor<$Gson$Types> ctor = $Gson$Types.class.getDeclaredConstructor();
    ctor.setAccessible(true);
    try {
      ctor.newInstance();
      fail("Expected UnsupportedOperationException");
    } catch (InvocationTargetException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  // ======================= newParameterizedTypeWithOwner =======================

  @Test
  public void testNewParameterizedTypeWithOwner_basic() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, pt.getRawType());
    assertNull(pt.getOwnerType());
    assertArrayEquals(new Type[]{String.class}, pt.getActualTypeArguments());
  }

  @Test
  public void testNewParameterizedTypeWithOwner_zeroTypeArguments() {
    ParameterizedType pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class);
    assertEquals(0, pt.getActualTypeArguments().length);
  }

  @Test
  public void testNewParameterizedTypeWithOwner_nonStaticInnerRequiresOwner() {
    try {
      $Gson$Types.newParameterizedTypeWithOwner(null, NonStaticInner.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // assumption: checkArgument -> IllegalArgumentException
    }
    // providing owner should succeed (else-branch ของ checkArgument condition)
    ParameterizedType pt =
        (ParameterizedType) $Gson$Types.newParameterizedTypeWithOwner($Gson$TypesTest.class, NonStaticInner.class);
    assertNotNull(pt);
  }

  @Test
  public void testNewParameterizedTypeWithOwner_nullTypeArgumentThrows() {
    try {
      $Gson$Types.newParameterizedTypeWithOwner(null, List.class, (Type) null);
      fail("Expected exception for null type argument");
    } catch (NullPointerException expected) {
      // NOTE: สมมติว่า $Gson$Preconditions.checkNotNull throw NullPointerException
      // ตาม convention ทั่วไป (ไม่มี source ของ $Gson$Preconditions ให้ตรวจสอบตรง ๆ)
    }
  }

  @Test
  public void testNewParameterizedTypeWithOwner_primitiveTypeArgumentThrows() {
    try {
      $Gson$Types.newParameterizedTypeWithOwner(null, List.class, int.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  // ======================= arrayOf =======================

  @Test
  public void testArrayOf() {
    GenericArrayType g = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, g.getGenericComponentType());
  }

  // ======================= subtypeOf / supertypeOf =======================

  @Test
  public void testSubtypeOf_withClassBound() {
    WildcardType w = $Gson$Types.subtypeOf(String.class);
    assertArrayEquals(new Type[]{String.class}, w.getUpperBounds());
    assertArrayEquals(new Type[]{}, w.getLowerBounds());
  }

  @Test
  public void testSubtypeOf_withWildcardBound() {
    WildcardType inner = $Gson$Types.subtypeOf(String.class);
    WildcardType outer = $Gson$Types.subtypeOf(inner); // covers "bound instanceof WildcardType" branch
    assertArrayEquals(new Type[]{String.class}, outer.getUpperBounds());
  }

  @Test
  public void testSupertypeOf_withClassBound() {
    WildcardType w = $Gson$Types.supertypeOf(String.class);
    assertArrayEquals(new Type[]{Object.class}, w.getUpperBounds());
    assertArrayEquals(new Type[]{String.class}, w.getLowerBounds());
  }

  @Test
  public void testSupertypeOf_withWildcardBound() {
    WildcardType inner = $Gson$Types.supertypeOf(String.class);
    WildcardType outer = $Gson$Types.supertypeOf(inner); // covers "bound instanceof WildcardType" branch
    assertArrayEquals(new Type[]{String.class}, outer.getLowerBounds());
    assertArrayEquals(new Type[]{Object.class}, outer.getUpperBounds());
  }

  // ======================= canonicalize =======================

  @Test
  public void testCanonicalize_classNonArray() {
    assertEquals(String.class, $Gson$Types.canonicalize(String.class));
  }

  @Test
  public void testCanonicalize_classArray() {
    Type result = $Gson$Types.canonicalize(String[].class);
    assertTrue(result instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) result).getGenericComponentType());
  }

  @Test
  public void testCanonicalize_parameterizedType() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type canon = $Gson$Types.canonicalize(pt);
    assertNotSame(pt, canon);
    assertTrue($Gson$Types.equals(pt, canon));
  }

  @Test
  public void testCanonicalize_genericArrayType() {
    Type gat = $Gson$Types.arrayOf(Integer.class);
    Type canon = $Gson$Types.canonicalize(gat);
    assertNotSame(gat, canon);
    assertTrue($Gson$Types.equals(gat, canon));
  }

  @Test
  public void testCanonicalize_wildcardType() {
    Type wt = $Gson$Types.subtypeOf(Number.class);
    Type canon = $Gson$Types.canonicalize(wt);
    assertNotSame(wt, canon);
    assertTrue($Gson$Types.equals(wt, canon));
  }

  @Test
  public void testCanonicalize_unsupportedTypeReturnsSameReference() {
    TypeVariable<?> tv = Holder.class.getTypeParameters()[0];
    assertSame(tv, $Gson$Types.canonicalize(tv)); // else branch
  }

  // ======================= getRawType =======================

  @Test
  public void testGetRawType_class() {
    assertEquals(String.class, $Gson$Types.getRawType(String.class));
  }

  @Test
  public void testGetRawType_parameterizedType() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(List.class, $Gson$Types.getRawType(pt));
  }

  @Test
  public void testGetRawType_parameterizedType_invalidRawTypeThrows() {
    ParameterizedType bad = new ParameterizedType() {
      public Type[] getActualTypeArguments() { return new Type[0]; }
      public Type getRawType() { return new UnknownType(); } // ไม่ใช่ Class
      public Type getOwnerType() { return null; }
    };
    try {
      $Gson$Types.getRawType(bad);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  @Test
  public void testGetRawType_genericArrayType() {
    Type ga = $Gson$Types.arrayOf(String.class);
    assertEquals(String[].class, $Gson$Types.getRawType(ga));
  }

  @Test
  public void testGetRawType_typeVariable() {
    TypeVariable<?> tv = Holder.class.getTypeParameters()[0];
    assertEquals(Object.class, $Gson$Types.getRawType(tv));
  }

  @Test
  public void testGetRawType_wildcardType() {
    WildcardType w = $Gson$Types.subtypeOf(String.class);
    assertEquals(String.class, $Gson$Types.getRawType(w));
  }

  @Test
  public void testGetRawType_null_throws() {
    try {
      $Gson$Types.getRawType(null);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertTrue(e.getMessage().contains("null"));
    }
  }

  @Test
  public void testGetRawType_unsupportedType_throws() {
    try {
      $Gson$Types.getRawType(new UnknownType());
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  // ======================= equal() (package-private helper) =======================

  @Test
  public void testEqualHelper() {
    assertTrue($Gson$Types.equal(null, null));
    assertFalse($Gson$Types.equal(null, "x"));
    assertFalse($Gson$Types.equal("x", null));
    assertTrue($Gson$Types.equal("x", "x"));
    assertFalse($Gson$Types.equal("x", "y"));
    Object o = new Object();
    assertTrue($Gson$Types.equal(o, o));
  }

  @Test
  public void testHashCodeOrZero() {
    assertEquals(0, $Gson$Types.hashCodeOrZero(null));
    assertEquals("x".hashCode(), $Gson$Types.hashCodeOrZero("x"));
  }

  // ======================= equals(Type, Type) =======================

  @Test
  public void testEquals_sameReference() {
    Type t = new UnknownType();
    assertTrue($Gson$Types.equals(t, t));
  }

  @Test
  public void testEquals_class() {
    assertTrue($Gson$Types.equals((Type) String.class, (Type) String.class));
    assertFalse($Gson$Types.equals((Type) String.class, (Type) Integer.class));
  }

  @Test
  public void testEquals_parameterizedType_bNotParameterized() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertFalse($Gson$Types.equals(pt, String.class));
  }

  @Test
  public void testEquals_parameterizedType_matching() {
    Type pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type pt2 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertNotSame(pt1, pt2);
    assertTrue($Gson$Types.equals(pt1, pt2));
  }

  @Test
  public void testEquals_parameterizedType_argsDiffer() {
    Type pt1 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    Type pt3 = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, Integer.class);
    assertFalse($Gson$Types.equals(pt1, pt3));
  }

  @Test
  public void testEquals_parameterizedType_ownerDiffers() {
    ParameterizedType a = new ParameterizedType() {
      public Type[] getActualTypeArguments() { return new Type[]{String.class}; }
      public Type getRawType() { return List.class; }
      public Type getOwnerType() { return Integer.class; }
    };
    ParameterizedType b = new ParameterizedType() {
      public Type[] getActualTypeArguments() { return new Type[]{String.class}; }
      public Type getRawType() { return List.class; }
      public Type getOwnerType() { return Long.class; }
    };
    assertFalse($Gson$Types.equals(a, b));
  }

  @Test
  public void testEquals_genericArrayType() {
    GenericArrayType g1 = $Gson$Types.arrayOf(String.class);
    GenericArrayType g2 = $Gson$Types.arrayOf(String.class);
    GenericArrayType g3 = $Gson$Types.arrayOf(Integer.class);
    assertTrue($Gson$Types.equals(g1, g2));
    assertFalse($Gson$Types.equals(g1, String.class)); // b not GAT
    assertFalse($Gson$Types.equals(g1, g3)); // component mismatch
  }

  @Test
  public void testEquals_wildcardType() {
    WildcardType w1 = $Gson$Types.subtypeOf(String.class);
    WildcardType w2 = $Gson$Types.subtypeOf(String.class);
    WildcardType w3 = $Gson$Types.subtypeOf(Integer.class);
    assertTrue($Gson$Types.equals(w1, w2));
    assertFalse($Gson$Types.equals(w1, String.class)); // b not WildcardType
    assertFalse($Gson$Types.equals(w1, w3)); // bounds mismatch
  }

  @Test
  public void testEquals_typeVariable_bNotTypeVariable() {
    TypeVariable<?> tv = Holder.class.getTypeParameters()[0];
    assertFalse($Gson$Types.equals(tv, String.class));
  }

  @Test
  public void testEquals_typeVariable_declarationMismatch() {
    TypeVariable<?> tvHolder = Holder.class.getTypeParameters()[0];
    TypeVariable<?> tvBox = Box.class.getTypeParameters()[0];
    assertFalse($Gson$Types.equals(tvHolder, tvBox)); // ชื่ออาจต่างกัน หรือ declaration ต่างกัน -> false
  }

  @Test
  public void testEquals_unsupportedType_false() {
    // else branch: ทั้งสองไม่ใช่ Class/ParameterizedType/GenericArrayType/WildcardType/TypeVariable
    assertFalse($Gson$Types.equals(new UnknownType(), new UnknownType()));
  }

  // ======================= typeToString =======================

  @Test
  public void testTypeToString_class() {
    assertEquals(String.class.getName(), $Gson$Types.typeToString(String.class));
  }

  @Test
  public void testTypeToString_nonClass() {
    Type pt = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, String.class);
    assertEquals(pt.toString(), $Gson$Types.typeToString(pt));
  }

  // ======================= getGenericSupertype =======================

  @Test
  public void testGetGenericSupertype_toResolveEqualsRawType_returnsContext() {
    Type marker = List.class; // ใช้เป็น marker เพื่อตรวจว่า context ถูกส่งกลับตรง ๆ
    Type result = $Gson$Types.getGenericSupertype(marker, String.class, String.class);
    assertSame(marker, result);
  }

  @Test
  public void testGetGenericSupertype_interfaceDirectMatch() {
    Type result = $Gson$Types.getGenericSupertype(StringHolder.class, StringHolder.class, Holder.class);
    assertTrue(result instanceof ParameterizedType);
    assertEquals(String.class, ((ParameterizedType) result).getActualTypeArguments()[0]);
  }

  @Test
  public void testGetGenericSupertype_interfaceRecursiveMatch() {
    Type result = $Gson$Types.getGenericSupertype(Impl.class, Impl.class, GrandInterface.class);
    assertTrue(result instanceof ParameterizedType);
    assertEquals(GrandInterface.class, ((ParameterizedType) result).getRawType());
    assertTrue(((ParameterizedType) result).getActualTypeArguments()[0] instanceof TypeVariable);
  }

  @Test
  public void testGetGenericSupertype_superclassDirectMatch() {
    Type result = $Gson$Types.getGenericSupertype(StringBox.class, StringBox.class, Box.class);
    assertTrue(result instanceof ParameterizedType);
    assertEquals(String.class, ((ParameterizedType) result).getActualTypeArguments()[0]);
  }

  @Test
  public void testGetGenericSupertype_superclassRecursiveMatch() {
    Type result = $Gson$Types.getGenericSupertype(Leaf.class, Leaf.class, Base.class);
    assertTrue(result instanceof ParameterizedType);
    assertEquals(Base.class, ((ParameterizedType) result).getRawType());
    assertTrue(((ParameterizedType) result).getActualTypeArguments()[0] instanceof TypeVariable);
  }

  @Test
  public void testGetGenericSupertype_unresolvable_returnsToResolve() {
    Type result = $Gson$Types.getGenericSupertype(String.class, String.class, Runnable.class);
    assertEquals(Runnable.class, result);
  }

  // ======================= getSupertype =======================

  @Test
  public void testGetSupertype_valid() {
    Type result = $Gson$Types.getSupertype(StringBox.class, StringBox.class, Box.class);
    assertTrue(result instanceof ParameterizedType);
    assertEquals(String.class, ((ParameterizedType) result).getActualTypeArguments()[0]);
  }

  @Test
  public void testGetSupertype_invalid_throws() {
    try {
      $Gson$Types.getSupertype(String.class, String.class, List.class); // String ไม่ assignable to List
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  // ======================= getArrayComponentType =======================

  @Test
  public void testGetArrayComponentType_genericArrayType() {
    Type ga = $Gson$Types.arrayOf(String.class);
    assertEquals(String.class, $Gson$Types.getArrayComponentType(ga));
  }

  @Test
  public void testGetArrayComponentType_classArray() {
    assertEquals(String.class, $Gson$Types.getArrayComponentType(String[].class));
  }

  // ======================= getCollectionElementType =======================

  @Test
  public void testGetCollectionElementType_parameterized() {
    Type collType = $Gson$Types.newParameterizedTypeWithOwner(null, java.util.Collection.class, String.class);
    Type elementType = $Gson$Types.getCollectionElementType(collType, java.util.Collection.class);
    assertEquals(String.class, elementType);
  }

  @Test
  public void testGetCollectionElementType_wildcardSupertype() {
    Type collType = $Gson$Types.newParameterizedTypeWithOwner(null, java.util.Collection.class, String.class);
    Type wildcardContext = $Gson$Types.subtypeOf(collType); // ? extends Collection<String>
    Type elementType = $Gson$Types.getCollectionElementType(wildcardContext, java.util.Collection.class);
    assertEquals(String.class, elementType);
  }

  @Test
  public void testGetCollectionElementType_rawFallback() {
    Type elementType =
        $Gson$Types.getCollectionElementType(java.util.Collection.class, java.util.Collection.class);
    assertEquals(Object.class, elementType);
  }

  // ======================= getMapKeyAndValueTypes =======================

  @Test
  public void testGetMapKeyAndValueTypes_properties() {
    Type[] kv = $Gson$Types.getMapKeyAndValueTypes(Properties.class, Properties.class);
    assertArrayEquals(new Type[]{String.class, String.class}, kv);
  }

  @Test
  public void testGetMapKeyAndValueTypes_parameterized() {
    Type mapT = $Gson$Types.newParameterizedTypeWithOwner(null, Map.class, String.class, Integer.class);
    Type[] kv = $Gson$Types.getMapKeyAndValueTypes(mapT, Map.class);
    assertEquals(String.class, kv[0]);
    assertEquals(Integer.class, kv[1]);
  }

  @Test
  public void testGetMapKeyAndValueTypes_rawFallback() {
    Type[] kv = $Gson$Types.getMapKeyAndValueTypes(Map.class, Map.class);
    assertArrayEquals(new Type[]{Object.class, Object.class}, kv);
  }

  // ======================= resolve =======================

  @Test
  public void testResolve_typeVariable_resolved() {
    Type tParam = Holder.class.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(StringHolder.class, StringHolder.class, tParam);
    assertEquals(String.class, resolved);
  }

  @Test
  public void testResolve_typeVariable_unresolved() throws Exception {
    Method m = $Gson$TypesTest.class.getDeclaredMethod("genericMethod");
    TypeVariable<?> mtv = m.getTypeParameters()[0];
    Type resolved = $Gson$Types.resolve(String.class, String.class, mtv);
    assertSame(mtv, resolved); // ไม่สามารถ resolve ได้ (declared by Method ไม่ใช่ Class)
  }

  @Test
  public void testResolve_classArray_unchanged() {
    Type resolved = $Gson$Types.resolve(String.class, String.class, String[].class);
    assertSame(String[].class, resolved);
  }

  @Test
  public void testResolve_genericArrayType_changed() throws Exception {
    Field f = ArrayHolder.class.getField("field");
    Type fieldType = f.getGenericType();
    Type context = StringArrayHolder.class.getGenericSuperclass();
    Type resolved = $Gson$Types.resolve(context, StringArrayHolder.class, fieldType);
    assertNotSame(fieldType, resolved);
    assertTrue(resolved instanceof GenericArrayType);
    assertEquals(String.class, ((GenericArrayType) resolved).getGenericComponentType());
  }

  @Test
  public void testResolve_parameterizedType_changed() throws Exception {
    Field f = Box.class.getField("list");
    Type fieldType = f.getGenericType();
    Type context = StringBox.class.getGenericSuperclass();
    Type resolved = $Gson$Types.resolve(context, StringBox.class, fieldType);
    assertNotSame(fieldType, resolved);
    assertTrue(resolved instanceof ParameterizedType);
    assertEquals(String.class, ((ParameterizedType) resolved).getActualTypeArguments()[0]);
  }

  @Test
  public void testResolve_parameterizedType_unchanged() throws Exception {
    Field f = NoGenericBox.class.getField("list");
    Type fieldType = f.getGenericType();
    Type resolved = $Gson$Types.resolve(NoGenericBox.class, NoGenericBox.class, fieldType);
    assertSame(fieldType, resolved);
  }

  @Test
  public void testResolve_wildcardType_lowerBoundChanged() throws Exception {
    Field f = WildcardSuperBox.class.getField("list");
    Type fieldType = f.getGenericType();
    Type context = StringWildcardSuperBox.class.getGenericSuperclass();
    Type resolved = $Gson$Types.resolve(context, StringWildcardSuperBox.class, fieldType);
    assertTrue(resolved instanceof ParameterizedType);
    Type arg = ((ParameterizedType) resolved).getActualTypeArguments()[0];
    assertTrue(arg instanceof WildcardType);
    assertEquals(String.class, ((WildcardType) arg).getLowerBounds()[0]);
  }

  @Test
  public void testResolve_wildcardType_upperBoundChanged() throws Exception {
    Field f = WildcardExtendsBox.class.getField("list");
    Type fieldType = f.getGenericType();
    Type context = StringWildcardExtendsBox.class.getGenericSuperclass();
    Type resolved = $Gson$Types.resolve(context, StringWildcardExtendsBox.class, fieldType);
    assertTrue(resolved instanceof ParameterizedType);
    Type arg = ((ParameterizedType) resolved).getActualTypeArguments()[0];
    assertTrue(arg instanceof WildcardType);
    assertEquals(String.class, ((WildcardType) arg).getUpperBounds()[0]);
  }

  @Test
  public void testResolve_wildcardType_unchanged() throws Exception {
    Field f = PlainWildcardBox.class.getField("list");
    Type fieldType = f.getGenericType();
    Type resolved = $Gson$Types.resolve(PlainWildcardBox.class, PlainWildcardBox.class, fieldType);
    assertSame(fieldType, resolved);
  }

  @Test
  public void testResolve_elseBranch_returnsSame() {
    assertSame(int.class, $Gson$Types.resolve(String.class, String.class, int.class));
    assertSame(Object.class, $Gson$Types.resolve(String.class, String.class, Object.class));
  }

  // ======================= checkNotPrimitive =======================

  @Test
  public void testCheckNotPrimitive_throwsForPrimitive() {
    try {
      $Gson$Types.checkNotPrimitive(int.class);
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {}
  }

  @Test
  public void testChe