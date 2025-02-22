package arrays.Sorting;

class FirstNumberPositive41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // Cyclic sort to place numbers in their correct positions
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find the first missing positive
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        // If all are in correct positions, return n + 1
        return n + 1;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        FirstNumberPositive41 solution = new FirstNumberPositive41();
        int[] nums = {3, 4, -1, 1};
        System.out.println(solution.firstMissingPositive(nums)); // Expected output: 2
    }
}

