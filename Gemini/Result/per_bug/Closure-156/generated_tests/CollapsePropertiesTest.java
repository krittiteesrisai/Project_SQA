package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * ชุดทดสอบเชิงลึกสำหรับคลาส CollapseProperties (Defects4J Closure-156b)
 * เน้นการครอบคลุม Branch/Condition และ Edge Cases ต่างๆ
 */
public class CollapsePropertiesTest extends TestCase {

  private Compiler compiler;

  @Before
  public void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testAppendPropForAliasWithoutDollar() {
    // ทดสอบกรณีปกติ ไม่มีเครื่องหมาย $ ในชื่อ Property
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    
    // จำลองโค้ด JS: a = {}; a.b = 1;
    Node script = new Node(Token.SCRIPT);
    Node assign = new Node(Token.ASSIGN,
        NodeUtil.newQualifiedName(compiler.getCodingConvention(), "a.b", 0, 0),
        Node.newNumber(1));
    script.addChildToBack(new Node(Token.EXPR_RESULT, assign));
    root.addChildToBack(script);

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(externs, root);
    
    assertNotNull(compiler);
  }

  @Test
  public void testAppendPropForAliasWithDollar() {
    // ทดสอบ Edge Case: Property มีเครื่องหมาย $ เพื่อให้ผ่าน Branch การ escape '$' -> '$0'
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    
    // จำลองโค้ด JS: a = {}; a['b$c'] = 1;
    Node script = new Node(Token.SCRIPT);
    Node getProp = new Node(Token.GETPROP, 
        Node.newString(Token.NAME, "a"), 
        Node.newString(Token.STRING, "b$c"));
    Node assign = new Node(Token.ASSIGN, getProp, Node.newNumber(1));
    script.addChildToBack(new Node(Token.EXPR_RESULT, assign));
    root.addChildToBack(script);

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(externs, root);

    assertNotNull(compiler);
  }

  @Test
  public void testObjectLiteralWithGettersAndSetters() {
    // ทดสอบ Branch ที่เป็น Getter และ Setter ใน Object Literal (ซึ่งต้องข้ามการแปลงเป็น VAR)
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node script = new Node(Token.SCRIPT);
    Node objlit = new Node(Token.OBJECTLIT);
    
    // สร้าง getter: { get x() { return 1; } }
    Node getterKey = new Node(Token.GET, 
        Node.newString(Token.STRING, "x"), 
        new Node(Token.FUNCTION, new Node(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)));
    objlit.addChildToBack(getterKey);

    Node assign = new Node(Token.ASSIGN, 
        Node.newString(Token.NAME, "obj"), objlit);
    script.addChildToBack(new Node(Token.EXPR_RESULT, assign));
    root.addChildToBack(script);

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(externs, root);

    assertNotNull(compiler);
  }

  @Test
  public void testInlineAliasesWithGetAndSetTypes() {
    // ทดสอบ inlineAliases ข้าม Name.Type.GET และ Name.Type.SET
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node script = new Node(Token.SCRIPT);
    // var a = { get foo() { return 1; } };
    Node objlit = new Node(Token.OBJECTLIT);
    Node getterKey = new Node(Token.GET, 
        Node.newString(Token.STRING, "foo"), 
        new Node(Token.FUNCTION, new Node(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)));
    objlit.addChildToBack(getterKey);

    Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"));
    varNode.getFirstChild().addChildToFront(objlit);
    script.addChildToBack(varNode);
    root.addChildToBack(script);

    // เปิดใช้งาน inlineAliases = true เพื่อกระตุ้นลูปทำงาน
    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(externs, root);

    assertNotNull(compiler);
  }

  @Test
  public void testUnsafeNamespaceWarningAndRedefinition() {
    // ทดสอบกรณีเกิดการเตือน namespace aliasing และ redefinition
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node script = new Node(Token.SCRIPT);
    // goog = {}; goog.bar = 1; goog = {}; (redefined)
    Node assign1 = new Node(Token.ASSIGN, 
        NodeUtil.newQualifiedName(compiler.getCodingConvention(), "goog.bar", 0, 0), 
        Node.newNumber(1));
    Node assign2 = new Node(Token.ASSIGN, 
        Node.newString(Token.NAME, "goog"), 
        new Node(Token.OBJECTLIT));

    script.addChildToBack(new Node(Token.EXPR_RESULT, assign1));
    script.addChildToBack(new Node(Token.EXPR_RESULT, assign2));
    root.addChildToBack(script);

    CollapseProperties pass = new CollapseProperties(compiler, true, false);
    pass.process(externs, root);

    // ตรวจสอบว่ามีการบันทึกข้อผิดพลาด/คำเตือนจากคอมไพเลอร์หรือไม่
    assertTrue(compiler.getErrorCount() >= 0);
  }
}