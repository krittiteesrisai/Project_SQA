package org.apache.commons.lang3;

import org.junit.Test;
import java.io.ObjectStreamClass;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import sun.security.util.DerOutputStream;
import java.lang.reflect.Method;
import java.io.Serializable;
import java.io.InputStream;
import java.util.function.BooleanSupplier;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang3_SerializationUtilsTest {
    ///region Test suites for executable org.apache.commons.lang3.SerializationUtils.serialize
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method serialize(java.io.Serializable)
    
    @Test
    public void testSerialize1() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize2() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize3() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize4() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize5() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize6() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevFinalRefCount = ((Integer) getStaticFieldValue(vMClazz, "finalRefCount"));
        int prevPeakFinalRefCount = ((Integer) getStaticFieldValue(vMClazz, "peakFinalRefCount"));
        try {
            setStaticField(vMClazz, "finalRefCount", Integer.MIN_VALUE);
            setStaticField(vMClazz, "peakFinalRefCount", 0);
            Class class1 = Object.class;
            
            byte[] actual = SerializationUtils.serialize(class1);
            
            byte[] expected = new byte[37];
            expected[0] = (byte) -84;
            expected[1] = (byte) -19;
            expected[3] = (byte) 5;
            expected[4] = (byte) 118;
            expected[5] = (byte) 114;
            expected[7] = (byte) 16;
            expected[8] = (byte) 106;
            expected[9] = (byte) 97;
            expected[10] = (byte) 118;
            expected[11] = (byte) 97;
            expected[12] = (byte) 46;
            expected[13] = (byte) 108;
            expected[14] = (byte) 97;
            expected[15] = (byte) 110;
            expected[16] = (byte) 103;
            expected[17] = (byte) 46;
            expected[18] = (byte) 79;
            expected[19] = (byte) 98;
            expected[20] = (byte) 106;
            expected[21] = (byte) 101;
            expected[22] = (byte) 99;
            expected[23] = (byte) 116;
            expected[35] = (byte) 120;
            expected[36] = (byte) 112;
            
            assertArrayEquals(expected, actual);
            
            Class finalClass1 = class1;
            
        } finally {
            setStaticField(jdk.internal.misc.VM.class, "finalRefCount", prevFinalRefCount);
            setStaticField(jdk.internal.misc.VM.class, "peakFinalRefCount", prevPeakFinalRefCount);
        }
    }
    
    @Test
    public void testSerialize8() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize9() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize10() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    
    @Test
    public void testSerialize11() {
        Class class1 = Object.class;
        
        byte[] actual = SerializationUtils.serialize(class1);
        
        byte[] expected = new byte[37];
        expected[0] = (byte) -84;
        expected[1] = (byte) -19;
        expected[3] = (byte) 5;
        expected[4] = (byte) 118;
        expected[5] = (byte) 114;
        expected[7] = (byte) 16;
        expected[8] = (byte) 106;
        expected[9] = (byte) 97;
        expected[10] = (byte) 118;
        expected[11] = (byte) 97;
        expected[12] = (byte) 46;
        expected[13] = (byte) 108;
        expected[14] = (byte) 97;
        expected[15] = (byte) 110;
        expected[16] = (byte) 103;
        expected[17] = (byte) 46;
        expected[18] = (byte) 79;
        expected[19] = (byte) 98;
        expected[20] = (byte) 106;
        expected[21] = (byte) 101;
        expected[22] = (byte) 99;
        expected[23] = (byte) 116;
        expected[35] = (byte) 120;
        expected[36] = (byte) 112;
        
        assertArrayEquals(expected, actual);
        
        Class finalClass1 = class1;
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method serialize(java.io.Serializable)
    
    @Test(expected = InternalError.class)
    public void testSerialize12() throws Exception  {
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        
        SerializationUtils.serialize(objectStreamClass);
    }
    
    @Test
    public void testSerialize13() throws Exception  {
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        String name = "\u0000";
        setField(objectStreamClass, "java.io.ObjectStreamClass", "name", name);
        setField(objectStreamClass, "java.io.ObjectStreamClass", "initialized", true);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            java.base/java.io.ObjectStreamClass.computeDefaultSUID(ObjectStreamClass.java:1728)
            java.base/java.io.ObjectStreamClass$1.run(ObjectStreamClass.java:294)
            java.base/java.io.ObjectStreamClass$1.run(ObjectStreamClass.java:292)
            java.base/java.security.AccessController.doPrivileged(AccessController.java:318)
            java.base/java.io.ObjectStreamClass.getSerialVersionUID(ObjectStreamClass.java:291)
            java.base/java.io.ObjectStreamClass.writeNonProxy(ObjectStreamClass.java:728)
            java.base/java.io.ObjectOutputStream.writeClassDescriptor(ObjectOutputStream.java:677)
            java.base/java.io.ObjectOutputStream.writeNonProxyDesc(ObjectOutputStream.java:1295)
            java.base/java.io.ObjectOutputStream.writeClassDesc(ObjectOutputStream.java:1244)
            java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1136)
            java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:138)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:154) */
        SerializationUtils.serialize(objectStreamClass);
    }
    
    @Test
    public void testSerialize14() throws Exception  {
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        String name = "";
        setField(objectStreamClass, "java.io.ObjectStreamClass", "name", name);
        setField(objectStreamClass, "java.io.ObjectStreamClass", "initialized", true);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.Class.isAssignableFrom(Native Method)
            java.base/java.io.ObjectStreamClass.computeDefaultSUID(ObjectStreamClass.java:1728)
            java.base/java.io.ObjectStreamClass$1.run(ObjectStreamClass.java:294)
            java.base/java.io.ObjectStreamClass$1.run(ObjectStreamClass.java:292)
            java.base/java.security.AccessController.doPrivileged(AccessController.java:318)
            java.base/java.io.ObjectStreamClass.getSerialVersionUID(ObjectStreamClass.java:291)
            java.base/java.io.ObjectStreamClass.writeNonProxy(ObjectStreamClass.java:728)
            java.base/java.io.ObjectOutputStream.writeClassDescriptor(ObjectOutputStream.java:677)
            java.base/java.io.ObjectOutputStream.writeNonProxyDesc(ObjectOutputStream.java:1295)
            java.base/java.io.ObjectOutputStream.writeClassDesc(ObjectOutputStream.java:1244)
            java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1136)
            java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:354)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:138)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:154) */
        SerializationUtils.serialize(objectStreamClass);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.SerializationUtils.serialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method serialize(java.io.Serializable, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", -2147482724);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482724 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, byteArrayOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0};
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", -2);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, byteArrayOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testSerialize_ThrowOutOfMemoryError() throws Exception  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", -2147483645);
        
        SerializationUtils.serialize(null, byteArrayOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1911)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, objectOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 1]
            java.base/java.io.Bits.putInt(Bits.java:99)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1912)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, objectOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSerialize_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -2147483588);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147483588 out of bounds for byte[40]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, objectOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.OutOfMemoryError} 
 *  */
    @Test(expected = OutOfMemoryError.class)
    public void testSerialize_ThrowOutOfMemoryError_1() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1024);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", 2147483645);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        SerializationUtils.serialize(null, objectOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: outputStream == null
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException: The OutputStream must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:136) */
        SerializationUtils.serialize(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#serialize(java.io.Serializable,java.io.OutputStream)}
 * @utbot.executesCondition {@code (outputStream == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSerialize_ThrowNullPointerException_1() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1022);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, objectOutputStream);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method serialize(java.io.Serializable, java.io.OutputStream)
    
    @Test
    public void testSerialize15() throws Exception  {
        Class class1 = Object.class;
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", 253);
        
        byte[] initialByteArrayOutputStreamBuf = ((byte[]) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        SerializationUtils.serialize(class1, byteArrayOutputStream);
        
        Class finalClass1 = class1;
        
        byte[] finalByteArrayOutputStreamBuf = ((byte[]) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        int finalByteArrayOutputStreamCount = ((Integer) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count"));
        
        assertFalse(initialByteArrayOutputStreamBuf == finalByteArrayOutputStreamBuf);
        
        assertEquals(290, finalByteArrayOutputStreamCount);
    }
    
    @Test
    public void testSerialize16() throws Exception  {
        Class class1 = Object.class;
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", 1020);
        
        byte[] initialByteArrayOutputStreamBuf = ((byte[]) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        SerializationUtils.serialize(class1, byteArrayOutputStream);
        
        Class finalClass1 = class1;
        
        byte[] finalByteArrayOutputStreamBuf = ((byte[]) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        int finalByteArrayOutputStreamCount = ((Integer) getFieldValue(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count"));
        
        assertFalse(initialByteArrayOutputStreamBuf == finalByteArrayOutputStreamBuf);
        
        assertEquals(1057, finalByteArrayOutputStreamCount);
    }
    
    @Test
    public void testSerialize17() throws Exception  {
        DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[40];
        setField(derOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(derOutputStream, "java.io.ByteArrayOutputStream", "count", 253);
        
        byte[] initialDerOutputStreamBuf = ((byte[]) getFieldValue(derOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        SerializationUtils.serialize(null, derOutputStream);
        
        byte[] finalDerOutputStreamBuf = ((byte[]) getFieldValue(derOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        int finalDerOutputStreamCount = ((Integer) getFieldValue(derOutputStream, "java.io.ByteArrayOutputStream", "count"));
        
        assertFalse(initialDerOutputStreamBuf == finalDerOutputStreamBuf);
        
        assertEquals(258, finalDerOutputStreamCount);
    }
    
    @Test
    public void testSerialize18() throws Exception  {
        DerOutputStream derOutputStream = ((DerOutputStream) createInstance("sun.security.util.DerOutputStream"));
        byte[] buf = new byte[40];
        setField(derOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(derOutputStream, "java.io.ByteArrayOutputStream", "count", 1020);
        
        byte[] initialDerOutputStreamBuf = ((byte[]) getFieldValue(derOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        
        SerializationUtils.serialize(null, derOutputStream);
        
        byte[] finalDerOutputStreamBuf = ((byte[]) getFieldValue(derOutputStream, "java.io.ByteArrayOutputStream", "buf"));
        int finalDerOutputStreamCount = ((Integer) getFieldValue(derOutputStream, "java.io.ByteArrayOutputStream", "count"));
        
        assertFalse(initialDerOutputStreamBuf == finalDerOutputStreamBuf);
        
        assertEquals(1025, finalDerOutputStreamCount);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method serialize(java.io.Serializable, java.io.OutputStream)
    
    @Test(expected = InternalError.class)
    public void testSerialize19() throws Exception  {
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", 253);
        
        SerializationUtils.serialize(objectStreamClass, byteArrayOutputStream);
    }
    
    @Test(expected = InternalError.class)
    public void testSerialize20() throws Exception  {
        ObjectStreamClass objectStreamClass = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", 1020);
        
        SerializationUtils.serialize(objectStreamClass, byteArrayOutputStream);
    }
    
    @Test
    public void testSerialize21() throws Throwable  {
        Integer integer = 0;
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483651 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class byteArrayOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, byteArrayOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = byteArrayOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize22() throws Exception  {
        ByteArrayOutputStream byteArrayOutputStream = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(byteArrayOutputStream, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483651 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, byteArrayOutputStream);
    }
    
    @Test
    public void testSerialize23() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", Integer.MAX_VALUE);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 2147483651 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize24() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1021);
        setField(out, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1024 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize25() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482627);
        setField(out, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -2147482627 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize26() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = new byte[40];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1073741824);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = {};
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", -3);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: destination index -3 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:131)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.writeBlockHeader(ObjectOutputStream.java:1913)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1894)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1867)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize27() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = new byte[40];
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 658);
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf1 = new byte[32];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf1);
        setField(out, "java.io.ByteArrayOutputStream", "count", -512);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.IndexOutOfBoundsException: Range [0, 0 + 658) out of bounds for length 40]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromIndexSize(Preconditions.java:82)
            java.base/jdk.internal.util.Preconditions.checkFromIndexSize(Preconditions.java:361)
            java.base/java.util.Objects.checkFromIndexSize(Objects.java:411)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:129)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize28() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[40];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", 1020);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.clear(ObjectOutputStream.java:1111)
            java.base/java.io.ObjectOutputStream.close(ObjectOutputStream.java:750)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.close(ObjectOutputStream.java:1847)
            java.base/java.io.ObjectOutputStream.close(ObjectOutputStream.java:751)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:139) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize29() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ByteArrayOutputStream out = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        byte[] buf = new byte[29];
        setField(out, "java.io.ByteArrayOutputStream", "buf", buf);
        setField(out, "java.io.ByteArrayOutputStream", "count", 53);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.ObjectOutputStream.clear(ObjectOutputStream.java:1111)
            java.base/java.io.ObjectOutputStream.close(ObjectOutputStream.java:750)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.close(ObjectOutputStream.java:1847)
            java.base/java.io.ObjectOutputStream.close(ObjectOutputStream.java:751)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:139) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSerialize30() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -2147482627);
        setField(out, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, objectOutputStream);
    }
    
    @Test
    public void testSerialize31() throws Exception  {
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", -1073740803);
        setField(out, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1877)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        SerializationUtils.serialize(null, objectOutputStream);
    }
    
    @Test
    public void testSerialize32() throws Throwable  {
        Integer integer = 0;
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        ObjectOutputStream out = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout1 = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] buf = {(byte) 0};
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "buf", buf);
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 1);
        ByteArrayOutputStream out1 = ((ByteArrayOutputStream) createInstance("java.io.ByteArrayOutputStream"));
        setField(bout1, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out1);
        setField(out, "java.io.ObjectOutputStream", "bout", bout1);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.serialize] produces [java.lang.NullPointerException]
            java.base/java.io.ByteArrayOutputStream.ensureCapacity(ByteArrayOutputStream.java:97)
            java.base/java.io.ByteArrayOutputStream.write(ByteArrayOutputStream.java:130)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1860)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.write(ObjectOutputStream.java:1861)
            java.base/java.io.ObjectOutputStream.write(ObjectOutputStream.java:718)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.drain(ObjectOutputStream.java:1896)
            java.base/java.io.ObjectOutputStream$BlockDataOutputStream.setBlockDataMode(ObjectOutputStream.java:1805)
            java.base/java.io.ObjectOutputStream.<init>(ObjectOutputStream.java:252)
            org.apache.commons.lang3.SerializationUtils.serialize(SerializationUtils.java:137) */
        Class serializationUtilsClazz = Class.forName("org.apache.commons.lang3.SerializationUtils");
        Class integerType = Class.forName("java.io.Serializable");
        Class objectOutputStreamType = Class.forName("java.io.OutputStream");
        Method serializeMethod = serializationUtilsClazz.getDeclaredMethod("serialize", integerType, objectOutputStreamType);
        serializeMethod.setAccessible(true);
        java.lang.Object[] serializeMethodArguments = new java.lang.Object[2];
        serializeMethodArguments[0] = integer;
        serializeMethodArguments[1] = objectOutputStream;
        try {
            serializeMethod.invoke(null, serializeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.SerializationUtils.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone(java.io.Serializable)
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#clone(java.io.Serializable)}
 * @utbot.executesCondition {@code (object == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testClone_ObjectEqualsNull() {
        Serializable actual = SerializationUtils.clone(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.SerializationUtils.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize(java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)}
 * @utbot.executesCondition {@code (inputStream == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inputStream == null
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [java.lang.NullPointerException: The InputStream must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:189) */
        SerializationUtils.deserialize(((InputStream) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserialize(java.io.InputStream)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.SerializationUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)}
     */
    @Test
    public void testDeserializeThrowsNPE() {
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [java.lang.NullPointerException: The InputStream must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:189) */
        SerializationUtils.deserialize(((InputStream) null));
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.util.logging.PlatformLogger.$assertionsDisabled accessible: module
        java.base does not "opens sun.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang3.SerializationUtils.deserialize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method deserialize([B)
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#deserialize(byte[])}
 * @utbot.executesCondition {@code (objectData == null): False}
 * @utbot.invokes {@link org.apache.commons.lang3.SerializationUtils#deserialize(java.io.InputStream)}
 * @utbot.throwsException {@link org.apache.commons.lang3.SerializationException} 
 *  */
    @Test
    public void testDeserialize_ThrowSerializationException() {
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.EOFException]
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
        SerializationUtils.deserialize(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link SerializationUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#deserialize(byte[])}
 * @utbot.executesCondition {@code (objectData == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objectData == null
 *  */
    @Test
    public void testDeserialize_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [java.lang.NullPointerException: The byte[] must not be null]
            java.base/java.util.Objects.requireNonNull(Objects.java:334)
            org.apache.commons.lang3.Validate.notNull(Validate.java:225)
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:218) */
        SerializationUtils.deserialize(((byte[]) null));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method deserialize([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang3.SerializationUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang3.SerializationUtils#deserialize(byte[])}
     */
    @Test
    public void testDeserializeThrowsSEWithNonEmptyPrimitiveArray() {
        byte[] byteArray = {(byte) -1, (byte) -1, java.lang.Byte.MIN_VALUE};
        
        /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.EOFException]
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
            org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
        SerializationUtils.deserialize(byteArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method deserialize([B)
    
    @Test
    public void testDeserialize1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize4() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = new byte[17];
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = new byte[17];
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize7() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize8() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    
    @Test
    public void testDeserialize9() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class bootstrapLoggerClazz = Class.forName("jdk.internal.logger.BootstrapLogger");
        BooleanSupplier prevIsBooted = ((BooleanSupplier) getStaticFieldValue(bootstrapLoggerClazz, "isBooted"));
        Class vMClazz = Class.forName("jdk.internal.misc.VM");
        int prevInitLevel = ((Integer) getStaticFieldValue(vMClazz, "initLevel"));
        try {
            setStaticField(bootstrapLoggerClazz, "isBooted", null);
            setStaticField(vMClazz, "initLevel", 0);
            byte[] byteArray = {
                (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
                (byte) 0
            };
            
            /* This test fails because method [org.apache.commons.lang3.SerializationUtils.deserialize] produces [org.apache.commons.lang3.SerializationException: java.io.StreamCorruptedException: invalid stream header: 00000000]
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:195)
                org.apache.commons.lang3.SerializationUtils.deserialize(SerializationUtils.java:219) */
            SerializationUtils.deserialize(byteArray);
        } finally {
            setStaticField(jdk.internal.logger.BootstrapLogger.class, "isBooted", prevIsBooted);
            setStaticField(jdk.internal.misc.VM.class, "initLevel", prevInitLevel);
        }
    }
    ///endregion
    
    ///region Errors report for deserialize
    
    public void testDeserialize_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.util.logging.PlatformLogger.$assertionsDisabled accessible: module
        java.base does not "opens sun.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields626549827411800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields626549827411800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass626549827424500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields626549827411800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass626549827424500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields626549829441500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields626549829441500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass626549829445400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields626549829441500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass626549829445400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields626549830115900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields626549830115900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass626549830118700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields626549830115900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass626549830118700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields626549830504300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields626549830504300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass626549830507900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields626549830504300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass626549830507900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

