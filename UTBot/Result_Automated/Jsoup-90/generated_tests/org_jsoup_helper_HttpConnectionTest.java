package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.Connection;
import java.net.Proxy;
import java.util.Collection;
import org.jsoup.parser.Parser;
import javax.net.ssl.SSLSocketFactory;
import java.net.URL;
import org.jsoup.Connection.Method;
import java.util.Map;
import org.jsoup.Connection.Response;
import java.util.LinkedHashMap;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashSet;
import org.jsoup.Connection.KeyVal;
import java.io.InputStream;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import java.util.List;
import org.jsoup.parser.CharacterReader;
import org.jsoup.nodes.Document;
import java.nio.ByteBuffer;
import java.net.HttpURLConnection;
import java.lang.reflect.InvocationTargetException;
import sun.net.www.protocol.file.Handler;
import java.util.zip.InflaterInputStream;
import java.nio.charset.IllegalCharsetNameException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_jsoup_helper_HttpConnectionTest {
    ///region Test suites for executable org.jsoup.helper.HttpConnection.followRedirects
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method followRedirects(boolean)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#followRedirects(boolean)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#followRedirects(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testFollowRedirects_ConnectionFollowRedirects() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.followRedirects(false));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method followRedirects(boolean)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#followRedirects(boolean)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#followRedirects(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.followRedirects(followRedirects);
 *  */
    @Test
    public void testFollowRedirects_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.followRedirects] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.followRedirects(HttpConnection.java:161) */
        httpConnection.followRedirects(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.cookie
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cookie(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookie(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#cookie(java.lang.String,java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCookie_ConnectionCookie() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        LinkedHashMap cookies = new LinkedHashMap();
        setField(req, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        String string1 = "\u0000\u0000\u0000";
        
        HttpConnection actual = ((HttpConnection) httpConnection.cookie(string, string1));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map httpConnectionReqCookies = ((Map) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(httpConnectionReqCookies, actualReqCookies));
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method cookie(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookie(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#cookie(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.cookie(name, value);
 *  */
    @Test
    public void testCookie_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.cookie] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.cookie(HttpConnection.java:265) */
        httpConnection.cookie(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cookie(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookie(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.cookie(name, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCookie_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.cookie(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookie(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.cookie(name, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCookie_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "";
        
        httpConnection.cookie(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookie(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.cookie(name, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCookie_ThrowIllegalArgumentException_2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        httpConnection.cookie(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.get
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method get()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#get()}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection#execute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGet_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.get();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method get()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#get()}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection#execute()}
 * @utbot.throwsException {@link java.net.MalformedURLException} in: execute();
 *  */
    @Test(expected = MalformedURLException.class)
    public void testGet_ThrowMalformedURLException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        URL url = ((URL) createInstance("java.net.URL"));
        String protocol = "";
        setField(url, "java.net.URL", "protocol", protocol);
        setField(req, "org.jsoup.helper.HttpConnection$Base", "url", url);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.get();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method get()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#get()}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.method(Method.GET);
 *  */
    @Test
    public void testGet_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.get] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.get(HttpConnection.java:283) */
        httpConnection.get();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.method
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method method(org.jsoup.Connection$Method)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#method(org.jsoup.Connection.Method)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMethod_ConnectionMethod() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        Connection.Method method = Connection.Method.TRACE;
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        Connection.Method initialHttpConnectionReqMethod = ((Connection.Method) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        
        HttpConnection actual = ((HttpConnection) httpConnection.method(method));
        
        org.jsoup.Connection.Request httpConnectionReq1 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReq1TimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReq1TimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReq1MaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReq1MaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method httpConnectionReq1Method = ((Connection.Method) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Base", "method"));
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertEquals(httpConnectionReq1Method, actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        org.jsoup.Connection.Request httpConnectionReq2 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        Connection.Method finalHttpConnectionReqMethod = ((Connection.Method) getFieldValue(httpConnectionReq2, "org.jsoup.helper.HttpConnection$Base", "method"));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method method(org.jsoup.Connection$Method)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#method(org.jsoup.Connection.Method)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.method(method);
 *  */
    @Test
    public void testMethod_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.method] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.method(HttpConnection.java:172) */
        httpConnection.method(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method method(org.jsoup.Connection$Method)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#method(org.jsoup.Connection.Method)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.method(method);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMethod_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.method(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_Return() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        java.lang.String[] stringArray = {};
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(stringArray));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < keyvals.length; i += 2)} once
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_ConnectionData() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        data.add(null);
        data.add(null);
        data.add(null);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        java.lang.String[] stringArray = new java.lang.String[2];
        String string = "\u0000";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(stringArray));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection httpConnectionReqData = ((Collection) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(httpConnectionReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.executesCondition {@code (Validate.isTrue(keyvals.length % 2 == 0, "Must supply an even number of key value pairs");): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.isTrue(keyvals.length % 2 == 0, "Must supply an even number of key value pairs");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        java.lang.String[] stringArray = {null};
        
        httpConnection.data(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.executesCondition {@code (Validate.isTrue(keyvals.length % 2 == 0, "Must supply an even number of key value pairs");): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < keyvals.length; i += 2)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key, "Data key must not be empty");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "";
        stringArray[0] = string;
        
        httpConnection.data(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.executesCondition {@code (Validate.isTrue(keyvals.length % 2 == 0, "Must supply an even number of key value pairs");): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < keyvals.length; i += 2)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(value, "Data value must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000";
        stringArray[0] = string;
        
        httpConnection.data(stringArray);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(keyvals, "Data key value pairs must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(((java.lang.String[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data([Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String[])}
 * @utbot.executesCondition {@code (Validate.isTrue(keyvals.length % 2 == 0, "Must supply an even number of key value pairs");): True}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#isTrue(boolean,java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < keyvals.length; i += 2)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.data(KeyVal.create(key, value));
 *  */
    @Test
    public void testData_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000";
        stringArray[0] = string;
        String string1 = "";
        stringArray[1] = string1;
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:224) */
        httpConnection.data(stringArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data([Ljava.lang.String;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testData1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        java.lang.String[] stringArray = new java.lang.String[10];
        String string = "\u0000";
        stringArray[0] = string;
        String string1 = "\u0000\u0000\u0000";
        stringArray[1] = string1;
        
        httpConnection.data(stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#create(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data(org.jsoup.Connection.KeyVal)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_ConnectionData1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(string, string));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection httpConnectionReqData = ((Collection) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(httpConnectionReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_11() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        httpConnection.data(string, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, value));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_21() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        httpConnection.data(string, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#create(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data(org.jsoup.Connection.KeyVal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.data(KeyVal.create(key, value));
 *  */
    @Test
    public void testData_ThrowNullPointerException1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:188) */
        httpConnection.data(string, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data(java.lang.String, java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#create(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data(org.jsoup.Connection.KeyVal)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_ConnectionData2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(string, string1, null));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection httpConnectionReqData = ((Collection) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(httpConnectionReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.lang.String, java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_22() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        httpConnection.data(string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_12() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        httpConnection.data(string, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data(java.lang.String, java.lang.String, java.io.InputStream)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#create(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data(org.jsoup.Connection.KeyVal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.data(KeyVal.create(key, filename, inputStream));
 *  */
    @Test
    public void testData_ThrowNullPointerException2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:198) */
        httpConnection.data(string, string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testData_ReturnNull() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "  ";
        
        Connection.KeyVal actual = httpConnection.data(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: request().data())} once
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testData_NotKeyValKeyEquals() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        String key = "";
        setField(keyVal, "org.jsoup.helper.HttpConnection$KeyVal", "key", key);
        data.add(keyVal);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        Connection.KeyVal actual = httpConnection.data(string);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: request().data())} once
 *  */
    @Test
    public void testData_KeyValKeyEquals() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        String key = "  ";
        setField(keyVal, "org.jsoup.helper.HttpConnection$KeyVal", "key", key);
        data.add(keyVal);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        org.jsoup.helper.HttpConnection.KeyVal actual = ((org.jsoup.helper.HttpConnection.KeyVal) httpConnection.data(key));
        
        String keyValKey = ((String) getFieldValue(keyVal, "org.jsoup.helper.HttpConnection$KeyVal", "key"));
        String actualKey = ((String) getFieldValue(actual, "org.jsoup.helper.HttpConnection$KeyVal", "key"));
        assertEquals(keyValKey, actualKey);
        
        String actualValue = ((String) getFieldValue(actual, "org.jsoup.helper.HttpConnection$KeyVal", "value"));
        assertNull(actualValue);
        
        InputStream actualStream = ((InputStream) getFieldValue(actual, "org.jsoup.helper.HttpConnection$KeyVal", "stream"));
        assertNull(actualStream);
        
        String actualContentType = ((String) getFieldValue(actual, "org.jsoup.helper.HttpConnection$KeyVal", "contentType"));
        assertNull(actualContentType);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key, "Data key must not be empty");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(key, "Data key must not be empty");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_13() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        httpConnection.data(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Connection.KeyVal keyVal: request().data())
 *  */
    @Test
    public void testData_ThrowNullPointerException3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:239) */
        httpConnection.data(string);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Connection.KeyVal keyVal: request().data())
 *  */
    @Test
    public void testData_ThrowNullPointerException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:239) */
        httpConnection.data(string);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: request().data())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: keyVal.key().equals(key)
 *  */
    @Test
    public void testData_ThrowNullPointerException_2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        data.add(null);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:240) */
        httpConnection.data(string);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: request().data())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: keyVal.key().equals(key)
 *  */
    @Test
    public void testData_ThrowNullPointerException_3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        data.add(keyVal);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        data.add(null);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = " ";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:240) */
        httpConnection.data(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.util.Collection)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_CollectionIterator() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        ArrayList arrayList = new ArrayList();
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(arrayList));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.util.Collection)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.util.Collection)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(data, "Data collection must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException4() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(((Collection) null));
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.util.Collection)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(entry);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_14() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        
        httpConnection.data(arrayList);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.util.Collection)
    
    @Test(expected = IllegalArgumentException.class)
    public void testData2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        ArrayList arrayList = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        arrayList.add(keyVal);
        arrayList.add(null);
        arrayList.add(null);
        
        httpConnection.data(arrayList);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method data(java.util.Collection)
    
    @Test
    public void testData3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        data.add(keyVal);
        data.add(null);
        org.jsoup.helper.HttpConnection.KeyVal keyVal1 = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        data.add(keyVal1);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        ArrayList arrayList = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal2 = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        arrayList.add(keyVal2);
        org.jsoup.helper.HttpConnection.KeyVal keyVal3 = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        arrayList.add(keyVal3);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) keyVal);
        objectArray[2] = ((Object) keyVal1);
        arrayList.add(objectArray);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class org.jsoup.Connection$KeyVal ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; org.jsoup.Connection$KeyVal is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @39ffad6a)]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:231) */
        httpConnection.data(arrayList);
    }
    
    @Test
    public void testData4() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        data.add(keyVal);
        data.add(null);
        data.add(null);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.util.ConcurrentModificationException]
            java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
            java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:231) */
        httpConnection.data(data);
    }
    
    @Test
    public void testData5() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HashSet hashSet = new HashSet();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        hashSet.add(keyVal);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:232) */
        httpConnection.data(hashSet);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.util.Map)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_SetIterator() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(linkedHashMap));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.util.Map)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(data, "Data map must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_15() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(((Map) null));
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Map.Entry<String, String> entry: data.entrySet())} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(entry.getKey(), entry.getValue()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException5() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, null);
        
        httpConnection.data(linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.util.Map)
    
    @Test(expected = IllegalArgumentException.class)
    public void testData6() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        
        httpConnection.data(linkedHashMap);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testData7() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, string1);
        linkedHashMap.put(string1, null);
        
        httpConnection.data(linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method data(java.util.Map)
    
    @Test
    public void testData8() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000";
        linkedHashMap.put(string, string);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:211) */
        httpConnection.data(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.data
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method data(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#create(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#contentType(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data(org.jsoup.Connection.KeyVal)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testData_ConnectionData3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "  ";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        HttpConnection actual = ((HttpConnection) httpConnection.data(string, string1, null, string));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection httpConnectionReqData = ((Collection) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(httpConnectionReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method data(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException6() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        httpConnection.data(string, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_16() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.data(null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_23() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        
        httpConnection.data(string, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_31() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        
        httpConnection.data(string, string, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testData_ThrowIllegalArgumentException_4() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        String string2 = "";
        
        httpConnection.data(string, string1, null, string2);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method data(java.lang.String, java.lang.String, java.io.InputStream, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#data(java.lang.String,java.lang.String,java.io.InputStream,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#create(java.lang.String,java.lang.String,java.io.InputStream)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection.KeyVal#contentType(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data(org.jsoup.Connection.KeyVal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.data(KeyVal.create(key, filename, inputStream).contentType(contentType));
 *  */
    @Test
    public void testData_ThrowNullPointerException4() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = " ";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.data] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.data(HttpConnection.java:204) */
        httpConnection.data(string, string1, null, string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.url
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method url(java.net.URL)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#url(java.net.URL)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#url(java.net.URL)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testUrl_ConnectionUrl() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        URL url = ((URL) createInstance("java.net.URL"));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        URL initialHttpConnectionReqUrl = ((URL) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        
        HttpConnection actual = ((HttpConnection) httpConnection.url(url));
        
        org.jsoup.Connection.Request httpConnectionReq1 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReq1TimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReq1TimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReq1MaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReq1MaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL httpConnectionReq1Url = ((URL) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Base", "url"));
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        // java.net.URL has overridden equals method
        assertEquals(httpConnectionReq1Url, actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        org.jsoup.Connection.Request httpConnectionReq2 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        URL finalHttpConnectionReqUrl = ((URL) getFieldValue(httpConnectionReq2, "org.jsoup.helper.HttpConnection$Base", "url"));
        
        assertFalse(initialHttpConnectionReqUrl == finalHttpConnectionReqUrl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method url(java.net.URL)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#url(java.net.URL)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#url(java.net.URL)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.url(url);
 *  */
    @Test
    public void testUrl_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.url] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.url(HttpConnection.java:120) */
        httpConnection.url(((URL) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method url(java.net.URL)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#url(java.net.URL)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#url(java.net.URL)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.url(url);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUrl_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.url(((URL) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.url
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method url(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#url(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(url, "Must supply a valid URL");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUrl_ThrowIllegalArgumentException1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.url(((String) null));
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#url(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notEmpty(url, "Must supply a valid URL");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUrl_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        httpConnection.url(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method url(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testUrl1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "\u0001\u0001\u0001!\u0000\u0000\u0000\u0000!";
        
        httpConnection.url(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.execute
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method execute()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#execute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: res = Response.execute(req);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testExecute_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.execute();
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#execute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: res = Response.execute(req);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testExecute_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.execute();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method execute()
    
    @Test(expected = MalformedURLException.class)
    public void testExecute1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        URL url = ((URL) createInstance("java.net.URL"));
        String protocol = "h\u0000\u0000\u0000";
        setField(url, "java.net.URL", "protocol", protocol);
        setField(req, "org.jsoup.helper.HttpConnection$Base", "url", url);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.execute();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.connect
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method connect(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.HttpConnection}
     * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#connect(java.lang.String)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConnectThrowsIAEWithNonEmptyString() {
        HttpConnection.connect("\u0014\n\t\r");
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method connect(java.lang.String)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConnect1() {
        HttpConnection.connect(((String) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.connect
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method connect(java.net.URL)
    
    @Test(expected = IllegalArgumentException.class)
    public void testConnect2() {
        HttpConnection.connect(((URL) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.proxy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method proxy(java.net.Proxy)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#proxy(java.net.Proxy)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#proxy(java.net.Proxy)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testProxy_ConnectionProxy() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.proxy(null));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method proxy(java.net.Proxy)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#proxy(java.net.Proxy)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#proxy(java.net.Proxy)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.proxy(proxy);
 *  */
    @Test
    public void testProxy_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.proxy] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.proxy(HttpConnection.java:135) */
        httpConnection.proxy(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.proxy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method proxy(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#proxy(java.lang.String,int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#proxy(java.lang.String,int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testProxy_ConnectionProxy1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "";
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        Proxy initialHttpConnectionReqProxy = ((Proxy) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        
        HttpConnection actual = ((HttpConnection) httpConnection.proxy(string, 1));
        
        org.jsoup.Connection.Request httpConnectionReq1 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy httpConnectionReq1Proxy = ((Proxy) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        // java.net.Proxy has overridden equals method
        assertEquals(httpConnectionReq1Proxy, actualReqProxy);
        
        int httpConnectionReq1TimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReq1TimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReq1MaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReq1MaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        org.jsoup.Connection.Request httpConnectionReq2 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        Proxy finalHttpConnectionReqProxy = ((Proxy) getFieldValue(httpConnectionReq2, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        
        assertFalse(initialHttpConnectionReqProxy == finalHttpConnectionReqProxy);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method proxy(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#proxy(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.proxy(host, port);
 *  */
    @Test
    public void testProxy_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.proxy] produces [java.lang.IllegalArgumentException: port out of range:-1]
            java.base/java.net.InetSocketAddress.checkPort(InetSocketAddress.java:152)
            java.base/java.net.InetSocketAddress.createUnresolved(InetSocketAddress.java:263)
            org.jsoup.helper.HttpConnection$Request.proxy(HttpConnection.java:569)
            org.jsoup.helper.HttpConnection$Request.proxy(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection.proxy(HttpConnection.java:140) */
        httpConnection.proxy(null, -1);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#proxy(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.proxy(host, port);
 *  */
    @Test
    public void testProxy_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.proxy] produces [java.lang.IllegalArgumentException: hostname can't be null]
            java.base/java.net.InetSocketAddress.checkHost(InetSocketAddress.java:158)
            java.base/java.net.InetSocketAddress.createUnresolved(InetSocketAddress.java:263)
            org.jsoup.helper.HttpConnection$Request.proxy(HttpConnection.java:569)
            org.jsoup.helper.HttpConnection$Request.proxy(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection.proxy(HttpConnection.java:140) */
        httpConnection.proxy(null, 1);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#proxy(java.lang.String,int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#proxy(java.lang.String,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.proxy(host, port);
 *  */
    @Test
    public void testProxy_ThrowNullPointerException1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.proxy] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.proxy(HttpConnection.java:140) */
        httpConnection.proxy(null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.timeout
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method timeout(int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#timeout(int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#timeout(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testTimeout_ConnectionTimeout() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.timeout(0));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method timeout(int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#timeout(int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#timeout(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.timeout(millis);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTimeout_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.timeout(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method timeout(int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#timeout(int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#timeout(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.timeout(millis);
 *  */
    @Test
    public void testTimeout_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.timeout] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.timeout(HttpConnection.java:151) */
        httpConnection.timeout(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.parser
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method parser(org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#parser(org.jsoup.parser.Parser)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#parser(org.jsoup.parser.Parser)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testParser_ConnectionParser() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.parser(null));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertTrue(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        org.jsoup.Connection.Request httpConnectionReq1 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        boolean finalHttpConnectionReqParserDefined = ((Boolean) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        
        assertTrue(finalHttpConnectionReqParserDefined);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parser(org.jsoup.parser.Parser)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#parser(org.jsoup.parser.Parser)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#parser(org.jsoup.parser.Parser)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.parser(parser);
 *  */
    @Test
    public void testParser_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.parser] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.parser(HttpConnection.java:278) */
        httpConnection.parser(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.header
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method header(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#header(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#header(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.header(name, value);
 *  */
    @Test
    public void testHeader_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.header] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.header(HttpConnection.java:252) */
        httpConnection.header(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method header(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#header(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.header(name, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHeader_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.header(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#header(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.header(name, value);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHeader_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "";
        
        httpConnection.header(string, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method header(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.HttpConnection}
     * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#header(java.lang.String,java.lang.String)}
     */
    @Test
    public void testHeaderWithNonEmptyStrings() throws Exception  {
        HttpConnection httpConnection = new HttpConnection();
        
        HttpConnection actual = ((HttpConnection) httpConnection.header("X", "10"));
        
        HttpConnection expected = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(req, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds", 30000);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes", 1048576);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "followRedirects", true);
        ArrayList data = new ArrayList();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        Object start = createInstance("org.jsoup.parser.Token$StartTag");
        StringBuilder pendingAttributeValue = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(attributes, "org.jsoup.nodes.Attributes", "vals", keys);
        setField(start, "org.jsoup.parser.Token$Tag", "attributes", attributes);
        Class tokenTypeClazz = Class.forName("org.jsoup.parser.Token$TokenType");
        Object type = getEnumConstantByName(tokenTypeClazz, "StartTag");
        setField(start, "org.jsoup.parser.Token", "type", type);
        setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        Object end = createInstance("org.jsoup.parser.Token$EndTag");
        StringBuilder pendingAttributeValue1 = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue1);
        Object type1 = getEnumConstantByName(tokenTypeClazz, "EndTag");
        setField(end, "org.jsoup.parser.Token", "type", type1);
        setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        java.lang.Object[] elementData = {};
        setField(errors, "java.util.ArrayList", "elementData", elementData);
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "parser", parser);
        String postDataCharset = "UTF-8";
        setField(req, "org.jsoup.helper.HttpConnection$Request", "postDataCharset", postDataCharset);
        Connection.Method method = Connection.Method.GET;
        setField(req, "org.jsoup.helper.HttpConnection$Base", "method", method);
        LinkedHashMap headers = new LinkedHashMap();
        String string = "Accept-Encoding";
        ArrayList arrayList = new ArrayList();
        String string1 = "gzip";
        arrayList.add(string1);
        headers.put(string, arrayList);
        String string2 = "User-Agent";
        ArrayList arrayList1 = new ArrayList();
        String string3 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
        arrayList1.add(string3);
        headers.put(string2, arrayList1);
        String string4 = "X";
        ArrayList arrayList2 = new ArrayList();
        String string5 = "10";
        arrayList2.add(string5);
        headers.put(string4, arrayList2);
        setField(req, "org.jsoup.helper.HttpConnection$Base", "headers", headers);
        LinkedHashMap cookies = new LinkedHashMap();
        setField(req, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies);
        setField(expected, "org.jsoup.helper.HttpConnection", "req", req);
        org.jsoup.helper.HttpConnection.Response res = ((org.jsoup.helper.HttpConnection.Response) createInstance("org.jsoup.helper.HttpConnection$Response"));
        LinkedHashMap headers1 = new LinkedHashMap();
        setField(res, "org.jsoup.helper.HttpConnection$Base", "headers", headers1);
        LinkedHashMap cookies1 = new LinkedHashMap();
        setField(res, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies1);
        setField(expected, "org.jsoup.helper.HttpConnection", "res", res);
        
        org.jsoup.Connection.Request expectedReq = ((org.jsoup.Connection.Request) getFieldValue(expected, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int expectedReqTimeoutMilliseconds = ((Integer) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(expectedReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int expectedReqMaxBodySizeBytes = ((Integer) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(expectedReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertTrue(actualReqFollowRedirects);
        
        Collection expectedReqData = ((Collection) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(expectedReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser expectedReqParser = ((Parser) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        Object expectedReqParserTreeBuilder = expectedReqParser.getTreeBuilder();
        Object actualReqParserTreeBuilder = actualReqParser.getTreeBuilder();
        Object actualReqParserTreeBuilderState = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state");
        assertNull(actualReqParserTreeBuilderState);
        
        Object actualReqParserTreeBuilderOriginalState = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "originalState");
        assertNull(actualReqParserTreeBuilderOriginalState);
        
        boolean actualReqParserTreeBuilderBaseUriSetFromDoc = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "baseUriSetFromDoc"));
        assertFalse(actualReqParserTreeBuilderBaseUriSetFromDoc);
        
        Element actualReqParserTreeBuilderHeadElement = ((Element) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "headElement"));
        assertNull(actualReqParserTreeBuilderHeadElement);
        
        FormElement actualReqParserTreeBuilderFormElement = ((FormElement) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formElement"));
        assertNull(actualReqParserTreeBuilderFormElement);
        
        Element actualReqParserTreeBuilderContextElement = ((Element) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement"));
        assertNull(actualReqParserTreeBuilderContextElement);
        
        ArrayList actualReqParserTreeBuilderFormattingElements = ((ArrayList) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
        assertNull(actualReqParserTreeBuilderFormattingElements);
        
        List actualReqParserTreeBuilderPendingTableCharacters = ((List) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "pendingTableCharacters"));
        assertNull(actualReqParserTreeBuilderPendingTableCharacters);
        
        Object actualReqParserTreeBuilderEmptyEnd = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "emptyEnd");
        assertNull(actualReqParserTreeBuilderEmptyEnd);
        
        boolean actualReqParserTreeBuilderFramesetOk = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk"));
        assertFalse(actualReqParserTreeBuilderFramesetOk);
        
        boolean actualReqParserTreeBuilderFosterInserts = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fosterInserts"));
        assertFalse(actualReqParserTreeBuilderFosterInserts);
        
        boolean actualReqParserTreeBuilderFragmentParsing = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fragmentParsing"));
        assertFalse(actualReqParserTreeBuilderFragmentParsing);
        
        java.lang.String[] expectedReqParserTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
        java.lang.String[] actualReqParserTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
        int expectedReqParserTreeBuilderSpecificScopeTargetSize = expectedReqParserTreeBuilderSpecificScopeTarget.length;
        assertEquals(expectedReqParserTreeBuilderSpecificScopeTargetSize, actualReqParserTreeBuilderSpecificScopeTarget.length);
        assertTrue(deepEquals(expectedReqParserTreeBuilderSpecificScopeTarget, actualReqParserTreeBuilderSpecificScopeTarget));
        
        Parser actualReqParserTreeBuilderParser = ((Parser) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "parser"));
        assertNull(actualReqParserTreeBuilderParser);
        
        CharacterReader actualReqParserTreeBuilderReader = ((CharacterReader) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "reader"));
        assertNull(actualReqParserTreeBuilderReader);
        
        Object actualReqParserTreeBuilderTokeniser = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "tokeniser");
        assertNull(actualReqParserTreeBuilderTokeniser);
        
        Document actualReqParserTreeBuilderDoc = ((Document) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "doc"));
        assertNull(actualReqParserTreeBuilderDoc);
        
        ArrayList actualReqParserTreeBuilderStack = ((ArrayList) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "stack"));
        assertNull(actualReqParserTreeBuilderStack);
        
        String actualReqParserTreeBuilderBaseUri = ((String) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "baseUri"));
        assertNull(actualReqParserTreeBuilderBaseUri);
        
        Object actualReqParserTreeBuilderCurrentToken = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken");
        assertNull(actualReqParserTreeBuilderCurrentToken);
        
        ParseSettings actualReqParserTreeBuilderSettings = ((ParseSettings) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "settings"));
        assertNull(actualReqParserTreeBuilderSettings);
        
        Object expectedReqParserTreeBuilderStart = getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start");
        Object actualReqParserTreeBuilderStart = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start");
        String actualReqParserTreeBuilderStartTagName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "tagName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartTagName, actualReqParserTreeBuilderStartTagName));
        
        String actualReqParserTreeBuilderStartNormalName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "normalName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartNormalName, actualReqParserTreeBuilderStartNormalName));
        
        String actualReqParserTreeBuilderStartPendingAttributeName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartPendingAttributeName, actualReqParserTreeBuilderStartPendingAttributeName));
        
        StringBuilder expectedReqParserTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualReqParserTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartPendingAttributeValue, actualReqParserTreeBuilderStartPendingAttributeValue));
        
        String actualReqParserTreeBuilderStartPendingAttributeValueS = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartPendingAttributeValueS, actualReqParserTreeBuilderStartPendingAttributeValueS));
        
        boolean actualReqParserTreeBuilderStartHasEmptyAttributeValue = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartHasEmptyAttributeValue, actualReqParserTreeBuilderStartHasEmptyAttributeValue));
        
        boolean actualReqParserTreeBuilderStartHasPendingAttributeValue = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartHasPendingAttributeValue, actualReqParserTreeBuilderStartHasPendingAttributeValue));
        
        boolean actualReqParserTreeBuilderStartSelfClosing = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "selfClosing"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartSelfClosing, actualReqParserTreeBuilderStartSelfClosing));
        
        Attributes expectedReqParserTreeBuilderStartAttributes = ((Attributes) getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        Attributes actualReqParserTreeBuilderStartAttributes = ((Attributes) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartAttributes, actualReqParserTreeBuilderStartAttributes));
        
        Object expectedReqParserTreeBuilderStartType = getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token", "type");
        Object actualReqParserTreeBuilderStartType = getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token", "type");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartType, actualReqParserTreeBuilderStartType));
        
        Object expectedReqParserTreeBuilderEnd = getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end");
        Object actualReqParserTreeBuilderEnd = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end");
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        StringBuilder expectedReqParserTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(expectedReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualReqParserTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderEndPendingAttributeValue, actualReqParserTreeBuilderEndPendingAttributeValue));
        
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        Attributes actualReqParserTreeBuilderEndAttributes = ((Attributes) getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "attributes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderEndAttributes, actualReqParserTreeBuilderEndAttributes));
        
        Object expectedReqParserTreeBuilderEndType = getFieldValue(expectedReqParserTreeBuilderEnd, "org.jsoup.parser.Token", "type");
        Object actualReqParserTreeBuilderEndType = getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token", "type");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderEndType, actualReqParserTreeBuilderEndType));
        
        ParseErrorList expectedReqParserErrors = expectedReqParser.getErrors();
        ParseErrorList actualReqParserErrors = actualReqParser.getErrors();
        int expectedReqParserErrorsMaxSize = ((Integer) getFieldValue(expectedReqParserErrors, "org.jsoup.parser.ParseErrorList", "maxSize"));
        int actualReqParserErrorsMaxSize = ((Integer) getFieldValue(actualReqParserErrors, "org.jsoup.parser.ParseErrorList", "maxSize"));
        assertEquals(expectedReqParserErrorsMaxSize, actualReqParserErrorsMaxSize);
        
        java.lang.Object[] expectedReqParserErrorsElementData = ((java.lang.Object[]) getFieldValue(expectedReqParserErrors, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualReqParserErrorsElementData = ((java.lang.Object[]) getFieldValue(actualReqParserErrors, "java.util.ArrayList", "elementData"));
        int expectedReqParserErrorsElementDataSize = expectedReqParserErrorsElementData.length;
        assertEquals(expectedReqParserErrorsElementDataSize, actualReqParserErrorsElementData.length);
        assertTrue(deepEquals(expectedReqParserErrorsElementData, actualReqParserErrorsElementData));
        
        int expectedReqParserErrorsSize = ((Integer) getFieldValue(expectedReqParserErrors, "java.util.ArrayList", "size"));
        int actualReqParserErrorsSize = ((Integer) getFieldValue(actualReqParserErrors, "java.util.ArrayList", "size"));
        assertEquals(expectedReqParserErrorsSize, actualReqParserErrorsSize);
        
        int expectedReqParserErrorsModCount = ((Integer) getFieldValue(expectedReqParserErrors, "java.util.AbstractList", "modCount"));
        int actualReqParserErrorsModCount = ((Integer) getFieldValue(actualReqParserErrors, "java.util.AbstractList", "modCount"));
        assertEquals(expectedReqParserErrorsModCount, actualReqParserErrorsModCount);
        
        ParseSettings expectedReqParserSettings = ((ParseSettings) getFieldValue(expectedReqParser, "org.jsoup.parser.Parser", "settings"));
        ParseSettings actualReqParserSettings = ((ParseSettings) getFieldValue(actualReqParser, "org.jsoup.parser.Parser", "settings"));
        boolean actualReqParserSettingsPreserveTagCase = ((Boolean) getFieldValue(actualReqParserSettings, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
        assertFalse(actualReqParserSettingsPreserveTagCase);
        
        boolean actualReqParserSettingsPreserveAttributeCase = ((Boolean) getFieldValue(actualReqParserSettings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
        assertFalse(actualReqParserSettingsPreserveAttributeCase);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String expectedReqPostDataCharset = ((String) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertEquals(expectedReqPostDataCharset, actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method expectedReqMethod = ((Connection.Method) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertEquals(expectedReqMethod, actualReqMethod);
        
        Map expectedReqHeaders = ((Map) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertTrue(deepEquals(expectedReqHeaders, actualReqHeaders));
        
        Map expectedReqCookies = ((Map) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(expectedReqCookies, actualReqCookies));
        
        Connection.Response expectedRes = ((Connection.Response) getFieldValue(expected, "org.jsoup.helper.HttpConnection", "res"));
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        int expectedResStatusCode = ((Integer) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Response", "statusCode"));
        int actualResStatusCode = ((Integer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "statusCode"));
        assertEquals(expectedResStatusCode, actualResStatusCode);
        
        String actualResStatusMessage = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "statusMessage"));
        assertNull(actualResStatusMessage);
        
        ByteBuffer actualResByteData = ((ByteBuffer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "byteData"));
        assertNull(actualResByteData);
        
        InputStream actualResBodyStream = ((InputStream) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "bodyStream"));
        assertNull(actualResBodyStream);
        
        HttpURLConnection actualResConn = ((HttpURLConnection) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "conn"));
        assertNull(actualResConn);
        
        String actualResCharset = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "charset"));
        assertNull(actualResCharset);
        
        String actualResContentType = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "contentType"));
        assertNull(actualResContentType);
        
        boolean actualResExecuted = ((Boolean) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "executed"));
        assertFalse(actualResExecuted);
        
        boolean actualResInputStreamRead = ((Boolean) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "inputStreamRead"));
        assertFalse(actualResInputStreamRead);
        
        int expectedResNumRedirects = ((Integer) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Response", "numRedirects"));
        int actualResNumRedirects = ((Integer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "numRedirects"));
        assertEquals(expectedResNumRedirects, actualResNumRedirects);
        
        org.jsoup.Connection.Request actualResReq = ((org.jsoup.Connection.Request) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "req"));
        assertNull(actualResReq);
        
        assertTrue(deepEquals(expectedRes, actualRes));
        Connection.Method actualResMethod = ((Connection.Method) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualResMethod);
        
        Map expectedResHeaders = ((Map) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Base", "headers"));
        Map actualResHeaders = ((Map) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertTrue(deepEquals(expectedResHeaders, actualResHeaders));
        
        Map expectedResCookies = ((Map) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualResCookies = ((Map) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(expectedResCookies, actualResCookies));
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method header(java.lang.String, java.lang.String)
    
    @Test
    public void testHeader1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "\u0000";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.header] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection$Base.scanHeaders(HttpConnection.java:499)
            org.jsoup.helper.HttpConnection$Base.removeHeader(HttpConnection.java:464)
            org.jsoup.helper.HttpConnection$Request.removeHeader(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection$Base.header(HttpConnection.java:438)
            org.jsoup.helper.HttpConnection$Request.header(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection.header(HttpConnection.java:252) */
        httpConnection.header(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.post
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method post()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#post()}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.invokes {@link org.jsoup.helper.HttpConnection#execute()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: execute();
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPost_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.post();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method post()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#post()}
 * @utbot.invokes {@link org.jsoup.Connection.Request#method(org.jsoup.Connection.Method)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.method(Method.POST);
 *  */
    @Test
    public void testPost_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.post] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.post(HttpConnection.java:289) */
        httpConnection.post();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.encodeMimeName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeMimeName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#encodeMimeName(java.lang.String)}
 * @utbot.executesCondition {@code (val == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testEncodeMimeName_ValEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class stringType = Class.forName("java.lang.String");
        java.lang.reflect.Method encodeMimeNameMethod = httpConnectionClazz.getDeclaredMethod("encodeMimeName", stringType);
        encodeMimeNameMethod.setAccessible(true);
        java.lang.Object[] encodeMimeNameMethodArguments = new java.lang.Object[1];
        encodeMimeNameMethodArguments[0] = ((Object) null);
        String actual = ((String) encodeMimeNameMethod.invoke(null, encodeMimeNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeMimeName(java.lang.String)
    
    @Test
    public void testEncodeMimeName1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class stringType = Class.forName("java.lang.String");
        java.lang.reflect.Method encodeMimeNameMethod = httpConnectionClazz.getDeclaredMethod("encodeMimeName", stringType);
        encodeMimeNameMethod.setAccessible(true);
        java.lang.Object[] encodeMimeNameMethodArguments = new java.lang.Object[1];
        encodeMimeNameMethodArguments[0] = string;
        String actual = ((String) encodeMimeNameMethod.invoke(null, encodeMimeNameMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.userAgent
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method userAgent(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#userAgent(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#header(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.header(USER_AGENT, userAgent);
 *  */
    @Test
    public void testUserAgent_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.userAgent] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.userAgent(HttpConnection.java:146) */
        httpConnection.userAgent(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method userAgent(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#userAgent(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(userAgent, "User agent must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testUserAgent_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.userAgent(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method userAgent(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.HttpConnection}
     * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#userAgent(java.lang.String)}
     */
    @Test
    public void testUserAgentWithNonEmptyString() throws Exception  {
        HttpConnection httpConnection = new HttpConnection();
        
        HttpConnection actual = ((HttpConnection) httpConnection.userAgent("3-"));
        
        HttpConnection expected = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(req, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds", 30000);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes", 1048576);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "followRedirects", true);
        ArrayList data = new ArrayList();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        Object start = createInstance("org.jsoup.parser.Token$StartTag");
        StringBuilder pendingAttributeValue = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(attributes, "org.jsoup.nodes.Attributes", "vals", keys);
        setField(start, "org.jsoup.parser.Token$Tag", "attributes", attributes);
        Class tokenTypeClazz = Class.forName("org.jsoup.parser.Token$TokenType");
        Object type = getEnumConstantByName(tokenTypeClazz, "StartTag");
        setField(start, "org.jsoup.parser.Token", "type", type);
        setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        Object end = createInstance("org.jsoup.parser.Token$EndTag");
        StringBuilder pendingAttributeValue1 = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue1);
        Object type1 = getEnumConstantByName(tokenTypeClazz, "EndTag");
        setField(end, "org.jsoup.parser.Token", "type", type1);
        setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        java.lang.Object[] elementData = {};
        setField(errors, "java.util.ArrayList", "elementData", elementData);
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "parser", parser);
        String postDataCharset = "UTF-8";
        setField(req, "org.jsoup.helper.HttpConnection$Request", "postDataCharset", postDataCharset);
        Connection.Method method = Connection.Method.GET;
        setField(req, "org.jsoup.helper.HttpConnection$Base", "method", method);
        LinkedHashMap headers = new LinkedHashMap();
        String string = "Accept-Encoding";
        ArrayList arrayList = new ArrayList();
        String string1 = "gzip";
        arrayList.add(string1);
        headers.put(string, arrayList);
        String string2 = "User-Agent";
        ArrayList arrayList1 = new ArrayList();
        String string3 = "3-";
        arrayList1.add(string3);
        headers.put(string2, arrayList1);
        setField(req, "org.jsoup.helper.HttpConnection$Base", "headers", headers);
        LinkedHashMap cookies = new LinkedHashMap();
        setField(req, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies);
        setField(expected, "org.jsoup.helper.HttpConnection", "req", req);
        org.jsoup.helper.HttpConnection.Response res = ((org.jsoup.helper.HttpConnection.Response) createInstance("org.jsoup.helper.HttpConnection$Response"));
        LinkedHashMap headers1 = new LinkedHashMap();
        setField(res, "org.jsoup.helper.HttpConnection$Base", "headers", headers1);
        LinkedHashMap cookies1 = new LinkedHashMap();
        setField(res, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies1);
        setField(expected, "org.jsoup.helper.HttpConnection", "res", res);
        
        org.jsoup.Connection.Request expectedReq = ((org.jsoup.Connection.Request) getFieldValue(expected, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int expectedReqTimeoutMilliseconds = ((Integer) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(expectedReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int expectedReqMaxBodySizeBytes = ((Integer) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(expectedReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertTrue(actualReqFollowRedirects);
        
        Collection expectedReqData = ((Collection) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(expectedReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser expectedReqParser = ((Parser) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        Object expectedReqParserTreeBuilder = expectedReqParser.getTreeBuilder();
        Object actualReqParserTreeBuilder = actualReqParser.getTreeBuilder();
        Object actualReqParserTreeBuilderState = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state");
        assertNull(actualReqParserTreeBuilderState);
        
        Object actualReqParserTreeBuilderOriginalState = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "originalState");
        assertNull(actualReqParserTreeBuilderOriginalState);
        
        boolean actualReqParserTreeBuilderBaseUriSetFromDoc = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "baseUriSetFromDoc"));
        assertFalse(actualReqParserTreeBuilderBaseUriSetFromDoc);
        
        Element actualReqParserTreeBuilderHeadElement = ((Element) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "headElement"));
        assertNull(actualReqParserTreeBuilderHeadElement);
        
        FormElement actualReqParserTreeBuilderFormElement = ((FormElement) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formElement"));
        assertNull(actualReqParserTreeBuilderFormElement);
        
        Element actualReqParserTreeBuilderContextElement = ((Element) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement"));
        assertNull(actualReqParserTreeBuilderContextElement);
        
        ArrayList actualReqParserTreeBuilderFormattingElements = ((ArrayList) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
        assertNull(actualReqParserTreeBuilderFormattingElements);
        
        List actualReqParserTreeBuilderPendingTableCharacters = ((List) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "pendingTableCharacters"));
        assertNull(actualReqParserTreeBuilderPendingTableCharacters);
        
        Object actualReqParserTreeBuilderEmptyEnd = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "emptyEnd");
        assertNull(actualReqParserTreeBuilderEmptyEnd);
        
        boolean actualReqParserTreeBuilderFramesetOk = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk"));
        assertFalse(actualReqParserTreeBuilderFramesetOk);
        
        boolean actualReqParserTreeBuilderFosterInserts = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fosterInserts"));
        assertFalse(actualReqParserTreeBuilderFosterInserts);
        
        boolean actualReqParserTreeBuilderFragmentParsing = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fragmentParsing"));
        assertFalse(actualReqParserTreeBuilderFragmentParsing);
        
        java.lang.String[] expectedReqParserTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
        java.lang.String[] actualReqParserTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
        int expectedReqParserTreeBuilderSpecificScopeTargetSize = expectedReqParserTreeBuilderSpecificScopeTarget.length;
        assertEquals(expectedReqParserTreeBuilderSpecificScopeTargetSize, actualReqParserTreeBuilderSpecificScopeTarget.length);
        assertTrue(deepEquals(expectedReqParserTreeBuilderSpecificScopeTarget, actualReqParserTreeBuilderSpecificScopeTarget));
        
        Parser actualReqParserTreeBuilderParser = ((Parser) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "parser"));
        assertNull(actualReqParserTreeBuilderParser);
        
        CharacterReader actualReqParserTreeBuilderReader = ((CharacterReader) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "reader"));
        assertNull(actualReqParserTreeBuilderReader);
        
        Object actualReqParserTreeBuilderTokeniser = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "tokeniser");
        assertNull(actualReqParserTreeBuilderTokeniser);
        
        Document actualReqParserTreeBuilderDoc = ((Document) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "doc"));
        assertNull(actualReqParserTreeBuilderDoc);
        
        ArrayList actualReqParserTreeBuilderStack = ((ArrayList) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "stack"));
        assertNull(actualReqParserTreeBuilderStack);
        
        String actualReqParserTreeBuilderBaseUri = ((String) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "baseUri"));
        assertNull(actualReqParserTreeBuilderBaseUri);
        
        Object actualReqParserTreeBuilderCurrentToken = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken");
        assertNull(actualReqParserTreeBuilderCurrentToken);
        
        ParseSettings actualReqParserTreeBuilderSettings = ((ParseSettings) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "settings"));
        assertNull(actualReqParserTreeBuilderSettings);
        
        Object expectedReqParserTreeBuilderStart = getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start");
        Object actualReqParserTreeBuilderStart = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start");
        String actualReqParserTreeBuilderStartTagName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "tagName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartTagName, actualReqParserTreeBuilderStartTagName));
        
        String actualReqParserTreeBuilderStartNormalName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "normalName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartNormalName, actualReqParserTreeBuilderStartNormalName));
        
        String actualReqParserTreeBuilderStartPendingAttributeName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartPendingAttributeName, actualReqParserTreeBuilderStartPendingAttributeName));
        
        StringBuilder expectedReqParserTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualReqParserTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartPendingAttributeValue, actualReqParserTreeBuilderStartPendingAttributeValue));
        
        String actualReqParserTreeBuilderStartPendingAttributeValueS = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartPendingAttributeValueS, actualReqParserTreeBuilderStartPendingAttributeValueS));
        
        boolean actualReqParserTreeBuilderStartHasEmptyAttributeValue = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartHasEmptyAttributeValue, actualReqParserTreeBuilderStartHasEmptyAttributeValue));
        
        boolean actualReqParserTreeBuilderStartHasPendingAttributeValue = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartHasPendingAttributeValue, actualReqParserTreeBuilderStartHasPendingAttributeValue));
        
        boolean actualReqParserTreeBuilderStartSelfClosing = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "selfClosing"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartSelfClosing, actualReqParserTreeBuilderStartSelfClosing));
        
        Attributes expectedReqParserTreeBuilderStartAttributes = ((Attributes) getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        Attributes actualReqParserTreeBuilderStartAttributes = ((Attributes) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartAttributes, actualReqParserTreeBuilderStartAttributes));
        
        Object expectedReqParserTreeBuilderStartType = getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token", "type");
        Object actualReqParserTreeBuilderStartType = getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token", "type");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartType, actualReqParserTreeBuilderStartType));
        
        Object expectedReqParserTreeBuilderEnd = getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end");
        Object actualReqParserTreeBuilderEnd = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end");
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        StringBuilder expectedReqParserTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(expectedReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualReqParserTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderEndPendingAttributeValue, actualReqParserTreeBuilderEndPendingAttributeValue));
        
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        Attributes actualReqParserTreeBuilderEndAttributes = ((Attributes) getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "attributes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderEndAttributes, actualReqParserTreeBuilderEndAttributes));
        
        Object expectedReqParserTreeBuilderEndType = getFieldValue(expectedReqParserTreeBuilderEnd, "org.jsoup.parser.Token", "type");
        Object actualReqParserTreeBuilderEndType = getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token", "type");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderEndType, actualReqParserTreeBuilderEndType));
        
        ParseErrorList expectedReqParserErrors = expectedReqParser.getErrors();
        ParseErrorList actualReqParserErrors = actualReqParser.getErrors();
        int expectedReqParserErrorsMaxSize = ((Integer) getFieldValue(expectedReqParserErrors, "org.jsoup.parser.ParseErrorList", "maxSize"));
        int actualReqParserErrorsMaxSize = ((Integer) getFieldValue(actualReqParserErrors, "org.jsoup.parser.ParseErrorList", "maxSize"));
        assertEquals(expectedReqParserErrorsMaxSize, actualReqParserErrorsMaxSize);
        
        java.lang.Object[] expectedReqParserErrorsElementData = ((java.lang.Object[]) getFieldValue(expectedReqParserErrors, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualReqParserErrorsElementData = ((java.lang.Object[]) getFieldValue(actualReqParserErrors, "java.util.ArrayList", "elementData"));
        int expectedReqParserErrorsElementDataSize = expectedReqParserErrorsElementData.length;
        assertEquals(expectedReqParserErrorsElementDataSize, actualReqParserErrorsElementData.length);
        assertTrue(deepEquals(expectedReqParserErrorsElementData, actualReqParserErrorsElementData));
        
        int expectedReqParserErrorsSize = ((Integer) getFieldValue(expectedReqParserErrors, "java.util.ArrayList", "size"));
        int actualReqParserErrorsSize = ((Integer) getFieldValue(actualReqParserErrors, "java.util.ArrayList", "size"));
        assertEquals(expectedReqParserErrorsSize, actualReqParserErrorsSize);
        
        int expectedReqParserErrorsModCount = ((Integer) getFieldValue(expectedReqParserErrors, "java.util.AbstractList", "modCount"));
        int actualReqParserErrorsModCount = ((Integer) getFieldValue(actualReqParserErrors, "java.util.AbstractList", "modCount"));
        assertEquals(expectedReqParserErrorsModCount, actualReqParserErrorsModCount);
        
        ParseSettings expectedReqParserSettings = ((ParseSettings) getFieldValue(expectedReqParser, "org.jsoup.parser.Parser", "settings"));
        ParseSettings actualReqParserSettings = ((ParseSettings) getFieldValue(actualReqParser, "org.jsoup.parser.Parser", "settings"));
        boolean actualReqParserSettingsPreserveTagCase = ((Boolean) getFieldValue(actualReqParserSettings, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
        assertFalse(actualReqParserSettingsPreserveTagCase);
        
        boolean actualReqParserSettingsPreserveAttributeCase = ((Boolean) getFieldValue(actualReqParserSettings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
        assertFalse(actualReqParserSettingsPreserveAttributeCase);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String expectedReqPostDataCharset = ((String) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertEquals(expectedReqPostDataCharset, actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method expectedReqMethod = ((Connection.Method) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertEquals(expectedReqMethod, actualReqMethod);
        
        Map expectedReqHeaders = ((Map) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertTrue(deepEquals(expectedReqHeaders, actualReqHeaders));
        
        Map expectedReqCookies = ((Map) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(expectedReqCookies, actualReqCookies));
        
        Connection.Response expectedRes = ((Connection.Response) getFieldValue(expected, "org.jsoup.helper.HttpConnection", "res"));
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        int expectedResStatusCode = ((Integer) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Response", "statusCode"));
        int actualResStatusCode = ((Integer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "statusCode"));
        assertEquals(expectedResStatusCode, actualResStatusCode);
        
        String actualResStatusMessage = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "statusMessage"));
        assertNull(actualResStatusMessage);
        
        ByteBuffer actualResByteData = ((ByteBuffer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "byteData"));
        assertNull(actualResByteData);
        
        InputStream actualResBodyStream = ((InputStream) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "bodyStream"));
        assertNull(actualResBodyStream);
        
        HttpURLConnection actualResConn = ((HttpURLConnection) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "conn"));
        assertNull(actualResConn);
        
        String actualResCharset = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "charset"));
        assertNull(actualResCharset);
        
        String actualResContentType = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "contentType"));
        assertNull(actualResContentType);
        
        boolean actualResExecuted = ((Boolean) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "executed"));
        assertFalse(actualResExecuted);
        
        boolean actualResInputStreamRead = ((Boolean) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "inputStreamRead"));
        assertFalse(actualResInputStreamRead);
        
        int expectedResNumRedirects = ((Integer) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Response", "numRedirects"));
        int actualResNumRedirects = ((Integer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "numRedirects"));
        assertEquals(expectedResNumRedirects, actualResNumRedirects);
        
        org.jsoup.Connection.Request actualResReq = ((org.jsoup.Connection.Request) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "req"));
        assertNull(actualResReq);
        
        assertTrue(deepEquals(expectedRes, actualRes));
        Connection.Method actualResMethod = ((Connection.Method) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualResMethod);
        
        Map expectedResHeaders = ((Map) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Base", "headers"));
        Map actualResHeaders = ((Map) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertTrue(deepEquals(expectedResHeaders, actualResHeaders));
        
        Map expectedResCookies = ((Map) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualResCookies = ((Map) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(expectedResCookies, actualResCookies));
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method userAgent(java.lang.String)
    
    @Test
    public void testUserAgent1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.userAgent] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection$Base.scanHeaders(HttpConnection.java:499)
            org.jsoup.helper.HttpConnection$Base.removeHeader(HttpConnection.java:464)
            org.jsoup.helper.HttpConnection$Request.removeHeader(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection$Base.header(HttpConnection.java:438)
            org.jsoup.helper.HttpConnection$Request.header(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection.userAgent(HttpConnection.java:146) */
        httpConnection.userAgent(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.ignoreHttpErrors
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ignoreHttpErrors(boolean)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#ignoreHttpErrors(boolean)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#ignoreHttpErrors(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testIgnoreHttpErrors_ConnectionIgnoreHttpErrors() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.ignoreHttpErrors(false));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ignoreHttpErrors(boolean)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#ignoreHttpErrors(boolean)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#ignoreHttpErrors(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.ignoreHttpErrors(ignoreHttpErrors);
 *  */
    @Test
    public void testIgnoreHttpErrors_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.ignoreHttpErrors] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.ignoreHttpErrors(HttpConnection.java:177) */
        httpConnection.ignoreHttpErrors(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.ignoreContentType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ignoreContentType(boolean)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#ignoreContentType(boolean)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#ignoreContentType(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testIgnoreContentType_ConnectionIgnoreContentType() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.ignoreContentType(false));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ignoreContentType(boolean)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#ignoreContentType(boolean)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#ignoreContentType(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.ignoreContentType(ignoreContentType);
 *  */
    @Test
    public void testIgnoreContentType_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.ignoreContentType] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.ignoreContentType(HttpConnection.java:182) */
        httpConnection.ignoreContentType(false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.referrer
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method referrer(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#referrer(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#header(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.header("Referer", referrer);
 *  */
    @Test
    public void testReferrer_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        String string = "";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.referrer] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.referrer(HttpConnection.java:167) */
        httpConnection.referrer(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method referrer(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#referrer(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(referrer, "Referrer must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testReferrer_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.referrer(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method referrer(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.HttpConnection}
     * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#referrer(java.lang.String)}
     */
    @Test
    public void testReferrerWithNonEmptyString() throws Exception  {
        HttpConnection httpConnection = new HttpConnection();
        
        HttpConnection actual = ((HttpConnection) httpConnection.referrer("3-"));
        
        HttpConnection expected = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(req, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds", 30000);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes", 1048576);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "followRedirects", true);
        ArrayList data = new ArrayList();
        setField(req, "org.jsoup.helper.HttpConnection$Request", "data", data);
        Parser parser = ((Parser) createInstance("org.jsoup.parser.Parser"));
        HtmlTreeBuilder treeBuilder = ((HtmlTreeBuilder) createInstance("org.jsoup.parser.HtmlTreeBuilder"));
        java.lang.String[] specificScopeTarget = {null};
        setField(treeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget", specificScopeTarget);
        Object start = createInstance("org.jsoup.parser.Token$StartTag");
        StringBuilder pendingAttributeValue = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(start, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue);
        Attributes attributes = ((Attributes) createInstance("org.jsoup.nodes.Attributes"));
        java.lang.String[] keys = {};
        setField(attributes, "org.jsoup.nodes.Attributes", "keys", keys);
        setField(attributes, "org.jsoup.nodes.Attributes", "vals", keys);
        setField(start, "org.jsoup.parser.Token$Tag", "attributes", attributes);
        Class tokenTypeClazz = Class.forName("org.jsoup.parser.Token$TokenType");
        Object type = getEnumConstantByName(tokenTypeClazz, "StartTag");
        setField(start, "org.jsoup.parser.Token", "type", type);
        setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "start", start);
        Object end = createInstance("org.jsoup.parser.Token$EndTag");
        StringBuilder pendingAttributeValue1 = ((StringBuilder) createInstance("java.lang.StringBuilder"));
        setField(end, "org.jsoup.parser.Token$Tag", "pendingAttributeValue", pendingAttributeValue1);
        Object type1 = getEnumConstantByName(tokenTypeClazz, "EndTag");
        setField(end, "org.jsoup.parser.Token", "type", type1);
        setField(treeBuilder, "org.jsoup.parser.TreeBuilder", "end", end);
        setField(parser, "org.jsoup.parser.Parser", "treeBuilder", treeBuilder);
        ParseErrorList errors = ((ParseErrorList) createInstance("org.jsoup.parser.ParseErrorList"));
        java.lang.Object[] elementData = {};
        setField(errors, "java.util.ArrayList", "elementData", elementData);
        setField(parser, "org.jsoup.parser.Parser", "errors", errors);
        ParseSettings settings = ((ParseSettings) createInstance("org.jsoup.parser.ParseSettings"));
        setField(parser, "org.jsoup.parser.Parser", "settings", settings);
        setField(req, "org.jsoup.helper.HttpConnection$Request", "parser", parser);
        String postDataCharset = "UTF-8";
        setField(req, "org.jsoup.helper.HttpConnection$Request", "postDataCharset", postDataCharset);
        Connection.Method method = Connection.Method.GET;
        setField(req, "org.jsoup.helper.HttpConnection$Base", "method", method);
        LinkedHashMap headers = new LinkedHashMap();
        String string = "Accept-Encoding";
        ArrayList arrayList = new ArrayList();
        String string1 = "gzip";
        arrayList.add(string1);
        headers.put(string, arrayList);
        String string2 = "User-Agent";
        ArrayList arrayList1 = new ArrayList();
        String string3 = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
        arrayList1.add(string3);
        headers.put(string2, arrayList1);
        String string4 = "Referer";
        ArrayList arrayList2 = new ArrayList();
        String string5 = "3-";
        arrayList2.add(string5);
        headers.put(string4, arrayList2);
        setField(req, "org.jsoup.helper.HttpConnection$Base", "headers", headers);
        LinkedHashMap cookies = new LinkedHashMap();
        setField(req, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies);
        setField(expected, "org.jsoup.helper.HttpConnection", "req", req);
        org.jsoup.helper.HttpConnection.Response res = ((org.jsoup.helper.HttpConnection.Response) createInstance("org.jsoup.helper.HttpConnection$Response"));
        LinkedHashMap headers1 = new LinkedHashMap();
        setField(res, "org.jsoup.helper.HttpConnection$Base", "headers", headers1);
        LinkedHashMap cookies1 = new LinkedHashMap();
        setField(res, "org.jsoup.helper.HttpConnection$Base", "cookies", cookies1);
        setField(expected, "org.jsoup.helper.HttpConnection", "res", res);
        
        org.jsoup.Connection.Request expectedReq = ((org.jsoup.Connection.Request) getFieldValue(expected, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int expectedReqTimeoutMilliseconds = ((Integer) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(expectedReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int expectedReqMaxBodySizeBytes = ((Integer) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(expectedReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertTrue(actualReqFollowRedirects);
        
        Collection expectedReqData = ((Collection) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertTrue(deepEquals(expectedReqData, actualReqData));
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser expectedReqParser = ((Parser) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        Object expectedReqParserTreeBuilder = expectedReqParser.getTreeBuilder();
        Object actualReqParserTreeBuilder = actualReqParser.getTreeBuilder();
        Object actualReqParserTreeBuilderState = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "state");
        assertNull(actualReqParserTreeBuilderState);
        
        Object actualReqParserTreeBuilderOriginalState = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "originalState");
        assertNull(actualReqParserTreeBuilderOriginalState);
        
        boolean actualReqParserTreeBuilderBaseUriSetFromDoc = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "baseUriSetFromDoc"));
        assertFalse(actualReqParserTreeBuilderBaseUriSetFromDoc);
        
        Element actualReqParserTreeBuilderHeadElement = ((Element) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "headElement"));
        assertNull(actualReqParserTreeBuilderHeadElement);
        
        FormElement actualReqParserTreeBuilderFormElement = ((FormElement) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formElement"));
        assertNull(actualReqParserTreeBuilderFormElement);
        
        Element actualReqParserTreeBuilderContextElement = ((Element) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "contextElement"));
        assertNull(actualReqParserTreeBuilderContextElement);
        
        ArrayList actualReqParserTreeBuilderFormattingElements = ((ArrayList) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "formattingElements"));
        assertNull(actualReqParserTreeBuilderFormattingElements);
        
        List actualReqParserTreeBuilderPendingTableCharacters = ((List) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "pendingTableCharacters"));
        assertNull(actualReqParserTreeBuilderPendingTableCharacters);
        
        Object actualReqParserTreeBuilderEmptyEnd = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "emptyEnd");
        assertNull(actualReqParserTreeBuilderEmptyEnd);
        
        boolean actualReqParserTreeBuilderFramesetOk = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "framesetOk"));
        assertFalse(actualReqParserTreeBuilderFramesetOk);
        
        boolean actualReqParserTreeBuilderFosterInserts = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fosterInserts"));
        assertFalse(actualReqParserTreeBuilderFosterInserts);
        
        boolean actualReqParserTreeBuilderFragmentParsing = ((Boolean) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "fragmentParsing"));
        assertFalse(actualReqParserTreeBuilderFragmentParsing);
        
        java.lang.String[] expectedReqParserTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
        java.lang.String[] actualReqParserTreeBuilderSpecificScopeTarget = ((java.lang.String[]) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.HtmlTreeBuilder", "specificScopeTarget"));
        int expectedReqParserTreeBuilderSpecificScopeTargetSize = expectedReqParserTreeBuilderSpecificScopeTarget.length;
        assertEquals(expectedReqParserTreeBuilderSpecificScopeTargetSize, actualReqParserTreeBuilderSpecificScopeTarget.length);
        assertTrue(deepEquals(expectedReqParserTreeBuilderSpecificScopeTarget, actualReqParserTreeBuilderSpecificScopeTarget));
        
        Parser actualReqParserTreeBuilderParser = ((Parser) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "parser"));
        assertNull(actualReqParserTreeBuilderParser);
        
        CharacterReader actualReqParserTreeBuilderReader = ((CharacterReader) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "reader"));
        assertNull(actualReqParserTreeBuilderReader);
        
        Object actualReqParserTreeBuilderTokeniser = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "tokeniser");
        assertNull(actualReqParserTreeBuilderTokeniser);
        
        Document actualReqParserTreeBuilderDoc = ((Document) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "doc"));
        assertNull(actualReqParserTreeBuilderDoc);
        
        ArrayList actualReqParserTreeBuilderStack = ((ArrayList) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "stack"));
        assertNull(actualReqParserTreeBuilderStack);
        
        String actualReqParserTreeBuilderBaseUri = ((String) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "baseUri"));
        assertNull(actualReqParserTreeBuilderBaseUri);
        
        Object actualReqParserTreeBuilderCurrentToken = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "currentToken");
        assertNull(actualReqParserTreeBuilderCurrentToken);
        
        ParseSettings actualReqParserTreeBuilderSettings = ((ParseSettings) getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "settings"));
        assertNull(actualReqParserTreeBuilderSettings);
        
        Object expectedReqParserTreeBuilderStart = getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start");
        Object actualReqParserTreeBuilderStart = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "start");
        String actualReqParserTreeBuilderStartTagName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "tagName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartTagName, actualReqParserTreeBuilderStartTagName));
        
        String actualReqParserTreeBuilderStartNormalName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "normalName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartNormalName, actualReqParserTreeBuilderStartNormalName));
        
        String actualReqParserTreeBuilderStartPendingAttributeName = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeName"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartPendingAttributeName, actualReqParserTreeBuilderStartPendingAttributeName));
        
        StringBuilder expectedReqParserTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualReqParserTreeBuilderStartPendingAttributeValue = ((StringBuilder) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartPendingAttributeValue, actualReqParserTreeBuilderStartPendingAttributeValue));
        
        String actualReqParserTreeBuilderStartPendingAttributeValueS = ((String) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "pendingAttributeValueS"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartPendingAttributeValueS, actualReqParserTreeBuilderStartPendingAttributeValueS));
        
        boolean actualReqParserTreeBuilderStartHasEmptyAttributeValue = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasEmptyAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartHasEmptyAttributeValue, actualReqParserTreeBuilderStartHasEmptyAttributeValue));
        
        boolean actualReqParserTreeBuilderStartHasPendingAttributeValue = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "hasPendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartHasPendingAttributeValue, actualReqParserTreeBuilderStartHasPendingAttributeValue));
        
        boolean actualReqParserTreeBuilderStartSelfClosing = ((Boolean) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "selfClosing"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderStartSelfClosing, actualReqParserTreeBuilderStartSelfClosing));
        
        Attributes expectedReqParserTreeBuilderStartAttributes = ((Attributes) getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        Attributes actualReqParserTreeBuilderStartAttributes = ((Attributes) getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token$Tag", "attributes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartAttributes, actualReqParserTreeBuilderStartAttributes));
        
        Object expectedReqParserTreeBuilderStartType = getFieldValue(expectedReqParserTreeBuilderStart, "org.jsoup.parser.Token", "type");
        Object actualReqParserTreeBuilderStartType = getFieldValue(actualReqParserTreeBuilderStart, "org.jsoup.parser.Token", "type");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderStartType, actualReqParserTreeBuilderStartType));
        
        Object expectedReqParserTreeBuilderEnd = getFieldValue(expectedReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end");
        Object actualReqParserTreeBuilderEnd = getFieldValue(actualReqParserTreeBuilder, "org.jsoup.parser.TreeBuilder", "end");
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        StringBuilder expectedReqParserTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(expectedReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        StringBuilder actualReqParserTreeBuilderEndPendingAttributeValue = ((StringBuilder) getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "pendingAttributeValue"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderEndPendingAttributeValue, actualReqParserTreeBuilderEndPendingAttributeValue));
        
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        assertTrue(deepEquals(expectedReqParserTreeBuilderEnd, actualReqParserTreeBuilderEnd));
        Attributes actualReqParserTreeBuilderEndAttributes = ((Attributes) getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token$Tag", "attributes"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualReqParserTreeBuilderEndAttributes, actualReqParserTreeBuilderEndAttributes));
        
        Object expectedReqParserTreeBuilderEndType = getFieldValue(expectedReqParserTreeBuilderEnd, "org.jsoup.parser.Token", "type");
        Object actualReqParserTreeBuilderEndType = getFieldValue(actualReqParserTreeBuilderEnd, "org.jsoup.parser.Token", "type");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedReqParserTreeBuilderEndType, actualReqParserTreeBuilderEndType));
        
        ParseErrorList expectedReqParserErrors = expectedReqParser.getErrors();
        ParseErrorList actualReqParserErrors = actualReqParser.getErrors();
        int expectedReqParserErrorsMaxSize = ((Integer) getFieldValue(expectedReqParserErrors, "org.jsoup.parser.ParseErrorList", "maxSize"));
        int actualReqParserErrorsMaxSize = ((Integer) getFieldValue(actualReqParserErrors, "org.jsoup.parser.ParseErrorList", "maxSize"));
        assertEquals(expectedReqParserErrorsMaxSize, actualReqParserErrorsMaxSize);
        
        java.lang.Object[] expectedReqParserErrorsElementData = ((java.lang.Object[]) getFieldValue(expectedReqParserErrors, "java.util.ArrayList", "elementData"));
        java.lang.Object[] actualReqParserErrorsElementData = ((java.lang.Object[]) getFieldValue(actualReqParserErrors, "java.util.ArrayList", "elementData"));
        int expectedReqParserErrorsElementDataSize = expectedReqParserErrorsElementData.length;
        assertEquals(expectedReqParserErrorsElementDataSize, actualReqParserErrorsElementData.length);
        assertTrue(deepEquals(expectedReqParserErrorsElementData, actualReqParserErrorsElementData));
        
        int expectedReqParserErrorsSize = ((Integer) getFieldValue(expectedReqParserErrors, "java.util.ArrayList", "size"));
        int actualReqParserErrorsSize = ((Integer) getFieldValue(actualReqParserErrors, "java.util.ArrayList", "size"));
        assertEquals(expectedReqParserErrorsSize, actualReqParserErrorsSize);
        
        int expectedReqParserErrorsModCount = ((Integer) getFieldValue(expectedReqParserErrors, "java.util.AbstractList", "modCount"));
        int actualReqParserErrorsModCount = ((Integer) getFieldValue(actualReqParserErrors, "java.util.AbstractList", "modCount"));
        assertEquals(expectedReqParserErrorsModCount, actualReqParserErrorsModCount);
        
        ParseSettings expectedReqParserSettings = ((ParseSettings) getFieldValue(expectedReqParser, "org.jsoup.parser.Parser", "settings"));
        ParseSettings actualReqParserSettings = ((ParseSettings) getFieldValue(actualReqParser, "org.jsoup.parser.Parser", "settings"));
        boolean actualReqParserSettingsPreserveTagCase = ((Boolean) getFieldValue(actualReqParserSettings, "org.jsoup.parser.ParseSettings", "preserveTagCase"));
        assertFalse(actualReqParserSettingsPreserveTagCase);
        
        boolean actualReqParserSettingsPreserveAttributeCase = ((Boolean) getFieldValue(actualReqParserSettings, "org.jsoup.parser.ParseSettings", "preserveAttributeCase"));
        assertFalse(actualReqParserSettingsPreserveAttributeCase);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String expectedReqPostDataCharset = ((String) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertEquals(expectedReqPostDataCharset, actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method expectedReqMethod = ((Connection.Method) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertEquals(expectedReqMethod, actualReqMethod);
        
        Map expectedReqHeaders = ((Map) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertTrue(deepEquals(expectedReqHeaders, actualReqHeaders));
        
        Map expectedReqCookies = ((Map) getFieldValue(expectedReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(expectedReqCookies, actualReqCookies));
        
        Connection.Response expectedRes = ((Connection.Response) getFieldValue(expected, "org.jsoup.helper.HttpConnection", "res"));
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        int expectedResStatusCode = ((Integer) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Response", "statusCode"));
        int actualResStatusCode = ((Integer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "statusCode"));
        assertEquals(expectedResStatusCode, actualResStatusCode);
        
        String actualResStatusMessage = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "statusMessage"));
        assertNull(actualResStatusMessage);
        
        ByteBuffer actualResByteData = ((ByteBuffer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "byteData"));
        assertNull(actualResByteData);
        
        InputStream actualResBodyStream = ((InputStream) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "bodyStream"));
        assertNull(actualResBodyStream);
        
        HttpURLConnection actualResConn = ((HttpURLConnection) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "conn"));
        assertNull(actualResConn);
        
        String actualResCharset = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "charset"));
        assertNull(actualResCharset);
        
        String actualResContentType = ((String) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "contentType"));
        assertNull(actualResContentType);
        
        boolean actualResExecuted = ((Boolean) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "executed"));
        assertFalse(actualResExecuted);
        
        boolean actualResInputStreamRead = ((Boolean) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "inputStreamRead"));
        assertFalse(actualResInputStreamRead);
        
        int expectedResNumRedirects = ((Integer) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Response", "numRedirects"));
        int actualResNumRedirects = ((Integer) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "numRedirects"));
        assertEquals(expectedResNumRedirects, actualResNumRedirects);
        
        org.jsoup.Connection.Request actualResReq = ((org.jsoup.Connection.Request) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Response", "req"));
        assertNull(actualResReq);
        
        assertTrue(deepEquals(expectedRes, actualRes));
        Connection.Method actualResMethod = ((Connection.Method) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualResMethod);
        
        Map expectedResHeaders = ((Map) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Base", "headers"));
        Map actualResHeaders = ((Map) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertTrue(deepEquals(expectedResHeaders, actualResHeaders));
        
        Map expectedResCookies = ((Map) getFieldValue(expectedRes, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        Map actualResCookies = ((Map) getFieldValue(actualRes, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertTrue(deepEquals(expectedResCookies, actualResCookies));
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method referrer(java.lang.String)
    
    @Test
    public void testReferrer1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        String string = "";
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.referrer] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection$Base.scanHeaders(HttpConnection.java:499)
            org.jsoup.helper.HttpConnection$Base.removeHeader(HttpConnection.java:464)
            org.jsoup.helper.HttpConnection$Request.removeHeader(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection$Base.header(HttpConnection.java:438)
            org.jsoup.helper.HttpConnection$Request.header(HttpConnection.java:534)
            org.jsoup.helper.HttpConnection.referrer(HttpConnection.java:167) */
        httpConnection.referrer(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.maxBodySize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maxBodySize(int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#maxBodySize(int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#maxBodySize(int)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMaxBodySize_ConnectionMaxBodySize() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.maxBodySize(0));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maxBodySize(int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#maxBodySize(int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#maxBodySize(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.maxBodySize(bytes);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySize_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.maxBodySize(-1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maxBodySize(int)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#maxBodySize(int)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#maxBodySize(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.maxBodySize(bytes);
 *  */
    @Test
    public void testMaxBodySize_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.maxBodySize] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.maxBodySize(HttpConnection.java:156) */
        httpConnection.maxBodySize(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.sslSocketFactory
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sslSocketFactory(javax.net.ssl.SSLSocketFactory)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#sslSocketFactory(javax.net.ssl.SSLSocketFactory)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#sslSocketFactory(javax.net.ssl.SSLSocketFactory)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testSslSocketFactory_ConnectionSslSocketFactory() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        Object sslSocketFactory = createInstance("javax.net.ssl.DefaultSSLSocketFactory");
        setField(req, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory", sslSocketFactory);
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.sslSocketFactory(null));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        org.jsoup.Connection.Request httpConnectionReq1 = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        SSLSocketFactory finalHttpConnectionReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(httpConnectionReq1, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        
        assertNull(finalHttpConnectionReqSslSocketFactory);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sslSocketFactory(javax.net.ssl.SSLSocketFactory)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#sslSocketFactory(javax.net.ssl.SSLSocketFactory)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#sslSocketFactory(javax.net.ssl.SSLSocketFactory)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.sslSocketFactory(sslSocketFactory);
 *  */
    @Test
    public void testSslSocketFactory_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.sslSocketFactory] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.sslSocketFactory(HttpConnection.java:193) */
        httpConnection.sslSocketFactory(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.encodeUrl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeUrl(java.net.URL)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#encodeUrl(java.net.URL)}
 * @utbot.invokes {@link java.net.URL#toExternalForm()}
 * @utbot.returnsFrom {@code return u;}
 * @utbot.caughtException {@code Exception e}
 *  */
    @Test
    public void testEncodeUrl_CatchException() {
        URL actual = HttpConnection.encodeUrl(((URL) null));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method encodeUrl(java.net.URL)
    
    @Test
    public void testEncodeUrl1() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String protocol = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(url, "java.net.URL", "protocol", protocol);
        setField(url, "java.net.URL", "authority", protocol);
        Handler handler = ((Handler) createInstance("sun.net.www.protocol.file.Handler"));
        setField(url, "java.net.URL", "handler", handler);
        
        URL actual = HttpConnection.encodeUrl(url);
        
        // java.net.URL has overridden equals method
        assertEquals(url, actual);
    }
    
    @Test
    public void testEncodeUrl2() throws Exception  {
        URL url = ((URL) createInstance("java.net.URL"));
        String query = "";
        setField(url, "java.net.URL", "query", query);
        setField(url, "java.net.URL", "authority", query);
        sun.net.www.protocol.jar.Handler handler = ((sun.net.www.protocol.jar.Handler) createInstance("sun.net.www.protocol.jar.Handler"));
        setField(url, "java.net.URL", "handler", handler);
        
        URL actual = HttpConnection.encodeUrl(url);
        
        // java.net.URL has overridden equals method
        assertEquals(url, actual);
    }
    ///endregion
    
    ///region Errors report for encodeUrl
    
    public void testEncodeUrl_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 4 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.encodeUrl
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method encodeUrl(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#encodeUrl(java.lang.String)}
 *  */
    @Test
    public void testEncodeUrl() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class stringType = Class.forName("java.lang.String");
        java.lang.reflect.Method encodeUrlMethod = httpConnectionClazz.getDeclaredMethod("encodeUrl", stringType);
        encodeUrlMethod.setAccessible(true);
        java.lang.Object[] encodeUrlMethodArguments = new java.lang.Object[1];
        encodeUrlMethodArguments[0] = string;
        String actual = ((String) encodeUrlMethod.invoke(null, encodeUrlMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.cookies
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cookies(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookies(java.util.Map)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testCookies_SetIterator() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        HttpConnection actual = ((HttpConnection) httpConnection.cookies(linkedHashMap));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cookies(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#cookies(java.util.Map)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(cookies, "Cookie map must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCookies_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.cookies(null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method cookies(java.util.Map)
    
    @Test(expected = IllegalArgumentException.class)
    public void testCookies1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, null);
        
        httpConnection.cookies(linkedHashMap);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCookies2() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000";
        linkedHashMap.put(string, null);
        
        httpConnection.cookies(linkedHashMap);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method cookies(java.util.Map)
    
    @Test
    public void testCookies3() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        String string1 = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        linkedHashMap.put(string, string1);
        linkedHashMap.put(string1, string1);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.cookies] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.cookies(HttpConnection.java:272) */
        httpConnection.cookies(linkedHashMap);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.needsMultipart
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method needsMultipart(org.jsoup.Connection$Request)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#needsMultipart(org.jsoup.Connection.Request)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testNeedsMultipart_ReturnFalse() throws Exception  {
        HttpConnection.Request request = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        setField(request, "org.jsoup.helper.HttpConnection$Request", "data", data);
        
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class requestType = Class.forName("org.jsoup.Connection$Request");
        java.lang.reflect.Method needsMultipartMethod = httpConnectionClazz.getDeclaredMethod("needsMultipart", requestType);
        needsMultipartMethod.setAccessible(true);
        java.lang.Object[] needsMultipartMethodArguments = new java.lang.Object[1];
        needsMultipartMethodArguments[0] = request;
        boolean actual = ((Boolean) needsMultipartMethod.invoke(null, needsMultipartMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#needsMultipart(org.jsoup.Connection.Request)}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: req.data())} once
 *  */
    @Test
    public void testNeedsMultipart_KeyValHasInputStream() throws Exception  {
        HttpConnection.Request request = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        Object stream = createInstance("com.sun.org.apache.xerces.internal.impl.XMLEntityManager$RewindableInputStream");
        setField(keyVal, "org.jsoup.helper.HttpConnection$KeyVal", "stream", stream);
        data.add(keyVal);
        setField(request, "org.jsoup.helper.HttpConnection$Request", "data", data);
        
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class requestType = Class.forName("org.jsoup.Connection$Request");
        java.lang.reflect.Method needsMultipartMethod = httpConnectionClazz.getDeclaredMethod("needsMultipart", requestType);
        needsMultipartMethod.setAccessible(true);
        java.lang.Object[] needsMultipartMethodArguments = new java.lang.Object[1];
        needsMultipartMethodArguments[0] = request;
        boolean actual = ((Boolean) needsMultipartMethod.invoke(null, needsMultipartMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#needsMultipart(org.jsoup.Connection.Request)}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: req.data())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testNeedsMultipart_NotKeyValHasInputStream() throws Exception  {
        HttpConnection.Request request = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        ArrayList data = new ArrayList();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        data.add(keyVal);
        setField(request, "org.jsoup.helper.HttpConnection$Request", "data", data);
        
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class requestType = Class.forName("org.jsoup.Connection$Request");
        java.lang.reflect.Method needsMultipartMethod = httpConnectionClazz.getDeclaredMethod("needsMultipart", requestType);
        needsMultipartMethod.setAccessible(true);
        java.lang.Object[] needsMultipartMethodArguments = new java.lang.Object[1];
        needsMultipartMethodArguments[0] = request;
        boolean actual = ((Boolean) needsMultipartMethod.invoke(null, needsMultipartMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method needsMultipart(org.jsoup.Connection$Request)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#needsMultipart(org.jsoup.Connection.Request)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#data()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Connection.KeyVal keyVal: req.data())
 *  */
    @Test
    public void testNeedsMultipart_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.jsoup.helper.HttpConnection.needsMultipart] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.needsMultipart(HttpConnection.java:1127) */
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class requestType = Class.forName("org.jsoup.Connection$Request");
        java.lang.reflect.Method needsMultipartMethod = httpConnectionClazz.getDeclaredMethod("needsMultipart", requestType);
        needsMultipartMethod.setAccessible(true);
        java.lang.Object[] needsMultipartMethodArguments = new java.lang.Object[1];
        needsMultipartMethodArguments[0] = ((Object) null);
        try {
            needsMultipartMethod.invoke(null, needsMultipartMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#needsMultipart(org.jsoup.Connection.Request)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Connection.KeyVal keyVal: req.data())
 *  */
    @Test
    public void testNeedsMultipart_ThrowNullPointerException_1() throws Throwable  {
        HttpConnection.Request request = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.needsMultipart] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.needsMultipart(HttpConnection.java:1127) */
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class requestType = Class.forName("org.jsoup.Connection$Request");
        java.lang.reflect.Method needsMultipartMethod = httpConnectionClazz.getDeclaredMethod("needsMultipart", requestType);
        needsMultipartMethod.setAccessible(true);
        java.lang.Object[] needsMultipartMethodArguments = new java.lang.Object[1];
        needsMultipartMethodArguments[0] = request;
        try {
            needsMultipartMethod.invoke(null, needsMultipartMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#needsMultipart(org.jsoup.Connection.Request)}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 * @utbot.iterates iterate the loop {@code for(Connection.KeyVal keyVal: req.data())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testNeedsMultipart_ThrowNullPointerException_2() throws Throwable  {
        HttpConnection.Request request = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        HashSet data = new HashSet();
        org.jsoup.helper.HttpConnection.KeyVal keyVal = ((org.jsoup.helper.HttpConnection.KeyVal) createInstance("org.jsoup.helper.HttpConnection$KeyVal"));
        InflaterInputStream stream = ((InflaterInputStream) createInstance("java.util.zip.InflaterInputStream"));
        setField(keyVal, "org.jsoup.helper.HttpConnection$KeyVal", "stream", stream);
        data.add(keyVal);
        data.add(null);
        setField(request, "org.jsoup.helper.HttpConnection$Request", "data", data);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.needsMultipart] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.needsMultipart(HttpConnection.java:1128) */
        Class httpConnectionClazz = Class.forName("org.jsoup.helper.HttpConnection");
        Class requestType = Class.forName("org.jsoup.Connection$Request");
        java.lang.reflect.Method needsMultipartMethod = httpConnectionClazz.getDeclaredMethod("needsMultipart", requestType);
        needsMultipartMethod.setAccessible(true);
        java.lang.Object[] needsMultipartMethodArguments = new java.lang.Object[1];
        needsMultipartMethodArguments[0] = request;
        try {
            needsMultipartMethod.invoke(null, needsMultipartMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.postDataCharset
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method postDataCharset(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#postDataCharset(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#postDataCharset(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.postDataCharset(charset);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharset_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        httpConnection.postDataCharset(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method postDataCharset(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#postDataCharset(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#postDataCharset(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.postDataCharset(charset);
 *  */
    @Test
    public void testPostDataCharset_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.postDataCharset] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.postDataCharset(HttpConnection.java:318) */
        httpConnection.postDataCharset(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method postDataCharset(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.jsoup.helper.HttpConnection}
     * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#postDataCharset(java.lang.String)}
     */
    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharsetThrowsICNEWithNonEmptyString() {
        HttpConnection httpConnection = new HttpConnection();
        
        httpConnection.postDataCharset("ZX");
    }
    ///endregion
    
    ///region Errors report for postDataCharset
    
    public void testPostDataCharset_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.requestBody
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method requestBody(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#requestBody(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#requestBody(java.lang.String)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRequestBody_ConnectionRequestBody() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.requestBody(null));
        
        org.jsoup.Connection.Request httpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        Proxy actualReqProxy = ((Proxy) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "proxy"));
        assertNull(actualReqProxy);
        
        int httpConnectionReqTimeoutMilliseconds = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        int actualReqTimeoutMilliseconds = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "timeoutMilliseconds"));
        assertEquals(httpConnectionReqTimeoutMilliseconds, actualReqTimeoutMilliseconds);
        
        int httpConnectionReqMaxBodySizeBytes = ((Integer) getFieldValue(httpConnectionReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        int actualReqMaxBodySizeBytes = ((Integer) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "maxBodySizeBytes"));
        assertEquals(httpConnectionReqMaxBodySizeBytes, actualReqMaxBodySizeBytes);
        
        boolean actualReqFollowRedirects = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "followRedirects"));
        assertFalse(actualReqFollowRedirects);
        
        Collection actualReqData = ((Collection) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "data"));
        assertNull(actualReqData);
        
        String actualReqBody = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "body"));
        assertNull(actualReqBody);
        
        boolean actualReqIgnoreHttpErrors = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreHttpErrors"));
        assertFalse(actualReqIgnoreHttpErrors);
        
        boolean actualReqIgnoreContentType = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "ignoreContentType"));
        assertFalse(actualReqIgnoreContentType);
        
        Parser actualReqParser = ((Parser) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parser"));
        assertNull(actualReqParser);
        
        boolean actualReqParserDefined = ((Boolean) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "parserDefined"));
        assertFalse(actualReqParserDefined);
        
        String actualReqPostDataCharset = ((String) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "postDataCharset"));
        assertNull(actualReqPostDataCharset);
        
        SSLSocketFactory actualReqSslSocketFactory = ((SSLSocketFactory) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Request", "sslSocketFactory"));
        assertNull(actualReqSslSocketFactory);
        
        URL actualReqUrl = ((URL) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "url"));
        assertNull(actualReqUrl);
        
        Connection.Method actualReqMethod = ((Connection.Method) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "method"));
        assertNull(actualReqMethod);
        
        Map actualReqHeaders = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "headers"));
        assertNull(actualReqHeaders);
        
        Map actualReqCookies = ((Map) getFieldValue(actualReq, "org.jsoup.helper.HttpConnection$Base", "cookies"));
        assertNull(actualReqCookies);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method requestBody(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#requestBody(java.lang.String)}
 * @utbot.invokes {@link org.jsoup.Connection.Request#requestBody(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.requestBody(body);
 *  */
    @Test
    public void testRequestBody_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.requestBody] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.requestBody(HttpConnection.java:247) */
        httpConnection.requestBody(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.response
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method response(org.jsoup.Connection$Response)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#response(org.jsoup.Connection.Response)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testResponse_Return() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        org.jsoup.helper.HttpConnection.Response res = ((org.jsoup.helper.HttpConnection.Response) createInstance("org.jsoup.helper.HttpConnection$Response"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "res", res);
        
        HttpConnection actual = ((HttpConnection) httpConnection.response(null));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        Connection.Response finalHttpConnectionRes = ((Connection.Response) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "res"));
        
        assertNull(finalHttpConnectionRes);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.response
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method response()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#response()}
 * @utbot.returnsFrom {@code return res;}
 *  */
    @Test
    public void testResponse_ReturnRes() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        Connection.Response actual = httpConnection.response();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.request
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method request(org.jsoup.Connection$Request)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#request(org.jsoup.Connection.Request)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testRequest_Return() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        
        HttpConnection actual = ((HttpConnection) httpConnection.request(null));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
        org.jsoup.Connection.Request finalHttpConnectionReq = ((org.jsoup.Connection.Request) getFieldValue(httpConnection, "org.jsoup.helper.HttpConnection", "req"));
        
        assertNull(finalHttpConnectionReq);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.request
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method request()
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#request()}
 * @utbot.returnsFrom {@code return req;}
 *  */
    @Test
    public void testRequest_ReturnReq() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        org.jsoup.Connection.Request actual = httpConnection.request();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.jsoup.helper.HttpConnection.headers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method headers(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#headers(java.util.Map)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testHeaders_SetIterator() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        HttpConnection actual = ((HttpConnection) httpConnection.headers(linkedHashMap));
        
        org.jsoup.Connection.Request actualReq = ((org.jsoup.Connection.Request) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "req"));
        assertNull(actualReq);
        
        Connection.Response actualRes = ((Connection.Response) getFieldValue(actual, "org.jsoup.helper.HttpConnection", "res"));
        assertNull(actualRes);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method headers(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#headers(java.util.Map)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Validate.notNull(headers, "Header map must not be null");
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHeaders_ThrowIllegalArgumentException_1() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        
        httpConnection.headers(null);
    }
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#headers(java.util.Map)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Map.Entry<String, String> entry: headers.entrySet())} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: req.header(entry.getKey(), entry.getValue());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHeaders_ThrowIllegalArgumentException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        HttpConnection.Request req = ((HttpConnection.Request) createInstance("org.jsoup.helper.HttpConnection$Request"));
        setField(httpConnection, "org.jsoup.helper.HttpConnection", "req", req);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, null);
        
        httpConnection.headers(linkedHashMap);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method headers(java.util.Map)
    
    /**
    @utbot.classUnderTest {@link HttpConnection}
 * @utbot.methodUnderTest {@link org.jsoup.helper.HttpConnection#headers(java.util.Map)}
 * @utbot.invokes {@link org.jsoup.helper.Validate#notNull(java.lang.Object,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#entrySet()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.iterates iterate the loop {@code for(Map.Entry<String, String> entry: headers.entrySet())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: req.header(entry.getKey(), entry.getValue());
 *  */
    @Test
    public void testHeaders_ThrowNullPointerException() throws Exception  {
        HttpConnection httpConnection = ((HttpConnection) createInstance("org.jsoup.helper.HttpConnection"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = "";
        linkedHashMap.put(string, null);
        
        /* This test fails because method [org.jsoup.helper.HttpConnection.headers] produces [java.lang.NullPointerException]
            org.jsoup.helper.HttpConnection.headers(HttpConnection.java:259) */
        httpConnection.headers(linkedHashMap);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields1009353126470800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields1009353126470800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass1009353126475400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009353126470800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009353126475400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields1009353127353100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields1009353127353100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass1009353127354300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields1009353127353100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass1009353127354300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

