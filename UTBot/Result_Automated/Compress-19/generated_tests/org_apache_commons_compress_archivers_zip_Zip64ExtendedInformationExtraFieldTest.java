package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.zip.ZipException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_compress_archivers_zip_Zip64ExtendedInformationExtraFieldTest {
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSize()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getSize()}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testGetSize_ReturnSize() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getSize();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)}
 *  */
    @Test
    public void testSetSize() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        zip64ExtendedInformationExtraField.setSize(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCompressedSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCompressedSize()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCompressedSize()}
 * @utbot.returnsFrom {@code return compressedSize;}
 *  */
    @Test
    public void testGetCompressedSize_ReturnCompressedSize() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getCompressedSize();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setCompressedSize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)}
 *  */
    @Test
    public void testSetCompressedSize() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        zip64ExtendedInformationExtraField.setCompressedSize(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getHeaderId
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getHeaderId()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getHeaderId()}
 * @utbot.returnsFrom {@code return HEADER_ID;}
 *  */
    @Test
    public void testGetHeaderId_ReturnHEADER_ID() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        ZipShort prevHEADER_ID = Zip64ExtendedInformationExtraField.HEADER_ID;
        try {
            ZipShort headerId = new ZipShort(1);
            Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "HEADER_ID", headerId);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
            
            ZipShort actual = zip64ExtendedInformationExtraField.getHeaderId();
            
            // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
            assertEquals(headerId, actual);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "HEADER_ID", prevHEADER_ID);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getDiskStartNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDiskStartNumber()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getDiskStartNumber()}
 * @utbot.returnsFrom {@code return diskStart;}
 *  */
    @Test
    public void testGetDiskStartNumber_ReturnDiskStart() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        ZipLong actual = zip64ExtendedInformationExtraField.getDiskStartNumber();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSizes([B)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#addSizes(byte[])}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.executesCondition {@code (compressedSize != null): False}
 * @utbot.returnsFrom {@code return off;}
 *  */
    @Test
    public void testAddSizes_CompressedSizeEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class byteArrayType = Class.forName("[B");
        Method addSizesMethod = zip64ExtendedInformationExtraFieldClazz.getDeclaredMethod("addSizes", byteArrayType);
        addSizesMethod.setAccessible(true);
        java.lang.Object[] addSizesMethodArguments = new java.lang.Object[1];
        addSizesMethodArguments[0] = ((Object) null);
        int actual = ((Integer) addSizesMethod.invoke(zip64ExtendedInformationExtraField, addSizesMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addSizes([B)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#addSizes(byte[])}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.executesCondition {@code (compressedSize != null): False}
 * @utbot.returnsFrom {@code return off;}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return off;
 *  */
    @Test
    public void testAddSizes_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", -1);
        int[] mag = {-255};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 8 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:348) */
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class byteArrayType = Class.forName("[B");
        Method addSizesMethod = zip64ExtendedInformationExtraFieldClazz.getDeclaredMethod("addSizes", byteArrayType);
        addSizesMethod.setAccessible(true);
        java.lang.Object[] addSizesMethodArguments = new java.lang.Object[1];
        addSizesMethodArguments[0] = ((Object) byteArray);
        try {
            addSizesMethod.invoke(zip64ExtendedInformationExtraField, addSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#addSizes(byte[])}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.executesCondition {@code (compressedSize != null): True}
 * @utbot.returnsFrom {@code return off;}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return off;
 *  */
    @Test
    public void testAddSizes_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, null);
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 8 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352) */
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class byteArrayType = Class.forName("[B");
        Method addSizesMethod = zip64ExtendedInformationExtraFieldClazz.getDeclaredMethod("addSizes", byteArrayType);
        addSizesMethod.setAccessible(true);
        java.lang.Object[] addSizesMethodArguments = new java.lang.Object[1];
        addSizesMethodArguments[0] = ((Object) byteArray);
        try {
            addSizesMethod.invoke(zip64ExtendedInformationExtraField, addSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#addSizes(byte[])}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(size.getBytes(), 0, data, 0, DWORD);
 *  */
    @Test
    public void testAddSizes_ThrowNullPointerException() throws Throwable  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {-255};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:348) */
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class byteArrayType = Class.forName("[B");
        Method addSizesMethod = zip64ExtendedInformationExtraFieldClazz.getDeclaredMethod("addSizes", byteArrayType);
        addSizesMethod.setAccessible(true);
        java.lang.Object[] addSizesMethodArguments = new java.lang.Object[1];
        addSizesMethodArguments[0] = ((Object) null);
        try {
            addSizesMethod.invoke(zip64ExtendedInformationExtraField, addSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#addSizes(byte[])}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(size.getBytes(), 0, data, 0, DWORD);
 *  */
    @Test
    public void testAddSizes_ThrowNullPointerException_1() throws Throwable  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", -1);
        int[] mag = {-255};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:348) */
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class byteArrayType = Class.forName("[B");
        Method addSizesMethod = zip64ExtendedInformationExtraFieldClazz.getDeclaredMethod("addSizes", byteArrayType);
        addSizesMethod.setAccessible(true);
        java.lang.Object[] addSizesMethodArguments = new java.lang.Object[1];
        addSizesMethodArguments[0] = ((Object) null);
        try {
            addSizesMethod.invoke(zip64ExtendedInformationExtraField, addSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#addSizes(byte[])}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.executesCondition {@code (compressedSize != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(compressedSize.getBytes(), 0, data, off, DWORD);
 *  */
    @Test
    public void testAddSizes_ThrowNullPointerException_2() throws Throwable  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {1};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352) */
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        Class byteArrayType = Class.forName("[B");
        Method addSizesMethod = zip64ExtendedInformationExtraFieldClazz.getDeclaredMethod("addSizes", byteArrayType);
        addSizesMethod.setAccessible(true);
        java.lang.Object[] addSizesMethodArguments = new java.lang.Object[1];
        addSizesMethodArguments[0] = ((Object) null);
        try {
            addSizesMethod.invoke(zip64ExtendedInformationExtraField, addSizesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setDiskStartNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong)}
 *  */
    @Test
    public void testSetDiskStartNumber() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        zip64ExtendedInformationExtraField.setDiskStartNumber(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalFileDataLength()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.returnsFrom {@code return new ZipShort(size != null ? 2 * DWORD : 0);}
 *  */
    @Test
    public void testGetLocalFileDataLength_SizeEqualsNull() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        ZipShort actual = zip64ExtendedInformationExtraField.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(0);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getLocalFileDataLength()}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.returnsFrom {@code return new ZipShort(size != null ? 2 * DWORD : 0);}
 *  */
    @Test
    public void testGetLocalFileDataLength_SizeNotEqualsNull() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        
        ZipShort actual = zip64ExtendedInformationExtraField.getLocalFileDataLength();
        
        ZipShort expected = new ZipShort(16);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCentralDirectoryLength()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCentralDirectoryLength()}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.executesCondition {@code (compressedSize != null): True}
 * @utbot.executesCondition {@code (relativeHeaderOffset != null): False}
 * @utbot.executesCondition {@code (diskStart != null): True}
 * @utbot.returnsFrom {@code 0}
 *  */
    @Test
    public void testGetCentralDirectoryLength_CompressedSizeNotEqualsNull() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, null, zipLong);
        
        ZipShort actual = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(20);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCentralDirectoryLength()}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.executesCondition {@code (compressedSize != null): False}
 * @utbot.executesCondition {@code (relativeHeaderOffset != null): False}
 * @utbot.executesCondition {@code (diskStart != null): True}
 * @utbot.returnsFrom {@code 0}
 *  */
    @Test
    public void testGetCentralDirectoryLength_DiskStartNotEqualsNull() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, zipLong);
        
        ZipShort actual = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(12);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCentralDirectoryLength()}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.executesCondition {@code (compressedSize != null): False}
 * @utbot.executesCondition {@code (relativeHeaderOffset != null): True}
 * @utbot.executesCondition {@code (diskStart != null): False}
 * @utbot.returnsFrom {@code 0}
 *  */
    @Test
    public void testGetCentralDirectoryLength_DiskStartEqualsNull() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, zipEightByteInteger, null);
        
        ZipShort actual = zip64ExtendedInformationExtraField.getCentralDirectoryLength();
        
        ZipShort expected = new ZipShort(8);
        
        // org.apache.commons.compress.archivers.zip.ZipShort has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalFileDataData()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getLocalFileDataData()}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.executesCondition {@code (compressedSize != null): False}
 *  */
    @Test
    public void testGetLocalFileDataData_CompressedSizeEqualsNull() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class zip64ExtendedInformationExtraFieldClazz = Class.forName("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField");
        byte[] prevEMPTY = ((byte[]) getStaticFieldValue(zip64ExtendedInformationExtraFieldClazz, "EMPTY"));
        try {
            byte[] empty = {};
            setStaticField(zip64ExtendedInformationExtraFieldClazz, "EMPTY", empty);
            Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
            
            byte[] actual = zip64ExtendedInformationExtraField.getLocalFileDataData();
            
            assertArrayEquals(empty, actual);
        } finally {
            setStaticField(Zip64ExtendedInformationExtraField.class, "EMPTY", prevEMPTY);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLocalFileDataData()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getLocalFileDataData()}
 * @utbot.executesCondition {@code (size != null): False}
 * @utbot.executesCondition {@code (compressedSize != null): True}
 * @utbot.executesCondition {@code (size == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: size == null || compressedSize == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_ThrowIllegalArgumentException() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, null);
        
        zip64ExtendedInformationExtraField.getLocalFileDataData();
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getLocalFileDataData()}
 * @utbot.executesCondition {@code (size != null): True}
 * @utbot.executesCondition {@code (size == null): False}
 * @utbot.executesCondition {@code (compressedSize == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: size == null || compressedSize == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLocalFileDataData_ThrowIllegalArgumentException_1() {
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        
        zip64ExtendedInformationExtraField.getLocalFileDataData();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLocalFileDataData()
    
    @Test
    public void testGetLocalFileDataData1() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = new int[17];
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getLocalFileDataData();
        
        byte[] expected = new byte[16];
        expected[0] = (byte) -1;
        expected[1] = (byte) -1;
        expected[2] = (byte) -1;
        expected[3] = (byte) -1;
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        expected[8] = (byte) -1;
        expected[9] = (byte) -1;
        expected[10] = (byte) -1;
        expected[11] = (byte) -1;
        expected[12] = (byte) -1;
        expected[13] = (byte) -1;
        expected[14] = (byte) -1;
        expected[15] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetLocalFileDataData2() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = new int[17];
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getLocalFileDataData();
        
        byte[] expected = new byte[16];
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        BigInteger zip64ExtendedInformationExtraFieldSizeSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldSizeSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(19, finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetLocalFileDataData3() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        BigInteger bigInteger1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger1, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        setField(bigInteger1, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(bigInteger1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getLocalFileDataData();
        
        byte[] expected = new byte[16];
        expected[8] = (byte) -1;
        expected[9] = (byte) -1;
        expected[10] = (byte) -1;
        expected[11] = (byte) -1;
        expected[12] = (byte) -1;
        expected[13] = (byte) -1;
        expected[14] = (byte) -1;
        expected[15] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetLocalFileDataData4() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        BigInteger bigInteger1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger1, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag1 = {0, 0};
        setField(bigInteger1, "java.math.BigInteger", "mag", mag1);
        setField(bigInteger1, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1073741826);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(bigInteger1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getLocalFileDataData();
        
        byte[] expected = new byte[16];
        expected[0] = (byte) -1;
        expected[1] = (byte) -1;
        expected[2] = (byte) -1;
        expected[3] = (byte) -1;
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLocalFileDataData()
    
    @Test
    public void testGetLocalFileDataData5() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {3, 3, -3, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        BigInteger bigInteger1 = ((BigInteger) createInstance("java.math.BigInteger"));
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(bigInteger1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.getInt(BigInteger.java:4628)
            java.base/java.math.BigInteger.longValue(BigInteger.java:4232)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData(Zip64ExtendedInformationExtraField.java:162) */
        zip64ExtendedInformationExtraField.getLocalFileDataData();
    }
    
    @Test
    public void testGetLocalFileDataData6() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {3, 3, 0, 1};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        BigInteger bigInteger1 = ((BigInteger) createInstance("java.math.BigInteger"));
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(bigInteger1);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.getInt(BigInteger.java:4628)
            java.base/java.math.BigInteger.longValue(BigInteger.java:4232)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData(Zip64ExtendedInformationExtraField.java:162) */
        zip64ExtendedInformationExtraField.getLocalFileDataData();
    }
    
    @Test
    public void testGetLocalFileDataData7() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getLocalFileDataData(Zip64ExtendedInformationExtraField.java:162) */
        zip64ExtendedInformationExtraField.getLocalFileDataData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getRelativeHeaderOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRelativeHeaderOffset()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getRelativeHeaderOffset()}
 * @utbot.returnsFrom {@code return relativeHeaderOffset;}
 *  */
    @Test
    public void testGetRelativeHeaderOffset_ReturnRelativeHeaderOffset() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        ZipEightByteInteger actual = zip64ExtendedInformationExtraField.getRelativeHeaderOffset();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseFromCentralDirectoryData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.executesCondition {@code (length % DWORD == WORD): False}
 *  */
    @Test
    public void testParseFromCentralDirectoryData_LengthRemainderOfDWORDNotEqualsWORD() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        byte[] byteArray = {(byte) -127};
        
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 1);
        
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.executesCondition {@code (length % DWORD == WORD): True}
 *  */
    @Test
    public void testParseFromCentralDirectoryData_LengthRemainderOfDWORDEqualsWORD() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        byte[] byteArray = new byte[12];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        
        ZipLong initialZip64ExtendedInformationExtraFieldDiskStart = ((ZipLong) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "diskStart"));
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 12);
        
        ZipLong finalZip64ExtendedInformationExtraFieldDiskStart = ((ZipLong) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "diskStart"));
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldDiskStart == finalZip64ExtendedInformationExtraFieldDiskStart);
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFromCentralDirectoryData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: rawCentralDirectoryData = new byte[length];
 *  */
    @Test
    public void testParseFromCentralDirectoryData_ThrowNegativeArraySizeException() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(Zip64ExtendedInformationExtraField.java:218) */
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(null, -255, -256);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(buffer, offset, rawCentralDirectoryData, 0, length);
 *  */
    @Test
    public void testParseFromCentralDirectoryData_ThrowArrayIndexOutOfBoundsException() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(Zip64ExtendedInformationExtraField.java:219) */
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromCentralDirectoryData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(buffer, offset, rawCentralDirectoryData, 0, length);
 *  */
    @Test
    public void testParseFromCentralDirectoryData_ThrowNullPointerException() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(Zip64ExtendedInformationExtraField.java:219) */
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(null, -255, 1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseFromCentralDirectoryData([B, int, int)
    
    @Test
    public void testParseFromCentralDirectoryData1() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        byte[] byteArray = new byte[31];
        byteArray[0] = (byte) 8;
        byteArray[7] = java.lang.Byte.MIN_VALUE;
        
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 31);
        
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    
    @Test
    public void testParseFromCentralDirectoryData2() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        byte[] byteArray = new byte[39];
        byteArray[5] = (byte) 16;
        byteArray[12] = java.lang.Byte.MIN_VALUE;
        
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 5, 24);
        
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    
    @Test
    public void testParseFromCentralDirectoryData3() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        byte[] byteArray = new byte[29];
        byteArray[0] = (byte) 16;
        byteArray[7] = java.lang.Byte.MIN_VALUE;
        byteArray[8] = (byte) -126;
        byteArray[9] = (byte) -126;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -124;
        byteArray[17] = (byte) -126;
        byteArray[18] = (byte) -124;
        byteArray[19] = (byte) -126;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[27] = java.lang.Byte.MIN_VALUE;
        byteArray[28] = (byte) -124;
        
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 29);
        
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    
    @Test
    public void testParseFromCentralDirectoryData4() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        byte[] byteArray = new byte[40];
        byteArray[0] = (byte) 16;
        
        ZipEightByteInteger initialZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 31);
        
        ZipEightByteInteger finalZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldSize == finalZip64ExtendedInformationExtraFieldSize);
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    
    @Test
    public void testParseFromCentralDirectoryData5() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        byte[] byteArray = new byte[24];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) 1;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 24);
        
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    
    @Test
    public void testParseFromCentralDirectoryData6() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        byte[] byteArray = new byte[28];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) 1;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) 1;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        byteArray[25] = (byte) -127;
        byteArray[26] = (byte) -127;
        byteArray[27] = (byte) -127;
        
        ZipEightByteInteger initialZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        byte[] initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        zip64ExtendedInformationExtraField.parseFromCentralDirectoryData(byteArray, 0, 28);
        
        ZipEightByteInteger finalZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        byte[] finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData = ((byte[]) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldSize == finalZip64ExtendedInformationExtraFieldSize);
        
        assertFalse(initialZip64ExtendedInformationExtraFieldRawCentralDirectoryData == finalZip64ExtendedInformationExtraFieldRawCentralDirectoryData);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCentralDirectoryData()
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCentralDirectoryData()}
 * @utbot.executesCondition {@code (diskStart != null): False}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetCentralDirectoryData_DiskStartEqualsNull() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#getCentralDirectoryData()}
 * @utbot.executesCondition {@code (diskStart != null): True}
 * @utbot.invokes {@link org.apache.commons.compress.archivers.zip.ZipLong#getBytes()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetCentralDirectoryData_DiskStartNotEqualsNull() {
        ZipLong zipLong = new ZipLong(-255L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) 1, (byte) -1, (byte) -1, (byte) -1};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCentralDirectoryData()
    
    @Test
    public void testGetCentralDirectoryData1() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, zipEightByteInteger, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[28];
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData2() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, zipEightByteInteger, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[28];
        expected[0] = (byte) -1;
        expected[1] = (byte) -1;
        expected[2] = (byte) -1;
        expected[3] = (byte) -1;
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        expected[8] = (byte) -1;
        expected[9] = (byte) -1;
        expected[10] = (byte) -1;
        expected[11] = (byte) -1;
        expected[12] = (byte) -1;
        expected[13] = (byte) -1;
        expected[14] = (byte) -1;
        expected[15] = (byte) -1;
        expected[16] = (byte) -1;
        expected[17] = (byte) -1;
        expected[18] = (byte) -1;
        expected[19] = (byte) -1;
        expected[20] = (byte) -1;
        expected[21] = (byte) -1;
        expected[22] = (byte) -1;
        expected[23] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData3() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, zipEightByteInteger, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[24];
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData4() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, zipEightByteInteger, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[24];
        expected[0] = (byte) -1;
        expected[1] = (byte) -1;
        expected[2] = (byte) -1;
        expected[3] = (byte) -1;
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        expected[8] = (byte) -1;
        expected[9] = (byte) -1;
        expected[10] = (byte) -1;
        expected[11] = (byte) -1;
        expected[12] = (byte) -1;
        expected[13] = (byte) -1;
        expected[14] = (byte) -1;
        expected[15] = (byte) -1;
        expected[16] = (byte) -1;
        expected[17] = (byte) -1;
        expected[18] = (byte) -1;
        expected[19] = (byte) -1;
        expected[20] = (byte) -1;
        expected[21] = (byte) -1;
        expected[22] = (byte) -1;
        expected[23] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData5() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, zipEightByteInteger, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[16];
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData6() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, zipEightByteInteger, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[16];
        expected[0] = (byte) -1;
        expected[1] = (byte) -1;
        expected[2] = (byte) -1;
        expected[3] = (byte) -1;
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        expected[8] = (byte) -1;
        expected[9] = (byte) -1;
        expected[10] = (byte) -1;
        expected[11] = (byte) -1;
        expected[12] = (byte) -1;
        expected[13] = (byte) -1;
        expected[14] = (byte) -1;
        expected[15] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData7() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", Integer.MIN_VALUE);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[20];
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        expected[12] = (byte) -1;
        expected[13] = (byte) -1;
        expected[14] = (byte) -1;
        expected[15] = (byte) -1;
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData8() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[20];
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        BigInteger zip64ExtendedInformationExtraFieldSizeSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldSizeSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(7, finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData9() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 2);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData10() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        BigInteger zip64ExtendedInformationExtraFieldSizeSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldSizeSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(7, finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData11() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[12];
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData12() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {1};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[12];
        expected[0] = (byte) -1;
        expected[1] = (byte) -1;
        expected[2] = (byte) -1;
        expected[3] = (byte) -1;
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        BigInteger zip64ExtendedInformationExtraFieldSizeSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldSizeSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(2, finalZip64ExtendedInformationExtraFieldSizeValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData13() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, zipEightByteInteger, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData14() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, zipEightByteInteger, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldRelativeHeaderOffset = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "relativeHeaderOffset"));
        BigInteger zip64ExtendedInformationExtraFieldRelativeHeaderOffsetRelativeHeaderOffsetValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldRelativeHeaderOffset, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldRelativeHeaderOffsetValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldRelativeHeaderOffsetRelativeHeaderOffsetValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(7, finalZip64ExtendedInformationExtraFieldRelativeHeaderOffsetValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData15() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, zipEightByteInteger, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[12];
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData16() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, zipEightByteInteger, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[12];
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldRelativeHeaderOffset = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "relativeHeaderOffset"));
        BigInteger zip64ExtendedInformationExtraFieldRelativeHeaderOffsetRelativeHeaderOffsetValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldRelativeHeaderOffset, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldRelativeHeaderOffsetValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldRelativeHeaderOffsetRelativeHeaderOffsetValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(3, finalZip64ExtendedInformationExtraFieldRelativeHeaderOffsetValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData17() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldCompressedSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "compressedSize"));
        BigInteger zip64ExtendedInformationExtraFieldCompressedSizeCompressedSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldCompressedSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldCompressedSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldCompressedSizeCompressedSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(7, finalZip64ExtendedInformationExtraFieldCompressedSizeValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData18() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", Integer.MIN_VALUE);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, null);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetCentralDirectoryData19() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[12];
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldCompressedSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "compressedSize"));
        BigInteger zip64ExtendedInformationExtraFieldCompressedSizeCompressedSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldCompressedSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldCompressedSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldCompressedSizeCompressedSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(7, finalZip64ExtendedInformationExtraFieldCompressedSizeValueFirstNonzeroIntNumPlusTwo);
    }
    
    @Test
    public void testGetCentralDirectoryData20() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = new int[16];
        mag[14] = 1;
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, null, zipLong);
        
        byte[] actual = zip64ExtendedInformationExtraField.getCentralDirectoryData();
        
        byte[] expected = new byte[12];
        expected[4] = (byte) -1;
        expected[5] = (byte) -1;
        expected[6] = (byte) -1;
        expected[7] = (byte) -1;
        
        assertArrayEquals(expected, actual);
        
        ZipEightByteInteger zip64ExtendedInformationExtraFieldCompressedSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "compressedSize"));
        BigInteger zip64ExtendedInformationExtraFieldCompressedSizeCompressedSizeValue = ((BigInteger) getFieldValue(zip64ExtendedInformationExtraFieldCompressedSize, "org.apache.commons.compress.archivers.zip.ZipEightByteInteger", "value"));
        int finalZip64ExtendedInformationExtraFieldCompressedSizeValueFirstNonzeroIntNumPlusTwo = ((Integer) getFieldValue(zip64ExtendedInformationExtraFieldCompressedSizeCompressedSizeValue, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo"));
        
        assertEquals(3, finalZip64ExtendedInformationExtraFieldCompressedSizeValueFirstNonzeroIntNumPlusTwo);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCentralDirectoryData()
    
    @Test
    public void testGetCentralDirectoryData21() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:171) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData22() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, null, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:171) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData23() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1073741826);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, zipEightByteInteger1, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:173) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData24() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0, 0, 0, 0, 0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, zipEightByteInteger1, null);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:173) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData25() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, zipEightByteInteger1, zipLong);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:173) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData26() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", Integer.MIN_VALUE);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, null, zipEightByteInteger1, zipLong);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:173) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData27() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, zipEightByteInteger1, zipLong);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:173) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData28() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = {0};
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        setField(bigInteger, "java.math.BigInteger", "firstNonzeroIntNumPlusTwo", 1);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, zipEightByteInteger, zipEightByteInteger1, zipLong);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:173) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    
    @Test
    public void testGetCentralDirectoryData29() throws Exception  {
        BigInteger bigInteger = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigInteger, "java.math.BigInteger", "signum", Integer.MIN_VALUE);
        int[] mag = new int[16];
        mag[13] = 1;
        setField(bigInteger, "java.math.BigInteger", "mag", mag);
        ZipEightByteInteger zipEightByteInteger = new ZipEightByteInteger(bigInteger);
        ZipEightByteInteger zipEightByteInteger1 = new ZipEightByteInteger(((BigInteger) null));
        ZipEightByteInteger zipEightByteInteger2 = new ZipEightByteInteger(((BigInteger) null));
        ZipLong zipLong = new ZipLong(0L);
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(zipEightByteInteger, zipEightByteInteger1, zipEightByteInteger2, zipLong);
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData] produces [java.lang.NullPointerException]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:143)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(ZipEightByteInteger.java:108)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.addSizes(Zip64ExtendedInformationExtraField.java:352)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.getCentralDirectoryData(Zip64ExtendedInformationExtraField.java:171) */
        zip64ExtendedInformationExtraField.getCentralDirectoryData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.reparseCentralDirectoryData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reparseCentralDirectoryData(boolean, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (rawCentralDirectoryData != null): True}
 * @utbot.executesCondition {@code (hasUncompressedSize): False}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): False}
 * @utbot.executesCondition {@code (rawCentralDirectoryData.length != expectedLength): False}
 * @utbot.executesCondition {@code (hasUncompressedSize): False}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): False}
 *  */
    @Test
    public void testReparseCentralDirectoryData_NotHasDiskStart() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (rawCentralDirectoryData != null): True}
 * @utbot.executesCondition {@code (hasUncompressedSize): False}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): True}
 * @utbot.executesCondition {@code (rawCentralDirectoryData.length != expectedLength): False}
 * @utbot.executesCondition {@code (hasUncompressedSize): False}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): True}
 *  */
    @Test
    public void testReparseCentralDirectoryData_HasDiskStart() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -127, (byte) -127, (byte) -127, (byte) -127};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        ZipLong initialZip64ExtendedInformationExtraFieldDiskStart = ((ZipLong) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "diskStart"));
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, true);
        
        ZipLong finalZip64ExtendedInformationExtraFieldDiskStart = ((ZipLong) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "diskStart"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldDiskStart == finalZip64ExtendedInformationExtraFieldDiskStart);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (rawCentralDirectoryData != null): False}
 *  */
    @Test
    public void testReparseCentralDirectoryData_RawCentralDirectoryDataEqualsNull() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method reparseCentralDirectoryData(boolean, boolean, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (hasUncompressedSize): True}
 * @utbot.executesCondition {@code (hasCompressedSize): True}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): True}
 * @utbot.executesCondition {@code (hasDiskStart): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: rawCentralDirectoryData.length != expectedLength
 *  */
    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_ThrowZipException() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -127};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, false);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (hasUncompressedSize): True}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: rawCentralDirectoryData.length != expectedLength
 *  */
    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_ThrowZipException_1() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -127};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (hasUncompressedSize): True}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: rawCentralDirectoryData.length != expectedLength
 *  */
    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_ThrowZipException_2() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -127};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, false, true);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#reparseCentralDirectoryData(boolean,boolean,boolean,boolean)}
 * @utbot.executesCondition {@code (hasUncompressedSize): False}
 * @utbot.executesCondition {@code (hasCompressedSize): False}
 * @utbot.executesCondition {@code (hasRelativeHeaderOffset): False}
 * @utbot.executesCondition {@code (hasDiskStart): False}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: rawCentralDirectoryData.length != expectedLength
 *  */
    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData_ThrowZipException_3() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -127};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reparseCentralDirectoryData(boolean, boolean, boolean, boolean)
    
    @Test
    public void testReparseCentralDirectoryData1() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -111, (byte) 1, (byte) -127, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, false, false);
    }
    
    @Test
    public void testReparseCentralDirectoryData2() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[12];
        rawCentralDirectoryData[7] = java.lang.Byte.MIN_VALUE;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, false, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData3() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) 17, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 1};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, false, false);
    }
    
    @Test
    public void testReparseCentralDirectoryData4() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[12];
        rawCentralDirectoryData[0] = (byte) -111;
        rawCentralDirectoryData[1] = (byte) -127;
        rawCentralDirectoryData[2] = (byte) -127;
        rawCentralDirectoryData[3] = (byte) -127;
        rawCentralDirectoryData[4] = (byte) -127;
        rawCentralDirectoryData[5] = (byte) -127;
        rawCentralDirectoryData[6] = (byte) -127;
        rawCentralDirectoryData[7] = (byte) -127;
        rawCentralDirectoryData[8] = (byte) -127;
        rawCentralDirectoryData[9] = (byte) -127;
        rawCentralDirectoryData[10] = (byte) -127;
        rawCentralDirectoryData[11] = (byte) -127;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, false, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData5() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) 16, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, true, false);
    }
    
    @Test
    public void testReparseCentralDirectoryData6() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[12];
        rawCentralDirectoryData[0] = (byte) 16;
        rawCentralDirectoryData[7] = java.lang.Byte.MIN_VALUE;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, true, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData7() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[16];
        rawCentralDirectoryData[0] = (byte) -111;
        rawCentralDirectoryData[1] = (byte) 1;
        rawCentralDirectoryData[2] = (byte) -127;
        rawCentralDirectoryData[3] = (byte) 1;
        rawCentralDirectoryData[8] = (byte) -127;
        rawCentralDirectoryData[9] = (byte) -127;
        rawCentralDirectoryData[10] = (byte) -127;
        rawCentralDirectoryData[11] = (byte) -127;
        rawCentralDirectoryData[12] = (byte) -127;
        rawCentralDirectoryData[13] = (byte) -127;
        rawCentralDirectoryData[14] = (byte) -127;
        rawCentralDirectoryData[15] = (byte) -127;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, false);
    }
    
    @Test
    public void testReparseCentralDirectoryData8() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[20];
        rawCentralDirectoryData[7] = java.lang.Byte.MIN_VALUE;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, true, true, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData9() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[16];
        rawCentralDirectoryData[0] = (byte) -111;
        rawCentralDirectoryData[1] = (byte) 1;
        rawCentralDirectoryData[2] = (byte) -127;
        rawCentralDirectoryData[3] = (byte) 1;
        rawCentralDirectoryData[8] = (byte) -127;
        rawCentralDirectoryData[9] = (byte) -127;
        rawCentralDirectoryData[10] = (byte) -127;
        rawCentralDirectoryData[11] = (byte) -127;
        rawCentralDirectoryData[12] = (byte) -127;
        rawCentralDirectoryData[13] = (byte) -127;
        rawCentralDirectoryData[14] = (byte) -127;
        rawCentralDirectoryData[15] = (byte) -127;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, true, false);
    }
    
    @Test
    public void testReparseCentralDirectoryData10() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[20];
        rawCentralDirectoryData[0] = (byte) 16;
        rawCentralDirectoryData[7] = java.lang.Byte.MIN_VALUE;
        rawCentralDirectoryData[8] = (byte) -127;
        rawCentralDirectoryData[9] = (byte) -127;
        rawCentralDirectoryData[10] = (byte) -127;
        rawCentralDirectoryData[11] = (byte) -127;
        rawCentralDirectoryData[12] = (byte) -127;
        rawCentralDirectoryData[13] = (byte) -127;
        rawCentralDirectoryData[14] = (byte) -127;
        rawCentralDirectoryData[15] = (byte) -127;
        rawCentralDirectoryData[16] = (byte) -127;
        rawCentralDirectoryData[17] = (byte) -127;
        rawCentralDirectoryData[18] = (byte) -127;
        rawCentralDirectoryData[19] = (byte) -127;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, false, true, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData11() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[20];
        rawCentralDirectoryData[0] = (byte) 16;
        rawCentralDirectoryData[7] = java.lang.Byte.MIN_VALUE;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, false, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData12() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[24];
        rawCentralDirectoryData[0] = (byte) 17;
        rawCentralDirectoryData[1] = (byte) 1;
        rawCentralDirectoryData[3] = (byte) 1;
        rawCentralDirectoryData[5] = (byte) 1;
        rawCentralDirectoryData[7] = (byte) 1;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, false);
    }
    
    @Test
    public void testReparseCentralDirectoryData13() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[28];
        rawCentralDirectoryData[7] = java.lang.Byte.MIN_VALUE;
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
    }
    
    @Test
    public void testReparseCentralDirectoryData14() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = new byte[16];
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        ZipEightByteInteger initialZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, false, false);
        
        ZipEightByteInteger finalZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldSize == finalZip64ExtendedInformationExtraFieldSize);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method reparseCentralDirectoryData(boolean, boolean, boolean, boolean)
    
    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData15() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(true, true, true, true);
    }
    
    @Test(expected = ZipException.class)
    public void testReparseCentralDirectoryData16() throws Exception  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = ((Zip64ExtendedInformationExtraField) createInstance("org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField"));
        byte[] rawCentralDirectoryData = {(byte) -127};
        setField(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "rawCentralDirectoryData", rawCentralDirectoryData);
        
        zip64ExtendedInformationExtraField.reparseCentralDirectoryData(false, false, false, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parseFromLocalFileData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (length == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testParseFromLocalFileData_LengthEqualsZero() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        
        zip64ExtendedInformationExtraField.parseFromLocalFileData(null, 0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method parseFromLocalFileData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.executesCondition {@code (length == 0): False}
 * @utbot.executesCondition {@code (length < 2 * DWORD): True}
 * @utbot.throwsException {@link java.util.zip.ZipException} when: length < 2 * DWORD
 *  */
    @Test(expected = ZipException.class)
    public void testParseFromLocalFileData_ThrowZipException() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        
        zip64ExtendedInformationExtraField.parseFromLocalFileData(null, -255, 15);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseFromLocalFileData([B, int, int)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = {(byte) -127, (byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 2]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:179)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -6, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_1() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -8 out of bounds for length 1]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:177)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -15, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_2() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 15]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:181)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -4, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_3() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 15]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:183)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -2, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_4() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 15]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:182)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -3, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_5() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[15];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        byteArray[14] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 15]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:184)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -1, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_6() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[14];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) -127;
        byteArray[8] = (byte) -127;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) -127;
        byteArray[13] = (byte) -127;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 14]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:180)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -5, 16);
    }
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#parseFromLocalFileData(byte[],int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: size = new ZipEightByteInteger(buffer, offset);
 *  */
    @Test
    public void testParseFromLocalFileData_ThrowArrayIndexOutOfBoundsException_7() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = {(byte) -127};
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:178)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:196) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, -7, 16);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method parseFromLocalFileData([B, int, int)
    
    @Test
    public void testParseFromLocalFileData1() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[23];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -126;
        byteArray[2] = (byte) -127;
        byteArray[3] = (byte) -126;
        byteArray[4] = (byte) -124;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[7] = (byte) 16;
        byteArray[14] = java.lang.Byte.MIN_VALUE;
        byteArray[15] = (byte) -126;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -126;
        byteArray[20] = (byte) -124;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, 7, 16);
    }
    
    @Test
    public void testParseFromLocalFileData2() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[39];
        byteArray[0] = (byte) 1;
        byteArray[7] = java.lang.Byte.MIN_VALUE;
        
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, 0, 1073741824);
    }
    
    @Test
    public void testParseFromLocalFileData3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        byte[] byteArray = new byte[25];
        byteArray[0] = (byte) -127;
        byteArray[1] = (byte) -127;
        byteArray[2] = (byte) -126;
        byteArray[3] = (byte) -127;
        byteArray[4] = (byte) -127;
        byteArray[5] = (byte) -127;
        byteArray[6] = (byte) -127;
        byteArray[8] = (byte) 1;
        byteArray[9] = (byte) -127;
        byteArray[10] = (byte) -127;
        byteArray[11] = (byte) -127;
        byteArray[12] = (byte) 1;
        byteArray[13] = (byte) 1;
        byteArray[14] = (byte) -127;
        byteArray[15] = (byte) -127;
        byteArray[16] = (byte) -127;
        byteArray[17] = (byte) -127;
        byteArray[18] = (byte) -127;
        byteArray[19] = (byte) -127;
        byteArray[20] = (byte) -127;
        byteArray[21] = (byte) -127;
        byteArray[22] = (byte) -127;
        byteArray[23] = (byte) -127;
        byteArray[24] = (byte) -127;
        
        ZipEightByteInteger initialZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, 6, 16);
        
        ZipEightByteInteger finalZip64ExtendedInformationExtraFieldSize = ((ZipEightByteInteger) getFieldValue(zip64ExtendedInformationExtraField, "org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField", "size"));
        
        assertFalse(initialZip64ExtendedInformationExtraFieldSize == finalZip64ExtendedInformationExtraFieldSize);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method parseFromLocalFileData([B, int, int)
    
    @Test
    public void testParseFromLocalFileData4() throws ZipException  {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        byte[] byteArray = new byte[31];
        byteArray[22] = java.lang.Byte.MIN_VALUE;
        
        /* This test fails because method [org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 31]
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getValue(ZipEightByteInteger.java:177)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger.<init>(ZipEightByteInteger.java:100)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.parseFromLocalFileData(Zip64ExtendedInformationExtraField.java:202) */
        zip64ExtendedInformationExtraField.parseFromLocalFileData(byteArray, 15, 1073741824);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.setRelativeHeaderOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)
    
    /**
    @utbot.classUnderTest {@link Zip64ExtendedInformationExtraField}
 * @utbot.methodUnderTest {@link org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField#setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger)}
 *  */
    @Test
    public void testSetRelativeHeaderOffset() {
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField(null, null, null, null);
        
        zip64ExtendedInformationExtraField.setRelativeHeaderOffset(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields971393325237200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971393325237200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971393325243300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971393325237200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971393325243300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
                java.lang.reflect.Method methodForGetDeclaredFields971393328380300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields971393328380300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass971393328381700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971393328380300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971393328381700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields971393328738500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971393328738500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971393328739900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971393328738500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971393328739900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields971393329619400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields971393329619400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass971393329621000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields971393329619400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass971393329621000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

