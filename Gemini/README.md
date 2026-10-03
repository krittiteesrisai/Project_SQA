# Gemini — AI-Assisted Unit Test Generation on Defects4J

ส่วนหนึ่งของโปรเจกต์กลุ่มวิชา **CP353201 Software Quality Assurance (Phase 2)**
โฟลเดอร์นี้คือผลการใช้ **Google Gemini** สร้าง unit test (JUnit) ให้คลาสที่มีบั๊กใน Defects4J แล้ววัดว่า test ที่ได้ compile ผ่านไหม ครอบคลุมโค้ดแค่ไหน และจับบั๊กได้หรือไม่

---

## 1. สรุปการทดลอง

| หัวข้อ | รายละเอียด |
|---|---|
| Dataset | Defects4J v3 — 17 โปรเจกต์, 854 active bugs |
| ขอบเขตงาน | คลาสที่ถูกแก้ในแต่ละบั๊ก (`classes.modified`) คลาสละ 1 ไฟล์ test |
| รูปแบบ test | JUnit 4, สร้างครั้งเดียวต่อคลาส (ไม่มีการให้ AI แก้ซ้ำ) |
| เครื่องมือวัด | `defects4j compile`, `defects4j coverage` (Cobertura), JUnitCore |
| สภาพแวดล้อม | WSL2 Ubuntu, OpenJDK 11, Python 3 |

### จำนวนบั๊กต่อโปรเจกต์

รายการบั๊กทั้งหมดอยู่ใน `Result/targets_full.csv` (สร้างจาก `defects4j bids -p <project>` ใน `run_all.sh`)

| โปรเจกต์ | บั๊ก | โปรเจกต์ | บั๊ก |
|---|---:|---|---:|
| Chart | 26 | JacksonDatabind | 110 |
| Cli | 39 | JacksonXml | 6 |
| Closure | 174 | Jsoup | 93 |
| Codec | 18 | JxPath | 22 |
| Collections | 28 | Lang | 61 |
| Compress | 47 | Math | 106 |
| Csv | 16 | Mockito | 38 |
| Gson | 18 | Time | 26 |
| JacksonCore | 26 | **รวม** | **854** |

### โมเดลที่ใช้ (2 รุ่น)

ใช้ prompt และวิธีวัดผลชุดเดียวกันทั้งหมด แต่รันด้วย Gemini สองรุ่น เพราะโควต้ารายวันของรอบแรกหมดกลางทาง

| ชุด | โมเดล | ช่องทาง | บั๊ก |
|---|---|---|---|
| A | `gemini-3.5-flash-lite` | Google Gemini API | 854 |


> ผลของสองชุดรวมอยู่ใน `Result/results.csv` ไฟล์เดียว ไม่ควรเทียบกันตรง ๆ ว่ารุ่นไหนดีกว่า เพราะชุดบั๊กต่างกัน

---

## 2. ผลลัพธ์

> ผลสุดท้าย ครบทั้ง 854 บั๊ก นับ **ต่อบั๊ก** เป็นตัวหลัก: บั๊กนับว่า "จับได้" ถ้า test ของคลาสใดคลาสหนึ่งในบั๊กนั้นจับได้

| ตัวชี้วัด (ต่อบั๊ก) | ค่า |
|---|---|
| บั๊กที่ทดลอง | 854 / 854 |
| บั๊กที่มี test compile ผ่านอย่างน้อย 1 คลาส | 366 (42.86%) |
| **บั๊กที่จับได้ (kills_bug)** | **20 / 854** |
| **Fault Detection Rate (ทุกบั๊ก)** | **2.34%** (20 / 854) |
| **Fault Detection Rate (เฉพาะบั๊กที่ compile ผ่าน)** | **5.46%** (20 / 366) |
| Average Line Coverage (เฉลี่ยต่อคลาส) | 91.33% |
| Average Condition Coverage (เฉลี่ยต่อคลาส) | 85.41% |

**ข้อมูลประกอบระดับคลาส** — 127 บั๊กแก้มากกว่า 1 คลาส และสร้าง test แยกทุกคลาส จึงมี test ทั้งหมด 1,067 ไฟล์ (ไม่มีแถวซ้ำ): compile ผ่าน 395 (37.0%), จับบั๊กได้ 20 แถว, FDR ระดับคลาส 1.87% (20 / 1,067) และ 5.06% (20 / 395) ตัวเลขใน `Result/gemini_summary.md` เป็นระดับคลาสนี้

**นิยาม**
- **compiled** — test ที่ AI เขียน compile ผ่านบน buggy version
- **kills_bug = True** — test **ล้มบน buggy version และผ่านบน fixed version** (จับบั๊กได้จริง ไม่ใช่ test พังเอง)
- **Coverage** — วัดต่อคลาส แล้วเฉลี่ยเฉพาะคลาสที่วัดได้

---

## 3. โครงสร้างโฟลเดอร์

```
Gemini/
├── README.md
├── Prompt/
│   └── prompt_template.txt        ← prompt ที่ส่งให้ AI (Chain-of-Thought, JUnit 4)
├── Code/
│   ├── run_gemini_defects4j.py    ← pipeline หลัก
│   ├── run_all.sh                 ← รันทุกโปรเจกต์แบบเบื้องหลัง
│   ├── generate_summary.py        ← สรุปผลเป็นตาราง
│   └── extract_results_structured.py  ← แยกผลรายบั๊ก
├── Result/
│   ├── targets_full.csv           ← รายการบั๊กทั้ง 854 ตัว (project,bug)
│   ├── results.csv                ← ผลดิบทุกคลาส
│   ├── gemini_summary.csv / .md   ← สรุปรายโปรเจกต์ + ภาพรวม
│   └── per_bug/<Project>-<BugID>/
│       ├── generated_tests/       ← ไฟล์ test ที่ AI สร้าง
│       ├── bug_detection/         ← <Class>_summary.txt (compiled, kills_bug, จำนวน test ที่ล้ม)
│       └── coverage/              ← <Class>_coverage.txt
└── TestCode/<Project>/<BugID>/    ← ไฟล์ .java ทั้งหมดที่ AI สร้าง
```

**คอลัมน์ใน `results.csv`**

| คอลัมน์ | ความหมาย |
|---|---|
| `project`, `bug_id`, `class_name` | บั๊กและคลาสที่ทดสอบ |
| `compiled` | compile ผ่านหรือไม่ |
| `coverage` | line / condition coverage จาก `defects4j coverage` |
| `kills_bug` | จับบั๊กได้หรือไม่ (ล้มบน buggy + ผ่านบน fixed) |
| `buggy_failing`, `fixed_failing` | จำนวน test ที่ล้มบน buggy / fixed version |
| `error` | ข้อความ error (เช่น compile failed, timeout) |
| `test_file` | path ของไฟล์ test ตอนรัน |
| `prompt_chars` | ความยาว prompt ที่ส่ง |

---

## 4. Pipeline การทำงาน

สำหรับแต่ละบั๊ก สคริปต์ `run_gemini_defects4j.py` ทำตามลำดับ:

1. `defects4j checkout` buggy version
2. `defects4j export` หา `classes.modified`, test classpath และ source directory
3. อ่าน source ของคลาสที่ถูกแก้ ใส่ลงใน prompt template แล้วส่งให้ Gemini
4. บันทึกโค้ดที่ได้เป็น `<Class>Test.java` ใน `src/test/java/...`
5. `defects4j compile` → ถ้าผ่าน `defects4j coverage`
6. รัน test ด้วย JUnitCore บน buggy version
7. ถ้ามี test ล้ม → checkout fixed version, ใส่ test เดิม, compile และรันซ้ำ
8. บันทึกผลลง CSV ทีละคลาส (resume ต่อได้ถ้าหยุดกลางทาง)

กลไกเสริม: หมุนหลาย API key อัตโนมัติเมื่อโควต้าหมด, หยุดเองเมื่อทุก key หมด, และตัดคำสั่งที่ค้างเกิน 20 นาที

---

## 5. วิธี Reproduce

### 5.1 ติดตั้ง

```bash
# Java 11, Perl, Git, SVN ตามที่ Defects4J ต้องการ
sudo apt install openjdk-11-jdk git subversion perl cpanminus unzip
git clone https://github.com/rjust/defects4j.git
cd defects4j && cpanm --installdeps . && ./init.sh
export PATH=$PATH:$(pwd)/framework/bin
defects4j pids   # ต้องเห็น 17 โปรเจกต์

pip install openai google-genai
```

### 5.2 ตั้งค่า API key (ไม่เก็บใน repo)

```bash
# ai.kku.ac.th — ใส่บรรทัดละ 1 key
nano kku_keys.txt
# หรือ Google Gemini API
export GEMINI_API_KEYS="key1,key2"
```

> `kku_keys.txt` อยู่ใน `.gitignore` ห้าม commit API key

### 5.3 รัน

```bash
cd Code

# บั๊กเดียว
python3 run_gemini_defects4j.py --project Lang --bug 28 --provider kku --out results.csv

# หลายบั๊กจากไฟล์ (บรรทัดละ project,bug)
python3 run_gemini_defects4j.py --batch targets.csv --workroot ./work --provider kku --out results.csv

# ทุกโปรเจกต์แบบเบื้องหลัง
./run_all.sh kku

# ตัดเวลาคำสั่งที่ค้าง (ค่าเริ่มต้น 1200 วินาที)
CMD_TIMEOUT_SEC=600 python3 run_gemini_defects4j.py --batch targets.csv --provider kku
```

`--provider gemini` ใช้ Google API (โมเดลตั้งที่ `MODEL_NAME`), `--provider kku` ใช้ ai.kku.ac.th (โมเดลตั้งที่ `KKU_MODEL_NAME`)

### 5.4 สรุปผล

```bash
python3 generate_summary.py results.csv --out-prefix gemini --label "Gemini"
python3 extract_results_structured.py results.csv --out-dir per_bug
```

---

## 6. ข้อจำกัด

- **Compile failure สูง** — ส่วนหนึ่งเป็นความผิดพลาดของ AI (เรียก API ที่ไม่มีอยู่จริง) อีกส่วนเป็นความเข้ากันไม่ได้กับ benchmark เช่น โปรเจกต์ที่ใช้ JUnit 3 หรือ Java source level เก่า ยังไม่ได้แยกสัดส่วนสองกลุ่มนี้
- **วัด kills_bug ไม่ได้ในบางโปรเจกต์** — 34 จาก 364 คลาสที่ compile ผ่าน (31 บั๊ก: Cli 27, Compress 4, Time 2, Gson 1) รัน test ไม่ได้ เพราะ test classpath ของโปรเจกต์มีแค่ JUnit 3 (เช่น `junit-3.8.2.jar`) จึงไม่มี `org.junit.runner.JUnitCore` แถวเหล่านี้ถูกบันทึกเป็น `kills_bug=False` แต่ความหมายจริงคือ "ไม่ทราบผล"
- **Coverage ไม่ใช่ของ AI ล้วน** — ไฟล์ test ตั้งชื่อ `<Class>Test.java` จึงอาจเขียนทับ test ของนักพัฒนาที่ชื่อซ้ำ ค่า coverage ที่รายงานคือ test ของนักพัฒนาที่เหลือรวมกับ test ของ AI (`kills_bug` ไม่ได้รับผลกระทบ เพราะเทียบ buggy/fixed ด้วยไฟล์เดียวกัน)
- **สร้างครั้งเดียว** — ไม่มีการส่ง error กลับให้ AI แก้ ผลจึงสะท้อนความสามารถ zero-shot
- **Timeout** — คำสั่งที่ค้างเกิน 20 นาที (เช่น test ที่วนลูปหนัก) ถูกตัดและบันทึกเป็น error
