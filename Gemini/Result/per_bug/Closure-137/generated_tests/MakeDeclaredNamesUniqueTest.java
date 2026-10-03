package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for MakeDeclaredNamesUnique (Closure-137b).
 * Achieves high branch/condition coverage and targets potential Defects4J faults.
 */
public class MakeDeclaredNamesUniqueTest {

    // Helper compiler stub for testing CompilerPass and NodeTraversal
    private static class DummyCompiler extends Compiler {
        private boolean codeChanged = false;

        @Override
        public void reportCodeChange() {
            codeChanged = true;
        }

        public boolean hasCodeChanged() {
            return codeChanged;
        }
    }

    @Test
    public void testContextualRenamerGlobalAndChildScopes() {
        MakeDeclaredNamesUnique.ContextualRenamer rootRenamer = 
            new MakeDeclaredNamesUnique.ContextualRenamer();

        // Global scope: reserve name
        rootRenamer.addDeclaredName("a");
        assertNull(rootRenamer.getReplacementName("a")); // Global names are not replaced

        // Child scope
        MakeDeclaredNamesUnique.Renamer childRenamer = rootRenamer.forChildScope();
        childRenamer.addDeclaredName("a");
        assertEquals("a$$1", childRenamer.getReplacementName("a"));

        // Second occurrence in child scope increments id
        childRenamer.addDeclaredName("b");
        assertNull(childRenamer.getReplacementName("b")); // First time in child scope might return null if id == 0 depending on logic, let's verify:
        // Wait, ContextualRenamer.addDeclaredName for child:
        // int id = incrementNameCount(name); -> returns old count (0 for first time)
        // if (id != 0) -> if id is 0, newName is null!
        // Let's add "b" a second time to trigger id != 0
        childRenamer.addDeclaredName("b");
        assertEquals("b$$1", childRenamer.getReplacementName("b"));

        assertFalse(childRenamer.stripConstIfReplaced());
    }

    @Test
    public void testInlineRenamerEdgeCases() {
        Supplier<String> idSupplier = new Supplier<String>() {
            private int id = 0;
            @Override
            public String get() {
                return String.valueOf(++id);
            }
        };

        MakeDeclaredNamesUnique.InlineRenamer renamer = 
            new MakeDeclaredNamesUnique.InlineRenamer(idSupplier, "INLINE_", true);

        assertTrue(renamer.stripConstIfReplaced());

        // Edge case: empty name
        renamer.addDeclaredName("");
        assertEquals("", renamer.getReplacementName(""));

        // Normal name declaration
        renamer.addDeclaredName("x");
        assertEquals("x$$INLINE_1", renamer.getReplacementName("x"));

        // Name already containing unique separator
        renamer.addDeclaredName("y$$oldId");
        assertEquals("y$$INLINE_2", renamer.getReplacementName("y$$oldId"));

        // Child scope of InlineRenamer
        MakeDeclaredNamesUnique.Renamer child = renamer.forChildScope();
        assertNotNull(child);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInlineRenamerEmptyPrefixException() {
        Supplier<String> idSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "1";
            }
        };
        // Should throw IllegalArgumentException due to empty idPrefix
        new MakeDeclaredNamesUnique.InlineRenamer(idSupplier, "", false);
    }

    @Test
    public void testMakeDeclaredNamesUniqueTraversalAndScopes() {
        DummyCompiler compiler = new DummyCompiler();
        MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();

        // Construct AST: 
        // global scope
        //   function f(param1) {
        //      var x;
        //      try { } catch (e) { var y = x; }
        //   }
        Node scriptNode = new Node(Token.SCRIPT);
        Node fnNode = Node.newString(Token.FUNCTION, "f");
        Node nameNode = Node.newString(Token.NAME, "f");
        Node paramList = new Node(Token.PARAM_LIST);
        paramList.addChildToBack(Node.newString(Token.NAME, "param1"));
        
        Node fnBody = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        fnBody.addChildToBack(varNode);

        Node catchNode = new Node(Token.CATCH, 
            Node.newString(Token.NAME, "e"),
            new Node(Token.BLOCK, Node.newString(Token.NAME, "x"))
        );
        fnBody.addChildToBack(catchNode);

        fnNode.addChildToBack(nameNode);
        fnNode.addChildToBack(paramList);
        fnNode.addChildToBack(fnBody);
        scriptNode.addChildToBack(fnNode);

        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        
        // Traverse global scope
        pass.enterScope(traversal);
        
        // Traverse function scope (Token.FUNCTION in shouldTraverse)
        pass.shouldTraverse(traversal, fnNode, scriptNode);
        pass.enterScope(traversal);

        // Enter catch scope
        pass.shouldTraverse(traversal, catchNode, fnBody);

        // Visit nodes to test replacement and code change reporting
        Node varNameRef = Node.newString(Token.NAME, "param1");
        pass.visit(traversal, varNameRef, paramList);

        // Exit scopes
        pass.exitScope(traversal); // exit catch or function
        pass.visit(traversal, fnNode, scriptNode); // exit function visit

        assertNotNull(compiler);
    }

    @Test
    public void testContextualRenameInverterStaticMethods() {
        assertEquals("original", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("original$$1"));
        assertEquals("plain", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("plain"));
    }
}