# สรุปผลการทดสอบระดับคลาส — Gemini (Config A: gemini-3.5-flash-lite + Config B: gemini-3.7-flash)

> ไฟล์นี้นับ **ต่อคลาส** (1,067 ไฟล์ test จาก 854 บั๊ก เพราะบางบั๊กแก้หลายคลาส) ผลหลักแบบ **ต่อบั๊ก** ดูที่ `README.md`

## ภาพรวมทั้งหมด (ทุกโปรเจกต์รวมกัน)

| Metric | Result |
|---|---:|
| Total classes tested (test files) | 1067 |
| Compiled successfully | 395 (37.02%) |
| Classes with kills_bug = True | 20 |
| Fault Detection Rate — ทุกคลาส | 1.87% |
| Fault Detection Rate — เฉพาะคลาสที่ compile ผ่าน | 5.06% |
| Classes with error (compile ไม่ผ่าน, timeout ฯลฯ) | 679 |
| Average Line Coverage | 91.33% |
| Average Condition Coverage | 85.41% |

## แยกรายโปรเจกต์

| Project | Classes | Compiled % | FDR (all) | FDR (compiled) | Avg Line Cov | Avg Cond Cov |
|---|---:|---:|---:|---:|---:|---:|
| Chart | 28 | 57.14% | 7.14% | 12.50% | 79.23% | 67.26% |
| Cli | 51 | 66.67% | 0.00% | 0.00% | 95.82% | 91.85% |
| Closure | 225 | 13.33% | 0.00% | 0.00% | 82.17% | 69.58% |
| Codec | 24 | 87.50% | 4.17% | 4.76% | 93.97% | 86.22% |
| Collections | 28 | 64.29% | 7.14% | 11.11% | 93.53% | 90.48% |
| Compress | 58 | 53.45% | 0.00% | 0.00% | 87.55% | 83.15% |
| Csv | 17 | 47.06% | 0.00% | 0.00% | 97.80% | 92.20% |
| Gson | 21 | 47.62% | 0.00% | 0.00% | 89.64% | 83.20% |
| JacksonCore | 35 | 31.43% | 0.00% | 0.00% | 86.46% | 77.75% |
| JacksonDatabind | 157 | 19.75% | 0.64% | 3.23% | 88.17% | 83.65% |
| JacksonXml | 6 | 16.67% | 0.00% | 0.00% | 74.80% | 63.80% |
| Jsoup | 125 | 30.40% | 0.00% | 0.00% | 91.33% | 85.67% |
| JxPath | 35 | 17.14% | 2.86% | 16.67% | 92.57% | 86.15% |
| Lang | 61 | 39.34% | 4.92% | 12.50% | 94.87% | 90.38% |
| Math | 119 | 64.71% | 6.72% | 10.39% | 94.74% | 90.36% |
| Mockito | 46 | 45.65% | 2.17% | 4.76% | 99.09% | 95.31% |
| Time | 31 | 58.06% | 3.23% | 5.56% | 88.53% | 80.57% |

## หมายเหตุ

- **Fault Detection Rate (all)** = จำนวนคลาสที่ test จับบั๊กได้ / จำนวนคลาสทั้งหมด
- **Fault Detection Rate (compiled)** = จำนวนคลาสที่ test จับบั๊กได้ / จำนวนคลาสที่ test compile ผ่าน (แยกผลของโมเดล AI ออกจากปัญหาความเข้ากันไม่ได้ของ syntax/library)
- Coverage เป็นค่าเฉลี่ยจากคลาสที่วัด coverage ได้สำเร็จเท่านั้น
- ใน `gemini_summary.csv` คอลัมน์ `total_bugs` หมายถึงจำนวนคลาส (ชื่อคอลัมน์มาจากสคริปต์สรุปผล)
