import csv
from collections import defaultdict
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
RESULT_DIR = ROOT / "Result_Automated"

SUMMARY_FILE = RESULT_DIR / "summary.csv"
FINAL_CSV = RESULT_DIR / "final_summary.csv"
FINAL_MD = RESULT_DIR / "final_report.md"


def num(value):
    try:
        return float(value)
    except (TypeError, ValueError):
        return None


def weighted(rows, covered_field, total_field):
    covered = 0.0
    total = 0.0

    for row in rows:
        c = num(row.get(covered_field))
        t = num(row.get(total_field))

        if c is not None and t is not None and t > 0:
            covered += c
            total += t

    if total == 0:
        return None

    return covered / total * 100


def fmt(value):
    if value is None:
        return "N/A"
    return f"{value:.2f}"


def main():
    if not SUMMARY_FILE.exists():
        raise FileNotFoundError(
            f"summary.csv not found: {SUMMARY_FILE}"
        )

    with SUMMARY_FILE.open(
        "r",
        encoding="utf-8",
        newline="",
    ) as f:
        rows = list(csv.DictReader(f))

    # --------------------------------------------------------
    # Group by Project -> BugID
    # --------------------------------------------------------

    projects = defaultdict(lambda: defaultdict(list))

    for row in rows:
        project = row["Project"]
        bug_id = row["BugID"]
        projects[project][bug_id].append(row)

    project_results = []

    # --------------------------------------------------------
    # Calculate each project
    # --------------------------------------------------------

    for project in sorted(projects):
        bugs = projects[project]

        project_rows = [
            row
            for bug_rows in bugs.values()
            for row in bug_rows
        ]

        executable = {
            bug_id
            for bug_id, bug_rows in bugs.items()
            if any(
                row["Status"] in {
                    "COMPLETED",
                    "COVERAGE_FAILED",
                }
                for row in bug_rows
            )
        }

        detected = {
            bug_id
            for bug_id, bug_rows in bugs.items()
            if any(
                row["BugDetected"].strip().upper() == "YES"
                for row in bug_rows
            )
        }

        total_bugs = len(bugs)
        executable_bugs = len(executable)
        detected_bugs = len(detected)

        all_fdr = (
            detected_bugs / total_bugs * 100
            if total_bugs
            else None
        )

        executable_fdr = (
            detected_bugs / executable_bugs * 100
            if executable_bugs
            else None
        )

        dev_line = weighted(
            project_rows,
            "DeveloperLinesCovered",
            "DeveloperLinesTotal",
        )

        utbot_line = weighted(
            project_rows,
            "UTBotLinesCovered",
            "UTBotLinesTotal",
        )

        combined_line = weighted(
            project_rows,
            "CombinedLinesCovered",
            "CombinedLinesTotal",
        )

        dev_condition = weighted(
            project_rows,
            "DeveloperConditionsCovered",
            "DeveloperConditionsTotal",
        )

        utbot_condition = weighted(
            project_rows,
            "UTBotConditionsCovered",
            "UTBotConditionsTotal",
        )

        combined_condition = weighted(
            project_rows,
            "CombinedConditionsCovered",
            "CombinedConditionsTotal",
        )

        line_gain = (
            combined_line - dev_line
            if combined_line is not None
            and dev_line is not None
            else None
        )

        condition_gain = (
            combined_condition - dev_condition
            if combined_condition is not None
            and dev_condition is not None
            else None
        )

        project_results.append({
            "Project": project,
            "TotalBugs": total_bugs,
            "ExecutableBugs": executable_bugs,
            "DetectedBugs": detected_bugs,
            "AllBugFDR": fmt(all_fdr),
            "ExecutableBugFDR": fmt(executable_fdr),
            "DeveloperLineCoverage": fmt(dev_line),
            "UTBotLineCoverage": fmt(utbot_line),
            "CombinedLineCoverage": fmt(combined_line),
            "LineCoverageGain": fmt(line_gain),
            "DeveloperConditionCoverage": fmt(dev_condition),
            "UTBotConditionCoverage": fmt(utbot_condition),
            "CombinedConditionCoverage": fmt(combined_condition),
            "ConditionCoverageGain": fmt(condition_gain),
        })

    # --------------------------------------------------------
    # Write final_summary.csv
    # --------------------------------------------------------

    fields = [
        "Project",
        "TotalBugs",
        "ExecutableBugs",
        "DetectedBugs",
        "AllBugFDR",
        "ExecutableBugFDR",
        "DeveloperLineCoverage",
        "UTBotLineCoverage",
        "CombinedLineCoverage",
        "LineCoverageGain",
        "DeveloperConditionCoverage",
        "UTBotConditionCoverage",
        "CombinedConditionCoverage",
        "ConditionCoverageGain",
    ]

    with FINAL_CSV.open(
        "w",
        encoding="utf-8",
        newline="",
    ) as f:
        writer = csv.DictWriter(
            f,
            fieldnames=fields,
        )

        writer.writeheader()
        writer.writerows(project_results)

    # --------------------------------------------------------
    # Global bug-level metrics
    # --------------------------------------------------------

    all_bugs = {}

    for project, bugs in projects.items():
        for bug_id, bug_rows in bugs.items():
            all_bugs[(project, bug_id)] = bug_rows

    executable_bugs = {
        key
        for key, bug_rows in all_bugs.items()
        if any(
            row["Status"] in {
                "COMPLETED",
                "COVERAGE_FAILED",
            }
            for row in bug_rows
        )
    }

    detected_bugs = {
        key
        for key, bug_rows in all_bugs.items()
        if any(
            row["BugDetected"].strip().upper() == "YES"
            for row in bug_rows
        )
    }

    total_projects = len(projects)
    total_bugs = len(all_bugs)
    total_executable = len(executable_bugs)
    total_detected = len(detected_bugs)

    all_fdr = (
        total_detected / total_bugs * 100
        if total_bugs
        else None
    )

    executable_fdr = (
        total_detected / total_executable * 100
        if total_executable
        else None
    )

    # --------------------------------------------------------
    # Global weighted coverage
    # --------------------------------------------------------

    dev_line = weighted(
        rows,
        "DeveloperLinesCovered",
        "DeveloperLinesTotal",
    )

    utbot_line = weighted(
        rows,
        "UTBotLinesCovered",
        "UTBotLinesTotal",
    )

    combined_line = weighted(
        rows,
        "CombinedLinesCovered",
        "CombinedLinesTotal",
    )

    dev_condition = weighted(
        rows,
        "DeveloperConditionsCovered",
        "DeveloperConditionsTotal",
    )

    utbot_condition = weighted(
        rows,
        "UTBotConditionsCovered",
        "UTBotConditionsTotal",
    )

    combined_condition = weighted(
        rows,
        "CombinedConditionsCovered",
        "CombinedConditionsTotal",
    )

    line_gain = (
        combined_line - dev_line
        if combined_line is not None
        and dev_line is not None
        else None
    )

    condition_gain = (
        combined_condition - dev_condition
        if combined_condition is not None
        and dev_condition is not None
        else None
    )

    # --------------------------------------------------------
    # Detected bugs
    # --------------------------------------------------------

    detected_sorted = sorted(
        detected_bugs,
        key=lambda x: (x[0], int(x[1])),
    )

    detected_text = "\n".join(
        f"- {project}-{bug_id}"
        for project, bug_id in detected_sorted
    )

    # --------------------------------------------------------
    # Markdown project table
    # --------------------------------------------------------

    table_lines = [
        "| Project | Bugs | Executable | Detected | "
        "FDR All | FDR Executable |",
        "|---|---:|---:|---:|---:|---:|",
    ]

    for result in project_results:
        exec_fdr = result["ExecutableBugFDR"]

        table_lines.append(
            f"| {result['Project']} "
            f"| {result['TotalBugs']} "
            f"| {result['ExecutableBugs']} "
            f"| {result['DetectedBugs']} "
            f"| {result['AllBugFDR']}% "
            f"| "
            + (
                f"{exec_fdr}% |"
                if exec_fdr != "N/A"
                else "N/A |"
            )
        )

    project_table = "\n".join(table_lines)

    # --------------------------------------------------------
    # Write final_report.md
    # --------------------------------------------------------

    report = f"""# UTBot Final Experiment Report

## Dataset

- Projects: **{total_projects}**
- Defects4J active bugs: **{total_bugs}**
- Executable bugs: **{total_executable}**
- Detected bugs: **{total_detected}**

## Fault Detection

- All-bug Fault Detection Rate:
  **{fmt(all_fdr)}%**
- Executable-bug Fault Detection Rate:
  **{fmt(executable_fdr)}%**

A defect is counted as detected only when a generated test
fails on the buggy version and passes on the fixed version.

### Detected Bugs

{detected_text}

## Weighted Code Coverage

| Metric | Developer | UTBot | Combined | Gain |
|---|---:|---:|---:|---:|
| Line Coverage | {fmt(dev_line)}% | {fmt(utbot_line)}% | {fmt(combined_line)}% | {fmt(line_gain)} pp |
| Condition Coverage | {fmt(dev_condition)}% | {fmt(utbot_condition)}% | {fmt(combined_condition)}% | {fmt(condition_gain)} pp |

Coverage is calculated using total covered elements divided
by total measurable elements rather than averaging individual
class percentages.

## Results by Project

{project_table}

## Interpretation

UTBot-generated tests detected {total_detected} real defects
from {total_bugs} Defects4J bugs, producing an all-bug fault
detection rate of {fmt(all_fdr)}%.

Among the {total_executable} bugs for which generated tests
could be executed, the fault detection rate was
{fmt(executable_fdr)}%.

The developer test suites achieved {fmt(dev_line)}% weighted
line coverage. UTBot-generated tests alone achieved
{fmt(utbot_line)}%. Combining both test suites increased
weighted line coverage to {fmt(combined_line)}%, a gain of
{fmt(line_gain)} percentage points.

Weighted condition coverage increased from
{fmt(dev_condition)}% to {fmt(combined_condition)}%, a gain
of {fmt(condition_gain)} percentage points.

A major limitation was generated-test compatibility with
older Defects4J projects and their build/runtime environments.
Cases that could not compile or execute were kept separate
from successfully executable cases rather than being counted
as detected defects.
"""

    FINAL_MD.write_text(
        report,
        encoding="utf-8",
    )

    # --------------------------------------------------------
    # Console
    # --------------------------------------------------------

    print("=" * 60)
    print("FINAL REPORT GENERATED")
    print("=" * 60)

    print("Projects        :", total_projects)
    print("Bugs            :", total_bugs)
    print("Executable      :", total_executable)
    print("Detected        :", total_detected)
    print("All-bug FDR     :", f"{fmt(all_fdr)}%")
    print("Executable FDR  :", f"{fmt(executable_fdr)}%")

    print()
    print("Developer Line  :", f"{fmt(dev_line)}%")
    print("UTBot Line      :", f"{fmt(utbot_line)}%")
    print("Combined Line   :", f"{fmt(combined_line)}%")
    print("Line Gain       :", f"{fmt(line_gain)} pp")

    print()
    print("Developer Cond  :", f"{fmt(dev_condition)}%")
    print("UTBot Cond      :", f"{fmt(utbot_condition)}%")
    print("Combined Cond   :", f"{fmt(combined_condition)}%")
    print("Condition Gain  :", f"{fmt(condition_gain)} pp")

    print()
    print("Created:")
    print(FINAL_CSV)
    print(FINAL_MD)
    print("=" * 60)


if __name__ == "__main__":
    main()