package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test class for PrepareAst, targeting high branch/condition coverage
 * and edge cases for Defects4J Closure-129b.
 */
public class PrepareAstTest extends TestCase {

    private static final CompilerDummyCompiler compiler = new CompilerDummyCompiler();

    private static class CompilerDummyCompiler extends Compiler {
        CompilerDummyCompiler() {
            super();
        }
        @Override
        public void reportCodeChange() {
            // No-op for testing
        }
    }

    @Test
    public void testProcessWithCheckOnlyAndNormalizeBlocks() {
        // Test checkOnly = true, triggering normalizeNodeTypes and normalizeBlocks
        // An IF statement without block should trigger block normalization and reportChange() throwing IllegalStateException
        Node root = IR.ifNode(IR.name("cond"), IR.empty());
        PrepareAst prepareAst = new PrepareAst(compiler, true);
        
        try {
            prepareAst.process(null, root);
            fail("Expected IllegalStateException due to checkOnly violation in reportChange");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("normalizeNodeType constraints violated"));
        }
    }

    @Test
    public void testProcessNormalExecutionWithExternsAndRoot() {
        // Test checkOnly = false, with non-null externs and non-null root
        Node externs = IR.var(IR.name("ext"));
        Node root = IR.script();
        
        PrepareAst prepareAst = new PrepareAst(compiler, false);
        prepareAst.process(externs, root);
        // Verify traversal executes without exception
    }

    @Test
    public void testProcessNormalExecutionWithNulls() {
        // Test checkOnly = false, with null externs and null root (Edge case)
        PrepareAst prepareAst = new PrepareAst(compiler, false);
        prepareAst.process(null, null);
    }

    @Test
    public void testAnnotateCallsFreeCallAndEval() {
        // Test Token.CALL: Free call and direct eval
        // eval() -> call where first child is name "eval"
        Node callNode = IR.call(IR.name("eval"));
        Node root = IR.script(callNode);

        PrepareAst prepareAst = new PrepareAst(compiler, false);
        prepareAst.process(null, root);

        assertTrue("Should be a free call", callNode.getBooleanProp(Node.FREE_CALL));
        assertTrue("Should be a direct eval", callNode.getFirstChild().getBooleanProp(Node.DIRECT_EVAL));
    }

    @Test
    public void testAnnotateCallsGetPropNotFreeCall() {
        // Test Token.CALL: Method call (not a free call), e.g., obj.foo()
        Node getProp = IR.getprop(IR.name("obj"), IR.string("foo"));
        Node callNode = IR.call(getProp);
        Node root = IR.script(callNode);

        PrepareAst prepareAst = new PrepareAst(compiler, false);
        prepareAst.process(null, root);

        assertFalse("Should not be a free call", callNode.getBooleanProp(Node.FREE_CALL));
    }

    @Test
    public void testAnnotateDispatchersValid() {
        // Test Token.FUNCTION with parent as Assign and JSDocInfo having java dispatch
        Node funcNode = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node nameNode = IR.name("dispatcherMethod");
        Node assignNode = IR.assign(nameNode, funcNode);
        
        JSDocInfo info = new JSDocInfo();
        info.setJavaDispatch(true);
        assignNode.setJSDocInfo(info);

        Node root = IR.script(assignNode);

        PrepareAst prepareAst = new PrepareAst(compiler, false);
        prepareAst.process(null, root);

        assertTrue("Function should be marked as dispatcher", funcNode.getBooleanProp(Node.IS_DISPATCHER));
    }

    @Test
    public void testNormalizeObjectLiteralAnnotations() {
        // Test Object Literal annotation normalization where key has JSDoc and value is a function
        Node funcNode = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node keyNode = IR.stringKey("a", funcNode);
        
        JSDocInfo info = new JSDocInfo();
        keyNode.setJSDocInfo(info);

        Node objLit = IR.objectlit(keyNode);
        Node root = IR.script(objLit);

        PrepareAst prepareAst = new PrepareAst(compiler, false);
        prepareAst.process(null, root);

        assertEquals("Value should inherit JSDoc from key", info, funcNode.getJSDocInfo());
    }
}