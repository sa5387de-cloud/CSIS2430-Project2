public class ShakerSortCounter {
  
  public static SortResult sort(int[] arr) {
        int[] a = arr.clone();
        long count = 0;

        boolean swapped = true;
        int start = 0;
        int end = a.length - 1;

        while (swapped) {
            swapped = false;
          
            for (int i = start; i < end; i++) {
                count++;
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;

            swapped = false;
            end--;

            for (int i = end; i > start; i--) {
                count++;
                if (a[i] < a[i - 1]) {
                    swap(a, i, i - 1);
                    swapped = true;
                }
            }

            start++;
        }

        return new SortResult(a, count);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
