package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * JUnit 4 Test Suite for DiagnosticGroups (Defects4J Closure-158b)
 * Maximizes Branch/Condition Coverage and tests edge cases.
 */
public class DiagnosticGroupsTest {

    private DiagnosticGroups diagnosticGroups;
    private CompilerOptions options;

    @Before
    public void setUp() {
        diagnosticGroups = new DiagnosticGroups();
        options = new CompilerOptions();
    }

    @Test
    public void testStaticPredefinedGroupsAreRegistered() {
        // ตรวจสอบว่ากลุ่มที่ถูก Static Register ไว้ตั้งแต่ต้นต้องไม่เป็น null และค้นหาเจอ
        assertNotNull(diagnosticGroups.forName("globalThis"));
        assertNotNull(diagnosticGroups.forName("deprecated"));
        assertNotNull(diagnosticGroups.forName("visibility"));
        assertNotNull(diagnosticGroups.forName("constantProperty"));
        assertNotNull(diagnosticGroups.forName("accessControls"));
        assertNotNull(diagnosticGroups.forName("checkTypes"));
        assertNotNull(diagnosticGroups.forName("checkVars"));
    }

    @Test
    public void testGetRegisteredGroupsReturnsImmutableCopy() {
        Map<String, DiagnosticGroup> registered = diagnosticGroups.getRegisteredGroups();
        assertNotNull(registered);
        assertFalse(registered.isEmpty());
        
        // ทดสอบว่า Immutable Map ป้องกันการแก้ไขจากภายนอก
        try {
            registered.put("maliciousGroup", null);
            fail("Expected UnsupportedOperationException because getRegisteredGroups() should return an immutable map.");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testForNameWithValidAndInvalidNames() {
        // กรณีเจอจริง
        DiagnosticGroup group = diagnosticGroups.forName("visibility");
        assertNotNull(group);

        // กรณีไม่เจอ (Edge Case: Unknown/Invalid name)
        DiagnosticGroup nonExistent = diagnosticGroups.forName("nonExistentGroup12345");
        assertNull(nonExistent);

        // กรณีส่งค่า null เข้าไปค้นหา
        DiagnosticGroup nullResult = diagnosticGroups.forName(null);
        assertNull(nullResult);
    }

    @Test
    public void testSetWarningLevelsWithValidGroups() {
        List<String> groupsToSet = Arrays.asList("globalThis", "visibility");
        
        // ควรทำงานได้ปกติโดยไม่มี Exception ใดๆ
        diagnosticGroups.setWarningLevels(options, groupsToSet, CheckLevel.WARNING);
    }

    @Test
    public void testSetWarningLevelsWithEmptyList() {
        List<String> emptyList = Collections.emptyList();
        
        // ลูปจะไม่ทำงาน ข้ามผ่านไปได้ไม่มีปัญหา
        diagnosticGroups.setWarningLevels(options, emptyList, CheckLevel.ERROR);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevelsWithInvalidGroupNameTriggersPrecondition() {
        // Edge Case / Fault Trigger: ชื่อกลุ่มไม่ถูกต้อง ทำให้ forName คืนค่า null
        // และ Preconditions.checkNotNull จะต้องโยน NullPointerException ออกมา
        List<String> invalidGroupList = Arrays.asList("globalThis", "invalidGroupXYZ");
        
        diagnosticGroups.setWarningLevels(options, invalidGroupList, CheckLevel.ERROR);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevelsWithNullInsideList() {
        // Edge Case: มีค่า null อยู่ใน List
        List<String> listWithNull = Arrays.asList((String) null);
        
        diagnosticGroups.setWarningLevels(options, listWithNull, CheckLevel.OFF);
    }

    @Test
    public void testCustomGroupRegistration() {
        // ทดสอบการregisterGroupแบบรับ DiagnosticType หลายตัว
        DiagnosticType dummyType = DiagnosticType.error("JSC_DUMMY_ERROR", "Dummy error message.");
        DiagnosticGroup customGroup = DiagnosticGroups.registerGroup("customTestGroup", dummyType);
        
        assertNotNull(customGroup);
        assertEquals(customGroup, diagnosticGroups.forName("customTestGroup"));
        
        // ทดสอบการตั้ง Warning Levels กับ Group ที่สร้างขึ้นเอง
        diagnosticGroups.setWarningLevels(options, Arrays.asList("customTestGroup"), CheckLevel.WARNING);
    }

    @Test
    public void testNestedGroupRegistration() {
        // ทดสอบการ registerGroup แบบรับ DiagnosticGroup ซ้อนกัน
        DiagnosticGroup innerGroup = diagnosticGroups.forName("globalThis");
        DiagnosticGroup nestedGroup = DiagnosticGroups.registerGroup("nestedTestGroup", innerGroup);
        
        assertNotNull(nestedGroup);
        assertEquals(nestedGroup, diagnosticGroups.forName("nestedTestGroup"));
    }
}