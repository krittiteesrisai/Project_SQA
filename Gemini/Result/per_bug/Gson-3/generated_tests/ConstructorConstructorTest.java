package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;

import static org.junit.Assert.*;

public class ConstructorConstructorTest {

    // --- Helper classes for testing constructors and edge cases ---
    public static class PublicNoArgClass {
        public String value = "public";
    }

    public static class PrivateNoArgClass {
        private String value;
        private PrivateNoArgClass() {
            this.value = "private";
        }
        public String getValue() {
            return value;
        }
    }

    public static class NoDefaultConstructorClass {
        private final int id;
        public NoDefaultConstructorClass(int id) {
            this.id = id;
        }
    }

    // --- Test Cases ---

    @Test
    public void testInstanceCreatorExactTypeMatch() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        TypeToken<PublicNoArgClass> token = TypeToken.get(PublicNoArgClass.class);
        
        creators.put(token.getType(), new InstanceCreator<PublicNoArgClass>() {
            @Override
            public PublicNoArgClass createInstance(Type type) {
                PublicNoArgClass obj = new PublicNoArgClass();
                obj.value = "custom-type";
                return obj;
            }
        });

        ConstructorConstructor cc = new ConstructorConstructor(creators);
        ObjectConstructor<PublicNoArgClass> constructor = cc.get(token);
        assertNotNull(constructor);
        
        PublicNoArgClass instance = constructor.construct();
        assertNotNull(instance);
        assertEquals("custom-type", instance.value);
    }

    @Test
    public void testInstanceCreatorRawTypeMatch() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        creators.put(PublicNoArgClass.class, new InstanceCreator<PublicNoArgClass>() {
            @Override
            public PublicNoArgClass createInstance(Type type) {
                PublicNoArgClass obj = new PublicNoArgClass();
                obj.value = "custom-raw";
                return obj;
            }
        });

        ConstructorConstructor cc = new ConstructorConstructor(creators);
        TypeToken<PublicNoArgClass> token = TypeToken.get(PublicNoArgClass.class);
        ObjectConstructor<PublicNoArgClass> constructor = cc.get(token);
        assertNotNull(constructor);

        PublicNoArgClass instance = constructor.construct();
        assertNotNull(instance);
        assertEquals("custom-raw", instance.value);
    }

    @Test
    public void testDefaultConstructorPublic() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<PublicNoArgClass> token = TypeToken.get(PublicNoArgClass.class);
        ObjectConstructor<PublicNoArgClass> constructor = cc.get(token);
        assertNotNull(constructor);

        PublicNoArgClass instance = constructor.construct();
        assertNotNull(instance);
        assertEquals("public", instance.value);
    }

    @Test
    public void testDefaultConstructorPrivate() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<PrivateNoArgClass> token = TypeToken.get(PrivateNoArgClass.class);
        ObjectConstructor<PrivateNoArgClass> constructor = cc.get(token);
        assertNotNull(constructor);

        PrivateNoArgClass instance = constructor.construct();
        assertNotNull(instance);
        assertEquals("private", instance.getValue());
    }

    @Test
    public void testCollectionsSortedSet() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<SortedSet> token = TypeToken.get(SortedSet.class);
        ObjectConstructor<SortedSet> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof TreeSet);
    }

    @Test
    public void testCollectionsEnumSetValid() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        // Using an anonymous subclass of TypeToken to capture ParameterizedType for EnumSet<TestEnum>
        TypeToken<EnumSet<TestEnum>> token = new TypeToken<EnumSet<TestEnum>>() {};
        ObjectConstructor<EnumSet<TestEnum>> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof EnumSet);
    }

    private enum TestEnum { A, B }

    @Test(expected = JsonIOException.class)
    public void testCollectionsEnumSetRawTypeThrowsException() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        // Raw EnumSet (not parameterized) should trigger JsonIOException
        TypeToken<EnumSet> token = TypeToken.get(EnumSet.class);
        ObjectConstructor<EnumSet> constructor = cc.get(token);
        constructor.construct();
    }

    @Test
    public void testCollectionsSet() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<Set> token = TypeToken.get(Set.class);
        ObjectConstructor<Set> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof LinkedHashSet);
    }

    @Test
    public void testCollectionsQueue() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<Queue> token = TypeToken.get(Queue.class);
        ObjectConstructor<Queue> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof LinkedList);
    }

    @Test
    public void testCollectionsListDefault() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<List> token = TypeToken.get(List.class);
        ObjectConstructor<List> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof ArrayList);
    }

    @Test
    public void testMapSortedMap() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<SortedMap> token = TypeToken.get(SortedMap.class);
        ObjectConstructor<SortedMap> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof TreeMap);
    }

    @Test
    public void testMapParameterizedNonStringKey() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<Map<Integer, String>> token = new TypeToken<Map<Integer, String>>() {};
        ObjectConstructor<Map<Integer, String>> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof LinkedHashMap);
    }

    @Test
    public void testMapDefaultStringKey() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<Map<String, String>> token = new TypeToken<Map<String, String>>() {};
        ObjectConstructor<Map<String, String>> constructor = cc.get(token);
        assertNotNull(constructor);
        assertTrue(constructor.construct() instanceof LinkedTreeMap);
    }

    @Test
    public void testUnsafeAllocatorFallback() {
        ConstructorConstructor cc = new ConstructorConstructor(Collections.<Type, InstanceCreator<?>>emptyMap());
        TypeToken<NoDefaultConstructorClass> token = TypeToken.get(NoDefaultConstructorClass.class);
        ObjectConstructor<NoDefaultConstructorClass> constructor = cc.get(token);
        assertNotNull(constructor);
        // Unsafe allocator should successfully instantiate without invoking constructor
        NoDefaultConstructorClass instance = constructor.construct();
        assertNotNull(instance);
    }

    @Test
    public void testToStringRepresentation() {
        Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
        ConstructorConstructor cc = new ConstructorConstructor(creators);
        assertEquals(creators.toString(), cc.toString());
    }
}