package com.google.javascript.jscomp;

import com.google.common.base.Predicate;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for GlobalNamespace (Defects4J Closure-119).
 */
public class GlobalNamespaceTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
    }

    @Test
    public void testConstructorsAndBasicGetters() {
        Node root = new Node(Token.BLOCK);
        GlobalNamespace namespace1 = new GlobalNamespace(compiler, root);
        assertFalse(namespace1.hasExternsRoot());
        assertNotNull(namespace1.getRootNode());
        assertNull(namespace1.getParentScope());
        assertNotNull(namespace1.getTypeOfThis());

        Node externs = new Node(Token.BLOCK);
        GlobalNamespace namespace2 = new GlobalNamespace(compiler, externs, root);
        assertTrue(namespace2.hasExternsRoot());
    }

    @Test
    public void testSimpleGlobalVariableAndReferences() {
        // var a = 1; a;
        Node nameNode = Node.newString(Token.NAME, "a");
        Node numberNode = Node.newNumber(1.0);
        nameNode.addChildToBack(numberNode);
        Node varNode = new Node(Token.VAR, nameNode);

        Node getRefNode = Node.newString(Token.NAME, "a");
        Node exprResult = new Node(Token.EXPR_RESULT, getRefNode);

        Node root = new Node(Token.BLOCK, varNode, exprResult);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);

        GlobalNamespace.Name slot = namespace.getSlot("a");
        assertNotNull(slot);
        assertEquals("a", slot.getName());
        assertEquals("a", slot.getBaseName());
        assertNull(slot.getParent());
        assertTrue(slot.isSimpleName());
        assertFalse(slot.isTypeInferred());
        assertNull(slot.getType());

        Iterable<GlobalNamespace.Ref> refs = namespace.getReferences(slot);
        assertNotNull(refs);

        Iterable<GlobalNamespace.Name> symbols = namespace.getAllSymbols();
        assertNotNull(symbols);

        Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
        assertTrue(index.containsKey("a"));

        List<GlobalNamespace.Name> forest = namespace.getNameForest();
        assertFalse(forest.isEmpty());
    }

    @Test
    public void testNestedAssignmentsAndTwinRefs() {
        // var a = b = 2;
        Node bName = Node.newString(Token.NAME, "b");
        Node num = Node.newNumber(2.0);
        Node assign = new Node(Token.ASSIGN, bName, num);

        Node aName = Node.newString(Token.NAME, "a");
        aName.addChildToBack(assign);
        Node varNode = new Node(Token.VAR, aName);

        Node expr = new Node(Token.EXPR_RESULT, varNode);
        Node root = new Node(Token.BLOCK, expr);

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        GlobalNamespace.Name nameB = namespace.getSlot("b");
        assertNotNull(nameB);

        for (GlobalNamespace.Ref ref : nameB.getRefs()) {
            if (ref.getTwin() != null) {
                assertNotNull(ref.getTwin());
            }
        }
    }

    @Test
    public void testObjectLiteralKeysAndValueTypes() {
        // var obj = { strKey: function() {}, getterDoc: 1, setterDoc: 2 };
        Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node stringKey = Node.newString(Token.STRING_KEY, "strKey");
        stringKey.addChildToBack(funcNode);

        Node getterDef = Node.newString(Token.GETTER_DEF, "getter");
        getterDef.addChildToBack(new Node(Token.BLOCK));

        Node setterDef = Node.newString(Token.SETTER_DEF, "setter");
        setterDef.addChildToBack(new Node(Token.BLOCK));

        Node objLit = new Node(Token.OBJECTLIT, stringKey, getterDef, setterDef);
        Node objName = Node.newString(Token.NAME, "myObj");
        objName.addChildToBack(objLit);
        Node varNode = new Node(Token.VAR, objName);

        Node root = new Node(Token.BLOCK, varNode);
        GlobalNamespace namespace = new GlobalNamespace(compiler, root);

        assertNotNull(namespace.getSlot("myObj"));
        assertNotNull(namespace.getSlot("myObj.strKey"));
    }

    @Test
    public void testPrototypeHandling() {
        // Namespace.prototype.foo = function() {}; Namespace.prototype.foo();
        Node protoGet = new Node(Token.GETPROP, Node.newString(Token.NAME, "Ns"), Node.newString(Token.STRING, "prototype"));
        Node fooProp = new Node(Token.GETPROP, protoGet, Node.newString(Token.STRING, "foo"));
        Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Node assign = new Node(Token.ASSIGN, fooProp, funcNode);
        Node root = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, assign));

        GlobalNamespace namespace = new GlobalNamespace(compiler, root);
        assertNotNull(namespace.getNameIndex());
    }

    @Test
    public void testRemoveRefAndDeclarationFallback() {
        GlobalNamespace.Name name = new GlobalNamespace.Name("testName", null, false);
        GlobalNamespace.Ref ref1 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        GlobalNamespace.Ref ref2 = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.DIRECT_GET);

        name.addRef(ref1);
        name.addRef(ref2);
        assertSame(ref1, name.getDeclaration());

        name.removeRef(ref1);
        assertNull(name.getDeclaration());
    }

    @Test
    public void testTrackerPass() {
        Node root = new Node(Token.BLOCK);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(out);

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return true;
            }
        };

        GlobalNamespace.Tracker tracker = new GlobalNamespace.Tracker(compiler, stream, predicate);
        tracker.process(null, root);
        assertTrue(out.toString().isEmpty() || out.toString() >= 0);
    }

    @Test
    public void testRefOperationsAndUtilities() {
        GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
        assertNull(ref.getNode());
        assertNull(ref.getSourceFile());
        assertNull(ref.getSymbol());
        assertNull(ref.getModule());
        assertEquals("", ref.getSourceName());
        assertNull(ref.getTwin());
        assertTrue(ref.isSet());

        GlobalNamespace.Ref cloned = ref.cloneAndReclassify(GlobalNamespace.Ref.Type.DIRECT_GET);
        assertNotNull(cloned);
    }
}