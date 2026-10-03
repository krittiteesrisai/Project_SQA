# Project SQA

Repository สำหรับ Project รายวิชา **Software Quality Assurance (SQA)**

โปรเจกต์นี้ใช้สำหรับทดลองและเปรียบเทียบเครื่องมือสร้าง Test Case อัตโนมัติกับชุดข้อมูล **Defects4J** โดยพิจารณาผลด้าน Test Generation, Fault Detection, Code Coverage และ Performance

## Tools

ภายในโปรเจกต์มีการทดลองด้วยเครื่องมือหลายประเภท เช่น

- UTBot
- TARDIS
- Claude Sonnet
- Gemini

## Project Structure

```text
Project_SQA/
├── Claude-sonnet_5_5/
├── Gemini/
├── report/
├── TARDIS/
├── UTBot/
├── .gitattributes
├── .gitignore
└── README.md
```

## UTBot

ส่วน `UTBot/` ใช้ **UTBot Java CLI** สำหรับสร้าง Automated Unit Tests ให้กับ Java projects ในชุดข้อมูล **Defects4J**

การทดลองครอบคลุม **17 Projects และ 854 Bugs** โดยนำ Test Cases ที่ UTBot สร้างขึ้นไปรันกับทั้ง Buggy และ Fixed versions เพื่อประเมินความสามารถในการตรวจจับ Defect รวมถึงวัด Code Coverage และ Generation Performance

### Final Results

- Total Projects: **17**
- Total Bugs: **854**
- Executable Bugs: **139**
- Detected Bugs: **7**
- Fault Detection Rate (All Bugs): **0.82%**
- Fault Detection Rate (Executable Bugs): **5.04%**
- Developer Line Coverage: **89.25%**
- UTBot Line Coverage: **53.24%**
- Combined Line Coverage: **92.41%**
- Developer Condition Coverage: **83.27%**
- UTBot Condition Coverage: **45.75%**
- Combined Condition Coverage: **87.17%**

### Experiment Details

รายละเอียดเกี่ยวกับ Environment, Configuration, Methodology, วิธี Reproduce และผลการทดลองอยู่ที่:

```text
UTBot/README.md
```

### Result Files

ผลการทดลองสรุปอยู่ที่:

```text
UTBot/Result_Automated/
├── summary.csv
├── final_summary.csv
└── final_report.md
```

### Scripts

Scripts สำหรับรันการทดลองและสร้างรายงาน:

```text
UTBot/scripts/
├── run_all_defects.py
└── generate_final_report.py
```

### Reproducibility

ไฟล์ที่ใช้สำหรับ Reproduce Environment และการแก้ไขที่จำเป็นสำหรับ Defects4J และ UTBot:

```text
UTBot/patches/
├── defects4j-windows.patch
├── defects4j-version.txt
├── utbot-modifications.patch
└── utbot-version.txt
```







# TARDIS Automated Test Generation & Defects4J Evaluation Pipeline

คู่มือและคำอธิบายฉบับสมบูรณ์สำหรับการติดตั้ง, สภาพแวดล้อม (Environment), และการรันระบบสร้างชุดทดสอบอัตโนมัติด้วย **TARDIS** ร่วมกับชุดข้อมูลบั๊ก **Defects4J** พร้อมระบบวัดผลความครอบคลุม (Coverage) และประสิทธิภาพ (Performance)

## 1. ภาพรวมของโครงการ (Project Overview)
โครงการนี้มีวัตถุประสงค์เพื่อ:
1. นำเครื่องมือ **TARDIS** (Concolic / Symbolic Execution-based Test Generator) มารันสร้าง Unit Test อัตโนมัติบนบั๊กจริงของ **Defects4J**
2. วัดผลลัพธ์รอบด้านตาม measure_coverage.py: **Test Suite Size** (จำนวนคลาส/เมธอด, LOC), **Coverage** (Line & Branch), **Fault Detection** (เปรียบเทียบรันบน Buggy vs Fixed), และ **Performance** (Gen Time, Compile Time, Test Exec Time)

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
├── data_analysis/
│    └── TARDIS_Analysis.ipynb       # สมุดงาน Jupyter Notebook สำหรับวิเคราะห์ข้อมูล กราฟ และแนวโน้ม
│
├── result_csv/                      # โฟลเดอร์เก็บไฟล์ผลลัพธ์จากการทดลอง
│    ├── Coverage_Result_All.csv     # ตารางสรุปคะแนนรวมทั้งหมด 18 คอลัมน์
│    └── TARDIS_Extended_Result.csv  # ฐานข้อมูลผลลัพธ์การรันดิบ (ประวัติ Class/Method)
│
├── source_code/
│    ├── measure_coverage.py         # สคริปต์อัตโนมัติสำหรับวัด Coverage, LOC, Fault Detection
│    └── run_tardis.py               # สคริปต์หลักสำหรับรัน TARDIS บน Defects4J (โหมดปกติ)
│  
└── test_result/
     ├── saved_tests/                # โฟลเดอร์เก็บเทสต์ที่ TARDIS เจนได้ในรอบปัจจุบัน
     └── saved_tests_history/        # ถังแบ็คอัปเทสต์ของรอบการรันก่อนหน้า (กันเทสต์หาย)

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

## 7. การวิเคราะห์ข้อมูล (Data Analysis)

หลังจากประเมินผลและได้ไฟล์ CSV แล้ว คุณสามารถใช้สมุดงาน **TARDIS_Analysis.ipynb** (ในโฟลเดอร์ data_analysis/) เพื่อวิเคราะห์เชิงลึก:
- **Fault Detection Analysis:** วิเคราะห์ความสามารถในการเจอบั๊ก โดยเปรียบเทียบผลรันบน Buggy Version กับ Fixed Version
- **Coverage vs Size:** วิเคราะห์แนวโน้มระหว่าง Line/Branch Coverage กับความยาวของเทสต์ (LOC)
- **Generation Performance:** วิเคราะห์ความสัมพันธ์ระหว่างขนาดของเทสต์และ Execution Time
(สมุดงานรองรับระบบ Dynamic Path สามารถสั่งรันไฟล์จากโฟลเดอร์ใดก็ได้ โดยระบบจะค้นหาไฟล์ CSV ให้อัตโนมัติ)

---

## 8. การแก้ไขปัญหาเชิงเทคนิคที่จำเป็น (Technical Workarounds & Fixes)

สคริปต์นี้ถูกออกแบบมาเพื่อแก้ปัญหาเฉพาะทางของ TARDIS & Defects4J ดังนี้:

| ปัญหาที่พบ (Issue) | ผลกระทบ | วิธีการแก้ไขในโค้ดของเรา |
| :--- | :--- | :--- |
| **Z3 Solver Memory Leak** | WSL ค้าง หรือ Docker ตัด OOM | ใส่ `--memory=4g` และมี Watchdog คอยสั่ง `docker kill` เมื่อหมดเวลา |
| **Class-level Timeout** | รันทั้งคลาสแล้วหมดเวลา ไม่ได้ไฟล์เทสต์ | สร้าง **Fallback Mode** ซอยย่อยลงไปรันทีละ Method |
| **Evosuite Shading Error** | TARDIS เจนโค้ด `shaded.org.evosuite` ทำให้ Defects4J คอมไพล์ไม่ผ่าน | สคริปต์ `measure_coverage.py` ทำการ Replace เป็น `org.evosuite` อัตโนมัติ |
| **Name Collision on Merge** | เมื่อรวมเทสต์หลายโฟลเดอร์ ชื่อคลาส Java ชนกัน | ใช้ Regex เปลี่ยนชื่อเป็น `_M0_Test`, `_M1_Test` ก่อนรวมก้อน |
| **Crash & Resume** | เครื่องดับหรือเน็ตหลุด ต้องเริ่มใหม่หมด | ใช้ระบบ Tracking ผ่าน CSV ข้ามงานที่สถานะอยู่ใน `RESUMABLE_STATUSES` ทันที |

---

## 9. คำอธิบายผลลัพธ์ CSV (Result Columns Reference)

ไฟล์ **`Coverage_Result_All.csv`** มีโครงสร้าง 24 คอลัมน์ ครอบคลุมเมทริกซ์ 5 กลุ่มหลัก:

| กลุ่ม | คอลัมน์ | ความหมาย |
| :--- | :--- | :--- |
| **ข้อมูลทั่วไป** | `Project`, `BugID` | ชื่อโครงการ (เช่น Lang) และหมายเลขบั๊ก |
| **ขนาดชุดทดสอบ**<br/>(Test Suite Size) | `Total_Classes_Merged` | จำนวน Class ต้นฉบับที่นำเทสต์มารวมกัน |
| | `Total_Methods_Merged` | จำนวนโฟลเดอร์ย่อย/Method ที่นำมารวมกันได้สำเร็จ |
| | `Num_Test_Methods` | จำนวน Test Method (@Test) ทั้งหมดที่เจนมาได้ |
| | **`Test_Suite_LOC`** | ความยาวบรรทัดรวมของชุดทดสอบ (ไม่นับบรรทัดว่าง) |
| **ประสิทธิภาพ**<br/>(Performance) | `Gen_Time_sec` | เวลาที่ TARDIS ใช้สร้างเทสต์ (วินาที) |
| | `Saved_Tests_Count` | จำนวนเทสต์ที่ TARDIS สร้างสำเร็จระหว่างเจน |
| | `Tests_per_Minute` | อัตราความเร็วในการสร้างเทสต์ต่อนาที |
| | `Compile_Time_sec` | เวลาที่ใช้ในการคอมไพล์ชุดทดสอบ (วินาที) |
| | **`Test_ExecTime_sec`** | เวลาที่ใช้รันชุดทดสอบด้วย `defects4j test` (วินาที) |
| **ความครอบคลุม**<br/>(Coverage) | `Line_Coverage(%)` | เปอร์เซ็นต์ความครอบคลุมระดับบรรทัดคำสั่ง (Line Coverage) |
| | `Branch_Coverage(%)` | เปอร์เซ็นต์ความครอบคลุมระดับเงื่อนไข (Branch Coverage) |
| | `Covered_...` / `Total_...` | ข้อมูลดิบจำนวน Lines/Branches ที่ครอบคลุมเทียบกับทั้งหมด |
| **การตรวจจับบั๊ก**<br/>(Fault Detection) | `Failing_Buggy` | จำนวนเทสต์ที่ Fail บน Buggy Version |
| | `Failing_Fixed` | จำนวนเทสต์ที่ Fail บน Fixed Version |
| | **`Fault_Detected`** | `YES` หาก `Failing_Buggy > 0` และ `Failing_Fixed == 0` |
| | `Eval_Status` | สถานะการประเมิน (เช่น EVAL_SUCCESS หรือ FAIL) |
| **ประวัติการรัน**<br/>(Runner Info) | `Runner_Status` | สถานะการรันตอนต้นจาก TARDIS (เช่น COMPLETED, TIMEOUT) |
| | `Runner_Error` | Error Log กรณีที่ TARDIS เจนเทสต์ล้มเหลว |
| | `TimeoutLimit` | ขีดจำกัดเวลา Timeout ที่กำหนดให้ TARDIS |
