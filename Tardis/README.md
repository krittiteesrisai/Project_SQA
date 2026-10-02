# TARDIS Automated Test Generation & Defects4J Evaluation Pipeline

คู่มือและคำอธิบายฉบับสมบูรณ์สำหรับการติดตั้ง, สภาพแวดล้อม (Environment), และการรันระบบสร้างชุดทดสอบอัตโนมัติด้วย **TARDIS** ร่วมกับชุดข้อมูลบั๊ก **Defects4J** พร้อมระบบวัดผลความครอบคลุม (Coverage) และประสิทธิภาพ (Performance)

---

## 📌 สารบัญ (Table of Contents)
- [TARDIS Automated Test Generation \& Defects4J Evaluation Pipeline](#tardis-automated-test-generation--defects4j-evaluation-pipeline)
  - [📌 สารบัญ (Table of Contents)](#-สารบัญ-table-of-contents)
  - [1. ภาพรวมของโครงการ (Project Overview)](#1-ภาพรวมของโครงการ-project-overview)
  - [2. ความต้องการของระบบ (System Requirements)](#2-ความต้องการของระบบ-system-requirements)
  - [3. การเตรียมสภาพแวดล้อม (Environment Setup)](#3-การเตรียมสภาพแวดล้อม-environment-setup)
    - [3.1 ดึง Docker Image ของ TARDIS](#31-ดึง-docker-image-ของ-tardis)
    - [3.2 ติดตั้ง Defects4J](#32-ติดตั้ง-defects4j)
  - [4. โครงสร้างของโปรเจกต์ (Project Structure)](#4-โครงสร้างของโปรเจกต์-project-structure)
  - [5. การรันการทดลอง (Running the Experiments)](#5-การรันการทดลอง-running-the-experiments)
  - [6. การประเมินผลลัพธ์ (Evaluating Coverage \& Performance)](#6-การประเมินผลลัพธ์-evaluating-coverage--performance)
    - [รันวัดผลทั้งหมดทุกโปรเจกต์:](#รันวัดผลทั้งหมดทุกโปรเจกต์)
    - [รันวัดผลเฉพาะเจาะจงรายบั๊ก (เช่น Lang-12):](#รันวัดผลเฉพาะเจาะจงรายบั๊ก-เช่น-lang-12)
  - [7. การแก้ไขปัญหาเชิงเทคนิคที่จำเป็น (Technical Workarounds \& Fixes)](#7-การแก้ไขปัญหาเชิงเทคนิคที่จำเป็น-technical-workarounds--fixes)
  - [8. คำอธิบายผลลัพธ์ CSV (Result Columns Reference)](#8-คำอธิบายผลลัพธ์-csv-result-columns-reference)

---

## 1. ภาพรวมของโครงการ (Project Overview)
โครงการนี้มีวัตถุประสงค์เพื่อ:
1. นำเครื่องมือ **TARDIS** (Concolic / Symbolic Execution-based Test Generator) มารันสร้าง Unit Test อัตโนมัติบนบั๊กจริงของ **Defects4J**
3. วัดผลลัพธ์รอบด้าน: **Line Coverage**, **Branch Coverage**, **Fault Detection (ตรวจจับบั๊ก)**, **ขนาดโค้ดเทสต์ (LOC)**, และ **เวลาที่ใช้รัน (Execution Time)**

---

## 2. ความต้องการของระบบ (System Requirements)
เนื่องจาก TARDIS ใช้ Z3 SMT Solver ร่วมกับการรัน Docker หลาย Container (Optional ซึ่งสามารถปรับแต่งได้)สเปกเครื่องจึงมีความสำคัญมาก:
- **ระบบปฏิบัติการ:** Linux (Ubuntu 20.04 / 22.04 LTS หรือ Windows 11 ผ่าน WSL2)
- **RAM:** แนะนำ 8-16 GB ขึ้นไป โดยตั้ง WSL2 `.wslconfig` ให้ใช้ RAM อย่างน้อย 10-12 GB)
- **Software Dependencies:**
  - Python 3.8+
  - OpenJDK 8 หรือ OpenJDK 11
  - Docker Engine & Docker CLI
  - Git, Perl (สำหรับรัน Defects4J)

---

## 3. การเตรียมสภาพแวดล้อม (Environment Setup)

### 3.1 ดึง Docker Image ของ TARDIS
ตรวจสอบให้แน่ใจว่า Docker Daemon ทำงานอยู่ จากนั้นดึง Image:
```bash
docker pull ghcr.io/pietrobraione/tardis:master
```

### 3.2 ติดตั้ง Defects4J
```bash
# Clone Defects4J (หากยังไม่มีในเครื่อง)
git clone https://github.com/rjust/defects4j.git ~/defects4j
cd ~/defects4j

# ติดตั้ง Dependencies และคอมไพล์
./init.sh

# เพิ่ม Defects4J เข้า PATH ใน ~/.bashrc
echo 'export PATH=$PATH:$HOME/defects4j/framework/bin' >> ~/.bashrc
source ~/.bashrc

# ตรวจสอบการติดตั้ง
defects4j info -p Lang
```

---

## 4. โครงสร้างของโปรเจกต์ (Project Structure)

```text
TARDIS/
│
│
├── source_code/
│    ├── measure_coverage.py         # สคริปต์อัตโนมัติสำหรับวัด Coverage, LOC, Fault Detection
│    │
│    └── run_tardis.py                   # สคริปต์หลักสำหรับรัน TARDIS บน Defects4J (โหมดปกติ)
│  
├── test_result/
│    │
│    ├── saved_tests/                    # โฟลเดอร์เก็บเทสต์ที่ TARDIS เจนได้ในรอบปัจจุบัน
│    │
│    └── saved_tests_history/            # ถังแบ็คอัปเทสต์ของรอบการรันก่อนหน้า (กันเทสต์หาย)
│
└── test_result/
     │
     ├── Coverage_Result_All.csv     # ตารางสรุปคะแนนรวมทั้งหมด 18 คอลัมน์
     │
     └── TARDIS_Extended_Result.csv      # ฐานข้อมูลผลลัพธ์การรันดิบ (ประวัติ Class/Method)

```

---

## 5. การรันการทดลอง (Running the Experiments)

สคริปต์จะวิ่งทำงานตามรายชื่อโปรเจกต์ใน Defects4J พร้อมระบบ Auto-Resume :
```bash
cd ~/TARDIS_Runner
python3 run_tardis.py
```
*การตั้งค่าสำคัญในโค้ด:*
- `CLASS_TIMEOUT = 120` (วินาทีต่องานระดับคลาส)
- `FALLBACK_METHOD_TIMEOUT_CAP = 60` (วินาทีต่องานระดับ Method)
- `MAX_WORKERS = 2` (รันคู่ขนาน 2 ตัว)


---

## 6. การประเมินผลลัพธ์ (Evaluating Coverage & Performance)

เมื่อ TARDIS เจนเทสต์เสร็จแล้ว ให้ใช้สคริปต์ `measure_coverage.py` เพื่อวัดผล:

### รันวัดผลทั้งหมดทุกโปรเจกต์:
```bash
cd ~/TARDIS_Runner/Evaluator
python3 measure_coverage.py --all
```

### รันวัดผลเฉพาะเจาะจงรายบั๊ก (เช่น Lang-12):
```bash
python3 measure_coverage.py --project Lang --bug 12
```

**กระบวนการทำงานของสคริปต์:**
1. สแกนหาไฟล์เทสต์จากทั้ง `saved_tests` และ `saved_tests_history`
2. รวมเทสต์ (Merge) พร้อมเปลี่ยนชื่อ Class ไม่ให้ชนกัน (`_M0_`, `_M1_`, ...)
3. แปลงแก้ปัญหา Evosuite Shading อัตโนมัติ
4. นับขนาดบรรทัดโค้ด (`Test_Suite_LOC`)
5. รัน `defects4j coverage` วัด Line & Branch Coverage
6. รัน `defects4j test` พร้อมจับเวลา (`Test_ExecTime_sec`) และบันทึกว่าตรวจเจอบั๊กหรือไม่ (`Fault_Detected`)
7. บันทึกผลลัพธ์ลง `Coverage_Result_All.csv`

---

## 7. การแก้ไขปัญหาเชิงเทคนิคที่จำเป็น (Technical Workarounds & Fixes)

สคริปต์นี้ถูกออกแบบมาเพื่อแก้ปัญหาเฉพาะทางของ TARDIS & Defects4J ดังนี้:

| ปัญหาที่พบ (Issue) | ผลกระทบ | วิธีการแก้ไขในโค้ดของเรา |
| :--- | :--- | :--- |
| **Z3 Solver Memory Leak** | WSL ค้าง หรือ Docker ตัด OOM | ใส่ `--memory=4g` และมี Watchdog คอยสั่ง `docker kill` เมื่อหมดเวลา |
| **Class-level Timeout** | รันทั้งคลาสแล้วหมดเวลา ไม่ได้ไฟล์เทสต์ | สร้าง **Fallback Mode** ซอยย่อยลงไปรันทีละ Method |
| **Evosuite Shading Error** | TARDIS เจนโค้ด `shaded.org.evosuite` ทำให้ Defects4J คอมไพล์ไม่ผ่าน | สคริปต์ `measure_coverage.py` ทำการ Replace เป็น `org.evosuite` อัตโนมัติ |
| **Name Collision on Merge** | เมื่อรวมเทสต์หลายโฟลเดอร์ ชื่อคลาส Java ชนกัน | ใช้ Regex เปลี่ยนชื่อเป็น `_M0_Test`, `_M1_Test` ก่อนรวมก้อน |
| **Crash & Resume** | เครื่องดับหรือเน็ตหลุด ต้องเริ่มใหม่หมด | ใช้ระบบ Tracking ผ่าน CSV ข้ามงานที่สถานะอยู่ใน `RESUMABLE_STATUSES` ทันที |

---

## 8. คำอธิบายผลลัพธ์ CSV (Result Columns Reference)

ไฟล์ **`Coverage_Result_All.csv`** มีโครงสร้าง 18 คอลัมน์มาตรฐาน:

| คอลัมน์ | ความหมาย |
| :--- | :--- |
| `Project` | ชื่อโครงการใน Defects4J (เช่น Lang, Math, Chart) |
| `BugID` | หมายเลขบั๊ก |
| `Total_Classes_Merged` | จำนวน Class ต้นฉบับที่นำเทสต์มารวมกัน |
| `Total_Methods_Merged` | จำนวนโฟลเดอร์ย่อย/Method ที่นำมารวมกันได้สำเร็จ |
| **`Test_Suite_LOC`** | ขนาดความยาวบรรทัดของชุดทดสอบที่เจนขึ้นมาได้ (ไม่นับบรรทัดว่าง) |
| **`Test_ExecTime_sec`** | เวลาที่ใช้ในการสั่งรันชุดทดสอบด้วย `defects4j test` (วินาที) |
| `Line_Coverage(%)` | เปอร์เซ็นต์ความครอบคลุมระดับบรรทัดคำสั่ง (Line Coverage) |
| `Branch_Coverage(%)` | เปอร์เซ็นต์ความครอบคลุมระดับเงื่อนไข (Condition/Branch Coverage) |
| `Covered_Lines` / `Total_Lines` | จำนวนบรรทัดที่ครอบคลุม / จำนวนบรรทัดโค้ดทั้งหมด |
| `Covered_Branches` / `Total_Branches`| จำนวนกิ่งเงื่อนไขที่ครอบคลุม / จำนวนกิ่งทั้งหมด |
| `Failing_Tests` | จำนวน Test Cases ที่รันแล้ว Fail บนโค้ดที่มีบั๊ก |
| **`Fault_Detected`** | `YES` หากเทสต์ตรวจเจอบั๊กจริง (มี Failing Test > 0), `NO` หากตรวจไม่เจอ |
| `Runner_Status` | สถานะการรันรวมของ TARDIS จากไฟล์ประวัติ |
| `Runner_Error` | ข้อความ Error หรือปัญหาที่พบระหว่างรัน |
| `Total_ExecTime_sec` | เวลารวมที่ TARDIS ใช้ในการคิดและสร้างเทสต์ (วินาที) |
| `TimeoutLimit` | ขีดจำกัดเวลา Timeout ที่กำหนดไว้ในการทดลอง |
