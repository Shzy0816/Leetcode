package easy;

public class _88_Merge_two_ordered_arrays {
    public static void main(String[] args){

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = 0;
        while (mergeIndex < m + n) {
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;
            if(leftIndex < m){
                left = temp[leftIndex];
            }
            if(rightIndex < n){
                right = nums2[rightIndex];
            }

            if (left <= right) {
                nums1[mergeIndex] = left;
                leftIndex ++;
            } else {
                nums1[mergeIndex] = right;
                rightIndex ++;
            }
            mergeIndex++;
        }
    }
}
