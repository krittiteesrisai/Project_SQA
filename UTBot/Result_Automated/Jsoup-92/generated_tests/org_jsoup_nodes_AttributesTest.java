package org.jsoup.nodes;

import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Stack;
import org.jsoup.parser.ParseSettings;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintStream;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import sun.nio.cs.StreamEncoder;
import java.nio.ReadOnlyBufferException;
import java.nio.charset.CoderMalfunctionError;
import java.io.FileWriter;
import sun.nio.cs.SingleByte.Encoder;
import sun.nio.cs.SingleByte;
import java.util.Map;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_nodes_AttributesTest {
    ///region Test suites for executable org.jsoup.nodes.Attributes.checkNotNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNotNull(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkNotNull(java.lang.String)}
 * @utbot.executesCondition {@code (val == null): False}
 * @utbot.returnsFrom {@code return val == null ? EmptyString : val;}
 *  */
    @Test
    public void testCheckNotNull_ValNotEqualsNull() {
        String string = "";
        
        String actual = Attributes.checkNotNull(string);
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkNotNull(java.lang.String)}
 * @utbot.executesCondition {@code (val == null): True}
 * @utbot.returnsFrom {@code return val == null ? EmptyString : val;}
 *  */
    @Test
    public void testCheckNotNull_ValEqualsNull() {
        String actual = Attributes.checkNotNull(null);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.indexOfKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOfKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.returnsFrom {@code return NotFound;}
 *  */
    @Test
    public void testIndexOfKey_ReturnNotFound() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        int actual = attributes.indexOfKey(string);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testIndexOfKey_KeyEquals() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        int actual = attributes.indexOfKey(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return NotFound;}
 *  */
    @Test
    public void testIndexOfKey_NotKeyEquals() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        int actual = attributes.indexOfKey(string);
        
        assertEquals(-1, actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexOfKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKey_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.indexOfKey(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOfKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: key.equals(keys[i])
 *  */
    @Test
    public void testIndexOfKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.indexOfKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73) */
        attributes.indexOfKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: key.equals(keys[i])
 *  */
    @Test
    public void testIndexOfKey_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.indexOfKey] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73) */
        attributes.indexOfKey(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAdd() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        attributes.vals = keys;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        addMethod.invoke(attributes, addMethodArguments);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesKeys0 = attributes.keys[0];
        String finalAttributesKeys1 = attributes.keys[1];
        
        assertEquals(2, finalAttributesSize);
        
        assertNull(finalAttributesKeys0);
        
        assertNull(finalAttributesKeys1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testAdd_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 18);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[40];
        attributes.vals = vals;
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        addMethod.invoke(attributes, addMethodArguments);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(19, finalAttributesSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: keys[size] = key;
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:120) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[size] = value;
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.add(Attributes.java:121) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkCapacity(size + 1);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.add] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:119) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals[size] = value;
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.add] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkCapacity(size + 1);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 8);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.add] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkCapacity(size + 1);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_3() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 4);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.add] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#add(java.lang.String,java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#checkCapacity(int)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkCapacity(size + 1);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", Integer.MAX_VALUE);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method addMethod = attributesClazz.getDeclaredMethod("add", stringType, stringType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[2];
        addMethodArguments[0] = ((Object) null);
        addMethodArguments[1] = ((Object) null);
        try {
            addMethod.invoke(attributes, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 *  */
    @Test
    public void testRemove() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#remove(int)
 *  */
    @Test
    public void testRemove_AttributesRemove() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        
        attributes.remove(string);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(0, finalAttributesSize);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 *  */
    @Test
    public void testRemove_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "\u0000";
        keys[0] = string;
        attributes.keys = keys;
        String string1 = "  ";
        
        attributes.remove(string1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int i = indexOfKey(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.remove(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKey(key);
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.remove(Attributes.java:195) */
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKey(key);
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.remove(Attributes.java:195) */
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(i);
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for object array[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:182)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197) */
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(i);
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197) */
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: remove(i);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197) */
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: remove(i);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[2];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:183)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197) */
        attributes.remove(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (Validate.isFalse(index >= size);): False}
 * @utbot.executesCondition {@code (shifted > 0): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isFalse(boolean)}
 *  */
    @Test
    public void testRemove_ShiftedLessOrEqualZero() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = 0;
        removeMethod.invoke(attributes, removeMethodArguments);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertEquals(0, finalAttributesSize);
        
        assertNull(finalAttributesKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (Validate.isFalse(index >= size);): True}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isFalse(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isFalse(index >= size);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -255);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = -255;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method remove(int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: keys[size] = null;
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 256);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 255 out of bounds for length 2]
            org.jsoup.nodes.Attributes.remove(Attributes.java:186) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = 255;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(keys, index + 1, keys, index, shifted);
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException_21() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:182) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = -4;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[size] = null;
 *  */
    @Test
    public void testRemove_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = 0;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: keys[size] = null;
 *  */
    @Test
    public void testRemove_ThrowNullPointerException1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -3);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:186) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = -4;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(keys, index + 1, keys, index, shifted);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_2() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -250);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:182) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = -252;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals[size] = null;
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_11() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = 0;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(int)}
 * @utbot.executesCondition {@code (shifted > 0): True}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(vals, index + 1, vals, index, shifted);
 *  */
    @Test
    public void testRemove_ThrowNullPointerException_3() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 32);
        java.lang.String[] keys = new java.lang.String[32];
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.remove] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:183) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method removeMethod = attributesClazz.getDeclaredMethod("remove", intType);
        removeMethod.setAccessible(true);
        java.lang.Object[] removeMethodArguments = new java.lang.Object[1];
        removeMethodArguments[0] = 30;
        try {
            removeMethod.invoke(attributes, removeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGet_ReturnINotEqualsNotFound() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        String actual = attributes.get(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGet_ReturnINotEqualsNotFound_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        String actual = attributes.get(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGet_ReturnINotEqualsNotFound_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[1];
        String string1 = "";
        vals[0] = string1;
        attributes.vals = vals;
        
        String actual = attributes.get(string);
        
        assertEquals(string1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGet_ReturnINotEqualsNotFound_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        String actual = attributes.get(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributesVals0 = attributes.vals[0];
        
        assertNull(finalAttributesVals0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int i = indexOfKey(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.get(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKey(key);
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.get(Attributes.java:100) */
        attributes.get(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkNotNull(vals[i])
 *  */
    @Test
    public void testGet_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.get] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.get(Attributes.java:101) */
        attributes.get(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNotNull(vals[i])
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.get] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.get(Attributes.java:101) */
        attributes.get(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        booleanAttribute.setKey(string);
        
        Attributes initialBooleanAttributeParent = booleanAttribute.parent;
        
        Attributes actual = attributes.put(booleanAttribute);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        Attributes finalBooleanAttributeParent = booleanAttribute.parent;
        
        assertFalse(initialBooleanAttributeParent == finalBooleanAttributeParent);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "\u0000\u0000\u0000";
        booleanAttribute.setKey(key);
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Attributes initialBooleanAttributeParent = booleanAttribute.parent;
        
        Attributes actual = attributes.put(booleanAttribute);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        Attributes finalBooleanAttributeParent = booleanAttribute.parent;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(2, finalAttributesSize);
        
        assertFalse(initialBooleanAttributeParent == finalBooleanAttributeParent);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        Attributes initialBooleanAttributeParent = booleanAttribute.parent;
        
        Attributes actual = attributes.put(booleanAttribute);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        
        Attributes finalBooleanAttributeParent = booleanAttribute.parent;
        
        assertEquals(1, finalAttributesSize);
        
        assertFalse(initialBooleanAttributeParent == finalBooleanAttributeParent);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[33];
        attributes.vals = vals;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Attributes initialBooleanAttributeParent = booleanAttribute.parent;
        
        Attributes actual = attributes.put(booleanAttribute);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        Attributes finalBooleanAttributeParent = booleanAttribute.parent;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(1, finalAttributesSize);
        
        assertFalse(initialBooleanAttributeParent == finalBooleanAttributeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(attribute);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.put(null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException_1() throws Exception  {
        Attributes attributes = new Attributes();
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String val = "";
        setField(booleanAttribute, "org.jsoup.nodes.Attribute", "val", val);
        
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException_2() throws Exception  {
        Attributes attributes = new Attributes();
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        
        attributes.put(booleanAttribute);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        setField(booleanAttribute, "org.jsoup.nodes.Attribute", "val", key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        String val = "";
        setField(booleanAttribute, "org.jsoup.nodes.Attribute", "val", val);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.put(Attributes.java:132)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.put(Attributes.java:132)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:120)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        booleanAttribute.setKey(string);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.put(Attributes.java:134)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = " ";
        booleanAttribute.setKey(key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: put(attribute.getKey(), attribute.getValue());
 *  */
    @Test
    public void testPut_ThrowNullPointerException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String key = "";
        booleanAttribute.setKey(key);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172) */
        attributes.put(booleanAttribute);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method put(org.jsoup.nodes.Attribute)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
     */
    @Test
    public void testPut() throws Exception  {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"-3", "-3", "-3"};
        attributes.vals = vals;
        java.lang.String[] keys = {"10", "", "", "XZ", "-3"};
        attributes.keys = keys;
        Attributes attributes1 = new Attributes();
        java.lang.String[] keys1 = {"#$\\\"'", ""};
        attributes1.keys = keys1;
        java.lang.String[] vals1 = {"XZ", "-3", "\n\t\r", "\n\t\r", "\n\t\r"};
        attributes1.vals = vals1;
        Attribute attribute = new Attribute("abc", "10", attributes1);
        attribute.setKey("-3");
        Attributes parent = new Attributes();
        java.lang.String[] keys2 = {"XZ", "XZ"};
        parent.keys = keys2;
        java.lang.String[] vals2 = {"XZ", "", "XZ", "-3", ""};
        parent.vals = vals2;
        attribute.parent = parent;
        
        Attributes actual = attributes.put(attribute);
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(expected, "org.jsoup.nodes.Attributes", "size", 1);
        expected.keys = keys;
        expected.vals = vals;
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_NotValue_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        
        Attributes actual = attributes.put(string, false);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(0, finalAttributesSize);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_NotValue() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        Attributes actual = attributes.put(string, false);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_NotValue_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = "";
        
        Attributes actual = attributes.put(string, false);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Value() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        String string = "";
        
        Attributes actual = attributes.put(string, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesVals0 = attributes.vals[0];
        
        assertEquals(1, finalAttributesSize);
        
        assertNull(finalAttributesVals0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Value_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[33];
        attributes.vals = vals;
        String string = "";
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Attributes actual = attributes.put(string, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(1, finalAttributesSize);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Value_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        Attributes actual = attributes.put(string, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        String finalAttributesVals0 = attributes.vals[0];
        
        assertNull(finalAttributesVals0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: putIgnoreCase(key, null);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException1() {
        Attributes attributes = new Attributes();
        
        attributes.put(((String) null), true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:141)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(key);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.remove(Attributes.java:195)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(key);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for object array[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:182)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:120)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:141)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(key);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:143)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowNullPointerException1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:141)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_21() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: remove(key);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:183)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_31() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: putIgnoreCase(key, null);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.String, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPutThrowsIAE() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"-3", "-3", "-3"};
        attributes.vals = vals;
        java.lang.String[] keys = {"10", "", "", "XZ", "-3"};
        attributes.keys = keys;
        
        attributes.put(((String) null), false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method put(java.lang.String, boolean)
    
    @Test
    public void testPut1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        String string = "";
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Attributes actual = attributes.put(string, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(2, finalAttributesSize);
    }
    
    @Test
    public void testPut2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = new java.lang.String[18];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null, null, null, null, null, null, null, null, null};
        attributes.vals = vals;
        
        Attributes actual = attributes.put(string, false);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesKeys1 = attributes.keys[1];
        String finalAttributesKeys2 = attributes.keys[2];
        String finalAttributesKeys3 = attributes.keys[3];
        String finalAttributesKeys4 = attributes.keys[4];
        String finalAttributesKeys5 = attributes.keys[5];
        String finalAttributesKeys6 = attributes.keys[6];
        String finalAttributesKeys7 = attributes.keys[7];
        String finalAttributesKeys8 = attributes.keys[8];
        String finalAttributesKeys9 = attributes.keys[9];
        String finalAttributesKeys10 = attributes.keys[10];
        String finalAttributesKeys11 = attributes.keys[11];
        String finalAttributesKeys12 = attributes.keys[12];
        String finalAttributesKeys13 = attributes.keys[13];
        String finalAttributesKeys14 = attributes.keys[14];
        String finalAttributesKeys15 = attributes.keys[15];
        String finalAttributesKeys16 = attributes.keys[16];
        String finalAttributesKeys17 = attributes.keys[17];
        String finalAttributesVals0 = attributes.vals[0];
        String finalAttributesVals1 = attributes.vals[1];
        String finalAttributesVals2 = attributes.vals[2];
        String finalAttributesVals3 = attributes.vals[3];
        String finalAttributesVals4 = attributes.vals[4];
        String finalAttributesVals5 = attributes.vals[5];
        String finalAttributesVals6 = attributes.vals[6];
        String finalAttributesVals7 = attributes.vals[7];
        String finalAttributesVals8 = attributes.vals[8];
        
        assertEquals(2, finalAttributesSize);
        
        assertNull(finalAttributesKeys1);
        
        assertNull(finalAttributesKeys2);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
        
        assertNull(finalAttributesKeys9);
        
        assertNull(finalAttributesKeys10);
        
        assertNull(finalAttributesKeys11);
        
        assertNull(finalAttributesKeys12);
        
        assertNull(finalAttributesKeys13);
        
        assertNull(finalAttributesKeys14);
        
        assertNull(finalAttributesKeys15);
        
        assertNull(finalAttributesKeys16);
        
        assertNull(finalAttributesKeys17);
        
        assertNull(finalAttributesVals0);
        
        assertNull(finalAttributesVals1);
        
        assertNull(finalAttributesVals2);
        
        assertNull(finalAttributesVals3);
        
        assertNull(finalAttributesVals4);
        
        assertNull(finalAttributesVals5);
        
        assertNull(finalAttributesVals6);
        
        assertNull(finalAttributesVals7);
        
        assertNull(finalAttributesVals8);
    }
    
    @Test
    public void testPut3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 4);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000l";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null, null, null, null, null, null, null, null, null};
        attributes.vals = vals;
        String string1 = "\u0000L";
        
        Attributes actual = attributes.put(string1, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        String finalAttributesKeys1 = attributes.keys[1];
        String finalAttributesKeys2 = attributes.keys[2];
        String finalAttributesKeys3 = attributes.keys[3];
        String finalAttributesKeys4 = attributes.keys[4];
        String finalAttributesKeys5 = attributes.keys[5];
        String finalAttributesKeys6 = attributes.keys[6];
        String finalAttributesKeys7 = attributes.keys[7];
        String finalAttributesKeys8 = attributes.keys[8];
        String finalAttributesVals0 = attributes.vals[0];
        String finalAttributesVals1 = attributes.vals[1];
        String finalAttributesVals2 = attributes.vals[2];
        String finalAttributesVals3 = attributes.vals[3];
        String finalAttributesVals4 = attributes.vals[4];
        String finalAttributesVals5 = attributes.vals[5];
        String finalAttributesVals6 = attributes.vals[6];
        String finalAttributesVals7 = attributes.vals[7];
        String finalAttributesVals8 = attributes.vals[8];
        
        assertNull(finalAttributesKeys1);
        
        assertNull(finalAttributesKeys2);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
        
        assertNull(finalAttributesVals0);
        
        assertNull(finalAttributesVals1);
        
        assertNull(finalAttributesVals2);
        
        assertNull(finalAttributesVals3);
        
        assertNull(finalAttributesVals4);
        
        assertNull(finalAttributesVals5);
        
        assertNull(finalAttributesVals6);
        
        assertNull(finalAttributesVals7);
        
        assertNull(finalAttributesVals8);
    }
    
    @Test
    public void testPut4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = {null, null};
        attributes.vals = vals;
        String string = " ";
        
        Attributes actual = attributes.put(string, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesKeys0 = attributes.keys[0];
        String finalAttributesVals0 = attributes.vals[0];
        String finalAttributesVals1 = attributes.vals[1];
        
        assertEquals(2, finalAttributesSize);
        
        assertNull(finalAttributesKeys0);
        
        assertNull(finalAttributesVals0);
        
        assertNull(finalAttributesVals1);
    }
    
    @Test
    public void testPut5() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = new java.lang.String[11];
        String string = "\u0000";
        keys[2] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[11];
        attributes.vals = vals;
        
        Attributes actual = attributes.put(string, true);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        String finalAttributesKeys0 = attributes.keys[0];
        String finalAttributesKeys1 = attributes.keys[1];
        String finalAttributesKeys3 = attributes.keys[3];
        String finalAttributesKeys4 = attributes.keys[4];
        String finalAttributesKeys5 = attributes.keys[5];
        String finalAttributesKeys6 = attributes.keys[6];
        String finalAttributesKeys7 = attributes.keys[7];
        String finalAttributesKeys8 = attributes.keys[8];
        String finalAttributesKeys9 = attributes.keys[9];
        String finalAttributesKeys10 = attributes.keys[10];
        String finalAttributesVals0 = attributes.vals[0];
        String finalAttributesVals1 = attributes.vals[1];
        String finalAttributesVals2 = attributes.vals[2];
        String finalAttributesVals3 = attributes.vals[3];
        String finalAttributesVals4 = attributes.vals[4];
        String finalAttributesVals5 = attributes.vals[5];
        String finalAttributesVals6 = attributes.vals[6];
        String finalAttributesVals7 = attributes.vals[7];
        String finalAttributesVals8 = attributes.vals[8];
        String finalAttributesVals9 = attributes.vals[9];
        String finalAttributesVals10 = attributes.vals[10];
        
        assertNull(finalAttributesKeys0);
        
        assertNull(finalAttributesKeys1);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
        
        assertNull(finalAttributesKeys9);
        
        assertNull(finalAttributesKeys10);
        
        assertNull(finalAttributesVals0);
        
        assertNull(finalAttributesVals1);
        
        assertNull(finalAttributesVals2);
        
        assertNull(finalAttributesVals3);
        
        assertNull(finalAttributesVals4);
        
        assertNull(finalAttributesVals5);
        
        assertNull(finalAttributesVals6);
        
        assertNull(finalAttributesVals7);
        
        assertNull(finalAttributesVals8);
        
        assertNull(finalAttributesVals9);
        
        assertNull(finalAttributesVals10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method put(java.lang.String, boolean)
    
    @Test
    public void testPut6() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        String string1 = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.remove(Attributes.java:195)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string1, false);
    }
    
    @Test
    public void testPut7() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    @Test
    public void testPut8() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000";
        keys[0] = string;
        attributes.keys = keys;
        String string1 = "\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string1, false);
    }
    
    @Test
    public void testPut9() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "l\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        String string1 = "L\u0000\u8000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string1, true);
    }
    
    @Test
    public void testPut10() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "lA\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        String string1 = "LA         ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string1, true);
    }
    
    @Test
    public void testPut11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "K[@@      ";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:143)
            org.jsoup.nodes.Attributes.put(Attributes.java:159) */
        attributes.put(string, true);
    }
    
    @Test
    public void testPut12() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[1] = string;
        keys[2] = string;
        keys[3] = string;
        keys[4] = string;
        keys[5] = string;
        keys[6] = string;
        keys[7] = string;
        keys[8] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.remove(Attributes.java:197)
            org.jsoup.nodes.Attributes.put(Attributes.java:161) */
        attributes.put(string, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        Attributes actual = attributes.put(string, ((String) null));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        String finalAttributesVals0 = attributes.vals[0];
        
        assertNull(finalAttributesVals0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return_11() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        String string = "";
        
        Attributes actual = attributes.put(string, ((String) null));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesVals0 = attributes.vals[0];
        
        assertEquals(1, finalAttributesSize);
        
        assertNull(finalAttributesVals0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testPut_Return_21() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = {null, null};
        attributes.vals = vals;
        String string = "";
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Attributes actual = attributes.put(string, ((String) null));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(attributes, actual));
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(1, finalAttributesSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int i = indexOfKey(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException2() {
        Attributes attributes = new Attributes();
        
        attributes.put(((String) null), ((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method put(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKey(key);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.put(Attributes.java:132) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: add(key, value);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_22() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:120)
            org.jsoup.nodes.Attributes.put(Attributes.java:136) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKey(key);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_42() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.put(Attributes.java:132) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[i] = value;
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_12() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.put(Attributes.java:134) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: add(key, value);
 *  */
    @Test
    public void testPut_ThrowArrayIndexOutOfBoundsException_32() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(key, value);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_12() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.put(Attributes.java:136) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals[i] = value;
 *  */
    @Test
    public void testPut_ThrowNullPointerException2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = " ";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.put(Attributes.java:134) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(key, value);
 *  */
    @Test
    public void testPut_ThrowNullPointerException_22() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136) */
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPut_ThrowNullPointerException_32() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.put] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.put(Attributes.java:136) */
        attributes.put(string, ((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsOGetClass() {
        Attributes attributes = new Attributes();
        int[] intArray = {};
        
        boolean actual = attributes.equals(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() {
        Attributes attributes = new Attributes();
        
        boolean actual = attributes.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() {
        Attributes attributes = new Attributes();
        
        boolean actual = attributes.equals(attributes);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#toString()}
     */
    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"-3", "-3", "-3"};
        attributes.vals = vals;
        java.lang.String[] keys = {"-3", "", "10", "", "XZ"};
        attributes.keys = keys;
        
        String actual = attributes.toString();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            Attributes attributes = new Attributes();
            
            String actual = attributes.toString();
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hashCode()}
 * @utbot.invokes {@link java.util.Arrays#hashCode(java.lang.Object[])}
 * @utbot.invokes {@link java.util.Arrays#hashCode(java.lang.Object[])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ArraysHashCode() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -255);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        int actual = attributes.hashCode();
        
        assertEquals(-244094, actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        Attributes attributes = new Attributes();
        
        Attributes actual = attributes.clone();
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        expected.keys = keys;
        expected.vals = keys;
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.copyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOf([Ljava.lang.String;, int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#copyOf(java.lang.String[],int)}
 * @utbot.invokes {@link java.lang.Math#min(int,int)}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return copy;}
 *  */
    @Test
    public void testCopyOf_MathMin() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        java.lang.String[] stringArray = {};
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method copyOfMethod = attributesClazz.getDeclaredMethod("copyOf", stringArrayType, intType);
        copyOfMethod.setAccessible(true);
        java.lang.Object[] copyOfMethodArguments = new java.lang.Object[2];
        copyOfMethodArguments[0] = ((Object) stringArray);
        copyOfMethodArguments[1] = 0;
        java.lang.String[] actual = ((java.lang.String[]) copyOfMethod.invoke(null, copyOfMethodArguments));
        
        java.lang.String[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOf([Ljava.lang.String;, int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#copyOf(java.lang.String[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final String[] copy = new String[size];
 *  */
    @Test
    public void testCopyOf_ThrowNegativeArraySizeException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Attributes.copyOf] produces [java.lang.NegativeArraySizeException: -256]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:64) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method copyOfMethod = attributesClazz.getDeclaredMethod("copyOf", stringArrayType, intType);
        copyOfMethod.setAccessible(true);
        java.lang.Object[] copyOfMethodArguments = new java.lang.Object[2];
        copyOfMethodArguments[0] = ((Object) null);
        copyOfMethodArguments[1] = -256;
        try {
            copyOfMethod.invoke(null, copyOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#copyOf(java.lang.String[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Math.min(orig.length, size)
 *  */
    @Test
    public void testCopyOf_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.nodes.Attributes.copyOf] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Class intType = int.class;
        Method copyOfMethod = attributesClazz.getDeclaredMethod("copyOf", stringArrayType, intType);
        copyOfMethod.setAccessible(true);
        java.lang.Object[] copyOfMethodArguments = new java.lang.Object[2];
        copyOfMethodArguments[0] = ((Object) null);
        copyOfMethodArguments[1] = 1;
        try {
            copyOfMethod.invoke(null, copyOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#size()}
 * @utbot.returnsFrom {@code return size;}
 *  */
    @Test
    public void testSize_ReturnSize() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -255);
        
        int actual = attributes.size();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#iterator()}
 * @utbot.returnsFrom {@code return new Iterator<Attribute>() {
 * 
 *     int i = 0;
 * 
 *     @Override
 *     public boolean hasNext() {
 *         return i < size;
 *     }
 * 
 *     @Override
 *     public Attribute next() {
 *         final Attribute attr = new Attribute(keys[i], vals[i], Attributes.this);
 *         i++;
 *         return attr;
 *     }
 * 
 *     @Override
 *     public void remove() {
 *         Attributes.this.remove(--i);
 *     }
 * };}
 *  */
    @Test
    public void testIterator_Return() throws Exception  {
        Attributes attributes = new Attributes();
        
        Iterator actual = attributes.iterator();
        
        Iterator expected = ((Iterator) createInstance("org.jsoup.nodes.Attributes$1"));
        Attributes this$0 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        this$0.keys = keys;
        this$0.vals = keys;
        setField(expected, "org.jsoup.nodes.Attributes$1", "this$0", this$0);
        
        int expectedI = ((Integer) getFieldValue(expected, "org.jsoup.nodes.Attributes$1", "i"));
        int actualI = ((Integer) getFieldValue(actual, "org.jsoup.nodes.Attributes$1", "i"));
        assertEquals(expectedI, actualI);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddAll_Return() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        attributes.addAll(attributes);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 *  */
    @Test
    public void testAddAll() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483632);
        java.lang.String[] keys = new java.lang.String[34];
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", -2147483632);
        
        attributes.addAll(attributes1);
        
        String finalAttributesKeys0 = attributes.keys[0];
        String finalAttributesKeys1 = attributes.keys[1];
        String finalAttributesKeys2 = attributes.keys[2];
        String finalAttributesKeys3 = attributes.keys[3];
        String finalAttributesKeys4 = attributes.keys[4];
        String finalAttributesKeys5 = attributes.keys[5];
        String finalAttributesKeys6 = attributes.keys[6];
        String finalAttributesKeys7 = attributes.keys[7];
        String finalAttributesKeys8 = attributes.keys[8];
        String finalAttributesKeys9 = attributes.keys[9];
        String finalAttributesKeys10 = attributes.keys[10];
        String finalAttributesKeys11 = attributes.keys[11];
        String finalAttributesKeys12 = attributes.keys[12];
        String finalAttributesKeys13 = attributes.keys[13];
        String finalAttributesKeys14 = attributes.keys[14];
        String finalAttributesKeys15 = attributes.keys[15];
        String finalAttributesKeys16 = attributes.keys[16];
        String finalAttributesKeys17 = attributes.keys[17];
        String finalAttributesKeys18 = attributes.keys[18];
        String finalAttributesKeys19 = attributes.keys[19];
        String finalAttributesKeys20 = attributes.keys[20];
        String finalAttributesKeys21 = attributes.keys[21];
        String finalAttributesKeys22 = attributes.keys[22];
        String finalAttributesKeys23 = attributes.keys[23];
        String finalAttributesKeys24 = attributes.keys[24];
        String finalAttributesKeys25 = attributes.keys[25];
        String finalAttributesKeys26 = attributes.keys[26];
        String finalAttributesKeys27 = attributes.keys[27];
        String finalAttributesKeys28 = attributes.keys[28];
        String finalAttributesKeys29 = attributes.keys[29];
        String finalAttributesKeys30 = attributes.keys[30];
        String finalAttributesKeys31 = attributes.keys[31];
        String finalAttributesKeys32 = attributes.keys[32];
        String finalAttributesKeys33 = attributes.keys[33];
        
        assertNull(finalAttributesKeys0);
        
        assertNull(finalAttributesKeys1);
        
        assertNull(finalAttributesKeys2);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
        
        assertNull(finalAttributesKeys9);
        
        assertNull(finalAttributesKeys10);
        
        assertNull(finalAttributesKeys11);
        
        assertNull(finalAttributesKeys12);
        
        assertNull(finalAttributesKeys13);
        
        assertNull(finalAttributesKeys14);
        
        assertNull(finalAttributesKeys15);
        
        assertNull(finalAttributesKeys16);
        
        assertNull(finalAttributesKeys17);
        
        assertNull(finalAttributesKeys18);
        
        assertNull(finalAttributesKeys19);
        
        assertNull(finalAttributesKeys20);
        
        assertNull(finalAttributesKeys21);
        
        assertNull(finalAttributesKeys22);
        
        assertNull(finalAttributesKeys23);
        
        assertNull(finalAttributesKeys24);
        
        assertNull(finalAttributesKeys25);
        
        assertNull(finalAttributesKeys26);
        
        assertNull(finalAttributesKeys27);
        
        assertNull(finalAttributesKeys28);
        
        assertNull(finalAttributesKeys29);
        
        assertNull(finalAttributesKeys30);
        
        assertNull(finalAttributesKeys31);
        
        assertNull(finalAttributesKeys32);
        
        assertNull(finalAttributesKeys33);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 *  */
    @Test
    public void testAddAll_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -2147483647);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = {null, null};
        attributes.vals = vals;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", -2147483646);
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        attributes.addAll(attributes1);
        
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 *  */
    @Test
    public void testAddAll_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "!";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys1 = new java.lang.String[1];
        keys1[0] = string;
        attributes1.keys = keys1;
        java.lang.String[] vals1 = new java.lang.String[1];
        vals1[0] = string;
        attributes1.vals = vals1;
        
        attributes.addAll(attributes1);
        
        String finalAttributesKeys1 = attributes.keys[1];
        
        assertNull(finalAttributesKeys1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 *  */
    @Test
    public void testAddAll_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys1 = new java.lang.String[1];
        String string = "!";
        keys1[0] = string;
        attributes1.keys = keys1;
        attributes1.vals = vals;
        
        attributes.addAll(attributes1);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(1, finalAttributesSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(Attribute attr: incoming)
 *  */
    @Test
    public void testAddAll_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -129);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 130);
        java.lang.String[] keys1 = {};
        attributes1.keys = keys1;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes$1.next(Attributes.java:267)
            org.jsoup.nodes.Attributes$1.next(Attributes.java:257)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:249) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddAll_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys1 = new java.lang.String[1];
        String string = "!";
        keys1[0] = string;
        attributes1.keys = keys1;
        attributes1.vals = keys1;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:120)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:251) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(Attribute attr: incoming)
 *  */
    @Test
    public void testAddAll_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -45);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 46);
        attributes1.keys = keys;
        java.lang.String[] vals = {};
        attributes1.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes$1.next(Attributes.java:267)
            org.jsoup.nodes.Attributes$1.next(Attributes.java:257)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:249) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: put(attr);
 *  */
    @Test
    public void testAddAll_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "!";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys1 = new java.lang.String[1];
        keys1[0] = string;
        attributes1.keys = keys1;
        attributes1.vals = keys1;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.put(Attributes.java:134)
            org.jsoup.nodes.Attributes.put(Attributes.java:172)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:251) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAddAll_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys1 = new java.lang.String[1];
        String string = "!";
        keys1[0] = string;
        attributes1.keys = keys1;
        attributes1.vals = keys1;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:251) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: incoming.size() == 0
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() {
        Attributes attributes = new Attributes();
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.addAll(Attributes.java:245) */
        attributes.addAll(null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkCapacity(size + incoming.size);
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -255);
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 160);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:247) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkCapacity(size + incoming.size);
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -167);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 172);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:247) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkCapacity(size + incoming.size);
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 20);
        java.lang.String[] keys = new java.lang.String[33];
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 14);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:247) */
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys1 = new java.lang.String[1];
        String string = "!";
        keys1[0] = string;
        attributes1.keys = keys1;
        java.lang.String[] vals = {null};
        attributes1.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.put(Attributes.java:136)
            org.jsoup.nodes.Attributes.put(Attributes.java:172)
            org.jsoup.nodes.Attributes.addAll(Attributes.java:251) */
        attributes.addAll(attributes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addAll(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: checkCapacity(size + incoming.size);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAll_ThrowIllegalArgumentException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -255);
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", -1);
        
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAll_ThrowIllegalArgumentException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -129);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 130);
        attributes1.keys = keys;
        attributes1.vals = keys;
        
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddAll_ThrowIllegalArgumentException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -256);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes1, "org.jsoup.nodes.Attributes", "size", 256);
        java.lang.String[] keys1 = new java.lang.String[1];
        String string = "";
        keys1[0] = string;
        attributes1.keys = keys1;
        java.lang.String[] vals = {null};
        attributes1.vals = vals;
        
        attributes.addAll(attributes1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.asList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.invokes {@link java.util.Collections#unmodifiableList(java.util.List)}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(list);}
 *  */
    @Test
    public void testAsList_CollectionsUnmodifiableList() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        List actual = attributes.asList();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method asList()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: ArrayList<Attribute> list = new ArrayList<>(size);
 *  */
    @Test
    public void testAsList_ThrowIllegalArgumentException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.IllegalArgumentException: Illegal Capacity: -1]
            java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            org.jsoup.nodes.Attributes.asList(Attributes.java:284) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[i] == null
 *  */
    @Test
    public void testAsList_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.asList(Attributes.java:286) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[i] == null
 *  */
    @Test
    public void testAsList_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "!";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.asList(Attributes.java:286) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: new Attribute(keys[i], vals[i], Attributes.this)
 *  */
    @Test
    public void testAsList_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[1];
        String string = "";
        vals[0] = string;
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.asList(Attributes.java:288) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: new BooleanAttribute(keys[i])
 *  */
    @Test
    public void testAsList_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.asList(Attributes.java:287) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: new Attribute(keys[i], vals[i], Attributes.this)
 *  */
    @Test
    public void testAsList_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "!";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[2];
        vals[1] = string;
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.asList(Attributes.java:288) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals[i] == null
 *  */
    @Test
    public void testAsList_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.asList(Attributes.java:286) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new Attribute(keys[i], vals[i], Attributes.this)
 *  */
    @Test
    public void testAsList_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] vals = new java.lang.String[1];
        String string = "";
        vals[0] = string;
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.asList(Attributes.java:288) */
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new BooleanAttribute(keys[i])
 *  */
    @Test
    public void testAsList_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.asList] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.asList(Attributes.java:287) */
        attributes.asList();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsList_ThrowIllegalArgumentException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: new Attribute(keys[i], vals[i], Attributes.this)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsList_ThrowIllegalArgumentException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        
        attributes.asList();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: new Attribute(keys[i], vals[i], Attributes.this)
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAsList_ThrowIllegalArgumentException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[1];
        String string = "";
        vals[0] = string;
        attributes.vals = vals;
        
        attributes.asList();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.normalize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalize()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#normalize()}
 *  */
    @Test
    public void testNormalize() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        attributes.normalize();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#normalize()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testNormalize_NormalizerLowerCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        attributes.normalize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalize()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#normalize()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: keys[i] = lowerCase(keys[i]);
 *  */
    @Test
    public void testNormalize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.normalize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.normalize(Attributes.java:388) */
        attributes.normalize();
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#normalize()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: keys[i] = lowerCase(keys[i]);
 *  */
    @Test
    public void testNormalize_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.normalize] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.normalize(Attributes.java:388) */
        attributes.normalize();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalize()
    
    @Test
    public void testNormalize1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        attributes.normalize();
        
        String finalAttributesKeys1 = attributes.keys[1];
        String finalAttributesKeys2 = attributes.keys[2];
        String finalAttributesKeys3 = attributes.keys[3];
        String finalAttributesKeys4 = attributes.keys[4];
        String finalAttributesKeys5 = attributes.keys[5];
        String finalAttributesKeys6 = attributes.keys[6];
        String finalAttributesKeys7 = attributes.keys[7];
        String finalAttributesKeys8 = attributes.keys[8];
        
        assertNull(finalAttributesKeys1);
        
        assertNull(finalAttributesKeys2);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.hasKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOfKey(key) != NotFound;}
 *  */
    @Test
    public void testHasKey_ReturnIndexOfKeyEqualsNotFound() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        boolean actual = attributes.hasKey(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOfKey(key) != NotFound;}
 *  */
    @Test
    public void testHasKey_ReturnIndexOfKeyEqualsNotFound_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        boolean actual = attributes.hasKey(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOfKey(key) != NotFound;}
 *  */
    @Test
    public void testHasKey_ReturnIndexOfKeyEqualsNotFound_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        boolean actual = attributes.hasKey(string);
        
        assertFalse(actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return indexOfKey(key) != NotFound;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasKey_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.hasKey(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOfKey(key) != NotFound;
 *  */
    @Test
    public void testHasKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.hasKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.hasKey(Attributes.java:216) */
        attributes.hasKey(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.putIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method putIgnoreCase(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testPutIgnoreCase_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        String string1 = "";
        
        attributes.putIgnoreCase(string1, string1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testPutIgnoreCase_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "K";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        String string1 = "";
        
        attributes.putIgnoreCase(string, string1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testPutIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        String string = "";
        
        attributes.putIgnoreCase(string, null);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        String finalAttributesVals0 = attributes.vals[0];
        
        assertEquals(1, finalAttributesSize);
        
        assertNull(finalAttributesVals0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testPutIgnoreCase_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[33];
        attributes.vals = vals;
        String string = "";
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        attributes.putIgnoreCase(string, null);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
        
        assertEquals(1, finalAttributesSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method putIgnoreCase(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPutIgnoreCase_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.putIgnoreCase(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method putIgnoreCase(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:141) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: add(key, value);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:120)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:141) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: add(key, value);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: vals[i] = value;
 *  */
    @Test
    public void testPutIgnoreCase_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:143) */
        attributes.putIgnoreCase(string1, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !keys[i].equals(key)
 *  */
    @Test
    public void testPutIgnoreCase_ThrowNullPointerException_5() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:144) */
        attributes.putIgnoreCase(string1, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:141) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(key, value);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: add(key, value);
 *  */
    @Test
    public void testPutIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.add(Attributes.java:121)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPutIgnoreCase_ThrowNullPointerException_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59)
            org.jsoup.nodes.Attributes.add(Attributes.java:119)
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:148) */
        attributes.putIgnoreCase(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#putIgnoreCase(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals[i] = value;
 *  */
    @Test
    public void testPutIgnoreCase_ThrowNullPointerException_4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.putIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.putIgnoreCase(Attributes.java:143) */
        attributes.putIgnoreCase(string1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.removeIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 *  */
    @Test
    public void testRemoveIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 *  */
    @Test
    public void testRemoveIgnoreCase_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        attributes.removeIgnoreCase(string);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#remove(int)
 *  */
    @Test
    public void testRemoveIgnoreCase_AttributesRemove() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        attributes.vals = keys;
        
        attributes.removeIgnoreCase(string);
        
        int finalAttributesSize = ((Integer) getFieldValue(attributes, "org.jsoup.nodes.Attributes", "size"));
        
        assertEquals(0, finalAttributesSize);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.removeIgnoreCase(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:205) */
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(i);
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for object array[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:182)
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:207) */
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: remove(i);
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:207) */
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:205) */
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: remove(i);
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.remove(Attributes.java:187)
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:207) */
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: remove(i);
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[2];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.jsoup.nodes.Attributes.remove(Attributes.java:183)
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:207) */
        attributes.removeIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.hasKeyIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOfKeyIgnoreCase(key) != NotFound;}
 *  */
    @Test
    public void testHasKeyIgnoreCase_ReturnIndexOfKeyIgnoreCaseEqualsNotFound() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        boolean actual = attributes.hasKeyIgnoreCase(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOfKeyIgnoreCase(key) != NotFound;}
 *  */
    @Test
    public void testHasKeyIgnoreCase_ReturnIndexOfKeyIgnoreCaseEqualsNotFound_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        boolean actual = attributes.hasKeyIgnoreCase(string);
        
        assertFalse(actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return indexOfKeyIgnoreCase(key) != NotFound;}
 *  */
    @Test
    public void testHasKeyIgnoreCase_ReturnIndexOfKeyIgnoreCaseEqualsNotFound_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        boolean actual = attributes.hasKeyIgnoreCase(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return indexOfKeyIgnoreCase(key) != NotFound;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasKeyIgnoreCase_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.hasKeyIgnoreCase(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return indexOfKeyIgnoreCase(key) != NotFound;
 *  */
    @Test
    public void testHasKeyIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.hasKeyIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:225) */
        attributes.hasKeyIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return indexOfKeyIgnoreCase(key) != NotFound;
 *  */
    @Test
    public void testHasKeyIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.hasKeyIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:225) */
        attributes.hasKeyIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.getIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGetIgnoreCase_ReturnINotEqualsNotFound() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        String actual = attributes.getIgnoreCase(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGetIgnoreCase_ReturnINotEqualsNotFound_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        String actual = attributes.getIgnoreCase(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGetIgnoreCase_ReturnINotEqualsNotFound_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        
        String actual = attributes.getIgnoreCase(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributesVals0 = attributes.vals[0];
        
        assertNull(finalAttributesVals0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return i == NotFound ? EmptyString : checkNotNull(vals[i]);}
 *  */
    @Test
    public void testGetIgnoreCase_ReturnINotEqualsNotFound_3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[1];
        String string1 = "";
        vals[0] = string1;
        attributes.vals = vals;
        
        String actual = attributes.getIgnoreCase(string);
        
        assertEquals(string1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testGetIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.getIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110) */
        attributes.getIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkNotNull(vals[i])
 *  */
    @Test
    public void testGetIgnoreCase_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.getIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:111) */
        attributes.getIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test
    public void testGetIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.getIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82)
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:110) */
        attributes.getIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNotNull(vals[i])
 *  */
    @Test
    public void testGetIgnoreCase_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "@";
        keys[0] = string;
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.getIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:111) */
        attributes.getIgnoreCase(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.invokes org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: int i = indexOfKeyIgnoreCase(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.getIgnoreCase(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.checkCapacity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkCapacity(int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
 * @utbot.executesCondition {@code (curSize >= minNewSize): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckCapacity_CurSizeGreaterOrEqualMinNewSize() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = 1;
        checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
 * @utbot.executesCondition {@code (curSize >= minNewSize): False}
 * @utbot.executesCondition {@code (curSize >= InitialCapacity): False}
 * @utbot.executesCondition {@code (minNewSize > newSize): True}
 * @utbot.invokes org.jsoup.nodes.Attributes#copyOf(java.lang.String[],int)
 * @utbot.invokes org.jsoup.nodes.Attributes#copyOf(java.lang.String[],int)
 *  */
    @Test
    public void testCheckCapacity_MinNewSizeGreaterThanNewSize() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 5);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        java.lang.String[] initialAttributesKeys = attributes.keys;
        java.lang.String[] initialAttributesVals = attributes.vals;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = 5;
        checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        
        java.lang.String[] finalAttributesKeys = attributes.keys;
        java.lang.String[] finalAttributesVals = attributes.vals;
        
        assertFalse(initialAttributesKeys == finalAttributesKeys);
        
        assertFalse(initialAttributesVals == finalAttributesVals);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkCapacity(int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int curSize = keys.length;
 *  */
    @Test
    public void testCheckCapacity_ThrowNullPointerException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -255);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.checkCapacity] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:50) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = -255;
        try {
            checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
 * @utbot.executesCondition {@code (curSize >= minNewSize): False}
 * @utbot.executesCondition {@code (curSize >= InitialCapacity): False}
 * @utbot.executesCondition {@code (minNewSize > newSize): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals = copyOf(vals, newSize);
 *  */
    @Test
    public void testCheckCapacity_ThrowNullPointerException_1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.checkCapacity] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = 3;
        try {
            checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
 * @utbot.executesCondition {@code (curSize >= minNewSize): False}
 * @utbot.executesCondition {@code (curSize >= InitialCapacity): True}
 * @utbot.executesCondition {@code (minNewSize > newSize): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: vals = copyOf(vals, newSize);
 *  */
    @Test
    public void testCheckCapacity_ThrowNullPointerException_2() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", -239);
        java.lang.String[] keys = new java.lang.String[34];
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.checkCapacity] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.copyOf(Attributes.java:65)
            org.jsoup.nodes.Attributes.checkCapacity(Attributes.java:59) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = 35;
        try {
            checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkCapacity(int)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
 * @utbot.executesCondition {@code (Validate.isTrue(minNewSize >= size);): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isTrue(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(minNewSize >= size);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCheckCapacity_ThrowIllegalArgumentException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 256);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = 255;
        try {
            checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method checkCapacity(int)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#checkCapacity(int)}
     */
    @Test(expected = OutOfMemoryError.class)
    public void testCheckCapacityThrowsOOMEWithCornerCase() throws Throwable  {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"-3", "-3", "-3"};
        attributes.vals = vals;
        java.lang.String[] keys = {"10", "", "", "XZ", "-3"};
        attributes.keys = keys;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class intType = int.class;
        Method checkCapacityMethod = attributesClazz.getDeclaredMethod("checkCapacity", intType);
        checkCapacityMethod.setAccessible(true);
        java.lang.Object[] checkCapacityMethodArguments = new java.lang.Object[1];
        checkCapacityMethodArguments[0] = Integer.MAX_VALUE;
        try {
            checkCapacityMethod.invoke(attributes, checkCapacityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.dataKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#dataKey(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return dataPrefix + key;}
 *  */
    @Test
    public void testDataKey_StringBuilderToString() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method dataKeyMethod = attributesClazz.getDeclaredMethod("dataKey", stringType);
        dataKeyMethod.setAccessible(true);
        java.lang.Object[] dataKeyMethodArguments = new java.lang.Object[1];
        dataKeyMethodArguments[0] = ((Object) null);
        String actual = ((String) dataKeyMethod.invoke(null, dataKeyMethodArguments));
        
        String expected = "data-null";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.html
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method html()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html()}
     */
    @Test
    public void testHtml() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"", "", ""};
        attributes.vals = vals;
        java.lang.String[] keys = {"abc", "", "", "#$\\\"'", "\n\t\r"};
        attributes.keys = keys;
        
        String actual = attributes.html();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method html()
    
    @Test
    public void testHtml1() throws Exception  {
        Class stringUtilClazz = Class.forName("org.jsoup.internal.StringUtil");
        Stack prevBuilders = ((Stack) getStaticFieldValue(stringUtilClazz, "builders"));
        ParseSettings prevHtmlDefault = ParseSettings.htmlDefault;
        try {
            Stack builders = ((Stack) createInstance("java.util.Stack"));
            java.lang.Object[] elementData = {null, null, null, null, null, null, null, null, null, null};
            setField(builders, "java.util.Vector", "elementData", elementData);
            setStaticField(stringUtilClazz, "builders", builders);
            ParseSettings htmlDefault = new ParseSettings(false, false);
            Class parseSettingsClazz = Class.forName("org.jsoup.parser.ParseSettings");
            setStaticField(parseSettingsClazz, "htmlDefault", htmlDefault);
            Attributes attributes = new Attributes();
            
            String actual = attributes.html();
            
            String expected = "";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testHtml2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        attributes.html(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testHtml_AttributeShouldCollapseAttribute() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        attributes.html(printStream, outputSettings);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 *  */
    @Test
    public void testHtml_AttributeShouldCollapseAttribute_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = outputSettings;
        htmlMethod.invoke(attributes, htmlMethodArguments);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final String key = keys[i];
 *  */
    @Test
    public void testHtml_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.html(Attributes.java:322) */
        attributes.html(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final String val = vals[i];
 *  */
    @Test
    public void testHtml_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {};
        attributes.vals = vals;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.html(Attributes.java:323) */
        attributes.html(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(' ').append(key);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.html(Attributes.java:324) */
        attributes.html(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String key = keys[i];
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.html(Attributes.java:322) */
        attributes.html(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String val = vals[i];
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.html(Attributes.java:323) */
        attributes.html(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: accum.append(' ').append(key);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: accum.append(' ').append(key);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException_1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = anonymousPrintWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_1() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(bb, "java.nio.Buffer", "limit", 4);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: accum.append(' ').append(key);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHtml_ThrowIllegalStateException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = anonymousPrintWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: accum.append(' ').append(key);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException_2() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        byte[] replacement = {};
        setField(encoder, "java.nio.charset.CharsetEncoder", "replacement", replacement);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = anonymousPrintWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_2() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "sun.nio.cs.UTF_32Coder$Encoder", "byteOrder", 1);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483646);
        setField(bb, "java.nio.Buffer", "limit", -2147483646);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", keys);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_3() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        setField(bb, "java.nio.Buffer", "position", 2147483646);
        setField(bb, "java.nio.Buffer", "limit", -2147483646);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_4() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", -771751935);
        setField(bb, "java.nio.Buffer", "position", -1138996698);
        setField(bb, "java.nio.Buffer", "limit", 268439552);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        StringBuilder lock = new StringBuilder("");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_5() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2bIndex = {};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_6() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null};
        attributes.keys = keys;
        java.lang.String[] vals = {null, null};
        attributes.vals = vals;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.UTF_32Coder$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBuffer");
        byte[] hb = {(byte) 0, (byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", -1874362365);
        setField(bb, "java.nio.Buffer", "position", -1692893186);
        setField(bb, "java.nio.Buffer", "limit", 286277632);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = anonymousPrintWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_7() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = new char[33];
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        char[] c2bIndex = {'\u0000'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", 1073741824);
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_8() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = {'\uFFE0'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2b);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(anonymousPrintWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = anonymousPrintWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < sz; i++)} once
 * @utbot.throwsException {@link java.nio.charset.CoderMalfunctionError} in: accum.append(' ').append(key);
 *  */
    @Test(expected = CoderMalfunctionError.class)
    public void testHtml_ThrowCoderMalfunctionError_9() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        java.lang.String[] vals = {null};
        attributes.vals = vals;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        OutputStreamWriter out = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        SingleByte.Encoder encoder = ((SingleByte.Encoder) createInstance("sun.nio.cs.SingleByte$Encoder"));
        char[] c2b = new char[33];
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2b", c2b);
        char[] c2bIndex = {'\u0000'};
        setField(encoder, "sun.nio.cs.SingleByte$Encoder", "c2bIndex", c2bIndex);
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object bb = createInstance("java.nio.HeapByteBufferR");
        byte[] hb = {(byte) 0};
        setField(bb, "java.nio.ByteBuffer", "hb", hb);
        setField(bb, "java.nio.ByteBuffer", "offset", -2147483647);
        setField(bb, "java.nio.Buffer", "limit", 1);
        setField(se, "sun.nio.cs.StreamEncoder", "bb", bb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testHtml3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = new java.lang.String[10];
        String string = "";
        keys[1] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[13];
        attributes.vals = vals;
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        attributes.html(printStream, outputSettings);
        
        String finalAttributesKeys0 = attributes.keys[0];
        String finalAttributesKeys2 = attributes.keys[2];
        String finalAttributesKeys3 = attributes.keys[3];
        String finalAttributesKeys4 = attributes.keys[4];
        String finalAttributesKeys5 = attributes.keys[5];
        String finalAttributesKeys6 = attributes.keys[6];
        String finalAttributesKeys7 = attributes.keys[7];
        String finalAttributesKeys8 = attributes.keys[8];
        String finalAttributesKeys9 = attributes.keys[9];
        String finalAttributesVals0 = attributes.vals[0];
        String finalAttributesVals1 = attributes.vals[1];
        String finalAttributesVals2 = attributes.vals[2];
        String finalAttributesVals3 = attributes.vals[3];
        String finalAttributesVals4 = attributes.vals[4];
        String finalAttributesVals5 = attributes.vals[5];
        String finalAttributesVals6 = attributes.vals[6];
        String finalAttributesVals7 = attributes.vals[7];
        String finalAttributesVals8 = attributes.vals[8];
        String finalAttributesVals9 = attributes.vals[9];
        String finalAttributesVals10 = attributes.vals[10];
        String finalAttributesVals11 = attributes.vals[11];
        String finalAttributesVals12 = attributes.vals[12];
        
        assertNull(finalAttributesKeys0);
        
        assertNull(finalAttributesKeys2);
        
        assertNull(finalAttributesKeys3);
        
        assertNull(finalAttributesKeys4);
        
        assertNull(finalAttributesKeys5);
        
        assertNull(finalAttributesKeys6);
        
        assertNull(finalAttributesKeys7);
        
        assertNull(finalAttributesKeys8);
        
        assertNull(finalAttributesKeys9);
        
        assertNull(finalAttributesVals0);
        
        assertNull(finalAttributesVals1);
        
        assertNull(finalAttributesVals2);
        
        assertNull(finalAttributesVals3);
        
        assertNull(finalAttributesVals4);
        
        assertNull(finalAttributesVals5);
        
        assertNull(finalAttributesVals6);
        
        assertNull(finalAttributesVals7);
        
        assertNull(finalAttributesVals8);
        
        assertNull(finalAttributesVals9);
        
        assertNull(finalAttributesVals10);
        
        assertNull(finalAttributesVals11);
        
        assertNull(finalAttributesVals12);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testHtml4() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[9];
        String string1 = "\u0000";
        vals[0] = string1;
        attributes.vals = vals;
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document$OutputSettings.encoder(Document.java:453)
            org.jsoup.nodes.Entities.escape(Entities.java:179)
            org.jsoup.nodes.Attributes.html(Attributes.java:329) */
        attributes.html(printStream, outputSettings);
    }
    
    @Test
    public void testHtml5() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[9];
        vals[0] = string;
        attributes.vals = vals;
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document$OutputSettings.encoder(Document.java:453)
            org.jsoup.nodes.Entities.escape(Entities.java:179)
            org.jsoup.nodes.Attributes.html(Attributes.java:329) */
        attributes.html(printStream, outputSettings);
    }
    
    @Test
    public void testHtml6() throws Exception  {
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        java.lang.String[] prevBooleanAttributes = ((java.lang.String[]) getStaticFieldValue(attributeClazz, "booleanAttributes"));
        try {
            java.lang.String[] booleanAttributes = new java.lang.String[30];
            String string = "allowfullscreen";
            booleanAttributes[0] = string;
            String string1 = "async";
            booleanAttributes[1] = string1;
            String string2 = "autofocus";
            booleanAttributes[2] = string2;
            String string3 = "checked";
            booleanAttributes[3] = string3;
            String string4 = "compact";
            booleanAttributes[4] = string4;
            String string5 = "declare";
            booleanAttributes[5] = string5;
            String string6 = "default";
            booleanAttributes[6] = string6;
            String string7 = "defer";
            booleanAttributes[7] = string7;
            String string8 = "disabled";
            booleanAttributes[8] = string8;
            String string9 = "formnovalidate";
            booleanAttributes[9] = string9;
            String string10 = "hidden";
            booleanAttributes[10] = string10;
            String string11 = "inert";
            booleanAttributes[11] = string11;
            String string12 = "ismap";
            booleanAttributes[12] = string12;
            String string13 = "itemscope";
            booleanAttributes[13] = string13;
            String string14 = "multiple";
            booleanAttributes[14] = string14;
            String string15 = "muted";
            booleanAttributes[15] = string15;
            String string16 = "nohref";
            booleanAttributes[16] = string16;
            String string17 = "noresize";
            booleanAttributes[17] = string17;
            String string18 = "noshade";
            booleanAttributes[18] = string18;
            String string19 = "novalidate";
            booleanAttributes[19] = string19;
            String string20 = "nowrap";
            booleanAttributes[20] = string20;
            String string21 = "open";
            booleanAttributes[21] = string21;
            String string22 = "readonly";
            booleanAttributes[22] = string22;
            String string23 = "required";
            booleanAttributes[23] = string23;
            String string24 = "reversed";
            booleanAttributes[24] = string24;
            String string25 = "seamless";
            booleanAttributes[25] = string25;
            String string26 = "selected";
            booleanAttributes[26] = string26;
            String string27 = "sortable";
            booleanAttributes[27] = string27;
            String string28 = "truespeed";
            booleanAttributes[28] = string28;
            String string29 = "typemustmatch";
            booleanAttributes[29] = string29;
            setStaticField(attributeClazz, "booleanAttributes", booleanAttributes);
            Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
            setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
            java.lang.String[] keys = new java.lang.String[9];
            String string30 = "\u0000";
            keys[0] = string30;
            attributes.keys = keys;
            java.lang.String[] vals = new java.lang.String[9];
            String string31 = "";
            vals[0] = string31;
            attributes.vals = vals;
            PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
            
            /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
                org.jsoup.nodes.Document$OutputSettings.encoder(Document.java:453)
                org.jsoup.nodes.Entities.escape(Entities.java:179)
                org.jsoup.nodes.Attributes.html(Attributes.java:329) */
            attributes.html(printStream, outputSettings);
        } finally {
            setStaticField(Attribute.class, "booleanAttributes", prevBooleanAttributes);
        }
    }
    
    @Test
    public void testHtml7() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = {null, null, null, null, null, null, null, null, null, null};
        attributes.vals = vals;
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document$OutputSettings.encoder(Document.java:453)
            org.jsoup.nodes.Entities.escape(Entities.java:179)
            org.jsoup.nodes.Attributes.html(Attributes.java:329) */
        attributes.html(printStream, outputSettings);
    }
    
    @Test
    public void testHtml8() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null, null, null, null, null, null, null, null, null};
        attributes.keys = keys;
        attributes.vals = keys;
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.PrintWriter"));
        setField(out, "java.io.PrintWriter", "out", out);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:478)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1148)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Attributes.html(Attributes.java:324) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = anonymousPrintWriter;
        htmlMethodArguments[1] = outputSettings;
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHtml9() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        java.lang.String[] vals = new java.lang.String[9];
        vals[0] = string;
        attributes.vals = vals;
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        PrintWriter out = ((PrintWriter) createInstance("java.io.Console$3"));
        Object lock = createInstance("java.lang.Object");
        setField(out, "java.io.Writer", "lock", lock);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Object lock1 = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock1);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document$OutputSettings.encoder(Document.java:453)
            org.jsoup.nodes.Entities.escape(Entities.java:179)
            org.jsoup.nodes.Attributes.html(Attributes.java:329) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributesClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = outputSettings;
        try {
            htmlMethod.invoke(attributes, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for html
    
    public void testHtml_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 20 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 16 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 7 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 4 occurrences of:
        /* Unable to make field private static final jdk.internal.access.JavaLangAccess sun.nio.cs.SingleByte.JLA accessible:
        module java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.dataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataset()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#dataset()}
 * @utbot.returnsFrom {@code return new Dataset(this);}
 *  */
    @Test
    public void testDataset_Return() {
        Attributes attributes = new Attributes();
        
        Map actual = attributes.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method indexOfKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return NotFound;}
 *  */
    @Test
    public void testIndexOfKeyIgnoreCase_ReturnNotFound() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "";
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method indexOfKeyIgnoreCaseMethod = attributesClazz.getDeclaredMethod("indexOfKeyIgnoreCase", stringType);
        indexOfKeyIgnoreCaseMethod.setAccessible(true);
        java.lang.Object[] indexOfKeyIgnoreCaseMethodArguments = new java.lang.Object[1];
        indexOfKeyIgnoreCaseMethodArguments[0] = string;
        int actual = ((Integer) indexOfKeyIgnoreCaseMethod.invoke(attributes, indexOfKeyIgnoreCaseMethodArguments));
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.returnsFrom {@code return NotFound;}
 *  */
    @Test
    public void testIndexOfKeyIgnoreCase_NotKeyEqualsIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        attributes.keys = keys;
        String string = " ";
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method indexOfKeyIgnoreCaseMethod = attributesClazz.getDeclaredMethod("indexOfKeyIgnoreCase", stringType);
        indexOfKeyIgnoreCaseMethod.setAccessible(true);
        java.lang.Object[] indexOfKeyIgnoreCaseMethodArguments = new java.lang.Object[1];
        indexOfKeyIgnoreCaseMethodArguments[0] = string;
        int actual = ((Integer) indexOfKeyIgnoreCaseMethod.invoke(attributes, indexOfKeyIgnoreCaseMethodArguments));
        
        assertEquals(-1, actual);
        
        String finalAttributesKeys0 = attributes.keys[0];
        
        assertNull(finalAttributesKeys0);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 *  */
    @Test
    public void testIndexOfKeyIgnoreCase_KeyEqualsIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        String string = "";
        keys[0] = string;
        attributes.keys = keys;
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method indexOfKeyIgnoreCaseMethod = attributesClazz.getDeclaredMethod("indexOfKeyIgnoreCase", stringType);
        indexOfKeyIgnoreCaseMethod.setAccessible(true);
        java.lang.Object[] indexOfKeyIgnoreCaseMethodArguments = new java.lang.Object[1];
        indexOfKeyIgnoreCaseMethodArguments[0] = string;
        int actual = ((Integer) indexOfKeyIgnoreCaseMethod.invoke(attributes, indexOfKeyIgnoreCaseMethodArguments));
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method indexOfKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIndexOfKeyIgnoreCase_ThrowIllegalArgumentException() throws Throwable  {
        Attributes attributes = new Attributes();
        
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method indexOfKeyIgnoreCaseMethod = attributesClazz.getDeclaredMethod("indexOfKeyIgnoreCase", stringType);
        indexOfKeyIgnoreCaseMethod.setAccessible(true);
        java.lang.Object[] indexOfKeyIgnoreCaseMethodArguments = new java.lang.Object[1];
        indexOfKeyIgnoreCaseMethodArguments[0] = ((Object) null);
        try {
            indexOfKeyIgnoreCaseMethod.invoke(attributes, indexOfKeyIgnoreCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method indexOfKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: key.equalsIgnoreCase(keys[i])
 *  */
    @Test
    public void testIndexOfKeyIgnoreCase_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        attributes.keys = keys;
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method indexOfKeyIgnoreCaseMethod = attributesClazz.getDeclaredMethod("indexOfKeyIgnoreCase", stringType);
        indexOfKeyIgnoreCaseMethod.setAccessible(true);
        java.lang.Object[] indexOfKeyIgnoreCaseMethodArguments = new java.lang.Object[1];
        indexOfKeyIgnoreCaseMethodArguments[0] = string;
        try {
            indexOfKeyIgnoreCaseMethod.invoke(attributes, indexOfKeyIgnoreCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#indexOfKeyIgnoreCase(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < size; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: key.equalsIgnoreCase(keys[i])
 *  */
    @Test
    public void testIndexOfKeyIgnoreCase_ThrowNullPointerException() throws Throwable  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes, "org.jsoup.nodes.Attributes", "size", 1);
        String string = "";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.indexOfKeyIgnoreCase(Attributes.java:82) */
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        Class stringType = Class.forName("java.lang.String");
        Method indexOfKeyIgnoreCaseMethod = attributesClazz.getDeclaredMethod("indexOfKeyIgnoreCase", stringType);
        indexOfKeyIgnoreCaseMethod.setAccessible(true);
        java.lang.Object[] indexOfKeyIgnoreCaseMethodArguments = new java.lang.Object[1];
        indexOfKeyIgnoreCaseMethodArguments[0] = string;
        try {
            indexOfKeyIgnoreCaseMethod.invoke(attributes, indexOfKeyIgnoreCaseMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1009708500190400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1009708500190400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1009708500196000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009708500190400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009708500196000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009708500520500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009708500520500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009708500522200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009708500520500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009708500522200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1009708503316700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009708503316700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009708503318700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009708503316700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009708503318700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009708503686100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009708503686100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009708503688000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009708503686100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009708503688000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

