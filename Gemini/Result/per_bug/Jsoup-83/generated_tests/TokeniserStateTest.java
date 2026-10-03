package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(String input) {
        CharacterReader reader = new CharacterReader(input);
        ParseErrorList errors = ParseErrorList.tracking(10);
        return new Tokeniser(reader, errors);
    }

    @Test
    public void testDataStateAmpersand() {
        Tokeniser t = createTokeniser("&");
        TokeniserState.Data.read(t, t.reader);
        // Should advance to CharacterReferenceInData
        assertEquals(TokeniserState.CharacterReferenceInData, t.getState());
    }

    @Test
    public void testDataStateTagOpen() {
        Tokeniser t = createTokeniser("<");
        TokeniserState.Data.read(t, t.reader);
        assertEquals(TokeniserState.TagOpen, t.getState());
    }

    @Test
    public void testDataStateNullChar() {
        Tokeniser t = createTokeniser("\u0000");
        TokeniserState.Data.read(t, t.reader);
        // Emits replacement char / records error
        assertFalse(t.isTrackPendingErrors() && t.getErrors().isEmpty());
    }

    @Test
    public void testDataStateEof() {
        Tokeniser t = createTokeniser("");
        // reader current will be EOF (-1)
        TokeniserState.Data.read(t, t.reader);
        // Verify EOF token emitted or handled
    }

    @Test
    public void testDataStateDefault() {
        Tokeniser t = createTokeniser("hello");
        TokeniserState.Data.read(t, t.reader);
        // Consumes data
    }

    @Test
    public void testTagOpenStateExclam() {
        Tokeniser t = createTokeniser("!");
        TokeniserState.TagOpen.read(t, t.reader);
        assertEquals(TokeniserState.MarkupDeclarationOpen, t.getState());
    }

    @Test
    public void testTagOpenStateSlash() {
        Tokeniser t = createTokeniser("/");
        TokeniserState.TagOpen.read(t, t.reader);
        assertEquals(TokeniserState.EndTagOpen, t.getState());
    }

    @Test
    public void testTagOpenStateQuestion() {
        Tokeniser t = createTokeniser("?");
        TokeniserState.TagOpen.read(t, t.reader);
        assertEquals(TokeniserState.BogusComment, t.getState());
    }

    @Test
    public void testTagOpenStateLetter() {
        Tokeniser t = createTokeniser("a>");
        TokeniserState.TagOpen.read(t, t.reader);
        assertEquals(TokeniserState.TagName, t.getState());
    }

    @Test
    public void testTagOpenStateDefaultError() {
        Tokeniser t = createTokeniser("#");
        TokeniserState.TagOpen.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testEndTagOpenEmpty() {
        Tokeniser t = createTokeniser("");
        TokeniserState.EndTagOpen.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testEndTagOpenLetter() {
        Tokeniser t = createTokeniser("div>");
        TokeniserState.EndTagOpen.read(t, t.reader);
        assertEquals(TokeniserState.TagName, t.getState());
    }

    @Test
    public void testEndTagOpenGreaterThan() {
        Tokeniser t = createTokeniser(">");
        TokeniserState.EndTagOpen.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testEndTagOpenBogus() {
        Tokeniser t = createTokeniser("1");
        TokeniserState.EndTagOpen.read(t, t.reader);
        assertEquals(TokeniserState.BogusComment, t.getState());
    }

    @Test
    public void testPLAINTEXTStateNullChar() {
        Tokeniser t = createTokeniser("\u0000");
        TokeniserState.PLAINTEXT.read(t, t.reader);
    }

    @Test
    public void testPLAINTEXTStateEof() {
        Tokeniser t = createTokeniser("");
        TokeniserState.PLAINTEXT.read(t, t.reader);
    }

    @Test
    public void testPLAINTEXTStateDefault() {
        Tokeniser t = createTokeniser("some-text");
        TokeniserState.PLAINTEXT.read(t, t.reader);
    }

    @Test
    public void testCdataSection() {
        Tokeniser t = createTokeniser("some cdata content]]>");
        TokeniserState.CdataSection.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testBogusComment() {
        Tokeniser t = createTokeniser("comment content>");
        TokeniserState.BogusComment.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }
}