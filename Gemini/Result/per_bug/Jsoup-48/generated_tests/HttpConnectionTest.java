package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpConnectionTest {

    @Test
    public void testConnectStringAndUrlObjects() {
        Connection conStr = HttpConnection.connect("http://example.com");
        assertNotNull(conStr);
        assertNotNull(conStr.request());

        try {
            Connection conUrl = HttpConnection.connect(new URL("http://example.com"));
            assertNotNull(conUrl);
        } catch (MalformedURLException e) {
            fail("Should not throw MalformedURLException");
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlNullOrEmpty() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMalformedUrl() {
        HttpConnection.connect("not a valid url");
    }

    @Test
    public void testUserAgentAndReferrerValidation() {
        Connection con = HttpConnection.connect("http://example.com");
        con.userAgent("Mozilla/5.0");
        con.referrer("http://referrer.com");
        assertEquals("Mozilla/5.0", con.request().header("User-Agent"));
        assertEquals("http://referrer.com", con.request().header("Referer"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUserAgentNull() {
        HttpConnection.connect("http://example.com").userAgent(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReferrerNull() {
        HttpConnection.connect("http://example.com").referrer(null);
    }

    @Test
    public void testTimeoutAndBodySizeBounds() {
        Connection.Request req = new HttpConnection.Request();
        req.timeout(5000);
        assertEquals(5000, req.timeout());

        req.maxBodySize(2048);
        assertEquals(2048, req.maxBodySize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidTimeout() {
        new HttpConnection.Request().timeout(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMaxBodySize() {
        new HttpConnection.Request().maxBodySize(-1);
    }

    @Test
    public void testFollowRedirectsAndFlags() {
        Connection con = HttpConnection.connect("http://example.com")
                .followRedirects(false)
                .ignoreHttpErrors(true)
                .ignoreContentType(true)
                .validateTLSCertificates(false);

        assertFalse(con.request().followRedirects());
        assertTrue(con.request().ignoreHttpErrors());
        assertTrue(con.request().ignoreContentType());
        assertFalse(con.request().validateTLSCertificates());
    }

    @Test
    public void testDataVariations() {
        Connection con = HttpConnection.connect("http://example.com");
        con.data("key1", "val1");
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("key2", "val2");
        con.data(map);

        con.data("key3", "val3", "key4", "val4");

        assertEquals(4, con.request().data().size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataMapNull() {
        HttpConnection.connect("http://example.com").data((Map<String, String>) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsNull() {
        HttpConnection.connect("http://example.com").data((String[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsOddLength() {
        HttpConnection.connect("http://example.com").data("key1");
    }

    @Test
    public void testKeyValWithInputStream() {
        InputStream stream = new ByteArrayInputStream("test data".getBytes());
        Connection.KeyVal kv = Connection.KeyVal.create("fileField", "filename.txt", stream);
        assertTrue(kv.hasInputStream());
        assertEquals("fileField", kv.key());
        assertEquals("filename.txt", kv.value());
        assertEquals(stream, kv.inputStream());
        assertEquals("fileField=filename.txt", kv.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValEmptyKey() {
        Connection.KeyVal.create("", "value");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKeyValNullValue() {
        Connection.KeyVal.create("key", null);
    }

    @Test
    public void testHeadersCaseInsensitiveAndRemoval() {
        Connection con = HttpConnection.connect("http://example.com");
        con.header("Content-Type", "text/plain");
        
        assertTrue(con.request().hasHeader("content-type"));
        assertTrue(con.request().hasHeaderWithValue("CONTENT-TYPE", "text/plain"));
        assertEquals("text/plain", con.request().header("CONTENT-TYPE"));

        con.request().removeHeader("Content-Type");
        assertFalse(con.request().hasHeader("content-type"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderNullName() {
        HttpConnection.connect("http://example.com").request().header(null, "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderEmptyName() {
        HttpConnection.connect("http://example.com").request().header("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHeaderNullValue() {
        HttpConnection.connect("http://example.com").request().header("name", null);
    }

    @Test
    public void testCookiesManagement() {
        Connection con = HttpConnection.connect("http://example.com");
        con.cookie("session", "12345");
        
        assertTrue(con.request().hasCookie("session"));
        assertEquals("12345", con.request().cookie("session"));

        Map<String, String> cookies = new HashMap<String, String>();
        cookies.put("user", "admin");
        con.cookies(cookies);
        assertTrue(con.request().hasCookie("user"));

        con.request().removeCookie("session");
        assertFalse(con.request().hasCookie("session"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieEmptyName() {
        HttpConnection.connect("http://example.com").request().cookie("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCookieNullValue() {
        HttpConnection.connect("http://example.com").request().cookie("name", null);
    }

    @Test
    public void testParserAndPostDataCharset() {
        Connection con = HttpConnection.connect("http://example.com");
        Parser parser = Parser.xmlParser();
        con.parser(parser);
        assertEquals(parser, con.request().parser());

        con.postDataCharset("UTF-8");
        assertEquals("UTF-8", con.request().postDataCharset());
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testInvalidPostDataCharset() {
        HttpConnection.connect("http://example.com").postDataCharset("INVALID_CHARSET_NAME_XYZ");
    }

    @Test(expected = MalformedURLException.class)
    public void testExecuteUnsupportedProtocol() throws IOException {
        Connection con = HttpConnection.connect("ftp://example.com");
        con.execute();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseWithoutExecution() throws IOException {
        Connection.Response res = new HttpConnection.Response();
        res.parse();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyWithoutExecution() {
        Connection.Response res = new HttpConnection.Response();
        res.body();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBodyAsBytesWithoutExecution() {
        Connection.Response res = new HttpConnection.Response();
        res.bodyAsBytes();
    }

    @Test
    public void testRequestAndResponseSettersGetters() {
        HttpConnection con = (HttpConnection) HttpConnection.connect("http://example.com");
        Connection.Request req = con.request();
        Connection.Response res = con.response();

        assertSame(req, con.request(req).request());
        assertSame(res, con.response(res).response());
    }
}