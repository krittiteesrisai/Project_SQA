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

ส่วน `UTBot/` ใช้ **UTBot Java CLI** สำหรับสร้าง Unit Test อัตโนมัติให้กับ Java projects ใน Defects4J

การทดลองประกอบด้วย

- Pilot experiment บน Lang-27
- Automated experiment สำหรับ Defects4J bugs
- Buggy/Fixed comparison
- Fault Detection
- Line Coverage
- Condition Coverage
- Generation Performance

รายละเอียด environment, configuration, วิธีรัน และผลการทดลองอยู่ที่:

```text
UTBot/README.md
```

ผล Automated Experiment อยู่ที่:

```text
UTBot/Result_Automated/
```