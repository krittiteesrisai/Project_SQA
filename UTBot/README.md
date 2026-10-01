# การทดลอง Automated Test Case Generation ด้วย UTBot

โฟลเดอร์นี้เป็นส่วนของการทดลอง **UTBot Java** ในโปรเจกต์รายวิชา Software Quality Assurance (SQA)

การทดลองนี้มีวัตถุประสงค์เพื่อประเมินความสามารถของ **UTBot** ในการสร้าง Automated Test Cases สำหรับโปรเจกต์ Java จากชุดข้อมูล **Defects4J** โดยวัดผลทั้งด้านการตรวจจับข้อบกพร่อง (Fault Detection), Code Coverage และข้อมูลด้านประสิทธิภาพในการสร้าง Test Case

การทดลองสุดท้ายครอบคลุม:

- Defects4J จำนวน **17 Projects**
- ข้อบกพร่องทั้งหมด **854 Bugs**
- การสร้าง Test Case อัตโนมัติด้วย UTBot
- การตรวจจับ Bug โดยเปรียบเทียบผล Test ระหว่าง Buggy และ Fixed Version
- การเปรียบเทียบ Code Coverage ระหว่าง Developer Tests, UTBot Tests และ Combined Tests
- การบันทึกเวลาและสถานะของการทดลองแต่ละ Bug

---

## 1. ขอบเขตการทดลอง

การทดลองใช้ Active Bugs ทั้งหมดที่ค้นพบจาก Defects4J Version ที่ใช้ในโปรเจกต์

| Project | จำนวน Bugs |
|---|---:|
| Chart | 26 |
| Cli | 39 |
| Closure | 174 |
| Codec | 18 |
| Collections | 28 |
| Compress | 47 |
| Csv | 16 |
| Gson | 18 |
| JacksonCore | 26 |
| JacksonDatabind | 110 |
| JacksonXml | 6 |
| Jsoup | 93 |
| JxPath | 22 |
| Lang | 61 |
| Math | 106 |
| Mockito | 38 |
| Time | 26 |
| **รวม** | **854** |

Automation Script จะค้นหา Project และ Bug ID จาก Defects4J โดยตรงด้วย:

```bash
defects4j pids
defects4j bids -p <PROJECT>
```

จึงไม่สมมติว่า Bug ID ของแต่ละ Project จะต้องเรียงต่อกัน

---

## 2. โครงสร้างไฟล์

```text
UTBot/
├── Code/
│   ├── run-utbot.bat
│   └── utbot-cli-local-1.0.jar
│
├── patches/
│   ├── defects4j-version.txt
│   ├── defects4j-windows.patch
│   ├── utbot-modifications.patch
│   └── utbot-version.txt
│
├── Result_Automated/
│   ├── README.md
│   ├── summary.csv
│   ├── final_summary.csv
│   └── final_report.md
│
├── scripts/
│   ├── run_all_defects.py
│   └── generate_final_report.py
│
└── README.md
```

### ไฟล์สำคัญ

**`run_all_defects.py`**

Automation Script หลักของการทดลอง ทำหน้าที่ Checkout Defects4J, Compile Project, สร้าง Test ด้วย UTBot, รัน Test, ตรวจจับ Bug, วัด Coverage และบันทึกผล

**`generate_final_report.py`**

ใช้สรุปผลจากข้อมูลระดับ Class ให้เป็นผลระดับ Bug และระดับ Project

**`summary.csv`**

เก็บผลการทดลองหลัก โดยหนึ่ง Bug อาจมีมากกว่า 1 Row เนื่องจาก Defects4J Bug หนึ่งตัวสามารถมี Modified Class ได้หลาย Class

**`final_summary.csv`**

ผลสรุปสุดท้ายแยกตาม Project

**`final_report.md`**

รายงานผลการทดลองสุดท้ายในรูปแบบ Markdown

**`defects4j-windows.patch`**

เก็บการแก้ไข Defects4J ที่จำเป็นสำหรับ Environment Windows ที่ใช้ในการทดลองนี้

**`utbot-modifications.patch`**

เก็บการแก้ไข Source Code ของ UTBotJava ที่ใช้ในการทดลอง

---

## 3. Environment ที่ใช้

การทดลองนี้ดำเนินการบน **Windows**

Software หลักที่ใช้ประกอบด้วย:

- Git
- Git Bash
- Python 3
- Java 11
- Java 17
- Strawberry Perl
- Apache Ant
- Defects4J
- UTBotJava

ในการทดลองใช้ Java สอง Version เนื่องจาก UTBot และ Defects4J มีความต้องการ Environment แตกต่างกัน

### Java 11

ใช้สำหรับ Defects4J

Environment เดิมที่ใช้ในการทดลอง:

```text
C:\Program Files\Eclipse Adoptium\jdk-11.0.32.101-hotspot
```

### Java 17

ใช้สำหรับ UTBot CLI

Environment เดิมที่ใช้:

```text
C:\Program Files\jdk-17.0.12
```

### Git Bash

```text
C:\Program Files\Git\bin\bash.exe
```

### Defects4J Work Directory

```text
D:\d4j_work_auto
```

Path เหล่านี้เป็นเพียงค่า Default จากเครื่องที่ใช้ทดลอง สามารถเปลี่ยนได้ด้วย Environment Variables

---

## 4. Defects4J Version

Repository:

```text
https://github.com/rjust/defects4j.git
```

Branch:

```text
master
```

Base Commit ที่ใช้:

```text
8c16da8230843cdc918eaf4ddb449637f02b83c6
```

ข้อมูลนี้ถูกบันทึกไว้ใน:

```text
UTBot/patches/defects4j-version.txt
```

---

## 5. การแก้ไข Defects4J สำหรับ Windows

Defects4J เดิมจำเป็นต้องมีการแก้ไขบางส่วนเพื่อให้สามารถใช้กับ Environment Windows ของการทดลองนี้ได้

การแก้ไขถูกเก็บไว้ใน:

```text
UTBot/patches/defects4j-windows.patch
```

สำหรับการสร้าง Environment ใหม่ ให้ Clone Defects4J:

```bash
git clone https://github.com/rjust/defects4j.git
cd defects4j
```

Checkout ไปยัง Commit เดียวกับที่ใช้ในการทดลอง:

```bash
git checkout 8c16da8230843cdc918eaf4ddb449637f02b83c6
```

จากนั้น Apply Patch จาก Project_SQA:

```bash
git apply /path/to/Project_SQA/UTBot/patches/defects4j-windows.patch
```

โดย `/path/to/Project_SQA/` ต้องเปลี่ยนให้ตรงกับตำแหน่ง Repository ในเครื่องของผู้ทดลอง

### หมายเหตุเรื่อง Line Ending

ระหว่างการทดลองบน Windows พบว่าไฟล์ `.diff` และ `.patch` บางไฟล์ของ Defects4J จำเป็นต้องใช้ **LF Line Ending**

การเปลี่ยนแปลงที่มีเพียง Line Ending บางส่วนจะไม่ปรากฏอยู่ใน `git diff` ดังนั้นจึงไม่ได้ถูกบันทึกทั้งหมดไว้ใน `defects4j-windows.patch`

หากเกิดปัญหาระหว่าง Checkout หรือ Apply Patch บน Windows ควรตรวจสอบ Line Ending ของไฟล์ `.diff` และ `.patch` ที่เกี่ยวข้องว่าเป็น LF หรือไม่

จุดนี้ถือเป็นข้อจำกัดด้าน Reproducibility ของ Environment Windows ที่ใช้ในการทดลองนี้

---

## 6. UTBotJava Version

Repository:

```text
https://github.com/UnitTestBot/UTBotJava.git
```

Commit ที่ใช้ในการทดลอง:

```text
73bd2b2aed09ba94e7cbd875c662f78db10c2da8
```

ข้อมูล Version ถูกเก็บไว้ใน:

```text
UTBot/patches/utbot-version.txt
```

---

## 7. การแก้ไข UTBotJava

Source Code ของ UTBotJava มีการแก้ไขบางส่วนสำหรับการทดลองนี้

Patch ถูกเก็บไว้ที่:

```text
UTBot/patches/utbot-modifications.patch
```

สำหรับการสร้าง Environment ใหม่:

```bash
git clone https://github.com/UnitTestBot/UTBotJava.git
cd UTBotJava
```

Checkout ไปยัง Commit ที่ใช้ในการทดลอง:

```bash
git checkout 73bd2b2aed09ba94e7cbd875c662f78db10c2da8
```

จากนั้น Apply Patch:

```bash
git apply /path/to/Project_SQA/UTBot/patches/utbot-modifications.patch
```

---

## 8. การ Build UTBot CLI

หลังจาก Apply Patch แล้ว ให้ Build UTBot CLI จาก Repository ของ UTBotJava

บน Windows ใช้:

```cmd
gradlew.bat clean :utbot-cli:jar --no-daemon --no-parallel -PideType=IC -PsemVer=local-1.0 -x test
```

เมื่อ Build สำเร็จ JAR จะอยู่ที่:

```text
utbot-cli\build\libs\utbot-cli-local-1.0.jar
```

ให้นำไฟล์ดังกล่าวมาไว้ที่:

```text
Project_SQA\UTBot\Code\utbot-cli-local-1.0.jar
```

ไฟล์ JAR นี้ถูก Ignore จาก Git เนื่องจากเป็นไฟล์ Binary ที่สามารถ Build ใหม่ได้จาก Source Code

`run-utbot.bat` จะใช้ Java 17 ในการรัน UTBot CLI พร้อม JVM Options ที่จำเป็น

---

## 9. การตั้งค่า Environment Variables

Automation Script รองรับ Environment Variables เพื่อให้ผู้ทดลองคนอื่นสามารถใช้ Path ที่แตกต่างจากเครื่องเดิมได้

ตัวอย่างบน Windows CMD:

```cmd
set "JAVA11_HOME=C:\path\to\jdk-11"
set "JAVA17_HOME=C:\path\to\jdk-17"
set "GIT_BASH=C:\Program Files\Git\bin\bash.exe"
set "D4J_WORK_ROOT=D:\d4j_work_auto"
```

ตัวอย่างค่าที่ใช้ในการทดลองเดิม:

```cmd
set "JAVA11_HOME=C:\Program Files\Eclipse Adoptium\jdk-11.0.32.101-hotspot"
set "JAVA17_HOME=C:\Program Files\jdk-17.0.12"
set "GIT_BASH=C:\Program Files\Git\bin\bash.exe"
set "D4J_WORK_ROOT=D:\d4j_work_auto"
```

หากไม่ได้กำหนด Environment Variables Script จะใช้ Default Path จาก Environment เดิมของการทดลอง

---

## 10. ตรวจสอบ Environment ก่อนรัน

### ตรวจ Java 11

```cmd
"%JAVA11_HOME%\bin\java.exe" -version
```

### ตรวจ Java 17

```cmd
"%JAVA17_HOME%\bin\java.exe" -version
```

### ตรวจ Python

```cmd
python --version
```

### ตรวจ Git

```cmd
git --version
```

### ตรวจ Defects4J

จาก Git Bash:

```bash
defects4j info -p Lang
```

### ตรวจ Perl

```bash
perl -MEncode -e "print qq(OK\n)"
```

หากใช้งานได้ควรแสดง:

```text
OK
```

---

## 11. วิธีรันการทดลอง

ให้รันคำสั่งจาก Root Directory ของ `Project_SQA`

### ทดลอง Default Bug

หากไม่ระบุ Argument Script จะใช้ `Lang-27` เป็น Default:

```cmd
python UTBot\scripts\run_all_defects.py
```

### รัน Bug เดียว

ตัวอย่าง Lang-27:

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --bugs 27
```

ตัวอย่าง Math-3:

```cmd
python UTBot\scripts\run_all_defects.py --project Math --bugs 3
```

### รันหลาย Bugs

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --bugs 1 2 3 4 5
```

### รันทุก Bug ของ Project เดียว

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --all-bugs
```

### รันทุก Project และทุก Bug

```cmd
python UTBot\scripts\run_all_defects.py --all
```

สำหรับ Defects4J Version ที่ใช้ในการทดลองนี้ จะได้ทั้งหมด:

```text
17 Projects
854 Active Bugs
```

---

## 12. การ Resume การทดลอง

เนื่องจากการทดลองทั้งหมดใช้เวลานาน Automation จึงรองรับ:

```text
--resume
```

ตัวอย่าง:

```cmd
python UTBot\scripts\run_all_defects.py --all --resume
```

Script จะตรวจสอบ `summary.csv` และข้าม Bug ที่มีผลเป็น Terminal Status แล้ว

ทำให้สามารถรันต่อจากการทดลองเดิมได้โดยไม่จำเป็นต้องเริ่มใหม่ทั้งหมด

---

## 13. ขั้นตอนการทดลอง

สำหรับ Defects4J Bug แต่ละตัว Automation จะทำงานตามลำดับดังนี้:

```text
ค้นหา Bug
    |
    v
Checkout Buggy Version
    |
    v
Checkout Fixed Version
    |
    v
Compile ทั้งสอง Version
    |
    v
ค้นหา Modified Classes
    |
    v
สร้าง Test Cases ด้วย UTBot
    |
    v
รัน Generated Tests บน Buggy Version
    |
    v
รัน Generated Tests บน Fixed Version
    |
    v
เปรียบเทียบ Test Failures
    |
    +----> Fault Detection
    |
    v
วัด Developer Test Coverage
    |
    v
วัด UTBot Test Coverage
    |
    v
วัด Combined Coverage
    |
    v
บันทึกผลลง summary.csv
```

Modified Classes ที่ Defects4J ระบุจะถูกใช้เป็น Target Classes สำหรับ UTBot

---

## 14. Configuration ของการสร้าง Test

UTBot ใช้ Generation Timeout:

```text
120000 ms
```

หรือ:

```text
120 วินาที
```

Generated Tests ใช้:

```text
JUnit 4
```

Test Execution Timeout คือ:

```text
300 วินาที
```

หากใช้เวลาเกินค่าที่กำหนด Script จะบันทึกสถานะ Timeout แทนที่จะปล่อยให้ Experiment ค้าง

---

## 15. เกณฑ์การตรวจจับ Bug

การทดลองจะนับว่า UTBot ตรวจพบ Bug เมื่อ Generated Test มี Failure ที่เกิดขึ้นเฉพาะใน Buggy Version แต่ไม่เกิดขึ้นใน Fixed Version

กำหนดให้:

```text
BuggyFailures = Tests ที่ Fail บน Buggy Version

FixedFailures = Tests ที่ Fail บน Fixed Version
```

จากนั้นคำนวณ:

```text
UniqueBuggyFailures = BuggyFailures - FixedFailures
```

หาก:

```text
UniqueBuggyFailures > 0
```

จะถือว่า:

```text
BugDetected = YES
```

หรืออธิบายแบบง่ายได้ว่า:

```text
FAIL บน Buggy
+
ไม่ FAIL บน Fixed
=
ตรวจพบ Bug
```

หาก Test เดียวกัน Fail ทั้ง Buggy และ Fixed Version จะ **ไม่นับว่าเป็นการตรวจพบ Bug**

กรณี Test Compile ไม่ได้, Generated Test ไม่ Compatible, Generation Failed หรือ Timeout จะไม่นับเป็นการตรวจพบ Bug เช่นกัน

เกณฑ์นี้ช่วยป้องกันไม่ให้ Error จาก Environment หรือ Generated Test ถูกนับเป็น Fault Detection โดยผิดพลาด

---

## 16. Fault Detection Rate

การทดลองรายงาน Fault Detection Rate สองรูปแบบ

### All-Bug FDR

ใช้ Bugs ทั้งหมดเป็นตัวหาร:

```text
Detected Bugs / All Bugs
```

ผลการทดลอง:

```text
7 / 854 = 0.82%
```

### Executable-Bug FDR

พิจารณาเฉพาะ Bugs ที่ Generated Tests สามารถเข้าสู่ขั้นตอน Test Execution ได้

ในการสรุปผลสุดท้าย Bug จะถือเป็น Executable หากมี Result Row อย่างน้อยหนึ่ง Row ที่มี Status:

```text
COMPLETED
```

หรือ:

```text
COVERAGE_FAILED
```

ผลการทดลอง:

```text
7 / 139 = 5.04%
```

จึงรายงาน FDR ทั้งสองแบบ เนื่องจากใช้ตอบคำถามคนละมุม

- **All-Bug FDR** แสดงความสามารถในการตรวจจับเมื่อเทียบกับ Dataset ทั้งหมด
- **Executable-Bug FDR** แสดงความสามารถในการตรวจจับในกลุ่มที่ Generated Tests สามารถเข้าสู่การ Execute ได้

---

## 17. Bugs ที่ UTBot ตรวจพบ

จากทั้งหมด 854 Bugs UTBot ตรวจพบตามเกณฑ์การทดลองจำนวน **7 Bugs**

```text
Cli-5
Codec-2
Codec-18
Compress-14
Lang-45
Math-3
Math-54
```

สรุป:

```text
Total Bugs       : 854
Executable Bugs  : 139
Detected Bugs    : 7
All-Bug FDR      : 0.82%
Executable FDR   : 5.04%
```

---

## 18. วิธีวัด Code Coverage

Code Coverage วัดบน **Buggy Version**

แบ่งออกเป็น 3 รูปแบบ

### Developer Tests

Test Cases เดิมที่มีอยู่ใน Defects4J Project ใช้เป็น Baseline

### UTBot Tests

Test Cases ที่สร้างขึ้นอัตโนมัติด้วย UTBot

### Combined Tests

การใช้ Developer Tests และ UTBot Tests ร่วมกัน

การทดลองวัด:

- Line Coverage
- Condition Coverage

หาก Coverage Tool ไม่สามารถวัดผลได้ จะบันทึกว่า Coverage ไม่สามารถวัดได้ แทนการกำหนดเป็น `0%`

เพราะการวัด Coverage ไม่สำเร็จไม่ได้หมายความว่า Test Cases มี Coverage เท่ากับศูนย์

---

## 19. ผล Code Coverage สุดท้าย

ผลรวมใช้ **Weighted Coverage** จากจำนวน Covered และ Total Elements จริง ไม่ใช่การนำ Percentage ของแต่ละ Class มาเฉลี่ยตรง ๆ

### Line Coverage

| Test Suite | Covered / Total | Coverage |
|---|---:|---:|
| Developer Tests | 33,611 / 37,660 | **89.25%** |
| UTBot Tests | 17,616 / 33,085 | **53.24%** |
| Combined | 34,803 / 37,660 | **92.41%** |

เมื่อเพิ่ม UTBot Tests เข้าไป Coverage เพิ่มขึ้น:

```text
+3.17 Percentage Points
```

### Condition Coverage

| Test Suite | Covered / Total | Coverage |
|---|---:|---:|
| Developer Tests | 17,847 / 21,433 | **83.27%** |
| UTBot Tests | 8,802 / 19,239 | **45.75%** |
| Combined | 18,684 / 21,433 | **87.17%** |

เมื่อเพิ่ม UTBot Tests เข้าไป Coverage เพิ่มขึ้น:

```text
+3.91 Percentage Points
```

---

## 20. ผลแยกตาม Project

| Project | Bugs | Executable | Detected |
|---|---:|---:|---:|
| Chart | 26 | 1 | 0 |
| Cli | 39 | 4 | 1 |
| Closure | 174 | 6 | 0 |
| Codec | 18 | 4 | 2 |
| Collections | 28 | 0 | 0 |
| Compress | 47 | 8 | 1 |
| Csv | 16 | 0 | 0 |
| Gson | 18 | 5 | 0 |
| JacksonCore | 26 | 0 | 0 |
| JacksonDatabind | 110 | 3 | 0 |
| JacksonXml | 6 | 0 | 0 |
| Jsoup | 93 | 8 | 0 |
| JxPath | 22 | 1 | 0 |
| Lang | 61 | 15 | 1 |
| Math | 106 | 68 | 2 |
| Mockito | 38 | 5 | 0 |
| Time | 26 | 11 | 0 |
| **รวม** | **854** | **139** | **7** |

รายละเอียดเพิ่มเติมอยู่ใน:

```text
UTBot/Result_Automated/final_summary.csv
```

และ:

```text
UTBot/Result_Automated/final_report.md
```

---

## 21. Status ของการทดลอง

Automation แยกสถานะของการทดลองอย่างชัดเจน เพื่อไม่ให้ Error หรือปัญหาจาก Environment ถูกตีความเป็นผลการตรวจจับ Bug

### `COMPLETED`

Generated Tests สามารถ Execute ได้และการทดลองเสร็จสมบูรณ์

### `TEST_COMPILE_INCOMPATIBLE`

Generated Tests ไม่สามารถ Compile กับ Target Project ได้ เช่น Java Source Level, API หรือ Dependency ไม่ Compatible

### `TEST_TIMEOUT`

การ Execute Generated Tests ใช้เวลาเกิน Timeout

### `GENERATION_TIMEOUT`

UTBot ใช้เวลา Generate Test เกิน Timeout

### `GENERATION_FAILED`

UTBot ไม่สามารถสร้าง Test ได้สำเร็จ

### `COVERAGE_FAILED`

Generated Tests สามารถเข้าสู่ขั้นตอน Execution ได้ แต่ Coverage Instrumentation ไม่สามารถวัดผลได้สำเร็จ

Status เหล่านี้จะไม่ถูกเปลี่ยนเป็น `0% Coverage` หรือถูกนับว่าเป็น Bug Detection

---

## 22. การอ่าน `summary.csv`

`summary.csv` เก็บผลในระดับ **Modified Class**

ดังนั้น:

```text
1 Row != 1 Bug
```

เพราะ Bug หนึ่งตัวสามารถมี Modified Class ได้หลาย Class

Dataset จริงมี:

```text
854 Unique Bugs
```

การคำนวณ Final Metrics จึง Group ข้อมูลด้วย:

```text
(Project, BugID)
```

แทนการนับจำนวน Rows

หาก Bug ใดมี:

```text
BugDetected = YES
```

อย่างน้อยหนึ่ง Row จะถือว่า Bug นั้นถูกตรวจพบหนึ่งครั้ง

วิธีนี้ป้องกัน Bug ที่มีหลาย Modified Classes ถูกนับซ้ำ

---

## 23. การสร้าง Final Report

หลังจาก Experiment เสร็จ ให้รัน:

```cmd
python UTBot\scripts\generate_final_report.py
```

Script จะอ่าน:

```text
UTBot/Result_Automated/summary.csv
```

และสร้าง:

```text
UTBot/Result_Automated/final_summary.csv
UTBot/Result_Automated/final_report.md
```

Final Report จะสรุป Fault Detection Rate และ Weighted Coverage ในระดับ Bug และ Project

---

## 24. Raw Experiment Results

ระหว่างการทดลอง Script จะสร้าง Directory แยกตาม Bug เช่น:

```text
UTBot/Result_Automated/Lang-45/
UTBot/Result_Automated/Math-3/
UTBot/Result_Automated/Codec-18/
```

ภายในอาจประกอบด้วย:

```text
generated_tests/
logs/
bug_detection/
coverage/
performance/
```

Raw Results ทั้งหมดมีขนาดค่อนข้างใหญ่ โดย Environment การทดลองนี้มีขนาดรวมประมาณ:

```text
1.5 GB
```

ดังนั้น Raw Result Directories จึงถูก Ignore จาก Git

แต่จะเก็บไฟล์ผลสรุปต่อไปนี้ไว้ใน Repository:

```text
summary.csv
final_summary.csv
final_report.md
README.md
```

---

## 25. วิธี Reproduce การทดลอง

สำหรับผู้ที่ต้องการทดลองซ้ำบนเครื่องใหม่ สามารถทำตามขั้นตอนต่อไปนี้

### Step 1 — Clone Project_SQA

Clone Repository นี้และเข้าไปยัง Root Directory ของ `Project_SQA`

### Step 2 — เตรียม Software

ติดตั้ง:

```text
Git
Git Bash
Python 3
Java 11
Java 17
Strawberry Perl
Apache Ant
```

### Step 3 — Clone Defects4J

```bash
git clone https://github.com/rjust/defects4j.git
cd defects4j
git checkout 8c16da8230843cdc918eaf4ddb449637f02b83c6
```

จากนั้น Apply Patch:

```bash
git apply /path/to/Project_SQA/UTBot/patches/defects4j-windows.patch
```

ติดตั้ง Defects4J ตามปกติ และตรวจสอบว่า:

```bash
defects4j info -p Lang
```

สามารถทำงานได้

### Step 4 — ตรวจสอบ Line Ending

บน Windows ให้ตรวจสอบว่าไฟล์ `.diff` และ `.patch` ของ Defects4J ที่มีปัญหาใช้ LF Line Ending

เนื่องจากการเปลี่ยนแปลงที่เป็น Line Ending เพียงอย่างเดียวไม่ได้ถูกบันทึกทั้งหมดใน `defects4j-windows.patch`

### Step 5 — Clone UTBotJava

```bash
git clone https://github.com/UnitTestBot/UTBotJava.git
cd UTBotJava
git checkout 73bd2b2aed09ba94e7cbd875c662f78db10c2da8
```

Apply Patch:

```bash
git apply /path/to/Project_SQA/UTBot/patches/utbot-modifications.patch
```

### Step 6 — Build UTBot CLI

```cmd
gradlew.bat clean :utbot-cli:jar --no-daemon --no-parallel -PideType=IC -PsemVer=local-1.0 -x test
```

นำ:

```text
utbot-cli\build\libs\utbot-cli-local-1.0.jar
```

ไปไว้ที่:

```text
Project_SQA\UTBot\Code\utbot-cli-local-1.0.jar
```

### Step 7 — ตั้งค่า Environment

ตัวอย่าง:

```cmd
set "JAVA11_HOME=C:\Program Files\Eclipse Adoptium\jdk-11.0.32.101-hotspot"
set "JAVA17_HOME=C:\Program Files\jdk-17.0.12"
set "GIT_BASH=C:\Program Files\Git\bin\bash.exe"
set "D4J_WORK_ROOT=D:\d4j_work_auto"
```

### Step 8 — ทดลองหนึ่ง Bug ก่อน

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --bugs 27
```

ตรวจสอบว่า Checkout, Compile, UTBot Generation และ Test Execution สามารถทำงานได้

### Step 9 — รันครบทุก Bug

```cmd
python UTBot\scripts\run_all_defects.py --all --resume
```

### Step 10 — สร้าง Final Report

```cmd
python UTBot\scripts\generate_final_report.py
```

จากนั้นตรวจผลที่:

```text
UTBot/Result_Automated/final_summary.csv
UTBot/Result_Automated/final_report.md
```

---

## 26. ไฟล์สำหรับ Reproducibility

ใน Repository มีไฟล์สำหรับสร้าง Environment เดิมของการทดลอง:

```text
UTBot/patches/
├── defects4j-version.txt
├── defects4j-windows.patch
├── utbot-version.txt
└── utbot-modifications.patch
```

ไฟล์ `*-version.txt` ใช้ระบุ Repository และ Source Version ที่ใช้เป็นจุดเริ่มต้น

ไฟล์ `*.patch` ใช้บันทึกการแก้ไข Source Code ที่ใช้ในการทดลอง

ทำให้สามารถแยก Original Source Code ออกจาก Experiment-specific Modifications ได้ชัดเจน

---

## 27. ข้อจำกัดของการทดลอง

### Windows Compatibility

Defects4J มี Workflow ที่เหมาะกับ Unix-like Environment มากกว่า การรัน Dataset ทั้งหมดบน Windows จึงจำเป็นต้องมี Local Compatibility Modifications

### Line Ending

ไฟล์ Patch บางส่วนของ Defects4J จำเป็นต้องใช้ LF Line Ending

การเปลี่ยน Line Ending เพียงอย่างเดียวไม่ได้ถูกเก็บทั้งหมดใน `defects4j-windows.patch`

ดังนั้น Patch ดังกล่าวอาจยังไม่สามารถสร้าง Windows Environment เดิมได้อัตโนมัติ 100%

### Generated Test Compatibility

Generated Tests จำนวนมากไม่สามารถ Compile หรือ Execute กับ Defects4J Project บาง Version ได้ เนื่องจาก Java Source Level, API, Dependency หรือ Build Configuration ที่แตกต่างกัน

กรณีเหล่านี้ถูกแยกเป็น Compatibility Status และไม่นับเป็น Bug Detection

### Coverage Instrumentation

บางกรณี Generated Tests สามารถ Execute ได้ แต่ Defects4J Coverage Instrumentation ไม่สามารถวัดผลได้สำเร็จ

กรณีดังกล่าวถูกบันทึกเป็น `COVERAGE_FAILED` และไม่ตีความ Coverage ที่ไม่สามารถวัดได้เป็น `0%`

### Environment Dependency

การทดลองใช้ Java หลาย Version รวมถึง Git Bash, Perl, Ant, Defects4J และ UTBot ที่มี Local Modifications

ผลการทดลองอาจแตกต่างออกไปหากใช้ Version หรือ Environment ที่แตกต่างจากการทดลองเดิม

### Runtime

การทดลองครบทั้ง Dataset ใช้เวลาในการประมวลผลค่อนข้างสูง

UTBot Generation Time ที่บันทึกสะสมจาก Class-level Generation Attempts คือประมาณ:

```text
155,621 วินาที
≈ 43.23 ชั่วโมง
```

ตัวเลขนี้เป็นเวลาสะสมของการ Generate Test ไม่ใช่ Wall-clock Time ของการทดลองทั้งหมด

---

## 28. สรุปผลการทดลอง

การทดลอง UTBot ครอบคลุม **854 Active Bugs จาก 17 Defects4J Projects**

ผล Fault Detection:

```text
Detected Bugs       : 7
All Bugs            : 854
All-Bug FDR         : 0.82%

Executable Bugs     : 139
Executable FDR      : 5.04%
```

ผล Weighted Line Coverage:

```text
Developer Tests     : 89.25%
UTBot Tests         : 53.24%
Combined            : 92.41%
Coverage Gain       : +3.17 pp
```

ผล Weighted Condition Coverage:

```text
Developer Tests     : 83.27%
UTBot Tests         : 45.75%
Combined            : 87.17%
Coverage Gain       : +3.91 pp
```

การทดลองจะนับว่า UTBot ตรวจพบ Defect เฉพาะเมื่อ Generated Test แสดง Failure ใน Buggy Version แต่ไม่แสดง Failure เดียวกันใน Fixed Version

วิธีนี้ช่วยแยก **Fault Detection จริง** ออกจากปัญหาประเภท Generated Test Incompatibility, Compilation Error, Timeout และ Coverage Instrumentation Failure