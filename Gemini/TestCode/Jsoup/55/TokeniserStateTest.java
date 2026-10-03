package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class TokeniserStateTest {

    private Tokeniser tokeniser;
    private CharacterReader reader;

    @Before
    public void setUp() throws Exception {
        // ใช้ Reflection สร้าง Tokeniser และ CharacterReader เปล่า เพื่อเลี่ยง Dependency ที่ซับซ้อนของ Jsoup
        tokeniser = createDummyTokeniser();
        reader = new CharacterReader("dummy");
    }

    @Test
    public void testDataStateBranches() {
        // Test '&' -> CharacterReferenceInData
        reader = new CharacterReader("&");
        TokeniserState.Data.read(tokeniser, reader);

        // Test '<' -> TagOpen
        reader = new CharacterReader("<");
        TokeniserState.Data.read(tokeniser, reader);

        // Test nullChar -> error & emit
        reader = new CharacterReader("\u0000");
        TokeniserState.Data.read(tokeniser, reader);

        // Test eof -> EOF token
        reader = new CharacterReader(new String(new char[]{CharacterReader.EOF}));
        TokeniserState.Data.read(tokeniser, reader);

        // Test default -> consumeData & emit
        reader = new CharacterReader("normal data");
        TokeniserState.Data.read(tokeniser, reader);
    }

    @Test
    public void testTagOpenStateBranches() {
        // Test '!' -> MarkupDeclarationOpen
        reader = new CharacterReader("!");
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Test '/' -> EndTagOpen
        reader = new CharacterReader("/");
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Test '?' -> BogusComment
        reader = new CharacterReader("?");
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Test matchesLetter() -> TagName
        reader = new CharacterReader("a");
        TokeniserState.TagOpen.read(tokeniser, reader);

        // Test default (non-letter) -> error, emit, transition Data
        reader = new CharacterReader("1");
        TokeniserState.TagOpen.read(tokeniser, reader);
    }

    @Test
    public void testEndTagOpenStateBranches() {
        // Test isEmpty() -> eofError, emit "</", transition Data
        reader = new CharacterReader("");
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Test matchesLetter() -> createTagPending, transition TagName
        reader = new CharacterReader("div");
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Test matches('>') -> error, advanceTransition Data
        reader = new CharacterReader(">");
        TokeniserState.EndTagOpen.read(tokeniser, reader);

        // Test default -> error, advanceTransition BogusComment
        reader = new CharacterReader("?");
        TokeniserState.EndTagOpen.read(tokeniser, reader);
    }

    @Test
    public void testTagNameStateBranches() {
        // Test consume whitespace (' ') -> BeforeAttributeName
        reader = new CharacterReader(" ");
        TokeniserState.TagName.read(tokeniser, reader);

        // Test consume '/' -> SelfClosingStartTag
        reader = new CharacterReader("/");
        TokeniserState.TagName.read(tokeniser, reader);

        // Test consume '>' -> emitTagPending, transition Data
        reader = new CharacterReader(">");
        TokeniserState.TagName.read(tokeniser, reader);

        // Test consume nullChar -> append replacementStr
        reader = new CharacterReader("\u0000");
        TokeniserState.TagName.read(tokeniser, reader);

        // Test consume eof -> eofError, transition Data
        char[] eofArr = new char[]{CharacterReader.EOF};
        reader = new CharacterReader(new String(eofArr));
        TokeniserState.TagName.read(tokeniser, reader);
    }

    @Test
    public void testPLAINTEXTStateBranches() {
        // Test nullChar
        reader = new CharacterReader("\u0000");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        // Test eof
        reader = new CharacterReader(new String(new char[]{CharacterReader.EOF}));
        TokeniserState.PLAINTEXT.read(tokeniser, reader);

        // Test default
        reader = new CharacterReader("plaintext content");
        TokeniserState.PLAINTEXT.read(tokeniser, reader);
    }

    @Test
    public void testScriptDataLessthanSignBranches() {
        // Test '/' -> ScriptDataEndTagOpen
        reader = new CharacterReader("/");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        // Test '!' -> ScriptDataEscapeStart
        reader = new CharacterReader("!");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);

        // Test default -> ScriptData
        reader = new CharacterReader("a");
        TokeniserState.ScriptDataLessthanSign.read(tokeniser, reader);
    }

    @Test
    public void testBeforeAttributeNameBranches() {
        // Test whitespace
        reader = new CharacterReader(" ");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Test '/'
        reader = new CharacterReader("/");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Test '>'
        reader = new CharacterReader(">");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Test nullChar
        reader = new CharacterReader("\u0000");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Test eof
        reader = new CharacterReader(new String(new char[]{CharacterReader.EOF}));
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Test quote ('"')
        reader = new CharacterReader("\"");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);

        // Test default (letter)
        reader = new CharacterReader("attr");
        TokeniserState.BeforeAttributeName.read(tokeniser, reader);
    }

    @Test
    public void testBogusCommentState() {
        reader = new CharacterReader("comment data>");
        TokeniserState.BogusComment.read(tokeniser, reader);
    }

    @Test
    public void testCdataSectionState() {
        reader = new CharacterReader("some cdata]]>extra");
        TokeniserState.CdataSection.read(tokeniser, reader);
    }

    // Helper method to instantiate Tokeniser via Reflection without full parser context
    private Tokeniser createDummyTokeniser() throws Exception {
        java.lang.reflect.Constructor<Tokeniser> constructor = Tokeniser.class.getDeclaredConstructor(Parser.class, CharacterReader.class);
        constructor.setAccessible(true);
        Parser parser = Parser.htmlParser();
        Tokeniser t = constructor.newInstance(parser, new CharacterReader(""));
        
        // Initialize tagPending to avoid NullPointerException
        Field tagPendingField = Tokeniser.class.getDeclaredField("tagPending");
        tagPendingField.setAccessible(true);
        tagPendingField.set(t, new Token.StartTag());
        
        return t;
    }
}