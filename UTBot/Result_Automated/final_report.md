# UTBot Final Experiment Report

## Dataset

- Projects: **17**
- Defects4J active bugs: **854**
- Executable bugs: **139**
- Detected bugs: **7**

## Fault Detection

- All-bug Fault Detection Rate:
  **0.82%**
- Executable-bug Fault Detection Rate:
  **5.04%**

A defect is counted as detected only when a generated test
fails on the buggy version and passes on the fixed version.

### Detected Bugs

- Cli-5
- Codec-2
- Codec-18
- Compress-14
- Lang-45
- Math-3
- Math-54

## Weighted Code Coverage

| Metric | Developer | UTBot | Combined | Gain |
|---|---:|---:|---:|---:|
| Line Coverage | 89.25% | 53.24% | 92.41% | 3.17 pp |
| Condition Coverage | 83.27% | 45.75% | 87.17% | 3.91 pp |

Coverage is calculated using total covered elements divided
by total measurable elements rather than averaging individual
class percentages.

## Results by Project

| Project | Bugs | Executable | Detected | FDR All | FDR Executable |
|---|---:|---:|---:|---:|---:|
| Chart | 26 | 1 | 0 | 0.00% | 0.00% |
| Cli | 39 | 4 | 1 | 2.56% | 25.00% |
| Closure | 174 | 6 | 0 | 0.00% | 0.00% |
| Codec | 18 | 4 | 2 | 11.11% | 50.00% |
| Collections | 28 | 0 | 0 | 0.00% | N/A |
| Compress | 47 | 8 | 1 | 2.13% | 12.50% |
| Csv | 16 | 0 | 0 | 0.00% | N/A |
| Gson | 18 | 5 | 0 | 0.00% | 0.00% |
| JacksonCore | 26 | 0 | 0 | 0.00% | N/A |
| JacksonDatabind | 110 | 3 | 0 | 0.00% | 0.00% |
| JacksonXml | 6 | 0 | 0 | 0.00% | N/A |
| Jsoup | 93 | 8 | 0 | 0.00% | 0.00% |
| JxPath | 22 | 1 | 0 | 0.00% | 0.00% |
| Lang | 61 | 15 | 1 | 1.64% | 6.67% |
| Math | 106 | 68 | 2 | 1.89% | 2.94% |
| Mockito | 38 | 5 | 0 | 0.00% | 0.00% |
| Time | 26 | 11 | 0 | 0.00% | 0.00% |

## Interpretation

UTBot-generated tests detected 7 real defects
from 854 Defects4J bugs, producing an all-bug fault
detection rate of 0.82%.

Among the 139 bugs for which generated tests
could be executed, the fault detection rate was
5.04%.

The developer test suites achieved 89.25% weighted
line coverage. UTBot-generated tests alone achieved
53.24%. Combining both test suites increased
weighted line coverage to 92.41%, a gain of
3.17 percentage points.

Weighted condition coverage increased from
83.27% to 87.17%, a gain
of 3.91 percentage points.

A major limitation was generated-test compatibility with
older Defects4J projects and their build/runtime environments.
Cases that could not compile or execute were kept separate
from successfully executable cases rather than being counted
as detected defects.
