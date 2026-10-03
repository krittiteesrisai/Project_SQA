package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    @Test
    public void testDataStateBranches() {
        // Test '&' transition -> CharacterReferenceInData
        Tokeniser t1 = new Tokeniser(new CharacterReader("&"));
        TokeniserState.Data.read(t1, t1.reader);
        
        // Test '<' transition -> TagOpen
        Tokeniser t2 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.Data.read(t2, t2.reader);

        // Test nullChar -> error & emit replacement
        Tokeniser t3 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.Data.read(t3, t3.reader);

        // Test eof -> emit EOF token
        Tokeniser t4 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Data.read(t4, t4.reader);

        // Test default -> consumeToAny data
        Tokeniser t5 = new Tokeniser(new CharacterReader("abc&"));
        TokeniserState.Data.read(t5, t5.reader);
    }

    @Test
    public void testCharacterReferenceInDataState() {
        // c == null case
        Tokeniser t1 = new Tokeniser(new CharacterReader(""));
        TokeniserState.CharacterReferenceInData.read(t1, t1.reader);

        // c != null case (using valid reference or fallback)
        Tokeniser t2 = new Tokeniser(new CharacterReader("&#38;"));
        TokeniserState.CharacterReferenceInData.read(t2, t2.reader);
    }

    @Test
    public void testRcdataStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("&"));
        TokeniserState.Rcdata.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.Rcdata.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.Rcdata.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Rcdata.read(t4, t4.reader);

        Tokeniser t5 = new Tokeniser(new CharacterReader("text<"));
        TokeniserState.Rcdata.read(t5, t5.reader);
    }

    @Test
    public void testRawtextAndScriptDataStates() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.Rawtext.read(t1, t1.reader);
        TokeniserState.ScriptData.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.Rawtext.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Rawtext.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("hello<"));
        TokeniserState.Rawtext.read(t4, t4.reader);
    }

    @Test
    public void testPlaintextState() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.PLAINTEXT.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader(""));
        TokeniserState.PLAINTEXT.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("normal text"));
        TokeniserState.PLAINTEXT.read(t3, t3.reader);
    }

    @Test
    public void testTagOpenStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("!"));
        TokeniserState.TagOpen.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("/"));
        TokeniserState.TagOpen.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("?"));
        TokeniserState.TagOpen.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("a"));
        TokeniserState.TagOpen.read(t4, t4.reader);

        Tokeniser t5 = new Tokeniser(new CharacterReader("1"));
        TokeniserState.TagOpen.read(t5, t5.reader);
    }

    @Test
    public void testEndTagOpenStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader(""));
        TokeniserState.EndTagOpen.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("a"));
        TokeniserState.EndTagOpen.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader(">"));
        TokeniserState.EndTagOpen.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("?"));
        TokeniserState.EndTagOpen.read(t4, t4.reader);
    }

    @Test
    public void testTagNameStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("div>"));
        t1.createTagPending(true);
        TokeniserState.TagName.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("div "));
        t2.createTagPending(true);
        TokeniserState.TagName.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("div/"));
        t3.createTagPending(true);
        TokeniserState.TagName.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("div\u0000"));
        t4.createTagPending(true);
        TokeniserState.TagName.read(t4, t4.reader);

        Tokeniser t5 = new Tokeniser(new CharacterReader("div"));
        t5.createTagPending(true);
        TokeniserState.TagName.read(t5, t5.reader);
    }

    @Test
    public void testDoctypeStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader(" HTML"));
        TokeniserState.Doctype.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Doctype.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("X"));
        TokeniserState.Doctype.read(t3, t3.reader);
    }

    @Test
    public void testBogusCommentAndMarkupDeclaration() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("--comment-->"));
        TokeniserState.MarkupDeclarationOpen.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("DOCTYPE html>"));
        TokeniserState.MarkupDeclarationOpen.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("[CDATA[data]]>"));
        TokeniserState.MarkupDeclarationOpen.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("INVALID"));
        TokeniserState.MarkupDeclarationOpen.read(t4, t4.reader);

        Tokeniser t5 = new Tokeniser(new CharacterReader("comment data>"));
        TokeniserState.BogusComment.read(t5, t5.reader);
    }

    @Test
    public void testCommentStates() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("-foo-->"));
        TokeniserState.CommentStart.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("\u0000foo-->"));
        TokeniserState.CommentStart.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader(">"));
        TokeniserState.CommentStart.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader(""));
        TokeniserState.CommentStart.read(t4, t4.reader);

        Tokeniser t5 = new Tokeniser(new CharacterReader("--->"));
        TokeniserState.CommentEnd.read(t5, t5.reader);
    }
}