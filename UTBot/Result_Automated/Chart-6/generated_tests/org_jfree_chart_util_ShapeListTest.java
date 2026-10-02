package org.jfree.chart.util;

import org.junit.Test;
import java.awt.Shape;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.NotActiveException;
import java.util.zip.InflaterInputStream;
import java.io.ObjectStreamClass;
import java.util.zip.ZipInputStream;
import java.io.ObjectStreamField;
import java.io.ObjectOutputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public final class org_jfree_chart_util_ShapeListTest {
    ///region Test suites for executable org.jfree.chart.util.ShapeList.getShape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getShape(int)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#getShape(int)}
 * @utbot.returnsFrom {@code return (Shape) get(index);}
 *  */
    @Test
    public void testGetShape_ReturnGetIndex_2() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        
        Shape actual = shapeList.getShape(0);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#getShape(int)}
 * @utbot.returnsFrom {@code return (Shape) get(index);}
 *  */
    @Test
    public void testGetShape_ReturnGetIndex() {
        ShapeList shapeList = new ShapeList();
        
        Shape actual = shapeList.getShape(-1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#getShape(int)}
 * @utbot.returnsFrom {@code return (Shape) get(index);}
 *  */
    @Test
    public void testGetShape_ReturnGetIndex_1() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {null};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        Shape actual = shapeList.getShape(0);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getShape(int)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#getShape(int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (Shape) get(index);
 *  */
    @Test
    public void testGetShape_ThrowClassCastException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects[0] = object;
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.getShape] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.awt.Shape (java.lang.Object is in module java.base of loader 'bootstrap'; java.awt.Shape is in module java.desktop of loader 'bootstrap')]
            org.jfree.chart.util.ShapeList.getShape(ShapeList.java:70) */
        shapeList.getShape(0);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#getShape(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (Shape) get(index);
 *  */
    @Test
    public void testGetShape_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.getShape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.ShapeList.getShape(ShapeList.java:70) */
        shapeList.getShape(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeList.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof ShapeList)): False}
 * @utbot.returnsFrom {@code return super.equals(obj);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfShapeList() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        ShapeList shapeList1 = new ShapeList();
        
        boolean actual = shapeList.equals(shapeList1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof ShapeList)): False}
 * @utbot.returnsFrom {@code return super.equals(obj);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfShapeList_1() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Integer integer = 0;
        objects[0] = ((Object) integer);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        ShapeList shapeList1 = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        
        boolean actual = shapeList.equals(shapeList1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof ShapeList)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfShapeList() {
        ShapeList shapeList = new ShapeList();
        
        boolean actual = shapeList.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Obj() {
        ShapeList shapeList = new ShapeList();
        
        boolean actual = shapeList.equals(shapeList);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof ShapeList)): False}
 * @utbot.returnsFrom {@code return super.equals(obj);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfShapeList_2() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {null};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        ShapeList shapeList1 = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        setField(shapeList1, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        boolean actual = shapeList.equals(shapeList1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof ShapeList)): False}
 * @utbot.returnsFrom {@code return super.equals(obj);}
 *  */
    @Test
    public void testEquals_ObjNotInstanceOfShapeList_3() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {null};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        ShapeList shapeList1 = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects1 = new java.lang.Object[1];
        Object object = createInstance("java.lang.Object");
        objects1[0] = object;
        setField(shapeList1, "org.jfree.chart.util.AbstractObjectList", "objects", objects1);
        setField(shapeList1, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        boolean actual = shapeList.equals(shapeList1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof ShapeList)): False}
 * @utbot.invokes {@link org.jfree.chart.util.AbstractObjectList#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.equals(obj);
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        ShapeList shapeList1 = new ShapeList();
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.get(AbstractObjectList.java:111)
            org.jfree.chart.util.AbstractObjectList.equals(AbstractObjectList.java:193)
            org.jfree.chart.util.ShapeList.equals(ShapeList.java:111) */
        shapeList.equals(shapeList1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeList.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.returnsFrom {@code return super.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnSuperHashCode() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        
        int actual = shapeList.hashCode();
        
        assertEquals(4699, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.returnsFrom {@code return super.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnSuperHashCode_1() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {null};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        int actual = shapeList.hashCode();
        
        assertEquals(173900, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.returnsFrom {@code return super.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnSuperHashCode_2() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = new java.lang.Object[29];
        Integer integer = 0;
        objects[2] = ((Object) integer);
        objects[3] = ((Object) integer);
        objects[4] = ((Object) integer);
        objects[5] = ((Object) integer);
        objects[6] = ((Object) integer);
        objects[11] = ((Object) integer);
        objects[12] = ((Object) integer);
        objects[13] = ((Object) integer);
        objects[14] = ((Object) integer);
        objects[16] = ((Object) integer);
        objects[17] = ((Object) integer);
        objects[23] = ((Object) integer);
        objects[24] = ((Object) integer);
        objects[25] = ((Object) integer);
        objects[26] = ((Object) integer);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 18);
        
        int actual = shapeList.hashCode();
        
        assertEquals(238930201, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.returnsFrom {@code return super.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnSuperHashCode_3() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = new java.lang.Object[2];
        Long long1 = 0L;
        objects[1] = ((Object) long1);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        
        int actual = shapeList.hashCode();
        
        assertEquals(6435669, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.returnsFrom {@code return super.hashCode();}
 *  */
    @Test
    public void testHashCode_ReturnSuperHashCode_4() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = new java.lang.Object[2];
        Integer integer = 0;
        objects[0] = ((Object) integer);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        
        int actual = shapeList.hashCode();
        
        assertEquals(6435669, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 1);
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.hashCode(AbstractObjectList.java:212)
            org.jfree.chart.util.ShapeList.hashCode(ShapeList.java:121) */
        shapeList.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#hashCode()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return super.hashCode();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = new java.lang.Object[1];
        Integer integer = 0;
        objects[0] = ((Object) integer);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "size", 2);
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jfree.chart.util.AbstractObjectList.hashCode(AbstractObjectList.java:214)
            org.jfree.chart.util.ShapeList.hashCode(ShapeList.java:121) */
        shapeList.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeList.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#clone()}
 * @utbot.invokes {@link org.jfree.chart.util.AbstractObjectList#clone()}
 *  */
    @Test
    public void testClone_AbstractObjectListClone() throws Exception  {
        ShapeList shapeList = new ShapeList();
        
        ShapeList actual = ((ShapeList) shapeList.clone());
        
        ShapeList expected = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {null, null, null, null, null, null, null, null};
        setField(expected, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(expected, "org.jfree.chart.util.AbstractObjectList", "increment", 8);
        
        // org.jfree.chart.util.ShapeList has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeList.readObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#readObject(java.io.ObjectInputStream)}
 * @utbot.invokes {@link java.io.ObjectInputStream#defaultReadObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultReadObject();
 *  */
    @Test
    public void testReadObject_ThrowNullPointerException() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.readObject] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeList.readObject(ShapeList.java:160) */
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = shapeListClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = ((Object) null);
        try {
            readObjectMethod.invoke(shapeList, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readObject(java.io.ObjectInputStream)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultReadObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testReadObject_ThrowNotActiveException() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        ObjectInputStream objectInputStream = ((ObjectInputStream) createInstance("java.io.ObjectInputStream"));
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "blkmode", true);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "pos", 255);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "end", 256);
        setField(objectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class objectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = shapeListClazz.getDeclaredMethod("readObject", objectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = objectInputStream;
        try {
            readObjectMethod.invoke(shapeList, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = shapeListClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(shapeList, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_1() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        InflaterInputStream in1 = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(in1, "java.util.zip.InflaterInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        setField(desc, "java.io.ObjectStreamClass", "primDataSize", 1);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = shapeListClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(shapeList, readObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#readObject(java.io.ObjectInputStream)}
 * @utbot.throwsException {@link java.io.IOException} 
 *  */
    @Test(expected = IOException.class)
    public void testReadObject_ThrowIOException_2() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        Object classLoaderObjectInputStream = createInstance("sun.awt.datatransfer.ClassLoaderObjectInputStream");
        Object bin = createInstance("java.io.ObjectInputStream$BlockDataInputStream");
        Object in = createInstance("java.io.ObjectInputStream$PeekInputStream");
        ZipInputStream in1 = ((ZipInputStream) createInstance("java.util.zip.ZipInputStream"));
        setField(in1, "java.util.zip.ZipInputStream", "closed", true);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "in", in1);
        setField(in, "java.io.ObjectInputStream$PeekInputStream", "peekb", -1);
        setField(bin, "java.io.ObjectInputStream$BlockDataInputStream", "in", in);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "bin", bin);
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "passHandle", -255);
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
        setField(classLoaderObjectInputStream, "java.io.ObjectInputStream", "curContext", curContext);
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class classLoaderObjectInputStreamType = Class.forName("java.io.ObjectInputStream");
        Method readObjectMethod = shapeListClazz.getDeclaredMethod("readObject", classLoaderObjectInputStreamType);
        readObjectMethod.setAccessible(true);
        java.lang.Object[] readObjectMethodArguments = new java.lang.Object[1];
        readObjectMethodArguments[0] = classLoaderObjectInputStream;
        try {
            readObjectMethod.invoke(shapeList, readObjectMethodArguments);
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
        // 11 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Inflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 10 occurrences of:
        // Default concrete execution failed
        
        // 6 occurrences of:
        /* Unable to make field static final sun.security.util.Debug java.util.jar.JarVerifier.debug accessible: module
        java.base does not "opens java.util.jar" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeList.writeObject
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#writeObject(java.io.ObjectOutputStream)}
 * @utbot.invokes {@link java.io.ObjectOutputStream#defaultWriteObject()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: stream.defaultWriteObject();
 *  */
    @Test
    public void testWriteObject_ThrowNullPointerException() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.writeObject] produces [java.lang.NullPointerException]
            org.jfree.chart.util.ShapeList.writeObject(ShapeList.java:133) */
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = shapeListClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = ((Object) null);
        try {
            writeObjectMethod.invoke(shapeList, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeObject(java.io.ObjectOutputStream)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} in: stream.defaultWriteObject();
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = shapeListClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(shapeList, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.io.NotActiveException} 
 *  */
    @Test(expected = NotActiveException.class)
    public void testWriteObject_ThrowNotActiveException_1() throws Throwable  {
        ShapeList shapeList = new ShapeList();
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        Object bout = createInstance("java.io.ObjectOutputStream$BlockDataOutputStream");
        setField(objectOutputStream, "java.io.ObjectOutputStream", "bout", bout);
        Object curContext = createInstance("java.io.SerialCallbackContext");
        int[] obj = {};
        setField(curContext, "java.io.SerialCallbackContext", "obj", obj);
        ObjectStreamClass desc = ((ObjectStreamClass) createInstance("java.io.ObjectStreamClass"));
        Class cl = Object.class;
        setField(desc, "java.io.ObjectStreamClass", "cl", cl);
        setField(desc, "java.io.ObjectStreamClass", "initialized", true);
        setField(curContext, "java.io.SerialCallbackContext", "desc", desc);
        Thread thread = new Thread();
        setField(curContext, "java.io.SerialCallbackContext", "thread", thread);
        setField(objectOutputStream, "java.io.ObjectOutputStream", "curContext", curContext);
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = shapeListClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(shapeList, writeObjectMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#writeObject(java.io.ObjectOutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} 
 *  */
    @Test(expected = ZipException.class)
    public void testWriteObject_ThrowZipException() throws Throwable  {
        ShapeList shapeList = new ShapeList();
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
        
        Class shapeListClazz = Class.forName("org.jfree.chart.util.ShapeList");
        Class objectOutputStreamType = Class.forName("java.io.ObjectOutputStream");
        Method writeObjectMethod = shapeListClazz.getDeclaredMethod("writeObject", objectOutputStreamType);
        writeObjectMethod.setAccessible(true);
        java.lang.Object[] writeObjectMethodArguments = new java.lang.Object[1];
        writeObjectMethodArguments[0] = objectOutputStream;
        try {
            writeObjectMethod.invoke(shapeList, writeObjectMethodArguments);
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
        // 12 occurrences of:
        // Concrete execution failed
        
        // 3 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jfree.chart.util.ShapeList.setShape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setShape(int, java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 *  */
    @Test
    public void testSetShape() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {null};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        
        shapeList.setShape(0, null);
        
        int finalShapeListSize = ((Integer) getFieldValue(shapeList, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertEquals(1, finalShapeListSize);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 *  */
    @Test
    public void testSetShape_1() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        java.lang.Object[] initialShapeListObjects = ((java.lang.Object[]) getFieldValue(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects"));
        
        shapeList.setShape(0, null);
        
        java.lang.Object[] finalShapeListObjects = ((java.lang.Object[]) getFieldValue(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects"));
        int finalShapeListSize = ((Integer) getFieldValue(shapeList, "org.jfree.chart.util.AbstractObjectList", "size"));
        
        assertFalse(initialShapeListObjects == finalShapeListObjects);
        
        assertEquals(1, finalShapeListSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setShape(int, java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: set(index, shape);
 *  */
    @Test
    public void testSetShape_ThrowNegativeArraySizeException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", -2147483647);
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.setShape] produces [java.lang.NegativeArraySizeException: -2147483647]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:127)
            org.jfree.chart.util.ShapeList.setShape(ShapeList.java:81) */
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: set(index, shape);
 *  */
    @Test
    public void testSetShape_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        java.lang.Object[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        
        /* This test fails because method [org.jfree.chart.util.ShapeList.setShape] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jfree.chart.util.AbstractObjectList.set(AbstractObjectList.java:131)
            org.jfree.chart.util.ShapeList.setShape(ShapeList.java:81) */
        shapeList.setShape(0, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setShape(int, java.awt.Shape)
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: set(index, shape);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetShape_ThrowIllegalArgumentException() {
        ShapeList shapeList = new ShapeList();
        
        shapeList.setShape(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        byte[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_1() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        long[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_2() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        int[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_3() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        double[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_4() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        boolean[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_5() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        float[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_6() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        char[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link ShapeList}
 * @utbot.methodUnderTest {@link org.jfree.chart.util.ShapeList#setShape(int,java.awt.Shape)}
 * @utbot.throwsException {@link java.lang.ArrayStoreException} in: set(index, shape);
 *  */
    @Test(expected = ArrayStoreException.class)
    public void testSetShape_ThrowArrayStoreException_7() throws Exception  {
        ShapeList shapeList = ((ShapeList) createInstance("org.jfree.chart.util.ShapeList"));
        short[] objects = {};
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "objects", objects);
        setField(shapeList, "org.jfree.chart.util.AbstractObjectList", "increment", 1);
        
        shapeList.setShape(0, null);
    }
    ///endregion
    
    ///region Errors report for setShape
    
    public void testSetShape_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields796191207537000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields796191207537000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass796191207566900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields796191207537000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass796191207566900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields796191209242400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields796191209242400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass796191209251900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields796191209242400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass796191209251900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

