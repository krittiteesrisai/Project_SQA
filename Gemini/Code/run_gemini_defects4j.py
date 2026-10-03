#!/usr/bin/env python3
"""
run_gemini_defects4j.py  (v2)

Automates: read a Defects4j class -> build the Gemini prompt (Phase 1 template)
-> call Gemini/KKU API -> extract the generated JUnit test -> save it ->
compile & measure coverage/fault-detection with Defects4j -> log results to CSV.

=== แก้ไขจากเวอร์ชันเดิม (v1) ===
1. kills_bug ตอนนี้เช็คทั้ง Buggy และ Fixed version จริง ตามเกณฑ์มาตรฐาน:
       kills_bug = (test FAILS บน buggy)  AND  (test PASSES บน fixed)
   (เดิมเช็คแค่ buggy อย่างเดียว เสี่ยง false positive)
2. parse_failing_count() ใช้ regex แทน string "0" in ... — รองรับ failing tests
   หลักเดียว/สองหลัก/มากกว่านั้นถูกต้องหมด (เดิม bug ถ้า failing = 10, 20 ฯลฯ)
3. รัน generated test class เดี่ยวๆ ผ่าน JUnitCore โดยตรง (java -cp ... 
   org.junit.runner.JUnitCore <class>) แทนการใช้ `defects4j test -t <class>`
   เพราะ -t ของ defects4j รองรับแค่ระดับ <class>::<method> เท่านั้น (ยืนยันจาก
   เอกสารทางการ d4j-test) ไม่รองรับรันทั้งคลาส — ของเดิม (v2 แรก) ใช้ -t แบบ
   class เฉยๆ ทำให้ error เงียบทุกครั้งและ kills_bug กลายเป็น False หลอกหมด
   (พบและยืนยัน root cause โดยผู้ใช้เอง)
4. Resume ตอนนี้ key เป็นระดับ (project, bug_id, class_name) แทนระดับ (project, bug_id)
   กันเคสบั๊กเดียวมีหลายคลาส แล้วรันไม่ครบตอนล่ม ไม่ให้ข้ามคลาสที่เหลือทิ้งตลอดกาล
5. รองรับหลาย API key ต่อ provider (คั่นด้วย comma ผ่าน env var) — พอคีย์หนึ่งโดน
   quota/rate-limit จะสลับไปคีย์ถัดไปอัตโนมัติ
6. ถ้าโดน quota หมดพร้อมกันทุกคีย์ -> หยุดทั้ง batch ทันที (ไม่ไล่ checkout
   บั๊กที่เหลือทิ้งเปล่าๆ) พร้อม log ชัดเจนว่าคลาสไหนค้างอยู่ ให้รัน resume ต่อได้เลย
   ทันทีที่ quota reset หรือเพิ่มคีย์ใหม่
7. MODEL_NAME (สำหรับ --provider gemini) เปลี่ยนจาก gemini-2.5-pro (paid-only
   ตั้งแต่ เม.ย. 2026 ไม่มี free tier แล้ว) เป็น gemini-2.5-flash

Requirements:
    pip install google-genai --break-system-packages   # สำหรับ --provider gemini
    pip install openai --break-system-packages          # สำหรับ --provider kku

API key (รองรับหลายคีย์ — คั่นด้วย comma):
    --provider gemini: HARDCODED_API_KEY ในสคริปต์ (คีย์เดียว) หรือ
                        export GEMINI_API_KEYS="key1,key2,key3"  (หลายคีย์ แนะนำ)
                        export GEMINI_API_KEY="key1"             (คีย์เดียว)
    --provider kku:     HARDCODED_KKU_API_KEY ในสคริปต์ (คีย์เดียว) หรือ
                        export KKU_API_KEYS="key1,key2,key3"     (หลายคีย์ แนะนำ)
                        export KKU_API_KEY="key1"                (คีย์เดียว)

Usage:
    python3 run_gemini_defects4j.py --project Lang --bug 1 --workroot ./work --provider kku
    python3 run_gemini_defects4j.py --batch targets.csv --workroot ./work --provider kku
    python3 run_gemini_defects4j.py --batch targets.csv --workroot ./work --provider kku --skip-fixed-check

`targets.csv` format (no header needed), one target per line:
    Lang,1
    Lang,2
    Chart,5
"""

import argparse
import csv
import os
import re
import shutil
import signal
import subprocess
import sys
import time
from pathlib import Path

# ---------------------------------------------------------------------------
# The exact Gemini prompt template from Phase 1
# ---------------------------------------------------------------------------
GEMINI_PROMPT_TEMPLATE = """คุณคือ Senior Java Test Automation Engineer ที่เชี่ยวชาญการหาบั๊กเชิงลึกและ JUnit 4

เป้าหมาย: เขียนชุดทดสอบ JUnit 4 สำหรับคลาสด้านล่าง โดยมุ่งเน้นที่การทำ Branch/Condition Coverage สูงที่สุดเท่าที่เป็นไปได้ และจำลองสถานการณ์ Edge Cases เพื่อดักจับ Fault ที่อาจแฝงอยู่ใน Defects4J

ข้อกำหนดที่ต้องปฏิบัติตามอย่างเคร่งครัด:
1. การใช้ไลบรารี: ใช้แค่ JUnit 4 และไลบรารีที่ระบุใน Classpath นี้เท่านั้น: {cp_test} (ห้ามใช้ Mockito หรือไลบรารีนอกเหนือจากนี้เว้นแต่จะอยู่ในซอร์สโค้ด)
2. กฎการเขียนโค้ด: ตั้งชื่อคลาสเป็น {class_name}Test
3. วิเคราะห์ก่อนเขียน (Chain-of-Thought): ก่อนจะเขียนโค้ด ให้คุณวิเคราะห์สั้นๆ ว่าเมธอดนี้มี Branch อะไรบ้าง และคุณวางแผนจะใช้อินพุตแบบไหนไป Trigger แต่ละ Branch
4. ครอบคลุมสถานการณ์: ต้องมีกรณี Boundary limits, Null/Empty values, และ Invalid states
5. สรุปผล: ท้ายโค้ดให้ทำตารางสรุปว่า Test Method ชื่ออะไร ทำหน้าที่คลุม Branch ไหน

ซอร์สโค้ดคลาสเป้าหมาย (Defects4J: {project}-{bug_id}b):
```java
{source_code}
```
"""

# gemini-2.5-pro เป็น paid-only ตั้งแต่ เม.ย. 2026 (ไม่มี free tier แล้ว)
# gemini-2.5-flash ยังมี free tier อยู่ (จำนวน request/วันเช็คได้ที่ AI Studio dashboard)
MODEL_NAME = "gemini-3.5-flash-lite"

KKU_MODEL_NAME = "gemini-3.7-flash"
KKU_BASE_URL = "https://gen.ai.kku.ac.th/api/v1"

# แก้ตรงนี้: ใส่คีย์เดียวได้ หรือปล่อยว่าง "" แล้วตั้ง env var *_KEYS แทน (แนะนำ ถ้ามีหลายคีย์)
HARDCODED_API_KEY = ""
HARDCODED_KKU_API_KEY = ""


def _load_keys(hardcoded, env_single, env_list, keyfile=None):
    """คืน list ของ API key: เช็ค *_KEYS (comma-separated) ก่อน แล้วค่อย fallback ไปคีย์เดียว"""
    raw_list = os.environ.get(env_list)
    if raw_list:
        keys = [k.strip() for k in raw_list.split(",") if k.strip()]
        if keys:
            return keys
    # ไฟล์คีย์ (บรรทัดละ 1 คีย์ ข้ามบรรทัดว่าง/ขึ้นต้นด้วย #) วางไว้โฟลเดอร์เดียวกับสคริปต์ — ไม่ต้อง export ทุกครั้ง
    if keyfile:
        kp = os.path.join(os.path.dirname(os.path.abspath(__file__)), keyfile)
        if os.path.exists(kp):
            with open(kp, encoding="utf-8") as f:
                keys = [l.strip() for l in f if l.strip() and not l.strip().startswith("#")]
            if keys:
                return keys
    single = hardcoded or os.environ.get(env_single)
    return [single] if single else []


# คีย์อ่านจาก: export *_KEYS  ->  ไฟล์ kku_keys.txt / gemini_keys.txt (บรรทัดละคีย์ แนะนำ)  ->  HARDCODED_*  | ตัวอย่าง export GEMINI_API_KEYS="k1,k2,..." / KKU_API_KEYS="k1,k2,..." (แนะนำ: ไม่ต้องใส่คีย์ในไฟล์นี้)
# หรือใส่คีย์เดียวที่ HARDCODED_*_API_KEY ด้านบน
GEMINI_API_KEYS = _load_keys(HARDCODED_API_KEY, "GEMINI_API_KEY", "GEMINI_API_KEYS", "gemini_keys.txt")
KKU_API_KEYS = _load_keys(HARDCODED_KKU_API_KEY, "KKU_API_KEY", "KKU_API_KEYS", "kku_keys.txt")

QUOTA_SIGNS = ["quota", "429", "resource_exhausted", "rate limit", "rate_limit", "too many requests",
               "daily limit", "reached daily", "limit reached", "usage limit"]  # ข้อความจาก gateway ของ kku (มากับ 401)


class QuotaExhaustedError(RuntimeError):
    """ทุกคีย์ที่มีสำหรับ provider นี้โดน quota/rate-limit หมดพร้อมกัน"""


def is_quota_error(err):
    return any(sign in str(err).lower() for sign in QUOTA_SIGNS)


_gemini_key_idx = 0
_kku_key_idx = 0


CMD_TIMEOUT_SEC = int(os.environ.get("CMD_TIMEOUT_SEC", "1200"))  # 20 นาที


def _run_capture(cmd, cwd, timeout):
    """รันใน process group ของตัวเอง ถ้าเกินเวลาให้ฆ่าทั้งกลุ่ม (รวม java ลูกที่ ant/perl เปิดไว้)"""
    proc = subprocess.Popen(cmd, cwd=cwd, stdout=subprocess.PIPE, stderr=subprocess.PIPE,
                            text=True, start_new_session=True)
    try:
        out, err = proc.communicate(timeout=timeout)
    except subprocess.TimeoutExpired:
        try:
            os.killpg(proc.pid, signal.SIGKILL)
        except ProcessLookupError:
            pass
        proc.communicate()
        raise RuntimeError(f"timeout after {timeout}s: {' '.join(cmd)}")
    return subprocess.CompletedProcess(cmd, proc.returncode, out, err)


def run(cmd, cwd=None, check=True, timeout=None):
    print(f"$ {' '.join(cmd)}")
    result = _run_capture(cmd, cwd, timeout or CMD_TIMEOUT_SEC)
    if result.stdout:
        print(result.stdout[-3000:])
    if result.stderr:
        print(result.stderr[-3000:])
    if check and result.returncode != 0:
        raise RuntimeError(f"Command failed: {' '.join(cmd)}")
    return result


def checkout_project(project, bug_id, workdir, variant="b"):
    """Checkout the buggy ('b') or fixed ('f') version via defects4j. Idempotent."""
    workdir = Path(workdir)
    if not workdir.exists():
        run(["defects4j", "checkout", "-p", project, "-v", f"{bug_id}{variant}", "-w", str(workdir)])
    return workdir


def get_modified_classes(workdir):
    """
    บางโปรเจกต์ (เช่น Codec) มี entry ใน classes.modified ที่เป็นไฟล์ resource
    (.txt, .properties ฯลฯ) ไม่ใช่ Java class จริง — สังเกตได้จากมีนามสกุลไฟล์
    ต่อท้ายอยู่แล้วในชื่อ (เช่น "...sep_lang.txt") หรือมี path นำหน้าแบบ
    "src.main.resources...." ซึ่งไม่ใช่รูปแบบ fully-qualified class name ปกติ
    ข้ามพวกนี้ทิ้งไปเลย เพราะ AI เขียน JUnit test ให้ resource file ไม่ได้อยู่แล้ว
    """
    result = run(["defects4j", "export", "-p", "classes.modified", "-w", str(workdir)])
    raw = [c.strip() for c in result.stdout.strip().splitlines() if c.strip()]

    RESOURCE_EXTENSIONS = {"txt", "properties", "xml", "dat", "csv", "json", "yml", "yaml"}

    classes, skipped = [], []
    for c in raw:
        last_part = c.rsplit(".", 1)[-1].lower()
        looks_like_resource = (
            c.startswith("src.main.resources")
            or c.startswith("src.test.resources")
            or last_part in RESOURCE_EXTENSIONS
        )
        if looks_like_resource:
            skipped.append(c)
        else:
            classes.append(c)

    if skipped:
        print(f"[SKIP-RESOURCE] ข้าม {len(skipped)} entry ที่ไม่ใช่ Java class: {skipped}")

    return classes


def get_test_classpath(workdir):
    result = run(["defects4j", "export", "-p", "cp.test", "-w", str(workdir)])
    return result.stdout.strip().splitlines()[-1].strip()


def get_test_root(workdir):
    result = run(["defects4j", "export", "-p", "dir.src.tests", "-w", str(workdir)])
    return result.stdout.strip().splitlines()[-1].strip()


def find_source_file(workdir, class_name):
    """Locate the .java source file for a fully-qualified class name."""
    rel_path = class_name.replace(".", "/") + ".java"
    result = run(["defects4j", "export", "-p", "dir.src.classes", "-w", str(workdir)])
    src_root = result.stdout.strip().splitlines()[-1].strip()
    candidate = Path(workdir) / src_root / rel_path
    if candidate.exists():
        return candidate
    matches = list(Path(workdir).rglob(Path(rel_path).name))
    if matches:
        return matches[0]
    raise FileNotFoundError(f"Could not find source file for {class_name}")


def build_prompt(project, bug_id, class_name, cp_test, source_code):
    return GEMINI_PROMPT_TEMPLATE.format(
        cp_test=cp_test,
        class_name=class_name.split(".")[-1],
        project=project,
        bug_id=bug_id,
        source_code=source_code,
    )


def call_gemini(prompt):
    """Call Gemini API directly, rotating keys automatically on quota errors."""
    from google import genai

    if not GEMINI_API_KEYS:
        raise RuntimeError("ไม่มี Gemini API key ตั้งไว้เลย (HARDCODED_API_KEY / GEMINI_API_KEY(S))")

    global _gemini_key_idx
    last_err = None
    for _ in range(len(GEMINI_API_KEYS)):
        key = GEMINI_API_KEYS[_gemini_key_idx]
        try:
            client = genai.Client(api_key=key)
            response = client.models.generate_content(model=MODEL_NAME, contents=prompt)
            return response.text
        except Exception as e:
            last_err = e
            if is_quota_error(e):
                print(f"[KEY SWITCH] Gemini key #{_gemini_key_idx} โดน quota/rate-limit สลับคีย์ถัดไป...")
                _gemini_key_idx = (_gemini_key_idx + 1) % len(GEMINI_API_KEYS)
                time.sleep(3)
                continue
            raise
    raise QuotaExhaustedError(f"ทุกคีย์ Gemini ({len(GEMINI_API_KEYS)} คีย์) โดน quota หมดแล้ว: {last_err}")


def call_kku_ai(prompt, max_retries=3):
    """Call the KKU AI gateway, rotating keys on quota errors + retrying transient errors.

    แก้บั๊กจากเวอร์ชันก่อน: error ที่ไม่ใช่ quota (เช่น model name ผิด, prompt format ผิด)
    เดิมจะวนลองครบทุกคีย์แบบไร้ประโยชน์ (เพราะปัญหาไม่ได้อยู่ที่คีย์) แล้วจบด้วยการ raise
    QuotaExhaustedError หลอกๆ ทำให้ debug ยาก — ตอนนี้ error แบบนี้จะ raise ออกไปทันที
    หลังจากลอง retry กับคีย์ปัจจุบันครบตามจำนวนแล้ว ไม่ต้องไปวนคีย์อื่นให้เสียเวลา
    """
    from openai import OpenAI

    if not KKU_API_KEYS:
        raise RuntimeError("ไม่มี KKU API key ตั้งไว้เลย (HARDCODED_KKU_API_KEY / KKU_API_KEY(S))")

    global _kku_key_idx
    last_err = None
    for _ in range(len(KKU_API_KEYS)):
        key = KKU_API_KEYS[_kku_key_idx]
        client = OpenAI(api_key=key, base_url=KKU_BASE_URL)
        quota_hit = False
        for attempt in range(max_retries):
            try:
                response = client.chat.completions.create(
                    model=KKU_MODEL_NAME,
                    messages=[
                        {"role": "system", "content": "You are a helpful Java testing engineer."},
                        {"role": "user", "content": prompt},
                    ],
                    stream=False,
                )
                return response.choices[0].message.content
            except Exception as e:
                last_err = e
                if is_quota_error(e):
                    print(f"[KEY SWITCH] KKU key #{_kku_key_idx} โดน quota/rate-limit สลับคีย์ถัดไป...")
                    _kku_key_idx = (_kku_key_idx + 1) % len(KKU_API_KEYS)
                    time.sleep(3)
                    quota_hit = True
                    break  # ออกจาก retry loop ไปลองคีย์ถัดไปทันที
                wait = (attempt + 1) * 5
                print(f"[RETRY] error ชั่วคราว: {e} รอ {wait}s แล้วลองใหม่ ({attempt + 1}/{max_retries})...")
                time.sleep(wait)
        if not quota_hit:
            # ครบ max_retries กับคีย์นี้แล้ว และไม่ใช่ quota error เลยสักครั้ง
            # -> ปัญหาไม่ได้อยู่ที่คีย์ (เช่น model name ผิด) โยน error จริงออกไปทันที ไม่ต้องวนคีย์อื่น
            raise RuntimeError(f"KKU API เรียกไม่สำเร็จ (ไม่ใช่ quota error): {last_err}")
    raise QuotaExhaustedError(f"ทุกคีย์ KKU ({len(KKU_API_KEYS)} คีย์) โดน quota หมดแล้ว: {last_err}")


def extract_java_code(ai_response):
    """Pull the first ```java ... ``` block out of the AI reply."""
    match = re.search(r"```java\s*(.*?)```", ai_response, re.DOTALL)
    if match:
        return match.group(1).strip()
    match = re.search(r"```\s*(.*?)```", ai_response, re.DOTALL)
    if match:
        return match.group(1).strip()
    raise ValueError("No ```java code block found in AI response")


def test_file_rel_path(class_name):
    """คืน (relative path ของไฟล์ test, fully-qualified test class name)"""
    test_class_name = class_name.split(".")[-1] + "Test"
    package = ".".join(class_name.split(".")[:-1])
    rel_path = (package.replace(".", "/") + "/" if package else "") + test_class_name + ".java"
    full_test_class = (package + "." if package else "") + test_class_name
    return rel_path, full_test_class


def save_test_file(code, class_name, workdir):
    rel_path, full_test_class = test_file_rel_path(class_name)
    test_root = get_test_root(workdir)
    out_path = Path(workdir) / test_root / rel_path
    out_path.parent.mkdir(parents=True, exist_ok=True)
    out_path.write_text(code, encoding="utf-8")
    return out_path, full_test_class


def parse_failing_count(test_stdout):
    """จำนวน failing tests จาก output ของ `defects4j test` — รองรับเลขกี่หลักก็ได้ (ไม่ใช้ string 'in' เหมือน v1)"""
    m = re.search(r"Failing tests:\s*(\d+)", test_stdout)
    return int(m.group(1)) if m else None


def run_junit_class(cp_test, full_test_class, cwd):
    """
    รัน generated test class เดี่ยวๆ ตรงผ่าน JUnitCore แทน `defects4j test -t`
    เหตุผล: -t ของ defects4j รองรับแค่ระดับ <class>::<method> เท่านั้น (ยืนยันจาก
    เอกสารทางการ d4j-test) ไม่รองรับรันทั้งคลาสแบบที่ต้องการ ใช้ JUnitCore ตรงๆ
    แทนจะรันได้ทั้งคลาสในคำสั่งเดียว และแยกผลเฉพาะ generated test นี้จริงๆ
    (ไม่ปนกับ developer test suite ทั้งหมดแบบที่จะเกิดถ้ารัน `defects4j test`
    เปล่าๆ โดยไม่มี -t เลย)
    คืนค่า (จำนวน failing tests หรือ None ถ้า parse ไม่ได้, raw output เต็ม)
    """
    cmd = ["java", "-cp", cp_test, "org.junit.runner.JUnitCore", full_test_class]
    print(f"$ {' '.join(cmd)}")
    result = _run_capture(cmd, str(cwd), CMD_TIMEOUT_SEC)
    output = (result.stdout or "") + "\n" + (result.stderr or "")
    print(output[-3000:])

    m = re.search(r"Tests run:\s*(\d+),\s*Failures:\s*(\d+)", output)
    if m:
        return int(m.group(2)), output
    if re.search(r"OK \(\d+ tests?\)", output):
        return 0, output
    # รันไม่สำเร็จเลย (เช่น class not found, classpath ผิด) -> ไม่รู้ผล ไม่ใช่ 0
    return None, output


def compile_and_measure(buggy_workdir, fixed_workroot, project, bug_id, class_name,
                         full_test_class, verify_fixed=True):
    """
    Compile + coverage บน buggy version เสมอ
    kills_bug ตัดสินตามเกณฑ์: FAIL บน buggy AND PASS บน fixed (ถ้า verify_fixed=True)
    ถ้า verify_fixed=False จะเชื่อผลจาก buggy อย่างเดียว (เร็วกว่า แต่เสี่ยง false positive)
    """
    log = {
        "project": project, "bug_id": bug_id, "compiled": False, "coverage": None,
        "kills_bug": None, "buggy_failing": None, "fixed_failing": None, "error": None,
    }

    try:
        run(["defects4j", "compile", "-w", str(buggy_workdir)])
        log["compiled"] = True
    except RuntimeError as e:
        log["error"] = f"compile failed (buggy): {e}"
        return log

    try:
        cov = run(["defects4j", "coverage", "-w", str(buggy_workdir)])
        log["coverage"] = cov.stdout.strip().splitlines()[-5:]
    except RuntimeError as e:
        log["error"] = f"coverage failed: {e}"

    try:
        cp_test_buggy = get_test_classpath(buggy_workdir)
        failing, _raw = run_junit_class(cp_test_buggy, full_test_class, buggy_workdir)
        log["buggy_failing"] = failing
    except Exception as e:
        log["error"] = (log["error"] or "") + f" | test run failed (buggy): {e}"

    buggy_fails = (log["buggy_failing"] or 0) > 0

    if not verify_fixed:
        log["kills_bug"] = buggy_fails
        return log

    if not buggy_fails:
        # ไม่ fail บน buggy อยู่แล้ว ไม่ใช่การตรวจจับบั๊ก ไม่ต้องเสียเวลาเช็ค fixed version ต่อ
        log["kills_bug"] = False
        return log

    # --- Fixed version: เอา test ตัวเดิมไปวางแล้วเช็คว่า "ผ่าน" จริงไหม ---
    try:
        fixed_workdir = Path(fixed_workroot) / f"{project}_{bug_id}_fixed"
        checkout_project(project, bug_id, fixed_workdir, variant="f")

        rel_path, _ = test_file_rel_path(class_name)
        src_test_root = get_test_root(buggy_workdir)
        dst_test_root = get_test_root(fixed_workdir)
        src_path = Path(buggy_workdir) / src_test_root / rel_path
        dst_path = Path(fixed_workdir) / dst_test_root / rel_path
        dst_path.parent.mkdir(parents=True, exist_ok=True)
        shutil.copy2(src_path, dst_path)

        run(["defects4j", "compile", "-w", str(fixed_workdir)])
        cp_test_fixed = get_test_classpath(fixed_workdir)
        failing_fixed, _raw = run_junit_class(cp_test_fixed, full_test_class, fixed_workdir)
        log["fixed_failing"] = failing_fixed
    except Exception as e:
        log["error"] = (log["error"] or "") + f" | fixed-version check failed: {e}"

    fixed_passes = log["fixed_failing"] == 0
    log["kills_bug"] = buggy_fails and fixed_passes
    return log


def process_target(project, bug_id, workroot, csv_writer, provider, done_classes, verify_fixed):
    buggy_workdir = Path(workroot) / f"{project}_{bug_id}"
    print(f"\n=== {project}-{bug_id} ({provider}) ===")
    checkout_project(project, bug_id, buggy_workdir, variant="b")

    classes = get_modified_classes(buggy_workdir)
    cp_test = get_test_classpath(buggy_workdir)

    for class_name in classes:
        if (project, bug_id, class_name) in done_classes:
            print(f"[SKIP-CLASS] {project}-{bug_id}::{class_name} ทำไปแล้ว (resume)")
            continue

        try:
            src_file = find_source_file(buggy_workdir, class_name)
            source_code = src_file.read_text(encoding="utf-8", errors="ignore")

            prompt = build_prompt(project, bug_id, class_name, cp_test, source_code)
            ai_reply = call_kku_ai(prompt) if provider == "kku" else call_gemini(prompt)
            test_code = extract_java_code(ai_reply)
            out_path, full_test_class = save_test_file(test_code, class_name, buggy_workdir)

            log = compile_and_measure(buggy_workdir, workroot, project, bug_id, class_name,
                                       full_test_class, verify_fixed=verify_fixed)
            log["class_name"] = class_name
            log["test_file"] = str(out_path)
            log["prompt_chars"] = len(prompt)

            csv_writer.writerow(log)
            print(f"[OK] {class_name}: compiled={log['compiled']} kills_bug={log['kills_bug']} "
                  f"(buggy_failing={log['buggy_failing']}, fixed_failing={log['fixed_failing']})")

        except QuotaExhaustedError as e:
            csv_writer.writerow({
                "project": project, "bug_id": bug_id, "class_name": class_name,
                "compiled": False, "coverage": None, "kills_bug": None,
                "buggy_failing": None, "fixed_failing": None,
                "error": f"QUOTA_EXHAUSTED: {e}", "test_file": None, "prompt_chars": None,
            })
            raise  # ส่งขึ้นไปให้ main หยุดทั้ง batch ทันที

        except Exception as e:
            print(f"[FAIL] {class_name}: {e}")
            csv_writer.writerow({
                "project": project, "bug_id": bug_id, "class_name": class_name,
                "compiled": False, "coverage": None, "kills_bug": None,
                "buggy_failing": None, "fixed_failing": None,
                "error": str(e), "test_file": None, "prompt_chars": None,
            })

        time.sleep(2)  # ใจดีกับ rate limit


def load_done_classes(out_path):
    """
    อ่านผลเดิมจาก CSV แล้วคืน set ของ (project, bug_id, class_name) ที่ 'เสร็จแล้วจริง'
    - แถวที่ error เป็น quota/rate-limit -> ไม่นับว่าเสร็จ (ให้ลองใหม่)
    - แถว target-level failure (class_name ว่าง) -> ไม่นับว่าเสร็จ (ให้ลองใหม่ทั้ง target)
    """
    done = set()
    if not os.path.exists(out_path):
        return done
    with open(out_path, newline="", encoding="utf-8") as f:
        for row in csv.DictReader(f):
            class_name = row.get("class_name") or ""
            err = row.get("error") or ""
            if not class_name:
                continue
            if is_quota_error(err):
                continue
            done.add((row["project"], row["bug_id"], class_name))
    return done


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--project", help="Defects4j project id, e.g. Lang")
    parser.add_argument("--bug", help="Bug id, e.g. 1")
    parser.add_argument("--batch", help="CSV file of project,bug pairs")
    parser.add_argument("--workroot", default="./work", help="Root dir for checkouts")
    parser.add_argument("--out", default="results.csv", help="Output CSV log")
    parser.add_argument("--provider", choices=["gemini", "kku"], default="gemini",
                         help="เลือกว่าจะยิงเข้า Gemini โดยตรง หรือผ่าน ai.kku.ac.th")
    parser.add_argument("--skip-fixed-check", action="store_true",
                         help="ข้ามการเช็ค fixed version (เร็วกว่า แต่ FDR อาจสูงเกินจริง — ไม่แนะนำ)")
    args = parser.parse_args()

    if args.provider == "kku" and not KKU_API_KEYS:
        sys.exit("ERROR: ไม่มี KKU key เลย ใส่ HARDCODED_KKU_API_KEY หรือ export KKU_API_KEYS=\"key1,key2\"")
    if args.provider == "gemini" and not GEMINI_API_KEYS:
        sys.exit("ERROR: ไม่มี Gemini key เลย ใส่ HARDCODED_API_KEY หรือ export GEMINI_API_KEYS=\"key1,key2\"")

    fieldnames = ["project", "bug_id", "class_name", "compiled", "coverage",
                  "kills_bug", "buggy_failing", "fixed_failing", "error",
                  "test_file", "prompt_chars"]

    done_classes = load_done_classes(args.out)
    if done_classes:
        print(f"พบผลลัพธ์เดิม {len(done_classes)} คลาสที่เสร็จแล้ว จะข้ามเฉพาะคลาสเหล่านั้น (resume mode)")

    out_exists = os.path.exists(args.out)
    mode = "a" if out_exists else "w"
    with open(args.out, mode, newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        if not out_exists:
            writer.writeheader()

        def maybe_process(project, bug_id):
            try:
                process_target(project, bug_id, args.workroot, writer, args.provider,
                                done_classes, verify_fixed=not args.skip_fixed_check)
            except QuotaExhaustedError as e:
                f.flush()
                print(f"\n[STOP] {e}")
                print("Quota หมดทุกคีย์แล้ว หยุดสคริปต์ทันทีเพื่อไม่ให้เสียเวลา checkout เปล่าๆ")
                print(f"ค้างอยู่ที่: {project}-{bug_id}")
                print("รอ quota reset หรือเพิ่มคีย์ใหม่ใน KKU_API_KEYS/GEMINI_API_KEYS แล้วรันคำสั่งเดิมซ้ำเพื่อ resume ต่อได้เลย")
                sys.exit(1)
            except Exception as e:
                # target-level failure (เช่น checkout ล้มเหลว/network หลุดชั่วคราว) — ไม่หยุดทั้ง batch
                print(f"[SKIP-ERROR] {project}-{bug_id}: {e}")
                writer.writerow({
                    "project": project, "bug_id": bug_id, "class_name": "",
                    "compiled": False, "coverage": None, "kills_bug": None,
                    "buggy_failing": None, "fixed_failing": None,
                    "error": f"target-level failure: {e}", "test_file": None, "prompt_chars": None,
                })
            f.flush()

        if args.batch:
            with open(args.batch, newline="", encoding="utf-8") as bf:
                for row in csv.reader(bf):
                    if not row:
                        continue
                    project, bug_id = row[0].strip(), row[1].strip()
                    maybe_process(project, bug_id)
        elif args.project and args.bug:
            maybe_process(args.project, args.bug)
        else:
            sys.exit("Provide either --project/--bug or --batch targets.csv")

    print(f"\nDone. Results written to {args.out}")


if __name__ == "__main__":
    main()