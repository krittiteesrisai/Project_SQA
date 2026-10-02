import os
import glob
import subprocess
import shutil
import argparse
import csv
import re
import time

D4J_HOME = os.environ.get("D4J_HOME", os.path.expanduser("~/defects4j"))
D4J_BIN = os.path.join(D4J_HOME, "framework/bin/defects4j")

  

CSV_HEADER = [
    "Project",
    "BugID",
    "Total_Classes_Merged",
    "Total_Methods_Merged",
    "Test_Suite_LOC",
    "Test_ExecTime_sec",
    "Line_Coverage(%)",
    "Branch_Coverage(%)",
    "Covered_Lines",
    "Total_Lines",
    "Covered_Branches",
    "Total_Branches",
    "Failing_Tests",
    "Fault_Detected",
    "Runner_Status",
    "Runner_Error",
    "Total_ExecTime_sec",
    "TimeoutLimit"
]

def run_cmd(cmd, cwd=None):
    return subprocess.run(cmd, cwd=cwd, shell=True, capture_output=True, text=True)

def get_runner_info(project, bug_id, tests_base_dir):
    import os, csv
    parent_dir = os.path.dirname(os.path.abspath(tests_base_dir))
    csv_file = None
    for f in os.listdir(parent_dir):
        if f.startswith("TARDIS_") and f.endswith("_Result.csv"):
            csv_file = os.path.join(parent_dir, f)
            break
    if not csv_file:
        return "NaN", "NaN", "NaN", "NaN"
    
    statuses = set()
    errors = set()
    total_time = 0.0
    timeouts = set()
    
    try:
        with open(csv_file, 'r', encoding='utf-8') as f:
            reader = csv.DictReader(f)
            for row in reader:
                if row.get("Project") == project and row.get("BugID") == str(bug_id):
                    if row.get("Status"): statuses.add(row["Status"])
                    
                    err = row.get("ErrorMessage", "").strip()
                    if err and err.lower() not in ["none", "ไม่มี error", ""]:
                        errors.add(err)
                        
                    if row.get("ExecTime_sec"):
                        try: total_time += float(row["ExecTime_sec"])
                        except: pass
                    if row.get("TimeoutLimit_sec"): timeouts.add(row["TimeoutLimit_sec"])
    except Exception as e:
        print(f"Error reading result csv: {e}")
        
    status_str = " | ".join(sorted(statuses)) if statuses else "NaN"
    err_str = " | ".join(sorted(errors)) if errors else "NaN"
    time_str = str(round(total_time, 2)) if total_time > 0 else "NaN"
    timeout_str = " | ".join(sorted(timeouts)) if timeouts else "NaN"
    return status_str, err_str, time_str, timeout_str

def measure_coverage(project, bug_id, tests_base_dir, writer=None, csv_file=None):
    workspace = os.path.abspath(f"./eval_workspace_{project}_{bug_id}b")
    tar_path = None

    print("="*60)
    print(f" เริ่มวัด Coverage & Fault Detection ของ {project}-{bug_id}")
    print("="*60)

    if os.path.exists(workspace):
        shutil.rmtree(workspace)

    print(f" กำลัง Checkout Buggy Version...")
    res = run_cmd(f"{D4J_BIN} checkout -p {project} -v {bug_id}b -w {workspace}")
    if res.returncode != 0:
        print("❌ Checkout failed!")
        return

    # สร้างโฟลเดอร์สำหรับยุบรวมไฟล์ (Merge)
    merged_suite_dir = os.path.abspath(f"./merged_suite_{project}_{bug_id}")
    if os.path.exists(merged_suite_dir):
        shutil.rmtree(merged_suite_dir)
    os.makedirs(merged_suite_dir)

    search_path = os.path.join(tests_base_dir, project, bug_id, "*")
    folders = sorted(f for f in glob.glob(search_path) if os.path.isdir(f))

    if not folders:
        print(" ไม่พบโฟลเดอร์ผลลัพธ์ย่อยใน saved_tests และ history")
        return

    local_csv_file = csv_file or f"Coverage_Result_{project}_{bug_id}.csv"

    # ถ้าไม่มี writer ส่งมา เราจะสร้างไฟล์เอง (สำหรับการรันเดี่ยวๆ)
    f = None
    if writer is None:
        f = open(local_csv_file, 'w', newline='', encoding='utf-8')
        writer = csv.writer(f)
        writer.writerow(CSV_HEADER)

    try:
        runner_status, runner_err, total_time, timeout_lim = get_runner_info(project, bug_id, tests_base_dir)
        merged_count = 0
        unique_classes = set()
        print(f" กำลังยุบรวมไฟล์จาก {len(folders)} โฟลเดอร์...")

        for folder in folders:
              # เพิ่มโฟลเดอร์จาก history
            history_dir = os.path.join(os.path.dirname(os.path.abspath(tests_base_dir)), "saved_tests_history")
            hist_search = os.path.join(history_dir, project, bug_id, "*")
            folders += [f for f in glob.glob(hist_search) if os.path.isdir(f)]
            
            folders = sorted(folders)
            base_folder_name = os.path.basename(folder)
            clean_name = re.sub(r'_(TIMEOUT|COMPLETED|SUCCESS_ON_TIMEOUT|PARTIAL_SUCCESS|NO_TESTS_GENERATED|CLASSLEVEL_CRASH|DOCKER_FAIL).*', '', base_folder_name)
            class_only = clean_name.split('::')[0]
            if class_only:
                unique_classes.add(class_only)
            out_dir = os.path.join(folder, "out")
            if not os.path.isdir(out_dir):
                continue
            test_files = glob.glob(os.path.join(out_dir, "**", "*_Test*.java"), recursive=True)
            if not test_files:
                continue
            tag = f"M{merged_count}"
            for test_file in test_files:
                rel = os.path.relpath(test_file, out_dir)
                new_rel = re.sub(r'_(\d+)_Test', rf'_{tag}_\1_Test', rel)
                dest = os.path.join(merged_suite_dir, new_rel)
                os.makedirs(os.path.dirname(dest), exist_ok=True)
                with open(test_file, encoding="utf-8") as tf:
                    content = tf.read()
                content = re.sub(r'_(\d+)_Test', rf'_{tag}_\1_Test', content)
                content = content.replace("shaded.org.evosuite", "org.evosuite")
                with open(dest, "w", encoding="utf-8") as df:
                    df.write(content)
            merged_count += 1
            print(f"  - รวมไฟล์ของ {tag} สำเร็จ")

        if merged_count == 0:
            print(" ไม่มีไฟล์ .java ให้ทดสอบ (บันทึกค่า Coverage เป็น NaN)")
            writer.writerow([project, bug_id, len(unique_classes), 0, 0, "NaN", "NaN", "NaN", "NaN", "NaN", "NaN", "NaN", "NaN", "NaN", runner_status, runner_err, total_time, timeout_lim])
            print(f"\n เสร็จสิ้น!")
            if f: print(f"บันทึกผลลงไฟล์ {local_csv_file}")
            return

        # Measure Test Suite LOC
        test_suite_loc = 0
        for root, _, files in os.walk(merged_suite_dir):
            for file in files:
                if file.endswith(".java"):
                    with open(os.path.join(root, file), 'r', encoding='utf-8', errors='ignore') as f_java:
                        test_suite_loc += sum(1 for line in f_java if line.strip())

        # 2. Pack to tar.bz2
        tar_path = os.path.abspath(f"./merged_suite_{project}_{bug_id}.tar.bz2")
        print(f"\n บีบอัดชุดทดสอบรวมที่ {tar_path}")
        run_cmd(f"tar -cjf {tar_path} *", cwd=merged_suite_dir)

        # 3. Run defects4j coverage (Line & Branch Coverage)
        print(f" วัดความครอบคลุม (Line & Branch Coverage)...", end="", flush=True)
        cov_res = run_cmd(f"{D4J_BIN} coverage -s {tar_path}", cwd=workspace)

        # 4. Run defects4j test to check Fault Detection
        print(f"  ตรวจสอบ Fault Detection...", end="", flush=True)
        t_start = time.time()
        test_res = run_cmd(f"{D4J_BIN} test -s {tar_path}", cwd=workspace)
        test_exec_time = round(time.time() - t_start, 2)

        # 5. Parse result
        line_cov, branch_cov = "NaN", "NaN"
        cov_lines, total_lines = "NaN", "NaN"
        cov_branches, total_branches = "NaN", "NaN"

        m_line = re.search(r"Line coverage:\s+([\d\.]+)%", cov_res.stdout)
        m_branch = re.search(r"Condition coverage:\s+([\d\.]+)%", cov_res.stdout)
        m_cl = re.search(r"Lines covered:\s+(\d+)", cov_res.stdout)
        m_tl = re.search(r"Lines total:\s+(\d+)", cov_res.stdout)
        m_cb = re.search(r"Conditions covered:\s+(\d+)", cov_res.stdout)
        m_tb = re.search(r"Conditions total:\s+(\d+)", cov_res.stdout)

        if m_line: line_cov = m_line.group(1)
        if m_branch: branch_cov = m_branch.group(1)
        if m_cl: cov_lines = m_cl.group(1)
        if m_tl: total_lines = m_tl.group(1)
        if m_cb: cov_branches = m_cb.group(1)
        if m_tb: total_branches = m_tb.group(1)

        # Parse Fault Detection (Failing tests count)
        failing_tests_count = 0
        m_fail = re.search(r"Failing tests:\s+(\d+)", test_res.stdout)
        if m_fail:
            failing_tests_count = int(m_fail.group(1))
        elif os.path.exists(os.path.join(workspace, "failing_tests")):
            with open(os.path.join(workspace, "failing_tests"), "r", encoding="utf-8", errors="replace") as ft:
                failing_tests_count = len([line for line in ft if line.startswith("--- ")])

        fault_detected = "YES" if failing_tests_count > 0 else "NO"

        if m_line:
            print(f" [Line: {line_cov}%, Branch: {branch_cov}%, FailTests: {failing_tests_count}, FaultDetected: {fault_detected}]")
            writer.writerow([
                project, bug_id, len(unique_classes), merged_count,
                test_suite_loc, test_exec_time,
                line_cov, branch_cov,
                cov_lines, total_lines,
                cov_branches, total_branches,
                failing_tests_count, fault_detected,
                runner_status, runner_err, total_time, timeout_lim
            ])
        else:
            print(" [ERROR or No Coverage]")
            print((cov_res.stderr or cov_res.stdout)[-500:])
            writer.writerow([
                project, bug_id, len(unique_classes), merged_count,
                test_suite_loc, test_exec_time,
                "NaN", "NaN", "NaN", "NaN", "NaN", "NaN",
                failing_tests_count if failing_tests_count > 0 else "NaN", 
                fault_detected if failing_tests_count > 0 else "NaN",
                runner_status, runner_err, total_time, timeout_lim
            ])

        print(f"\n เสร็จสิ้น!")
        if f: print(f"บันทึกผลลงไฟล์ {local_csv_file}")

    finally:
        shutil.rmtree(workspace, ignore_errors=True)
        shutil.rmtree(merged_suite_dir, ignore_errors=True)
        if tar_path and os.path.exists(tar_path):
            os.remove(tar_path)
        if f:
            f.close()

def run_all(tests_base_dir):
    if not os.path.exists(tests_base_dir):
        print(f" ไม่พบโฟลเดอร์ {tests_base_dir}")
        return

    projects = [d for d in os.listdir(tests_base_dir) if os.path.isdir(os.path.join(tests_base_dir, d))]
    projects.sort()

    csv_file = "Coverage_Result_All.csv"
    print(f"กำลังจะรันทั้งหมด ผลลัพธ์จะถูกบันทึกที่ {csv_file}")

    with open(csv_file, 'w', newline='', encoding='utf-8') as f:
        writer = csv.writer(f)
        writer.writerow(CSV_HEADER)

        for project in projects:
            project_dir = os.path.join(tests_base_dir, project)
            bug_ids = [d for d in os.listdir(project_dir) if os.path.isdir(os.path.join(project_dir, d))]

            # เรียงลำดับ bug_id ตามตัวเลข (ถ้าเป็นตัวเลข)
            bug_ids.sort(key=lambda x: int(x) if x.isdigit() else x)

            for bug_id in bug_ids:
                measure_coverage(project, bug_id, tests_base_dir, writer=writer, csv_file=csv_file)
                f.flush()

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--project", default=None, help="ระบุ project เช่น Lang (ถ้าไม่ระบุจะรันทั้งหมด)")
    parser.add_argument("--bug", default=None, help="ระบุ bug ID เช่น 12 (ถ้าไม่ระบุจะรันทั้งหมด)")
    parser.add_argument("--tests_dir", default="../saved_tests", help="โฟลเดอร์เก็บผลลัพธ์ tests")
    parser.add_argument("--all", action="store_true", default=True, help="รันทุก project และ bug ใน tests_dir (ค่าเริ่มต้น)")

    args = parser.parse_args()
    tests_dir_abs = os.path.abspath(args.tests_dir)

    # ถ้าผู้ใช้ระบุทั้ง --project และ --bug ให้รันเฉพาะตัวนั้น นอกนั้นรันทั้งหมดเป็นค่าเริ่มต้น
    if args.project and args.bug:
        measure_coverage(args.project, args.bug, tests_dir_abs)
    else:
        run_all(tests_dir_abs)

