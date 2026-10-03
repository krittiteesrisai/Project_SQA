package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for CompilerOptions (Closure-149b)
 * Maximizes Branch/Condition Coverage and validates Edge Cases.
 */
public class CompilerOptionsTest {

    private CompilerOptions options;

    @Before
    public void setUp() {
        options = new CompilerOptions();
    }

    @Test
    public void testDefaultConstructorState() {
        assertFalse(options.ideMode);
        assertNotNull(options.getDefineReplacements());
        assertTrue(options.getDefineReplacements().isEmpty());
        assertNull(options.getCodingConvention());
        assertFalse(options.isExternExportsEnabled());
    }

    @Test
    public void testGetDefineReplacementsBooleanTrue() {
        options.setDefineToBooleanLiteral("FLAG_TRUE", true);
        Map<String, Node> result = options.getDefineReplacements();
        
        assertEquals(1, result.size());
        assertTrue(result.containsKey("FLAG_TRUE"));
        assertEquals(Token.TRUE, result.get("FLAG_TRUE").getType());
    }

    @Test
    public void testGetDefineReplacementsBooleanFalse() {
        options.setDefineToBooleanLiteral("FLAG_FALSE", false);
        Map<String, Node> result = options.getDefineReplacements();
        
        assertEquals(1, result.size());
        assertEquals(Token.FALSE, result.get("FLAG_FALSE").getType());
    }

    @Test
    public void testGetDefineReplacementsInteger() {
        options.setDefineToNumberLiteral("FLAG_INT", 42);
        Map<String, Node> result = options.getDefineReplacements();
        
        assertEquals(1, result.size());
        assertEquals(Token.NUMBER, result.get("FLAG_INT").getType());
        assertEquals(42.0, result.get("FLAG_INT").getDouble(), 0.001);
    }

    @Test
    public void testGetDefineReplacementsDouble() {
        options.setDefineToDoubleLiteral("FLAG_DOUBLE", 3.14);
        Map<String, Node> result = options.getDefineReplacements();
        
        assertEquals(1, result.size());
        assertEquals(Token.NUMBER, result.get("FLAG_DOUBLE").getType());
        assertEquals(3.14, result.get("FLAG_DOUBLE").getDouble(), 0.001);
    }

    @Test
    public void testGetDefineReplacementsString() {
        options.setDefineToStringLiteral("FLAG_STR", "hello_world");
        Map<String, Node> result = options.getDefineReplacements();
        
        assertEquals(1, result.size());
        assertEquals(Token.STRING, result.get("FLAG_STR").getType());
        assertEquals("hello_world", result.get("FLAG_STR").getString());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetDefineReplacementsInvalidObjectTypeEdgeCase() {
        // Force an invalid object type into defineReplacements bypassing type-safe setters
        // to trigger Preconditions.checkState(value instanceof String) in the 'else' branch.
        options.getDefineReplacements(); // Using reflection-like behavior via direct map if accessible, 
        // Since defineReplacements is private, we inject via custom state or simulate invalid mapping if possible.
        // Alternatively, test via internal object mapping mechanism if exposed:
        // Here we simulate the invalid state by passing an unsupported object type directly if subclass/package-private,
        // or invoke state that triggers the exact branch.
        
        // Direct simulation of the invalid state condition:
        java.lang.reflect.Field field = CompilerOptions.class.getDeclaredField("defineReplacements");
        field.setAccessible(true);
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>) field.get(options);
        map.put("INVALID_OBJ", new Object());

        options.getDefineReplacements();
    }

    @Test
    public void testWarningsGuardFlowNullAndNotNull() {
        // Test enables/disables when warningsGuard is null (Initial State)
        DiagnosticGroup group = DiagnosticGroups.CHECK_TYPES;
        assertFalse(options.enables(group));
        assertFalse(options.disables(group));
        assertNull(options.getWarningsGuard());

        // Add warnings guard to trigger non-null branch in addWarningsGuard
        WarningsGuard guard1 = new DiagnosticGroupWarningsGuard(group, CheckLevel.ERROR);
        options.addWarningsGuard(guard1);
        assertNotNull(options.getWarningsGuard());

        // Add second guard to trigger ComposeWarningsGuard.addGuard branch
        WarningsGuard guard2 = new DiagnosticGroupWarningsGuard(DiagnosticGroups.ACCESS_CONTROLS, CheckLevel.WARNING);
        options.addWarningsGuard(guard2);
        assertNotNull(options.getWarningsGuard());
    }

    @Test
    public void testTracerModeEnum() {
        assertTrue(CompilerOptions.TracerMode.ALL.isOn());
        assertTrue(CompilerOptions.TracerMode.FAST.isOn());
        assertFalse(CompilerOptions.TracerMode.OFF.isOn());
    }

    @Test
    public void testSettersAndGettersEdgeCases() {
        options.setSummaryDetailLevel(3);
        options.setLooseTypes(true);
        options.setProcessObjectPropertyString(true);
        options.setColorizeErrorOutput(true);
        assertTrue(options.shouldColorizeErrorOutput());
        
        options.enableExternExports(true);
        assertTrue(options.isExternExportsEnabled());
    }
}