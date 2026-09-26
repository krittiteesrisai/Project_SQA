# UTBot Automated Experiment Results

Directory นี้เก็บผลจาก automated experiment ของ UTBot บน Defects4J

## Files

```text
Result_Automated/
├── Lang-*/             # Raw results (local only)
├── Lang_summary.md     # Human-readable experiment summary
├── summary.csv         # Per-bug experiment results
└── README.md
```

## summary.csv

`summary.csv` เก็บผลระดับ bug จาก automation pipeline เช่น:

- Experiment status
- Target class
- Number of generated tests
- Generation time
- Bug detection result
- Developer test coverage
- UTBot test coverage
- Combined coverage

ไฟล์นี้ใช้เป็นข้อมูลหลักสำหรับสร้าง experiment summary และวิเคราะห์ผลรวม

## Lang_summary.md

`Lang_summary.md` เป็นรายงานสรุปผลจาก Defects4J Lang โดยสร้างจาก:

```cmd
python UTBot\scripts\generate_summary.py
```

รายงานประกอบด้วย:

- Experiment status distribution
- Fault Detection Rate
- Test generation statistics
- Line coverage
- Condition coverage

## Raw Results

ผลดิบของแต่ละ bug อยู่ใน directory:

```text
Lang-<BugID>/
```

ตัวอย่าง:

```text
Lang-27/
Lang-45/
```

raw directories เหล่านี้ไม่ถูก commit เข้า Git เนื่องจากมีจำนวนไฟล์และขนาดรวมสูง

`.gitignore` จึงกำหนด:

```gitignore
UTBot/Result_Automated/Lang-*/
```

ไฟล์ `summary.csv` และ `Lang_summary.md` ยังคงถูกเก็บใน Git เพื่อใช้ตรวจสอบผลการทดลอง

## Bug Detection Criterion

generated test จะถือว่าสามารถตรวจจับ defect ได้เมื่อ:

```text
FAIL on Buggy Version
        AND
PASS on Fixed Version
```

test ที่ fail ทั้ง Buggy และ Fixed version จะไม่ถูกนับเป็น bug-revealing test

## Status

| Status | Meaning |
|---|---|
| `COMPLETED` | Generated tests สามารถ execute และเก็บ metrics ได้ |
| `TEST_COMPILE_INCOMPATIBLE` | Generated tests ไม่สามารถ compile ภายใต้ benchmark source level |
| `GENERATION_TIMEOUT` | UTBot generation เกิน timeout |
| `GENERATION_FAILED` | UTBot เกิด internal error ระหว่าง generation |

## Current Lang Results

| Metric | Result |
|---|---:|
| Active Bugs | 61 |
| Completed | 15 |
| Test Compile Incompatible | 42 |
| Generation Timeout | 3 |
| Generation Failed | 1 |
| Generated Tests | 4,062 |
| Bugs Detected | 1 |
| FDR — All Bugs | 1.64% |
| FDR — Executable Bugs | 6.67% |

Coverage averages ใช้เฉพาะ experiments ที่มีสถานะ `COMPLETED`