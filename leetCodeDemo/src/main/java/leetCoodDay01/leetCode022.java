package leetCoodDay01;

import java.util.ArrayList;
import java.util.List;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 */
public class leetCode022 {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list,new StringBuilder(),0,0,n);
        return list;
    }
    public void backtrack(List<String> list,StringBuilder stringBuilder,int left,int right,int n){
        if (stringBuilder.length() == n*2){
            list.add(stringBuilder.toString());
        }
        if (left<n){
            stringBuilder.append("(");
            backtrack(list,stringBuilder,left+1,right,n);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
        if (right<left){
            stringBuilder.append(")");
            backtrack(list,stringBuilder,left,right+1,n);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
