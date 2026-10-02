# UnsafeAllocatorTest

## หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4)

คลาส `UnsafeAllocator.create()` เป็น static factory ที่มี logic แบบ try/catch ซ้อนกัน 3 ชั้น (sun.misc.Unsafe → dalvikvm post-gingerbread → dalvikvm pre-gingerbread → give up) โดย**ไม่มีจุด injection**ให้ควบคุมว่าจะ trigger branch ใด และใน classpath ที่กำหนดให้ **ไม่มี mocking framework** (เช่น PowerMock) ที่สามารถ mock `Class.forName`/reflection แบบ static ได้

ดังนั้นในสภาพแวดล้อม JVM มาตรฐาน (HotSpot, Java 6/7/8 ตามที่ Defects4J ใช้) `sun.misc.Unsafe` จะพร้อมใช้งานเสมอ → branch แรกของ `create()` จะสำเร็จเสมอในทางปฏิบัติ เราจึงทดสอบผ่าน **public behavior** ของ `newInstance()` ซึ่งสะท้อนผลของ implementation ที่ถูกเลือกจริง โดยไม่ assume internal branch ที่ไม่สามารถพิสูจน์ได้จาก black-box testing

```java
package com.google.gson.internal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UnsafeAllocatorTest {

  private UnsafeAllocator allocator;

  @Before
  public void setUp() {
    allocator = UnsafeAllocator.create();
  }

  // ---------- Helper test classes ----------

  /** คลาสปกติที่มี public no-arg constructor ซึ่ง set ค่า field ต่างจาก default */
  public static class NormalClass {
    int value = 5;
    public NormalClass() {
      value = 10;
    }
  }

  /** คลาสที่ constructor throw exception ถ้าถูกเรียกจริง - ใช้พิสูจน์ว่า UnsafeAllocator bypass constructor */
  public static class ThrowingConstructorClass {
    int marker = -1;
    public ThrowingConstructorClass() {
      throw new RuntimeException("Constructor should not be called by UnsafeAllocator");
    }
  }

  /** คลาสที่มี private constructor และ final field */
  public static class PrivateConstructorClass {
    final int finalField;
    private PrivateConstructorClass() {
      finalField = 99;
    }
  }

  /** Abstract class - ไม่สามารถ allocate ได้ */
  public abstract static class AbstractClass {
    public abstract void doSomething();
  }

  /** Interface - ไม่สามารถ allocate ได้ */
  public interface SimpleInterface {
    void doSomething();
  }

  // ---------- Tests: create() ----------

  @Test
  public void testCreateReturnsNonNullInstance() {
    // create() ต้องไม่ return null ในทุกกรณี เนื่องจากมี fallback "give up" เสมอ
    assertNotNull("create() should never return null", allocator);
  }

  @Test
  public void testCreateReturnsUsableInstanceOnMultipleCalls() throws Exception {
    UnsafeAllocator a1 = UnsafeAllocator.create();
    UnsafeAllocator a2 = UnsafeAllocator.create();
    assertNotNull(a1);
    assertNotNull(a2);
    // ตรวจสอบว่าทั้งสอง instance ใช้งานได้จริง (ไม่ throw ตอน allocate class ปกติ)
    assertNotNull(a1.newInstance(NormalClass.class));
    assertNotNull(a2.newInstance(NormalClass.class));
  }

  // ---------- Tests: newInstance() - happy path / boundary ----------

  @Test
  public void testNewInstanceWithNormalClass_ConstructorBypassed() throws Exception {
    NormalClass instance = allocator.newInstance(NormalClass.class);
    assertNotNull(instance);
    // จุดประสงค์หลักของ UnsafeAllocator คือ bypass constructor
    // ถ้า constructor ถูกเรียกจริง value จะเป็น 10 แต่ควรเป็นค่า default (0)
    assertEquals("Constructor should be bypassed, value should remain default 0",
        0, instance.value);
  }

  @Test
  public void testNewInstanceBypassesThrowingConstructor() throws Exception {
    // ถ้า constructor ถูกเรียกจริง test นี้จะ fail ด้วย RuntimeException
    ThrowingConstructorClass instance = allocator.newInstance(ThrowingConstructorClass.class);
    assertNotNull(instance);
    assertEquals(0, instance.marker); // ค่า default เพราะ constructor ไม่ได้ถูกเรียก
  }

  @Test
  public void testNewInstanceWithPrivateConstructor_FinalFieldNotInitialized() throws Exception {
    PrivateConstructorClass instance = allocator.newInstance(PrivateConstructorClass.class);
    assertNotNull(instance);
    // final field ไม่ควรถูก initialize เพราะ constructor ไม่ได้ถูกเรียก -> ค่า default int = 0
    assertEquals(0, instance.finalField);
  }

  @Test
  public void testNewInstanceWithJdkClass() throws Exception {
    // ทดสอบกับคลาสมาตรฐานของ JDK ที่มี constructor ทำงานหนัก (String)
    String s = allocator.newInstance(String.class);
    assertNotNull(s);
  }

  // ---------- Tests: newInstance() - error / malformed input ----------

  @Test(expected = Exception.class)
  public void testNewInstanceOnAbstractClassThrowsException() throws Exception {
    // การ allocate abstract class ควรล้มเหลว (InstantiationException หรือ exception อื่นตาม branch ที่ใช้จริง)
    allocator.newInstance(AbstractClass.class);
  }

  @Test(expected = Exception.class)
  public void testNewInstanceOnInterfaceThrowsException() throws Exception {
    // การ allocate interface ควรล้มเหลวเช่นเดียวกับ abstract class
    allocator.newInstance(SimpleInterface.class);
  }

  @Test(expected = Exception.class)
  public void testNewInstanceOnPrimitiveClassThrowsException() throws Exception {
    // primitive type ไม่สามารถ allocate ได้ผ่าน mechanism ใด ๆ ที่คลาสนี้ใช้
    allocator.newInstance(int.class);
  }

  @Test(expected = Exception.class)
  public void testNewInstanceOnArrayClassThrowsException() throws Exception {
    // array class เป็นอินพุตผิดรูปแบบสำหรับ allocator นี้ ควร throw exception
    allocator.newInstance(int[].class);
  }

  @Test
  public void testNewInstanceOnNullClass_ThrowsSomeException() {
    // อินพุต null ไม่ได้ถูกระบุ behavior ไว้ในซอร์ส (ไม่มีการเช็ค null ก่อนใช้งาน)
    // คาดว่าจะเกิด NullPointerException หรือ Exception อื่นจาก reflective call ภายใน
    // (ไม่ assume ชนิด exception เจาะจง เนื่องจากไม่มีการระบุไว้ในซอร์สโค้ดต้นทาง)
    try {
      allocator.newInstance(null);
      fail("Expected an exception when passing null class");
    } catch (Exception e) {
      // ผ่าน - ยืนยันเพียงว่าเกิด exception ตามที่คาดจาก reflective invocation กับ null
      assertNotNull(e);
    }
  }

  // ---------- Test: "give up" branch (documented limitation) ----------

  @Test
  public void testGiveUpBranchNotDirectlyTestable() {
    // ไม่สามารถบังคับให้ create() เข้า branch "give up" ได้โดยตรงในสภาพแวดล้อมนี้
    // เนื่องจากไม่มี mocking framework สำหรับ static reflection calls (Class.forName, getMethod)
    // ใน classpath ที่กำหนด (มีเพียง JUnit/Hamcrest/JSR305)
    // ตาม contract ของโค้ด: หาก allocator เป็น instance จาก branch นี้
    // การเรียก newInstance(c) จะ throw UnsupportedOperationException("Cannot allocate " + c)
    // จึงบันทึกไว้เป็นข้อจำกัดของการทดสอบ (ข้อกำหนดที่ 4)
    assertTrue("Documented limitation: cannot force 'give up' branch without mocking", true);
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testCreateReturnsNonNullInstance` | `create()` ต้อง return ไม่ null (fallback contract ของทุก branch) |
| `testCreateReturnsUsableInstanceOnMultipleCalls` | เรียก `create()` ซ้ำ, ยืนยันแต่ละ instance ทำงานได้ (branch สำเร็จของ Unsafe path ซ้ำหลายครั้ง) |
| `testNewInstanceWithNormalClass_ConstructorBypassed` | `newInstance()` success path — พิสูจน์ constructor ถูก bypass (branch สำเร็จของ implementation ที่ถูกเลือกใน `create()`) |
| `testNewInstanceBypassesThrowingConstructor` | เดียวกัน แต่กรณี constructor throw exception ถ้าถูกเรียก — ยืนยัน behavior การ bypass |
| `testNewInstanceWithPrivateConstructor_FinalFieldNotInitialized` | success path กับ private constructor + final field (boundary: field ไม่ถูก initialize) |
| `testNewInstanceWithJdkClass` | success path กับคลาส JDK จริง (String) |
| `testNewInstanceOnAbstractClassThrowsException` | error path: abstract class → exception (if-condition ภายใน `allocateInstance`/native impl) |
| `testNewInstanceOnInterfaceThrowsException` | error path: interface → exception |
| `testNewInstanceOnPrimitiveClassThrowsException` | boundary/malformed input: primitive type → exception |
| `testNewInstanceOnArrayClassThrowsException` | boundary/malformed input: array type → exception |
| `testNewInstanceOnNullClass_ThrowsSomeException` | ค่า null input → exception (ไม่มีการเช็ค null ในซอร์ส ทดสอบ behavior ที่เกิดขึ้นจริง) |
| `testGiveUpBranchNotDirectlyTestable` | บันทึก limitation ของ branch "give up" ใน `create()` ที่ไม่สามารถ trigger ได้โดยไม่ mock reflection static calls |

**ข้อจำกัดที่ระบุไว้ชัดเจน:** branch ที่ 2 (dalvikvm post-gingerbread), branch ที่ 3 (dalvikvm pre-gingerbread) และ branch สุดท้าย ("give up") ของ `create()` ไม่สามารถถูก cover ได้จริงในการทดสอบแบบ black-box บน standard JVM เนื่องจาก branch แรก (`sun.misc.Unsafe`) จะสำเร็จเสมอในสภาพแวดล้อมนี้ และไม่มี mocking tool ใน classpath ที่อนุญาตให้บังคับ `Class.forName`/`getDeclaredMethod` ให้ throw exception ได้