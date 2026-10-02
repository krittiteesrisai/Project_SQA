package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.AbstractHandler;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;

import static org.junit.Assert.*;

/**
 * Unit tests for org.jsoup.Jsoup (Defects4J: Jsoup-58b)
 *
 * หมายเหตุ: คลาส Jsoup เป็น facade ที่ delegate ไปยังคลาสอื่น (Parser, DataUtil,
 * HttpConnection, Cleaner) เกือบทั้งหมด ไม่มี if/else ภายในตัวเองมากนัก
 * ดังนั้นการทดสอบจะมุ่งเน้นการ exercise ทุก overload และ path ที่สามารถสังเกตได้จาก
 * พฤติกรรมสาธารณะ (เช่น กรณี charset=null, baseUri="" , whitelist ต่าง ๆ, error cases)
 *
 * สำหรับ parse(URL, int) และ connect(String) ซึ่งต้องพึ่งพาการเชื่อมต่อเครือข่าย
 * จะใช้ embedded Jetty server (มีอยู่ใน classpath ที่กำหนด) เพื่อจำลอง response
 * แทนการพึ่งพาเครือข่ายจริง
 */
public class JsoupTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private static Server server;
    private static int port;

    @BeforeClass
    public static void startServer() throws Exception {
        server = new Server(0);
        server.setHandler(new AbstractHandler() {
            @Override
            public void handle(String target, Request baseRequest, HttpServletRequest request,
                                HttpServletResponse response) throws IOException, ServletException {
                response.setContentType("text/html; charset=utf-8");
                if ("/ok".equals(target)) {
                    response.setStatus(HttpServletResponse.SC_OK);
                    response.getWriter().print("<html><head><title>Test</title></head><body><p>Hello</p></body></html>");
                } else if ("/404".equals(target)) {
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    response.getWriter().print("Not Found");
                } else {
                    response.setStatus(HttpServletResponse.SC_OK);
                    response.getWriter().print("<html><body>Default</body></html>");
                }
                baseRequest.setHandled(true);
            }
        });
        server.start();
        port = ((ServerConnector) server.getConnectors()[0]).getLocalPort();
    }

    @AfterClass
    public static void stopServer() throws Exception {
        if (server != null) {
            server.stop();
        }
    }

    // ================= parse(String html, String baseUri) =================

    @Test
    public void testParseHtmlWithBaseUri_resolvesRelativeLinks() {
        String html = "<html><body><a href='foo.html'>link</a></body></html>";
        Document doc = Jsoup.parse(html, "http://example.com/");
        assertEquals("http://example.com/foo.html", doc.select("a").first().attr("abs:href"));
    }

    @Test
    public void testParseHtmlWithEmptyBaseUri_relativeLinkNotResolved() {
        String html = "<html><body><a href='foo.html'>link</a></body></html>";
        Document doc = Jsoup.parse(html, "");
        assertEquals("", doc.select("a").first().attr("abs:href"));
    }

    @Test
    public void testParseEmptyHtmlString_stillProducesDocument() {
        Document doc = Jsoup.parse("", "http://example.com/");
        assertNotNull(doc);
        assertNotNull(doc.body());
    }

    @Test(expected = NullPointerException.class)
    public void testParseNullHtmlThrowsNPE() {
        // หมายเหตุ: ไม่ได้ยืนยันโดยตรงจาก source ของ Jsoup ที่ให้มา (logic จริงอยู่ใน Parser.parse)
        // แต่เป็นพฤติกรรมที่คาดหวังตามปกติของ jsoup เมื่อ html เป็น null
        Jsoup.parse((String) null, "http://example.com/");
    }

    // ================= parse(String html, String baseUri, Parser parser) =================

    @Test
    public void testParseWithXmlParser() {
        String xml = "<root><child>text</child></root>";
        Document doc = Jsoup.parse(xml, "http://example.com/", Parser.xmlParser());
        assertEquals("text", doc.select("child").text());
    }

    @Test
    public void testParseWithHtmlParserExplicit() {
        String html = "<div><p>abc</p></div>";
        Document doc = Jsoup.parse(html, "", Parser.htmlParser());
        assertEquals("abc", doc.select("p").text());
    }

    // ================= parse(String html) =================

    @Test
    public void testParseHtmlNoBaseUri_relativeLinkNotResolved() {
        String html = "<html><body><a href='foo.html'>link</a></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("", doc.select("a").first().attr("abs:href"));
    }

    @Test
    public void testParseHtmlNoBaseUri_withBaseTagResolves() {
        String html = "<html><head><base href='http://example.com/'></head>"
                + "<body><a href='foo.html'>link</a></body></html>";
        Document doc = Jsoup.parse(html);
        assertEquals("http://example.com/foo.html", doc.select("a").first().attr("abs:href"));
    }

    // ================= connect(String url) =================

    @Test
    public void testConnectReturnsConnection() {
        Connection con = Jsoup.connect("http://localhost:" + port + "/ok");
        assertNotNull(con);
    }

    @Test
    public void testConnectAndGet() throws IOException {
        Connection con = Jsoup.connect("http://localhost:" + port + "/ok");
        Document doc = con.get();
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.select("p").text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectWithEmptyUrlThrows() {
        Jsoup.connect("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectWithNullUrlThrows() {
        Jsoup.connect(null);
    }

    // ================= parse(File in, String charsetName, String baseUri) =================

    @Test
    public void testParseFileWithCharsetAndBaseUri() throws IOException {
        File file = tempFolder.newFile("test.html");
        writeFile(file, "<html><body><p>file-content</p></body></html>", "UTF-8");

        Document doc = Jsoup.parse(file, "UTF-8", "http://example.com/");
        assertEquals("file-content", doc.select("p").text());
    }

    @Test
    public void testParseFileWithNullCharset_fallsBackToDefault() throws IOException {
        File file = tempFolder.newFile("test-nocharset.html");
        writeFile(file, "<html><body><p>abc</p></body></html>", "UTF-8");

        Document doc = Jsoup.parse(file, null, "http://example.com/");
        assertEquals("abc", doc.select("p").text());
    }

    @Test(expected = IOException.class)
    public void testParseFileNotFoundThrowsIOException() throws IOException {
        File notExist = new File(tempFolder.getRoot(), "does-not-exist.html");
        Jsoup.parse(notExist, "UTF-8", "http://example.com/");
    }

    // ================= parse(File in, String charsetName) =================

    @Test
    public void testParseFileTwoArg_usesFileAbsolutePathAsBaseUri() throws IOException {
        File file = tempFolder.newFile("test2.html");
        writeFile(file, "<html><body><p>two-arg</p></body></html>", "UTF-8");

        Document doc = Jsoup.parse(file, "UTF-8");
        assertEquals("two-arg", doc.select("p").text());
        assertEquals(file.getAbsolutePath(), doc.baseUri());
    }

    @Test(expected = IOException.class)
    public void testParseFileTwoArgNotFoundThrowsIOException() throws IOException {
        File notExist = new File(tempFolder.getRoot(), "missing.html");
        Jsoup.parse(notExist, "UTF-8");
    }

    // ================= parse(InputStream in, String charsetName, String baseUri) =================

    @Test
    public void testParseInputStreamWithCharsetAndBaseUri() throws IOException {
        String html = "<html><body><p>stream-content</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = Jsoup.parse(in, "UTF-8", "http://example.com/");
        assertEquals("stream-content", doc.select("p").text());
    }

    @Test
    public void testParseInputStreamWithNullCharset() throws IOException {
        String html = "<html><body><p>no-charset</p></body></html>";
        InputStream in = new ByteArrayInputStream(html.getBytes(Charset.forName("UTF-8")));
        Document doc = Jsoup.parse(in, null, "http://example.com/");
        assertEquals("no-charset", doc.select("p").text());
    }

    // ================= parse(InputStream in, String charsetName, String baseUri, Parser parser) =================

    @Test
    public void testParseInputStreamWithXmlParser() throws IOException {
        String xml = "<root><child>val</child></root>";
        InputStream in = new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8")));
        Document doc = Jsoup.parse(in, "UTF-8", "", Parser.xmlParser());
        assertEquals("val", doc.select("child").text());
    }

    // ================= parseBodyFragment(String bodyHtml, String baseUri) =================

    @Test
    public void testParseBodyFragmentWithBaseUri() {
        String frag = "<p>frag</p><a href='x.html'>link</a>";
        Document doc = Jsoup.parseBodyFragment(frag, "http://example.com/");
        assertEquals("frag", doc.select("p").text());
        assertEquals("http://example.com/x.html", doc.select("a").first().attr("abs:href"));
    }

    @Test
    public void testParseBodyFragmentEmptyString() {
        Document doc = Jsoup.parseBodyFragment("", "http://example.com/");
        assertNotNull(doc.body());
    }

    // ================= parseBodyFragment(String bodyHtml) =================

    @Test
    public void testParseBodyFragmentNoBaseUri() {
        String frag = "<p>frag2</p>";
        Document doc = Jsoup.parseBodyFragment(frag);
        assertEquals("frag2", doc.select("p").text());
    }

    // ================= parse(URL url, int timeoutMillis) =================

    @Test
    public void testParseUrlTimeoutSuccess() throws IOException {
        URL url = new URL("http://localhost:" + port + "/ok");
        Document doc = Jsoup.parse(url, 5000);
        assertEquals("Test", doc.title());
        assertEquals("Hello", doc.select("p").text());
    }

    @Test(expected = HttpStatusException.class)
    public void testParseUrlTimeout404ThrowsHttpStatusException() throws IOException {
        URL url = new URL("http://localhost:" + port + "/404");
        Jsoup.parse(url, 5000);
    }

    @Test
    public void testParseUrlTimeoutZero_noTimeoutBoundary() throws IOException {
        URL url = new URL("http://localhost:" + port + "/ok");
        Document doc = Jsoup.parse(url, 0); // 0 = no timeout (boundary value)
        assertNotNull(doc);
    }

    // ================= clean(String bodyHtml, String baseUri, Whitelist whitelist) =================

    @Test
    public void testCleanWithNoneWhitelist_stripsAllTags() {
        String dirty = "<p><script>alert(1)</script>safe text</p>";
        String cleaned = Jsoup.clean(dirty, "http://example.com/", Whitelist.none());
        assertEquals("safe text", cleaned);
    }

    @Test
    public void testCleanWithBasicWhitelist_keepsAllowedTags() {
        String dirty = "<p>hello <b>world</b></p><script>bad()</script>";
        String cleaned = Jsoup.clean(dirty, "http://example.com/", Whitelist.basic());
        assertTrue(cleaned.contains("hello"));
        assertFalse(cleaned.contains("<script>"));
    }

    @Test
    public void testCleanEmptyBodyHtml() {
        String cleaned = Jsoup.clean("", "http://example.com/", Whitelist.basic());
        assertEquals("", cleaned);
    }

    // ================= clean(String bodyHtml, Whitelist whitelist) =================

    @Test
    public void testCleanTwoArgOverload() {
        String dirty = "<p>text</p><script>bad()</script>";
        String cleaned = Jsoup.clean(dirty, Whitelist.basic());
        assertTrue(cleaned.contains("text"));
        assertFalse(cleaned.contains("script"));
    }

    // ================= clean(String, String, Whitelist, Document.OutputSettings) =================

    @Test
    public void testCleanWithOutputSettings_prettyPrintFalse() {
        String dirty = "<p>  spaced   text </p>";
        Document.OutputSettings settings = new Document.OutputSettings();
        settings.prettyPrint(false);
        String cleaned = Jsoup.clean(dirty, "http://example.com/", Whitelist.basic(), settings);
        assertNotNull(cleaned);
        assertTrue(cleaned.contains("spaced"));
    }

    // ================= isValid(String bodyHtml, Whitelist whitelist) =================

    @Test
    public void testIsValidTrueWhenAllowedTagsOnly() {
        String html = "<p>hello <b>world</b></p>";
        assertTrue(Jsoup.isValid(html, Whitelist.basic()));
    }

    @Test
    public void testIsValidFalseWhenDisallowedTagPresent() {
        String html = "<p>hello</p><script>bad()</script>";
        assertFalse(Jsoup.isValid(html, Whitelist.basic()));
    }

    @Test
    public void testIsValidEmptyHtml_withNoneWhitelist() {
        assertTrue(Jsoup.isValid("", Whitelist.none()));
    }

    @Test
    public void testIsValidFalseWithNoneWhitelistAndTags() {
        assertFalse(Jsoup.isValid("<p>text</p>", Whitelist.none()));
    }

    // ================= helper =================

    private static void writeFile(File file, String content, String charset) throws IOException {
        OutputStream os = new FileOutputStream(file);
        try {
            os.write(content.getBytes(Charset.forName(charset)));
        } finally {
            os.close();
        }
    }
}
