package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokeniserStateTest {

    @Test
    public void testDataStateBranches() {
        // ทดสอบ State: Data กับตัวอักษร '&', '<', nullChar, eof และ default (data)
        Parser parser = Parser.htmlParser();
        
        // Case '&' -> CharacterReferenceInData
        Tokeniser t1 = new Tokeniser(new CharacterReader("&"), parser.errors());
        TokeniserState.Data.read(t1, t1.reader);
        assertEquals(TokeniserState.CharacterReferenceInData, t1.getState());

        // Case '<' -> TagOpen
        Tokeniser t2 = new Tokeniser(new CharacterReader("<"), parser.errors());
        TokeniserState.Data.read(t2, t2.reader);
        assertEquals(TokeniserState.TagOpen, t2.getState());

        // Case nullChar '\u0000'
        Tokeniser t3 = new Tokeniser(new CharacterReader("\u0000"), parser.errors());
        TokeniserState.Data.read(t3, t3.reader);

        // Case eof
        Tokeniser t4 = new Tokeniser(new CharacterReader(""), parser.errors());
        TokeniserState.Data.read(t4, t4.reader);

        // Case default
        Tokeniser t5 = new Tokeniser(new CharacterReader("abc"), parser.errors());
        TokeniserState.Data.read(t5, t5.reader);
    }

    @Test
    public void testRcdataStateBranches() {
        // ทดสอบ State: Rcdata กับ '&', '<', nullChar, eof, default
        Parser parser = Parser.htmlParser();
        
        Tokeniser t1 = new Tokeniser(new CharacterReader("&"), parser.errors());
        TokeniserState.Rcdata.read(t1, t1.reader);
        assertEquals(TokeniserState.CharacterReferenceInRcdata, t1.getState());

        Tokeniser t2 = new Tokeniser(new CharacterReader("<"), parser.errors());
        TokeniserState.Rcdata.read(t2, t2.reader);
        assertEquals(TokeniserState.RcdataLessthanSign, t2.getState());

        Tokeniser t3 = new Tokeniser(new CharacterReader("\u0000"), parser.errors());
        TokeniserState.Rcdata.read(t3, t3.reader);

        Tokeniser t4 = new Tokeniser(new CharacterReader(""), parser.errors());
        TokeniserState.Rcdata.read(t4, t4.reader);

        Tokeniser t5 = new Tokeniser(new CharacterReader("text&<"), parser.errors());
        TokeniserState.Rcdata.read(t5, t5.reader);
    }

    @Test
    public void testTagOpenStateBranches() {
        Parser parser = Parser.htmlParser();

        // Case '!' -> MarkupDeclarationOpen
        Tokeniser t1 = new Tokeniser(new CharacterReader("!"), parser.errors());
        TokeniserState.TagOpen.read(t1, t1.reader);
        assertEquals(TokeniserState.MarkupDeclarationOpen, t1.getState());

        // Case '/' -> EndTagOpen
        Tokeniser t2 = new Tokeniser(new CharacterReader("/"), parser.errors());
        TokeniserState.TagOpen.read(t2, t2.reader);
        assertEquals(TokeniserState.EndTagOpen, t2.getState());

        // Case '?' -> BogusComment
        Tokeniser t3 = new Tokeniser(new CharacterReader("?"), parser.errors());
        TokeniserState.TagOpen.read(t3, t3.reader);
        assertEquals(TokeniserState.BogusComment, t1.getState()); // หรือตรวจสอบ Transition

        // Case matchesLetter() -> TagName
        Tokeniser t4 = new Tokeniser(new CharacterReader("a"), parser.errors());
        TokeniserState.TagOpen.read(t4, t4.reader);
        assertEquals(TokeniserState.TagName, t4.getState());

        // Case default (error, emit '<', Data)
        Tokeniser t5 = new Tokeniser(new CharacterReader("1"), parser.errors());
        TokeniserState.TagOpen.read(t5, t5.reader);
        assertEquals(TokeniserState.Data, t5.getState());
    }

    @Test
    public void testEndTagOpenStateBranches() {
        Parser parser = parser = Parser.htmlParser();

        // Case isEmpty()
        Tokeniser t1 = new Tokeniser(new CharacterReader(""), parser.errors());
        TokeniserState.EndTagOpen.read(t1, t1.reader);
        assertEquals(TokeniserState.Data, t1.getState());

        // Case matchesLetter()
        Tokeniser t2 = new Tokeniser(new CharacterReader("div>"), parser.errors());
        TokeniserState.EndTagOpen.read(t2, t2.reader);
        assertEquals(TokeniserState.TagName, t2.getState());

        // Case matches('>')
        Tokeniser t3 = new Tokeniser(new CharacterReader(">"), parser.errors());
        TokeniserState.EndTagOpen.read(t3, t3.reader);
        assertEquals(TokeniserState.Data, t3.getState());

        // Case else (BogusComment)
        Tokeniser t4 = new Tokeniser(new CharacterReader("!"), parser.errors());
        TokeniserState.EndTagOpen.read(t4, t4.reader);
        assertEquals(TokeniserState.BogusComment, t4.getState());
    }

    @Test
    public void testMarkupDeclarationOpenBranches() {
        Parser parser = Parser.htmlParser();

        // Case "--" -> CommentStart
        Tokeniser t1 = new Tokeniser(new CharacterReader("--"), parser.errors());
        TokeniserState.MarkupDeclarationOpen.read(t1, t1.reader);
        assertEquals(TokeniserState.CommentStart, t1.getState());

        // Case "DOCTYPE" -> Doctype
        Tokeniser t2 = new Tokeniser(new CharacterReader("DOCTYPE"), parser.errors());
        TokeniserState.MarkupDeclarationOpen.read(t2, t2.reader);
        assertEquals(TokeniserState.Doctype, t2.getState());

        // Case "[CDATA[" -> CdataSection
        Tokeniser t3 = new Tokeniser(new CharacterReader("[CDATA["), parser.errors());
        TokeniserState.MarkupDeclarationOpen.read(t3, t3.reader);
        assertEquals(TokeniserState.CdataSection, t3.getState());

        // Case else -> BogusComment
        Tokeniser t4 = new Tokeniser(new CharacterReader("invalid"), parser.errors());
        TokeniserState.MarkupDeclarationOpen.read(t4, t4.reader);
        assertEquals(TokeniserState.BogusComment, t4.getState());
    }

    @Test
    public void testDoctypeStateBranches() {
        Parser parser = Parser.htmlParser();

        // Whitespace -> BeforeDoctypeName
        Tokeniser t1 = new Tokeniser(new CharacterReader(" "), parser.errors());
        TokeniserState.Doctype.read(t1, t1.reader);
        assertEquals(TokeniserState.BeforeDoctypeName, t1.getState());

        // '>' -> Data (forceQuirks = true)
        Tokeniser t2 = new Tokeniser(new CharacterReader(">"), parser.errors());
        TokeniserState.Doctype.read(t2, t2.reader);
        assertEquals(TokeniserState.Data, t2.getState());

        // Default -> BeforeDoctypeName
        Tokeniser t3 = new Tokeniser(new CharacterReader("x"), parser.errors());
        TokeniserState.Doctype.read(t3, t3.reader);
        assertEquals(TokeniserState.BeforeDoctypeName, t3.getState());
    }

    @Test
    public void testBogusCommentState() {
        Parser parser = Parser.htmlParser();
        Tokeniser t = new Tokeniser(new CharacterReader("comment>"), parser.errors());
        TokeniserState.BogusComment.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testCdataSectionState() {
        Parser parser = Parser.htmlParser();
        Tokeniser t = new Tokeniser(new CharacterReader("Some data]]>"), parser.errors());
        TokeniserState.CdataSection.read(t, t.reader);
        assertEquals(TokeniserState.Data, t.getState());
    }
}