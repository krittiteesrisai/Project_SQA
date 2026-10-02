# แนวทางการทดสอบ

จากการวิเคราะห์ซอร์สของ `SubTypeValidator.validateSubType()` พบ branch หลัก ๆ ดังนี้:

1. `_cfgIllegalClassNames.contains(full)` → **true** → throw
2. `_cfgIllegalClassNames.contains(full)` → **false** และ `full.startsWith(PREFIX_STRING)` → **false** → return (ไม่ throw)
3. `full.startsWith(PREFIX_STRING)` → **true** แล้ววน `for` loop ไล่ superclass:
   - เจอ `"AbstractPointcutAdvisor"` → break → throw
   - เจอ `"AbstractApplicationContext"` → break → throw
   - ไม่เจอเลย (loop จบที่ `Object.class`) → falls through ไป `return;` → ไม่ throw
4. Edge case ที่ไม่มีการป้องกันใน source: ถ้า `raw` เป็น **interface** ภายใต้ prefix `org.springframework.` การเรียก `getSuperclass()` จะได้ `null` (ไม่ใช่ `Object.class`) ทำให้ loop รันต่อและเกิด `NullPointerException` ที่ `cls.getSimpleName()` — นี่คือพฤติกรรมจริงที่อนุมานได้ตรงจาก logic ของ source (ไม่ใช่การเดา) จึงใช้เป็น fault-detecting test

เนื่องจาก `AbstractPointcutAdvisor` / `AbstractApplicationContext` ของ Spring framework ไม่มีอยู่ใน classpath ที่กำหนด จึงต้องสร้างคลาส stub ภายใต้ package `org.springframework.*` เพื่อจำลอง class-hierarchy ให้ตรงกับเงื่อนไขใน source code (มีชื่อ simple name ตรงกับที่โค้ดตรวจ และ full name ขึ้นต้นด้วย `org.springframework.`)

---

## ไฟล์ Helper (จำเป็นสำหรับทดสอบ branch ที่เกี่ยวกับ Spring-prefix logic)

```java
// FILE: src/test/java/org/springframework/aop/support/AbstractPointcutAdvisor.java
package org.springframework.aop.support;

// Stub เพื่อจำลองชื่อคลาสที่ SubTypeValidator ตรวจด้วย simpleName
public abstract class AbstractPointcutAdvisor {
}
```

```java
// FILE: src/test/java/org/springframework/aop/support/SamplePointcutAdvisorSub.java
package org.springframework.aop.support;

public class SamplePointcutAdvisorSub extends AbstractPointcutAdvisor {
}
```

```java
// FILE: src/test/java/org/springframework/aop/support/GrandChildPointcutAdvisor.java
package org.springframework.aop.support;

// ใช้ทดสอบว่า loop ไล่ superclass มากกว่า 1 ระดับได้ถูกต้อง
public class GrandChildPointcutAdvisor extends SamplePointcutAdvisorSub {
}
```

```java
// FILE: src/test/java/org/springframework/context/support/AbstractApplicationContext.java
package org.springframework.context.support;

public abstract class AbstractApplicationContext {
}
```

```java
// FILE: src/test/java/org/springframework/context/support/SampleApplicationContextSub.java
package org.springframework.context.support;

public class SampleApplicationContextSub extends AbstractApplicationContext {
}
```

```java
// FILE: src/test/java/org/springframework/util/SafeSpringClass.java
package org.springframework.util;

// คลาสที่อยู่ภายใต้ prefix org.springframework. แต่ไม่ match ชื่อต้องห้ามใด ๆ
public class SafeSpringClass {
}
```

```java
// FILE: src/test/java/org/springframework/util/SpringInterfaceMarker.java
package org.springframework.util;

// ใช้ทดสอบ edge case: interface ภายใต้ prefix org.springframework.
// getSuperclass() ของ interface คืนค่า null -> คาดว่าจะเกิด NullPointerException
// ตาม logic จริงของ source (ไม่ได้มีการป้องกันกรณีนี้)
public interface SpringInterfaceMarker {
}
```

---

## ไฟล์ทดสอบหลัก

```java
// FILE: src/test/java/com/fasterxml/jackson/databind/jsontype/impl/SubTypeValidatorTest.java
package com.fasterxml.jackson.databind.jsontype.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.SamplePointcutAdvisorSub;
import org.springframework.aop.support.GrandChildPointcutAdvisor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.SampleApplicationContextSub;
import org.springframework.util.SafeSpringClass;
import org.springframework.util.SpringInterfaceMarker;

public class SubTypeValidatorTest {

    private SubTypeValidator validator;
    private DeserializationContext ctxt;

    @Before
    public void setUp() {
        validator = SubTypeValidator.instance();
        ctxt = mock(DeserializationContext.class);
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private JavaType mockJavaTypeFor(Class<?> cls) {
        JavaType type = mock(JavaType.class);
        when(type.getRawClass()).thenReturn((Class) cls);
        return type;
    }

    // ---------- Singleton ----------

    @Test
    public void testInstanceIsSingleton() {
        SubTypeValidator i1 = SubTypeValidator.instance();
        SubTypeValidator i2 = SubTypeValidator.instance();
        assertSame("instance() ต้อง return singleton เดียวกันเสมอ", i1, i2);
    }

    // ---------- Branch A: contains(full) == true -> throw ----------

    @Test
    public void testIllegalClassName_UnicastRemoteObject_throws() throws Exception {
        JavaType type = mockJavaTypeFor(java.rmi.server.UnicastRemoteObject.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw JsonMappingException เนื่องจากอยู่ใน DEFAULT_NO_DESER_CLASS_NAMES");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.rmi.server.UnicastRemoteObject"));
        }
    }

    @Test
    public void testIllegalClassName_FileHandler_throws() throws Exception {
        JavaType type = mockJavaTypeFor(java.util.logging.FileHandler.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw JsonMappingException เนื่องจากอยู่ใน DEFAULT_NO_DESER_CLASS_NAMES");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("java.util.logging.FileHandler"));
        }
    }

    // ---------- Branch B: not illegal, not startsWith prefix -> return (no throw) ----------

    @Test
    public void testLegalNonSpringClass_noException() throws Exception {
        JavaType type = mockJavaTypeFor(String.class);
        // ไม่ควร throw อะไรเลย
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch C: startsWith(prefix) true, loop ไม่เจอ match -> return (no throw) ----------

    @Test
    public void testSpringPrefix_NoMatchingSuperclass_noException() throws Exception {
        JavaType type = mockJavaTypeFor(SafeSpringClass.class);
        // full ขึ้นต้นด้วย org.springframework. แต่ superclass chain ไม่มีชื่อต้องห้าม
        validator.validateSubType(ctxt, type);
    }

    // ---------- Branch D: startsWith(prefix) true, raw ตรง "AbstractPointcutAdvisor" ทันที -> throw ----------

    @Test
    public void testSpringPrefix_DirectAbstractPointcutAdvisor_throws() throws Exception {
        JavaType type = mockJavaTypeFor(AbstractPointcutAdvisor.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ simpleName ตรงกับ AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("AbstractPointcutAdvisor"));
        }
    }

    // ---------- Branch D2: loop ไล่ superclass 1 ชั้นก่อนเจอ match -> throw ----------

    @Test
    public void testSpringPrefix_OneLevelUp_MatchAbstractPointcutAdvisor_throws() throws Exception {
        JavaType type = mockJavaTypeFor(SamplePointcutAdvisorSub.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ superclass ชื่อ AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("SamplePointcutAdvisorSub"));
        }
    }

    // ---------- Branch D3: loop ไล่ superclass 2 ชั้นก่อนเจอ match -> throw ----------

    @Test
    public void testSpringPrefix_TwoLevelsUp_MatchAbstractPointcutAdvisor_throws() throws Exception {
        JavaType type = mockJavaTypeFor(GrandChildPointcutAdvisor.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ superclass ระดับปู่ชื่อ AbstractPointcutAdvisor");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("GrandChildPointcutAdvisor"));
        }
    }

    // ---------- Branch E: OR เงื่อนไขที่สอง "AbstractApplicationContext" ตรงโดยตรง -> throw ----------

    @Test
    public void testSpringPrefix_DirectAbstractApplicationContext_throws() throws Exception {
        JavaType type = mockJavaTypeFor(AbstractApplicationContext.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ simpleName ตรงกับ AbstractApplicationContext");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("AbstractApplicationContext"));
        }
    }

    // ---------- Branch E2: OR เงื่อนไขที่สอง ผ่าน superclass 1 ชั้น -> throw ----------

    @Test
    public void testSpringPrefix_OneLevelUp_MatchAbstractApplicationContext_throws() throws Exception {
        JavaType type = mockJavaTypeFor(SampleApplicationContextSub.class);
        try {
            validator.validateSubType(ctxt, type);
            fail("ควร throw เพราะ superclass ชื่อ AbstractApplicationContext");
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains("SampleApplicationContextSub"));
        }
    }

    // ---------- Edge case: interface ภายใต้ prefix -> NPE (fault-detecting, derived directly from source logic) ----------

    @Test(expected = NullPointerException.class)
    public void testSpringPrefix_InterfaceCausesNPE_dueToGetSuperclassNull() throws Exception {
        // หมายเหตุ: source ไม่มีการตรวจ isInterface() ก่อนเข้า for-loop
        // ดังนั้นเมื่อ raw เป็น interface, getSuperclass() จะ return null
        // ทำให้เกิด NullPointerException ที่ cls.getSimpleName() ในรอบถัดไป
        // พฤติกรรมนี้อนุมานได้ตรงจาก source code จริง ไม่ใช่การเดา
        JavaType type = mockJavaTypeFor(SpringInterfaceMarker.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Boundary: raw class == Object.class (ไม่ illegal, ไม่ spring prefix) ----------

    @Test
    public void testRawClassIsObject_noException() throws Exception {
        JavaType type = mockJavaTypeFor(Object.class);
        validator.validateSubType(ctxt, type);
    }

    // ---------- Null getRawClass(): ผิดรูปแบบ/ไม่คาดคิด -> NullPointerException จาก raw.getName() ----------

    @Test(expected = NullPointerException.class)
    public void testNullRawClass_throwsNPE() throws Exception {
        JavaType type = mock(JavaType.class);
        when(type.getRawClass()).thenReturn(null);
        validator.validateSubType(ctxt, type);
    }
}
```

---

## ตารางสรุป Branch/Condition Coverage

| Test Method | Branch / Condition ที่ครอบคลุม |
|---|---|
| `testInstanceIsSingleton` | ทดสอบ `instance()` คืนค่า singleton object เดิมเสมอ |
| `testIllegalClassName_UnicastRemoteObject_throws` | Branch A: `_cfgIllegalClassNames.contains(full) == true` → throw |
| `testIllegalClassName_FileHandler_throws` | Branch A (อีกรายการในเซ็ต) → throw |
| `testLegalNonSpringClass_noException` | Branch B: `contains == false` และ `startsWith == false` → return ปกติ |
| `testSpringPrefix_NoMatchingSuperclass_noException` | Branch C: `startsWith == true`, loop จบไม่เจอ match → return ปกติ (falls through to `return;`) |
| `testSpringPrefix_DirectAbstractPointcutAdvisor_throws` | Branch D: match ทันทีที่ `cls == raw` (`"AbstractPointcutAdvisor"`) → throw |
| `testSpringPrefix_OneLevelUp_MatchAbstractPointcutAdvisor_throws` | Loop วนซ้ำ 1 รอบก่อนเจอ match → throw |
| `testSpringPrefix_TwoLevelsUp_MatchAbstractPointcutAdvisor_throws` | Loop วนซ้ำ 2 รอบก่อนเจอ match → throw (ครอบคลุม loop iteration หลายระดับ) |
| `testSpringPrefix_DirectAbstractApplicationContext_throws` | Branch E: เงื่อนไข OR ตัวที่สอง (`"AbstractApplicationContext"`) match ทันที → throw |
| `testSpringPrefix_OneLevelUp_MatchAbstractApplicationContext_throws` | เงื่อนไข OR ตัวที่สอง match หลัง loop 1 รอบ → throw |
| `testSpringPrefix_InterfaceCausesNPE_dueToGetSuperclassNull` | Edge case: `raw` เป็น interface ภายใต้ prefix → `getSuperclass()` คืน `null` → NPE (fault-detecting, อนุมานจาก source) |
| `testRawClassIsObject_noException` | Boundary: `raw == Object.class`, ไม่ illegal, ไม่ spring prefix → return ปกติ |
| `testNullRawClass_throwsNPE` | ค่า null: `getRawClass()` คืน `null` → NPE ที่ `raw.getName()` (ก่อนเข้า logic ใด ๆ) |

**หมายเหตุสำคัญ:**
- `testSpringPrefix_InterfaceCausesNPE_dueToGetSuperclassNull` และ `testNullRawClass_throwsNPE` เป็น test ที่ตรวจพฤติกรรมจริงตาม logic ของ source (ไม่ใช่การเดา behavior เพิ่มเติม) แต่เป็นจุดที่ source ไม่ได้ป้องกัน edge case ไว้ ซึ่งอาจถือเป็น fault ที่ควรได้รับการแก้ไขในโค้ดจริง
- Helper classes (`AbstractPointcutAdvisor`, `AbstractApplicationContext` เป็นต้น) เป็น stub ที่สร้างขึ้นเพื่อจำลองโครงสร้าง class hierarchy ของ Spring framework เท่านั้น เนื่องจาก dependency จริงไม่มีอยู่ใน classpath ที่กำหนด