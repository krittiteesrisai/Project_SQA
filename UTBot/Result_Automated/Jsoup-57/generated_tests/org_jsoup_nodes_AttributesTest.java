package org.jsoup.nodes;

import org.junit.Test;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public final class org_jsoup_nodes_AttributesTest {
    ///region Test suites for executable org.jsoup.nodes.Attributes.remove
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method remove(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemove_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = " ";
        
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#remove(java.lang.Object)}
 *  */
    @Test
    public void testRemove_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        attributes.remove(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        String string = "";
        
        attributes.remove(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#remove(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemove_ThrowIllegalArgumentException_1() {
        Attributes attributes = new Attributes();
        
        attributes.remove(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.get
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testGet_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = " ";
        
        String actual = attributes.get(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.executesCondition {@code (attr != null): False}
 * @utbot.returnsFrom {@code return attr != null ? attr.getValue() : "";}
 *  */
    @Test
    public void testGet_AttrEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        String actual = attributes.get(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.executesCondition {@code (attr != null): True}
 * @utbot.invokes {@link org.jsoup.nodes.Attribute#getValue()}
 * @utbot.returnsFrom {@code return attr != null ? attr.getValue() : "";}
 *  */
    @Test
    public void testGet_AttrNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = " ";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        String value = "";
        setField(booleanAttribute, "org.jsoup.nodes.Attribute", "value", value);
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        String actual = attributes.get(string);
        
        assertEquals(value, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        String string = "";
        
        attributes.get(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#get(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException_1() {
        Attributes attributes = new Attributes();
        
        attributes.get(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.executesCondition {@code (attributes == null): True}
 *  */
    @Test
    public void testPut_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        
        attributes.put(attribute);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.executesCondition {@code (attributes == null): False}
 *  */
    @Test
    public void testPut_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        String key = "";
        attribute.setKey(key);
        
        attributes.put(attribute);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(org.jsoup.nodes.Attribute)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(org.jsoup.nodes.Attribute)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(attribute);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        
        attributes.put(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 *  */
    @Test
    public void testPut_Value() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "!";
        
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 *  */
    @Test
    public void testPut_Value_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = "!";
        
        attributes.put(string, true);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 *  */
    @Test
    public void testPut_NotValue() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = " ";
        
        attributes.put(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 *  */
    @Test
    public void testPut_NotValue_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        attributes.put(string, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: remove(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException1() {
        Attributes attributes = new Attributes();
        
        attributes.put(((String) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: remove(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException_1() {
        Attributes attributes = new Attributes();
        String string = "";
        
        attributes.put(string, false);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,boolean)}
 * @utbot.executesCondition {@code (value): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: put(new BooleanAttribute(key));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException_2() {
        Attributes attributes = new Attributes();
        String string = "";
        
        attributes.put(string, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.put
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method put(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testPut() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = "!";
        
        attributes.put(string, string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testPut_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = "!";
        String string1 = "";
        
        attributes.put(string, string1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method put(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Attribute attr = new Attribute(key, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException2() {
        Attributes attributes = new Attributes();
        
        attributes.put(((String) null), ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Attribute attr = new Attribute(key, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException_11() {
        Attributes attributes = new Attributes();
        String string = " ";
        
        attributes.put(string, ((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#put(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Attribute attr = new Attribute(key, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPut_ThrowIllegalArgumentException_21() {
        Attributes attributes = new Attributes();
        String string = "";
        
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
 * @utbot.executesCondition {@code (!(o instanceof Attributes)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOInstanceOfAttributes() {
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
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Attributes)): False}
 * @utbot.executesCondition {@code (attributes != null): True}
 * @utbot.returnsFrom {@code return !(attributes != null ? !attributes.equals(that.attributes) : that.attributes != null);}
 *  */
    @Test
    public void testEquals_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes2 = new LinkedHashMap();
        setField(attributes1, "org.jsoup.nodes.Attributes", "attributes", attributes2);
        
        boolean actual = attributes.equals(attributes1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Attributes)): False}
 * @utbot.executesCondition {@code (attributes != null): False}
 * @utbot.returnsFrom {@code return !(attributes != null ? !attributes.equals(that.attributes) : that.attributes != null);}
 *  */
    @Test
    public void testEquals_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        boolean actual = attributes.equals(attributes1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Attributes)): False}
 * @utbot.returnsFrom {@code return !(attributes != null ? !attributes.equals(that.attributes) : that.attributes != null);}
 *  */
    @Test
    public void testEquals_NotAttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        setField(attributes2, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.equals(attributes2);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (o): False}
 * @utbot.executesCondition {@code (!(o instanceof Attributes)): False}
 * @utbot.returnsFrom {@code return !(attributes != null ? !attributes.equals(that.attributes) : that.attributes != null);}
 *  */
    @Test
    public void testEquals_NotAttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        Attributes attributes2 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        boolean actual = attributes.equals(attributes2);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.toString
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#toString()}
     */
    @Test(expected = ExceptionInInitializerError.class)
    public void testToStringThrowsEIIE() {
        Attributes attributes = new Attributes();
        
        attributes.toString();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method toString()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#toString()}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testToStringThrowsNCDFE() {
        Attributes attributes = new Attributes();
        
        attributes.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hashCode()}
 * @utbot.executesCondition {@code (attributes != null): False}
 * @utbot.returnsFrom {@code return attributes != null ? attributes.hashCode() : 0;}
 *  */
    @Test
    public void testHashCode_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        int actual = attributes.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hashCode()}
 * @utbot.executesCondition {@code (attributes != null): True}
 * @utbot.invokes {@link java.util.LinkedHashMap#hashCode()}
 * @utbot.returnsFrom {@code return attributes != null ? attributes.hashCode() : 0;}
 *  */
    @Test
    public void testHashCode_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        int actual = attributes.hashCode();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.clone
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method clone()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#clone()}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return new Attributes();}
 *  */
    @Test
    public void testClone_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        Attributes actual = attributes.clone();
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#clone()}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.lang.Object#clone()}
 *  */
    @Test
    public void testClone_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        Attributes actual = attributes.clone();
        
        Attributes expected = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes2 = new LinkedHashMap();
        setField(expected, "org.jsoup.nodes.Attributes", "attributes", attributes2);
        
        // org.jsoup.nodes.Attributes is iterable or Map, use outer deep equals to iterate over
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.size
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method size()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#size()}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testSize_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        int actual = attributes.size();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#size()}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#size()}
 * @utbot.returnsFrom {@code return attributes.size();}
 *  */
    @Test
    public void testSize_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        int actual = attributes.size();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.iterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#iterator()}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.executesCondition {@code (attributes.isEmpty()): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#isEmpty()}
 * @utbot.invokes {@link java.util.LinkedHashMap#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return attributes.values().iterator();}
 *  */
    @Test
    public void testIterator_NotAttributesIsEmpty() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        Object actual = attributes.iterator();
        
        Object expected = createInstance("java.util.LinkedHashMap$LinkedValueIterator");
        
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method iterator()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#iterator()}
     */
    @Test
    public void testIterator() throws Exception  {
        Attributes attributes = new Attributes();
        
        Object actual = attributes.iterator();
        
        Object expected = createInstance("java.util.Collections$EmptyIterator");
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.addAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addAll(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.executesCondition {@code (incoming.size() == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddAll_IncomingSizeEqualsZero_1() throws Exception  {
        Attributes attributes = new Attributes();
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes2 = new LinkedHashMap();
        setField(attributes1, "org.jsoup.nodes.Attributes", "attributes", attributes2);
        
        attributes.addAll(attributes1);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.executesCondition {@code (incoming.size() == 0): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testAddAll_IncomingSizeEqualsZero() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        attributes.addAll(attributes);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.executesCondition {@code (incoming.size() == 0): False}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#size()}
 * @utbot.invokes {@link java.util.LinkedHashMap#putAll(java.util.Map)}
 *  */
    @Test
    public void testAddAll_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        Attributes attributes1 = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes2 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes2.put(string, booleanAttribute);
        setField(attributes1, "org.jsoup.nodes.Attributes", "attributes", attributes2);
        
        attributes.addAll(attributes1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addAll(org.jsoup.nodes.Attributes)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#addAll(org.jsoup.nodes.Attributes)}
 * @utbot.invokes {@link org.jsoup.nodes.Attributes#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: incoming.size() == 0
 *  */
    @Test
    public void testAddAll_ThrowNullPointerException() {
        Attributes attributes = new Attributes();
        
        /* This test fails because method [org.jsoup.nodes.Attributes.addAll] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.addAll(Attributes.java:168) */
        attributes.addAll(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.asList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asList()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.invokes {@link java.util.Collections#emptyList()}
 * @utbot.returnsFrom {@code return Collections.emptyList();}
 *  */
    @Test
    public void testAsList_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        List actual = attributes.asList();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(list);}
 *  */
    @Test
    public void testAsList_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        List actual = attributes.asList();
        
        List expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#asList()}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.iterates iterate the loop {@code for(Map.Entry<String, Attribute> entry: attributes.entrySet())} once
 * @utbot.returnsFrom {@code return Collections.unmodifiableList(list);}
 *  */
    @Test
    public void testAsList_ListAdd() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        List actual = attributes.asList();
        
        List expected = new ArrayList();
        expected.add(null);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.removeIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveIgnoreCase_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = " ";
        
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 *  */
    @Test
    public void testRemoveIgnoreCase_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.iterates iterate the loop {@code for(Iterator<String> it = attributes.keySet().iterator(); it.hasNext(); )} once
 *  */
    @Test
    public void testRemoveIgnoreCase_NotAttrKeyEqualsIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string1 = "  ";
        
        attributes.removeIgnoreCase(string1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        String string = "";
        
        attributes.removeIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveIgnoreCase_ThrowIllegalArgumentException_1() {
        Attributes attributes = new Attributes();
        
        attributes.removeIgnoreCase(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#removeIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link java.util.LinkedHashMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Iterator<String> it = attributes.keySet().iterator(); it.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: attrKey.equalsIgnoreCase(key)
 *  */
    @Test
    public void testRemoveIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.removeIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.removeIgnoreCase(Attributes.java:124) */
        attributes.removeIgnoreCase(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.hasKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes != null && attributes.containsKey(key);}
 *  */
    @Test
    public void testHasKey_AttributesEqualsNullAndAttributesContainsKey() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        boolean actual = attributes.hasKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes != null && attributes.containsKey(key);}
 *  */
    @Test
    public void testHasKey_AttributesEqualsNullAndAttributesContainsKey_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.hasKey(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKey(java.lang.String)}
 * @utbot.returnsFrom {@code return attributes != null && attributes.containsKey(key);}
 *  */
    @Test
    public void testHasKey_AttributesNotEqualsNullAndAttributesContainsKey() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        Attribute attribute = ((Attribute) createInstance("org.jsoup.nodes.Attribute"));
        attributes1.put(string, attribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.hasKey(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.dataset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dataset()
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#dataset()}
 * @utbot.returnsFrom {@code return new Dataset();}
 *  */
    @Test
    public void testDataset_Return() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        Map actual = attributes.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#dataset()}
 * @utbot.returnsFrom {@code return new Dataset();}
 *  */
    @Test
    public void testDataset_Return_1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        Map actual = attributes.dataset();
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.hasKeyIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): True}
 *  */
    @Test
    public void testHasKeyIgnoreCase_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        boolean actual = attributes.hasKeyIgnoreCase(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 *  */
    @Test
    public void testHasKeyIgnoreCase_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.hasKeyIgnoreCase(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.iterates iterate the loop {@code for(String attrKey: attributes.keySet())} once
 *  */
    @Test
    public void testHasKeyIgnoreCase_AttrKeyEqualsIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.hasKeyIgnoreCase(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.iterates iterate the loop {@code for(String attrKey: attributes.keySet())} once
 *  */
    @Test
    public void testHasKeyIgnoreCase_NotAttrKeyEqualsIgnoreCase() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.hasKeyIgnoreCase(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasKeyIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#hasKeyIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(String attrKey: attributes.keySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: attrKey.equalsIgnoreCase(key)
 *  */
    @Test
    public void testHasKeyIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.hasKeyIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:147) */
        attributes.hasKeyIgnoreCase(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasKeyIgnoreCase(java.lang.String)
    
    @Test
    public void testHasKeyIgnoreCase1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        attributes1.put(string1, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string2 = "";
        
        boolean actual = attributes.hasKeyIgnoreCase(string2);
        
        assertFalse(actual);
    }
    
    @Test
    public void testHasKeyIgnoreCase2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        String string1 = "";
        attributes1.put(string1, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        boolean actual = attributes.hasKeyIgnoreCase(string1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasKeyIgnoreCase(java.lang.String)
    
    @Test
    public void testHasKeyIgnoreCase3() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        attributes1.put(null, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.hasKeyIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.hasKeyIgnoreCase(Attributes.java:147) */
        attributes.hasKeyIgnoreCase(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.getIgnoreCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): True}
 *  */
    @Test
    public void testGetIgnoreCase_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        String string = " ";
        
        String actual = attributes.getIgnoreCase(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testGetIgnoreCase_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        String actual = attributes.getIgnoreCase(string);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_ThrowIllegalArgumentException() {
        Attributes attributes = new Attributes();
        String string = "";
        
        attributes.getIgnoreCase(string);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetIgnoreCase_ThrowIllegalArgumentException_1() {
        Attributes attributes = new Attributes();
        
        attributes.getIgnoreCase(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getIgnoreCase(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#getIgnoreCase(java.lang.String)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notEmpty(java.lang.String)}
 * @utbot.invokes {@link java.util.LinkedHashMap#keySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: attrKey.equalsIgnoreCase(key)
 *  */
    @Test
    public void testGetIgnoreCase_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string = " ";
        
        /* This test fails because method [org.jsoup.nodes.Attributes.getIgnoreCase] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.getIgnoreCase(Attributes.java:64) */
        attributes.getIgnoreCase(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getIgnoreCase(java.lang.String)
    
    @Test
    public void testGetIgnoreCase1() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        String actual = attributes.getIgnoreCase(string);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetIgnoreCase2() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        String string = "";
        BooleanAttribute booleanAttribute = ((BooleanAttribute) createInstance("org.jsoup.nodes.BooleanAttribute"));
        attributes1.put(string, booleanAttribute);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        String string1 = "\u0000";
        
        String actual = attributes.getIgnoreCase(string1);
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.html
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (attributes == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testHtml_AttributesEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        
        attributes.html(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 *  */
    @Test
    public void testHtml_AttributesNotEqualsNull() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        attributes.html(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method html(java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings)
    
    /**
    @utbot.classUnderTest {@link Attributes}
 * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html(java.lang.Appendable,org.jsoup.nodes.Document.OutputSettings)}
 * @utbot.executesCondition {@code (attributes == null): False}
 * @utbot.invokes {@link java.util.LinkedHashMap#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Map.Entry<String, Attribute> entry: attributes.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: accum.append(" ");
 *  */
    @Test
    public void testHtml_ThrowNullPointerException() throws Exception  {
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        LinkedHashMap attributes1 = new LinkedHashMap();
        attributes1.put(null, null);
        setField(attributes, "org.jsoup.nodes.Attributes", "attributes", attributes1);
        
        /* This test fails because method [org.jsoup.nodes.Attributes.html] produces [java.lang.NullPointerException]
            org.jsoup.nodes.Attributes.html(Attributes.java:229) */
        attributes.html(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.nodes.Attributes.html
    
    ///region FUZZER: ERROR SUITE for method html()
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.nodes.Attributes}
     * @utbot.methodUnderTest {@link org.jsoup.nodes.Attributes#html()}
     */
    @Test(expected = NoClassDefFoundError.class)
    public void testHtmlThrowsNCDFE() {
        Attributes attributes = new Attributes();
        
        attributes.html();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1002802732679500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1002802732679500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1002802732688400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1002802732679500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1002802732688400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

