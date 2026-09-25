# UTBot

ส่วนนี้เป็นการทดลองใช้ **UTBot Java CLI** สำหรับสร้าง Unit Test อัตโนมัติให้กับโปรเจกต์ Java จาก \*\*Defects4J\*\* ในงาน Project SQA

การทดลองหลักใช้ Defects4J **Lang-27** และคลาส:

```text

org.apache.commons.lang3.math.NumberUtils

```

โดยเปรียบเทียบผลระหว่าง

- `Lang-27b` — Buggy Version

- `Lang-27f` — Fixed Version

---

## Project Structure

```text
UTBot/
├── Code/
│   └── run-utbot.bat
│
├── logs/
│   └── utbot-after-classloader-fix.log
│
├── patches/
│   ├── utbot-modifications.patch
│   └── utbot-version.txt
│
└── Result/
         └── Lang-27b/
             ├── README.md
             ├── bug_detection/
             │   ├── failing_tests_buggy.txt
             │   ├── failing_tests_fixed.txt
             │   ├── utbot_fail_buggy.txt
             │   └── utbot_fail_fixed.txt
             │
             ├── coverage/
             │   ├── coverage_combined.txt
             │   ├── coverage_developer_only.txt
             │   └── coverage_utbot_only.txt
             │
             ├── generated_tests/
             │   ├── NumberUtilsTest.java
             │   └── NumberUtilsTest_timing.java
             │
             ├── performance/
             │   ├── generation_time.txt
             │   └── utbot_timing_run.log
             │
             └── reproducibility/
                 ├── configuration.txt
                 └── interventions.txt

```

> `utbot-cli-local-1.0.jar` ไม่ได้เก็บไว้ใน Git repository เนื่องจากไฟล์มีขนาดประมาณ 145 MB  

> แต่สามารถ build ใหม่ได้จาก UTBot source โดยใช้ version และ patch ที่อยู่ใน `patches/`

---

## Environment

การทดลองนี้ใช้ environment หลักดังนี้:

```text

Operating System : Windows 11

UTBot Runtime    : Java 17

Defects4J        : Java 11

Test Framework   : JUnit 4

Target Project   : Lang

Bug ID           : 27

Target Class     : org.apache.commons.lang3.math.NumberUtils

```

UTBot ใช้ Java 17 ในการรัน CLI ส่วน Defects4J Lang ใช้ Java 11

---

## UTBot Version

UTBot source ที่ใช้ในการทดลอง:

```text

Repository:

https://github.com/UnitTestBot/UTBotJava.git

Commit:

73bd2b2aed09ba94e7cbd875c662f78db10c2da8

```

ข้อมูล version ถูกเก็บไว้ที่:

```text

patches/utbot-version.txt

```

---

## UTBot Modifications

UTBot CLI เดิมไม่สามารถทำงานกับ Defects4J Lang-27 ได้โดยตรงใน environment นี้ จึงมีการแก้ไข source code บางส่วน

ปัญหาหลักที่พบคือ:

1. การหา working directory ของ target class จาก fat JAR

2. Classloader โหลด `NumberUtils` ที่อยู่ภายใน UTBot fat JAR แทน `NumberUtils` ของ Defects4J

3. เกิดความไม่ตรงกันระหว่าง class ที่ Reflection เห็นกับ class ที่ Soot วิเคราะห์

จึงแก้การหา target class ให้ค้นจาก classpath ที่กำหนด และใช้ selective child-first class loading สำหรับ project classes

Patch ที่ใช้เก็บไว้ที่:

```text

patches/utbot-modifications.patch

```

รายละเอียด intervention เพิ่มเติมอยู่ที่:

```text

Result/Lang-27b/reproducibility/interventions.txt

```

---

## Build UTBot CLI

หลังจาก checkout UTBot source ตาม commit ที่กำหนดและ apply patch แล้ว สามารถ build CLI ได้ด้วย:

```cmd

gradlew.bat clean :utbot-cli:jar --no-daemon --no-parallel -PideType=IC -PsemVer=local-1.0 -x test

```

JAR ที่ได้จะอยู่ประมาณ:

```text

utbot-cli\\build\\libs\\utbot-cli-local-1.0.jar

```

จากนั้นนำ JAR มาไว้ที่:

```text

Project\_SQA\\UTBot\\Code\\utbot-cli-local-1.0.jar

```

ไฟล์นี้ถูก ignore จาก Git เนื่องจากมีขนาดประมาณ 145 MB

---

## Running UTBot

ก่อนใช้งาน ต้อง compile Defects4J project ก่อน

ตัวอย่าง Lang-27b:

```bash

cd /d/d4j\_work/lang\_27\_buggy

export JAVA\_HOME="/c/Program Files/Eclipse Adoptium/jdk-11.0.32.101-hotspot"

export PATH="$JAVA\_HOME/bin:$PATH"

defects4j compile

```

จากนั้นใช้ UTBot CLI จาก Windows CMD:

```cmd

cd UTBot\\Code

run-utbot.bat generate ^

&#x20; org.apache.commons.lang3.math.NumberUtils ^

&#x20; --classpath "D:\\d4j\_work\\lang\_27\_buggy\\target\\classes" ^

&#x20; --source "D:\\d4j\_work\\lang\_27\_buggy\\src\\main\\java\\org\\apache\\commons\\lang3\\math\\NumberUtils.java" ^

&#x20; --test-framework junit4 ^

&#x20; --generation-timeout 120000 ^

&#x20; --output "..\\Result\\Lang-27b\\generated\_tests\\NumberUtilsTest.java"

```

> Path ของ Defects4J อาจต้องเปลี่ยนให้ตรงกับเครื่องที่ใช้ทดลอง

---

## Generated Tests

การ generate หลักสร้าง test ได้:

```text

415 tests

```

ไฟล์:

```text

Result/Lang-27b/generated\_tests/NumberUtilsTest.java

```

มีการรัน generation แยกอีกครั้งสำหรับวัด performance ซึ่งสร้างได้:

```text

467 tests

```

ไฟล์:

```text

Result/Lang-27b/generated\_tests/NumberUtilsTest\_timing.java

```

จำนวน test ที่ต่างกันแสดงให้เห็นว่า UTBot generation สามารถให้ผลต่างกันระหว่างแต่ละ run

---

## Coverage Results

ผล Coverage ของ `NumberUtils`:

| Test Suite | Line Coverage | Condition Coverage |

|---|---:|---:|

| Developer Tests | 97.9% (366/374) | 87.8% (309/352) |

| UTBot Tests | 80.2% (300/374) | 63.6% (224/352) |

| Developer + UTBot | 98.9% (370/374) | 89.8% (316/352) |

เมื่อเพิ่ม UTBot tests เข้าไปกับ Developer tests:

```text

Line Coverage      +4 lines

&#x20;                  +1.0 percentage point

Condition Coverage +7 conditions

&#x20;                  +2.0 percentage points

```

รายละเอียดอยู่ใน:

```text

Result/Lang-27b/coverage/

```

---

## Bug Detection

นำ test suite ชุดเดียวกันจาก UTBot ไปรันกับทั้ง:

```text

Lang-27b

Lang-27f

```

พบว่า:

```text

UTBot failures on Lang-27b : 112

UTBot failures on Lang-27f : 112

Unique failures on 27b     : 0

```

เมื่อเปรียบเทียบรายชื่อ test ที่ fail พบว่า 112 tests ที่ fail เป็นชุดเดียวกันทั้ง Buggy และ Fixed version

ดังนั้นในการทดลองนี้ **ยังไม่พบ UTBot-generated test ที่สามารถยืนยันการตรวจจับ Lang-27 ได้** เพราะไม่มี generated test ที่ fail เฉพาะ `27b` และผ่านบน `27f`

ในทางกลับกัน test เดิมของ Defects4J:

```text

NumberUtilsTest::testCreateNumber

```

fail บน `Lang-27b` แต่ไม่ fail บน `Lang-27f` จึงใช้เป็นตัวตรวจสอบว่าการเปรียบเทียบ Buggy/Fixed ทำงานถูกต้อง

รายละเอียดอยู่ใน:

```text

Result/Lang-27b/bug\_detection/

```

---

## Performance

มีการรัน UTBot generation แยกอีกครั้งเพื่อวัดเวลาการทำงาน โดยใช้ PowerShell Stopwatch

ผลที่ได้:

```text

Elapsed time : 181.3901473 seconds

Exit code    : 0

Generated    : 467 tests

```

`120000 ms` เป็น generation timeout ที่กำหนดให้ UTBot ส่วน `181.39 seconds` เป็น wall-clock time ของ process ทั้งหมด ซึ่งรวมขั้นตอนอื่น เช่น JVM startup, analysis, summarization และ code generation

รายละเอียดอยู่ใน:

```text

Result/Lang-27b/performance/

```

---

## Known Warnings / Limitations

ระหว่างการ generate พบข้อความ เช่น:

```text

java.lang.NoSuchFieldException: value

Coverage is empty ...

Fuzzing overtime ...

```

อย่างไรก็ตาม UTBot ยังสามารถทำงานต่อและสร้าง Java test file ได้สำเร็จ

นอกจากนี้ generated tests บางส่วน fail ทั้งบน Buggy และ Fixed version จึงไม่ควรนับ failure เหล่านั้นเป็นการตรวจจับ defect โดยตรง

---

## Reproducibility

ไฟล์ที่เกี่ยวข้องกับการ reproduce การทดลอง:

```text

patches/utbot-version.txt

patches/utbot-modifications.patch

Result/Lang-27b/reproducibility/configuration.txt

Result/Lang-27b/reproducibility/interventions.txt

```

ไฟล์เหล่านี้บันทึก version ของ UTBot, configuration ที่ใช้ และการแก้ไขที่จำเป็นระหว่างการทดลอง

---

## Summary

การทดลอง UTBot กับ Defects4J Lang-27 สามารถสร้าง Unit Test สำหรับ `NumberUtils` ได้สำเร็จ และช่วยเพิ่ม coverage เมื่อใช้ร่วมกับ Developer Tests

ผลหลักของการทดลอง:

```text

Generated Tests              : 415

UTBot Line Coverage          : 80.2%

UTBot Condition Coverage     : 63.6%

Combined Line Coverage       : 98.9%

Combined Condition Coverage  : 89.8%

Confirmed Bug-Revealing Test : 0

Generation Time (timing run) : 181.3901473 seconds

```



###### ผลการทดลองแสดงให้เห็นว่า coverage ที่เพิ่มขึ้นไม่ได้หมายความว่าจะสามารถตรวจจับ defect ได้เสมอไป ดังนั้นการประเมินเครื่องมือสร้าง Unit Test ควรพิจารณาทั้ง Coverage, Bug Detection และ Performance ร่วมกัน

