package leetCoodDay02;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 *
 * 输入：n = 4, k = 2
 * 输出：
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
public class leetCode077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        //记录当前值是否被选用
        backtrace(n,k,lists,1,list);
        return lists;
    }

    /**
     * 
     * @param n 
     * @param k 数组个数
     * @param lists 最终结果
     * @param begin 开始位置
     * @param list
     */
    private void backtrace(int n, int k, List<List<Integer>> lists, int begin, List<Integer> list) {
        if (list.size() ==k){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = begin; i <= n; i++) {
            list.add(i);
            backtrace(n,k,lists,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
