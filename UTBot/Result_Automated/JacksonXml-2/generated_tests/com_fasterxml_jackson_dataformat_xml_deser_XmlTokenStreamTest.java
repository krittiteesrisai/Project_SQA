package com.fasterxml.jackson.dataformat.xml.deser;

import org.junit.Test;
import org.codehaus.stax2.ri.Stax2ReaderAdapter;
import com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl;
import javax.xml.stream.util.StreamReaderDelegate;
import com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl;
import com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl;
import com.sun.xml.internal.stream.dtd.DTDGrammarUtil;
import org.codehaus.stax2.XMLStreamReader2;
import javax.xml.stream.XMLStreamReader;
import com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl;
import com.sun.org.apache.xerces.internal.impl.XMLEntityScanner;
import com.fasterxml.jackson.core.JsonLocation;
import com.sun.xml.internal.stream.Entity.ScannedEntity;
import com.sun.xml.internal.stream.Entity;
import com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription;
import com.sun.org.apache.xerces.internal.impl.XML11EntityScanner;
import com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl;
import com.sun.org.apache.xerces.internal.xni.QName;
import java.lang.reflect.Method;
import java.io.IOException;
import com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl;
import org.codehaus.stax2.XMLStreamLocation2;
import java.lang.reflect.Constructor;
import org.codehaus.stax2.ri.Stax2LocationAdapter;
import javax.xml.stream.Location;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_fasterxml_jackson_dataformat_xml_deser_XmlTokenStreamTest {
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.returnsFrom {@code return _next();}
 *  */
    @Test
    public void testNext__repeatElementEqualsZero() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 3;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(4, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(4, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.returnsFrom {@code return _next();}
 *  */
    @Test
    public void testNext__repeatElementEqualsZero_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 6;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(6, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): True}
 * @utbot.returnsFrom {@code return (_currentState = _handleRepeatElement());}
 *  */
    @Test
    public void testNext__repeatElementNotEqualsZero_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.returnsFrom {@code return _next();}
 *  */
    @Test
    public void testNext__repeatElementEqualsZero_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.returnsFrom {@code return _next();}
 *  */
    @Test
    public void testNext__repeatElementEqualsZero_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.returnsFrom {@code return _next();}
 *  */
    @Test
    public void testNext__repeatElementEqualsZero_5() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 1;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): True}
 * @utbot.returnsFrom {@code return (_currentState = _handleRepeatElement());}
 *  */
    @Test
    public void testNext__repeatElementNotEqualsZero_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): True}
 * @utbot.returnsFrom {@code return (_currentState = _handleRepeatElement());}
 *  */
    @Test
    public void testNext__repeatElementNotEqualsZero() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 3;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.returnsFrom {@code return _next();}
 *  */
    @Test
    public void testNext__repeatElementEqualsZero_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        int actual = xmlTokenStream.next();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(2, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return (_currentState = _handleRepeatElement());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNext_ThrowIllegalStateException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = -255;
        
        xmlTokenStream.next();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.executesCondition {@code (_repeatElement != 0): False}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return _next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNext_ThrowIllegalStateException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", -1);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 2;
        
        xmlTokenStream.next();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testNext_ThrowIndexOutOfBoundsException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fNamespaces", true);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fLength", 1);
        java.lang.Object[] fAttributes1 = createArray("com.sun.org.apache.xerces.internal.util.XMLAttributesImpl$Attribute", 0);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fAttributes", fAttributes1);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        DTDGrammarUtil dtdGrammarUtil = ((DTDGrammarUtil) createInstance("com.sun.xml.internal.stream.dtd.DTDGrammarUtil"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "dtdGrammarUtil", dtdGrammarUtil);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 1;
        xmlTokenStream._nextAttributeIndex = -1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream.next();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _next();
 *  */
    @Test
    public void testNext_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -249;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag(XmlTokenStream.java:384)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:348)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168) */
        xmlTokenStream.next();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _next();
 *  */
    @Test
    public void testNext_ThrowNullPointerException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:362)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:323)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168) */
        xmlTokenStream.next();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#next()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _next();
 *  */
    @Test
    public void testNext_ThrowNullPointerException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 256;
        xmlTokenStream._nextAttributeIndex = 254;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168) */
        xmlTokenStream.next();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.close
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method close()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#close()}
 *  */
    @Test
    public void testClose() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.close();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalXmlTokenStream_xmlReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#close()}
 *  */
    @Test
    public void testClose_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.close();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#close()}
 *  */
    @Test
    public void testClose_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader1 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.close();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderReaderReaderFStreamReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderReaderReaderFStreamReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#close()}
 *  */
    @Test
    public void testClose_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader4 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.close();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderReaderFStreamReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderFStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderReaderReaderFStreamReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderReaderFStreamReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderReaderReaderFStreamReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#close()}
 *  */
    @Test
    public void testClose_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        Stax2ReaderAdapter reader2 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader3 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader4 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader5 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        Stax2ReaderAdapter reader6 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader7 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader8 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader8, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader7, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader8);
        setField(reader6, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader7);
        setField(reader5, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader6);
        setField(reader4, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader5);
        setField(reader3, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.close();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReaderFReuse);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method close()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#close()}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#close()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _xmlReader.close();
 *  */
    @Test
    public void testClose_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.close] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.close(XmlTokenStream.java:204) */
        xmlTokenStream.close();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getText
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getText()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getText()}
 * @utbot.returnsFrom {@code return _textValue;}
 *  */
    @Test
    public void testGetText_Return_textValue() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        String actual = xmlTokenStream.getText();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.hasAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasAttributes()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#hasAttributes()}
 * @utbot.returnsFrom {@code return (_currentState == XML_START_ELEMENT) && (_attributeCount > 0);}
 *  */
    @Test
    public void testHasAttributes__currentStateNotEqualsXML_START_ELEMENTAnd_attributeCountLessOrEqualZero() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -255;
        
        boolean actual = xmlTokenStream.hasAttributes();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#hasAttributes()}
 * @utbot.returnsFrom {@code return (_currentState == XML_START_ELEMENT) && (_attributeCount > 0);}
 *  */
    @Test
    public void testHasAttributes__currentStateEqualsXML_START_ELEMENTAnd_attributeCountGreaterThanZero() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = 1;
        
        boolean actual = xmlTokenStream.hasAttributes();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#hasAttributes()}
 * @utbot.returnsFrom {@code return (_currentState == XML_START_ELEMENT) && (_attributeCount > 0);}
 *  */
    @Test
    public void testHasAttributes__currentStateNotEqualsXML_START_ELEMENTAnd_attributeCountLessOrEqualZero_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        
        boolean actual = xmlTokenStream.hasAttributes();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getLocalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLocalName()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getLocalName()}
 * @utbot.returnsFrom {@code return _localName;}
 *  */
    @Test
    public void testGetLocalName_Return_localName() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        String actual = xmlTokenStream.getLocalName();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getNamespaceURI
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNamespaceURI()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getNamespaceURI()}
 * @utbot.returnsFrom {@code return _namespaceURI;}
 *  */
    @Test
    public void testGetNamespaceURI_Return_namespaceURI() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        String actual = xmlTokenStream.getNamespaceURI();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getCurrentToken
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentToken()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentToken()}
 * @utbot.returnsFrom {@code return _currentState;}
 *  */
    @Test
    public void testGetCurrentToken_Return_currentState() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -255;
        
        int actual = xmlTokenStream.getCurrentToken();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getTokenLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());}
 *  */
    @Test
    public void testGetTokenLocation_Return_extractLocation() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());}
 *  */
    @Test
    public void testGetTokenLocation_Return_extractLocation_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());}
 *  */
    @Test
    public void testGetTokenLocation_Return_extractLocation_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());}
 *  */
    @Test
    public void testGetTokenLocation_Return_extractLocation_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader4 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader4, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());}
 *  */
    @Test
    public void testGetTokenLocation_Return_extractLocation_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = -1840709596;
        fCurrentEntity.fTotalCountTillLastLoad = Integer.MIN_VALUE;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 306774052L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());}
 *  */
    @Test
    public void testGetTokenLocation_Return_extractLocation_5() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = -1840775167;
        fCurrentEntity.fTotalCountTillLastLoad = Integer.MIN_VALUE;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(fStreamReader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getTokenLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 306708481L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTokenLocation()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getTokenLocation()}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getLocationInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _extractLocation(_xmlReader.getLocationInfo().getStartLocation());
 *  */
    @Test
    public void testGetTokenLocation_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getTokenLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getTokenLocation(XmlTokenStream.java:214) */
        xmlTokenStream.getTokenLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getCurrentLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());}
 *  */
    @Test
    public void testGetCurrentLocation_Return_extractLocation() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());}
 *  */
    @Test
    public void testGetCurrentLocation_Return_extractLocation_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());}
 *  */
    @Test
    public void testGetCurrentLocation_Return_extractLocation_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11EntityScanner fEntityScanner = ((XML11EntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XML11EntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        byte[] _sourceReference = {};
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_sourceReference", _sourceReference);
        
        JsonLocation actual = xmlTokenStream.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(_sourceReference, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());}
 *  */
    @Test
    public void testGetCurrentLocation_Return_extractLocation_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader4 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        setField(reader4, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());}
 *  */
    @Test
    public void testGetCurrentLocation_Return_extractLocation_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        Stax2ReaderAdapter reader1 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        fCurrentEntity.position = -2147479552;
        fCurrentEntity.fTotalCountTillLastLoad = -1840709632;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(fStreamReader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 306778112L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.returnsFrom {@code return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());}
 *  */
    @Test
    public void testGetCurrentLocation_Return_extractLocation_5() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader3 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLEntityScanner fEntityScanner = ((XMLEntityScanner) createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityScanner"));
        Entity.ScannedEntity fCurrentEntity = ((Entity.ScannedEntity) createInstance("com.sun.xml.internal.stream.Entity$ScannedEntity"));
        XMLDTDDescription entityLocation = ((XMLDTDDescription) createInstance("com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDDescription"));
        setField(fCurrentEntity, "com.sun.xml.internal.stream.Entity$ScannedEntity", "entityLocation", entityLocation);
        fCurrentEntity.position = 1;
        setField(fEntityScanner, "com.sun.org.apache.xerces.internal.impl.XMLEntityScanner", "fCurrentEntity", fCurrentEntity);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEntityScanner", fEntityScanner);
        setField(reader3, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        JsonLocation actual = xmlTokenStream.getCurrentLocation();
        
        JsonLocation expected = new JsonLocation(null, -1L, 1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCurrentLocation()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#getCurrentLocation()}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getLocationInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return _extractLocation(_xmlReader.getLocationInfo().getCurrentLocation());
 *  */
    @Test
    public void testGetCurrentLocation_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getCurrentLocation] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getCurrentLocation(XmlTokenStream.java:211) */
        xmlTokenStream.getCurrentLocation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.repeatStartElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method repeatStartElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#repeatStartElement()}
 * @utbot.executesCondition {@code (_currentWrapper == null): True}
 *  */
    @Test
    public void testRepeatStartElement__currentWrapperEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        xmlTokenStream._repeatElement = -255;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        xmlTokenStream.repeatStartElement();
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#repeatStartElement()}
 * @utbot.executesCondition {@code (_currentWrapper == null): True}
 *  */
    @Test
    public void testRepeatStartElement__currentWrapperEqualsNull_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        String _namespaceURI = "";
        xmlTokenStream._namespaceURI = _namespaceURI;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        xmlTokenStream.repeatStartElement();
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#repeatStartElement()}
 * @utbot.executesCondition {@code (_currentWrapper == null): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getParent()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#matchingWrapper(com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper,java.lang.String,java.lang.String)}
 *  */
    @Test
    public void testRepeatStartElement__currentWrapperNotEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        xmlTokenStream.repeatStartElement();
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_repeatElement);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method repeatStartElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#repeatStartElement()}
 * @utbot.executesCondition {@code (_currentState != XML_START_ELEMENT): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _currentState != XML_START_ELEMENT
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRepeatStartElement_ThrowIllegalStateException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -255;
        
        xmlTokenStream.repeatStartElement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipAttributes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipAttributes()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipAttributes()}
 * @utbot.executesCondition {@code (_currentState == XML_ATTRIBUTE_NAME): True}
 *  */
    @Test
    public void testSkipAttributes__currentStateEqualsXML_ATTRIBUTE_NAME() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 3;
        xmlTokenStream._attributeCount = -255;
        
        xmlTokenStream.skipAttributes();
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipAttributes()}
 * @utbot.executesCondition {@code (_currentState == XML_ATTRIBUTE_NAME): False}
 * @utbot.executesCondition {@code (_currentState == XML_START_ELEMENT): True}
 *  */
    @Test
    public void testSkipAttributes__currentStateEqualsXML_START_ELEMENT() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        
        xmlTokenStream.skipAttributes();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipAttributes()}
 * @utbot.executesCondition {@code (_currentState == XML_ATTRIBUTE_NAME): False}
 * @utbot.executesCondition {@code (_currentState == XML_START_ELEMENT): False}
 * @utbot.executesCondition {@code (_currentState == XML_TEXT): True}
 *  */
    @Test
    public void testSkipAttributes__currentStateEqualsXML_TEXT() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        
        xmlTokenStream.skipAttributes();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skipAttributes()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipAttributes()}
 * @utbot.executesCondition {@code (_currentState == XML_ATTRIBUTE_NAME): False}
 * @utbot.executesCondition {@code (_currentState == XML_START_ELEMENT): False}
 * @utbot.executesCondition {@code (_currentState == XML_TEXT): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: _currentState == XML_TEXT
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSkipAttributes_ThrowIllegalStateException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -255;
        
        xmlTokenStream.skipAttributes();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convertToString()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.executesCondition {@code (_currentState != XML_ATTRIBUTE_NAME): True}
 *  */
    @Test
    public void testConvertToString__currentStateNotEqualsXML_ATTRIBUTE_NAME() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -255;
        
        String actual = xmlTokenStream.convertToString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.executesCondition {@code (_currentState != XML_ATTRIBUTE_NAME): False}
 * @utbot.executesCondition {@code (_nextAttributeIndex != 0): True}
 *  */
    @Test
    public void testConvertToString__nextAttributeIndexNotEqualsZero() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 3;
        xmlTokenStream._nextAttributeIndex = -255;
        
        String actual = xmlTokenStream.convertToString();
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.executesCondition {@code (_currentState != XML_ATTRIBUTE_NAME): False}
 * @utbot.executesCondition {@code (_nextAttributeIndex != 0): False}
 * @utbot.executesCondition {@code (_xmlReader.getEventType() == XMLStreamReader.END_ELEMENT): False}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_collectUntilTag()
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getEventType()}
 *  */
    @Test
    public void testConvertToString__xmlReaderGetEventTypeNotEqualsXMLStreamReaderEND_ELEMENT() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 3;
        
        String actual = xmlTokenStream.convertToString();
        
        assertNull(actual);
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        int finalXmlTokenStream_xmlReader_depth = ((Integer) getFieldValue(xMLStreamReader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_depth"));
        
        assertEquals(-1, finalXmlTokenStream_xmlReader_depth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method convertToString()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.executesCondition {@code (_xmlReader.getEventType() == XMLStreamReader.END_ELEMENT): True}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test
    public void testConvertToString_ThrowIndexOutOfBoundsException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11NSDocumentScannerImpl fScanner = ((XML11NSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 3;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream.convertToString();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.executesCondition {@code (_xmlReader.getEventType() == XMLStreamReader.END_ELEMENT): True}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test
    public void testConvertToString_ThrowIndexOutOfBoundsException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11NSDocumentScannerImpl fScanner = ((XML11NSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 3;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        xmlTokenStream.convertToString();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.executesCondition {@code (_xmlReader.getEventType() == XMLStreamReader.END_ELEMENT): True}
 * @utbot.executesCondition {@code (text == null): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getParent()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test
    public void testConvertToString_ThrowIndexOutOfBoundsException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream.convertToString();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#convertToString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = _collectUntilTag();
 *  */
    @Test
    public void testConvertToString_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 3;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:362)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.convertToString(XmlTokenStream.java:278) */
        xmlTokenStream.convertToString();
    }
    ///endregion
    
    ///region Errors report for convertToString
    
    public void testConvertToString_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        /* Unable to make field public static final com.sun.org.apache.xerces.internal.impl.XMLScanner$NameType com.sun.org.apache.xerces.internal.impl.XMLScanner$NameType.ATTRIBUTE accessible:
        module java.xml does not "exports com.sun.org.apache.xerces.internal.impl" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.activatesSwitch {@code switch(_currentState) case: XML_END}
 *  */
    @Test
    public void test_next_ReturnXML_END() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 6;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(6, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.activatesSwitch {@code switch(_currentState) case: XML_ATTRIBUTE_NAME}
 * @utbot.returnsFrom {@code return (_currentState = XML_ATTRIBUTE_VALUE);}
 *  */
    @Test
    public void test_next_Return() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 3;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(4, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(4, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.returnsFrom {@code return _handleEndElement();}
 *  */
    @Test
    public void test_next_Return_handleEndElement() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.returnsFrom {@code return _handleEndElement();}
 *  */
    @Test
    public void test_next_Return_handleEndElement_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.returnsFrom {@code return _handleEndElement();}
 *  */
    @Test
    public void test_next_Return_handleEndElement_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        xmlTokenStream._repeatElement = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(2, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleEndElement()
 * @utbot.activatesSwitch {@code switch(_skipUntilTag()) case: default}
 * @utbot.returnsFrom {@code return _handleEndElement();}
 *  */
    @Test
    public void test_next_XmlTokenStream_handleEndElement() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 2;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): False}
 * @utbot.executesCondition {@code (_xmlReader.getEventType() == XMLStreamReader.START_ELEMENT): False}
 * @utbot.executesCondition {@code (text != null): False}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_collectUntilTag()
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getEventType()}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleEndElement()
 * @utbot.activatesSwitch {@code switch(_currentState) case: XML_START_ELEMENT}
 * @utbot.returnsFrom {@code return _handleEndElement();}
 *  */
    @Test
    public void test_next_TextEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _nextMethod.invoke(xmlTokenStream, _nextMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getAttributeLocalName(_nextAttributeIndex);
 *  */
    @Test
    public void test_next_ThrowIndexOutOfBoundsException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fNamespaces", true);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fLength", 1);
        java.lang.Object[] fAttributes1 = createArray("com.sun.org.apache.xerces.internal.util.XMLAttributesImpl$Attribute", 0);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fAttributes", fAttributes1);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        DTDGrammarUtil dtdGrammarUtil = ((DTDGrammarUtil) createInstance("com.sun.xml.internal.stream.dtd.DTDGrammarUtil"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "dtdGrammarUtil", dtdGrammarUtil);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 10);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 1;
        xmlTokenStream._nextAttributeIndex = -1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getAttributeLocalName(_nextAttributeIndex);
 *  */
    @Test
    public void test_next_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fNamespaces", true);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fLength", 1);
        java.lang.Object[] fAttributes1 = createArray("com.sun.org.apache.xerces.internal.util.XMLAttributesImpl$Attribute", 0);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fAttributes", fAttributes1);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 10);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 1;
        xmlTokenStream._nextAttributeIndex = -1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): True}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getAttributeNamespace(int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _namespaceURI = _xmlReader.getAttributeNamespace(_nextAttributeIndex);
 *  */
    @Test
    public void test_next_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fLength", 1);
        java.lang.Object[] fAttributes1 = createArray("com.sun.org.apache.xerces.internal.util.XMLAttributesImpl$Attribute", 0);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fAttributes", fAttributes1);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 1;
        xmlTokenStream._nextAttributeIndex = -1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _localName = _xmlReader.getAttributeLocalName(_nextAttributeIndex);
 *  */
    @Test
    public void test_next_ThrowNullPointerException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = 256;
        xmlTokenStream._nextAttributeIndex = 255;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _localName = _xmlReader.getAttributeLocalName(_nextAttributeIndex);
 *  */
    @Test
    public void test_next_ThrowNullPointerException_1() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = -2147483647;
        xmlTokenStream._nextAttributeIndex = Integer.MAX_VALUE;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): False}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_collectUntilTag()
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String text = _collectUntilTag();
 *  */
    @Test
    public void test_next_ThrowNullPointerException_2() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:362)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:323) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()
 * @utbot.activatesSwitch {@code switch(_currentState)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_skipUntilTag())
 *  */
    @Test
    public void test_next_ThrowNullPointerException_3() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag(XmlTokenStream.java:384)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:348) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _next()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.executesCondition {@code (_nextAttributeIndex < _attributeCount): True}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getAttributeLocalName(int)}
 * @utbot.activatesSwitch {@code switch(_currentState) case: XML_ATTRIBUTE_VALUE}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _localName = _xmlReader.getAttributeLocalName(_nextAttributeIndex);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_next_ThrowIllegalStateException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = -2147483647;
        xmlTokenStream._nextAttributeIndex = Integer.MAX_VALUE;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_next()}
 * @utbot.invokes com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()
 * @utbot.activatesSwitch {@code switch(_currentState)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: switch(_skipUntilTag())
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_next_ThrowIllegalStateException_1() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", -1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 2;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _nextMethod = xmlTokenStreamClazz.getDeclaredMethod("_next");
        _nextMethod.setAccessible(true);
        java.lang.Object[] _nextMethodArguments = new java.lang.Object[0];
        try {
            _nextMethod.invoke(xmlTokenStream, _nextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _collectUntilTag()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_collectUntilTag()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void test_collectUntilTag_ReturnText() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _collectUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_collectUntilTag");
        _collectUntilTagMethod.setAccessible(true);
        java.lang.Object[] _collectUntilTagMethodArguments = new java.lang.Object[0];
        String actual = ((String) _collectUntilTagMethod.invoke(xmlTokenStream, _collectUntilTagMethodArguments));
        
        assertNull(actual);
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        int finalXmlTokenStream_xmlReader_depth = ((Integer) getFieldValue(xMLStreamReader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_depth"));
        
        assertEquals(-1, finalXmlTokenStream_xmlReader_depth);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_collectUntilTag()}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void test_collectUntilTag_ReturnText_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        Stax2ReaderAdapter reader2 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _collectUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_collectUntilTag");
        _collectUntilTagMethod.setAccessible(true);
        java.lang.Object[] _collectUntilTagMethodArguments = new java.lang.Object[0];
        String actual = ((String) _collectUntilTagMethod.invoke(xmlTokenStream, _collectUntilTagMethodArguments));
        
        assertNull(actual);
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        int finalXmlTokenStream_xmlReader_depth = ((Integer) getFieldValue(xMLStreamReader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_depth"));
        
        assertEquals(-1, finalXmlTokenStream_xmlReader_depth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _collectUntilTag()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_collectUntilTag()}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(_xmlReader.next())
 *  */
    @Test
    public void test_collectUntilTag_ThrowNullPointerException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:362) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _collectUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_collectUntilTag");
        _collectUntilTagMethod.setAccessible(true);
        java.lang.Object[] _collectUntilTagMethodArguments = new java.lang.Object[0];
        try {
            _collectUntilTagMethod.invoke(xmlTokenStream, _collectUntilTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _collectUntilTag
    
    public void test_collectUntilTag_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 18 occurrences of:
        /* Unable to make field public static final com.sun.org.apache.xerces.internal.impl.XMLScanner$NameType com.sun.org.apache.xerces.internal.impl.XMLScanner$NameType.ATTRIBUTE accessible:
        module java.xml does not "exports com.sun.org.apache.xerces.internal.impl" to unnamed module @4fcd19b3 */
        
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.closeCompletely
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method closeCompletely()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#closeCompletely()}
 *  */
    @Test
    public void testCloseCompletely() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.closeCompletely();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalXmlTokenStream_xmlReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#closeCompletely()}
 *  */
    @Test
    public void testCloseCompletely_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.closeCompletely();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#closeCompletely()}
 *  */
    @Test
    public void testCloseCompletely_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader2 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader2, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.closeCompletely();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderReaderFStreamReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderReaderFStreamReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#closeCompletely()}
 *  */
    @Test
    public void testCloseCompletely_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader1 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamFilterImpl reader2 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader3 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader2, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.closeCompletely();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderFStreamReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderFStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderReaderFStreamReaderReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderFStreamReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderReaderFStreamReaderReaderFReuse);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#closeCompletely()}
 *  */
    @Test
    public void testCloseCompletely_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader1 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader2 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader3 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        StreamReaderDelegate reader4 = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        Stax2ReaderAdapter reader5 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamFilterImpl reader6 = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader6, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(reader5, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader6);
        setField(reader4, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader5);
        setField(reader3, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader4);
        setField(reader2, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader3);
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        xmlTokenStream.closeCompletely();
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        XMLStreamReader xMLStreamReader2_xmlReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader, "javax.xml.stream.util.StreamReaderDelegate", "reader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        XMLStreamReader xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReader = ((XMLStreamReader) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader"));
        boolean finalXmlTokenStream_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReaderFReuse = ((Boolean) getFieldValue(xMLStreamReader2_xmlReaderReader_xmlReaderReaderReader_xmlReaderReaderReaderReader_xmlReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReader_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fReuse"));
        
        assertTrue(finalXmlTokenStream_xmlReaderReaderReaderReaderReaderReaderReaderReaderFStreamReaderFStreamReaderFReuse);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method closeCompletely()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#closeCompletely()}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#closeCompletely()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _xmlReader.closeCompletely();
 *  */
    @Test
    public void testCloseCompletely_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.closeCompletely] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.closeCompletely(XmlTokenStream.java:195) */
        xmlTokenStream.closeCompletely();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.getXmlReader
    
    ///region Errors report for getXmlReader
    
    public void testGetXmlReader_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Default concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method skipEndElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 *  */
    @Test
    public void testSkipEndElement() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        
        xmlTokenStream.skipEndElement();
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 *  */
    @Test
    public void testSkipEndElement_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        xmlTokenStream.skipEndElement();
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 *  */
    @Test
    public void testSkipEndElement_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        
        xmlTokenStream.skipEndElement();
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 *  */
    @Test
    public void testSkipEndElement_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = -249;
        
        xmlTokenStream.skipEndElement();
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 *  */
    @Test
    public void testSkipEndElement_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 5;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        xmlTokenStream.skipEndElement();
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(2, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method skipEndElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.io.IOException} when: type != XML_END_ELEMENT
 *  */
    @Test(expected = IOException.class)
    public void testSkipEndElement_ThrowIOException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 6;
        
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.io.IOException} when: type != XML_END_ELEMENT
 *  */
    @Test(expected = IOException.class)
    public void testSkipEndElement_ThrowIOException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 3;
        
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.io.IOException} when: type != XML_END_ELEMENT
 *  */
    @Test(expected = IOException.class)
    public void testSkipEndElement_ThrowIOException_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.io.IOException} when: type != XML_END_ELEMENT
 *  */
    @Test(expected = IOException.class)
    public void testSkipEndElement_ThrowIOException_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.io.IOException} when: type != XML_END_ELEMENT
 *  */
    @Test(expected = IOException.class)
    public void testSkipEndElement_ThrowIOException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 3;
        
        xmlTokenStream.skipEndElement();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method skipEndElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int type = next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSkipEndElement_ThrowIllegalStateException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = -255;
        
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int type = next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSkipEndElement_ThrowIllegalStateException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", -1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = -249;
        
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: int type = next();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testSkipEndElement_ThrowIllegalStateException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 96;
        xmlTokenStream._nextAttributeIndex = 94;
        
        xmlTokenStream.skipEndElement();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method skipEndElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void testSkipEndElement_ThrowIndexOutOfBoundsException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11NSDocumentScannerImpl fScanner = ((XML11NSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl"));
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fNamespaces", true);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fLength", 1);
        java.lang.Object[] fAttributes1 = createArray("com.sun.org.apache.xerces.internal.util.XMLAttributesImpl$Attribute", 0);
        setField(fAttributes, "com.sun.org.apache.xerces.internal.util.XMLAttributesImpl", "fAttributes", fAttributes1);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 1;
        xmlTokenStream._nextAttributeIndex = -1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = next();
 *  */
    @Test
    public void testSkipEndElement_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 4;
        xmlTokenStream._attributeCount = 128;
        xmlTokenStream._nextAttributeIndex = 126;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement(XmlTokenStream.java:177) */
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = next();
 *  */
    @Test
    public void testSkipEndElement_ThrowNullPointerException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -249;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag(XmlTokenStream.java:384)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:348)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement(XmlTokenStream.java:177) */
        xmlTokenStream.skipEndElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#skipEndElement()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = next();
 *  */
    @Test
    public void testSkipEndElement_ThrowNullPointerException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:362)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:323)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement(XmlTokenStream.java:177) */
        xmlTokenStream.skipEndElement();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method skipEndElement()
    
    @Test
    public void testSkipEndElement1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 1;
        xmlTokenStream._attributeCount = 1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:317)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement(XmlTokenStream.java:177) */
        xmlTokenStream.skipEndElement();
    }
    
    @Test
    public void testSkipEndElement2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = 4;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._collectUntilTag(XmlTokenStream.java:362)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._next(XmlTokenStream.java:323)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.next(XmlTokenStream.java:168)
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream.skipEndElement(XmlTokenStream.java:177) */
        xmlTokenStream.skipEndElement();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _skipUntilTag()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()}
 * @utbot.iterates iterate the loop {@code while(_xmlReader.hasNext())} once
 *  */
    @Test
    public void test_skipUntilTag_IterateWhileLoop() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(_xmlReader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _skipUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_skipUntilTag");
        _skipUntilTagMethod.setAccessible(true);
        java.lang.Object[] _skipUntilTagMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _skipUntilTagMethod.invoke(xmlTokenStream, _skipUntilTagMethodArguments));
        
        assertEquals(2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()}
 * @utbot.iterates iterate the loop {@code while(_xmlReader.hasNext())} once
 *  */
    @Test
    public void test_skipUntilTag_IterateWhileLoop_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Stax2ReaderAdapter reader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _skipUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_skipUntilTag");
        _skipUntilTagMethod.setAccessible(true);
        java.lang.Object[] _skipUntilTagMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _skipUntilTagMethod.invoke(xmlTokenStream, _skipUntilTagMethodArguments));
        
        assertEquals(2, actual);
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        int finalXmlTokenStream_xmlReader_depth = ((Integer) getFieldValue(xMLStreamReader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_depth"));
        
        assertEquals(-1, finalXmlTokenStream_xmlReader_depth);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()}
 * @utbot.iterates iterate the loop {@code while(_xmlReader.hasNext())} once
 *  */
    @Test
    public void test_skipUntilTag_IterateWhileLoop_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        Stax2ReaderAdapter reader1 = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        String _typedContent = "";
        setField(reader1, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_typedContent", _typedContent);
        XMLStreamReaderImpl reader2 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader1, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _skipUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_skipUntilTag");
        _skipUntilTagMethod.setAccessible(true);
        java.lang.Object[] _skipUntilTagMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _skipUntilTagMethod.invoke(xmlTokenStream, _skipUntilTagMethodArguments));
        
        assertEquals(2, actual);
        
        XMLStreamReader2 xMLStreamReader2 = xmlTokenStream._xmlReader;
        int finalXmlTokenStream_xmlReader_depth = ((Integer) getFieldValue(xMLStreamReader2, "org.codehaus.stax2.ri.Stax2ReaderAdapter", "_depth"));
        
        assertEquals(-1, finalXmlTokenStream_xmlReader_depth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _skipUntilTag()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()}
 * @utbot.iterates iterate the loop {@code while(_xmlReader.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(_xmlReader.hasNext())
 *  */
    @Test
    public void test_skipUntilTag_ThrowNullPointerException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._skipUntilTag(XmlTokenStream.java:384) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _skipUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_skipUntilTag");
        _skipUntilTagMethod.setAccessible(true);
        java.lang.Object[] _skipUntilTagMethodArguments = new java.lang.Object[0];
        try {
            _skipUntilTagMethod.invoke(xmlTokenStream, _skipUntilTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _skipUntilTag()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()}
 * @utbot.iterates iterate the loop {@code while(_xmlReader.hasNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException("Expected to find a tag, instead reached end of input");
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_skipUntilTag_ThrowIllegalStateException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 8);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _skipUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_skipUntilTag");
        _skipUntilTagMethod.setAccessible(true);
        java.lang.Object[] _skipUntilTagMethodArguments = new java.lang.Object[0];
        try {
            _skipUntilTagMethod.invoke(xmlTokenStream, _skipUntilTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_skipUntilTag()}
 * @utbot.iterates iterate the loop {@code while(_xmlReader.hasNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException("Expected to find a tag, instead reached end of input");
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_skipUntilTag_ThrowIllegalStateException_1() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", -1);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _skipUntilTagMethod = xmlTokenStreamClazz.getDeclaredMethod("_skipUntilTag");
        _skipUntilTagMethod.setAccessible(true);
        java.lang.Object[] _skipUntilTagMethodArguments = new java.lang.Object[0];
        try {
            _skipUntilTagMethod.invoke(xmlTokenStream, _skipUntilTagMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for _skipUntilTag
    
    public void test_skipUntilTag_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field public static final com.sun.org.apache.xerces.internal.impl.XMLScanner$NameType com.sun.org.apache.xerces.internal.impl.XMLScanner$NameType.ATTRIBUTE accessible:
        module java.xml does not "exports com.sun.org.apache.xerces.internal.impl" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._initStartElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method _initStartElement()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return (_currentState = XML_START_ELEMENT);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.returnsFrom {@code return (_currentState = XML_START_ELEMENT);}
 *  */
    @Test
    public void test_initStartElement__currentWrapperNotEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        String localpart = "";
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "localpart", localpart);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", localpart);
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperNamespace", localpart);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments));
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        int finalXmlTokenStream_nextAttributeIndex = xmlTokenStream._nextAttributeIndex;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
        
        assertEquals(0, finalXmlTokenStream_nextAttributeIndex);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return (_currentState = XML_START_ELEMENT);}
 *  */
    @Test
    public void test_initStartElement__currentWrapperEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._currentState = -255;
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments));
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        int finalXmlTokenStream_nextAttributeIndex = xmlTokenStream._nextAttributeIndex;
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
        
        assertEquals(0, finalXmlTokenStream_nextAttributeIndex);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.returnsFrom {@code return (_currentState = XML_START_ELEMENT);}
 *  */
    @Test
    public void test_initStartElement__currentWrapperNotEqualsNull_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments));
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        int finalXmlTokenStream_nextAttributeIndex = xmlTokenStream._nextAttributeIndex;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(1, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
        
        assertEquals(0, finalXmlTokenStream_nextAttributeIndex);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method _initStartElement()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (_currentWrapper != null): True}
    /// invoke:
    ///     {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#matchesWrapper(java.lang.String,java.lang.String)} twice,
    ///     {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getWrapperLocalName()} twice,
    ///     {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getWrapperNamespace()} twice,
    ///     {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getParent()} twice
    /// return from: {@code return (_currentState = XML_END_ELEMENT);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.returnsFrom {@code return (_currentState = XML_END_ELEMENT);}
 *  */
    @Test
    public void test_initStartElement_Return() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        String uri = "";
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "uri", uri);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", uri);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        int finalXmlTokenStream_nextAttributeIndex = xmlTokenStream._nextAttributeIndex;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
        
        assertEquals(0, finalXmlTokenStream_nextAttributeIndex);
        
        assertEquals(3, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.returnsFrom {@code return (_currentState = XML_END_ELEMENT);}
 *  */
    @Test
    public void test_initStartElement_Return_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        xmlTokenStream._repeatElement = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        int finalXmlTokenStream_nextAttributeIndex = xmlTokenStream._nextAttributeIndex;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
        
        assertEquals(0, finalXmlTokenStream_nextAttributeIndex);
        
        assertEquals(3, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.returnsFrom {@code return (_currentState = XML_END_ELEMENT);}
 *  */
    @Test
    public void test_initStartElement_Return_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11NSDocumentScannerImpl fScanner = ((XML11NSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11NSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        String localpart = "\u0000";
        setField(fElementQName, "com.sun.org.apache.xerces.internal.xni.QName", "localpart", localpart);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        XMLAttributesIteratorImpl fAttributes = ((XMLAttributesIteratorImpl) createInstance("com.sun.org.apache.xerces.internal.util.XMLAttributesIteratorImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fAttributes", fAttributes);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._attributeCount = -255;
        xmlTokenStream._nextAttributeIndex = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_attributeCount = xmlTokenStream._attributeCount;
        int finalXmlTokenStream_nextAttributeIndex = xmlTokenStream._nextAttributeIndex;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(0, finalXmlTokenStream_attributeCount);
        
        assertEquals(0, finalXmlTokenStream_nextAttributeIndex);
        
        assertEquals(3, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _initStartElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void test_initStartElement_ThrowIndexOutOfBoundsException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._initStartElement] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void test_initStartElement_ThrowIndexOutOfBoundsException_1() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._initStartElement] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void test_initStartElement_ThrowIndexOutOfBoundsException_2() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._initStartElement] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.invokes {@link org.codehaus.stax2.XMLStreamReader2#getNamespaceURI()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final String ns = _xmlReader.getNamespaceURI();
 *  */
    @Test
    public void test_initStartElement_ThrowNullPointerException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._initStartElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._initStartElement(XmlTokenStream.java:406) */
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _initStartElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: final String localName = _xmlReader.getLocalName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_initStartElement_ThrowIllegalStateException() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _attributeCount = _xmlReader.getAttributeCount();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_initStartElement_ThrowIllegalStateException_1() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 9);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _attributeCount = _xmlReader.getAttributeCount();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_initStartElement_ThrowIllegalStateException_2() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 9);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_initStartElement()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _attributeCount = _xmlReader.getAttributeCount();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_initStartElement_ThrowIllegalStateException_3() throws Throwable  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        Object fElementQName = createInstance("com.sun.org.apache.xerces.internal.impl.dv.xs.QNameDV$XQName");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _initStartElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_initStartElement");
        _initStartElementMethod.setAccessible(true);
        java.lang.Object[] _initStartElementMethodArguments = new java.lang.Object[0];
        try {
            _initStartElementMethod.invoke(xmlTokenStream, _initStartElementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._extractLocation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _extractLocation(org.codehaus.stax2.XMLStreamLocation2)
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, location.getCharacterOffset(), location.getLineNumber(), location.getColumnNumber());}
 *  */
    @Test
    public void test_extractLocation_LocationNotEqualsNull_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        XMLStreamLocation2 anonymousXMLStreamLocation2 = ((XMLStreamLocation2) createInstance("org.codehaus.stax2.XMLStreamLocation2$1"));
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class anonymousXMLStreamLocation2Type = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", anonymousXMLStreamLocation2Type);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = anonymousXMLStreamLocation2;
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): True}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, -1, -1, -1);}
 *  */
    @Test
    public void test_extractLocation_LocationEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class xMLStreamLocation2Type = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", xMLStreamLocation2Type);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = ((Object) null);
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, location.getCharacterOffset(), location.getLineNumber(), location.getColumnNumber());}
 *  */
    @Test
    public void test_extractLocation_LocationNotEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Object sAXLocation = createInstance("com.sun.org.apache.xalan.internal.xsltc.trax.SAX2StAXBaseWriter$SAXLocation");
        Class stax2LocationAdapterClazz = Class.forName("org.codehaus.stax2.ri.Stax2LocationAdapter");
        Class sAXLocationType = Class.forName("javax.xml.stream.Location");
        Constructor stax2LocationAdapterConstructor = stax2LocationAdapterClazz.getDeclaredConstructor(sAXLocationType, sAXLocationType);
        stax2LocationAdapterConstructor.setAccessible(true);
        java.lang.Object[] stax2LocationAdapterConstructorArguments = new java.lang.Object[2];
        stax2LocationAdapterConstructorArguments[0] = sAXLocation;
        stax2LocationAdapterConstructorArguments[1] = ((Object) null);
        Stax2LocationAdapter stax2LocationAdapter = ((Stax2LocationAdapter) stax2LocationAdapterConstructor.newInstance(stax2LocationAdapterConstructorArguments));
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class stax2LocationAdapterType = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", stax2LocationAdapterType);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = stax2LocationAdapter;
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, location.getCharacterOffset(), location.getLineNumber(), location.getColumnNumber());}
 *  */
    @Test
    public void test_extractLocation_LocationNotEqualsNull_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Object sAXLocation = createInstance("com.sun.org.apache.xalan.internal.xsltc.trax.SAX2StAXBaseWriter$SAXLocation");
        Class stax2LocationAdapterClazz = Class.forName("org.codehaus.stax2.ri.Stax2LocationAdapter");
        Class sAXLocationType = Class.forName("javax.xml.stream.Location");
        Constructor stax2LocationAdapterConstructor = stax2LocationAdapterClazz.getDeclaredConstructor(sAXLocationType, sAXLocationType);
        stax2LocationAdapterConstructor.setAccessible(true);
        java.lang.Object[] stax2LocationAdapterConstructorArguments = new java.lang.Object[2];
        stax2LocationAdapterConstructorArguments[0] = sAXLocation;
        stax2LocationAdapterConstructorArguments[1] = ((Object) null);
        Stax2LocationAdapter stax2LocationAdapter = ((Stax2LocationAdapter) stax2LocationAdapterConstructor.newInstance(stax2LocationAdapterConstructorArguments));
        Stax2LocationAdapter stax2LocationAdapter1 = new Stax2LocationAdapter(stax2LocationAdapter, null);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class stax2LocationAdapter1Type = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", stax2LocationAdapter1Type);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = stax2LocationAdapter1;
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, location.getCharacterOffset(), location.getLineNumber(), location.getColumnNumber());}
 *  */
    @Test
    public void test_extractLocation_LocationNotEqualsNull_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Object dummyLocation = createInstance("com.sun.xml.internal.stream.events.DummyEvent$DummyLocation");
        Class stax2LocationAdapterClazz = Class.forName("org.codehaus.stax2.ri.Stax2LocationAdapter");
        Class dummyLocationType = Class.forName("javax.xml.stream.Location");
        Constructor stax2LocationAdapterConstructor = stax2LocationAdapterClazz.getDeclaredConstructor(dummyLocationType, dummyLocationType);
        stax2LocationAdapterConstructor.setAccessible(true);
        java.lang.Object[] stax2LocationAdapterConstructorArguments = new java.lang.Object[2];
        stax2LocationAdapterConstructorArguments[0] = dummyLocation;
        stax2LocationAdapterConstructorArguments[1] = ((Object) null);
        Stax2LocationAdapter stax2LocationAdapter = ((Stax2LocationAdapter) stax2LocationAdapterConstructor.newInstance(stax2LocationAdapterConstructorArguments));
        Stax2LocationAdapter stax2LocationAdapter1 = new Stax2LocationAdapter(stax2LocationAdapter, null);
        Stax2LocationAdapter stax2LocationAdapter2 = new Stax2LocationAdapter(stax2LocationAdapter1, null);
        Stax2LocationAdapter stax2LocationAdapter3 = new Stax2LocationAdapter(stax2LocationAdapter2, null);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class stax2LocationAdapter3Type = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", stax2LocationAdapter3Type);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = stax2LocationAdapter3;
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, location.getCharacterOffset(), location.getLineNumber(), location.getColumnNumber());}
 *  */
    @Test
    public void test_extractLocation_LocationNotEqualsNull_5() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        XMLStreamLocation2 anonymousXMLStreamLocation2 = ((XMLStreamLocation2) createInstance("org.codehaus.stax2.XMLStreamLocation2$1"));
        Stax2LocationAdapter stax2LocationAdapter = new Stax2LocationAdapter(anonymousXMLStreamLocation2, null);
        Stax2LocationAdapter stax2LocationAdapter1 = new Stax2LocationAdapter(stax2LocationAdapter, null);
        Stax2LocationAdapter stax2LocationAdapter2 = new Stax2LocationAdapter(stax2LocationAdapter1, null);
        Stax2LocationAdapter stax2LocationAdapter3 = new Stax2LocationAdapter(stax2LocationAdapter2, null);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class stax2LocationAdapter3Type = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", stax2LocationAdapter3Type);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = stax2LocationAdapter3;
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, -1L, -1, -1);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_extractLocation(org.codehaus.stax2.XMLStreamLocation2)}
 * @utbot.executesCondition {@code (location == null): False}
 * @utbot.returnsFrom {@code return new JsonLocation(_sourceReference, location.getCharacterOffset(), location.getLineNumber(), location.getColumnNumber());}
 *  */
    @Test
    public void test_extractLocation_LocationNotEqualsNull_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Location anonymousLocation = ((Location) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl$1"));
        Stax2LocationAdapter stax2LocationAdapter = new Stax2LocationAdapter(anonymousLocation, null);
        Stax2LocationAdapter stax2LocationAdapter1 = new Stax2LocationAdapter(stax2LocationAdapter, null);
        Stax2LocationAdapter stax2LocationAdapter2 = new Stax2LocationAdapter(stax2LocationAdapter1, null);
        Stax2LocationAdapter stax2LocationAdapter3 = new Stax2LocationAdapter(stax2LocationAdapter2, null);
        Stax2LocationAdapter stax2LocationAdapter4 = new Stax2LocationAdapter(stax2LocationAdapter3, null);
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class stax2LocationAdapter4Type = Class.forName("org.codehaus.stax2.XMLStreamLocation2");
        Method _extractLocationMethod = xmlTokenStreamClazz.getDeclaredMethod("_extractLocation", stax2LocationAdapter4Type);
        _extractLocationMethod.setAccessible(true);
        java.lang.Object[] _extractLocationMethodArguments = new java.lang.Object[1];
        _extractLocationMethodArguments[0] = stax2LocationAdapter4;
        JsonLocation actual = ((JsonLocation) _extractLocationMethod.invoke(xmlTokenStream, _extractLocationMethodArguments));
        
        JsonLocation expected = new JsonLocation(null, -1L, 0L, 0, 0);
        
        // com.fasterxml.jackson.core.JsonLocation has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleEndElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleEndElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleEndElement()}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return (_currentState = XML_END_ELEMENT);}
 *  */
    @Test
    public void test_handleEndElement__currentWrapperEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._currentState = -255;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _handleEndElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_handleEndElement");
        _handleEndElementMethod.setAccessible(true);
        java.lang.Object[] _handleEndElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _handleEndElementMethod.invoke(xmlTokenStream, _handleEndElementMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        
        assertEquals(2, finalXmlTokenStream_currentState);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleEndElement()}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.executesCondition {@code (w.isMatching()): False}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getParent()}
 * @utbot.returnsFrom {@code return (_currentState = XML_END_ELEMENT);}
 *  */
    @Test
    public void test_handleEndElement_NotWIsMatching() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _handleEndElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_handleEndElement");
        _handleEndElementMethod.setAccessible(true);
        java.lang.Object[] _handleEndElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _handleEndElementMethod.invoke(xmlTokenStream, _handleEndElementMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleEndElement()}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.executesCondition {@code (w.isMatching()): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getWrapperLocalName()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getWrapperNamespace()}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getParent()}
 * @utbot.returnsFrom {@code return (_currentState = XML_END_ELEMENT);}
 *  */
    @Test
    public void test_handleEndElement_WIsMatching() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = -255;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        String _wrapperName = "";
        setField(_currentWrapper, "com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper", "_wrapperName", _wrapperName);
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        Class xmlTokenStreamClazz = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Method _handleEndElementMethod = xmlTokenStreamClazz.getDeclaredMethod("_handleEndElement");
        _handleEndElementMethod.setAccessible(true);
        java.lang.Object[] _handleEndElementMethodArguments = new java.lang.Object[0];
        int actual = ((Integer) _handleEndElementMethod.invoke(xmlTokenStream, _handleEndElementMethodArguments));
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_currentState = xmlTokenStream._currentState;
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(2, finalXmlTokenStream_currentState);
        
        assertEquals(2, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method _handleRepeatElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#intermediateWrapper()}
 *  */
    @Test
    public void test_handleRepeatElement_TypeEqualsREPLAY_START_DUP() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 1;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): False}
 * @utbot.executesCondition {@code (type == REPLAY_START_DELAYED): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#intermediateWrapper()}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperNotEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 3;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        ElementWrapper initialXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertFalse(initialXmlTokenStream_currentWrapper == finalXmlTokenStream_currentWrapper);
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): False}
 * @utbot.executesCondition {@code (type == REPLAY_START_DELAYED): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperEqualsNull() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 3;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(1, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return XML_END_ELEMENT;}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperEqualsNull_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 9);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#getParent()}
 * @utbot.returnsFrom {@code return XML_END_ELEMENT;}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperNotEqualsNull_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 9);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        ElementWrapper _currentWrapper = ((ElementWrapper) createInstance("com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper"));
        xmlTokenStream._currentWrapper = _currentWrapper;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        ElementWrapper finalXmlTokenStream_currentWrapper = xmlTokenStream._currentWrapper;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
        
        assertNull(finalXmlTokenStream_currentWrapper);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return XML_END_ELEMENT;}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperEqualsNull_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 9);
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return XML_END_ELEMENT;}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperEqualsNull_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamFilterImpl reader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 9);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return XML_END_ELEMENT;}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperEqualsNull_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        QName fElementQName = ((QName) createInstance("com.sun.org.apache.xerces.internal.xni.QName"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.executesCondition {@code (_currentWrapper != null): False}
 * @utbot.returnsFrom {@code return XML_END_ELEMENT;}
 *  */
    @Test
    public void test_handleRepeatElement__currentWrapperEqualsNull_5() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XML11DocumentScannerImpl fScanner = ((XML11DocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XML11DocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = new com.sun.org.apache.xerces.internal.xni.QName[17];
        Object attribute = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$Attribute");
        fElements[0] = ((QName) attribute);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        Object fElementQName = createInstance("com.sun.xml.internal.stream.writers.XMLStreamWriterImpl$Attribute");
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementQName", fElementQName);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        int actual = xmlTokenStream._handleRepeatElement();
        
        assertEquals(2, actual);
        
        int finalXmlTokenStream_repeatElement = xmlTokenStream._repeatElement;
        
        assertEquals(0, finalXmlTokenStream_repeatElement);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method _handleRepeatElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test
    public void test_handleRepeatElement_ThrowIndexOutOfBoundsException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test
    public void test_handleRepeatElement_ThrowIndexOutOfBoundsException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void test_handleRepeatElement_ThrowIndexOutOfBoundsException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamFilterImpl reader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", Integer.MIN_VALUE);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.IndexOutOfBoundsException: Less than zero] */
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void test_handleRepeatElement_ThrowIndexOutOfBoundsException_3() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamFilterImpl reader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        StreamReaderDelegate fStreamReader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 1073741824);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(reader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 2);
        setField(fStreamReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} 
 *  */
    @Test
    public void test_handleRepeatElement_ThrowIndexOutOfBoundsException_4() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamFilterImpl reader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamFilterImpl fStreamReader = ((XMLStreamFilterImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl"));
        XMLStreamReaderImpl fStreamReader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        XMLNSDocumentScannerImpl fScanner = ((XMLNSDocumentScannerImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLNSDocumentScannerImpl"));
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fScannerLastState", 2);
        Object fElementStack = createInstance("com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack");
        com.sun.org.apache.xerces.internal.xni.QName[] fElements = {null};
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fElements", fElements);
        setField(fElementStack, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl$ElementStack", "fDepth", 268435456);
        setField(fScanner, "com.sun.org.apache.xerces.internal.impl.XMLDocumentFragmentScannerImpl", "fElementStack", fElementStack);
        setField(fStreamReader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fScanner", fScanner);
        setField(fStreamReader1, "com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl", "fEventType", 1);
        setField(fStreamReader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader1);
        setField(reader, "com.sun.org.apache.xerces.internal.impl.XMLStreamFilterImpl", "fStreamReader", fStreamReader);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.IndexOutOfBoundsException: Greater or equal than length] */
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): True}
 * @utbot.invokes {@link com.fasterxml.jackson.dataformat.xml.deser.ElementWrapper#intermediateWrapper()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _currentWrapper = _currentWrapper.intermediateWrapper();
 *  */
    @Test
    public void test_handleRepeatElement_ThrowNullPointerException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 1;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement(XmlTokenStream.java:448) */
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_START_DUP): False}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test
    public void test_handleRepeatElement_ThrowNullPointerException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = 2;
        
        /* This test fails because method [com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement] produces [java.lang.NullPointerException]
            com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream._handleRepeatElement(XmlTokenStream.java:453) */
        xmlTokenStream._handleRepeatElement();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method _handleRepeatElement()
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_END): False}
 * @utbot.executesCondition {@code (type == REPLAY_START_DELAYED): False}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(int)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: throw new IllegalStateException("Unrecognized type to repeat: " + type);
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_handleRepeatElement_ThrowIllegalStateException() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        xmlTokenStream._repeatElement = -255;
        
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_handleRepeatElement_ThrowIllegalStateException_1() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        XMLStreamReaderImpl reader = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        xmlTokenStream._handleRepeatElement();
    }
    
    /**
    @utbot.classUnderTest {@link XmlTokenStream}
 * @utbot.methodUnderTest {@link com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream#_handleRepeatElement()}
 * @utbot.executesCondition {@code (type == REPLAY_END): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: _localName = _xmlReader.getLocalName();
 *  */
    @Test(expected = IllegalStateException.class)
    public void test_handleRepeatElement_ThrowIllegalStateException_2() throws Exception  {
        XmlTokenStream xmlTokenStream = ((XmlTokenStream) createInstance("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Stax2ReaderAdapter _xmlReader = ((Stax2ReaderAdapter) createInstance("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        StreamReaderDelegate reader = ((StreamReaderDelegate) createInstance("javax.xml.stream.util.StreamReaderDelegate"));
        XMLStreamReaderImpl reader1 = ((XMLStreamReaderImpl) createInstance("com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl"));
        setField(reader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader1);
        setField(_xmlReader, "javax.xml.stream.util.StreamReaderDelegate", "reader", reader);
        setField(xmlTokenStream, "com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream", "_xmlReader", _xmlReader);
        xmlTokenStream._repeatElement = 2;
        
        xmlTokenStream._handleRepeatElement();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields878317264833200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields878317264833200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass878317264867800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878317264833200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878317264867800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object[] createArray(String className, int length, Object... values) throws ClassNotFoundException {
        Object array = java.lang.reflect.Array.newInstance(Class.forName(className), length);
    
        for (int i = 0; i < values.length; i++) {
            java.lang.reflect.Array.set(array, i, values[i]);
        }
        
        return (Object[]) array;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields878317265313300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields878317265313300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass878317265321200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields878317265313300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass878317265321200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

