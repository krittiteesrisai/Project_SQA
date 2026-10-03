#!/bin/bash
# run_all.sh (v2)
# สร้างรายการบั๊กทั้งหมดใน Defects4j อัตโนมัติ แล้วรันสคริปต์ Gemini/KKU
# ทีเดียวจบทุกบั๊กทุกโปรเจกต์ แบบรันเบื้องหลัง (ปิด terminal ก็ยังรันต่อ)
#
# เพิ่มจาก v1: parameter ที่ 3 (ARGS) ส่งต่อ flag พิเศษให้ python script ได้
#   เช่น --skip-fixed-check ถ้าอยากได้เร็วขึ้นตอนใกล้ deadline (ไม่แนะนำ ปกติ)

set -e

PROVIDER="${1:-kku}"   # ใช้: ./run_all.sh kku "Lang Math"   หรือ ./run_all.sh gemini
PROJECTS="${2:-Chart Cli Closure Codec Collections Compress Csv Gson JacksonCore JacksonDatabind JacksonXml Jsoup JxPath Lang Math Mockito Time}"
EXTRA_ARGS="${3:-}"    # เช่น "--skip-fixed-check"
# ตัวอย่างแบ่งงาน 4 คน (balance ตามจำนวนบั๊ก ไม่ใช่จำนวนโปรเจกต์):
#   คนที่ 1: ./run_all.sh kku "Closure Time Csv"
#   คนที่ 2: ./run_all.sh kku "JacksonDatabind Cli Mockito Gson"
#   คนที่ 3: ./run_all.sh kku "Math Compress Chart JxPath JacksonXml"
#   คนที่ 4: ./run_all.sh kku "Jsoup Lang JacksonCore Codec Collections"
#
# ตั้งหลายคีย์ (แนะนำ กันโดน quota หมดกลางทาง):
#   export KKU_API_KEYS="key1,key2,key3"     # สำหรับ provider kku
#   export GEMINI_API_KEYS="key1,key2,key3"  # สำหรับ provider gemini

echo "=== 1. สร้าง targets_full.csv จากทุกโปรเจกต์ ==="
> targets_full.csv
for p in $PROJECTS; do
    for b in $(defects4j bids -p "$p"); do
        echo "$p,$b" >> targets_full.csv
    done 
    echo "  $p: $(defects4j bids -p "$p" | wc -l) bugs"
done
echo "รวมทั้งหมด: $(wc -l < targets_full.csv) บั๊ก"
echo ""

echo "=== 2. เริ่มรันเบื้องหลัง (provider=$PROVIDER) ==="
echo "ใช้ Ctrl+C ไม่หยุดงาน เพราะรันผ่าน nohup"
echo "ดู progress สดได้ด้วย: tail -f run_all.log"
echo "ถ้า quota หมดทุกคีย์ สคริปต์จะหยุดเองอัตโนมัติ — เช็คได้ด้วย: grep QUOTA_EXHAUSTED run_all.log"
echo ""

nohup python3 -u run_gemini_defects4j.py \
    --batch targets_full.csv \
    --workroot ./work \
    --provider "$PROVIDER" \
    --out "results_full.csv" \
    $EXTRA_ARGS \
    > run_all.log 2>&1 &

PID=$!
echo "เริ่มรันแล้ว PID=$PID"
echo "$PID" > run_all.pid

echo ""
echo "คำสั่งที่ใช้เช็คระหว่างรัน:"
echo "  tail -f run_all.log                    # ดู log สด"
echo "  wc -l results_full.csv                 # เช็คว่าทำไปกี่บั๊กแล้ว"
echo "  grep QUOTA_EXHAUSTED run_all.log       # เช็คว่าหยุดเพราะ quota หมดไหม"
echo "  kill \$(cat run_all.pid)                # หยุดกลางทางถ้าจำเป็น"
echo ""
echo "ถ้า quota หมด/หยุดกลางทาง — รันคำสั่งเดิมซ้ำได้เลยเพื่อ resume ต่อ (ข้ามคลาสที่เสร็จแล้วอัตโนมัติ):"
echo "  ./run_all.sh $PROVIDER \"$PROJECTS\" \"$EXTRA_ARGS\""
