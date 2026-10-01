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
├── Claude-sonnet_4_6/
├── dataset/
├── Gemini/
├── report/
├── results/
├── scripts/
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
