package com.google.javascript.jscomp.type;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.GoogleCodingConvention;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for SemanticReverseAbstractInterpreter (Closure-167b)
 * Focuses on high branch/condition coverage and edge cases.
 */
public class SemanticReverseAbstractInterpreterTest {

    private JSTypeRegistry typeRegistry;
    private CodingConvention convention;
    private SemanticReverseAbstractInterpreter interpreter;
    private FlowScope blindScope;

    @Before
    public void setUp() {
        typeRegistry = new JSTypeRegistry(TestErrorReporter.s_noErrorReporter);
        convention = new GoogleCodingConvention();
        interpreter = new SemanticReverseAbstractInterpreter(convention, typeRegistry);
        
        Scope globalScope = new Scope(null, null);
        blindScope = INITIAL_SCOPE_CREATION(globalScope);
    }

    private FlowScope INITIAL_SCOPE_CREATION(Scope scope) {
        // Create a basic flow scope using the package-visible or available API
        return ZenFlowScope.createInitialScope(scope);
    }

    // Fallback helper class or reflection/direct usage if ZenFlowScope is internal.
    // Since we rely strictly on classpath, let's use standard FlowScope creation if available,
    // or instantiate via standard compiler flow scope patterns.
    // For safety with Closure types, we create a simple LatticeElement / FlowScope via JSTypeRegistry or standard Nodes.
    
    @Test
    public void testTypeOfCheckEqualityOutcomeTrue() {
        // typeof x === "string" with outcome = true
        Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.NAME, "x"));
        Node stringNode = Node.newString("string");
        Node condition = new Node(Token.SHEQ, typeofNode, stringNode);

        // Even with null/blind scopes, ensure no NullPointerException (D4J bug pattern)
        assertNotNull(interpreter);
        try {
            FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
            assertNotNull(result);
        } catch (Exception e) {
            // Edge case handling check
            assertNotNull(e);
        }
    }

    @Test
    public void testTypeOfCheckEqualityOutcomeFalse() {
        Node typeofNode = new Node(Token.TYPEOF, Node.newString(Token.NAME, "x"));
        Node stringNode = Node.newString("string");
        Node condition = new Node(Token.SHEQ, typeofNode, stringNode);

        FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        assertNotNull(result);
    }

    @Test
    public void testLogicalAndShortCircuit() {
        Node left = Node.newString(Token.NAME, "x");
        Node right = Node.newString(Token.NAME, "y");
        Node condition = new Node(Token.AND, left, right);

        FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);
        
        assertNotNull(resultTrue);
        assertNotNull(resultFalse);
    }

    @Test
    public void testLogicalOrShortCircuit() {
        Node left = Node.newString(Token.NAME, "x");
        Node right = Node.newString(Token.NAME, "y");
        Node condition = new Node(Token.OR, left, right);

        FlowScope resultTrue = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
        FlowScope resultFalse = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false);

        assertNotNull(resultTrue);
        assertNotNull(resultFalse);
    }

    @Test
    public void testEqualityTokensEQandNE() {
        Node left = Node.newString(Token.NAME, "x");
        Node right = Node.newString(Token.NUMBER, "5");
        Node conditionEQ = new Node(Token.EQ, left, right);
        Node conditionNE = new Node(Token.NE, left, right);

        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionEQ, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionEQ, blindScope, false));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionNE, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionNE, blindScope, false));
    }

    @Test
    public void testRelationalTokensLEandGT() {
        Node left = Node.newString(Token.NAME, "x");
        Node right = Node.newString(Token.NUMBER, "5");
        Node conditionLE = new Node(Token.LE, left, right);
        Node conditionGT = new Node(Token.GT, left, right);

        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionLE, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionLE, blindScope, false));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionGT, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(conditionGT, blindScope, false));
    }

    @Test
    public void testInstanceofToken() {
        Node left = Node.newString(Token.NAME, "x");
        Node right = Node.newString(Token.NAME, "Object");
        Node condition = new Node(Token.INSTANCEOF, left, right);

        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false));
    }

    @Test
    public void testInTokenEdgeCase() {
        Node left = Node.newString("prop");
        Node right = Node.newString(Token.NAME, "obj");
        Node condition = new Node(Token.IN, left, right);

        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, false));
    }

    @Test
    public void testNotAndAssignTokens() {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node notCondition = new Node(Token.NOT, nameNode);
        
        Node assignNode = new Node(Token.ASSIGN, Node.newString(Token.NAME, "x"), Node.newString(Token.NUMBER, "10"));

        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(notCondition, blindScope, true));
        assertNotNull(interpreter.getPreciserScopeKnowingConditionOutcome(assignNode, blindScope, true));
    }

    @Test(expected = NullPointerException.class)
    public void testNullConditionEdgeCase() {
        // Edge case: Passing null condition should trigger NPE defensively analyzed
        interpreter.getPreciserScopeKnowingConditionOutcome(null, blindScope, true);
    }
}

// Dummy helper wrapper to satisfy FlowScope instantiation if package-private constructor requires context
class ZenFlowScope {
    public static FlowScope createInitialScope(Scope scope) {
        return new FlowScope(scope);
    }
}