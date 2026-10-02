package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

/**
 * Unit tests for {@link ClosureCodingConvention}.
 *
 * หมายเหตุ: บาง method (applySubclassRelationship, applySingletonGetter) ไม่ได้ทดสอบ
 * เพราะต้องใช้ JSTypeRegistry/FunctionType/ObjectType ที่ไม่มีรายละเอียดใน source ที่ให้มา
 * การสร้าง instance เหล่านี้จะต้อง "เดา" constructor ซึ่งขัดกับข้อกำหนด
 */
public class ClosureCodingConventionTest {

  private ClosureCodingConvention convention;

  @Before
  public void setUp() {
    convention = new ClosureCodingConvention();
  }

  // ---------------------------------------------------------------------
  // Node-building helpers
  // ---------------------------------------------------------------------

  private Node name(String s) {
    return Node.newString(Token.NAME, s);
  }

  private Node string(String s) {
    return Node.newString(Token.STRING, s);
  }

  private Node number(double d) {
    return Node.newNumber(d);
  }

  private Node getprop(Node base, String prop) {
    return new Node(Token.GETPROP, base, Node.newString(Token.STRING, prop));
  }

  /** Builds a NAME/GETPROP chain, e.g. qname("a.b.c") -> a.b.c */
  private Node qname(String dotted) {
    String[] parts = dotted.split("\\.");
    Node n = name(parts[0]);
    for (int i = 1; i < parts.length; i++) {
      n = getprop(n, parts[i]);
    }
    return n;
  }

  private Node call(Node callee, Node... args) {
    Node n = new Node(Token.CALL, callee);
    for (Node a : args) {
      n.addChildToBack(a);
    }
    return n;
  }

  private Node arrayLit(Node... elems) {
    Node n = new Node(Token.ARRAYLIT);
    for (Node e : elems) {
      n.addChildToBack(e);
    }
    return n;
  }

  private Node exprResult(Node child) {
    return new Node(Token.EXPR_RESULT, child);
  }

  // ---------------------------------------------------------------------
  // isSuperClassReference
  // ---------------------------------------------------------------------

  @Test
  public void testIsSuperClassReference_True() {
    assertTrue(convention.isSuperClassReference("superClass_"));
  }

  @Test
  public void testIsSuperClassReference_False() {
    assertFalse(convention.isSuperClassReference("foo"));
  }

  // ---------------------------------------------------------------------
  // getClassesDefinedByCall
  // ---------------------------------------------------------------------

  @Test
  public void testGetClassesDefinedByCall_UnrelatedGetProp_ReturnsNull() {
    Node callee = qname("foo.bar"); // not inherits/mixin
    Node callNode = call(callee, qname("X"), qname("Y"));
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_NameWithoutDollar_ReturnsNull() {
    Node callee = name("foobar"); // NAME, no '$' -> methodName stays null
    Node callNode = call(callee, qname("X"), qname("Y"));
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_CalleeNotNameOrGetProp_ReturnsNull() {
    Node callee = number(1); // neither GETPROP nor NAME
    Node callNode = call(callee, qname("X"), qname("Y"));
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_DeprecatedInheritsSuccess() {
    // SubClass.inherits(SuperClass)
    Node callName = getprop(name("SubClass"), "inherits");
    Node superclassArg = name("SuperClass");
    Node callNode = call(callName, superclassArg);

    ClosureCodingConvention.SubclassRelationship result =
        convention.getClassesDefinedByCall(callNode);

    assertNotNull(result);
    assertEquals(ClosureCodingConvention.SubclassType.INHERITS, result.type);
  }

  @Test
  public void testGetClassesDefinedByCall_StandardInheritsSuccess() {
    // goog.inherits(SubClass, SuperClass)
    Node callee = qname("goog.inherits");
    Node callNode = call(callee, name("SubClass"), name("SuperClass"));

    ClosureCodingConvention.SubclassRelationship result =
        convention.getClassesDefinedByCall(callNode);

    assertNotNull(result);
    assertEquals(ClosureCodingConvention.SubclassType.INHERITS, result.type);
  }

  @Test
  public void testGetClassesDefinedByCall_InvalidChildCount_ReturnsNull() {
    // goog$inherits(SubClass)  -- childCount==2 but not GETPROP, and !=3
    Node callee = name("goog$inherits");
    Node callNode = call(callee, name("SubClass"));
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_DeprecatedMixinSuccess() {
    // SubClass.mixin(SuperClass.prototype)
    Node callName = getprop(name("SubClass"), "mixin");
    Node superclassArg = getprop(name("SuperClass"), "prototype");
    Node callNode = call(callName, superclassArg);

    ClosureCodingConvention.SubclassRelationship result =
        convention.getClassesDefinedByCall(callNode);

    assertNotNull(result);
    assertEquals(ClosureCodingConvention.SubclassType.MIXIN, result.type);
  }

  @Test
  public void testGetClassesDefinedByCall_StandardMixinSuccess() {
    // goog.mixin(SubClass.prototype, SuperClass.prototype)
    Node callee = qname("goog.mixin");
    Node subclassArg = getprop(name("SubClass"), "prototype");
    Node superclassArg = getprop(name("SuperClass"), "prototype");
    Node callNode = call(callee, subclassArg, superclassArg);

    ClosureCodingConvention.SubclassRelationship result =
        convention.getClassesDefinedByCall(callNode);

    assertNotNull(result);
    assertEquals(ClosureCodingConvention.SubclassType.MIXIN, result.type);
  }

  @Test
  public void testGetClassesDefinedByCall_MixinSuperclassNotPrototype_ReturnsNull() {
    Node callee = qname("goog.mixin");
    Node subclassArg = getprop(name("SubClass"), "prototype");
    Node superclassArg = name("SuperClass"); // no .prototype
    Node callNode = call(callee, subclassArg, superclassArg);
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_MixinSubclassNotPrototype_ReturnsNull() {
    Node callee = qname("goog.mixin");
    Node subclassArg = name("SubClass"); // no .prototype
    Node superclassArg = getprop(name("SuperClass"), "prototype");
    Node callNode = call(callee, subclassArg, superclassArg);
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_NotUnscopedQualifiedName_ReturnsNull() {
    // goog.inherits(SubClass, 5) -- superclass not a qualified name
    Node callee = qname("goog.inherits");
    Node callNode = call(callee, name("SubClass"), number(5));
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  // ---------------------------------------------------------------------
  // extractClassNameIfProvide / extractClassNameIfRequire
  // ---------------------------------------------------------------------

  @Test
  public void testExtractClassNameIfProvide_Success() {
    Node callee = qname("goog.provide");
    Node arg = string("my.Class");
    Node callNode = call(callee, arg);
    Node parent = exprResult(callNode);

    assertEquals("my.Class", convention.extractClassNameIfProvide(callNode, parent));
  }

  @Test
  public void testExtractClassNameIfRequire_Success() {
    Node callee = qname("goog.require");
    Node arg = string("my.Class");
    Node callNode = call(callee, arg);
    Node parent = exprResult(callNode);

    assertEquals("my.Class", convention.extractClassNameIfRequire(callNode, parent));
  }

  @Test
  public void testExtractClassNameIfProvide_WrongFunctionName_ReturnsNull() {
    Node callee = qname("goog.require"); // wrong name for "provide"
    Node arg = string("my.Class");
    Node callNode = call(callee, arg);
    Node parent = exprResult(callNode);

    assertNull(convention.extractClassNameIfProvide(callNode, parent));
  }

  @Test
  public void testExtractClassNameIfProvide_ParentNotExprCall_ReturnsNull() {
    Node callee = qname("goog.provide");
    Node arg = string("X");
    Node callNode = call(callee, arg);
    Node badParent = new Node(Token.BLOCK); // not EXPR_RESULT with CALL child

    assertNull(convention.extractClassNameIfProvide(callNode, badParent));
  }

  @Test
  public void testExtractClassNameIfProvide_CalleeNotGetProp_ReturnsNull() {
    Node callee = name("provide"); // NAME, not GETPROP
    Node callNode = call(callee, string("X"));
    Node parent = exprResult(callNode);

    assertNull(convention.extractClassNameIfProvide(callNode, parent));
  }

  @Test
  public void testExtractClassNameIfProvide_NoTargetArgument_ReturnsNull() {
    Node callee = qname("goog.provide");
    Node callNode = call(callee); // no argument -> target == null
    Node parent = exprResult(callNode);

    assertNull(convention.extractClassNameIfProvide(callNode, parent));
  }

  @Test
  public void testExtractClassNameIfProvide_MalformedCallNoCallee_ReturnsNull() {
    // malformed input: CALL node without any children at all
    Node callNodeEmpty = new Node(Token.CALL);
    Node parent = exprResult(callNodeEmpty);

    assertNull(convention.extractClassNameIfProvide(callNodeEmpty, parent));
  }

  // ---------------------------------------------------------------------
  // getExportPropertyFunction / getExportSymbolFunction / getAbstractMethodName / getGlobalObject
  // ---------------------------------------------------------------------

  @Test
  public void testGetExportPropertyFunction() {
    assertEquals("goog.exportProperty", convention.getExportPropertyFunction());
  }

  @Test
  public void testGetExportSymbolFunction() {
    assertEquals("goog.exportSymbol", convention.getExportSymbolFunction());
  }

  @Test
  public void testGetAbstractMethodName() {
    assertEquals("goog.abstractMethod", convention.getAbstractMethodName());
  }

  @Test
  public void testGetGlobalObject() {
    assertEquals("goog.global", convention.getGlobalObject());
  }

  // ---------------------------------------------------------------------
  // identifyTypeDeclarationCall
  // ---------------------------------------------------------------------

  @Test
  public void testIdentifyTypeDeclarationCall_WrongName_ReturnsNull() {
    Node callee = qname("goog.other");
    Node n = call(callee, string("path.js"), arrayLit(string("Type1")));
    assertNull(convention.identifyTypeDeclarationCall(n));
  }

  @Test
  public void testIdentifyTypeDeclarationCall_ChildCountTooSmall_ReturnsNull() {
    Node callee = qname("goog.addDependency");
    Node n = call(callee, string("path.js")); // childCount == 2
    assertNull(convention.identifyTypeDeclarationCall(n));
  }

  @Test
  public void testIdentifyTypeDeclarationCall_TypeArrayNotArrayLit_ReturnsNull() {
    Node callee = qname("goog.addDependency");
    Node n = call(callee, string("path.js"), string("notAnArray"));
    assertNull(convention.identifyTypeDeclarationCall(n));
  }

  @Test
  public void testIdentifyTypeDeclarationCall_Success() {
    Node callee = qname("goog.addDependency");
    Node typeArray = arrayLit(string("Type1"), number(5), string("Type2"));
    Node n = call(callee, string("path.js"), typeArray);

    List<String> result = convention.identifyTypeDeclarationCall(n);

    assertNotNull(result);
    assertEquals(2, result.size());
    assertEquals("Type1", result.get(0));
    assertEquals("Type2", result.get(1));
  }

  @Test
  public void testIdentifyTypeDeclarationCall_EmptyArray_ReturnsEmptyList() {
    Node callee = qname("goog.addDependency");
    Node typeArray = arrayLit();
    Node n = call(callee, string("path.js"), typeArray);

    List<String> result = convention.identifyTypeDeclarationCall(n);

    assertNotNull(result);
    assertTrue(result.isEmpty());
  }

  // ---------------------------------------------------------------------
  // getSingletonGetterClassName
  // ---------------------------------------------------------------------

  @Test
  public void testGetSingletonGetterClassName_DotNotation() {
    Node callee = qname("goog.addSingletonGetter");
    Node n = call(callee, name("MyClass"));
    assertEquals("MyClass", convention.getSingletonGetterClassName(n));
  }

  @Test
  public void testGetSingletonGetterClassName_DollarNotation() {
    Node callee = name("goog$addSingletonGetter");
    Node n = call(callee, name("MyClass"));
    assertEquals("MyClass", convention.getSingletonGetterClassName(n));
  }

  @Test
  public void testGetSingletonGetterClassName_WrongChildCount_ReturnsNull() {
    Node callee = qname("goog.addSingletonGetter");
    Node n = call(callee, name("MyClass"), name("Extra"));
    assertNull(convention.getSingletonGetterClassName(n));
  }

  @Test
  public void testGetSingletonGetterClassName_WrongName_ReturnsNull() {
    Node callee = qname("some.other.function");
    Node n = call(callee, name("MyClass"));
    assertNull(convention.getSingletonGetterClassName(n));
  }

  // ---------------------------------------------------------------------
  // isPropertyTestFunction
  // ---------------------------------------------------------------------

  @Test
  public void testIsPropertyTestFunction_True() {
    Node callee = qname("goog.isNull");
    Node callNode = call(callee, name("x"));
    assertTrue(convention.isPropertyTestFunction(callNode));
  }

  @Test
  public void testIsPropertyTestFunction_False() {
    Node callee = qname("goog.notInSet");
    Node callNode = call(callee, name("x"));
    assertFalse(convention.isPropertyTestFunction(callNode));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testIsPropertyTestFunction_NonCallNode_Throws() {
    Node notCall = qname("foo.bar");
    convention.isPropertyTestFunction(notCall);
  }

  // ---------------------------------------------------------------------
  // getObjectLiteralCast
  // ---------------------------------------------------------------------

  @Test(expected = IllegalArgumentException.class)
  public void testGetObjectLiteralCast_NonCallNode_Throws() {
    Node notCall = qname("foo.bar");
    convention.getObjectLiteralCast(null, notCall);
  }

  @Test
  public void testGetObjectLiteralCast_WrongFunctionName_ReturnsNull() {
    Node callee = qname("goog.other.function");
    Node typeNode = qname("myapp.MyType");
    Node objectLit = new Node(Token.OBJECTLIT);
    Node callNode = call(callee, typeNode, objectLit);

    assertNull(convention.getObjectLiteralCast(null, callNode));
  }

  @Test
  public void testGetObjectLiteralCast_WrongChildCount_ReturnsNull() {
    Node callee = qname("goog.reflect.object");
    Node typeNode = qname("myapp.MyType");
    Node callNode = call(callee, typeNode); // childCount == 2, need 3

    assertNull(convention.getObjectLiteralCast(null, callNode));
  }

  @Test
  public void testGetObjectLiteralCast_TypeNodeNotQualifiedName_ReturnsNull() {
    Node callee = qname("goog.reflect.object");
    Node typeNode = number(42); // not a qualified name
    Node objectLit = new Node(Token.OBJECTLIT);
    Node callNode = call(callee, typeNode, objectLit);

    assertNull(convention.getObjectLiteralCast(null, callNode));
  }

  @Test
  public void testGetObjectLiteralCast_Success() {
    Node callee = qname("goog.reflect.object");
    Node typeNode = qname("myapp.MyType");
    Node objectLit = new Node(Token.OBJECTLIT);
    Node callNode = call(callee, typeNode, objectLit);

    ClosureCodingConvention.ObjectLiteralCast result =
        convention.getObjectLiteralCast(null, callNode);

    assertNotNull(result);
    assertEquals("myapp.MyType", result.typeName);
    assertSame(objectLit, result.objectNode);
  }

  @Test
  public void testGetObjectLiteralCast_NotObjectLiteral_ReportsErrorAndReturnsNull() {
    // ASSUMPTION: Compiler/NodeTraversal API (initOptions, AbstractPostOrderCallback,
    // getWarningCount) มีอยู่จริงในเวอร์ชันนี้ เนื่องจาก source ที่ให้มาไม่ได้แสดง class เหล่านี้
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    NodeTraversal t = new NodeTraversal(compiler,
        new NodeTraversal.AbstractPostOrderCallback() {
          @Override
          public void visit(NodeTraversal t, Node n, Node parent) {}
        });

    Node callee = qname("goog.reflect.object");
    Node typeNode = qname("myapp.MyType");
    Node notObjectLit = name("notAnObjectLiteral"); // not OBJECTLIT
    Node callNode = call(callee, typeNode, notObjectLit);

    ClosureCodingConvention.ObjectLiteralCast result =
        convention.getObjectLiteralCast(t, callNode);

    assertNull(result);
    assertEquals(1, compiler.getWarningCount());
  }

  // ---------------------------------------------------------------------
  // isOptionalParameter / isVarArgsParameter / isPrivate
  // ---------------------------------------------------------------------

  @Test
  public void testIsOptionalParameter_AlwaysFalse() {
    assertFalse(convention.isOptionalParameter(name("x")));
  }

  @Test
  public void testIsVarArgsParameter_AlwaysFalse() {
    assertFalse(convention.isVarArgsParameter(name("x")));
  }

  @Test
  public void testIsPrivate_AlwaysFalse() {
    assertFalse(convention.isPrivate("x_"));
    assertFalse(convention.isPrivate(""));
  }

  // ---------------------------------------------------------------------
  // getAssertionFunctions
  // ---------------------------------------------------------------------

  @Test
  public void testGetAssertionFunctions_ReturnsExpectedCount() {
    Collection<ClosureCodingConvention.AssertionFunctionSpec> specs =
        convention.getAssertionFunctions();
    assertNotNull(specs);
    assertEquals(7, specs.size());
  }

  // ---------------------------------------------------------------------
  // describeFunctionBind
  // ---------------------------------------------------------------------

  @Test
  public void testDescribeFunctionBind_NotCallNode_ReturnsNull() {
    // ASSUMPTION: super.describeFunctionBind ก็คืน null สำหรับ non-CALL node เช่นกัน
    Node n = qname("foo.bar");
    assertNull(convention.describeFunctionBind(n));
  }

  @Test
  public void testDescribeFunctionBind_NameIsNull_ReturnsNull() {
    Node callee = number(5); // getQualifiedName() -> null
    Node callNode = call(callee);
    assertNull(convention.describeFunctionBind(callNode));
  }

  @Test
  public void testDescribeFunctionBind_GoogDollarBind_FnNull_ReturnsNull() {
    Node callee = name("goog$bind");
    Node callNode = call(callee); // no args -> fn == null
    assertNull(convention.describeFunctionBind(callNode));
  }

  @Test
  public void testDescribeFunctionBind_GoogDollarBind_OnlyFn() {
    Node callee = name("goog$bind");
    Node fnArg = qname("myFn");
    Node callNode = call(callee, fnArg);

    ClosureCodingConvention.Bind result = convention.describeFunctionBind(callNode);

    assertNotNull(result);
    assertSame(fnArg, result.fn);
    assertNull(result.thisValue);
    assertNull(result.parameters);
  }

  @Test
  public void testDescribeFunctionBind_GoogDollarBind_FullArgs() {
    Node callee = name("goog$bind");
    Node fnArg = qname("myFn");
    Node thisArg = qname("myThis");
    Node paramArg = qname("p1");
    Node callNode = call(callee, fnArg, thisArg, paramArg);

    ClosureCodingConvention.Bind result = convention.describeFunctionBind(callNode);

    assertNotNull(result);
    assertSame(fnArg, result.fn);
    assertSame(thisArg, result.thisValue);
    assertSame(paramArg, result.parameters);
  }

  @Test
  public void testDescribeFunctionBind_GoogPartial_FnNull_ReturnsNull() {
    Node callee = qname("goog.partial");
    Node callNode = call(callee); // no args -> fn == null
    assertNull(convention.describeFunctionBind(callNode));
  }

  @Test
  public void testDescribeFunctionBind_GoogPartial_WithArgs() {
    Node callee = qname("goog.partial");
    Node fnArg = qname("myFn");
    Node paramArg = qname("p1");
    Node callNode = call(callee, fnArg, paramArg);

    ClosureCodingConvention.Bind result = convention.describeFunctionBind(callNode);

    assertNotNull(result);
    assertSame(fnArg, result.fn);
    assertNull(result.thisValue);
    assertSame(paramArg, result.parameters);
  }

  @Test
  public void testDescribeFunctionBind_GoogDollarPartial() {
    Node callee = name("goog$partial");
    Node fnArg = qname("myFn");
    Node callNode = call(callee, fnArg);

    ClosureCodingConvention.Bind result = convention.describeFunctionBind(callNode);

    assertNotNull(result);
    assertSame(fnArg, result.fn);
    assertNull(result.thisValue);
    assertNull(result.parameters);
  }

  @Test
  public void testDescribeFunctionBind_NoMatchingName_ReturnsNull() {
    Node callee = qname("foo.bar");
    Node callNode = call(callee, name("x"));
    assertNull(convention.describeFunctionBind(callNode));
  }
}
