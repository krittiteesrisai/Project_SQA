import os
import glob
import subprocess
import shutil
import argparse
import csv
import re
import time
import datetime
import concurrent.futures

D4J_HOME = os.environ.get("D4J_HOME", os.path.expanduser("~/defects4j"))
D4J_BIN = os.path.join(D4J_HOME, "framework/bin/defects4j")

NAN = "NaN"

CSV_HEADER = [
    "Project",
    "BugID",
    # --- Test suite size ---
    "Total_Classes_Merged",
    "Total_Methods_Merged",
    "Num_Test_Methods",
    "Test_Suite_LOC",
    # --- Generation performance (TARDIS side) ---
    "Gen_Time_sec",
    "Saved_Tests_Count",
    "Tests_per_Minute",
    # --- Evaluation timing ---
    "Compile_Time_sec",
    "Test_ExecTime_sec",
    # --- Coverage (Buggy version) ---
    "Line_Coverage(%)",
    "Branch_Coverage(%)",
    "Covered_Lines",
    "Total_Lines",
    "Covered_Branches",
    "Total_Branches",
    # --- Fault detection (Buggy vs Fixed) ---
    "Failing_Buggy",
    "Failing_Fixed",
    "Fault_Detected",
    "Eval_Status",
    # --- Runner info ---
    "Runner_Status",
    "Runner_Error",
    "TimeoutLimit",
]


def run_cmd(cmd, cwd=None):
    return subprocess.run(cmd, cwd=cwd, shell=True, capture_output=True, text=True)


def timed_cmd(cmd, cwd=None):
    t0 = time.time()
    res = run_cmd(cmd, cwd=cwd)
    return res, round(time.time() - t0, 2)


def get_runner_info(project, bug_id, tests_base_dir):
    """อ่านข้อมูลฝั่ง Generation จาก TARDIS_*_Result.csv"""
    parent_dir = os.path.dirname(os.path.abspath(tests_base_dir))
    csv_file = None
    for name in os.listdir(parent_dir):
        if name.startswith("TARDIS_") and name.endswith("_Result.csv"):
            csv_file = os.path.join(parent_dir, name)
            break
    info = {"status": NAN, "error": NAN, "gen_time": NAN, "saved": NAN, "timeout": NAN}
    if not csv_file:
        return info

    statuses, errors, timeouts = set(), set(), set()
    total_time, saved = 0.0, 0
    found = False
    try:
        with open(csv_file, "r", encoding="utf-8") as fh:
            for row in csv.DictReader(fh):
                if row.get("Project") != project or row.get("BugID") != str(bug_id):
                    continue
                found = True
                if row.get("Status"):
                    statuses.add(row["Status"])
                err = (row.get("ErrorMessage") or "").strip()
                if err and err.lower() not in ["none", "ไม่มี error"]:
                    errors.add(err)
                try:
                    total_time += float(row.get("ExecTime_sec") or 0)
                except ValueError:
                    pass
                try:
                    saved += int(float(row.get("SavedTestsCount") or 0))
                except ValueError:
                    pass
                if row.get("TimeoutLimit_sec"):
                    timeouts.add(row["TimeoutLimit_sec"])
    except Exception as e:
        print(f"Error reading result csv: {e}")

    if not found:
        return info
    info["status"] = " | ".join(sorted(statuses)) or NAN
    info["error"] = " | ".join(sorted(errors)) or NAN
    info["gen_time"] = round(total_time, 2) if total_time > 0 else NAN
    info["saved"] = saved
    info["timeout"] = " | ".join(sorted(timeouts)) or NAN
    return info


def read_failing_tests(workspace):
    """คืนค่า set ของชื่อเทสต์ที่ fail จากไฟล์ failing_tests (None ถ้าไม่มีไฟล์)"""
    path = os.path.join(workspace, "failing_tests")
    if not os.path.exists(path):
        return None
    failing = set()
    with open(path, "r", encoding="utf-8", errors="replace") as fh:
        for line in fh:
            if line.startswith("--- "):
                failing.add(line.strip()[4:])
    return failing


def checkout_and_compile(project, bug_id, version):
    workspace = os.path.abspath(f"./eval_workspace_{project}_{bug_id}{version}")
    shutil.rmtree(workspace, ignore_errors=True)
    res = run_cmd(f"{D4J_BIN} checkout -p {project} -v {bug_id}{version} -w {workspace}")
    if res.returncode != 0:
        return workspace, "CHECKOUT_FAIL", NAN
    # compile โปรเจกต์ล่วงหน้า เพื่อแยกเวลา compile ออกจากเวลารันเทสต์
    res, t = timed_cmd(f"{D4J_BIN} compile", cwd=workspace)
    if res.returncode != 0:
        return workspace, "COMPILE_FAIL", t
    return workspace, "OK", t


def eval_buggy(project, bug_id, tar_path):
    """Buggy: รัน coverage ครั้งเดียว (d4j coverage รันเทสต์และเขียน failing_tests ให้อยู่แล้ว)"""
    out = {"status": "OK", "compile_time": NAN, "exec_time": NAN,
           "line_cov": NAN, "branch_cov": NAN, "cov_lines": NAN, "total_lines": NAN,
           "cov_branches": NAN, "total_branches": NAN, "failing": None, "log": ""}
    workspace, st, ct = checkout_and_compile(project, bug_id, "b")
    out["compile_time"] = ct
    try:
        if st != "OK":
            out["status"] = f"BUGGY_{st}"
            return out
        cov_res, t = timed_cmd(f"{D4J_BIN} coverage -s {tar_path}", cwd=workspace)
        out["exec_time"] = t
        out["log"] = (cov_res.stderr or cov_res.stdout)[-500:]
        patterns = {
            "line_cov": r"Line coverage:\s+([\d\.]+)%",
            "branch_cov": r"Condition coverage:\s+([\d\.]+)%",
            "cov_lines": r"Lines covered:\s+(\d+)",
            "total_lines": r"Lines total:\s+(\d+)",
            "cov_branches": r"Conditions covered:\s+(\d+)",
            "total_branches": r"Conditions total:\s+(\d+)",
        }
        for key, pat in patterns.items():
            m = re.search(pat, cov_res.stdout)
            if m:
                out[key] = m.group(1)
        if out["line_cov"] == NAN:
            out["status"] = "BUGGY_TEST_COMPILE_OR_RUN_FAIL"
            return out
        out["failing"] = read_failing_tests(workspace) or set()
        return out
    finally:
        shutil.rmtree(workspace, ignore_errors=True)


def eval_fixed(project, bug_id, tar_path):
    """Fixed: รันเทสต์ชุดเดียวกัน แล้วดูว่าเทสต์ไหน fail"""
    out = {"status": "OK", "failing": None, "log": ""}
    workspace, st, _ = checkout_and_compile(project, bug_id, "f")
    try:
        if st != "OK":
            out["status"] = f"FIXED_{st}"
            return out
        res = run_cmd(f"{D4J_BIN} test -s {tar_path}", cwd=workspace)
        out["log"] = (res.stderr or res.stdout)[-500:]
        failing = read_failing_tests(workspace)
        # d4j test ล้มและไม่มีไฟล์ failing_tests -> เทสต์ compile ไม่ผ่านบน Fixed
        if res.returncode != 0 and failing is None:
            out["status"] = "FIXED_TEST_COMPILE_FAIL"
            return out
        if failing is None:
            m = re.search(r"Failing tests:\s+(\d+)", res.stdout)
            if m and int(m.group(1)) > 0:
                out["status"] = "FIXED_FAILING_LIST_MISSING"
                return out
            failing = set()
        out["failing"] = failing
        return out
    finally:
        shutil.rmtree(workspace, ignore_errors=True)


def merge_tests(folders, merged_suite_dir):
    merged_count, unique_classes = 0, set()
    for folder in folders:
        base = os.path.basename(folder)
        clean = re.sub(r'_(TIMEOUT|COMPLETED|SUCCESS_ON_TIMEOUT|PARTIAL_SUCCESS|NO_TESTS_GENERATED|'
                       r'CLASSLEVEL_CRASH|DOCKER_FAIL|KILLED_WITH_TESTS|FALLBACK_DONE).*', '', base)
        cls = clean.split('::')[0]
        if cls:
            unique_classes.add(cls)
        out_dir = os.path.join(folder, "out")
        if not os.path.isdir(out_dir):
            continue
        test_files = glob.glob(os.path.join(out_dir, "**", "*_Test*.java"), recursive=True)
        if not test_files:
            continue
        tag = f"M{merged_count}"
        for test_file in test_files:
            rel = os.path.relpath(test_file, out_dir)
            dest = os.path.join(merged_suite_dir, re.sub(r'_(\d+)_Test', rf'_{tag}_\1_Test', rel))
            os.makedirs(os.path.dirname(dest), exist_ok=True)
            with open(test_file, encoding="utf-8", errors="replace") as tf:
                content = tf.read()
            content = re.sub(r'_(\d+)_Test', rf'_{tag}_\1_Test', content)
            content = content.replace("shaded.org.evosuite", "org.evosuite")
            with open(dest, "w", encoding="utf-8") as df:
                df.write(content)
        merged_count += 1
    return merged_count, unique_classes


def suite_stats(merged_suite_dir):
    loc, n_tests = 0, 0
    for root, _, files in os.walk(merged_suite_dir):
        for name in files:
            if name.endswith(".java"):
                with open(os.path.join(root, name), encoding="utf-8", errors="ignore") as fj:
                    for line in fj:
                        s = line.strip()
                        if s:
                            loc += 1
                        if s.startswith("@Test"):
                            n_tests += 1
    return loc, n_tests


def build_row(project, bug_id, info, n_classes=0, n_methods=0, n_tests=NAN, loc=NAN,
              b=None, fixed_failing=NAN, fault=NAN, eval_status="NO_TESTS"):
    b = b or {}
    gen_time, saved = info["gen_time"], info["saved"]
    tpm = NAN
    if gen_time != NAN and saved not in (NAN, 0):
        tpm = round(saved / (gen_time / 60.0), 3)
    failing_b = b.get("failing")
    return [
        project, bug_id,
        n_classes, n_methods, n_tests, loc,
        gen_time, saved, tpm,
        b.get("compile_time", NAN), b.get("exec_time", NAN),
        b.get("line_cov", NAN), b.get("branch_cov", NAN),
        b.get("cov_lines", NAN), b.get("total_lines", NAN),
        b.get("cov_branches", NAN), b.get("total_branches", NAN),
        len(failing_b) if failing_b is not None else NAN,
        fixed_failing, fault, eval_status,
        info["status"], info["error"], info["timeout"],
    ]


def measure_coverage(project, bug_id, tests_base_dir, writer=None, csv_file=None):
    tar_path = None
    fh = None
    merged_suite_dir = os.path.abspath(f"./merged_suite_{project}_{bug_id}")
    print("=" * 60)
    print(f" ประเมิน Coverage / Fault Detection / Generation Perf: {project}-{bug_id}")
    print("=" * 60)

    try:
        if writer is None:
            fh = open(csv_file or f"Coverage_Result_{project}_{bug_id}.csv", "w", newline="", encoding="utf-8")
            writer = csv.writer(fh)
            writer.writerow(CSV_HEADER)

        info = get_runner_info(project, bug_id, tests_base_dir)

        folders = [d for d in glob.glob(os.path.join(tests_base_dir, project, bug_id, "*")) if os.path.isdir(d)]
        history_dir = os.path.join(os.path.dirname(os.path.abspath(tests_base_dir)), "saved_tests_history")
        folders += [d for d in glob.glob(os.path.join(history_dir, project, bug_id, "*")) if os.path.isdir(d)]
        folders.sort()

        shutil.rmtree(merged_suite_dir, ignore_errors=True)
        os.makedirs(merged_suite_dir)
        merged_count, unique_classes = merge_tests(folders, merged_suite_dir)

        if merged_count == 0:
            print(" ไม่มีไฟล์เทสต์ (บันทึกเป็น NaN)")
            writer.writerow(build_row(project, bug_id, info, n_classes=len(unique_classes)))
            return

        loc, n_tests = suite_stats(merged_suite_dir)
        tar_path = os.path.abspath(f"./merged_suite_{project}_{bug_id}.tar.bz2")
        run_cmd(f"tar -cjf {tar_path} *", cwd=merged_suite_dir)
        print(f" รวม {merged_count} ชุด, {n_tests} test methods, {loc} LOC -> ประเมิน Buggy & Fixed คู่ขนาน")

        with concurrent.futures.ThreadPoolExecutor(max_workers=2) as ex:
            fb = ex.submit(eval_buggy, project, bug_id, tar_path)
            ff = ex.submit(eval_fixed, project, bug_id, tar_path)
            b, fx = fb.result(), ff.result()

        fixed_failing, fault = NAN, NAN
        if b["status"] != "OK":
            eval_status = b["status"]
            print(f" [{eval_status}] {b['log'][-300:]}")
        elif fx["status"] != "OK":
            eval_status = fx["status"]
            print(f" [{eval_status}] {fx['log'][-300:]}")
        else:
            eval_status = "OK"
            fixed_failing = len(fx["failing"])
            # เทสต์สร้างจาก Buggy: ผ่านบน Buggy แต่ fail บน Fixed = จับพฤติกรรมที่เปลี่ยนไปจากการแก้บั๊กได้
            fault = "YES" if (fx["failing"] - b["failing"]) else "NO"

        writer.writerow(build_row(project, bug_id, info, len(unique_classes), merged_count,
                                  n_tests, loc, b, fixed_failing, fault, eval_status))
        print(f" Line={b['line_cov']}% Branch={b['branch_cov']}% | "
              f"Compile={b['compile_time']}s Test={b['exec_time']}s | "
              f"FailB={len(b['failing']) if b['failing'] is not None else NAN} "
              f"FailF={fixed_failing} Fault={fault} [{eval_status}]\n")
    finally:
        shutil.rmtree(merged_suite_dir, ignore_errors=True)
        if tar_path and os.path.exists(tar_path):
            os.remove(tar_path)
        if fh:
            fh.close()


def run_all(tests_base_dir, out_file=None):
    if not os.path.exists(tests_base_dir):
        print(f" ไม่พบโฟลเดอร์ {tests_base_dir}")
        return
    projects = sorted(d for d in os.listdir(tests_base_dir) if os.path.isdir(os.path.join(tests_base_dir, d)))

    # ไม่เขียนทับไฟล์ผลเดิม: ถ้ามีอยู่แล้วให้ backup ก่อน
    csv_file = out_file or "Coverage_Result_All.csv"
    if os.path.exists(csv_file) and os.path.getsize(csv_file) > 0:
        stamp = datetime.datetime.now().strftime("%Y%m%d_%H%M%S")
        backup = csv_file.replace(".csv", f"_backup_{stamp}.csv")
        shutil.copy2(csv_file, backup)
        print(f"สำรองไฟล์เดิมไว้ที่ {backup}")
    print(f"ผลลัพธ์จะบันทึกที่ {csv_file}")

    with open(csv_file, "w", newline="", encoding="utf-8") as fh:
        writer = csv.writer(fh)
        writer.writerow(CSV_HEADER)
        for project in projects:
            project_dir = os.path.join(tests_base_dir, project)
            bug_ids = [d for d in os.listdir(project_dir) if os.path.isdir(os.path.join(project_dir, d))]
            bug_ids.sort(key=lambda x: int(x) if x.isdigit() else x)
            for bug_id in bug_ids:
                try:
                    measure_coverage(project, bug_id, tests_base_dir, writer=writer)
                except Exception as e:
                    print(f" [EXCEPTION] {project}-{bug_id}: {e}")
                fh.flush()


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--project", default=None, help="เช่น Lang")
    parser.add_argument("--bug", default=None, help="เช่น 12")
    parser.add_argument("--tests_dir", default="../saved_tests", help="โฟลเดอร์ saved_tests")
    parser.add_argument("--out", default=None, help="ชื่อไฟล์ CSV ผลลัพธ์ (โหมด --all)")
    parser.add_argument("--all", action="store_true", default=True, help="รันทุก project/bug (ค่าเริ่มต้น)")
    args = parser.parse_args()
    tests_dir_abs = os.path.abspath(args.tests_dir)

    if args.project and args.bug:
        measure_coverage(args.project, args.bug, tests_dir_abs)
    else:
        run_all(tests_dir_abs, args.out)
