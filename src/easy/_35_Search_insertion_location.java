package easy;

public class _35_Search_insertion_location {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target <= nums[mid]) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
