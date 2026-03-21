import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExperimentRunner {

    public static void runAllExperiments() {
        int[] nValues = {4, 6, 8};

        for (int n : nValues) {
            System.out.println("==================================================");
            System.out.println("Running experiments for n = " + n);
            System.out.println("==================================================");

            List<int[]> permutations = PermutationGenerator.generatePermutations(n);

            runForAlgorithm("Shaker Sort", permutations);
            runForAlgorithm("Quick Sort", permutations);
            runForAlgorithm("Merge Sort", permutations);
            runForAlgorithm("Heap Sort", permutations);

            System.out.println();
        }
    }

    private static void runForAlgorithm(String algorithmName, List<int[]> permutations) {
        List<ExperimentRecord> records = new ArrayList<>();
        long totalComparisons = 0;

        for (int[] arr : permutations) {
            SortResult result;

            if (algorithmName.equals("Shaker Sort")) {
                result = ShakerSortCounter.sort(arr);
            } else if (algorithmName.equals("Quick Sort")) {
                result = QuickSortCounter.sort(arr);
            } else if (algorithmName.equals("Merge Sort")) {
                result = MergeSortCounter.sort(arr);
            } else {
                result = HeapSortCounter.sort(arr);
            }

            ExperimentRecord record =
                    new ExperimentRecord(algorithmName, arr, result.getComparisons());

            records.add(record);
            totalComparisons += result.getComparisons();
        }

        Collections.sort(records, Comparator.comparingLong(ExperimentRecord::getComparisons));

        double average = (double) totalComparisons / records.size();

        System.out.println("Algorithm: " + algorithmName);
        System.out.println("Total permutations: " + records.size());
        System.out.println("Average comparisons: " + average);
        System.out.println();

        System.out.println("Best 10 cases:");
        printTop(records, 0, 10);

        System.out.println();
        System.out.println("Worst 10 cases:");
        printTop(records, Math.max(records.size() - 10, 0), records.size());

        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    private static void printTop(List<ExperimentRecord> records, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.println(records.get(i));
        }
    }
}
