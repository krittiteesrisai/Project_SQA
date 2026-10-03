package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    @Test
    public void testDataStateBranches() {
        // Test '&'
        Tokeniser t1 = new Tokeniser(new CharacterReader("&"));
        TokeniserState.Data.read(t1, t1.reader);

        // Test '<'
        Tokeniser t2 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.Data.read(t2, t2.reader);

        // Test nullChar
        Tokeniser t3 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.Data.read(t3, t3.reader);

        // Test eof
        Tokeniser t4 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Data.read(t4, t4.reader);

        // Test default (regular text)
        Tokeniser t5 = new Tokeniser(new CharacterReader("abc"));
        TokeniserState.Data.read(t5, t5.reader);
    }

    @Test
    public void testCharacterReferenceInData() {
        Tokeniser t = new Tokeniser(new CharacterReader("amp;"));
        TokeniserState.CharacterReferenceInData.read(t, t.reader);
    }

    @Test
    public void testRcdataStateBranches() {
        // Test '&'
        Tokeniser t1 = new Tokeniser(new CharacterReader("&"));
        TokeniserState.Rcdata.read(t1, t1.reader);

        // Test '<'
        Tokeniser t2 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.Rcdata.read(t2, t2.reader);

        // Test nullChar
        Tokeniser t3 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.Rcdata.read(t3, t3.reader);

        // Test eof
        Tokeniser t4 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Rcdata.read(t4, t4.reader);

        // Test default
        Tokeniser t5 = new Tokeniser(new CharacterReader("text"));
        TokeniserState.Rcdata.read(t5, t5.reader);
    }

    @Test
    public void testRawtextStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.Rawtext.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.Rawtext.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader(""));
        TokeniserState.Rawtext.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("raw"));
        TokeniserState.Rawtext.read(t4, t4.reader);
    }

    @Test
    public void testScriptDataStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("<"));
        TokeniserState.ScriptData.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.ScriptData.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader(""));
        TokeniserState.ScriptData.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader("script"));
        TokeniserState.ScriptData.read(t4, t4.reader);
    }

    @Test
    public void testPlaintextStateBranches() {
        Tokeniser t1 = new Tokeniser(new CharacterReader("\u0000"));
        TokeniserState.PLAINTEXT.read(t1, t1.reader);

        Tokeniser t2 = new Tokeniser(new CharacterReader(""));
        TokeniserState.PLAINTEXT.read(t2, t2.reader);

        Tokeniser t3 = new Tokeniser(new CharacterReader("plain"));
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

        // matchesLetter() == true
        Tokeniser t4 = new Tokeniser(new CharacterReader("a"));
        TokeniserState.TagOpen.read(t4, t4.reader);

        // matchesLetter() == false (default else branch)
        Tokeniser t5 = new Tokeniser(new CharacterReader("1"));
        TokeniserState.TagOpen.read(t5, t5.reader);
    }

    @Test
    public void testEndTagOpenStateBranches() {
        // isEmpty() == true
        Tokeniser t1 = new Tokeniser(new CharacterReader(""));
        TokeniserState.EndTagOpen.read(t1, t1.reader);

        // matchesLetter() == true
        Tokeniser t2 = new Tokeniser(new CharacterReader("a"));
        TokeniserState.EndTagOpen.read(t2, t2.reader);

        // matches('>') == true
        Tokeniser t3 = new Tokeniser(new CharacterReader(">"));
        TokeniserState.EndTagOpen.read(t3, t3.reader);

        // else (BogusComment)
        Tokeniser t4 = new Tokeniser(new CharacterReader("1"));
        TokeniserState.EndTagOpen.read(t4, t4.reader);
    }

    @Test
    public void testTagNameStateBranches() {
        // Test various consume characters: space, /, >, nullChar, eof
        char[] testChars = {' ', '/', '>', '\u0000'};
        for (char c : testChars) {
            Tokeniser t = new Tokeniser(new CharacterReader("tag" + c));
            t.createTagPending(true);
            TokeniserState.TagName.read(t, t.reader);
        }

        // Test EOF in TagName
        Tokeniser tEof = new Tokeniser(new CharacterReader("tag"));
        tEof.createTagPending(true);
        TokeniserState.TagName.read(tEof, tEof.reader);
    }

    @Test
    public void testMarkupDeclarationOpenBranches() {
        // --
        Tokeniser t1 = new Tokeniser(new CharacterReader("--"));
        TokeniserState.MarkupDeclarationOpen.read(t1, t1.reader);

        // DOCTYPE
        Tokeniser t2 = new Tokeniser(new CharacterReader("DOCTYPE"));
        TokeniserState.MarkupDeclarationOpen.read(t2, t2.reader);

        // [CDATA[
        Tokeniser t3 = new Tokeniser(new CharacterReader("[CDATA["));
        TokeniserState.MarkupDeclarationOpen.read(t3, t3.reader);

        // Else -> BogusComment
        Tokeniser t4 = new Tokeniser(new CharacterReader("INVALID"));
        TokeniserState.MarkupDeclarationOpen.read(t4, t4.reader);
    }

    @Test
    public void testCdataSection() {
        Tokeniser t = new Tokeniser(new CharacterReader("some cdata]]>"));
        TokeniserState.CdataSection.read(t, t.reader);
    }
}