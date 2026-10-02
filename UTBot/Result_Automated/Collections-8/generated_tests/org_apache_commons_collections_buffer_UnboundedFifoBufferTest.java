package org.apache.commons.collections.buffer;

import org.junit.Test;
import org.apache.commons.collections.BufferUnderflowException;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.io.IOException;
import java.util.zip.ZipInputStream;
import java.io.ObjectStreamField;
import java.io.ObjectOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_collections_buffer_UnboundedFifoBufferTest {
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAdd_SizePlus1GreaterOrEqualBufferLength() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = -255;
        unboundedFifoBuffer.tail = -255;
        byte[] byteArray = {};
        
        java.lang.Object[] initialUnboundedFifoBufferBuffer = unboundedFifoBuffer.buffer;
        
        boolean actual = unboundedFifoBuffer.add(byteArray);
        
        assertTrue(actual);
        
        java.lang.Object[] finalUnboundedFifoBufferBuffer = unboundedFifoBuffer.buffer;
        int finalUnboundedFifoBufferHead = unboundedFifoBuffer.head;
        int finalUnboundedFifoBufferTail = unboundedFifoBuffer.tail;
        
        assertFalse(initialUnboundedFifoBufferBuffer == finalUnboundedFifoBufferBuffer);
        
        assertEquals(0, finalUnboundedFifoBufferHead);
        
        assertEquals(0, finalUnboundedFifoBufferTail);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAdd_SizePlus1LessThanBufferLength() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null, null};
        unboundedFifoBuffer.buffer = buffer;
        Object object = new Object();
        
        Object initialUnboundedFifoBufferBuffer0 = unboundedFifoBuffer.buffer[0];
        
        boolean actual = unboundedFifoBuffer.add(object);
        
        assertTrue(actual);
        
        Object finalUnboundedFifoBufferBuffer0 = unboundedFifoBuffer.buffer[0];
        int finalUnboundedFifoBufferTail = unboundedFifoBuffer.tail;
        
        assertFalse(initialUnboundedFifoBufferBuffer0 == finalUnboundedFifoBufferBuffer0);
        
        assertEquals(1, finalUnboundedFifoBufferTail);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testAdd_SizePlus1LessThanBufferLength_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null, null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 1;
        unboundedFifoBuffer.tail = 1;
        Object object = new Object();
        
        Object initialUnboundedFifoBufferBuffer1 = unboundedFifoBuffer.buffer[1];
        
        boolean actual = unboundedFifoBuffer.add(object);
        
        assertTrue(actual);
        
        Object finalUnboundedFifoBufferBuffer1 = unboundedFifoBuffer.buffer[1];
        int finalUnboundedFifoBufferTail = unboundedFifoBuffer.tail;
        
        assertFalse(initialUnboundedFifoBufferBuffer1 == finalUnboundedFifoBufferBuffer1);
        
        assertEquals(0, finalUnboundedFifoBufferTail);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (obj == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: obj == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testAdd_ThrowNullPointerException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        
        unboundedFifoBuffer.add(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[tail] = obj;
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null, null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 129;
        unboundedFifoBuffer.tail = 129;
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.add(UnboundedFifoBuffer.java:197) */
        unboundedFifoBuffer.add(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): True}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: Object[] tmp = new Object[((buffer.length - 1) * 2) + 1];
 *  */
    @Test
    public void testAdd_ThrowNegativeArraySizeException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = -136;
        unboundedFifoBuffer.tail = -127;
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.add] produces [java.lang.NegativeArraySizeException: -1]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.add(UnboundedFifoBuffer.java:182) */
        unboundedFifoBuffer.add(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = head; i != tail; )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tmp[j] = buffer[i];
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = new java.lang.Object[20];
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 358061944;
        unboundedFifoBuffer.tail = 1789421703;
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 358061944 out of bounds for length 20]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.add(UnboundedFifoBuffer.java:186) */
        unboundedFifoBuffer.add(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): True}
 * @utbot.iterates iterate the loop {@code for(int i = head; i != tail; )} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: tmp[j] = buffer[i];
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.tail = 2147483335;
        int[] intArray = {};
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.add(UnboundedFifoBuffer.java:186) */
        unboundedFifoBuffer.add(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.executesCondition {@code (size() + 1 >= buffer.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: buffer[tail] = obj;
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = -128;
        unboundedFifoBuffer.tail = -130;
        short[] shortArray = {};
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index -130 out of bounds for length 1]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.add(UnboundedFifoBuffer.java:197) */
        unboundedFifoBuffer.add(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#add(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: size() + 1 >= buffer.length
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = -255;
        unboundedFifoBuffer.tail = -255;
        byte[] byteArray = {};
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.add] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.add(UnboundedFifoBuffer.java:180) */
        unboundedFifoBuffer.add(byteArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.executesCondition {@code (element != null): True}
 * @utbot.returnsFrom {@code return element;}
 *  */
    @Test
    public void testRemove_ElementNotEqualsNull() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = new java.lang.Object[10];
        Object object = createInstance("java.lang.Object");
        buffer[0] = object;
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.tail = 255;
        
        Object actual = unboundedFifoBuffer.remove();
        
        Object expected = new Object();
        
        Object finalUnboundedFifoBufferBuffer0 = unboundedFifoBuffer.buffer[0];
        int finalUnboundedFifoBufferHead = unboundedFifoBuffer.head;
        
        assertNull(finalUnboundedFifoBufferBuffer0);
        
        assertEquals(1, finalUnboundedFifoBufferHead);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.executesCondition {@code (element != null): False}
 * @utbot.returnsFrom {@code return element;}
 *  */
    @Test
    public void testRemove_ElementEqualsNull() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null, null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 1;
        unboundedFifoBuffer.tail = 4;
        
        Object actual = unboundedFifoBuffer.remove();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.executesCondition {@code (element != null): True}
 * @utbot.returnsFrom {@code return element;}
 *  */
    @Test
    public void testRemove_ElementNotEqualsNull_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        buffer[0] = object;
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.tail = 255;
        
        Object actual = unboundedFifoBuffer.remove();
        
        Object expected = new Object();
        
        Object finalUnboundedFifoBufferBuffer0 = unboundedFifoBuffer.buffer[0];
        
        assertNull(finalUnboundedFifoBufferBuffer0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object element = buffer[head];
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = -130;
        unboundedFifoBuffer.tail = -127;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index -130 out of bounds for length 1]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove(UnboundedFifoBuffer.java:227) */
        unboundedFifoBuffer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Object element = buffer[head];
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 0]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove(UnboundedFifoBuffer.java:227) */
        unboundedFifoBuffer.remove();
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Object element = buffer[head];
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = -130;
        unboundedFifoBuffer.tail = -127;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.remove(UnboundedFifoBuffer.java:227) */
        unboundedFifoBuffer.remove();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#remove()}
 * @utbot.invokes {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
 * @utbot.throwsException {@link org.apache.commons.collections.BufferUnderflowException} when: isEmpty()
 *  */
    @Test(expected = BufferUnderflowException.class)
    public void testRemove_ThrowBufferUnderflowException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        unboundedFifoBuffer.remove();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#get()}
 * @utbot.invokes {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
 * @utbot.returnsFrom {@code return buffer[head];}
 *  */
    @Test
    public void testGet_UnboundedFifoBufferIsEmpty() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.tail = 255;
        
        Object actual = unboundedFifoBuffer.get();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#get()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return buffer[head];
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = -130;
        unboundedFifoBuffer.tail = -127;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index -130 out of bounds for length 1]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.get(UnboundedFifoBuffer.java:213) */
        unboundedFifoBuffer.get();
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#get()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return buffer[head];
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index 256 out of bounds for length 0]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.get(UnboundedFifoBuffer.java:213) */
        unboundedFifoBuffer.get();
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#get()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return buffer[head];
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = -130;
        unboundedFifoBuffer.tail = -127;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.get] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.get(UnboundedFifoBuffer.java:213) */
        unboundedFifoBuffer.get();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#get()}
 * @utbot.invokes {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
 * @utbot.throwsException {@link org.apache.commons.collections.BufferUnderflowException} when: isEmpty()
 *  */
    @Test(expected = BufferUnderflowException.class)
    public void testGet_ThrowBufferUnderflowException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        unboundedFifoBuffer.get();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero_2() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = -255;
        unboundedFifoBuffer.tail = -255;
        
        boolean actual = unboundedFifoBuffer.isEmpty();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 16;
        unboundedFifoBuffer.tail = 15;
        
        boolean actual = unboundedFifoBuffer.isEmpty();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
 * @utbot.returnsFrom {@code return (size() == 0);}
 *  */
    @Test
    public void testIsEmpty_ReturnSizeNotEqualsZero_1() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        boolean actual = unboundedFifoBuffer.isEmpty();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isEmpty()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer}
     * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#isEmpty()}
     */
    @Test
    public void testIsEmptyReturnsFalse() {
        UnboundedFifoBuffer unboundedFifoBuffer = new UnboundedFifoBuffer();
        Object object = new Object();
        unboundedFifoBuffer.add(object);
        Object object1 = new Object();
        unboundedFifoBuffer.add(object1);
        Object object2 = new Object();
        unboundedFifoBuffer.add(object2);
        
        boolean actual = unboundedFifoBuffer.isEmpty();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#size()}
 * @utbot.executesCondition {@code (tail < head): False}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_TailGreaterOrEqualHead() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = -255;
        unboundedFifoBuffer.tail = -255;
        
        int actual = unboundedFifoBuffer.size();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#size()}
 * @utbot.executesCondition {@code (tail < head): True}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_TailLessThanHead() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        int actual = unboundedFifoBuffer.size();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method size()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#size()}
 * @utbot.executesCondition {@code (tail < head): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: size = buffer.length - head + tail;
 *  */
    @Test
    public void testSize_ThrowNullPointerException() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = 256;
        unboundedFifoBuffer.tail = 255;
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.size] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.size(UnboundedFifoBuffer.java:151) */
        unboundedFifoBuffer.size();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#iterator()}
 * @utbot.returnsFrom {@code return new Iterator() {
 * 
 *     private int index = head;
 * 
 *     private int lastReturnedIndex = -1;
 * 
 *     public boolean hasNext() {
 *         return index != tail;
 *     }
 * 
 *     public Object next() {
 *         if (!hasNext()) {
 *             throw new NoSuchElementException();
 *         }
 *         lastReturnedIndex = index;
 *         index = increment(index);
 *         return buffer[lastReturnedIndex];
 *     }
 * 
 *     public void remove() {
 *         if (lastReturnedIndex == -1) {
 *             throw new IllegalStateException();
 *         }
 *         if (lastReturnedIndex == head) {
 *             UnboundedFifoBuffer.this.remove();
 *             lastReturnedIndex = -1;
 *             return;
 *         }
 *         int i = increment(lastReturnedIndex);
 *         while (i != tail) {
 *             buffer[decrement(i)] = buffer[i];
 *             i = increment(i);
 *         }
 *         lastReturnedIndex = -1;
 *         tail = decrement(tail);
 *         buffer[tail] = null;
 *         index = decrement(index);
 *     }
 * };}
 *  */
    @Test
    public void testIterator_Return() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        unboundedFifoBuffer.head = -255;
        
        Iterator actual = unboundedFifoBuffer.iterator();
        
        Iterator expected = ((Iterator) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer$1"));
        setField(expected, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "index", -255);
        setField(expected, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "lastReturnedIndex", -1);
        setField(expected, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "this$0", unboundedFifoBuffer);
        
        int expectedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "index"));
        int actualIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "index"));
        assertEquals(expectedIndex, actualIndex);
        
        int expectedLastReturnedIndex = ((Integer) getFieldValue(expected, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "lastReturnedIndex"));
        int actualLastReturnedIndex = ((Integer) getFieldValue(actual, "org.apache.commons.collections.buffer.UnboundedFifoBuffer$1", "lastReturnedIndex"));
        assertEquals(expectedLastReturnedIndex, actualLastReturnedIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.increment
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method increment(int)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#increment(int)}
 * @utbot.executesCondition {@code (index >= buffer.length): False}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testIncrement_IndexLessThanBufferLength() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null, null};
        unboundedFifoBuffer.buffer = buffer;
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class intType = int.class;
        Method incrementMethod = unboundedFifoBufferClazz.getDeclaredMethod("increment", intType);
        incrementMethod.setAccessible(true);
        java.lang.Object[] incrementMethodArguments = new java.lang.Object[1];
        incrementMethodArguments[0] = 0;
        int actual = ((Integer) incrementMethod.invoke(unboundedFifoBuffer, incrementMethodArguments));
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#increment(int)}
 * @utbot.executesCondition {@code (index >= buffer.length): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testIncrement_IndexGreaterOrEqualBufferLength() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null, null};
        unboundedFifoBuffer.buffer = buffer;
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class intType = int.class;
        Method incrementMethod = unboundedFifoBufferClazz.getDeclaredMethod("increment", intType);
        incrementMethod.setAccessible(true);
        java.lang.Object[] incrementMethodArguments = new java.lang.Object[1];
        incrementMethodArguments[0] = 1;
        int actual = ((Integer) incrementMethod.invoke(unboundedFifoBuffer, incrementMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method increment(int)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#increment(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index >= buffer.length
 *  */
    @Test
    public void testIncrement_ThrowNullPointerException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.increment] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.increment(UnboundedFifoBuffer.java:243) */
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class intType = int.class;
        Method incrementMethod = unboundedFifoBufferClazz.getDeclaredMethod("increment", intType);
        incrementMethod.setAccessible(true);
        java.lang.Object[] incrementMethodArguments = new java.lang.Object[1];
        incrementMethodArguments[0] = -255;
        try {
            incrementMethod.invoke(unboundedFifoBuffer, incrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: in.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.readObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.readObject(UnboundedFifoBuffer.java:131) */
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: in.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException_1() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_2() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", -255);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = new java.io.ObjectStreamField[2];
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        fields[1] = objectStreamField;
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_3() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        setField(objectInputStream, "java.io.ObjectInputStream", "passHandle", -255);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        java.io.ObjectStreamField[] fields = new java.io.ObjectStreamField[2];
        ObjectStreamField objectStreamField = ((ObjectStreamField) createInstance("java.io.ObjectStreamField"));
        fields[1] = objectStreamField;
        setField(desc, "java.io.ObjectStreamClass", "fields", fields);
        setField(desc, "java.io.ObjectStreamClass", "numObjFields", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(unboundedFifoBuffer, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for readObject
    
    public void testReadObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 9 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.writeObject] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.writeObject(UnboundedFifoBuffer.java:116) */
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(unboundedFifoBuffer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(unboundedFifoBuffer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: out.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object curContext = createInstance("java.io.SerialCallbackContext");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(unboundedFifoBuffer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteObject_ThrowZipException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) -127, (byte) -127};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(java.lang.Long.MIN_VALUE);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        setField(out, "java.util.zip.ZipOutputStream", "written", -8L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -1L);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(unboundedFifoBuffer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteObject_ThrowIOException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) -127, (byte) -127};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 255);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(unboundedFifoBuffer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testWriteObject_ThrowIOException_1() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        byte[] hbuf = {(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "hbuf", hbuf);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "blkmode", true);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "pos", 256);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(out, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(bout, "java.io.ObjectOutputStream$BlockDataOutputStream", "out", out);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = unboundedFifoBufferClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(unboundedFifoBuffer, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for writeObject
    
    public void testWriteObject_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.collections.buffer.UnboundedFifoBuffer.decrement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method decrement(int)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#decrement(int)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testDecrement_IndexGreaterOrEqualZero() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class intType = int.class;
        Method decrementMethod = unboundedFifoBufferClazz.getDeclaredMethod("decrement", intType);
        decrementMethod.setAccessible(true);
        java.lang.Object[] decrementMethodArguments = new java.lang.Object[1];
        decrementMethodArguments[0] = 1;
        int actual = ((Integer) decrementMethod.invoke(unboundedFifoBuffer, decrementMethodArguments));
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#decrement(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.returnsFrom {@code return index;}
 *  */
    @Test
    public void testDecrement_IndexLessThanZero() throws Exception  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        java.lang.Object[] buffer = {null};
        unboundedFifoBuffer.buffer = buffer;
        
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class intType = int.class;
        Method decrementMethod = unboundedFifoBufferClazz.getDeclaredMethod("decrement", intType);
        decrementMethod.setAccessible(true);
        java.lang.Object[] decrementMethodArguments = new java.lang.Object[1];
        decrementMethodArguments[0] = 0;
        int actual = ((Integer) decrementMethod.invoke(unboundedFifoBuffer, decrementMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method decrement(int)
    
    /**
    @utbot.classUnderTest {@link UnboundedFifoBuffer}
 * @utbot.methodUnderTest {@link org.apache.commons.collections.buffer.UnboundedFifoBuffer#decrement(int)}
 * @utbot.executesCondition {@code (index < 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: index = buffer.length - 1;
 *  */
    @Test
    public void testDecrement_ThrowNullPointerException() throws Throwable  {
        UnboundedFifoBuffer unboundedFifoBuffer = ((UnboundedFifoBuffer) createInstance("org.apache.commons.collections.buffer.UnboundedFifoBuffer"));
        
        /* This test fails because method [org.apache.commons.collections.buffer.UnboundedFifoBuffer.decrement] produces [java.lang.NullPointerException]
            org.apache.commons.collections.buffer.UnboundedFifoBuffer.decrement(UnboundedFifoBuffer.java:258) */
        Class unboundedFifoBufferClazz = Class.forName("org.apache.commons.collections.buffer.UnboundedFifoBuffer");
        Class intType = int.class;
        Method decrementMethod = unboundedFifoBufferClazz.getDeclaredMethod("decrement", intType);
        decrementMethod.setAccessible(true);
        java.lang.Object[] decrementMethodArguments = new java.lang.Object[1];
        decrementMethodArguments[0] = 0;
        try {
            decrementMethod.invoke(unboundedFifoBuffer, decrementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields956570061077000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields956570061077000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass956570061098800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields956570061077000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass956570061098800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields956570061638700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields956570061638700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass956570061642500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields956570061638700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass956570061642500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

