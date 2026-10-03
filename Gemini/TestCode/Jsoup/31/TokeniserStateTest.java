package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    // --- Helper to execute read with string input ---
    private void runState(TokeniserState state, String input) {
        CharacterReader reader = new CharacterReader(input);
        Tokeniser tokeniser = new Tokeniser(reader);
        state.read(tokeniser, reader);
    }

    @Test
    public void testDataState() {
        // '&' -> CharacterReferenceInData
        CharacterReader r1 = new CharacterReader("&");
        Tokeniser t1 = new Tokeniser(r1);
        TokeniserState.Data.read(t1, r1);

        // '<' -> TagOpen
        CharacterReader r2 = new CharacterReader("<");
        Tokeniser t2 = new Tokeniser(r2);
        TokeniserState.Data.read(t2, r2);

        // nullChar -> error & emit replacement
        CharacterReader r3 = new CharacterReader("\u0000");
        Tokeniser t3 = new Tokeniser(r3);
        TokeniserState.Data.read(t3, r3);

        // eof -> emit EOF
        CharacterReader r4 = new CharacterReader("");
        Tokeniser t4 = new Tokeniser(r4);
        TokeniserState.Data.read(t4, r4);

        // default -> consume text
        CharacterReader r5 = new CharacterReader("abc&");
        Tokeniser t5 = new Tokeniser(r5);
        TokeniserState.Data.read(t5, r5);
    }

    @Test
    public void testCharacterReferenceInDataState() {
        CharacterReader r = new CharacterReader("amp;");
        Tokeniser t = new Tokeniser(r);
        TokeniserState.CharacterReferenceInData.read(t, r);
    }

    @Test
    public void testRcdataState() {
        runState(TokeniserState.Rcdata, "&");
        runState(TokeniserState.Rcdata, "<");
        runState(TokeniserState.Rcdata, "\u0000");
        runState(TokeniserState.Rcdata, "");
        runState(TokeniserState.Rcdata, "text&");
    }

    @Test
    public void testRawtextState() {
        runState(TokeniserState.Rawtext, "<");
        runState(TokeniserState.Rawtext, "\u0000");
        runState(TokeniserState.Rawtext, "");
        runState(TokeniserState.Rawtext, "rawtext<");
    }

    @Test
    public void testScriptDataState() {
        runState(TokeniserState.ScriptData, "<");
        runState(TokeniserState.ScriptData, "\u0000");
        runState(TokeniserState.ScriptData, "");
        runState(TokeniserState.ScriptData, "script<");
    }

    @Test
    public void testPlaintextState() {
        runState(TokeniserState.PLAINTEXT, "\u0000");
        runState(TokeniserState.PLAINTEXT, "");
        runState(TokeniserState.PLAINTEXT, "plaintext");
    }

    @Test
    public void testTagOpenState() {
        runState(TokeniserState.TagOpen, "!");
        runState(TokeniserState.TagOpen, "/");
        runState(TokeniserState.TagOpen, "?");
        runState(TokeniserState.TagOpen, "a"); // matchesLetter
        runState(TokeniserState.TagOpen, "1"); // default (error + emit '<')
    }

    @Test
    public void testEndTagOpenState() {
        runState(TokeniserState.EndTagOpen, ""); // isEmpty
        runState(TokeniserState.EndTagOpen, "a"); // matchesLetter
        runState(TokeniserState.EndTagOpen, ">"); // matches '>'
        runState(TokeniserState.EndTagOpen, "1"); // default (BogusComment)
    }

    @Test
    public void testTagNameState() {
        runState(TokeniserState.TagName, "div>attr");
        runState(TokeniserState.TagName, "div/attr");
        runState(TokeniserState.TagName, "div attr");
        runState(TokeniserState.TagName, "div\u0000attr");
        runState(TokeniserState.TagName, "div");
    }

    @Test
    public void testMarkupDeclarationOpenState() {
        runState(TokeniserState.MarkupDeclarationOpen, "--comm");
        runState(TokeniserState.MarkupDeclarationOpen, "DOCTYPE html");
        runState(TokeniserState.MarkupDeclarationOpen, "[CDATA[data");
        runState(TokeniserState.MarkupDeclarationOpen, "invalid");
    }

    @Test
    public void testCommentStates() {
        runState(TokeniserState.CommentStart, "-");
        runState(TokeniserState.CommentStart, "\u0000");
        runState(TokeniserState.CommentStart, ">");
        runState(TokeniserState.CommentStart, "");
        runState(TokeniserState.CommentStart, "a");

        runState(TokeniserState.CommentStartDash, "-");
        runState(TokeniserState.CommentStartDash, "\u0000");
        runState(TokeniserState.CommentStartDash, ">");
        runState(TokeniserState.CommentStartDash, "");
        runState(TokeniserState.CommentStartDash, "a");

        runState(TokeniserState.Comment, "-");
        runState(TokeniserState.Comment, "\u0000");
        runState(TokeniserState.Comment, "");
        runState(TokeniserState.Comment, "text");

        runState(TokeniserState.CommentEndDash, "-");
        runState(TokeniserState.CommentEndDash, "\u0000");
        runState(TokeniserState.CommentEndDash, "");
        runState(TokeniserState.CommentEndDash, "a");

        runState(TokeniserState.CommentEnd, ">");
        runState(TokeniserState.CommentEnd, "\u0000");
        runState(TokeniserState.CommentEnd, "!");
        runState(TokeniserState.CommentEnd, "-");
        runState(TokeniserState.CommentEnd, "");
        runState(TokeniserState.CommentEnd, "a");

        runState(TokeniserState.CommentEndBang, "-");
        runState(TokeniserState.CommentEndBang, ">");
        runState(TokeniserState.CommentEndBang, "\u0000");
        runState(TokeniserState.CommentEndBang, "");
        runState(TokeniserState.CommentEndBang, "a");
    }

    @Test
    public void testDoctypeStates() {
        runState(TokeniserState.Doctype, " ");
        runState(TokeniserState.Doctype, "");
        runState(TokeniserState.Doctype, "X");

        runState(TokeniserState.BeforeDoctypeName, "a");
        runState(TokeniserState.BeforeDoctypeName, " ");
        runState(TokeniserState.BeforeDoctypeName, "\u0000");
        runState(TokeniserState.BeforeDoctypeName, "");
        runState(TokeniserState.BeforeDoctypeName, "1");

        runState(TokeniserState.DoctypeName, "a");
        runState(TokeniserState.DoctypeName, ">");
        runState(TokeniserState.DoctypeName, " ");
        runState(TokeniserState.DoctypeName, "\u0000");
        runState(TokeniserState.DoctypeName, "");
        runState(TokeniserState.DoctypeName, "1");

        runState(TokeniserState.AfterDoctypeName, "");
        runState(TokeniserState.AfterDoctypeName, " ");
        runState(TokeniserState.AfterDoctypeName, ">");
        runState(TokeniserState.AfterDoctypeName, "PUBLIC");
        runState(TokeniserState.AfterDoctypeName, "SYSTEM");
        runState(TokeniserState.AfterDoctypeName, "INVALID");
    }

    @Test
    public void testAttributeStates() {
        runState(TokeniserState.BeforeAttributeName, " ");
        runState(TokeniserState.BeforeAttributeName, "/");
        runState(TokeniserState.BeforeAttributeName, ">");
        runState(TokeniserState.BeforeAttributeName, "\u0000");
        runState(TokeniserState.BeforeAttributeName, "");
        runState(TokeniserState.BeforeAttributeName, "\"");
        runState(TokeniserState.BeforeAttributeName, "attr");

        runState(TokeniserState.AttributeName, "attr=val");
        runState(TokeniserState.AttributeName, "attr/val");
        runState(TokeniserState.AttributeName, "attr val");
        runState(TokeniserState.AttributeName, "attr>val");
        runState(TokeniserState.AttributeName, "attr\u0000val");
        runState(TokeniserState.AttributeName, "");
        runState(TokeniserState.AttributeName, "attr\"val");

        runState(TokeniserState.AfterAttributeName, " ");
        runState(TokeniserState.AfterAttributeName, "/");
        runState(TokeniserState.AfterAttributeName, "=");
        runState(TokeniserState.AfterAttributeName, ">");
        runState(TokeniserState.AfterAttributeName, "\u0000");
        runState(TokeniserState.AfterAttributeName, "");
        runState(TokeniserState.AfterAttributeName, "\"");
        runState(TokeniserState.AfterAttributeName, "a");

        runState(TokeniserState.BeforeAttributeValue, " ");
        runState(TokeniserState.BeforeAttributeValue, "\"val\"");
        runState(TokeniserState.BeforeAttributeValue, "&val");
        runState(TokeniserState.BeforeAttributeValue, "'val'");
        runState(TokeniserState.BeforeAttributeValue, "\u0000");
        runState(TokeniserState.BeforeAttributeValue, "");
        runState(TokeniserState.BeforeAttributeValue, ">");
        runState(TokeniserState.BeforeAttributeValue, "<val");
        runState(TokeniserState.BeforeAttributeValue, "val");

        runState(TokeniserState.AttributeValue_doubleQuoted, "val\"");
        runState(TokeniserState.AttributeValue_doubleQuoted, "val&amp;\"");
        runState(TokeniserState.AttributeValue_doubleQuoted, "val\u0000\"");
        runState(TokeniserState.AttributeValue_doubleQuoted, "");

        runState(TokeniserState.AttributeValue_singleQuoted, "val'");
        runState(TokeniserState.AttributeValue_singleQuoted, "val&amp;'");
        runState(TokeniserState.AttributeValue_singleQuoted, "val\u0000'");
        runState(TokeniserState.AttributeValue_singleQuoted, "");

        runState(TokeniserState.AttributeValue_unquoted, "val ");
        runState(TokeniserState.AttributeValue_unquoted, "val&gt;");
        runState(TokeniserState.AttributeValue_unquoted, "val>");
        runState(TokeniserState.AttributeValue_unquoted, "val\u0000");
        runState(TokeniserState.AttributeValue_unquoted, "");
        runState(TokeniserState.AttributeValue_unquoted, "val\"");

        runState(TokeniserState.AfterAttributeValue_quoted, " ");
        runState(TokeniserState.AfterAttributeValue_quoted, "/");
        runState(TokeniserState.AfterAttributeValue_quoted, ">");
        runState(TokeniserState.AfterAttributeValue_quoted, "");
        runState(TokeniserState.AfterAttributeValue_quoted, "a");
    }

    @Test
    public void testSelfClosingAndBogusStates() {
        runState(TokeniserState.SelfClosingStartTag, ">");
        runState(TokeniserState.SelfClosingStartTag, "");
        runState(TokeniserState.SelfClosingStartTag, "a");

        runState(TokeniserState.BogusComment, "comment>");
        runState(TokeniserState.BogusDoctype, ">");
        runState(TokeniserState.BogusDoctype, "");
        runState(TokeniserState.BogusDoctype, "a");

        runState(TokeniserState.CdataSection, "data]]>");
    }
}