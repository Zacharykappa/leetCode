package leetCoodDay02;

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组 是数组中的一个连续部分。
 *
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 */
public class leetCode053 {

    /**
     * 暴力法 || 分治法 || 动态规划
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        //用来记录当前最大和 如果当前值小于0 则取num[i+1] ,若大于0 则与num[i+1]相加 在比较大小
        int[] dp = new int[n];
        dp[0]=nums[0];
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1]>0){
                dp[i] = dp[i-1]+ nums[i];
            }else {
                dp[i] = nums[i];
            }
            res  = Math.max(res, dp[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(a);
        System.out.println(i);
    }
}
