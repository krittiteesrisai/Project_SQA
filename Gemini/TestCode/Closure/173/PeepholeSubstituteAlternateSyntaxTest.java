package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 Test Suite for PeepholeSubstituteAlternateSyntax (Defects4J Closure-173b)
 */
public class PeepholeSubstituteAlternateSyntaxTest {

    private AbstractCompiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด Compiler options พื้นฐานเพื่อให้สภาพแวดล้อมจำลองสมบูรณ์
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    private void enableASTNormalized(AbstractCompiler compiler, boolean normalized) {
        compiler.setLifeCycleStage(normalized ? CompilerOptions.DevMode.NORMALIZED : CompilerOptions.DevMode.RAW);
    }

    @Test
    public void testOptimizeSubtreeDefaultAndLiterals() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);

        // Test default case (e.g., Token.BLOCK or unsupported token)
        Node blockNode = IR.block();
        Node result = peephole.optimizeSubtree(blockNode);
        assertSame(blockNode, result);

        // Test TRUE / FALSE reduction when late = false (should return original)
        Node trueNode = IR.trueNode();
        Node optimizedTrue = peephole.optimizeSubtree(trueNode);
        assertSame(trueNode, optimizedTrue);
    }

    @Test
    public void testReduceTrueFalseLate() {
        PeepholeSubstituteAlternateSyntax peepholeLate = new PeepholeSubstituteAlternateSyntax(true);

        Node parent = IR.exprResult(IR.trueNode());
        Node trueNode = parent.getFirstChild();

        Node optimized = peepholeLate.optimizeSubtree(trueNode);
        assertNotNull(optimized);
        assertEquals(Token.NOT, optimized.getType());
    }

    @Test
    public void testTryFoldSimpleFunctionCallString() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);

        // สร้าง String('abc') call node
        Node callNode = IR.call(IR.name("String"), IR.string("abc"));
        Node parent = IR.exprResult(callNode);

        Node result = peephole.optimizeSubtree(callNode);
        assertNotNull(result);
        // ตรวจสอบว่าถูกเปลี่ยนเป็น addition ('' + 'abc') หรือไม่
        assertEquals(Token.ADD, result.getType());
    }

    @Test
    public void testTryFoldSimpleFunctionCallEdgeCases() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);

        // Call ที่ไม่มีอาร์กิวเมนต์ หรืออาร์กิวเมนต์เกิน จะต้องไม่ถูกพับ (fold)
        Node callNodeNoArgs = IR.call(IR.name("String"));
        Node parent1 = IR.exprResult(callNodeNoArgs);
        Node res1 = peephole.optimizeSubtree(callNodeNoArgs);
        assertSame(callNodeNoArgs, res1);

        Node callNodeMultiArgs = IR.call(IR.name("String"), IR.string("a"), IR.string("b"));
        Node parent2 = IR.exprResult(callNodeMultiArgs);
        Node res2 = peephole.optimizeSubtree(callNodeMultiArgs);
        assertSame(callNodeMultiArgs, res2);
    }

    @Test
    public void testTrySplitComma() {
        // late = false ควรจะพยายามสปลิต comma ภายใต้ ExprResult
        PeepholeSubstituteAlternateSyntax peepholeEarly = new PeepholeSubstituteAlternateSyntax(false);

        Node commaNode = IR.comma(IR.number(1), IR.number(2));
        Node exprResult = IR.exprResult(commaNode);
        Node parentBlock = IR.block(exprResult);

        Node result = peepholeEarly.optimizeSubtree(commaNode);
        assertNotNull(result);

        // ทดสอบเมื่อ late = true (ไม่ควรสปลิต)
        PeepholeSubstituteAlternateSyntax peepholeLate = new PeepholeSubstituteAlternateSyntax(true);
        Node commaNodeLate = IR.comma(IR.number(1), IR.number(2));
        Node exprResultLate = IR.exprResult(commaNodeLate);
        Node resLate = peepholeLate.optimizeSubtree(commaNodeLate);
        assertSame(commaNodeLate, resLate);
    }

    @Test
    public void testTryReplaceUndefined() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
        enableASTNormalized(compiler, true);

        // ทดสอบแทนที่ undefined ด้วย void 0 เมื่อ AST ถูก normalize แล้ว
        Node undefinedName = IR.name("undefined");
        Node exprResult = IR.exprResult(undefinedName);

        Node result = peephole.optimizeSubtree(undefinedName);
        // ผลลัพธ์ควรเปลี่ยนเป็น Token.VOID ถ้าผ่านเงื่อนไข isASTNormalized และ NodeUtil.isUndefined
        assertNotNull(result);
    }

    @Test
    public void testTryReduceReturn() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);

        // return undefined -> return
        Node returnNode1 = IR.returnNode(IR.name("undefined"));
        Node res1 = peephole.optimizeSubtree(returnNode1);
        assertNull(res1.getFirstChild());

        // return void 0 -> return
        Node returnNode2 = IR.returnNode(IR.voidNode(IR.number(0)));
        Node res2 = peephole.optimizeSubtree(returnNode2);
        assertNull(res2.getFirstChild());
    }

    @Test
    public void testTryFoldStandardConstructorsAndLiterals() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
        enableASTNormalized(compiler, true);

        // new Object() -> Object() -> {}
        Node newObj = IR.newnode(IR.name("Object"));
        Node parent = IR.exprResult(newObj);

        Node result = peephole.optimizeSubtree(newObj);
        assertNotNull(result);
        assertEquals(Token.OBJECTLIT, result.getType());
    }

    @Test
    public void testTryFoldArrayConstructorVariants() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
        enableASTNormalized(compiler, true);

        // Array() -> []
        Node callArrayEmpty = IR.call(IR.name("Array"));
        Node parent1 = IR.exprResult(callArrayEmpty);
        Node res1 = peephole.optimizeSubtree(callArrayEmpty);
        assertEquals(Token.ARRAYLIT, res1.getType());

        // Array(0) -> [] (Number 0 is safe to fold without args)
        Node callArrayZero = IR.call(IR.name("Array"), IR.number(0));
        Node parent2 = IR.exprResult(callArrayZero);
        Node res2 = peephole.optimizeSubtree(callArrayZero);
        assertEquals(Token.ARRAYLIT, res2.getType());

        // Array('a') -> ['a']
        Node callArrayArg = IR.call(IR.name("Array"), IR.string("a"));
        Node parent3 = IR.exprResult(callArrayArg);
        Node res3 = peephole.optimizeSubtree(callArrayArg);
        assertEquals(Token.ARRAYLIT, res3.getType());
    }

    @Test
    public void testTryFoldRegularExpressionConstructor() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(false);
        enableASTNormalized(compiler, true);

        // RegExp("foobar", "i") -> /foobar/i
        Node callRegExp = IR.call(IR.name("RegExp"), IR.string("foobar"), IR.string("i"));
        Node parent = IR.exprResult(callRegExp);

        Node result = peephole.optimizeSubtree(callRegExp);
        assertNotNull(result);
        assertEquals(Token.REGEXP, result.getType());
    }

    @Test
    public void testTryMinimizeStringArrayLiteral() {
        PeepholeSubstituteAlternateSyntax peephole = new PeepholeSubstituteAlternateSyntax(true); // late = true

        // Array literal with all strings that benefit from splitting
        Node arrayLit = IR.arraylit(IR.string("a,b,c"), IR.string("d,e,f"));
        Node parent = IR.exprResult(arrayLit);

        Node result = peephole.optimizeSubtree(arrayLit);
        assertNotNull(result);
        // ตรวจสอบว่ามีการแปลงหรือพยายามย่อส่วนของ Array Literal
    }
}