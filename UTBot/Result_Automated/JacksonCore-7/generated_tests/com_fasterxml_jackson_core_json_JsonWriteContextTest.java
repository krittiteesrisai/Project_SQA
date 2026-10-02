package com.fasterxml.jackson.core.json;

import org.junit.Test;
import java.util.HashSet;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_core_json_JsonWriteContextTest {
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_ReturnSbToString_1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        
        String actual = jsonWriteContext.toString();
        
        String expected = "[0]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_ReturnSbToString_2() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        String actual = jsonWriteContext.toString();
        
        String expected = "[0]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_ReturnSbToString_4() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        jsonWriteContext._currentName = _currentName;
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        
        String actual = jsonWriteContext.toString();
        
        String expected = "{\"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\"}";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_ReturnSbToString() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(-255, null, null);
        
        String actual = jsonWriteContext.toString();
        
        String expected = "/";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#toString()}
 * @utbot.returnsFrom {@code return sb.toString();}
 *  */
    @Test
    public void testToString_ReturnSbToString_3() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(2, null, null);
        
        String actual = jsonWriteContext.toString();
        
        String expected = "{?}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.getParent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParent()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#getParent()}
 * @utbot.returnsFrom {@code return _parent;}
 *  */
    @Test
    public void testGetParent_Return_parent() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        JsonWriteContext actual = jsonWriteContext.getParent();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.reset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reset(int)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#reset(int)}
 * @utbot.executesCondition {@code (_dups != null): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReset__dupsEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        
        JsonWriteContext actual = jsonWriteContext.reset(-255);
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector actual_dups = actual._dups;
        assertNull(actual_dups);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int jsonWriteContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(jsonWriteContext_type, actual_type);
        
        int jsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(jsonWriteContext_index, actual_index);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(-1, finalJsonWriteContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#reset(int)}
 * @utbot.executesCondition {@code (_dups != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#reset()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReset__dupsNotEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        jsonWriteContext._dups = _dups;
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        
        JsonWriteContext actual = jsonWriteContext.reset(-255);
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector jsonWriteContext_dups = jsonWriteContext._dups;
        DupDetector actual_dups = actual._dups;
        Object actual_dups_source = actual_dups._source;
        assertNull(actual_dups_source);
        
        String actual_dups_firstName = actual_dups._firstName;
        assertNull(actual_dups_firstName);
        
        String actual_dups_secondName = actual_dups._secondName;
        assertNull(actual_dups_secondName);
        
        HashSet actual_dups_seen = actual_dups._seen;
        assertNull(actual_dups_seen);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int jsonWriteContext_type = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(jsonWriteContext_type, actual_type);
        
        int jsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(jsonWriteContext_index, actual_index);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(-1, finalJsonWriteContext_index);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.writeValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeValue()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeValue()}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): True}
 * @utbot.returnsFrom {@code return STATUS_OK_AFTER_COLON;}
 *  */
    @Test
    public void testWriteValue__typeEqualsTYPE_OBJECT() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        
        int actual = jsonWriteContext.writeValue();
        
        assertEquals(2, actual);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(-254, finalJsonWriteContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeValue()}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): True}
 * @utbot.executesCondition {@code ((ix < 0)): False}
 * @utbot.returnsFrom {@code return (ix < 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_COMMA;}
 *  */
    @Test
    public void testWriteValue_IxGreaterOrEqualZero() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        
        int actual = jsonWriteContext.writeValue();
        
        assertEquals(1, actual);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalJsonWriteContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeValue()}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): True}
 * @utbot.executesCondition {@code ((ix < 0)): True}
 * @utbot.returnsFrom {@code return (ix < 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_COMMA;}
 *  */
    @Test
    public void testWriteValue_IxLessThanZero() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        int actual = jsonWriteContext.writeValue();
        
        assertEquals(0, actual);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(0, finalJsonWriteContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeValue()}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): False}
 * @utbot.executesCondition {@code ((_index == 0)): False}
 * @utbot.returnsFrom {@code return (_index == 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_SPACE;}
 *  */
    @Test
    public void testWriteValue__indexNotEqualsZero() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        
        int actual = jsonWriteContext.writeValue();
        
        assertEquals(3, actual);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalJsonWriteContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeValue()}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): False}
 * @utbot.executesCondition {@code ((_index == 0)): True}
 * @utbot.returnsFrom {@code return (_index == 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_SPACE;}
 *  */
    @Test
    public void testWriteValue__indexEqualsZero() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        int actual = jsonWriteContext.writeValue();
        
        assertEquals(0, actual);
        
        int finalJsonWriteContext_index = ((Integer) getFieldValue(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(0, finalJsonWriteContext_index);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.setCurrentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCurrentValue(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#setCurrentValue(java.lang.Object)}
 *  */
    @Test
    public void testSetCurrentValue() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        jsonWriteContext.setCurrentValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.getCurrentValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentValue()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#getCurrentValue()}
 * @utbot.returnsFrom {@code return _currentValue;}
 *  */
    @Test
    public void testGetCurrentValue_Return_currentValue() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        Object actual = jsonWriteContext.getCurrentValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.getCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#getCurrentName()}
 * @utbot.returnsFrom {@code return _currentName;}
 *  */
    @Test
    public void testGetCurrentName_Return_currentName() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        String actual = jsonWriteContext.getCurrentName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.createChildArrayContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createChildArrayContext()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildArrayContext()}
 * @utbot.executesCondition {@code (ctxt == null): False}
 * @utbot.returnsFrom {@code return ctxt.reset(TYPE_ARRAY);}
 *  */
    @Test
    public void testCreateChildArrayContext_CtxtNotEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        jsonWriteContext._child = _child;
        
        JsonWriteContext actual = jsonWriteContext.createChildArrayContext();
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector actual_dups = actual._dups;
        assertNull(actual_dups);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int _child_type = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(_child_type, actual_type);
        
        int _child_index = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(_child_index, actual_index);
        
        JsonWriteContext jsonWriteContext1 = jsonWriteContext._child;
        int finalJsonWriteContext_child_type = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext2 = jsonWriteContext._child;
        int finalJsonWriteContext_child_index = ((Integer) getFieldValue(jsonWriteContext2, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalJsonWriteContext_child_type);
        
        assertEquals(-1, finalJsonWriteContext_child_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildArrayContext()}
 * @utbot.executesCondition {@code (ctxt == null): True}
 * @utbot.executesCondition {@code ((_dups == null)): True}
 * @utbot.returnsFrom {@code return ctxt;}
 *  */
    @Test
    public void testCreateChildArrayContext__dupsEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        
        JsonWriteContext initialJsonWriteContext_child = jsonWriteContext._child;
        
        JsonWriteContext actual = jsonWriteContext.createChildArrayContext();
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", jsonWriteContext);
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext expected_parent = expected._parent;
        JsonWriteContext actual_parent = actual._parent;
        JsonWriteContext actual_parent_parent = actual_parent._parent;
        assertNull(actual_parent_parent);
        
        DupDetector actual_parent_dups = actual_parent._dups;
        assertNull(actual_parent_dups);
        
        JsonWriteContext expected_parent_child = expected_parent._child;
        JsonWriteContext actual_parent_child = actual_parent._child;
        assertTrue(deepEquals(expected_parent_child, actual_parent_child));
        assertTrue(deepEquals(expected_parent_child, actual_parent_child));
        JsonWriteContext actual_parent_child_child = actual_parent_child._child;
        assertNull(actual_parent_child_child);
        
        String actual_parent_child_currentName = actual_parent_child._currentName;
        assertNull(actual_parent_child_currentName);
        
        Object actual_parent_child_currentValue = actual_parent_child._currentValue;
        assertNull(actual_parent_child_currentValue);
        
        boolean actual_parent_child_gotName = actual_parent_child._gotName;
        assertFalse(actual_parent_child_gotName);
        
        int expected_parent_child_type = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_child_type = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_child_type, actual_parent_child_type);
        
        int expected_parent_child_index = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_child_index = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_child_index, actual_parent_child_index);
        
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        int expected_parent_type = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_type = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_type, actual_parent_type);
        
        int expected_parent_index = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_index = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_index, actual_parent_index);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        JsonWriteContext finalJsonWriteContext_child = jsonWriteContext._child;
        
        assertFalse(initialJsonWriteContext_child == finalJsonWriteContext_child);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildArrayContext()}
 * @utbot.executesCondition {@code (ctxt == null): False}
 * @utbot.returnsFrom {@code return ctxt.reset(TYPE_ARRAY);}
 *  */
    @Test
    public void testCreateChildArrayContext_CtxtNotEqualsNull_1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _child._dups = _dups;
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        jsonWriteContext._child = _child;
        
        JsonWriteContext actual = jsonWriteContext.createChildArrayContext();
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector _child_dups = _child._dups;
        DupDetector actual_dups = actual._dups;
        Object actual_dups_source = actual_dups._source;
        assertNull(actual_dups_source);
        
        String actual_dups_firstName = actual_dups._firstName;
        assertNull(actual_dups_firstName);
        
        String actual_dups_secondName = actual_dups._secondName;
        assertNull(actual_dups_secondName);
        
        HashSet actual_dups_seen = actual_dups._seen;
        assertNull(actual_dups_seen);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int _child_type = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(_child_type, actual_type);
        
        int _child_index = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(_child_index, actual_index);
        
        JsonWriteContext jsonWriteContext1 = jsonWriteContext._child;
        int finalJsonWriteContext_child_type = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext2 = jsonWriteContext._child;
        int finalJsonWriteContext_child_index = ((Integer) getFieldValue(jsonWriteContext2, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(1, finalJsonWriteContext_child_type);
        
        assertEquals(-1, finalJsonWriteContext_child_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildArrayContext()}
 * @utbot.executesCondition {@code (ctxt == null): True}
 * @utbot.executesCondition {@code ((_dups == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#child()}
 * @utbot.returnsFrom {@code return ctxt;}
 *  */
    @Test
    public void testCreateChildArrayContext__dupsNotEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        jsonWriteContext._dups = _dups;
        
        JsonWriteContext initialJsonWriteContext_child = jsonWriteContext._child;
        
        JsonWriteContext actual = jsonWriteContext.createChildArrayContext();
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", jsonWriteContext);
        DupDetector _dups1 = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        expected._dups = _dups1;
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext expected_parent = expected._parent;
        JsonWriteContext actual_parent = actual._parent;
        JsonWriteContext actual_parent_parent = actual_parent._parent;
        assertNull(actual_parent_parent);
        
        DupDetector expected_parent_dups = expected_parent._dups;
        DupDetector actual_parent_dups = actual_parent._dups;
        Object actual_parent_dups_source = actual_parent_dups._source;
        assertNull(actual_parent_dups_source);
        
        String actual_parent_dups_firstName = actual_parent_dups._firstName;
        assertNull(actual_parent_dups_firstName);
        
        String actual_parent_dups_secondName = actual_parent_dups._secondName;
        assertNull(actual_parent_dups_secondName);
        
        HashSet actual_parent_dups_seen = actual_parent_dups._seen;
        assertNull(actual_parent_dups_seen);
        
        JsonWriteContext expected_parent_child = expected_parent._child;
        JsonWriteContext actual_parent_child = actual_parent._child;
        assertTrue(deepEquals(expected_parent_child, actual_parent_child));
        DupDetector expected_parent_child_dups = expected_parent_child._dups;
        DupDetector actual_parent_child_dups = actual_parent_child._dups;
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        
        JsonWriteContext actual_parent_child_child = actual_parent_child._child;
        assertNull(actual_parent_child_child);
        
        String actual_parent_child_currentName = actual_parent_child._currentName;
        assertNull(actual_parent_child_currentName);
        
        Object actual_parent_child_currentValue = actual_parent_child._currentValue;
        assertNull(actual_parent_child_currentValue);
        
        boolean actual_parent_child_gotName = actual_parent_child._gotName;
        assertFalse(actual_parent_child_gotName);
        
        int expected_parent_child_type = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_child_type = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_child_type, actual_parent_child_type);
        
        int expected_parent_child_index = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_child_index = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_child_index, actual_parent_child_index);
        
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        int expected_parent_type = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_type = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_type, actual_parent_type);
        
        int expected_parent_index = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_index = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_index, actual_parent_index);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        JsonWriteContext finalJsonWriteContext_child = jsonWriteContext._child;
        
        assertFalse(initialJsonWriteContext_child == finalJsonWriteContext_child);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.createChildObjectContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createChildObjectContext()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildObjectContext()}
 * @utbot.executesCondition {@code (ctxt == null): False}
 * @utbot.returnsFrom {@code return ctxt.reset(TYPE_OBJECT);}
 *  */
    @Test
    public void testCreateChildObjectContext_CtxtNotEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        jsonWriteContext._child = _child;
        
        JsonWriteContext actual = jsonWriteContext.createChildObjectContext();
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector actual_dups = actual._dups;
        assertNull(actual_dups);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int _child_type = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(_child_type, actual_type);
        
        int _child_index = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(_child_index, actual_index);
        
        JsonWriteContext jsonWriteContext1 = jsonWriteContext._child;
        int finalJsonWriteContext_child_type = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext2 = jsonWriteContext._child;
        int finalJsonWriteContext_child_index = ((Integer) getFieldValue(jsonWriteContext2, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(2, finalJsonWriteContext_child_type);
        
        assertEquals(-1, finalJsonWriteContext_child_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildObjectContext()}
 * @utbot.executesCondition {@code (ctxt == null): True}
 * @utbot.executesCondition {@code ((_dups == null)): True}
 * @utbot.returnsFrom {@code return ctxt;}
 *  */
    @Test
    public void testCreateChildObjectContext__dupsEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        
        JsonWriteContext initialJsonWriteContext_child = jsonWriteContext._child;
        
        JsonWriteContext actual = jsonWriteContext.createChildObjectContext();
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", jsonWriteContext);
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext expected_parent = expected._parent;
        JsonWriteContext actual_parent = actual._parent;
        JsonWriteContext actual_parent_parent = actual_parent._parent;
        assertNull(actual_parent_parent);
        
        DupDetector actual_parent_dups = actual_parent._dups;
        assertNull(actual_parent_dups);
        
        JsonWriteContext expected_parent_child = expected_parent._child;
        JsonWriteContext actual_parent_child = actual_parent._child;
        assertTrue(deepEquals(expected_parent_child, actual_parent_child));
        assertTrue(deepEquals(expected_parent_child, actual_parent_child));
        JsonWriteContext actual_parent_child_child = actual_parent_child._child;
        assertNull(actual_parent_child_child);
        
        String actual_parent_child_currentName = actual_parent_child._currentName;
        assertNull(actual_parent_child_currentName);
        
        Object actual_parent_child_currentValue = actual_parent_child._currentValue;
        assertNull(actual_parent_child_currentValue);
        
        boolean actual_parent_child_gotName = actual_parent_child._gotName;
        assertFalse(actual_parent_child_gotName);
        
        int expected_parent_child_type = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_child_type = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_child_type, actual_parent_child_type);
        
        int expected_parent_child_index = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_child_index = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_child_index, actual_parent_child_index);
        
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        int expected_parent_type = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_type = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_type, actual_parent_type);
        
        int expected_parent_index = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_index = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_index, actual_parent_index);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        JsonWriteContext finalJsonWriteContext_child = jsonWriteContext._child;
        
        assertFalse(initialJsonWriteContext_child == finalJsonWriteContext_child);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildObjectContext()}
 * @utbot.executesCondition {@code (ctxt == null): False}
 * @utbot.returnsFrom {@code return ctxt.reset(TYPE_OBJECT);}
 *  */
    @Test
    public void testCreateChildObjectContext_CtxtNotEqualsNull_1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        JsonWriteContext _child = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        _child._dups = _dups;
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        jsonWriteContext._child = _child;
        
        JsonWriteContext actual = jsonWriteContext.createChildObjectContext();
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector _child_dups = _child._dups;
        DupDetector actual_dups = actual._dups;
        Object actual_dups_source = actual_dups._source;
        assertNull(actual_dups_source);
        
        String actual_dups_firstName = actual_dups._firstName;
        assertNull(actual_dups_firstName);
        
        String actual_dups_secondName = actual_dups._secondName;
        assertNull(actual_dups_secondName);
        
        HashSet actual_dups_seen = actual_dups._seen;
        assertNull(actual_dups_seen);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int _child_type = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(_child_type, actual_type);
        
        int _child_index = ((Integer) getFieldValue(_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(_child_index, actual_index);
        
        JsonWriteContext jsonWriteContext1 = jsonWriteContext._child;
        int finalJsonWriteContext_child_type = ((Integer) getFieldValue(jsonWriteContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonWriteContext jsonWriteContext2 = jsonWriteContext._child;
        int finalJsonWriteContext_child_index = ((Integer) getFieldValue(jsonWriteContext2, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(2, finalJsonWriteContext_child_type);
        
        assertEquals(-1, finalJsonWriteContext_child_index);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createChildObjectContext()}
 * @utbot.executesCondition {@code (ctxt == null): True}
 * @utbot.executesCondition {@code ((_dups == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#child()}
 * @utbot.returnsFrom {@code return ctxt;}
 *  */
    @Test
    public void testCreateChildObjectContext__dupsNotEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        jsonWriteContext._dups = _dups;
        
        JsonWriteContext initialJsonWriteContext_child = jsonWriteContext._child;
        
        JsonWriteContext actual = jsonWriteContext.createChildObjectContext();
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.json.JsonWriteContext", "_parent", jsonWriteContext);
        DupDetector _dups1 = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        expected._dups = _dups1;
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext expected_parent = expected._parent;
        JsonWriteContext actual_parent = actual._parent;
        JsonWriteContext actual_parent_parent = actual_parent._parent;
        assertNull(actual_parent_parent);
        
        DupDetector expected_parent_dups = expected_parent._dups;
        DupDetector actual_parent_dups = actual_parent._dups;
        Object actual_parent_dups_source = actual_parent_dups._source;
        assertNull(actual_parent_dups_source);
        
        String actual_parent_dups_firstName = actual_parent_dups._firstName;
        assertNull(actual_parent_dups_firstName);
        
        String actual_parent_dups_secondName = actual_parent_dups._secondName;
        assertNull(actual_parent_dups_secondName);
        
        HashSet actual_parent_dups_seen = actual_parent_dups._seen;
        assertNull(actual_parent_dups_seen);
        
        JsonWriteContext expected_parent_child = expected_parent._child;
        JsonWriteContext actual_parent_child = actual_parent._child;
        assertTrue(deepEquals(expected_parent_child, actual_parent_child));
        DupDetector expected_parent_child_dups = expected_parent_child._dups;
        DupDetector actual_parent_child_dups = actual_parent_child._dups;
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        assertTrue(deepEquals(expected_parent_child_dups, actual_parent_child_dups));
        
        JsonWriteContext actual_parent_child_child = actual_parent_child._child;
        assertNull(actual_parent_child_child);
        
        String actual_parent_child_currentName = actual_parent_child._currentName;
        assertNull(actual_parent_child_currentName);
        
        Object actual_parent_child_currentValue = actual_parent_child._currentValue;
        assertNull(actual_parent_child_currentValue);
        
        boolean actual_parent_child_gotName = actual_parent_child._gotName;
        assertFalse(actual_parent_child_gotName);
        
        int expected_parent_child_type = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_child_type = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_child_type, actual_parent_child_type);
        
        int expected_parent_child_index = ((Integer) getFieldValue(expected_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_child_index = ((Integer) getFieldValue(actual_parent_child, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_child_index, actual_parent_child_index);
        
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        assertTrue(deepEquals(expected_parent, actual_parent));
        int expected_parent_type = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_parent_type = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_parent_type, actual_parent_type);
        
        int expected_parent_index = ((Integer) getFieldValue(expected_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_parent_index = ((Integer) getFieldValue(actual_parent, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_parent_index, actual_parent_index);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        JsonWriteContext finalJsonWriteContext_child = jsonWriteContext._child;
        
        assertFalse(initialJsonWriteContext_child == finalJsonWriteContext_child);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.getDupDetector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDupDetector()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#getDupDetector()}
 * @utbot.returnsFrom {@code return _dups;}
 *  */
    @Test
    public void testGetDupDetector_Return_dups() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        DupDetector actual = jsonWriteContext.getDupDetector();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method appendDesc(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): True}
 *  */
    @Test
    public void testAppendDesc__typeEqualsTYPE_ARRAY() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        jsonWriteContext.appendDesc(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): True}
 *  */
    @Test
    public void testAppendDesc__typeEqualsTYPE_ARRAY_1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        StringBuilder stringBuilder = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        
        jsonWriteContext.appendDesc(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): True}
 * @utbot.executesCondition {@code (_currentName != null): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 *  */
    @Test
    public void testAppendDesc__currentNameNotEqualsNull() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        String _currentName = "";
        jsonWriteContext._currentName = _currentName;
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 2);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        jsonWriteContext.appendDesc(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 *  */
    @Test
    public void testAppendDesc__typeNotEqualsTYPE_ARRAY() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(-255, null, null);
        StringBuilder stringBuilder = new StringBuilder("");
        
        jsonWriteContext.appendDesc(stringBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): True}
 * @utbot.executesCondition {@code (_currentName != null): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 *  */
    @Test
    public void testAppendDesc__currentNameEqualsNull() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(2, null, null);
        StringBuilder stringBuilder = new StringBuilder("                               ");
        
        jsonWriteContext.appendDesc(stringBuilder);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method appendDesc(java.lang.StringBuilder)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append('{');
 *  */
    @Test
    public void testAppendDesc_ThrowNullPointerException() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(2, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc(JsonWriteContext.java:191) */
        jsonWriteContext.appendDesc(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append("/");
 *  */
    @Test
    public void testAppendDesc_ThrowNullPointerException_1() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(-255, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc(JsonWriteContext.java:207) */
        jsonWriteContext.appendDesc(null);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#appendDesc(java.lang.StringBuilder)}
 * @utbot.executesCondition {@code (_type == TYPE_OBJECT): False}
 * @utbot.executesCondition {@code (_type == TYPE_ARRAY): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sb.append('[');
 *  */
    @Test
    public void testAppendDesc_ThrowNullPointerException_2() {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(1, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.JsonWriteContext.appendDesc(JsonWriteContext.java:202) */
        jsonWriteContext.appendDesc(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.writeFieldName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method writeFieldName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.executesCondition {@code (_gotName): True}
 * @utbot.returnsFrom {@code return JsonWriteContext.STATUS_EXPECT_VALUE;}
 *  */
    @Test
    public void testWriteFieldName__gotName() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        jsonWriteContext._gotName = true;
        
        int actual = jsonWriteContext.writeFieldName(null);
        
        assertEquals(4, actual);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.executesCondition {@code (_gotName): False}
 * @utbot.executesCondition {@code (_dups != null): False}
 * @utbot.executesCondition {@code ((_index < 0)): False}
 * @utbot.returnsFrom {@code return (_index < 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_COMMA;}
 *  */
    @Test
    public void testWriteFieldName__indexGreaterOrEqualZero() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        
        int actual = jsonWriteContext.writeFieldName(null);
        
        assertEquals(1, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.executesCondition {@code (_gotName): False}
 * @utbot.executesCondition {@code (_dups != null): False}
 * @utbot.executesCondition {@code ((_index < 0)): True}
 * @utbot.returnsFrom {@code return (_index < 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_COMMA;}
 *  */
    @Test
    public void testWriteFieldName__indexLessThanZero() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        int actual = jsonWriteContext.writeFieldName(null);
        
        assertEquals(0, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.executesCondition {@code (_gotName): False}
 * @utbot.executesCondition {@code (_dups != null): True}
 * @utbot.executesCondition {@code ((_index < 0)): False}
 * @utbot.returnsFrom {@code return (_index < 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_COMMA;}
 *  */
    @Test
    public void testWriteFieldName__indexGreaterOrEqualZero_1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        jsonWriteContext._dups = _dups;
        
        int actual = jsonWriteContext.writeFieldName(null);
        
        assertEquals(1, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.executesCondition {@code (_gotName): False}
 * @utbot.executesCondition {@code (_dups != null): True}
 * @utbot.executesCondition {@code ((_index < 0)): False}
 * @utbot.returnsFrom {@code return (_index < 0) ? STATUS_OK_AS_IS : STATUS_OK_AFTER_COMMA;}
 *  */
    @Test
    public void testWriteFieldName__indexGreaterOrEqualZero_2() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000";
        _dups._firstName = _firstName;
        jsonWriteContext._dups = _dups;
        String string = "  ";
        
        int actual = jsonWriteContext.writeFieldName(string);
        
        assertEquals(1, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method writeFieldName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} when: _dups != null
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_ThrowJsonGenerationException() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        _dups._firstName = _firstName;
        jsonWriteContext._dups = _dups;
        
        jsonWriteContext.writeFieldName(_firstName);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#writeFieldName(java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} when: _dups != null
 *  */
    @Test(expected = JsonGenerationException.class)
    public void testWriteFieldName_ThrowJsonGenerationException_1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000";
        _dups._firstName = _firstName;
        String _secondName = "  ";
        _dups._secondName = _secondName;
        jsonWriteContext._dups = _dups;
        
        jsonWriteContext.writeFieldName(_secondName);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method writeFieldName(java.lang.String)
    
    @Test
    public void testWriteFieldName1() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _dups._firstName = _firstName;
        _dups._secondName = _firstName;
        jsonWriteContext._dups = _dups;
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        int actual = jsonWriteContext.writeFieldName(string);
        
        assertEquals(1, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    
    @Test
    public void testWriteFieldName2() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        jsonWriteContext._dups = _dups;
        setField(jsonWriteContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", Integer.MIN_VALUE);
        
        int actual = jsonWriteContext.writeFieldName(null);
        
        assertEquals(0, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    
    @Test
    public void testWriteFieldName3() throws Exception  {
        JsonWriteContext jsonWriteContext = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        DupDetector _dups = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        _dups._firstName = _firstName;
        _dups._secondName = _firstName;
        HashSet _seen = new HashSet();
        _dups._seen = _seen;
        jsonWriteContext._dups = _dups;
        String string = "\u0000";
        
        int actual = jsonWriteContext.writeFieldName(string);
        
        assertEquals(1, actual);
        
        boolean finalJsonWriteContext_gotName = jsonWriteContext._gotName;
        
        assertTrue(finalJsonWriteContext_gotName);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.withDupDetector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method withDupDetector(com.fasterxml.jackson.core.json.DupDetector)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#withDupDetector(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testWithDupDetector_Return() throws Exception  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        JsonWriteContext actual = jsonWriteContext.withDupDetector(null);
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector actual_dups = actual._dups;
        assertNull(actual_dups);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int expected_type = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_type, actual_type);
        
        int expected_index = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_index, actual_index);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext._checkDup
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _checkDup(com.fasterxml.jackson.core.json.DupDetector, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#_checkDup(com.fasterxml.jackson.core.json.DupDetector,java.lang.String)}
 *  */
    @Test
    public void test_checkDup() throws Exception  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        DupDetector dupDetector = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class stringType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, stringType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = dupDetector;
        _checkDupMethodArguments[1] = ((Object) null);
        _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#_checkDup(com.fasterxml.jackson.core.json.DupDetector,java.lang.String)}
 *  */
    @Test
    public void test_checkDup_1() throws Exception  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        DupDetector dupDetector = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000";
        dupDetector._firstName = _firstName;
        String string = "  ";
        
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class stringType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, stringType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = dupDetector;
        _checkDupMethodArguments[1] = string;
        _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _checkDup(com.fasterxml.jackson.core.json.DupDetector, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#_checkDup(com.fasterxml.jackson.core.json.DupDetector,java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.DupDetector#isDup(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: dd.isDup(name)
 *  */
    @Test
    public void test_checkDup_ThrowNullPointerException() throws Throwable  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        
        /* This test fails because method [com.fasterxml.jackson.core.json.JsonWriteContext._checkDup] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.JsonWriteContext._checkDup(JsonWriteContext.java:163) */
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class stringType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, stringType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = ((Object) null);
        _checkDupMethodArguments[1] = ((Object) null);
        try {
            _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method _checkDup(com.fasterxml.jackson.core.json.DupDetector, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#_checkDup(com.fasterxml.jackson.core.json.DupDetector,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} when: dd.isDup(name)
 *  */
    @Test(expected = JsonGenerationException.class)
    public void test_checkDup_ThrowJsonGenerationException() throws Throwable  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        DupDetector dupDetector = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        dupDetector._firstName = _firstName;
        
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class _firstNameType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, _firstNameType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = dupDetector;
        _checkDupMethodArguments[1] = _firstName;
        try {
            _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#_checkDup(com.fasterxml.jackson.core.json.DupDetector,java.lang.String)}
 * @utbot.throwsException {@link com.fasterxml.jackson.core.JsonGenerationException} when: dd.isDup(name)
 *  */
    @Test(expected = JsonGenerationException.class)
    public void test_checkDup_ThrowJsonGenerationException_1() throws Throwable  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        DupDetector dupDetector = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\uFF80";
        dupDetector._firstName = _firstName;
        String _secondName = " ";
        dupDetector._secondName = _secondName;
        
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class _secondNameType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, _secondNameType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = dupDetector;
        _checkDupMethodArguments[1] = _secondName;
        try {
            _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _checkDup(com.fasterxml.jackson.core.json.DupDetector, java.lang.String)
    
    @Test
    public void test_checkDup1() throws Exception  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        DupDetector dupDetector = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        dupDetector._firstName = _firstName;
        dupDetector._secondName = _firstName;
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class stringType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, stringType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = dupDetector;
        _checkDupMethodArguments[1] = string;
        _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
    }
    
    @Test
    public void test_checkDup2() throws Exception  {
        JsonWriteContext jsonWriteContext = new JsonWriteContext(0, null, null);
        DupDetector dupDetector = ((DupDetector) createInstance("com.fasterxml.jackson.core.json.DupDetector"));
        String _firstName = "";
        dupDetector._firstName = _firstName;
        dupDetector._secondName = _firstName;
        HashSet _seen = new HashSet();
        dupDetector._seen = _seen;
        String string = "\u0000";
        
        Class jsonWriteContextClazz = Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext");
        Class dupDetectorType = Class.forName("com.fasterxml.jackson.core.json.DupDetector");
        Class stringType = Class.forName("java.lang.String");
        Method _checkDupMethod = jsonWriteContextClazz.getDeclaredMethod("_checkDup", dupDetectorType, stringType);
        _checkDupMethod.setAccessible(true);
        java.lang.Object[] _checkDupMethodArguments = new java.lang.Object[2];
        _checkDupMethodArguments[0] = dupDetector;
        _checkDupMethodArguments[1] = string;
        _checkDupMethod.invoke(jsonWriteContext, _checkDupMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createRootContext(com.fasterxml.jackson.core.json.DupDetector)
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createRootContext(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code return new JsonWriteContext(TYPE_ROOT, null, dd);}
 *  */
    @Test
    public void testCreateRootContext_Return() throws Exception  {
        JsonWriteContext actual = JsonWriteContext.createRootContext(null);
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector actual_dups = actual._dups;
        assertNull(actual_dups);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int expected_type = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_type, actual_type);
        
        int expected_index = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_index, actual_index);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createRootContext()
    
    /**
    @utbot.classUnderTest {@link JsonWriteContext}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.core.json.JsonWriteContext#createRootContext()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.json.JsonWriteContext#createRootContext(com.fasterxml.jackson.core.json.DupDetector)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testCreateRootContext_JsonWriteContextCreateRootContext() throws Exception  {
        JsonWriteContext actual = JsonWriteContext.createRootContext();
        
        JsonWriteContext expected = ((JsonWriteContext) createInstance("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setField(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -1);
        
        JsonWriteContext actual_parent = actual._parent;
        assertNull(actual_parent);
        
        DupDetector actual_dups = actual._dups;
        assertNull(actual_dups);
        
        JsonWriteContext actual_child = actual._child;
        assertNull(actual_child);
        
        String actual_currentName = actual._currentName;
        assertNull(actual_currentName);
        
        Object actual_currentValue = actual._currentValue;
        assertNull(actual_currentValue);
        
        boolean actual_gotName = actual._gotName;
        assertFalse(actual_gotName);
        
        int expected_type = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int actual_type = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        assertEquals(expected_type, actual_type);
        
        int expected_index = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int actual_index = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        assertEquals(expected_index, actual_index);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1023375802337200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1023375802337200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1023375802345600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023375802337200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023375802345600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1023375802695900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1023375802695900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1023375802700400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1023375802695900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1023375802700400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

