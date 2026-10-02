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
