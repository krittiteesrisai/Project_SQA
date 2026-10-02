# วิเคราะห์ Branch ที่ต้องครอบคลุม

จากซอร์สโค้ด `ConstructorConstructor` มี branch หลักๆ ดังนี้:
1. `get()`: typeCreator != null / == null
2. `get()`: rawTypeCreator != null / == null
3. `get()`: defaultConstructor != null / == null
4. `get()`: defaultImplementation != null / == null (fallback ไป unsafe)
5. `newDefaultConstructor()`: NoSuchMethodException (return null) / สำเร็จ, isAccessible() true/false
6. `newDefaultConstructor().construct()`: InstantiationException / InvocationTargetException / IllegalAccessException / success
7. `newDefaultImplementationConstructor()`: Collection branch → SortedSet / EnumSet / Set / Queue / else(List)
8. EnumSet.construct(): ParameterizedType+Class / ParameterizedType+non-Class / not ParameterizedType
9. Map branch → SortedMap / (ParameterizedType && key ไม่ใช่ String) / else(LinkedTreeMap)
10. ไม่เข้า Collection/Map เลย → newUnsafeAllocator
11. `toString()`

# ชุดทดสอบ JUnit 4

```java
package com.google.gson.internal;

import static org.junit.Assert.*;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class ConstructorConstructorTest {

  private Map<Type, InstanceCreator<?>> emptyCreators;
  private ConstructorConstructor defaultCC;

  // ---------- Helper classes ----------

  static class PublicNoArg {
    public PublicNoArg() { }
  }

  static class PrivateNoArg {
    private PrivateNoArg() { }
  }

  abstract static class AbstractWithNoArgCtor {
    public AbstractWithNoArgCtor() { }
  }

  static class ThrowingCtor {
    public ThrowingCtor() {
      throw new IllegalStateException("boom");
    }
  }

  static class NoNoArgCtor {
    final int x;
    public NoNoArgCtor(int x) {
      this.x = x;
    }
  }

  enum MyEnum { A, B }

  @Before
  public void setUp() {
    emptyCreators = new HashMap<Type, InstanceCreator<?>>();
    defaultCC = new ConstructorConstructor(emptyCreators);
  }

  // ---------- InstanceCreator: exact type match ----------

  @Test
  public void testInstanceCreatorExactTypeMatchTakesPriority() {
    Type exactType = new TypeToken<List<String>>() { }.getType();
    Class<?> rawType = List.class;

    InstanceCreator<List<Object>> exactCreator = new InstanceCreator<List<Object>>() {
      @Override public List<Object> createInstance(Type type) {
        return new ArrayList<Object>(Arrays.asList("EXACT"));
      }
    };
    InstanceCreator<List<Object>> rawCreator = new InstanceCreator<List<Object>>() {
      @Override public List<Object> createInstance(Type type) {
        return new ArrayList<Object>(Arrays.asList("RAW"));
      }
    };

    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    creators.put(exactType, exactCreator);
    creators.put(rawType, rawCreator);

    ConstructorConstructor cc = new ConstructorConstructor(creators);
    ObjectConstructor<List<String>> oc = cc.get(new TypeToken<List<String>>() { });
    List<String> result = oc.construct();

    assertEquals(Arrays.asList("EXACT"), result);
  }

  // ---------- InstanceCreator: raw type fallback ----------

  @Test
  public void testInstanceCreatorRawTypeFallback() {
    Class<?> rawType = List.class;
    InstanceCreator<List<Object>> rawCreator = new InstanceCreator<List<Object>>() {
      @Override public List<Object> createInstance(Type type) {
        return new ArrayList<Object>(Arrays.asList("RAW2"));
      }
    };

    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    creators.put(rawType, rawCreator); // ไม่มี exact type key

    ConstructorConstructor cc = new ConstructorConstructor(creators);
    // exact type ของ List<Integer> ไม่ตรงกับ key ที่เก็บไว้
    ObjectConstructor<List<Integer>> oc = cc.get(new TypeToken<List<Integer>>() { });
    List<Integer> result = oc.construct();

    assertEquals(Arrays.asList("RAW2"), result);
  }

  // ---------- newDefaultConstructor: public no-arg ----------

  @Test
  public void testDefaultConstructorPublicNoArg() {
    ObjectConstructor<PublicNoArg> oc = defaultCC.get(TypeToken.get(PublicNoArg.class));
    PublicNoArg instance = oc.construct();
    assertNotNull(instance);
  }

  // ---------- newDefaultConstructor: private no-arg (setAccessible branch) ----------

  @Test
  public void testDefaultConstructorPrivateNoArgSetAccessible() {
    ObjectConstructor<PrivateNoArg> oc = defaultCC.get(TypeToken.get(PrivateNoArg.class));
    PrivateNoArg instance = oc.construct();
    assertNotNull(instance);
  }

  // ---------- construct(): InstantiationException wrapped ----------

  @Test
  public void testDefaultConstructorInstantiationExceptionWrapped() {
    ObjectConstructor<AbstractWithNoArgCtor> oc =
        defaultCC.get(TypeToken.get(AbstractWithNoArgCtor.class));
    try {
      oc.construct();
      fail("Expected RuntimeException wrapping InstantiationException");
    } catch (RuntimeException e) {
      assertTrue(e.getCause() instanceof InstantiationException);
    }
  }

  // ---------- construct(): InvocationTargetException wrapped ----------

  @Test
  public void testDefaultConstructorInvocationTargetExceptionWrapped() {
    ObjectConstructor<ThrowingCtor> oc = defaultCC.get(TypeToken.get(ThrowingCtor.class));
    try {
      oc.construct();
      fail("Expected RuntimeException wrapping target exception");
    } catch (RuntimeException e) {
      assertTrue(e.getCause() instanceof IllegalStateException);
      assertEquals("boom", e.getCause().getMessage());
    }
  }

  // ---------- Collection: SortedSet ----------

  @Test
  public void testCollectionSortedSet() {
    ObjectConstructor<SortedSet<String>> oc = defaultCC.get(new TypeToken<SortedSet<String>>() { });
    SortedSet<String> result = oc.construct();
    assertTrue(result instanceof TreeSet);
  }

  // ---------- Collection: EnumSet valid (ParameterizedType + Class) ----------

  @Test
  public void testCollectionEnumSetValid() {
    ObjectConstructor<EnumSet<MyEnum>> oc = defaultCC.get(new TypeToken<EnumSet<MyEnum>>() { });
    EnumSet<MyEnum> result = oc.construct();
    assertNotNull(result);
    assertTrue(result.isEmpty());
  }

  // ---------- Collection: EnumSet with wildcard (ParameterizedType, not Class) ----------

  @Test(expected = JsonIOException.class)
  public void testCollectionEnumSetWildcardThrows() {
    ObjectConstructor<EnumSet<?>> oc = defaultCC.get(new TypeToken<EnumSet<?>>() { });
    oc.construct();
  }

  // ---------- Collection: EnumSet raw type (ไม่ใช่ ParameterizedType) ----------

  @Test(expected = JsonIOException.class)
  public void testCollectionEnumSetRawThrows() {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    ObjectConstructor<EnumSet> oc = defaultCC.get(TypeToken.get(EnumSet.class));
    oc.construct();
  }

  // ---------- Collection: Set ----------

  @Test
  public void testCollectionSet() {
    ObjectConstructor<Set<String>> oc = defaultCC.get(new TypeToken<Set<String>>() { });
    Set<String> result = oc.construct();
    assertTrue(result instanceof LinkedHashSet);
  }

  // ---------- Collection: Queue ----------

  @Test
  public void testCollectionQueue() {
    ObjectConstructor<Queue<String>> oc = defaultCC.get(new TypeToken<Queue<String>>() { });
    Queue<String> result = oc.construct();
    assertTrue(result instanceof LinkedList);
  }

  // ---------- Collection: default (List / else branch) ----------

  @Test
  public void testCollectionDefaultList() {
    ObjectConstructor<List<String>> oc = defaultCC.get(new TypeToken<List<String>>() { });
    List<String> result = oc.construct();
    assertTrue(result instanceof ArrayList);
  }

  // ---------- Map: SortedMap ----------

  @Test
  public void testMapSortedMap() {
    ObjectConstructor<SortedMap<String, Integer>> oc =
        defaultCC.get(new TypeToken<SortedMap<String, Integer>>() { });
    SortedMap<String, Integer> result = oc.construct();
    assertTrue(result instanceof TreeMap);
  }

  // ---------- Map: ParameterizedType, key ไม่ใช่ String -> LinkedHashMap ----------

  @Test
  public void testMapNonStringKeyLinkedHashMap() {
    ObjectConstructor<Map<Integer, String>> oc =
        defaultCC.get(new TypeToken<Map<Integer, String>>() { });
    Map<Integer, String> result = oc.construct();
    assertTrue(result instanceof LinkedHashMap);
  }

  // ---------- Map: ParameterizedType, key เป็น String -> LinkedTreeMap ----------

  @Test
  public void testMapStringKeyLinkedTreeMap() {
    ObjectConstructor<Map<String, String>> oc =
        defaultCC.get(new TypeToken<Map<String, String>>() { });
    Map<String, String> result = oc.construct();
    assertTrue(result instanceof LinkedTreeMap);
  }

  // ---------- Map: raw type (ไม่ใช่ ParameterizedType) -> LinkedTreeMap (else) ----------

  @Test
  @SuppressWarnings("rawtypes")
  public void testMapRawTypeLinkedTreeMap() {
    ObjectConstructor<Map> oc = defaultCC.get(TypeToken.get(Map.class));
    Map result = oc.construct();
    assertTrue(result instanceof LinkedTreeMap);
  }

  // ---------- Fallback: newUnsafeAllocator (ไม่มี no-arg ctor, ไม่ใช่ Collection/Map) ----------

  @Test
  public void testUnsafeAllocatorFallback() {
    ObjectConstructor<NoNoArgCtor> oc = defaultCC.get(TypeToken.get(NoNoArgCtor.class));
    NoNoArgCtor instance = oc.construct();
    assertNotNull(instance);
    // ผ่าน Unsafe ทำให้ field int ได้ค่า default (0) โดยไม่ผ่าน constructor จริง
    assertEquals(0, instance.x);
  }

  // ---------- toString() ----------

  @Test
  public void testToStringDelegatesToInstanceCreatorsMap() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    InstanceCreator<PublicNoArg> creator = new InstanceCreator<PublicNoArg>() {
      @Override public PublicNoArg createInstance(Type type) {
        return new PublicNoArg();
      }
    };
    creators.put(PublicNoArg.class, creator);

    ConstructorConstructor cc = new ConstructorConstructor(creators);
    assertEquals(creators.toString(), cc.toString());
  }

  // ---------- edge case: empty instanceCreators map ทำงานได้ (ไม่ NPE) ----------

  @Test
  public void testEmptyInstanceCreatorsMapDoesNotThrow() {
    ObjectConstructor<PublicNoArg> oc = defaultCC.get(TypeToken.get(PublicNoArg.class));
    assertNotNull(oc);
    assertNotNull(oc.construct());
  }
}
```

# สรุปตาราง Test ↔ Branch/Condition ที่ครอบคลุม

| เมธอด Test | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInstanceCreatorExactTypeMatchTakesPriority` | `get()`: `typeCreator != null` → ใช้ exact type creator ก่อน rawTypeCreator |
| `testInstanceCreatorRawTypeFallback` | `get()`: `typeCreator == null`, `rawTypeCreator != null` |
| `testDefaultConstructorPublicNoArg` | `newDefaultConstructor`: หา constructor สำเร็จ, `isAccessible()==true` (ไม่ setAccessible) |
| `testDefaultConstructorPrivateNoArgSetAccessible` | `newDefaultConstructor`: `!constructor.isAccessible()` → เรียก `setAccessible(true)` |
| `testDefaultConstructorInstantiationExceptionWrapped` | `construct()`: catch `InstantiationException` → wrap RuntimeException |
| `testDefaultConstructorInvocationTargetExceptionWrapped` | `construct()`: catch `InvocationTargetException` → wrap ด้วย target exception |
| `testCollectionSortedSet` | `newDefaultImplementationConstructor`: Collection → `SortedSet` branch |
| `testCollectionEnumSetValid` | Collection → `EnumSet` branch, `type instanceof ParameterizedType` true, `elementType instanceof Class` true |
| `testCollectionEnumSetWildcardThrows` | EnumSet branch, ParameterizedType true แต่ `elementType instanceof Class` false → JsonIOException |
| `testCollectionEnumSetRawThrows` | EnumSet branch, `type instanceof ParameterizedType` false (outer else) → JsonIOException |
| `testCollectionSet` | Collection → `Set` branch (ไม่ใช่ SortedSet/EnumSet) |
| `testCollectionQueue` | Collection → `Queue` branch |
| `testCollectionDefaultList` | Collection → else branch (ArrayList) |
| `testMapSortedMap` | Map → `SortedMap` branch |
| `testMapNonStringKeyLinkedHashMap` | Map → ParameterizedType && key ไม่ใช่ String → LinkedHashMap |
| `testMapStringKeyLinkedTreeMap` | Map → ParameterizedType && key เป็น String → else (LinkedTreeMap) |
| `testMapRawTypeLinkedTreeMap` | Map → `type instanceof ParameterizedType` false → else (LinkedTreeMap) |
| `testUnsafeAllocatorFallback` | `get()`: `defaultConstructor==null`, `defaultImplementation==null` → `newUnsafeAllocator` |
| `testToStringDelegatesToInstanceCreatorsMap` | `toString()` method |
| `testEmptyInstanceCreatorsMapDoesNotThrow` | edge case: empty map, ทั้ง `typeCreator`/`rawTypeCreator` เป็น null ตั้งแต่แรก |

**หมายเหตุ/ข้อจำกัดที่ระบุไว้ (ไม่เดา behavior):**
- การทดสอบ `newUnsafeAllocator` อ้างอิงพฤติกรรมจริงของ `UnsafeAllocator` (bypass constructor, field เป็นค่า default) ซึ่งอนุมานจาก JavaDoc ของ Java reflection (`Constructor.newInstance()` throws `InstantiationException` บน abstract class) และพฤติกรรมทั่วไปของ sun.misc.Unsafe-based allocator ใน Gson — ถ้า JVM/Environment ไม่รองรับ Unsafe อาจทำให้เทสนี้ fail ได้ (ไม่ใช่ fault ของโค้ด แต่เป็นข้อจำกัดของ environment)
- ไม่ได้ทดสอบ branch `IllegalAccessException` ในทางปฏิบัติ (แทบเป็นไปไม่ได้ที่จะเกิดขึ้นเนื่องจากมี `setAccessible(true)` มาก่อนเสมอ) จึงไม่ได้เขียนเทสสำหรับ branch นี้โดยตรง