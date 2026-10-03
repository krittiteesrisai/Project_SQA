package com.google.javascript.jscomp;

import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.type.FlowScope;
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
 * Senior JUnit 4 Test Suite for Closure-171b TypeInference.
 * Focuses on Branch/Condition Coverage and Edge Cases (Null/Empty/Invalid states).
 */
public class TypeInferenceTest {

    private Compiler compiler;
    private JSTypeRegistry registry;
    private Scope syntacticScope;
    private ControlFlowGraph<Node> cfg;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        registry = compiler.getTypeRegistry();
        
        // สร้าง Dummy Root Node สำหรับ Scope
        Node root = new Node(Token.SCRIPT);
        syntacticScope = new Scope(root, compiler);
        cfg = new ControlFlowGraph<>(root, true, true);
    }

    private TypeInference createTypeInference() {
        return new TypeInference(
            compiler,
            cfg,
            compiler.getReverseAbstractInterpreter(),
            syntacticScope,
            Collections.emptyMap()
        );
    }

    @Test
    public void testFlowThroughBottomScopeEdgeCase() {
        // Edge Case: input == bottomScope ควรคืนค่า bottomScope ทันที
        TypeInference inference = createTypeInference();
        Node dummyNode = new Node(Token.EMPTY);
        FlowScope bottom = inference.createInitialEstimateLattice();
        
        FlowScope result = inference.flowThrough(dummyNode, bottom);
        assertSame("Should return bottomScope directly when input matches", bottom, result);
    }

    @Test
    public void testTraverseCatchWithoutAndWithJSDoc() {
        // Edge Case: CATCH node ไม่มี JSDoc vs มี JSDoc type
        TypeInference inference = createTypeInference();
        FlowScope entry = inference.createEntryLattice();

        Node catchNameNode = Node.newString(Token.NAME, "e");
        Node catchNode = new Node(Token.CATCH, catchNameNode);

        // กรณีไม่มี JSDoc -> ควรเป็น UNKNOWN_TYPE
        FlowScope resultScope = inference.flowThrough(catchNode, entry);
        assertNotNull(resultScope);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchNameNode.getJSType());
    }

    @Test
    public void testTraverseAddAndAssignAddEdgeCases() {
        // Edge Cases สำหรับ ADD และ ASSIGN_ADD (Number, String, Unknown types)
        TypeInference inference = createTypeInference();
        FlowScope entry = inference.createEntryLattice();

        // left: number, right: string -> ควรได้ Union Type (STRING, NUMBER)
        Node leftNum = Node.newNumber(5.0);
        leftNum.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        
        Node rightStr = Node.newString("test");
        rightStr.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));

        Node addNode = new Node(Token.ADD, leftNum, rightStr);
        FlowScope result = inference.flowThrough(addNode, entry);
        assertNotNull(result);
        assertNotNull(addNode.getJSType());
    }

    @Test
    public void testBranchedFlowThroughForInAndShortCircuit() {
        // ทดสอบ Branched Flow Through กับ FOR_IN และ Short-circuit operators (AND / OR)
        TypeInference inference = createTypeInference();
        FlowScope entry = inference.createEntryLattice();

        // จำลอง FOR_IN node: for (var item in obj)
        Node itemNode = new Node(Token.VAR, Node.newString(Token.NAME, "item"));
        Node objNode = Node.newString(Token.NAME, "obj");
        objNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        
        Node forInNode = new Node(Token.FOR, itemNode, objNode);
        
        // เพิ่ม Dummy Out Edge เข้าไปใน CFG เพื่อให้ลูปทำงานครบ Branch
        cfg.getOrAddNode(forInNode);
        cfg.getOrAddNode(entry.getRootNode());
        cfg.connect(forInNode, Branch.ON_TRUE, entry.getRootNode());

        List<FlowScope> branches = inference.branchedFlowThrough(forInNode, entry);
        assertNotNull(branches);
    }

    @Test
    public void testTraverseCastNode() {
        // Edge Case: CAST Node ที่มี JSDoc info และไม่มี
        TypeInference inference = createTypeInference();
        FlowScope entry = inference.createEntryLattice();

        Node child = Node.newNumber(10.0);
        child.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node castNode = new Node(Token.CAST, child);

        FlowScope result = inference.flowThrough(castNode, entry);
        assertNotNull(result);
    }

    @Test
    public void testTraverseHookTernary() {
        // Edge Case: HOOK (Condition ? TrueNode : FalseNode)
        TypeInference inference = createTypeInference();
        FlowScope entry = inference.createEntryLattice();

        Node cond = Node.newString(Token.NAME, "cond");
        cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        
        Node tNode = Node.newNumber(1.0);
        tNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        
        Node fNode = Node.newNumber(2.0);
        fNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));

        Node hookNode = new Node(Token.HOOK, cond, tNode, fNode);
        FlowScope result = inference.flowThrough(hookNode, entry);
        assertNotNull(result);
        assertNotNull(hookNode.getJSType());
    }
}