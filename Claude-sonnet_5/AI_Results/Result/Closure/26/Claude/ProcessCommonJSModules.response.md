# JUnit 4 Test Suite: ProcessCommonJSModulesTest

## หมายเหตุสำคัญก่อนเริ่ม (ข้อจำกัดที่วิเคราะห์ได้)

- `process()`, `visitRequireCall`, `visitScript`, `visitModuleExports`, และ `SuffixVarsCallback.visit` เป็น **private/inner-class logic** ที่ผูกกับ `NodeTraversal`, `Scope.Var`, `CompilerInput`, `JSModule` ซึ่ง behavior ภายในไม่ได้ระบุไว้ครบในซอร์สที่ให้มา (เช่น `Scope.getVar`, `CompilerInput.addRequire` ทำงานอย่างไรจริง) — การจำลอง (mock) โดยไม่มี Mockito ในคลาสพาธที่กำหนด และไม่มีรายละเอียด API ที่ชัดเจนของ `AbstractCompiler`/`Scope` จะเป็นการ **เดา behavior** ซึ่งขัดกับข้อกำหนด จึงไม่เขียนเทสสำหรับส่วนนี้ตรง ๆ (คอมเมนต์กำกับไว้ในโค้ด)
- เมธอดที่ทดสอบได้โดยไม่ต้องเดา behavior ภายนอก คือ:
  - `toModuleName(String)` (static, public)
  - `toModuleName(String, String)` (static, public)
  - `normalizeSourceName(String)` (private) — ทดสอบทางอ้อมผ่าน `guessCJSModuleName(String)` (package-private) ซึ่งไม่ใช้ `compiler` field เลย จึงส่ง `null` เป็น `AbstractCompiler` ได้อย่างปลอดภัย
  - Constructor logic เรื่อง `filenamePrefix` การเติม `File.separator`

```java
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
```

## สรุปตาราง Branch/Condition Coverage

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testToModuleName_basicPathWithSeparatorAndJsExtension` | regex replace separator→`$`, ตัด `.js` ท้ายสตริง (ทั้งสองเงื่อนไข match) |
| `testToModuleName_leadingDotSeparatorIsStripped` | branch regex `^\.`+separator match=true |
| `testToModuleName_dashReplacedWithUnderscore` | branch regex `-`→`_` match=true |
| `testToModuleName_multipleDashesEachReplaced` | loop-like replaceAll กับหลาย match ของ `-` |
| `testToModuleName_noJsExtension_unchangedTail` | branch `\.js$` match=false |
| `testToModuleName_jsNotAtEnd_notStripped` | ยืนยัน anchor `$` ทำงานถูกต้อง (edge case) |
| `testToModuleName_multipleSeparators` | loop replaceAll ของ separator หลายจุด |
| `testToModuleName_emptyString_boundary` | ค่าขอบเขต string ว่าง |
| `testToModuleName_nullInput_throwsNPE` | ค่า null → exception path (fault detection) |
| `testToModuleNameTwoArg_relativeCurrentDir` | if-condition ตัวแรก (`startsWith("./")`) = true, try-block resolve URI สำเร็จ |
| `testToModuleNameTwoArg_parentDir` | ตัวแรก=false, ตัวสอง (`startsWith("../")`) = true |
| `testToModuleNameTwoArg_notRelative_noResolveCalled` | ทั้งสองเงื่อนไข = false → ข้าม try-block |
| `testToModuleNameTwoArg_uriSyntaxException_wrappedAsRuntimeException` | catch(URISyntaxException) → throw RuntimeException |
| `testConstructor_prefixWithoutTrailingSeparator_normalizedAndMatch` | constructor ternary: prefix ไม่ลงท้าย separator → เติม + `normalizeSourceName` indexOf==0 true |
| `testConstructor_prefixWithTrailingSeparator_unchanged` | constructor ternary: prefix ลงท้าย separator แล้ว → ไม่เติม |
| `testGuessCJSModuleName_filenameDoesNotStartWithPrefix` | `normalizeSourceName`: indexOf!=0 → false branch (ไม่ตัด prefix) |
| `testGuessCJSModuleName_prefixEqualsFullFilename_boundary` | boundary: substring เหลือ string ว่าง |
| `testConstructor_threeArg_reportDependenciesFalse_stillNormalizesPrefix` | ทดสอบ constructor 3-arg (`reportDependencies=false`) ยังคง normalize prefix ถูกต้อง |
| `testDefaultFilenamePrefix_constant` | ทดสอบค่าคงที่ `DEFAULT_FILENAME_PREFIX` |
| `testGetModule_initiallyNull` | สถานะ default ของ field `module` |

**หมายเหตุความครอบคลุมที่ไม่สามารถทำได้ตามข้อกำหนด (ไม่เดา behavior):**
`process()`, `visitRequireCall`, `visitScript`, `visitModuleExports`, `emitOptionalModuleExportsOverride`, `getCurrentScriptNode`, และ `SuffixVarsCallback.visit` (รวม branch `suffix.equals(name)`, `EXPORTS.equals(name)`, `var.isGlobal()`) ไม่ได้ถูกทดสอบตรง เนื่องจากต้องพึ่งพา internal state ของ `NodeTraversal`, `Scope`, `CompilerInput`, `JSModule` ที่ต้องใช้ full `Compiler` pipeline ซึ่งไม่มีรายละเอียด API ที่ยืนยันได้จากซอร์สที่ให้มา การจำลอง/สมมติ behavior เหล่านี้จะเป็นการเดาซึ่งขัดกับข้อกำหนดที่ 4