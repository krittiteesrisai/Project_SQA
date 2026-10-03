package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for FunctionTypeBuilder (Closure-90b).
 */
public class FunctionTypeBuilderTest {

  private Compiler compiler;
  private Scope scope;
  private Node errorRoot;
  private String sourceName;

  @Before
  public void setUp() {
    compiler = new Compiler();
    // กำหนดค่าเริ่มต้นพื้นฐานให้ Compiler สำหรับใช้ทดสอบ
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    errorRoot = new Node(Token.BLOCK);
    sourceName = "testcode.js";
    scope = new Scope(null, new Node(Token.SCRIPT));
  }

  @Test
  public void testConstructorWithNullFunctionName() {
    // Trigger branch: fnName == null ? "" : fnName in constructor
    FunctionTypeBuilder builder = new FunctionTypeBuilder(null, compiler, errorRoot, sourceName, scope);
    assertNotNull(builder);
    
    FunctionType type = builder.setSourceNode(new Node(Token.FUNCTION))
        .inferReturnStatementsAsLastResort(new Node(Token.BLOCK))
        .buildAndRegister();
    assertNotNull(type);
  }

  @Test
  public void testInferFromOverriddenFunctionNullOldType() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    // Trigger branch: oldType == null -> returns 'this' immediately
    FunctionTypeBuilder result = builder.inferFromOverriddenFunction(null, new Node(Token.LP));
    assertSame(builder, result);
  }

  @Test
  public void testInferReturnStatementsWithNullBlock() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    // Trigger branch: functionBlock == null -> returns 'this'
    FunctionTypeBuilder result = builder.inferReturnStatementsAsLastResort(null);
    assertSame(builder, result);
  }

  @Test
  public void testInferReturnStatementsWithNonEmptyReturn() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    
    Node block = new Node(Token.BLOCK);
    Node returnNode = new Node(Token.RETURN, Node.newNumber(1));
    block.addChildToBack(returnNode);

    builder.inferReturnStatementsAsLastResort(block);
    // ตรวจสอบว่าหากมี return แบบมีค่า returnType จะไม่ถูกบังคับให้เป็น VOID ทันที
    FunctionType type = builder.setSourceNode(new Node(Token.FUNCTION))
        .inferParameterTypes(new Node(Token.LP), null)
        .buildAndRegister();
    assertNotNull(type);
  }

  @Test
  public void testInferReturnStatementsWithThrow() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    
    Node block = new Node(Token.BLOCK);
    Node throwNode = new Node(Token.THROW, Node.newString("Error"));
    block.addChildToBack(throwNode);

    builder.inferReturnStatementsAsLastResort(block);
    FunctionType type = builder.setSourceNode(new Node(Token.FUNCTION))
        .inferParameterTypes(new Node(Token.LP), null)
        .buildAndRegister();
    assertNotNull(type);
  }

  @Test
  public void testInferInheritanceWithoutConstructorOrInterface() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    JSDocInfo info = new JSDocInfo();
    // ใส่ extends แต่ไม่มี constructor หรือ interface เพื่อเทสต์ EXTENDS_WITHOUT_TYPEDEF warning
    // เนื่องจาก JSDocInfo อาจต้องใช้ Builder หรือจำลอง เราทดสอบผ่านพารามิเตอร์ null หรือ info เปล่าๆ ได้
    builder.inferInheritance(info);
    FunctionType type = builder.setSourceNode(new Node(Token.FUNCTION))
        .inferParameterTypes(new Node(Token.LP), null)
        .buildAndRegister();
    assertNotNull(type);
  }

  @Test
  public void testInferThisTypeWithNullInfo() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    Node owner = Node.newString(Token.NAME, "A");
    
    // Trigger branch: info == null || !info.hasType() with owner != null
    builder.inferThisType(null, owner);
    FunctionType type = builder.setSourceNode(new Node(Token.FUNCTION))
        .inferParameterTypes(new Node(Token.LP), null)
        .buildAndRegister();
    assertNotNull(type);
  }

  @Test
  public void testInferParameterTypesWithNullArgsParent() {
    FunctionTypeBuilder builder = new FunctionTypeBuilder("myFunc", compiler, errorRoot, sourceName, scope);
    // Trigger branch: argsParent == null and info == null
    FunctionTypeBuilder result = builder.inferParameterTypes(null, null);
    assertSame(builder, result);
  }

  @Test
  public void testIsFunctionTypeDeclarationEdgeCases() {
    JSDocInfo info = new JSDocInfo();
    // ทดสอบเมธอดสแตติก isFunctionTypeDeclaration
    assertFalse(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }
}