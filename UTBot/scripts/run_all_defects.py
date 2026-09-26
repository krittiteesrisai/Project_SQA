import argparse
import csv
import json
import os
import re
import shutil
import subprocess
import tarfile
import sys
import time
from pathlib import Path


# ============================================================
# Configuration
# ============================================================

PROJECT_ROOT = Path(__file__).resolve().parents[2]

UTBOT_DIR = PROJECT_ROOT / "UTBot"
UTBOT_CODE = UTBOT_DIR / "Code"
UTBOT_RUNNER = UTBOT_CODE / "run-utbot.bat"

RESULT_ROOT = UTBOT_DIR / "Result_Automated"
D4J_WORK_ROOT = Path(r"D:\d4j_work_auto")

JAVA11_HOME = Path(
    r"C:\Program Files\Eclipse Adoptium\jdk-11.0.32.101-hotspot"
)

GENERATION_TIMEOUT_MS = 120_000


# ============================================================
# Command helpers
# ============================================================

def run_command(command, cwd=None, env=None, timeout=None):
    print("\n>", " ".join(map(str, command)))
    start = time.perf_counter()

    try:
        result = subprocess.run(
            command,
            cwd=cwd,
            env=env,
            text=True,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            timeout=timeout,
            shell=False,
        )
        elapsed = time.perf_counter() - start
        return result.returncode, result.stdout, elapsed

    except subprocess.TimeoutExpired as exc:
        elapsed = time.perf_counter() - start
        output = exc.stdout or ""

        if isinstance(output, bytes):
            output = output.decode(errors="replace")

        return 124, output + "\nPROCESS TIMEOUT\n", elapsed


def run_defects4j(args, cwd):
    args_string = " ".join(args)
    cwd_bash = windows_to_bash_path(cwd)

    command = (
        f'export JAVA_HOME="/c/Program Files/'
        f'Eclipse Adoptium/jdk-11.0.32.101-hotspot"; '
        f'export PATH="$JAVA_HOME/bin:$PATH"; '
        f'export JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF-8"; '
        f'cd "{cwd_bash}" && defects4j {args_string}'
    )

    return run_command(
        [
            r"C:\Program Files\Git\bin\bash.exe",
            "-lc",
            command,
        ]
    )


def windows_to_bash_path(path):
    path = Path(path).resolve()
    drive = path.drive[0].lower()
    rest = str(path)[2:].replace("\\", "/")
    return f"/{drive}{rest}"


def run_defects4j_global(args):
    """Run a Defects4J command that does not require a checkout work directory."""
    args_string = " ".join(map(str, args))
    command = (
        f'export JAVA_HOME="/c/Program Files/'
        f'Eclipse Adoptium/jdk-11.0.32.101-hotspot"; '
        f'export PATH="$JAVA_HOME/bin:$PATH"; '
        f'export JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF-8"; '
        f'defects4j {args_string}'
    )
    return run_command(
        [
            r"C:\Program Files\Git\bin\bash.exe",
            "-lc",
            command,
        ]
    )


def list_projects():
    code, output, _ = run_defects4j_global(["pids"])
    if code != 0:
        raise RuntimeError("defects4j pids failed:\n" + output)

    # splitlines() safely handles CRLF from Windows/Git Bash.
    return [line.strip() for line in output.splitlines() if line.strip()]


def list_bug_ids(project):
    code, output, _ = run_defects4j_global(["bids", "-p", project])
    if code != 0:
        raise RuntimeError(
            f"defects4j bids -p {project} failed:\n{output}"
        )

    bug_ids = []
    for line in output.splitlines():
        value = line.strip()
        if value.isdigit():
            bug_ids.append(int(value))
    return bug_ids


# ============================================================
# Defects4J
# ============================================================

def remove_directory(path):
    """Remove a directory robustly on Windows."""
    if not path.exists():
        return True

    try:
        subprocess.run(
            ["cmd.exe", "/c", "rmdir", "/s", "/q", str(path)],
            stdout=subprocess.DEVNULL,
            stderr=subprocess.DEVNULL,
            check=False,
        )
    except OSError as exc:
        print(f"[ERROR] Failed to remove {path}: {exc}")
        return False

    return not path.exists()

def checkout(project, bug_id, version, destination):
    expected_vid = f"{bug_id}{version}"

    if destination.exists():
        marker = destination / ".defects4j.config"
        valid_checkout = False

        if marker.exists():
            try:
                config_text = marker.read_text(
                    encoding="utf-8",
                    errors="replace",
                )

                has_correct_pid = f"pid={project}" in config_text
                has_correct_vid = f"vid={expected_vid}" in config_text

                valid_checkout = (
                    has_correct_pid
                    and has_correct_vid
                )

            except OSError:
                valid_checkout = False

        if valid_checkout:
            print(
                f"[SKIP] Valid checkout already exists: "
                f"{destination} ({project}-{expected_vid})"
            )
            return True

        print(
            f"[CLEAN] Invalid/incomplete checkout found: "
            f"{destination}"
        )

        if not remove_directory(destination):
            print(
                f"[ERROR] Cannot remove invalid checkout: "
                f"{destination}"
            )
            return False

    destination.parent.mkdir(parents=True, exist_ok=True)

    command = (
        f'defects4j checkout '
        f'-p {project} '
        f'-v {expected_vid} '
        f'-w "{windows_to_bash_path(destination)}"'
    )

    code, output, _ = run_command(
        [
            r"C:\Program Files\Git\bin\bash.exe",
            "-lc",
            command,
        ]
    )

    print(output)

    if code != 0:
        print(
            f"[CLEAN] Removing failed checkout: "
            f"{destination}"
        )

        if not remove_directory(destination):
            print(
                f"[WARNING] Could not completely remove: "
                f"{destination}"
            )

    return code == 0


def compile_project(work_dir):
    code, output, elapsed = run_defects4j(
        ["compile"],
        work_dir,
    )
    return code == 0, output, elapsed


def export_property(work_dir, property_name):
    cwd_bash = windows_to_bash_path(work_dir)

    command = (
        f'export JAVA_HOME="/c/Program Files/'
        f'Eclipse Adoptium/jdk-11.0.32.101-hotspot"; '
        f'export PATH="$JAVA_HOME/bin:$PATH"; '
        f'export JAVA_TOOL_OPTIONS="-Dfile.encoding=UTF-8"; '
        f'cd "{cwd_bash}" && '
        f'defects4j export -p {property_name}'
    )

    result = subprocess.run(
        [
            r"C:\Program Files\Git\bin\bash.exe",
            "-lc",
            command,
        ],
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.PIPE,
    )

    if result.returncode != 0:
        print(f"[ERROR] Cannot export property: {property_name}")
        print(result.stderr)
        return None

    value = result.stdout.strip()
    return value if value else None


def get_modified_classes(work_dir):
    value = export_property(work_dir, "classes.modified")

    if not value:
        return []

    return [
        item.strip()
        for item in re.split(r"[\s,;]+", value)
        if item.strip()
    ]


def get_source_dir(work_dir):
    value = export_property(work_dir, "dir.src.classes")

    if not value:
        return None

    value = value.replace("\\", os.sep).replace("/", os.sep)
    return work_dir / value


def get_test_source_dir(work_dir):
    value = export_property(work_dir, "dir.src.tests")

    if not value:
        return None

    value = value.replace("\\", os.sep).replace("/", os.sep)
    return work_dir / value


def get_compile_classpath(work_dir):
    """Return the project-specific compile classpath exported by Defects4J."""
    value = export_property(work_dir, "cp.compile")
    return value.strip() if value else None


# ============================================================
# UTBot
# ============================================================

def class_to_source(source_root, class_name):
    # Modified classes can be nested classes (Outer$Inner).
    # The source file is normally Outer.java.
    source_class = class_name.split("$", 1)[0]
    relative = Path(*source_class.split("."))
    return source_root / relative.with_suffix(".java")


def safe_class_filename(class_name):
    return class_name.replace(".", "_") + "Test.java"


def generate_utbot_test(class_name, source_file, classpath, output_file):
    output_file.parent.mkdir(parents=True, exist_ok=True)

    command = [
        "cmd.exe",
        "/c",
        str(UTBOT_RUNNER),
        "generate",
        class_name,
        "--classpath",
        str(classpath),
        "--source",
        str(source_file),
        "--test-framework",
        "junit4",
        "--generation-timeout",
        str(GENERATION_TIMEOUT_MS),
        "--output",
        str(output_file),
    ]

    process_timeout = (GENERATION_TIMEOUT_MS / 1000) + 180

    return run_command(
        command,
        cwd=UTBOT_CODE,
        timeout=process_timeout,
    )


def count_tests(java_file):
    if not java_file.exists():
        return 0

    text = java_file.read_text(
        encoding="utf-8",
        errors="replace",
    )
    return len(re.findall(r"@Test\b", text))


# ============================================================
# Bug detection
# ============================================================

def get_package_name(java_file):
    text = java_file.read_text(
        encoding="utf-8",
        errors="replace",
    )

    match = re.search(
        r"^\s*package\s+([\w.]+)\s*;",
        text,
        re.MULTILINE,
    )

    return match.group(1) if match else ""


def get_public_class_name(java_file):
    text = java_file.read_text(
        encoding="utf-8",
        errors="replace",
    )

    match = re.search(
        r"public\s+(?:final\s+)?class\s+([A-Za-z_$][\w$]*)",
        text,
    )

    return match.group(1) if match else None


def install_generated_test(generated_file, work_dir):
    test_root = get_test_source_dir(work_dir)

    if test_root is None:
        return None

    package_name = get_package_name(generated_file)
    class_name = get_public_class_name(generated_file)

    if not class_name:
        return None

    if package_name:
        destination_dir = test_root / Path(*package_name.split("."))
    else:
        destination_dir = test_root

    destination_dir.mkdir(parents=True, exist_ok=True)
    destination = destination_dir / f"{class_name}.java"

    shutil.copy2(generated_file, destination)

    test_fqn = (
        f"{package_name}.{class_name}"
        if package_name
        else class_name
    )

    return destination, test_fqn


def run_single_test_class(
    work_dir,
    test_fqn,
):
    return run_defects4j(
        ["test"],
        work_dir,
    )


def extract_failing_tests(output, test_fqn):
    failures = set()

    pattern = re.compile(
        re.escape(test_fqn)
        + r"::([^\s]+)"
    )

    for match in pattern.finditer(output):
        failures.add(match.group(1))

    return failures

def is_test_compile_error(output):
    markers = (
        "Cannot compile test suite!",
        "Cannot compile tests!",
        "lambda expressions are not supported",
    )
    return any(marker in output for marker in markers)

def is_generated_test_incompatible(output):
    markers = (
        "lambda expressions are not supported in -source 6",
        "lambda expressions are not supported in -source 7",
        "diamond operator is not supported in -source 6",
    )
    return any(marker in output for marker in markers)

def detect_bug(generated_file, buggy_dir, fixed_dir, log_dir):
    buggy_install = install_generated_test(
        generated_file,
        buggy_dir,
    )
    fixed_install = install_generated_test(
        generated_file,
        fixed_dir,
    )

    if buggy_install is None or fixed_install is None:
        return {
            "status": "INSTALL_FAILED",
            "test_fqn": "",
            "buggy_failures": set(),
            "fixed_failures": set(),
            "unique_buggy": set(),
            "detected": "ERROR",
            "buggy_seconds": 0.0,
            "fixed_seconds": 0.0,
        }

    _, buggy_fqn = buggy_install
    _, fixed_fqn = fixed_install

    if buggy_fqn != fixed_fqn:
        return {
            "status": "TEST_FQN_MISMATCH",
            "test_fqn": buggy_fqn,
            "buggy_failures": set(),
            "fixed_failures": set(),
            "unique_buggy": set(),
            "detected": "ERROR",
            "buggy_seconds": 0.0,
            "fixed_seconds": 0.0,
        }

    test_fqn = buggy_fqn

    print(f"\nRunning generated test on BUGGY: {test_fqn}")
    buggy_code, buggy_output, buggy_seconds = run_single_test_class(
        buggy_dir,
        test_fqn,
    )

    print(f"Running generated test on FIXED: {test_fqn}")
    fixed_code, fixed_output, fixed_seconds = run_single_test_class(
        fixed_dir,
        test_fqn,
    )

    (log_dir / "utbot_test_buggy.log").write_text(
        buggy_output,
        encoding="utf-8",
        errors="replace",
    )

    (log_dir / "utbot_test_fixed.log").write_text(
        fixed_output,
        encoding="utf-8",
        errors="replace",
    )

    buggy_failures = extract_failing_tests(
        buggy_output,
        test_fqn,
    )
    fixed_failures = extract_failing_tests(
        fixed_output,
        test_fqn,
    )

    unique_buggy = buggy_failures - fixed_failures

    if buggy_code != 0:
        status = "BUGGY_TEST_ERROR"
    elif fixed_code != 0:
        status = "FIXED_TEST_ERROR"
    else:
        status = "COMPLETED"

    if status != "COMPLETED":
        detected = "ERROR"
    else:
        detected = "YES" if unique_buggy else "NO"

    return {
        "status": status,
        "test_fqn": test_fqn,
        "buggy_failures": buggy_failures,
        "fixed_failures": fixed_failures,
        "unique_buggy": unique_buggy,
        "detected": detected,
        "buggy_seconds": buggy_seconds,
        "fixed_seconds": fixed_seconds,
    }


# ============================================================
# Coverage
# ============================================================

def parse_coverage(output):
    def number(pattern, cast=int):
        match = re.search(pattern, output)
        return cast(match.group(1)) if match else None

    return {
        "lines_total": number(r"Lines total:\s*(\d+)"),
        "lines_covered": number(r"Lines covered:\s*(\d+)"),
        "conditions_total": number(r"Conditions total:\s*(\d+)"),
        "conditions_covered": number(r"Conditions covered:\s*(\d+)"),
        "line_percent": number(r"Line coverage:\s*([\d.]+)%", float),
        "condition_percent": number(r"Condition coverage:\s*([\d.]+)%", float),
    }


def remove_installed_test(installed_path):
    if installed_path and Path(installed_path).exists():
        Path(installed_path).unlink()

def cleanup_installed_tests(installed_paths):
    """Remove UTBot-generated tests that were copied into a Defects4J checkout."""
    for installed_path in installed_paths:
        try:
            remove_installed_test(installed_path)
        except OSError as exc:
            print(f"[WARN] Cannot remove generated test {installed_path}: {exc}")

def cleanup_stale_generated_tests(work_dir, generated_dir):
    """
    Remove UTBot-generated tests from a Defects4J checkout before
    baseline compilation.

    Only files corresponding to artifacts in this bug's generated_tests
    directory are removed, so developer tests are left untouched.
    """
    if not generated_dir.exists():
        return

    test_root = get_test_source_dir(work_dir)
    if test_root is None or not test_root.exists():
        return

    removed = 0

    for generated_file in generated_dir.glob("*.java"):
        package_name = get_package_name(generated_file)
        class_name = get_public_class_name(generated_file)

        if not class_name:
            continue

        if package_name:
            installed_path = (
                test_root
                / Path(*package_name.split("."))
                / f"{class_name}.java"
            )
        else:
            installed_path = test_root / f"{class_name}.java"

        if installed_path.exists():
            try:
                installed_path.unlink()
                removed += 1
                print(f"[CLEAN] Removed stale UTBot test: {installed_path}")
            except OSError as exc:
                print(
                    f"[WARN] Cannot remove stale UTBot test "
                    f"{installed_path}: {exc}"
                )

    if removed:
        print(f"[CLEAN] Removed {removed} stale UTBot test(s).")

def create_external_suite(generated_files, project, bug_id):
    suite_root = D4J_WORK_ROOT / f"{project}-{bug_id}-utbot-suite"
    archive = D4J_WORK_ROOT / f"{project}-{bug_id}-utbot.1.tar.bz2"

    if suite_root.exists():
        shutil.rmtree(suite_root)

    if archive.exists():
        archive.unlink()

    copied = 0
    for generated_file in generated_files:
        package_name = get_package_name(generated_file)
        class_name = get_public_class_name(generated_file)

        if not class_name:
            continue

        destination_dir = suite_root
        if package_name:
            destination_dir = suite_root / Path(*package_name.split("."))

        destination_dir.mkdir(parents=True, exist_ok=True)
        destination = destination_dir / f"{class_name}.java"
        shutil.copy2(generated_file, destination)
        copied += 1

    if copied == 0:
        return None

    with tarfile.open(archive, "w:bz2") as tar:
        for item in suite_root.iterdir():
            tar.add(item, arcname=item.name)

    return archive


def run_coverage(work_dir, suite_archive=None):
    args = ["coverage"]

    if suite_archive is not None:
        args.extend([
            "-s",
            windows_to_bash_path(suite_archive),
        ])

    code, output, elapsed = run_defects4j(args, work_dir)
    return code, output, elapsed, parse_coverage(output)


def run_coverage_experiment(
    generated_files,
    buggy_dir,
    installed_buggy_tests,
    project,
    bug_id,
    result_dir,
):
    coverage_dir = result_dir / "coverage"
    coverage_dir.mkdir(parents=True, exist_ok=True)

    # Developer-only: remove all UTBot tests temporarily.
    for installed_path in installed_buggy_tests:
        remove_installed_test(installed_path)

    try:
        dev_code, dev_output, dev_seconds, dev = run_coverage(
            buggy_dir
        )
        (coverage_dir / "developer_only.log").write_text(
            dev_output,
            encoding="utf-8",
            errors="replace",
        )

        # UTBot-only: use a Defects4J external test-suite archive.
        archive = create_external_suite(
            generated_files,
            project,
            bug_id,
        )

        if archive is None:
            utbot_code = -1
            utbot_output = "Cannot create external UTBot suite."
            utbot_seconds = 0.0
            utbot = parse_coverage("")
        else:
            utbot_code, utbot_output, utbot_seconds, utbot = run_coverage(
                buggy_dir,
                archive,
            )

        (coverage_dir / "utbot_only.log").write_text(
            utbot_output,
            encoding="utf-8",
            errors="replace",
        )

    finally:
        # Always restore the generated test even if coverage fails.
        restored = []
        for generated_file in generated_files:
            installed = install_generated_test(
                generated_file,
                buggy_dir,
            )
            if installed is not None:
                restored.append(installed)

    # Combined: developer tests + all restored UTBot generated tests.
    if len(restored) != len(generated_files):
        combined_code = -1
        combined_output = "Cannot restore generated UTBot test."
        combined_seconds = 0.0
        combined = parse_coverage("")
    else:
        combined_code, combined_output, combined_seconds, combined = (
            run_coverage(buggy_dir)
        )

    (coverage_dir / "combined.log").write_text(
        combined_output,
        encoding="utf-8",
        errors="replace",
    )

    line_gain = None
    condition_gain = None

    if (
        dev["line_percent"] is not None
        and combined["line_percent"] is not None
    ):
        line_gain = round(
            combined["line_percent"] - dev["line_percent"],
            1,
        )

    if (
        dev["condition_percent"] is not None
        and combined["condition_percent"] is not None
    ):
        condition_gain = round(
            combined["condition_percent"] - dev["condition_percent"],
            1,
        )

    status = (
        "COMPLETED"
        if all(
            value["line_percent"] is not None
            for value in (dev, utbot, combined)
        )
        else "COVERAGE_ERROR"
    )

    return {
        "status": status,
        "developer": dev,
        "utbot": utbot,
        "combined": combined,
        "line_gain": line_gain,
        "condition_gain": condition_gain,
        "developer_seconds": dev_seconds,
        "utbot_seconds": utbot_seconds,
        "combined_seconds": combined_seconds,
        "developer_exit_code": dev_code,
        "utbot_exit_code": utbot_code,
        "combined_exit_code": combined_code,
    }


# ============================================================
# Persistent performance metadata
# ============================================================

def generation_metadata_path(result_dir, class_name):
    performance_dir = result_dir / "performance"
    performance_dir.mkdir(parents=True, exist_ok=True)
    safe_name = class_name.replace(".", "_").replace("$", "_")
    return performance_dir / f"{safe_name}_generation.json"


def save_generation_metadata(
    result_dir,
    class_name,
    generated_tests,
    elapsed,
    exit_code,
):
    metadata_file = generation_metadata_path(result_dir, class_name)
    data = {
        "class": class_name,
        "generated_tests": generated_tests,
        "generation_seconds": round(elapsed, 6),
        "generation_exit_code": exit_code,
        "generation_timeout_ms": GENERATION_TIMEOUT_MS,
    }
    metadata_file.write_text(
        json.dumps(data, indent=2),
        encoding="utf-8",
    )


def load_generation_metadata(result_dir, class_name):
    metadata_file = generation_metadata_path(result_dir, class_name)

    if not metadata_file.exists():
        return None

    try:
        return json.loads(metadata_file.read_text(encoding="utf-8"))
    except (OSError, json.JSONDecodeError, TypeError, ValueError):
        return None


# ============================================================
# Result handling
# ============================================================

SUMMARY_FIELDS = [
    "Project",
    "BugID",
    "Class",
    "GeneratedTests",
    "GenerationSeconds",
    "GenerationExitCode",
    "BuggyCompile",
    "FixedCompile",
    "BuggyUTBotFails",
    "FixedUTBotFails",
    "UniqueBuggyFails",
    "BugDetected",
    "BuggyTestSeconds",
    "FixedTestSeconds",
    "DeveloperLinesCovered",
    "DeveloperLinesTotal",
    "DeveloperLineCoverage",
    "DeveloperConditionsCovered",
    "DeveloperConditionsTotal",
    "DeveloperConditionCoverage",
    "UTBotLinesCovered",
    "UTBotLinesTotal",
    "UTBotLineCoverage",
    "UTBotConditionsCovered",
    "UTBotConditionsTotal",
    "UTBotConditionCoverage",
    "CombinedLinesCovered",
    "CombinedLinesTotal",
    "CombinedLineCoverage",
    "CombinedConditionsCovered",
    "CombinedConditionsTotal",
    "CombinedConditionCoverage",
    "LineCoverageGain",
    "ConditionCoverageGain",
    "DeveloperCoverageSeconds",
    "UTBotCoverageSeconds",
    "CombinedCoverageSeconds",
    "Status",
]


def read_summary_rows():
    summary_file = RESULT_ROOT / "summary.csv"
    if not summary_file.exists():
        return []

    with summary_file.open(
        "r",
        newline="",
        encoding="utf-8",
    ) as f:
        return list(csv.DictReader(f))


def write_summary_rows(rows):
    summary_file = RESULT_ROOT / "summary.csv"
    summary_file.parent.mkdir(parents=True, exist_ok=True)

    with summary_file.open(
        "w",
        newline="",
        encoding="utf-8",
    ) as f:
        writer = csv.DictWriter(
            f,
            fieldnames=SUMMARY_FIELDS,
        )
        writer.writeheader()
        writer.writerows(rows)


def append_summary(row):
    """Upsert a class result instead of creating duplicate rows on reruns."""
    rows = read_summary_rows()
    key = (
        str(row.get("Project", "")),
        str(row.get("BugID", "")),
        str(row.get("Class", "")),
    )

    replaced = False
    for index, existing in enumerate(rows):
        existing_key = (
            str(existing.get("Project", "")),
            str(existing.get("BugID", "")),
            str(existing.get("Class", "")),
        )
        if existing_key == key:
            rows[index] = row
            replaced = True
            break

    if not replaced:
        rows.append(row)

    write_summary_rows(rows)


def bug_is_completed(project, bug_id):
    """True when all summary rows have a terminal status."""

    terminal_statuses = {
        "COMPLETED",
        "TEST_COMPILE_INCOMPATIBLE",
        "GENERATION_TIMEOUT",
        "GENERATION_FAILED",
    }

    target_bug = str(bug_id)
    rows = read_summary_rows()

    matching = [
        row
        for row in rows
        if row.get("Project") == project
        and row.get("BugID") == target_bug
    ]

    return bool(matching) and all(
        row.get("Status") in terminal_statuses
        for row in matching
    )




# ============================================================
# Experiment
# ============================================================

def run_bug(project, bug_id):
    print("=" * 70)
    print(f"UTBot experiment: {project}-{bug_id}")
    print("=" * 70)

    bug_name = f"{project}-{bug_id}"
    result_dir = RESULT_ROOT / bug_name
    generated_dir = result_dir / "generated_tests"
    log_dir = result_dir / "logs"
    bug_detection_dir = result_dir / "bug_detection"

    log_dir.mkdir(parents=True, exist_ok=True)
    bug_detection_dir.mkdir(parents=True, exist_ok=True)

    buggy_dir = D4J_WORK_ROOT / f"{project}_{bug_id}_buggy"
    fixed_dir = D4J_WORK_ROOT / f"{project}_{bug_id}_fixed"

    if not checkout(project, bug_id, "b", buggy_dir):
        print("[ERROR] Buggy checkout failed")
        return False

    if not checkout(project, bug_id, "f", fixed_dir):
        print("[ERROR] Fixed checkout failed")
        return "ERROR"

    # Remove UTBot tests left behind by a previous interrupted/failed run.
    cleanup_stale_generated_tests(buggy_dir, generated_dir)
    cleanup_stale_generated_tests(fixed_dir, generated_dir)

    buggy_ok, buggy_output, _ = compile_project(buggy_dir)
    fixed_ok, fixed_output, _ = compile_project(fixed_dir)

    (log_dir / "compile_buggy.log").write_text(
        buggy_output, encoding="utf-8", errors="replace"
    )
    (log_dir / "compile_fixed.log").write_text(
        fixed_output, encoding="utf-8", errors="replace"
    )

    if not buggy_ok or not fixed_ok:
        print("[ERROR] Compile failed")
        return False

    modified_classes = get_modified_classes(buggy_dir)
    print("Modified classes:", modified_classes)

    if not modified_classes:
        print("[ERROR] No modified classes found")
        return False

    source_root = get_source_dir(buggy_dir)
    classpath = get_compile_classpath(buggy_dir)

    if source_root is None:
        print("[ERROR] Cannot find source directory")
        return False

    if not classpath:
        print("[ERROR] Cannot export cp.compile")
        return False

    print("Compile classpath:", classpath)

    class_results = []
    generated_files = []

    # Phase A: generate/reuse ALL modified classes first.
    for class_name in modified_classes:
        source_file = class_to_source(source_root, class_name)
        print(f"\nTarget class: {class_name}")
        print(f"Source: {source_file}")

        row = {
            "class_name": class_name,
            "source_file": source_file,
            "generated_file": None,
            "generated_tests": 0,
            "elapsed": 0.0,
            "exit_code": -1,
            "status": "SOURCE_NOT_FOUND",
        }

        if not source_file.exists():
            print("[SKIP] Source file not found:", source_file)
            class_results.append(row)
            continue

        output_file = generated_dir / safe_class_filename(class_name)
        metadata = load_generation_metadata(result_dir, class_name)

        if output_file.exists():
            print(f"[REUSE] Existing generated test: {output_file}")
            generated_tests = count_tests(output_file)

            if metadata is not None:
                exit_code = int(metadata.get("generation_exit_code", 0))
                elapsed = float(metadata.get("generation_seconds", 0.0))
                print(f"[REUSE] Generation metadata: {elapsed:.3f}s")
            else:
                exit_code = 0
                elapsed = 0.0
                print(
                    "[WARN] Generation metadata not found. "
                    "Generation time is unknown for this reused file."
                )
        else:
            exit_code, output, elapsed = generate_utbot_test(
                class_name,
                source_file,
                classpath,
                output_file,
            )

            log_file = (
                log_dir
                / (class_name.replace(".", "_").replace("$", "_") + "_utbot.log")
            )
            log_file.write_text(
                output, encoding="utf-8", errors="replace"
            )

            generated_tests = count_tests(output_file)
            save_generation_metadata(
                result_dir,
                class_name,
                generated_tests,
                elapsed,
                exit_code,
            )

        generated = exit_code == 0 and output_file.exists()

        if generated:
            generation_status = "GENERATED"
        elif exit_code == 124:
            generation_status = "GENERATION_TIMEOUT"
        else:
            generation_status = "GENERATION_FAILED"

        row.update({
            "generated_file": output_file if generated else None,
            "generated_tests": generated_tests,
            "elapsed": elapsed,
            "exit_code": exit_code,
            "status": generation_status,
        })
        class_results.append(row)

        if generated:
            generated_files.append(output_file)

    if not generated_files:
        print("[ERROR] No generated tests available for this bug")
        for row in class_results:
            append_summary({
                "Project": project,
                "BugID": bug_id,
                "Class": row["class_name"],
                "GeneratedTests": row["generated_tests"],
                "GenerationSeconds": round(row["elapsed"], 3),
                "GenerationExitCode": row["exit_code"],
                "BuggyCompile": buggy_ok,
                "FixedCompile": fixed_ok,
                "BuggyUTBotFails": 0,
                "FixedUTBotFails": 0,
                "UniqueBuggyFails": 0,
                "BugDetected": "ERROR",
                "BuggyTestSeconds": "",
                "FixedTestSeconds": "",
                "DeveloperLinesCovered": "",
                "DeveloperLinesTotal": "",
                "DeveloperLineCoverage": "",
                "DeveloperConditionsCovered": "",
                "DeveloperConditionsTotal": "",
                "DeveloperConditionCoverage": "",
                "UTBotLinesCovered": "",
                "UTBotLinesTotal": "",
                "UTBotLineCoverage": "",
                "UTBotConditionsCovered": "",
                "UTBotConditionsTotal": "",
                "UTBotConditionCoverage": "",
                "CombinedLinesCovered": "",
                "CombinedLinesTotal": "",
                "CombinedLineCoverage": "",
                "CombinedConditionsCovered": "",
                "CombinedConditionsTotal": "",
                "CombinedConditionCoverage": "",
                "LineCoverageGain": "",
                "ConditionCoverageGain": "",
                "DeveloperCoverageSeconds": "",
                "UTBotCoverageSeconds": "",
                "CombinedCoverageSeconds": "",
                "Status": row["status"],
            })
        if class_results and all(
            row["status"] == "GENERATION_TIMEOUT"
            for row in class_results
        ):
            print("[GENERATION_TIMEOUT] UTBot generation timed out.")
            return "GENERATION_TIMEOUT"

        if class_results and all(
            row["status"] == "GENERATION_FAILED"
            for row in class_results
        ):
            print("[GENERATION_FAILED] UTBot could not generate tests.")
            return "GENERATION_FAILED"

        return "ERROR"

    # Phase B: install ALL generated tests before bug-level testing.
    buggy_installed = []
    fixed_installed = []
    test_fqns = []

    for generated_file in generated_files:
        b = install_generated_test(generated_file, buggy_dir)
        f = install_generated_test(generated_file, fixed_dir)

        if b is None or f is None or b[1] != f[1]:
            print("[ERROR] Cannot install generated test:", generated_file)
            continue

        buggy_installed.append(b[0])
        fixed_installed.append(f[0])
        test_fqns.append(b[1])

    if len(test_fqns) != len(generated_files):
        bug_status = "INSTALL_FAILED"
        buggy_output = ""
        fixed_output = ""
        buggy_test_seconds = 0.0
        fixed_test_seconds = 0.0
        buggy_failures = set()
        fixed_failures = set()
        unique_buggy = set()
        bug_detected = "ERROR"
    else:
        print("\nRunning ALL generated tests on BUGGY...")
        buggy_code, buggy_output, buggy_test_seconds = run_defects4j(
            ["test"], buggy_dir
        )

        print("Running ALL generated tests on FIXED...")
        fixed_code, fixed_output, fixed_test_seconds = run_defects4j(
            ["test"], fixed_dir
        )

        (log_dir / "utbot_test_buggy.log").write_text(
            buggy_output, encoding="utf-8", errors="replace"
        )
        (log_dir / "utbot_test_fixed.log").write_text(
            fixed_output, encoding="utf-8", errors="replace"
        )

        buggy_failures = set()
        fixed_failures = set()

        for test_fqn in test_fqns:
            for method in extract_failing_tests(buggy_output, test_fqn):
                buggy_failures.add(f"{test_fqn}::{method}")
            for method in extract_failing_tests(fixed_output, test_fqn):
                fixed_failures.add(f"{test_fqn}::{method}")

        unique_buggy = buggy_failures - fixed_failures

        if (
            is_generated_test_incompatible(buggy_output)
            or is_generated_test_incompatible(fixed_output)
        ):
            bug_status = "TEST_COMPILE_INCOMPATIBLE"

        elif is_test_compile_error(buggy_output):
            bug_status = "BUGGY_TEST_COMPILE_ERROR"

        elif is_test_compile_error(fixed_output):
            bug_status = "FIXED_TEST_COMPILE_ERROR"

        elif buggy_code != 0:
            bug_status = "BUGGY_TEST_ERROR"

        elif fixed_code != 0:
            bug_status = "FIXED_TEST_ERROR"

        else:
            bug_status = "COMPLETED"

        if bug_status != "COMPLETED":
            print(
                f"[TEST ERROR] Generated tests could not be executed "
                f"(buggy exit={buggy_code}, fixed exit={fixed_code})."
            )
            print(
                "[TEST ERROR] Do not interpret 0 extracted failures "
                "as 0 actual test failures."
            )

        bug_detected = (
            "YES" if unique_buggy
            else "NO" if bug_status == "COMPLETED"
            else "ERROR"
        )

    print("\nBug-level detection result:")
    print(f"  Generated classes : {len(generated_files)}")
    print(f"  Generated tests   : {sum(r['generated_tests'] for r in class_results)}")
    print(f"  Buggy failures    : {len(buggy_failures)}")
    print(f"  Fixed failures    : {len(fixed_failures)}")
    print(f"  Unique buggy      : {len(unique_buggy)}")
    print(f"  Bug detected      : {bug_detected}")

    (bug_detection_dir / "unique_buggy_failures.txt").write_text(
        "\n".join(sorted(unique_buggy)),
        encoding="utf-8",
    )

    # Phase C: one aggregate coverage experiment per bug.
    coverage_result = None

    if bug_status == "COMPLETED":
        print("\nRunning bug-level coverage experiment...")
        coverage_result = run_coverage_experiment(
            generated_files,
            buggy_dir,
            buggy_installed,
            project,
            bug_id,
            result_dir,
        )

        dev = coverage_result["developer"]
        utb = coverage_result["utbot"]
        cmb = coverage_result["combined"]

        print("\nCoverage result:")
        print(
            f'  Developer : {dev["lines_covered"]}/{dev["lines_total"]} lines '
            f'({dev["line_percent"]}%), '
            f'{dev["conditions_covered"]}/{dev["conditions_total"]} conditions '
            f'({dev["condition_percent"]}%)'
        )
        print(
            f'  UTBot     : {utb["lines_covered"]}/{utb["lines_total"]} lines '
            f'({utb["line_percent"]}%), '
            f'{utb["conditions_covered"]}/{utb["conditions_total"]} conditions '
            f'({utb["condition_percent"]}%)'
        )
        print(
            f'  Combined  : {cmb["lines_covered"]}/{cmb["lines_total"]} lines '
            f'({cmb["line_percent"]}%), '
            f'{cmb["conditions_covered"]}/{cmb["conditions_total"]} conditions '
            f'({cmb["condition_percent"]}%)'
        )
        print(
            f'  Gain      : {coverage_result["line_gain"]} pp lines, '
            f'{coverage_result["condition_gain"]} pp conditions'
        )

        if coverage_result["status"] != "COMPLETED":
            bug_status = coverage_result["status"]

    def cov(section, key):
        if coverage_result is None:
            return ""
        return coverage_result[section][key]

    # One row per modified class, but bug-level detection/coverage is repeated
    # intentionally so every class row can be analyzed without contaminating runs.
    for row in class_results:
        append_summary({
            "Project": project,
            "BugID": bug_id,
            "Class": row["class_name"],
            "GeneratedTests": row["generated_tests"],
            "GenerationSeconds": round(row["elapsed"], 3),
            "GenerationExitCode": row["exit_code"],
            "BuggyCompile": buggy_ok,
            "FixedCompile": fixed_ok,
            "BuggyUTBotFails": len(buggy_failures),
            "FixedUTBotFails": len(fixed_failures),
            "UniqueBuggyFails": len(unique_buggy),
            "BugDetected": bug_detected,
            "BuggyTestSeconds": round(buggy_test_seconds, 3),
            "FixedTestSeconds": round(fixed_test_seconds, 3),
            "DeveloperLinesCovered": cov("developer", "lines_covered"),
            "DeveloperLinesTotal": cov("developer", "lines_total"),
            "DeveloperLineCoverage": cov("developer", "line_percent"),
            "DeveloperConditionsCovered": cov("developer", "conditions_covered"),
            "DeveloperConditionsTotal": cov("developer", "conditions_total"),
            "DeveloperConditionCoverage": cov("developer", "condition_percent"),
            "UTBotLinesCovered": cov("utbot", "lines_covered"),
            "UTBotLinesTotal": cov("utbot", "lines_total"),
            "UTBotLineCoverage": cov("utbot", "line_percent"),
            "UTBotConditionsCovered": cov("utbot", "conditions_covered"),
            "UTBotConditionsTotal": cov("utbot", "conditions_total"),
            "UTBotConditionCoverage": cov("utbot", "condition_percent"),
            "CombinedLinesCovered": cov("combined", "lines_covered"),
            "CombinedLinesTotal": cov("combined", "lines_total"),
            "CombinedLineCoverage": cov("combined", "line_percent"),
            "CombinedConditionsCovered": cov("combined", "conditions_covered"),
            "CombinedConditionsTotal": cov("combined", "conditions_total"),
            "CombinedConditionCoverage": cov("combined", "condition_percent"),
            "LineCoverageGain": (
                coverage_result["line_gain"] if coverage_result else ""
            ),
            "ConditionCoverageGain": (
                coverage_result["condition_gain"] if coverage_result else ""
            ),
            "DeveloperCoverageSeconds": (
                round(coverage_result["developer_seconds"], 3)
                if coverage_result else ""
            ),
            "UTBotCoverageSeconds": (
                round(coverage_result["utbot_seconds"], 3)
                if coverage_result else ""
            ),
            "CombinedCoverageSeconds": (
                round(coverage_result["combined_seconds"], 3)
                if coverage_result else ""
            ),
            "Status": row["status"] if row["status"] != "GENERATED" else bug_status,
        })

    total_tests = sum(r["generated_tests"] for r in class_results)
    total_generation = sum(r["elapsed"] for r in class_results)
    print(
        f"\n[{bug_status}] {total_tests} tests across "
        f"{len(generated_files)} generated class(es); "
        f"generation {total_generation:.2f}s"
    )

    cleanup_installed_tests(buggy_installed)
    cleanup_installed_tests(fixed_installed)

    if bug_status == "COMPLETED":
        return "COMPLETED"

    if bug_status == "TEST_COMPILE_INCOMPATIBLE":
        return "TEST_COMPILE_INCOMPATIBLE"

    return "ERROR"


# ============================================================
# Main
# ============================================================

def main():
    parser = argparse.ArgumentParser(
        description="Run UTBot experiments on Defects4J bugs."
    )

    parser.add_argument(
        "--project",
        help="Defects4J project ID, e.g. Lang or Math.",
    )

    parser.add_argument(
        "--bugs",
        nargs="+",
        type=int,
        help="Specific bug IDs for --project.",
    )

    parser.add_argument(
        "--all-bugs",
        action="store_true",
        help="Run every active bug in --project.",
    )

    parser.add_argument(
        "--all",
        action="store_true",
        help="Run every active bug in every Defects4J project.",
    )

    parser.add_argument(
        "--resume",
        action="store_true",
        help="Skip bugs whose summary rows already have terminal statuses.",
    )

    args = parser.parse_args()

    if not UTBOT_RUNNER.exists():
        print(
            "UTBot runner not found:",
            UTBOT_RUNNER,
        )
        sys.exit(1)

    # Preserve the old convenient default.
    if (
        not args.all
        and not args.all_bugs
        and args.project is None
        and args.bugs is None
    ):
        jobs = [("Lang", 27)]
    elif args.all:
        if args.project is not None or args.bugs is not None or args.all_bugs:
            parser.error(
                "--all cannot be combined with --project, --bugs, or --all-bugs."
            )

        jobs = []
        projects = list_projects()
        print(f"\nDiscovered {len(projects)} Defects4J projects.")

        for project in projects:
            bug_ids = list_bug_ids(project)
            print(f"  {project}: {len(bug_ids)} active bugs")
            jobs.extend((project, bug_id) for bug_id in bug_ids)
    elif args.all_bugs:
        if args.project is None:
            parser.error("--all-bugs requires --project.")
        if args.bugs is not None:
            parser.error("--all-bugs cannot be combined with --bugs.")

        bug_ids = list_bug_ids(args.project)
        jobs = [(args.project, bug_id) for bug_id in bug_ids]
        print(
            f"\nDiscovered {len(bug_ids)} active bugs "
            f"for {args.project}."
        )
    else:
        if args.project is None:
            parser.error("--bugs requires --project.")
        if not args.bugs:
            parser.error(
                "Provide --bugs, --all-bugs, or use --all."
            )
        jobs = [(args.project, bug_id) for bug_id in args.bugs]

    print(f"\nPlanned jobs: {len(jobs)}")

    completed_now = 0
    incompatible_now = 0
    timeout_now = 0
    generation_failed_now = 0
    skipped = 0
    failed = 0

    for index, (project, bug_id) in enumerate(jobs, start=1):
        label = f"{project}-{bug_id}"
        print("\n" + "#" * 70)
        print(f"# JOB {index}/{len(jobs)}: {label}")
        print("#" * 70)

        if args.resume and bug_is_completed(project, bug_id):
            print(f"[RESUME] Skip completed bug: {label}")
            skipped += 1
            continue

        try:
            result = run_bug(project, bug_id)

            if result == "COMPLETED":
                completed_now += 1

            elif result == "TEST_COMPILE_INCOMPATIBLE":
                incompatible_now += 1
                print(
                    f"[BATCH] {label} reached terminal "
                    f"test-compile incompatibility."
                )
            elif result == "GENERATION_FAILED":
                generation_failed_now += 1
                print(
                    f"[BATCH] {label} reached terminal "
                    f"generation failure."
                )

            else:
                failed += 1
                print(f"[BATCH] {label} did not complete.")
        except KeyboardInterrupt:
            print(
                "\n[STOPPED] Interrupted by user. "
                "Run the same command with --resume to continue."
            )
            raise
        except Exception as exc:
            # One bad bug must not terminate an all-bug experiment.
            failed += 1
            error_dir = RESULT_ROOT / label / "logs"
            error_dir.mkdir(parents=True, exist_ok=True)
            (error_dir / "batch_exception.log").write_text(
                f"{type(exc).__name__}: {exc}\n",
                encoding="utf-8",
            )
            print(
                f"[BATCH ERROR] {label}: "
                f"{type(exc).__name__}: {exc}"
            )
            continue

    print("\n" + "=" * 70)
    print("BATCH SUMMARY")
    print("=" * 70)
    print(f"Planned                     : {len(jobs)}")
    print(f"Completed now               : {completed_now}")
    print(f"Terminal incompatible       : {incompatible_now}")
    print(f"Terminal generation timeout : {timeout_now}")
    print(f"Terminal generation failed  : {generation_failed_now}")
    print(f"Resume skipped              : {skipped}")
    print(f"Actual errors/incomplete    : {failed}")

    if failed:
        print(
            "\nSome bugs did not complete. "
            "Their existing artifacts/logs were preserved; "
            "rerun with --resume after fixing the cause."
        )


if __name__ == "__main__":
    main()
