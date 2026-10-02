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
