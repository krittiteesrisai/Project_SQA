package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.ControlFlowGraph.Branch;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.rhino.JSDocInfo;
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

public class TypeInferenceTest {

    private Compiler compiler;
    private JSTypeRegistry registry;
    private ReverseAbstractInterpreter reverseInterpreter;
    private Scope syntacticScope;
    private ControlFlowGraph<Node> cfg;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นเบื้องต้นสำหรับการคอมไพล์และการสร้าง Type Registry
        compiler.initOptions(new CompilerOptions());
        registry = compiler.getTypeRegistry();
        reverseInterpreter = new ClosureReverseAbstractInterpreter(registry, codingConvention());
        
        Node root = new Node(Token.BLOCK);
        syntacticScope = new Scope(root, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        
        // สร้าง Dummy CFG
        cfg = ControlFlowGraph.create(root, false, false);
    }

    private CodingConvention codingConvention() {
        return new DefaultCodingConvention();
    }

    @Test
    public void testFlowThroughBottomScopeEdgeCase() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        Node node = new Node(Token.NUMBER, Node.newNumber(42));
        
        // Trigger branch: input == bottomScope
        FlowScope bottom = inference.createInitialEstimateLattice();
        FlowScope result = inference.flowThrough(node, bottom);
        
        assertSame("Bottom scope should be returned directly", bottom, result);
    }

    @Test
    public void testFlowThroughNormalNode() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        Node node = new Node(Token.STRING, Node.newString("hello"));
        
        FlowScope entry = inference.createEntryLattice();
        FlowScope result = inference.flowThrough(node, entry);
        
        assertNotNull(result);
        assertNotSame(entry, result);
    }

    @Test
    public void testBranchedFlowThroughOnTrueAndFalse() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        
        // สร้าง Node สำหรับ IF พร้อมเงื่อนไข
        Node condition = new Node(Token.TRUE);
        Node ifNode = new Node(Token.IF, condition);
        
        // เพิ่ม Branch เข้า CFG
        cfg.getOrAddNode(ifNode);
        cfg.getOrAddNode(condition);
        cfg.connect(ifNode, Branch.ON_TRUE, condition);
        cfg.connect(ifNode, Branch.ON_FALSE, condition);

        FlowScope entry = inference.createEntryLattice();
        List<FlowScope> results = inference.branchedFlowThrough(ifNode, entry);
        
        assertNotNull(results);
        assertEquals(2, results.size());
    }

    @Test
    public void testTraverseAssignAndName() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        
        Node nameNode = Node.newString(Token.NAME, "x");
        Node numNode = Node.newNumber(10);
        Node assignNode = new Node(Token.ASSIGN, nameNode, numNode);
        
        FlowScope entry = inference.createEntryLattice();
        FlowScope result = inference.flowThrough(assignNode, entry);
        
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), assignNode.getJSType());
    }

    @Test
    public void testTraverseAddStringAndNumber() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        
        Node left = Node.newString("test");
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        
        Node right = Node.newNumber(5);
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        
        Node addNode = new Node(Token.ADD, left, right);
        
        FlowScope entry = inference.createEntryLattice();
        FlowScope result = inference.flowThrough(addNode, entry);
        
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseObjectLiteral() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        
        Node key = Node.newString("a");
        Node val = Node.newNumber(1);
        Node objLit = new Node(Token.OBJECTLIT, key, val);
        
        FlowScope entry = inference.createEntryLattice();
        FlowScope result = inference.flowThrough(objLit, entry);
        
        assertNotNull(result);
        assertNotNull(objLit.getJSType());
    }

    @Test
    public void testTraverseCatchNode() {
        TypeInference inference = new TypeInference(compiler, cfg, reverseInterpreter, syntacticScope);
        
        Node catchName = Node.newString(Token.NAME, "e");
        Node catchNode = new Node(Token.CATCH, catchName);
        
        FlowScope entry = inference.createEntryLattice();
        FlowScope result = inference.flowThrough(catchNode, entry);
        
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), catchName.getJSType());
    }

    @Test
    public void testUnflowableVariablesHandling() {
        Var dummyVar = new Var(false, "unflowable", null, null, null, 0, null);
        TypeInference inference = new TypeInference(
            compiler, cfg, reverseInterpreter, syntacticScope, ImmutableSet.of(dummyVar)
        );
        
        assertNotNull(inference);
        FlowScope entry = inference.createEntryLattice();
        assertNotNull(entry);
    }
}