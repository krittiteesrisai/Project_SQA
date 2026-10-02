package org.jsoup.helper;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

/**
 * JUnit 4 test suite for {@link HttpConnection} (Defects4J Jsoup-48b).
 *
 * หมายเหตุทั่วไป:
 * - คลาสนี้อยู่ใน package เดียวกับ org.jsoup.helper.HttpConnection เพื่อให้สามารถเข้าถึง
 *   package-private constructor/method (เช่น Response(), processResponseHeaders()) ได้
 * - ไม่มี mocking framework ใน classpath ที่กำหนด ดังนั้นจุดที่ต้องพึ่งการเชื่อมต่อเครือข่ายจริง
 *   (เช่น conn.connect(), getResponseCode(), redirect, อ่าน body จริง) จะไม่ถูกทดสอบ
 *   เพื่อหลีกเลี่ยงการพึ่งพาเครือข่ายภายนอกที่ไม่แน่นอน
 * - การใช้ reflection เพื่อเรียก private/private static method เป็นไปเพื่อเพิ่ม branch coverage
 *   ของ logic ที่ไม่ได้ทำ network I/O จริง (เช่น URL.openConnection() ที่ไม่ connect จริงจนกว่า
 *   จะเรียก connect()/getInputStream())
 */
public class HttpConnectionTest {

    // ---------- Reflection helper ----------
    private static Object invokePrivateStatic(Class<?> clazz, String name,
                                                Class<?>[] paramTypes, Object[] args) throws Throwable {
        java.lang.reflect.Method m = clazz.getDeclaredMethod(name, paramTypes);
        m.setAccessible(true);
        try {
            return m.invoke(null, args);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    // =========================================================
    // 1) encodeUrl / encodeMimeName (private static ใน HttpConnection)
    // =========================================================

    @Test
    public void testEncodeUrlNull() throws Throwable {
        assertNull(invokePrivateStatic(HttpConnection.class, "encodeUrl",
                new Class[]{String.class}, new Object[]{null}));
    }

    @Test
    public void testEncodeUrlReplacesSpaces() throws Throwable {
        Object r = invokePrivateStatic(HttpConnection.class, "encodeUrl",
                new Class[]{String.class}, new Object[]{"http://example.com/a b c"});
        assertEquals("http://example.com/a%20b%20c", r);
    }

    @Test
    public void testEncodeUrlNoSpacesUnchanged() throws Throwable {
        Object r = invokePrivateStatic(HttpConnection.class, "encodeUrl",
                new Class[]{String.class}, new Object[]{"http://example.com/abc"});
        assertEquals("http://example.com/abc", r);
    }

    @Test
    public void testEncodeMimeNameNull() throws Throwable {
        assertNull(invokePrivateStatic(HttpConnection.class, "encodeMimeName",
                new Class[]{String.class}, new Object[]{null}));
    }

    @Test
    public void testEncodeMimeNameReplacesQuotes() throws Throwable {
        Object r = invokePrivateStatic(HttpConnection.class, "encodeMimeName",
                new Class[]{String.class}, new Object[]{"a\"b\"c"});
        assertEquals("a%22b%22c", r);
    }

    @Test
    public void testEncodeMimeNameNoQuotesUnchanged() throws Throwable {
        Object r = invokePrivateStatic(HttpConnection.class, "encodeMimeName",
                new Class[]{String.class}, new Object[]{"abc"});
        assertEquals("abc", r);
    }

    // =========================================================
    // 2) HttpConnection.connect / url(String) / url(URL)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testConnectNullUrlThrows() {
        HttpConnection.connect((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectEmptyUrlThrows() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectMalformedUrlThrows() {
        HttpConnection.connect("not a valid url");
    }

    @Test
    public void testConnectEncodesSpacesInUrl() {
        Connection con = HttpConnection.connect("http://example.com/a b");
        assertTrue(con.request().url().toString().contains("%20"));
    }

    @Test
    public void testConnectWithUrlOverload() throws Exception {
        URL u = new URL("http://example.com/");
        Connection con = HttpConnection.connect(u);
        assertEquals(u, con.request().url());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlUrlOverloadNullThrows() {
        HttpConnection.connect("http://example.com").url((URL) null);
    }

    // =========================================================
    // 3) userAgent / timeout / maxBodySize / followRedirects / referrer / method
    //    / ignoreHttpErrors / ignoreContentType / validateTLSCertificates
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgentNullThrows() {
        HttpConnection.connect("http://example.com").userAgent(null);
    }

    @Test
    public void testUserAgentSetsHeader() {
        Connection con = HttpConnection.connect("http://example.com").userAgent("MyAgent");
        assertEquals("MyAgent", con.request().header("User-Agent"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeoutNegativeThrows() {
        HttpConnection.connect("http://example.com").timeout(-1);
    }

    @Test
    public void testTimeoutBoundaryZeroAllowed() {
        Connection con = HttpConnection.connect("http://example.com").timeout(0);
        assertEquals(0, con.request().timeout());
    }

    @Test
    public void testTimeoutPositive() {
        Connection con = HttpConnection.connect("http://example.com").timeout(5000);
        assertEquals(5000, con.request().timeout());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxBodySizeNegativeThrows() {
        HttpConnection.connect("http://example.com").maxBodySize(-1);
    }

    @Test
    public void testMaxBodySizeBoundaryZeroAllowed() {
        Connection con = HttpConnection.connect("http://example.com").maxBodySize(0);
        assertEquals(0, con.request().maxBodySize());
    }

    @Test
    public void testFollowRedirectsToggle() {
        Connection con = HttpConnection.connect("http://example.com").followRedirects(false);
        assertFalse(con.request().followRedirects());
        con.followRedirects(true);
        assertTrue(con.request().followRedirects());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrerNullThrows() {
        HttpConnection.connect("http://example.com").referrer(null);
    }

    @Test
    public void testReferrerSetsHeader() {
        Connection con = HttpConnection.connect("http://example.com").referrer("http://ref.com");
        assertEquals("http://ref.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodNullThrows() {
        HttpConnection.connect("http://example.com").method(null);
    }

    @Test
    public void testMethodSetter() {
        Connection con = HttpConnection.connect("http://example.com").method(Method.POST);
        assertEquals(Method.POST, con.request().method());
    }

    @Test
    public void testDefaultMethodIsGet() {
        Connection con = HttpConnection.connect("http://example.com");
        assertEquals(Method.GET, con.request().method());
    }

    @Test
    public void testIgnoreHttpErrorsToggle() {
        Connection con = HttpConnection.connect("http://example.com").ignoreHttpErrors(true);
        assertTrue(con.request().ignoreHttpErrors());
    }

    @Test
    public void testIgnoreContentTypeToggle() {
        Connection con = HttpConnection.connect("http://example.com").ignoreContentType(true);
        assertTrue(con.request().ignoreContentType());
    }

    @Test
    public void testValidateTLSCertificatesToggle() {
        Connection con = HttpConnection.connect("http://example.com").validateTLSCertificates(false);
        assertFalse(con.request().validateTLSCertificates());
    }

    @Test
    public void testDefaultValidateTLSCertificatesIsTrue() {
        Connection con = HttpConnection.connect("http://example.com");
        assertTrue(con.request().validateTLSCertificates());
    }

    // =========================================================
    // 4) data(...) overloads
    // =========================================================

    @Test
    public void testDataKeyValue() {
        Connection con = HttpConnection.connect("http://example.com").data("key", "value");
        Collection<Connection.KeyVal> data = con.request().data();
        assertEquals(1, data.size());
        Connection.KeyVal kv = data.iterator().next();
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
    }

    @Test
    public void testDataKeyFilenameInputStream() {
        Connection con = HttpConnection.connect("http://example.com")
                .data("file", "test.txt", new ByteArrayInputStream("abc".getBytes()));
        Connection.KeyVal kv = con.request().data().iterator().next();
        assertTrue(kv.hasInputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataMapNullThrows() {
        HttpConnection.connect("http://example.com").data((Map<String, String>) null);
    }

    @Test
    public void testDataMapAddsEntries() {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("a", "1");
        map.put("b", "2");
        Connection con = HttpConnection.connect("http://example.com").data(map);
        assertEquals(2, con.request().data().size());
    }

    @Test
    public void testDataMapEmptyNoEntriesAdded() {
        Connection con = HttpConnection.connect("http://example.com").data(new LinkedHashMap<String, String>());
        assertEquals(0, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsNullThrows() {
        HttpConnection.connect("http://example.com").data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsOddLengthThrows() {
        HttpConnection.connect("http://example.com").data("key1", "val1", "key2");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsEmptyKeyThrows() {
        HttpConnection.connect("http://example.com").data("", "val1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsNullValueThrows() {
        HttpConnection.connect("http://example.com").data("key1", (String) null);
    }

    @Test
    public void testDataVarargsValidPairsLoopMultipleIterations() {
        Connection con = HttpConnection.connect("http://example.com").data("k1", "v1", "k2", "v2");
        assertEquals(2, con.request().data().size());
    }

    @Test
    public void testDataVarargsEmptyArrayNoEntriesAdded() {
        Connection con = HttpConnection.connect("http://example.com").data(new String[0]);
        assertEquals(0, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataCollectionNullThrows() {
        HttpConnection.connect("http://example.com").data((Collection<Connection.KeyVal>) null);
    }

    @Test
    public void testDataCollectionAddsEntries() {
        List<Connection.KeyVal> list = new ArrayList<Connection.KeyVal>();
        list.add(HttpConnection.KeyVal.create("a", "1"));
        list.add(HttpConnection.KeyVal.create("b", "2"));
        Connection con = HttpConnection.connect("http://example.com").data(list);
        assertEquals(2, con.request().data().size());
    }

    @Test
    public void testDataCollectionEmptyNoEntriesAdded() {
        Connection con = HttpConnection.connect("http://example.com").data(new ArrayList<Connection.KeyVal>());
        assertEquals(0, con.request().data().size());
    }

    // =========================================================
    // 5) header / hasHeader / hasHeaderWithValue / removeHeader (Base)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderNameEmptyThrows() {
        HttpConnection.connect("http://example.com").header("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderValueNullThrows() {
        HttpConnection.connect("http://example.com").header("X", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderGetterNullNameThrows() {
        HttpConnection.connect("http://example.com").request().header(null);
    }

    @Test
    public void testHeaderCaseInsensitiveOverwrite() {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.header("X-Test", "1");
        req.header("x-test", "2"); // ควร overwrite ตัวเดิม ไม่สร้าง key ใหม่
        assertEquals("2", req.header("X-Test"));
        int count = 0;
        for (String key : req.headers().keySet()) {
            if (key.equalsIgnoreCase("X-Test")) count++;
        }
        assertEquals(1, count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHasHeaderEmptyNameThrows() {
        HttpConnection.connect("http://example.com").request().hasHeader("");
    }

    @Test
    public void testHasHeaderCaseInsensitiveTrueFalse() {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.header("X-Custom", "v");
        assertTrue(req.hasHeader("x-custom"));
        assertFalse(req.hasHeader("Not-There"));
    }

    @Test
    public void testHasHeaderWithValueTrueFalse() {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.header("X-Custom", "ValueHere");
        assertTrue(req.hasHeaderWithValue("x-custom", "valuehere"));
        assertFalse(req.hasHeaderWithValue("x-custom", "other"));
        assertFalse(req.hasHeaderWithValue("not-exist", "whatever")); // short-circuit hasHeader()==false
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveHeaderEmptyNameThrows() {
        HttpConnection.connect("http://example.com").request().removeHeader("");
    }

    @Test
    public void testRemoveHeaderExistingAndNonExisting() {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.header("X-Custom", "v");
        req.removeHeader("x-custom"); // case-insensitive remove
        assertFalse(req.hasHeader("X-Custom"));
        req.removeHeader("X-Custom"); // ลบซ้ำ ไม่มีอยู่แล้ว ต้องไม่ throw
        assertFalse(req.hasHeader("X-Custom"));
    }

    @Test
    public void testDefaultHeaderAcceptEncodingGzip() {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        assertEquals("gzip", req.header("Accept-Encoding"));
    }

    // =========================================================
    // 6) cookie / hasCookie / removeCookie (Base) + cookies(Map)
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testCookieNameEmptyThrows() {
        HttpConnection.connect("http://example.com").cookie("", "v");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieValueNullThrows() {
        HttpConnection.connect("http://example.com").cookie("name", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieGetterEmptyNameThrows() {
        HttpConnection.connect("http://example.com").request().cookie("");
    }

    @Test
    public void testCookieAddHasRemove() {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        req.cookie("a", "1");
        assertTrue(req.hasCookie("a"));
        assertEquals("1", req.cookie("a"));
        req.removeCookie("a");
        assertFalse(req.hasCookie("a"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookiesMapNullThrows() {
        HttpConnection.connect("http://example.com").cookies(null);
    }

    @Test
    public void testCookiesMapAddsEntries() {
        Map<String, String> cookies = new LinkedHashMap<String, String>();
        cookies.put("c1", "v1");
        cookies.put("c2", "v2");
        Connection con = HttpConnection.connect("http://example.com").cookies(cookies);
        assertTrue(con.request().hasCookie("c1"));
        assertTrue(con.request().hasCookie("c2"));
    }

    // =========================================================
    // 7) parser() / postDataCharset()
    // =========================================================

    @Test
    public void testParserSetterGetter() {
        Parser xmlParser = Parser.xmlParser();
        Connection con = HttpConnection.connect("http://example.com").parser(xmlParser);
        assertSame(xmlParser, con.request().parser());
    }

    @Test
    public void testDefaultParserIsNotNull() {
        Connection con = HttpConnection.connect("http://example.com");
        assertNotNull(con.request().parser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPostDataCharsetNullThrows() {
        HttpConnection.connect("http://example.com").postDataCharset(null);
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testPostDataCharsetUnsupportedThrows() {
        HttpConnection.connect("http://example.com").postDataCharset("NOT-A-REAL-CHARSET-XYZ");
    }

    @Test
    public void testPostDataCharsetValid() {
        Connection con = HttpConnection.connect("http://example.com").postDataCharset("ISO-8859-1");
        assertEquals("ISO-8859-1", con.request().postDataCharset());
    }

    @Test
    public void testDefaultPostDataCharsetNotNull() {
        Connection con = HttpConnection.connect("http://example.com");
        assertNotNull(con.request().postDataCharset());
    }

    // =========================================================
    // 8) request()/request(Request), response()/response(Response)
    // =========================================================

    @Test
    public void testRequestSetterGetter() {
        Connection con1 = HttpConnection.connect("http://example.com");
        Connection con2 = HttpConnection.connect("http://other.com");
        Connection.Request otherReq = con2.request();
        con1.request(otherReq);
        assertSame(otherReq, con1.request());
    }

    @Test
    public void testResponseSetterGetter() {
        Connection con = HttpConnection.connect("http://example.com");
        assertNotNull(con.response());
        Connection.Response newRes = new HttpConnection.Response(); // package-private ctor, same package
        con.response(newRes);
        assertSame(newRes, con.response());
    }

    // =========================================================
    // 9) KeyVal
    // =========================================================

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValCreateEmptyKeyThrows() {
        HttpConnection.KeyVal.create("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValCreateNullValueThrows() {
        HttpConnection.KeyVal.create("key", null);
    }

    @Test
    public void testKeyValCreateNormalAndToString() {
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "value");
        assertEquals("key", kv.key());
        assertEquals("value", kv.value());
        assertFalse(kv.hasInputStream());
        assertEquals("key=value", kv.toString());
    }

    @Test
    public void testKeyValCreateWithInputStream() {
        InputStream is = new ByteArrayInputStream("data".getBytes());
        Connection.KeyVal kv = HttpConnection.KeyVal.create("file", "test.txt", is);
        assertTrue(kv.hasInputStream());
        assertSame(is, kv.inputStream());
    }

    @Test
    public void testKeyValInputStreamNullDoesNotThrow_sourceQuirk() {
        // NOTE (fault-finding): KeyVal.inputStream(InputStream) เรียก
        // Validate.notNull(value, "Data input stream must not be null")
        // ซึ่ง validate ค่า field 'value' (filename) ไม่ใช่ parameter 'inputStream' ที่รับเข้ามา
        // ดังนั้นแม้ stream เป็น null ก็จะไม่ throw ตราบใดที่ value (filename) ไม่ null
        // นี่คือ behavior จริงตามซอร์สที่ให้มา (อาจเป็น bug) — assert ตาม behavior ที่สังเกตได้จริง
        Connection.KeyVal kv = HttpConnection.KeyVal.create("key", "file.txt", null);
        assertFalse(kv.hasInputStream());
        assertNull(kv.inputStream());
    }

    // =========================================================
    // 10) Response: default state, parse()/body()/bodyAsBytes() ก่อน execute
    // =========================================================

    @Test
    public void testResponseDefaultsBeforeExecute() {
        Connection con = HttpConnection.connect("http://example.com");
        Connection.Response res = con.response();
        assertEquals(0, res.statusCode());
        assertNull(res.statusMessage());
        assertNull(res.charset());
        assertNull(res.contentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseBeforeExecuteThrows() throws IOException {
        HttpConnection.connect("http://example.com").response().parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyBeforeExecuteThrows() {
        HttpConnection.connect("http://example.com").response().body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyAsBytesBeforeExecuteThrows() {
        HttpConnection.connect("http://example.com").response().bodyAsBytes();
    }

    // =========================================================
    // 11) execute(): branch ที่ throw ก่อนมีการเชื่อมต่อเครือข่ายจริง
    // =========================================================

    @Test
    public void testExecuteUnsupportedProtocolThrowsBeforeNetwork() throws IOException {
        try {
            HttpConnection.connect("ftp://example.com/file").execute();
            fail("Expected MalformedURLException");
        } catch (MalformedURLException e) {
            assertTrue(e.getMessage().contains("Only http & https protocols supported"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testExecuteNullRequestThrows() throws IOException {
        Connection con = HttpConnection.connect("http://example.com");
        con.request(null); // setter ไม่ validate โดยตรง
        con.execute();     // Response.execute() -> Validate.notNull(req,...) ควร throw ก่อน network
    }

    // =========================================================
    // 12) processResponseHeaders() (package-private) - Set-Cookie / combine / skip branches
    // =========================================================

    @Test
    public void testProcessResponseHeadersSetCookieAndCombine() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        headers.put("Set-Cookie", Arrays.asList("name1=value1", "name2=value2"));
        headers.put("Content-Type", Arrays.asList("text/html", "text/plain")); // รับเฉพาะค่าแรก
        res.processResponseHeaders(headers);

        assertEquals("value1", res.cookie("name1"));
        assertEquals("value2", res.cookie("name2"));
        assertEquals("text/html", res.header("Content-Type"));
    }

    @Test
    public void testProcessResponseHeadersNullKeySkipped() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        headers.put(null, Arrays.asList("HTTP/1.1 200 OK")); // http/1.1 status line -> ข้าม
        res.processResponseHeaders(headers); // ไม่ควร throw
        assertTrue(res.headers().isEmpty());
    }

    @Test
    public void testProcessResponseHeadersCookieEmptyNameSkipped() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        headers.put("Set-Cookie", Arrays.asList("=valueOnly")); // "=" อยู่ตำแหน่งแรก -> ชื่อ cookie ว่าง
        res.processResponseHeaders(headers);
        assertTrue(res.cookies().isEmpty());
    }

    @Test
    public void testProcessResponseHeadersNullValueInListSkipped() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        List<String> values = new ArrayList<String>();
        values.add(null);
        headers.put("Set-Cookie", values);
        res.processResponseHeaders(headers); // ไม่ควร throw
        assertTrue(res.cookies().isEmpty());
    }

    @Test
    public void testProcessResponseHeadersEmptyValuesListSkipsHeaderSet() {
        HttpConnection.Response res = new HttpConnection.Response();
        Map<String, List<String>> headers = new LinkedHashMap<String, List<String>>();
        headers.put("X-Custom", new ArrayList<String>()); // values.isEmpty() -> ไม่เรียก header()
        res.processResponseHeaders(headers);
        assertFalse(res.hasHeader("X-Custom"));
    }

    // =========================================================
    // 13) private static methods ใน Response ผ่าน reflection (ไม่มี network I/O)
    // =========================================================

    @Test
    public void testSetOutputContentTypeFormUrlEncodedBranch() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com").data("key", "value").request();
        Object boundary = invokePrivateStatic(HttpConnection.Response.class, "setOutputContentType",
                new Class[]{Connection.Request.class}, new Object[]{req});
        assertNull(boundary); // ไม่มี inputStream -> ไม่ใช่ multipart -> boundary null
        assertTrue(req.header("Content-Type").startsWith("application/x-www-form-urlencoded"));
    }

    @Test
    public void testSetOutputContentTypeMultipartBranch() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com")
                .data("file", "test.txt", new ByteArrayInputStream("data".getBytes()))
                .request();
        Object boundary = invokePrivateStatic(HttpConnection.Response.class, "setOutputContentType",
                new Class[]{Connection.Request.class}, new Object[]{req});
        assertNotNull(boundary); // มี inputStream -> multipart -> boundary ไม่ null
        assertTrue(req.header("Content-Type").startsWith("multipart/form-data"));
    }

    @Test
    public void testGetRequestCookieStringEmpty() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com").request();
        Object result = invokePrivateStatic(HttpConnection.Response.class, "getRequestCookieString",
                new Class[]{Connection.Request.class}, new Object[]{req});
        assertEquals("", result);
    }

    @Test
    public void testGetRequestCookieStringMultipleJoinedWithSemicolon() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com")
                .cookie("a", "1").cookie("b", "2").request();
        Object result = invokePrivateStatic(HttpConnection.Response.class, "getRequestCookieString",
                new Class[]{Connection.Request.class}, new Object[]{req});
        assertEquals("a=1; b=2", result);
    }

    @Test
    public void testSerialiseRequestUrlAppendsToExistingQuery() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com/path?existing=1")
                .data("key", "value").request();
        invokePrivateStatic(HttpConnection.Response.class, "serialiseRequestUrl",
                new Class[]{Connection.Request.class}, new Object[]{req});
        String urlStr = req.url().toString();
        assertTrue(urlStr.contains("existing=1"));
        assertTrue(urlStr.contains("key=value"));
        assertEquals(0, req.data().size()); // data ถูกเคลียร์หลัง serialise
    }

    @Test
    public void testSerialiseRequestUrlNoExistingQuery() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com/path")
                .data("k", "v").request();
        invokePrivateStatic(HttpConnection.Response.class, "serialiseRequestUrl",
                new Class[]{Connection.Request.class}, new Object[]{req});
        assertTrue(req.url().toString().endsWith("?k=v"));
    }

    // createConnection(): URL.openConnection() ไม่ทำ network I/O จริงจนกว่าจะเรียก connect()/getInputStream()
    @Test
    public void testCreateConnectionBasicPropertiesPostWithCookieAndHeader() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com")
                .timeout(1234)
                .method(Method.POST) // สมมติฐาน: POST.hasBody()==true ตามการใช้งานใน source (execute())
                .cookie("a", "1")
                .header("X-Test", "v")
                .request();
        Object connObj = invokePrivateStatic(HttpConnection.Response.class, "createConnection",
                new Class[]{Connection.Request.class}, new Object[]{req});
        HttpURLConnection conn = (HttpURLConnection) connObj;
        try {
            assertEquals("POST", conn.getRequestMethod());
            assertEquals(1234, conn.getConnectTimeout());
            assertEquals(1234, conn.getReadTimeout());
            assertFalse(conn.getInstanceFollowRedirects());
            assertTrue(conn.getDoOutput()); // hasBody()==true branch
            assertEquals("v", conn.getRequestProperty("X-Test"));
            assertEquals("a=1", conn.getRequestProperty("Cookie"));
        } finally {
            conn.disconnect();
        }
    }

    @Test
    public void testCreateConnectionGetMethodNoOutputNoCookie() throws Throwable {
        Connection.Request req = HttpConnection.connect("http://example.com").request(); // default GET, no cookie
        Object connObj = invokePrivateStatic(HttpConnection.Response.class, "createConnection",
                new Class[]{Connection.Request.class}, new Object[]{req});
        HttpURLConnection conn = (HttpURLConnection) connObj;
        try {
            assertFalse(conn.getDoOutput()); // hasBody()==false branch
            assertNull(conn.getRequestProperty("Cookie")); // cookies().size()==0 branch
        } finally {
            conn.disconnect();
        }
    }

    @Test
    public void testCreateConnectionHttpsWithTLSValidationDisabled() throws Throwable {
        Connection.Request req = HttpConnection.connect("https://example.com")
                .validateTLSCertificates(false)
                .request();
        Object connObj = invokePrivateStatic(HttpConnection.Response.class, "createConnection",
                new Class[]{Connection.Request.class}, new Object[]{req});
        HttpsURLConnection conn = (HttpsURLConnection) connObj;
        try {
            assertNotNull(conn.getSSLSocketFactory());
            assertNotNull(conn.getHostnameVerifier());
            // custom verifier ที่ initUnSecureTSL() ติดตั้งไว้จะ return true โดยไม่สนใจ session
            assertTrue(conn.getHostnameVerifier().verify("any-host", null));
        } finally {
            conn.disconnect();
        }
    }

    @Test
    public void testCreateConnectionHttpsWithTLSValidationEnabledDefaultSkipsOverrideBranch() throws Throwable {
        Connection.Request req = HttpConnection.connect("https://example.com").request(); // default true
        Object connObj = invokePrivateStatic(HttpConnection.Response.class, "createConnection",
                new Class[]{Connection.Request.class}, new Object[]{req});
        HttpsURLConnection conn = (HttpsURLConnection) connObj;
        try {
            assertNotNull(conn); // อย่างน้อยยืนยันว่า branch "validateTLSCertificates()==true" ไม่ throw
        } finally {
            conn.disconnect();
        }
    }
}
