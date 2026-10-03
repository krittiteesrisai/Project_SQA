package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for {@link SerializationUtils} aiming at high branch/condition coverage
 * and edge case detection.
 */
public class SerializationUtilsTest {

    // --- Helper classes for tests ---

    static class SimpleClass implements Serializable {
        private static final long serialVersionUID = 1L;
        private int id;
        private String name;

        public SimpleClass(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            SimpleClass that = (SimpleClass) obj;
            return id == that.id && (name != null ? name.equals(that.name) : that.name == null);
        }

        @Override
        public int hashCode() {
            return 31 * id + (name != null ? name.hashCode() : 0);
        }
    }

    static class BrokenOutputStream extends OutputStream {
        @Override
        public void write(int b) throws IOException {
            throw new IOException("Simulated write failure");
        }
    }

    static class BrokenInputStream extends InputStream {
        @Override
        public int read() throws IOException {
            throw new IOException("Simulated read failure");
        }
    }

    // --- Test Cases ---

    @Test
    public void testConstructor() {
        assertNotNull(new SerializationUtils());
        Constructor<?>[] cons = SerializationUtils.class.getDeclaredConstructors();
        assertEquals(1, cons.length);
        assertTrue(Modifier.isPublic(cons[0].getModifiers()));
    }

    // 1. Clone Tests
    // -----------------------------------------------------------------------

    @Test
    public void testCloneNull() {
        assertNull(SerializationUtils.clone(null));
    }

    @Test
    public void testCloneValidObject() {
        SimpleClass original = new SimpleClass(100, "TestObject");
        SimpleClass cloned = SerializationUtils.clone(original);

        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertEquals(original, cloned);
    }

    @Test
    public void testCloneComplexGraph() {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        map.put("key", list);

        @SuppressWarnings("unchecked")
        Map<String, List<String>> cloned = (Map<String, List<String>>) SerializationUtils.clone((Serializable) map);

        assertNotNull(cloned);
        assertNotSame(map, cloned);
        assertEquals(map, cloned);
        assertNotSame(map.get("key"), cloned.get("key"));
    }

    @Test
    public void testClonePrimitiveArray() {
        int[] original = new int[]{1, 2, 3, 4, 5};
        int[] cloned = SerializationUtils.clone(original);
        assertNotNull(cloned);
        assertNotSame(original, cloned);
        assertArrayEquals(original, cloned);
    }

    @Test(expected = SerializationException.class)
    public void testCloneUnserializableObject() {
        // Class containing non-serializable field
        class UnserializableContainer implements Serializable {
            private static final long serialVersionUID = 1L;
            @SuppressWarnings("unused")
            private Object notSerializable = new Object();
        }

        SerializationUtils.clone(new UnserializableContainer());
    }

    // 2. Serialize Tests
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testSerializeNullOutputStream() {
        SerializationUtils.serialize(new SimpleClass(1, "test"), null);
    }

    @Test
    public void testSerializeNullObjectToStream() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(null, baos);
        assertTrue(baos.toByteArray().length > 0);

        Object deserialized = SerializationUtils.deserialize(baos.toByteArray());
        assertNull(deserialized);
    }

    @Test
    public void testSerializeValidObjectToStream() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SimpleClass obj = new SimpleClass(42, "Answer");
        SerializationUtils.serialize(obj, baos);

        byte[] bytes = baos.toByteArray();
        assertTrue(bytes.length > 0);

        Object deserialized = SerializationUtils.deserialize(bytes);
        assertEquals(obj, deserialized);
    }

    @Test(expected = SerializationException.class)
    public void testSerializeIOExceptionStream() {
        SerializationUtils.serialize(new SimpleClass(1, "test"), new BrokenOutputStream());
    }

    @Test
    public void testSerializeToByteArray() {
        SimpleClass obj = new SimpleClass(99, "ByteTest");
        byte[] bytes = SerializationUtils.serialize(obj);
        assertNotNull(bytes);
        assertTrue(bytes.length > 0);

        Object deserialized = SerializationUtils.deserialize(bytes);
        assertEquals(obj, deserialized);
    }

    // 3. Deserialize Tests
    // -----------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeNullInputStream() {
        SerializationUtils.deserialize((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeNullByteArray() {
        SerializationUtils.deserialize((byte[]) null);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeEmptyByteArray() {
        SerializationUtils.deserialize(new byte[0]);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeCorruptByteArray() {
        byte[] invalidData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8};
        SerializationUtils.deserialize(invalidData);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeIOExceptionStream() {
        SerializationUtils.deserialize(new BrokenInputStream());
    }

    @Test
    public void testDeserializeValidStream() {
        SimpleClass original = new SimpleClass(123, "StreamObject");
        byte[] bytes = SerializationUtils.serialize(original);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        Object result = SerializationUtils.deserialize(bais);
        assertEquals(original, result);
    }

    // 4. ClassLoaderAwareObjectInputStream & Class Loading Tests
    // -----------------------------------------------------------------------

    @Test
    public void testCustomClassLoaderResolution() throws Exception {
        SimpleClass original = new SimpleClass(777, "ClassLoaderTest");
        byte[] bytes = SerializationUtils.serialize(original);

        // Custom classloader that delegates to parent
        ClassLoader customLoader = new ClassLoader(getClass().getClassLoader()) {};
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        SerializationUtils.ClassLoaderAwareObjectInputStream in = 
                new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, customLoader);

        Object result = in.readObject();
        in.close();

        assertEquals(original, result);
    }

    @Test
    public void testClassLoaderFallbackToContextClassLoader() throws Exception {
        SimpleClass original = new SimpleClass(888, "FallbackTest");
        byte[] bytes = SerializationUtils.serialize(original);

        // ClassLoader unable to resolve our class
        ClassLoader nonResolvingLoader = new ClassLoader(null) {
            @Override
            protected Class<?> findClass(String name) throws ClassNotFoundException {
                throw new ClassNotFoundException("Simulated classloader not found");
            }
        };

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        SerializationUtils.ClassLoaderAwareObjectInputStream in = 
                new SerializationUtils.ClassLoaderAwareObjectInputStream(bais, nonResolvingLoader);

        Object result = in.readObject();
        in.close();

        assertEquals(original, result);
    }
}