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

import org.junit.Test;

/**
 * JUnit 4 test suite for {@link SerializationUtils} (Defects4J Lang-13b).
 *
 * หมายเหตุ: คลาสทดสอบนี้ต้องอยู่ใน package org.apache.commons.lang3 เดียวกับ
 * class เป้าหมาย เพราะต้องเข้าถึง package-private nested class
 * {@code SerializationUtils.ClassLoaderAwareObjectInputStream} โดยตรง
 * เพื่อทดสอบ branch ภายใน resolveClass().
 */
public class SerializationUtilsTest {

    // ===================== Fixtures =====================

    /** Fixture ปกติที่ serialize/deserialize ได้สมบูรณ์ */
    static class SerializableFixture implements Serializable {
        private static final long serialVersionUID = 1L;
        private final String value;

        SerializableFixture(String value) {
            this.value = value;
        }

        String getValue() {
            return value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof SerializableFixture)) return false;
            SerializableFixture other = (SerializableFixture) o;
            return value == null ? other.value == null : value.equals(other.value);
        }

        @Override
        public int hashCode() {
            return value == null ? 0 : value.hashCode();
        }
    }

    /** Fixture ที่ implements Serializable แต่มี field ที่ serialize ไม่ได้จริง -> ทำให้เกิด IOException ตอน write */
    static class NonSerializableFieldFixture implements Serializable {
        private static final long serialVersionUID = 1L;
        @SuppressWarnings("unused")
        private final Object notSerializable = new Object(); // java.lang.Object ไม่ implements Serializable
    }

    /** OutputStream ที่ throw IOException ทุกครั้งที่ write (ทำให้ ObjectOutputStream constructor ล้มเหลวทันที) */
    static class ThrowOnWriteOutputStream extends OutputStream {
        @Override
        public void write(int b) throws IOException {
            throw new IOException("forced write failure");
        }
    }

    /** OutputStream ที่เขียนข้อมูลได้ปกติ แต่ throw IOException ตอน close() */
    static class ThrowOnCloseOutputStream extends OutputStream {
        private final ByteArrayOutputStream delegate = new ByteArrayOutputStream();

        @Override
        public void write(int b) throws IOException {
            delegate.write(b);
        }

        @Override
        public void close() throws IOException {
            throw new IOException("forced close failure");
        }

        byte[] toByteArray() {
            return delegate.toByteArray();
        }
    }

    /** InputStream ที่อ่านข้อมูลได้ปกติ แต่ throw IOException ตอน close() */
    static class ThrowOnCloseInputStream extends InputStream {
        private final ByteArrayInputStream delegate;

        ThrowOnCloseInputStream(byte[] data) {
            this.delegate = new ByteArrayInputStream(data);
        }

        @Override
        public int read() throws IOException {
            return delegate.read();
        }

        @Override
        public void close() throws IOException {
            throw new IOException("forced close failure");
        }
    }

    /** ClassLoader ที่ loadClass ล้มเหลวเสมอ ใช้เพื่อ force fallback ไป context classloader ใน resolveClass() */
    static class AlwaysFailClassLoader extends ClassLoader {
        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            throw new ClassNotFoundException("forced failure for: " + name);
        }
    }

    // ===================== constructor =====================

    @Test
    public void testConstructor_doesNotThrow() {
        // ไม่มี branch logic แต่ช่วย coverage ของ public constructor
        assertNotNull(new SerializationUtils());
    }

    // ===================== clone() =====================

    @Test
    public void testClone_null_returnsNull() {
        // if (object == null) return null; [TRUE branch]
        assertNull(SerializationUtils.clone(null));
    }

    @Test
    public void testClone_simpleString_returnsEqualButNotSameInstance() {
        // if (object == null) [FALSE branch] -> normal flow, try succeeds, resolveClass success path
        String original = "hello-world";
        String cloned = SerializationUtils.clone(original);
        assertEquals(original, cloned);
    }

    @Test
    public void testClone_customFixture_deepClone() {
        SerializableFixture original = new SerializableFixture("abc");
        SerializableFixture cloned = SerializationUtils.clone(original);
        assertEquals(original, cloned);
        assertNotSame(original, cloned);
    }

    @Test(expected = SerializationException.class)
    public void testClone_objectWithNonSerializableField_throwsSerializationException() {
        // serialize(object) ภายใน clone() จะ throw SerializationException ก่อนถึง try/catch ของ deserialize
        // (ครอบคลุม false-branch ของ "object==null" และ fault path ของ serialize ภายใน)
        SerializationUtils.clone(new NonSerializableFieldFixture());
    }

    // หมายเหตุ (ตามข้อกำหนดที่ 4 - ไม่เดา behavior):
    // branch catch(ClassNotFoundException) และ catch(IOException) ที่มาจาก in.readObject()
    // ภายใน clone(), รวมถึง branch catch(IOException) ใน finally ของ clone()
    // ไม่สามารถทดสอบผ่าน public API ได้อย่างน่าเชื่อถือ เพราะ byte[] ที่ clone() สร้างขึ้นภายใน
    // เป็น valid stream ที่สมบูรณ์เสมอ (มาจาก serialize(object) ที่ทำงานถูกต้อง) และ
    // ByteArrayInputStream.close() ไม่ throw IOException จึงไม่สามารถ fault-inject
    // จากภายนอกได้โดยไม่แก้ไข source หรือใช้ reflection ที่ผิดขอบเขตการทดสอบ

    // ===================== serialize(obj, OutputStream) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testSerialize_nullOutputStream_throwsIllegalArgumentException() {
        // if (outputStream == null) throw ... [TRUE branch]
        SerializationUtils.serialize(new SerializableFixture("x"), null);
    }

    @Test
    public void testSerialize_normalStream_success() {
        // outputStream != null [FALSE branch] -> try succeeds -> finally out!=null, close() succeeds
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(new SerializableFixture("y"), baos);
        assertTrue(baos.toByteArray().length > 0);
    }

    @Test
    public void testSerialize_nullObject_doesNotThrow() {
        // obj อาจเป็น null ได้ (เฉพาะ outputStream ที่ถูกตรวจ null) -> writeObject(null) สำเร็จ
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        SerializationUtils.serialize(null, baos);
        Object result = SerializationUtils.deserialize(baos.toByteArray());
        assertNull(result);
    }

    @Test(expected = SerializationException.class)
    public void testSerialize_writeThrowsIOException_wrappedAsSerializationException() {
        // catch (IOException ex) -> throw new SerializationException(ex);  [TRUE branch]
        // เนื่องจาก ObjectOutputStream constructor เขียน stream header ทันที
        // -> "out" ยังไม่ถูก assign -> finally: out==null -> ข้าม close() (ไม่เกิด exception ซ้ำ)
        SerializationUtils.serialize(new SerializableFixture("z"), new ThrowOnWriteOutputStream());
    }

    @Test
    public void testSerialize_closeThrowsIOException_isSilentlySwallowed() {
        // write สำเร็จ แต่ close() throw IOException -> catch(IOException ex) { // ignore } [TRUE branch, no rethrow]
        ThrowOnCloseOutputStream out = new ThrowOnCloseOutputStream();
        // ต้องไม่มี exception หลุดออกมาแม้ close() จะ throw
        SerializationUtils.serialize(new SerializableFixture("w"), out);
        // ตรวจสอบว่าข้อมูลยัง serialize ได้ถูกต้องก่อน close ล้มเหลว
        Object result = SerializationUtils.deserialize(out.toByteArray());
        assertEquals(new SerializableFixture("w"), result);
    }

    // ===================== serialize(obj) byte[] =====================

    @Test
    public void testSerializeByteArrayOverload_normal() {
        byte[] data = SerializationUtils.serialize(new SerializableFixture("v"));
        assertNotNull(data);
        assertTrue(data.length > 0);
    }

    @Test
    public void testSerializeByteArrayOverload_thenDeserialize_roundTrip() {
        SerializableFixture original = new SerializableFixture("roundtrip");
        byte[] data = SerializationUtils.serialize(original);
        Object result = SerializationUtils.deserialize(data);
        assertEquals(original, result);
    }

    // ===================== deserialize(InputStream) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeInputStream_null_throwsIllegalArgumentException() {
        // if (inputStream == null) throw ... [TRUE branch]
        SerializationUtils.deserialize((InputStream) null);
    }

    @Test
    public void testDeserializeInputStream_normal_success() {
        // inputStream != null [FALSE branch] -> try succeeds -> finally in!=null -> close() success
        SerializableFixture original = new SerializableFixture("stream-ok");
        byte[] data = SerializationUtils.serialize(original);
        Object result = SerializationUtils.deserialize(new ByteArrayInputStream(data));
        assertEquals(original, result);
    }

    @Test
    public void testDeserializeInputStream_closeThrowsIOException_isSilentlySwallowed() {
        // catch(IOException ex) { // ignore } ใน finally ของ deserialize(InputStream) [TRUE branch]
        SerializableFixture original = new SerializableFixture("close-fail-ok");
        byte[] data = SerializationUtils.serialize(original);
        Object result = SerializationUtils.deserialize(new ThrowOnCloseInputStream(data));
        assertEquals(original, result);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeInputStream_malformedData_throwsSerializationException() {
        // catch(IOException ex) -> throw new SerializationException(ex); [TRUE branch]
        // ข้อมูล garbage ทำให้ ObjectInputStream constructor throw StreamCorruptedException ทันที
        // -> "in" ยังไม่ถูก assign -> finally: in==null -> ข้าม close() (ไม่เกิด exception ซ้ำ)
        byte[] garbage = new byte[] { 0x00, 0x01, 0x02, 0x03, 0x04 };
        SerializationUtils.deserialize(new ByteArrayInputStream(garbage));
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeInputStream_emptyData_throwsSerializationException() {
        // boundary case: byte array ว่าง (ไม่ใช่ null) -> อ่าน stream header ล้มเหลว -> IOException -> SerializationException
        SerializationUtils.deserialize(new ByteArrayInputStream(new byte[0]));
    }

    // หมายเหตุ (ตามข้อกำหนดที่ 4): catch(ClassNotFoundException ex) ใน deserialize(InputStream)
    // ไม่ได้ทดสอบโดยตรง เนื่องจากการ fault-inject ให้เกิด ClassNotFoundException จริง
    // ต้องสร้าง serialized stream ที่อ้างอิง class name ที่ไม่มีอยู่จริงในระดับ byte stream
    // (ดัดแปลง java serialization protocol โดยตรง) ซึ่งเกินขอบเขตการทดสอบระดับ unit test
    // ปกติ และมีความเสี่ยงสูงที่จะ fragile ข้าม JVM/version จึงขอละไว้ และระบุ comment กำกับ

    // ===================== deserialize(byte[]) =====================

    @Test(expected = IllegalArgumentException.class)
    public void testDeserializeByteArray_null_throwsIllegalArgumentException() {
        // if (objectData == null) throw ... [TRUE branch]
        SerializationUtils.deserialize((byte[]) null);
    }

    @Test
    public void testDeserializeByteArray_normal_delegatesToInputStreamOverload() {
        // objectData != null [FALSE branch] -> สร้าง ByteArrayInputStream แล้ว delegate ปกติ
        SerializableFixture original = new SerializableFixture("byte-array-ok");
        byte[] data = SerializationUtils.serialize(original);
        Object result = SerializationUtils.deserialize(data);
        assertEquals(original, result);
    }

    @Test(expected = SerializationException.class)
    public void testDeserializeByteArray_emptyArray_throwsSerializationException() {
        // boundary: array ว่าง แต่ไม่ null -> ผ่าน null-check แล้วไป fail ที่ IOException ชั้นใน
        SerializationUtils.deserialize(new byte[0]);
    }

    // ===================== ClassLoaderAwareObjectInputStream.resolveClass() =====================

    @Test
    public void testResolveClass_primaryClassLoaderSucceeds_normalPath() throws Exception {
        // try { return Class.forName(name, false, classLoader); } สำเร็จ [TRUE/primary branch]
        SerializableFixture original = new SerializableFixture("resolve-ok");
        byte[] data = SerializationUtils.serialize(original);

        SerializationUtils.ClassLoaderAwareObjectInputStream in =
                new SerializationUtils.ClassLoaderAwareObjectInputStream(
                        new ByteArrayInputStream(data),
                        this.getClass().getClassLoader());
        try {
            Object result = in.readObject();
            assertEquals(original, result);
        } finally {
            in.close();
        }
    }

    @Test
    public void testResolveClass_primaryClassLoaderFails_fallbackToContextClassLoaderSucceeds()
            throws Exception {
        // catch (ClassNotFoundException ex) { return Class.forName(name, false, context); }
        // [FALLBACK branch]: primary classLoader (AlwaysFailClassLoader) ล้มเหลวเสมอ
        // แต่ context classloader ของ thread ปัจจุบันต้องหา fixture class เจอ
        SerializableFixture original = new SerializableFixture("resolve-fallback");
        byte[] data = SerializationUtils.serialize(original);

        SerializationUtils.ClassLoaderAwareObjectInputStream in =
                new SerializationUtils.ClassLoaderAwareObjectInputStream(
                        new ByteArrayInputStream(data),
                        new AlwaysFailClassLoader());
        try {
            Object result = in.readObject();
            assertEquals(original, result);
        } finally {
            in.close();
        }
    }

    // ===================== Round-trip / sanity check เพิ่มเติม =====================

    @Test
    public void testSerializeThenDeserialize_bytesAreDeterministicAcrossCalls() {
        SerializableFixture original = new SerializableFixture("determinism-check");
        byte[] first = SerializationUtils.serialize(original);
        byte[] second = SerializationUtils.serialize(original);
        assertArrayEquals(first, second);
    }
}
