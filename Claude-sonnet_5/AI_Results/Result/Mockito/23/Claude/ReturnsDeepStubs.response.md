# วิเคราะห์ Branch/Condition หลักในซอร์สโค้ด

จากคลาส `ReturnsDeepStubs` พบจุดแตกสาขาสำคัญดังนี้:

1. `answer()`: `if (!mockitoCore.isTypeMockable(rawType))` → true (ไป `delegate.returnValueFor`) / false (ไป `getMock`)
2. `getMock()`: for-loop บน `container.getStubbedInvocations()` + `if (... matches ...)` → match เจอ (คืนค่าเดิม) / ไม่เจอ (สร้าง deep stub ใหม่)
3. `withSettingsUsing()`: ternary `rawExtraInterfaces().length > 0` → true (เติม extraInterfaces) / false (ไม่เติม)
4. `recordDeepStubMock()`: ถูกเรียกเสมอเมื่อสร้าง mock ใหม่ (ไม่มี branch แต่ควร cover เพื่อยืนยันผลลัพธ์)
5. `actualParameterizedType()`: implementation เดิม (protected) เทียบกับ anonymous subclass ที่ override ใน `returnsDeepStubsAnswerUsing`
6. Null-safety: ไม่มีการเช็ค null → NPE เมื่อ `invocation == null`

หมายเหตุ: เนื่องจากหลายเมธอดเป็น `private` และพึ่งพา Mockito internal APIs (MockUtil, InvocationContainerImpl, GenericMetadataSupport) อย่างมาก วิธีทดสอบที่ปลอดภัยและสมเหตุสมผลที่สุดคือทดสอบผ่าน public entrypoint (`answer`) โดยใช้ `mock(Class, Answer)` จริงของ Mockito framework (ซึ่งเป็นส่วนหนึ่งของโปรเจกต์ที่ถูกทดสอบ - Defects4J Mockito-23b) แทนการ mock ภายในของตัวมันเอง — ทำให้ได้ integration-style unit test ที่ยังคง cover branch ได้จริงและไม่ "เดา behavior" ที่ไม่มีในซอร์ส

```java
package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

/**
 * Unit tests for {@link ReturnsDeepStubs}.
 *
 * หมายเหตุสำคัญ:
 * - คลาสนี้พึ่งพา Mockito internal API อย่างมาก (MockUtil, InvocationContainerImpl,
 *   GenericMetadataSupport) ซึ่งเป็น private helper เกือบทั้งหมด
 *   จึงทดสอบผ่าน public entrypoint (answer) โดยสร้าง mock จริงด้วย
 *   org.mockito.Mockito.mock(Class, Answer) แล้วตรวจผลลัพธ์ที่สังเกตได้จากภายนอก
 * - ไม่ได้เดา behavior ที่ไม่มีในซอร์ส เช่น ค่า default ของ String ("")
 *   และ int (0) อ้างอิงจาก ReturnsEmptyValues ซึ่งเป็น delegate ที่ระบุไว้ในซอร์สจริง
 */
public class ReturnsDeepStubsTest {

    // ---------- Fixtures สำหรับทดสอบ branch ต่าง ๆ ----------

    interface Foo {
        Bar getBar();
        String getName();      // final class -> not mockable
        int getNumber();       // primitive -> not mockable
        Baz getBaz(String key);
    }

    interface Bar {
        Baz getBaz();
    }

    interface Baz {
        String getValue();
    }

    // ตัวอย่างจาก Javadoc ของคลาสเป้าหมาย (nested generics)
    interface GenericsNest<K extends Comparable<K>> extends Map<K, Set<Number>> {}

    // Interface ที่มี bounded type variable แบบ intersection -> rawExtraInterfaces().length > 0
    interface WithExtraInterfaces<T extends Serializable & Cloneable> {
        T getItem();
    }

    // ---------- 1) Branch: isTypeMockable == false (Interface -> mockable) ----------

    @Test
    public void testDeepStub_returnsNonNullMockForInterfaceReturnType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar bar = foo.getBar();
        assertNotNull(bar);
    }

    // ---------- 2) Branch: for-loop matches previous stubbed invocation (เรียกซ้ำ) ----------

    @Test
    public void testDeepStub_sameInvocationReturnsSameMockInstance() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar bar1 = foo.getBar();
        Bar bar2 = foo.getBar();
        assertSame(bar1, bar2);
    }

    // ---------- 3) ทดสอบ recursive deep stub หลายชั้น (nested answer()) ----------

    @Test
    public void testDeepStub_nestedCallsReturnNonNullMocksAndDefaultValues() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Baz baz = foo.getBar().getBaz();
        assertNotNull(baz);
        String value = baz.getValue(); // String ไม่ mockable -> delegate คืนค่า ""
        assertEquals("", value);
    }

    // ---------- 4) Branch: isTypeMockable == false เพราะ final class (String) ----------

    @Test
    public void testAnswer_returnsEmptyStringForFinalNonMockableReturnType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        String name = foo.getName();
        assertEquals("", name);
    }

    // ---------- 5) Branch: isTypeMockable == false เพราะ primitive (int) ----------

    @Test
    public void testAnswer_returnsZeroForPrimitiveIntReturnType() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        int number = foo.getNumber();
        assertEquals(0, number);
    }

    // ---------- 6) Branch: for-loop ไม่เจอ match (argument ต่างกัน) -> สร้าง mock ใหม่ ----------

    @Test
    public void testDeepStub_differentArgumentsReturnDifferentMockInstances() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Baz baz1 = foo.getBaz("key1");
        Baz baz2 = foo.getBaz("key2");
        assertNotNull(baz1);
        assertNotNull(baz2);
        assertNotSame(baz1, baz2);
    }

    // ---------- 7) Branch: for-loop เจอ match (argument เดียวกัน) -> คืน mock เดิม ----------

    @Test
    public void testDeepStub_sameArgumentsReturnSameMockInstance() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Baz baz1 = foo.getBaz("key1");
        Baz baz2 = foo.getBaz("key1");
        assertSame(baz1, baz2);
    }

    // ---------- 8) Boundary/edge: argument เป็น null ----------

    @Test
    public void testDeepStub_withNullArgument_matchesConsistently() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Baz bazNull1 = foo.getBaz(null);
        Baz bazNull2 = foo.getBaz(null);
        assertNotNull(bazNull1);
        assertSame(bazNull1, bazNull2);
    }

    // ---------- 9) Null-safety: invocation == null -> NPE (ไม่มีการป้องกัน null ในซอร์ส) ----------

    @Test(expected = NullPointerException.class)
    public void testAnswer_nullInvocationThrowsNPE() throws Throwable {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        answer.answer(null);
    }

    // ---------- 10) Nested generics ตามตัวอย่างใน Javadoc ของคลาสเป้าหมาย ----------

    @Test
    public void testDeepStub_withGenericsNest_returnsNonNullNestedNumber() {
        // Number เป็น abstract class (ไม่ final) -> mockable ได้
        GenericsNest<?> mock = mock(GenericsNest.class, new ReturnsDeepStubs());
        Number number = mock.entrySet().iterator().next().getValue().iterator().next();
        assertNotNull(number);
    }

    // ---------- 11) Branch: withSettingsUsing -> rawExtraInterfaces().length > 0 (true) ----------

    @Test
    public void testDeepStub_withExtraInterfacesBound_mockImplementsExtraInterfaces() {
        // T extends Serializable & Cloneable -> ควรทำให้ rawExtraInterfaces() ไม่ว่าง
        // (พฤติกรรมนี้อ้างอิงจาก GenericMetadataSupport ที่ resolve bounded type variable
        //  จึงอาจอ่อนไหวต่อ implementation ของ generics resolution ภายใน Mockito เวอร์ชันนี้)
        WithExtraInterfaces<?> mock = mock(WithExtraInterfaces.class, new ReturnsDeepStubs());
        Object item = mock.getItem();
        assertNotNull(item);
        assertTrue(item instanceof Cloneable);
        assertTrue(item instanceof Serializable);
    }

    // ---------- 12) ทดสอบ protected actualParameterizedType() แบบ default (ไม่ override) ----------

    @Test
    public void testActualParameterizedType_returnsMetadataMatchingMockedType() {
        Foo foo = mock(Foo.class); // ไม่ใช้ ReturnsDeepStubs เป็น default answer
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        GenericMetadataSupport metadata = answer.actualParameterizedType(foo);
        assertNotNull(metadata);
        assertEquals(Foo.class, metadata.rawType());
    }

    // ---------- 13) Boundary: เรียกหลาย method บน mock เดียวกัน ต้องได้ cache อิสระกัน ----------

    @Test
    public void testDeepStub_multipleDifferentMethodsOnSameParentMockAreIndependent() {
        Foo foo = mock(Foo.class, new ReturnsDeepStubs());
        Bar bar = foo.getBar();
        Baz baz = foo.getBaz("x");
        assertNotNull(bar);
        assertNotNull(baz);
        // คนละ method/invocation -> ไม่ควรเป็น instance เดียวกัน (ต่าง type กันอยู่แล้ว)
        assertNotSame((Object) bar, (Object) baz);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testDeepStub_returnsNonNullMockForInterfaceReturnType` | `answer()`: `isTypeMockable == true` → เข้า `getMock()`, สร้าง deep stub mock สำเร็จ |
| `testDeepStub_sameInvocationReturnsSameMockInstance` | `getMock()`: for-loop พบ match (`matches()==true`) → คืนค่า mock เดิมจาก `stubbedInvocationMatcher.answer()` |
| `testDeepStub_nestedCallsReturnNonNullMocksAndDefaultValues` | การเรียก `answer()` แบบ recursive หลายชั้น + branch `isTypeMockable==false` สำหรับ `String` |
| `testAnswer_returnsEmptyStringForFinalNonMockableReturnType` | `answer()`: `isTypeMockable == false` (final class `String`) → `delegate.returnValueFor()` |
| `testAnswer_returnsZeroForPrimitiveIntReturnType` | `answer()`: `isTypeMockable == false` (primitive `int`) → `delegate.returnValueFor()` |
| `testDeepStub_differentArgumentsReturnDifferentMockInstances` | `getMock()`: for-loop **ไม่** match → fall through ไปสร้าง deep stub ใหม่ผ่าน `recordDeepStubMock()` |
| `testDeepStub_sameArgumentsReturnSameMockInstance` | `getMock()`: for-loop match สำหรับ invocation ที่มี argument เดียวกัน |
| `testDeepStub_withNullArgument_matchesConsistently` | Boundary/null argument + branch match ใน for-loop ด้วยค่า null |
| `testAnswer_nullInvocationThrowsNPE` | Null-safety path: ไม่มีการเช็ค null → NPE ที่ `invocation.getMock()` |
| `testDeepStub_withGenericsNest_returnsNonNullNestedNumber` | Nested generics resolution ผ่าน `actualParameterizedType()` (override แบบ anonymous subclass) + mockable abstract class (`Number`) |
| `testDeepStub_withExtraInterfacesBound_mockImplementsExtraInterfaces` | `withSettingsUsing()`: ternary `rawExtraInterfaces().length > 0 == true` |
| `testActualParameterizedType_returnsMetadataMatchingMockedType` | `actualParameterizedType()` (protected, default implementation ที่ไม่ถูก override) |
| `testDeepStub_multipleDifferentMethodsOnSameParentMockAreIndependent` | ตรวจสอบว่าแต่ละ invocation (method ต่างกัน) ของ container จัดเก็บ/คืนค่า mock แยกกันอย่างถูกต้อง |

**ข้อจำกัดที่ควรระบุไว้ (ตามข้อกำหนดข้อ 4):**
- Test #11 (`testDeepStub_withExtraInterfacesBound_...`) และ #10 (`testDeepStub_withGenericsNest_...`) อ้างอิงพฤติกรรม generics resolution ที่ซับซ้อนภายใน `GenericMetadataSupport` ซึ่งไม่ได้แสดง source ให้ตรวจสอบโดยตรงในที่นี้ — จึงมีความเป็นไปได้ที่ผลลัพธ์จริงอาจต่างจากที่คาดไว้เล็กน้อยตาม Mockito version ที่ใช้ทดสอบ (ได้ใส่คอมเมนต์กำกับไว้ในโค้ดแล้ว)