from pathlib import Path
import pandas as pd


PROJECT = "Lang"

ROOT = Path(__file__).resolve().parents[2]
UTBOT_DIR = ROOT / "UTBot"
RESULT_DIR = UTBOT_DIR / "Result_Automated"

SUMMARY_CSV = RESULT_DIR / "summary.csv"
OUTPUT_MD = RESULT_DIR / f"{PROJECT}_summary.md"


def pct(value, total):
    if total == 0:
        return 0.0
    return value / total * 100


def main():
    df = pd.read_csv(SUMMARY_CSV)

    df = df[df["Project"] == PROJECT].copy()

    total_bugs = df["BugID"].nunique()

    status_counts = df["Status"].value_counts()

    completed = int(status_counts.get("COMPLETED", 0))
    incompatible = int(
        status_counts.get("TEST_COMPILE_INCOMPATIBLE", 0)
    )
    timeout = int(status_counts.get("GENERATION_TIMEOUT", 0))
    generation_failed = int(
        status_counts.get("GENERATION_FAILED", 0)
    )

    completed_df = df[df["Status"] == "COMPLETED"].copy()

    detected = int(
        (completed_df["BugDetected"] == "YES").sum()
    )

    fdr_all = pct(detected, total_bugs)
    fdr_executable = pct(detected, completed)

    total_tests = int(completed_df["GeneratedTests"].sum())
    avg_tests = completed_df["GeneratedTests"].mean()

    total_generation_time = completed_df[
        "GenerationSeconds"
    ].sum()

    avg_generation_time = completed_df[
        "GenerationSeconds"
    ].mean()

    dev_line = completed_df[
        "DeveloperLineCoverage"
    ].mean()

    utbot_line = completed_df[
        "UTBotLineCoverage"
    ].mean()

    combined_line = completed_df[
        "CombinedLineCoverage"
    ].mean()

    line_gain = (
        completed_df["CombinedLineCoverage"]
        - completed_df["DeveloperLineCoverage"]
    ).mean()

    dev_condition = completed_df[
        "DeveloperConditionCoverage"
    ].mean()

    utbot_condition = completed_df[
        "UTBotConditionCoverage"
    ].mean()

    combined_condition = completed_df[
        "CombinedConditionCoverage"
    ].mean()

    condition_gain = (
        completed_df["CombinedConditionCoverage"]
        - completed_df["DeveloperConditionCoverage"]
    ).mean()

    detected_rows = completed_df[
        completed_df["BugDetected"] == "YES"
    ]

    detected_text = ", ".join(
        f"{PROJECT}-{int(row.BugID)} ({row.Class})"
        for _, row in detected_rows.iterrows()
    )

    if not detected_text:
        detected_text = "None"

    report = f"""# UTBot Experiment Summary — Defects4J {PROJECT}

## Experiment Overview

| Metric | Result |
|---|---:|
| Total active bugs | {total_bugs} |
| Completed | {completed} ({pct(completed, total_bugs):.2f}%) |
| Test compile incompatible | {incompatible} ({pct(incompatible, total_bugs):.2f}%) |
| Generation timeout | {timeout} ({pct(timeout, total_bugs):.2f}%) |
| Generation failed | {generation_failed} ({pct(generation_failed, total_bugs):.2f}%) |

## Fault Detection

| Metric | Result |
|---|---:|
| Bugs detected | {detected} |
| Fault Detection Rate — all bugs | {fdr_all:.2f}% |
| Fault Detection Rate — executable bugs | {fdr_executable:.2f}% |

Detected bug(s):

{detected_text}

A bug is considered detected when a generated test fails on the buggy
version and the same test passes on the corresponding fixed version.

## Test Generation

| Metric | Result |
|---|---:|
| Generated tests | {total_tests} |
| Average tests per completed bug | {avg_tests:.2f} |
| Average generation time | {avg_generation_time:.2f} s |
| Total generation time | {total_generation_time:.2f} s |
| Total generation time | {total_generation_time / 60:.2f} min |

## Line Coverage

| Test Suite | Average Coverage |
|---|---:|
| Developer tests | {dev_line:.2f}% |
| UTBot tests | {utbot_line:.2f}% |
| Combined | {combined_line:.2f}% |

Average line coverage gain:

**+{line_gain:.2f} percentage points**

## Condition Coverage

| Test Suite | Average Coverage |
|---|---:|
| Developer tests | {dev_condition:.2f}% |
| UTBot tests | {utbot_condition:.2f}% |
| Combined | {combined_condition:.2f}% |

Average condition coverage gain:

**+{condition_gain:.2f} percentage points**

## Interpretation Notes

- Fault Detection Rate for all bugs uses all {total_bugs} active
  Defects4J {PROJECT} bugs as the denominator.
- Executable Fault Detection Rate uses only the {completed} bugs whose
  generated tests could be executed successfully.
- TEST_COMPILE_INCOMPATIBLE cases are not classified as undetected bugs.
- GENERATION_TIMEOUT cases are not classified as undetected bugs.
- GENERATION_FAILED cases are not classified as undetected bugs.
- Coverage averages are calculated only from COMPLETED experiments.
"""

    OUTPUT_MD.write_text(report, encoding="utf-8")

    print(f"Generated: {OUTPUT_MD}")
    print(f"Total bugs: {total_bugs}")
    print(f"Completed: {completed}")
    print(f"Detected: {detected}")
    print(f"FDR all: {fdr_all:.2f}%")
    print(f"FDR executable: {fdr_executable:.2f}%")


if __name__ == "__main__":
    main()