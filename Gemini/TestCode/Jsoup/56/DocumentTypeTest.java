package org.jsoup.nodes;

import org.junit.Test;
import java.io.IOException;

import static org.junit.Assert.*;

public class DocumentTypeTest {

    @Test
    public void testNodeName() {
        DocumentType doctype = new DocumentType("html", "", "", "");
        assertEquals("#doctype", doctype.nodeName());
    }

    @Test
    public void testHtml5DoctypeDefault() throws IOException {
        // HTML syntax, no publicId, no systemId -> should output lowercase <!doctype
        DocumentType doctype = new DocumentType("html", "", "", "");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);

        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!doctype html>", accum.toString());
    }

    @Test
    public void testHtmlSyntaxWithPublicId() throws IOException {
        // HTML syntax, but has publicId -> should output uppercase <!DOCTYPE
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD HTML 4.01 Transitional//EN", "", "");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);

        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">", accum.toString());
    }

    @Test
    public void testHtmlSyntaxWithSystemId() throws IOException {
        // HTML syntax, but has systemId -> should output uppercase <!DOCTYPE
        DocumentType doctype = new DocumentType("html", "", "http://www.w3.org/TR/html4/loose.dtd", "");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);

        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html \"http://www.w3.org/TR/html4/loose.dtd\">", accum.toString());
    }

    @Test
    public void testXmlSyntaxDoctype() throws IOException {
        // XML syntax, no publicId, no systemId -> should output uppercase <!DOCTYPE
        DocumentType doctype = new DocumentType("html", "", "", "");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.xml);

        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testFullDoctypeHtml4() throws IOException {
        // Both publicId and systemId present
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD HTML 4.01//EN", "http://www.w3.org/TR/html4/strict.dtd", "");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);

        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">", accum.toString());
    }

    @Test
    public void testBlankOrNullName() throws IOException {
        // Edge case: Name is blank or null
        DocumentType doctype = new DocumentType("", "", "", "");
        Document.OutputSettings out = new Document.OutputSettings();
        out.syntax(Document.OutputSettings.Syntax.html);

        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, out);
        assertEquals("<!doctype>", accum.toString());
    }

    @Test
    public void testOuterHtmlTailDoesNothing() {
        // Ensuring outerHtmlTail executes safely without exceptions
        DocumentType doctype = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        
        try {
            doctype.outerHtmlTail(accum, 0, out);
        } catch (Exception e) {
            fail("outerHtmlTail should not throw any exception");
        }
        assertEquals("", accum.toString());
    }
}