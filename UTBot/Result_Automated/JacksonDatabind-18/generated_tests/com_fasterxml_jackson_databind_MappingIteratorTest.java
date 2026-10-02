package com.fasterxml.jackson.databind;

import org.junit.Test;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.core.util.JsonParserDelegate;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import java.io.InputStreamReader;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.FormatSchema;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_fasterxml_jackson_databind_MappingIteratorTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.remove
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method remove()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#remove()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: throw new UnsupportedOperationException();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemove_ThrowUnsupportedOperationException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        mappingIterator.remove();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.hasNext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasNext()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNext()}
 * @utbot.returnsFrom {@code return hasNextValue();}
 *  */
    @Test
    public void testHasNext_ReturnHasNextValue_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        mappingIterator._hasNextChecked = true;
        
        boolean actual = mappingIterator.hasNext();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNext()}
 * @utbot.returnsFrom {@code return hasNextValue();}
 *  */
    @Test
    public void testHasNext_ReturnHasNextValue() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        boolean actual = mappingIterator.hasNext();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNext()}
 * @utbot.returnsFrom {@code return hasNextValue();}
 *  */
    @Test
    public void testHasNext_ReturnHasNextValue_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        boolean actual = mappingIterator.hasNext();
        
        assertTrue(actual);
        
        boolean finalMappingIterator_hasNextChecked = mappingIterator._hasNextChecked;
        
        assertTrue(finalMappingIterator_hasNextChecked);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasNext()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNext()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHasNext_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1864)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218)
            com.fasterxml.jackson.databind.MappingIterator.hasNext(MappingIterator.java:162) */
        mappingIterator.hasNext();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNext()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHasNext_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\t'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNext] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1884)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218)
            com.fasterxml.jackson.databind.MappingIterator.hasNext(MappingIterator.java:162) */
        mappingIterator.hasNext();
    }
    ///endregion
    
    ///region Errors report for hasNext
    
    public void testHasNext_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final boolean sun.nio.cs.StreamDecoder.$assertionsDisabled accessible: module
        java.base does not "opens sun.nio.cs" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.next
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method next()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#next()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return nextValue();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testNext_ThrowNoSuchElementException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.next();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#next()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return nextValue();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testNext_ThrowNoSuchElementException_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        mappingIterator.next();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.executesCondition {@code (_parser != null): True}
 *  */
    @Test
    public void testClose__parserNotEqualsNull_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(_parser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed", true);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        mappingIterator.close();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.executesCondition {@code (_parser != null): False}
 *  */
    @Test
    public void testClose__parserEqualsNull() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        mappingIterator.close();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.executesCondition {@code (_parser != null): True}
 *  */
    @Test
    public void testClose__parserNotEqualsNull() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        mappingIterator.close();
        
        JsonParser jsonParser = mappingIterator._parser;
        boolean finalMappingIterator_parser_closed = ((Boolean) getFieldValue(jsonParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed"));
        
        assertTrue(finalMappingIterator_parser_closed);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.executesCondition {@code (_parser != null): True}
 *  */
    @Test
    public void testClose__parserNotEqualsNull_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        mappingIterator.close();
        
        JsonParser jsonParser = mappingIterator._parser;
        JsonParser jsonParser_parserDelegate = ((JsonParser) getFieldValue(jsonParser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate"));
        boolean finalMappingIterator_parserDelegate_closed = ((Boolean) getFieldValue(jsonParser_parserDelegate, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_closed"));
        
        assertTrue(finalMappingIterator_parserDelegate_closed);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: _parser.close();
 *  */
    @Test
    public void testClose_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserSequence", "_nextParser", -1);
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.close] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:142)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:93)
            com.fasterxml.jackson.databind.MappingIterator.close(MappingIterator.java:190) */
        mappingIterator.close();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testClose_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserSequence", "_nextParser", -1);
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.close] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:142)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:93)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:93)
            com.fasterxml.jackson.databind.MappingIterator.close(MappingIterator.java:190) */
        mappingIterator.close();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#close()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testClose_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        com.fasterxml.jackson.core.JsonParser[] _parsers = {};
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserSequence", "_parsers", _parsers);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserSequence", "_nextParser", -1);
        JsonParserDelegate delegate2 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate3 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.close] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            com.fasterxml.jackson.core.util.JsonParserSequence.switchToNext(JsonParserSequence.java:142)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:93)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:93)
            com.fasterxml.jackson.core.util.JsonParserSequence.close(JsonParserSequence.java:93)
            com.fasterxml.jackson.databind.MappingIterator.close(MappingIterator.java:190) */
        mappingIterator.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.emptyIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method emptyIterator()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#emptyIterator()}
 * @utbot.returnsFrom {@code return (MappingIterator<T>) EMPTY_ITERATOR;}
 *  */
    @Test
    public void testEmptyIterator_ReturnEMPTY_ITERATOR() throws Exception  {
        MappingIterator prevEMPTY_ITERATOR = MappingIterator.EMPTY_ITERATOR;
        try {
            MappingIterator emptyIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
            Class mappingIteratorClazz = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
            setStaticField(mappingIteratorClazz, "EMPTY_ITERATOR", emptyIterator);
            
            MappingIterator actual = MappingIterator.emptyIterator();
            
            JavaType actual_type = actual._type;
            assertNull(actual_type);
            
            DeserializationContext actual_context = actual._context;
            assertNull(actual_context);
            
            JsonDeserializer actual_deserializer = actual._deserializer;
            assertNull(actual_deserializer);
            
            JsonParser actual_parser = actual._parser;
            assertNull(actual_parser);
            
            Object actual_updatedValue = actual._updatedValue;
            assertNull(actual_updatedValue);
            
            boolean actual_closeParser = actual._closeParser;
            assertFalse(actual_closeParser);
            
            boolean actual_hasNextChecked = actual._hasNextChecked;
            assertFalse(actual_hasNextChecked);
            
        } finally {
            setStaticField(MappingIterator.class, "EMPTY_ITERATOR", prevEMPTY_ITERATOR);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.nextValue
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextValue()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#nextValue()}
 * @utbot.executesCondition {@code (!_hasNextChecked): True}
 * @utbot.executesCondition {@code (!hasNextValue()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.MappingIterator#_throwNoSuchElement()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return _throwNoSuchElement();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testNextValue_ThrowNoSuchElementException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        mappingIterator.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#nextValue()}
 * @utbot.executesCondition {@code (!_hasNextChecked): False}
 * @utbot.executesCondition {@code (_parser == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.MappingIterator#_throwNoSuchElement()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: return _throwNoSuchElement();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void testNextValue_ThrowNoSuchElementException_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#nextValue()}
 * @utbot.executesCondition {@code (!_hasNextChecked): True}
 * @utbot.executesCondition {@code (!hasNextValue()): False}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (_updatedValue == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#clearCurrentToken()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNextValue_ThrowIllegalStateException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        DefaultDeserializationContext.Impl _context = ((DefaultDeserializationContext.Impl) createInstance("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_context", _context);
        TypeWrappedDeserializer _deserializer = ((TypeWrappedDeserializer) createInstance("com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer", "_deserializer", _deserializer);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_deserializer", _deserializer);
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        mappingIterator.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#nextValue()}
 * @utbot.executesCondition {@code (!_hasNextChecked): False}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (_updatedValue == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testNextValue_ThrowNullPointerException_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        Object _updatedValue = createInstance("java.lang.Object");
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_updatedValue", _updatedValue);
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#nextValue()}
 * @utbot.executesCondition {@code (!_hasNextChecked): True}
 * @utbot.executesCondition {@code (!hasNextValue()): False}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (_updatedValue == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testNextValue_ThrowNullPointerException_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        Object _updatedValue = createInstance("java.lang.Object");
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_updatedValue", _updatedValue);
        
        mappingIterator.nextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#nextValue()}
 * @utbot.executesCondition {@code (!_hasNextChecked): False}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (_updatedValue == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonDeserializer#deserialize(com.fasterxml.jackson.core.JsonParser,com.fasterxml.jackson.databind.DeserializationContext)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testNextValue_ThrowNullPointerException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.nextValue();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextValue()
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNextValue1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(_deserializer, "com.fasterxml.jackson.databind.deser.BeanDeserializerBase", "_vanillaProcessing", true);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_deserializer", _deserializer);
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[40];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '}';
        _inputBuffer[38] = '}';
        _inputBuffer[39] = '}';
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 45);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 47);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.nextValue();
    }
    
    @Test(expected = NullPointerException.class)
    public void testNextValue2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_deserializer", _deserializer);
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[39];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '}';
        _inputBuffer[5] = '}';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        _inputBuffer[15] = '}';
        _inputBuffer[16] = '}';
        _inputBuffer[17] = '}';
        _inputBuffer[18] = '}';
        _inputBuffer[19] = '}';
        _inputBuffer[20] = '}';
        _inputBuffer[21] = '}';
        _inputBuffer[22] = '}';
        _inputBuffer[23] = '}';
        _inputBuffer[24] = '}';
        _inputBuffer[25] = '}';
        _inputBuffer[26] = '}';
        _inputBuffer[27] = '}';
        _inputBuffer[28] = '}';
        _inputBuffer[29] = '}';
        _inputBuffer[30] = '}';
        _inputBuffer[31] = '}';
        _inputBuffer[32] = '}';
        _inputBuffer[33] = '}';
        _inputBuffer[34] = '}';
        _inputBuffer[35] = '}';
        _inputBuffer[36] = '}';
        _inputBuffer[37] = '\n';
        _inputBuffer[38] = '/';
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 37);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 39);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.nextValue();
    }
    
    @Test(expected = NullPointerException.class)
    public void testNextValue3() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        BeanDeserializer _deserializer = ((BeanDeserializer) createInstance("com.fasterxml.jackson.databind.deser.BeanDeserializer"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_deserializer", _deserializer);
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        InputStreamReader _reader = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = new char[17];
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", -2147483647);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        mappingIterator._hasNextChecked = true;
        
        mappingIterator.nextValue();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextValue()
    
    @Test
    public void testNextValue4() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = new char[15];
        _inputBuffer[0] = '}';
        _inputBuffer[1] = '}';
        _inputBuffer[2] = '}';
        _inputBuffer[3] = '}';
        _inputBuffer[4] = '\"';
        _inputBuffer[5] = '\r';
        _inputBuffer[6] = '}';
        _inputBuffer[7] = '}';
        _inputBuffer[8] = '}';
        _inputBuffer[9] = '}';
        _inputBuffer[10] = '}';
        _inputBuffer[11] = '}';
        _inputBuffer[12] = '}';
        _inputBuffer[13] = '}';
        _inputBuffer[14] = '}';
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 4);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 7);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.nextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:605)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218)
            com.fasterxml.jackson.databind.MappingIterator.nextValue(MappingIterator.java:237) */
        mappingIterator.nextValue();
    }
    
    @Test
    public void testNextValue5() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        InputStreamReader _reader = ((InputStreamReader) createInstance("java.io.InputStreamReader"));
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_reader", _reader);
        char[] _inputBuffer = {
            '\r', '}', '}', '}', '}', '}', '}', '}',
            '}'
        };
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", 0L);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.nextValue] produces [java.lang.NullPointerException]
            java.base/java.io.InputStreamReader.read(InputStreamReader.java:177)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.loadMore(ReaderBasedJsonParser.java:153)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1691)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1877)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218)
            com.fasterxml.jackson.databind.MappingIterator.nextValue(MappingIterator.java:237) */
        mappingIterator.nextValue();
    }
    ///endregion
    
    ///region Errors report for nextValue
    
    public void testNextValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.getCurrentLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _parser.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_parserGetCurrentLocation() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        UTF8StreamJsonParser _parser = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -2);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        JsonLocation actual = mappingIterator.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 9223372036854775805L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _parser.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_parserGetCurrentLocation_1() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
            TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
            
            JsonLocation actual = mappingIterator.getCurrentLocation();
            
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(na, actual);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getCurrentLocation()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.fasterxml.jackson.core.JsonParser#getCurrentLocation()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _parser.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_parserGetCurrentLocation_4() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
        JsonLocation _location = ((JsonLocation) createInstance("com.fasterxml.jackson.core.JsonLocation"));
        setField(delegate2, "com.fasterxml.jackson.databind.util.TokenBuffer$Parser", "_location", _location);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        JsonLocation actual = mappingIterator.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 0L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _parser.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_parserGetCurrentLocation_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate1 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -4);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -9223372036854775807L);
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        JsonLocation actual = mappingIterator.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 9223372036854775805L, -1L, 0, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _parser.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_parserGetCurrentLocation_3() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
            JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
            
            JsonLocation actual = mappingIterator.getCurrentLocation();
            
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(na, actual);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _parser.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_parserGetCurrentLocation_5() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
            JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            Object delegate2 = createInstance("com.fasterxml.jackson.databind.util.TokenBuffer$Parser");
            setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
            
            JsonLocation actual = mappingIterator.getCurrentLocation();
            
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(na, actual);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getCurrentLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getCurrentLocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parser.getCurrentLocation();
 *  */
    @Test
    public void testGetCurrentLocation_ThrowNullPointerException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.getCurrentLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.MappingIterator.getCurrentLocation(MappingIterator.java:343) */
        mappingIterator.getCurrentLocation();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    @Test
    public void testGetCurrentLocation1() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            String string = "N/A";
            JsonLocation na = new JsonLocation(string, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
            JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserSequence delegate = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserDelegate delegate1 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
            JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate6 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate7 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate8 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate11 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate12 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate13 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate14 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate15 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            JsonParserDelegate delegate16 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
            TreeTraversingParser delegate17 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            setField(delegate16, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate17);
            setField(delegate15, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate16);
            setField(delegate14, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate15);
            setField(delegate13, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate14);
            setField(delegate12, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate13);
            setField(delegate11, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate12);
            setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
            setField(delegate9, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate10);
            setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate9);
            setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
            setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
            setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
            setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
            setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
            setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
            setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
            setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
            setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
            setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
            
            JsonLocation actual = mappingIterator.getCurrentLocation();
            
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(na, actual);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    
    @Test
    public void testGetCurrentLocation2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate1 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate2 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate3 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate4 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate5 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate6 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate7 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate8 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate9 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate10 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate11 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate12 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate13 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate14 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserSequence delegate15 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate16 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate17 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserSequence delegate18 = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        JsonParserDelegate delegate19 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate20 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate21 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate22 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate23 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate24 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate25 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate26 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate27 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate28 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate29 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate30 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate31 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate32 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate33 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate34 = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        UTF8StreamJsonParser delegate35 = ((UTF8StreamJsonParser) createInstance("com.fasterxml.jackson.core.json.UTF8StreamJsonParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(delegate35, "com.fasterxml.jackson.core.base.ParserBase", "_ioContext", _ioContext);
        setField(delegate35, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 2147483644);
        setField(delegate35, "com.fasterxml.jackson.core.base.ParserBase", "_currInputProcessed", -2147221503L);
        setField(delegate35, "com.fasterxml.jackson.core.base.ParserBase", "_currInputRowStart", -3);
        setField(delegate34, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate35);
        setField(delegate33, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate34);
        setField(delegate32, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate33);
        setField(delegate31, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate32);
        setField(delegate30, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate31);
        setField(delegate29, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate30);
        setField(delegate28, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate29);
        setField(delegate27, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate28);
        setField(delegate26, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate27);
        setField(delegate25, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate26);
        setField(delegate24, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate25);
        setField(delegate23, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate24);
        setField(delegate22, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate23);
        setField(delegate21, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate22);
        setField(delegate20, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate21);
        setField(delegate19, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate20);
        setField(delegate18, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate19);
        setField(delegate17, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate18);
        setField(delegate16, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate17);
        setField(delegate15, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate16);
        setField(delegate14, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate15);
        setField(delegate13, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate14);
        setField(delegate12, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate13);
        setField(delegate11, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate12);
        setField(delegate10, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate11);
        setField(delegate9, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate10);
        setField(delegate8, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate9);
        setField(delegate7, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate8);
        setField(delegate6, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate7);
        setField(delegate5, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate6);
        setField(delegate4, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate5);
        setField(delegate3, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate4);
        setField(delegate2, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate3);
        setField(delegate1, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate2);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        JsonLocation actual = mappingIterator.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, 262141L, -1L, 0, Integer.MIN_VALUE);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getCurrentLocation()
    
    @Test(expected = StackOverflowError.class)
    public void testGetCurrentLocation3() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", _parser);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        mappingIterator.getCurrentLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator._handleIOException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleIOException(java.io.IOException)
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#_handleIOException(java.io.IOException)}
 * @utbot.invokes {@link java.io.IOException#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new RuntimeException(e.getMessage(), e);
 *  */
    @Test
    public void test_handleIOException_ThrowNullPointerException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator._handleIOException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.MappingIterator._handleIOException(MappingIterator.java:364) */
        mappingIterator._handleIOException(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.getParserSchema
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParserSchema()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getParserSchema()}
 * @utbot.returnsFrom {@code return _parser.getSchema();}
 *  */
    @Test
    public void testGetParserSchema_Return_parserGetSchema() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        FormatSchema actual = mappingIterator.getParserSchema();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getParserSchema()}
 * @utbot.returnsFrom {@code return _parser.getSchema();}
 *  */
    @Test
    public void testGetParserSchema_Return_parserGetSchema_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        FormatSchema actual = mappingIterator.getParserSchema();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getParserSchema()}
 * @utbot.returnsFrom {@code return _parser.getSchema();}
 *  */
    @Test
    public void testGetParserSchema_Return_parserGetSchema_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        FormatSchema actual = mappingIterator.getParserSchema();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getParserSchema()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getParserSchema()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonParser#getSchema()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _parser.getSchema();
 *  */
    @Test
    public void testGetParserSchema_ThrowNullPointerException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.getParserSchema] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.MappingIterator.getParserSchema(MappingIterator.java:329) */
        mappingIterator.getParserSchema();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.hasNextValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasNextValue()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (!_hasNextChecked): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasNextValue__hasNextChecked() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserSequence _parser = ((JsonParserSequence) createInstance("com.fasterxml.jackson.core.util.JsonParserSequence"));
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        mappingIterator._hasNextChecked = true;
        
        boolean actual = mappingIterator.hasNextValue();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.executesCondition {@code (_parser == null): True}
 *  */
    @Test
    public void testHasNextValue__parserEqualsNull() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        boolean actual = mappingIterator.hasNextValue();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (!_hasNextChecked): True}
 * @utbot.executesCondition {@code (t == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasNextValue_TNotEqualsNull_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        TreeTraversingParser _parser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(_parser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        boolean actual = mappingIterator.hasNextValue();
        
        assertTrue(actual);
        
        boolean finalMappingIterator_hasNextChecked = mappingIterator._hasNextChecked;
        
        assertTrue(finalMappingIterator_hasNextChecked);
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.executesCondition {@code (_parser == null): False}
 * @utbot.executesCondition {@code (!_hasNextChecked): True}
 * @utbot.executesCondition {@code (t == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testHasNextValue_TNotEqualsNull() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        JsonParserDelegate _parser = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        JsonParserDelegate delegate = ((JsonParserDelegate) createInstance("com.fasterxml.jackson.core.util.JsonParserDelegate"));
        TreeTraversingParser delegate1 = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(delegate1, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        setField(delegate, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate1);
        setField(_parser, "com.fasterxml.jackson.core.util.JsonParserDelegate", "delegate", delegate);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        boolean actual = mappingIterator.hasNextValue();
        
        assertTrue(actual);
        
        boolean finalMappingIterator_hasNextChecked = mappingIterator._hasNextChecked;
        
        assertTrue(finalMappingIterator_hasNextChecked);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasNextValue()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: t = _parser.nextToken();
 *  */
    @Test
    public void testHasNextValue_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1654)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218) */
        mappingIterator.hasNextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: t = _parser.nextToken();
 *  */
    @Test
    public void testHasNextValue_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", -1);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1864)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218) */
        mappingIterator.hasNextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHasNextValue_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\\'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_tokenIncomplete", true);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._decodeEscaped(ReaderBasedJsonParser.java:2026)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipString(ReaderBasedJsonParser.java:1663)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:575)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218) */
        mappingIterator.hasNextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testHasNextValue_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\t', '\r'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCR(ReaderBasedJsonParser.java:1692)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1897)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218) */
        mappingIterator.hasNextValue();
    }
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#hasNextValue()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: t = _parser.nextToken();
 *  */
    @Test
    public void testHasNextValue_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\t'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 3);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.hasNextValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1884)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218) */
        mappingIterator.hasNextValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.readAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readAll(java.util.List)
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#readAll(java.util.List)}
 * @utbot.returnsFrom {@code return resultList;}
 *  */
    @Test
    public void testReadAll_HasNextValue() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        List actual = mappingIterator.readAll(((List) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.readAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readAll()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#readAll()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.MappingIterator#readAll(java.util.List)}
 * @utbot.returnsFrom {@code return readAll(new ArrayList<T>());}
 *  */
    @Test
    public void testReadAll_MappingIteratorReadAll() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        ArrayList actual = ((ArrayList) mappingIterator.readAll());
        
        ArrayList expected = new ArrayList();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readAll()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#readAll()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.MappingIterator#readAll(java.util.List)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return readAll(new ArrayList<T>());
 *  */
    @Test
    public void testReadAll_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        ReaderBasedJsonParser _parser = ((ReaderBasedJsonParser) createInstance("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] _inputBuffer = {'\u0000', '\u0000'};
        setField(_parser, "com.fasterxml.jackson.core.json.ReaderBasedJsonParser", "_inputBuffer", _inputBuffer);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputPtr", 1073741823);
        setField(_parser, "com.fasterxml.jackson.core.base.ParserBase", "_inputEnd", 1073741824);
        setField(mappingIterator, "com.fasterxml.jackson.databind.MappingIterator", "_parser", _parser);
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator.readAll] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741823 out of bounds for length 2]
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipWSOrEnd(ReaderBasedJsonParser.java:1864)
            com.fasterxml.jackson.core.json.ReaderBasedJsonParser.nextToken(ReaderBasedJsonParser.java:577)
            com.fasterxml.jackson.databind.MappingIterator.hasNextValue(MappingIterator.java:218)
            com.fasterxml.jackson.databind.MappingIterator.readAll(MappingIterator.java:286)
            com.fasterxml.jackson.databind.MappingIterator.readAll(MappingIterator.java:273) */
        mappingIterator.readAll();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.readAll
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readAll(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#readAll(java.util.Collection)}
 * @utbot.returnsFrom {@code return results;}
 *  */
    @Test
    public void testReadAll_HasNextValue1() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        Collection actual = mappingIterator.readAll(((Collection) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator.getParser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParser()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#getParser()}
 * @utbot.returnsFrom {@code return _parser;}
 *  */
    @Test
    public void testGetParser_Return_parser() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        JsonParser actual = mappingIterator.getParser();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator._throwNoSuchElement
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _throwNoSuchElement()
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#_throwNoSuchElement()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: throw new NoSuchElementException();
 *  */
    @Test(expected = NoSuchElementException.class)
    public void test_throwNoSuchElement_ThrowNoSuchElementException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        mappingIterator._throwNoSuchElement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.MappingIterator._handleMappingException
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleMappingException(com.fasterxml.jackson.databind.JsonMappingException)
    
    /**
    @utbot.classUnderTest {@link MappingIterator}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.MappingIterator#_handleMappingException(com.fasterxml.jackson.databind.JsonMappingException)}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonMappingException#getMessage()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: throw new RuntimeJsonMappingException(e.getMessage(), e);
 *  */
    @Test
    public void test_handleMappingException_ThrowNullPointerException() throws Exception  {
        MappingIterator mappingIterator = ((MappingIterator) createInstance("com.fasterxml.jackson.databind.MappingIterator"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.MappingIterator._handleMappingException] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.MappingIterator._handleMappingException(MappingIterator.java:360) */
        mappingIterator._handleMappingException(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1067176538633400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1067176538633400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1067176538648000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067176538633400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067176538648000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1067176539290600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1067176539290600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1067176539295400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067176539290600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067176539295400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1067176539843099 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1067176539843099.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1067176539849900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1067176539843099.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1067176539849900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

