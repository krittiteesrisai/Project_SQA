#!/usr/bin/env python3
"""
extract_results_structured.py

สกัดข้อมูลที่จำเป็นจาก results_full.csv ออกมาเป็นโครงสร้างโฟลเดอร์
ต่อ 1 บั๊ก (แบบเดียวกับที่ UTBot ของเพื่อนใช้) แทนที่จะต้องเก็บ work/
ทั้งก้อน (20GB) ไว้ push ขึ้น GitHub

โครงสร้างที่ได้ต่อบั๊ก:
    Result_Automated/<Project>-<BugID>/
        generated_tests/<ClassName>Test.java
        bug_detection/summary.txt      (compiled, kills_bug, buggy_failing, fixed_failing)
        coverage/coverage.txt          (line/condition coverage ดิบ)

ขนาดรวมหลังสกัดควรเล็กมาก (หลัก MB ไม่ใช่ GB) เพราะเก็บแค่ไฟล์ข้อความ
กับไฟล์ .java ไม่เก็บ .git/.svn/build artifacts ที่มากับ checkout

Usage:
    python3 extract_results_structured.py results_full.csv --out-dir Result_Automated
"""

import argparse
import ast
import csv
import shutil
from pathlib import Path


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("results_csv")
    parser.add_argument("--out-dir", default="Result_Automated")
    args = parser.parse_args()

    out_root = Path(args.out_dir)
    done, missing_test = 0, 0

    with open(args.results_csv, newline="", encoding="utf-8") as f:
        for row in csv.DictReader(f):
            project = row.get("project")
            bug_id = row.get("bug_id")
            if not project or not bug_id:
                continue

            bug_dir = out_root / f"{project}-{bug_id}"
            (bug_dir / "generated_tests").mkdir(parents=True, exist_ok=True)
            (bug_dir / "bug_detection").mkdir(parents=True, exist_ok=True)
            (bug_dir / "coverage").mkdir(parents=True, exist_ok=True)

            # 1) ไฟล์ test code (ถ้ายังหาเจอใน work/)
            test_file = row.get("test_file")
            if test_file and Path(test_file).exists():
                shutil.copy2(test_file, bug_dir / "generated_tests" / Path(test_file).name)
            else:
                missing_test += 1

            # 2) สรุปผลการตรวจจับบั๊ก (ข้อความล้วน ไม่กิน MB)
            summary_lines = [
                f"project: {project}",
                f"bug_id: {bug_id}",
                f"class_name: {row.get('class_name')}",
                f"compiled: {row.get('compiled')}",
                f"kills_bug: {row.get('kills_bug')}",
                f"buggy_failing: {row.get('buggy_failing')}",
                f"fixed_failing: {row.get('fixed_failing')}",
                f"error: {row.get('error')}",
            ]
            (bug_dir / "bug_detection" / "summary.txt").write_text(
                "\n".join(summary_lines), encoding="utf-8"
            )

            # 3) coverage ดิบ (parse list-string กลับเป็นบรรทัดอ่านง่าย)
            raw_cov = row.get("coverage")
            if raw_cov:
                try:
                    lines = ast.literal_eval(raw_cov) if raw_cov.startswith("[") else [raw_cov]
                except (ValueError, SyntaxError):
                    lines = [raw_cov]
                (bug_dir / "coverage" / "coverage.txt").write_text(
                    "\n".join(str(l).strip() for l in lines), encoding="utf-8"
                )

            done += 1

    print(f"สร้างโครงสร้างสำเร็จ: {done} บั๊ก")
    print(f"บั๊กที่หา test file ไม่เจอแล้ว (compile fail/ไฟล์ถูกลบไปแล้ว): {missing_test}")
    print(f"เก็บไว้ที่: {out_root.resolve()}")

    # โชว์ขนาดรวมให้ดูเทียบกับ work/ เดิม
    total_size = sum(p.stat().st_size for p in out_root.rglob("*") if p.is_file())
    print(f"ขนาดรวมหลังสกัด: {total_size / 1024 / 1024:.2f} MB")


if __name__ == "__main__":
    main()
