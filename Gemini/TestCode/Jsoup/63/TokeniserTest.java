package org.jsoup.parser;

import org.jsoup.nodes.Entities;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TokeniserTest {

    private ParseErrorList errorList;

    @Before
    public void setUp() {
        errorList = ParseErrorList.tracking(10);
    }

    @Test
    public void testReadWithUnacknowledgedSelfClosingFlag() {
        CharacterReader reader = new CharacterReader("<br />");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        // Emit self-closing start tag to set selfClosingFlagAcknowledged = false
        tokeniser.read(); // Reads StartTag
        
        // Reading again should trigger the unacknowledged error branch
        Token token = tokeniser.read();
        assertNotNull(token);
        assertFalse(errorList.isEmpty());
        assertEquals("Self closing flag not acknowledged", errorList.get(0).getErrorMessage());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmitWhenAlreadyPendingThrowsException() {
        CharacterReader reader = new CharacterReader("<div></div>");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Token.StartTag tag1 = new Token.StartTag();
        tag1.name("div");
        tokeniser.emit(tag1);
        
        Token.StartTag tag2 = new Token.StartTag();
        tag2.name("span");
        tokeniser.emit(tag2); // Should throw IllegalArgumentException
    }

    @Test
    public void testEmitEndTagWithAttributesError() {
        CharacterReader reader = new CharacterReader("</div>");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("div");
        endTag.attributes = new org.jsoup.nodes.Attributes();
        endTag.attributes.put("class", "test");
        
        tokeniser.emit(endTag);
        assertFalse(errorList.isEmpty());
        assertEquals("Attributes incorrectly present on end tag", errorList.get(0).getErrorMessage());
    }

    @Test
    public void testEmitMultipleStringsTransitionsToStringBuilder() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        tokeniser.emit("First");
        tokeniser.emit("Second"); // Should trigger charsBuilder transition
        
        Token token = tokeniser.read();
        assertEquals(Token.TokenType.Character, token.type);
        assertEquals("FirstSecond", token.asCharacter().getData());
    }

    @Test
    public void testConsumeCharacterReferenceEmptyAndEdgeCases() {
        // Empty reader
        CharacterReader readerEmpty = new CharacterReader("");
        Tokeniser tokeniserEmpty = new TokeniserreaderEmpty(readerEmpty, errorList);
        assertNull(tokeniserEmpty.consumeCharacterReference(null, false));

        // Additional allowed character matching current
        CharacterReader readerAllowed = new CharacterReader("xabc");
        Tokeniser tokeniserAllowed = new Tokeniser(readerAllowed, errorList);
        assertNull(tokeniserAllowed.consumeCharacterReference('x', false));

        // Not char ref chars sorted matching
        CharacterReader readerNotRef = new CharacterReader(" <div");
        Tokeniser tokeniserNotRef = new Tokeniser(readerNotRef, errorList);
        assertNull(tokeniserNotRef.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeNumericCharacterReferenceErrorsAndRanges() {
        // No numerals
        CharacterReader reader1 = new CharacterReader("&#;");
        Tokeniser tokeniser1 = new Tokeniser(reader1, errorList);
        assertNull(tokeniser1.consumeCharacterReference(null, false));
        assertFalse(errorList.isEmpty());

        // Invalid range (Surrogate pair range)
        CharacterReader reader2 = new CharacterReader("&#xD800;");
        Tokeniser tokeniser2 = new Tokeniser(reader2, errorList);
        int[] ref = tokeniser2.consumeCharacterReference(null, false);
        assertNotNull(ref);
        assertEquals(Tokeniser.replacementChar, ref[0]);

        // Hex mode valid
        CharacterReader reader3 = new CharacterReader("&#x41;");
        Tokeniser tokeniser3 = new Tokeniser(reader3, errorList);
        int[] refHex = tokeniser3.consumeCharacterReference(null, false);
        assertNotNull(refHex);
        assertEquals(65, refHex[0]);
    }

    @Test
    public void testConsumeNamedCharacterReferenceVariants() {
        // Valid base entity without semicolon
        CharacterReader reader1 = new CharacterReader("&lt");
        Tokeniser tokeniser1 = new Tokeniser(reader1, errorList);
        int[] ref1 = tokeniser1.consumeCharacterReference(null, false);
        assertNotNull(ref1);
        assertEquals('<', ref1[0]);

        // Invalid named reference
        CharacterReader reader2 = new CharacterReader("&invalidname;");
        Tokeniser tokeniser2 = new Tokeniser(reader2, errorList);
        assertNull(tokeniser2.consumeCharacterReference(null, false));

        // In attribute context conflict
        CharacterReader reader3 = new CharacterReader("&amp=test");
        Tokeniser tokeniser3 = new Tokeniser(reader3, errorList);
        int[] ref3 = tokeniser3.consumeCharacterReference(null, true);
        assertNull(ref3); // Should rewind due to attribute matching rules (=, -, _)
    }

    @Test
    public void testUnescapeEntities() {
        CharacterReader reader = new CharacterReader("Hello &lt;World&gt; &amp; &unknown;");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        String unescaped = tokeniser.unescapeEntities(false);
        assertEquals("Hello <World> & &unknown;", unescaped);
    }

    @Test
    public void testHelperMethodsAndGetters() {
        CharacterReader reader = new CharacterReader("<div></div>");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        assertNotNull(tokeniser.getState());
        tokeniser.transition(TokeniserState.TagName);
        assertEquals(TokeniserState.TagName, tokeniser.getState());

        tokeniser.advanceTransition(TokeniserState.Data);
        assertEquals(TokeniserState.Data, tokeniser.getState());

        tokeniser.acknowledgeSelfClosingFlag();
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();

        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();

        tokeniser.createTempBuffer();
        
        assertNull(tokeniser.appropriateEndTagName());
        
        Token.StartTag startTag = (Token.StartTag) tokeniser.createTagPending(true);
        startTag.name("div");
        tokeniser.emit(startTag);
        
        assertEquals("div", tokeniser.appropriateEndTagName());
        assertTrue(tokeniser.isAppropriateEndTagToken());
        assertTrue(tokeniser.currentNodeInHtmlNS());
        
        tokeniser.eofError(TokeniserState.Data);
        tokeniser.error(TokeniserState.Data);
    }
}