package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token.Character;
import org.jsoup.parser.Token.Comment;
import org.jsoup.parser.Token.Doctype;
import org.jsoup.parser.Token.EOF;
import org.jsoup.parser.Token.EndTag;
import org.jsoup.parser.Token.StartTag;
import org.jsoup.parser.Token.TokenType;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokenTest {

    // ---------- Token.reset(StringBuilder) static method ----------

    @Test
    public void testStaticReset_nullStringBuilder_doesNotThrow() {
        // branch: sb == null -> skip
        Token.reset(null);
    }

    @Test
    public void testStaticReset_nonNullStringBuilder_clearsContent() {
        // branch: sb != null -> delete content
        StringBuilder sb = new StringBuilder("hello");
        Token.reset(sb);
        assertEquals(0, sb.length());
    }

    // ---------- Doctype ----------

    @Test
    public void testDoctype_initialState() {
        Doctype d = new Doctype();
        assertEquals(TokenType.Doctype, d.type);
        assertEquals("", d.getName());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void testDoctype_resetAfterModification() {
        Doctype d = new Doctype();
        d.name.append("html");
        d.publicIdentifier.append("pub");
        d.systemIdentifier.append("sys");
        d.forceQuirks = true;

        d.reset();

        assertEquals("", d.getName());
        assertEquals("", d.getPublicIdentifier());
        assertEquals("", d.getSystemIdentifier());
        assertFalse(d.isForceQuirks());
    }

    @Test
    public void testDoctype_forceQuirksFlag() {
        Doctype d = new Doctype();
        assertFalse(d.isForceQuirks());
        d.forceQuirks = true;
        assertTrue(d.isForceQuirks());
    }

    // ---------- Tag.name() validation ----------

    // สมมติฐาน: Validate.isFalse(true) จะ throw IllegalArgumentException
    // (ไม่สามารถยืนยัน exact exception type จาก source ของ Token ที่ให้มาได้ตรง ๆ
    // เพราะ Validate class ไม่ได้แสดงใน source นี้)
    @Test(expected = IllegalArgumentException.class)
    public void testTag_name_nullTagName_throws() {
        StartTag tag = new StartTag();
        tag.name(); // tagName is null by default -> should throw
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTag_name_emptyTagName_throws() {
        StartTag tag = new StartTag();
        tag.name(""); // sets tagName = ""
        tag.name();   // length == 0 -> should throw
    }

    @Test
    public void testTag_name_validPreservesCase_normalNameLowercase() {
        StartTag tag = new StartTag();
        tag.name("DIV");
        assertEquals("DIV", tag.name());
        assertEquals("div", tag.normalName());
    }

    // ---------- Tag.appendTagName ----------

    @Test
    public void testTag_appendTagName_whenTagNameNull() {
        StartTag tag = new StartTag();
        tag.appendTagName("div"); // branch: tagName == null
        assertEquals("div", tag.name());
        assertEquals("div", tag.normalName());
    }

    @Test
    public void testTag_appendTagName_whenTagNameNotNull_concat() {
        StartTag tag = new StartTag();
        tag.name("di");
        tag.appendTagName("v"); // branch: tagName != null -> concat
        assertEquals("div", tag.name());
    }

    @Test
    public void testTag_appendTagName_charOverload() {
        StartTag tag = new StartTag();
        tag.appendTagName('a');
        assertEquals("a", tag.name());
    }

    // ---------- Tag.appendAttributeName ----------

    @Test
    public void testTag_appendAttributeName_whenNull() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("cla"); // branch: pendingAttributeName == null
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
        assertTrue(tag.getAttributes().size() > 0);
    }

    @Test
    public void testTag_appendAttributeName_whenNotNull_concat() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("cla");
        tag.appendAttributeName("ss"); // branch: concat
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("class"));
    }

    @Test
    public void testTag_appendAttributeName_charOverload() {
        EndTag tag = new EndTag();
        tag.appendAttributeName('a');
        tag.newAttribute();
        assertEquals(1, tag.getAttributes().size());
    }

    // ---------- Tag.appendAttributeValue variants ----------

    @Test
    public void testTag_appendAttributeValue_singleCall_usesStringVariant() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("id");
        tag.appendAttributeValue("xyz"); // single call -> pendingAttributeValueS path
        tag.newAttribute();
        assertEquals("xyz", tag.getAttributes().get("id"));
    }

    @Test
    public void testTag_appendAttributeValue_multipleCalls_usesBuilderVariant() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("id");
        tag.appendAttributeValue("abc");
        tag.appendAttributeValue("def"); // second call -> moves to StringBuilder path
        tag.newAttribute();
        assertEquals("abcdef", tag.getAttributes().get("id"));
    }

    @Test
    public void testTag_appendAttributeValue_charOverload() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("a");
        tag.appendAttributeValue('x');
        tag.newAttribute();
        assertEquals("x", tag.getAttributes().get("a"));
    }

    @Test
    public void testTag_appendAttributeValue_charArrayOverload() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("b");
        tag.appendAttributeValue(new char[]{'y', 'z'});
        tag.newAttribute();
        assertEquals("yz", tag.getAttributes().get("b"));
    }

    @Test
    public void testTag_appendAttributeValue_intArrayOverload_loopsCodepoints() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("c");
        tag.appendAttributeValue(new int[]{'h', 'i'}); // tests loop over codepoints
        tag.newAttribute();
        assertEquals("hi", tag.getAttributes().get("c"));
    }

    @Test
    public void testTag_appendAttributeValue_intArrayEmpty_loopZeroIterations() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("c");
        tag.appendAttributeValue(new int[]{}); // loop with 0 iterations
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("c"));
    }

    // ---------- Tag.setEmptyAttributeValue ----------

    @Test
    public void testTag_setEmptyAttributeValue() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("disabled");
        tag.setEmptyAttributeValue();
        tag.newAttribute();
        assertEquals("", tag.getAttributes().get("disabled"));
    }

    // ---------- Tag.newAttribute branches ----------

    @Test
    public void testTag_newAttribute_booleanAttribute_whenNoValueSet() {
        EndTag tag = new EndTag();
        assertNull(tag.getAttributes()); // branch: attributes == null initially
        tag.appendAttributeName("checked");
        tag.newAttribute(); // hasPendingAttributeValue=false, hasEmptyAttributeValue=false -> BooleanAttribute
        assertNotNull(tag.getAttributes());
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_noOp_whenPendingNameNull() {
        EndTag tag = new EndTag();
        tag.newAttribute(); // branch: pendingAttributeName == null -> skip add, but creates Attributes
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testTag_newAttribute_multipleAttributesAccumulate() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("a");
        tag.appendAttributeValue("1");
        tag.newAttribute(); // attributes == null -> create; add "a"

        tag.appendAttributeName("b");
        tag.setEmptyAttributeValue();
        tag.newAttribute(); // attributes != null this time -> reuse; add "b"

        assertEquals(2, tag.getAttributes().size());
        assertEquals("1", tag.getAttributes().get("a"));
        assertEquals("", tag.getAttributes().get("b"));
    }

    // ---------- Tag.finaliseTag ----------

    @Test
    public void testTag_finaliseTag_withPendingName_addsAttribute() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("x");
        tag.finaliseTag(); // branch: pendingAttributeName != null -> newAttribute()
        assertEquals(1, tag.getAttributes().size());
    }

    @Test
    public void testTag_finaliseTag_withoutPendingName_doesNothing() {
        EndTag tag = new EndTag();
        tag.finaliseTag(); // branch: pendingAttributeName == null -> no-op
        assertNull(tag.getAttributes()); // newAttribute() never called
    }

    // ---------- Tag misc getters ----------

    @Test
    public void testTag_isSelfClosing() {
        StartTag tag = new StartTag();
        assertFalse(tag.isSelfClosing());
        tag.selfClosing = true;
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testTag_getAttributes() {
        StartTag tag = new StartTag();
        assertSame(tag.attributes, tag.getAttributes());
    }

    // ---------- Tag.reset ----------

    @Test
    public void testEndTag_reset_attributesBecomeNull() {
        EndTag tag = new EndTag();
        tag.appendAttributeName("x");
        tag.newAttribute();
        tag.name("div");
        tag.selfClosing = true;
        assertNotNull(tag.getAttributes());

        tag.reset();

        assertNull(tag.tagName);
        assertNull(tag.normalName);
        assertFalse(tag.selfClosing);
        assertNull(tag.getAttributes()); // base Tag.reset() sets attributes = null
    }

    // ---------- StartTag ----------

    @Test
    public void testStartTag_constructorInitializesAttributes() {
        StartTag tag = new StartTag();
        assertEquals(TokenType.StartTag, tag.type);
        assertNotNull(tag.getAttributes());
        assertEquals(0, tag.getAttributes().size());
    }

    @Test
    public void testStartTag_reset_recreatesEmptyAttributes() {
        StartTag tag = new StartTag();
        tag.name("div");
        tag.attributes.put("id", "1");
        tag.selfClosing = true;

        tag.reset();

        assertNull(tag.tagName);
        assertFalse(tag.selfClosing);
        assertNotNull(tag.attributes); // StartTag.reset() creates a new Attributes (not null)
        assertEquals(0, tag.attributes.size());
    }

    @Test
    public void testStartTag_nameAttr() {
        Attributes attrs = new Attributes();
        attrs.put("id", "1");
        StartTag tag = new StartTag().nameAttr("DIV", attrs);

        assertEquals("DIV", tag.tagName);
        assertEquals("div", tag.normalName);
        assertSame(attrs, tag.attributes);
    }

    @Test
    public void testStartTag_toString_withAttributes_branchSizeGreaterThanZero() {
        StartTag tag = new StartTag();
        tag.name("a");
        tag.attributes.put("href", "test");
        String s = tag.toString();
        assertTrue(s.startsWith("<a "));
        assertTrue(s.endsWith(">"));
        assertTrue(s.contains("href"));
    }

    @Test
    public void testStartTag_toString_withoutAttributes_branchSizeZero() {
        StartTag tag = new StartTag();
        tag.name("br");
        // attributes non-null but size()==0 -> else branch
        assertEquals("<br>", tag.toString());
    }

    @Test
    public void testStartTag_toString_attributesNull_branch() {
        StartTag tag = new StartTag();
        tag.name("br");
        tag.attributes = null; // explicit branch: attributes == null
        assertEquals("<br>", tag.toString());
    }

    // ---------- EndTag ----------

    @Test
    public void testEndTag_constructorAndToString() {
        EndTag tag = new EndTag();
        assertEquals(TokenType.EndTag, tag.type);
        assertNull(tag.getAttributes());
        tag.name("div");
        assertEquals("</div>", tag.toString());
    }

    // ---------- Comment ----------

    @Test
    public void testComment_defaultStateAndModification() {
        Comment c = new Comment();
        assertEquals(TokenType.Comment, c.type);
        assertEquals("", c.getData());
        assertFalse(c.bogus);

        c.data.append("hello");
        c.bogus = true;
        assertEquals("hello", c.getData());
        assertTrue(c.bogus);
    }

    @Test
    public void testComment_toStringAndReset() {
        Comment c = new Comment();
        c.data.append("hi");
        assertEquals("<!--hi-->", c.toString());

        c.bogus = true;
        c.reset();

        assertEquals("", c.getData());
        assertFalse(c.bogus);
    }

    // ---------- Character ----------

    @Test
    public void testCharacter_defaultNullAndSetData() {
        Character ch = new Character();
        assertEquals(TokenType.Character, ch.type);
        assertNull(ch.getData());

        ch.data("abc");
        assertEquals("abc", ch.getData());
        assertEquals("abc", ch.toString());
    }

    @Test
    public void testCharacter_resetSetsDataNull() {
        Character ch = new Character();
        ch.data("abc");
        ch.reset();
        assertNull(ch.getData());
    }

    // ---------- EOF ----------

    @Test
    public void testEOF_typeAndReset() {
        EOF eof = new EOF();
        assertEquals(TokenType.EOF, eof.type);
        Token result = eof.reset();
        assertSame(eof, result);
    }

    // ---------- Token type-check / cast methods ----------

    @Test
    public void testTypeChecks_Doctype() {
        Doctype d = new Doctype();
        assertTrue(d.isDoctype());
        assertSame(d, d.asDoctype());
        assertFalse(d.isStartTag());
        assertFalse(d.isEndTag());
        assertFalse(d.isComment());
        assertFalse(d.isCharacter());
        assertFalse(d.isEOF());
    }

    @Test
    public void testTypeChecks_StartTag() {
        StartTag s = new StartTag();
        assertTrue(s.isStartTag());
        assertSame(s, s.asStartTag());
        assertFalse(s.isDoctype());
        assertFalse(s.isEndTag());
    }

    @Test
    public void testTypeChecks_EndTag() {
        EndTag e = new EndTag();
        assertTrue(e.isEndTag());
        assertSame(e, e.asEndTag());
        assertFalse(e.isStartTag());
    }

    @Test
    public void testTypeChecks_Comment() {
        Comment c = new Comment();
        assertTrue(c.isComment());
        assertSame(c, c.asComment());
        assertFalse(c.isCharacter());
    }

    @Test
    public void testTypeChecks_Character() {
        Character ch = new Character();
        assertTrue(ch.isCharacter());
        assertSame(ch, ch.asCharacter());
        assertFalse(ch.isComment());
    }

    @Test
    public void testTypeChecks_EOF() {
        EOF eof = new EOF();
        assertTrue(eof.isEOF());
        assertFalse(eof.isDoctype());
    }

    @Test(expected = ClassCastException.class)
    public void testAsDoctype_onWrongType_throwsClassCastException() {
        StartTag tag = new StartTag();
        tag.asDoctype(); // type mismatch -> cast exception
    }

    // ---------- tokenType() ----------

    @Test
    public void testTokenType_returnsSimpleClassName() {
        assertEquals("Doctype", new Doctype().tokenType());
        assertEquals("StartTag", new StartTag().tokenType());
        assertEquals("EndTag", new EndTag().tokenType());
        assertEquals("Comment", new Comment().tokenType());
        assertEquals("Character", new Character().tokenType());
        assertEquals("EOF", new EOF().tokenType());
    }

    // ---------- TokenType enum ----------

    @Test
    public void testTokenTypeEnum_valuesAndValueOf() {
        TokenType[] values = TokenType.values();
        assertEquals(6, values.length);
        assertEquals(TokenType.Doctype, TokenType.valueOf("Doctype"));
        assertEquals(TokenType.StartTag, TokenType.valueOf("StartTag"));
        assertEquals(TokenType.EndTag, TokenType.valueOf("EndTag"));
        assertEquals(TokenType.Comment, TokenType.valueOf("Comment"));
        assertEquals(TokenType.Character, TokenType.valueOf("Character"));
        assertEquals(TokenType.EOF, TokenType.valueOf("EOF"));
    }
}
