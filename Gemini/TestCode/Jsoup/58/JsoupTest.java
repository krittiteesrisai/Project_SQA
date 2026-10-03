package org.jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.safety.Whitelist;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import static org.junit.Assert.*;

public class JsoupTest {

    @Test
    public void testParseStringAndBaseUri() {
        String html = "<html><head><title>First</title></head><body><p>Parsed HTML</p></body></html>";
        String baseUri = "http://example.com";
        Document doc = Jsoup.parse(html, baseUri);

        assertNotNull(doc);
        assertEquals("First", doc.title());
        assertEquals("Parsed HTML", doc.text());
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void testParseStringOnly() {
        String html = "<p>Hello</p>";
        Document doc = Jsoup.parse(html);

        assertNotNull(doc);
        assertEquals("Hello", doc.text());
    }

    @Test
    public void testParseWithCustomParser() {
        String xml = "<root><child>Data</child></root>";
        Document doc = Jsoup.parse(xml, "", Parser.xmlParser());

        assertNotNull(doc);
        assertEquals("Data", doc.select("child").text());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParseNullHtml() {
        Jsoup.parse((String) null);
    }

    @Test
    public void testConnectValidUrl() {
        Connection connection = Jsoup.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConnectInvalidUrl() {
        Jsoup.connect("not-a-url");
    }

    @Test
    public void testParseFileWithCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup-test", ".html");
        tempFile.deleteOnExit();

        try (FileWriter writer = new FileWriter(tempFile, java.nio.charset.StandardCharsets.UTF_8)) {
            writer.write("<html><body><p>File Test</p></body></html>");
        }

        Document doc = Jsoup.parse(tempFile, "UTF-8", "http://example.com");
        assertNotNull(doc);
        assertEquals("File Test", doc.text());
    }

    @Test
    public void testParseFileWithoutCharset() throws IOException {
        File tempFile = File.createTempFile("jsoup-test", ".html");
        tempFile.deleteOnExit();

        try (FileWriter writer = new FileWriter(tempFile, java.nio.charset.StandardCharsets.UTF_8)) {
            writer.write("<html><body><p>Auto Charset</p></body></html>");
        }

        Document doc = Jsoup.parse(tempFile, null);
        assertNotNull(doc);
        assertEquals("Auto Charset", doc.text());
    }

    @Test(expected = IOException.class)
    public void testParseNonExistentFile() throws IOException {
        File nonExistent = new File("non-existent-file-12345.html");
        Jsoup.parse(nonExistent, "UTF-8");
    }

    @Test
    public void testParseInputStream() throws IOException {
        File tempFile = File.createTempFile("jsoup-stream", ".html");
        tempFile.deleteOnExit();

        try (FileWriter writer = new FileWriter(tempFile, java.nio.charset.StandardCharsets.UTF_8)) {
            writer.write("<div>Stream Data</div>");
        }

        try (FileInputStream in = new FileInputStream(tempFile)) {
            Document doc = Jsoup.parse(in, "UTF-8", "http://example.com");
            assertNotNull(doc);
            assertEquals("Stream Data", doc.text());
        }
    }

    @Test
    public void testParseInputStreamWithParser() throws IOException {
        File tempFile = File.createTempFile("jsoup-stream-parser", ".xml");
        tempFile.deleteOnExit();

        try (FileWriter writer = new FileWriter(tempFile, java.nio.charset.StandardCharsets.UTF_8)) {
            writer.write("<root>XML Stream</root>");
        }

        try (FileInputStream in = new FileInputStream(tempFile)) {
            Document doc = Jsoup.parse(in, null, "http://example.com", Parser.xmlParser());
            assertNotNull(doc);
            assertEquals("XML Stream", doc.text());
        }
    }

    @Test
    public void testParseBodyFragment() {
        String bodyHtml = "<div>Fragment</div>";
        Document doc = Jsoup.parseBodyFragment(bodyHtml, "http://example.com");

        assertNotNull(doc);
        assertEquals("Fragment", doc.text());
    }

    @Test
    public void testParseBodyFragmentNoBaseUri() {
        String bodyHtml = "<span>No Base</span>";
        Document doc = Jsoup.parseBodyFragment(bodyHtml);

        assertNotNull(doc);
        assertEquals("No Base", doc.text());
    }

    @Test
    public void testParseUrlTimeout() throws IOException {
        // ทดสอบพารามิเตอร์ URL และ Timeout (จำลองเรียก URL จริงหรือขัดข้อง)
        URL url = new URL("http://example.com");
        try {
            Document doc = Jsoup.parse(url, 1000);
            assertNotNull(doc);
        } catch (IOException e) {
            // กรณีไม่มีสัญญาณอินเทอร์เน็ตในการรันเทสบน CI ให้ยอมรับ IOException ได้
            assertNotNull(e);
        }
    }

    @Test
    public void testCleanWithWhitelist() {
        String unsafe = "<p><a href='http://example.com' onclick='alert(1)'>Link</a><b>Bold</b><script>alert(2)</script></p>";
        String cleaned = Jsoup.clean(unsafe, Whitelist.basic());

        assertTrue(cleaned.contains("<a href=\"http://example.com\" rel=\"nofollow\">Link</a>"));
        assertTrue(cleaned.contains("<b>Bold</b>"));
        assertFalse(cleaned.contains("onclick"));
        assertFalse(cleaned.contains("script"));
    }

    @Test
    public void testCleanWithBaseUriAndWhitelist() {
        String unsafe = "<a href='/relative'>Link</a>";
        String cleaned = Jsoup.clean(unsafe, "http://example.com", Whitelist.basic());

        assertTrue(cleaned.contains("href=\"http://example.com/relative\""));
    }

    @Test
    public void testCleanWithOutputSettings() {
        String unsafe = "<p>Test Output Settings</p>";
        Document.OutputSettings outputSettings = new Document.OutputSettings().prettyPrint(false);
        String cleaned = Jsoup.clean(unsafe, "http://example.com", Whitelist.basic(), outputSettings);

        assertNotNull(cleaned);
        assertEquals("<p>Test Output Settings</p>", cleaned);
    }

    @Test
    public void testIsValid() {
        String validHtml = "<p><b>Safe Content</b></p>";
        String invalidHtml = "<p><script>alert(1)</script>Unsafe</p>";

        assertTrue(Jsoup.isValid(validHtml, Whitelist.basic()));
        assertFalse(Jsoup.isValid(invalidHtml, Whitelist.basic()));
    }
}