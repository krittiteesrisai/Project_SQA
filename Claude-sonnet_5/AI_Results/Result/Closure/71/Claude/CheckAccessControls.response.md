# CheckAccessControlsTest.java

**หมายเหตุสำคัญก่อนเริ่ม:**
`CheckAccessControls` เป็น compiler pass ที่ทำงานบน AST **ที่มี type information ติดมาแล้ว** (ต้องผ่าน `TypedScopeCreator`/`TypeInference` ก่อน) การจะทดสอบ branch ต่าง ๆ ได้จริงจึงต้องรันผ่าน pipeline ของ `Compiler`/`CompilerOptions` (ซึ่งเป็นคลาสในแพ็กเกจ `com.google.javascript.jscomp` เดียวกับคลาสเป้าหมาย ไม่ใช่ jar ภายนอกตามลิสต์ที่ให้มา — สมมติว่าถูก compile มาพร้อมกับ target class อยู่แล้วใน classpath ของโปรเจกต์เดิม) จุดที่ผมไม่สามารถยืนยัน 100% จาก source ที่ให้มา ได้ใส่คอมเมนต์กำกับไว้ในโค้ดแล้ว (เช่น ชื่อ `DiagnosticGroups.ACCESS_CONTROLS`, พฤติกรรมของ TypeCheck กับ `@extends`)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit tests for {@link CheckAccessControls}.
 *
 * ทดสอบผ่าน Compiler pipeline เต็มรูปแบบ เนื่องจาก CheckAccessControls
 * ต้องพึ่งพา type information ที่มาจาก TypedScopeCreator/TypeInference
 * (ตามที่ระบุไว้ใน Javadoc ของคลาสเป้าหมาย)
 *
 * ข้อสมมติที่ไม่สามารถยืนยันได้ 100% จาก source ที่ให้มา:
 *  - DiagnosticGroups.ACCESS_CONTROLS ครอบคลุม diagnostic ทั้งหมดของคลาสนี้
 *  - CheckAccessControls ถูกเปิดใช้งานโดยอัตโนมัติเมื่อ options.setCheckTypes(true)
 *  - พฤติกรรมการ resolve @extends / prototype chain ของ TypeCheck เวอร์ชันนี้
 */
public class CheckAccessControlsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  private static final String EXTERNS =
      "/** @constructor */ function Object() {}\n"
      + "/** @constructor @param {...*} var_args @return {!Function} */"
      + " function Function(var_args) {}\n";

  private CompilerOptions createOptions() {
    CompilerOptions options = new CompilerOptions();
    options.setCheckTypes(true);
    // สมมติว่ามีกลุ่มนี้จริงในเวอร์ชันนี้ (ไม่ยืนยัน 100% จาก source ที่ให้มา)
    options.setWarningLevel(DiagnosticGroups.ACCESS_CONTROLS, CheckLevel.WARNING);
    return options;
  }

  /**
   * คอมไพล์ไฟล์ js (หนึ่งไฟล์หรือหลายไฟล์ เพื่อจำลอง "ต่างไฟล์กัน")
   * แล้วรวบรวม warnings + errors ทั้งหมดที่ compiler เก็บไว้
   */
  private JSError[] compileAndGetDiagnostics(String... jsFiles) {
    List<SourceFile> externsList =
        Arrays.asList(SourceFile.fromCode("externs.js", EXTERNS));
    SourceFile[] inputs = new SourceFile[jsFiles.length];
    for (int i = 0; i < jsFiles.length; i++) {
      inputs[i] = SourceFile.fromCode("input" + i + ".js", jsFiles[i]);
    }
    compiler.compile(externsList, Arrays.asList(inputs), createOptions());
    JSError[] warnings = compiler.getWarnings();
    JSError[] errors = compiler.getErrors();
    JSError[] all = new JSError[warnings.length + errors.length];
    System.arraycopy(warnings, 0, all, 0, warnings.length);
    System.arraycopy(errors, 0, all, warnings.length, errors.length);
    return all;
  }

  private boolean containsDiagnostic(JSError[] diagnostics, DiagnosticType type) {
    for (JSError e : diagnostics) {
      if (e.getType() == type) {
        return true;
      }
    }
    return false;
  }

  private void assertHasDiagnostic(JSError[] diagnostics, DiagnosticType type) {
    assertTrue("ควรพบ diagnostic ที่คาดหวัง", containsDiagnostic(diagnostics, type));
  }

  private void assertNoDiagnostic(JSError[] diagnostics, DiagnosticType type) {
    assertFalse("ไม่ควรพบ diagnostic นี้", containsDiagnostic(diagnostics, type));
  }

  // ---------------------------------------------------------------------
  // checkConstructorDeprecation / getTypeDeprecationInfo
  // ---------------------------------------------------------------------

  @Test
  public void testDeprecatedClass_NoReason() {
    String js =
        "/** @constructor @deprecated */\n"
        + "function Foo() {}\n"
        + "new Foo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS_REASON);
  }

  @Test
  public void testDeprecatedClass_WithReason() {
    String js =
        "/** @constructor @deprecated Use Bar instead. */\n"
        + "function Foo() {}\n"
        + "new Foo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS_REASON);
  }

  @Test
  public void testNoDeprecatedClassWarning_WhenTypeNotDeprecated() {
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "new Foo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS_REASON);
  }

  // ---------------------------------------------------------------------
  // canAccessDeprecatedTypes case #1: อยู่ในฟังก์ชันที่ถูก @deprecated
  // ---------------------------------------------------------------------

  @Test
  public void testNoWarning_WhenInsideDeprecatedFunction() {
    String js =
        "/** @constructor @deprecated */\n"
        + "function Foo() {}\n"
        + "/** @deprecated */\n"
        + "function f() { new Foo(); }\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS);
  }

  // ---------------------------------------------------------------------
  // checkNameDeprecation
  // ---------------------------------------------------------------------

  @Test
  public void testDeprecatedName_NoReason() {
    String js =
        "/** @deprecated */\n"
        + "function foo() {}\n"
        + "foo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME);
  }

  @Test
  public void testDeprecatedName_WithReason() {
    String js =
        "/** @deprecated Use bar instead. */\n"
        + "function foo() {}\n"
        + "foo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME_REASON);
  }

  @Test
  public void testDeprecatedName_SkippedForVarDeclarationParent() {
    // NAME node ที่ parent เป็น VAR ต้องถูก skip
    String js =
        "/** @deprecated */\n"
        + "var x = 1;\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME_REASON);
  }

  @Test
  public void testDeprecatedName_GlobalScope_NonCallAccess_NoWarning() {
    // ในสโคปโกลบอล การอ้างถึงชื่อเฉย ๆ (ไม่ใช่ CALL/NEW) ไม่ควร trigger warning
    String js =
        "/** @deprecated */\n"
        + "function foo() {}\n"
        + "var y = foo;\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME_REASON);
  }

  @Test
  public void testDeprecatedName_GlobalScope_CallAccess_Warning() {
    String js =
        "/** @deprecated */\n"
        + "function foo() {}\n"
        + "foo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME);
  }

  // ---------------------------------------------------------------------
  // checkPropertyDeprecation
  // ---------------------------------------------------------------------

  @Test
  public void testDeprecatedProperty_NoReason() {
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @deprecated */\n"
        + "Foo.prototype.bar = function() {};\n"
        + "function f() { (new Foo()).bar(); }\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_PROP);
  }

  @Test
  public void testDeprecatedProperty_WithReason() {
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @deprecated Use baz instead. */\n"
        + "Foo.prototype.bar = function() {};\n"
        + "function f() { (new Foo()).bar(); }\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.DEPRECATED_PROP_REASON);
  }

  @Test
  public void testDeprecatedProperty_SkippedWhenAssigning() {
    // "We can always assign to a deprecated property"
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @deprecated */\n"
        + "Foo.prototype.bar = 0;\n"
        + "/**\n"
        + " * @param {Foo} o\n"
        + " */\n"
        + "function f(o) { o.bar = 2; }\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_PROP);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_PROP_REASON);
  }

  // ---------------------------------------------------------------------
  // checkNameVisibility (private var ในสโคปโกลบอล)
  // ---------------------------------------------------------------------

  @Test
  public void testPrivateGlobalAccess_SameFile_NoWarning() {
    String js =
        "/** @private */\n"
        + "var secret = 1;\n"
        + "var x = secret;\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS);
  }

  @Test
  public void testPrivateGlobalAccess_DifferentFile_Warning() {
    String fileA = "/** @private */\nvar secret = 1;\n";
    String fileB = "var x = secret;\n";
    JSError[] diags = compileAndGetDiagnostics(fileA, fileB);
    assertHasDiagnostic(diags, CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS);
  }

  @Test
  public void testPrivateConstructor_ValidAccessNotViaNew_NoWarning() {
    String fileA = "/** @private @constructor */\nfunction Foo() {}\n";
    String fileB = "var x = Foo;\n"; // ไม่ใช่ NEW
    JSError[] diags = compileAndGetDiagnostics(fileA, fileB);
    assertNoDiagnostic(diags, CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS);
  }

  @Test
  public void testPrivateConstructor_InvalidAccessViaNew_Warning() {
    String fileA = "/** @private @constructor */\nfunction Foo() {}\n";
    String fileB = "new Foo();\n"; // parent == NEW
    JSError[] diags = compileAndGetDiagnostics(fileA, fileB);
    assertHasDiagnostic(diags, CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS);
  }

  // ---------------------------------------------------------------------
  // checkPropertyVisibility (private / protected property access)
  // ---------------------------------------------------------------------

  @Test
  public void testPrivateProperty_DifferentFile_Warning() {
    String fileA =
        "/** @constructor */\n"
        + "function Base() {}\n"
        + "/** @private */\n"
        + "Base.prototype.secret = function() {};\n";
    String fileB = "(new Base()).secret();\n";
    JSError[] diags = compileAndGetDiagnostics(fileA, fileB);
    assertHasDiagnostic(diags, CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS);
  }

  @Test
  public void testPrivateProperty_SameFile_NoWarning() {
    String js =
        "/** @constructor */\n"
        + "function Base() {}\n"
        + "/** @private */\n"
        + "Base.prototype.secret = function() {};\n"
        + "(new Base()).secret();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS);
  }

  @Test
  public void testProtectedProperty_DifferentFile_OutsideSubclass_Warning() {
    String fileA =
        "/** @constructor */\n"
        + "function Base() {}\n"
        + "/** @protected */\n"
        + "Base.prototype.prot = function() {};\n";
    String fileB = "(new Base()).prot();\n";
    JSError[] diags = compileAndGetDiagnostics(fileA, fileB);
    assertHasDiagnostic(diags, CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS);
  }

  // ---------------------------------------------------------------------
  // checkPropertyVisibility - override
  // หมายเหตุ: ผลลัพธ์ขึ้นกับการ resolve @extends/prototype chain ของ
  // TypeCheck เวอร์ชันนี้ (ไม่สามารถยืนยัน behavior 100% จาก source ที่ให้มา)
  // ---------------------------------------------------------------------

  @Test
  public void testPrivateOverride_DifferentFile_Warning() {
    String fileA =
        "/** @constructor */\n"
        + "function Base() {}\n"
        + "/** @private */\n"
        + "Base.prototype.foo = function() {};\n";
    String fileB =
        "/**\n"
        + " * @constructor\n"
        + " * @extends {Base}\n"
        + " */\n"
        + "function Sub() {}\n"
        + "Sub.prototype = new Base();\n"
        + "Sub.prototype.foo = function() {};\n";
    JSError[] diags = compileAndGetDiagnostics(fileA, fileB);
    assertHasDiagnostic(diags, CheckAccessControls.PRIVATE_OVERRIDE);
  }

  @Test
  public void testVisibilityMismatch_Warning() {
    String js =
        "/** @constructor */\n"
        + "function Base() {}\n"
        + "/** @protected */\n"
        + "Base.prototype.foo = function() {};\n"
        + "/**\n"
        + " * @constructor\n"
        + " * @extends {Base}\n"
        + " */\n"
        + "function Sub() {}\n"
        + "Sub.prototype = new Base();\n"
        + "/** @public @override */\n"
        + "Sub.prototype.foo = function() {};\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.VISIBILITY_MISMATCH);
  }

  // ---------------------------------------------------------------------
  // checkConstantProperty
  // ---------------------------------------------------------------------

  @Test
  public void testConstantProperty_AssignedOnce_NoWarning() {
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @const */\n"
        + "Foo.prototype.bar = 1;\n"
        + "function f() {\n"
        + "  var x = new Foo();\n"
        + "  x.bar = 2;\n"
        + "}\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testConstantProperty_ReassignedTwice_Warning() {
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @const */\n"
        + "Foo.prototype.bar = 1;\n"
        + "function f() {\n"
        + "  var x = new Foo();\n"
        + "  x.bar = 2;\n"
        + "  x.bar = 3;\n"
        + "}\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testConstantProperty_IncrementOperator_Warning() {
    // ครอบคลุมสาขา parent.getType() == Token.INC
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "/** @const */\n"
        + "Foo.prototype.bar = 1;\n"
        + "function f() {\n"
        + "  var x = new Foo();\n"
        + "  x.bar = 2;\n"
        + "  x.bar++;\n"
        + "}\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertHasDiagnostic(diags, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testConstantProperty_NonConstProperty_NoWarning() {
    String js =
        "/** @constructor */\n"
        + "function Foo() {}\n"
        + "Foo.prototype.bar = 1;\n"
        + "function f() {\n"
        + "  var x = new Foo();\n"
        + "  x.bar = 2;\n"
        + "  x.bar = 3;\n"
        + "}\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  // ---------------------------------------------------------------------
  // Boundary / null / empty / malformed input
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyProgram_NoDiagnostics() {
    JSError[] diags = compileAndGetDiagnostics("");
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_CLASS);
    assertNoDiagnostic(diags, CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE);
  }

  @Test
  public void testNoJSDoc_NoAccessControlDiagnostics() {
    String js = "function foo() {}\nfoo();\n";
    JSError[] diags = compileAndGetDiagnostics(js);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME);
    assertNoDiagnostic(diags, CheckAccessControls.DEPRECATED_NAME_REASON);
  }

  @Test
  public void testMalformedInput_DoesNotThrow() {
    String malformed = "function f( { !!! ";
    try {
      compileAndGetDiagnostics(malformed);
    } catch (Exception e) {
      fail("ไม่ควร throw exception แม้ input จะผิดรูปแบบ: " + e);
    }
  }
}
```

## ตารางสรุป Branch/Condition ที่แต่ละเทสครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม (อ้างจาก source) |
|---|---|
| `testDeprecatedClass_NoReason` | `checkConstructorDeprecation`: `deprecationInfo != null` true, `deprecationInfo.isEmpty()` true → `DEPRECATED_CLASS` |
| `testDeprecatedClass_WithReason` | เช่นเดียวกันแต่ `!deprecationInfo.isEmpty()` → `DEPRECATED_CLASS_REASON` |
| `testNoDeprecatedClassWarning_WhenTypeNotDeprecated` | `getTypeDeprecationInfo(type)` คืน `null` → ไม่รายงาน |
| `testNoWarning_WhenInsideDeprecatedFunction` | `canAccessDeprecatedTypes` case #1 (`deprecatedDepth > 0`) → `shouldEmitDeprecationWarning` คืน false |
| `testDeprecatedName_NoReason` / `WithReason` | `checkNameDeprecation`: `docInfo.getDeprecationReason() != null` true/false |
| `testDeprecatedName_SkippedForVarDeclarationParent` | `parent.getType() == Token.VAR` → return ทันที |
| `testDeprecatedName_GlobalScope_NonCallAccess_NoWarning` | `shouldEmitDeprecationWarning`: `t.inGlobalScope()` true และ ไม่ใช่ CALL/NEW → return false |
| `testDeprecatedName_GlobalScope_CallAccess_Warning` | `t.inGlobalScope()` true และเป็น CALL ที่ `parent.getFirstChild()==n` → ผ่านเงื่อนไข |
| `testDeprecatedProperty_NoReason` / `WithReason` | `checkPropertyDeprecation`: `deprecationInfo.isEmpty()` true/false |
| `testDeprecatedProperty_SkippedWhenAssigning` | `shouldEmitDeprecationWarning`: GETPROP ที่เป็น assignment target → return false |
| `testPrivateGlobalAccess_SameFile_NoWarning` | `checkNameVisibility`: `t.getInput().getName().equals(docInfo.getSourceName())` true → ไม่รายงาน |
| `testPrivateGlobalAccess_DifferentFile_Warning` | เงื่อนไขเดียวกัน false, ไม่ใช่ constructor → `BAD_PRIVATE_GLOBAL_ACCESS` |
| `testPrivateConstructor_ValidAccessNotViaNew_NoWarning` | `docInfo.isConstructor() && isValidPrivateConstructorAccess(parent)` true → return |
| `testPrivateConstructor_InvalidAccessViaNew_Warning` | `isValidPrivateConstructorAccess`: `parent.getType()==Token.NEW` → false → รายงาน |
| `testPrivateProperty_DifferentFile_Warning` | `checkPropertyVisibility`: visibility PRIVATE, `!sameInput`, `currentClass==null` → `BAD_PRIVATE_PROPERTY_ACCESS` |
| `testPrivateProperty_SameFile_NoWarning` | `sameInput` true → return ก่อนเช็ค visibility |
| `testProtectedProperty_DifferentFile_OutsideSubclass_Warning` | visibility PROTECTED, `currentClass==null` → `BAD_PROTECTED_PROPERTY_ACCESS` |
| `testPrivateOverride_DifferentFile_Warning` | `isOverride` true, `visibility==PRIVATE && !sameInput` → `PRIVATE_OVERRIDE` |
| `testVisibilityMismatch_Warning` | `overridingVisibility != INHERITED && overridingVisibility != visibility` → `VISIBILITY_MISMATCH` |
| `testConstantProperty_AssignedOnce_NoWarning` | ครั้งแรก `initializedConstantProperties.containsEntry(...)` false → ไม่รายงาน แต่ถูก put เข้า map |
| `testConstantProperty_ReassignedTwice_Warning` | ครั้งที่สอง `containsEntry` true → `CONST_PROPERTY_REASSIGNED_VALUE` |
| `testConstantProperty_IncrementOperator_Warning` | `checkConstantProperty`: branch `parent.getType() == Token.INC` |
| `testConstantProperty_NonConstProperty_NoWarning` | `info.isConstant()` false → ไม่ถูก put เข้า map เลย |
| `testEmptyProgram_NoDiagnostics` | boundary: AST ว่าง ไม่มี node ให้ visit |
| `testNoJSDoc_NoAccessControlDiagnostics` | `docInfo == null` → ข้ามการเช็คทั้งหมด (null-safety) |
| `testMalformedInput_DoesNotThrow` | อินพุตผิดรูปแบบ (parse error) ต้องไม่ทำให้ pass throw exception |

**ข้อจำกัดที่ควรทราบ:** บาง test (เช่น `PRIVATE_OVERRIDE`, `VISIBILITY_MISMATCH`, `BAD_PROTECTED_PROPERTY_ACCESS` สำหรับ valid subclass access) พึ่งพาความถูกต้องของ TypeCheck/`@extends` resolution ในเวอร์ชันนี้ ซึ่งไม่ได้ปรากฏใน source ของ `CheckAccessControls` ที่ให้มาโดยตรง จึงมีคอมเมนต์กำกับความไม่แน่นอนไว้ในโค้ด