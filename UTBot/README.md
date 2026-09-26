# UTBot Automated Test Generation

ส่วนนี้เป็นการทดลองใช้ **UTBot Java CLI** เพื่อสร้าง Unit Test อัตโนมัติสำหรับ Java projects จาก **Defects4J** ใน Project SQA

การทดลองแบ่งออกเป็น 2 ส่วนหลัก:

1. **Pilot Experiment** — ทดลองและตรวจสอบ pipeline ด้วย Defects4J Lang-27
2. **Automated Experiment** — ใช้ Python automation รัน UTBot กับ Defects4J bugs และรวบรวมผลอัตโนมัติ

---

## Project Structure

```text
UTBot/
│
├── Code/
│   ├── run-utbot.bat
│   └── utbot-cli-local-1.0.jar
│
├── logs/
│   └── utbot-after-classloader-fix.log
│
├── patches/
│   ├── utbot-modifications.patch
│   └── utbot-version.txt
│
├── Result/
│   └── Lang-27b/
│       ├── bug_detection/
│       ├── coverage/
│       ├── generated_tests/
│       ├── performance/
│       ├── reproducibility/
│       └── README.md
│
├── Result_Automated/
│   ├── Lang-*/
│   ├── Lang_summary.md
│   ├── summary.csv
│   └── README.md
│
├── scripts/
│   ├── generate_summary.py
│   └── run_all_defects.py
│
└── README.md
```

`Result/` เก็บผลจาก pilot experiment ส่วน `Result_Automated/` เก็บผลจาก automation pipeline

> `utbot-cli-local-1.0.jar` และ raw automated results ไม่ถูกเก็บใน Git เนื่องจากมีขนาดใหญ่

---

# Environment

Environment หลักที่ใช้พัฒนาและทดลอง:

```text
Operating System : Windows 11
UTBot Runtime    : Java 17
Defects4J        : Java 11
Test Framework   : JUnit 4
Dataset          : Defects4J
```

UTBot CLI ใช้ Java 17 ในการทำงาน ส่วน Defects4J environment ใช้ Java 11

Path ของ Java และ Defects4J อาจต้องปรับให้ตรงกับเครื่องที่ใช้ทดลอง

---

# UTBot Version

UTBot source ที่ใช้:

```text
Repository : https://github.com/UnitTestBot/UTBotJava.git
Commit     : 73bd2b2aed09ba94e7cbd875c662f78db10c2da8
```

ข้อมูล version ถูกบันทึกไว้ใน:

```text
patches/utbot-version.txt
```

---

# UTBot Modifications

UTBot CLI เดิมไม่สามารถทำงานกับ Defects4J Lang ได้โดยตรงใน environment ที่ใช้ทดลอง จึงมีการแก้ไข source code บางส่วน

ปัญหาหลักที่พบระหว่างการทดลอง ได้แก่

1. การหา working directory ของ target class จาก UTBot fat JAR
2. Classloader โหลด class จาก dependency ภายใน UTBot แทน class ของ Defects4J
3. ความไม่ตรงกันระหว่าง class ที่ Reflection โหลดกับ class ที่ Soot วิเคราะห์
4. ปัญหาการทำงานร่วมกับ Defects4J บน Windows
5. Generated tests บางส่วนใช้ Java syntax ที่ใหม่กว่า source level ของ Defects4J project

UTBot จึงถูกแก้ให้ค้นหา target class จาก classpath ที่กำหนด และใช้ selective child-first class loading สำหรับ project classes

Patch และ version information อยู่ใน:

```text
patches/
```

---

# Build UTBot CLI

หลังจาก checkout UTBot source ตาม commit ที่กำหนดและ apply modifications แล้ว สามารถ build CLI ด้วย:

```cmd
gradlew.bat clean :utbot-cli:jar --no-daemon --no-parallel -PideType=IC -PsemVer=local-1.0 -x test
```

JAR ที่ได้จะอยู่ประมาณ:

```text
utbot-cli\build\libs\utbot-cli-local-1.0.jar
```

นำ JAR มาไว้ที่:

```text
Project_SQA\UTBot\Code\utbot-cli-local-1.0.jar
```

ไฟล์ JAR นี้ถูก ignore จาก Git เนื่องจากมีขนาดประมาณ 145 MB

---

# Running Automated Experiments

รันคำสั่งจาก root directory ของ `Project_SQA`

```cmd
cd D:\path\to\Project_SQA
```

ดู command options:

```cmd
python UTBot\scripts\run_all_defects.py --help
```

## Run Specific Bug

ใช้ `--project` และ `--bugs`

ตัวอย่าง Lang-27:

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --bugs 27
```

สามารถระบุหลาย Bug ID ได้:

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --bugs 27 28 45
```

## Run All Active Bugs in One Project

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --all-bugs
```

## Resume Experiment

หากมีผลการทดลองเดิมอยู่แล้ว สามารถข้าม bugs ที่มี terminal status ได้ด้วย:

```cmd
python UTBot\scripts\run_all_defects.py --project Lang --all-bugs --resume
```

## Run All Defects4J Projects

Automation script รองรับ:

```cmd
python UTBot\scripts\run_all_defects.py --all
```

ควรตรวจสอบ compatibility ของแต่ละ Defects4J project ก่อนรันชุดใหญ่ เนื่องจากแต่ละ project อาจใช้ build system, Java version และ source level แตกต่างกัน

---

# Experiment Pipeline

สำหรับแต่ละ bug automation pipeline จะดำเนินการโดยสรุปดังนี้:

```text
Checkout Buggy Version
        ↓
Checkout Fixed Version
        ↓
Baseline Compilation
        ↓
Identify Modified Classes
        ↓
Generate Tests with UTBot
        ↓
Install Generated Tests
        ↓
Run on Buggy Version
        ↓
Run Same Tests on Fixed Version
        ↓
Compare Failures
        ↓
Collect Coverage
        ↓
Save Results
```

ก่อน baseline compilation จะมีการลบ stale UTBot-generated tests จาก previous runs เพื่อไม่ให้ผลการทดลองเก่าปนกับ baseline

---

# Bug Detection Criterion

generated test จะถือว่าสามารถตรวจจับ defect ได้เมื่อ:

```text
Generated Test FAILS on Buggy Version
                AND
The Same Test PASSES on Fixed Version
```

หาก test fail ทั้ง Buggy และ Fixed version จะ **ไม่ถือว่าเป็นการตรวจจับ bug**

วิธีนี้ช่วยแยก failure ที่เกิดจาก generated test หรือ environment ออกจาก failure ที่สัมพันธ์กับ defect จริง

---

# Experiment Status

Automation pipeline ใช้ terminal statuses หลักดังนี้:

| Status | Meaning |
|---|---|
| `COMPLETED` | Generated tests สามารถ execute และเก็บ metrics ได้ |
| `TEST_COMPILE_INCOMPATIBLE` | Generated tests ไม่สามารถ compile ภายใต้ source level ของ benchmark |
| `GENERATION_TIMEOUT` | UTBot generation ใช้เวลาเกิน timeout ที่กำหนด |
| `GENERATION_FAILED` | UTBot เกิด internal error ระหว่าง test generation |

สถานะที่ไม่สามารถ execute generated tests ได้จะไม่ถูกนับเป็น bug ที่ตรวจไม่พบโดยอัตโนมัติ

---

# Automated Lang Experiment

Automation pipeline ถูกใช้กับ active bugs ทั้งหมดของ Defects4J **Lang**

ผลรวม:

| Metric | Result |
|---|---:|
| Active Bugs | 61 |
| COMPLETED | 15 (24.59%) |
| TEST_COMPILE_INCOMPATIBLE | 42 (68.85%) |
| GENERATION_TIMEOUT | 3 (4.92%) |
| GENERATION_FAILED | 1 (1.64%) |
| Generated Tests | 4,062 |
| Detected Bugs | 1 |

Bug ที่ UTBot generated tests ตรวจพบ:

```text
Lang-45
org.apache.commons.lang.WordUtils
```

---

# Fault Detection Results

Fault Detection Rate รายงานด้วย 2 denominator เพื่อแยกผลของเครื่องมือออกจาก compatibility ของ benchmark

| Metric | Result |
|---|---:|
| Detected Bugs | 1 |
| FDR — All Active Bugs | 1 / 61 = 1.64% |
| FDR — Executable Bugs | 1 / 15 = 6.67% |

`TEST_COMPILE_INCOMPATIBLE`, `GENERATION_TIMEOUT` และ `GENERATION_FAILED` ไม่ถูกจัดเป็น bug ที่ UTBot ตรวจไม่พบ เนื่องจาก generated tests ไม่สามารถเข้าสู่ขั้นตอนเปรียบเทียบ Buggy/Fixed ได้สำเร็จ

---

# Coverage Results

Coverage averages คำนวณจาก 15 experiments ที่มีสถานะ `COMPLETED`

## Line Coverage

| Test Suite | Average Coverage |
|---|---:|
| Developer Tests | 97.49% |
| UTBot Tests | 63.19% |
| Developer + UTBot | 98.15% |

Average Line Coverage Gain:

```text
+0.66 percentage points
```

## Condition Coverage

| Test Suite | Average Coverage |
|---|---:|
| Developer Tests | 90.06% |
| UTBot Tests | 55.95% |
| Developer + UTBot | 91.92% |

Average Condition Coverage Gain:

```text
+1.86 percentage points
```

Coverage เหล่านี้เป็น macro-average ของ bugs ที่มีสถานะ `COMPLETED`

---

# Generation Performance

สำหรับ 15 experiments ที่ `COMPLETED`:

| Metric | Result |
|---|---:|
| Generated Tests | 4,062 |
| Average Tests per Completed Bug | 270.80 |
| Average Generation Time | 116.46 s |
| Total Generation Time | 1,746.93 s |
| Total Generation Time | 29.12 min |

---

# Generate Experiment Summary

หลังจาก automation สร้าง `summary.csv` แล้ว สามารถสร้าง Markdown summary ด้วย:

```cmd
python UTBot\scripts\generate_summary.py
```

ผลลัพธ์หลัก:

```text
UTBot/Result_Automated/summary.csv
UTBot/Result_Automated/Lang_summary.md
```

---

# Raw Results

ผลดิบของแต่ละ bug ถูกเก็บใน:

```text
UTBot/Result_Automated/Lang-<BugID>/
```

raw results ประกอบด้วย generated tests, logs, metadata, bug detection information และ coverage artifacts ที่เกี่ยวข้องกับการทดลองแต่ละ bug

raw directories มีขนาดรวมสูง จึงถูก ignore จาก Git:

```gitignore
UTBot/Result_Automated/Lang-*/
```

แต่ไฟล์สรุปต่อไปนี้ถูกเก็บใน repository:

```text
UTBot/Result_Automated/summary.csv
UTBot/Result_Automated/Lang_summary.md
```

---

# Pilot Experiment — Lang-27

ก่อนสร้าง automation pipeline มีการทดลองแบบ manual ด้วย:

```text
Project : Lang
Bug     : 27
Class   : org.apache.commons.lang3.math.NumberUtils
```

ผลของ pilot experiment ถูกเก็บไว้ที่:

```text
Result/Lang-27b/
```

การทดลองนี้ถูกใช้เพื่อตรวจสอบ:

- UTBot generation
- Buggy/Fixed comparison
- Bug detection criterion
- Coverage collection
- Generation performance
- Reproducibility
- Windows/Defects4J compatibility

รายละเอียดของ pilot experiment อยู่ใน:

```text
Result/Lang-27b/README.md
```

---

# Reproducibility

ไฟล์สำคัญสำหรับ reproduce การทดลอง:

```text
Code/run-utbot.bat

patches/utbot-version.txt
patches/utbot-modifications.patch

scripts/run_all_defects.py
scripts/generate_summary.py

Result/Lang-27b/reproducibility/
```

Automation script และ experiment summary ถูกเก็บใน Git ส่วน raw experiment artifacts ถูกเก็บไว้ในเครื่องและไม่ถูก commit เนื่องจากมีขนาดใหญ่

---

# Current Limitations

ข้อจำกัดที่พบจากการทดลอง Lang ได้แก่:

- Defects4J bugs บางส่วนใช้ Java source level รุ่นเก่า
- UTBot generated tests อาจใช้ syntax ที่ source level เดิมไม่รองรับ
- UTBot generation บางกรณีอาจ timeout
- บาง target classes ทำให้ UTBot เกิด internal generation error
- Generated tests บางชุดสามารถ execute ได้แต่ไม่ได้เพิ่ม target coverage
- จำนวน generated tests และผล generation อาจแตกต่างกันระหว่างแต่ละ run

ดังนั้นการประเมิน Automated Test Generation ไม่ควรพิจารณา coverage เพียงอย่างเดียว แต่ควรพิจารณา Fault Detection, Compatibility และ Performance ร่วมด้วย