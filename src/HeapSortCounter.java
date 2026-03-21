public class HeapSortCounter {

    public static SortResult sort(int[] arr) {
        int[] a = arr.clone();
        long[] count = new long[1];

        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i, count);
        }

        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, i, 0, count);
        }

        return new SortResult(a, count[0]);
    }

    private static void heapify(int[] a, int n, int i, long[] count) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n) {
            count[0]++;
            if (a[left] > a[largest]) {
                largest = left;
            }
        }

        if (right < n) {
            count[0]++;
            if (a[right] > a[largest]) {
                largest = right;
            }
        }

        if (largest != i) {
            swap(a, i, largest);
            heapify(a, n, largest, count);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
