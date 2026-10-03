package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserTest {

    @Test
    public void testReadWithUnacknowledgedSelfClosingFlag() {
        CharacterReader reader = new CharacterReader("<br/>");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Emit a self-closing start tag manually to set selfClosingFlagAcknowledged = false
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "br";
        startTag.selfClosing = true;
        tokeniser.emit(startTag);

        // First read() should process the unacknowledged self-closing flag error
        Token token = tokeniser.read();
        assertNotNull(token);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Self closing flag not acknowledged"));
    }

    @Test
    public void testReadWithCharBufferNonEmpty() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        // Put something in charBuffer
        tokeniser.emit('a');
        tokeniser.emit('b');

        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Character);
        assertEquals("ab", token.asCharacter().getData());
    }

    @Test
    public void testEmitEndTagWithAttributesError() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "div";
        endTag.attributes = new Attributes();
        endTag.attributes.put("class", "test");

        tokeniser.emit(endTag);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("Attributes incorrectly present on end tag"));
    }

    @Test
    public void testConsumeCharacterReferenceEmptyReader() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceAdditionalAllowed() {
        CharacterReader reader = new CharacterReader("x");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference('x', false);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceMatchesAnyIgnored() {
        CharacterReader reader = new CharacterReader("<");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
    }

    @Test
    public void testConsumeNumericReferenceDecimalValid() {
        CharacterReader reader = new CharacterReader("#65;"); // 'A'
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testConsumeNumericReferenceHexValidMissingSemicolon() {
        CharacterReader reader = new CharacterReader("#X41"); // 'A' in hex without semicolon
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('A'), c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("missing semicolon"));
    }

    @Test
    public void testConsumeNumericReferenceNoNumerals() {
        CharacterReader reader = new CharacterReader("#;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("numeric reference with no numerals"));
    }

    @Test
    public void testConsumeNumericReferenceOutOfRange() {
        CharacterReader reader = new CharacterReader("#1114112;"); // > 0x10FFFF
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Tokeniser.replacementChar, c.charValue());
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
    }

    @Test
    public void testConsumeNumericReferenceSurrogateRange() {
        CharacterReader reader = new CharacterReader("#55296;"); // 0xD800 (Surrogate)
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Tokeniser.replacementChar, c.charValue());
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("character outside of valid range"));
    }

    @Test
    public void testConsumeNamedReferenceValid() {
        CharacterReader reader = new CharacterReader("amp;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('&'), c);
        assertTrue(errors.isEmpty());
    }

    @Test
    public void testConsumeNamedReferenceInvalidWithSemicolon() {
        CharacterReader reader = new CharacterReader("unknownentity;");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(1, errors.size());
        assertTrue(errors.get(0).getErrorMessage().contains("invalid named referenece"));
    }

    @Test
    public void testConsumeNamedReferenceInAttributeConflict() {
        CharacterReader reader = new CharacterReader("amp=");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        Character c = tokeniser.consumeCharacterReference(null, true); // inAttribute = true
        assertNull(c);
    }

    @Test
    public void testTagAndCommentAndDoctypeCreationHelpers() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        assertNotNull(tokeniser.createTagPending(true));
        assertTrue(tokeniser.tagPending instanceof Token.StartTag);

        assertNotNull(tokeniser.createTagPending(false));
        assertTrue(tokeniser.tagPending instanceof Token.EndTag);

        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);

        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);

        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);

        tokeniser.transition(TokeniserState.PLAINTEXT);
        assertEquals(TokeniserState.PLAINTEXT, tokeniser.getState());

        tokeniser.advanceTransition(TokeniserState.Data);
        assertEquals(TokeniserState.Data, tokeniser.getState());
        
        tokeniser.acknowledgeSelfClosingFlag();
    }

    @Test
    public void testAppropriateEndTagToken() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        assertFalse(tokeniser.isAppropriateEndTagToken());
        assertNull(tokeniser.appropriateEndTagName());

        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        tokeniser.emit(startTag);

        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "div";
        tokeniser.tagPending = endTag;

        assertTrue(tokeniser.isAppropriateEndTagToken());
        assertEquals("div", tokeniser.appropriateEndTagName());
    }

    @Test
    public void testEofErrorAndHtmlNS() {
        CharacterReader reader = new CharacterReader("");
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = new Tokeniser(reader, errors);

        tokeniser.eofError(TokeniserState.Data);
        tokeniser.error(TokeniserState.Data);
        assertTrue(tokeniser.currentNodeInHtmlNS());
        assertFalse(errors.isEmpty());
    }
}