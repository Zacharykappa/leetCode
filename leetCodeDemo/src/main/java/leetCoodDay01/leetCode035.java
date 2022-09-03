package leetCoodDay01;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 */
public class leetCode035 {

    // 普通解法
//    public static int searchInsert(int[] nums, int target) {
//        if (nums == null||nums.length==0){
//            return 0;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= target){
//                return i;
//            }
//        }
//        return nums.length;
//    }

    //二分法
    public static int searchInsert(int[] nums, int target) {
        if (nums == null||nums.length==0){
            return 0;
        }
        int left = 0;
        int right =nums.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if (nums[mid]==target){
                return mid;
            }else if (nums[mid]>target){
                right = mid;
            }else {
                left = mid+1;
            }
        }
        return nums[left] < target?left+1:left;
    }

    public static void main(String[] args) {
        int[] a={1,3,5,6};
        int i = searchInsert(a, 5);
        System.out.println(i);
    }
}
