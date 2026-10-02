package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.jscomp.ProcessCommonJSModules; // redundant แต่ระบุตามข้อกำหนด

import org.junit.Test;

import java.io.File;

/**
 * JUnit4 test suite for {@link ProcessCommonJSModules}.
 *
 * หมายเหตุ: การทดสอบ process()/visitRequireCall/visitScript/visitModuleExports/
 * SuffixVarsCallback ถูกงดเว้น เนื่องจากต้องพึ่งพา internal API ของ
 * AbstractCompiler, Scope.Var, CompilerInput, JSModule ที่ไม่ได้ระบุ behavior
 * ชัดเจนในซอร์สที่ให้มา การ mock/จำลองจะเป็นการเดา behavior ซึ่งขัดข้อกำหนด
 */
public class ProcessCommonJSModulesTest {

  private static final String SEP = File.separator;

  // ---------------------------------------------------------------------
  // toModuleName(String filename)
  // ---------------------------------------------------------------------

  @Test
  public void testToModuleName_basicPathWithSeparatorAndJsExtension() {
    String input = "foo" + SEP + "bar.js";
    assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_leadingDotSeparatorIsStripped() {
    // ครอบคลุม branch regex "^\\." + separator -> ""
    String input = "." + SEP + "foo.js";
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_dashReplacedWithUnderscore() {
    String input = "foo-bar.js";
    assertEquals("module$foo_bar", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_multipleDashesEachReplaced() {
    String input = "foo--bar.js";
    assertEquals("module$foo__bar", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_noJsExtension_unchangedTail() {
    // ครอบคลุม branch regex "\\.js$" ไม่ match (ไม่มี .js ต่อท้าย)
    String input = "foo" + SEP + "bar";
    assertEquals("module$foo$bar", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_jsNotAtEnd_notStripped() {
    // ตรวจว่า regex \.js$ ใช้ anchor ท้ายสตริงจริง ไม่ตัด .js ที่อยู่กลางคำ
    String input = "foo.js.txt";
    assertEquals("module$foo.js.txt", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_multipleSeparators() {
    String input = "a" + SEP + "b" + SEP + "c.js";
    assertEquals("module$a$b$c", ProcessCommonJSModules.toModuleName(input));
  }

  @Test
  public void testToModuleName_emptyString_boundary() {
    // boundary case: string ว่าง
    assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
  }

  @Test(expected = NullPointerException.class)
  public void testToModuleName_nullInput_throwsNPE() {
    // null/ค่าว่างพิเศษ: replaceAll บน null ต้องโยน NPE
    ProcessCommonJSModules.toModuleName(null);
  }

  // ---------------------------------------------------------------------
  // toModuleName(String requiredFilename, String currentFilename)
  // สมมติรันบน Unix-like OS ที่ File.separator == "/" เนื่องจาก URI.resolve()
  // ต้องพึ่งพา "/" เป็นตัวคั่น hierarchical path ตาม RFC3986 ซึ่งไม่ได้ระบุไว้
  // อย่างชัดเจนในซอร์ส แต่เป็นเงื่อนไขจำเป็นในการทดสอบ branch นี้
  // ---------------------------------------------------------------------

  @Test
  public void testToModuleNameTwoArg_relativeCurrentDir() {
    // branch: requiredFilename.startsWith("./") == true (short-circuit ตัวแรก)
    String required = "./foo.js";
    String current = "bar/baz.js";
    String result = ProcessCommonJSModules.toModuleName(required, current);
    assertEquals("module$bar$foo", result);
  }

  @Test
  public void testToModuleNameTwoArg_parentDir() {
    // branch: ตัวแรก false, ตัวสอง startsWith("../") == true
    String required = "../foo.js";
    String current = "bar/baz.js";
    String result = ProcessCommonJSModules.toModuleName(required, current);
    assertEquals("module$foo", result);
  }

  @Test
  public void testToModuleNameTwoArg_notRelative_noResolveCalled() {
    // branch: ทั้งสองเงื่อนไข false -> ไม่เข้า try/resolve, ใช้ requiredFilename ตรง ๆ
    String required = "foo.js";
    String current = "bar/baz.js";
    String result = ProcessCommonJSModules.toModuleName(required, current);
    assertEquals("module$foo", result);
  }

  @Test
  public void testToModuleNameTwoArg_uriSyntaxException_wrappedAsRuntimeException() {
    // อินพุตผิดรูปแบบ: ช่องว่างในพาธทำให้ new URI(...) โยน URISyntaxException
    // ซึ่งควรถูกจับและ wrap เป็น RuntimeException ตามซอร์ส
    String required = "./foo.js";
    String current = "a b/c.js"; // มีช่องว่าง ทำให้ URI constructor ล้มเหลว
    try {
      ProcessCommonJSModules.toModuleName(required, current);
      fail("Expected RuntimeException due to invalid URI syntax");
    } catch (RuntimeException e) {
      assertTrue(e.getCause() instanceof java.net.URISyntaxException);
    }
  }

  // ---------------------------------------------------------------------
  // Constructor + guessCJSModuleName() + normalizeSourceName() (ทางอ้อม)
  // ---------------------------------------------------------------------

  @Test
  public void testConstructor_prefixWithoutTrailingSeparator_normalizedAndMatch() {
    // filenamePrefix ไม่ลงท้ายด้วย separator -> constructor ต้องเติมให้
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, "src");
    String filename = "src" + SEP + "foo.js";
    // ครอบคลุม branch: filename.indexOf(filenamePrefix) == 0 -> true (ตัด prefix)
    assertEquals("module$foo", pcm.guessCJSModuleName(filename));
  }

  @Test
  public void testConstructor_prefixWithTrailingSeparator_unchanged() {
    // filenamePrefix ลงท้ายด้วย separator แล้ว -> constructor ไม่เติมซ้ำ
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, "src" + SEP);
    String filename = "src" + SEP + "foo.js";
    assertEquals("module$foo", pcm.guessCJSModuleName(filename));
  }

  @Test
  public void testGuessCJSModuleName_filenameDoesNotStartWithPrefix() {
    // ครอบคลุม branch: filename.indexOf(filenamePrefix) == 0 -> false (ไม่ตัด prefix)
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, "src");
    String filename = "other" + SEP + "foo.js";
    assertEquals("module$other$foo", pcm.guessCJSModuleName(filename));
  }

  @Test
  public void testGuessCJSModuleName_prefixEqualsFullFilename_boundary() {
    // boundary: filename เท่ากับ prefix พอดี -> normalizeSourceName คืนสตริงว่าง
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, "src");
    String filename = "src" + SEP;
    assertEquals("module$", pcm.guessCJSModuleName(filename));
  }

  @Test
  public void testConstructor_threeArg_reportDependenciesFalse_stillNormalizesPrefix() {
    // ทดสอบ constructor 3-arg (reportDependencies=false) — reportDependencies
    // ไม่ถูกใช้ใน guessCJSModuleName ดังนั้นผลลัพธ์ควรเหมือน 2-arg
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, "src", false);
    String filename = "src" + SEP + "foo.js";
    assertEquals("module$foo", pcm.guessCJSModuleName(filename));
  }

  @Test
  public void testDefaultFilenamePrefix_constant() {
    // ตรวจสอบค่าคงที่ DEFAULT_FILENAME_PREFIX ใช้งานได้จริงกับ constructor
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX);
    String filename = ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX + "foo.js";
    assertEquals("module$foo", pcm.guessCJSModuleName(filename));
  }

  @Test
  public void testGetModule_initiallyNull() {
    // module field เริ่มต้นเป็น null จนกว่า visitScript (ที่ไม่ได้ทดสอบตรง) จะรัน
    ProcessCommonJSModules pcm =
        new ProcessCommonJSModules(null, "src");
    assertEquals(null, pcm.getModule());
  }
}
