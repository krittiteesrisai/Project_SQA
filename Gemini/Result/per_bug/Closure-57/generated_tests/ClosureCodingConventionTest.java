package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class ClosureCodingConventionTest {

  private ClosureCodingConvention convention;

  @Before
  public void setUp() {
    convention = new ClosureCodingConvention();
  }

  // --- Tests for getClassesDefinedByCall & typeofClassDefiningName ---

  @Test
  public void testGetClassesDefinedByCall_NullType() {
    Node callName = new Node(Token.NAME, "unknownFunc");
    Node callNode = new Node(Token.CALL, callName);
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_DeprecatedInherits() {
    // SubClass.inherits(SuperClass) -> child count = 2, GETPROP
    Node subClass = Node.newString(Token.NAME, "Sub");
    Node superMethod = new Node(Token.GETPROP, subClass, Node.newString(Token.STRING, "inherits"));
    Node superClass = Node.newString(Token.NAME, "Super");
    
    Node callNode = new Node(Token.CALL, superMethod, superClass);
    
    SubclassRelationship rel = convention.getClassesDefinedByCall(callNode);
    assertNotNull(rel);
    assertEquals(SubclassType.INHERITS, rel.type);
    assertEquals(subClass, rel.subclass);
    assertEquals(superClass, rel.superclass);
  }

  @Test
  public void testGetClassesDefinedByCall_StandardInherits() {
    // goog.inherits(SubClass, SuperClass) -> child count = 3
    Node callName = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "inherits"));
    Node subClass = Node.newString(Token.NAME, "Sub");
    Node superClass = Node.newString(Token.NAME, "Super");
    
    Node callNode = new Node(Token.CALL, callName, subClass, superClass);
    
    SubclassRelationship rel = convention.getClassesDefinedByCall(callNode);
    assertNotNull(rel);
    assertEquals(SubclassType.INHERITS, rel.type);
    assertEquals(subClass, rel.subclass);
    assertEquals(superclass, rel.superclass);
  }

  @Test
  public void testGetClassesDefinedByCall_InvalidChildCount() {
    // goog.inherits() with 1 child only
    Node callName = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "inherits"));
    Node callNode = new Node(Token.CALL, callName);
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_MixinValid() {
    // goog.mixin(Sub.prototype, Super.prototype)
    Node callName = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "mixin"));
    Node subProto = new Node(Token.GETPROP, Node.newString(Token.NAME, "Sub"), Node.newString(Token.STRING, "prototype"));
    Node superProto = new Node(Token.GETPROP, Node.newString(Token.NAME, "Super"), Node.newString(Token.STRING, "prototype"));
    
    Node callNode = new Node(Token.CALL, callName, subProto, superProto);
    
    SubclassRelationship rel = convention.getClassesDefinedByCall(callNode);
    assertNotNull(rel);
    assertEquals(SubclassType.MIXIN, rel.type);
  }

  @Test
  public void testGetClassesDefinedByCall_MixinSuperNotPrototype() {
    // goog.mixin(Sub.prototype, Super) -> super does not end with prototype
    Node callName = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "mixin"));
    Node subProto = new Node(Token.GETPROP, Node.newString(Token.NAME, "Sub"), Node.newString(Token.STRING, "prototype"));
    Node superClass = Node.newString(Token.NAME, "Super");
    
    Node callNode = new Node(Token.CALL, callName, subProto, superClass);
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_MixinSubNotPrototypeNonDeprecated() {
    // goog.mixin(Sub, Super.prototype) -> sub does not end with prototype
    Node callName = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "mixin"));
    Node subClass = Node.newString(Token.NAME, "Sub");
    Node superProto = new Node(Token.GETPROP, Node.newString(Token.NAME, "Super"), Node.newString(Token.STRING, "prototype"));
    
    Node callNode = new Node(Token.CALL, callName, subClass, superProto);
    assertNull(convention.getClassesDefinedByCall(callNode));
  }

  @Test
  public void testGetClassesDefinedByCall_DollarMethodNameTokenName() {
    // goog$inherits(Sub, Super)
    Node callName = new Node(Token.NAME, "goog$inherits");
    Node subClass = Node.newString(Token.NAME, "Sub");
    Node superClass = Node.newString(Token.NAME, "Super");
    
    Node callNode = new Node(Token.CALL, callName, subClass, superClass);
    SubclassRelationship rel = convention.getClassesDefinedByCall(callNode);
    assertNotNull(rel);
    assertEquals(SubclassType.INHERITS, rel.type);
  }

  // --- Tests for extractClassNameIfProvide & Require ---

  @Test
  public void testExtractClassNameIfProvide() {
    Node callee = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "provide"));
    Node arg = Node.newString(Token.STRING, "my.class");
    Node exprResult = new Node(Token.EXPR_RESULT, new Node(Token.CALL, callee, arg));
    Node node = exprResult.getFirstChild().getFirstChild(); // callee

    String className = convention.extractClassNameIfProvide(node, exprResult);
    assertEquals("my.class", className);
  }

  @Test
  public void testExtractClassNameIfRequire() {
    Node callee = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "require"));
    Node arg = Node.newString(Token.STRING, "my.dependency");
    Node exprResult = new Node(Token.EXPR_RESULT, new Node(Token.CALL, callee, arg));
    Node node = exprResult.getFirstChild().getFirstChild();

    String className = convention.extractClassNameIfRequire(node, exprResult);
    assertEquals("my.dependency", className);
  }

  @Test
  public void testExtractClassNameIfGoog_InvalidParentOrCallee() {
    Node node = Node.newString(Token.NAME, "goog");
    Node parent = new Node(Token.BLOCK); // Not ExprCall
    assertNull(convention.extractClassNameIfProvide(node, parent));
  }

  // --- Tests for identifyTypeDeclarationCall ---

  @Test
  public void testIdentifyTypeDeclarationCall_Valid() {
    Node callee = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "addDependency"));
    Node arg1 = Node.newString(Token.STRING, "path.js");
    Node arg2 = Node.newString(Token.STRING, "provides");
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newString(Token.STRING, "TypeA"), Node.newString(Token.STRING, "TypeB"));
    
    Node callNode = new Node(Token.CALL, callee, arg1, arg2, arrayLit);
    
    List<String> types = convention.identifyTypeDeclarationCall(callNode);
    assertNotNull(types);
    assertEquals(2, types.size());
    assertTrue(types.contains("TypeA"));
    assertTrue(types.contains("TypeB"));
  }

  @Test
  public void testIdentifyTypeDeclarationCall_InvalidNameOrCount() {
    Node callee = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "wrongMethod"));
    Node callNode = new Node(Token.CALL, callee, Node.newString(Token.STRING, "a"), Node.newString(Token.STRING, "b"), new Node(Token.ARRAYLIT));
    assertNull(convention.identifyTypeDeclarationCall(callNode));
  }

  // --- Tests for getSingletonGetterClassName ---

  @Test
  public void testGetSingletonGetterClassName_ValidStandard() {
    Node callArg = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "addSingletonGetter"));
    Node classNameNode = Node.newString(Token.NAME, "MyClass");
    Node callNode = new Node(Token.CALL, callArg, classNameNode);

    assertEquals("MyClass", convention.getSingletonGetterClassName(callNode));
  }

  @Test
  public void testGetSingletonGetterClassName_ValidDollar() {
    Node callArg = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "addSingletonGetter"));
    // Override qualified name or use appropriate node structure
    Node callNode = new Node(Token.CALL, callArg, Node.newString(Token.NAME, "MyClass"), Node.newString(Token.STRING, "extra"));
    // Child count != 2 should return null
    assertNull(convention.getSingletonGetterClassName(callNode));
  }

  // --- Tests for isPropertyTestFunction & getAssertionFunctions ---

  @Test
  public void testIsPropertyTestFunction() {
    Node callName = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "isString"));
    Node callNode = new Node(Token.CALL, callName);
    assertTrue(convention.isPropertyTestFunction(callNode));
  }

  @Test
  public void testGetAssertionFunctions() {
    Collection<AssertionFunctionSpec> assertions = convention.getAssertionFunctions();
    assertNotNull(assertions);
    assertFalse(assertions.isEmpty());
  }

  @Test
  public void testMiscConventionProperties() {
    assertTrue(convention.isSuperClassReference("superClass_"));
    assertFalse(convention.isSuperClassReference("other"));
    assertEquals("goog.exportProperty", convention.getExportPropertyFunction());
    assertEquals("goog.exportSymbol", convention.getExportSymbolFunction());
    assertEquals("goog.abstractMethod", convention.getAbstractMethodName());
    assertEquals("goog.global", convention.getGlobalObject());
    assertFalse(convention.isOptionalParameter(null));
    assertFalse(convention.isVarArgsParameter(null));
    assertFalse(convention.isPrivate("any"));
  }

  // --- Tests for describeFunctionBind ---

  @Test
  public void testDescribeFunctionBind_GoogBind() {
    Node callTarget = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "bind"));
    Node fn = Node.newString(Token.NAME, "myFunc");
    Node self = Node.newString(Token.NAME, "selfObj");
    Node arg = Node.newString(Token.STRING, "arg1");
    
    // Structure: CALL -> (GETPROP goog.bind, fn, self, arg)
    Node callNode = new Node(Token.CALL, callTarget, fn, self, arg);

    Bind bind = convention.describeFunctionBind(callNode);
    assertNotNull(bind);
    assertEquals(fn, bind.name);
    assertEquals(self, bind.thisValue);
    assertEquals(arg, bind.parameters);
  }

  @Test
  public void testDescribeFunctionBind_GoogPartial() {
    Node callTarget = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "partial"));
    Node fn = Node.newString(Token.NAME, "myFunc");
    Node arg = Node.newString(Token.STRING, "arg1");
    
    Node callNode = new Node(Token.CALL, callTarget, fn, arg);

    Bind bind = convention.describeFunctionBind(callNode);
    assertNotNull(bind);
    assertEquals(fn, bind.name);
    assertNull(bind.thisValue);
    assertEquals(arg, bind.parameters);
  }

  @Test
  public void testDescribeFunctionBind_NotCallOrUnknown() {
    Node notCall = new Node(Token.NAME, "notACall");
    assertNull(convention.describeFunctionBind(notCall));

    Node callTarget = new Node(Token.GETPROP, Node.newString(Token.NAME, "goog"), Node.newString(Token.STRING, "unknownBind"));
    Node callNode = new Node(Token.CALL, callTarget);
    assertNull(convention.describeFunctionBind(callNode));
  }
}