package org.jsoup.nodes;

import org.junit.Test;
import java.util.Stack;
import org.jsoup.parser.ParseSettings;
import java.io.PrintStream;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import java.io.PrintWriter;
import java.io.FileWriter;
import sun.nio.cs.StreamEncoder;
import java.lang.reflect.Method;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.ReadOnlyBufferException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_jsoup_nodes_AttributeTest {
    ///region Test suites for executable org.jsoup.nodes.Attribute.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): False}
 * @utbot.executesCondition {@code (getClass() != o.getClass()): True}
 *  */
    @Test
    public void testEquals_GetClassNotEqualsOGetClass() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        int[] intArray = {};
        
        boolean actual = attribute.equals(intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_O() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        boolean actual = attribute.equals(attribute);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (o == null): True}
 *  */
    @Test
    public void testEquals_OEqualsNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        boolean actual = attribute.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.toString
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attribute}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#toString()}
     */
    @Test
    public void testToString() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"", "10", "", "", "XZ"};
        attributes.vals = vals;
        java.lang.String[] keys = {"10", "-3", "\n\t\r", "10"};
        attributes.keys = keys;
        Attribute attribute = new Attribute("abc", "#$\\\"'", attributes);
        Attributes parent = new Attributes();
        java.lang.String[] keys1 = {"\n\t\r", "abc", "XZ"};
        parent.keys = keys1;
        java.lang.String[] vals1 = {"\n\t\r"};
        parent.vals = vals1;
        attribute.parent = parent;
        attribute.setKey("-3");
        
        String actual = attribute.toString();
        
        String expected = "-3=\"#$\\&quot;'\"";
        
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
            Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
            
            String actual = attribute.toString();
            
            String expected = "null";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#hashCode()}
 * @utbot.executesCondition {@code (key != null): False}
 * @utbot.executesCondition {@code (val != null): False}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ValEqualsNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        int actual = attribute.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#hashCode()}
 * @utbot.executesCondition {@code (key != null): False}
 * @utbot.executesCondition {@code (val != null): True}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_ValNotEqualsNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String val = "";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        
        int actual = attribute.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#hashCode()}
 * @utbot.executesCondition {@code (key != null): True}
 * @utbot.executesCondition {@code (val != null): False}
 * @utbot.invokes {@link java.lang.String#hashCode()}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testHashCode_KeyNotEqualsNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        
        int actual = attribute.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attribute}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#hashCode()}
     */
    @Test
    public void testHashCode() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"", "10", "", "", "XZ"};
        attributes.vals = vals;
        java.lang.String[] keys = {"10", "-3", "\n\t\r", "10"};
        attributes.keys = keys;
        Attribute attribute = new Attribute("abc", "#$\\\"'", attributes);
        Attributes parent = new Attributes();
        java.lang.String[] keys1 = {"\n\t\r", "abc", "XZ"};
        parent.keys = keys1;
        java.lang.String[] vals1 = {"\n\t\r"};
        parent.vals = vals1;
        attribute.parent = parent;
        attribute.setKey("-3");
        
        int actual = attribute.hashCode();
        
        assertEquals(33530042, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#clone()}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_ObjectClone() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        Attribute actual = attribute.clone();
        
        Attribute expected = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        // org.jsoup.nodes.Attribute has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.getValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValue()
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#getValue()}
 * @utbot.returnsFrom {@code return Attributes.checkNotNull(val);}
 *  */
    @Test
    public void testGetValue_ReturnAttributesCheckNotNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String val = "";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        
        String actual = attribute.getValue();
        
        assertEquals(val, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#getValue()}
 * @utbot.returnsFrom {@code return Attributes.checkNotNull(val);}
 *  */
    @Test
    public void testGetValue_ReturnAttributesCheckNotNull_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        String actual = attribute.getValue();
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.getKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getKey()
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#getKey()}
 * @utbot.returnsFrom {@code return key;}
 *  */
    @Test
    public void testGetKey_ReturnKey() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        String actual = attribute.getKey();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.setValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setValue(java.lang.String)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#checkNotNull(java.lang.String)}
 * @utbot.returnsFrom {@code return Attributes.checkNotNull(oldVal);}
 *  */
    @Test
    public void testSetValue_ParentNotEqualsNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        attribute.parent = parent;
        
        String actual = attribute.setValue(((String) null));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String oldVal = parent.get(this.key);
 *  */
    @Test
    public void testSetValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        parent.keys = keys;
        attribute.parent = parent;
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.get(Attributes.java:100)
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String oldVal = parent.get(this.key);
 *  */
    @Test
    public void testSetValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = " ";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 2);
        java.lang.String[] keys = {null};
        parent.keys = keys;
        attribute.parent = parent;
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.get(Attributes.java:100)
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: String oldVal = parent.get(this.key);
 *  */
    @Test
    public void testSetValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = " ";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        keys[0] = key;
        parent.keys = keys;
        java.lang.String[] vals = {};
        parent.vals = vals;
        attribute.parent = parent;
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.get(Attributes.java:101)
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setValue(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String oldVal = parent.get(this.key);
 *  */
    @Test
    public void testSetValue_ThrowNullPointerException() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(((String) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setValue(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setValue(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: String oldVal = parent.get(this.key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetValue_ThrowIllegalArgumentException() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        attribute.parent = parent;
        
        attribute.setValue(((String) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setValue(java.lang.String)
    
    @Test
    public void testSetValue1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = new java.lang.String[11];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        String string1 = "";
        keys[2] = string1;
        parent.keys = keys;
        attribute.parent = parent;
        String string2 = "";
        
        String actual = attribute.setValue(string2);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributeParentKeys1 = attribute.parent.keys[1];
        String finalAttributeParentKeys3 = attribute.parent.keys[3];
        String finalAttributeParentKeys4 = attribute.parent.keys[4];
        String finalAttributeParentKeys5 = attribute.parent.keys[5];
        String finalAttributeParentKeys6 = attribute.parent.keys[6];
        String finalAttributeParentKeys7 = attribute.parent.keys[7];
        String finalAttributeParentKeys8 = attribute.parent.keys[8];
        String finalAttributeParentKeys9 = attribute.parent.keys[9];
        String finalAttributeParentKeys10 = attribute.parent.keys[10];
        
        assertNull(finalAttributeParentKeys1);
        
        assertNull(finalAttributeParentKeys3);
        
        assertNull(finalAttributeParentKeys4);
        
        assertNull(finalAttributeParentKeys5);
        
        assertNull(finalAttributeParentKeys6);
        
        assertNull(finalAttributeParentKeys7);
        
        assertNull(finalAttributeParentKeys8);
        
        assertNull(finalAttributeParentKeys9);
        
        assertNull(finalAttributeParentKeys10);
    }
    
    @Test
    public void testSetValue2() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        keys[1] = key;
        keys[2] = key;
        keys[3] = key;
        keys[4] = key;
        keys[5] = key;
        keys[6] = key;
        keys[7] = key;
        keys[8] = key;
        parent.keys = keys;
        attribute.parent = parent;
        String string1 = "";
        
        String actual = attribute.setValue(string1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSetValue3() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        parent.keys = keys;
        java.lang.String[] vals = {null, null, null, null, null, null, null, null, null};
        parent.vals = vals;
        attribute.parent = parent;
        String string1 = "";
        
        String actual = attribute.setValue(string1);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributeParentKeys1 = attribute.parent.keys[1];
        String finalAttributeParentKeys2 = attribute.parent.keys[2];
        String finalAttributeParentKeys3 = attribute.parent.keys[3];
        String finalAttributeParentKeys4 = attribute.parent.keys[4];
        String finalAttributeParentKeys5 = attribute.parent.keys[5];
        String finalAttributeParentKeys6 = attribute.parent.keys[6];
        String finalAttributeParentKeys7 = attribute.parent.keys[7];
        String finalAttributeParentKeys8 = attribute.parent.keys[8];
        String finalAttributeParentVals1 = attribute.parent.vals[1];
        String finalAttributeParentVals2 = attribute.parent.vals[2];
        String finalAttributeParentVals3 = attribute.parent.vals[3];
        String finalAttributeParentVals4 = attribute.parent.vals[4];
        String finalAttributeParentVals5 = attribute.parent.vals[5];
        String finalAttributeParentVals6 = attribute.parent.vals[6];
        String finalAttributeParentVals7 = attribute.parent.vals[7];
        String finalAttributeParentVals8 = attribute.parent.vals[8];
        
        assertNull(finalAttributeParentKeys1);
        
        assertNull(finalAttributeParentKeys2);
        
        assertNull(finalAttributeParentKeys3);
        
        assertNull(finalAttributeParentKeys4);
        
        assertNull(finalAttributeParentKeys5);
        
        assertNull(finalAttributeParentKeys6);
        
        assertNull(finalAttributeParentKeys7);
        
        assertNull(finalAttributeParentKeys8);
        
        assertNull(finalAttributeParentVals1);
        
        assertNull(finalAttributeParentVals2);
        
        assertNull(finalAttributeParentVals3);
        
        assertNull(finalAttributeParentVals4);
        
        assertNull(finalAttributeParentVals5);
        
        assertNull(finalAttributeParentVals6);
        
        assertNull(finalAttributeParentVals7);
        
        assertNull(finalAttributeParentVals8);
    }
    
    @Test
    public void testSetValue4() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = new java.lang.String[11];
        String string = "\u0000";
        keys[2] = string;
        parent.keys = keys;
        java.lang.String[] vals = new java.lang.String[11];
        parent.vals = vals;
        attribute.parent = parent;
        String string1 = "";
        
        String actual = attribute.setValue(string1);
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        String finalAttributeParentKeys0 = attribute.parent.keys[0];
        String finalAttributeParentKeys1 = attribute.parent.keys[1];
        String finalAttributeParentKeys3 = attribute.parent.keys[3];
        String finalAttributeParentKeys4 = attribute.parent.keys[4];
        String finalAttributeParentKeys5 = attribute.parent.keys[5];
        String finalAttributeParentKeys6 = attribute.parent.keys[6];
        String finalAttributeParentKeys7 = attribute.parent.keys[7];
        String finalAttributeParentKeys8 = attribute.parent.keys[8];
        String finalAttributeParentKeys9 = attribute.parent.keys[9];
        String finalAttributeParentKeys10 = attribute.parent.keys[10];
        String finalAttributeParentVals0 = attribute.parent.vals[0];
        String finalAttributeParentVals1 = attribute.parent.vals[1];
        String finalAttributeParentVals3 = attribute.parent.vals[3];
        String finalAttributeParentVals4 = attribute.parent.vals[4];
        String finalAttributeParentVals5 = attribute.parent.vals[5];
        String finalAttributeParentVals6 = attribute.parent.vals[6];
        String finalAttributeParentVals7 = attribute.parent.vals[7];
        String finalAttributeParentVals8 = attribute.parent.vals[8];
        String finalAttributeParentVals9 = attribute.parent.vals[9];
        String finalAttributeParentVals10 = attribute.parent.vals[10];
        
        assertNull(finalAttributeParentKeys0);
        
        assertNull(finalAttributeParentKeys1);
        
        assertNull(finalAttributeParentKeys3);
        
        assertNull(finalAttributeParentKeys4);
        
        assertNull(finalAttributeParentKeys5);
        
        assertNull(finalAttributeParentKeys6);
        
        assertNull(finalAttributeParentKeys7);
        
        assertNull(finalAttributeParentKeys8);
        
        assertNull(finalAttributeParentKeys9);
        
        assertNull(finalAttributeParentKeys10);
        
        assertNull(finalAttributeParentVals0);
        
        assertNull(finalAttributeParentVals1);
        
        assertNull(finalAttributeParentVals3);
        
        assertNull(finalAttributeParentVals4);
        
        assertNull(finalAttributeParentVals5);
        
        assertNull(finalAttributeParentVals6);
        
        assertNull(finalAttributeParentVals7);
        
        assertNull(finalAttributeParentVals8);
        
        assertNull(finalAttributeParentVals9);
        
        assertNull(finalAttributeParentVals10);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setValue(java.lang.String)
    
    @Test
    public void testSetValue5() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000\u0001";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 536870913);
        java.lang.String[] keys = new java.lang.String[10];
        String string = "\u0000\u0000";
        keys[0] = string;
        keys[1] = string;
        parent.keys = keys;
        attribute.parent = parent;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attributes.get(Attributes.java:100)
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(string1);
    }
    
    @Test
    public void testSetValue6() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[9];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[0] = string;
        parent.keys = keys;
        attribute.parent = parent;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.get(Attributes.java:101)
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(string1);
    }
    
    @Test
    public void testSetValue7() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 3);
        java.lang.String[] keys = new java.lang.String[11];
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        keys[2] = string;
        keys[3] = key;
        keys[4] = key;
        keys[5] = key;
        keys[6] = key;
        keys[7] = key;
        keys[8] = key;
        keys[9] = key;
        keys[10] = key;
        parent.keys = keys;
        attribute.parent = parent;
        String string1 = "";
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setValue] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.get(Attributes.java:101)
            org.jsoup.nodes.Attribute.setValue(Attribute.java:88) */
        attribute.setValue(string1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.setKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method setKey(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.jsoup.helper.Validate#notNull(java.lang.Object)} once,
    ///     {@link java.lang.String#trim()} once,
    ///     {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)} once
    /// execute conditions:
    ///     {@code (parent != null): True}
    /// invoke:
    ///     {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.executesCondition {@code (i != Attributes.NotFound): False}
 *  */
    @Test
    public void testSetKey_IEqualsAttributesNotFound() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        attribute.parent = parent;
        String string = "!";
        
        attribute.setKey(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.executesCondition {@code (i != Attributes.NotFound): True}
 *  */
    @Test
    public void testSetKey_INotEqualsAttributesNotFound() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "!";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = new java.lang.String[1];
        keys[0] = key;
        parent.keys = keys;
        attribute.parent = parent;
        
        attribute.setKey(key);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.executesCondition {@code (i != Attributes.NotFound): False}
 *  */
    @Test
    public void testSetKey_IEqualsAttributesNotFound_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "!";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {null};
        parent.keys = keys;
        attribute.parent = parent;
        
        attribute.setKey(key);
        
        String finalAttributeParentKeys0 = attribute.parent.keys[0];
        
        assertNull(finalAttributeParentKeys0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method setKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 *  */
    @Test
    public void testSetKey_ParentEqualsNull() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String string = "!";
        
        attribute.setKey(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_ThrowIllegalArgumentException() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        attribute.setKey(null);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetKey_ThrowIllegalArgumentException_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String string = "";
        
        attribute.setKey(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#setKey(java.lang.String)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#trim()}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#indexOfKey(java.lang.String)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int i = parent.indexOfKey(this.key);
 *  */
    @Test
    public void testSetKey_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        Attributes parent = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(parent, "org.jsoup.nodes.Attributes", "size", 1);
        java.lang.String[] keys = {};
        parent.keys = keys;
        attribute.parent = parent;
        String string = "!";
        
        /* This test fails because method [org.jsoup.nodes.Attribute.setKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.jsoup.nodes.Attributes.indexOfKey(Attributes.java:73)
            org.jsoup.nodes.Attribute.setKey(Attribute.java:68) */
        attribute.setKey(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.createFromEncoded
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFromEncoded(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attribute}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#createFromEncoded(java.lang.String,java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateFromEncodedThrowsIAEWithBlankStringAndNonEmptyString() {
        Attribute.createFromEncoded("\n\t\r", "-\uFFF43");
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createFromEncoded(java.lang.String, java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCreateFromEncoded1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class attributesClazz = Class.forName("org.jsoup.nodes.Attributes");
        java.lang.String[] prevEmpty = ((java.lang.String[]) getStaticFieldValue(attributesClazz, "Empty"));
        try {
            java.lang.String[] empty = {};
            setStaticField(attributesClazz, "Empty", empty);
            String string = "";
            String string1 = "";
            
            Attribute.createFromEncoded(string, string1);
        } finally {
            setStaticField(Attributes.class, "Empty", prevEmpty);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.html
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method html()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attribute}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html()}
     */
    @Test
    public void testHtml() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"", "", "#$\\\"'", "", "\n\t\r"};
        attributes.vals = vals;
        java.lang.String[] keys = {"#$\\\"'", "-3", "#$\\\"'", "XZ"};
        attributes.keys = keys;
        Attribute attribute = new Attribute("abc", "\n\t\r", attributes);
        Attributes parent = new Attributes();
        java.lang.String[] keys1 = {"abc", "", ""};
        parent.keys = keys1;
        java.lang.String[] vals1 = {"#$\\\"'"};
        parent.vals = vals1;
        attribute.parent = parent;
        attribute.setKey("");
        
        String actual = attribute.html();
        
        String expected = "abc=\"\n\t\r\"";
        
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
            Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
            
            String actual = attribute.html();
            
            String expected = "null";
            
            assertEquals(expected, actual);
        } finally {
            setStaticField(org.jsoup.internal.StringUtil.class, "builders", prevBuilders);
            setStaticField(ParseSettings.class, "htmlDefault", prevHtmlDefault);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testHtml_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        attribute.html(printStream, outputSettings);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testHtml2() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = outputSettings;
        htmlMethod.invoke(attribute, htmlMethodArguments);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Throwable  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.Attribute.html] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Attribute.html(Attribute.java:114)
            org.jsoup.nodes.Attribute.html(Attribute.java:123) */
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = printWriter;
        htmlMethodArguments[1] = outputSettings;
        try {
            htmlMethod.invoke(attribute, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.io.IOException} in: html(key, val, accum, out);
 *  */
    @Test(expected = IOException.class)
    public void testHtml_ThrowIOException() throws Throwable  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "closed", true);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", outputStreamWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = outputStreamWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attribute, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: html(key, val, accum, out);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException() throws Throwable  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String val = "";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", outputStreamWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = outputStreamWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attribute, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} in: html(key, val, accum, out);
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException_1() throws Throwable  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String val = "";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.StringCharBuffer");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", outputStreamWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = outputStreamWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attribute, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: html(key, val, accum, out);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHtml_ThrowIllegalStateException() throws Throwable  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String val = "";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        OutputStreamWriter outputStreamWriter = ((OutputStreamWriter) createInstance("java.io.OutputStreamWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(outputStreamWriter, "java.io.OutputStreamWriter", "se", se);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class outputStreamWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", outputStreamWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[2];
        htmlMethodArguments[0] = outputStreamWriter;
        htmlMethodArguments[1] = ((Object) null);
        try {
            htmlMethod.invoke(attribute, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testHtml3() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        String val = "";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.Attribute.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Document$OutputSettings.encoder(Document.java:453)
            org.jsoup.nodes.Entities.escape(Entities.java:179)
            org.jsoup.nodes.Attribute.html(Attribute.java:117)
            org.jsoup.nodes.Attribute.html(Attribute.java:123) */
        attribute.html(printStream, outputSettings);
    }
    
    @Test
    public void testHtml4() throws Exception  {
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
            Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
            String val = "";
            setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
            PrintStream printStream = ((PrintStream) createInstance("java.io.PrintStream"));
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
            
            /* This test fails because method [org.jsoup.nodes.Attribute.html] produces [java.lang.NullPointerException]
                java.base/java.lang.String.compareTo(String.java:2019)
                java.base/java.lang.String.compareTo(String.java:140)
                java.base/java.util.Arrays.binarySearch0(Arrays.java:2234)
                java.base/java.util.Arrays.binarySearch(Arrays.java:2174)
                org.jsoup.nodes.Attribute.isBooleanAttribute(Attribute.java:181)
                org.jsoup.nodes.Attribute.shouldCollapseAttribute(Attribute.java:167)
                org.jsoup.nodes.Attribute.html(Attribute.java:115)
                org.jsoup.nodes.Attribute.html(Attribute.java:123) */
            attribute.html(printStream, outputSettings);
        } finally {
            setStaticField(Attribute.class, "booleanAttributes", prevBooleanAttributes);
        }
    }
    ///endregion
    
    ///region Errors report for html
    
    public void testHtml_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.malformed4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.String, java.lang.String, java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testHtml_AttributeShouldCollapseAttribute() throws Exception  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Object lock = createInstance("java.lang.Object");
        setField(printWriter, "java.io.Writer", "lock", lock);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class stringType = Class.forName("java.lang.String");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", stringType, stringType, printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[4];
        htmlMethodArguments[0] = ((Object) null);
        htmlMethodArguments[1] = ((Object) null);
        htmlMethodArguments[2] = printWriter;
        htmlMethodArguments[3] = outputSettings;
        htmlMethod.invoke(null, htmlMethodArguments);
        
        boolean finalPrintWriterTrouble = ((Boolean) getFieldValue(printWriter, "java.io.PrintWriter", "trouble"));
        
        assertTrue(finalPrintWriterTrouble);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 *  */
    @Test
    public void testHtml_AttributeShouldCollapseAttribute_1() throws Exception  {
        String string = "";
        PrintWriter anonymousPrintWriter = ((PrintWriter) createInstance("java.io.Console$3"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(anonymousPrintWriter, "java.io.PrintWriter", "out", out);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class stringType = Class.forName("java.lang.String");
        Class anonymousPrintWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", stringType, stringType, anonymousPrintWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[4];
        htmlMethodArguments[0] = string;
        htmlMethodArguments[1] = ((Object) null);
        htmlMethodArguments[2] = anonymousPrintWriter;
        htmlMethodArguments[3] = outputSettings;
        htmlMethod.invoke(null, htmlMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.String, java.lang.String, java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(key);
 *  */
    @Test
    public void testHtml_ThrowNullPointerException1() throws IOException  {
        /* This test fails because method [org.jsoup.nodes.Attribute.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attribute.html(Attribute.java:114) */
        Attribute.html(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.invokes {@link java.lang.Appendable#append(java.lang.CharSequence)}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#syntax()}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHtml_ThrowNullPointerException_1() throws Throwable  {
        String string = " ";
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        /* This test fails because method [org.jsoup.nodes.Attribute.html] produces [java.lang.NullPointerException]
            java.base/java.io.PrintWriter.write(PrintWriter.java:539)
            java.base/java.io.PrintWriter.write(PrintWriter.java:558)
            java.base/java.io.PrintWriter.append(PrintWriter.java:1087)
            java.base/java.io.PrintWriter.append(PrintWriter.java:61)
            org.jsoup.nodes.Attribute.html(Attribute.java:114) */
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class stringType = Class.forName("java.lang.String");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", stringType, stringType, printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[4];
        htmlMethodArguments[0] = string;
        htmlMethodArguments[1] = ((Object) null);
        htmlMethodArguments[2] = printWriter;
        htmlMethodArguments[3] = outputSettings;
        try {
            htmlMethod.invoke(null, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method html(java.lang.String, java.lang.String, java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException1() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
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
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class stringType = Class.forName("java.lang.String");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", stringType, stringType, printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[4];
        htmlMethodArguments[0] = ((Object) null);
        htmlMethodArguments[1] = ((Object) null);
        htmlMethodArguments[2] = printWriter;
        htmlMethodArguments[3] = ((Object) null);
        try {
            htmlMethod.invoke(null, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.nio.ReadOnlyBufferException} 
 *  */
    @Test(expected = ReadOnlyBufferException.class)
    public void testHtml_ThrowReadOnlyBufferException_11() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        setField(se, "sun.nio.cs.StreamEncoder", "haveLeftoverChar", true);
        setField(se, "sun.nio.cs.StreamEncoder", "leftoverChar", '\u0000');
        Object lcb = createInstance("java.nio.HeapCharBufferR");
        setField(se, "sun.nio.cs.StreamEncoder", "lcb", lcb);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class stringType = Class.forName("java.lang.String");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", stringType, stringType, printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[4];
        htmlMethodArguments[0] = ((Object) null);
        htmlMethodArguments[1] = ((Object) null);
        htmlMethodArguments[2] = printWriter;
        htmlMethodArguments[3] = ((Object) null);
        try {
            htmlMethod.invoke(null, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#html(java.lang.String,java.lang.String,java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testHtml_ThrowIllegalStateException1() throws Throwable  {
        PrintWriter printWriter = ((PrintWriter) createInstance("java.io.PrintWriter"));
        FileWriter out = ((FileWriter) createInstance("java.io.FileWriter"));
        StreamEncoder se = ((StreamEncoder) createInstance("sun.nio.cs.StreamEncoder"));
        Object encoder = createInstance("sun.nio.cs.ISO_8859_1$Encoder");
        setField(encoder, "java.nio.charset.CharsetEncoder", "state", 2);
        setField(se, "sun.nio.cs.StreamEncoder", "encoder", encoder);
        Object lock = createInstance("java.lang.Object");
        setField(se, "java.io.Writer", "lock", lock);
        setField(out, "java.io.OutputStreamWriter", "se", se);
        setField(printWriter, "java.io.PrintWriter", "out", out);
        setField(printWriter, "java.io.Writer", "lock", lock);
        
        Class attributeClazz = Class.forName("org.jsoup.nodes.Attribute");
        Class stringType = Class.forName("java.lang.String");
        Class printWriterType = Class.forName("java.lang.Appendable");
        Class outputSettingsType = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Method htmlMethod = attributeClazz.getDeclaredMethod("html", stringType, stringType, printWriterType, outputSettingsType);
        htmlMethod.setAccessible(true);
        java.lang.Object[] htmlMethodArguments = new java.lang.Object[4];
        htmlMethodArguments[0] = ((Object) null);
        htmlMethodArguments[1] = ((Object) null);
        htmlMethodArguments[2] = printWriter;
        htmlMethodArguments[3] = ((Object) null);
        try {
            htmlMethod.invoke(null, htmlMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for html
    
    public void testHtml_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 12 occurrences of:
        /* Unable to make field private static final java.nio.charset.CoderResult[] java.nio.charset.CoderResult.unmappable4 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 10 occurrences of:
        /* Unable to make field static final boolean java.nio.charset.CharsetEncoder.$assertionsDisabled accessible: module
        java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamEncoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.ISO_8859_1$Encoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.isDataAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDataAttribute()
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute()}
 * @utbot.returnsFrom {@code return isDataAttribute(key);}
 *  */
    @Test
    public void testIsDataAttribute_ReturnIsDataAttribute() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        
        boolean actual = attribute.isDataAttribute();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute()}
 * @utbot.returnsFrom {@code return isDataAttribute(key);}
 *  */
    @Test
    public void testIsDataAttribute_ReturnIsDataAttribute_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "data- ";
        attribute.setKey(key);
        
        boolean actual = attribute.isDataAttribute();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute()}
 * @utbot.returnsFrom {@code return isDataAttribute(key);}
 *  */
    @Test
    public void testIsDataAttribute_ReturnIsDataAttribute_2() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "data-";
        attribute.setKey(key);
        
        boolean actual = attribute.isDataAttribute();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.isDataAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDataAttribute(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute(java.lang.String)}
 * @utbot.returnsFrom {@code return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();}
 *  */
    @Test
    public void testIsDataAttribute_KeyStartsWithAndKeyLengthLessOrEqualAttributesDataPrefixLength() {
        String string = "";
        
        boolean actual = Attribute.isDataAttribute(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute(java.lang.String)}
 * @utbot.returnsFrom {@code return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();}
 *  */
    @Test
    public void testIsDataAttribute_KeyStartsWithAndKeyLengthGreaterThanAttributesDataPrefixLength() {
        String string = "data- ";
        
        boolean actual = Attribute.isDataAttribute(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute(java.lang.String)}
 * @utbot.returnsFrom {@code return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();}
 *  */
    @Test
    public void testIsDataAttribute_KeyStartsWithAndKeyLengthLessOrEqualAttributesDataPrefixLength_1() {
        String string = "data-";
        
        boolean actual = Attribute.isDataAttribute(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDataAttribute(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isDataAttribute(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return key.startsWith(Attributes.dataPrefix) && key.length() > Attributes.dataPrefix.length();
 *  */
    @Test
    public void testIsDataAttribute_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.nodes.Attribute.isDataAttribute] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attribute.isDataAttribute(Attribute.java:151) */
        Attribute.isDataAttribute(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.isBooleanAttribute
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isBooleanAttribute(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attribute}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isBooleanAttribute(java.lang.String)}
     */
    @Test
    public void testIsBooleanAttributeReturnsFalseWithNonEmptyString() {
        boolean actual = Attribute.isBooleanAttribute("\u0014\n\t\r");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.isBooleanAttribute
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isBooleanAttribute()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attribute}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#isBooleanAttribute()}
     */
    @Test
    public void testIsBooleanAttributeReturnsFalse() {
        Attributes attributes = new Attributes();
        java.lang.String[] vals = {"", "10", "", "", "XZ"};
        attributes.vals = vals;
        java.lang.String[] keys = {"10", "-3", "\n\t\r", "10"};
        attributes.keys = keys;
        Attribute attribute = new Attribute("abc", "#$\\\"'", attributes);
        Attributes parent = new Attributes();
        java.lang.String[] keys1 = {"\n\t\r", "abc", "XZ"};
        parent.keys = keys1;
        java.lang.String[] vals1 = {"\n\t\r"};
        parent.vals = vals1;
        attribute.parent = parent;
        attribute.setKey("-3");
        
        boolean actual = attribute.isBooleanAttribute();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.shouldCollapseAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldCollapseAttribute(java.lang.String, java.lang.String, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): True}
 * @utbot.executesCondition {@code (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): False}
 * @utbot.returnsFrom {@code return (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key)));}
 *  */
    @Test
    public void testShouldCollapseAttribute_OutSyntaxEqualsDocumentOutputSettingsSyntaxHtmlAndValEqualsNullOrEqualsOrValEqualsIgnoreCaseAndAttributeIsBooleanAttribute() throws Exception  {
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        boolean actual = Attribute.shouldCollapseAttribute(null, null, outputSettings);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): True}
 * @utbot.executesCondition {@code (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): True}
 * @utbot.executesCondition {@code ((val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): True}
 * @utbot.executesCondition {@code ((val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link java.lang.String#equalsIgnoreCase(java.lang.String)}
 * @utbot.returnsFrom {@code return (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key)));}
 *  */
    @Test
    public void testShouldCollapseAttribute_ValEqualsNullOrEqualsOrValEqualsIgnoreCaseAndAttributeIsBooleanAttribute() throws Exception  {
        String string = " ";
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        boolean actual = Attribute.shouldCollapseAttribute(null, string, outputSettings);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))): False}
 * @utbot.returnsFrom {@code return (out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key)));}
 *  */
    @Test
    public void testShouldCollapseAttribute_OutSyntaxNotEqualsDocumentOutputSettingsSyntaxHtmlAndValNotEqualsNullOrEqualsOrValEqualsIgnoreCaseAndAttributeIsBooleanAttribute() throws Exception  {
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        boolean actual = Attribute.shouldCollapseAttribute(null, null, outputSettings);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldCollapseAttribute(java.lang.String, java.lang.String, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(java.lang.String,java.lang.String,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.invokes {@link org.jsoup.nodes.Document.OutputSettings#syntax()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.syntax() == Document.OutputSettings.Syntax.html && (val == null || ("".equals(val) || val.equalsIgnoreCase(key)) && Attribute.isBooleanAttribute(key))
 *  */
    @Test
    public void testShouldCollapseAttribute_ThrowNullPointerException() {
        /* This test fails because method [org.jsoup.nodes.Attribute.shouldCollapseAttribute] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attribute.shouldCollapseAttribute(Attribute.java:166) */
        Attribute.shouldCollapseAttribute(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attribute.shouldCollapseAttribute
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldCollapseAttribute(org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code return shouldCollapseAttribute(key, val, out);}
 *  */
    @Test
    public void testShouldCollapseAttribute_ReturnShouldCollapseAttribute() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String val = " ";
        setField(attribute, "org.jsoup.nodes.Attribute", "val", val);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        boolean actual = attribute.shouldCollapseAttribute(outputSettings);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code return shouldCollapseAttribute(key, val, out);}
 *  */
    @Test
    public void testShouldCollapseAttribute_ReturnShouldCollapseAttribute_2() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
        setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
        
        boolean actual = attribute.shouldCollapseAttribute(outputSettings);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attribute}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attribute#shouldCollapseAttribute(org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.returnsFrom {@code return shouldCollapseAttribute(key, val, out);}
 *  */
    @Test
    public void testShouldCollapseAttribute_ReturnShouldCollapseAttribute_1() throws Exception  {
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
        
        boolean actual = attribute.shouldCollapseAttribute(outputSettings);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method shouldCollapseAttribute(org.jsoup.nodes.Document$OutputSettings)
    
    @Test
    public void testShouldCollapseAttribute1() throws Exception  {
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
            Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
            String key = "";
            attribute.setKey(key);
            setField(attribute, "org.jsoup.nodes.Attribute", "val", key);
            Document.OutputSettings outputSettings = ((Document.OutputSettings) createInstance("org.jsoup.nodes.Document$OutputSettings"));
            Document.OutputSettings.Syntax syntax = Document.OutputSettings.Syntax.html;
            setField(outputSettings, "org.jsoup.nodes.Document$OutputSettings", "syntax", syntax);
            
            boolean actual = attribute.shouldCollapseAttribute(outputSettings);
            
            assertFalse(actual);
        } finally {
            setStaticField(Attribute.class, "booleanAttributes", prevBooleanAttributes);
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields1009071735168200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009071735168200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009071735178200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009071735168200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009071735178200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1009071735959300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1009071735959300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1009071735962000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009071735959300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009071735962000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009071737166600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009071737166600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009071737181100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009071737166600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009071737181100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1009071738186800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009071738186800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009071738192600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009071738186800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009071738192600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

