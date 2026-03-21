import java.util.Arrays;

public class ExperimentRecord {
    private String algorithmName;
    private int[] inputArray;
    private long comparisons;

    public ExperimentRecord(String algorithmName, int[] inputArray, long comparisons) {
        this.algorithmName = algorithmName;
        this.inputArray = inputArray.clone();
        this.comparisons = comparisons;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }

    public int[] getInputArray() {
        return inputArray.clone();
    }

    public long getComparisons() {
        return comparisons;
    }

    @Override
    public String toString() {
        return algorithmName + " | " + Arrays.toString(inputArray) + " | comparisons = " + comparisons;
    }
}
