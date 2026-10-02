# การวิเคราะห์ Branch/Condition ของ SubTypeValidator

จากซอร์สโค้ด `validateSubType()` มี branch หลักดังนี้:

1. `full` อยู่ใน `_cfgIllegalClassNames` → throw
2. `full` ไม่อยู่ในชุด, `raw.isInterface()` == true → return (ไม่ throw)
3. `full` ไม่อยู่ในชุด, ไม่ใช่ interface, `!full.startsWith(PREFIX_SPRING)` → return
4. `full` ไม่อยู่ในชุด, ไม่ใช่ interface, ขึ้นต้นด้วย spring prefix, loop เจอ `"AbstractPointcutAdvisor"` → throw
5. เหมือน (4) แต่เจอ `"AbstractApplicationContext"` → throw
6. เหมือน (4) แต่ loop จบโดยไม่เจอ match (จนถึง Object) → return

เนื่องจาก classpath ที่ให้มาไม่มี library ของ Spring/Commons-Collections จริง จึงต้องสร้าง **fixture class** ขึ้นมาเองในแพ็กเกจ `org.springframework.*` เพื่อทดสอบ branch ที่เกี่ยวกับ Spring โดยเฉพาะ ส่วนกรณี illegal class name จะใช้คลาส JDK ที่มีอยู่จริงในลิสต์ (`java.util.logging.FileHandler`, `java.rmi.server.UnicastRemoteObject`)

---

## ไฟล์ Fixture (ต้องสร้างแยกไฟล์ตาม package ที่กำหนด)

```java
// File: src/test/java/org/springframework/beans/factory/config/AbstractPointcutAdvisor.java
package org.springframework.beans.factory.config;

/**
 * Fixture: คลาสจำลองที่มีชื่อ simple name ตรงกับที่ SubTypeValidator เช็ค
 * เพื่อทดสอบ branch การ throw เมื่อพบ "AbstractPointcutAdvisor"
 */
public class AbstractPointcutAdvisor {
}
```

```java
// File: src/test/java/org/springframework/context/support/AbstractApplicationContext.java
package org.springframework.context.support;

/**
 * Fixture: คลาสจำลองชื่อ "AbstractApplicationContext"
 */
public class AbstractApplicationContext {
}
```

```java
// File: src/test/java/org/springframework/util/SimpleSpringBean.java
package org.springframework.util;

/**
 * Fixture: คลาสในแพ็กเกจ spring แต่ไม่ตรงกับชื่อต้องห้ามใด ๆ
 * ใช้ทดสอบ branch ที่ loop ผ่านจนถึง Object แล้วไม่เจอ match
 */
public class SimpleSpringBean {
}
```

```java
// File: src/test/java/org/springframework/aop/support/ConcreteAdvisor.java
package org.springframework.aop.support;

import org.springframework.beans.factory.config.AbstractPointcutAdvisor;

/**
 * Fixture: subclass ที่ต้องเดิน superclass chain ขึ้นไปหลายชั้นกว่าจะเจอ match
 * เพื่อทดสอบว่า for-loop เดินถูกต้อง (มากกว่า 1 iteration)
 */
public class ConcreteAdvisor extends AbstractPointcutAdvisor {
}
```

```java
// File: src/test/java/org/springframework/util/SpringMarkerInterface.java
package org.springframework.util;

/**
 * Fixture: interface ในแพ็กเกจ spring
 * ใช้ทดสอบว่า isInterface() check มาก่อน (branch แรกใน if/else) แม้ full จะขึ้นต้นด้วย prefix spring
 */
public interface SpringMarkerInterface {
}
```

---

## SubTypeValidatorTest.java

```java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        // สมมติฐาน: JsonMappingException.from(ctxt, msg) internally เรียก ctxt.getParser()
        // ซึ่ง mock จะ return null โดย default และ constructor ของ JsonMappingException
        // รองรับ parser = null ได้ (ไม่ได้ตรวจสอบจากซอร์สที่ให้มาโดยตรง)
        ctxt = mock(DeserializationContext.class);
    }

    // ---------- Singleton ----------

    @Test
    public void testInstanceReturnsSameSingleton() {
        SubTypeValidator v1 = SubTypeValidator.instance();
        SubTypeValidator v2 = SubTypeValidator.instance();
        assertSame("instance() ต้อง return singleton เดียวกันทุกครั้ง", v1, v2);
    }

    // ---------- Branch 1: อยู่ใน DEFAULT_NO_DESER_CLASS_NAMES -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassName_FileHandler_Throws() throws Exception {
        // java.util.logging.FileHandler อยู่ใน DEFAULT_NO_DESER_CLASS_NAMES
        JavaType type = TypeFactory.defaultInstance()
                .constructType(java.util.logging.FileHandler.class);
        validator.validateSubType(ctxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testIllegalClassName_UnicastRemoteObject_Throws() throws Exception {
        // java.rmi.server.UnicastRemoteObject อยู่ใน DEFAULT_NO_DESER_CLASS_NAMES เช่นกัน
        JavaType type = TypeFactory.defaultInstance()
                .constructType(java.rmi.server.UnicastRemoteObject.class);
        validator.validateSubType(ctxt, type);
    }

    @Test
    public void testIllegalClassName_MessageContainsClassName() {
        try {
            JavaType type = TypeFactory.defaultInstance()
                    .constructType(java.util.logging.FileHandler.class);
            validator.validateSubType(ctxt, type);
            fail("ควร throw JsonMappingException");
        } catch (JsonMappingException e) {
            assertTrue("message ควรมีชื่อคลาสที่ผิดกฎ",
                    e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    // ---------- Branch 2: raw.isInterface() == true -> ไม่ throw ----------

    @Test
    public void testInterfaceType_NotInIllegalSet_DoesNotThrow() throws Exception {
        // java.util.Map เป็น interface ธรรมดา ไม่อยู่ใน illegal set, ไม่ใช่ spring
        JavaType type = TypeFactory.defaultInstance().constructType(java.util.Map.class);
        validator.validateSubType(ctxt, type); // ไม่ควร throw
    }

    @Test
    public void testSpringInterfaceType_DoesNotThrow() throws Exception {
        // แม้ full จะขึ้นต้นด้วย "org.springframework." แต่เป็น interface
        // ตรวจ isInterface() ก่อน จึงไม่เข้า else-if ของ spring logic เลย -> ไม่ throw
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.util.SpringMarkerInterface.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 3: ไม่ interface, ไม่ขึ้นต้นด้วย spring prefix -> ไม่ throw ----------

    @Test
    public void testNonSpringClass_DoesNotThrow() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        validator.validateSubType(ctxt, type);
    }

    @Test
    public void testPrimitiveType_BoundaryCase_DoesNotThrow() throws Exception {
        // boundary: primitive type, full = "int", isInterface() = false, ไม่ตรง spring prefix
        JavaType type = TypeFactory.defaultInstance().constructType(int.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 4: spring prefix, match "AbstractPointcutAdvisor" -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testSpringClass_MatchesAbstractPointcutAdvisor_Throws() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.beans.factory.config.AbstractPointcutAdvisor.class);
        validator.validateSubType(ctxt, type);
    }

    @Test(expected = JsonMappingException.class)
    public void testSpringSubclass_MatchesAncestorAbstractPointcutAdvisor_Throws() throws Exception {
        // ทดสอบว่า for-loop เดินขึ้นไปหลาย superclass จนเจอ match (มากกว่า 1 iteration)
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.aop.support.ConcreteAdvisor.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 5: spring prefix, match "AbstractApplicationContext" -> throw ----------

    @Test(expected = JsonMappingException.class)
    public void testSpringClass_MatchesAbstractApplicationContext_Throws() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.context.support.AbstractApplicationContext.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch 6: spring prefix, loop จบโดยไม่เจอ match -> ไม่ throw ----------

    @Test
    public void testSpringClass_NoMatch_DoesNotThrow() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(org.springframework.util.SimpleSpringBean.class);
        validator.validateSubType(ctxt, type); // ไม่ควร throw
    }

    // ---------- Null / boundary ----------

    @Test(expected = NullPointerException.class)
    public void testNullType_ThrowsNPE() throws Exception {
        // ซอร์สไม่ได้ null-check type ก่อนเรียก type.getRawClass()
        // จึงคาดว่าจะเกิด NullPointerException (ไม่ใช่ JsonMappingException)
        validator.validateSubType(ctxt, null);
    }
}
```

---

## สรุปตาราง Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testInstanceReturnsSameSingleton` | ตรวจ singleton pattern ของ `instance()` |
| `testIllegalClassName_FileHandler_Throws` | Branch 1: `full` อยู่ใน `_cfgIllegalClassNames` → throw |
| `testIllegalClassName_UnicastRemoteObject_Throws` | Branch 1 (กรณีคลาส illegal อีกตัว เพื่อยืนยัน set lookup) |
| `testIllegalClassName_MessageContainsClassName` | ตรวจเนื้อหา exception message (`String.format`) |
| `testInterfaceType_NotInIllegalSet_DoesNotThrow` | Branch 2: `raw.isInterface() == true` (ไม่ใช่ spring) → return |
| `testSpringInterfaceType_DoesNotThrow` | Branch 2 ร่วมกับ full ขึ้นต้นด้วย spring prefix → ยืนยันว่า isInterface() check มาก่อน else-if |
| `testNonSpringClass_DoesNotThrow` | Branch 3: ไม่ interface, ไม่ขึ้นต้น spring prefix → return |
| `testPrimitiveType_BoundaryCase_DoesNotThrow` | Branch 3 (boundary: primitive type `int`) |
| `testSpringClass_MatchesAbstractPointcutAdvisor_Throws` | Branch 4: loop เจอ `"AbstractPointcutAdvisor"` ทันทีที่ cls=raw → throw (break main_check) |
| `testSpringSubclass_MatchesAncestorAbstractPointcutAdvisor_Throws` | Branch 4 + ทดสอบ for-loop เดินหลาย iteration ก่อนเจอ match |
| `testSpringClass_MatchesAbstractApplicationContext_Throws` | Branch 5: loop เจอ `"AbstractApplicationContext"` → throw |
| `testSpringClass_NoMatch_DoesNotThrow` | Branch 6: loop เดินจนถึง `Object.class` โดยไม่เจอ match → return |
| `testNullType_ThrowsNPE` | Boundary/null-input: ไม่มี null-check ในซอร์ส → คาด NPE (ไม่ใช่ JsonMappingException) |

**หมายเหตุ:**
- ต้องสร้างไฟล์ fixture (`AbstractPointcutAdvisor`, `AbstractApplicationContext`, `SimpleSpringBean`, `ConcreteAdvisor`, `SpringMarkerInterface`) ไว้ใน package `org.springframework.*` จริงตาม path ที่ระบุ เนื่องจาก classpath ที่ให้มาไม่มี Spring Framework จริง
- พฤติกรรมของ `JsonMappingException.from(ctxt, msg)` เมื่อ `ctxt.getParser()` return `null` (จาก mock) เป็นสมมติฐานที่ไม่ได้ตรวจสอบจาก source ที่ให้มาโดยตรง — หากมี NPE เกิดขึ้นจริงในสภาพแวดล้อมทดสอบ อาจต้อง stub `getParser()` ให้ return mock ของ `JsonParser` เพิ่มเติม