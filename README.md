# CSIS 2430 - Programming Project 2
## Sorting Algorithms, Efficiency, and Performance


## 1. Project Overview

This project implements and compares four sorting algorithms using a data-driven approach.

The goal is to analyze performance by counting the number of element-to-element comparisons each algorithm makes.

All possible permutations of integer arrays (from 0 to n-1) are generated and used as input.



## 2. Algorithms Implemented

- Shaker Sort (Bidirectional Bubble Sort)
- Quick Sort
- Merge Sort
- Heap Sort

Each algorithm returns:
- The sorted array
- The number of comparisons performed



## 3. Comparison Counting Rule

Only element-to-element comparisons are counted.

Counted:
- a[i] < a[j]
- a[i] > a[j]

Not counted:
- Loop conditions
- Index comparisons



## 4. Experiment Details

Experiments are performed for:

- n = 4
- n = 6
- n = 8

For each n:
- All permutations are generated
- Each permutation is sorted using all four algorithms
- Comparison counts are recorded



## 5. Output Description

For each algorithm and each value of n, the program outputs:

- Total number of permutations
- Average number of comparisons
- Best 10 cases (fewest comparisons)
- Worst 10 cases (most comparisons)



## 6. Project Structure

src/
  Main.java
  ExperimentRunner.java
  ExperimentRecord.java
  PermutationGenerator.java
  SortResult.java
  ShakerSortCounter.java
  QuickSortCounter.java
  MergeSortCounter.java
  HeapSortCounter.java



## 7. How to Run

1. Open the project in a Java IDE (Eclipse, IntelliJ, etc.)
2. Make sure the src folder is set as the source folder
3. Run Main.java

The program will automatically execute all experiments and print results to the console.



## 8. Notes

- Running with n = 8 may take some time (40320 permutations)
- All algorithms use the same comparison counting logic
- Results are used for analysis in the final report



## 9. Team Members

- Your Name
- Teammate Name
- Teammate Name



## 10. Contributions

See CONTRIBUTIONS.md for details about team responsibilities.
