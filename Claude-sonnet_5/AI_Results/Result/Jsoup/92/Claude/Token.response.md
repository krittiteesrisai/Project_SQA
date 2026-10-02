# TokenTest.java

หมายเหตุสำคัญก่อนเริ่ม:
- คลาส `Token` และ nested classes เป็น package-private จึงต้องวาง `TokenTest` ไว้ใน package `org.jsoup.parser` เดียวกัน (ไม่ต้อง import `Token`)
- ฟิลด์ `tagName`, `normalName`, `attributes`, `selfClosing` ใน `Tag` เป็น `protected`/package-visible จึงเข้าถึงได้ตรงจาก test (same package) เพื่อตรวจสอบ state หลัง `reset()` โดยไม่ต้องเรียก `name()` (ซึ่งจะ throw ถ้า tagName เป็น null/empty)
- สมมติฐานที่ไม่ชัดเจน 100% จากซอร์สที่ให้มา (เช่น exception type ของ `Validate.isFalse`, format ของ `Attributes.toString()`) จะ **คอมเมนต์กำกับไว้**

```java
package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    // ---------- Token.reset(StringBuilder) static helper ----------

    @Test
    public void testResetStaticSb_NullSafe() {
        // branch: sb == null -> no-op, must not throw
        Token.reset(null);
    }

    @Test
    public void testResetStaticSb_NonNullClears() {
        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    // ---------- Doctype ----------

    @Test
    public void testDoctypeDefaultState() {
        Token.Doctype d = new Token.Doctype();
        assertEquals(Token.TokenType.Doctype, d.type);
        assertEquals("", d.getName());
        assertNull(d.getPubSysKey());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void testDoctypeResetRestoresDefaults() {
        Token.Doctype d = new Token.Doctype();
        d.name.append("html");
        d.pubSysKey = "PUBLIC";
        d.publicIdentifier.append("pub");
        d.systemIdentifier.append("sys");
        d.forceQuirks = true;

        Token result = d.reset();

        assertSame(d, result);
        assertEquals("", d.getName());
        assertNull(d.getPubSysKey());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void testDoctypeGetters() {
        Token.Doctype d = new Token.Doctype();
        d.name.append("myName");
        d.pubSysKey = "key";
        d.publicIdentifier.append("pubId");
        d.systemIdentifier.append("sysId");
        d.forceQuirks = true;

        assertEquals("myName", d.getName());
        assertEquals("key", d.getPubSysKey());
        assertEquals("pubId", d.getPublicIdentifier());
        assertEquals("sysId", d.getSystemIdentifier());
        assertTrue(d.isForceQuirks());
    }

    // ---------- Tag.newAttribute() branches (use EndTag: attributes starts null) ----------

    @Test
    public void testTagNewAttribute_NoPendingName_NotAdded() {
        Token.EndTag tag = new Token.EndTag();
        // no appendAttributeName called -> pendingAttributeName == null branch
        tag.newAttribute();
        // attributes object is created (first branch), but nothing added
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTagNewAttribute_WhitespaceOnlyName_NotAddedAfterTrim() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("   "); // trims to empty -> branch: length()==0 -> skip
        tag.newAttribute();
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTagNewAttribute_CreatesAttributesWhenNull() {
        Token.EndTag tag = new Token.EndTag();
        assertNull(tag.attributes); // default null before any newAttribute call
        tag.newAttribute();
        assertNotNull(tag.attributes); // branch: attributes == null -> created
    }

    @Test
    public void testTagNewAttribute_EmptyAttributeValueBranch() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("disabled");
        tag.setEmptyAttributeValue(); // hasEmptyAttributeValue = true
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
        assertEquals("", tag.getAttributes().get("disabled"));
    }

    @Test
    public void testTagNewAttribute_NoValueBranch_NullValue() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("boolAttr");
        // no value appended, no setEmptyAttributeValue -> value = null branch
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
        // สมมติฐาน: Attributes.get() คืน null เมื่อ stored value เป็น null ตามพฤติกรรม jsoup Attributes
        assertNull(tag.getAttributes().get("boolAttr"));
    }

    @Test
    public void testTagNewAttribute_PendingValueS_SingleAppend() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("href");
        tag.appendAttributeValue("single"); // first time -> pendingAttributeValueS path
        tag.newAttribute();
        assertEquals("single", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagNewAttribute_PendingValueBuilder_MultipleStringAppends() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("href");
        tag.appendAttributeValue("ab");
        tag.appendAttributeValue("cd"); // triggers move to builder + append path
        tag.newAttribute();
        assertEquals("abcd", tag.getAttributes().get("href"));
    }

    @Test
    public void testTagAppendAttributeValueChar() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue('y');
        tag.newAttribute();
        assertEquals("y", tag.getAttributes().get("x"));
    }

    @Test
    public void testTagAppendAttributeValueCharArray() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue(new char[]{'y', 'z'});
        tag.newAttribute();
        assertEquals("yz", tag.getAttributes().get("x"));
    }

    @Test
    public void testTagAppendAttributeValueIntArray_NonEmpty() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue(new int[]{'a', 'b', 'c'}); // loop body executes branch
        tag.newAttribute();
        assertEquals("abc", tag.getAttributes().get("x"));
    }

    @Test
    public void testTagAppendAttributeValueIntArray_Empty() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("x");
        tag.appendAttributeValue(new int[]{}); // loop doesn't execute branch
        tag.newAttribute();
        // hasPendingAttributeValue=true but builder length==0 and pendingAttributeValueS null -> value null
        assertNull(tag.getAttributes().get("x"));
    }

    @Test
    public void testTagFinaliseTag_AddsPendingAttribute() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("finAttr");
        tag.appendAttributeValue("v");
        tag.finaliseTag(); // branch: pendingAttributeName != null -> newAttribute()
        assertEquals(1, tag.getAttributes().size());
        assertEquals("v", tag.getAttributes().get("finAttr"));
    }

    @Test
    public void testTagFinaliseTag_NoPendingDoesNothing() {
        Token.EndTag tag = new Token.EndTag();
        tag.finaliseTag(); // pendingAttributeName == null -> skip newAttribute
        assertNull(tag.attributes); // still untouched
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameThrowsWhenNullTagName() {
        // สมมติฐาน: Validate.isFalse throws IllegalArgumentException เมื่อเงื่อนไขเป็น true
        Token.EndTag tag = new Token.EndTag();
        tag.name(); // tagName == null
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTagNameThrowsWhenEmptyTagName() {
        Token.EndTag tag = new Token.EndTag();
        tag.name(""); // set empty tagName
        tag.name(); // tagName.length() == 0 branch
    }

    @Test
    public void testTagNameAndNormalName() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("DIV");
        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());
    }

    @Test
    public void testTagAppendTagNameFromNullAndConcat() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendTagName("di"); // tagName == null branch
        assertEquals("di", tag.tagName);
        tag.appendTagName("v"); // tagName != null -> concat branch
        assertEquals("div", tag.tagName);
        assertEquals("div", tag.normalName);
    }

    @Test
    public void testTagAppendTagNameChar() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendTagName('a');
        assertEquals("a", tag.tagName);
    }

    @Test
    public void testTagAppendAttributeNameFromNullAndConcat() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName("cl"); // pendingAttributeName == null branch
        tag.appendAttributeName("ass"); // concat branch
        tag.appendAttributeValue("x");
        tag.newAttribute();
        assertEquals("x", tag.getAttributes().get("class"));
    }

    @Test
    public void testTagAppendAttributeNameChar() {
        Token.EndTag tag = new Token.EndTag();
        tag.appendAttributeName('i');
        tag.appendAttributeName('d');
        tag.appendAttributeValue("5");
        tag.newAttribute();
        assertEquals("5", tag.getAttributes().get("id"));
    }

    @Test
    public void testTagIsSelfClosingDefaultFalse() {
        Token.EndTag tag = new Token.EndTag();
        assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testTagReset() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("p");
        tag.appendAttributeName("a");
        tag.appendAttributeValue("v");
        tag.newAttribute();
        tag.selfClosing = true;

        Token result = tag.reset();

        assertSame(tag, result);
        assertNull(tag.tagName);
        assertNull(tag.normalName);
        assertFalse(tag.selfClosing);
        assertNull(tag.attributes); // Tag.reset() sets attributes = null
    }

    // ---------- StartTag ----------

    @Test
    public void testStartTagConstructorInitializesAttributes() {
        Token.StartTag tag = new Token.StartTag();
        assertEquals(Token.TokenType.StartTag, tag.type);
        assertNotNull(tag.attributes);
        assertEquals(0, tag.attributes.size());
    }

    @Test
    public void testStartTagResetReinitializesAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("a");
        tag.appendAttributeValue("1");
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());

        tag.reset();

        assertNull(tag.tagName);
        assertNotNull(tag.attributes); // StartTag.reset re-creates attributes (not null)
        assertEquals(0, tag.attributes.size());
    }

    @Test
    public void testStartTagNameAttr() {
        Token.StartTag tag = new Token.StartTag();
        Attributes attrs = new Attributes();
        attrs.put("k", "v");
        Token.StartTag result = tag.nameAttr("SPAN", attrs);

        assertSame(tag, result);
        assertEquals("SPAN", tag.name());
        assertEquals("span", tag.normalName());
        assertSame(attrs, tag.getAttributes());
    }

    @Test
    public void testStartTagToString_NoAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("br");
        // attributes != null but size == 0 -> else branch
        assertEquals("<br>", tag.toString());
    }

    @Test
    public void testStartTagToString_WithAttributes() {
        Token.StartTag tag = new Token.StartTag();
        tag.name("div");
        tag.appendAttributeName("id");
        tag.appendAttributeValue("main");
        tag.newAttribute();
        // branch: attributes != null && size() > 0
        String out = tag.toString();
        // ไม่ assert รูปแบบเต็มของ Attributes.toString() (ไม่แน่ใจ format) เช็คเฉพาะโครงสร้างที่แน่นอนจากซอร์ส Token
        assertTrue(out.startsWith("<div "));
        assertTrue(out.endsWith(">"));
    }

    // ---------- EndTag ----------

    @Test
    public void testEndTagToString() {
        Token.EndTag tag = new Token.EndTag();
        tag.name("p");
        assertEquals("</p>", tag.toString());
        assertEquals(Token.TokenType.EndTag, tag.type);
    }

    @Test
    public void testEndTagAttributesNullByDefault() {
        Token.EndTag tag = new Token.EndTag();
        assertNull(tag.attributes);
    }

    // ---------- Comment ----------

    @Test
    public void testCommentDefaultState() {
        Token.Comment c = new Token.Comment();
        assertEquals(Token.TokenType.Comment, c.type);
        assertEquals("", c.getData());
        assertFalse(c.bogus);
    }

    @Test
    public void testCommentResetAndGetters() {
        Token.Comment c = new Token.Comment();
        c.data.append("hello");
        c.bogus = true;
        assertEquals("hello", c.getData());

        Token result = c.reset();
        assertSame(c, result);
        assertEquals("", c.getData());
        assertFalse(c.bogus);
    }

    @Test
    public void testCommentToString() {
        Token.Comment c = new Token.Comment();
        c.data.append("note");
        assertEquals("<!--note-->", c.toString());
    }

    // ---------- Character ----------

    @Test
    public void testCharacterDataAndReset() {
        Token.Character ch = new Token.Character();
        assertEquals(Token.TokenType.Character, ch.type);
        assertNull(ch.getData());

        Token.Character result = ch.data("abc");
        assertSame(ch, result);
        assertEquals("abc", ch.getData());

        ch.reset();
        assertNull(ch.getData());
    }

    @Test
    public void testCharacterToString() {
        Token.Character ch = new Token.Character();
        ch.data("xyz");
        assertEquals("xyz", ch.toString());
    }

    // ---------- CData ----------

    @Test
    public void testCDataToString() {
        Token.CData cData = new Token.CData("payload");
        assertEquals("payload", cData.getData());
        assertEquals("<![CDATA[payload]]>", cData.toString());
    }

    @Test
    public void testCDataToStringWithNullData() {
        // edge case: null data passed to constructor -> String concat prints "null"
        Token.CData cData = new Token.CData(null);
        assertNull(cData.getData());
        assertEquals("<![CDATA[null]]>", cData.toString());
    }

    @Test
    public void testCDataIsCharacterButIsCDataTrue() {
        Token.CData cData = new Token.CData("x");
        assertTrue(cData.isCharacter()); // type inherited as Character
        assertTrue(cData.isCData());     // instanceof CData branch true
    }

    @Test
    public void testIsCDataFalseForPlainCharacter() {
        Token.Character ch = new Token.Character();
        assertFalse(ch.isCData()); // instanceof CData branch false
    }

    // ---------- EOF ----------

    @Test
    public void testEOFResetReturnsSelfAndTypePreserved() {
        Token.EOF eof = new Token.EOF();
        assertEquals(Token.TokenType.EOF, eof.type);
        Token result = eof.reset();
        assertSame(eof, result);
        assertEquals(Token.TokenType.EOF, eof.type);
    }

    // ---------- tokenType() ----------

    @Test
    public void testTokenTypeNames() {
        assertEquals("Doctype", new Token.Doctype().tokenType());
        assertEquals("StartTag", new Token.StartTag().tokenType());
        assertEquals("EndTag", new Token.EndTag().tokenType());
        assertEquals("Comment", new Token.Comment().tokenType());
        assertEquals("Character", new Token.Character().tokenType());
        assertEquals("CData", new Token.CData("d").tokenType());
        assertEquals("EOF", new Token.EOF().tokenType());
    }

    // ---------- is*/as* dispatch methods ----------

    @Test
    public void testIsAsDoctype() {
        Token.Doctype d = new Token.Doctype();
        assertTrue(d.isDoctype());
        assertFalse(d.isStartTag());
        assertFalse(d.isEndTag());
        assertFalse(d.isComment());
        assertFalse(d.isCharacter());
        assertFalse(d.isEOF());
        assertSame(d, d.asDoctype());
    }

    @Test
    public void testIsAsStartTag() {
        Token.StartTag s = new Token.StartTag();
        assertTrue(s.isStartTag());
        assertFalse(s.isDoctype());
        assertFalse(s.isEndTag());
        assertSame(s, s.asStartTag());
    }

    @Test
    public void testIsAsEndTag() {
        Token.EndTag e = new Token.EndTag();
        assertTrue(e.isEndTag());
        assertFalse(e.isStartTag());
        assertSame(e, e.asEndTag());
    }

    @Test
    public void testIsAsComment() {
        Token.Comment c = new Token.Comment();
        assertTrue(c.isComment());
        assertFalse(c.isDoctype());
        assertSame(c, c.asComment());
    }

    @Test
    public void testIsAsCharacter() {
        Token.Character ch = new Token.Character();
        assertTrue(ch.isCharacter());
        assertFalse(ch.isComment());
        assertSame(ch, ch.asCharacter());
    }

    @Test
    public void testIsAsEOF() {
        Token.EOF eof = new Token.EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isCharacter());
    }
}
```

# ตารางสรุป Branch/Condition coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| testResetStaticSb_NullSafe / testResetStaticSb_NonNullClears | `Token.reset(sb)`: sb == null และ sb != null |
| testDoctypeDefaultState / testDoctypeResetRestoresDefaults / testDoctypeGetters | `Doctype.reset()`, getters ทั้งหมด, ค่า default/ค่าที่ถูก set |
| testTagNewAttribute_NoPendingName_NotAdded | `newAttribute()`: pendingAttributeName == null |
| testTagNewAttribute_WhitespaceOnlyName_NotAddedAfterTrim | `newAttribute()`: trim แล้ว length()==0 |
| testTagNewAttribute_CreatesAttributesWhenNull | `newAttribute()`: attributes == null branch |
| testTagNewAttribute_EmptyAttributeValueBranch | `newAttribute()`: hasEmptyAttributeValue == true -> value="" |
| testTagNewAttribute_NoValueBranch_NullValue | `newAttribute()`: ไม่มีทั้ง hasPendingAttributeValue/hasEmptyAttributeValue -> value=null |
| testTagNewAttribute_PendingValueS_SingleAppend | `newAttribute()`: hasPendingAttributeValue, builder length()==0 -> ใช้ pendingAttributeValueS |
| testTagNewAttribute_PendingValueBuilder_MultipleStringAppends | `appendAttributeValue(String)` สองครั้ง -> ย้ายไป builder, `newAttribute()` length()>0 branch |
| testTagAppendAttributeValueChar/CharArray | `appendAttributeValue(char)`/`(char[])` และ `ensureAttributeValue()` |
| testTagAppendAttributeValueIntArray_NonEmpty/_Empty | loop ของ `appendAttributeValue(int[])` ทั้งกรณี execute และไม่ execute |
| testTagFinaliseTag_AddsPendingAttribute / _NoPendingDoesNothing | `finaliseTag()`: pendingAttributeName != null / == null |
| testTagNameThrowsWhenNullTagName / _EmptyTagName | `name()`: Validate.isFalse เงื่อนไข true (null, empty) |
| testTagNameAndNormalName | `name()`, `normalName()`, `name(String)` |
| testTagAppendTagNameFromNullAndConcat / Char | `appendTagName`: tagName==null vs concat |
| testTagAppendAttributeNameFromNullAndConcat / Char | `appendAttributeName`: pendingAttributeName==null vs concat |
| testTagIsSelfClosingDefaultFalse | `isSelfClosing()` true/false |
| testTagReset | `Tag.reset()` ทุกฟิลด์ |
| testStartTagConstructorInitializesAttributes / ResetReinitializesAttributes / NameAttr | `StartTag` constructor, reset(), nameAttr() |
| testStartTagToString_NoAttributes / _WithAttributes | `StartTag.toString()`: attributes==null\|\|size()==0 vs size()>0 |
| testEndTagToString / AttributesNullByDefault | `EndTag.toString()`, default attributes null |
| testCommentDefaultState / ResetAndGetters / ToString | `Comment.reset()`, getData(), toString() |
| testCharacterDataAndReset / ToString | `Character.reset()`, data(), getData(), toString() |
| testCDataToString / _NullData / IsCharacterButIsCDataTrue | `CData` constructor/toString, `isCData()` true branch |
| testIsCDataFalseForPlainCharacter | `isCData()` false branch (instanceof false) |
| testEOFResetReturnsSelfAndTypePreserved | `EOF.reset()` |
| testTokenTypeNames | `tokenType()` สำหรับทุก subclass |
| testIsAsDoctype/StartTag/EndTag/Comment/Character/EOF | ทุก `isXxx()`/`asXxx()` ทั้ง true/false branch ของ `type == TokenType.X` |