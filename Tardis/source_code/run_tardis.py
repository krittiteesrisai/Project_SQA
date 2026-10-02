"""
TARDIS Runner — รัน TARDIS (concolic test generator) กับบั๊กจาก Defects4J แบบอัตโนมัติ

โครงสร้างไฟล์:
  1. CONFIG            - ค่าคงที่ทั้งหมดที่ปรับแต่งได้
  2. LOGGING & CSV      - พิมพ์ log, บันทึกผลลง CSV และตัดสินว่าแถวไหน "เสร็จแล้ว" (resume)
  3. DOCKER HELPERS      - จัดการ container (เช็ค/ลบ/cleanup โฟลเดอร์) และเก็บผลลัพธ์
  4. CLASSPATH HELPERS   - ทำความสะอาด classpath (คัดลอก jar นอกโปรเจกต์เข้า workspace)
  5. TARDIS EXECUTION    - ประกอบคำสั่ง docker และรัน TARDIS พร้อม fail-fast/timeout
  6. BUG PIPELINE        - ขั้นตอน checkout -> compile -> รันต่อ class/method
  7. MAIN                - ตรวจ Docker แล้วกระจายงานลง ThreadPoolExecutor
"""
import csv
import glob
import hashlib
import os
import re
import shutil
import subprocess
import sys
import threading
import time
from concurrent.futures import ThreadPoolExecutor, as_completed


# =================================================================
# 1. CONFIG
# =================================================================

# ตำแหน่งที่ติดตั้ง Defects4J (ใช้อ่านรายชื่อ class ที่ถูกแก้ไขสำหรับ FAST-SKIP)
D4J_HOME = os.environ.get("D4J_HOME", os.path.expanduser("~/defects4j"))
D4J_BIN = os.path.join(D4J_HOME, "framework/bin/defects4j")

# ใช้เป็น "ตัวสำรอง" เท่านั้น: ปกติรายการบั๊กจริงมาจาก `defects4j bids -p <Project>`
D4J_PROJECTS = {
    "Chart": 26, "Cli": 40, "Closure": 176, "Codec": 18, "Collections": 28,
    "Compress": 47, "Csv": 16, "Gson": 18, "JacksonCore": 26,
    "JacksonDatabind": 112, "JacksonXml": 6, "Jsoup": 93, "JxPath": 22,
    "Lang": 65, "Math": 106, "Mockito": 38, "Time": 27,
}
'''
D4J_PROJECTS = {
    "Closure": 176, "Collections": 28,
    "Compress": 47,  
    "JacksonDatabind": 112, "JacksonXml": 6,
    "Math": 106, "Mockito": 38, 
}
'''
# timeout ต่อ class (วินาที) — ใช้ทั้งตอนสร้าง TASKS และตอนตัดสิน resume
CLASS_TIMEOUT = 120

# ปล่อยว่างไว้ = สร้างจาก defects4j bids ตอนเริ่ม main()
# (ถ้าจะทดสอบเฉพาะบั๊ก ให้ตั้งค่าเป็น list ของ {"project","bug_id","timeout"} ก่อนเรียก main())
TASKS = []

# จำนวน worker: JVM ของ TARDIS ใช้ราว 3.5-4.2GB ต่อตัว จึงใช้ 2 กับ WSL ที่มี ~11GB
# ตั้งทับได้ด้วย environment variable เช่น: TARDIS_WORKERS=1 TARDIS_MEM=9g python3 run_tardis.py
MAX_WORKERS = int(os.environ.get("TARDIS_WORKERS", "2"))

# ขีดจำกัดหน่วยความจำต่อ container (กัน OOM ฆ่าทุก container พร้อมกัน)
# TARDIS_SWAP = ขีดจำกัด memory+swap (ค่าเริ่มต้น = เท่า memory คือไม่ให้ใช้ swap)
DOCKER_MEMORY_LIMIT = os.environ.get("TARDIS_MEM", "5g")
DOCKER_SWAP_LIMIT = os.environ.get("TARDIS_SWAP", DOCKER_MEMORY_LIMIT)

# ชื่อไฟล์ CSV สำหรับเก็บผลการทำงาน
CSV_FILENAME = "TARDIS_Extended_Result.csv"
CSV_HEADER = ["Project", "BugID", "Status", "TargetClass", "Step", "ErrorMessage",
              "ExecTime_sec", "SavedTestsCount", "TimeoutLimit_sec"]

# โฟลเดอร์เก็บผลเก่าที่ถูกแทนที่ (ไม่ลบทิ้ง เพื่อไม่ให้เทสต์ที่เคยได้หายไปเมื่อรันซ้ำ)
HISTORY_DIR = "./saved_tests_history"

# Docker image ที่ใช้รัน TARDIS
DOCKER_IMAGE = "ghcr.io/pietrobraione/tardis:master"
TARDIS_MAX_DEPTH = 10
TARDIS_MAX_TC_DEPTH = 5
TARDIS_MAX_COUNT = 1000

# โหมด fallback (รันทีละ method)
# - timeout ต่อ method: เดิม 30 วิ ได้ไฟล์แค่ ~6% จึงขยับเป็น 60 (ตั้งกลับเป็น 30 ได้)
# - งบเวลารวมต่อ class: เกินแล้วหยุด method ที่เหลือจะถูกรันต่อตอน resume
FALLBACK_METHOD_TIMEOUT_CAP = 60
FALLBACK_CLASS_BUDGET = 1800

# เช็ค log ทุกกี่วินาที และแสดง heartbeat ตามช่วงเวลาที่กำหนด
POLL_INTERVAL_SECONDS = 10
HEARTBEAT_EVERY_SECONDS = 60

# สถานะที่ "ทำเสร็จแล้ว" (ไม่ต้องรันซ้ำตอน resume)
# หมายเหตุ: TIMEOUT ไม่อยู่ที่นี่ — ตัดสินด้วย row_is_done() ตามเวลาที่เคยลอง
#           PARTIAL_SUCCESS / FALLBACK_SUMMARY = fallback ที่ยังไม่ครบ จึงต้องเข้ามาทำต่อ
RESUMABLE_STATUSES = {"COMPLETED", "NO_MODIFIED_CLASSES", "SUCCESS_ON_TIMEOUT",
                      "NO_TESTS_GENERATED", "FALLBACK_DONE"}

# ข้อความที่ใช้บอกว่าเป็นแถวสรุปของ fallback (ใช้แยกแถวสรุปรุ่นเก่าออกจากผลระดับ class)
FALLBACK_MSG_MARK = "รันโหมดย่อย"

# สถานะของ method ที่ถือว่า "จบแล้ว" ไม่ต้องลองใหม่
METHOD_TERMINAL_STATUSES = {"COMPLETED", "SUCCESS_ON_TIMEOUT", "NO_TESTS_GENERATED", "TIMEOUT","KILLED_WITH_TESTS"}

# Lock ป้องกันหลาย thread เขียน CSV พร้อมกัน
csv_lock = threading.Lock()


# =================================================================
# 2. LOGGING & CSV
# =================================================================

def log_console(project, bug_id, message):
    """print ข้อความแบบมี prefix [thread][project-bug_id] เพื่อให้ log อ่านง่าย"""
    thread_name = threading.current_thread().name
    print(f"[{thread_name}][{project}-{bug_id}] {message}")


def print_banner(title):
    """print หัวข้อคั่นด้วยเส้นยาว ใช้ตอนเริ่มงานใหม่แต่ละบั๊ก"""
    print(f"\n{'=' * 60}\n{title}\n{'=' * 60}")


def log_result(project, bug_id, status, target_class="", step="TARDIS_RUN", error_msg="",
               exec_time=0.0, saved_count=0, timeout_limit=0):
    """บันทึกผลลง console และต่อท้ายไฟล์ CSV กลาง (thread-safe ด้วย csv_lock)"""
    detail = f"คลาส: {target_class} | ขั้นตอน: {step}"
    if error_msg:
        detail += f" | Error: {error_msg}"
    log_console(project, bug_id, f"[{status}] {detail}")

    with csv_lock:
        write_header = not os.path.exists(CSV_FILENAME)
        with open(CSV_FILENAME, mode='a', newline='', encoding='utf-8') as f:
            writer = csv.writer(f)
            if write_header:
                writer.writerow(CSV_HEADER)
            writer.writerow([project, bug_id, status, target_class, step, error_msg,
                             round(exec_time, 2), saved_count, timeout_limit])


def ensure_csv_header():
    """สร้าง CSV ถ้ายังไม่มี และแก้ header เก่า (6 ช่อง) ให้เป็น 9 ช่อง (สำรองไว้เป็น .bak_header)"""
    if not os.path.exists(CSV_FILENAME):
        with open(CSV_FILENAME, mode='w', newline='', encoding='utf-8') as f:
            csv.writer(f).writerow(CSV_HEADER)
        return
    with open(CSV_FILENAME, mode='r', newline='', encoding='utf-8') as f:
        rows = list(csv.reader(f))
    if not rows or rows[0] == CSV_HEADER:
        return
    shutil.copy2(CSV_FILENAME, CSV_FILENAME + ".bak_header")
    if rows[0][:1] == ["Project"]:
        rows[0] = CSV_HEADER
    else:
        rows.insert(0, CSV_HEADER)
    with open(CSV_FILENAME, mode='w', newline='', encoding='utf-8') as f:
        csv.writer(f).writerows(rows)
    print(f"[INFO] แก้ header ของ {CSV_FILENAME} เป็น 9 ช่องแล้ว (สำรอง: {CSV_FILENAME}.bak_header)")


def row_is_done(row):
    """
    ตัดสินว่าแถวใน CSV แถวนี้ "เสร็จแล้ว" หรือไม่ (True = ข้ามตอน resume)
    - สถานะใน RESUMABLE_STATUSES = เสร็จ
    - TIMEOUT: เสร็จก็ต่อเมื่อเคยลองด้วยเวลาไม่น้อยกว่าที่ต้องการตอนนี้ (หรือได้ไฟล์แล้ว)
      => ปรับ timeout ขึ้น แล้วงานที่เคย timeout ด้วยเวลาน้อยกว่าจะถูกรันใหม่เอง
    - แถวสรุป fallback รุ่นเก่า (TIMEOUT/PARTIAL_SUCCESS + ข้อความ "รันโหมดย่อย") = ยังไม่เสร็จ
    - method ที่ TARDIS หาไม่เจอ (MethodNotFoundException) = เสร็จ (ลองซ้ำก็ไม่ได้ผล)
    """
    if len(row) < 4:
        return False
    status, target = row[2], row[3]
    err = row[5] if len(row) > 5 else ""

    if status in ("TIMEOUT", "PARTIAL_SUCCESS") and FALLBACK_MSG_MARK in err:
        return False
    if status in RESUMABLE_STATUSES:
        return True
    if status == "TARDIS_CRASH" and "::" in target and "MethodNotFoundException" in err:
        return True
    if status == "TIMEOUT" and len(row) >= 9:
        try:
            if int(float(row[7])) > 0:      # ป้ายเก่า: TIMEOUT แต่มีไฟล์
                return True
            need = min(FALLBACK_METHOD_TIMEOUT_CAP, CLASS_TIMEOUT) if "::" in target else CLASS_TIMEOUT
            return float(row[8]) >= need
        except ValueError:
            return False
    return False


def load_processed_classes():
    """
    อ่านประวัติเก่าจาก CSV กลาง คืนเป็น dict: {(project, bug_id): {target_1, target_2, ...}}
    target เป็นชื่อ class (ระดับ class) หรือ "class::method_sig" (ระดับ method ในโหมด fallback)
    """
    ensure_csv_header()
    processed = {}
    with open(CSV_FILENAME, mode='r', newline='', encoding='utf-8') as f:
        reader = csv.reader(f)
        next(reader, None)  # ข้ามหัวคอลัมน์
        for row in reader:
            if row_is_done(row):
                processed.setdefault((row[0], row[1]), set()).add(row[3])
    return processed


# =================================================================
# 3. DOCKER HELPERS
# =================================================================

def check_docker_or_exit():
    """ตรวจก่อนเริ่มงานว่า Docker/image/defects4j พร้อม ถ้าไม่พร้อมให้หยุดทันที (กันแถวขยะ 864 งาน)"""
    try:
        r = subprocess.run(["docker", "info"], capture_output=True, text=True, timeout=60)
        if r.returncode != 0:
            raise RuntimeError((r.stdout + r.stderr).strip()[-300:])
        r2 = subprocess.run(["docker", "image", "inspect", DOCKER_IMAGE],
                            capture_output=True, text=True, timeout=60)
        if r2.returncode != 0:
            raise RuntimeError(f"ไม่พบ image {DOCKER_IMAGE} (รัน: docker pull {DOCKER_IMAGE})")
        if shutil.which("defects4j") is None:
            raise RuntimeError("ไม่พบคำสั่ง defects4j ใน PATH")
    except Exception as e:
        print(f"[ABORT] เริ่มงานไม่ได้: {e}")
        sys.exit(1)


def cleanup_dir(path):
    """
    ลบโฟลเดอร์ ถ้า Python ลบไม่ออก (ติดสิทธิ์ root จาก docker) ให้เรียก docker เข้าไปลบแทน
    คืน True เมื่อโฟลเดอร์หายไปแล้วจริง ๆ
    """
    if not os.path.exists(path):
        return True
    shutil.rmtree(path, ignore_errors=True)
    if os.path.exists(path):
        parent_dir = os.path.dirname(os.path.abspath(path))
        folder_name = os.path.basename(os.path.abspath(path))
        subprocess.run([
            "docker", "run", "--rm",
            "-v", f"{parent_dir}:/workspace_cleanup",
            DOCKER_IMAGE,
            "rm", "-rf", f"/workspace_cleanup/{folder_name}"
        ], capture_output=True, check=False)
        shutil.rmtree(path, ignore_errors=True)   # เก็บกวาดส่วนที่เหลือ
    return not os.path.exists(path)


def reset_output_dirs(tmp_path, out_path):
    """ล้าง + สร้างโฟลเดอร์ out/tmp ของ TARDIS ใหม่ให้ว่างเปล่าเสมอ ป้องกันผลของรอบก่อนปนกัน"""
    cleanup_dir(tmp_path)
    cleanup_dir(out_path)
    os.makedirs(tmp_path, exist_ok=True)
    os.makedirs(out_path, exist_ok=True)
    os.chmod(tmp_path, 0o777)
    os.chmod(out_path, 0o777)


def container_exists(name):
    """ตรวจว่า Docker container ชื่อนี้มีอยู่หรือไม่ (ทั้งที่กำลังรันและหยุดแล้ว)"""
    res = subprocess.run(
        ["docker", "ps", "-a", "--filter", f"name={name}", "--format", "{{.Names}}"],
        capture_output=True, text=True
    )
    return name in res.stdout.strip().split('\n')


def kill_container(name):
    """พยายามลบ container สูงสุด 3 ครั้ง (บางตัวค้างลบไม่ออกทันที)"""
    for _ in range(3):
        subprocess.run(["docker", "rm", "-f", name], capture_output=True, check=False)
        if not container_exists(name):
            return
        time.sleep(1)
    print(f"[WARNING] ไม่สามารถยืนยันการลบ Container {name} ได้")


_SAVED_STATUS_RE = ("COMPLETED|TIMEOUT|TARDIS_CRASH|ERROR|NO_TESTS_GENERATED|SUCCESS_ON_TIMEOUT|"
                    "PARTIAL_SUCCESS|DOCKER_FAIL|KILLED_WITH_TESTS")


def _archive_old_result(project, bug_id, old_dir, dirname):
    """ผลเก่าที่มีไฟล์เทสต์ -> ย้ายไป HISTORY_DIR (ไม่ลบทิ้ง); ผลเก่าที่ไม่มีเทสต์ -> ลบได้เลย"""
    out_dir = os.path.join(old_dir, "out")
    has_tests = os.path.isdir(out_dir) and any(os.scandir(out_dir))
    if has_tests:
        hist = os.path.join(HISTORY_DIR, project, str(bug_id))
        try:
            os.makedirs(hist, exist_ok=True)
            shutil.move(old_dir, os.path.join(hist, f"{dirname}_{int(time.time())}"))
            return
        except Exception:
            pass
    shutil.rmtree(old_dir, ignore_errors=True)


def save_tardis_artifacts(project, bug_id, safe_class_name, status, out_path, tmp_path, bug_dir_b, stdout, stderr):
    """
    เก็บผลลัพธ์ของ 1 รอบ (class หรือ method) ไปไว้ที่ ./saved_tests/<project>/<bug_id>/<ชื่อ>_<status>/
    ประกอบด้วย: log console (tail) และโฟลเดอร์ out (test ที่สร้างสำเร็จ)
    """
    base_save_path = f"./saved_tests/{project}/{bug_id}"
    # เอาผลเก่าของชื่อเดียวกัน (ที่สถานะอื่น) ออกไป เพื่อไม่ให้นับผลซ้ำ — แต่เทสต์ที่เคยได้จะถูกย้ายไปเก็บไว้
    if os.path.exists(base_save_path):
        pattern = re.compile(f"^{re.escape(safe_class_name)}_({_SAVED_STATUS_RE})$")
        for d in os.listdir(base_save_path):
            if pattern.match(d):
                _archive_old_result(project, bug_id, os.path.join(base_save_path, d), d)

    save_dir = f"{base_save_path}/{safe_class_name}_{status}"
    saved_files_count = 0
    os.makedirs(save_dir, exist_ok=True)

    log_file = os.path.join(save_dir, "tardis_console.log")
    with open(log_file, "w", encoding="utf-8", errors="replace") as f:
        f.write("=== STDOUT ===\n")
        f.write(stdout if stdout else "")
        f.write("\n\n=== STDERR ===\n")
        f.write(stderr if stderr else "")

    # เก็บเฉพาะ output folder (ไม่เก็บ tmp เพื่อประหยัดพื้นที่)
    for folder_path, folder_name in [(out_path, "out")]:
        if not os.path.exists(folder_path):
            continue
        files = [f for f in glob.glob(os.path.join(folder_path, "**", "*"), recursive=True) if os.path.isfile(f)]
        if not files:
            continue
        target_save_dir = os.path.join(save_dir, folder_name)
        os.makedirs(target_save_dir, exist_ok=True)
        try:
            shutil.copytree(folder_path, target_save_dir, dirs_exist_ok=True)
            saved_files_count += len(files)
        except PermissionError:
            # ไฟล์เป็นของ root (สร้างจากใน container) -> ใช้ docker ช่วย copy แทน
            res = subprocess.run([
                "docker", "run", "--rm",
                "-v", f"{bug_dir_b}:/workspace",
                "-v", f"{os.path.abspath(target_save_dir)}:/saved",
                DOCKER_IMAGE,
                "cp", "-r", f"/workspace/{os.path.basename(folder_path)}/.", "/saved/"
            ], capture_output=True, check=False)
            if res.returncode == 0:
                saved_files_count += len(files)

    # แก้ permission ของไฟล์ที่เก็บไว้ เพื่อให้ผู้ใช้ทั่วไปเปิด/ลบได้
    if saved_files_count > 0:
        subprocess.run([
            "docker", "run", "--rm",
            "-v", f"{os.path.abspath(save_dir)}:/saved",
            DOCKER_IMAGE,
            "chmod", "-R", "777", "/saved"
        ], capture_output=True, check=False)

    return save_dir, saved_files_count


# =================================================================
# 4. CLASSPATH HELPERS
# =================================================================

def _copy_dep(abs_path, deps_dir):
    """คัดลอก dependency (ไฟล์ .jar หรือโฟลเดอร์คลาส) ที่อยู่นอกโปรเจกต์เข้า tardis_deps/ (ใส่ hash กันชื่อชนกัน)"""
    tag = hashlib.md5(abs_path.encode("utf-8")).hexdigest()[:6]
    name = f"{tag}_{os.path.basename(abs_path.rstrip(os.sep))}"
    dest = os.path.join(deps_dir, name)
    if not os.path.exists(dest):
        os.makedirs(deps_dir, exist_ok=True)
        if os.path.isdir(abs_path):
            shutil.copytree(abs_path, dest)
        else:
            shutil.copy2(abs_path, dest)
    return f"/workspace/tardis_deps/{name}"


def sanitize_classpath(raw_classpath, project_root):
    """
    ทำความสะอาด classpath จาก `defects4j export -p cp.compile` ก่อนส่งให้ TARDIS
    - ขยาย wildcard เช่น "lib/*.jar" เป็นรายชื่อ .jar จริง
    - ตัด entry ว่าง / entry ที่ไม่มีอยู่จริง (พิมพ์คำเตือน)
    - entry ที่อยู่นอกโปรเจกต์ (ไม่ถูก mount เข้า container) จะถูกคัดลอกเข้า tardis_deps/
    ทุก entry จะถูกแปลงเป็น path แบบ /workspace/... ให้ตรงกับจุด mount ใน container
    """
    kept, skipped = [], []
    root = os.path.normpath(project_root)
    deps_dir = os.path.join(root, "tardis_deps")

    def add(abs_path):
        abs_path = os.path.normpath(abs_path)
        if abs_path == root or abs_path.startswith(root + os.sep):
            kept.append(f"/workspace/{os.path.relpath(abs_path, root)}")
        else:
            kept.append(_copy_dep(abs_path, deps_dir))

    for raw_entry in raw_classpath.split(':'):
        entry = raw_entry.strip()
        if not entry:
            continue

        if entry.endswith('/*') or entry.endswith('*.jar'):
            glob_dir = entry[:-1] if entry.endswith('/*') else os.path.dirname(entry)
            base = glob_dir if os.path.isabs(glob_dir) else os.path.join(root, glob_dir)
            jars = sorted(glob.glob(os.path.join(base, '*.jar')))
            if not jars:
                skipped.append(entry)
            for jar_path in jars:
                add(jar_path)
            continue

        abs_entry = entry if os.path.isabs(entry) else os.path.join(root, entry)
        if os.path.exists(abs_entry):
            add(abs_entry)
        else:
            skipped.append(entry)

    if skipped:
        print(f"[WARN] classpath entry ที่ถูกข้าม (ไม่มีอยู่จริง/ไม่มี jar): {skipped}")
    return ":".join(kept)


def get_all_methods(bin_dir, target_class, cwd):
    """
    ดึงรายชื่อ method ทั้งหมดของ target_class ผ่าน `javap -s -p` (รวม signature แบบ descriptor)
    คืนค่าเป็น list ของ signature รูปแบบที่ TARDIS ใช้กับ -target_method เช่น
    "org/pkg/MyClass:(I)Ljava/lang/String;:myMethod"
    ข้าม constructor และ method สังเคราะห์ (access$000, lambda$...) เพราะ TARDIS หาไม่เจอ
    """
    res = subprocess.run(["javap", "-s", "-p", "-classpath", bin_dir, target_class],
                          cwd=cwd, capture_output=True, text=True)
    methods = []
    target_class_internal = target_class.replace('.', '/')
    class_simple_name = target_class.split('.')[-1]
    current_method_name = None

    for line in res.stdout.splitlines():
        line = line.strip()
        if not line or line == "}":
            continue
        if line.startswith("Compiled from") or line.startswith("public class") or line.startswith("class"):
            continue

        if line.startswith("descriptor:"):
            desc = line.split("descriptor:")[1].strip()
            if current_method_name:
                name_last_part = current_method_name.split('.')[-1]
                is_constructor = (name_last_part == class_simple_name)
                is_synthetic = ('$' in name_last_part) or name_last_part.startswith('lambda')
                if not is_constructor and not is_synthetic:
                    methods.append(f"{target_class_internal}:{desc}:{current_method_name}")
            current_method_name = None
        elif "(" in line:
            before_paren = line.split("(")[0]
            words = before_paren.split()
            if words:
                current_method_name = words[-1]

    return methods


def check_fatal_errors(stdout_log, stderr_log):
    """สแกน log หา error ร้ายแรงที่รู้อยู่แล้วว่า TARDIS จะไม่มีทางทำงานต่อได้ (ใช้ทำ fail-fast)"""
    full_text = stdout_log + "\n" + stderr_log
    match = re.search(r"MethodNotFoundException:\s*(\S+)", full_text)
    if match:
        return "MethodNotFoundException", match.group(1)
    if "ClassFileNotFoundException" in full_text:
        return "ClassFileNotFoundException", None
    return None, None


# =================================================================
# 5. TARDIS EXECUTION
# =================================================================

def build_docker_base_options(bug_dir_b):
    """ตัวเลือกของ docker run เอง (ต้องอยู่ก่อนชื่อ image เสมอ ไม่งั้นจะหลุดไปเป็น arg ของ tardis)"""
    return [
        "docker", "run", "--rm",
        f"--memory={DOCKER_MEMORY_LIMIT}", f"--memory-swap={DOCKER_SWAP_LIMIT}",
        "-v", f"{bug_dir_b}:/workspace",
        "-w", "/workspace",
    ]


def build_common_tardis_args(classes_arg):
    """args ของ TARDIS ที่ใช้เหมือนกันทั้งระดับ class และ method (ไม่รวม -target_class/-target_method)"""
    return [
        DOCKER_IMAGE,
        "tardis",
        "-classes", classes_arg,
        "-max_depth", str(TARDIS_MAX_DEPTH),
        "-max_tc_depth", str(TARDIS_MAX_TC_DEPTH),
        "-max_count", str(TARDIS_MAX_COUNT),
        "-tmp_base", "./tmp_tardis",
        "-out", "./tardis_generated_tests",
    ]


def read_tail(filepath, size=50000):
    """อ่านเฉพาะส่วนท้ายของไฟล์ (กัน memory บวมเมื่อ log ใหญ่)"""
    with open(filepath, "r", encoding="utf-8", errors="replace") as f:
        f.seek(0, 2)
        file_size = f.tell()
        f.seek(max(0, file_size - size))
        return f.read()


def run_tardis_docker(container_name, docker_cmd, timeout_seconds, out_file_path, err_file_path,
                       project, bug_id, target_name):
    """
    รัน docker_cmd หนึ่งคำสั่ง พร้อม:
    - เขียน stdout/stderr ลงไฟล์แบบ real-time
    - เช็ค log ทุก POLL_INTERVAL_SECONDS วิ ถ้าเจอ error ร้ายแรง -> kill ทันที
    - ตรวจ MethodNotFoundException อีกครั้งหลัง process จบ (กรณีล้มเร็วกว่ารอบ poll)
    - เวลาที่ใช้เป็นเวลาจริง (time.monotonic)
    คืนค่า: (status, error_message, stdout_log, stderr_log, fatal_type, fatal_detail, elapsed_sec)
    """
    if container_exists(container_name):
        kill_container(container_name)

    log_console(project, bug_id, f"🚀 เริ่ม TARDIS: {target_name} (รอสูงสุด {timeout_seconds}s)")

    try:
        fatal_type, fatal_detail = None, None
        timed_out = False
        with open(out_file_path, "w") as out_f, open(err_file_path, "w") as err_f:
            proc = subprocess.Popen(docker_cmd, stdout=out_f, stderr=err_f)
            t0 = time.monotonic()
            last_hb = 0.0

            while proc.poll() is None:
                try:
                    proc.wait(timeout=POLL_INTERVAL_SECONDS)
                except subprocess.TimeoutExpired:
                    elapsed = time.monotonic() - t0

                    try:
                        fatal_type, fatal_detail = check_fatal_errors(
                            read_tail(out_file_path), read_tail(err_file_path))
                    except Exception:
                        fatal_type, fatal_detail = None, None   # อ่าน log ไม่ทัน ข้ามไปรอบหน้า

                    if fatal_type:
                        log_console(project, bug_id,
                                    f"🚨 ตรวจพบ Fatal Error ({fatal_type})! ทำการ Kill ทันทีเพื่อประหยัดเวลา...")
                        kill_container(container_name)
                        proc.kill()
                        proc.wait()
                        break

                    if timeout_seconds and elapsed >= timeout_seconds:
                        timed_out = True
                        kill_container(container_name)
                        proc.kill()
                        proc.wait()
                        break

                    if elapsed - last_hb >= HEARTBEAT_EVERY_SECONDS:
                        last_hb = elapsed
                        log_console(project, bug_id,
                                    f"⏳ 🏃 กำลังรัน {target_name} ... ผ่านไปแล้ว {int(elapsed)} วินาที")

            elapsed = time.monotonic() - t0

        stdout_log = read_tail(out_file_path)
        stderr_log = read_tail(err_file_path)

        # process จบเองด้วย exit code != 0 แต่ยังไม่ทันถูกจับตอน poll -> ตรวจ MethodNotFoundException อีกรอบ
        if not fatal_type and not timed_out and proc.returncode != 0:
            ft, fd = check_fatal_errors(stdout_log, stderr_log)
            if ft == "MethodNotFoundException":
                fatal_type, fatal_detail = ft, fd

        if fatal_type:
            return ("TARDIS_CRASH", f"{fatal_type} {fatal_detail or ''}", stdout_log, stderr_log,
                    fatal_type, fatal_detail, elapsed)

        if timed_out:
            return "TIMEOUT", f"เกินเวลา {timeout_seconds} วินาที", stdout_log, stderr_log, None, None, elapsed

        status = "COMPLETED" if proc.returncode == 0 else "DOCKER_FAIL"
        err_msg = "" if status == "COMPLETED" else extract_error(stdout_log, stderr_log)
        return status, err_msg, stdout_log, stderr_log, None, None, elapsed

    except Exception as e:
        if 'proc' in locals() and proc.poll() is None:
            proc.kill()
            proc.wait()
        return "ERROR", str(e), "", "", None, None, 0.0


def extract_error(stdout_str, stderr_str):
    """เก็บท้าย stderr เป็นหลัก (มัก error สำคัญ) ต่อท้ายด้วย stdout สั้น ๆ"""
    err = (stderr_str or "").replace('\r', ' ').replace('\n', ' ')[-600:]
    out = (stdout_str or "").replace('\r', ' ').replace('\n', ' ')[-200:]
    return f"ERR: {err} | OUT: {out}" if out else f"ERR: {err}"


# =================================================================
# 6. BUG PIPELINE
# =================================================================

def checkout_and_compile(project, bug_id, bug_dir_b):
    """checkout buggy version ของบั๊กนี้แล้ว compile ด้วย defects4j"""
    subprocess.run(
        ["defects4j", "checkout", "-p", project, "-v", f"{bug_id}b", "-w", bug_dir_b],
        check=True, capture_output=True, text=True
    )
    subprocess.run(["defects4j", "compile"], cwd=bug_dir_b, check=True, capture_output=True, text=True)


def discover_targets(bug_dir_b):
    """หา class ที่ถูกแก้ไขในบั๊กนี้ + bin directory + classpath ที่ทำความสะอาดแล้ว"""
    class_res = subprocess.run(["defects4j", "export", "-p", "classes.modified"],
                                cwd=bug_dir_b, capture_output=True, text=True, check=True)
    bin_res = subprocess.run(["defects4j", "export", "-p", "dir.bin.classes"],
                              cwd=bug_dir_b, capture_output=True, text=True, check=True)
    cp_res = subprocess.run(["defects4j", "export", "-p", "cp.compile"],
                             cwd=bug_dir_b, capture_output=True, text=True, check=True)

    modified_classes = [c.strip() for c in class_res.stdout.strip().split('\n') if c.strip()]
    bin_dir = bin_res.stdout.strip()
    classpath_str = sanitize_classpath(cp_res.stdout.strip(), bug_dir_b)
    return modified_classes, bin_dir, classpath_str


def method_tag(sig):
    """แปลงลายเซ็น method เป็น tag สั้น ๆ คงที่ ใช้ตั้งชื่อ container/โฟลเดอร์ผล (ไม่ผูกกับลำดับ)"""
    return hashlib.md5(sig.encode("utf-8")).hexdigest()[:8]


def run_method_fallback(project, bug_id, target_class, safe_class_name, container_name,
                         docker_base_options, common_tardis_args, bin_dir, bug_dir_b,
                         tmp_tardis_path, out_tardis_path, out_file_path, err_file_path,
                         timeout_seconds, fatal_detail, already_done):
    """
    โหมด fallback: เมื่อรันทั้ง class พร้อมกันไม่ได้ (เจอ MethodNotFoundException) ให้ไล่รันทีละ method แทน
    - method ที่ทำแล้ว (already_done) จะถูกข้าม
    - มีงบเวลารวมต่อ class (FALLBACK_CLASS_BUDGET) เกินแล้วหยุด ที่เหลือรอ resume
    คืนค่า: (status, err_msg, total_saved_count, incomplete, total_elapsed)
      incomplete = True ถ้ามี method ที่ยังไม่จบ (หมดงบเวลา / DOCKER_FAIL / ERROR ฯลฯ) -> class ยังไม่ถือว่าเสร็จ
    """
    log_console(project, bug_id,
                f"⚠️ เข้าสู่โหมด Fallback (รันทีละ Method) สำหรับคลาส {target_class} เนื่องจาก {fatal_detail}")

    all_methods = get_all_methods(bin_dir, target_class, bug_dir_b)

    if fatal_detail == "RESUMED_FALLBACK":
        valid_methods = all_methods
    else:
        # ตัด method ที่ทำให้เกิดปัญหาออก: เทียบ signature ตรง ๆ ก่อน ถ้าไม่พบค่อยเทียบชื่อ method
        broken_name = fatal_detail.split(':')[-1]
        valid_methods = [m for m in all_methods if m != fatal_detail]
        if len(valid_methods) == len(all_methods):
            valid_methods = [m for m in all_methods if m.split(':')[-1] != broken_name]
        # บันทึก method ที่ถูกตัด เพื่อไม่ต้องลองซ้ำตอน resume
        for m in all_methods:
            if m in valid_methods:
                continue
            name = f"{target_class}::{m}"
            if name not in already_done:
                log_result(project, bug_id, "TARDIS_CRASH", name,
                           error_msg="MethodNotFoundException: ตัดออกจากรอบ fallback")
                already_done.add(name)

    log_console(project, bug_id,
                f"🔬 พบ {len(valid_methods)} methods ที่ใช้งานได้ (ข้าม {len(all_methods) - len(valid_methods)} methods)")

    fallback_status = "COMPLETED"
    fallback_errs = []
    total_saved_count = 0
    incomplete = False
    total_elapsed = 0.0
    deadline = time.monotonic() + FALLBACK_CLASS_BUDGET

    for m_idx, method_sig in enumerate(valid_methods, 1):
        method_target_name = f"{target_class}::{method_sig}"
        if method_target_name in already_done:
            log_console(project, bug_id, f"[SKIP] Method {method_target_name} ทำเสร็จไปแล้ว")
            continue

        if time.monotonic() > deadline:
            log_console(project, bug_id,
                        f"⌛ หมดงบเวลา fallback ของคลาส {target_class} ({FALLBACK_CLASS_BUDGET}s) "
                        f"method ที่เหลือจะถูกรันต่อตอน resume")
            fallback_errs.append("BUDGET:หมดงบเวลา")
            fallback_status = "PARTIAL_SUCCESS"
            incomplete = True
            break

        # ล้าง out/tmp ก่อนรันทุก method ป้องกันผลของ method ก่อนหน้าปนกับ method นี้
        reset_output_dirs(tmp_tardis_path, out_tardis_path)

        tag = method_tag(method_sig)
        m_container_name = f"{container_name}_M{tag}"
        m_docker_cmd = (docker_base_options + ["--name", m_container_name] + common_tardis_args
                        + ["-target_method", method_sig])
        m_timeout = min(FALLBACK_METHOD_TIMEOUT_CAP, timeout_seconds) if timeout_seconds else FALLBACK_METHOD_TIMEOUT_CAP

        (m_status, m_err_msg, m_stdout_log, m_stderr_log,
         m_fatal_type, _m_fatal_detail, m_elapsed) = run_tardis_docker(
            m_container_name, m_docker_cmd, m_timeout, out_file_path, err_file_path,
            project, bug_id, f"Method {m_idx}/{len(valid_methods)}"
        )
        total_elapsed += m_elapsed

        m_files = glob.glob(os.path.join(out_tardis_path, "**", "*"), recursive=True) if os.path.exists(out_tardis_path) else []
        m_actual_saved = len([f for f in m_files if os.path.isfile(f)])

        if m_status == "COMPLETED" and m_actual_saved == 0:
            m_status = "NO_TESTS_GENERATED"
            m_err_msg = "ทำงานเสร็จสมบูรณ์ แต่ไม่มีไฟล์ Test ถูกสร้างขึ้น"
        elif m_status == "TIMEOUT" and m_actual_saved > 0:
            m_status = "SUCCESS_ON_TIMEOUT"
            m_err_msg = f"สร้างไฟล์สำเร็จ {m_actual_saved} ไฟล์ ก่อนตัดจบ"
        elif m_status == "DOCKER_FAIL" and m_actual_saved > 0:
            m_status = "KILLED_WITH_TESTS"
            m_err_msg = f"process ถูกฆ่า แต่มีไฟล์เทสต์ {m_actual_saved} ไฟล์ก่อนถูกฆ่า | {m_err_msg}"

        # เซฟผลทันที ก่อนที่ method ถัดไปจะล้างโฟลเดอร์ทับ (ชื่อโฟลเดอร์ใช้ hash ของ signature)
        _, m_saved_count = save_tardis_artifacts(
            project, bug_id, f"{safe_class_name}_M{tag}", m_status,
            out_tardis_path, tmp_tardis_path, bug_dir_b, m_stdout_log, m_stderr_log
        )
        total_saved_count += m_saved_count

        # บันทึกสถานะระดับ method ลง CSV เพื่อให้ resume ข้าม method นี้ได้
        log_result(project, bug_id, m_status, method_target_name, error_msg=m_err_msg,
                   exec_time=m_elapsed, saved_count=m_saved_count, timeout_limit=m_timeout)

        terminal = (m_status in METHOD_TERMINAL_STATUSES or
                    (m_status == "TARDIS_CRASH" and m_fatal_type == "MethodNotFoundException"))
        if not terminal:
            incomplete = True

        if m_status in ("COMPLETED", "SUCCESS_ON_TIMEOUT", "NO_TESTS_GENERATED"):
            continue
        elif m_status == "TIMEOUT":
            fallback_errs.append(f"M{m_idx}:TIMEOUT(ไม่มีไฟล์)")
        else:
            fallback_errs.append(f"M{m_idx}:{m_status}")
        fallback_status = "PARTIAL_SUCCESS"

    err_msg = (f"{FALLBACK_MSG_MARK}เสร็จสิ้น ข้อผิดพลาด: {','.join(fallback_errs)}"
               if fallback_errs else f"{FALLBACK_MSG_MARK}สำเร็จทั้งหมด")
    return fallback_status, err_msg, total_saved_count, incomplete, total_elapsed


def process_single_class(project, bug_id, bug_dir_b, bin_dir, classpath_str,
                          target_class, timeout_seconds, already_done):
    """รัน TARDIS กับ 1 class: ลองระดับ class ก่อน ถ้าเจอ MethodNotFoundException ค่อย fallback ไปรันทีละ method"""
    safe_project = re.sub(r'[^a-zA-Z0-9_.-]', '_', project)
    safe_bug_id = re.sub(r'[^a-zA-Z0-9_.-]', '_', bug_id)
    safe_class_name = re.sub(r'[^a-zA-Z0-9_.-]', '_', target_class)
    container_name = f"tardis_{safe_project}_{safe_bug_id}_{safe_class_name}"

    tmp_tardis_path = os.path.join(bug_dir_b, "tmp_tardis")
    out_tardis_path = os.path.join(bug_dir_b, "tardis_generated_tests")
    reset_output_dirs(tmp_tardis_path, out_tardis_path)

    parts = [f"/workspace/{bin_dir}"] + (classpath_str.split(':') if classpath_str else [])
    classes_arg = ":".join(dict.fromkeys(parts))      # ตัด entry ซ้ำ (เช่น target/classes ที่ซ้ำกับ cp.compile)
    # log ค่าที่ส่งให้ TARDIS จริง (ช่วยไล่ปัญหา "Malformed URL" / ClassNotFoundException)
    log_console(project, bug_id, f"classes_arg ({len(classes_arg)} ตัวอักษร) = {classes_arg[:500]}")

    target_class_internal = target_class.replace('.', '/')
    docker_base_options = build_docker_base_options(bug_dir_b)
    common_tardis_args = build_common_tardis_args(classes_arg)

    out_file_path = os.path.join(bug_dir_b, f"stdout_{safe_class_name}.log")
    err_file_path = os.path.join(bug_dir_b, f"stderr_{safe_class_name}.log")

    used_fallback = False
    incomplete = False
    total_saved_count = 0
    c_elapsed = 0.0
    status, err_msg, stdout_log, stderr_log = "", "", "", ""

    fallback_methods_done = [m for m in already_done if m.startswith(f"{target_class}::")]

    if fallback_methods_done:
        # เคยเข้า fallback ไปแล้ว -> ข้ามรอบ class-level ตรงเข้า fallback (ข้าม method ที่ทำแล้ว)
        log_console(project, bug_id, "⚡ ข้ามรันแบบเต็มคลาส (พบประวัติ Fallback) -> ตรงเข้า Fallback")
        used_fallback = True
        status, err_msg, total_saved_count, incomplete, c_elapsed = run_method_fallback(
            project, bug_id, target_class, safe_class_name, container_name,
            docker_base_options, common_tardis_args, bin_dir, bug_dir_b,
            tmp_tardis_path, out_tardis_path, out_file_path, err_file_path,
            timeout_seconds, "RESUMED_FALLBACK", already_done
        )
    else:
        # --- รอบแรก: รันทั้ง class รวดเดียว ---
        docker_cmd = (docker_base_options + ["--name", container_name] + common_tardis_args
                      + ["-target_class", target_class_internal])
        status, err_msg, stdout_log, stderr_log, fatal_type, fatal_detail, c_elapsed = run_tardis_docker(
            container_name, docker_cmd, timeout_seconds, out_file_path, err_file_path,
            project, bug_id, f"{target_class} [CLASS LEVEL]"
        )

        if status == "TARDIS_CRASH" and fatal_type == "MethodNotFoundException" and fatal_detail:
            used_fallback = True
            # เซฟ log รอบแรกไว้ก่อนเข้า fallback เพื่อกัน log หายตอน reset_output_dirs
            save_tardis_artifacts(
                project, bug_id, safe_class_name, "CLASSLEVEL_CRASH",
                out_tardis_path, tmp_tardis_path, bug_dir_b, stdout_log, stderr_log
            )
            status, err_msg, total_saved_count, incomplete, fb_elapsed = run_method_fallback(
                project, bug_id, target_class, safe_class_name, container_name,
                docker_base_options, common_tardis_args, bin_dir, bug_dir_b,
                tmp_tardis_path, out_tardis_path, out_file_path, err_file_path,
                timeout_seconds, fatal_detail, already_done
            )
            c_elapsed += fb_elapsed

    # --- เซฟผลรวมของ class เฉพาะรอบ class-level จริง (โหมด fallback เซฟทีละ method ไปแล้ว) ---
    if not used_fallback:
        c_files = glob.glob(os.path.join(out_tardis_path, "**", "*"), recursive=True) if os.path.exists(out_tardis_path) else []
        c_actual_saved = len([f for f in c_files if os.path.isfile(f)])

        if status == "COMPLETED" and c_actual_saved == 0:
            status = "NO_TESTS_GENERATED"
            err_msg = "ทำงานเสร็จสมบูรณ์ แต่ไม่มีไฟล์ Test ถูกสร้างขึ้น"
        elif status == "TIMEOUT" and c_actual_saved > 0:
            status = "SUCCESS_ON_TIMEOUT"
            err_msg += f" (เซฟทัน {c_actual_saved} ไฟล์)"
        elif status == "DOCKER_FAIL" and c_actual_saved > 0:
            status = "KILLED_WITH_TESTS"
            err_msg = f"process ถูกฆ่า แต่มีไฟล์เทสต์ {c_actual_saved} ไฟล์ก่อนถูกฆ่า | {err_msg}"

        _, saved_count = save_tardis_artifacts(
            project, bug_id, safe_class_name, status,
            out_tardis_path, tmp_tardis_path, bug_dir_b, stdout_log, stderr_log
        )
        total_saved_count += saved_count

    # --- สถานะของแถวสรุปใน CSV ---
    #  fallback ที่ยังไม่ครบ -> FALLBACK_SUMMARY (ไม่ resumable: รอบหน้าจะเข้ามาทำ method ที่เหลือ)
    #  fallback ครบทุก method -> COMPLETED (ไม่มี error) หรือ FALLBACK_DONE (resumable ทั้งคู่)
    if used_fallback:
        if incomplete:
            summary_status = "FALLBACK_SUMMARY"
        elif status == "COMPLETED":
            summary_status = "COMPLETED"
        else:
            summary_status = "FALLBACK_DONE"
    else:
        summary_status = status

    # แถวสรุปของ fallback: เวลาและจำนวนไฟล์ถูกบันทึกในแถวระดับ method ไปแล้ว
    # จึงใส่ 0 ที่นี่ เพื่อไม่ให้รวมคอลัมน์ ExecTime/SavedTestsCount ใน CSV แล้วนับซ้ำ
    log_result(project, bug_id, summary_status, target_class, error_msg=err_msg,
               exec_time=0.0 if used_fallback else c_elapsed,
               saved_count=0 if used_fallback else total_saved_count,
               timeout_limit=timeout_seconds or 0)
    log_console(project, bug_id, f"💾 [{summary_status}] บันทึกไฟล์ไปทั้งสิ้น ({total_saved_count} ไฟล์)")


def process_bug(task, processed_classes):
    """ทำงานทั้งบั๊ก 1 รายการ: checkout -> compile -> รัน TARDIS กับทุก class ที่ถูกแก้ไข"""
    project = task["project"]
    bug_id = task["bug_id"]
    raw_timeout = task.get("timeout", CLASS_TIMEOUT)
    timeout_seconds = None if raw_timeout == 0 else raw_timeout

    workspace_dir = os.path.abspath(f"./workspace_{project}_{bug_id}")
    bug_dir_b = os.path.join(workspace_dir, f"{project}_{bug_id}_buggy")
    current_step = "SETUP"
    already_done = processed_classes.get((project, bug_id), set())

    # --- FAST-SKIP: ถ้าทุก class ที่ถูกแก้ไขทำเสร็จแล้ว ข้าม checkout ทั้งหมด ---
    d4j_mod_classes_file = os.path.join(D4J_HOME, "framework", "projects", project,
                                        "modified_classes", f"{bug_id}.src")
    try:
        if os.path.exists(d4j_mod_classes_file):
            with open(d4j_mod_classes_file, 'r', encoding='utf-8') as f:
                mod_classes = [line.strip() for line in f.read().splitlines() if line.strip()]
            if mod_classes and all(c in already_done for c in mod_classes):
                log_console(project, bug_id,
                            f"✅ [FAST-SKIP] คลาสทั้งหมด ({len(mod_classes)} คลาส) ทำเสร็จไปแล้ว ข้ามการ Checkout...")
                return
    except Exception:
        pass

    # สร้าง workspace หลัง FAST-SKIP เพื่อไม่ให้ทิ้งโฟลเดอร์เปล่า
    os.makedirs(workspace_dir, exist_ok=True)

    print_banner(f"[{threading.current_thread().name}] เริ่มรัน {project} หมายเลขบั๊ก: {bug_id} "
                 f"(timeout={'ไม่มี' if timeout_seconds is None else timeout_seconds})")

    try:
        # ล้าง workspace เดิม ถ้าล้างไม่ออกให้หยุดพร้อมข้อความชัดเจน (ดีกว่าให้ defects4j ฟ้อง error งง ๆ)
        if not cleanup_dir(bug_dir_b):
            raise RuntimeError(f"ลบโฟลเดอร์เก่าไม่ได้ (ไฟล์ของ root หรือ Docker ใช้ไม่ได้): {bug_dir_b}")

        current_step = "CHECKOUT_COMPILE"
        checkout_and_compile(project, bug_id, bug_dir_b)

        current_step = "FIND_CLASSES"
        modified_classes, bin_dir, classpath_str = discover_targets(bug_dir_b)

        if not modified_classes:
            log_result(project, bug_id, "NO_MODIFIED_CLASSES", step=current_step, error_msg="ไม่พบคลาสที่มีการแก้ไข")
            return

        for target_class in modified_classes:
            if target_class in already_done:
                log_console(project, bug_id, f"[SKIP] คลาส {target_class} ทำเสร็จไปแล้ว")
                continue
            process_single_class(project, bug_id, bug_dir_b, bin_dir, classpath_str,
                                  target_class, timeout_seconds, already_done)

    except subprocess.CalledProcessError as e:
        # ข้อความ error ของ ant/defects4j มักออกทาง stdout ด้วย จึงรวมทั้งสองช่องทาง
        msg = ((e.stderr or "") + (e.stdout or "")).strip()[-500:] or "Unknown CLI Error"
        log_result(project, bug_id, "SETUP_FAIL", step=current_step, error_msg=msg)
    except Exception as e:
        log_result(project, bug_id, "SETUP_FAIL", step=current_step, error_msg=str(e))
    finally:
        cleanup_dir(bug_dir_b)
        try:
            if os.path.exists(workspace_dir) and not os.listdir(workspace_dir):
                os.rmdir(workspace_dir)
        except Exception:
            pass


# =================================================================
# 7. MAIN
# =================================================================

def d4j_bug_ids(project):
    """รายชื่อบั๊กที่มีจริงในเครื่อง จาก `defects4j bids -p <Project>` (ว่าง = ใช้ไม่ได้)"""
    try:
        r = subprocess.run(["defects4j", "bids", "-p", project],
                           capture_output=True, text=True, timeout=60)
        return sorted((b for b in r.stdout.split() if b.isdigit()), key=int)
    except Exception:
        return []


def build_tasks():
    """สร้างรายการงานจากบั๊กที่มีจริงใน Defects4J (ถ้า bids ใช้ไม่ได้ จะถอยไปใช้ range จาก D4J_PROJECTS)"""
    tasks = []
    for proj, fallback_count in D4J_PROJECTS.items():
        ids = d4j_bug_ids(proj)
        if not ids:
            print(f"[WARN] `defects4j bids` ใช้ไม่ได้กับ {proj} -> ใช้ range(1..{fallback_count}) แทน")
            ids = [str(i) for i in range(1, fallback_count + 1)]
        for bug_id in ids:
            tasks.append({"project": proj, "bug_id": str(bug_id), "timeout": CLASS_TIMEOUT})
    return tasks


def main():
    # ตรวจ Docker/defects4j ก่อน ไม่งั้นทุกงานจะล้มแล้วเขียนแถวขยะลง CSV
    check_docker_or_exit()

    processed_classes = load_processed_classes()
    tasks = TASKS or build_tasks()
    total_tasks = len(tasks)
    completed_count = 0

    print(f"\n [START] เริ่มต้นทำงานทั้งหมด {total_tasks} งาน "
          f"(Threads: {MAX_WORKERS}, memory/container: {DOCKER_MEMORY_LIMIT}, swap limit: {DOCKER_SWAP_LIMIT})\n")

    with ThreadPoolExecutor(max_workers=MAX_WORKERS, thread_name_prefix="TARDIS") as executor:
        futures = {executor.submit(process_bug, task, processed_classes): task for task in tasks}

        for future in as_completed(futures):
            task = futures[future]
            completed_count += 1
            try:
                future.result()
            except Exception as e:
                print(f"\n[FATAL] งาน {task['project']}-{task['bug_id']} ล้มเหลว: {e}")
            finally:
                percent = (completed_count / total_tasks) * 100
                print(f"\n [PROGRESS] ภาพรวมเสร็จไปแล้ว {completed_count}/{total_tasks} งาน "
                      f"({percent:.1f}%) - เหลืออีก {total_tasks - completed_count} งาน\n")

    print("\n ทุกงานทำงานเสร็จสิ้นแล้ว")


if __name__ == "__main__":
    main()