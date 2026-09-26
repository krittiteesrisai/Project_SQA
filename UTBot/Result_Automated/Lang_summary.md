# UTBot Experiment Summary — Defects4J Lang

## Experiment Overview

| Metric | Result |
|---|---:|
| Total active bugs | 61 |
| Completed | 15 (24.59%) |
| Test compile incompatible | 42 (68.85%) |
| Generation timeout | 3 (4.92%) |
| Generation failed | 1 (1.64%) |

## Fault Detection

| Metric | Result |
|---|---:|
| Bugs detected | 1 |
| Fault Detection Rate — all bugs | 1.64% |
| Fault Detection Rate — executable bugs | 6.67% |

Detected bug(s):

Lang-45 (org.apache.commons.lang.WordUtils)

A bug is considered detected when a generated test fails on the buggy
version and the same test passes on the corresponding fixed version.

## Test Generation

| Metric | Result |
|---|---:|
| Generated tests | 4062 |
| Average tests per completed bug | 270.80 |
| Average generation time | 116.46 s |
| Total generation time | 1746.93 s |
| Total generation time | 29.12 min |

## Line Coverage

| Test Suite | Average Coverage |
|---|---:|
| Developer tests | 97.49% |
| UTBot tests | 63.19% |
| Combined | 98.15% |

Average line coverage gain:

**+0.66 percentage points**

## Condition Coverage

| Test Suite | Average Coverage |
|---|---:|
| Developer tests | 90.06% |
| UTBot tests | 55.95% |
| Combined | 91.92% |

Average condition coverage gain:

**+1.86 percentage points**

## Interpretation Notes

- Fault Detection Rate for all bugs uses all 61 active
  Defects4J Lang bugs as the denominator.
- Executable Fault Detection Rate uses only the 15 bugs whose
  generated tests could be executed successfully.
- TEST_COMPILE_INCOMPATIBLE cases are not classified as undetected bugs.
- GENERATION_TIMEOUT cases are not classified as undetected bugs.
- GENERATION_FAILED cases are not classified as undetected bugs.
- Coverage averages are calculated only from COMPLETED experiments.
