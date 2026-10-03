package com.google.javascript.jscomp;

import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * Senior Java Test Automation Engineer - Comprehensive Test Suite for RenamePrototypes (Closure-157b)
 */
public class RenamePrototypesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่าเบื้องต้นให้ Compiler อยู่ในสถานะ NORMALIZED เพื่อผ่าน Preconditions.checkState
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);
  }

  // Helper สำหรับสร้างโครงสร้าง Node เบื้องต้นในการทดสอบ
  private Node createGetPropNode(String receiverName, String propName) {
    Node recv = Node.newString(Token.NAME, receiverName);
    Node prop = Node.newString(Token.STRING, propName);
    return new Node(Token.GETPROP, recv, prop);
  }

  private Node createAssignmentNode(Node target, Node value) {
    return new Node(Token.ASSIGN, target, value);
  }

  public void testPreconditionsNotNormalized() {
    // Edge Case: LifeCycleStage ไม่ใช่ NORMALIZED ต้องโยน IllegalStateException
    compiler.setLifeCycleStage(LifeCycleStage.RAW);
    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    try {
      pass.process(new Node(Token.BLOCK), new Node(Token.BLOCK));
      fail("Expected IllegalStateException due to non-normalized stage");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  public void testExternedPropertiesAreReserved() {
    // Test ProcessExternedProperties และ Reserved Names
    Node externs = createGetPropNode("window", "customExternProp");
    Node root = createGetPropNode("obj", "customExternProp");

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(externs, root);

    // customExternProp ถูกประกาศเป็น extern ดังนั้นจะไม่ถูกเปลี่ยนชื่อ
    VariableMap map = pass.getPropertyMap();
    assertNull(map.lookupNewName("customExternProp"));
  }

  public void testAggressiveRenamingPrototypeProperty() {
    // Test aggressiveRenaming = true กับ Property ประเภท Prototype
    // โครงสร้าง: Foo.prototype.customProp_ = ...
    Node protoGet = createGetPropNode("Foo", "prototype");
    Node getProp = new Node(Token.GETPROP, protoGet, Node.newString(Token.STRING, "customProp_"));
    Node assign = createAssignmentNode(getProp, Node.newNumber(1.0));

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(new Node(Token.BLOCK), assign);

    VariableMap map = pass.getPropertyMap();
    assertNotNull(map.lookupNewName("customProp_"));
  }

  public void testNonAggressiveRenamingHeuristicCases() {
    // Test non-aggressive renaming heuristic:
    // 1. Lowercase only -> ไม่เปลี่ยนชื่อ (ยกเว้นมีเงื่อนไขอื่น)
    // 2. มีตัวอักษรพิมพ์ใหญ่ หรือไม่ใช่ตัวอักษร -> เปลี่ยนชื่อ
    Node protoGet1 = createGetPropNode("Foo", "prototype");
    Node getProp1 = new Node(Token.GETPROP, protoGet1, Node.newString(Token.STRING, "lowercaseprop"));
    Node assign1 = createAssignmentNode(getProp1, Node.newNumber(1.0));

    Node protoGet2 = createGetPropNode("Bar", "prototype");
    Node getProp2 = new Node(Token.GETPROP, protoGet2, Node.newString(Token.STRING, "MixedCaseProp"));
    Node assign2 = createAssignmentNode(getProp2, Node.newNumber(2.0));

    Node root = new Node(Token.BLOCK, assign1, assign2);

    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(new Node(Token.BLOCK), root);

    VariableMap map = pass.getPropertyMap();
    // lowercaseprop ไม่ควรถูกรีนอม (heuristic ป้องกัน built-in)
    assertNull(map.lookupNewName("lowercaseprop"));
    // MixedCaseProp ควรถูกรีนอมเพราะมีตัวพิมพ์ใหญ่
    assertNotNull(map.lookupNewName("MixedCaseProp"));
  }

  public void testObjectLiteralPropertyRenamingRules() {
    // Test canRenameObjLitProperty: โดยปกติ Object Literal จะไม่ถูกรีนอมเว้นแต่เป็น private หรือ aggressive (ถ้ามี)
    Node objLit = new Node(Token.OBJECTLIT, 
        Node.newString(Token.STRING, "objLitProp"), Node.newNumber(10));
    
    // จำลองการกำหนดค่า Object Literal ปกติ
    RenamePrototypes pass = new RenamePrototypes(compiler, false, null, null);
    pass.process(new Node(Token.BLOCK), objLit);

    VariableMap map = pass.getPropertyMap();
    // Object Literal ธรรมดาจะไม่ถูกรีนอมโดยค่าเริ่มต้น
    assertNull(map.lookupNewName("objLitProp"));
  }

  public void testPrototypeWithObjectLiteralAssignment() {
    // Test processPrototypeParent สำหรับกรณี Foo.prototype = { "propKey": 1 }
    Node protoGet = createGetPropNode("Foo", "prototype");
    Node objLit = new Node(Token.OBJECTLIT, 
        Node.newString(Token.STRING, "protoObjProp_"), Node.newNumber(5));
    Node assign = createAssignmentNode(protoGet, objLit);

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(new Node(Token.BLOCK), assign);

    VariableMap map = pass.getPropertyMap();
    assertNotNull(map.lookupNewName("protoObjProp_"));
  }

  public void testReusePreviousRenameMap() {
    // Test การใช้ prevUsedRenameMap เพื่อดึงชื่อเดิมกลับมาใช้
    Map<String, String> prevMapData = new HashMap<String, String>();
    prevMapData.put("oldPropName", "reusedName");
    VariableMap prevVarMap = new VariableMap(prevMapData);

    Node protoGet = createGetPropNode("Foo", "prototype");
    Node getProp = new Node(Token.GETPROP, protoGet, Node.newString(Token.STRING, "oldPropName"));
    Node assign = createAssignmentNode(getProp, Node.newNumber(1.0));

    // ส่ง reservedCharacters และ prevUsedRenameMap เข้าไป
    char[] reservedChars = new char[] { 'x' };
    RenamePrototypes pass = new RenamePrototypes(compiler, true, reservedChars, prevVarMap);
    pass.process(new Node(Token.BLOCK), assign);

    VariableMap map = pass.getPropertyMap();
    assertEquals("reusedName", map.lookupNewName("oldPropName"));
  }

  public void testReservedCharactersConstraint() {
    // Test การจำกัดตัวอักษรที่ห้ามใช้ในชื่อใหม่ (reservedCharacters)
    Node protoGet1 = createGetPropNode("Foo", "prototype");
    Node getProp1 = new Node(Token.GETPROP, protoGet1, Node.newString(Token.STRING, "PropA_"));
    Node assign1 = createAssignmentNode(getProp1, Node.newNumber(1.0));

    char[] reservedChars = new char[] { 'a', 'b', 'c' };
    RenamePrototypes pass = new RenamePrototypes(compiler, true, reservedChars, null);
    pass.process(new Node(Token.BLOCK), assign1);

    VariableMap map = pass.getPropertyMap();
    String newName = map.lookupNewName("PropA_");
    assertNotNull(newName);
    // ตรวจสอบว่าชื่อใหม่ไม่มีตัวอักษรที่อยู่ใน reservedChars ('a', 'b', 'c')
    for (char c : reservedChars) {
      assertFalse(newName.indexOf(c) >= 0);
    }
  }

  public void testNumberKeyInObjectLiteralIgnored() {
    // Edge Case: คีย์ใน Object Literal เป็นตัวเลข (Token.NUMBER) ต้องถูกข้าม ไม่นำมานับเป็น Property
    Node objLit = new Node(Token.OBJECTLIT, 
        Node.newNumber(123), Node.newNumber(456));

    RenamePrototypes pass = new RenamePrototypes(compiler, true, null, null);
    pass.process(new Node(Token.BLOCK), objLit);

    VariableMap map = pass.getPropertyMap();
    assertTrue(map.toMap().isEmpty());
  }
}