package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for MakeDeclaredNamesUnique (Closure-49b)
 * Target: High Branch/Condition Coverage and Edge Case Fault Detection.
 */
public class MakeDeclaredNamesUniqueTest {

    // Helper Compiler stub for testing passes
    private static final class TestCompiler extends Compiler {
        @Override
        public void reportCodeChange() {
            // no-op for testing
        }
    }

    @Test
    public void testContextualRenamerGlobalAndChildScopes() {
        MakeDeclaredNamesUnique.ContextualRenamer rootRenamer = 
            new MakeDeclaredNamesUnique.ContextualRenamer();
        
        // Test ARGUMENTS filtering and global reservation
        rootRenamer.addDeclaredName("arguments");
        rootRenamer.addDeclaredName("x");

        assertNull(rootRenamer.getReplacementName("arguments"));
        // Global scope leaves the first declaration unchanged in declarations map
        assertNull(rootRenamer.getReplacementName("x"));

        // Create child scope
        MakeDeclaredNamesUnique.Renamer childRenamer = rootRenamer.forChildScope();
        
        // First local declaration of 'x' gets unique suffix because it shadows/conflicts
        childRenamer.addDeclaredName("x");
        assertEquals("x$$1", childRenamer.getReplacementName("x"));

        // Second local declaration of 'x' increments counter
        childRenamer.addDeclaredName("x");
        // Re-adding same name in same child renamer check
        assertEquals("x$$1", childRenamer.getReplacementName("x"));
    }

    @Test
    public void testInlineRenamerEdgeCases() {
        Supplier<String> idSupplier = new Supplier<String>() {
            private int id = 1;
            @Override
            public String get() {
                return String.valueOf(id++);
            }
        };

        MakeDeclaredNamesUnique.InlineRenamer inlineRenamer = 
            new MakeDeclaredNamesUnique.InlineRenamer(idSupplier, "unique_prefix_", true);

        assertTrue(inlineRenamer.stripConstIfReplaced());

        // Empty name edge case
        inlineRenamer.addDeclaredName("");
        assertEquals("", inlineRenamer.getReplacementName(""));

        // Name containing separator already
        inlineRenamer.addDeclaredName("foo$$0");
        assertEquals("foo$$unique_prefix_1", inlineRenamer.getReplacementName("foo$$0"));

        // Child scope of InlineRenamer
        MakeDeclaredNamesUnique.Renamer child = inlineRenamer.forChildScope();
        child.addDeclaredName("bar");
        assertEquals("bar$$unique_prefix_2", child.getReplacementName("bar"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInlineRenamerEmptyPrefixConstraint() {
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
    public void testBoilerplateRenamerChildScope() {
        Supplier<String> idSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "99";
            }
        };
        MakeDeclaredNamesUnique.BoilerplateRenamer boilerplate = 
            new MakeDeclaredNamesUnique.BoilerplateRenamer(idSupplier, "bp_");
        
        MakeDeclaredNamesUnique.Renamer child = boilerplate.forChildScope();
        assertNotNull(child);
        child.addDeclaredName("testVar");
        assertEquals("testVar$$bp_99", child.getReplacementName("testVar"));
    }

    @Test
    public void testContextualRenameInverterEdgeCases() {
        Compiler compiler = new TestCompiler();
        MakeDeclaredNamesUnique.ContextualRenameInverter inverter = 
            new MakeDeclaredNamesUnique.ContextualRenameInverter(compiler);

        // Test static utility methods
        assertEquals("orig", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("orig$$1"));
        assertEquals("plain", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("plain"));

        // Process empty nodes to test traversal safety
        Node externs = new Node(Token.BLOCK);
        Node js = new Node(Token.BLOCK);
        inverter.process(externs, js);
    }

    @Test
    public void testMakeDeclaredNamesUniqueTraversalFlow() {
        Compiler compiler = new TestCompiler();
        MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();

        // Construct AST: function f(arg1) { var x = 1; try {} catch(e) { var y = 2; } }
        Node funcNode = new Node(Token.FUNCTION, 
            Node.newString(Token.NAME, "f"),
            new Node(Token.LP, Node.newString(Token.NAME, "arg1")),
            new Node(Token.BLOCK,
                Node.newVar(Node.newString(Token.NAME, "x"), Node.newNumber(1)),
                new Node(Token.TRY,
                    new Node(Token.BLOCK),
                    new Node(Token.CATCH,
                        Node.newString(Token.NAME, "e"),
                        new Node(Token.BLOCK,
                            Node.newVar(Node.newString(Token.NAME, "y"), Node.newNumber(2))
                        )
                    ),
                    null
                )
            )
        );

        NodeTraversal traversal = new NodeTraversal(compiler, pass);
        
        // Enter global/root scope simulation
        traversal.traverseAtScopes(funcNode);
        
        // Trigger shouldTraverse and visit methods manually or via traversal
        assertTrue(pass.shouldTraverse(traversal, funcNode, null));
        
        Node catchNode = funcNode.getLastChild().getLastChild().getFirstChild().getNext();
        if (catchNode != null && catchNode.getType() == Token.CATCH) {
            assertTrue(pass.shouldTraverse(traversal, catchNode, funcNode));
            pass.visit(traversal, catchNode, funcNode);
        }

        // Test Token.NAME visit case with replacement
        Node nameNode = Node.newString(Token.NAME, "x");
        pass.visit(traversal, nameNode, funcNode);
    }
}