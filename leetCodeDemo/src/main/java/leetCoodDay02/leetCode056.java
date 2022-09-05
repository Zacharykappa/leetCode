package leetCoodDay02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 *
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 *
 */
public class leetCode056 {

    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> result = new ArrayList();
        if (intervals == null || intervals.length<2){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        for (int[] interval : intervals) {
            if (result.size()==0||result.get(result.size()-1)[1]<interval[0]){
                result.add(interval);
            }else {
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
