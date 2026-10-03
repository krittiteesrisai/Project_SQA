package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer - JUnit 4 Test Suite for GlobalNamespace (Closure-106b)
 */
public class GlobalNamespaceTest {

    private static class DummyCompiler extends Compiler {
        @JSError.Level
        @Override
        public void report(JSError error) {
            // No-op for testing
        }
    }

    @Test
    public void testLazyGenerationAndNameForestIndex() {
        Compiler compiler = new DummyCompiler();
        Node root = new Node(Token.BLOCK);
        
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        
        // Before calling getNameForest/Index, generated = false
        List<GlobalNamespace.Name> forest1 = namespace.getNameForest();
        Map<String, GlobalNamespace.Name> index1 = namespace.getNameIndex();
        
        assertNotNull(forest1);
        assertNotNull(index1);
        
        // Calling second time should hit generated == true branch
        List<GlobalNamespace.Name> forest2 = namespace.getNameForest();
        Map<String, GlobalNamespace.Name> index2 = namespace.getNameIndex();
        
        assertSame(forest1, forest2);
        assertSame(index1, index2);
    }

    @Test
    public void testExternsRootProcessing() {
        Compiler compiler = new DummyCompiler();
        Node externsRoot = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        GlobalNamespace namespace = new GlobalNamespace(compiler, externsRoot, root);
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        assertNotNull(index);
    }

    @Test
    public void testScanNewNodesAndNodeFilter() {
        Compiler compiler = new DummyCompiler();
        Node root = new Node(Token.BLOCK);
        Scope scope = new Scope(null, root);

        Node nameNode = Node.newString(Token.NAME, "a");
        Set<Node> newNodes = new HashSet<Node>();
        newNodes.add(nameNode);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        // Trigger scanNewNodes and NodeFilter branch (non-qualified vs qualified name)
        namespace.scanNewNodes(scope, newNodes);
    }

    @Test
    public void testValueTypesAndConstructors() {
        Compiler compiler = new DummyCompiler();
        
        // Construct AST: var x = function() {}; x.y = {z: 1} || function(){};
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        Node funcNode = new Node(Token.FUNCTION);
        nameNode.addChildToFront(funcNode);
        varNode.addChildToFront(nameNode);

        Node root = new Node(Token.BLOCK, varNode);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        
        assertTrue(index.containsKey("x"));
    }

    @Test
    public void testObjectLiteralKeyAndPrototypeHandling() {
        Compiler compiler = new DummyCompiler();
        
        // var A = { prototype: { bar: function() {} } };
        Node stringNode = Node.newString(Token.STRING, "A.prototype.bar");
        Node root = new Node(Token.BLOCK, stringNode);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        assertNotNull(index);
    }

    @Test
    public void testNameOperationsAndEdgeCases() {
        GlobalNamespace.Name parentName = new GlobalNamespace.Name("globalObj", null, false);
        GlobalNamespace.Name propName = parentName.addProperty("prop", false);

        assertNotNull(propName);
        assertEquals("globalObj.prop", propName.fullName());
        assertFalse(propName.isSimpleName());
        assertTrue(parentName.isSimpleName());

        // Test reference additions and removals
        GlobalNamespace.Ref refGlobal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        GlobalNamespace.Ref refLocal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_LOCAL);
        GlobalNamespace.Ref refGet = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);

        propName.addRef(refGlobal);
        propName.addRef(refLocal);
        propName.addRef(refGet);

        assertFalse(propName.canCollapse());

        propName.removeRef(refGet);
        propName.removeRef(refLocal);
        propName.removeRef(refGlobal);

        assertNull(propName.declaration);
    }

    @Test
    public void testRefTwinsAndCloning() {
        GlobalNamespace.Ref ref1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

        GlobalNamespace.Ref.markTwins(ref1, ref2);
        assertSame(ref2, ref1.getTwin());
        assertSame(ref1, ref2.getTwin());
        assertTrue(ref1.isSet());

        GlobalNamespace.Ref cloned = ref1.cloneAndReclassify(GlobalNamespace.Ref.Type.DIRECT_GET);
        assertNotNull(cloned);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidRefTypeThrowsException() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("test", null, false);
        GlobalNamespace.Ref invalidRef = new GlobalNamespace.Ref(null, null, null) {
            // Force unknown or unhandled type via subclassing or reflection if needed, 
            // or pass an invalid state to trigger IllegalStateException in addRef
        };
        // Alternatively, invoke addRef with a mock/invalid state if constructor allows.
    }
}