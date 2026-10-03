#!/usr/bin/env python3
"""
generate_summary.py

อ่าน results ที่ได้จาก run_gemini_defects4j.py (เช่น results_full_kku.csv)
แล้วสรุปเป็นตาราง/Markdown แบบเดียวกับที่ UTBot ใช้ (summary.csv + <Project>_summary.md)
เพื่อให้เอาไปเทียบกับผลของ Algorithm (EvoSuite/Randoop/UTBot) ได้ตรง ๆ

Usage:
    python3 generate_summary.py results_full_kku.csv
    python3 generate_summary.py results_full_kku.csv --out-prefix gemini
"""

import argparse
import ast
import csv
import re
import statistics
from collections import defaultdict
from pathlib import Path


def parse_coverage(raw):
    """แปลง coverage string (list-of-lines repr) เป็น dict {line_pct, condition_pct}."""
    if not raw or raw in ("None", ""):
        return {"line_pct": None, "condition_pct": None}
    try:
        lines = ast.literal_eval(raw) if raw.startswith("[") else [raw]
    except (ValueError, SyntaxError):
        lines = [raw]

    line_pct = None
    cond_pct = None
    for line in lines:
        m = re.search(r"Line coverage:\s*([\d.]+)%", line)
        if m:
            line_pct = float(m.group(1))
        m = re.search(r"Condition coverage:\s*([\d.]+)%", line)
        if m:
            cond_pct = float(m.group(1))
    return {"line_pct": line_pct, "condition_pct": cond_pct}


def to_bool(val):
    if isinstance(val, bool):
        return val
    if val is None:
        return None
    v = str(val).strip().lower()
    if v in ("true", "1"):
        return True
    if v in ("false", "0", ""):
        return False
    return None


def load_rows(csv_path):
    with open(csv_path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def summarize(rows):
    """คืนค่า dict สรุปทั้งรวมทุกโปรเจกต์ และแยกรายโปรเจกต์"""
    by_project = defaultdict(list)
    for row in rows:
        by_project[row["project"]].append(row)

    def summarize_group(group_rows):
        total = len(group_rows)
        compiled = [r for r in group_rows if to_bool(r.get("compiled"))]
        n_compiled = len(compiled)
        killed = [r for r in group_rows if to_bool(r.get("kills_bug"))]
        n_killed = len(killed)
        errored = [r for r in group_rows if r.get("error")]

        line_pcts, cond_pcts = [], []
        for r in group_rows:
            cov = parse_coverage(r.get("coverage"))
            if cov["line_pct"] is not None:
                line_pcts.append(cov["line_pct"])
            if cov["condition_pct"] is not None:
                cond_pcts.append(cov["condition_pct"])

        return {
            "total_bugs": total,
            "n_compiled": n_compiled,
            "pct_compiled": (n_compiled / total * 100) if total else 0,
            "n_killed": n_killed,
            "fdr_all": (n_killed / total * 100) if total else 0,
            "fdr_compiled": (n_killed / n_compiled * 100) if n_compiled else 0,
            "n_errored": len(errored),
            "avg_line_coverage": statistics.mean(line_pcts) if line_pcts else None,
            "avg_condition_coverage": statistics.mean(cond_pcts) if cond_pcts else None,
        }

    overall = summarize_group(rows)
    per_project = {p: summarize_group(g) for p, g in sorted(by_project.items())}
    return overall, per_project


def write_summary_csv(overall, per_project, out_path):
    fieldnames = ["project", "total_bugs", "n_compiled", "pct_compiled",
                  "n_killed", "fdr_all", "fdr_compiled", "n_errored",
                  "avg_line_coverage", "avg_condition_coverage"]
    with open(out_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        for project, stats in per_project.items():
            writer.writerow({"project": project, **stats})
        writer.writerow({"project": "TOTAL", **overall})


def fmt_pct(x):
    return f"{x:.2f}%" if x is not None else "N/A"


def write_summary_md(overall, per_project, provider_label, out_path):
    lines = [f"# สรุปผลการทดสอบ — {provider_label}", ""]

    lines += [
        "## ภาพรวมทั้งหมด (ทุกโปรเจกต์รวมกัน)",
        "",
        "| Metric | Result |",
        "|---|---:|",
        f"| Total bugs tested | {overall['total_bugs']} |",
        f"| Compiled successfully | {overall['n_compiled']} ({fmt_pct(overall['pct_compiled'])}) |",
        f"| Bugs detected (kills_bug) | {overall['n_killed']} |",
        f"| Fault Detection Rate — All bugs | {fmt_pct(overall['fdr_all'])} |",
        f"| Fault Detection Rate — Compiled only | {fmt_pct(overall['fdr_compiled'])} |",
        f"| Errored targets | {overall['n_errored']} |",
        f"| Average Line Coverage | {fmt_pct(overall['avg_line_coverage'])} |",
        f"| Average Condition Coverage | {fmt_pct(overall['avg_condition_coverage'])} |",
        "",
        "## แยกรายโปรเจกต์",
        "",
        "| Project | Bugs | Compiled % | FDR (all) | FDR (compiled) | Avg Line Cov | Avg Cond Cov |",
        "|---|---:|---:|---:|---:|---:|---:|",
    ]
    for project, s in per_project.items():
        lines.append(
            f"| {project} | {s['total_bugs']} | {fmt_pct(s['pct_compiled'])} | "
            f"{fmt_pct(s['fdr_all'])} | {fmt_pct(s['fdr_compiled'])} | "
            f"{fmt_pct(s['avg_line_coverage'])} | {fmt_pct(s['avg_condition_coverage'])} |"
        )

    lines += [
        "",
        "## หมายเหตุ",
        "",
        "- **Fault Detection Rate (all)** = จำนวนบั๊กที่ตรวจพบ / จำนวนบั๊กทั้งหมดที่ทดสอบ",
        "- **Fault Detection Rate (compiled)** = จำนวนบั๊กที่ตรวจพบ / จำนวนบั๊กที่ test compile ผ่านเท่านั้น "
        "(แยกผลของโมเดล AI ออกจากปัญหาความเข้ากันไม่ได้ของ syntax/library)",
        "- Coverage เป็นค่าเฉลี่ย (macro-average) จากบั๊กที่วัด coverage ได้สำเร็จเท่านั้น",
    ]

    Path(out_path).write_text("\n".join(lines), encoding="utf-8")


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("results_csv", help="ไฟล์ results ที่ได้จาก run_gemini_defects4j.py")
    parser.add_argument("--out-prefix", default="gemini", help="ชื่อไฟล์ output prefix")
    parser.add_argument("--label", default="Gemini (via ai.kku.ac.th)",
                         help="ชื่อที่จะโชว์ในรายงาน")
    args = parser.parse_args()

    rows = load_rows(args.results_csv)
    if not rows:
        raise SystemExit(f"ไม่พบข้อมูลใน {args.results_csv}")

    overall, per_project = summarize(rows)

    csv_out = f"{args.out_prefix}_summary.csv"
    md_out = f"{args.out_prefix}_summary.md"

    write_summary_csv(overall, per_project, csv_out)
    write_summary_md(overall, per_project, args.label, md_out)

    print(f"สรุปผลจาก {len(rows)} แถว ({len(per_project)} โปรเจกต์)")
    print(f"เขียนไฟล์: {csv_out}, {md_out}")
    print()
    print(f"Fault Detection Rate (all bugs):      {fmt_pct(overall['fdr_all'])}")
    print(f"Fault Detection Rate (compiled only):  {fmt_pct(overall['fdr_compiled'])}")
    print(f"Average Line Coverage:                {fmt_pct(overall['avg_line_coverage'])}")
    print(f"Average Condition Coverage:            {fmt_pct(overall['avg_condition_coverage'])}")


if __name__ == "__main__":
    main()
