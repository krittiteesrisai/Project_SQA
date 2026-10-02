#!/usr/bin/env python3
"""
run_ai_tests.py  (เวอร์ชันรันทุกบั๊ก)
ให้ Claude สร้าง JUnit 4 test ให้ทุกบั๊กใน Defects4J แล้ววัดผลอัตโนมัติ

โครงสร้างผลลัพธ์ (ทุกโมเดลรวมในโฟลเดอร์เดียว):
    AI_Results/
      Prompt/     prompt_template.txt + พรอมพ์ที่ส่งจริง <Project>/<Bug>/ (ใช้ร่วมกันทุกโมเดล)
      TestCode/   ไฟล์เทสต์ .java <Project>/<Bug>/<Model>/<package>/
      Result/     results.csv (มีคอลัมน์ model), summary_by_project.csv, token_usage.csv,
                  failed.csv (บั๊กที่ error และยังไม่มีผล), errors.csv (ประวัติ error ทุกครั้ง)
                  และคำตอบดิบ + log <Project>/<Bug>/<Model>/

API key หลายตัว:
    ใส่ key ในไฟล์ api_keys.txt บรรทัดละ 1 ตัว สคริปต์ใช้จากบนลงล่าง
    key ไหนโควต้าหมดจะสลับไปตัวถัดไปเอง (ถ้าไม่มีไฟล์นี้ จะใช้ KKU_API_KEY แบบเดิม)
    python3 run_ai_tests.py --quota       ดูโควต้าคงเหลือของ key ทุกตัว

คำสั่ง:
    python3 run_ai_tests.py --make-bugs   สร้าง bugs.txt จากทุกบั๊ก active ใน Defects4J
    python3 run_ai_tests.py --models      (KKU) ดูรายชื่อโมเดลและ ID
    python3 run_ai_tests.py --quota       (KKU) ดูโควต้าคงเหลือ
    python3 run_ai_tests.py               รันงาน (หยุดแล้วรันใหม่ได้ ทำต่อจากจุดเดิม)
    python3 run_ai_tests.py --summary     สรุปผลรายโมเดลและรายโปรเจกต์
    python3 run_ai_tests.py --failed      ดูรายการบั๊กที่ error (failed.csv)
    python3 run_ai_tests.py --retry-failed [stage]
                                          รันแก้เฉพาะบั๊กใน failed.csv (เลือก stage ได้)
    python3 run_ai_tests.py --merge <โฟลเดอร์เก่า> <ชื่อโมเดล>
                                          ย้ายผลจากโฟลเดอร์แยกโมเดลแบบเดิมเข้ามารวม

โหมด manual (ใช้ Claude chat แทน API) ตั้ง PROVIDER = "manual" แล้ว:
    python3 run_ai_tests.py --prepare 20          เตรียมพรอมพ์ 20 บั๊ก
    python3 run_ai_tests.py --next                ดูพรอมพ์ที่ยังไม่มีคำตอบ
    python3 run_ai_tests.py --save Lang 1 NumberUtils   วางคำตอบจาก chat แล้ว Ctrl+D
    python3 run_ai_tests.py                       รันเทสต์บั๊กที่มีคำตอบครบแล้ว
"""
import csv
import datetime
import hashlib
import json
import os
import re
import shutil
import subprocess
import sys
import tarfile
import threading
import time
import urllib.error
import urllib.request
from concurrent.futures import ThreadPoolExecutor
from pathlib import Path

# ======================= ตั้งค่า (แก้ตรงนี้) =======================
PROVIDER = "kku"   # "kku" = API มหาวิทยาลัย, "anthropic" = Claude API โดยตรง,
                   # "manual" = คัดลอกพรอมพ์ไปวางใน Claude chat เอง แล้วบันทึกคำตอบด้วย --save

PROVIDERS = {
    "kku": {"base_url": "https://gen.ai.kku.ac.th/api/v1", "key_env": "KKU_API_KEY"},
    "anthropic": {"base_url": "https://api.anthropic.com/v1", "key_env": "ANTHROPIC_API_KEY"},
}

# ชื่อโมเดล (ใช้ในคอลัมน์ model และชื่อโฟลเดอร์ย่อย) และ ID ของโมเดล
#   kku       -> id เป็นตัวเลขจาก --models
#   anthropic -> id เป็นข้อความ "claude-sonnet-5"
MODEL = {"name": "Claude", "id": "claude-sonnet-5"}

KEYS_FILE = "api_keys.txt"      # ไฟล์ API key บรรทัดละ 1 ตัว (ห้ามอัปขึ้น GitHub)
KEY_STATE_FILE = ".keys_state.json"   # จำว่า key ไหนหมดโควต้าวันนี้ (ไม่มี key จริงอยู่ในไฟล์)
OUTPUT_NAME = "AI_Results"      # โฟลเดอร์รวมผลของทุกโมเดล
ROOT = Path(".")                # โฟลเดอร์ที่จะสร้าง Claude-sonnet_5/ ไว้ข้างใน
BUGS_FILE = "bugs.txt"          # แต่ละบรรทัด: <Project> <BugId>
WORKERS = 2                     # จำนวนบั๊กที่รันพร้อมกัน (RAM 8GB ใช้ 2, 16GB ใช้ 3-4)
TEMPERATURE = 0
MAX_OUTPUT_TOKENS = None        # None = ไม่ส่งเพดาน (ใช้ค่าของเซิร์ฟเวอร์) หรือใส่ตัวเลข เช่น 16000
STREAM = True                   # รับคำตอบแบบ streaming กัน HTTP 504 (gateway timeout)
STREAM_READ_TIMEOUT = 300       # วินาที ถ้าไม่มีข้อมูลเข้ามานานเกินนี้ถือว่าหลุด

# ---- โควต้า ----
PRECHECK_QUOTA = False          # True = เช็คโควต้าคงเหลือก่อนเรียก API (กันโควต้าหมดกลางคำตอบ)
EXPECTED_OUTPUT_TOKENS = 4000   # ใช้ประมาณการเมื่อ PRECHECK_QUOTA = True
CHARS_PER_TOKEN = 3
MAX_PROMPT_TOKENS = None        # None = ไม่ข้ามคลาสใหญ่ หรือใส่ตัวเลข เช่น 60000
WAIT_FOR_RESET = True          # True = โควต้าหมดแล้วรอข้ามวันเอง (ใช้กับ KKU)
RESET_HOUR = 0
RESET_BUFFER_MIN = 10

WORK = Path("work")             # ที่ checkout โค้ดชั่วคราว (ไม่อัปขึ้น GitHub)
SKIP_FAILED_IN_MAIN = True      # True = รันปกติจะข้ามบั๊กที่อยู่ใน failed.csv (ไปแก้ด้วย --retry-failed)
MAX_ATTEMPTS = 3                # --retry-failed จะไม่ลองบั๊กที่ล้มเหลวครบจำนวนนี้แล้ว (กันเสียโควต้าซ้ำ)
CLEANUP = True                  # ลบโค้ดที่ checkout หลังจบแต่ละบั๊ก
CMD_TIMEOUT = 1800
SLEEP_BETWEEN_CALLS = 2

PROMPT = """คุณคือ Java testing engineer ที่เชี่ยวชาญด้าน unit testing และ JUnit 4
เป้าหมาย: เขียนชุดทดสอบ JUnit 4 สำหรับคลาสด้านล่าง เพื่อให้ได้ branch coverage สูงที่สุดเท่าที่เป็นไปได้
และมีโอกาสดักจับข้อบกพร่อง (fault) ในโค้ดได้จริง
ข้อกำหนด:
1. ใช้เฉพาะ JUnit 4 และไลบรารีที่อยู่ใน classpath ต่อไปนี้: {cp.test}
2. ตั้งชื่อคลาสทดสอบเป็น {ClassName}Test และ import คลาสเป้าหมายให้ถูกต้อง
3. ครอบคลุมกรณี: ค่าขอบเขต (boundary), ค่า null/ว่าง, อินพุตผิดรูปแบบ,
และเงื่อนไข if/else, loop ทุกสาขาเท่าที่วิเคราะห์ได้จากซอร์สที่ให้มา
4. ห้ามเดา behavior ที่ไม่มีอยู่ในซอร์สโค้ด หากไม่แน่ใจให้เขียนคอมเมนต์กำกับ
5. หลังโค้ดเทส ให้สรุปเป็นตารางสั้น ๆ ว่าแต่ละเมธอดเทสใด ครอบคลุม Branch/Condition ใด
ซอร์สโค้ดคลาสเป้าหมาย (Defects4J: {project}-{bug_id}b):
```java
{source_code}
```"""

# {cp.test} ใส่อะไร: "names" = เฉพาะชื่อไฟล์ .jar (สั้น ประหยัด token)
#                     "full"  = classpath เต็มจาก defects4j (ยาวมาก เปลือง token)
CP_TEST_MODE = "names"

CSV_FIELDS = ["model", "project", "bug_id", "class_name", "compiled", "coverage", "kills_bug",
              "buggy_failing", "fixed_failing", "error", "test_file", "prompt_chars"]
COVERAGE_METRIC = "line"        # คอลัมน์ coverage ใช้ "line" หรือ "condition" (branch)

# ======================= โฟลเดอร์ =======================
MNAME = MODEL["name"]
OUT_DIR = ROOT / OUTPUT_NAME
PROMPT_DIR = OUT_DIR / "Prompt"
TEST_DIR = OUT_DIR / "TestCode"
RESULT_DIR = OUT_DIR / "Result"
RESULTS_CSV = RESULT_DIR / "results.csv"


# ======================= สถานะร่วมระหว่าง thread =======================
class QuotaExhausted(Exception):
    pass


class FatalAPIError(Exception):
    pass


class RequestTooLarge(Exception):
    pass


class Stopped(Exception):
    pass


class BugError(Exception):
    """error ของบั๊กหนึ่งตัว พร้อมระบุขั้นตอนที่พัง (stage)"""
    def __init__(self, stage, msg):
        super().__init__(msg)
        self.stage = stage


class Pending(Exception):
    """โหมด manual: ยังไม่มีคำตอบจาก chat"""


LOCK = threading.Lock()
STOP = threading.Event()
STATE = {"remaining": None, "exhausted": False, "fatal": None}
PROGRESS = {"n": 0, "total": 0}
FAILED_THIS_RUN = set()
PENDING = set()


def log(msg):
    with LOCK:
        print(msg, flush=True)


def append_csv(path, fields, row):
    with LOCK:
        path.parent.mkdir(parents=True, exist_ok=True)
        new = not path.exists()
        with open(path, "a", newline="", encoding="utf-8") as f:
            w = csv.DictWriter(f, fieldnames=fields)
            if new:
                w.writeheader()
            w.writerow(row)


# ======================= API =======================
# ======================= API key หลายตัว =======================
KEY_LOCK = threading.Lock()
KEYS = None          # รายการ key จากไฟล์ (None = ยังไม่โหลด)
KEY_IDX = -1         # key ที่ใช้อยู่ (-1 = ยังไม่เลือก, None = หมดทุกตัว)


def load_keys():
    global KEYS
    if KEYS is None:
        path = Path(KEYS_FILE)
        keys = []
        if path.exists():
            for line in path.read_text().splitlines():
                k = line.strip().strip('"').strip("'")
                if k and not k.startswith("#") and k not in keys:
                    keys.append(k)
        KEYS = keys
    return KEYS


def key_fp(key):
    return hashlib.sha256(key.encode()).hexdigest()[:12]


def key_mask(key):
    return f"{key[:5]}...{key[-4:]}" if len(key) > 12 else "***"


def quota_day():
    """วันของโควต้า (นับรอบรีเซ็ตตาม RESET_HOUR)"""
    return (datetime.datetime.now() - datetime.timedelta(hours=RESET_HOUR)).date().isoformat()


def read_key_state():
    path = Path(KEY_STATE_FILE)
    if path.exists():
        try:
            return json.loads(path.read_text())
        except json.JSONDecodeError:
            pass
    return {}


def write_key_state(st):
    path = Path(KEY_STATE_FILE)
    tmp = path.with_suffix(".tmp")
    tmp.write_text(json.dumps(st, indent=1))
    os.replace(tmp, path)


def key_status(key, st):
    e = st.get(key_fp(key), {})
    if e.get("invalid"):
        return "invalid"
    if (e.get("exhausted") or {}).get(MNAME) == quota_day():
        return "exhausted"
    return "ok"


def _first_available():
    st = read_key_state()
    for i, k in enumerate(load_keys()):
        if key_status(k, st) == "ok":
            return i
    return None


def pick_key():
    """คืน (ลำดับ key, key) ที่ใช้อยู่; โหมดไม่มีไฟล์ key คืน (None, key จาก env)"""
    global KEY_IDX
    keys = load_keys()
    if not keys:
        env = PROVIDERS[PROVIDER]["key_env"]
        key = os.environ.get(env)
        if not key:
            sys.exit(f"ไม่พบ API key: สร้างไฟล์ {KEYS_FILE} (บรรทัดละ 1 key) "
                     f"หรือรัน  export {env}=\"...\"")
        return None, key
    with KEY_LOCK:
        if KEY_IDX == -1:
            KEY_IDX = _first_available()
            if KEY_IDX is not None:
                log(f"[key] ใช้ key #{KEY_IDX + 1}/{len(keys)} ({key_mask(keys[KEY_IDX])})")
        if KEY_IDX is None:
            raise QuotaExhausted(f"key ทั้ง {len(keys)} ตัวโควต้าหมดหรือใช้ไม่ได้แล้วสำหรับวันนี้")
        return KEY_IDX, keys[KEY_IDX]


def rotate_key(failed_idx, reason, detail=""):
    """ทำเครื่องหมาย key ที่ใช้ไม่ได้ แล้วเลื่อนไปตัวถัดไป คืน True ถ้ายังมี key เหลือ"""
    global KEY_IDX
    keys = load_keys()
    with KEY_LOCK:
        st = read_key_state()
        e = st.setdefault(key_fp(keys[failed_idx]), {})
        if reason == "quota":
            e.setdefault("exhausted", {})[MNAME] = quota_day()
        else:
            e["invalid"] = True
        write_key_state(st)
        if KEY_IDX == failed_idx:          # thread อื่นอาจสลับไปแล้ว ไม่ต้องสลับซ้ำ
            KEY_IDX = _first_available()
            why = "โควต้าหมด" if reason == "quota" else f"ใช้ไม่ได้ ({detail[:60]})"
            nxt = (f"สลับไป key #{KEY_IDX + 1}/{len(keys)} ({key_mask(keys[KEY_IDX])})"
                   if KEY_IDX is not None else "ไม่มี key เหลือแล้ว")
            log(f"[key] key #{failed_idx + 1} ({key_mask(keys[failed_idx])}) {why} -> {nxt}")
        ok = KEY_IDX is not None
    with LOCK:
        STATE["remaining"] = None
    return ok


def reset_key_choice():
    """เรียกหลังโควต้ารีเซ็ต ให้เริ่มเลือก key จากบนสุดใหม่"""
    global KEY_IDX
    with KEY_LOCK:
        KEY_IDX = -1


def api_key():
    return pick_key()[1]


def http_json(method, path, payload=None, timeout=600, key=None):
    url = PROVIDERS[PROVIDER]["base_url"].rstrip("/") + path
    data = json.dumps(payload).encode() if payload is not None else None
    req = urllib.request.Request(url, data=data, method=method, headers={
        "Content-Type": "application/json",
        "Authorization": f"Bearer {key or api_key()}",
    })
    with urllib.request.urlopen(req, timeout=timeout) as r:
        return json.load(r)


class StreamAPIError(Exception):
    """เซิร์ฟเวอร์ส่ง error กลับมากลาง stream"""


def http_stream(path, payload, key=None):
    """เรียก API แบบ streaming (SSE) แล้วประกอบผลให้อยู่ในรูปเดียวกับแบบปกติ"""
    url = PROVIDERS[PROVIDER]["base_url"].rstrip("/") + path
    req = urllib.request.Request(url, data=json.dumps(dict(payload, stream=True)).encode(),
                                 method="POST", headers={
        "Content-Type": "application/json",
        "Accept": "text/event-stream",
        "Authorization": f"Bearer {key or api_key()}",
    })
    content, reasoning = [], []
    finish, usage, quota, first = None, {}, {}, None
    with urllib.request.urlopen(req, timeout=STREAM_READ_TIMEOUT) as r:
        for raw_line in r:
            line = raw_line.decode("utf-8", errors="ignore").strip()
            if not line.startswith("data:"):
                continue
            data = line[5:].strip()
            if data == "[DONE]":
                break
            try:
                chunk = json.loads(data)
            except json.JSONDecodeError:
                continue
            if chunk.get("error"):
                err = chunk["error"]
                raise StreamAPIError(err.get("message") if isinstance(err, dict) else str(err))
            first = first or chunk
            for ch in chunk.get("choices") or []:
                delta = ch.get("delta") or ch.get("message") or {}
                if delta.get("content"):
                    content.append(delta["content"])
                r_txt = delta.get("reasoning") or delta.get("reasoning_content")
                if r_txt:
                    reasoning.append(r_txt)
                if ch.get("finish_reason"):
                    finish = ch["finish_reason"]
            usage = chunk.get("usage") or usage
            quota = chunk.get("model_quota") or quota
    return {
        "id": (first or {}).get("id"), "streamed": True,
        "choices": [{"message": {"role": "assistant", "content": "".join(content),
                                 "reasoning": "".join(reasoning)},
                     "finish_reason": finish}],
        "usage": usage, "model_quota": quota,
    }


def _clean_error_body(body):
    if body.lstrip().startswith("<"):              # หน้า error HTML จาก gateway
        t = re.search(r"<title>(.*?)</title>", body, re.S | re.I)
        return t.group(1).strip() if t else "HTML error page"
    return body


def _is_quota_msg(low):
    return "daily limit" in low or "credit balance" in low or "quota" in low


def call_ai(prompt, label):
    payload = {"model": MODEL["id"], "temperature": TEMPERATURE,
               "messages": [{"role": "user", "content": prompt}]}
    if MAX_OUTPUT_TOKENS:
        payload["max_tokens"] = MAX_OUTPUT_TOKENS
    est = len(prompt) // CHARS_PER_TOKEN + EXPECTED_OUTPUT_TOKENS
    last_err, attempt = None, 0
    while attempt < 6:
        if STOP.is_set():
            raise Stopped()
        idx, key = pick_key()                      # หมดทุก key -> QuotaExhausted

        with LOCK:
            rem = STATE["remaining"]
        if PRECHECK_QUOTA and rem is not None and rem < est:
            if idx is not None and rotate_key(idx, "quota"):
                continue
            raise QuotaExhausted(f"เหลือ {rem} token แต่คาดว่าต้องใช้ ~{est}")

        wait = 20 * (attempt + 1)
        try:
            if STREAM:
                data = http_stream("/chat/completions", payload, key=key)
            else:
                data = http_json("POST", "/chat/completions", payload, key=key)
        except urllib.error.HTTPError as e:
            body = _clean_error_body(e.read().decode(errors="ignore").strip())
            low = body.lower()
            if _is_quota_msg(low):
                if idx is not None and rotate_key(idx, "quota"):
                    continue                        # ลองคำขอเดิมด้วย key ถัดไปทันที
                with LOCK:
                    STATE["remaining"] = 0
                raise QuotaExhausted(body[:200])
            if e.code in (401, 403):
                if "model" in low:                  # model id ผิด: เปลี่ยน key ไม่ช่วย
                    raise FatalAPIError(f"HTTP {e.code}: {body[:200]}")
                if idx is not None and rotate_key(idx, "invalid", body):
                    continue
                raise FatalAPIError(f"HTTP {e.code}: {body[:200]}")
            if e.code in (400, 413):
                raise RequestTooLarge(f"HTTP {e.code}: {body[:200]}")
            if e.code in (502, 503, 504):
                wait = 30 * (attempt + 1)           # เซิร์ฟเวอร์ช้าหรือไม่ว่าง
            if e.code == 429:
                wait = 60 * (attempt + 1)           # rate limit: รอนานขึ้น
            last_err = f"HTTP {e.code}: {body[:150]}"
        except StreamAPIError as e:
            low = str(e).lower()
            if _is_quota_msg(low):
                if idx is not None and rotate_key(idx, "quota"):
                    continue
                with LOCK:
                    STATE["remaining"] = 0
                raise QuotaExhausted(str(e)[:200])
            last_err = f"stream error: {str(e)[:150]}"
        except (urllib.error.URLError, TimeoutError, OSError) as e:
            last_err = str(e)
        else:
            quota = data.get("model_quota") or {}
            usage = data.get("usage") or {}
            with LOCK:
                if quota.get("daily_remaining_tokens") is not None:
                    STATE["remaining"] = int(quota["daily_remaining_tokens"])
            append_csv(RESULT_DIR / "token_usage.csv",
                       ["time", "model", "label", "prompt_tokens", "completion_tokens",
                        "daily_remaining_tokens"],
                       {"time": datetime.datetime.now().isoformat(timespec="seconds"),
                        "model": MNAME,
                        "label": label + (f" @key{idx + 1}" if idx is not None else ""),
                        "prompt_tokens": usage.get("prompt_tokens"),
                        "completion_tokens": usage.get("completion_tokens"),
                        "daily_remaining_tokens": quota.get("daily_remaining_tokens")})
            choice = data["choices"][0]
            msg = choice.get("message") or {}
            content = msg.get("content") or ""
            if isinstance(content, list):          # บางโมเดลตอบเป็นรายการ block
                content = "".join(b.get("text", "") for b in content if isinstance(b, dict))
            return content, usage, choice.get("finish_reason"), data
        attempt += 1
        log(f"      API error ({last_err}) ลองใหม่ใน {wait}s")
        time.sleep(wait)
    raise RuntimeError(f"API ล้มเหลวหลังลองซ้ำ: {last_err}")


# ======================= Defects4J =======================
def sh(cmd, cwd=None):
    try:
        p = subprocess.run(cmd, cwd=cwd, capture_output=True, text=True, timeout=CMD_TIMEOUT)
        return p.returncode, p.stdout, p.stderr
    except subprocess.TimeoutExpired:
        return -1, "", "TIMEOUT"


def checkout(proj, bid, ver):
    d = WORK / f"{proj}_{bid}{ver}"
    shutil.rmtree(d, ignore_errors=True)
    rc, out, err = sh(["defects4j", "checkout", "-p", proj, "-v", f"{bid}{ver}", "-w", str(d)])
    if rc != 0:
        raise RuntimeError(f"checkout {proj}-{bid}{ver} ไม่สำเร็จ: {err[-300:]}")
    return d


def export(d, prop):
    rc, out, err = sh(["defects4j", "export", "-p", prop], cwd=d)
    if rc != 0:
        raise RuntimeError(f"export {prop} ไม่สำเร็จ: {err[-300:]}")
    return out.strip()


def parse_failing(d):
    f = d / "failing_tests"
    if not f.exists():
        return set()
    return {line[4:].strip() for line in f.read_text(errors="ignore").splitlines()
            if line.startswith("--- ")}


def run_tests(d, archive, log_path):
    (d / "failing_tests").unlink(missing_ok=True)
    rc, out, err = sh(["defects4j", "test", "-w", str(d), "-s", str(archive.resolve())])
    log_path.write_text(out + "\n" + err)
    ok = rc == 0 and re.search(r"Failing tests:\s*\d+", out + err) is not None
    return ok, (parse_failing(d) if ok else set())


def coverage(d, archive, log_path, cls):
    """วัด coverage เฉพาะคลาสเป้าหมาย คืน % ตาม COVERAGE_METRIC"""
    inst = log_path.with_suffix(".classes.txt")
    inst.write_text(cls + "\n")
    rc, out, err = sh(["defects4j", "coverage", "-w", str(d), "-s", str(archive.resolve()),
                       "-i", str(inst.resolve())])
    text = out + "\n" + err
    log_path.write_text(text)
    label = "Line" if COVERAGE_METRIC == "line" else "Condition"
    m = re.search(label + r" coverage:\s*([\d.]+)%", text)
    return float(m.group(1)) if m else None


def extract_java(text):
    blocks = re.findall(r"```(?:java)?[ \t]*\r?\n(.*?)```", text, re.S | re.I)
    blocks = [b for b in blocks if "@Test" in b] or blocks   # เลือกบล็อกที่เป็นเทสต์
    if blocks:
        return max(blocks, key=len)
    m = re.search(r"```(?:java)?[ \t]*\r?\n(.*)", text, re.S | re.I)   # คำตอบถูกตัดกลางคัน
    return m.group(1) if m else text


# ======================= งานต่อบั๊ก =======================
def build_prompts(proj, bid, bdir):
    """คืน (classes, src_dir, [(cls, pkg, name, source, prompt), ...])"""
    classes = [c for c in re.split(r"[,;\s]+", export(bdir, "classes.modified")) if c]
    src_dir = export(bdir, "dir.src.classes")
    cp_full = export(bdir, "cp.test")
    if CP_TEST_MODE == "full":
        cp_text = cp_full
    else:
        jars = sorted({Path(x).name for x in cp_full.split(":") if x.endswith(".jar")})
        cp_text = ", ".join(jars) if jars else "JUnit 4"
    items = []
    for cls in classes:
        pkg, _, name = cls.rpartition(".")
        source = (bdir / src_dir / (cls.replace(".", "/") + ".java")).read_text(errors="ignore")
        prompt = (PROMPT.replace("{cp.test}", cp_text)
                        .replace("{ClassName}", name)
                        .replace("{project}", proj)
                        .replace("{bug_id}", bid)
                        .replace("{source_code}", source))   # ใส่ซอร์สเป็นลำดับสุดท้าย
        items.append((cls, pkg, name, source, prompt))
    return classes, src_dir, items


def has_response(rdir, name):
    f = rdir / f"{name}.response.md"
    return f.exists() and f.stat().st_size > 0


def manual_ready(proj, bid):
    prompts = list((PROMPT_DIR / proj / bid).glob("*.prompt.txt"))
    rdir = RESULT_DIR / proj / bid / MNAME
    return bool(prompts) and all(
        has_response(rdir, p.name[:-len(".prompt.txt")]) for p in prompts)


def process_bug(proj, bid):
    """สร้างเทสต์ให้ทุกคลาสที่มีบั๊ก แล้ววัดผลทีละคลาส คืนรายการแถวผลลัพธ์"""
    pdir = PROMPT_DIR / proj / bid
    tdir = TEST_DIR / proj / bid / MNAME
    rdir = RESULT_DIR / proj / bid / MNAME
    for d in (pdir, rdir):
        d.mkdir(parents=True, exist_ok=True)
    shutil.rmtree(tdir, ignore_errors=True)
    tdir.mkdir(parents=True)

    bdir = fdir = None
    try:
        try:
            bdir = checkout(proj, bid, "b")
            classes, src_dir, items = build_prompts(proj, bid, bdir)
        except Exception as e:
            raise BugError("setup", str(e)) from e

        # ---- ขั้นที่ 1: ขอเทสต์จาก AI ทุกคลาส ----
        gens = []
        for cls, pkg, name, source, prompt in items:
            (pdir / f"{name}.prompt.txt").write_text(prompt)
            g = {"cls": cls, "name": name, "prompt_chars": len(prompt),
                 "test_path": None, "error": ""}
            gens.append(g)

            resp_file = rdir / f"{name}.response.md"
            meta_file = rdir / f"{name}.meta.json"
            if has_response(rdir, name):
                answer = resp_file.read_text()
                meta = json.loads(meta_file.read_text()) if meta_file.exists() else {}
            elif PROVIDER == "manual":
                raise Pending(f"ยังไม่มีคำตอบของ {name}")
            else:
                est = len(prompt) // CHARS_PER_TOKEN
                if MAX_PROMPT_TOKENS and est > MAX_PROMPT_TOKENS:
                    g["error"] = f"skipped: prompt too large (~{est} tokens)"
                    continue
                try:
                    answer, usage, finish, raw = call_ai(prompt, f"{proj}-{bid}/{name}")
                except (QuotaExhausted, FatalAPIError, Stopped):
                    raise
                except RuntimeError as e:
                    raise BugError("api", str(e)) from e
                except RequestTooLarge as e:
                    g["error"] = f"skipped: request rejected ({e})"
                    continue
                (rdir / f"{name}.raw.json").write_text(json.dumps(raw, ensure_ascii=False, indent=1))
                if not answer.strip():
                    # คำตอบว่าง: ไม่บันทึกผล รันใหม่จะเรียก API อีกครั้ง
                    msg = (raw.get("choices") or [{}])[0].get("message") or {}
                    has_reason = bool(msg.get("reasoning") or msg.get("reasoning_content"))
                    raise BugError("empty_response", f"AI ตอบกลับว่าง ({name}, finish_reason={finish}, "
                                       f"completion_tokens={usage.get('completion_tokens')}, "
                                       f"มีส่วน reasoning={has_reason}) ดู {name}.raw.json")
                meta = {"usage": usage, "finish_reason": finish}
                resp_file.write_text(answer)
                meta_file.write_text(json.dumps(meta))
                time.sleep(SLEEP_BETWEEN_CALLS)

            code = extract_java(answer)
            if not re.search(r"@Test\b", code):
                g["error"] = "no test code in response"
                if meta.get("finish_reason") == "length":
                    g["error"] += " (answer truncated)"
                continue
            pkg_dir = pkg.replace(".", "/")
            if pkg and not re.search(r"^\s*package\s+[\w.]+\s*;", code, re.M):
                code = f"package {pkg};\n\n" + code   # AI ไม่ใส่ package: เติมให้ตรงกับโฟลเดอร์
            cm = re.search(r"public\s+(?:final\s+)?class\s+(\w+)", code)
            test_name = cm.group(1) if cm else f"{name}Test"
            path = tdir / pkg_dir / f"{test_name}.java"
            path.parent.mkdir(parents=True, exist_ok=True)
            path.write_text(code)
            g["test_path"] = path

        # ---- ขั้นที่ 2: รันเทสต์และวัดผลทีละคลาส ----
        rows = []
        for g in gens:
            row = {"model": MNAME, "project": proj, "bug_id": bid, "class_name": g["cls"],
                   "compiled": False, "coverage": "", "kills_bug": False,
                   "buggy_failing": "", "fixed_failing": "", "error": g["error"],
                   "test_file": str(g["test_path"]) if g["test_path"] else "",
                   "prompt_chars": g["prompt_chars"]}
            if g["test_path"]:
                name = g["name"]
                archive = rdir / f"{name}.tests.tar.bz2"
                with tarfile.open(archive, "w:bz2") as t:
                    t.add(g["test_path"], arcname=str(g["test_path"].relative_to(tdir)))
                comp_b, fail_b = run_tests(bdir, archive, rdir / f"{name}.test_buggy.log")
                row["compiled"] = comp_b
                if not comp_b:
                    row["error"] = f"compile/run failed on buggy (ดู {name}.test_buggy.log)"
                else:
                    row["buggy_failing"] = len(fail_b)
                    row["coverage"] = coverage(bdir, archive, rdir / f"{name}.coverage.log", g["cls"])
                    if row["coverage"] is None:
                        row["coverage"] = ""
                        row["error"] = f"coverage failed (ดู {name}.coverage.log)"
                    if fdir is None:
                        try:
                            fdir = checkout(proj, bid, "f")
                        except Exception as e:
                            raise BugError("setup", str(e)) from e
                    comp_f, fail_f = run_tests(fdir, archive, rdir / f"{name}.test_fixed.log")
                    if comp_f:
                        row["fixed_failing"] = len(fail_f)
                        row["kills_bug"] = len(fail_b - fail_f) > 0
                    else:
                        row["error"] = f"compile failed on fixed (ดู {name}.test_fixed.log)"
            rows.append(row)

        for row in rows:
            append_csv(RESULTS_CSV, CSV_FIELDS, row)
        return rows
    finally:
        if CLEANUP:
            for d in (bdir, fdir):
                if d:
                    shutil.rmtree(d, ignore_errors=True)


FAILED_FIELDS = ["model", "project", "bug_id", "stage", "error", "attempts",
                 "first_failed", "last_failed"]


def failed_path():
    return RESULT_DIR / "failed.csv"


def load_failed():
    """คืน dict (model, project, bug_id) -> แถว จาก failed.csv"""
    path = failed_path()
    if not path.exists():
        return {}
    with open(path, newline="", encoding="utf-8") as f:
        return {(r["model"], r["project"], r["bug_id"]): r for r in csv.DictReader(f)}


def _write_failed(rows):
    path = failed_path()
    path.parent.mkdir(parents=True, exist_ok=True)
    tmp = path.with_suffix(".tmp")
    with open(tmp, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=FAILED_FIELDS)
        w.writeheader()
        w.writerows(sorted(rows.values(), key=lambda r: (r["model"], r["project"],
                                                         int(r["bug_id"]) if r["bug_id"].isdigit() else 0)))
    os.replace(tmp, path)          # เขียนแบบ atomic ไฟล์ไม่เสียแม้เครื่องดับกลางทาง


def record_failure(proj, bid, stage, err):
    now = datetime.datetime.now().isoformat(timespec="seconds")
    with LOCK:
        rows = load_failed()
        key = (MNAME, proj, bid)
        old = rows.get(key)
        rows[key] = {"model": MNAME, "project": proj, "bug_id": bid, "stage": stage,
                     "error": str(err)[:500].replace("\n", " "),
                     "attempts": int(old["attempts"]) + 1 if old else 1,
                     "first_failed": old["first_failed"] if old else now, "last_failed": now}
        _write_failed(rows)


def clear_failure(proj, bid):
    with LOCK:
        rows = load_failed()
        if rows.pop((MNAME, proj, bid), None) is not None:
            _write_failed(rows)


def worker(bug):
    proj, bid = bug
    if STOP.is_set():
        return
    if PROVIDER == "manual" and not manual_ready(proj, bid):
        with LOCK:
            PENDING.add(bug)
        return
    try:
        rows = process_bug(proj, bid)
        clear_failure(proj, bid)
        with LOCK:
            PROGRESS["n"] += 1
            n, total, rem = PROGRESS["n"], PROGRESS["total"], STATE["remaining"]
        for r in rows:
            short = r["class_name"].rsplit(".", 1)[-1]
            log(f"[{n}/{total}] {MNAME} {proj}-{bid} {short}: compiled={r['compiled']} "
                f"coverage={r['coverage']} kills_bug={r['kills_bug']}"
                + (f" error={r['error']}" if r["error"] else "")
                + f" (โควต้าเหลือ {rem if rem is not None else '-'})")
    except Stopped:
        pass
    except Pending:
        with LOCK:
            PENDING.add(bug)
    except QuotaExhausted as e:
        with LOCK:
            STATE["exhausted"] = True
        STOP.set()
        log(f"[quota] โควต้าหมด ({e}) กำลังหยุดงานที่เหลือ...")
    except FatalAPIError as e:
        with LOCK:
            STATE["fatal"] = str(e)
        STOP.set()
        log(f"[error] API ใช้งานไม่ได้: {e}")
    except Exception as e:
        stage = e.stage if isinstance(e, BugError) else "other"
        with LOCK:
            FAILED_THIS_RUN.add(bug)
        record_failure(proj, bid, stage, e)
        append_csv(RESULT_DIR / "errors.csv", ["time", "model", "project", "bug", "stage", "error"],
                   {"time": datetime.datetime.now().isoformat(timespec="seconds"), "model": MNAME,
                    "project": proj, "bug": bid, "stage": stage, "error": str(e)[:500]})
        log(f"[error:{stage}] {MNAME} {proj}-{bid}: {e}")


# ======================= คำสั่งหลัก =======================
def load_bugs():
    bugs = []
    for line in Path(BUGS_FILE).read_text().splitlines():
        line = line.split("#")[0].strip()
        if line:
            proj, bid = line.split()[:2]
            bugs.append((proj, bid))
    return bugs


def read_results():
    if not RESULTS_CSV.exists():
        return []
    with open(RESULTS_CSV, newline="", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        if "model" not in (reader.fieldnames or []):
            sys.exit(f"{RESULTS_CSV} เป็นรูปแบบเก่า ให้เปลี่ยนชื่อไฟล์ก่อน เช่น\n"
                     f"  mv {RESULTS_CSV} {RESULTS_CSV.with_name('results_old.csv')}")
        return list(reader)


def load_done():
    """บั๊กที่โมเดลปัจจุบันทำเสร็จแล้ว"""
    return {(r["project"], r["bug_id"]) for r in read_results() if r["model"] == MNAME}


def sleep_until_reset():
    now = datetime.datetime.now()
    target = now.replace(hour=RESET_HOUR, minute=0, second=0, microsecond=0)
    if target <= now:
        target += datetime.timedelta(days=1)
    target += datetime.timedelta(minutes=RESET_BUFFER_MIN)
    log(f"[quota] รอถึง {target:%Y-%m-%d %H:%M} แล้วทำต่อ (Ctrl+C เพื่อหยุด)")
    while datetime.datetime.now() < target:
        time.sleep(60)
    reset_key_choice()


def prepare_dirs():
    WORK.mkdir(exist_ok=True)
    for d in (PROMPT_DIR, TEST_DIR, RESULT_DIR):
        d.mkdir(parents=True, exist_ok=True)
    (PROMPT_DIR / "prompt_template.txt").write_text(PROMPT)
    (OUT_DIR / f"config_{MNAME}.json").write_text(json.dumps({
        "provider": PROVIDER, "model": MODEL, "temperature": TEMPERATURE,
        "max_output_tokens": MAX_OUTPUT_TOKENS, "workers": WORKERS,
        "cp_test_mode": CP_TEST_MODE, "coverage_metric": COVERAGE_METRIC}, indent=2))


def run_bugs(bugs, skip_failed):
    """รันรายการบั๊ก (ใช้ทั้งรันปกติและ --retry-failed) คืน True ถ้าจบโดยไม่ติดโควต้า/error ร้ายแรง"""
    while True:
        done = load_done()
        failed = {(p, b) for (m, p, b) in load_failed() if m == MNAME} if skip_failed else set()
        todo = [b for b in bugs if b not in done and b not in FAILED_THIS_RUN and b not in failed]
        if not todo:
            return True
        PROGRESS["n"], PROGRESS["total"] = 0, len(todo)
        STOP.clear()
        STATE.update({"exhausted": False, "remaining": None})
        log(f"[{MNAME}] เหลือ {len(todo)} บั๊ก (เสร็จแล้ว {len(done)}"
            + (f", ข้ามที่อยู่ใน failed.csv {len(failed)}" if failed else "")
            + f") รันพร้อมกัน {WORKERS} ตัว")
        with ThreadPoolExecutor(max_workers=WORKERS) as ex:
            list(ex.map(worker, todo))

        if STATE["fatal"]:
            log("\nหยุดเพราะ API ใช้งานไม่ได้ ตรวจสอบ key และ MODEL id แล้วรันใหม่")
            return False
        if STATE["exhausted"]:
            if WAIT_FOR_RESET:
                sleep_until_reset()
                continue
            log("\n[quota] โควต้าหมด รันคำสั่งเดิมอีกครั้งหลังโควต้ารีเซ็ต สคริปต์จะทำต่อจากจุดนี้")
            return False
        return True


def report_failures():
    mine = [r for (m, _, _), r in load_failed().items() if m == MNAME]
    if mine:
        by_stage = {}
        for r in mine:
            by_stage[r["stage"]] = by_stage.get(r["stage"], 0) + 1
        me = Path(sys.argv[0]).name
        log(f"มี {len(mine)} บั๊กใน failed.csv ({', '.join(f'{k} {v}' for k, v in by_stage.items())}) "
            f"แก้ด้วย  python3 {me} --retry-failed")


def run():
    prepare_dirs()
    bugs = load_bugs()
    if not run_bugs(bugs, skip_failed=SKIP_FAILED_IN_MAIN):
        return
    done = load_done()
    log(f"\nเสร็จ {len([b for b in bugs if b in done])}/{len(bugs)} บั๊ก")
    if PROVIDER == "manual" and PENDING:
        log(f"รอคำตอบจาก chat อีก {len(PENDING)} บั๊ก ดูรายการด้วย  python3 {Path(sys.argv[0]).name} --next")
    report_failures()
    summary()


def cmd_failed():
    rows = sorted(load_failed().values(), key=lambda r: (r["model"], r["stage"], r["project"]))
    if not rows:
        print("ไม่มีบั๊กที่ error ค้างอยู่")
        return
    counts = {}
    for r in rows:
        counts[(r["model"], r["stage"])] = counts.get((r["model"], r["stage"]), 0) + 1
    print(f"{'model':<20}{'stage':<16}{'จำนวน':>6}")
    for (m, st), n in sorted(counts.items()):
        print(f"{m:<20}{st:<16}{n:>6}")
    print(f"\n{'model':<14}{'bug':<18}{'stage':<16}{'ครั้ง':>5}  error")
    for r in rows[:30]:
        print(f"{r['model']:<14}{r['project'] + '-' + r['bug_id']:<18}{r['stage']:<16}"
              f"{r['attempts']:>5}  {r['error'][:70]}")
    if len(rows) > 30:
        print(f"... และอีก {len(rows) - 30} รายการ ดูทั้งหมดที่ {failed_path()}")


def cmd_retry_failed():
    """รันแก้เฉพาะบั๊กใน failed.csv ของโมเดลปัจจุบัน"""
    stage = sys.argv[2] if len(sys.argv) > 2 else None
    prepare_dirs()
    done = load_done()
    rows = [r for (m, _, _), r in load_failed().items() if m == MNAME]
    for r in rows:                      # บั๊กที่ได้ผลแล้วจากทางอื่น: ล้างออก
        if (r["project"], r["bug_id"]) in done:
            clear_failure(r["project"], r["bug_id"])
    rows = [r for r in rows if (r["project"], r["bug_id"]) not in done
            and (stage is None or r["stage"] == stage)]
    give_up = [r for r in rows if int(r["attempts"]) >= MAX_ATTEMPTS]
    rows = [r for r in rows if int(r["attempts"]) < MAX_ATTEMPTS]
    # setup/api ก่อน (มักหายเองเมื่อลองใหม่) แล้วตามด้วยอย่างอื่น
    order = {"api": 0, "setup": 1, "empty_response": 2, "other": 3}
    rows.sort(key=lambda r: (order.get(r["stage"], 9), r["project"]))
    if give_up:
        log(f"ข้าม {len(give_up)} บั๊กที่ล้มเหลวครบ {MAX_ATTEMPTS} ครั้งแล้ว (ดู --failed / เพิ่ม MAX_ATTEMPTS ถ้าต้องการลองอีก)")
    if not rows:
        log("ไม่มีบั๊กที่ต้องลองใหม่")
        return
    bugs = [(r["project"], r["bug_id"]) for r in rows]
    ok = run_bugs(bugs, skip_failed=False)
    fixed = len([b for b in bugs if b in load_done()])
    log(f"\nแก้สำเร็จ {fixed}/{len(bugs)} บั๊ก")
    if ok:
        report_failures()


def summary():
    rows = read_results()
    if not rows:
        print("ยังไม่มีผลลัพธ์")
        return
    cov_key = f"avg_{COVERAGE_METRIC}_coverage_%"

    def agg(model, name, rs):
        bugs = {(r["project"], r["bug_id"]) for r in rs}
        killed = {(r["project"], r["bug_id"]) for r in rs if r["kills_bug"] == "True"}
        comp = [r for r in rs if r["compiled"] == "True"]
        cov = [float(r["coverage"]) for r in comp if r["coverage"] not in ("", "None")]
        return {"model": model, "project": name, "bugs": len(bugs), "classes": len(rs),
                "compile_rate_%": round(100 * len(comp) / len(rs), 1) if rs else "",
                "bugs_killed": len(killed),
                "fault_detection_rate_%": round(100 * len(killed) / len(bugs), 1) if bugs else "",
                cov_key: round(sum(cov) / len(cov), 2) if cov else ""}

    out = []
    for model in sorted({r["model"] for r in rows}):
        mrows = [r for r in rows if r["model"] == model]
        for p in sorted({r["project"] for r in mrows}):
            out.append(agg(model, p, [r for r in mrows if r["project"] == p]))
        out.append(agg(model, "ALL", mrows))
    path = RESULT_DIR / "summary_by_project.csv"
    with open(path, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=list(out[0].keys()))
        w.writeheader()
        w.writerows(out)
    print(f"\n{'model':<20}{'project':<16}{'bugs':>6}{'compile%':>10}{'killed':>8}{'detect%':>9}{'cov%':>8}")
    last = None
    for r in out:
        if last and r["model"] != last:
            print()
        last = r["model"]
        print(f"{r['model']:<20}{r['project']:<16}{r['bugs']:>6}{r['compile_rate_%']!s:>10}"
              f"{r['bugs_killed']:>8}{r['fault_detection_rate_%']!s:>9}{r[cov_key]!s:>8}")
    print(f"\nบันทึกที่ {path}")


def cmd_merge():
    """ย้ายผลจากโฟลเดอร์แยกโมเดลแบบเดิม (<Model>/Prompt, TestCode, Result) เข้ามารวม"""
    if len(sys.argv) < 4:
        sys.exit("ใช้แบบนี้: --merge <โฟลเดอร์เก่า> <ชื่อโมเดล>   เช่น  --merge Gemini Gemini")
    old, model = Path(sys.argv[2]), sys.argv[3]
    old_csv = old / "Result" / "results.csv"
    if not old_csv.exists():
        sys.exit(f"ไม่พบ {old_csv}")
    with open(old_csv, newline="", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        if "bug_id" not in (reader.fieldnames or []):
            sys.exit(f"{old_csv} เป็นรูปแบบเก่ามาก (ไม่มีคอลัมน์ bug_id) ย้ายไม่ได้ ต้องรันใหม่")
        old_rows = list(reader)
    existing = {(r["model"], r["project"], r["bug_id"]) for r in read_results()}
    for d in (PROMPT_DIR, TEST_DIR, RESULT_DIR):
        d.mkdir(parents=True, exist_ok=True)

    added = skipped = 0
    for r in old_rows:
        proj, bid = r["project"], r["bug_id"]
        if (model, proj, bid) in existing:
            skipped += 1
            continue
        new_t = TEST_DIR / proj / bid / model
        old_t = old / "TestCode" / proj / bid
        if old_t.exists() and not new_t.exists():
            shutil.copytree(old_t, new_t)
        test_file = r.get("test_file", "")
        if test_file:
            rel = Path(test_file)
            parts = rel.parts
            if "TestCode" in parts:   # .../TestCode/<proj>/<bug>/<pkg...>/X.java
                k = parts.index("TestCode")
                rel_pkg = Path(*parts[k + 3:])
                test_file = str(new_t / rel_pkg)
        row = {k: r.get(k, "") for k in CSV_FIELDS}
        row.update(model=model, test_file=test_file)
        append_csv(RESULTS_CSV, CSV_FIELDS, row)
        added += 1

    # คำตอบดิบ, log และพรอมพ์ (รวมบั๊กที่ยังไม่เสร็จ เพื่อไม่เสีย token ซ้ำ)
    for bug_dir in (old / "Result").glob("*/*"):
        if bug_dir.is_dir():
            dst = RESULT_DIR / bug_dir.parent.name / bug_dir.name / model
            dst.mkdir(parents=True, exist_ok=True)
            for fpath in bug_dir.iterdir():
                if fpath.is_file() and not (dst / fpath.name).exists():
                    shutil.copy2(fpath, dst / fpath.name)
    for bug_dir in (old / "Prompt").glob("*/*"):
        if bug_dir.is_dir():
            dst = PROMPT_DIR / bug_dir.parent.name / bug_dir.name
            dst.mkdir(parents=True, exist_ok=True)
            for fpath in bug_dir.iterdir():
                if fpath.is_file() and not (dst / fpath.name).exists():
                    shutil.copy2(fpath, dst / fpath.name)
    print(f"ย้าย {model}: เพิ่ม {added} แถว, ข้าม {skipped} แถวที่มีอยู่แล้ว")
    print(f"ตรวจผลแล้วค่อยลบโฟลเดอร์เก่า {old}/ เมื่อแน่ใจ")


def make_bugs():
    rc, out, err = sh(["defects4j", "pids"])
    if rc != 0:
        sys.exit(f"เรียก defects4j ไม่ได้: {err}")
    lines = []
    for p in out.split():
        rc, bids, err = sh(["defects4j", "bids", "-p", p])
        ids = bids.split()
        lines += [f"{p} {b}" for b in ids]
        print(f"{p:<16}{len(ids):>4} บั๊ก")
    Path(BUGS_FILE).write_text("\n".join(lines) + "\n")
    print(f"รวม {len(lines)} บั๊ก บันทึกที่ {BUGS_FILE}")


def cmd_prepare():
    """โหมด manual: สร้างไฟล์พรอมพ์ให้ทุกบั๊กที่ยังไม่เสร็จ (ไม่เรียก API)"""
    WORK.mkdir(exist_ok=True)
    (PROMPT_DIR).mkdir(parents=True, exist_ok=True)
    (PROMPT_DIR / "prompt_template.txt").write_text(PROMPT)
    limit = int(sys.argv[2]) if len(sys.argv) > 2 else None
    done = load_done()
    todo = [b for b in load_bugs()
            if b not in done and not list((PROMPT_DIR / b[0] / b[1]).glob("*.prompt.txt"))]
    if limit:
        todo = todo[:limit]
    print(f"กำลังเตรียมพรอมพ์ {len(todo)} บั๊ก")
    for i, (proj, bid) in enumerate(todo, 1):
        bdir = None
        try:
            bdir = checkout(proj, bid, "b")
            _, _, items = build_prompts(proj, bid, bdir)
            pdir = PROMPT_DIR / proj / bid
            pdir.mkdir(parents=True, exist_ok=True)
            for cls, pkg, name, source, prompt in items:
                (pdir / f"{name}.prompt.txt").write_text(prompt)
            print(f"[{i}/{len(todo)}] {proj}-{bid}: {', '.join(x[2] for x in items)}")
        except Exception as e:
            print(f"[{i}/{len(todo)}] {proj}-{bid}: ERROR {e}")
        finally:
            if bdir:
                shutil.rmtree(bdir, ignore_errors=True)
    print(f"\nเสร็จ ดูรายการที่ต้องทำด้วย  python3 {Path(sys.argv[0]).name} --next")


def cmd_next():
    """แสดงพรอมพ์ที่ยังไม่มีคำตอบ"""
    n = int(sys.argv[2]) if len(sys.argv) > 2 else 5
    done = load_done()
    pending, unprepared = [], 0
    for proj, bid in load_bugs():
        if (proj, bid) in done:
            continue
        prompts = sorted((PROMPT_DIR / proj / bid).glob("*.prompt.txt"))
        if not prompts:
            unprepared += 1
            continue
        rdir = RESULT_DIR / proj / bid / MNAME
        for p in prompts:
            name = p.name[:-len(".prompt.txt")]
            if not has_response(rdir, name):
                pending.append((proj, bid, name, p))
    me = Path(sys.argv[0]).name
    print(f"รอคำตอบ {len(pending)} ไฟล์ | ยังไม่ได้เตรียมพรอมพ์ {unprepared} บั๊ก\n")
    for proj, bid, name, p in pending[:n]:
        print(f"{proj}-{bid} {name}")
        print(f"  พรอมพ์: {p}")
        print(f"  บันทึกคำตอบ: python3 {me} --save {proj} {bid} {name}\n")
    if unprepared:
        print(f"เตรียมพรอมพ์เพิ่มด้วย  python3 {me} --prepare 20")


def cmd_save():
    """บันทึกคำตอบจาก chat: วางข้อความแล้วกด Ctrl+D"""
    if len(sys.argv) < 5:
        sys.exit("ใช้แบบนี้: --save <Project> <BugId> <ClassName>  เช่น  --save Lang 1 NumberUtils")
    proj, bid, name = sys.argv[2:5]
    if not (PROMPT_DIR / proj / bid / f"{name}.prompt.txt").exists():
        sys.exit(f"ไม่พบพรอมพ์ของ {proj}-{bid} {name} ตรวจชื่อให้ตรงกับที่ --next แสดง")
    print("วางคำตอบจาก Claude chat ทั้งหมด แล้วกด Enter ตามด้วย Ctrl+D")
    text = sys.stdin.read().strip()
    if not text:
        sys.exit("ไม่มีข้อความ ไม่ได้บันทึก")
    rdir = RESULT_DIR / proj / bid / MNAME
    rdir.mkdir(parents=True, exist_ok=True)
    (rdir / f"{name}.response.md").write_text(text + "\n")
    (rdir / f"{name}.meta.json").write_text(json.dumps(
        {"usage": {}, "finish_reason": None, "source": "manual",
         "saved": datetime.datetime.now().isoformat(timespec="seconds")}))
    warn = "" if "```" in text or "@Test" in text else "  (คำเตือน: ไม่พบโค้ดเทสต์ในข้อความ)"
    print(f"\nบันทึกแล้ว {rdir / (name + '.response.md')} ({len(text)} ตัวอักษร){warn}")


def cmd_reset():
    """ลบผลของบั๊กหนึ่งตัว (เฉพาะโมเดลปัจจุบัน) เพื่อรันใหม่ตั้งแต่เรียก AI"""
    if len(sys.argv) < 4:
        sys.exit("ใช้แบบนี้: --reset <Project> <BugId>   เช่น  --reset Chart 1")
    proj, bid = sys.argv[2], sys.argv[3]
    rows = read_results()
    keep = [r for r in rows if not (r["model"] == MNAME and r["project"] == proj
                                    and r["bug_id"] == bid)]
    if RESULTS_CSV.exists():
        with open(RESULTS_CSV, "w", newline="", encoding="utf-8") as f:
            w = csv.DictWriter(f, fieldnames=CSV_FIELDS)
            w.writeheader()
            w.writerows(keep)
    shutil.rmtree(TEST_DIR / proj / bid / MNAME, ignore_errors=True)
    shutil.rmtree(RESULT_DIR / proj / bid / MNAME, ignore_errors=True)
    print(f"ลบผล {MNAME} ของ {proj}-{bid} แล้ว ({len(rows) - len(keep)} แถว) รันใหม่จะเรียก AI อีกครั้ง")


def explain_http_error(e):
    body = e.read().decode(errors="ignore").strip()
    t = re.search(r"<title>(.*?)</title>", body, re.S | re.I) if body.startswith("<") else None
    msg = t.group(1).strip() if t else body[:300]
    low = msg.lower()
    print(f"HTTP {e.code}: {msg}")
    if "invalid api key" in low:
        print("-> API key ไม่ถูกต้อง: สร้าง key ใหม่ที่ API Platform แล้วแก้ใน ~/.bashrc จากนั้นรัน source ~/.bashrc")
    elif "invalid model" in low:
        print("-> model id ไม่ถูกต้อง: ดู id ด้วย --models แล้วแก้ MODEL ในสคริปต์")
    elif "daily limit" in low:
        print("-> โควต้าวันนี้หมดแล้ว รอรีเซ็ตวันถัดไป หรือขอเพิ่มโควต้า")
    elif e.code in (502, 503, 504):
        print("-> เซิร์ฟเวอร์ไม่ว่างหรือช้า ลองใหม่ภายหลัง")


def cmd_models():
    try:
        data = http_json("GET", "/models")
    except urllib.error.HTTPError as e:
        return explain_http_error(e)
    for x in data.get("data", []):
        print(f"{x.get('id')!s:<5} {x.get('owned_by') or x.get('display_name') or ''}")


def cmd_quota():
    keys = load_keys()
    targets = list(enumerate(keys)) if keys else [(None, api_key())]
    st = read_key_state()
    for i, k in targets:
        tag = f"key #{i + 1} ({key_mask(k)})" if i is not None else "KKU_API_KEY"
        mark = key_status(k, st) if i is not None else "ok"
        try:
            data = http_json("POST", "/chat/completions", {
                "model": MODEL["id"], "max_tokens": 5,
                "messages": [{"role": "user", "content": "hi"}]}, timeout=120, key=k)
            q = data.get("model_quota") or {}
            print(f"{tag:<28} เหลือ {q.get('daily_remaining_tokens')} "
                  f"จาก {q.get('daily_quota_tokens')} token/วัน"
                  + (f"  [บันทึกไว้ว่า {mark}]" if mark != "ok" else ""))
        except urllib.error.HTTPError as e:
            body = _clean_error_body(e.read().decode(errors="ignore").strip())
            print(f"{tag:<28} HTTP {e.code}: {body[:100]}")
        except Exception as e:
            print(f"{tag:<28} error: {e}")


if __name__ == "__main__":
    arg = sys.argv[1] if len(sys.argv) > 1 else ""
    {"--make-bugs": make_bugs, "--models": cmd_models, "--quota": cmd_quota,
     "--summary": summary, "--prepare": cmd_prepare, "--next": cmd_next,
     "--save": cmd_save, "--merge": cmd_merge,
     "--failed": cmd_failed, "--retry-failed": cmd_retry_failed,
     "--reset": cmd_reset}.get(arg, run)()
