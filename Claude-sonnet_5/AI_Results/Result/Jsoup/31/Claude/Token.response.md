```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.EOF;

/**
 * JUnit4 tests for org.jsoup.parser.Token (Defects4J Jsoup-31b)
 *
 * หมายเหตุ:
 * - Token, Doctype, StartTag, EndTag, Comment, Character, EOF เป็น package-private
 *   จึงต้องวาง test class ไว้ใน package org.jsoup.parser
 * - สมมติฐาน (assumption) ที่ไม่มีใน source ตรง ๆ จะมีคอมเมนต์กำกับไว้
 */
public class TokenTest {

    // ---------- Doctype ----------

    @Test
    public void testDoctypeDefaults() {
        Doctype d = new Doctype();
        assertEquals("", d.getName());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
        assertEquals(Token.TokenType.Doctype, d.type);
        assertTrue(d.isDoctype());
    }

    @Test
    public void testDoctypeWithAppendedValues() {
        Doctype d = new Doctype();
        // fields (name, publicIdentifier, systemIdentifier) เป็น package-private StringBuilder
        d.name.append("html");
        d.publicIdentifier.append("pub");
        d.systemIdentifier.append("sys");
        d.forceQuirks = true;

        assertEquals("html", d.getName());
        assertEquals("pub", d.getPublicIdentifier());
        assertEquals("sys", d.getSystemIdentifier());
        assertTrue(d.isForceQuirks());
    }

    @Test
    public void testAsDoctype() {
        Token t = new Doctype();
        assertTrue(t.isDoctype());
        assertSame(t, t.asDoctype());
    }

    // ---------- Tag.name() boundary ----------

    @Test(expected = IllegalArgumentException.class)
    // สมมติฐาน: Validate.isFalse(true) จะ throw IllegalArgumentException ตาม jsoup Validate มาตรฐาน
    public void testNameThrowsWhenTagNameEmpty() {
        StartTag tag = new StartTag();
        tag.name(""); // tagName.length() == 0
        tag.name(); // ควร throw
    }

    @Test
    public void testNameSetterAndGetter() {
        StartTag tag = new StartTag();
        Token.Tag returned = tag.name("div");
        assertSame(tag, returned); // name() setter คืน this
        assertEquals("div", tag.name());
        assertEquals("div", tag.tagName);
    }

    // ---------- appendTagName ----------

    @Test
    public void testAppendTagNameWhenTagNameNull() {
        EndTag tag = new EndTag(); // tagName ไม่ถูกตั้งค่า -> null
        assertNull(tag.tagName);
        tag.appendTagName("div");
        assertEquals("div", tag.tagName);
    }

    @Test
    public void testAppendTagNameWhenTagNameNotNull() {
        EndTag tag = new EndTag();
        tag.name("div");
        tag.appendTagName("span");
        assertEquals("divspan", tag.tagName);
    }

    @Test
    public void testAppendTagNameCharOverload() {
        EndTag tag = new EndTag();
        tag.name("a");
        tag.appendTagName('b');
        assertEquals("ab", tag.tagName);
    }

    // ---------- appendAttributeName ----------

    @Test
    public void testAppendAttributeNameNullThenNotNull() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("id");   // pendingAttributeName null -> set
        tag.appendAttributeName("Name"); // pendingAttributeName not null -> concat
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
        assertTrue(tag.getAttributes().hasKey("idName"));
    }

    @Test
    public void testAppendAttributeNameCharOverload() {
        StartTag tag = new StartTag();
        tag.appendAttributeName('x');
        tag.newAttribute();
        assertTrue(tag.getAttributes().hasKey("x"));
    }

    // ---------- appendAttributeValue ----------

    @Test
    public void testAppendAttributeValueNullThenNotNull() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("class");
        tag.appendAttributeValue("foo");
        tag.appendAttributeValue("bar"); // pendingAttributeValue not null -> append
        tag.newAttribute();
        assertEquals("foobar", tag.getAttributes().get("class"));
    }

    @Test
    public void testAppendAttributeValueCharOverload() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("y");
        tag.appendAttributeValue('1');
        tag.newAttribute();
        assertEquals("1", tag.getAttributes().get("y"));
    }

    // ---------- newAttribute branches ----------

    @Test
    public void testNewAttributeAttributesNullBranch() {
        EndTag tag = new EndTag(); // EndTag: attributes == null ตอนแรก
        assertNull(tag.getAttributes());
        tag.appendAttributeName("attr");
        tag.newAttribute(); // attributes สร้างใหม่ (null branch)
        assertNotNull(tag.getAttributes());
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testNewAttributeNoPendingNameDoesNothing() {
        StartTag tag = new StartTag(); // attributes ถูกสร้างแล้วใน constructor
        tag.newAttribute(); // pendingAttributeName == null -> ไม่เพิ่ม attribute
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testNewAttributeWithNullPendingValue() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("checked"); // ไม่เรียก appendAttributeValue -> pendingAttributeValue == null
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("checked"));
    }

    @Test
    public void testNewAttributeResetsPendingValueAfterCall() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("a");
        tag.appendAttributeValue("1");
        tag.newAttribute(); // เพิ่ม a=1 และ reset pendingAttributeValue (delete แต่ไม่ null)

        tag.appendAttributeName("b");
        tag.newAttribute(); // pendingAttributeValue ไม่ null แต่ว่าง -> attribute b=""

        assertEquals(2, tag.getAttributes().size());
        assertEquals("1", tag.getAttributes().get("a"));
        assertEquals("", tag.getAttributes().get("b"));
    }

    // ---------- finaliseTag ----------

    @Test
    public void testFinaliseTagWithPendingAttributeName() {
        StartTag tag = new StartTag();
        tag.appendAttributeName("checked");
        tag.finaliseTag(); // pendingAttributeName != null -> เรียก newAttribute()
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testFinaliseTagWithoutPendingAttributeName() {
        StartTag tag = new StartTag();
        tag.finaliseTag(); // pendingAttributeName == null -> ไม่ทำอะไร
        assertEquals(0, tag.getAttributes().size());
    }

    // ---------- isSelfClosing ----------

    @Test
    public void testIsSelfClosingDefaultFalseAndTrue() {
        StartTag tag = new StartTag();
        assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    // ---------- StartTag constructors & toString ----------

    @Test
    public void testStartTagDefaultConstructor() {
        StartTag tag = new StartTag();
        assertEquals(Token.TokenType.StartTag, tag.type);
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testStartTagNameConstructor() {
        StartTag tag = new StartTag("div");
        assertEquals("div", tag.tagName);
        assertNotNull(tag.getAttributes());
    }

    @Test
    public void testStartTagNameAndAttributesConstructor() {
        org.jsoup.nodes.Attributes attrs = new org.jsoup.nodes.Attributes();
        attrs.put("id", "1");
        StartTag tag = new StartTag("div", attrs);
        assertEquals("div", tag.tagName);
        assertSame(attrs, tag.getAttributes());
    }

    @Test
    public void testStartTagToStringWithoutAttributes() {
        StartTag tag = new StartTag("br"); // attributes.size() == 0 -> else branch
        assertEquals("<br>", tag.toString());
    }

    @Test
    public void testStartTagToStringWithAttributes() {
        StartTag tag = new StartTag("a");
        tag.attributes.put("href", "test"); // attributes.size() > 0 -> if branch
        String result = tag.toString();
        assertTrue(result.startsWith("<a "));
        assertTrue(result.endsWith(">"));
    }

    // ---------- EndTag ----------

    @Test
    public void testEndTagConstructorsAndToString() {
        EndTag tag1 = new EndTag();
        assertEquals(Token.TokenType.EndTag, tag1.type);

        EndTag tag2 = new EndTag("div");
        assertEquals("div", tag2.tagName);
        assertEquals("</div>", tag2.toString());
    }

    @Test
    public void testAsEndTagAndIsEndTag() {
        Token t = new EndTag("p");
        assertTrue(t.isEndTag());
        assertSame(t, t.asEndTag());
    }

    // ---------- Comment ----------

    @Test
    public void testCommentGetDataAndToString() {
        Comment comment = new Comment();
        comment.data.append("hello");
        assertEquals("hello", comment.getData());
        assertEquals("<!--hello-->", comment.toString());
        assertTrue(comment.isComment());
        assertSame(comment, comment.asComment());
    }

    @Test
    public void testCommentEmptyData() {
        Comment comment = new Comment();
        assertEquals("", comment.getData());
        assertEquals("<!---->", comment.toString());
    }

    // ---------- Character ----------

    @Test
    public void testCharacterGetDataAndToString() {
        Character ch = new Character("text");
        assertEquals("text", ch.getData());
        assertEquals("text", ch.toString());
        assertTrue(ch.isCharacter());
        assertSame(ch, ch.asCharacter());
    }

    @Test
    public void testCharacterEmptyString() {
        Character ch = new Character("");
        assertEquals("", ch.getData());
        assertEquals("", ch.toString());
    }

    // ---------- EOF ----------

    @Test
    public void testEOF() {
        EOF eof = new EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
        assertTrue(eof.isEOF());
    }

    // ---------- tokenType() ----------

    @Test
    public void testTokenTypeReturnsSimpleClassName() {
        StartTag tag = new StartTag("div");
        assertEquals("StartTag", tag.tokenType());

        Doctype d = new Doctype();
        assertEquals("Doctype", d.tokenType());
    }

    // ---------- is/as negative checks (type mismatch) ----------

    @Test
    public void testIsMethodsReturnFalseForWrongType() {
        Token t = new StartTag("div");
        assertFalse(t.isDoctype());
        assertFalse(t.isEndTag());
        assertFalse(t.isComment());
        assertFalse(t.isCharacter());
        assertFalse(t.isEOF());
        assertTrue(t.isStartTag());
    }

    @Test(expected = ClassCastException.class)
    public void testAsDoctypeThrowsOnWrongType() {
        Token t = new StartTag("div");
        t.asDoctype(); // cast ผิดชนิด -> ClassCastException
    }
}
```

## ตารางสรุป Test Method ↔ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testDoctypeDefaults | ค่า default ของ Doctype (name/public/system ว่าง, forceQuirks=false), isDoctype() true |
| testDoctypeWithAppendedValues | Doctype เมื่อมีการ append ค่า + forceQuirks=true |
| testAsDoctype | isDoctype()/asDoctype() cast ปกติ |
| testNameThrowsWhenTagNameEmpty | Tag.name() เมื่อ tagName.length()==0 → throw (boundary ว่าง) |
| testNameSetterAndGetter | Tag.name(String) setter + name() getter กรณีปกติ (length>0) |
| testAppendTagNameWhenTagNameNull | appendTagName(String): tagName==null branch |
| testAppendTagNameWhenTagNameNotNull | appendTagName(String): tagName!=null (concat) branch |
| testAppendTagNameCharOverload | appendTagName(char) overload |
| testAppendAttributeNameNullThenNotNull | appendAttributeName: pendingAttributeName null → not null (concat) ทั้งสอง branch |
| testAppendAttributeNameCharOverload | appendAttributeName(char) overload |
| testAppendAttributeValueNullThenNotNull | appendAttributeValue: pendingAttributeValue null → not null (append) ทั้งสอง branch |
| testAppendAttributeValueCharOverload | appendAttributeValue(char) overload |
| testNewAttributeAttributesNullBranch | newAttribute(): attributes==null → สร้างใหม่ |
| testNewAttributeNoPendingNameDoesNothing | newAttribute(): pendingAttributeName==null → ไม่เพิ่ม attribute |
| testNewAttributeWithNullPendingValue | newAttribute(): pendingAttributeValue==null → value="" |
| testNewAttributeResetsPendingValueAfterCall | newAttribute(): pendingAttributeValue!=null (reset/delete) branch |
| testFinaliseTagWithPendingAttributeName | finaliseTag(): pendingAttributeName!=null → เรียก newAttribute() |
| testFinaliseTagWithoutPendingAttributeName | finaliseTag(): pendingAttributeName==null → ไม่ทำอะไร |
| testIsSelfClosingDefaultFalseAndTrue | isSelfClosing() ค่า default/true |
| testStartTagDefaultConstructor | StartTag() constructor, attributes ถูกสร้าง |
| testStartTagNameConstructor | StartTag(String) constructor |
| testStartTagNameAndAttributesConstructor | StartTag(String, Attributes) constructor |
| testStartTagToStringWithoutAttributes | toString(): attributes.size()==0 → else branch |
| testStartTagToStringWithAttributes | toString(): attributes.size()>0 → if branch |
| testEndTagConstructorsAndToString | EndTag() / EndTag(String) + toString() |
| testAsEndTagAndIsEndTag | isEndTag()/asEndTag() |
| testCommentGetDataAndToString | Comment.getData()/toString() มีข้อมูล |
| testCommentEmptyData | Comment ว่าง (boundary) |
| testCharacterGetDataAndToString | Character.getData()/toString() มีข้อมูล |
| testCharacterEmptyString | Character ค่าว่าง (boundary) |
| testEOF | EOF type & isEOF() |
| testTokenTypeReturnsSimpleClassName | tokenType() คืนชื่อคลาสถูกต้อง หลายชนิด |
| testIsMethodsReturnFalseForWrongType | is* ทั้งหมดคืน false เมื่อชนิดไม่ตรง (negative case) |
| testAsDoctypeThrowsOnWrongType | cast ผิดชนิด → ClassCastException |

**หมายเหตุสำคัญ:**
- สมมติฐานเรื่อง `Validate.isFalse(true)` throw `IllegalArgumentException` อ้างอิงพฤติกรรมมาตรฐานของ jsoup `Validate` class (ไม่มีอยู่ใน source ที่ให้มาโดยตรง) — หากพฤติกรรมจริงต่างจากนี้ ต้องปรับ `expected` ของ test
- สมมติฐานเรื่อง method `Attributes.put(String,String)`, `Attributes.get(String)`, `Attributes.hasKey(String)`, `Attributes.size()` อ้างอิงจาก jsoup API มาตรฐาน (ไม่ได้อยู่ใน source ของ Token ที่ให้มา)