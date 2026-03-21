public class MergeSortCounter {

    public static SortResult sort(int[] arr) {
        int[] a = arr.clone();
        long[] count = new long[1];

        mergeSort(a, 0, a.length - 1, count);

        return new SortResult(a, count[0]);
    }

    private static void mergeSort(int[] a, int left, int right, long[] count) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(a, left, mid, count);
            mergeSort(a, mid + 1, right, count);
            merge(a, left, mid, right, count);
        }
    }

    private static void merge(int[] a, int left, int mid, int right, long[] count) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = a[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = a[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            count[0]++;
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
