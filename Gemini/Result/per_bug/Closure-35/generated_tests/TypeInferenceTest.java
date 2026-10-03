package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for TypeInference (Closure-35b)
 */
public class TypeInferenceTest {

    private Compiler compiler;
    private JSTypeRegistry registry;
    private Scope globalScope;
    private ControlFlowGraph<Node> cfg;
    private TypeInference typeInference;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนดค่าเริ่มต้นเบื้องต้นให้ Compiler และ Type Registry
        compiler.initOptions(new CompilerOptions());
        registry = compiler.getTypeRegistry();
        
        Node root = new Node(Token.BLOCK);
        globalScope = new Scope(root, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        
        // สร้าง Dummy CFG
        cfg = new ControlFlowGraph<>(root);
        
        typeInference = new TypeInference(
                compiler,
                cfg,
                new SemanticReverseAbstractInterpreter(compiler.getCodingConvention(), registry),
                globalScope,
                new HashMap<>()
        );
    }

    @Test
    public void testFlowThroughWithBottomScope() {
        Node node = new Node(Token.NAME, "x");
        FlowScope bottomScope = typeInference.createInitialEstimateLattice();
        
        // Trigger branch: input == bottomScope
        FlowScope result = typeInference.flowThrough(node, bottomScope);
        assertSame("Should return bottomScope directly when input is bottomScope", bottomScope, result);
    }

    @Test
    public void testFlowThroughWithNormalScope() {
        Node node = new Node(Token.NUMBER, "42");
        FlowScope entryScope = typeInference.createEntryLattice();
        
        // Trigger normal traversal branch
        FlowScope result = typeInference.flowThrough(node, entryScope);
        assertNotNull("Should return a valid child flow scope", result);
    }

    @Test
    public void testTraverseAddWithStringsAndNumbers() {
        Node addNode = new Node(Token.ADD);
        Node left = Node.newString("hello");
        Node right = Node.newNumber(123);
        addNode.addChildToBack(left);
        addNode.addChildToBack(right);

        FlowScope entryScope = typeInference.createEntryLattice();
        FlowScope result = typeInference.flowThrough(addNode, entryScope);
        assertNotNull(result);
        // สตริงบวกกับตัวเลขใน JS ควรได้ String Type
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), addNode.getJSType());
    }

    @Test
    public void testTraverseCatchEdgeCase() {
        Node catchNode = new Node(Token.CATCH);
        Node errName = Node.newString(Token.NAME, "e");
        catchNode.addChildToBack(errName);

        FlowScope entryScope = typeInference.createEntryLattice();
        FlowScope result = typeInference.flowThrough(catchNode, entryScope);
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), errName.getJSType());
    }

    @Test
    public void testTraverseArrayLiteral() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(Node.newNumber(1));
        arrayLit.addChildToBack(Node.newNumber(2));

        FlowScope entryScope = typeInference.createEntryLattice();
        FlowScope result = typeInference.flowThrough(arrayLit, entryScope);
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), arrayLit.getJSType());
    }

    @Test
    public void testTraverseUnaryAndBinaryMathTokens() {
        // ทดสอบกลุ่ม Token คำนวณทางคณิตศาสตร์ที่เป็น Number ทั้งหมด (เช่น SUB, MUL, DIV, INC, DEC)
        int[] mathTokens = {
            Token.SUB, Token.MUL, Token.DIV, Token.MOD, Token.INC, Token.DEC,
            Token.BITAND, Token.BITOR, Token.BITXOR, Token.LSH, Token.RSH, Token.URSH
        };

        for (int token : mathTokens) {
            Node node = new Node(token);
            node.addChildToBack(Node.newNumber(10));
            if (NodeUtil.isOperator(token) && Node.isBinaryOp(node)) {
                node.addChildToBack(Node.newNumber(5));
            }

            FlowScope entryScope = typeInference.createEntryLattice();
            FlowScope result = typeInference.flowThrough(node, entryScope);
            assertNotNull("Failed on token: " + token, result);
            assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), node.getJSType());
        }
    }
}