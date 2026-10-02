package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link ReturnsDeepStubs}.
 *
 * หมายเหตุ: บางค่า default (เช่น "" สำหรับ String, 0 สำหรับ int, false สำหรับ boolean)
 * อ้างอิงจากพฤติกรรมที่รู้จักโดยทั่วไปของ Mockito's ReturnsEmptyValues
 * ซึ่งไม่ได้แสดง source ในไฟล์ที่ให้มา - จึงกำกับด้วยคอมเมนต์ "ASSUMPTION"
 */
public class ReturnsDeepStubsTest {

    // ---- Fixtures: interface เพื่อให้ทดสอบ deep-stub chaining ----
    public interface Baz {
    }

    public interface Qux {
    }

    public interface Bar {
        Baz getBaz();
    }

    public interface Foo {
        Bar getBar();
        Bar getBarByIndex(int idx);
        Qux getQux();
        String getName();      // final class -> not mockable
        int getNumber();       // primitive -> not mockable
        boolean isActive();    // primitive -> not mockable
    }

    private final ReturnsDeepStubs answer = new ReturnsDeepStubs();

    // ------------------------------------------------------------------
    // Branch: loop ว่าง (ยังไม่มี stub) -> recordDeepStubMock ถูกเรียก
    // ------------------------------------------------------------------
    @Test
    public void shouldCreateDeepStubMockWhenNoPriorStubbing() {
        Foo foo = mock(Foo.class, answer);
        Bar bar = foo.getBar();
        assertNotNull("deep stub ควรสร้าง mock ไม่เป็น null", bar);
    }

    // ------------------------------------------------------------------
    // Branch: loop มี item และ matches() == true -> คืนค่า cached mock ตัวเดิม
    // ------------------------------------------------------------------
    @Test
    public void shouldReturnSameMockOnRepeatedInvocationWithSameArgs() {
        Foo foo = mock(Foo.class, answer);
        Bar bar1 = foo.getBar();
        Bar bar2 = foo.getBar();
        assertSame("เรียกซ้ำด้วย invocation เดียวกันต้องได้ mock ตัวเดิม (ถูก cache ผ่าน stubbedInvocations)",
                bar1, bar2);
    }

    // ------------------------------------------------------------------
    // Branch: matches() ตรวจสอบ argument - args ต่างกันต้องไม่ match (ได้ mock คนละตัว)
    // แต่ args เดิมต้อง match (ได้ mock ตัวเดิม) -> ครอบคลุมทั้ง true/false ของ matches()
    // ------------------------------------------------------------------
    @Test
    public void shouldDifferentiateDeepStubsByMethodArguments() {
        Foo foo = mock(Foo.class, answer);

        Bar b1 = foo.getBarByIndex(1);
        Bar b1Again = foo.getBarByIndex(1);
        Bar b2 = foo.getBarByIndex(2);

        assertSame("args เหมือนกันต้องได้ mock ตัวเดิม", b1, b1Again);
        assertNotSame("args ต่างกันต้องได้ mock คนละตัว (deep stub ใหม่)", b1, b2);
    }

    // ------------------------------------------------------------------
    // Branch: loop มี item (จาก method อื่นที่ stub ไว้ก่อน) แต่ไม่ match
    // -> ตกไป recordDeepStubMock สำหรับ invocation ใหม่
    // ------------------------------------------------------------------
    @Test
    public void shouldFallThroughToNewDeepStubWhenNoStubMatches() {
        Foo foo = mock(Foo.class, answer);

        // บังคับให้มี stubbedInvocation เกิดขึ้นก่อน (สำหรับ getBar())
        Bar bar = foo.getBar();
        assertNotNull(bar);

        // เรียก method อื่น (getQux) ซึ่งไม่ match กับ invocation ที่ stub ไว้ก่อนหน้า
        Qux qux = foo.getQux();
        assertNotNull("ต้องสร้าง deep stub mock ใหม่สำหรับ invocation ที่ไม่ match", qux);
    }

    // ------------------------------------------------------------------
    // Branch: chained deep stub (multi-level) -> recordDeepStubMock เรียกตัวเองซ้ำ
    // ------------------------------------------------------------------
    @Test
    public void shouldSupportChainedDeepStubs() {
        Foo foo = mock(Foo.class, answer);
        Baz baz = foo.getBar().getBaz();
        assertNotNull("deep stub แบบ chain หลายชั้นต้องคืน mock ไม่เป็น null", baz);
    }

    // ------------------------------------------------------------------
    // Branch: loop match == true และ answer ที่ stub ไว้คืนค่า explicit (รวมถึง null)
    // -> ทดสอบ boundary ค่า null ที่ override deep stub
    // ------------------------------------------------------------------
    @Test
    public void shouldAllowExplicitStubbingToOverrideDeepStubWithNull() {
        Foo foo = mock(Foo.class, answer);
        when(foo.getBar()).thenReturn(null);

        assertNull("explicit stubbing คืนค่า null ต้อง override deep stub", foo.getBar());
    }

    // ------------------------------------------------------------------
    // Branch: loop match == true และ answer ที่ stub ไว้คืนค่า object ที่กำหนดเอง
    // -> ทดสอบว่า explicit stubbing ทำงานเหนือ deep-stub mechanism
    // ------------------------------------------------------------------
    @Test
    public void shouldAllowExplicitStubbingToOverrideDeepStubWithValue() {
        Foo foo = mock(Foo.class, answer);
        Bar explicitBar = mock(Bar.class);

        when(foo.getBar()).thenReturn(explicitBar);

        assertSame("explicit stubbing ต้องคืนค่าที่กำหนดไว้ ไม่ใช่ deep stub ใหม่",
                explicitBar, foo.getBar());
    }

    // ------------------------------------------------------------------
    // Branch: isTypeMockable(rawType) == false สำหรับ final class (String)
    // -> ไปทาง delegate.returnValueFor(rawType)
    // ------------------------------------------------------------------
    @Test
    public void shouldReturnEmptyValueForNonMockableFinalClassReturnType() {
        Foo foo = mock(Foo.class, answer);
        String name = foo.getName();

        assertNotNull("ไม่ควรเป็น null สำหรับ non-mockable type ที่ ReturnsEmptyValues รองรับ", name);
        // ASSUMPTION: ReturnsEmptyValues คืน "" สำหรับ String (ไม่ได้ยืนยันจาก source ที่ให้มา)
        assertEquals("", name);
    }

    // ------------------------------------------------------------------
    // Branch: isTypeMockable(rawType) == false สำหรับ primitive (int)
    // -> ค่า default ของ ReturnsEmptyValues (boundary case: 0)
    // ------------------------------------------------------------------
    @Test
    public void shouldReturnDefaultPrimitiveValueForIntReturnType() {
        Foo foo = mock(Foo.class, answer);
        int number = foo.getNumber();

        // ASSUMPTION: ค่า default ของ primitive int คือ 0 ตาม ReturnsEmptyValues
        assertEquals(0, number);
    }

    // ------------------------------------------------------------------
    // Branch: isTypeMockable(rawType) == false สำหรับ primitive (boolean)
    // -> ทดสอบ boundary อีกรูปแบบของ primitive type
    // ------------------------------------------------------------------
    @Test
    public void shouldReturnDefaultPrimitiveValueForBooleanReturnType() {
        Foo foo = mock(Foo.class, answer);
        boolean active = foo.isActive();

        // ASSUMPTION: ค่า default ของ primitive boolean คือ false ตาม ReturnsEmptyValues
        assertFalse(active);
    }

    // ------------------------------------------------------------------
    // ทดสอบว่าการเรียกซ้ำกับ non-mockable return type ไม่พัง และคงที่
    // (ไม่ผ่าน getMock/recordDeepStubMock เลย เพราะเข้า branch delegate ตั้งแต่ต้น)
    // ------------------------------------------------------------------
    @Test
    public void shouldConsistentlyReturnEmptyValueOnRepeatedCallsForNonMockableType() {
        Foo foo = mock(Foo.class, answer);
        String first = foo.getName();
        String second = foo.getName();

        assertEquals("ค่าที่ไม่ mockable ควรคงที่ทุกครั้งที่เรียก", first, second);
    }
}
