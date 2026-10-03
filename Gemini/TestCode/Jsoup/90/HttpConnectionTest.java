package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpConnectionTest {

    private Server jettyServer;
    private int port;

    @Before
    public void setUp() throws Exception {
        jettyServer = new Server(0); // random available port
        ServletHandler handler = new ServletHandler();
        jettyServer.setHandler(handler);

        handler.addServletWithMapping(TestServlet.class, "/*");
        jettyServer.start();
        port = jettyServer.getConnectors()[0].getLocalPort();
    }

    @After
    public void tearDown() throws Exception {
        if (jettyServer != null) {
            jettyServer.stop();
        }
    }

    public static class TestServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String path = req.getRequestURI();
            if ("/json".equals(path)) {
                resp.setContentType("application/json");
                resp.setStatus(HttpServletResponse.SC_OK);
                resp.getWriter().write("{\"status\":\"ok\"}");
            } else if ("/error500".equals(path)) {
                resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                resp.getWriter().write("Internal Error");
            } else if ("/redirect".equals(path)) {
                resp.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
                resp.setHeader("Location", "http://localhost:" + req.getLocalPort() + "/json");
            } else if ("/unsupported".equals(path)) {
                resp.setContentType("application/x-unknown-mime");
                resp.setStatus(HttpServletResponse.SC_OK);
                resp.getWriter().write("binary data");
            } else {
                resp.setContentType("text/html; charset=UTF-8");
                resp.setStatus(HttpServletResponse.SC_OK);
                resp.getWriter().write("<html><head><title>Test</title></head><body>Hello World</body></html>");
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html; charset=UTF-8");
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("POST OK");
        }
    }

    @Test
    public void testConnectStringAndUrl() {
        Connection con1 = HttpConnection.connect("http://localhost:" + port + "/");
        assertNotNull(con1);

        try {
            Connection con2 = HttpConnection.connect(new URL("http://localhost:" + port + "/"));
            assertNotNull(con2);
        } catch (MalformedURLException e) {
            fail("Should not throw MalformedURLException");
        }
    }

    @Test
    public void testEncodeUrlEdgeCases() {
        // Space in URL
        Connection con = HttpConnection.connect("http://localhost:" + port + "/path with space");
        assertNotNull(con);

        // Malformed URL fallback
        Connection conInvalid = HttpConnection.connect("http://invalid-url-%%");
        assertNotNull(conInvalid);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlEmpty() {
        HttpConnection.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUrlMalformedThrowsException() {
        HttpConnection.connect("ht^tp://bad-url");
    }

    @Test
    public void testDataKeyValAndMapAndVarargs() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        con.data("key1", "val1");
        assertNotNull(con.data("key1"));
        assertEquals("val1", con.data("key1").value());

        // Map data
        Map<String, String> map = new HashMap<>();
        map.put("key2", "val2");
        con.data(map);
        assertEquals("val2", con.data("key2").value());

        // Varargs even length
        con.data("key3", "val3", "key4", "val4");
        assertEquals("val3", con.data("key3").value());
        assertEquals("val4", con.data("key4").value());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataVarargsOddLength() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        con.data("key1", "val1", "key2"); // Odd length triggers validation error
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataKeyEmpty() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        con.data("", "val");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDataValueNull() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        con.data("key", null);
    }

    @Test
    public void testInputStreamData() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        InputStream is = new java.io.ByteArrayInputStream("test data".getBytes());
        con.data("fileKey", "filename.txt", is, "text/plain");
        assertNotNull(con.data("fileKey"));
        assertTrue(con.data("fileKey").hasInputStream());
        assertEquals("text/plain", con.data("fileKey").contentType());
    }

    @Test
    public void testHeadersAndCookies() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        con.header("X-Test", "Value");
        assertTrue(con.request().hasHeader("X-Test"));
        assertEquals("Value", con.request().header("X-Test"));
        assertTrue(con.request().hasHeaderWithValue("X-Test", "value"));

        con.removeHeader("X-Test");
        assertFalse(con.request().hasHeader("X-Test"));

        con.cookie("session", "12345");
        assertTrue(con.request().hasCookie("session"));
        assertEquals("12345", con.request().cookie("session"));

        con.removeCookie("session");
        assertFalse(con.request().hasCookie("session"));
    }

    @Test(expected = IllegalCharsetNameException.class)
    public void testInvalidPostDataCharset() {
        Connection con = HttpConnection.connect("http://localhost:" + port + "/");
        con.postDataCharset("INVALID-CHARSET-NAME-XYZ");
    }

    @Test
    public void testGetAndParseDocument() throws IOException {
        Document doc = HttpConnection.connect("http://localhost:" + port + "/").get();
        assertNotNull(doc);
        assertEquals("Test", doc.title());
    }

    @Test
    public void testPostRequest() throws IOException {
        Document doc = HttpConnection.connect("http://localhost:" + port + "/").post();
        assertNotNull(doc);
    }

    @Test(expected = HttpStatusException.class)
    public void testHttpErrorHandling() throws IOException {
        HttpConnection.connect("http://localhost:" + port + "/error500").get();
    }

    @Test
    public void testIgnoreHttpErrors() throws IOException {
        Connection.Response res = HttpConnection.connect("http://localhost:" + port + "/error500")
                .ignoreHttpErrors(true)
                .execute();
        assertEquals(500, res.statusCode());
    }

    @Test(expected = UnsupportedMimeTypeException.class)
    public void testUnsupportedMimeType() throws IOException {
        HttpConnection.connect("http://localhost:" + port + "/unsupported").get();
    }

    @Test
    public void testIgnoreContentType() throws IOException {
        Connection.Response res = HttpConnection.connect("http://localhost:" + port + "/unsupported")
                .ignoreContentType(true)
                .execute();
        assertEquals(200, res.statusCode());
    }

    @Test
    public void testRedirect() throws IOException {
        Document doc = HttpConnection.connect("http://localhost:" + port + "/redirect").get();
        assertNotNull(doc);
    }

    @Test(expected = MalformedURLException.class)
    public void testInvalidProtocol() throws IOException {
        HttpConnection.connect("ftp://localhost/file").get();
    }
}