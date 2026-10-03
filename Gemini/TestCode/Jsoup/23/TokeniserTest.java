package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.nodes.Entities;

import static org.junit.Assert.*;

public class TokeniserTest {

    private ParseErrorList errorList;

    @Before
    public void setUp() {
        errorList = ParseErrorList.tracking(10);
    }

    @Test
    public void testReadWithUnacknowledgedSelfClosingFlag() {
        // Trigger: Self closing flag not acknowledged branch in read()
        CharacterReader reader = new CharacterReader("<br />");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        // Emit a self-closing start tag manually or via state processing to set flag to false
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "br";
        startTag.selfClosing = true;
        tokeniser.emit(startTag);

        // Read the emitted token (clears emit pending)
        Token t1 = tokeniser.read();
        assertEquals(Token.TokenType.StartTag, t1.type);

        // Next read should hit the unacknowledged self-closing flag check and log an error
        CharacterReader reader2 = new CharacterReader("abc");
        Tokeniser tokeniser2 = new Tokeniser(reader2, errorList);
        // Force the internal state by emitting and not acknowledging
        tokeniser2.emit(startTag);
        tokeniser2.read(); // clears emit pending, leaves selfClosingFlagAcknowledged = false
        
        // Now calling read() again should trigger error branch
        Token t2 = tokeniser2.read();
        assertFalse(errorList.isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmitWhenAlreadyPendingThrowsException() {
        CharacterReader reader = new CharacterReader("<a>");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Token.Comment comment1 = new Token.Comment();
        tokeniser.emit(comment1); // isEmitPending becomes true
        
        Token.Comment comment2 = new Token.Comment();
        tokeniser.emit(comment2); // Should throw IllegalArgumentException due to Validate.isFalse
    }

    @Test
    public void testEmitEndTagWithAttributesTriggersError() {
        CharacterReader reader = new CharacterReader("</div>");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "div";
        endTag.attributes.put("class", "test"); // Attributes size > 0
        
        tokeniser.emit(endTag);
        assertFalse("Should log error for attributes on end tag", errorList.isEmpty());
    }

    @Test
    public void testConsumeCharacterReferenceEmptyReader() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReferenceAdditionalAllowed() {
        CharacterReader reader = new CharacterReader("x");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Character result = tokeniser.consumeCharacterReference('x', false);
        assertNull(result);
    }

    @Test
    public void testConsumeCharacterReferenceMatchesAnyStopChar() {
        CharacterReader reader = new CharacterReader(" ");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
    }

    @Test
    public void testConsumeNumericCharacterReferenceEmptyNumerals() {
        CharacterReader reader = new CharacterReader("#;");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertFalse(errorList.isEmpty());
    }

    @Test
    public void testConsumeNumericCharacterReferenceHexAndInvalidRange() {
        // Test hex mode and invalid high surrogate range (e.g., #xD800;)
        CharacterReader reader = new CharacterReader("#xD800;");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Tokeniser.replacementChar, result.charValue());
    }

    @Test
    public void testConsumeNumericCharacterReferenceValid() {
        CharacterReader reader = new CharacterReader("#65;"); // 'A'
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals('A', result.charValue());
    }

    @Test
    public void testConsumeNamedCharacterReferenceInvalid() {
        CharacterReader reader = new CharacterReader("&unknownentity;");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        // Advance past '&' to let consumeCharacterReference parse the name
        reader.advance(); 
        
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertFalse(errorList.isEmpty());
    }

    @Test
    public void testConsumeNamedCharacterReferenceInAttributeEdgeCase() {
        CharacterReader reader = new CharacterReader("&amp=val;");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        reader.advance(); // skip '&'
        
        Character result = tokeniser.consumeCharacterReference(null, true);
        assertNull(result);
    }

    @Test
    public void testHelperMethods() {
        CharacterReader reader = new CharacterReader("<span>");
        Tokeniser tokeniser = new Tokeniser(reader, errorList);
        
        assertNotNull(tokeniser.getState());
        tokeniser.transition(TokeniserState.TagOpen);
        assertEquals(TokeniserState.TagOpen, tokeniser.getState());
        
        tokeniser.advanceTransition(TokeniserState.Data);
        assertEquals(TokeniserState.Data, tokeniser.getState());
        
        tokeniser.acknowledgeSelfClosingFlag();
        
        tokeniser.createTagPending(true);
        assertNotNull(tokeniser.tagPending);
        
        tokeniser.createCommentPending();
        assertNotNull(tokeniser.commentPending);
        
        tokeniser.createDoctypePending();
        assertNotNull(tokeniser.doctypePending);
        
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
        
        assertTrue(tokeniser.currentNodeInHtmlNS());
        
        tokeniser.emit("testString");
        tokeniser.emit('c');
        
        // Test appropriate end tag
        tokeniser.tagPending = new Token.EndTag();
        tokeniser.tagPending.tagName = "div";
        tokeniser.tagPending.finaliseTag();
        
        Token.StartTag start = new Token.StartTag();
        start.tagName = "div";
        tokeniser.emit(start);
        
        assertTrue(tokeniser.isAppropriateEndTagToken());
        assertEquals("div", tokeniser.appropriateEndTagName());
        
        tokeniser.error(TokeniserState.Data);
        tokeniser.eofError(TokeniserState.Data);
    }
}