package leetCoodDay02;

/**
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 */
public class leetCodeOffer03 {

    public int findRepeatNumber(int[] nums) {
        if (nums.length ==0||nums==null){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0||nums[i]>nums.length-1){
                return -1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            while (i!=nums[i]){
                // nums[nums[i]]==nums[i] 某个位置上的值 与 以某个位置上的值为下标的值相等 则重复
                if (nums[nums[i]]==nums[i]){
                    return nums[i];
                }else {
                    int temp = nums[i];
                    nums[i]=nums[temp];
                    nums[temp] = temp;
                }
            }

        }
        return -1;
    }
}
