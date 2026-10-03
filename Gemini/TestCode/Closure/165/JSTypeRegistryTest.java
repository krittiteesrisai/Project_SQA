package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class JSTypeRegistryTest {

    private ErrorReporter dummyReporter;
    private JSTypeRegistry registry;

    @Before
    public void setUp() {
        dummyReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(dummyReporter, true);
    }

    @Test
    public void testConstructorsAndGetters() {
        JSTypeRegistry reg1 = new JSTypeRegistry(dummyReporter);
        assertFalse(reg1.shouldTolerateUndefinedValues());
        assertEquals(dummyReporter, reg1.getErrorReporter());
        assertEquals(JSTypeRegistry.ResolveMode.LAZY_NAMES, reg1.getResolveMode());

        reg1.setResolveMode(JSTypeRegistry.ResolveMode.IMMEDIATE);
        assertEquals(JSTypeRegistry.ResolveMode.IMMEDIATE, reg1.getResolveMode());

        JSTypeRegistry reg2 = new JSTypeRegistry(dummyReporter, true);
        assertTrue(reg2.shouldTolerateUndefinedValues());
    }

    @Test
    public void testPropertyRegistrationAndQueries() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        NamedType namedType = (NamedType) registry.createNamedType("MyCustomType", "test.js", 1, 0);
        JSType unionType = registry.createUnionType(numType, objType);

        registry.registerPropertyOnType("propA", numType);
        registry.registerPropertyOnType("propA", objType);
        registry.registerPropertyOnType("propA", namedType);
        registry.registerPropertyOnType("propA", unionType);

        assertTrue(registry.canPropertyBeDefined(objType, "propA"));
        assertFalse(registry.canPropertyBeDefined(objType, "nonExistentProp"));

        assertNotNull(registry.getGreatestSubtypeWithProperty(objType, "propA"));
        // Test cache hit branch in getGreatestSubtypeWithProperty
        assertNotNull(registry.getGreatestSubtypeWithProperty(objType, "propA"));
        assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), registry.getGreatestSubtypeWithProperty(objType, "nonExistentProp"));

        assertNotNull(registry.getTypesWithProperty("propA"));
        assertEquals(0, ((List<?>) registry.getTypesWithProperty("nonExistentProp")).size());

        assertNotNull(registry.getEachReferenceTypeWithProperty("propA"));
        assertEquals(0, ((List<?>) registry.getEachReferenceTypeWithProperty("nonExistentProp")).size());

        registry.unregisterPropertyOnType("propA", objType);
    }

    @Test
    public void testTemplateTypeName() {
        assertNull(registry.getType("TemplateTest"));
        registry.setTemplateTypeName("TemplateTest");
        assertNotNull(registry.getType("TemplateTest"));
        registry.clearTemplateTypeName();
        assertNull(registry.getType("TemplateTest"));
    }

    @Test
    public void testNamespaceAndForwardDeclaration() {
        assertFalse(registry.hasNamespace("a.b.c"));
        registry.declareType("a.b.c.MyType", registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(registry.hasNamespace("a.b"));
        assertTrue(registry.hasNamespace("a"));

        assertFalse(registry.isForwardDeclaredType("ForwardType"));
        registry.forwardDeclareType("ForwardType");
        assertTrue(registry.isForwardDeclaredType("ForwardType"));
    }

    @Test
    public void testDeclareAndOverwriteType() {
        JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType str = registry.getNativeType(JSTypeNative.STRING_TYPE);

        assertTrue(registry.declareType("CustomNum", num));
        assertFalse(registry.declareType("CustomNum", str));

        registry.overwriteDeclaredType("CustomNum", str);
        assertEquals(str, registry.getType("CustomNum"));
    }

    @Test
    public void testFindCommonSuperObject() {
        ObjectType obj1 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ObjectType obj2 = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ObjectType common = registry.findCommonSuperObject(obj1, obj2);
        assertNotNull(common);
    }

    @Test
    public void testScopeAndNamedTypesResolution() {
        StaticScope<JSType> scopeWithNoParent = new StaticScope<JSType>() {
            @Override
            public StaticSymbolTable<JSType, ? extends StaticSlot<JSType>> getSymbolTable() { return null; }
            @Override
            public String getRootName() { return "global"; }
            @Override
            public StaticScope<JSType> getParentScope() { return null; }
            @Override
            public JSType getTypeAtOffset(int offset) { return null; }
            @Override
            public StaticSlot<JSType> getSlot(String name) { return null; }
            @Override
            public StaticSlot<JSType> ownSlot(String name) { return null; }
        };

        JSType lookedUp = registry.getType(scopeWithNoParent, "UnresolvedName", "test.js", 10, 5);
        assertNotNull(lookedUp);

        registry.incrementGeneration();
        registry.resolveTypesInScope(scopeWithNoParent);
        registry.clearNamedTypes();
    }

    @Test
    public void testCreateSpecialTypes() {
        JSType unknown = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType all = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType num = registry.getNativeType(JSTypeNative.NUMBER_TYPE);

        assertEquals(unknown, registry.createOptionalType(unknown));
        assertEquals(all, registry.createOptionalType(all));
        assertNotNull(registry.createOptionalType(num));

        registry.identifyNonNullableName("NonNullableObj");
        assertNotNull(registry.createDefaultObjectUnion(num));

        JSTypeRegistry strictRegistry = new JSTypeRegistry(dummyReporter, false);
        assertNotNull(strictRegistry.createDefaultObjectUnion(num));

        assertNotNull(registry.createNullableType(num));
        assertNotNull(registry.createOptionalNullableType(num));
        assertNotNull(registry.createUnionType(JSTypeNative.NUMBER_TYPE, JSTypeNative.STRING_TYPE));
        assertNotNull(registry.createEnumType("MyEnum", new Node(Token.BLOCK), num));
        assertNotNull(registry.createArrowType(new Node(Token.BLOCK), num));
        assertNotNull(registry.createArrowType(new Node(Token.BLOCK)));
        assertNotNull(registry.createFunctionType(num, num));
        assertNotNull(registry.createFunctionTypeWithVarArgs(num, Arrays.asList(num)));
        assertNotNull(registry.createFunctionType(num, Arrays.asList(num)));
        assertNotNull(registry.createFunctionTypeWithVarArgs(num, num));
        assertNotNull(registry.createConstructorType(num, num));
        assertNotNull(registry.createConstructorTypeWithVarArgs(num, num));
        assertNotNull(registry.createFunctionType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), num, Arrays.asList(num)));
        assertNotNull(registry.createFunctionTypeWithVarArgs(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), num, Arrays.asList(num)));
        assertNotNull(registry.createOptionalParameters(num));
        assertNotNull(registry.createFunctionType(num, true, num));
        assertNotNull(registry.createFunctionType(num, false, num));
        assertNotNull(registry.createFunctionTypeWithNewReturnType(registry.createFunctionType(num, num), strTypeHelper()));
        assertNotNull(registry.createFunctionTypeWithNewThisType(registry.createFunctionType(num, num), registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        assertNotNull(registry.createFunctionType(num, (Node) null));
        assertNotNull(registry.createConstructorType(num, true, num));
        assertNotNull(registry.createConstructorType(num, false, num));
        assertNotNull(registry.createObjectType(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        assertNotNull(registry.createObjectType("ObjName", null, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        assertNotNull(registry.createAnonymousObjectType());
        assertTrue(registry.resetImplicitPrototype(registry.getNativeType(JSTypeNative.OBJECT_TYPE), registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        assertFalse(registry.resetImplicitPrototype(num, registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE)));
        assertNotNull(registry.createConstructorType("Ctor", new Node(Token.FUNCTION), new Node(Token.BLOCK), num));
        assertNotNull(registry.createInterfaceType("Interface", new Node(Token.FUNCTION)));
        assertNotNull(registry.createParameterizedType(registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE), num));
        assertNotNull(registry.createNamedType("Named", "src", 1, 1));
    }

    private JSType strTypeHelper() {
        return registry.getNativeType(JSTypeNative.STRING_TYPE);
    }

    @Test
    public void testCreateFromTypeNodesVariousTokens() {
        StaticScope<JSType> scope = null;

        // Token.STAR
        Node starNode = new Node(Token.STAR);
        assertEquals(registry.getNativeType(JSTypeNative.ALL_TYPE), registry.createFromTypeNodes(starNode, "src", scope));

        // Token.LB (Array type)
        Node lbNode = new Node(Token.LB);
        assertEquals(registry.getNativeType(JSTypeNative.ARRAY_TYPE), registry.createFromTypeNodes(lbNode, "src", scope));

        // Token.EMPTY
        Node emptyNode = new Node(Token.EMPTY);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), registry.createFromTypeNodes(emptyNode, "src", scope));

        // Token.VOID
        Node voidNode = new Node(Token.VOID);
        assertEquals(registry.getNativeType(JSTypeNative.VOID_TYPE), registry.createFromTypeNodes(voidNode, "src", scope));

        // Token.QMARK with null child
        Node qmarkNull = new Node(Token.QMARK);
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), registry.createFromTypeNodes(qmarkNull, "src", scope));

        // Token.QMARK with child
        Node qmarkChild = new Node(Token.QMARK, Node.newString(Token.STRING, "Number"));
        assertNotNull(registry.createFromTypeNodes(qmarkChild, "src", scope));

        // Token.BANG
        Node bangNode = new Node(Token.BANG, Node.newString(Token.STRING, "Object"));
        assertNotNull(registry.createFromTypeNodes(bangNode, "src", scope));

        // Token.EQUALS
        Node equalsNode = new Node(Token.EQUALS, Node.newString(Token.STRING, "Number"));
        assertNotNull(registry.createFromTypeNodes(equalsNode, "src", scope));

        // Token.ELLIPSIS
        Node ellipsisNode = new Node(Token.ELLIPSIS, Node.newString(Token.STRING, "Number"));
        assertNotNull(registry.createFromTypeNodes(ellipsisNode, "src", scope));

        // Token.PIPE
        Node pipeNode = new Node(Token.PIPE, Node.newString(Token.STRING, "Number"), Node.newString(Token.STRING, "String"));
        assertNotNull(registry.createFromTypeNodes(pipeNode, "src", scope));

        // Token.LC (Record type)
        Node field1 = Node.newString(Token.STRING, "a");
        field1.addChildToBack(Node.newString(Token.STRING, "Number"));
        Node recordNode = new Node(Token.LC, field1);
        assertNotNull(registry.createFromTypeNodes(recordNode, "src", scope));

        // Token.STRING with Parameterized/Indexed
        Node arrayStr = Node.newString(Token.STRING, "Array");
        Node typeList = new Node(Token.BLOCK);
        typeList.addChildToBack(Node.newString(Token.STRING, "Number"));
        typeList.addChildToBack(Node.newString(Token.STRING, "String"));
        arrayStr.addChildToBack(typeList);
        registry.setResolveMode(JSTypeRegistry.ResolveMode.IMMEDIATE);
        assertNotNull(registry.createFromTypeNodes(arrayStr, "src", scope));
    }

    @Test
    public void testCreateRecordTypeEdgeCases() {
        // Record with quoted field names and duplicate fields
        Node field1 = Node.newString(Token.STRING, "'field1'");
        field1.addChildToBack(Node.newString(Token.STRING, "Number"));
        Node field2 = Node.newString(Token.STRING, "\"field1\""); // Duplicate after unquoting
        field2.addChildToBack(Node.newString(Token.STRING, "String"));
        Node field3 = Node.newString(Token.STRING, "fieldWithoutColon");

        Node recordContent = new Node(Token.BLOCK, field1);
        recordContent.addChildToBack(field2);
        recordContent.addChildToBack(field3);

        Node recordNode = new Node(Token.LC, recordContent);
        assertNotNull(registry.createFromTypeNodes(recordNode, "src", null));
    }

    @Test(expected = IllegalStateException.class)
    public void testCreateFromTypeNodesUnexpectedNode() {
        Node invalidNode = new Node(Token.DEBUGGER);
        registry.createFromTypeNodes(invalidNode, "src", null);
    }
}