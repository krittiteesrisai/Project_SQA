package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;
import static org.junit.Assert.*;

public class TokenTest {

    @Test
    public void testResetStringBuilderNull() {
        // ทดสอบ reset(StringBuilder) เมื่อพารามิเตอร์เป็น null เพื่อป้องกัน NullPointerException
        Token.reset(null);
    }

    @Test
    public void testResetStringBuilderNotEmpty() {
        // ทดสอบ reset(StringBuilder) เมื่อมีข้อมูลอยู่ ต้องลบออกจนหมด
        StringBuilder sb = new StringBuilder("test");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    @Test
    public void testDoctypeToken() {
        // ครอบคลุม Doctype getters และ reset
        Token.Doctype doctype = new Token.Doctype();
        assertTrue(doctype.isDoctype());
        assertEquals("Doctype", doctype.tokenType());
        
        doctype.name.append("html");
        doctype.pubSysKey = "PUBLIC";
        doctype.publicIdentifier.append("-//W3C//DTD HTML 4.01//EN");
        doctype.systemIdentifier.append("http://www.w3.org/TR/html4/strict.dtd");
        doctype.forceQuirks = true;

        assertEquals("html", doctype.getName());
        assertEquals("PUBLIC", doctype.getPubSysKey());
        assertEquals("-//W3C//DTD HTML 4.01//EN", doctype.getPublicIdentifier());
        assertEquals("http://www.w3.org/TR/html4/strict.dtd", doctype.getSystemIdentifier());
        assertTrue(doctype.isForceQuirks());

        doctype.reset();
        assertEquals("", doctype.getName());
        assertNull(doctype.getPubSysKey());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameValidationNull() {
        // Edge Case: name() ต้องโยน IllegalArgumentException หาก tagName เป็น null
        Token.StartTag tag = new Token.StartTag();
        tag.name();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameValidationEmpty() {
        // Edge Case: name() ต้องโยน IllegalArgumentException หาก tagName เป็นค่าว่าง
        Token.StartTag tag = new Token.StartTag();
        tag.name("");
        tag.name();
    }

    @Test
    public void testStartTagAndToString() {
        Token.StartTag startTag = new Token.StartTag();
        assertTrue(startTag.isStartTag());
        assertEquals("StartTag", startTag.tokenType());

        startTag.name("div");
        assertEquals("div", startTag.name());
        assertEquals("div", startTag.normalName());

        // กรณีไม่มี Attributes
        assertEquals("<div>", startTag.toString());

        // กรณีมี Attributes
        Attributes attrs = new Attributes();
        attrs.put("class", "container");
        startTag.nameAttr("div", attrs);
        assertEquals("<div class=\"container\">", startTag.toString());
    }

    @Test
    public void testEndTag() {
        Token.EndTag endTag = new Token.EndTag();
        assertTrue(endTag.isEndTag());
        assertEquals("EndTag", endTag.tokenType());

        endTag.name("span");
        assertEquals("</span>", endTag.toString());
    }

    @Test
    public void testCommentToken() {
        Token.Comment comment = new Token.Comment();
        assertTrue(comment.isComment());
        assertEquals("Comment", comment.tokenType());

        comment.data.append("some comment");
        assertEquals("some comment", comment.getData());
        assertEquals("<!--some comment-->", comment.toString());

        comment.reset();
        assertEquals("", comment.getData());
        assertFalse(comment.bogus);
    }

    @Test
    public void testCharacterToken() {
        Token.Character charToken = new Token.Character();
        assertTrue(charToken.isCharacter());
        assertEquals("Character", charToken.tokenType());

        charToken.data("hello");
        assertEquals("hello", charToken.getData());
        assertEquals("hello", charToken.toString());

        charToken.reset();
        assertNull(charToken.getData());
    }

    @Test
    public void testEOFToken() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertEquals("EOF", eof.tokenType());
        assertNotNull(eof.reset());
    }

    @Test
    public void testTagAttributesHandlingWithPendingValueS() {
        // ทดสอบ appendAttributeValue แบบ String เดี่ยว (pendingAttributeValueS != null)
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://example.com");
        tag.newAttribute();

        assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagAttributesHandlingWithStringBuilderAndEnsureValue() {
        // ทดสอบการกระตุ้น ensureAttributeValue() ซ้ำซ้อน (ย้ายจาก pendingAttributeValueS ไป Append ลง StringBuilder)
        Token.StartTag tag = new Token.StartTag();
        tag.name("a");
        tag.appendAttributeName("href");
        tag.appendAttributeValue("http://"); // เซ็ตค่าลง pendingAttributeValueS
        tag.appendAttributeValue("example.com"); // กระตุ้น ensureAttributeValue() นำค่าเก่ามารวมใน StringBuilder
        tag.newAttribute();

        assertEquals("http://example.com", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagAttributesWithMultipleValueAppenders() {
        // ทดสอบ appendAttributeValue ด้วย char, char[], และ int[] (code points)
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("data-test");
        tag.appendAttributeValue('a');
        tag.appendAttributeValue(new char[]{'b', 'c'});
        tag.appendAttributeValue(new int[]{100, 101}); // 'd', 'e'
        tag.setSelfClosing(true);
        assertTrue(tag.isSelfClosing());
        
        tag.newAttribute();
        assertEquals("abcde", tag.getAttributes().get("data-test"));
    }

    @Test
    public void testTagEmptyAttributeValue() {
        // ทดสอบกรณีแอตทริบิวต์แบบมีค่าว่าง (hasEmptyAttributeValue = true)
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("disabled");
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        assertEquals("", tag.getAttributes().get("disabled"));
    }

    @Test
    public void testTagBooleanAttribute() {
        // ทดสอบกรณี BooleanAttribute (ไม่มีค่า และไม่มีค่าว่าง)
        Token.StartTag tag = new Token.StartTag();
        tag.name("input");
        tag.appendAttributeName("checked");
        tag.newAttribute();

        assertTrue(tag.getAttributes().hasKey("checked"));
    }

    @Test
    public void testFinaliseTagWithPendingName() {
        // ทดสอบ finaliseTag เมื่อยังมี pendingAttributeName ค้างอยู่
        Token.StartTag tag = new Token.StartTag();
        tag.name("meta");
        tag.appendAttributeName("charset");
        tag.setEmptyAttributeValue();
        tag.finaliseTag();

        assertEquals("", tag.getAttributes().get("charset"));
    }

    @Test
    public void testTagAppendTagNameChars() {
        // ทดสอบ appendTagName แบบ char
        Token.StartTag tag = new Token.StartTag();
        tag.appendTagName('p');
        assertEquals("p", tag.name());
        
        tag.appendTagName('x');
        assertEquals("px", tag.name());
    }

    @Test
    public void testTagAppendAttributeNameChars() {
        // ทดสอบ appendAttributeName แบบ char และ trim ข้อมูลใน newAttribute
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName(' ');
        tag.appendAttributeName('id');
        tag.appendAttributeName(' ');
        tag.setEmptyAttributeValue();
        tag.newAttribute();

        assertTrue(tag.getAttributes().hasKey("id"));
    }
}