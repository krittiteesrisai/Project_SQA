# วิเคราะห์และแนวทางการทดสอบ

จากซอร์สโค้ด `Tokeniser` ผมสามารถยืนยัน API ของคลาสที่พึ่งพา (`CharacterReader`, `ParseErrorList`, `Token.*`, `TokeniserState`) ได้เฉพาะส่วนที่ถูกเรียกใช้ตรง ๆ ในซอร์สที่ให้มาเท่านั้น (เช่น `Token.Character(String)`, `Token.Comment()`, `Token.StartTag()`, `tagPending.tagName`, `startTag.selfClosing`, `endTag.attributes.size()`, `reader.pos()`, `reader.isEmpty()` ฯลฯ) ส่วนที่ **ไม่สามารถยืนยันได้จากซอร์ส** (เช่น constructor/factory ของ `CharacterReader`, `ParseErrorList`) ผมอ้างอิงจาก API มาตรฐานของ jsoup รุ่นนี้ และ **คอมเมนต์กำกับไว้ชัดเจน** ตามข้อกำหนด

```java
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link Tokeniser} (Defects4J Jsoup-23b).
 *
 * หมายเหตุสมมติฐาน (ไม่สามารถยืนยันได้จากซอร์ส Tokeniser.java ที่ให้มา แต่จำเป็นต่อการคอมไพล์/รัน):
 *  - CharacterReader มี constructor สาธารณะ CharacterReader(String input)
 *  - ParseErrorList มี static factory: noTracking() และ tracking(int maxSize)
 *    และมีเมธอด size() (เพราะเป็น collection-like class)
 *  - Validate.isFalse(...) ที่ใช้ใน emit(Token) จะ throw RuntimeException (ชนิดย่อยไม่ยืนยัน)
 *  - EndTag ใหม่ (new Token.EndTag()) มี attributes เริ่มต้นเป็นค่าว่าง (size()==0)
 */
public class TokeniserTest {

    // ---------- Helpers ----------

    private Tokeniser newTokeniser(String input, ParseErrorList errors) {
        return new Tokeniser(new CharacterReader(input), errors);
    }

    /** สร้าง Tokeniser ที่มี lastStartTag ถูกตั้งค่าแล้ว (ผ่าน emit+read ปกติ) */
    private Tokeniser tokeniserWithLastStartTag(String tagName) {
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = newTokeniser("", errors);
        tokeniser.createTagPending(true); // StartTag
        tokeniser.tagPending.tagName = tagName;
        tokeniser.emitTagPending();
        tokeniser.read(); // consume pending token -> isEmitPending reset to false
        return tokeniser;
    }

    // ---------- state / transition / misc accessors ----------

    @Test
    public void testInitialStateIsData() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        assertEquals(TokeniserState.Data, tokeniser.getState());
    }

    @Test
    public void testTransitionChangesState() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        TokeniserState[] states = TokeniserState.values();
        assertTrue("enum ต้องมีมากกว่า 1 ค่า", states.length > 1);
        TokeniserState other = (states[0] == tokeniser.getState()) ? states[1] : states[0];
        tokeniser.transition(other);
        assertEquals(other, tokeniser.getState());
    }

    @Test
    public void testAdvanceTransitionAdvancesReaderAndChangesState() {
        CharacterReader reader = new CharacterReader("ab");
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.noTracking());
        int posBefore = reader.pos();
        TokeniserState[] states = TokeniserState.values();
        TokeniserState target = (states[0] == tokeniser.getState()) ? states[1] : states[0];
        tokeniser.advanceTransition(target);
        assertEquals(posBefore + 1, reader.pos());
        assertEquals(target, tokeniser.getState());
    }

    @Test
    public void testCurrentNodeInHtmlNSAlwaysTrue() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        assertTrue(tokeniser.currentNodeInHtmlNS());
    }

    @Test
    public void testCreateTempBufferInitializesEmptyBuffer() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        tokeniser.createTempBuffer();
        assertNotNull(tokeniser.dataBuffer);
        assertEquals(0, tokeniser.dataBuffer.length());
    }

    // ---------- error()/eofError() guard (canAddError) ----------

    @Test
    public void testErrorAddedWhenTrackingAvailable() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("x", errors);
        tokeniser.error(TokeniserState.Data);
        assertEquals(1, errors.size());
    }

    @Test
    public void testErrorNotAddedWhenTrackingExhausted() {
        ParseErrorList errors = ParseErrorList.tracking(1);
        Tokeniser tokeniser = newTokeniser("x", errors);
        tokeniser.error(TokeniserState.Data); // size 0<1 -> added
        tokeniser.error(TokeniserState.Data); // size 1<1 false -> not added
        assertEquals(1, errors.size());
    }

    @Test
    public void testErrorNotAddedWhenNoTracking() {
        ParseErrorList errors = ParseErrorList.noTracking();
        Tokeniser tokeniser = newTokeniser("x", errors);
        tokeniser.error(TokeniserState.Data);
        assertEquals(0, errors.size());
    }

    @Test
    public void testEofErrorAddedWhenTrackingAvailable() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("x", errors);
        tokeniser.eofError(TokeniserState.Data);
        assertEquals(1, errors.size());
    }

    // ---------- comment / doctype pending ----------

    @Test
    public void testCreateCommentPendingAndEmit() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Comment);
    }

    @Test
    public void testCreateDoctypePendingAndEmit() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        tokeniser.createDoctypePending();
        tokeniser.emitDoctypePending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.Doctype);
    }

    // ---------- isAppropriateEndTagToken / appropriateEndTagName ----------

    @Test
    public void testIsAppropriateEndTagTokenTrue() {
        Tokeniser tokeniser = tokeniserWithLastStartTag("div");
        tokeniser.createTagPending(false);
        tokeniser.tagPending.tagName = "div";
        assertTrue(tokeniser.isAppropriateEndTagToken());
        assertEquals("div", tokeniser.appropriateEndTagName());
    }

    @Test
    public void testIsAppropriateEndTagTokenFalse() {
        Tokeniser tokeniser = tokeniserWithLastStartTag("div");
        tokeniser.createTagPending(false);
        tokeniser.tagPending.tagName = "span";
        assertFalse(tokeniser.isAppropriateEndTagToken());
    }

    // ---------- emit(Token): StartTag / self-closing / EndTag branches ----------

    @Test
    public void testEmitSelfClosingStartTagTriggersUnacknowledgedErrorOnNextRead() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = newTokeniser("", errors);

        tokeniser.createTagPending(true); // StartTag
        tokeniser.tagPending.tagName = "br";
        ((Token.StartTag) tokeniser.tagPending).selfClosing = true;
        tokeniser.emitTagPending();

        Token first = tokeniser.read(); // consumes self-closing start tag, flag still false ack
        assertTrue(first instanceof Token.StartTag);
        assertEquals(0, errors.size()); // ยังไม่ error ในรอบนี้

        // รอบถัดไป: ต้องมี token รอ emit อีกตัว เพื่อให้ read() ทำงานถึงจุดตรวจ flag ก่อน loop
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        tokeniser.read(); // ตอนนี้ selfClosingFlagAcknowledged == false -> error ถูกเพิ่ม
        assertEquals(1, errors.size());
    }

    @Test
    public void testAcknowledgeSelfClosingFlagPreventsError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = newTokeniser("", errors);

        tokeniser.createTagPending(true);
        tokeniser.tagPending.tagName = "br";
        ((Token.StartTag) tokeniser.tagPending).selfClosing = true;
        tokeniser.emitTagPending();
        tokeniser.read();

        tokeniser.acknowledgeSelfClosingFlag(); // รับทราบก่อน read รอบถัดไป

        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        tokeniser.read();
        assertEquals(0, errors.size());
    }

    @Test
    public void testEmitNonSelfClosingStartTagDoesNotFlagUnacknowledged() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = newTokeniser("", errors);

        tokeniser.createTagPending(true);
        tokeniser.tagPending.tagName = "div";
        // selfClosing คงค่า default (false)
        tokeniser.emitTagPending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.StartTag);
        assertEquals(0, errors.size());
    }

    @Test
    public void testEmitEndTagWithNoAttributesDoesNotAddError() {
        ParseErrorList errors = ParseErrorList.tracking(10);
        Tokeniser tokeniser = newTokeniser("", errors);

        tokeniser.createTagPending(false); // EndTag
        tokeniser.tagPending.tagName = "div";
        tokeniser.emitTagPending();
        Token token = tokeniser.read();
        assertTrue(token instanceof Token.EndTag);
        // สมมติฐาน: attributes เริ่มต้นว่าง -> ไม่ error (ดูคอมเมนต์หัวไฟล์)
        assertEquals(0, errors.size());
    }

    @Test
    public void testEmitTokenTwiceWithoutReadThrowsException() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();

        boolean threw = false;
        try {
            tokeniser.emitCommentPending(); // emit ซ้อนโดยไม่ได้ read ก่อน -> Validate.isFalse ควร throw
        } catch (RuntimeException e) {
            threw = true;
        }
        assertTrue("คาดว่า emit ซ้ำโดยไม่ read จะ throw exception", threw);
    }

    // ---------- read(): charBuffer vs emitPending branch ----------

    @Test
    public void testReadReturnsBufferedCharactersBeforeEmitPendingToken() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());

        tokeniser.emit("abc"); // เติม charBuffer, ยังไม่ set isEmitPending
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending(); // isEmitPending = true

        Token first = tokeniser.read();
        assertTrue("ต้องได้ Character token ก่อน เพราะ charBuffer ไม่ว่าง",
                first instanceof Token.Character);

        Token second = tokeniser.read();
        assertTrue("จากนั้นต้องได้ token ที่ pending ไว้", second instanceof Token.Comment);
    }

    @Test
    public void testEmitCharAppendsToCharBuffer() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        tokeniser.emit('x');
        tokeniser.emit('y');
        tokeniser.createCommentPending();
        tokeniser.emitCommentPending();
        Token first = tokeniser.read();
        assertTrue(first instanceof Token.Character);
    }

    // ---------- consumeCharacterReference(): early-return branches ----------

    @Test
    public void testConsumeCharacterReference_emptyReaderReturnsNull() {
        Tokeniser tokeniser = newTokeniser("", ParseErrorList.noTracking());
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    @Test
    public void testConsumeCharacterReference_matchesAdditionalAllowedCharacterReturnsNull() {
        Tokeniser tokeniser = newTokeniser("<", ParseErrorList.noTracking());
        assertNull(tokeniser.consumeCharacterReference(Character.valueOf('<'), false));
    }

    @Test
    public void testConsumeCharacterReference_matchesDisallowedCharReturnsNull() {
        Tokeniser tokeniser = newTokeniser("\t", ParseErrorList.noTracking());
        assertNull(tokeniser.consumeCharacterReference(null, false));
    }

    // ---------- numeric: no numerals ----------

    @Test
    public void testConsumeCharacterReference_numericDecimalNoNumeralsReturnsNullWithError() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        // input คือส่วนหลัง '&' ที่ consume แล้วโดย caller state
        Tokeniser tokeniser = newTokeniser("#;", errors);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_numericHexNoNumeralsReturnsNullWithError() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("#x;", errors);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
    }

    // ---------- numeric: missing semicolon ----------

    @Test
    public void testConsumeCharacterReference_numericDecimalMissingSemicolonAddsErrorButReturnsChar() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("#65", errors); // ไม่มี ';'
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 65), result);
        assertEquals(1, errors.size()); // missing semicolon error
    }

    @Test
    public void testConsumeCharacterReference_numericDecimalValid() {
        Tokeniser tokeniser = newTokeniser("#65;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 65), result);
    }

    @Test
    public void testConsumeCharacterReference_numericHexValidLowercaseX() {
        Tokeniser tokeniser = newTokeniser("#x41;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 0x41), result);
    }

    @Test
    public void testConsumeCharacterReference_numericHexValidUppercaseX() {
        Tokeniser tokeniser = newTokeniser("#X41;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 0x41), result);
    }

    // ---------- numeric: surrogate range & max range boundaries ----------

    @Test
    public void testConsumeCharacterReference_surrogateLowerBoundary() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("#xD800;", errors);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_surrogateUpperBoundary() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("#xDFFF;", errors);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_justBelowSurrogateRangeValid() {
        Tokeniser tokeniser = newTokeniser("#xD7FF;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 0xD7FF), result);
    }

    @Test
    public void testConsumeCharacterReference_justAboveSurrogateRangeValid() {
        Tokeniser tokeniser = newTokeniser("#xE000;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 0xE000), result);
    }

    @Test
    public void testConsumeCharacterReference_aboveMaxCodePointReturnsReplacementChar() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("#x110000;", errors);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_atMaxCodePointTruncatedByCharCast() {
        // 0x10FFFF ถูก cast เป็น char (16-bit) -> ตัดบิตสูงทิ้ง เหลือ 0xFFFF
        // (นี่คือพฤติกรรมจริงของโค้ด ไม่ใช่การเดา)
        Tokeniser tokeniser = newTokeniser("#x10FFFF;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf((char) 0x10FFFF), result);
        assertEquals(Character.valueOf('\uFFFF'), result);
    }

    @Test
    public void testConsumeCharacterReference_numberFormatExceptionTreatedAsInvalid() {
        // ตัวเลขเกิน Integer range -> NumberFormatException ภายใน -> charval=-1 -> replacementChar
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("#99999999999;", errors);
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf(Tokeniser.replacementChar), result);
        assertEquals(1, errors.size());
    }

    // ---------- named character references ----------

    @Test
    public void testConsumeCharacterReference_namedEntityValid() {
        // "amp" เป็น named entity มาตรฐานของ HTML (ค่อนข้างแน่ใจว่ามีใน Entities)
        Tokeniser tokeniser = newTokeniser("amp;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertEquals(Character.valueOf('&'), result);
    }

    @Test
    public void testConsumeCharacterReference_namedEntityInvalidWithSemicolonAddsError() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("zzzzz;", errors); // ไม่ใช่ entity ที่มีอยู่จริง
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(1, errors.size());
    }

    @Test
    public void testConsumeCharacterReference_namedEntityInvalidNoSemicolonNoError() {
        ParseErrorList errors = ParseErrorList.tracking(5);
        Tokeniser tokeniser = newTokeniser("zzzzz", errors); // ไม่มี ';' -> looksLegit=false
        Character result = tokeniser.consumeCharacterReference(null, false);
        assertNull(result);
        assertEquals(0, errors.size()); // ไม่ error เพราะ looksLegit=false
    }

    @Test
    public void testConsumeCharacterReference_namedEntityInAttributeFollowedByDigitReturnsNull() {
        Tokeniser tokeniser = newTokeniser("amp1;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, true); // inAttribute = true
        assertNull(result); // ถูก rewind เพราะตามด้วยเลข ขณะอยู่ใน attribute
    }

    @Test
    public void testConsumeCharacterReference_namedEntityInAttributeFollowedBySemicolonValid() {
        Tokeniser tokeniser = newTokeniser("amp;", ParseErrorList.tracking(5));
        Character result = tokeniser.consumeCharacterReference(null, true); // inAttribute = true
        assertEquals(Character.valueOf('&'), result);
    }
}
```

## สรุปตารางความครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testInitialStateIsData | ค่าเริ่มต้นของ `state` |
| testTransitionChangesState | `transition()` setter |
| testAdvanceTransitionAdvancesReaderAndChangesState | `advanceTransition()`: reader.advance() + transition |
| testCurrentNodeInHtmlNSAlwaysTrue | `currentNodeInHtmlNS()` return true (fixed) |
| testCreateTempBufferInitializesEmptyBuffer | `createTempBuffer()` |
| testErrorAddedWhenTrackingAvailable / testErrorNotAddedWhenTrackingExhausted / testErrorNotAddedWhenNoTracking | `error(TokeniserState)` branch `canAddError()` true/false |
| testEofErrorAddedWhenTrackingAvailable | `eofError(TokeniserState)` true branch |
| testCreateCommentPendingAndEmit / testCreateDoctypePendingAndEmit | create/emit comment & doctype |
| testIsAppropriateEndTagTokenTrue/False | `isAppropriateEndTagToken()` true/false branch |
| testEmitSelfClosingStartTagTriggersUnacknowledgedErrorOnNextRead | `emit(Token)` StartTag branch + `read()` unacknowledged-flag branch (true) |
| testAcknowledgeSelfClosingFlagPreventsError | `acknowledgeSelfClosingFlag()` + flag branch (false) |
| testEmitNonSelfClosingStartTagDoesNotFlagUnacknowledged | StartTag branch, `selfClosing==false` sub-case |
| testEmitEndTagWithNoAttributesDoesNotAddError | EndTag branch, `attributes.size()>0` false case |
| testEmitTokenTwiceWithoutReadThrowsException | `Validate.isFalse` guard ใน `emit(Token)` |
| testReadReturnsBufferedCharactersBeforeEmitPendingToken | `read()` if/else: `charBuffer.length()>0` true/false |
| testEmitCharAppendsToCharBuffer | `emit(char)` |
| testConsumeCharacterReference_emptyReaderReturnsNull | `reader.isEmpty()` true branch |
| testConsumeCharacterReference_matchesAdditionalAllowedCharacterReturnsNull | additionalAllowedCharacter branch |
| testConsumeCharacterReference_matchesDisallowedCharReturnsNull | `matchesAny(...)` branch |
| testConsumeCharacterReference_numericDecimalNoNumeralsReturnsNullWithError / ...HexNoNumerals... | numRef.length()==0 branch (decimal & hex) |
| testConsumeCharacterReference_numericDecimalMissingSemicolonAddsErrorButReturnsChar | `!matchConsume(";")` true branch |
| testConsumeCharacterReference_numericDecimalValid / HexValid(Lower/Upper) | happy path decimal/hex, isHexMode true/false |
| testConsumeCharacterReference_surrogateLower/UpperBoundary | เงื่อนไข `charval>=0xD800 && <=0xDFFF` true (ขอบทั้งสองด้าน) |
| testConsumeCharacterReference_justBelow/AboveSurrogateRangeValid | เงื่อนไข surrogate false (ขอบ) |
| testConsumeCharacterReference_aboveMaxCodePointReturnsReplacementChar | `charval>0x10FFFF` true |
| testConsumeCharacterReference_atMaxCodePointTruncatedByCharCast | boundary `charval==0x10FFFF` (false) + fault-detect การ cast ตัด bit |
| testConsumeCharacterReference_numberFormatExceptionTreatedAsInvalid | `charval==-1` true (NumberFormatException path) |
| testConsumeCharacterReference_namedEntityValid | named branch, found=true, inAttribute=false |
| testConsumeCharacterReference_namedEntityInvalidWithSemicolonAddsError | found=false, looksLegit=true |
| testConsumeCharacterReference_namedEntityInvalidNoSemicolonNoError | found=false, looksLegit=false |
| testConsumeCharacterReference_namedEntityInAttributeFollowedByDigitReturnsNull | inAttribute=true + ตามด้วย digit → rewind |
| testConsumeCharacterReference_namedEntityInAttributeFollowedBySemicolonValid | inAttribute=true + เงื่อนไข false → ผ่านปกติ |

**หมายเหตุ:** branch ของ `endTag.attributes.size() > 0` (กรณี error) และรายละเอียด API ภายในของ `Attributes`/`Entities`/`ParseError` ไม่ถูกทดสอบตรง ๆ เนื่องจากไม่มีซอร์สโค้ดยืนยัน signature ที่แน่ชัด จึงเลี่ยงการเดา behavior ตามข้อกำหนดที่ 4