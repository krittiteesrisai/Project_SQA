package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DocumentTypeTest {

    @Test
    public void testConstructorAndBlankValues() {
        // Test NodeName and outerHtmlHead with only name (publicId and systemId are null/blank)
        DocumentType doctype = new DocumentType("html", "", null, "http://example.com");
        assertEquals("#doctype", doctype.nodeName());
        
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html>", accum.toString());
    }

    @Test
    public void testAllFieldsPresent() {
        // Test all branches in outerHtmlHead (name, publicId, systemId all present)
        DocumentType doctype = new DocumentType("html", "-//W3C//DTD HTML 4.01 Transitional//EN", "http://www.w3.org/TR/html4/loose.dtd", "");
        
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">", accum.toString());
    }

    @Test
    public void testOnlySystemIdPresent() {
        // Edge Case: systemId is present, but publicId is blank/null
        // This targets the specific condition combination in outerHtmlHead
        DocumentType doctype = new DocumentType("html", null, "http://www.w3.org/TR/html4/loose.dtd", "");
        
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlHead(accum, 0, new Document.OutputSettings());
        // Verifying if spacing is handled correctly when publicId is missing
        assertEquals("<!DOCTYPE html \"http://www.w3.org/TR/html4/loose.dtd\">", accum.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorNullName() {
        // Boundary/Invalid State: name is null should trigger Validate.notEmpty
        new DocumentType(null, "pubId", "sysId", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorEmptyName() {
        // Boundary/Invalid State: name is empty string should trigger Validate.notEmpty
        new DocumentType("", "pubId", "sysId", "");
    }

    @Test
    public void testOuterHtmlTailDoesNothing() {
        // Ensure outerHtmlTail executes without throwing exception
        DocumentType doctype = new DocumentType("html", "", "", "");
        StringBuilder accum = new StringBuilder();
        doctype.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }
}