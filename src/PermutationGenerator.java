import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator {

    public static List<int[]> generatePermutations(int n) {
        List<int[]> result = new ArrayList<>();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }

        permute(nums, 0, result);
        return result;
    }

    private static void permute(int[] nums, int start, List<int[]> result) {
        if (start == nums.length) {
            int[] copy = nums.clone();
            result.add(copy);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permute(nums, start + 1, result);
            swap(nums, start, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
