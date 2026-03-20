public class QuickSortCounter {

    public static SortResult sort(int[] arr) {
        int[] a = arr.clone();
        long[] count = new long[1];

        quickSort(a, 0, a.length - 1, count);

        return new SortResult(a, count[0]);
    }

    private static void quickSort(int[] a, int low, int high, long[] count) {
        if (low < high) {
            int pi = partition(a, low, high, count);
            quickSort(a, low, pi - 1, count);
            quickSort(a, pi + 1, high, count);
        }
    }

    private static int partition(int[] a, int low, int high, long[] count) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            count[0]++;
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
