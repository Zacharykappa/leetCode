package leetCoodDay01;

/**
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 *
 * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
 * 输出：5, nums = [0,1,4,0,3]
 * 解释：函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。注意这五个元素可为任意顺序。你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class leetCode027 {

    public int removeElement(int[] nums, int val) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            while (left<right&&nums[left] !=val){
                left++;
            }
            while (left<right&&nums[right] ==val){
                right--;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        if (nums[left]==val){
            return left;
        }else {
            return left+1;
        }
    }
}
