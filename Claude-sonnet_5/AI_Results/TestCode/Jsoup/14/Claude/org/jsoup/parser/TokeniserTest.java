package org.jsoup.parser;

import org.jsoup.parser.Tokeniser; // อยู่ใน package เดียวกัน (ใส่ตามข้อกำหนดข้อ 2)
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.Assert.*;

public class TokeniserTest {

    // ---------- helper ----------

    private Tokeniser newTokeniser(String input) {
        // หมายเหตุ: CharacterReader(String) เป็น constructor มาตรฐานของ jsoup
        // ไม่ได้ถูกแสดงในซอร์สของ Tokeniser ที่ให้มา แต่จำเป็นต้องใช้เพื่อสร้าง instance ทดสอบ
        CharacterReader reader = new CharacterReader(input);
        return new Tokeniser(reader);
    }

    @SuppressWarnings("unchecked")
    private List<ParseError> getErrors(Tokeniser t) throws Exception {
        Field f = Tokeniser.class.getDeclaredField("errors");
        f.setAccessible(true);
        return (List<ParseError>) f.get(t);
    }

    private boolean getSelfClosingFlag(Tokeniser t) throws Exception {
        Field f = Tokeniser.class.getDeclaredField("selfClosingFlagAcknowledged");
        f.setAccessible(true);
        return f.getBoolean(t);
    }

    private void setSelfClosingFlag(Tokeniser t, boolean value) throws Exception {
        Field f = Tokeniser.class.getDeclaredField("selfClosingFlagAcknowledged");
        f.setAccessible(true);
        f.setBoolean(t, value);
    }

    // ---------- read() / emit(Token) / emit(String) / emit(char) ----------

    @Test
    public void testReadReturnsSomeTokenForPlainText() {
        Tokeniser t = newTokeniser("Hello");
        Token token = t.read();
        assertNotNull(token);
        // ไม่สามารถยืนยันเนื้อหาของ Token.Character ได้ เพราะ accessor ไม่ปรากฎใน source ที่ให้มา
    }

    @Test
    public void testEmitCharBufferingReturnsCharacterTokenFirstThenPendingToken() {
        Tokeniser t = newTokeniser("x");
        t.emit("ab");
        t.emit('c');

        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        t.emit(startTag); // isEmitPending = true, lastStartTag ถูกตั้งค่า

        Token first = t.read(); // charBuffer.length() > 0 -> คืน Token.Character ก่อน
        assertTrue(first instanceof Token.Character);

        Token second = t.read(); // charBuffer ว่างแล้ว -> คืน emitPending (else branch)
        assertSame(startTag, second);
    }

    @Test
    public void testEmitStartTagSelfClosingSetsFlagUnacknowledged() throws Exception {
        Tokeniser t = newTokeniser("x");
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "br";
        startTag.selfClosing = true;
        t.emit(startTag);

        assertFalse(getSelfClosingFlag(t));
    }

    @Test
    public void testReadWithUnacknowledgedSelfClosingFlagLogsErrorAndResetsFlag() throws Exception {
        Tokeniser t = newTokeniser("x");
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "br";
        startTag.selfClosing = true;
        t.emit(startTag); // selfClosingFlagAcknowledged = false

        int before = getErrors(t).size();
        t.read(); // top-of-read branch: error() ถูกเรียก แล้ว reset flag = true

        assertTrue(getSelfClosingFlag(t));
        assertEquals(before + 1, getErrors(t).size());
    }

    @Test
    public void testEmitEndTagWithoutAttributesDoesNotLogError() throws Exception {
        Tokeniser t = newTokeniser("x");
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "div";
        int before = getErrors(t).size();
        t.emit(endTag);
        assertEquals(before, getErrors(t).size());
        // หมายเหตุ: กรณี attributes.size() > 0 ไม่ได้ทดสอบ เพราะ API การเพิ่ม attribute
        // ไม่ได้ถูกอ้างถึงในซอร์สของ Tokeniser ที่ให้มา (เลี่ยงการเดา behavior ของ Attributes)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmitWhenPendingAlreadySetThrows() {
        Tokeniser t = newTokeniser("x");
        Token.StartTag s1 = new Token.StartTag();
        s1.tagName = "a";
        t.emit(s1);

        Token.StartTag s2 = new Token.StartTag();
        s2.tagName = "b";
        t.emit(s2); // Validate.isFalse ควร throw เพราะ isEmitPending = true แล้ว
    }

    // ---------- getState() / transition() / advanceTransition() ----------

    @Test
    public void testGetStateDefaultIsData() {
        Tokeniser t = newTokeniser("x");
        assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testTransitionChangesState() {
        // หมายเหตุ: TokeniserState.Rcdata ไม่ได้ปรากฎในซอร์ส Tokeniser ที่ให้มา
        // แต่เป็นค่าที่รู้จักกันทั่วไปในสถานะของ jsoup tokeniser (เดาอย่างมีเหตุผล)
        Tokeniser t = newTokeniser("x");
        t.transition(TokeniserState.Rcdata);
        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    @Test
    public void testAdvanceTransitionAdvancesReaderAndChangesState() {
        CharacterReader reader = new CharacterReader("abc");
        Tokeniser t = new Tokeniser(reader);
        assertEquals(0, reader.pos());
        t.advanceTransition(TokeniserState.Rcdata);
        assertEquals(1, reader.pos());
        assertEquals(TokeniserState.Rcdata, t.getState());
    }

    // ---------- acknowledgeSelfClosingFlag() ----------

    @Test
    public void testAcknowledgeSelfClosingFlagResetsToTrue() throws Exception {
        Tokeniser t = newTokeniser("x");
        setSelfClosingFlag(t, false);
        t.acknowledgeSelfClosingFlag();
        assertTrue(getSelfClosingFlag(t));
    }

    // ---------- consumeCharacterReference() ----------

    @Test
    public void testConsumeCharacterReferenceNullWhenReaderEmpty() {
        CharacterReader reader = new CharacterReader("");
        Tokeniser t = new Tokeniser(reader);
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceNullWhenMatchesAdditionalAllowedChar() {
        CharacterReader reader = new CharacterReader("\"rest");
        Tokeniser t = new Tokeniser(reader);
        assertNull(t.consumeCharacterReference('"', false));
    }

    @Test
    public void testConsumeCharacterReferenceNullWhenMatchesAnyDisallowedChar() {
        CharacterReader reader = new CharacterReader("\tabc");
        Tokeniser t = new Tokeniser(reader);
        assertNull(t.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReferenceDecimalValid() {
        CharacterReader reader = new CharacterReader("#65;");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('A', c.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceHexValidUppercaseX() {
        CharacterReader reader = new CharacterReader("#X41;");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('A', c.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceHexValidLowercaseX() {
        CharacterReader reader = new CharacterReader("#x41;");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('A', c.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceMissingSemicolonStillParsesAndLogsError() throws Exception {
        CharacterReader reader = new CharacterReader("#65");
        Tokeniser t = new Tokeniser(reader);
        int before = getErrors(t).size();
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('A', c.charValue());
        assertEquals(before + 1, getErrors(t).size());
    }

    @Test
    public void testConsumeCharacterReferenceNoDigitsAfterHashReturnsNullAndRewinds() {
        CharacterReader reader = new CharacterReader("#;rest");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(0, reader.pos()); // ต้อง rewind กลับไปที่ mark (ตำแหน่งก่อน '#')
    }

    @Test
    public void testConsumeCharacterReferenceSurrogateRangeReturnsReplacementChar() {
        CharacterReader reader = new CharacterReader("#xD800;");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals(Tokeniser.replacementChar, c.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceOutOfUnicodeRangeReturnsReplacementChar() {
        // boundary: 0x10FFFF คือค่าสูงสุดที่ยอมรับได้, 0x110000 คือค่าเกินขอบเขต
        CharacterReader reader = new CharacterReader("#x110000;");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals(Tokeniser.replacementChar, c.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNumberFormatExceptionBranch() throws Exception {
        // ตัวเลขยาวเกิน Integer range ทำให้ Integer.valueOf throw NumberFormatException
        // ซึ่งถูก catch แล้วตั้ง charval = -1 -> เข้า branch error + replacementChar
        CharacterReader reader = new CharacterReader("#99999999999;");
        Tokeniser t = new Tokeniser(reader);
        int before = getErrors(t).size();
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals(Tokeniser.replacementChar, c.charValue());
        assertEquals(before + 1, getErrors(t).size());
    }

    @Test
    public void testConsumeCharacterReferenceNamedValid() {
        // หมายเหตุ: สมมติว่า "amp;" เป็น named entity ที่ถูกต้องตามข้อมูลจริงของ Entities ใน jsoup
        // (ไม่ได้ verify จาก source ของ Entities ที่ไม่ได้ให้มา)
        CharacterReader reader = new CharacterReader("amp;rest");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, false);
        assertNotNull(c);
        assertEquals('&', c.charValue());
    }

    @Test
    public void testConsumeCharacterReferenceNamedNotFoundNoSemicolonNoError() throws Exception {
        CharacterReader reader = new CharacterReader("zzzqqq");
        Tokeniser t = new Tokeniser(reader);
        int before = getErrors(t).size();
        Character c = t.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(before, getErrors(t).size());
    }

    @Test
    public void testConsumeCharacterReferenceNamedNotFoundWithSemicolonLogsError() throws Exception {
        CharacterReader reader = new CharacterReader("zzzqqq;");
        Tokeniser t = new Tokeniser(reader);
        int before = getErrors(t).size();
        Character c = t.consumeCharacterReference(null, false);
        assertNull(c);
        assertEquals(before + 1, getErrors(t).size());
    }

    @Test
    public void testConsumeCharacterReferenceInAttributeFollowedByEqualsRewinds() {
        // หมายเหตุ: สมมติว่า "amp" (ไม่มี ;) ถูกจดจำเป็น named entity ที่ valid
        CharacterReader reader = new CharacterReader("amp=1");
        Tokeniser t = new Tokeniser(reader);
        Character c = t.consumeCharacterReference(null, true);
        assertNull(c);
    }

    @Test
    public void testConsumeCharacterReferenceNamedMissingSemicolonLogsErrorWhenNotAttribute() throws Exception {
        CharacterReader reader = new CharacterReader("amp rest");
        Tokeniser t = new Tokeniser(reader);
        int before = getErrors(t).size();
        t.consumeCharacterReference(null, false);
        assertEquals(before + 1, getErrors(t).size());
    }

    // ---------- createTagPending() / emitTagPending() ----------

    @Test
    public void testCreateTagPendingStartReturnsStartTag() {
        Tokeniser t = newTokeniser("x");
        Token.Tag tag = t.createTagPending(true);
        assertTrue(tag instanceof Token.StartTag);
        assertSame(tag, t.tagPending);
    }

    @Test
    public void testCreateTagPendingEndReturnsEndTag() {
        Tokeniser t = newTokeniser("x");
        Token.Tag tag = t.createTagPending(false);
        assertTrue(tag instanceof Token.EndTag);
        assertSame(tag, t.tagPending);
    }

    @Test
    public void testEmitTagPendingReturnsSameTagViaRead() {
        Tokeniser t = newTokeniser("x");
        Token.Tag tag = t.createTagPending(true);
        tag.tagName = "div";
        t.emitTagPending();
        Token result = t.read();
        assertSame(tag, result);
    }

    // ---------- createCommentPending() / emitCommentPending() ----------

    @Test
    public void testCreateAndEmitCommentPending() {
        Tokeniser t = newTokeniser("x");
        t.createCommentPending();
        assertNotNull(t.commentPending);
        t.emitCommentPending();
        Token result = t.read();
        assertSame(t.commentPending, result);
    }

    // ---------- createDoctypePending() / emitDoctypePending() ----------

    @Test
    public void testCreateAndEmitDoctypePending() {
        Tokeniser t = newTokeniser("x");
        t.createDoctypePending();
        assertNotNull(t.doctypePending);
        t.emitDoctypePending();
        Token result = t.read();
        assertSame(t.doctypePending, result);
    }

    // ---------- createTempBuffer() ----------

    @Test
    public void testCreateTempBufferInitializesEmptyBuffer() {
        Tokeniser t = newTokeniser("x");
        t.createTempBuffer();
        assertNotNull(t.dataBuffer);
        assertEquals(0, t.dataBuffer.length());
    }

    // ---------- isAppropriateEndTagToken() ----------

    @Test
    public void testIsAppropriateEndTagTokenTrueWhenNameMatches() {
        Tokeniser t = newTokeniser("x");
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        t.emit(startTag);

        Token.EndTag endTag = (Token.EndTag) t.createTagPending(false);
        endTag.tagName = "div";

        assertTrue(t.isAppropriateEndTagToken());
    }

    @Test
    public void testIsAppropriateEndTagTokenFalseWhenNameDiffers() {
        Tokeniser t = newTokeniser("x");
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "div";
        t.emit(startTag);

        Token.EndTag endTag = (Token.EndTag) t.createTagPending(false);
        endTag.tagName = "span";

        assertFalse(t.isAppropriateEndTagToken());
    }

    // ---------- isTrackErrors() / setTrackErrors() ----------

    @Test
    public void testIsTrackErrorsDefaultTrue() {
        Tokeniser t = newTokeniser("x");
        assertTrue(t.isTrackErrors());
    }

    @Test
    public void testSetTrackErrorsFalsePreventsErrorLogging() throws Exception {
        Tokeniser t = newTokeniser("x");
        t.setTrackErrors(false);
        assertFalse(t.isTrackErrors());
        int before = getErrors(t).size();
        t.error(TokeniserState.Data);
        assertEquals(before, getErrors(t).size());
    }

    @Test
    public void testSetTrackErrorsTrueAllowsErrorLogging() throws Exception {
        Tokeniser t = newTokeniser("x");
        t.setTrackErrors(true);
        int before = getErrors(t).size();
        t.error(TokeniserState.Data);
        assertEquals(before + 1, getErrors(t).size());
    }

    // ---------- error(TokeniserState) / eofError(TokeniserState) ----------

    @Test
    public void testErrorStateAddsParseErrorWhenTrackingOn() throws Exception {
        Tokeniser t = newTokeniser("abc");
        int before = getErrors(t).size();
        t.error(TokeniserState.Data);
        assertEquals(before + 1, getErrors(t).size());
    }

    @Test
    public void testEofErrorAddsParseErrorWhenTrackingOn() throws Exception {
        Tokeniser t = newTokeniser("abc");
        int before = getErrors(t).size();
        t.eofError(TokeniserState.Data);
        assertEquals(before + 1, getErrors(t).size());
    }

    @Test
    public void testEofErrorDoesNotAddWhenTrackingOff() throws Exception {
        Tokeniser t = newTokeniser("abc");
        t.setTrackErrors(false);
        int before = getErrors(t).size();
        t.eofError(TokeniserState.Data);
        assertEquals(before, getErrors(t).size());
    }

    // ---------- currentNodeInHtmlNS() ----------

    @Test
    public void testCurrentNodeInHtmlNSAlwaysTrue() {
        Tokeniser t = newTokeniser("x");
        assertTrue(t.currentNodeInHtmlNS());
    }
}
