package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target: Defects4J Closure-67b (AnalyzePrototypeProperties)
 */
public class AnalyzePrototypePropertiesTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // ตั้งค่าพื้นฐานสำหรับ Compiler ตามมาตรฐาน Google Closure Compiler
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testConstructorWithoutModuleGraph() {
        // ทดสอบ Constructor เมื่อ moduleGraph เป็น null (Branch Coverage สำหรับ moduleGraph == null)
        AnalyzePrototypeProperties analyzer = new AnalyzePrototypeProperties(compiler, null, false, false);
        Collection<AnalyzePrototypeProperties.NameInfo> infoList = analyzer.getAllNameInfo();
        assertNotNull(infoList);
    }

    @Test
    public void testConstructorWithModuleGraph() {
        // ทดสอบ Constructor เมื่อมี moduleGraph และเชื่อมโยง Externs
        JSModule moduleA = new JSModule("moduleA");
        JSModule moduleB = new JSModule("moduleB");
        JSModuleGraph moduleGraph = new JSModuleGraph(new JSModule[] { moduleA, moduleB });

        AnalyzePrototypeProperties analyzer = new AnalyzePrototypeProperties(compiler, moduleGraph, true, true);
        assertNotNull(analyzer.getAllNameInfo());
    }

    @Test
    public void testProcessExternPropertiesAndPrototypeAssignment() {
        // ทดสอบ ProcessExternProperties และการกำหนดค่า Prototype แบบ GETPROP (AssignmentProperty)
        Node externRoot = new Node(Token.BLOCK);
        Node externGetProp = Node.newString(Token.GETPROP, "externProp");
        externRoot.addChildToBack(externGetProp);

        Node root = new Node(Token.BLOCK);
        // สร้าง AST สำหรับ: Foo.prototype.bar = function() {};
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        Node protoGetProp = new Node(Token.GETPROP);
        
        Node fooName = Node.newString(Token.NAME, "Foo");
        Node protoStr = Node.newString(Token.STRING, "prototype");
        protoGetProp.addChildToBack(fooName);
        protoGetProp.addChildToBack(protoStr);

        Node barStr = Node.newString(Token.STRING, "bar");
        getProp.addChildToBack(protoGetProp);
        getProp.addChildToBack(barStr);

        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToBack(Node.newString(Token.NAME, ""));
        funcNode.addChildToBack(new Node(Token.PARAM_LIST));
        funcNode.addChildToBack(new Node(Token.BLOCK));

        assign.addChildToBack(getProp);
        assign.addChildToBack(funcNode);
        expr.addChildToBack(assign);
        root.addChildToBack(expr);

        AnalyzePrototypeProperties analyzer = new AnalyzePrototypeProperties(compiler, null, false, false);
        analyzer.process(externRoot, root);

        assertFalse(analyzer.getAllNameInfo().isEmpty());
    }

    @Test
    public void testProcessPrototypeObjectLiteral() {
        // ทดสอบการกำหนดค่า Prototype ผ่าน Object Literal (LiteralProperty)
        Node externRoot = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        // สร้าง AST สำหรับ: Foo.prototype = { bar: function() {} };
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node protoGetProp = new Node(Token.GETPROP);
        
        protoGetProp.addChildToBack(Node.newString(Token.NAME, "Foo"));
        protoGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));

        Node objLit = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "bar");
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToBack(Node.newString(Token.NAME, ""));
        funcNode.addChildToBack(new Node(Token.PARAM_LIST));
        funcNode.addChildToBack(new Node(Token.BLOCK));
        keyNode.addChildToBack(funcNode);
        objLit.addChildToBack(keyNode);

        assign.addChildToBack(protoGetProp);
        assign.addChildToBack(objLit);
        expr.addChildToBack(assign);
        root.addChildToBack(expr);

        AnalyzePrototypeProperties analyzer = new AnalyzePrototypeProperties(compiler, null, true, false);
        analyzer.process(externRoot, root);

        boolean foundBar = false;
        for (AnalyzePrototypeProperties.NameInfo info : analyzer.getAllNameInfo()) {
            if ("bar".equals(info.name)) {
                foundBar = true;
                break;
            }
        }
        assertTrue(foundBar);
    }

    @Test
    public void testGlobalFunctionDeclarationAndUsage() {
        // ทดสอบการประกาศ Global Function และการใช้งานตัวแปร (VAR & Global Function branches)
        Node externRoot = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        // function globalFunc() {}
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "globalFunc");
        funcNode.addChildToBack(nameNode);
        funcNode.addChildToBack(new Node(Token.PARAM_LIST));
        funcNode.addChildToBack(new Node(Token.BLOCK));

        root.addChildToBack(funcNode);

        AnalyzePrototypeProperties analyzer = new AnalyzePrototypeProperties(compiler, null, false, true);
        analyzer.process(externRoot, root);

        assertNotNull(analyzer.getAllNameInfo());
    }

    @Test
    public void testObjectLiteralGeneralUseAndQuotedString() {
        // ทดสอบ Object Literal ทั่วไป (ไม่ใช่ prototype) รวมถึง quoted string ที่ต้องถูกข้าม
        Node externRoot = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        // var x = { a: 1, 'b': 2 };
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node objLit = new Node(Token.OBJECTLIT);
        
        Node propA = Node.newString(Token.STRING, "a");
        propA.addChildToBack(Node.newNumber(1.0));
        
        Node propB = Node.newString(Token.STRING, "b");
        propB.setQuotedString();
        propB.addChildToBack(Node.newNumber(2.0));

        objLit.addChildToBack(propA);
        objLit.addChildToBack(propB);
        nameNode.addChildToBack(objLit);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        AnalyzePrototypeProperties analyzer = new AnalyzePrototypeProperties(compiler, null, false, false);
        analyzer.process(externRoot, root);

        assertNotNull(analyzer.getAllNameInfo());
    }
}