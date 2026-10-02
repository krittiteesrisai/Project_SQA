# JUnit 4 Test Suite สำหรับ DiagnosticGroups (Closure-158b)

## การวิเคราะห์คลาสเป้าหมาย

จากซอร์สโค้ด methods ที่ทดสอบได้ (ไม่ใช่ static initializer ของ private fields):
1. **`forName(String)`** - protected, คืนค่า `DiagnosticGroup` หรือ `null`
2. **`getRegisteredGroups()`** - protected, คืนค่า `ImmutableMap` (immutable)
3. **`setWarningLevels(...)`** - package-private, มี loop + `Preconditions.checkNotNull` (throw NPE ถ้าไม่พบ group)

**หมายเหตุ:** เนื่องจาก `CompilerOptions` และ `CheckLevel` เป็นคลาสในแพ็กเกจเดียวกัน (`com.google.javascript.jscomp`) จึงสมมติว่ามี public no-arg constructor และ method `setWarningLevel(DiagnosticGroup, CheckLevel)` ตามที่ปรากฏใน source ของ Closure compiler — หากไม่มีจริงต้อง mock/stub แทน (คอมเมนต์กำกับไว้ในโค้ด)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Unit tests for {@link DiagnosticGroups}.
 * Target: Defects4J Closure-158b
 *
 * หมายเหตุ: ใช้ CompilerOptions และ CheckLevel จริงจาก package เดียวกัน
 * เนื่องจากไม่มี mocking framework อยู่ใน classpath ที่กำหนด
 */
public class DiagnosticGroupsTest {

    private DiagnosticGroups diagnosticGroups;

    @Before
    public void setUp() {
        diagnosticGroups = new DiagnosticGroups();
    }

    // ---------------------------------------------------------
    // forName(String) tests
    // ---------------------------------------------------------

    @Test
    public void testForName_ValidName_ReturnsGroup() {
        DiagnosticGroup group = diagnosticGroups.forName("globalThis");
        assertNotNull(group);
        assertSame(DiagnosticGroups.GLOBAL_THIS, group);
    }

    @Test
    public void testForName_AnotherValidName_ReturnsGroup() {
        DiagnosticGroup group = diagnosticGroups.forName("checkTypes");
        assertNotNull(group);
        assertSame(DiagnosticGroups.CHECK_TYPES, group);
    }

    @Test
    public void testForName_GroupRegisteredWithGroupVarargs_ReturnsGroup() {
        // ACCESS_CONTROLS ถูก register ผ่าน registerGroup(String, DiagnosticGroup...)
        DiagnosticGroup group = diagnosticGroups.forName("accessControls");
        assertNotNull(group);
        assertSame(DiagnosticGroups.ACCESS_CONTROLS, group);
    }

    @Test
    public void testForName_InvalidName_ReturnsNull() {
        DiagnosticGroup group = diagnosticGroups.forName("nonExistentGroupName");
        assertNull(group);
    }

    @Test
    public void testForName_EmptyString_ReturnsNull() {
        DiagnosticGroup group = diagnosticGroups.forName("");
        assertNull(group);
    }

    @Test
    public void testForName_NullInput_ReturnsNull() {
        // HashMap.get(null) รองรับ key เป็น null และคืน null เมื่อไม่พบ
        DiagnosticGroup group = diagnosticGroups.forName(null);
        assertNull(group);
    }

    @Test
    public void testForName_CaseSensitive_ReturnsNull() {
        // key comparison เป็น case-sensitive ตาม HashMap ปกติ
        DiagnosticGroup group = diagnosticGroups.forName("GLOBALTHIS");
        assertNull(group);
    }

    @Test
    public void testForName_WithLeadingTrailingSpace_ReturnsNull() {
        // ทดสอบ input ผิดรูปแบบ (มี whitespace) ต้องไม่ match
        DiagnosticGroup group = diagnosticGroups.forName(" globalThis ");
        assertNull(group);
    }

    // ---------------------------------------------------------
    // getRegisteredGroups() tests
    // ---------------------------------------------------------

    @Test
    public void testGetRegisteredGroups_NotNull() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertNotNull(groups);
    }

    @Test
    public void testGetRegisteredGroups_ContainsKnownGroups() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertTrue(groups.containsKey("globalThis"));
        assertTrue(groups.containsKey("deprecated"));
        assertTrue(groups.containsKey("visibility"));
        assertTrue(groups.containsKey("checkTypes"));
        assertTrue(groups.containsKey("uselessCode"));
        assertTrue(groups.containsKey("typeInvalidation"));
    }

    @Test
    public void testGetRegisteredGroups_ValuesMatchStaticFields() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertSame(DiagnosticGroups.GLOBAL_THIS, groups.get("globalThis"));
        assertSame(DiagnosticGroups.DEPRECATED, groups.get("deprecated"));
        assertSame(DiagnosticGroups.CHECK_VARIABLES, groups.get("checkVars"));
    }

    @Test
    public void testGetRegisteredGroups_DoesNotContainUnregisteredName() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertFalse(groups.containsKey("thisNameWasNeverRegistered"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRegisteredGroups_IsImmutable_PutThrows() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        groups.put("newKey", DiagnosticGroups.GLOBAL_THIS);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetRegisteredGroups_IsImmutable_RemoveThrows() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        groups.remove("globalThis");
    }

    // ---------------------------------------------------------
    // setWarningLevels(...) tests
    // ---------------------------------------------------------

    @Test
    public void testSetWarningLevels_EmptyList_NoExceptionAndNoIteration() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        // ไม่มี exception เพราะ loop ไม่ execute เลย (branch: list ว่าง)
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test
    public void testSetWarningLevels_SingleValidName_NoException() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("globalThis");
        // ผ่าน loop 1 ครั้ง, checkNotNull ไม่ throw เพราะพบ group
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.ERROR);
    }

    @Test
    public void testSetWarningLevels_MultipleValidNames_NoException() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("globalThis");
        names.add("deprecated");
        names.add("checkTypes");
        // ทดสอบ loop มากกว่า 1 รอบ ทุก iteration สำเร็จ
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.OFF);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_InvalidName_ThrowsNPE() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("thisGroupDoesNotExist");
        // forName คืน null -> Preconditions.checkNotNull throw NPE
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_MixedValidThenInvalidName_ThrowsNPEOnSecond() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("globalThis");   // valid, iteration 1 succeed
        names.add("invalidName");  // invalid, iteration 2 throw
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_NullNameInList_ThrowsNPE() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add(null);
        // forName(null) -> null -> checkNotNull throw
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_EmptyStringName_ThrowsNPE() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    // ---------------------------------------------------------
    // Static field / constant sanity checks (indirect coverage
    // ของ static initializer และ registerGroup overloads)
    // ---------------------------------------------------------

    @Test
    public void testDiagnosticGroupNamesConstant_NotEmptyAndContainsExpected() {
        assertNotNull(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES);
        assertTrue(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES.length() > 0);
        assertTrue(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES.contains("checkTypes"));
        assertTrue(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES.contains("visibility"));
    }

    @Test
    public void testAccessControlsGroup_RegisteredViaGroupVarargsOverload() {
        assertNotNull(DiagnosticGroups.ACCESS_CONTROLS);
    }

    @Test
    public void testCheckTypesGroup_RegisteredViaTypeVarargsOverload() {
        assertNotNull(DiagnosticGroups.CHECK_TYPES);
    }

    @Test
    public void testAllStaticGroupsAreRegisteredInMap() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        // ตรวจสอบว่าจำนวน group ที่ registered ไม่น้อยกว่าที่ระบุใน static fields หลัก ๆ
        assertTrue(groups.size() >= 18); // ตาม static fields ที่ประกาศในซอร์ส
    }
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testForName_ValidName_ReturnsGroup` | `forName`: key พบใน map → return non-null |
| `testForName_AnotherValidName_ReturnsGroup` | `forName`: อีก key ที่พบ (สาขาที่ต่างจากด้านบน) |
| `testForName_GroupRegisteredViaGroupVarargsOverload` | ครอบคลุม static field ที่ผ่าน `registerGroup(String, DiagnosticGroup...)` |
| `testForName_InvalidName_ReturnsNull` | `forName`: key ไม่พบ → return null |
| `testForName_EmptyString_ReturnsNull` | boundary: empty string key |
| `testForName_NullInput_ReturnsNull` | edge case: null key ใน `Map.get()` |
| `testForName_CaseSensitive_ReturnsNull` | มัลฟอร์ม input: case ผิด |
| `testForName_WithLeadingTrailingSpace_ReturnsNull` | มัลฟอร์ม input: มี whitespace |
| `testGetRegisteredGroups_NotNull` | ตรวจสอบ return ไม่ null |
| `testGetRegisteredGroups_ContainsKnownGroups` | ตรวจสอบเนื้อหา map ตรงกับ static fields |
| `testGetRegisteredGroups_ValuesMatchStaticFields` | ตรวจ value == static field reference |
| `testGetRegisteredGroups_DoesNotContainUnregisteredName` | negative case: key ที่ไม่มีอยู่ |
| `testGetRegisteredGroups_IsImmutable_PutThrows` | ตรวจสอบ `ImmutableMap` throw บน `put` |
| `testGetRegisteredGroups_IsImmutable_RemoveThrows` | ตรวจสอบ `ImmutableMap` throw บน `remove` |
| `testSetWarningLevels_EmptyList_NoExceptionAndNoIteration` | loop: 0 iterations (branch ไม่ enter loop) |
| `testSetWarningLevels_SingleValidName_NoException` | loop: 1 iteration, `checkNotNull` pass (true branch) |
| `testSetWarningLevels_MultipleValidNames_NoException` | loop: >1 iterations, ทุกครั้ง pass |
| `testSetWarningLevels_InvalidName_ThrowsNPE` | `checkNotNull` fail (false branch) → NPE |
| `testSetWarningLevels_MixedValidThenInvalidName_ThrowsNPEOnSecond` | loop: iteration แรก pass, iteration สองไม่ pass |
| `testSetWarningLevels_NullNameInList_ThrowsNPE` | edge case: null ใน list → `forName(null)` → NPE |
| `testSetWarningLevels_EmptyStringName_ThrowsNPE` | edge case: empty string ใน list → NPE |
| `testDiagnosticGroupNamesConstant_NotEmptyAndContainsExpected` | ตรวจสอบ static constant string |
| `testAccessControlsGroup_RegisteredViaGroupVarargsOverload` | ตรวจสอบ static initializer overload (`DiagnosticGroup...`) |
| `testCheckTypesGroup_RegisteredViaTypeVarargsOverload` | ตรวจสอบ static initializer overload (`DiagnosticType...`) |
| `testAllStaticGroupsAreRegisteredInMap` | sanity check จำนวน registered groups |

**หมายเหตุสำคัญ:**
- ไม่ได้ทดสอบ `registerGroup(...)` methods โดยตรง เนื่องจากเป็น package-private static methods ที่ถูกเรียกใช้เฉพาะใน static initializer — ครอบคลุมทางอ้อมผ่านการตรวจสอบ static fields
- `setWarningLevels` ไม่มี assertion ตรวจสอบผลลัพธ์ของ `options.setWarningLevel(...)` โดยตรง เนื่องจากไม่มี public getter ปรากฏใน source ที่ให้มา จึงทดสอบเพียง behavior "ไม่ throw exception เมื่อ input ถูกต้อง" — หากต้องการตรวจสอบผลลัพธ์จริงต้องดู API ของ `CompilerOptions` เพิ่มเติม
- Constructor `DiagnosticGroups()` เป็น public no-op จึงไม่มี branch ให้ทดสอบเพิ่มเติม