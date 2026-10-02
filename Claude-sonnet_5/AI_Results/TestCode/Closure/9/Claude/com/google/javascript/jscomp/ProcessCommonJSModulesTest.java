package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

// import แบบ explicit ตามข้อกำหนด (แม้อยู่ package เดียวกัน ก็ import ได้โดยไม่ error)
import com.google.javascript.jscomp.ProcessCommonJSModules;

import org.junit.Test;

/**
 * Unit test สำหรับ ProcessCommonJSModules
 *
 * หมายเหตุสำคัญ:
 * - เมธอด process() และ inner class (ProcessCommonJsModulesCallback,
 *   SuffixVarsCallback) ต้องพึ่งพา NodeTraversal ที่ทำงานกับ AST จริงจาก
 *   Compiler.parse(...) และ CompilerInput/JSModule/Scope ที่สัมพันธ์กัน
 *   ซึ่งไม่มีรายละเอียด setup ที่ปลอดภัยอยู่ในซอร์สที่ให้มา และไม่มี
 *   mocking framework อยู่ใน classpath ที่อนุญาต จึง "ไม่เดา" การ setup
 *   ดังกล่าว และไม่ทดสอบ branch ภายใน inner class เหล่านี้
 * - ทดสอบเฉพาะส่วนที่ deterministic และเข้าถึงได้จริงจากซอร์สที่ให้มา:
 *   toModuleName(String), toModuleName(String,String), constructor,
 *   guessCJSModuleName(String) (ซึ่งครอบคลุม normalizeSourceName แบบอ้อม),
 *   getModule()
 */
public class ProcessCommonJSModulesTest {

  // ---------- toModuleName(String) : ค่า boundary / null / รูปแบบต่าง ๆ ----------

  @Test
  public void testToModuleName_simpleJsFile() {
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo.js"));
  }

  @Test
  public void testToModuleName_leadingDotSlashStripped() {
    // branch: leading "./" ตรงกับ regex ^\./  -> ถูกลบ
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("./foo.js"));
  }

  @Test
  public void testToModuleName_slashReplacedWithDollar() {
    assertEquals("module$a$b$c", ProcessCommonJSModules.toModuleName("a/b/c.js"));
  }

  @Test
  public void testToModuleName_dashReplacedWithUnderscore() {
    assertEquals("module$a_b_c", ProcessCommonJSModules.toModuleName("a-b-c.js"));
  }

  @Test
  public void testToModuleName_noJsSuffix_unchanged() {
    // branch: regex \.js$ ไม่ match เพราะไม่มี .js ต่อท้าย
    assertEquals("module$foo", ProcessCommonJSModules.toModuleName("foo"));
  }

  @Test
  public void testToModuleName_emptyString() {
    // boundary: string ว่าง
    assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
  }

  @Test
  public void testToModuleName_onlyTrailingJsRemoved_notAllOccurrences() {
    // edge case: regex \.js$ มี anchor $ จับได้เฉพาะ .js ตัวสุดท้าย
    // ค่านี้แสดงว่า ".js" ตัวก่อนหน้าจะไม่ถูกลบ (บันทึกไว้เป็นพฤติกรรมจริงตามซอร์ส)
    assertEquals("module$foo.js", ProcessCommonJSModules.toModuleName("foo.js.js"));
  }

  @Test
  public void testToModuleName_doubleDotSlash_notStrippedBySingleArgVersion() {
    // edge case: "../" ไม่ match regex ^\./ (ต้องขึ้นต้นด้วย "./" เท่านั้น)
    // ดังนั้น ".." จะถูกแทน "/" ด้วย "$" กลายเป็นส่วนหนึ่งของชื่อโมดูล
    assertEquals("module$..$foo", ProcessCommonJSModules.toModuleName("../foo.js"));
  }

  @Test(expected = NullPointerException.class)
  public void testToModuleName_nullInput_throwsNPE() {
    // null: filename.replaceAll(...) จะ throw NPE
    ProcessCommonJSModules.toModuleName((String) null);
  }

  // ---------- toModuleName(String, String) : if/else ของ relative path ----------

  @Test
  public void testToModuleNameTwoArg_notRelative() {
    // branch false: requiredFilename ไม่ได้ขึ้นต้นด้วย "./" หรือ "../"
    assertEquals("module$bar",
        ProcessCommonJSModules.toModuleName("bar.js", "foo.js"));
  }

  @Test
  public void testToModuleNameTwoArg_relativeCurrentDir() {
    // branch true: ขึ้นต้นด้วย "./" -> ต้องมีการ resolve URI
    // base="a/foo", ref="./bar" -> ผลลัพธ์ตาม java.net.URI.resolve = "a/bar"
    assertEquals("module$a$bar",
        ProcessCommonJSModules.toModuleName("./bar.js", "a/foo.js"));
  }

  @Test
  public void testToModuleNameTwoArg_relativeParentDir() {
    // branch true: ขึ้นต้นด้วย "../" -> resolve URI ไปไดเรกทอรีบน
    // base="a/b/foo", ref="../bar" -> ผลลัพธ์ตาม java.net.URI.resolve = "a/bar"
    assertEquals("module$a$bar",
        ProcessCommonJSModules.toModuleName("../bar.js", "a/b/foo.js"));
  }

  @Test
  public void testToModuleNameTwoArg_jsSuffixStrippedBeforeCheck() {
    // ทั้ง requiredFilename และ currentFilename ถูก strip .js ก่อนเช็ค relative
    assertEquals("module$bar",
        ProcessCommonJSModules.toModuleName("bar.js", "current.js"));
  }

  @Test(expected = NullPointerException.class)
  public void testToModuleNameTwoArg_nullRequiredFilename_throwsNPE() {
    ProcessCommonJSModules.toModuleName(null, "current.js");
  }

  @Test(expected = NullPointerException.class)
  public void testToModuleNameTwoArg_nullCurrentFilename_throwsNPE() {
    // แม้ requiredFilename ปกติ แต่บรรทัด currentFilename.replaceAll(...)
    // ถูกเรียกโดยไม่มี condition (unconditional) จึงเกิด NPE เสมอถ้า current เป็น null
    ProcessCommonJSModules.toModuleName("bar.js", null);
  }

  // หมายเหตุ: branch catch (URISyntaxException e) ไม่สามารถทดสอบได้อย่างปลอดภัย
  // เนื่องจากต้องหาค่า String ที่ทำให้ `new URI(...)` throw URISyntaxException
  // ได้จริงตามเงื่อนไข relative-prefix ข้างต้น ซึ่งไม่มีข้อมูลยืนยันจากซอร์ส
  // ว่ากรณีใดจะเกิดขึ้นจริงในทางปฏิบัติ จึงไม่เขียนทดสอบเพื่อไม่เดา behavior

  // ---------- constructor branch: เติม "/" ท้าย filenamePrefix หรือไม่ ----------

  @Test
  public void testConstructor_prefixAlreadyEndsWithSlash() {
    // branch: filenamePrefix.endsWith("/") == true -> ใช้ค่าเดิม
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "./");
    // ตรวจทางอ้อมผ่าน guessCJSModuleName ซึ่งใช้ normalizeSourceName + filenamePrefix
    assertEquals("module$foo", pcm.guessCJSModuleName("./foo.js"));
  }

  @Test
  public void testConstructor_prefixWithoutTrailingSlash_getsSlashAppended() {
    // branch: filenamePrefix.endsWith("/") == false -> เติม "/" ต่อท้าย
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "src");
    assertEquals("module$foo", pcm.guessCJSModuleName("src/foo.js"));
  }

  @Test
  public void testConstructor_twoArgOverload_delegatesCorrectly() {
    // ทดสอบ constructor 2-arg (delegate ไปยัง 3-arg ด้วย reportDependencies=true)
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "src");
    assertEquals("module$foo", pcm.guessCJSModuleName("src/foo.js"));
  }

  // ---------- guessCJSModuleName / normalizeSourceName branch: indexOf == 0 ----------

  @Test
  public void testGuessCJSModuleName_prefixMatchesAtStart_stripped() {
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "./");
    // branch true: filename.indexOf(filenamePrefix) == 0
    assertEquals("module$foo", pcm.guessCJSModuleName("./foo.js"));
  }

  @Test
  public void testGuessCJSModuleName_prefixNotAtStart_notStripped() {
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "src");
    // branch false: prefix "src/" ไม่พบตำแหน่ง 0 ของ filename นี้
    // (ไม่มี "src/" อยู่ใน filename เลย -> indexOf คืน -1)
    assertEquals("module$other$foo", pcm.guessCJSModuleName("other/foo.js"));
  }

  @Test
  public void testGuessCJSModuleName_prefixEqualsWholeFilename_resultsEmptyRemainder() {
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "./");
    // boundary: filename เท่ากับ prefix พอดี -> ส่วนที่เหลือเป็น string ว่าง
    assertEquals("module$", pcm.guessCJSModuleName("./"));
  }

  @Test
  public void testGuessCJSModuleName_emptyFilename() {
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "./");
    // boundary: filename ว่าง -> indexOf("./" ) บน "" จะได้ -1 != 0 -> ไม่ strip
    assertEquals("module$", pcm.guessCJSModuleName(""));
  }

  // ---------- getModule() ค่าเริ่มต้น ----------

  @Test
  public void testGetModule_initiallyNull() {
    ProcessCommonJSModules pcm = new ProcessCommonJSModules(null, "./");
    // module ถูก set เฉพาะใน visitScript() (เมื่อ reportDependencies == true และ process()
    // ถูกเรียกจริง) ซึ่งไม่ได้ทดสอบในไฟล์นี้ตามที่ระบุไว้ข้างต้น ดังนั้นค่าเริ่มต้นต้องเป็น null
    assertNull(pcm.getModule());
  }

  // ---------- ค่าคงที่ ----------

  @Test
  public void testDefaultFilenamePrefixConstant() {
    assertEquals("./", ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX);
  }
}
