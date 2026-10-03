package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;
import org.junit.Test;

import java.net.URISyntaxException;

/**
 * JUnit 4 Test Suite for ProcessCommonJSModules (Defects4J Closure-9)
 */
public class ProcessCommonJSModulesTest extends TestCase {

  @Test
  public void testToModuleNameBasic() {
    String moduleName = ProcessCommonJSModules.toModuleName("./a/b/c-d.js");
    assertEquals("module$a$b$c_d", moduleName);
  }

  @Test
  public void testToModuleNameRelativeAddressing() {
    String resolved = ProcessCommonJSModules.toModuleName("./sub/foo.js", "./main.js");
    assertEquals("module$sub$foo", resolved);

    String parentResolved = ProcessCommonJSModules.toModuleName("../foo.js", "./sub/main.js");
    assertEquals("module$foo", parentResolved);
  }

  @Test
  public void testToModuleNameURISyntaxExceptionEdgeCase() {
    // ส่งค่าที่ไม่ถูกต้องเพื่อให้เกิด URISyntaxException และถูกห่อด้วย RuntimeException
    try {
      ProcessCommonJSModules.toModuleName("./file with spaces [invalid].js", "http://[invalid-uri");
      fail("Expected RuntimeException due to URISyntaxException");
    } catch (RuntimeException e) {
      assertNotNull(e.getCause());
      assertTrue(e.getCause() instanceof URISyntaxException);
    }
  }

  @Test
  public void testConstructorPrefixHandling() {
    Compiler compiler = new Compiler();
    
    // Prefix ไม่ลงท้ายด้วย /
    ProcessCommonJSModules pass1 = new ProcessCommonJSModules(compiler, "prefix", false);
    assertNotNull(pass1);

    // Prefix ลงท้ายด้วย / อยู่แล้ว
    ProcessCommonJSModules pass2 = new ProcessCommonJSModules(compiler, "prefix/", true);
    assertNotNull(pass2);
  }

  @Test
  public void testNormalizeSourceNameWithAndWithoutPrefix() {
    Compiler compiler = new Compiler();
    ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, "my-prefix/");
    
    // ทดสอบผ่าน Reflection หรือเรียกผ่านกระบวนการ process ทางอ้อม
    Node root = IR.script();
    root.setSourceFileName("my-prefix/module.js");
    
    pass.process(new Node(Token.BLOCK), root);
    assertEquals("module$module", pass.guessCJSModuleName("my-prefix/module.js"));
    assertEquals("module$other", pass.guessCJSModuleName("other.js"));
  }

  @Test
  public void testProcessMultipleScriptsThrowsException() {
    Compiler compiler = new Compiler();
    ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, ".", false);

    Node root = new Node(Token.BLOCK);
    Node script1 = IR.script();
    script1.setSourceFileName("file1.js");
    Node script2 = IR.script();
    script2.setSourceFileName("file2.js");
    
    root.addChildToBack(script1);
    root.addChildToBack(script2);

    try {
      pass.process(new Node(Token.BLOCK), root);
      fail("Expected IllegalArgumentException because scriptNodeCount > 1 per invocation");
    } catch (IllegalArgumentException e) {
      assertTrue(e.getMessage().contains("supports only one invocation"));
    }
  }

  @Test
  public void testProcessRequireAndModuleExports() {
    Compiler compiler = new Compiler();
    ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, "", true);

    // จำลองโครงสร้าง AST สำหรับ CommonJS: require('./dependency') และ module.exports = ...
    Node script = IR.script();
    script.setSourceFileName("main.js");

    // require call node
    Node requireCall = IR.call(IR.name("require"), IR.string("./dependency.js"));
    script.addChildToBack(IR.exprResult(requireCall));

    // module.exports node
    Node moduleExports = IR.assign(
        IR.getprop(IR.name("module"), IR.string("exports")),
        IR.number(1)
    );
    script.addChildToBack(IR.exprResult(moduleExports));

    Node root = new Node(Token.BLOCK, script);
    pass.process(new Node(Token.BLOCK), root);

    assertNotNull(pass.getModule());
  }
}