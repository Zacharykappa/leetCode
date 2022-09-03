package leetCoodDay01;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 *
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */
public class leetCode046 {
    //回溯算法

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //获取数组个数
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        //记录当前值是否被选用
        Boolean[] flag = new Boolean[n];
        //当前层数
        int depth = 0 ;
        backtrace(list,depth,flag,nums,lists);
        return lists;
    }

    private void backtrace(List<Integer> list, int depth, Boolean[] flag, int[] nums, List<List<Integer>> lists) {
        //如果当前层数与数组长度相等
        if (depth==nums.length){
            lists.add(new ArrayList<Integer>(list));
        }
        //循环标记数组
        for (int i = 0; i < flag.length; i++) {
            if (!flag[i]){
                list.add(nums[i]);
                flag[i] = true;
                backtrace(list,depth+1,flag,nums,lists);
                //没懂？
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }
    }


}
