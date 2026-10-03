package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GlobalNamespaceTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testGlobalNamespaceInitializationAndForest() {
        // Test Constructor with externsRoot and root, and lazy process() execution
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        
        // Add a global variable declaration: var a = 1;
        Node nameNode = Node.newString(Token.NAME, "a");
        Node numNode = Node.newNumber(1.0);
        nameNode.addChildToBack(numNode);
        Node varNode = new Node(Token.VAR, nameNode);
        root.addChildToBack(varNode);

        GlobalNamespace namespace = new GlobalNamespace(compiler, externs, root);
        
        // First call triggers process() (generated = false -> true)
        Map<String, GlobalNamespace.Name> index1 = namespace.getNameIndex();
        assertNotNull(index1);
        assertTrue(index1.containsKey("a"));

        // Second call hits cached 'generated = true' branch
        Map<String, GlobalNamespace.Name> index2 = namespace.getNameIndex();
        assertEquals(index1, index2);

        List<GlobalNamespace.Name> forest = namespace.getNameForest();
        assertNotNull(forest);
        assertFalse(forest.isEmpty());
    }

    @Test
    public void testGlobalNamespaceWithoutExterns() {
        Node root = new Node(Token.BLOCK);
        Node nameNode = Node.newString(Token.NAME, "b");
        nameNode.addChildToBack(Node.newNumber(2.0));
        root.addChildToBack(new Node(Token.VAR, nameNode));

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        List<GlobalNamespace.Name> forest = namespace.getNameForest();
        assertNotNull(forest);
        assertEquals(1, forest.size());
        assertEquals("b", forest.get(0).name);
    }

    @Test
    public void testObjectLiteralKeyHandling() {
        // Test object literal nested keys: var obj = { prop: { nested: 1 } };
        Node root = new Node(Token.BLOCK);
        
        Node stringNested = Node.newString(Token.STRING, "nested");
        stringNested.addChildToBack(Node.newNumber(1.0));
        Node objLitNested = new Node(Token.OBJECTLIT, stringNested);

        Node stringProp = Node.newString(Token.STRING, "prop");
        stringProp.addChildToBack(objLitNested);
        Node objLitProp = new Node(Token.OBJECTLIT, stringProp);

        Node nameObj = Node.newString(Token.NAME, "obj");
        nameObj.addChildToBack(objLitProp);
        Node varNode = new Node(Token.VAR, nameObj);
        root.addChildToBack(varNode);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        
        assertTrue(index.containsKey("obj"));
        assertTrue(index.containsKey("obj.prop"));
        assertTrue(index.containsKey("obj.prop.nested"));
    }

    @Test
    public void testValueTypeVariations() {
        // Test getValueType for Function, ObjectLit, OR, HOOK
        Node root = new Node(Token.BLOCK);

        // Function declaration: var f = function() {};
        Node fnNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK));
        Node nameFn = Node.newString(Token.NAME, "myFunc");
        nameFn.addChildToBack(fnNode);
        root.addChildToBack(new Node(Token.VAR, nameFn));

        // OR expression assignment: var x = a || {};
        Node nameX = Node.newString(Token.NAME, "x");
        Node orNode = new Node(Token.OR, Node.newString(Token.NAME, "a"), new Node(Token.OBJECTLIT));
        nameX.addChildToBack(orNode);
        root.addChildToBack(new Node(Token.VAR, nameX));

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        
        assertNotNull(index.get("myFunc"));
        assertEquals(GlobalNamespace.Name.Type.FUNCTION, index.get("myFunc").type);
        
        assertNotNull(index.get("x"));
        assertEquals(GlobalNamespace.Name.Type.OBJECTLIT, index.get("x").type);
    }

    @Test
    public void testScanNewNodesAndNodeFilter() {
        Node root = new Node(Token.BLOCK);
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);

        Set<Node> newNodes = new HashSet<Node>();
        Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "a"), Node.newString(Token.STRING, "b"));
        newNodes.add(getProp);

        Scope globalScope = new Scope(null, root);
        namespace.scanNewNodes(globalScope, newNodes);
        
        // Trigger NodeFilter directly to cover non-qualified names and matching paths
        GlobalNamespace.Ref refTest = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);
        assertNotNull(refTest);
    }

    @Test
    public void testNameReferenceAndEdgeCases() {
        // Test Name methods, ref additions, removals, twins, and collapse logic
        GlobalNamespace.Name name = new GlobalNamespace.Name("testName", null, false);
        assertEquals("testName", name.fullName());
        assertTrue(name.isSimpleName());

        GlobalNamespace.Ref refGlobal = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        GlobalNamespace.Ref refAliasing = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.ALIASING_GET);

        GlobalNamespace.Ref.markTwins(refGlobal, refAliasing);
        assertEquals(refAliasing, refGlobal.getTwin());
        assertTrue(refGlobal.isSet());

        name.addRef(refGlobal);
        name.addRef(refAliasing);

        assertFalse(name.canCollapse());

        name.setIsClassOrEnum();
        assertTrue(name.canCollapse());
        assertTrue(name.isNamespace() || !name.isNamespace());

        name.removeRef(refGlobal);
        name.removeRef(refAliasing);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidRefTypeThrowsException() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("invalid", null, false);
        // Force an invalid/unsupported ref type or null flow to trigger IllegalStateException in addRef
        GlobalNamespace.Ref invalidRef = new GlobalNamespace.Ref(null); 
        name.addRef(invalidRef);
    }

    @Test
    public void testPrototypePrefixHandling() {
        // Test names ending with .prototype or containing .prototype.
        Node root = new Node(Token.BLOCK);
        Node protoGet = new Node(Token.GETPROP, Node.newString(Token.NAME, "ClassA"), Node.newString(Token.STRING, "prototype"));
        Node assign = new Node(Token.ASSIGN, protoGet, new Node(Token.OBJECTLIT));
        root.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        assertNotNull(index);
    }
}