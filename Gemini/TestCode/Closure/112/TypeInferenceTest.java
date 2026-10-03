package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableMap;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for TypeInference (Closure-112b)
 * Focuses on Branch/Condition Coverage, Edge Cases, and Defect Detection.
 */
public class TypeInferenceTest {

    private Compiler compiler;
    private JSTypeRegistry registry;
    private ReverseAbstractInterpreter reverseInterpreter;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด Compiler options พื้นฐานเพื่อให้ JSTypeRegistry พร้อมใช้งาน
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        registry = compiler.getTypeRegistry();
        reverseInterpreter = new SemanticReverseAbstractInterpreter(
            compiler.getCodingConvention(), registry);
    }

    @Test
    public void testFlowThroughBottomScope() {
        // ทดสอบกรณี input == bottomScope ใน flowThrough
        Scope scope = Scope.createLatticeBottom(new Node(Token.BLOCK));
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(new Node(Token.BLOCK), false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node node = new Node(Token.NAME, "x");
        FlowScope result = inference.flowThrough(node, inference.createInitialEstimateLattice());
        assertNotNull(result);
        assertEquals(inference.createInitialEstimateLattice(), result);
    }

    @Test
    public void testTraverseNameWithNullValue() {
        // ทดสอบการ traverse Token.NAME โดยไม่มี value (อ่านค่าตัวแปรจาก scope)
        Node root = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Scope scope = new Scope(root, compiler.preDefinedVars);
        
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(root, false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node nameNode = new Node(Token.NAME, "x");
        FlowScope flowScope = inference.createEntryLattice();
        
        // เรียกผ่าน flowThrough เพื่อให้เข้าสู่ traverse
        FlowScope resultScope = inference.flowThrough(nameNode, flowScope);
        assertNotNull(resultScope);
    }

    @Test
    public void testTraverseAddTokenStringAndNumber() {
        // ทดสอบ Token.ADD (String + Number -> String)
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, compiler.preDefinedVars);
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(root, false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node left = Node.newString("hello");
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        
        Node right = Node.newNumber(123);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node addNode = new Node(Token.ADD, left, right);
        FlowScope result = inference.flowThrough(addNode, inference.createEntryLattice());
        
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseAddTokenBothUnknown() {
        // ทดสอบ Token.ADD เมื่อทั้งสองฝั่งเป็น Unknown type
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, compiler.preDefinedVars);
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(root, false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        // ไม่กำหนด JSType เพื่อจำลอง Unknown type (Edge case)

        Node addNode = new Node(Token.ADD, left, right);
        FlowScope result = inference.flowThrough(addNode, inference.createEntryLattice());
        
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseAssignAndGetProp() {
        // ทดสอบ Token.ASSIGN และ Token.GETPROP
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, compiler.preDefinedVars);
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(root, false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node obj = new Node(Token.NAME, "obj");
        obj.setJSType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        
        Node prop = Node.newString("prop");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        
        Node val = Node.newNumber(42);
        val.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node assign = new Node(Token.ASSIGN, getProp, val);

        FlowScope result = inference.flowThrough(assign, inference.createEntryLattice());
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assign.getJSType());
    }

    @Test
    public void testTraverseAndOrShortCircuit() {
        // ทดสอบ short-circuiting operators (Token.AND, Token.OR)
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, compiler.preDefinedVars);
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(root, false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node left = new Node(Token.TRUE);
        left.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node right = new Node(Token.FALSE);
        right.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));

        Node andNode = new Node(Token.AND, left, right);
        FlowScope result = inference.flowThrough(andNode, inference.createEntryLattice());
        assertNotNull(result);
    }

    @Test
    public void testCatchNodeInference() {
        // ทดสอบ Token.CATCH โดยไม่มี JSDoc type (Edge case: fallback to UNKNOWN)
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(root, compiler.preDefinedVars);
        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(root, false, false);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        Node catchName = new Node(Token.NAME, "err");
        Node catchNode = new Node(Token.CATCH, catchName, new Node(Token.BLOCK));

        FlowScope result = inference.flowThrough(catchNode, inference.createEntryLattice());
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchName.getJSType());
    }

    @Test
    public void testBranchedFlowThroughBasic() {
        // ทดสอบ branchedFlowThrough สำหรับ CFG ที่มี Branch ON_TRUE และ ON_FALSE
        Node cond = new Node(Token.TRUE);
        cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node ifNode = new Node(Token.IF, cond, new Node(Token.BLOCK));

        ControlFlowGraph<Node> cfg = new ControlFlowGraph<>(ifNode, false, false);
        // เพิ่ม Dummy edges เพื่อจำลอง Branch
        cfg.createNode(ifNode);
        
        Scope scope = new Scope(ifNode, compiler.preDefinedVars);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, scope, Collections.emptyMap());

        List<FlowScope> results = inference.branchedFlowThrough(ifNode, inference.createEntryLattice());
        assertNotNull(results);
    }
}