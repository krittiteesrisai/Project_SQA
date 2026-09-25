# ผลการทดลอง UTBot - Defects4J Lang-27b

## 1. ข้อมูลการทดลอง

การทดลองนี้เป็นการประเมินเครื่องมือ **UTBot Java CLI** สำหรับสร้าง Unit Test อัตโนมัติบนโปรเจกต์ **Defects4J Lang-27b**

คลาสที่ใช้ทดสอบ:

`org.apache.commons.lang3.math.NumberUtils`

การตั้งค่าหลัก:

- Test Framework: JUnit 4
- Generation Timeout: 120,000 ms
- UTBot ใช้ Java 17
- Defects4J ใช้ Java 11

---

## 2. ผลการสร้าง Test

UTBot สามารถสร้าง Test จากคลาส `NumberUtils` ได้สำเร็จ

ผลจากการรันหลัก:

- Generated Tests: **415 Tests**
- ไฟล์: `generated_tests/NumberUtilsTest.java`

มีการรัน UTBot เพิ่มอีกหนึ่งครั้งเพื่อวัด Performance โดยแยกออกจากการทดลองหลัก

ผลจาก Performance Run:

- Generated Tests: **467 Tests**
- Execution Time: **181.3901473 วินาที**
- Exit Code: **0**

ไฟล์ผลการรันอยู่ในโฟลเดอร์ `performance/`

---

## 3. ผล Coverage

| Test Suite | Line Coverage | Condition Coverage |
|---|---:|---:|
| Developer Tests Only | 97.9% (366/374) | 87.8% (309/352) |
| UTBot Only | 80.2% (300/374) | 63.6% (224/352) |
| Developer + UTBot | 98.9% (370/374) | 89.8% (316/352) |

เมื่อเพิ่ม Test ที่สร้างโดย UTBot เข้าไปกับ Developer Tests:

- Line Coverage เพิ่มจาก **97.9% → 98.9%**
- Condition Coverage เพิ่มจาก **87.8% → 89.8%**

ผล Coverage ทั้งหมดอยู่ในโฟลเดอร์ `coverage/`

---

## 4. การตรวจจับ Bug

นำ Test ชุดเดียวกันที่สร้างโดย UTBot ไปทดสอบกับ:

- `Lang-27b` — Buggy Version
- `Lang-27f` — Fixed Version

ผลที่ได้:

| Version | UTBot Tests ที่ Fail |
|---|---:|
| Lang-27b | 112 |
| Lang-27f | 112 |

เมื่อนำรายการ Test ที่ Fail มาเปรียบเทียบ พบว่า Test ทั้ง 112 รายการ Fail เหมือนกันทั้ง Buggy และ Fixed Version

ดังนั้น:

**ไม่พบ Test ที่สร้างโดย UTBot ที่สามารถตรวจจับ Bug Lang-27 ได้โดยเฉพาะ**

กล่าวคือ ไม่มี Generated Test ที่ Fail บน `Lang-27b` แต่ Pass บน `Lang-27f`

อย่างไรก็ตาม Developer Test เดิม:

`NumberUtilsTest::testCreateNumber`

Fail บน `Lang-27b` แต่ไม่ Fail บน `Lang-27f` แสดงว่าสภาพแวดล้อมที่ใช้เปรียบเทียบ Buggy/Fixed สามารถแยก Bug ของ Lang-27 ได้

รายละเอียดอยู่ในโฟลเดอร์ `bug_detection/`

---

## 5. Performance

มีการรัน UTBot แยกอีกครั้งเพื่อวัดเวลาการสร้าง Test

ผล:

- Generation Timeout: **120,000 ms**
- Wall-clock Time: **181.3901473 วินาที**
- Generated Tests: **467 Tests**
- Exit Code: **0**

จำนวน Test ใน Performance Run แตกต่างจากการรันหลัก ดังนั้นผล Coverage และ Bug Detection จะอ้างอิงจาก Test ชุดแรกจำนวน **415 Tests**

---

## 6. ปัญหาและการแก้ไข

ระหว่างการทดลองพบปัญหาหลัก ได้แก่:

1. UTBot CLI เลือกคลาส `NumberUtils` จาก Fat JAR แทนคลาสของ Defects4J
2. เกิด ClassLoader conflict ระหว่าง Apache Commons Lang ใน UTBot และ Lang-27b
3. Defects4J มีปัญหาการจัดการ Windows Path สำหรับ External Test Suite
4. Generated Test มี Unicode แต่ Java Compiler ใช้ `x-windows-874`
5. ชื่อ `NumberUtilsTest` ที่ UTBot สร้างซ้ำกับ Developer Test เดิม

รายละเอียดการแก้ไขและ Configuration อยู่ใน:

`reproducibility/interventions.txt`

และ

`reproducibility/configuration.txt`

---

## 7. สรุปผล

UTBot สามารถสร้าง Unit Test สำหรับ `NumberUtils` ได้สำเร็จจำนวน **415 Tests**

UTBot Test เพียงอย่างเดียวทำ Coverage ได้:

- Line Coverage: **80.2%**
- Condition Coverage: **63.6%**

เมื่อรวมกับ Developer Tests ทำให้ Coverage เพิ่มเป็น:

- Line Coverage: **98.9%**
- Condition Coverage: **89.8%**

อย่างไรก็ตาม ในการทดลองนี้ยังไม่พบ Generated Test ของ UTBot ที่สามารถตรวจจับ Bug Lang-27 ได้โดยเฉพาะ เนื่องจาก Test ที่ Fail จาก UTBot ทั้ง 112 รายการ Fail เหมือนกันทั้ง Buggy และ Fixed Version
