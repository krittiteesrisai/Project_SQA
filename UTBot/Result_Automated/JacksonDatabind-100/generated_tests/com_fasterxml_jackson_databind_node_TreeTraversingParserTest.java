package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.NodeCursor.RootCursor;
import com.fasterxml.jackson.databind.node.NodeCursor.ArrayCursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import com.fasterxml.jackson.databind.node.NodeCursor.ObjectCursor;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.RequestPayload;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParseException;
import java.util.zip.ZipOutputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.io.IOException;
import java.util.jar.JarOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.jar.JarEntry;
import com.fasterxml.jackson.core.Base64Variant;
import java.io.ObjectOutputStream;
import com.fasterxml.jackson.databind.JsonNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_databind_node_TreeTraversingParserTest {
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.version
    
    ///region Errors report for version
    
    public void testVersion_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field static final java.util.regex.Pattern$Node java.util.regex.Pattern.lastAccept accessible: module
        java.base does not "opens java.util.regex" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextToken()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): True}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__nextTokenNotEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _nextToken = JsonToken.NOT_AVAILABLE;
        treeTraversingParser._nextToken = _nextToken;
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        assertEquals(_nextToken, actual);
        
        JsonToken finalTreeTraversingParser_nextToken = treeTraversingParser._nextToken;
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalTreeTraversingParser_nextToken);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): True}
 * @utbot.executesCondition {@code ((_currToken == JsonToken.START_OBJECT)): True}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenEqualsJsonTokenSTART_OBJECT() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.END_OBJECT;
        
        assertEquals(expected, actual);
        
        boolean finalTreeTraversingParser_startContainer = treeTraversingParser._startContainer;
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
        
        assertFalse(finalTreeTraversingParser_startContainer);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): True}
 * @utbot.executesCondition {@code ((_currToken == JsonToken.START_OBJECT)): False}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenNotEqualsJsonTokenSTART_OBJECT() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.END_ARRAY;
        
        assertEquals(expected, actual);
        
        boolean finalTreeTraversingParser_startContainer = treeTraversingParser._startContainer;
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
        
        assertFalse(finalTreeTraversingParser_startContainer);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): False}
 * @utbot.executesCondition {@code (_nodeCursor == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testNextToken__nodeCursorEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        assertNull(actual);
        
        boolean finalTreeTraversingParser_closed = treeTraversingParser._closed;
        
        assertTrue(finalTreeTraversingParser_closed);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): False}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): False}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenNotEqualsJsonTokenSTART_OBJECTOr_currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.VALUE_TRUE;
        
        assertEquals(expected, actual);
        
        NodeCursor nodeCursor = treeTraversingParser._nodeCursor;
        boolean finalTreeTraversingParser_nodeCursor_done = ((Boolean) getFieldValue(nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_done"));
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertTrue(finalTreeTraversingParser_nodeCursor_done);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): False}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): False}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenNotEqualsJsonTokenSTART_OBJECTOr_currTokenNotEqualsJsonTokenSTART_ARRAY_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.VALUE_FALSE;
        
        assertEquals(expected, actual);
        
        NodeCursor nodeCursor = treeTraversingParser._nodeCursor;
        boolean finalTreeTraversingParser_nodeCursor_done = ((Boolean) getFieldValue(nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_done"));
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertTrue(finalTreeTraversingParser_nodeCursor_done);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): False}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): False}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenNotEqualsJsonTokenSTART_OBJECTOr_currTokenNotEqualsJsonTokenSTART_ARRAY_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.VALUE_NULL;
        
        assertEquals(expected, actual);
        
        NodeCursor nodeCursor = treeTraversingParser._nodeCursor;
        boolean finalTreeTraversingParser_nodeCursor_done = ((Boolean) getFieldValue(nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_done"));
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertTrue(finalTreeTraversingParser_nodeCursor_done);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): True}
 * @utbot.executesCondition {@code ((_currToken == JsonToken.START_OBJECT)): False}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenNotEqualsJsonTokenSTART_OBJECT_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        ArrayNode _currentNode = ((ArrayNode) createInstance("com.fasterxml.jackson.databind.node.ArrayNode"));
        ArrayList _children = new ArrayList();
        setField(_currentNode, "com.fasterxml.jackson.databind.node.ArrayNode", "_children", _children);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.END_ARRAY;
        
        assertEquals(expected, actual);
        
        boolean finalTreeTraversingParser_startContainer = treeTraversingParser._startContainer;
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
        
        assertFalse(finalTreeTraversingParser_startContainer);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_startContainer): False}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.executesCondition {@code (_currToken != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#endToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#getParent()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken__currTokenEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        _nodeCursor._done = true;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        assertNull(actual);
        
        NodeCursor finalTreeTraversingParser_nodeCursor = treeTraversingParser._nodeCursor;
        
        assertNull(finalTreeTraversingParser_nodeCursor);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextToken()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_startContainer): True}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#currentHasChildren()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: !_nodeCursor.currentHasChildren()
 *  */
    @Test
    public void testNextToken_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken] produces [java.lang.ClassCastException: class com.fasterxml.jackson.databind.node.BooleanNode cannot be cast to class com.fasterxml.jackson.databind.node.ContainerNode (com.fasterxml.jackson.databind.node.BooleanNode and com.fasterxml.jackson.databind.node.ContainerNode are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor.currentHasChildren(NodeCursor.java:184)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131) */
        treeTraversingParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_startContainer): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_nodeCursor.currentHasChildren()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._startContainer = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:131) */
        treeTraversingParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#nextToken()}
 * @utbot.executesCondition {@code (_startContainer): False}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.executesCondition {@code (_currToken != null): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): True}
 * @utbot.executesCondition {@code (if (_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY) {
 *     _startContainer = true;
 * }): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#nextToken()}
 * @utbot.returnsFrom {@code return _currToken;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _currToken;
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        Iterator _contents = arrayList.iterator();
        _nodeCursor._contents = _contents;
        ArrayNode _currentNode = ((ArrayNode) createInstance("com.fasterxml.jackson.databind.node.ArrayNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor.nextToken(NodeCursor.java:171)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:149) */
        treeTraversingParser.nextToken();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextToken()
    
    @Test
    public void testNextToken1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        ArrayNode _currentNode = ((ArrayNode) createInstance("com.fasterxml.jackson.databind.node.ArrayNode"));
        ArrayList _children = new ArrayList();
        setField(_currentNode, "com.fasterxml.jackson.databind.node.ArrayNode", "_children", _children);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.END_OBJECT;
        
        assertEquals(expected, actual);
        
        boolean finalTreeTraversingParser_startContainer = treeTraversingParser._startContainer;
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
        
        assertFalse(finalTreeTraversingParser_startContainer);
    }
    
    @Test
    public void testNextToken2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        ObjectNode _currentNode = ((ObjectNode) createInstance("com.fasterxml.jackson.databind.node.ObjectNode"));
        LinkedHashMap _children = new LinkedHashMap();
        BooleanNode booleanNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        _children.put(null, booleanNode);
        setField(_currentNode, "com.fasterxml.jackson.databind.node.ObjectNode", "_children", _children);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        
        NodeCursor initialTreeTraversingParser_nodeCursor = treeTraversingParser._nodeCursor;
        
        JsonToken actual = treeTraversingParser.nextToken();
        
        JsonToken expected = JsonToken.FIELD_NAME;
        
        assertEquals(expected, actual);
        
        NodeCursor finalTreeTraversingParser_nodeCursor = treeTraversingParser._nodeCursor;
        boolean finalTreeTraversingParser_startContainer = treeTraversingParser._startContainer;
        
        assertFalse(initialTreeTraversingParser_nodeCursor == finalTreeTraversingParser_nodeCursor);
        
        assertFalse(finalTreeTraversingParser_startContainer);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextToken()
    
    @Test
    public void testNextToken3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        ArrayNode _currentNode = ((ArrayNode) createInstance("com.fasterxml.jackson.databind.node.ArrayNode"));
        ArrayList _children = new ArrayList();
        _children.add(null);
        _children.add(null);
        _children.add(null);
        setField(_currentNode, "com.fasterxml.jackson.databind.node.ArrayNode", "_children", _children);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        treeTraversingParser._startContainer = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor.nextToken(NodeCursor.java:171)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.nextToken(TreeTraversingParser.java:137) */
        treeTraversingParser.nextToken();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#close()}
 * @utbot.executesCondition {@code (!_closed): False}
 *  */
    @Test
    public void testClose__closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        treeTraversingParser.close();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 *  */
    @Test
    public void testClose_Not_closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.close();
        
        boolean finalTreeTraversingParser_closed = treeTraversingParser._closed;
        
        assertTrue(finalTreeTraversingParser_closed);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN__closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_NotNNotInstanceOfNumericNode() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_NotNNotInstanceOfNumericNode_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        FloatNode _node = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.FloatNode", "_value", java.lang.Float.NaN);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        FloatNode _node = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.FloatNode", "_value", -2.0000002f);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        FloatNode _node = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.FloatNode", "_value", java.lang.Float.NEGATIVE_INFINITY);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_NotNNotInstanceOfNumericNode_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        DoubleNode _currentNode = ((DoubleNode) createInstance("com.fasterxml.jackson.databind.node.DoubleNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.DoubleNode", "_value", java.lang.Double.NaN);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        DoubleNode _currentNode = ((DoubleNode) createInstance("com.fasterxml.jackson.databind.node.DoubleNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.DoubleNode", "_value", java.lang.Double.NEGATIVE_INFINITY);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        DoubleNode _currentNode = ((DoubleNode) createInstance("com.fasterxml.jackson.databind.node.DoubleNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.DoubleNode", "_value", -2.0000000000000004);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): True}
 * @utbot.returnsFrom {@code return ((NumericNode) n).isNaN();}
 *  */
    @Test
    public void testIsNaN_NInstanceOfNumericNode_6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        IntNode _currentNode = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_NotNNotInstanceOfNumericNode_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (n instanceof NumericNode): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNaN_NotNNotInstanceOfNumericNode_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BinaryNode value = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        boolean actual = treeTraversingParser.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNaN()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonNode n = currentNode();
 *  */
    @Test
    public void testIsNaN_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        byte[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.isNaN] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.isNaN(TreeTraversingParser.java:340) */
        treeTraversingParser.isNaN();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isNaN()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testIsNaN_ThrowClassCastException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(e, "java.util.KeyValueHolder", "value", value);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.isNaN] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:122)
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:116)
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.isNaN(TreeTraversingParser.java:340) */
        treeTraversingParser.isNaN();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 *  */
    @Test
    public void testGetTextLength() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = treeTraversingParser.getTextLength();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return getText().length();}
 *  */
    @Test
    public void testGetTextLength_StringLength() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = treeTraversingParser.getTextLength();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTextLength()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:234)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextLength()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().length();
 *  */
    @Test
    public void testGetTextLength_ThrowNullPointerException_7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        TextNode _node = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    @Test
    public void testGetTextLength1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        IntNode _currentNode = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.IntNode", "_value", 1);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = treeTraversingParser.getTextLength();
        
        assertEquals(1, actual);
    }
    
    @Test
    public void testGetTextLength2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        FloatNode _node = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.FloatNode", "_value", 0.0f);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = treeTraversingParser.getTextLength();
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testGetTextLength3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        FloatNode _currentNode = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.FloatNode", "_value", 0.0f);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = treeTraversingParser.getTextLength();
        
        assertEquals(3, actual);
    }
    
    @Test
    public void testGetTextLength4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        String _currentName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        _nodeCursor._currentName = _currentName;
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = treeTraversingParser.getTextLength();
        
        assertEquals(10, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextLength()
    
    @Test
    public void testGetTextLength5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:237)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    @Test
    public void testGetTextLength6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    @Test
    public void testGetTextLength7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:234)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    
    @Test
    public void testGetTextLength8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        TextNode _currentNode = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextLength(TreeTraversingParser.java:256) */
        treeTraversingParser.getTextLength();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getText()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetText__closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 *  */
    @Test
    public void testGetText_Not_closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        String expected = "]";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.executesCondition {@code ((_currToken == null)): False}
 * @utbot.returnsFrom {@code return (_currToken == null) ? null : _currToken.asString();}
 *  */
    @Test
    public void testGetText__currTokenNotEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.returnsFrom {@code return currentNode().textValue();}
 *  */
    @Test
    public void testGetText_Not_closed_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.executesCondition {@code ((_currToken == null)): False}
 * @utbot.returnsFrom {@code return (_currToken == null) ? null : _currToken.asString();}
 *  */
    @Test
    public void testGetText__currTokenNotEqualsNull_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.executesCondition {@code ((_currToken == null)): False}
 * @utbot.returnsFrom {@code return (_currToken == null) ? null : _currToken.asString();}
 *  */
    @Test
    public void testGetText__currTokenNotEqualsNull_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.JsonNode#numberValue()}
 * @utbot.activatesSwitch {@code switch(_currToken) case: VALUE_NUMBER_FLOAT}
 * @utbot.returnsFrom {@code return String.valueOf(currentNode().numberValue());}
 *  */
    @Test
    public void testGetText_StringValueOf() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#getCurrentName()}
 * @utbot.activatesSwitch {@code switch(_currToken) case: FIELD_NAME}
 * @utbot.returnsFrom {@code return _nodeCursor.getCurrentName();}
 *  */
    @Test
    public void testGetText_NodeCursorGetCurrentName() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.returnsFrom {@code return currentNode().textValue();}
 *  */
    @Test
    public void testGetText_Not_closed_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        TextNode _node = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getText()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_currToken)
 *  */
    @Test
    public void testGetText_ThrowNullPointerException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:230) */
        treeTraversingParser.getText();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return String.valueOf(currentNode().numberValue());
 *  */
    @Test
    public void testGetText_ThrowNullPointerException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:237) */
        treeTraversingParser.getText();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#getCurrentName()}
 * @utbot.activatesSwitch {@code switch(_currToken) case: FIELD_NAME}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _nodeCursor.getCurrentName();
 *  */
    @Test
    public void testGetText_ThrowNullPointerException_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:232) */
        treeTraversingParser.getText();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentNode().textValue();
 *  */
    @Test
    public void testGetText_ThrowNullPointerException_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:234) */
        treeTraversingParser.getText();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return String.valueOf(currentNode().numberValue());
 *  */
    @Test
    public void testGetText_ThrowNullPointerException_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:237) */
        treeTraversingParser.getText();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return currentNode().textValue();
 *  */
    @Test
    public void testGetText_ThrowNullPointerException_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:234) */
        treeTraversingParser.getText();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getText()
    
    @Test
    public void testGetText1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    
    @Test
    public void testGetText2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        FloatNode _node = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.FloatNode", "_value", 0.0f);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        String expected = "0.0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetText3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        IntNode _currentNode = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetText4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        TextNode _currentNode = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = treeTraversingParser.getText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getText()
    
    @Test
    public void testGetText5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:237) */
        treeTraversingParser.getText();
    }
    
    @Test
    public void testGetText6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getText] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:234) */
        treeTraversingParser.getText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.overrideCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_nodeCursor != null): True}
 *  */
    @Test
    public void testOverrideCurrentName__nodeCursorNotEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_nodeCursor != null): False}
 *  */
    @Test
    public void testOverrideCurrentName__nodeCursorEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_nodeCursor != null): True}
 *  */
    @Test
    public void testOverrideCurrentName__nodeCursorNotEqualsNull_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.overrideCurrentName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodec()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getCodec()}
 * @utbot.returnsFrom {@code return _objectCodec;}
 *  */
    @Test
    public void testGetCodec_Return_objectCodec() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        ObjectCodec actual = treeTraversingParser.getCodec();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.setCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCodec(com.fasterxml.jackson.core.ObjectCodec)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#setCodec(com.fasterxml.jackson.core.ObjectCodec)}
 *  */
    @Test
    public void testSetCodec() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.setCodec(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.skipChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipChildren()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#skipChildren()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSkipChildren__currTokenEqualsJsonTokenSTART_OBJECT() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        TreeTraversingParser actual = ((TreeTraversingParser) treeTraversingParser.skipChildren());
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        NodeCursor actual_nodeCursor = actual._nodeCursor;
        assertNull(actual_nodeCursor);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        boolean actual_startContainer = actual._startContainer;
        assertFalse(actual_startContainer);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        JsonToken treeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertEquals(treeTraversingParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int treeTraversingParser_features = ((Integer) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(treeTraversingParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#skipChildren()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSkipChildren__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        TreeTraversingParser actual = ((TreeTraversingParser) treeTraversingParser.skipChildren());
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        NodeCursor actual_nodeCursor = actual._nodeCursor;
        assertNull(actual_nodeCursor);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        boolean actual_startContainer = actual._startContainer;
        assertFalse(actual_startContainer);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        JsonToken treeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertEquals(treeTraversingParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int treeTraversingParser_features = ((Integer) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(treeTraversingParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#skipChildren()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSkipChildren__currTokenEqualsJsonTokenSTART_ARRAY() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        TreeTraversingParser actual = ((TreeTraversingParser) treeTraversingParser.skipChildren());
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        NodeCursor actual_nodeCursor = actual._nodeCursor;
        assertNull(actual_nodeCursor);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        boolean actual_startContainer = actual._startContainer;
        assertFalse(actual_startContainer);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        JsonToken treeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertEquals(treeTraversingParser_currToken, actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int treeTraversingParser_features = ((Integer) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(treeTraversingParser_features, actual_features);
        
        RequestPayload actual_requestPayload = ((RequestPayload) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_requestPayload"));
        assertNull(actual_requestPayload);
        
        JsonToken finalTreeTraversingParser_currToken = ((JsonToken) getFieldValue(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialTreeTraversingParser_currToken == finalTreeTraversingParser_currToken);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getTokenLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTokenLocation()}
 * @utbot.returnsFrom {@code return JsonLocation.NA;}
 *  */
    @Test
    public void testGetTokenLocation_ReturnJsonLocationNA() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            
            JsonLocation actual = treeTraversingParser.getTokenLocation();
            
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(na, actual);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getCurrentLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getCurrentLocation()}
 * @utbot.returnsFrom {@code return JsonLocation.NA;}
 *  */
    @Test
    public void testGetCurrentLocation_ReturnJsonLocationNA() throws Exception  {
        JsonLocation prevNA = JsonLocation.NA;
        try {
            JsonLocation na = new JsonLocation(null, -1L, -1L, -1, -1);
            Class jsonLocationClazz = Class.forName("com.fasterxml.jackson.core.JsonLocation");
            setStaticField(jsonLocationClazz, "NA", na);
            TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
            
            JsonLocation actual = treeTraversingParser.getCurrentLocation();
            
            // com.fasterxml.jackson.core.JsonLocation has overridden equals method
            assertEquals(na, actual);
        } finally {
            setStaticField(JsonLocation.class, "NA", prevNA);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getParsingContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParsingContext()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getParsingContext()}
 * @utbot.returnsFrom {@code return _nodeCursor;}
 *  */
    @Test
    public void testGetParsingContext_Return_nodeCursor() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        JsonStreamContext actual = treeTraversingParser.getParsingContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.isClosed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosed()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#isClosed()}
 * @utbot.returnsFrom {@code return _closed;}
 *  */
    @Test
    public void testIsClosed_Return_closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        boolean actual = treeTraversingParser.isClosed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getNumberType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumberType()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getNumberType()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNumericNode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonNode n = currentNumericNode();
 *  */
    @Test
    public void testGetNumberType_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        short[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getNumberType] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNumericNode(TreeTraversingParser.java:407)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getNumberType(TreeTraversingParser.java:280) */
        treeTraversingParser.getNumberType();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNumberType()
    
    @Test
    public void testGetNumberType1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        IntNode value = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        JsonParser.NumberType actual = treeTraversingParser.getNumberType();
        
        JsonParser.NumberType expected = JsonParser.NumberType.INT;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberType()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberType();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberType();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberType();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberType5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberType();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnData() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertArrayEquals(_data, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnData_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        POJONode _currentNode = ((POJONode) createInstance("com.fasterxml.jackson.databind.node.POJONode"));
        byte[] _value = {(byte) 0};
        setField(_currentNode, "com.fasterxml.jackson.databind.node.POJONode", "_value", _value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertArrayEquals(_value, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBinaryValue_ReturnNull_8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        BinaryNode value = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonNode n = currentNode();
 *  */
    @Test
    public void testGetBinaryValue_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:359) */
        treeTraversingParser.getBinaryValue(null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonNode n = currentNode();
 *  */
    @Test
    public void testGetBinaryValue_ThrowClassCastException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(e, "java.util.KeyValueHolder", "value", value);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:122)
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:116)
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:359) */
        treeTraversingParser.getBinaryValue(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void testGetBinaryValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBinaryValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        FloatNode _currentNode = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBinaryValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBinaryValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBinaryValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BinaryNode _currentNode = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    
    @Test
    public void testGetBinaryValue6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        POJONode value = ((POJONode) createInstance("com.fasterxml.jackson.databind.node.POJONode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        byte[] actual = treeTraversingParser.getBinaryValue(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test(expected = StackOverflowError.class)
    public void testGetBinaryValue7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        setField(e, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e1 = createInstance("java.util.concurrent.ConcurrentHashMap$Node");
        Object val = createInstance("java.lang.Object");
        setField(e1, "java.util.concurrent.ConcurrentHashMap$Node", "val", val);
        setField(e, "java.lang.ProcessEnvironment$CheckedEntry", "e", e1);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue] produces [java.lang.ClassCastException] */
        treeTraversingParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue9() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        TextNode _currentNode = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TextNode.getBinaryValue(TextNode.java:65)
            com.fasterxml.jackson.databind.node.TextNode.binaryValue(TextNode.java:81)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:363) */
        treeTraversingParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue10() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        TextNode value = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TextNode.getBinaryValue(TextNode.java:65)
            com.fasterxml.jackson.databind.node.TextNode.binaryValue(TextNode.java:81)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:363) */
        treeTraversingParser.getBinaryValue(null);
    }
    
    @Test
    public void testGetBinaryValue11() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        TextNode value = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TextNode.getBinaryValue(TextNode.java:65)
            com.fasterxml.jackson.databind.node.TextNode.binaryValue(TextNode.java:81)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:363) */
        treeTraversingParser.getBinaryValue(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getFloatValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getFloatValue()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getFloatValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNumericNode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return (float) currentNumericNode().doubleValue();
 *  */
    @Test
    public void testGetFloatValue_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        short[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getFloatValue] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNumericNode(TreeTraversingParser.java:407)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getFloatValue(TreeTraversingParser.java:302) */
        treeTraversingParser.getFloatValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getFloatValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getFloatValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getFloatValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getFloatValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        NullNode value = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getFloatValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetFloatValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getFloatValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testReadBinaryValue_ReturnZero() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        int actual = treeTraversingParser.readBinaryValue(null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testReadBinaryValue_ReturnZero_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        int actual = treeTraversingParser.readBinaryValue(null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.returnsFrom {@code return data.length;}
 *  */
    @Test
    public void testReadBinaryValue_ReturnDataLength() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        
        int actual = treeTraversingParser.readBinaryValue(null, zipOutputStream);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testReadBinaryValue_ReturnZero_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        int actual = treeTraversingParser.readBinaryValue(null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testReadBinaryValue_ReturnZero_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        int actual = treeTraversingParser.readBinaryValue(null, null);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.returnsFrom {@code return data.length;}
 *  */
    @Test
    public void testReadBinaryValue_ReturnDataLength_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        GZIPOutputStream gZIPOutputStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Object crc = createInstance("sun.util.calendar.ZoneInfoFile$Checksum");
        setField(gZIPOutputStream, "java.util.zip.GZIPOutputStream", "crc", crc);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(gZIPOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        int actual = treeTraversingParser.readBinaryValue(null, gZIPOutputStream);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(data, 0, data.length);
 *  */
    @Test
    public void testReadBinaryValue_ThrowNullPointerException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue(TreeTraversingParser.java:385) */
        treeTraversingParser.readBinaryValue(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out.write(data, 0, data.length);
 *  */
    @Test
    public void testReadBinaryValue_ThrowNullPointerException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        POJONode _currentNode = ((POJONode) createInstance("com.fasterxml.jackson.databind.node.POJONode"));
        byte[] _value = {(byte) 0};
        setField(_currentNode, "com.fasterxml.jackson.databind.node.POJONode", "_value", _value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue(TreeTraversingParser.java:385) */
        treeTraversingParser.readBinaryValue(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.util.zip.ZipException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = ZipException.class)
    public void testReadBinaryValue_ThrowZipException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(1);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        
        treeTraversingParser.readBinaryValue(null, zipOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryValue_ThrowIOException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        GZIPOutputStream gZIPOutputStream = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(gZIPOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        treeTraversingParser.readBinaryValue(null, gZIPOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryValue_ThrowIOException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(2L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", -1152921504606846975L);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -1152921504606846976L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        setField(out, "java.util.zip.ZipOutputStream", "closed", true);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        treeTraversingParser.readBinaryValue(null, jarOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryValue_ThrowIOException_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BinaryNode _currentNode = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_currentNode, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        DeflaterOutputStream deflaterOutputStream = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(deflaterOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        treeTraversingParser.readBinaryValue(null, deflaterOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryValue_ThrowIOException_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        ZipOutputStream zipOutputStream = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setMethod(8);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(zipOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(zipOutputStream, "java.util.zip.DeflaterOutputStream", "def", def);
        
        treeTraversingParser.readBinaryValue(null, zipOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryValue_ThrowIOException_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry = createInstance("java.util.jar.JarFile$JarFileEntry");
        (((ZipEntry) entry)).setSize(3L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -2L);
        GZIPOutputStream out = ((GZIPOutputStream) createInstance("java.util.zip.GZIPOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        treeTraversingParser.readBinaryValue(null, jarOutputStream);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#readBinaryValue(com.fasterxml.jackson.core.Base64Variant,java.io.OutputStream)}
 * @utbot.throwsException {@link java.io.IOException} in: out.write(data, 0, data.length);
 *  */
    @Test(expected = IOException.class)
    public void testReadBinaryValue_ThrowIOException_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        byte[] _data = {(byte) 0, (byte) 0};
        setField(_node, "com.fasterxml.jackson.databind.node.BinaryNode", "_data", _data);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JarOutputStream jarOutputStream = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current = createInstance("java.util.zip.ZipOutputStream$XEntry");
        ZipEntry entry = ((ZipEntry) createInstance("java.util.zip.ZipEntry"));
        entry.setSize(432345581407436800L);
        setField(current, "java.util.zip.ZipOutputStream$XEntry", "entry", entry);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "current", current);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "written", -4541880219908177922L);
        setField(jarOutputStream, "java.util.zip.ZipOutputStream", "locoff", -4974225801315614720L);
        ZipOutputStream out = ((ZipOutputStream) createInstance("java.util.zip.ZipOutputStream"));
        Object current1 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        JarEntry entry1 = ((JarEntry) createInstance("java.util.jar.JarEntry"));
        entry1.setSize(1171782527069716482L);
        setField(current1, "java.util.zip.ZipOutputStream$XEntry", "entry", entry1);
        setField(out, "java.util.zip.ZipOutputStream", "current", current1);
        setField(out, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out, "java.util.zip.ZipOutputStream", "locoff", -1171782527069716480L);
        JarOutputStream out1 = ((JarOutputStream) createInstance("java.util.jar.JarOutputStream"));
        Object current2 = createInstance("java.util.zip.ZipOutputStream$XEntry");
        Object entry2 = createInstance("sun.net.www.protocol.jar.URLJarFile$URLJarFileEntry");
        (((ZipEntry) entry2)).setSize(2L);
        setField(current2, "java.util.zip.ZipOutputStream$XEntry", "entry", entry2);
        setField(out1, "java.util.zip.ZipOutputStream", "current", current2);
        setField(out1, "java.util.zip.ZipOutputStream", "written", 0L);
        setField(out1, "java.util.zip.ZipOutputStream", "locoff", 0L);
        DeflaterOutputStream out2 = ((DeflaterOutputStream) createInstance("java.util.zip.DeflaterOutputStream"));
        Deflater def = ((Deflater) createInstance("java.util.zip.Deflater"));
        setField(def, "java.util.zip.Deflater", "finished", true);
        setField(out2, "java.util.zip.DeflaterOutputStream", "def", def);
        setField(out1, "java.io.FilterOutputStream", "out", out2);
        setField(out, "java.io.FilterOutputStream", "out", out1);
        setField(jarOutputStream, "java.io.FilterOutputStream", "out", out);
        
        treeTraversingParser.readBinaryValue(null, jarOutputStream);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    @Test
    public void testReadBinaryValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        int actual = treeTraversingParser.readBinaryValue(base64Variant, objectOutputStream);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testReadBinaryValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        ObjectOutputStream objectOutputStream = ((ObjectOutputStream) createInstance("java.io.ObjectOutputStream"));
        
        int actual = treeTraversingParser.readBinaryValue(null, objectOutputStream);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testReadBinaryValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BinaryNode _currentNode = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        int actual = treeTraversingParser.readBinaryValue(null, null);
        
        assertEquals(0, actual);
    }
    
    @Test
    public void testReadBinaryValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BinaryNode _node = ((BinaryNode) createInstance("com.fasterxml.jackson.databind.node.BinaryNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        int actual = treeTraversingParser.readBinaryValue(null, null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method readBinaryValue(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream)
    
    @Test
    public void testReadBinaryValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        TextNode _currentNode = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TextNode.getBinaryValue(TextNode.java:65)
            com.fasterxml.jackson.databind.node.TextNode.binaryValue(TextNode.java:81)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:363)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue(TreeTraversingParser.java:383) */
        treeTraversingParser.readBinaryValue(null, null);
    }
    
    @Test
    public void testReadBinaryValue6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        TextNode _node = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TextNode.getBinaryValue(TextNode.java:65)
            com.fasterxml.jackson.databind.node.TextNode.binaryValue(TextNode.java:81)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getBinaryValue(TreeTraversingParser.java:363)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.readBinaryValue(TreeTraversingParser.java:383) */
        treeTraversingParser.readBinaryValue(null, null);
    }
    ///endregion
    
    ///region Errors report for readBinaryValue
    
    public void testReadBinaryValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 29 occurrences of:
        /* Unable to make field static final boolean java.util.zip.Deflater.$assertionsDisabled accessible: module
        java.base does not "opens java.util.zip" to unnamed module @4fcd19b3 */
        
        // 2 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getNumberValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNumberValue()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getNumberValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNumericNode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return currentNumericNode().numberValue();
 *  */
    @Test
    public void testGetNumberValue_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        short[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getNumberValue] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNumericNode(TreeTraversingParser.java:407)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getNumberValue(TreeTraversingParser.java:317) */
        treeTraversingParser.getNumberValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getNumberValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        NullNode value = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetNumberValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getNumberValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextCharacters()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 *  */
    @Test
    public void testGetTextCharacters() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_FALSE;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = treeTraversingParser.getTextCharacters();
        
        char[] expected = {'f', 'a', 'l', 's', 'e'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.invokes {@link java.lang.String#toCharArray()}
 * @utbot.returnsFrom {@code return getText().toCharArray();}
 *  */
    @Test
    public void testGetTextCharacters_StringToCharArray() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.IntNode", "_value", Integer.MIN_VALUE);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = treeTraversingParser.getTextCharacters();
        
        char[] expected = new char[11];
        expected[0] = '-';
        expected[1] = '2';
        expected[2] = '1';
        expected[3] = '4';
        expected[4] = '7';
        expected[5] = '4';
        expected[6] = '8';
        expected[7] = '3';
        expected[8] = '6';
        expected[9] = '4';
        expected[10] = '8';
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTextCharacters()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:237)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        IntNode _node = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextCharacters()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getText().toCharArray();
 *  */
    @Test
    public void testGetTextCharacters_ThrowNullPointerException_7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        TextNode _node = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTextCharacters()
    
    @Test
    public void testGetTextCharacters1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        IntNode _currentNode = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.IntNode", "_value", Integer.MIN_VALUE);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = treeTraversingParser.getTextCharacters();
        
        char[] expected = new char[11];
        expected[0] = '-';
        expected[1] = '2';
        expected[2] = '1';
        expected[3] = '4';
        expected[4] = '7';
        expected[5] = '4';
        expected[6] = '8';
        expected[7] = '3';
        expected[8] = '6';
        expected[9] = '4';
        expected[10] = '8';
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetTextCharacters2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        FloatNode _node = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.FloatNode", "_value", 0.0f);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = treeTraversingParser.getTextCharacters();
        
        char[] expected = {'0', '.', '0'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetTextCharacters3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        FloatNode _currentNode = ((FloatNode) createInstance("com.fasterxml.jackson.databind.node.FloatNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.FloatNode", "_value", java.lang.Float.NaN);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_FLOAT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = treeTraversingParser.getTextCharacters();
        
        char[] expected = {'N', 'a', 'N'};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetTextCharacters4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        TextNode _node = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        String _value = "";
        setField(_node, "com.fasterxml.jackson.databind.node.TextNode", "_value", _value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = treeTraversingParser.getTextCharacters();
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTextCharacters()
    
    @Test
    public void testGetTextCharacters5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:237)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    @Test
    public void testGetTextCharacters6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    
    @Test
    public void testGetTextCharacters7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(treeTraversingParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getText(TreeTraversingParser.java:234)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextCharacters(TreeTraversingParser.java:251) */
        treeTraversingParser.getTextCharacters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getTextOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextOffset()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getTextOffset()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetTextOffset_ReturnZero() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        int actual = treeTraversingParser.getTextOffset();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getLongValue
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLongValue()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getLongValue()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNumericNode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return currentNumericNode().longValue();
 *  */
    @Test
    public void testGetLongValue_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        short[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getLongValue] produces [java.lang.ClassCastException: class [S cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([S is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNumericNode(TreeTraversingParser.java:407)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getLongValue(TreeTraversingParser.java:307) */
        treeTraversingParser.getLongValue();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method getLongValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(value, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_current, "java.text.AttributeEntry", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        BooleanNode value = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        NullNode value = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getLongValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetLongValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getLongValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getDoubleValue
    
    ///region OTHER: CHECKED EXCEPTIONS for method getDoubleValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue9() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDoubleValue10() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDoubleValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getIntValue
    
    ///region OTHER: CHECKED EXCEPTIONS for method getIntValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getIntValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetIntValue8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getIntValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getBigIntegerValue
    
    ///region OTHER: CHECKED EXCEPTIONS for method getBigIntegerValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        treeTraversingParser.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getBigIntegerValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetBigIntegerValue7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getBigIntegerValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getDecimalValue
    
    ///region OTHER: CHECKED EXCEPTIONS for method getDecimalValue()
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_currentNode, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue9() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue10() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    
    @Test(expected = JsonParseException.class)
    public void testGetDecimalValue11() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getDecimalValue();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.hasTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTextCharacters()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#hasTextCharacters()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTextCharacters_ReturnFalse() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        boolean actual = treeTraversingParser.hasTextCharacters();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getEmbeddedObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmbeddedObject()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject__closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        TextNode _node = ((TextNode) createInstance("com.fasterxml.jackson.databind.node.TextNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_Not_closed_7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.text.AttributeEntry");
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEmbeddedObject()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonNode n = currentNode();
 *  */
    @Test
    public void testGetEmbeddedObject_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getEmbeddedObject] produces [java.lang.ClassCastException: class [I cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([I is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getEmbeddedObject(TreeTraversingParser.java:324) */
        treeTraversingParser.getEmbeddedObject();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getEmbeddedObject()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JsonNode n = currentNode();
 *  */
    @Test
    public void testGetEmbeddedObject_ThrowClassCastException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(e, "java.util.KeyValueHolder", "value", value);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getEmbeddedObject] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:122)
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:116)
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.getEmbeddedObject(TreeTraversingParser.java:324) */
        treeTraversingParser.getEmbeddedObject();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getEmbeddedObject()
    
    @Test
    public void testGetEmbeddedObject1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.concurrent.ConcurrentHashMap$ReservationNode");
        IntNode val = ((IntNode) createInstance("com.fasterxml.jackson.databind.node.IntNode"));
        setField(_current, "java.util.concurrent.ConcurrentHashMap$Node", "val", val);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        Object actual = treeTraversingParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getEmbeddedObject()
    
    @Test(expected = StackOverflowError.class)
    public void testGetEmbeddedObject2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        setField(e, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.getEmbeddedObject();
    }
    
    @Test
    public void testGetEmbeddedObject3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.text.AttributeEntry");
        Object value = createInstance("java.lang.Object");
        setField(e, "java.text.AttributeEntry", "value", value);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.getEmbeddedObject] produces [java.lang.ClassCastException] */
        treeTraversingParser.getEmbeddedObject();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.getCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getCurrentName()}
 * @utbot.executesCondition {@code ((_nodeCursor == null)): True}
 * @utbot.returnsFrom {@code return (_nodeCursor == null) ? null : _nodeCursor.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName__nodeCursorEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        String actual = treeTraversingParser.getCurrentName();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#getCurrentName()}
 * @utbot.executesCondition {@code ((_nodeCursor == null)): False}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.NodeCursor#getCurrentName()}
 * @utbot.returnsFrom {@code return (_nodeCursor == null) ? null : _nodeCursor.getCurrentName();}
 *  */
    @Test
    public void testGetCurrentName__nodeCursorNotEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        String actual = treeTraversingParser.getCurrentName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNumericNode
    
    ///region OTHER: CHECKED EXCEPTIONS for method currentNumericNode()
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_node, "com.fasterxml.jackson.databind.node.BooleanNode", "_value", true);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode4() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode5() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        BooleanNode _node = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode6() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        BooleanNode _currentNode = ((BooleanNode) createInstance("com.fasterxml.jackson.databind.node.BooleanNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode7() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode8() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    
    @Test(expected = JsonParseException.class)
    public void testCurrentNumericNode9() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        treeTraversingParser.currentNumericNode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser._handleEOF
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _handleEOF()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#_handleEOF()}
 * @utbot.invokes {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#_throwInternal()}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: _throwInternal();
 *  */
    @Test(expected = RuntimeException.class)
    public void test_handleEOF_ThrowRuntimeException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        treeTraversingParser._handleEOF();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method currentNode()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.executesCondition {@code (_closed): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCurrentNode_Not_closed() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        treeTraversingParser._closed = true;
        
        JsonNode actual = treeTraversingParser.currentNode();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.executesCondition {@code (_closed): True}
 * @utbot.executesCondition {@code (_nodeCursor == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCurrentNode__nodeCursorEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        
        JsonNode actual = treeTraversingParser.currentNode();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.executesCondition {@code (_closed): True}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.returnsFrom {@code return _nodeCursor.currentNode();}
 *  */
    @Test
    public void testCurrentNode__nodeCursorNotEqualsNull() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.RootCursor _nodeCursor = ((NodeCursor.RootCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$RootCursor"));
        NullNode _node = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$RootCursor", "_node", _node);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        NullNode actual = ((NullNode) treeTraversingParser.currentNode());
        
        NullNode expected = new NullNode();
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.executesCondition {@code (_closed): True}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.returnsFrom {@code return _nodeCursor.currentNode();}
 *  */
    @Test
    public void testCurrentNode__nodeCursorNotEqualsNull_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ArrayCursor _nodeCursor = ((NodeCursor.ArrayCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor"));
        NullNode _currentNode = ((NullNode) createInstance("com.fasterxml.jackson.databind.node.NullNode"));
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ArrayCursor", "_currentNode", _currentNode);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        NullNode actual = ((NullNode) treeTraversingParser.currentNode());
        
        NullNode expected = new NullNode();
        
        // com.fasterxml.jackson.databind.node.NullNode has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.executesCondition {@code (_closed): True}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.returnsFrom {@code return _nodeCursor.currentNode();}
 *  */
    @Test
    public void testCurrentNode__nodeCursorNotEqualsNull_2() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        JsonNode actual = treeTraversingParser.currentNode();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.executesCondition {@code (_closed): True}
 * @utbot.executesCondition {@code (_nodeCursor == null): False}
 * @utbot.returnsFrom {@code return _nodeCursor.currentNode();}
 *  */
    @Test
    public void testCurrentNode__nodeCursorNotEqualsNull_3() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        DecimalNode value = ((DecimalNode) createInstance("com.fasterxml.jackson.databind.node.DecimalNode"));
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        DecimalNode actual = ((DecimalNode) treeTraversingParser.currentNode());
        
        DecimalNode expected = new DecimalNode(null);
        
        // com.fasterxml.jackson.databind.node.DecimalNode has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method currentNode()
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return _nodeCursor.currentNode();
 *  */
    @Test
    public void testCurrentNode_ThrowClassCastException() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.util.KeyValueHolder");
        byte[] value = {};
        setField(_current, "java.util.KeyValueHolder", "value", value);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode] produces [java.lang.ClassCastException: class [B cannot be cast to class com.fasterxml.jackson.databind.JsonNode ([B is in module java.base of loader 'bootstrap'; com.fasterxml.jackson.databind.JsonNode is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4d7985b3)]
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401) */
        treeTraversingParser.currentNode();
    }
    
    /**
    @utbot.classUnderTest {@link TreeTraversingParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.databind.node.TreeTraversingParser#currentNode()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testCurrentNode_ThrowClassCastException_1() throws Exception  {
        TreeTraversingParser treeTraversingParser = ((TreeTraversingParser) createInstance("com.fasterxml.jackson.databind.node.TreeTraversingParser"));
        NodeCursor.ObjectCursor _nodeCursor = ((NodeCursor.ObjectCursor) createInstance("com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor"));
        Object _current = createInstance("java.lang.ProcessEnvironment$CheckedEntry");
        Object e = createInstance("java.util.KeyValueHolder");
        int[] value = {};
        setField(e, "java.util.KeyValueHolder", "value", value);
        setField(_current, "java.lang.ProcessEnvironment$CheckedEntry", "e", e);
        setField(_nodeCursor, "com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor", "_current", _current);
        setField(treeTraversingParser, "com.fasterxml.jackson.databind.node.TreeTraversingParser", "_nodeCursor", _nodeCursor);
        
        /* This test fails because method [com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode] produces [java.lang.ClassCastException: class [I cannot be cast to class java.lang.String ([I and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:122)
            java.base/java.lang.ProcessEnvironment$CheckedEntry.getValue(ProcessEnvironment.java:116)
            com.fasterxml.jackson.databind.node.NodeCursor$ObjectCursor.currentNode(NodeCursor.java:240)
            com.fasterxml.jackson.databind.node.TreeTraversingParser.currentNode(TreeTraversingParser.java:401) */
        treeTraversingParser.currentNode();
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields1089471484721700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1089471484721700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1089471484733900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1089471484721700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1089471484733900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields1089471484946999 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1089471484946999.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1089471484947599 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1089471484946999.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1089471484947599).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1089471485103700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1089471485103700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1089471485104700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1089471485103700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1089471485104700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

