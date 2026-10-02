package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link MakeDeclaredNamesUnique}
 *
 * หมายเหตุ (ตามข้อกำหนดข้อ 4): เมธอด enterScope/exitScope/shouldTraverse/visit/
 * findDeclaredNames และ ContextualRenameInverter#process/visit/enterScope/exitScope
 * ต้องพึ่งพา Node/NodeTraversal/Compiler ที่แท้จริง ซึ่ง API การสร้าง object เหล่านี้
 * ไม่ได้ปรากฏอยู่ในซอร์สโค้ดที่ให้มา จึง "ไม่" เขียนเทสจำลอง AST ขึ้นมาเอง
 * (เพื่อไม่เดา behavior ที่ไม่มีอยู่ในซอร์ส) แต่จะทดสอบ logic ที่ปิดตัวเอง
 * (Renamer implementations, constructors, static helper methods) ให้ครบทุก
 * branch ที่วิเคราะห์ได้แทน
 */
public class MakeDeclaredNamesUniqueTest {

  // ---------- helpers ----------

  private Supplier<String> constantSupplier(final String value) {
    return new Supplier<String>() {
      @Override
      public String get() {
        return value;
      }
    };
  }

  private Supplier<String> sequentialSupplier() {
    return new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return String.valueOf(counter++);
      }
    };
  }

  // ---------- Constants ----------

  @Test
  public void testConstants() {
    assertEquals("arguments", MakeDeclaredNamesUnique.ARGUMENTS);
    assertEquals("$$", ContextualRenamer.UNIQUE_ID_SEPARATOR);
  }

  // ---------- MakeDeclaredNamesUnique constructors / factory ----------

  @Test
  public void testDefaultConstructorDoesNotThrow() {
    new MakeDeclaredNamesUnique();
  }

  @Test
  public void testCustomRenamerConstructorDoesNotThrow() {
    Renamer custom = new ContextualRenamer();
    new MakeDeclaredNamesUnique(custom);
  }

  @Test
  public void testGetContextualRenameInverterReturnsInverterInstance() {
    // ตัว constructor ของ ContextualRenameInverter เพียงแค่เก็บ reference
    // ไม่มีการ dereference compiler ดังนั้น null จึงปลอดภัยสำหรับทดสอบ factory
    CompilerPass pass = MakeDeclaredNamesUnique.getContextualRenameInverter(null);
    assertNotNull(pass);
    assertTrue(pass instanceof ContextualRenameInverter);
  }

  // ---------- ContextualRenameInverter.getOrginalName (static) ----------

  @Test
  public void testGetOrginalNameNoSeparatorReturnsSame() {
    assertEquals("foo", ContextualRenameInverter.getOrginalName("foo"));
  }

  @Test
  public void testGetOrginalNameWithSeparatorStripsSuffix() {
    assertEquals("foo", ContextualRenameInverter.getOrginalName("foo$$1"));
  }

  @Test
  public void testGetOrginalNameWithMultipleSeparatorsUsesLastOccurrence() {
    assertEquals("foo$$bar", ContextualRenameInverter.getOrginalName("foo$$bar$$2"));
  }

  @Test
  public void testGetOrginalNameEmptyStringReturnsEmpty() {
    assertEquals("", ContextualRenameInverter.getOrginalName(""));
  }

  @Test
  public void testGetOrginalNameSeparatorAtStartReturnsEmpty() {
    assertEquals("", ContextualRenameInverter.getOrginalName("$$1"));
  }

  // ---------- ContextualRenamer ----------

  @Test
  public void testContextualRenamerGlobalDeclarationHasNoReplacement() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName("foo");
    assertNull(root.getReplacementName("foo")); // global -> ไม่เก็บ replacement
  }

  @Test
  public void testContextualRenamerGlobalArgumentsIgnored() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName(MakeDeclaredNamesUnique.ARGUMENTS);
    assertNull(root.getReplacementName(MakeDeclaredNamesUnique.ARGUMENTS));
  }

  @Test
  public void testContextualRenamerGlobalDeclareTwiceDoesNotThrow() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName("dup");
    root.addDeclaredName("dup"); // setCount แบบ conditional ต้องไม่ throw
    assertNull(root.getReplacementName("dup"));
  }

  @Test
  public void testContextualRenamerChildFirstDeclarationKeepsName() {
    ContextualRenamer root = new ContextualRenamer();
    Renamer child = root.forChildScope();
    child.addDeclaredName("bar");
    assertNull(child.getReplacementName("bar")); // id == 0 -> newName = null
  }

  @Test
  public void testContextualRenamerSiblingScopesSameNameGetsSuffixed() {
    ContextualRenamer root = new ContextualRenamer();
    Renamer child1 = root.forChildScope();
    child1.addDeclaredName("bar");

    Renamer child2 = root.forChildScope();
    child2.addDeclaredName("bar");

    assertNull(child1.getReplacementName("bar"));
    assertEquals("bar$$1", child2.getReplacementName("bar")); // id != 0
  }

  @Test
  public void testContextualRenamerDuplicateAddDeclaredNameSameScopeIsNoOp() {
    ContextualRenamer root = new ContextualRenamer();
    Renamer child1 = root.forChildScope();
    child1.addDeclaredName("baz");
    child1.addDeclaredName("baz"); // declarations.containsKey == true -> skip

    Renamer child2 = root.forChildScope();
    child2.addDeclaredName("baz");

    // ถ้า duplicate เพิ่ม counter ซ้อนจะได้ "baz$$2" ไม่ใช่ "baz$$1"
    assertEquals("baz$$1", child2.getReplacementName("baz"));
  }

  @Test
  public void testContextualRenamerGlobalReservationAffectsChildScope() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName("qux"); // reserve ระดับ global
    Renamer child = root.forChildScope();
    child.addDeclaredName("qux");
    assertEquals("qux$$1", child.getReplacementName("qux"));
  }

  @Test
  public void testContextualRenamerChildArgumentsIgnored() {
    ContextualRenamer root = new ContextualRenamer();
    Renamer child = root.forChildScope();
    child.addDeclaredName(MakeDeclaredNamesUnique.ARGUMENTS);
    assertNull(child.getReplacementName(MakeDeclaredNamesUnique.ARGUMENTS));
  }

  @Test
  public void testContextualRenamerEmptyNameGlobalThenChildGetsSuffixed() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName(""); // ชื่อว่างไม่ถูก special-case ใน ContextualRenamer
    Renamer child = root.forChildScope();
    child.addDeclaredName("");
    assertEquals("$$1", child.getReplacementName(""));
  }

  @Test
  public void testContextualRenamerStripConstIfReplacedAlwaysFalse() {
    ContextualRenamer root = new ContextualRenamer();
    assertFalse(root.stripConstIfReplaced());
    assertFalse(root.forChildScope().stripConstIfReplaced());
  }

  @Test
  public void testContextualRenamerGetReplacementNameUnknownReturnsNull() {
    ContextualRenamer root = new ContextualRenamer();
    assertNull(root.getReplacementName("never_declared"));
  }

  @Test(expected = NullPointerException.class)
  public void testContextualRenamerAddDeclaredNameNullThrowsNPE() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName(null); // name.equals(ARGUMENTS) กับ name == null
  }

  @Test
  public void testContextualRenamerGetReplacementNameNullIsGraceful() {
    ContextualRenamer root = new ContextualRenamer();
    assertNull(root.getReplacementName(null)); // HashMap#get(null) ไม่ throw
  }

  // ---------- BoilerplateRenamer ----------

  @Test
  public void testBoilerplateRenamerForChildScopeReturnsInlineRenamer() {
    BoilerplateRenamer br = new BoilerplateRenamer(constantSupplier("x"), "bp");
    Renamer child = br.forChildScope();
    assertTrue(child instanceof InlineRenamer);
  }

  @Test
  public void testBoilerplateRenamerGlobalBehaviorInheritedFromContextualRenamer() {
    BoilerplateRenamer br = new BoilerplateRenamer(constantSupplier("x"), "bp");
    br.addDeclaredName("g"); // global = true (default super()) -> ไม่เก็บ replacement
    assertNull(br.getReplacementName("g"));
  }

  // ---------- InlineRenamer ----------

  @Test(expected = IllegalArgumentException.class)
  public void testInlineRenamerConstructorEmptyPrefixThrows() {
    new InlineRenamer(constantSupplier("x"), "", false);
  }

  @Test
  public void testInlineRenamerConstructorNonEmptyPrefixDoesNotThrow() {
    new InlineRenamer(constantSupplier("x"), "p", false);
  }

  @Test(expected = IllegalStateException.class)
  public void testInlineRenamerAddDeclaredNameArgumentsThrows() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", false);
    ir.addDeclaredName(MakeDeclaredNamesUnique.ARGUMENTS);
  }

  @Test(expected = NullPointerException.class)
  public void testInlineRenamerAddDeclaredNameNullThrowsNPE() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", false);
    ir.addDeclaredName(null);
  }

  @Test
  public void testInlineRenamerGetReplacementNameNullIsGraceful() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", false);
    assertNull(ir.getReplacementName(null));
  }

  @Test
  public void testInlineRenamerAddDeclaredNameGeneratesUniqueName() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("42"), "p", false);
    ir.addDeclaredName("x");
    assertEquals("x$$p42", ir.getReplacementName("x")); // ไม่มี separator เดิม
  }

  @Test
  public void testInlineRenamerDuplicateAddDeclaredNameIsNoOp() {
    InlineRenamer ir = new InlineRenamer(sequentialSupplier(), "p", false);
    ir.addDeclaredName("x"); // ใช้ id "0" -> "x$$p0"
    ir.addDeclaredName("x"); // declarations.containsKey == true -> ต้องไม่ใช้ id "1"
    assertEquals("x$$p0", ir.getReplacementName("x"));
  }

  @Test
  public void testInlineRenamerGetUniqueNameEmptyNameUnchanged() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", false);
    ir.addDeclaredName("");
    assertEquals("", ir.getReplacementName("")); // name.isEmpty() -> return name
  }

  @Test
  public void testInlineRenamerGetUniqueNameTruncatesExistingSeparator() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("7"), "p", false);
    ir.addDeclaredName("foo$$1"); // มี separator เดิม -> ตัดก่อน lastIndexOf
    assertEquals("foo$$p7", ir.getReplacementName("foo$$1"));
  }

  @Test
  public void testInlineRenamerForChildScopeReturnsNewInstanceSameConstnessAndConfig() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", true);
    Renamer child = ir.forChildScope();
    assertNotSame(ir, child);
    assertTrue(child instanceof InlineRenamer);
    assertTrue(child.stripConstIfReplaced());

    child.addDeclaredName("y");
    assertEquals("y$$px", child.getReplacementName("y")); // supplier/idPrefix ถูกส่งต่อ
  }

  @Test
  public void testInlineRenamerStripConstIfReplacedTrue() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", true);
    assertTrue(ir.stripConstIfReplaced());
  }

  @Test
  public void testInlineRenamerStripConstIfReplacedFalse() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", false);
    assertFalse(ir.stripConstIfReplaced());
  }

  @Test
  public void testInlineRenamerGetReplacementNameUnknownReturnsNull() {
    InlineRenamer ir = new InlineRenamer(constantSupplier("x"), "p", false);
    assertNull(ir.getReplacementName("unknown"));
  }
}
