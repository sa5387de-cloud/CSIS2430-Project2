public class SortResult {
  private int[] sortedArray;
  private long comparisons;

  public SortResult(int[] sortedArray, long comparisons) {
    this.sortedArray = sortedArray;
    this.comparisons = comparisons;
  }

  public int[] getSortedArray() {
    return sortedArray;
  }

  public long getComparisons() {
    return comparisons;
  }
  
}
