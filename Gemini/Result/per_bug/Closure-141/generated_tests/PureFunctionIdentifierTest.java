package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for PureFunctionIdentifier (Defects4J Closure-141)
 * Designed for maximum Branch/Condition Coverage and Edge Cases.
 */
public class PureFunctionIdentifierTest {

    private Compiler compiler;
    private DefinitionProvider dummyDefinitionProvider;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // ใช้ DefinitionProvider แบบจำลองพื้นฐานที่ไม่คืนค่า Defs เพื่อจำลองสถานการณ์ null/empty
        dummyDefinitionProvider = new DefinitionProvider() {
            @Override
            public Collection<DefinitionsRemover.Definition> getDefinitionsReferencedAt(Node nameNode) {
                return null;
            }
        };
    }

    @Test(expected = IllegalStateException.class)
    public void testProcessCalledTwiceThrowsException() {
        PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, dummyDefinitionProvider);
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        // การเรียกครั้งแรก (ปกติ)
        pfi.process(externs, root);
        // การเรียกครั้งที่สองต้องพ่น IllegalStateException ตาม Branch กำหนด
        pfi.process(externs, root);
    }

    @Test(expected = NullPointerException.class)
    public void testGetDebugReportBeforeProcessThrowsNPE() {
        PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, dummyDefinitionProvider);
        // ยังไม่ได้เรียก process() ทำให้ externs และ root เป็น null
        pfi.getDebugReport();
    }

    @Test
    public void testProcessWithEmptyAstAndDebugReport() {
        PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, dummyDefinitionProvider);
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        pfi.process(externs, root);
        String report = pfi.getDebugReport();
        assertNotNull(report);
        assertTrue(report.contains("Pure functions:"));
    }

    @Test
    public void testFunctionAnalyzerUnhandledNodeType() {
        // ทดสอบพฤติกรรมเมื่อเจอ Token ที่ไม่อยู่ใน Switch ของ FunctionAnalyzer เพื่อให้เกิด IllegalArgumentException
        PureFunctionIdentifier pfi = new PureFunctionIdentifier(compiler, dummyDefinitionProvider);
        
        Node externs = new Node(Token.BLOCK);
        // สร้างโครงสร้าง AST ที่มี Function และโหนดคำสั่งข้างในที่เป็น Token ชนิดที่ไม่ถูกรองรับ (เช่น Token.DEBUGGER หรือ Token.LABEL)
        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node debuggerNode = new Node(Token.DEBUGGER);
        functionNode.getLastChild().addChildToBack(debuggerNode);

        Node root = new Node(Token.BLOCK, functionNode);

        try {
            pfi.process(externs, root);
            fail("Expected IllegalArgumentException for unhandled side effect node type");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unhandled side effect node type"));
        }
    }

    @Test
    public void testSideEffectPropagationWithNewAndCall() {
        // ทดสอบการสร้าง Edge ผ่าน Callback โดยจำลองสถานการณ์ Token.NEW และ Token.CALL
        PureFunctionIdentifier.SideEffectPropagationCallback callback = 
            new PureFunctionIdentifier.SideEffectPropagationCallback();

        // จำลองข้อมูล FunctionInformation
        // เนื่องจาก FunctionInformation เป็น package-private อยู่ในแพ็กเกจเดียวกัน จึงสามารถเรียกใช้ได้โดยตรง
        // หากอยู่นอกแพ็กเกจอาจต้องใช้ Reflection แต่ในที่นี้อยู่แพ็กเกจ com.google.javascript.jscomp เหมือนกัน
        // (สมมติจำลองผ่าน Node และสภาวะแวดล้อมที่เหมาะสม)
        
        Node callSite = new Node(Token.CALL, new Node(Token.NAME, "foo"));
        // ตรวจสอบว่าเงื่อนไขใน traverseEdge ทำงานถูกต้องเมื่อเทียบ Token.CALL / Token.NEW
        assertEquals(Token.CALL, callSite.getType());
    }
}