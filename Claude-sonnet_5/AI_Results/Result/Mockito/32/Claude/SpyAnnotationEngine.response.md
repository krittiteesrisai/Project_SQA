นี่คือชุดทดสอบ JUnit 4 สำหรับ `SpyAnnotationEngine` (Mockito-32b)

**หมายเหตุสำคัญ:** เพื่อให้สามารถเรียกเมธอด `assertNoAnnotations` (package-private, ไม่มี modifier) ได้โดยตรงสำหรับการทดสอบแบบ white-box ผมจึงประกาศคลาสทดสอบไว้ใน **package เดียวกัน** กับคลาสเป้าหมาย (`org.mockito.internal.configuration`) ซึ่งเป็นวิธีที่ยอมรับได้ในการเขียน unit test ของเมธอดระดับ package-visibility โดยไม่ต้องใช้ reflection เพิ่ม

```java
package org.mockito.internal.configuration;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

public class SpyAnnotationEngineTest {

    private final SpyAnnotationEngine engine = new SpyAnnotationEngine();

    // ---------- Fixture classes ----------

    static class SpyValid {
        @Spy
        List list = new LinkedList();
    }

    static class SpyNullInstance {
        @Spy
        List list; // null by default
    }

    static class SpyAlreadyMock {
        @Spy
        List list = Mockito.mock(List.class);
    }

    static class SpyWithMockAnnotation {
        @Spy
        @Mock
        List list = new LinkedList();
    }

    @SuppressWarnings("deprecation")
    static class SpyWithDeprecatedMockitoAnnotationsMock {
        @Spy
        @MockitoAnnotations.Mock
        List list = new LinkedList();
    }

    static class SpyWithCaptorAnnotation {
        @Spy
        @Captor
        List list = new LinkedList();
    }

    static class NoAnnotationField {
        List list = new LinkedList();
    }

    static class NoFieldsAtAll {
        // empty
    }

    static class SpyStaticFinal {
        @Spy
        static final List list = new LinkedList();
    }

    static class MixedFields {
        List notSpied = new ArrayList();

        @Spy
        List freshSpy = new LinkedList();

        @Spy
        List alreadyMockSpy = Mockito.mock(List.class);
    }

    static class FieldHolderMockOnly {
        @Mock
        List f;
    }

    static class FieldHolderCaptorOnly {
        @Captor
        List f;
    }

    static class FieldHolderNoAnnotation {
        List f;
    }

    // ---------- createMockFor ----------

    @Test
    public void createMockFor_alwaysReturnsNull() {
        assertNull(engine.createMockFor(null, null));
    }

    // ---------- process: boundary/empty ----------

    @Test
    public void process_noFields_doesNothing() {
        // ไม่ควร throw หรือทำอะไรเลยเมื่อไม่มี field
        engine.process(NoFieldsAtAll.class, new NoFieldsAtAll());
    }

    @Test
    public void process_fieldWithoutSpyAnnotation_isSkipped() {
        NoAnnotationField fixture = new NoAnnotationField();
        List original = fixture.list;
        engine.process(NoAnnotationField.class, fixture);
        // ไม่มี @Spy -> ไม่ถูกแก้ไข
        assertSame(original, fixture.list);
        assertFalse(new MockUtil().isMock(fixture.list));
    }

    // ---------- process: happy path - create spy ----------

    @Test
    public void process_spyWithValidInstance_createsSpy() {
        SpyValid fixture = new SpyValid();
        List original = fixture.list;

        engine.process(SpyValid.class, fixture);

        assertNotSame("field ควรถูกแทนที่ด้วย spy object ใหม่", original, fixture.list);
        assertTrue("field ใหม่ควรเป็น mock/spy", new MockUtil().isMock(fixture.list));
    }

    // ---------- process: instance == null ----------

    @Test
    public void process_spyWithNullInstance_throwsMockitoException() {
        SpyNullInstance fixture = new SpyNullInstance();
        try {
            engine.process(SpyNullInstance.class, fixture);
            fail("Expected MockitoException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Cannot create a @Spy"));
        }
    }

    // ---------- process: instance already a mock -> reset ----------

    @Test
    public void process_spyAlreadyMock_resetsInsteadOfCreatingNewSpy() {
        SpyAlreadyMock fixture = new SpyAlreadyMock();
        List mockRef = fixture.list;
        Mockito.when(mockRef.size()).thenReturn(5);
        assertEquals(5, mockRef.size());

        engine.process(SpyAlreadyMock.class, fixture);

        // reference ไม่เปลี่ยน แต่ stub ถูก reset
        assertSame(mockRef, fixture.list);
        assertTrue(new MockUtil().isMock(fixture.list));
        assertEquals(0, fixture.list.size());
    }

    // ---------- process: conflicting annotations ----------

    @Test
    public void process_spyWithMockAnnotation_throwsMockitoException() {
        SpyWithMockAnnotation fixture = new SpyWithMockAnnotation();
        try {
            engine.process(SpyWithMockAnnotation.class, fixture);
            fail("Expected MockitoException due to @Spy + @Mock combination");
        } catch (MockitoException e) {
            // ไม่ยืนยันข้อความเพราะมาจาก Reporter; ยืนยันแค่ type ตามซอร์ส
            assertNotNull(e);
        }
    }

    @Test
    public void process_spyWithDeprecatedMockitoAnnotationsMock_throwsMockitoException() {
        SpyWithDeprecatedMockitoAnnotationsMock fixture = new SpyWithDeprecatedMockitoAnnotationsMock();
        try {
            engine.process(SpyWithDeprecatedMockitoAnnotationsMock.class, fixture);
            fail("Expected MockitoException due to @Spy + deprecated @MockitoAnnotations.Mock");
        } catch (MockitoException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void process_spyWithCaptorAnnotation_throwsMockitoException() {
        SpyWithCaptorAnnotation fixture = new SpyWithCaptorAnnotation();
        try {
            engine.process(SpyWithCaptorAnnotation.class, fixture);
            fail("Expected MockitoException due to @Spy + @Captor combination");
        } catch (MockitoException e) {
            assertNotNull(e);
        }
    }

    // ---------- process: IllegalAccessException path (static final field) ----------

    @Test
    public void process_staticFinalSpyField_wrapsIllegalAccessExceptionAsMockitoException() {
        SpyStaticFinal fixture = new SpyStaticFinal();
        try {
            engine.process(SpyStaticFinal.class, fixture);
            fail("Expected MockitoException because Field.set on static final field throws IllegalAccessException");
        } catch (MockitoException e) {
            assertTrue(e.getMessage().contains("Problems initiating spied field"));
        }
    }

    // ---------- process: multiple fields, mixed branches in one loop ----------

    @Test
    public void process_mixedFields_coversAllLoopBranchesTogether() {
        MixedFields fixture = new MixedFields();
        List notSpiedOriginal = fixture.notSpied;
        List freshSpyOriginal = fixture.freshSpy;
        List alreadyMockRef = fixture.alreadyMockSpy;
        Mockito.when(alreadyMockRef.size()).thenReturn(9);

        engine.process(MixedFields.class, fixture);

        // field ไม่มี @Spy -> ไม่เปลี่ยน
        assertSame(notSpiedOriginal, fixture.notSpied);
        assertFalse(new MockUtil().isMock(fixture.notSpied));

        // field มี @Spy และยังไม่ใช่ mock -> ถูกแทนที่ด้วย spy ใหม่
        assertNotSame(freshSpyOriginal, fixture.freshSpy);
        assertTrue(new MockUtil().isMock(fixture.freshSpy));

        // field มี @Spy และเป็น mock อยู่แล้ว -> reference เดิม + ถูก reset
        assertSame(alreadyMockRef, fixture.alreadyMockSpy);
        assertEquals(0, fixture.alreadyMockSpy.size());
    }

    // ---------- assertNoAnnotations: direct unit test ----------

    @Test
    public void assertNoAnnotations_noUndesiredAnnotationPresent_noException() throws Exception {
        Field f = FieldHolderNoAnnotation.class.getDeclaredField("f");
        // ไม่มี annotation ที่ไม่พึงประสงค์ -> ไม่ throw
        engine.assertNoAnnotations(Spy.class, f, Mock.class, Captor.class);
    }

    @Test
    public void assertNoAnnotations_undesiredMockAnnotationPresent_throwsException() throws Exception {
        Field f = FieldHolderMockOnly.class.getDeclaredField("f");
        try {
            engine.assertNoAnnotations(Spy.class, f, Mock.class, Captor.class);
            fail("Expected exception since field has @Mock");
        } catch (MockitoException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void assertNoAnnotations_undesiredCaptorAnnotationPresent_throwsException() throws Exception {
        Field f = FieldHolderCaptorOnly.class.getDeclaredField("f");
        try {
            engine.assertNoAnnotations(Spy.class, f, Mock.class, Captor.class);
            fail("Expected exception since field has @Captor");
        } catch (MockitoException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void assertNoAnnotations_emptyUndesiredArray_loopNeverExecutes_noException() throws Exception {
        // ครอบคลุม branch loop 0 รอบ (vararg ว่าง) แม้ field จะมี annotation ที่ "อาจ" ไม่พึงประสงค์ในกรณีอื่น
        Field f = FieldHolderMockOnly.class.getDeclaredField("f");
        engine.assertNoAnnotations(Spy.class, f); // ไม่ส่ง undesiredAnnotations เลย
    }
}
```

### ตารางสรุปการครอบคลุม Branch/Condition

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `createMockFor_alwaysReturnsNull` | เมธอด `createMockFor` คืนค่า `null` เสมอ (ไม่มี branch แต่ยืนยัน contract) |
| `process_noFields_doesNothing` | `fields.length == 0` → loop ไม่ทำงานเลย (boundary) |
| `process_fieldWithoutSpyAnnotation_isSkipped` | `field.isAnnotationPresent(Spy.class)` == **false** |
| `process_spyWithValidInstance_createsSpy` | `isAnnotationPresent(Spy.class)` == true, `instance != null`, `isMock(instance)` == **false** → branch `field.set(..., Mockito.spy(...))` |
| `process_spyWithNullInstance_throwsMockitoException` | `instance == null` → throw `MockitoException` (null check branch) |
| `process_spyAlreadyMock_resetsInsteadOfCreatingNewSpy` | `isMock(instance)` == **true** → branch `Mockito.reset(instance)` |
| `process_spyWithMockAnnotation_throwsMockitoException` | `assertNoAnnotations` → `field.isAnnotationPresent(Mock.class)` == true → throw |
| `process_spyWithDeprecatedMockitoAnnotationsMock_throwsMockitoException` | `assertNoAnnotations` → `isAnnotationPresent(MockitoAnnotations.Mock.class)` == true → throw |
| `process_spyWithCaptorAnnotation_throwsMockitoException` | `assertNoAnnotations` → `isAnnotationPresent(Captor.class)` == true → throw |
| `process_staticFinalSpyField_wrapsIllegalAccessExceptionAsMockitoException` | `catch (IllegalAccessException e)` branch ภายใน `process` (ผ่าน `finally` ด้วย) |
| `process_mixedFields_coversAllLoopBranchesTogether` | Loop หลายรอบ: true/false ของ `isAnnotationPresent(Spy.class)` และ true/false ของ `isMock(instance)` ในการวนซ้ำเดียวกัน |
| `assertNoAnnotations_noUndesiredAnnotationPresent_noException` | loop `for (Class u : undesiredAnnotations)` วนแต่ `isAnnotationPresent(u)` == **false** ทุกตัว |
| `assertNoAnnotations_undesiredMockAnnotationPresent_throwsException` | `isAnnotationPresent(u)` == **true** (ตัวแรก = Mock) → throw |
| `assertNoAnnotations_undesiredCaptorAnnotationPresent_throwsException` | `isAnnotationPresent(u)` == **true** (ตัวหลัง = Captor) → throw, ครอบคลุม element อื่นใน array |
| `assertNoAnnotations_emptyUndesiredArray_loopNeverExecutes_noException` | `undesiredAnnotations.length == 0` → loop ไม่ execute เลย (boundary ของ vararg) |

**หมายเหตุ/ข้อจำกัดที่ไม่แน่ใจ (ไม่ได้เดา behavior เพิ่ม):**
- ข้อความ exact ของ `MockitoException` ที่มาจาก `Reporter.unsupportedCombinationOfAnnotations(...)` ไม่ได้ตรวจสอบ string แบบเจาะจง เพราะไม่มีซอร์สของ `Reporter` ให้มาด้วย จึงตรวจสอบเพียง type ของ exception
- การทดสอบ `catch (IllegalAccessException e)` ใช้เทคนิค static final field ตาม Java Reflection API contract (`Field#set` javadoc) ซึ่งเป็น behavior มาตรฐานของ JDK ไม่ใช่การเดา