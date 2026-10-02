package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import com.fasterxml.jackson.core.JsonToken;
import java.util.LinkedHashSet;
import java.util.Set;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl;
import com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl;
import com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl;
import com.sun.org.apache.xerces.internal.xni.QName;
import com.fasterxml.jackson.core.io.IOContext;
import org.codehaus.stax2.XMLStreamReader2;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.sun.org.apache.xerces.internal.impl.XMLEntityScanner;
import com.fasterxml.jackson.core.JsonLocation;
import com.sun.xml.internal.stream.Entity.ScannedEntity;
import com.sun.xml.internal.stream.Entity;
import com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription;
import com.fasterxml.jackson.core.JsonParser.NumberType;
import com.fasterxml.jackson.core.JsonParser;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.LinkedList;
import com.fasterxml.jackson.core.Base64Variant;
import com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl;
import java.lang.reflect.Method;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

public final class com_fasterxml_jackson_dataformat_xml_deser_FromXmlParserTest {
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.version
    
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
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.activatesSwitch {@code switch(token) case: XmlTokenStream.XML_END}
 *  */
    @Test
    public void testNextToken_Return() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 6;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonToken actual = fromXmlParser.nextToken();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getText()}
 * @utbot.activatesSwitch {@code switch(token) case: XmlTokenStream.XML_ATTRIBUTE_VALUE}
 * @utbot.returnsFrom {@code return (_currToken = JsonToken.VALUE_STRING);}
 *  */
    @Test
    public void testNextToken_XmlTokenStreamGetText() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {};
        fromXmlParser._binaryValue = _binaryValue;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.VALUE_STRING;
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(4, finalFromXmlParser_xmlTokens_currentState);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): True}
 * @utbot.returnsFrom {@code return (_currToken = JsonToken.VALUE_NULL);}
 *  */
    @Test
    public void testNextToken__mayBeLeaf() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.VALUE_NULL;
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
        
        assertNull(finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertFalse(finalFromXmlParser_mayBeLeaf);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#inArray()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getNamesToWrap()}
 * @utbot.returnsFrom {@code return _currToken;}
 *  */
    @Test
    public void testNextToken_Not_mayBeLeaf() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        XmlReadContext _parent = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(_parent, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_namesToWrap", _namesToWrap);
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parent);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.END_ARRAY;
        
        assertEquals(expected, actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
        
        assertNull(finalFromXmlParser_xmlTokens_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 *  */
    @Test
    public void testNextToken() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        _parsingContext._lineNr = -255;
        _parsingContext._columnNr = -255;
        _parsingContext._child = _parsingContext;
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_parsingContext_lineNr = fromXmlParser._parsingContext._lineNr;
        int finalFromXmlParser_parsingContext_columnNr = fromXmlParser._parsingContext._columnNr;
        Set finalFromXmlParser_parsingContext_namesToWrap = fromXmlParser._parsingContext._namesToWrap;
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        XmlReadContext xmlReadContext1 = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_index = ((Integer) getFieldValue(xmlReadContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(-1, finalFromXmlParser_parsingContext_lineNr);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_columnNr);
        
        assertNull(finalFromXmlParser_parsingContext_namesToWrap);
        
        assertEquals(2, finalFromXmlParser_parsingContext_type);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_index);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_namesToWrap != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#setCurrentName(java.lang.String)}
 * @utbot.returnsFrom {@code return (_currToken = JsonToken.FIELD_NAME);}
 *  */
    @Test
    public void testNextToken__namesToWrapEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.FIELD_NAME;
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        Set finalFromXmlParser_namesToWrap = fromXmlParser._namesToWrap;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
        
        assertNull(finalFromXmlParser_namesToWrap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testNextToken_ThrowIndexOutOfBoundsException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fNamespaces", true);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fLength", 1);
        java.lang.Object[] fAttributes1 = createArray("com.sun.org.apache.xerces.internal.util.XMLAttributesImpl$Attribute", 0);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fAttributes", fAttributes1);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 4;
        _xmlTokens._attributeCount = 1;
        _xmlTokens._nextAttributeIndex = -1;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testNextToken_ThrowIndexOutOfBoundsException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._repeatElement = 2;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:472) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        _xmlTokens._attributeCount = 256;
        _xmlTokens._nextAttributeIndex = 255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:472) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        _xmlTokens._attributeCount = -255;
        _xmlTokens._nextAttributeIndex = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:472) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_11() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 4;
        _xmlTokens._attributeCount = 129;
        _xmlTokens._nextAttributeIndex = 127;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:472) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_12() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 2;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag(XmlTokenStream.java:376)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:340)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:472) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.inArray()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_9() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:484) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.inArray()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:516) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _namesToWrap = _parsingContext.getNamesToWrap();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_6() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:518) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.inArray()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_13() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 1;
        _xmlTokens._attributeCount = -255;
        _xmlTokens._nextAttributeIndex = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException] */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _namesToWrap = _parsingContext.getNamesToWrap();
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:518) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.inArray()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_10() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:484) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.inArray()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_7() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:484) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.createChildObjectContext(-1, -1);
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_8() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:481) */
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.inArray()
 *  */
    @Test
    public void testNextToken_ThrowNullPointerException_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:516) */
        fromXmlParser.nextToken();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextToken()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int token = _xmlTokens.next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNextToken_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.nextToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextToken()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int token = _xmlTokens.next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNextToken_ThrowIllegalStateException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._repeatElement = 2;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.nextToken();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextToken()
    
    @Test
    public void testNextToken1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _nextToken = JsonToken.NOT_AVAILABLE;
        fromXmlParser._nextToken = _nextToken;
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        assertEquals(_nextToken, actual);
        
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFromXmlParser_nextToken);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextToken2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        XmlReadContext _child = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        _parsingContext._child = _child;
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextToken3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextToken4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parsingContext);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.END_OBJECT;
        
        assertEquals(expected, actual);
        
        Set finalFromXmlParser_parsingContext_namesToWrap = fromXmlParser._parsingContext._namesToWrap;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFromXmlParser_parsingContext_namesToWrap);
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
    }
    
    @Test
    public void testNextToken5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        XmlReadContext _child = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        _parsingContext._child = _child;
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextToken6() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        byte[] _binaryValue = new byte[17];
        fromXmlParser._binaryValue = _binaryValue;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextToken7() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        _xmlTokens._namespaceURI = _currentName;
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        String _nextNamespaceURI = "";
        _xmlTokens._nextNamespaceURI = _nextNamespaceURI;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_namesToWrap", _namesToWrap);
        
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.FIELD_NAME;
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
    }
    
    @Test
    public void testNextToken8() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        
        JsonToken actual = fromXmlParser.nextToken();
        
        JsonToken expected = JsonToken.START_OBJECT;
        
        assertEquals(expected, actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextToken()
    
    @Test
    public void testNextToken9() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 4;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:472) */
        fromXmlParser.nextToken();
    }
    
    @Test
    public void testNextToken10() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:487) */
        fromXmlParser.nextToken();
    }
    
    @Test
    public void testNextToken11() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._attributeCount = 1;
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:487) */
        fromXmlParser.nextToken();
    }
    
    @Test
    public void testNextToken12() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:487) */
        fromXmlParser.nextToken();
    }
    
    @Test
    public void testNextToken13() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._attributeCount = 1;
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:487) */
        fromXmlParser.nextToken();
    }
    
    @Test
    public void testNextToken14() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._attributeCount = 1;
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:487) */
        fromXmlParser.nextToken();
    }
    
    @Test
    public void testNextToken15() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextToken(FromXmlParser.java:487) */
        fromXmlParser.nextToken();
    }
    ///endregion
    
    ///region Errors report for nextToken
    
    public void testNextToken_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 3 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (!_closed): False}
 *  */
    @Test
    public void testClose__closed() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        fromXmlParser._closed = true;
        
        fromXmlParser.close();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): True}
 * @utbot.executesCondition {@code (if (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
 *     _xmlTokens.closeCompletely();
 * } else {
 *     _xmlTokens.close();
 * }): False}
 *  */
    @Test
    public void testClose__ioContextIsResourceManagedOrIsEnabled() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.close();
        
        boolean finalFromXmlParser_closed = fromXmlParser._closed;
        XMLStreamReader2 xMLStreamReader2 = fromXmlParser._xmlTokens._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalFromXmlParser_xmlTokens_xmlReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalFromXmlParser_closed);
        
        assertTrue(finalFromXmlParser_xmlTokens_xmlReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): True}
 * @utbot.executesCondition {@code (if (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
 *     _xmlTokens.closeCompletely();
 * } else {
 *     _xmlTokens.close();
 * }): True}
 *  */
    @Test
    public void testClose__ioContextIsResourceManagedOrIsEnabled_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        setField(fromXmlParser, "com.fasterxml.jackson.core.JsonParser", "_features", 1);
        
        fromXmlParser.close();
        
        boolean finalFromXmlParser_closed = fromXmlParser._closed;
        XMLStreamReader2 xMLStreamReader2 = fromXmlParser._xmlTokens._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalFromXmlParser_xmlTokens_xmlReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalFromXmlParser_closed);
        
        assertTrue(finalFromXmlParser_xmlTokens_xmlReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): False}
 *  */
    @Test
    public void testClose__ioContextIsResourceManagedOrIsEnabled_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_managedResource", true);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.close();
        
        boolean finalFromXmlParser_closed = fromXmlParser._closed;
        XMLStreamReader2 xMLStreamReader2 = fromXmlParser._xmlTokens._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalFromXmlParser_xmlTokens_xmlReaderReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalFromXmlParser_closed);
        
        assertTrue(finalFromXmlParser_xmlTokens_xmlReaderReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): True}
 * @utbot.executesCondition {@code (if (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
 *     _xmlTokens.closeCompletely();
 * } else {
 *     _xmlTokens.close();
 * }): False}
 *  */
    @Test
    public void testClose__ioContextIsResourceManagedOrIsEnabled_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader1 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.close();
        
        boolean finalFromXmlParser_closed = fromXmlParser._closed;
        XMLStreamReader2 xMLStreamReader2 = fromXmlParser._xmlTokens._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader_xmlTokens_xmlReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        boolean finalFromXmlParser_xmlTokens_xmlReaderReaderReaderFStreamReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader_xmlTokens_xmlReaderReaderReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalFromXmlParser_closed);
        
        assertTrue(finalFromXmlParser_xmlTokens_xmlReaderReaderReaderFStreamReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (!_closed): True}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): True}
 * @utbot.executesCondition {@code (if (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
 *     _xmlTokens.closeCompletely();
 * } else {
 *     _xmlTokens.close();
 * }): False}
 *  */
    @Test
    public void testClose__ioContextIsResourceManagedOrIsEnabled_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader1 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader2 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.close();
        
        boolean finalFromXmlParser_closed = fromXmlParser._closed;
        XMLStreamReader2 xMLStreamReader2 = fromXmlParser._xmlTokens._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader_xmlTokens_xmlReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        XMLStreamReader xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader_xmlTokens_xmlReaderReaderReaderFStreamReader_xmlTokens_xmlReaderReaderReaderFStreamReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader_xmlTokens_xmlReaderReaderReaderFStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalFromXmlParser_xmlTokens_xmlReaderReaderReaderFStreamReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlTokens_xmlReaderReader_xmlTokens_xmlReaderReaderReader_xmlTokens_xmlReaderReaderReaderFStreamReader_xmlTokens_xmlReaderReaderReaderFStreamReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalFromXmlParser_closed);
        
        assertTrue(finalFromXmlParser_xmlTokens_xmlReaderReaderReaderFStreamReaderReaderFReuse);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#isResourceManaged()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        fromXmlParser.close();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_managedResource", true);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        
        fromXmlParser.close();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#close()}
 * @utbot.executesCondition {@code (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)): True}
 * @utbot.executesCondition {@code (if (_ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
 *     _xmlTokens.closeCompletely();
 * } else {
 *     _xmlTokens.close();
 * }): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isEnabled(com.fasterxml.jackson.core.JsonParser.Feature)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test(expected = NullPointerException.class)
    public void testClose_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        setField(fromXmlParser, "com.fasterxml.jackson.core.JsonParser", "_features", 1);
        
        fromXmlParser.close();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method close()
    
    @Test(expected = NullPointerException.class)
    public void testClose1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        
        fromXmlParser.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getTextLength
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextLength()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextLength()}
 *  */
    @Test
    public void testGetTextLength() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.END_ARRAY;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = fromXmlParser.getTextLength();
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextLength()}
 * @utbot.returnsFrom {@code return (text == null) ? 0 : text.length();}
 *  */
    @Test
    public void testGetTextLength_ReturnTextNotEqualsNull_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = fromXmlParser.getTextLength();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextLength()}
 * @utbot.returnsFrom {@code return (text == null) ? 0 : text.length();}
 *  */
    @Test
    public void testGetTextLength_ReturnTextNotEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        int actual = fromXmlParser.getTextLength();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextLength()}
 * @utbot.returnsFrom {@code return (text == null) ? 0 : text.length();}
 *  */
    @Test
    public void testGetTextLength_ReturnTextNotEqualsNull_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = fromXmlParser.getTextLength();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextLength()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.returnsFrom {@code return (text == null) ? 0 : text.length();}
 *  */
    @Test
    public void testGetTextLength_StringLength() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = " ";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        int actual = fromXmlParser.getTextLength();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTextLength()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextLength()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String text = getText();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetTextLength_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getTextLength();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isEnabled
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isEnabled(com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isEnabled(com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (_formatFeatures & f.getMask()) != 0;
 *  */
    @Test
    public void testIsEnabled_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        fromXmlParser._formatFeatures = -255;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isEnabled] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isEnabled(FromXmlParser.java:226) */
        fromXmlParser.isEnabled(((FromXmlParser.Feature) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.enable
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enable(com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#enable(com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _formatFeatures |= f.getMask();
 *  */
    @Test
    public void testEnable_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        fromXmlParser._formatFeatures = -255;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.enable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.enable(FromXmlParser.java:216) */
        fromXmlParser.enable(((FromXmlParser.Feature) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getText()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.executesCondition {@code (_currToken == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetText__currTokenEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        String actual = fromXmlParser.getText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getText()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_currToken == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.core.JsonToken#ordinal()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 *  */
    @Test
    public void testGetText() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 *  */
    @Test
    public void testGetText_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.END_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getText();
        
        String expected = "}";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.activatesSwitch {@code switch(_currToken) case: default}
 * @utbot.returnsFrom {@code return _currText;}
 *  */
    @Test
    public void testGetText_Return_currText() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getText();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.activatesSwitch {@code switch(_currToken) case: default}
 * @utbot.returnsFrom {@code return getCurrentName();}
 *  */
    @Test
    public void testGetText_FromXmlParserGetCurrentName() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getText();
        
        assertEquals(_currentName, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getText()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.executesCondition {@code (_currToken == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#ordinal()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.activatesSwitch {@code switch(_currToken) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return getCurrentName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetText_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getText();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.disable
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method disable(com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser$Feature)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#disable(com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.Feature#getMask()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _formatFeatures &= ~f.getMask();
 *  */
    @Test
    public void testDisable_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        fromXmlParser._formatFeatures = -255;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.disable] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.disable(FromXmlParser.java:221) */
        fromXmlParser.disable(((FromXmlParser.Feature) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideFormatFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method overrideFormatFeatures(int, int)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#overrideFormatFeatures(int,int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testOverrideFormatFeatures_Return() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        fromXmlParser._formatFeatures = -255;
        
        FromXmlParser actual = ((FromXmlParser) fromXmlParser.overrideFormatFeatures(-255, -255));
        
        String actual_cfgNameForTextElement = actual._cfgNameForTextElement;
        assertNull(actual_cfgNameForTextElement);
        
        int fromXmlParser_formatFeatures = fromXmlParser._formatFeatures;
        int actual_formatFeatures = actual._formatFeatures;
        assertEquals(fromXmlParser_formatFeatures, actual_formatFeatures);
        
        ObjectCodec actual_objectCodec = actual._objectCodec;
        assertNull(actual_objectCodec);
        
        boolean actual_closed = actual._closed;
        assertFalse(actual_closed);
        
        IOContext actual_ioContext = actual._ioContext;
        assertNull(actual_ioContext);
        
        XmlReadContext actual_parsingContext = actual._parsingContext;
        assertNull(actual_parsingContext);
        
        XmlTokenStream actual_xmlTokens = actual._xmlTokens;
        assertNull(actual_xmlTokens);
        
        boolean actual_mayBeLeaf = actual._mayBeLeaf;
        assertFalse(actual_mayBeLeaf);
        
        JsonToken actual_nextToken = actual._nextToken;
        assertNull(actual_nextToken);
        
        String actual_currText = actual._currText;
        assertNull(actual_currText);
        
        Set actual_namesToWrap = actual._namesToWrap;
        assertNull(actual_namesToWrap);
        
        ByteArrayBuilder actual_byteArrayBuilder = actual._byteArrayBuilder;
        assertNull(actual_byteArrayBuilder);
        
        byte[] actual_binaryValue = actual._binaryValue;
        assertNull(actual_binaryValue);
        
        JsonToken actual_currToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        assertNull(actual_currToken);
        
        JsonToken actual_lastClearedToken = ((JsonToken) getFieldValue(actual, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_lastClearedToken"));
        assertNull(actual_lastClearedToken);
        
        int fromXmlParser_features = ((Integer) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.JsonParser", "_features"));
        int actual_features = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.JsonParser", "_features"));
        assertEquals(fromXmlParser_features, actual_features);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isExpectedStartArrayToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpectedStartArrayToken()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.returnsFrom {@code return (t == JsonToken.START_ARRAY);}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_TNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        boolean actual = fromXmlParser.isExpectedStartArrayToken();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): False}
 * @utbot.returnsFrom {@code return (t == JsonToken.START_ARRAY);}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_TEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        boolean actual = fromXmlParser.isExpectedStartArrayToken();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_TEqualsJsonTokenSTART_OBJECT() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        _xmlTokens._attributeCount = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        boolean actual = fromXmlParser.isExpectedStartArrayToken();
        
        assertTrue(actual);
        
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_attributeCount = fromXmlParser._xmlTokens._attributeCount;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_currToken == finalFromXmlParser_currToken);
        
        assertEquals(1, finalFromXmlParser_parsingContext_type);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_attributeCount);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_TEqualsJsonTokenSTART_OBJECT_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        boolean actual = fromXmlParser.isExpectedStartArrayToken();
        
        assertTrue(actual);
        
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_currToken == finalFromXmlParser_currToken);
        
        assertEquals(1, finalFromXmlParser_parsingContext_type);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsExpectedStartArrayToken_TEqualsJsonTokenSTART_OBJECT_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        boolean actual = fromXmlParser.isExpectedStartArrayToken();
        
        assertTrue(actual);
        
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_currToken == finalFromXmlParser_currToken);
        
        assertEquals(1, finalFromXmlParser_parsingContext_type);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isExpectedStartArrayToken()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#convertToArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.convertToArray();
 *  */
    @Test
    public void testIsExpectedStartArrayToken_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isExpectedStartArrayToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isExpectedStartArrayToken(FromXmlParser.java:410) */
        fromXmlParser.isExpectedStartArrayToken();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#convertToArray()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipAttributes()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _xmlTokens.skipAttributes();
 *  */
    @Test
    public void testIsExpectedStartArrayToken_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isExpectedStartArrayToken] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isExpectedStartArrayToken(FromXmlParser.java:415) */
        fromXmlParser.isExpectedStartArrayToken();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isExpectedStartArrayToken()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isExpectedStartArrayToken()}
 * @utbot.executesCondition {@code (t == JsonToken.START_OBJECT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#convertToArray()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipAttributes()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _xmlTokens.skipAttributes();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testIsExpectedStartArrayToken_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.isExpectedStartArrayToken();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#setCurrentName(java.lang.String)}
 *  */
    @Test
    public void testOverrideCurrentName__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        
        fromXmlParser.overrideCurrentName(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method overrideCurrentName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = ctxt.getParent();
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName(FromXmlParser.java:345) */
        fromXmlParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt = ctxt.getParent();
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName(FromXmlParser.java:345) */
        fromXmlParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.setCurrentName(name);
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName(FromXmlParser.java:347) */
        fromXmlParser.overrideCurrentName(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#overrideCurrentName(java.lang.String)}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctxt.setCurrentName(name);
 *  */
    @Test
    public void testOverrideCurrentName_ThrowNullPointerException_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.overrideCurrentName(FromXmlParser.java:347) */
        fromXmlParser.overrideCurrentName(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.requiresCustomCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method requiresCustomCodec()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#requiresCustomCodec()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testRequiresCustomCodec_ReturnTrue() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        boolean actual = fromXmlParser.requiresCustomCodec();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCodec()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCodec()}
 * @utbot.returnsFrom {@code return _objectCodec;}
 *  */
    @Test
    public void testGetCodec_Return_objectCodec() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        ObjectCodec actual = fromXmlParser.getCodec();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.setCodec
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setCodec(com.fasterxml.jackson.core.ObjectCodec)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#setCodec(com.fasterxml.jackson.core.ObjectCodec)}
 *  */
    @Test
    public void testSetCodec() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        fromXmlParser.setCodec(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_xmlTokensGetCurrentLocation() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_xmlTokensGetCurrentLocation_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader2 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader3 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader4 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader4, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader3, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader2, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        int[] _sourceReference = {};
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_sourceReference", _sourceReference);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(_sourceReference, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_xmlTokensGetCurrentLocation_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader3 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader4 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader5 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader5, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader4, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader5);
        setField(reader3, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        byte[] _sourceReference = {};
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_sourceReference", _sourceReference);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(_sourceReference, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_xmlTokensGetCurrentLocation_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader2 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader2, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getCurrentLocation();}
 *  */
    @Test
    public void testGetCurrentLocation_Return_xmlTokensGetCurrentLocation_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader3 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader4 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader5 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader6 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader6, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader6);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader5, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader4, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader5);
        setField(reader3, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _xmlTokens.getCurrentLocation();
 *  */
    @Test
    public void testGetCurrentLocation_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393) */
        fromXmlParser.getCurrentLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.isClosed
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isClosed()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#isClosed()}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testIsClosed_Return() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        boolean actual = fromXmlParser.isClosed();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getFormatFeatures
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFormatFeatures()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getFormatFeatures()}
 * @utbot.returnsFrom {@code return _formatFeatures;}
 *  */
    @Test
    public void testGetFormatFeatures_Return_formatFeatures() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        fromXmlParser._formatFeatures = -255;
        
        int actual = fromXmlParser.getFormatFeatures();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getTokenLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTokenLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_Return_xmlTokensGetTokenLocation_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader1 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        short[] _sourceReference = {};
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_sourceReference", _sourceReference);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(_sourceReference, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTokenLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_Return_xmlTokensGetTokenLocation() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        fCurrentEntity.position = Integer.MIN_VALUE;
        fCurrentEntity.fTotalCountTillLastLoad = Integer.MIN_VALUE;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTokenLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_Return_xmlTokensGetTokenLocation_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = Integer.MIN_VALUE;
        fCurrentEntity.fTotalCountTillLastLoad = Integer.MIN_VALUE;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        short[] _sourceReference = {};
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_sourceReference", _sourceReference);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(_sourceReference, -1L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTokenLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_Return_xmlTokensGetTokenLocation_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader1 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        Stax2ReaderAdapter fStreamReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader2 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = 8192;
        fCurrentEntity.fTotalCountTillLastLoad = 65536;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader2, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 73728L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTokenLocation()}
 * @utbot.returnsFrom {@code return _xmlTokens.getTokenLocation();}
 *  */
    @Test
    public void testGetTokenLocation_Return_xmlTokensGetTokenLocation_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader3 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader4 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        fCurrentEntity.position = 256;
        fCurrentEntity.fTotalCountTillLastLoad = 1048576;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(fStreamReader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader4, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader3, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonLocation actual = fromXmlParser.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 1048832L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTokenLocation()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _xmlTokens.getTokenLocation();
 *  */
    @Test
    public void testGetTokenLocation_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getTokenLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getTokenLocation(FromXmlParser.java:384) */
        fromXmlParser.getTokenLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getParsingContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getParsingContext()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getParsingContext()}
 * @utbot.returnsFrom {@code return _parsingContext;}
 *  */
    @Test
    public void testGetParsingContext_Return_parsingContext() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        XmlReadContext actual = fromXmlParser.getParsingContext();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextTextValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): True}
 * @utbot.executesCondition {@code (t == JsonToken.VALUE_STRING): True}
 * @utbot.returnsFrom {@code return _currText;}
 *  */
    @Test
    public void testNextTextValue_TEqualsJsonTokenVALUE_STRING() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _nextToken = JsonToken.VALUE_STRING;
        fromXmlParser._nextToken = _nextToken;
        byte[] _binaryValue = {};
        fromXmlParser._binaryValue = _binaryValue;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFromXmlParser_nextToken);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.activatesSwitch {@code switch(token) case: XmlTokenStream.XML_END}
 *  */
    @Test
    public void testNextTextValue_SwitchTokenCaseXmlTokenStreamXML_END() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 6;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_mayBeLeaf): True}
 * @utbot.returnsFrom {@code return (_currText = "");}
 *  */
    @Test
    public void testNextTextValue__mayBeLeaf() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
        
        assertFalse(finalFromXmlParser_mayBeLeaf);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getText()}
 * @utbot.activatesSwitch {@code switch(token) case: XmlTokenStream.XML_ATTRIBUTE_VALUE}
 *  */
    @Test
    public void testNextTextValue_XmlTokenStreamGetText() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        String _textValue = "";
        _xmlTokens._textValue = _textValue;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        String _currText = "";
        fromXmlParser._currText = _currText;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(4, finalFromXmlParser_xmlTokens_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#inArray()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getNamesToWrap()}
 *  */
    @Test
    public void testNextTextValue_Not_mayBeLeaf() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        XmlReadContext _parent = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(_parent, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_namesToWrap", _namesToWrap);
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parent);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 *  */
    @Test
    public void testNextTextValue__nextTokenEqualsNull_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        String _namespaceURI = "";
        _xmlTokens._namespaceURI = _namespaceURI;
        _xmlTokens._repeatElement = 3;
        String _nextNamespaceURI = "";
        _xmlTokens._nextNamespaceURI = _nextNamespaceURI;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 *  */
    @Test
    public void testNextTextValue__nextTokenEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        _parsingContext._lineNr = -255;
        _parsingContext._columnNr = -255;
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        _parsingContext._child = _parsingContext;
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        String _namespaceURI = "";
        _xmlTokens._namespaceURI = _namespaceURI;
        _xmlTokens._repeatElement = 3;
        String _nextLocalName = "";
        _xmlTokens._nextLocalName = _nextLocalName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        JsonToken initialFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_parsingContext_lineNr = fromXmlParser._parsingContext._lineNr;
        int finalFromXmlParser_parsingContext_columnNr = fromXmlParser._parsingContext._columnNr;
        Set finalFromXmlParser_parsingContext_namesToWrap = fromXmlParser._parsingContext._namesToWrap;
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        XmlReadContext xmlReadContext1 = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_index = ((Integer) getFieldValue(xmlReadContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(-1, finalFromXmlParser_parsingContext_lineNr);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_columnNr);
        
        assertNull(finalFromXmlParser_parsingContext_namesToWrap);
        
        assertEquals(2, finalFromXmlParser_parsingContext_type);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_index);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_nextToken != null): False}
 * @utbot.executesCondition {@code (_namesToWrap != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#setCurrentName(java.lang.String)}
 *  */
    @Test
    public void testNextTextValue__namesToWrapEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        _xmlTokens._repeatElement = 3;
        String _nextLocalName = "";
        _xmlTokens._nextLocalName = _nextLocalName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        Set finalFromXmlParser_namesToWrap = fromXmlParser._namesToWrap;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
        
        assertNull(finalFromXmlParser_namesToWrap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method nextTextValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testNextTextValue_ThrowIndexOutOfBoundsException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._repeatElement = 2;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:607) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        _xmlTokens._attributeCount = 256;
        _xmlTokens._nextAttributeIndex = 255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:607) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 4;
        _xmlTokens._attributeCount = 129;
        _xmlTokens._nextAttributeIndex = 127;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:607) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = -249;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag(XmlTokenStream.java:376)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:340)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:607) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int token = _xmlTokens.next();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_10() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        _xmlTokens._attributeCount = -255;
        _xmlTokens._nextAttributeIndex = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:607) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.inArray()
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_13() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:617) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.inArray()
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:641) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _namesToWrap = _parsingContext.getNamesToWrap();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {};
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:643) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _namesToWrap = _parsingContext.getNamesToWrap();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_6() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {(byte) -127};
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:643) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.executesCondition {@code (_mayBeLeaf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.inArray()
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_12() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:641) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.inArray()
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_11() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:617) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.createChildObjectContext(-1, -1);
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_7() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:613) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: _parsingContext.inArray()
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_8() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:617) */
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: token = _xmlTokens.next();
 *  */
    @Test
    public void testNextTextValue_ThrowNullPointerException_9() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._attributeCount = 1073741824;
        _xmlTokens._nextAttributeIndex = 1073741823;
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:618) */
        fromXmlParser.nextTextValue();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nextTextValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int token = _xmlTokens.next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNextTextValue_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int token = _xmlTokens.next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNextTextValue_ThrowIllegalStateException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 1;
        _xmlTokens._attributeCount = 256;
        _xmlTokens._nextAttributeIndex = 255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.nextTextValue();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#nextTextValue()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int token = _xmlTokens.next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNextTextValue_ThrowIllegalStateException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._repeatElement = 2;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.nextTextValue();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nextTextValue()
    
    @Test
    public void testNextTextValue1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _nextToken = JsonToken.VALUE_NUMBER_FLOAT;
        fromXmlParser._nextToken = _nextToken;
        
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        JsonToken finalFromXmlParser_nextToken = fromXmlParser._nextToken;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertNull(finalFromXmlParser_nextToken);
    }
    
    @Test
    public void testNextTextValue2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
    }
    
    @Test
    public void testNextTextValue3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        String _localName = "";
        _xmlTokens._localName = _localName;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _localName);
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperNamespace", _localName);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        fromXmlParser._mayBeLeaf = true;
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        String actual = fromXmlParser.nextTextValue();
        
        String expected = "";
        
        assertEquals(expected, actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(2, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertNull(finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertFalse(finalFromXmlParser_mayBeLeaf);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextTextValue4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        XmlReadContext _parent = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parent);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {(byte) 0};
        fromXmlParser._binaryValue = _binaryValue;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        JsonToken initialFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        JsonToken finalFromXmlParser_currToken = ((JsonToken) getFieldValue(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken"));
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
        
        assertEquals(2, finalFromXmlParser_xmlTokens_currentState);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextTextValue5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._localName = _currentName;
        String _namespaceURI = "";
        _xmlTokens._namespaceURI = _namespaceURI;
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        _xmlTokens._nextLocalName = _currentName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_namesToWrap", _namesToWrap);
        byte[] _binaryValue = {(byte) 0};
        fromXmlParser._binaryValue = _binaryValue;
        
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextTextValue6() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        String _namespaceURI = "";
        _xmlTokens._namespaceURI = _namespaceURI;
        _xmlTokens._repeatElement = 3;
        String _nextNamespaceURI = "";
        _xmlTokens._nextNamespaceURI = _nextNamespaceURI;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_namesToWrap", _namesToWrap);
        byte[] _binaryValue = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        fromXmlParser._binaryValue = _binaryValue;
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(0, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testNextTextValue7() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        _namesToWrap.add(null);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_namesToWrap", _namesToWrap);
        byte[] _binaryValue = new byte[12];
        fromXmlParser._binaryValue = _binaryValue;
        
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        
        String actual = fromXmlParser.nextTextValue();
        
        assertNull(actual);
        
        int finalFromXmlParser_xmlTokens_currentState = fromXmlParser._xmlTokens._currentState;
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        boolean finalFromXmlParser_mayBeLeaf = fromXmlParser._mayBeLeaf;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_currentState);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_repeatElement);
        
        assertTrue(finalFromXmlParser_mayBeLeaf);
        
        assertNull(finalFromXmlParser_binaryValue);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method nextTextValue()
    
    @Test
    public void testNextTextValue8() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:618) */
        fromXmlParser.nextTextValue();
    }
    
    @Test
    public void testNextTextValue9() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 4;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:607) */
        fromXmlParser.nextTextValue();
    }
    
    @Test
    public void testNextTextValue10() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 5;
        String _localName = "";
        _xmlTokens._localName = _localName;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _localName);
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperNamespace", _localName);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        byte[] _binaryValue = {};
        fromXmlParser._binaryValue = _binaryValue;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:643) */
        fromXmlParser.nextTextValue();
    }
    
    @Test
    public void testNextTextValue11() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:618) */
        fromXmlParser.nextTextValue();
    }
    
    @Test
    public void testNextTextValue12() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._attributeCount = 1;
        _xmlTokens._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:311)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:618) */
        fromXmlParser.nextTextValue();
    }
    
    @Test
    public void testNextTextValue13() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._repeatElement = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:162)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.nextTextValue(FromXmlParser.java:618) */
        fromXmlParser.nextTextValue();
    }
    ///endregion
    
    ///region Errors report for nextTextValue
    
    public void testNextTextValue_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getNumberType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumberType()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getNumberType()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNumberType_ReturnNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        JsonParser.NumberType actual = fromXmlParser.getNumberType();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getLongValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLongValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getLongValue()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetLongValue_ReturnZero() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        long actual = fromXmlParser.getLongValue();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getFloatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getFloatValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getFloatValue()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetFloatValue_ReturnZero() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        float actual = fromXmlParser.getFloatValue();
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBigIntegerValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBigIntegerValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getBigIntegerValue()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetBigIntegerValue_ReturnNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        BigInteger actual = fromXmlParser.getBigIntegerValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getDecimalValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDecimalValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getDecimalValue()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetDecimalValue_ReturnNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        BigDecimal actual = fromXmlParser.getDecimalValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getEmbeddedObject
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEmbeddedObject()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getEmbeddedObject()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEmbeddedObject_ReturnNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        Object actual = fromXmlParser.getEmbeddedObject();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.executesCondition {@code (_currToken != JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_binaryValue == null): False}
 * @utbot.returnsFrom {@code return _binaryValue;}
 *  */
    @Test
    public void testGetBinaryValue__binaryValueNotEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        byte[] _binaryValue = {(byte) -127};
        fromXmlParser._binaryValue = _binaryValue;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        byte[] actual = fromXmlParser.getBinaryValue(null);
        
        assertArrayEquals(_binaryValue, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.executesCondition {@code (_currToken != JsonToken.VALUE_STRING): True}
 * @utbot.executesCondition {@code (_currToken != JsonToken.VALUE_EMBEDDED_OBJECT): False}
 * @utbot.executesCondition {@code (_binaryValue == null): False}
 * @utbot.executesCondition {@code (_binaryValue == null): False}
 * @utbot.returnsFrom {@code return _binaryValue;}
 *  */
    @Test
    public void testGetBinaryValue__binaryValueNotEqualsNull_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        byte[] _binaryValue = {(byte) 0};
        fromXmlParser._binaryValue = _binaryValue;
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        byte[] actual = fromXmlParser.getBinaryValue(null);
        
        assertArrayEquals(_binaryValue, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getBinaryValue(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.executesCondition {@code (_currToken != JsonToken.VALUE_STRING): False}
 * @utbot.executesCondition {@code (_binaryValue == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.ByteArrayBuilder#toByteArray()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.returnsFrom {@code return _binaryValue;}
 *  */
    @Test
    public void testGetBinaryValue__binaryValueEqualsNull() throws Exception  {
        byte[] prevNO_BYTES = ByteArrayBuilder.NO_BYTES;
        try {
            byte[] noBytes = {};
            Class byteArrayBuilderClazz = Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder");
            setStaticField(byteArrayBuilderClazz, "NO_BYTES", noBytes);
            FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
            String _currText = "";
            fromXmlParser._currText = _currText;
            ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
            LinkedList _pastBlocks = new LinkedList();
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            _pastBlocks.add(null);
            setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
            setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
            setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
            fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
            JsonToken _currToken = JsonToken.VALUE_STRING;
            setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
            
            byte[] initialFromXmlParser_binaryValue = fromXmlParser._binaryValue;
            
            byte[] actual = fromXmlParser.getBinaryValue(base64Variant);
            
            assertArrayEquals(noBytes, actual);
            
            ByteArrayBuilder byteArrayBuilder = fromXmlParser._byteArrayBuilder;
            int finalFromXmlParser_byteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
            ByteArrayBuilder byteArrayBuilder1 = fromXmlParser._byteArrayBuilder;
            int finalFromXmlParser_byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder1, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
            byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
            
            assertFalse(initialFromXmlParser_binaryValue == finalFromXmlParser_binaryValue);
            
            assertEquals(0, finalFromXmlParser_byteArrayBuilder_pastLen);
            
            assertEquals(0, finalFromXmlParser_byteArrayBuilder_currBlockPtr);
        } finally {
            setStaticField(ByteArrayBuilder.class, "NO_BYTES", prevNO_BYTES);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void testGetBinaryValue1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "";
        fromXmlParser._currText = _currText;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        ByteArrayBuilder initialFromXmlParser_byteArrayBuilder = fromXmlParser._byteArrayBuilder;
        byte[] initialFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        byte[] actual = fromXmlParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        ByteArrayBuilder finalFromXmlParser_byteArrayBuilder = fromXmlParser._byteArrayBuilder;
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_byteArrayBuilder == finalFromXmlParser_byteArrayBuilder);
        
        assertFalse(initialFromXmlParser_binaryValue == finalFromXmlParser_binaryValue);
    }
    
    @Test
    public void testGetBinaryValue2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "\u0000\u0000";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        byte[] byteArray = {(byte) 0, (byte) 0};
        _pastBlocks.add(byteArray);
        byte[] byteArray1 = {};
        _pastBlocks.add(byteArray1);
        _pastBlocks.add(byteArray1);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] initialFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        byte[] actual = fromXmlParser.getBinaryValue(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
        
        byte[] finalFromXmlParser_binaryValue = fromXmlParser._binaryValue;
        
        assertFalse(initialFromXmlParser_binaryValue == finalFromXmlParser_binaryValue);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBinaryValue(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void testGetBinaryValue3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "d\u0000";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        byte[] byteArray = {(byte) 0, (byte) 0};
        _pastBlocks.add(byteArray);
        byte[] byteArray1 = {};
        _pastBlocks.add(byteArray1);
        _pastBlocks.add(byteArray1);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[40];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue] produces [java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 40]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:211)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:465)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue(FromXmlParser.java:830) */
        fromXmlParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue(FromXmlParser.java:823) */
        fromXmlParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_EMBEDDED_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue(FromXmlParser.java:823) */
        fromXmlParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue6() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:453)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue(FromXmlParser.java:830) */
        fromXmlParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue7() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "\u0080\u0080";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        byte[] byteArray = {(byte) 0, (byte) 0};
        _pastBlocks.add(byteArray);
        byte[] byteArray1 = {};
        _pastBlocks.add(byteArray1);
        _pastBlocks.add(byteArray1);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0080');
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:416)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue(FromXmlParser.java:830) */
        fromXmlParser.getBinaryValue(base64Variant);
    }
    
    @Test
    public void testGetBinaryValue8() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "$\u0000";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        byte[] byteArray = {(byte) 0, (byte) 0};
        _pastBlocks.add(byteArray);
        byte[] byteArray1 = {};
        _pastBlocks.add(byteArray1);
        _pastBlocks.add(byteArray1);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[40];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.util.ByteArrayBuilder.append(ByteArrayBuilder.java:78)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:485)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getBinaryValue(FromXmlParser.java:830) */
        fromXmlParser.getBinaryValue(base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getIntValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getIntValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getIntValue()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetIntValue_ReturnZero() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        int actual = fromXmlParser.getIntValue();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 *  */
    @Test
    public void testGetTextCharacters_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = fromXmlParser.getTextCharacters();
        
        char[] expected = {'['};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 *  */
    @Test
    public void testGetTextCharacters() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = fromXmlParser.getTextCharacters();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 * @utbot.returnsFrom {@code return (text == null) ? null : text.toCharArray();}
 *  */
    @Test
    public void testGetTextCharacters_ReturnTextNotEqualsNull_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = fromXmlParser.getTextCharacters();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 * @utbot.returnsFrom {@code return (text == null) ? null : text.toCharArray();}
 *  */
    @Test
    public void testGetTextCharacters_ReturnTextNotEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        char[] actual = fromXmlParser.getTextCharacters();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 * @utbot.returnsFrom {@code return (text == null) ? null : text.toCharArray();}
 *  */
    @Test
    public void testGetTextCharacters_ReturnTextNotEqualsNull_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "";
        fromXmlParser._currText = _currText;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = fromXmlParser.getTextCharacters();
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 * @utbot.returnsFrom {@code return (text == null) ? null : text.toCharArray();}
 *  */
    @Test
    public void testGetTextCharacters_ReturnTextNotEqualsNull_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        char[] actual = fromXmlParser.getTextCharacters();
        
        char[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextCharacters()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String text = getText();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetTextCharacters_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getTextCharacters();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (t == null): True}
 *  */
    @Test
    public void testGetValueAsString_TEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getValueAsString(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (t == null): False}
    /// invoke:
    ///     {@link com.fasterxml.jackson.core.JsonToken#ordinal()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 *  */
    @Test
    public void testGetValueAsString() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (str != null): False}
 *  */
    @Test
    public void testGetValueAsString_StrEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        _xmlTokens._nextAttributeIndex = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (str != null): False}
 *  */
    @Test
    public void testGetValueAsString_StrEqualsNull_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(t) case: default}
 * @utbot.returnsFrom {@code return _currText;}
 *  */
    @Test
    public void testGetValueAsString_Return_currText() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.activatesSwitch {@code switch(t) case: default}
 * @utbot.returnsFrom {@code return getCurrentName();}
 *  */
    @Test
    public void testGetValueAsString_FromXmlParserGetCurrentName() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertEquals(_currentName, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (str != null): False}
 *  */
    @Test
    public void testGetValueAsString_StrEqualsNull_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString(null);
        
        assertNull(actual);
        
        XMLStreamReader2 xMLStreamReader2 = fromXmlParser._xmlTokens._xmlReader;
        int finalFromXmlParser_xmlTokens_xmlReader_depth = ((Integer) getFieldValue(xMLStreamReader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_depth"));
        
        assertEquals(-1, finalFromXmlParser_xmlTokens_xmlReader_depth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String str = _xmlTokens.convertToString();
 *  */
    @Test
    public void testGetValueAsString_ThrowIndexOutOfBoundsException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11NSDocumentScannerImpl fScanner = ((XML11NSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$ElementState");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_parent", _currentWrapper);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        fromXmlParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String str = _xmlTokens.convertToString();
 *  */
    @Test
    public void testGetValueAsString_ThrowIndexOutOfBoundsException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$ElementState");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        ElementWrapper _parent = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_parent", _parent);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fromXmlParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String str = _xmlTokens.convertToString();
 *  */
    @Test
    public void testGetValueAsString_ThrowIndexOutOfBoundsException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$ElementState");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        fromXmlParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String str = _xmlTokens.convertToString();
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:753) */
        fromXmlParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String str = _xmlTokens.convertToString();
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString(XmlTokenStream.java:272)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:753) */
        fromXmlParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (str != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.getParent();
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 268435456);
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$Attribute");
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "localpart", _typedContent);
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "uri", _typedContent);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        _xmlTokens._attributeCount = -255;
        _xmlTokens._localName = _typedContent;
        _xmlTokens._namespaceURI = _typedContent;
        _xmlTokens._textValue = _typedContent;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_parent", _currentWrapper);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException] */
        fromXmlParser.getValueAsString(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (str != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getNamesToWrap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _namesToWrap = _parsingContext.getNamesToWrap();
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$Attribute");
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "localpart", _typedContent);
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "uri", _typedContent);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        _xmlTokens._attributeCount = -255;
        _xmlTokens._localName = _typedContent;
        _xmlTokens._namespaceURI = _typedContent;
        _xmlTokens._textValue = _typedContent;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_parent", _currentWrapper);
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException] */
        fromXmlParser.getValueAsString(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString(java.lang.String)}
 * @utbot.executesCondition {@code (t == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#ordinal()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.activatesSwitch {@code switch(t) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return getCurrentName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetValueAsString_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getValueAsString(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        _xmlTokens._nextAttributeIndex = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertEquals(_currentName, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_6() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.returnsFrom {@code return getValueAsString(null);}
 *  */
    @Test
    public void testGetValueAsString_ReturnGetValueAsString_7() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader2 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getValueAsString();
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetValueAsString_ThrowIndexOutOfBoundsException1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fromXmlParser.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetValueAsString_ThrowIndexOutOfBoundsException_11() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        fromXmlParser.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetValueAsString_ThrowIndexOutOfBoundsException_21() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 67108864);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        fromXmlParser.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getValueAsString(null);
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:753)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:733) */
        fromXmlParser.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getValueAsString(null);
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_11() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName(FromXmlParser.java:330)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:745)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:733) */
        fromXmlParser.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetValueAsString_ThrowNullPointerException_21() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 3;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:354)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString(XmlTokenStream.java:272)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:753)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getValueAsString(FromXmlParser.java:733) */
        fromXmlParser.getValueAsString();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getValueAsString()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return getValueAsString(null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetValueAsString_ThrowIllegalStateException1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getValueAsString();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getValueAsString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetValueAsString_ThrowIllegalStateException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parsingContext);
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_namesToWrap", _namesToWrap);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 536870912);
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$Attribute");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(_xmlTokens, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        _xmlTokens._currentState = 3;
        _xmlTokens._attributeCount = -255;
        _xmlTokens._repeatElement = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getValueAsString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.hasTextCharacters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasTextCharacters()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#hasTextCharacters()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testHasTextCharacters_ReturnFalse() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        boolean actual = fromXmlParser.hasTextCharacters();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getDoubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDoubleValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getDoubleValue()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetDoubleValue_ReturnZero() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        double actual = fromXmlParser.getDoubleValue();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getTextOffset
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTextOffset()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getTextOffset()}
 * @utbot.returnsFrom {@code return 0;}
 *  */
    @Test
    public void testGetTextOffset_ReturnZero() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        int actual = fromXmlParser.getTextOffset();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getCurrentName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetCurrentName__currTokenNotEqualsJsonTokenSTART_ARRAY() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getCurrentName();
        
        assertEquals(_currentName, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getCurrentName()}
 * @utbot.returnsFrom {@code return name;}
 *  */
    @Test
    public void testGetCurrentName__currTokenEqualsJsonTokenSTART_OBJECT() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parsingContext);
        String _currentName = "";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        String actual = fromXmlParser.getCurrentName();
        
        assertEquals(_currentName, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: XmlReadContext parent = _parsingContext.getParent();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName(FromXmlParser.java:327) */
        fromXmlParser.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getCurrentName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name = _parsingContext.getCurrentName();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName(FromXmlParser.java:330) */
        fromXmlParser.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: XmlReadContext parent = _parsingContext.getParent();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.START_ARRAY;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName(FromXmlParser.java:327) */
        fromXmlParser.getCurrentName();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name = parent.getCurrentName();
 *  */
    @Test
    public void testGetCurrentName_ThrowNullPointerException_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.START_OBJECT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentName(FromXmlParser.java:328) */
        fromXmlParser.getCurrentName();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCurrentName()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getCurrentName()}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_OBJECT): False}
 * @utbot.executesCondition {@code (_currToken == JsonToken.START_ARRAY): False}
 * @utbot.executesCondition {@code (name == null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getCurrentName()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: name == null
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetCurrentName_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser.getCurrentName();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getNumberValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumberValue()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getNumberValue()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNumberValue_ReturnNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        Number actual = fromXmlParser.getNumberValue();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._isEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _isEmpty(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_isEmpty(java.lang.String)}
 * @utbot.executesCondition {@code ((str == null)): True}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isEmpty_StrEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        boolean actual = fromXmlParser._isEmpty(null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_isEmpty(java.lang.String)}
 * @utbot.executesCondition {@code ((str == null)): False}
 * @utbot.executesCondition {@code (len > 0): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isEmpty_LenLessOrEqualZero() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String string = "";
        
        boolean actual = fromXmlParser._isEmpty(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_isEmpty(java.lang.String)}
 * @utbot.executesCondition {@code ((str == null)): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 *  */
    @Test
    public void test_isEmpty_StrCharAtGreaterThanChar() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String string = "!";
        
        boolean actual = fromXmlParser._isEmpty(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_isEmpty(java.lang.String)}
 * @utbot.executesCondition {@code ((str == null)): False}
 * @utbot.executesCondition {@code (len > 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; ++i)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void test_isEmpty_StrCharAtLessOrEqualChar() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String string = " ";
        
        boolean actual = fromXmlParser._isEmpty(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getStaxReader
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getStaxReader()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getStaxReader()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getXmlReader()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _xmlTokens.getXmlReader();
 *  */
    @Test
    public void testGetStaxReader_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getStaxReader] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getStaxReader(FromXmlParser.java:272) */
        fromXmlParser.getStaxReader();
    }
    ///endregion
    
    ///region Errors report for getStaxReader
    
    public void testGetStaxReader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _updateState(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.activatesSwitch {@code switch(t)}
 *  */
    @Test
    public void test_updateState_SwitchT() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_updateState_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_updateState_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        
        XmlReadContext initialFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        
        XmlReadContext finalFromXmlParser_parsingContext = fromXmlParser._parsingContext;
        
        assertFalse(initialFromXmlParser_parsingContext == finalFromXmlParser_parsingContext);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getNamesToWrap()}
 * @utbot.activatesSwitch {@code switch(t) case: END_ARRAY}
 *  */
    @Test
    public void test_updateState_XmlReadContextGetNamesToWrap() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_parent", _parsingContext);
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_namesToWrap", _namesToWrap);
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_updateState() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        _parsingContext._lineNr = -255;
        _parsingContext._columnNr = -255;
        _parsingContext._child = _parsingContext;
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", -255);
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_index", -255);
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        
        int finalFromXmlParser_parsingContext_lineNr = fromXmlParser._parsingContext._lineNr;
        int finalFromXmlParser_parsingContext_columnNr = fromXmlParser._parsingContext._columnNr;
        Set finalFromXmlParser_parsingContext_namesToWrap = fromXmlParser._parsingContext._namesToWrap;
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        XmlReadContext xmlReadContext1 = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_index = ((Integer) getFieldValue(xmlReadContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(-1, finalFromXmlParser_parsingContext_lineNr);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_columnNr);
        
        assertNull(finalFromXmlParser_parsingContext_namesToWrap);
        
        assertEquals(2, finalFromXmlParser_parsingContext_type);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 *  */
    @Test
    public void test_updateState_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        _parsingContext._child = _parsingContext;
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        
        int finalFromXmlParser_parsingContext_lineNr = fromXmlParser._parsingContext._lineNr;
        int finalFromXmlParser_parsingContext_columnNr = fromXmlParser._parsingContext._columnNr;
        Set finalFromXmlParser_parsingContext_namesToWrap = fromXmlParser._parsingContext._namesToWrap;
        XmlReadContext xmlReadContext = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_type = ((Integer) getFieldValue(xmlReadContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type"));
        XmlReadContext xmlReadContext1 = fromXmlParser._parsingContext;
        int finalFromXmlParser_parsingContext_index = ((Integer) getFieldValue(xmlReadContext1, "com.fasterxml.jackson.core.JsonStreamContext", "_index"));
        
        assertEquals(-1, finalFromXmlParser_parsingContext_lineNr);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_columnNr);
        
        assertNull(finalFromXmlParser_parsingContext_namesToWrap);
        
        assertEquals(1, finalFromXmlParser_parsingContext_type);
        
        assertEquals(-1, finalFromXmlParser_parsingContext_index);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#setCurrentName(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(t) case: FIELD_NAME}
 *  */
    @Test
    public void test_updateState_XmlReadContextSetCurrentName() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _updateState(com.fasterxml.jackson.core.JsonToken)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.JsonToken#ordinal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(t)
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:689) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = ((Object) null);
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#createChildArrayContext(int,int)}
 * @utbot.activatesSwitch {@code switch(t) case: START_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.createChildArrayContext(-1, -1);
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException_1() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken jsonToken = JsonToken.START_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:694) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.activatesSwitch {@code switch(t) case: END_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.getParent();
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException_2() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken jsonToken = JsonToken.END_ARRAY;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:698) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#createChildObjectContext(int,int)}
 * @utbot.activatesSwitch {@code switch(t) case: START_OBJECT}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext = _parsingContext.createChildObjectContext(-1, -1);
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException_3() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken jsonToken = JsonToken.START_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:691) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getNamesToWrap()}
 * @utbot.activatesSwitch {@code switch(t) case: END_ARRAY}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _namesToWrap = _parsingContext.getNamesToWrap();
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException_5() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:699) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setCurrentName(_xmlTokens.getLocalName());
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException_4() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:702) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_updateState(com.fasterxml.jackson.core.JsonToken)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setCurrentName(_xmlTokens.getLocalName());
 *  */
    @Test
    public void test_updateState_ThrowNullPointerException_6() throws Throwable  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._updateState(FromXmlParser.java:702) */
        Class fromXmlParserClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser");
        Class jsonTokenType = Class.forName("com.fasterxml.jackson.core.JsonToken");
        Method _updateStateMethod = fromXmlParserClazz.getDeclaredMethod("_updateState", jsonTokenType);
        _updateStateMethod.setAccessible(true);
        java.lang.Object[] _updateStateMethodArguments = new java.lang.Object[1];
        _updateStateMethodArguments[0] = jsonToken;
        try {
            _updateStateMethod.invoke(fromXmlParser, _updateStateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _decodeBase64(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_getByteArrayBuilder()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(java.lang.String,com.fasterxml.jackson.core.util.ByteArrayBuilder,com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.util.ByteArrayBuilder#toByteArray()}
 * @utbot.returnsFrom {@code return builder.toByteArray();}
 *  */
    @Test
    public void test_decodeBase64_ByteArrayBuilderToByteArray() throws Exception  {
        byte[] prevNO_BYTES = ByteArrayBuilder.NO_BYTES;
        try {
            byte[] noBytes = {};
            Class byteArrayBuilderClazz = Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder");
            setStaticField(byteArrayBuilderClazz, "NO_BYTES", noBytes);
            FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
            String _currText = "";
            fromXmlParser._currText = _currText;
            ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
            LinkedList _pastBlocks = new LinkedList();
            setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
            setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
            setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
            fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
            JsonToken _currToken = JsonToken.VALUE_STRING;
            setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
            Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
            
            byte[] actual = fromXmlParser._decodeBase64(base64Variant);
            
            assertArrayEquals(noBytes, actual);
            
            ByteArrayBuilder byteArrayBuilder = fromXmlParser._byteArrayBuilder;
            int finalFromXmlParser_byteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
            ByteArrayBuilder byteArrayBuilder1 = fromXmlParser._byteArrayBuilder;
            int finalFromXmlParser_byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder1, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
            
            assertEquals(0, finalFromXmlParser_byteArrayBuilder_pastLen);
            
            assertEquals(0, finalFromXmlParser_byteArrayBuilder_currBlockPtr);
        } finally {
            setStaticField(ByteArrayBuilder.class, "NO_BYTES", prevNO_BYTES);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _decodeBase64(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_getByteArrayBuilder()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String str = getText();
 *  */
    @Test
    public void test_decodeBase64_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_NUMBER_INT;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _decodeBase64(com.fasterxml.jackson.core.Base64Variant)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_decodeBase64(com.fasterxml.jackson.core.Base64Variant)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_getByteArrayBuilder()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#getText()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final String str = getText();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_decodeBase64_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        
        fromXmlParser._decodeBase64(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method _decodeBase64(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void test_decodeBase641() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "\u0000\u0000";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] actual = fromXmlParser._decodeBase64(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void test_decodeBase642() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "\u0000";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] actual = fromXmlParser._decodeBase64(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void test_decodeBase643() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "\u0000\u0000";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] actual = fromXmlParser._decodeBase64(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void test_decodeBase644() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "\u0000";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        byte[] actual = fromXmlParser._decodeBase64(base64Variant);
        
        byte[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _decodeBase64(com.fasterxml.jackson.core.Base64Variant)
    
    @Test
    public void test_decodeBase645() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "$}";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        int[] _asciiToBase64 = new int[40];
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_asciiToBase64", _asciiToBase64);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.ArrayIndexOutOfBoundsException: Index 125 out of bounds for length 40]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:211)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:475)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(base64Variant);
    }
    
    @Test
    public void test_decodeBase646() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:211)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:465)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(base64Variant);
    }
    
    @Test
    public void test_decodeBase647() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.NOT_AVAILABLE;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0000');
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:453)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(base64Variant);
    }
    
    @Test
    public void test_decodeBase648() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        String _currText = "\u0080}";
        fromXmlParser._currText = _currText;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_STRING;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        setField(base64Variant, "com.fasterxml.jackson.core.Base64Variant", "_paddingChar", '\u0080');
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:416)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(base64Variant);
    }
    
    @Test
    public void test_decodeBase649() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        String _currentName = "\u00C0}";
        _parsingContext._currentName = _currentName;
        fromXmlParser._parsingContext = _parsingContext;
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.FIELD_NAME;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:416)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(base64Variant);
    }
    
    @Test
    public void test_decodeBase6410() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        byte[] byteArray = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        _pastBlocks.add(byteArray);
        byte[] byteArray1 = {};
        _pastBlocks.add(byteArray1);
        _pastBlocks.add(byteArray1);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        JsonToken _currToken = JsonToken.VALUE_NULL;
        setField(fromXmlParser, "com.fasterxml.jackson.core.base.ParserMinimalBase", "_currToken", _currToken);
        Base64Variant base64Variant = ((Base64Variant) createInstance("com.fasterxml.jackson.core.Base64Variant"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.core.Base64Variant.decodeBase64Char(Base64Variant.java:211)
            com.fasterxml.jackson.core.Base64Variant.decode(Base64Variant.java:465)
            com.fasterxml.jackson.core.base.ParserMinimalBase._decodeBase64(ParserMinimalBase.java:414)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._decodeBase64(FromXmlParser.java:843) */
        fromXmlParser._decodeBase64(base64Variant);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleEOF()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_handleEOF()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#inRoot()}
 *  */
    @Test
    public void test_handleEOF_XmlReadContextInRoot() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        
        fromXmlParser._handleEOF();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleEOF()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_handleEOF()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !_parsingContext.inRoot()
 *  */
    @Test
    public void test_handleEOF_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:915) */
        fromXmlParser._handleEOF();
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_handleEOF()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#inRoot()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#getTypeDesc()}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link com.fasterxml.jackson.core.io.IOContext#getSourceReference()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _reportInvalidEOF(": expected close marker for " + _parsingContext.getTypeDesc() + " (from " + _parsingContext.getStartLocation(_ioContext.getSourceReference()) + ")");
 *  */
    @Test
    public void test_handleEOF_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 3);
        fromXmlParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:916) */
        fromXmlParser._handleEOF();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method _handleEOF()
    
    @Test
    public void test_handleEOF1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        Character _sourceRef = '\u0100';
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:916) */
        fromXmlParser._handleEOF();
    }
    
    @Test
    public void test_handleEOF2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        Integer _sourceRef = 9777;
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 3);
        fromXmlParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:916) */
        fromXmlParser._handleEOF();
    }
    
    @Test
    public void test_handleEOF3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 3);
        fromXmlParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:916) */
        fromXmlParser._handleEOF();
    }
    
    @Test
    public void test_handleEOF4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        Integer _sourceRef = 1;
        setField(_ioContext, "com.fasterxml.jackson.core.io.IOContext", "_sourceRef", _sourceRef);
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:916) */
        fromXmlParser._handleEOF();
    }
    
    @Test
    public void test_handleEOF5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        IOContext _ioContext = ((IOContext) createInstance("com.fasterxml.jackson.core.io.IOContext"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_ioContext", _ioContext);
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        setField(_parsingContext, "com.fasterxml.jackson.core.JsonStreamContext", "_type", 1);
        fromXmlParser._parsingContext = _parsingContext;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.getCurrentLocation(FromXmlParser.java:393)
            com.fasterxml.jackson.core.JsonParseException.<init>(JsonParseException.java:36)
            com.fasterxml.jackson.core.JsonParser._constructError(JsonParser.java:1586)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportError(ParserMinimalBase.java:521)
            com.fasterxml.jackson.core.base.ParserMinimalBase._reportInvalidEOF(ParserMinimalBase.java:458)
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._handleEOF(FromXmlParser.java:916) */
        fromXmlParser._handleEOF();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addVirtualWrapping(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext#setNamesToWrap(java.util.Set)}
 *  */
    @Test
    public void testAddVirtualWrapping_NameEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        LinkedHashSet _namesToWrap = new LinkedHashSet();
        setField(_parsingContext, "com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext", "_namesToWrap", _namesToWrap);
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        fromXmlParser.addVirtualWrapping(null);
        
        Set finalFromXmlParser_namesToWrap = fromXmlParser._namesToWrap;
        
        assertNull(finalFromXmlParser_namesToWrap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addVirtualWrapping(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = _xmlTokens.getLocalName();
 *  */
    @Test
    public void testAddVirtualWrapping_ThrowNullPointerException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping(FromXmlParser.java:303) */
        fromXmlParser.addVirtualWrapping(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name != null && namesToWrap.contains(name)
 *  */
    @Test
    public void testAddVirtualWrapping_ThrowNullPointerException_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping(FromXmlParser.java:304) */
        fromXmlParser.addVirtualWrapping(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setNamesToWrap(namesToWrap);
 *  */
    @Test
    public void testAddVirtualWrapping_ThrowNullPointerException_2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping(FromXmlParser.java:308) */
        fromXmlParser.addVirtualWrapping(null);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (namesToWrap.contains(name)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setNamesToWrap(namesToWrap);
 *  */
    @Test
    public void testAddVirtualWrapping_ThrowNullPointerException_3() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping(FromXmlParser.java:308) */
        fromXmlParser.addVirtualWrapping(linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (namesToWrap.contains(name)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setNamesToWrap(namesToWrap);
 *  */
    @Test
    public void testAddVirtualWrapping_ThrowNullPointerException_4() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        String _localName = "";
        _xmlTokens._localName = _localName;
        String _namespaceURI = "";
        _xmlTokens._namespaceURI = _namespaceURI;
        _xmlTokens._repeatElement = -255;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(_localName);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping(FromXmlParser.java:308) */
        fromXmlParser.addVirtualWrapping(linkedHashSet);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (namesToWrap.contains(name)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _parsingContext.setNamesToWrap(namesToWrap);
 *  */
    @Test
    public void testAddVirtualWrapping_ThrowNullPointerException_5() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        String _localName = "";
        _xmlTokens._localName = _localName;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        _xmlTokens._currentWrapper = _currentWrapper;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(_localName);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.addVirtualWrapping(FromXmlParser.java:308) */
        fromXmlParser.addVirtualWrapping(linkedHashSet);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addVirtualWrapping(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#addVirtualWrapping(java.util.Set)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (namesToWrap.contains(name)): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#repeatStartElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _xmlTokens.repeatStartElement();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddVirtualWrapping_ThrowIllegalStateException() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = -255;
        String _localName = "";
        _xmlTokens._localName = _localName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(_localName);
        
        fromXmlParser.addVirtualWrapping(linkedHashSet);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addVirtualWrapping(java.util.Set)
    
    @Test
    public void testAddVirtualWrapping1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        String _localName = "";
        _xmlTokens._localName = _localName;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        
        fromXmlParser.addVirtualWrapping(linkedHashSet);
    }
    
    @Test
    public void testAddVirtualWrapping2() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        XmlReadContext _parsingContext = ((XmlReadContext) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlReadContext"));
        fromXmlParser._parsingContext = _parsingContext;
        XmlTokenStream _xmlTokens = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        _xmlTokens._currentState = 1;
        String _localName = "";
        _xmlTokens._localName = _localName;
        String _namespaceURI = "";
        _xmlTokens._namespaceURI = _namespaceURI;
        setField(fromXmlParser, "com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser", "_xmlTokens", _xmlTokens);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(_localName);
        
        ElementWrapper initialFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        
        fromXmlParser.addVirtualWrapping(linkedHashSet);
        
        int finalFromXmlParser_xmlTokens_repeatElement = fromXmlParser._xmlTokens._repeatElement;
        ElementWrapper finalFromXmlParser_xmlTokens_currentWrapper = fromXmlParser._xmlTokens._currentWrapper;
        
        assertFalse(initialFromXmlParser_xmlTokens_currentWrapper == finalFromXmlParser_xmlTokens_currentWrapper);
        
        assertEquals(1, finalFromXmlParser_xmlTokens_repeatElement);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._releaseBuffers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _releaseBuffers()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_releaseBuffers()}
 *  */
    @Test
    public void test_releaseBuffers() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        fromXmlParser._releaseBuffers();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser._getByteArrayBuilder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _getByteArrayBuilder()
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_getByteArrayBuilder()}
 * @utbot.executesCondition {@code (_byteArrayBuilder == null): True}
 * @utbot.returnsFrom {@code return _byteArrayBuilder;}
 *  */
    @Test
    public void test_getByteArrayBuilder__byteArrayBuilderEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        ByteArrayBuilder initialFromXmlParser_byteArrayBuilder = fromXmlParser._byteArrayBuilder;
        
        ByteArrayBuilder actual = fromXmlParser._getByteArrayBuilder();
        
        ByteArrayBuilder expected = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        byte[] _currBlock = new byte[500];
        setField(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock", _currBlock);
        
        BufferRecycler actual_bufferRecycler = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_bufferRecycler"));
        assertNull(actual_bufferRecycler);
        
        LinkedList expected_pastBlocks = ((LinkedList) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        LinkedList actual_pastBlocks = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        assertTrue(deepEquals(expected_pastBlocks, actual_pastBlocks));
        
        int expected_pastLen = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        int actual_pastLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        assertEquals(expected_pastLen, actual_pastLen);
        
        byte[] expected_currBlock = ((byte[]) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        byte[] actual_currBlock = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        int expected_currBlockSize = expected_currBlock.length;
        assertEquals(expected_currBlockSize, actual_currBlock.length);
        assertArrayEquals(expected_currBlock, actual_currBlock);
        
        int expected_currBlockPtr = ((Integer) getFieldValue(expected, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        int actual_currBlockPtr = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        assertEquals(expected_currBlockPtr, actual_currBlockPtr);
        
        ByteArrayBuilder finalFromXmlParser_byteArrayBuilder = fromXmlParser._byteArrayBuilder;
        
        assertFalse(initialFromXmlParser_byteArrayBuilder == finalFromXmlParser_byteArrayBuilder);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_getByteArrayBuilder()}
 * @utbot.executesCondition {@code (_byteArrayBuilder == null): False}
 * @utbot.returnsFrom {@code return _byteArrayBuilder;}
 *  */
    @Test
    public void test_getByteArrayBuilder__byteArrayBuilderNotEqualsNull() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        
        ByteArrayBuilder actual = fromXmlParser._getByteArrayBuilder();
        
        BufferRecycler actual_bufferRecycler = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_bufferRecycler"));
        assertNull(actual_bufferRecycler);
        
        LinkedList _byteArrayBuilder_pastBlocks = ((LinkedList) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        LinkedList actual_pastBlocks = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        assertTrue(deepEquals(_byteArrayBuilder_pastBlocks, actual_pastBlocks));
        
        int _byteArrayBuilder_pastLen = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        int actual_pastLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        assertEquals(_byteArrayBuilder_pastLen, actual_pastLen);
        
        byte[] actual_currBlock = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        assertNull(actual_currBlock);
        
        int _byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        int actual_currBlockPtr = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        assertEquals(_byteArrayBuilder_currBlockPtr, actual_currBlockPtr);
        
        ByteArrayBuilder byteArrayBuilder = fromXmlParser._byteArrayBuilder;
        int finalFromXmlParser_byteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        ByteArrayBuilder byteArrayBuilder1 = fromXmlParser._byteArrayBuilder;
        int finalFromXmlParser_byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder1, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        
        assertEquals(0, finalFromXmlParser_byteArrayBuilder_pastLen);
        
        assertEquals(0, finalFromXmlParser_byteArrayBuilder_currBlockPtr);
    }
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#_getByteArrayBuilder()}
 * @utbot.executesCondition {@code (_byteArrayBuilder == null): False}
 * @utbot.returnsFrom {@code return _byteArrayBuilder;}
 *  */
    @Test
    public void test_getByteArrayBuilder__byteArrayBuilderNotEqualsNull_1() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        ByteArrayBuilder _byteArrayBuilder = ((ByteArrayBuilder) createInstance("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        LinkedList _pastBlocks = new LinkedList();
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        _pastBlocks.add(null);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks", _pastBlocks);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen", -255);
        setField(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr", -255);
        fromXmlParser._byteArrayBuilder = _byteArrayBuilder;
        
        ByteArrayBuilder actual = fromXmlParser._getByteArrayBuilder();
        
        BufferRecycler actual_bufferRecycler = ((BufferRecycler) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_bufferRecycler"));
        assertNull(actual_bufferRecycler);
        
        LinkedList _byteArrayBuilder_pastBlocks = ((LinkedList) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        LinkedList actual_pastBlocks = ((LinkedList) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastBlocks"));
        assertTrue(deepEquals(_byteArrayBuilder_pastBlocks, actual_pastBlocks));
        
        int _byteArrayBuilder_pastLen = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        int actual_pastLen = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        assertEquals(_byteArrayBuilder_pastLen, actual_pastLen);
        
        byte[] actual_currBlock = ((byte[]) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlock"));
        assertNull(actual_currBlock);
        
        int _byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(_byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        int actual_currBlockPtr = ((Integer) getFieldValue(actual, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        assertEquals(_byteArrayBuilder_currBlockPtr, actual_currBlockPtr);
        
        ByteArrayBuilder byteArrayBuilder = fromXmlParser._byteArrayBuilder;
        int finalFromXmlParser_byteArrayBuilder_pastLen = ((Integer) getFieldValue(byteArrayBuilder, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_pastLen"));
        ByteArrayBuilder byteArrayBuilder1 = fromXmlParser._byteArrayBuilder;
        int finalFromXmlParser_byteArrayBuilder_currBlockPtr = ((Integer) getFieldValue(byteArrayBuilder1, "com.fasterxml.jackson.core.util.ByteArrayBuilder", "_currBlockPtr"));
        
        assertEquals(0, finalFromXmlParser_byteArrayBuilder_pastLen);
        
        assertEquals(0, finalFromXmlParser_byteArrayBuilder_currBlockPtr);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser.setXMLTextElementName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setXMLTextElementName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FromXmlParser}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser#setXMLTextElementName(java.lang.String)}
 *  */
    @Test
    public void testSetXMLTextElementName() throws Exception  {
        FromXmlParser fromXmlParser = ((FromXmlParser) createInstance("com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser"));
        
        fromXmlParser.setXMLTextElementName(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields878139045479300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields878139045479300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass878139045488300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878139045479300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878139045488300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields878139045957800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878139045957800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878139045962600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878139045957800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878139045962600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
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
        
            java.lang.reflect.Method methodForGetDeclaredFields878139046174600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878139046174600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878139046176900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878139046174600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878139046176900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

