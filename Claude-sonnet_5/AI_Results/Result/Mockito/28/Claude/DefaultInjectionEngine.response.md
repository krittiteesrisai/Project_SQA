# วิเคราะห์โค้ดเป้าหมาย

จากการอ่านซอร์สโค้ด `DefaultInjectionEngine` พบจุดสำคัญที่ต้องทดสอบ:

1. **Loop หลัก** `for (Field field : injectMocksFields)` — null/empty set
2. **`new HashSet<Object>(mocks)`** — null mocks set จะ throw NPE ทันที
3. **try/catch MockitoException** รอบ `FieldInitializer.initialize()` — ถ้า instantiate ไม่ได้ (เช่น interface) จะเข้า catch แล้วเรียก `new Reporter().cannotInitializeForInjectMocksAnnotation(...)` **โดยไม่มีคำว่า `throw`** หน้าคำสั่ง — นี่คือจุดที่น่าสงสัยว่าเป็น **fault จริง** (ตรงกับ Defects4J bug Mockito-28 ที่ขาด `throw` ทำให้เกิด `NullPointerException` ที่บรรทัด `injectMocksFieldInstance.getClass()` แทนที่จะโยน `MockitoException` ที่สื่อความหมายกว่า)
4. **while loop** วนจาก fieldClass ไปจนถึง `Object.class` — ทดสอบ hierarchy (subclass → superclass)
5. **Comparator `supertypesLast`** — ควบคุมลำดับ field ภายในคลาสเดียวกัน (subtype ก่อน supertype)
6. **`mocksToBeInjected` ถูก copy ใหม่ทุก field ที่ติด `@InjectMocks`** แต่ภายใน hierarchy เดียวกัน set ตัวเดียวกันถูกใช้ร่วม (mock ถูก "ใช้แล้วหมด" ข้าม field ใน hierarchy เดียวกัน)
7. Setter injection ถูกเลือกก่อน field injection ตาม Javadoc ของเมธอด

เนื่องจาก classpath ที่กำหนดไม่มี mockito-core (ไม่มี mock framework) การทดสอบจึงใช้ **plain POJO object แทน mock จริง** และทดสอบผ่าน public API `injectMocksOnFields(...)` เท่านั้น (fields ภายใน `TypeBasedCandidateFilter/NameBasedCandidateFilter/FinalMockCandidateFilter` ไม่ expose ให้ unit test เข้าถึงตรง ๆ)

```java
package org.mockito.internal.configuration;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Unit tests for {@link DefaultInjectionEngine}.
 *
 * หมายเหตุสำคัญ: classpath ที่ให้มาไม่มี mockito-core (ไม่มี mock framework จริง)
 * ดังนั้นทุก "mock" ในชุดทดสอบนี้คือ plain POJO object ธรรมดา ไม่ใช่ Mockito mock
 * ซึ่งอาจทำให้พฤติกรรมของ NameBasedCandidateFilter (ที่ต้องพึ่ง MockUtil บนของ mock จริง)
 * ไม่สามารถยืนยันได้ 100% — จุดนี้จะคอมเมนต์กำกับไว้ชัดเจนตามจุดที่เกี่ยวข้อง
 */
public class DefaultInjectionEngineTest {

    private DefaultInjectionEngine engine;

    @Before
    public void setUp() {
        engine = new DefaultInjectionEngine();
    }

    // ---------------------------------------------------------------
    // Helper fixtures
    // ---------------------------------------------------------------

    static class ServiceA { }

    static class ServiceB extends ServiceA { }

    /** field-only injection target (ไม่มี setter) */
    static class FieldOwner {
        private ServiceA serviceA;
        public ServiceA getServiceA() { return serviceA; }
    }

    /** target ที่มีทั้ง field และ setter เพื่อตรวจว่า setter ถูกเลือกก่อน */
    static class FieldOwnerWithSetter {
        private ServiceA serviceA;
        boolean setterCalled = false;
        public void setServiceA(ServiceA serviceA) {
            this.serviceA = serviceA;
            this.setterCalled = true;
        }
        public ServiceA getServiceA() { return serviceA; }
    }

    static class SuperOwner {
        protected ServiceA serviceA;
    }

    static class SubOwner extends SuperOwner {
        protected ServiceB serviceB;
    }

    static class SuperOwnerTwoFields {
        protected ServiceA serviceA1;
    }

    static class SubOwnerTwoFields extends SuperOwnerTwoFields {
        protected ServiceA serviceA2;
    }

    /** field ชนิดเดียวกันในคลาสเดียวกัน เพื่อทดสอบ comparator supertypesLast */
    static class MixedTypeOwner {
        protected ServiceA fieldSuper;
        protected ServiceB fieldSub;
    }

    /** field เป็น interface -> FieldInitializer ไม่สามารถ instantiate ได้ */
    static class ContainerWithInterfaceField {
        private Runnable runnable;
    }

    // Containers ที่ใช้แทน "test class instance" ซึ่งมี field @InjectMocks
    static class ContainerSingleFieldOwner {
        private FieldOwner target;
    }

    static class ContainerSetterOwner {
        private FieldOwnerWithSetter target;
    }

    static class ContainerSubOwner {
        private SubOwner target;
    }

    static class ContainerSubOwnerTwoFields {
        private SubOwnerTwoFields target;
    }

    static class ContainerMixedTypeOwner {
        private MixedTypeOwner target;
    }

    static class ContainerTwoInjectMocksFields {
        private FieldOwner first;
        private FieldOwner second;
    }

    // ---------------------------------------------------------------
    // Reflection helpers (ไม่ใช่ behavior ของคลาสเป้าหมาย แค่ test utility)
    // ---------------------------------------------------------------

    private static Field fieldOf(Class<?> clazz, String name) throws NoSuchFieldException {
        Field f = clazz.getDeclaredField(name);
        f.setAccessible(true);
        return f;
    }

    private static Set<Field> fieldsOf(Class<?> clazz, String... names) throws NoSuchFieldException {
        Set<Field> set = new HashSet<Field>();
        for (String n : names) {
            set.add(fieldOf(clazz, n));
        }
        return set;
    }

    private static Object getValue(Object target, String fieldName) throws Exception {
        Field f = target.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(target);
    }

    // ---------------------------------------------------------------
    // 1. Null / empty boundary cases
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void injectMocksOnFields_nullInjectMocksFields_throwsNPE() {
        // for (Field field : injectMocksFields) บน null จะ throw NPE ทันที
        engine.injectMocksOnFields(null, new HashSet<Object>(), new ContainerSingleFieldOwner());
    }

    @Test(expected = NullPointerException.class)
    public void injectMocksOnFields_nullMocksSet_throwsNPE() throws Exception {
        // ต้องมี field อย่างน้อย 1 ตัวเพื่อให้ loop รันถึงบรรทัด new HashSet<Object>(mocks)
        Set<Field> fields = fieldsOf(ContainerSingleFieldOwner.class, "target");
        engine.injectMocksOnFields(fields, null, new ContainerSingleFieldOwner());
    }

    @Test
    public void injectMocksOnFields_emptyInjectMocksFields_noOp() {
        // loop ไม่รัน เลย ไม่ควรมี exception ใด ๆ
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new ServiceA());
        engine.injectMocksOnFields(new HashSet<Field>(), mocks, new ContainerSingleFieldOwner());
        // ผ่านได้โดยไม่ throw ถือว่าผ่าน
        assertTrue(true);
    }

    @Test
    public void injectMocksOnFields_emptyMocksSet_fieldRemainsNull() throws Exception {
        ContainerSingleFieldOwner container = new ContainerSingleFieldOwner();
        Set<Field> fields = fieldsOf(ContainerSingleFieldOwner.class, "target");

        engine.injectMocksOnFields(fields, new HashSet<Object>(), container);

        FieldOwner injected = (FieldOwner) getValue(container, "target");
        assertNotNull("target ควรถูก initialize แม้ไม่มี mocks ให้ inject", injected);
        assertNull("ไม่มี mocks ดังนั้น serviceA ต้องเป็น null", injected.getServiceA());
    }

    // ---------------------------------------------------------------
    // 2. การ inject แบบตรง type เดียว (field injection path)
    // ---------------------------------------------------------------

    @Test
    public void injectMocksOnFields_singleMatchingMockByType_injectsViaField() throws Exception {
        ContainerSingleFieldOwner container = new ContainerSingleFieldOwner();
        Set<Field> fields = fieldsOf(ContainerSingleFieldOwner.class, "target");

        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        engine.injectMocksOnFields(fields, mocks, container);

        FieldOwner injected = (FieldOwner) getValue(container, "target");
        assertSame("mock ควรถูก inject เข้า field serviceA โดยตรง", mockA, injected.getServiceA());
    }

    @Test
    public void injectMocksOnFields_noMatchingTypeMock_fieldRemainsNull() throws Exception {
        ContainerSingleFieldOwner container = new ContainerSingleFieldOwner();
        Set<Field> fields = fieldsOf(ContainerSingleFieldOwner.class, "target");

        // mock ชนิดที่ไม่เกี่ยวข้องกับ field เลย (type-based filter ไม่ match)
        Set<Object> mocks = new HashSet<Object>();
        mocks.add("a plain string, not related to ServiceA");

        engine.injectMocksOnFields(fields, mocks, container);

        FieldOwner injected = (FieldOwner) getValue(container, "target");
        assertNull("ไม่มี candidate ที่ตรง type จึงไม่ควร inject อะไรเลย", injected.getServiceA());
    }

    // ---------------------------------------------------------------
    // 3. Setter ถูกเลือกก่อน field (ตาม Javadoc ของเมธอด)
    // ---------------------------------------------------------------

    @Test
    public void injectMocksOnFields_setterPreferredOverFieldInjection() throws Exception {
        ContainerSetterOwner container = new ContainerSetterOwner();
        Set<Field> fields = fieldsOf(ContainerSetterOwner.class, "target");

        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        engine.injectMocksOnFields(fields, mocks, container);

        FieldOwnerWithSetter injected = (FieldOwnerWithSetter) getValue(container, "target");
        assertTrue("ควรถูก inject ผ่าน setter ตาม Javadoc ('set mock by property setter if possible')",
                injected.setterCalled);
        assertSame(mockA, injected.getServiceA());
    }

    // ---------------------------------------------------------------
    // 4. Class hierarchy: while (fieldClass != Object.class)
    // ---------------------------------------------------------------

    @Test
    public void injectMocksOnFields_classHierarchy_injectsSubclassAndSuperclassFields() throws Exception {
        ContainerSubOwner container = new ContainerSubOwner();
        Set<Field> fields = fieldsOf(ContainerSubOwner.class, "target");

        ServiceA mockA = new ServiceA();
        ServiceB mockB = new ServiceB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);
        mocks.add(mockB);

        engine.injectMocksOnFields(fields, mocks, container);

        SubOwner injected = (SubOwner) getValue(container, "target");
        assertSame("field ใน subclass (serviceB) ควรถูก inject", mockB, injected.serviceB);
        assertSame("field ใน superclass (serviceA) ก็ควรถูก inject เช่นกัน", mockA, injected.serviceA);
    }

    @Test
    public void injectMocksOnFields_mockConsumedOnce_notInjectedTwiceAcrossHierarchy() throws Exception {
        // มี field ชนิดเดียวกัน (ServiceA) อยู่ทั้งใน subclass และ superclass
        // มี mock เพียง 1 ตัว -> ควรถูก inject แค่ field เดียว (field ของ subclass
        // ถูกประมวลผลก่อนตาม while-loop ที่ไล่จาก leaf class ไป super class)
        ContainerSubOwnerTwoFields container = new ContainerSubOwnerTwoFields();
        Set<Field> fields = fieldsOf(ContainerSubOwnerTwoFields.class, "target");

        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        engine.injectMocksOnFields(fields, mocks, container);

        SubOwnerTwoFields injected = (SubOwnerTwoFields) getValue(container, "target");

        boolean subGotIt = injected.serviceA2 == mockA;
        boolean superGotIt = injected.serviceA1 == mockA;

        assertTrue("mock ควรถูก inject เข้า field ใดฟิลด์หนึ่งเท่านั้น (subclass field ก่อนตาม while-loop)",
                subGotIt ^ superGotIt);
    }

    // ---------------------------------------------------------------
    // 5. Comparator supertypesLast: subtype field ถูกประมวลผลก่อน supertype field
    // ---------------------------------------------------------------

    @Test
    public void injectMocksOnFields_supertypesLastOrdering_subtypeFieldGetsPriority() throws Exception {
        ContainerMixedTypeOwner container = new ContainerMixedTypeOwner();
        Set<Field> fields = fieldsOf(ContainerMixedTypeOwner.class, "target");

        // mock เดียวที่ตรงกับ fieldSub (ServiceB) แบบ exact และ assignable กับ fieldSuper (ServiceA)
        ServiceB mockB = new ServiceB();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockB);

        engine.injectMocksOnFields(fields, mocks, container);

        MixedTypeOwner injected = (MixedTypeOwner) getValue(container, "target");

        assertSame("subtype field (fieldSub) ควรถูก inject ก่อนตาม Comparator supertypesLast",
                mockB, injected.fieldSub);
        assertNull("supertype field (fieldSuper) ไม่ควรได้ mock เพราะถูกใช้ไปแล้ว",
                injected.fieldSuper);
    }

    // ---------------------------------------------------------------
    // 6. หลาย @InjectMocks fields: แต่ละ field ได้ mocks copy ของตัวเอง
    // ---------------------------------------------------------------

    @Test
    public void injectMocksOnFields_multipleInjectMocksFields_eachGetsOwnMockCopy() throws Exception {
        ContainerTwoInjectMocksFields container = new ContainerTwoInjectMocksFields();
        Set<Field> fields = fieldsOf(ContainerTwoInjectMocksFields.class, "first", "second");

        ServiceA mockA = new ServiceA();
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mockA);

        engine.injectMocksOnFields(fields, mocks, container);

        FieldOwner first = (FieldOwner) getValue(container, "first");
        FieldOwner second = (FieldOwner) getValue(container, "second");

        assertSame("field 'first' ควรได้รับ mock", mockA, first.getServiceA());
        assertSame("field 'second' ก็ควรได้รับ mock เดียวกัน เพราะ mocksToBeInjected ถูก copy ใหม่ต่อ field",
                mockA, second.getServiceA());
    }

    // ---------------------------------------------------------------
    // 7. Ambiguous candidates (หลาย mock ชนิดเดียวกัน) — ตาม Javadoc "don't fail"
    // ---------------------------------------------------------------

    @Test
    public void injectMocksOnFields_ambiguousCandidatesSameType_doesNotFail() throws Exception {
        // หมายเหตุ: มี mock 2 ตัวชนิดเดียวกัน (ServiceA) ไม่ใช่ Mockito mock จริง
        // พฤติกรรมภายในของ NameBasedCandidateFilter เมื่อรับ object ที่ไม่ใช่ mock จริง
        // ไม่สามารถยืนยันได้จาก source ที่ให้มา (ไม่มีซอร์สของ NameBasedCandidateFilter)
        // จึงอ้างอิงจาก Javadoc ของเมธอดเท่านั้น: "else don't fail, user will then provide dependencies"
        ContainerSingleFieldOwner container = new ContainerSingleFieldOwner();
        Set<Field> fields = fieldsOf(ContainerSingleFieldOwner.class, "target");

        Set<Object> mocks = new HashSet<Object>();
        mocks.add(new ServiceA());
        mocks.add(new ServiceA());

        engine.injectMocksOnFields(fields, mocks, container);

        FieldOwner injected = (FieldOwner) getValue(container, "target");
        assertNotNull(injected);
        assertNull("มี candidate มากกว่า 1 ตัวแบบ ambiguous -> ไม่ควร inject ตาม Javadoc",
                injected.getServiceA());
    }

    // ---------------------------------------------------------------
    // 8. Fault-detection: known Defects4J Mockito-28 bug
    //    Reporter().cannotInitializeForInjectMocksAnnotation(...) ไม่มี "throw"
    //    -> injectMocksFieldInstance ยังเป็น null -> NPE ที่ .getClass()
    // ---------------------------------------------------------------

    @Test(expected = NullPointerException.class)
    public void injectMocksOnFields_cannotInstantiateInterfaceField_exposesKnownNPEBug() throws Exception {
        // field เป็น Runnable (interface) -> FieldInitializer.initialize() ควร throw MockitoException
        // ซึ่งจะถูก catch ไว้ แต่เนื่องจากบรรทัด
        //   new Reporter().cannotInitializeForInjectMocksAnnotation(field.getName(), e);
        // ไม่มีคำว่า "throw" (ตรงกับซอร์สที่ให้มา) ผลลัพธ์ที่คาดหวังจริงคือ NullPointerException
        // ไม่ใช่ MockitoException ที่ควรจะเป็น -- นี่คือ fault ที่ชุดทดสอบนี้ต้องดักจับให้ได้
        ContainerWithInterfaceField container = new ContainerWithInterfaceField();
        Set<Field> fields = fieldsOf(ContainerWithInterfaceField.class, "runnable");

        engine.injectMocksOnFields(fields, new HashSet<Object>(), container);
    }
}
```

## สรุปตาราง Test Method กับ Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `injectMocksOnFields_nullInjectMocksFields_throwsNPE` | `injectMocksFields == null` → NPE จาก for-each (boundary/null) |
| `injectMocksOnFields_nullMocksSet_throwsNPE` | `mocks == null` → NPE จาก `new HashSet<Object>(mocks)` |
| `injectMocksOnFields_emptyInjectMocksFields_noOp` | Loop หลักไม่รันเลย (empty set) |
| `injectMocksOnFields_emptyMocksSet_fieldRemainsNull` | `mocksToBeInjected` ว่าง → ไม่มี candidate inject |
| `injectMocksOnFields_singleMatchingMockByType_injectsViaField` | Type-based filter match 1 ตัว → field injection path |
| `injectMocksOnFields_noMatchingTypeMock_fieldRemainsNull` | ไม่มี candidate ตรง type → ไม่ inject (else branch "don't fail") |
| `injectMocksOnFields_setterPreferredOverFieldInjection` | เงื่อนไข "set mock by property setter if possible" |
| `injectMocksOnFields_classHierarchy_injectsSubclassAndSuperclassFields` | while-loop `fieldClass != Object.class` ครบทั้ง subclass/superclass |
| `injectMocksOnFields_mockConsumedOnce_notInjectedTwiceAcrossHierarchy` | "remove mock from mocks copy" — mock ใช้ได้ครั้งเดียวข้าม hierarchy |
| `injectMocksOnFields_supertypesLastOrdering_subtypeFieldGetsPriority` | Comparator `supertypesLast`: ทั้ง 2 if-branch (`isAssignableFrom` ทั้งสองทาง) |
| `injectMocksOnFields_multipleInjectMocksFields_eachGetsOwnMockCopy` | Loop นอก (`for Field in injectMocksFields`) หลายรอบ, mocks copy ใหม่ต่อ field |
| `injectMocksOnFields_ambiguousCandidatesSameType_doesNotFail` | เงื่อนไข "more than one candidate" ตาม Javadoc (ระบุ uncertainty ในคอมเมนต์) |
| `injectMocksOnFields_cannotInstantiateInterfaceField_exposesKnownNPEBug` | try/catch(MockitoException) branch + **fault จริง** (ขาด `throw`) → NPE |

**ข้อจำกัดที่ระบุไว้ชัดเจนในคอมเมนต์:** พฤติกรรมภายในของ `NameBasedCandidateFilter`/`MockUtil` เมื่อรับ object ที่ไม่ใช่ Mockito mock จริง ไม่สามารถยืนยัน 100% จากซอร์สที่ให้มา จึงอ้างอิงเฉพาะ Javadoc ของเมธอดเป้าหมายเท่านั้น