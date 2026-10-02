# HttpConnectionTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาสทดสอบถูกวางไว้ใน package `org.jsoup.helper` เดียวกับคลาสเป้าหมาย เพื่อให้สามารถเรียก constructor/เมธอดที่เป็น **package-private** (เช่น `new Request()`, `new Response()`, `HttpConnection.encodeUrl(URL)`) ได้โดยตรง โดยไม่ต้องใช้ reflection
- เมธอด/ตัวแปรที่เป็น **private** (เช่น `encodeMimeName`, `needsMultipart`, `Base.fixHeaderEncoding`, `Base.looksLikeUtf8`, `Response.setOutputContentType`, `Response.getRequestCookieString`, `Response.serialiseRequestUrl`) จะถูกเรียกผ่าน Java Reflection
- สมมติฐาน (ตามพฤติกรรมที่ทราบของ `org.jsoup.helper.Validate` ซึ่งไม่ได้แสดงใน source ที่ให้มา): `Validate.notNull/notEmpty/isTrue/isFalse` throw `IllegalArgumentException` เสมอ — คอมเมนต์กำกับไว้ในจุดที่ใช้สมมติฐานนี้
- เมธอด `execute()`/`get()`/`post()` ที่ต้องเชื่อมต่อเครือข่ายจริงไม่ได้ถูกทดสอบตรง ๆ (ไม่มี mocking library ใน classpath) แต่ logic ย่อยที่ไม่ต้องใช้ network (เช่น `setOutputContentType`, `serialiseRequestUrl`, `getRequestCookieString`, `needsMultipart`, `encodeUrl`) ถูกทดสอบแยก

```java
package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Method;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method.*;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpConnectionTest {

    // ----------------------------------------------------------------
    // Reflection helper for strictly-private static methods
    // ----------------------------------------------------------------
    private Object invokeStatic(Class<?> cls, String name, Class<?>[] types, Object... args) throws Throwable {
        Method m = cls.getDeclaredMethod(name, types);
        m.setAccessible(true);
        try {
            return m.invoke(null, args);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    // ==================================================================
    // connect(String) / connect(URL)
    // ==================================================================
    @Test
    public void testConnectStringCreatesConnection() {
        Connection con = HttpConnection.connect("http://example.com");
        assertNotNull(con);
        assertEquals("http://example.com", con.request().url().toExternalForm());
    }

    @Test
    public void testConnectURLCreatesConnection() throws MalformedURLException {
        URL url = new URL("http://example.com/");
        Connection con = HttpConnection.connect(url);
        assertNotNull(con);
        assertEquals(url, con.request().url());
    }

    // ==================================================================
    // url(String) / url(URL)
    // ==================================================================
    @Test
    public void testUrlString_Valid() {
        Connection con = new HttpConnection();
        con.url("http://example.com/path");
        assertEquals("http://example.com/path", con.request().url().toExternalForm());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlString_EmptyThrows() {
        new HttpConnection().url("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlString_NullThrows() {
        new HttpConnection().url((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlString_MalformedThrows() {
        // no protocol -> MalformedURLException -> wrapped IllegalArgumentException
        new HttpConnection().url("not a url at all");
    }

    @Test
    public void testUrlString_WithSpaceEncoded() {
        Connection con = new HttpConnection();
        con.url("http://example.com/path with space");
        String external = con.request().url().toExternalForm();
        assertTrue(external.contains("%20"));
        assertFalse(external.contains(" "));
    }

    @Test
    public void testUrlURL_Valid() throws MalformedURLException {
        Connection con = new HttpConnection();
        URL u = new URL("http://example.com/");
        con.url(u);
        assertEquals(u, con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlURL_NullThrows() {
        new HttpConnection().url((URL) null);
    }

    // ==================================================================
    // proxy
    // ==================================================================
    @Test
    public void testProxyProxyObject() {
        HttpConnection.Request req = new HttpConnection.Request();
        Proxy proxy = Proxy.NO_PROXY;
        req.proxy(proxy);
        assertEquals(proxy, req.proxy());
    }

    @Test
    public void testProxyHostPort() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.proxy("localhost", 8080);
        assertNotNull(req.proxy());
        assertEquals(Proxy.Type.HTTP, req.proxy().type());
    }

    // ==================================================================
    // userAgent
    // ==================================================================
    @Test
    public void testUserAgent_Valid() {
        Connection con = new HttpConnection();
        con.userAgent("myagent");
        assertEquals("myagent", con.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgent_NullThrows() {
        new HttpConnection().userAgent(null);
    }

    // ==================================================================
    // timeout
    // ==================================================================
    @Test
    public void testTimeout_Valid() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.timeout(5000);
        assertEquals(5000, req.timeout());
    }

    @Test
    public void testTimeout_ZeroOk() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.timeout(0); // boundary: 0 allowed
        assertEquals(0, req.timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeout_NegativeThrows() {
        new HttpConnection.Request().timeout(-1);
    }

    // ==================================================================
    // maxBodySize
    // ==================================================================
    @Test
    public void testMaxBodySize_Valid() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.maxBodySize(2048);
        assertEquals(2048, req.maxBodySize());
    }

    @Test
    public void testMaxBodySize_ZeroOk() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.maxBodySize(0); // boundary: 0 = unlimited
        assertEquals(0, req.maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySize_NegativeThrows() {
        new HttpConnection.Request().maxBodySize(-5);
    }

    // ==================================================================
    // followRedirects
    // ==================================================================
    @Test
    public void testFollowRedirects() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertTrue(req.followRedirects()); // default
        req.followRedirects(false);
        assertFalse(req.followRedirects());
    }

    // ==================================================================
    // referrer
    // ==================================================================
    @Test
    public void testReferrer_Valid() {
        Connection con = new HttpConnection();
        con.referrer("http://ref.example.com");
        assertEquals("http://ref.example.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrer_NullThrows() {
        new HttpConnection().referrer(null);
    }

    // ==================================================================
    // method
    // ==================================================================
    @Test
    public void testMethod_Valid() {
        Connection con = new HttpConnection();
        con.method(Method.POST);
        assertEquals(Method.POST, con.request().method());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethod_NullThrows() {
        new HttpConnection().method(null);
    }

    // ==================================================================
    // ignoreHttpErrors / ignoreContentType
    // ==================================================================
    @Test
    public void testIgnoreHttpErrors() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertFalse(req.ignoreHttpErrors());
        req.ignoreHttpErrors(true);
        assertTrue(req.ignoreHttpErrors());
    }

    @Test
    public void testIgnoreContentType() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertFalse(req.ignoreContentType());
        req.ignoreContentType(true);
        assertTrue(req.ignoreContentType());
    }

    // ==================================================================
    // data(...)
    // ==================================================================
    @Test
    public void testDataKeyValue() {
        Connection con = new HttpConnection();
        con.data("k1", "v1");
        assertEquals(1, con.request().data().size());
        assertEquals("v1", con.data("k1").value());
    }

    @Test
    public void testDataKeyFilenameStream() {
        Connection con = new HttpConnection();
        InputStream is = new ByteArrayInputStream("hello".getBytes());
        con.data("file", "test.txt", is);
        KeyVal kv = con.data("file");
        assertNotNull(kv);
        assertTrue(kv.hasInputStream());
        assertEquals("test.txt", kv.value());
    }

    @Test
    public void testDataKeyFilenameStreamContentType() {
        Connection con = new HttpConnection();
        InputStream is = new ByteArrayInputStream("hello".getBytes());
        con.data("file", "test.txt", is, "text/plain");
        KeyVal kv = con.data("file");
        assertEquals("text/plain", kv.contentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataMap_NullThrows() {
        new HttpConnection().data((Map<String, String>) null);
    }

    @Test
    public void testDataMap_Empty() {
        Connection con = new HttpConnection();
        con.data(new LinkedHashMap<String, String>()); // loop executes 0 times
        assertEquals(0, con.request().data().size());
    }

    @Test
    public void testDataMap_Multiple() {
        Connection con = new HttpConnection();
        Map<String, String> m = new LinkedHashMap<>();
        m.put("a", "1");
        m.put("b", "2");
        con.data(m); // loop executes 2 times
        assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_NullThrows() {
        new HttpConnection().data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_OddLengthThrows() {
        new HttpConnection().data("k1", "v1", "k2"); // odd length
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_EmptyKeyThrows() {
        new HttpConnection().data("", "v1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargs_NullValueThrows() {
        new HttpConnection().data("k1", (String) null);
    }

    @Test
    public void testDataVarargs_Valid() {
        Connection con = new HttpConnection();
        con.data("k1", "v1", "k2", "v2"); // loop runs twice (i=0,2)
        assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCollection_NullThrows() {
        new HttpConnection().data((java.util.Collection<Connection.KeyVal>) null);
    }

    @Test
    public void testDataCollection_Empty() {
        Connection con = new HttpConnection();
        con.data(new ArrayList<Connection.KeyVal>());
        assertEquals(0, con.request().data().size());
    }

    @Test
    public void testDataCollection_Valid() {
        Connection con = new HttpConnection();
        List<Connection.KeyVal> list = new ArrayList<>();
        list.add(HttpConnection.KeyVal.create("k1", "v1"));
        list.add(HttpConnection.KeyVal.create("k2", "v2"));
        con.data(list);
        assertEquals(2, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataLookup_EmptyKeyThrows() {
        new HttpConnection().data("");
    }

    @Test
    public void testDataLookup_Found() {
        Connection con = new HttpConnection();
        con.data("k1", "v1");
        assertNotNull(con.data("k1"));
    }

    @Test
    public void testDataLookup_NotFound() {
        Connection con = new HttpConnection();
        con.data("k1", "v1");
        assertNull(con.data("nonexistent"));
    }

    // ==================================================================
    // requestBody
    // ==================================================================
    @Test
    public void testRequestBody() {
        Connection con = new HttpConnection();
        con.requestBody("hello=world");
        assertEquals("hello=world", con.request().requestBody());
    }

    // ==================================================================
    // header / headers
    // ==================================================================
    @Test
    public void testHeaderNameValue() {
        Connection con = new HttpConnection();
        con.header("X-Test", "abc");
        assertEquals("abc", con.request().header("X-Test"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeadersMap_NullThrows() {
        new HttpConnection().headers(null);
    }

    @Test
    public void testHeadersMap_Valid() {
        Connection con = new HttpConnection();
        Map<String, String> h = new LinkedHashMap<>();
        h.put("X-One", "1");
        h.put("X-Two", "2");
        con.headers(h);
        assertEquals("1", con.request().header("X-One"));
        assertEquals("2", con.request().header("X-Two"));
    }

    // ==================================================================
    // cookie / cookies
    // ==================================================================
    @Test
    public void testCookieNameValue() {
        Connection con = new HttpConnection();
        con.cookie("name", "value");
        assertEquals("value", con.request().cookie("name"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookiesMap_NullThrows() {
        new HttpConnection().cookies(null);
    }

    @Test
    public void testCookiesMap_Valid() {
        Connection con = new HttpConnection();
        Map<String, String> c = new LinkedHashMap<>();
        c.put("a", "1");
        c.put("b", "2");
        con.cookies(c);
        assertEquals("1", con.request().cookie("a"));
        assertEquals("2", con.request().cookie("b"));
    }

    // ==================================================================
    // parser
    // ==================================================================
    @Test
    public void testParser() {
        Connection con = new HttpConnection();
        Parser xml = Parser.xmlParser();
        con.parser(xml);
        assertEquals(xml, con.request().parser());
    }

    // ==================================================================
    // request()/response() getters & setters
    // ==================================================================
    @Test
    public void testRequestGetterSetter() {
        Connection con = new HttpConnection();
        Connection.Request newReq = new HttpConnection.Request();
        con.request(newReq);
        assertSame(newReq, con.request());
    }

    @Test
    public void testResponseGetterSetter() {
        Connection con = new HttpConnection();
        Connection.Response newRes = new HttpConnection.Response();
        con.response(newRes);
        assertSame(newRes, con.response());
    }

    // ==================================================================
    // postDataCharset
    // ==================================================================
    @Test
    public void testPostDataCharset_Valid() {
        Connection con = new HttpConnection();
        con.postDataCharset("UTF-8");
        assertEquals("UTF-8", con.request().postDataCharset());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharset_NullThrows() {
        new HttpConnection().postDataCharset(null);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharset_UnsupportedThrows() {
        // well-formed name but not a real charset -> isSupported()==false -> explicit throw branch
        new HttpConnection().postDataCharset("NOT-A-REAL-CHARSET-9999");
    }

    // ==================================================================
    // KeyVal
    // ==================================================================
    @Test
    public void testKeyValCreate_Valid() {
        KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValCreate_NullKeyThrows() {
        HttpConnection.KeyVal.create(null, "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValCreate_EmptyKeyThrows() {
        HttpConnection.KeyVal.create("", "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValCreate_NullValueThrows() {
        HttpConnection.KeyVal.create("k", null);
    }

    @Test
    public void testKeyValCreateWithStream() {
        InputStream is = new ByteArrayInputStream("data".getBytes());
        KeyVal kv = HttpConnection.KeyVal.create("file", "name.txt", is);
        assertTrue(kv.hasInputStream());
        assertSame(is, kv.inputStream());
    }

    @Test
    public void testKeyValInputStreamNullQuirk() {
        // NOTE: inputStream(InputStream) validates the *value* field (filename), not the
        // stream parameter passed in (see source: Validate.notNull(value, ...)).
        // This is the observed behavior of the given source - documented, not guessed.
        KeyVal kv = HttpConnection.KeyVal.create("key", "value"); // value != null
        kv.inputStream(null); // should NOT throw because 'value' (filename) is non-null
        assertFalse(kv.hasInputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValContentType_EmptyThrows() {
        HttpConnection.KeyVal.create("k", "v").contentType("");
    }

    @Test
    public void testKeyValContentType_Valid() {
        KeyVal kv = HttpConnection.KeyVal.create("k", "v").contentType("text/plain");
        assertEquals("text/plain", kv.contentType());
    }

    @Test
    public void testKeyValToString() {
        KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key=value", kv.toString());
    }

    // ==================================================================
    // Base: header(String) get, addHeader, headers, hasHeader, removeHeader
    // ==================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testBaseHeaderGet_NullNameThrows() {
        new HttpConnection.Request().header(null);
    }

    @Test
    public void testBaseHeaderGet_NotFoundReturnsNull() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertNull(req.header("X-Not-Set"));
    }

    @Test
    public void testBaseHeaderGet_MultipleValuesJoined() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Multi", "v1");
        req.addHeader("X-Multi", "v2");
        assertEquals("v1, v2", req.header("X-Multi"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseAddHeader_EmptyNameThrows() {
        new HttpConnection.Request().addHeader("", "v");
    }

    @Test
    public void testBaseAddHeader_NullValueBecomesEmpty() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Null", null);
        assertEquals("", req.header("X-Null"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseHeaders_EmptyNameThrows() {
        new HttpConnection.Request().headers("");
    }

    @Test
    public void testBaseHasHeader() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertFalse(req.hasHeader("X-None"));
        req.header("X-None", "v");
        assertTrue(req.hasHeader("X-None"));
    }

    @Test
    public void testBaseHasHeaderWithValue() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Test", "GZIP");
        assertTrue(req.hasHeaderWithValue("X-Test", "gzip")); // case-insensitive match
        assertFalse(req.hasHeaderWithValue("X-Test", "other"));
    }

    @Test
    public void testBaseRemoveHeader() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header("X-Remove", "v");
        assertTrue(req.hasHeader("X-Remove"));
        req.removeHeader("x-remove"); // case-insensitive removal
        assertFalse(req.hasHeader("X-Remove"));
    }

    @Test
    public void testBaseHeadersMapReturnsFirstValues() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Multi", "first");
        req.addHeader("X-Multi", "second");
        Map<String, String> map = req.headers();
        assertEquals("first", map.get("X-Multi"));
    }

    @Test
    public void testBaseMultiHeaders() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.addHeader("X-Multi", "v1");
        req.addHeader("X-Multi", "v2");
        List<String> values = req.multiHeaders().get("X-Multi");
        assertEquals(2, values.size());
    }

    // ==================================================================
    // Base: cookie / hasCookie / removeCookie / cookies
    // ==================================================================
    @Test(expected = IllegalArgumentException.class)
    public void testBaseCookieGet_EmptyNameThrows() {
        new HttpConnection.Request().cookie("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseCookieSet_EmptyNameThrows() {
        new HttpConnection.Request().cookie("", "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBaseCookieSet_NullValueThrows() {
        new HttpConnection.Request().cookie("name", null);
    }

    @Test
    public void testBaseHasCookie() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertFalse(req.hasCookie("c1"));
        req.cookie("c1", "v1");
        assertTrue(req.hasCookie("c1"));
    }

    @Test
    public void testBaseRemoveCookie() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("c1", "v1");
        req.removeCookie("c1");
        assertFalse(req.hasCookie("c1"));
    }

    @Test
    public void testBaseCookiesMap() {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("c1", "v1");
        assertEquals(1, req.cookies().size());
    }

    // ==================================================================
    // Request defaults (constructor branch coverage)
    // ==================================================================
    @Test
    public void testRequestDefaults() {
        HttpConnection.Request req = new HttpConnection.Request();
        assertEquals(30000, req.timeout());
        assertEquals(1024 * 1024, req.maxBodySize());
        assertTrue(req.followRedirects());
        assertEquals(Method.GET, req.method());
        assertEquals("gzip", req.header("Accept-Encoding"));
        assertEquals(HttpConnection.DEFAULT_UA, req.header("User-Agent"));
        assertNotNull(req.parser());
    }

    // ==================================================================
    // needsMultipart (private static in HttpConnection) via reflection
    // ==================================================================
    @Test
    public void testNeedsMultipart_True() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.data(HttpConnection.KeyVal.create("file", "a.txt", new ByteArrayInputStream("x".getBytes())));
        Object result = invokeStatic(HttpConnection.class, "needsMultipart",
                new Class<?>[]{Connection.Request.class}, req);
        assertTrue((Boolean) result);
    }

    @Test
    public void testNeedsMultipart_False() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.data(HttpConnection.KeyVal.create("k", "v"));
        Object result = invokeStatic(HttpConnection.class, "needsMultipart",
                new Class<?>[]{Connection.Request.class}, req);
        assertFalse((Boolean) result);
    }

    @Test
    public void testNeedsMultipart_EmptyDataFalse() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        Object result = invokeStatic(HttpConnection.class, "needsMultipart",
                new Class<?>[]{Connection.Request.class}, req);
        assertFalse((Boolean) result); // loop never finds a stream -> false (loop 0 branch)
    }

    // ==================================================================
    // encodeUrl(URL) - package-private, direct call (same package)
    // ==================================================================
    @Test
    public void testEncodeUrlURL_EncodesSpaces() throws MalformedURLException {
        URL u = new URL("http://example.com/a b");
        URL encoded = HttpConnection.encodeUrl(u);
        assertFalse(encoded.toExternalForm().contains(" "));
        assertTrue(encoded.toExternalForm().contains("%20"));
    }

    @Test
    public void testEncodeUrlURL_NoSpaceUnchanged() throws MalformedURLException {
        URL u = new URL("http://example.com/path");
        URL encoded = HttpConnection.encodeUrl(u);
        assertEquals("http://example.com/path", encoded.toExternalForm());
    }

    // ==================================================================
    // encodeMimeName (private static in HttpConnection) via reflection
    // ==================================================================
    @Test
    public void testEncodeMimeName_Null() throws Throwable {
        Object result = invokeStatic(HttpConnection.class, "encodeMimeName",
                new Class<?>[]{String.class}, (Object) null);
        assertNull(result);
    }

    @Test
    public void testEncodeMimeName_ReplacesQuotes() throws Throwable {
        Object result = invokeStatic(HttpConnection.class, "encodeMimeName",
                new Class<?>[]{String.class}, "file\"name\".txt");
        assertEquals("file%22name%22.txt", result);
    }

    // ==================================================================
    // Base.fixHeaderEncoding / Base.looksLikeUtf8 via reflection
    // ==================================================================
    @Test
    public void testFixHeaderEncoding_AsciiUnchanged() throws Throwable {
        Class<?> baseClass = Class.forName("org.jsoup.helper.HttpConnection$Base");
        Object result = invokeStatic(baseClass, "fixHeaderEncoding",
                new Class<?>[]{String.class}, "plain ascii text");
        assertEquals("plain ascii text", result);
    }

    @Test
    public void testFixHeaderEncoding_Utf8Misdecoded() throws Throwable {
        // Simulate a header mis-decoded as ISO-8859-1 while actually UTF-8 bytes
        byte[] utf8Bytes = "café".getBytes("UTF-8");
        String misdecoded = new String(utf8Bytes, "ISO-8859-1");

        Class<?> baseClass = Class.forName("org.jsoup.helper.HttpConnection$Base");
        Object result = invokeStatic(baseClass, "fixHeaderEncoding",
                new Class<?>[]{String.class}, misdecoded);
        assertEquals("café", result);
    }

    @Test
    public void testLooksLikeUtf8_PureAsciiTrue() throws Throwable {
        Class<?> baseClass = Class.forName("org.jsoup.helper.HttpConnection$Base");
        byte[] ascii = "hello".getBytes("ISO-8859-1");
        Object result = invokeStatic(baseClass, "looksLikeUtf8",
                new Class<?>[]{byte[].class}, ascii);
        assertTrue((Boolean) result);
    }

    @Test
    public void testLooksLikeUtf8_BOMBranch() throws Throwable {
        Class<?> baseClass = Class.forName("org.jsoup.helper.HttpConnection$Base");
        byte[] withBom = new byte[]{(byte) 0xEF, (byte) 0xBB, (byte) 0xBF, 'a'};
        Object result = invokeStatic(baseClass, "looksLikeUtf8",
                new Class<?>[]{byte[].class}, withBom);
        assertTrue((Boolean) result);
    }

    @Test
    public void testLooksLikeUtf8_InvalidLeadingByteFalse() throws Throwable {
        Class<?> baseClass = Class.forName("org.jsoup.helper.HttpConnection$Base");
        byte[] invalid = new byte[]{(byte) 0xFF};
        Object result = invokeStatic(baseClass, "looksLikeUtf8",
                new Class<?>[]{byte[].class}, invalid);
        assertFalse((Boolean) result);
    }

    @Test
    public void testLooksLikeUtf8_TruncatedMultibyte_BoundaryFault() throws Throwable {
        // Potential fault/boundary issue: a leading byte indicating a multi-byte
        // sequence (0xC0) with NO continuation byte following may cause an
        // ArrayIndexOutOfBoundsException inside looksLikeUtf8's while loop
        // (it does not check bounds before reading input[i]).
        Class<?> baseClass = Class.forName("org.jsoup.helper.HttpConnection$Base");
        byte[] truncated = new byte[]{(byte) 0xC0}; // 2-byte lead, no continuation
        try {
            invokeStatic(baseClass, "looksLikeUtf8",
                    new Class<?>[]{byte[].class}, truncated);
            fail("Expected ArrayIndexOutOfBoundsException due to missing bounds check");
        } catch (ArrayIndexOutOfBoundsException expected) {
            // documented observed behavior (possible defect), not guessed
        }
    }

    // ==================================================================
    // Response.setOutputContentType (private static) via reflection
    // ==================================================================
    @Test
    public void testSetOutputContentType_AlreadyHasMultipartNoBoundary() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header(HttpConnection.CONTENT_TYPE, HttpConnection.MULTIPART_FORM_DATA);
        Object bound = invokeStatic(HttpConnection.Response.class, "setOutputContentType",
                new Class<?>[]{Connection.Request.class}, req);
        assertNotNull(bound);
        assertTrue(req.header(HttpConnection.CONTENT_TYPE).contains("boundary"));
    }

    @Test
    public void testSetOutputContentType_AlreadyHasContentTypeWithBoundary() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.header(HttpConnection.CONTENT_TYPE, HttpConnection.MULTIPART_FORM_DATA + "; boundary=xyz");
        Object bound = invokeStatic(HttpConnection.Response.class, "setOutputContentType",
                new Class<?>[]{Connection.Request.class}, req);
        assertNull(bound); // no-op branch, boundary already present
    }

    @Test
    public void testSetOutputContentType_NeedsMultipartBranch() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.data(HttpConnection.KeyVal.create("file", "a.txt", new ByteArrayInputStream("x".getBytes())));
        Object bound = invokeStatic(HttpConnection.Response.class, "setOutputContentType",
                new Class<?>[]{Connection.Request.class}, req);
        assertNotNull(bound);
        assertTrue(req.header(HttpConnection.CONTENT_TYPE).contains(HttpConnection.MULTIPART_FORM_DATA));
    }

    @Test
    public void testSetOutputContentType_RegularFormBranch() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.data(HttpConnection.KeyVal.create("k", "v")); // no stream
        Object bound = invokeStatic(HttpConnection.Response.class, "setOutputContentType",
                new Class<?>[]{Connection.Request.class}, req);
        assertNull(bound);
        assertTrue(req.header(HttpConnection.CONTENT_TYPE).contains(HttpConnection.FORM_URL_ENCODED));
    }

    // ==================================================================
    // Response.getRequestCookieString (private static) via reflection
    // ==================================================================
    @Test
    public void testGetRequestCookieString_Multiple() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.cookie("a", "1");
        req.cookie("b", "2");
        Object result = invokeStatic(HttpConnection.Response.class, "getRequestCookieString",
                new Class<?>[]{Connection.Request.class}, req);
        assertEquals("a=1; b=2", result);
    }

    @Test
    public void testGetRequestCookieString_Empty() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        Object result = invokeStatic(HttpConnection.Response.class, "getRequestCookieString",
                new Class<?>[]{Connection.Request.class}, req);
        assertEquals("", result);
    }

    // ==================================================================
    // Response.serialiseRequestUrl (private static) via reflection
    // ==================================================================
    @Test
    public void testSerialiseRequestUrl_NoExistingQuery() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.url(new URL("http://example.com/path"));
        req.data(HttpConnection.KeyVal.create("k1", "v1"));

        invokeStatic(HttpConnection.Response.class, "serialiseRequestUrl",
                new Class<?>[]{Connection.Request.class}, req);

        assertTrue(req.url().toExternalForm().contains("k1=v1"));
        assertEquals(0, req.data().size()); // data cleared after moving into URL
    }

    @Test
    public void testSerialiseRequestUrl_WithExistingQuery() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.url(new URL("http://example.com/path?existing=1"));
        req.data(HttpConnection.KeyVal.create("k1", "v1"));

        invokeStatic(HttpConnection.Response.class, "serialiseRequestUrl",
                new Class<?>[]{Connection.Request.class}, req);

        String external = req.url().toExternalForm();
        assertTrue(external.contains("existing=1"));
        assertTrue(external.contains("&k1=v1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSerialiseRequestUrl_InputStreamNotSupported() throws Throwable {
        HttpConnection.Request req = new HttpConnection.Request();
        req.url(new URL("http://example.com/path"));
        req.data(HttpConnection.KeyVal.create("file", "a.txt", new ByteArrayInputStream("x".getBytes())));
        try {
            invokeStatic(HttpConnection.Response.class, "serialiseRequestUrl",
                    new Class<?>[]{Connection.Request.class}, req);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
```

---

## ตารางสรุปความครอบคลุม (Test Method → Branch/Condition)

| กลุ่ม | Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| connect | `testConnectStringCreatesConnection`, `testConnectURLCreatesConnection` | static factory `connect(String)`/`connect(URL)` |
| url(String) | `testUrlString_Valid/EmptyThrows/NullThrows/MalformedThrows/WithSpaceEncoded` | `Validate.notEmpty` true/false, try-success, catch→`IllegalArgumentException`, `encodeUrl` encoding space |
| url(URL) | `testUrlURL_Valid/NullThrows` | `Validate.notNull` ใน `Base.url(URL)` |
| proxy | `testProxyProxyObject/HostPort` | `proxy(Proxy)` / `proxy(host,port)` |
| userAgent | `testUserAgent_Valid/NullThrows` | `Validate.notNull` branch |
| timeout | `testTimeout_Valid/ZeroOk/NegativeThrows` | boundary `millis>=0` true/false |
| maxBodySize | `testMaxBodySize_Valid/ZeroOk/NegativeThrows` | boundary `bytes>=0` true/false |
| followRedirects | `testFollowRedirects` | default true, setter false |
| referrer | `testReferrer_Valid/NullThrows` | null check |
| method | `testMethod_Valid/NullThrows` | `Base.method(Method)` null check |
| ignore flags | `testIgnoreHttpErrors/IgnoreContentType` | getter/setter true/false |
| data(key,value) | `testDataKeyValue` | basic add |
| data(stream) | `testDataKeyFilenameStream/ContentType` | `hasInputStream`, `contentType()` |
| data(Map) | `testDataMap_NullThrows/Empty/Multiple` | null check, loop 0/2 รอบ |
| data(varargs) | `testDataVarargs_NullThrows/OddLengthThrows/EmptyKeyThrows/NullValueThrows/Valid` | null check, `%2==0` true/false, `notEmpty(key)`, `notNull(value)`, loop iterate |
| data(Collection) | `testDataCollection_NullThrows/Empty/Valid` | null check, loop 0/2 รอบ |
| data(key) lookup | `testDataLookup_EmptyKeyThrows/Found/NotFound` | `notEmpty`, found-in-loop true/false |
| requestBody | `testRequestBody` | getter/setter |
| header/headers | `testHeaderNameValue/HeadersMap_NullThrows/Valid` | null check, loop multiple entries |
| cookie/cookies | `testCookieNameValue/CookiesMap_NullThrows/Valid` | null check, loop multiple entries |
| parser | `testParser` | setter/getter |
| request/response | `testRequestGetterSetter/ResponseGetterSetter` | getter/setter object identity |
| postDataCharset | `testPostDataCharset_Valid/NullThrows/UnsupportedThrows` | null check, `Charset.isSupported` true/false branch |
| KeyVal | `testKeyValCreate_*`, `testKeyValContentType_*`, `testKeyValToString`, `testKeyValInputStreamNullQuirk` | `notEmpty(key)`, `notNull(value)`, `notEmpty(contentType)`, สังเกต quirk ของ `inputStream()` ตรวจ `value` ไม่ใช่ stream |
| Base.header get | `testBaseHeaderGet_NullNameThrows/NotFoundReturnsNull/MultipleValuesJoined` | `vals.size()>0` true/false, join หลายค่า |
| Base.addHeader | `testBaseAddHeader_EmptyNameThrows/NullValueBecomesEmpty` | `notEmpty(name)`, `value==null` branch |
| Base.headers(name) | `testBaseHeaders_EmptyNameThrows` | `notEmpty(name)` |
| Base.hasHeader/HasHeaderWithValue | `testBaseHasHeader/HasHeaderWithValue` | size!=0 true/false, loop match/no-match |
| Base.removeHeader | `testBaseRemoveHeader` | `scanHeaders` found→remove branch |
| Base.headers()/multiHeaders() | `testBaseHeadersMapReturnsFirstValues/MultiHeaders` | `values.size()>0` loop, first-value selection |
| Base.cookie | `testBaseCookieGet/Set_EmptyNameThrows`, `SetNullValueThrows`, `HasCookie`, `RemoveCookie`, `CookiesMap` | null/empty checks, map operations |
| Request defaults | `testRequestDefaults` | constructor initial state ทุกฟิลด์ |
| needsMultipart | `testNeedsMultipart_True/False/EmptyDataFalse` | loop พบ stream (return true ทันที) / ไม่พบ (return false) / loop ว่าง |
| encodeUrl(URL) | `testEncodeUrlURL_EncodesSpaces/NoSpaceUnchanged` | encode สำเร็จ (มี/ไม่มี space) |
| encodeMimeName | `testEncodeMimeName_Null/ReplacesQuotes` | `val==null` true/false |
| Base.fixHeaderEncoding/looksLikeUtf8 | `testFixHeaderEncoding_*`, `testLooksLikeUtf8_*` | ascii-only, UTF-8 misdecoded, BOM branch, invalid leading byte, **boundary fault** (truncated multibyte → AIOOBE) |
| Response.setOutputContentType | `testSetOutputContentType_*` (4 methods) | `hasHeader(CONTENT_TYPE)` true (มี/ไม่มี boundary), `needsMultipart` true, else (form-urlencoded) |
| Response.getRequestCookieString | `testGetRequestCookieString_Multiple/Empty` | loop multiple/0 cookies, `first` flag toggling |
| Response.serialiseRequestUrl | `testSerialiseRequestUrl_NoExistingQuery/WithExistingQuery/InputStreamNotSupported` | `getQuery()!=null` true/false, `Validate.isFalse(hasInputStream)` throw branch |

หมายเหตุ: บางสาขาที่ต้องพึ่งพา network I/O จริง (เช่น `execute()`, `createConnection`, `writePost` กับ `conn.getOutputStream()`, redirect-loop ใน `Response.execute`) ไม่สามารถทดสอบได้โดยไม่มี mocking library สำหรับ `HttpURLConnection` ใน classpath ที่กำหนด จึงไม่ได้ครอบคลุมในชุดทดสอบนี้ เพื่อไม่ "เดา" behavior ของ network stack