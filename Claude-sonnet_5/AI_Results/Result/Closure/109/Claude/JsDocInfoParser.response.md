# JsDocInfoParserTest — JUnit 4 Test Suite

## หมายเหตุสำคัญก่อนเริ่ม

`JsDocInfoParser` มี constructor และ method หลัก (`parse()`, `hasParsedJSDocInfo()`, ฯลฯ) เป็น **package-private** ดังนั้นไฟล์ทดสอบต้องอยู่ใน package เดียวกัน (`com.google.javascript.jscomp.parsing`) จึงจะเรียกใช้งานได้ตามที่ระบุไว้ในซอร์สเอง (คอมเมนต์ `// Sometimes this will be null in tests.`)

- **Group A** (`parseTypeString`) เป็น public static method ที่ self-contained (สร้าง `Config`/`JsDocTokenStream`/`NullErrorReporter` เอง) → ปลอดภัยที่สุด ใช้ทดสอบ grammar การ parse type expression ได้ลึกและกว้างที่สุด
- **Group B** (`parse()` ผ่าน constructor ตรง) ใช้ pattern การสร้าง `Config` แบบเดียวกับที่ปรากฏใน `parseTypeString()` **ทุกตัวอักษร** (ไม่ได้เดา semantics ของ boolean parameter ใหม่) แต่ยังต้อง**สมมติ contract ของ `JsDocTokenStream`** (เช่น `"*/"` → `EOC`, ไม่มี `"*/"` → `EOF`) ซึ่งไม่มีซอร์สให้ตรวจสอบ จึงมีคอมเมนต์ `ASSUMPTION` กำกับไว้ทุกจุด

```java
package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.parsing.JsDocInfoParser; // import ตามข้อก