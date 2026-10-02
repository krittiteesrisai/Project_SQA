package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenameInverter;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * หมายเหตุ: คลาสเป้าหมาย MakeDeclaredNamesUnique เป็น package-private
 * (ไม่มี public modifier) จึงไม่มี import statement สำหรับตัวมันเอง
 * (อยู่ package เดียวกันโดยอัตโนมัติ) แต่มีการ import "nested class"
 * ของมันเพื่อใช้ simple name ได้สะดวก ซึ่งเป็นไวยากรณ์ Java ที่ถูกต้อง
 */
public class MakeDeclaredNamesUniqueTest {

  // =====================================================================
  // ContextualRenamer
  // =====================================================================

  @Test
  public void testContextualRenamer_GlobalNeverProvidesReplacement() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName("a");
    root.addDeclaredName("a"); // เรียกซ้ำต้องไม่ throw
    // branch global=true: มีการ reserveName เท่านั้น ไม่มีการ put ลง declarations
    assertNull(root.getReplacementName("a"));
  }

  @Test
  public void testContextualRenamer_GetReplacementNameUnknownReturnsNull() {
    ContextualRenamer root = new ContextualRenamer();
    assertNull(root.getReplacementName("neverDeclared"));
  }

  @Test
  public void testContextualRenamer_ChildDoesNotRenameFirstUnseenName() {
    ContextualRenamer root = new ContextualRenamer();
    Renamer child = root.forChildScope();
    child.addDeclaredName("b"); // ไม่เคยมีใครใช้ชื่อนี้ -> id == 0
    assertNull(child.getReplacementName("b"));
  }

  @Test
  public void testContextualRenamer_ChildRenamesWhenNameAlreadyReserved() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName("a"); // reserve ที่ global scope -> count=1
    Renamer child = root.forChildScope();
    child.addDeclaredName("a"); // ชนกับชื่อที่ reserve ไว้ -> id == 1
    assertEquals("a" + ContextualRenamer.UNIQUE_ID_SEPARATOR + "1",
        child.getReplacementName("a"));
  }

  @Test
  public void testContextualRenamer_MultipleChildScopesIncrementSequentially() {
    ContextualRenamer root = new ContextualRenamer();
    root.addDeclaredName("a"); // count=1
    Renamer child1 = root.forChildScope();
    child1.addDeclaredName("a");
    Renamer child2 = root.forChildScope();
    child2.addDeclaredName("a");

    assertEquals("a$$1", child1.getReplacementName("a"));
    assertEquals("a$$2", child2.getReplacementName("a"));
  }

  @Test
  public void testContextualRenamer_RepeatedAddDeclaredNameSameScopeIsIdempotent() {
    ContextualRenamer root = new ContextualRenamer(); // ไม่ declare "b" ที่ global
    Renamer child = root.forChildScope();
    child.addDeclaredName("b"); // id=0 -> null, เพิ่ม usage count เป็น 1
    child.addDeclaredName("b"); // guard ด้วย declarations.containsKey -> ไม่เพิ่มซ้ำ
    assertNull(child.getReplacementName("b"));

    Renamer sibling = root.forChildScope();
    sibling.addDeclaredName("b");
    // ถ้า guard ทำงานถูกต้อง sibling ควรได้ id=1 (ไม่ใช่ 2)
    assertEquals("b$$1", sibling.getReplacementName("b"));
  }

  @Test
  public void testContextualRenamer_StripConstIfReplacedAlwaysFalse() {
    ContextualRenamer root = new ContextualRenamer();
    assertFalse(root.stripConstIfReplaced());
    Renamer child = root.forChildScope();
    assertFalse(child.stripConstIfReplaced());
  }

  @Test
  public void testContextualRenamer_ForChildScopeReturnsIndependentInstance() {
    ContextualRenamer root = new ContextualRenamer();
    Renamer child = root.forChildScope();
    assertNotNull(child);
    assertNotSame(root, child);
  }

  // =====================================================================
  // InlineRenamer
  // =====================================================================

  private Supplier<String> counterSupplier() {
    return new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return String.valueOf(counter++);
      }
    };
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInlineRenamer_ConstructorRejectsEmptyPrefix() {
    new InlineRenamer(counterSupplier(), "", false);
  }

  @Test(expected = NullPointerException.class)
  public void testInlineRenamer_ConstructorNullPrefixThrows() {
    // idPrefix.isEmpty() จะ NPE ทันทีถ้า idPrefix เป็น null (malformed input)
    new InlineRenamer(counterSupplier(), null, false);
  }

  @Test
  public void testInlineRenamer_AddDeclaredNameBasic() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", false);
    renamer.addDeclaredName("x");
    assertEquals("x$$pre_0", renamer.getReplacementName("x"));
  }

  @Test
  public void testInlineRenamer_AddDeclaredNameStripsExistingSeparatorSuffix() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", false);
    renamer.addDeclaredName("y$$5"); // มี separator เดิม ต้องถูกตัดก่อนแปะใหม่
    assertEquals("y$$pre_0", renamer.getReplacementName("y$$5"));
  }

  @Test
  public void testInlineRenamer_AddDeclaredNameEmptyNameUnchanged() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", false);
    renamer.addDeclaredName("");
    // ชื่อว่าง -> getUniqueName คืนค่าเดิม (ไม่แปลง)
    assertEquals("", renamer.getReplacementName(""));
  }

  @Test
  public void testInlineRenamer_AddDeclaredNameDoesNotOverwriteExisting() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", false);
    renamer.addDeclaredName("x");
    String first = renamer.getReplacementName("x");
    renamer.addDeclaredName("x"); // เรียกซ้ำต้องไม่เปลี่ยนค่าที่บันทึกไว้แล้ว
    assertEquals(first, renamer.getReplacementName("x"));
  }

  @Test
  public void testInlineRenamer_ForChildScopeHasIndependentDeclarations() {
    InlineRenamer parent = new InlineRenamer(counterSupplier(), "pre_", false);
    Renamer child = parent.forChildScope();
    assertNotSame(parent, child);
    child.addDeclaredName("x");
    // แต่ละ InlineRenamer มี declarations แยกกันคนละ map (ต่าง ContextualRenamer)
    assertNull(parent.getReplacementName("x"));
    assertNotNull(child.getReplacementName("x"));
  }

  @Test
  public void testInlineRenamer_StripConstIfReplacedTrue() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", true);
    assertTrue(renamer.stripConstIfReplaced());
  }

  @Test
  public void testInlineRenamer_StripConstIfReplacedFalse() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", false);
    assertFalse(renamer.stripConstIfReplaced());
  }

  @Test
  public void testInlineRenamer_GetReplacementNameUnknownReturnsNull() {
    InlineRenamer renamer = new InlineRenamer(counterSupplier(), "pre_", false);
    assertNull(renamer.getReplacementName("neverDeclared"));
  }

  // =====================================================================
  // ContextualRenameInverter.getOrginalName (public static -> เทสตรงได้)
  // =====================================================================

  @Test
  public void testGetOriginalName_NoSeparatorReturnsSameString() {
    assertEquals("abc", ContextualRenameInverter.getOrginalName("abc"));
  }

  @Test
  public void testGetOriginalName_WithSingleSeparator() {
    assertEquals("abc", ContextualRenameInverter.getOrginalName("abc$$3"));
  }

  @Test
  public void testGetOriginalName_WithMultipleSeparatorsUsesLastOccurrence() {
    // ต้องใช้ lastIndexOf (ตัวสุดท้าย) ไม่ใช่ indexOf (ตัวแรก)
    assertEquals("a$$b", ContextualRenameInverter.getOrginalName("a$$b$$2"));
  }

  @Test
  public void testGetOriginalName_EmptyStringReturnsEmpty() {
    assertEquals("", ContextualRenameInverter.getOrginalName(""));
  }

  @Test
  public void testGetOriginalName_SeparatorAtStart() {
    assertEquals("", ContextualRenameInverter.getOrginalName("$$1"));
  }

  @Test
  public void testGetOriginalName_OverlappingSeparators() {
    // "$$$$" -> lastIndexOf("$$") = 2 -> substring(0,2) = "$$"
    assertEquals("$$", ContextualRenameInverter.getOrginalName("$$$$"));
  }

  @Test(expected = NullPointerException.class)
  public void testGetOriginalName_NullNameThrowsNPE() {
    ContextualRenameInverter.getOrginalName(null);
  }

  // =====================================================================
  // MakeDeclaredNamesUnique - constructors (ตรวจผ่าน reflection เพราะ field private)
  // =====================================================================

  @Test
  public void testDefaultConstructorUsesContextualRenamer() throws Exception {
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    Field f = MakeDeclaredNamesUnique.class.getDeclaredField("rootRenamer");
    f.setAccessible(true);
    Object rootRenamer = f.get(pass);
    assertTrue(rootRenamer instanceof ContextualRenamer);
  }

  @Test
  public void testCustomRenamerConstructorStoresProvidedRenamer() throws Exception {
    Renamer dummy = new Renamer() {
      @Override public void addDeclaredName(String name) { }
      @Override public String getReplacementName(String oldName) { return null; }
      @Override public boolean stripConstIfReplaced() { return false; }
      @Override public Renamer forChildScope() { return this; }
    };
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique(dummy);
    Field f = MakeDeclaredNamesUnique.class.getDeclaredField("rootRenamer");
    f.setAccessible(true);
    Object rootRenamer = f.get(pass);
    assertSame(dummy, rootRenamer);
  }

  // =====================================================================
  // getContextualRenameInverter: เมธอดนี้ไม่มี branch ภายในตัวเอง
  // (return new ContextualRenameInverter(compiler);) จึงทดสอบแค่ wiring
  // =====================================================================

  @Test
  public void testGetContextualRenameInverterReturnsNonNullPass() {
    // สมมติฐาน (ไม่ปรากฏ signature ในซอร์สที่ให้มาโดยตรง):
    // com.google.javascript.jscomp.Compiler มี public no-arg constructor
    // และสามารถส่งเป็นพารามิเตอร์ AbstractCompiler ได้ตามโครงสร้างจริงของโปรเจกต์
    CompilerPass pass = MakeDeclaredNamesUnique.getContextualRenameInverter(new Compiler());
    assertNotNull(pass);
    assertTrue(pass instanceof ContextualRenameInverter);
  }
}
