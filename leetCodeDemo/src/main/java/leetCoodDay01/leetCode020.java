package leetCoodDay01;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 */
public class leetCode020 {

    public static boolean isValid(String s) {
        if (s.length()==0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c=='('||c=='{'||c=='['){
                stack.add(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                Character temp = stack.pop();
                if (c==')'){
                    if (temp !='('){
                        return false;
                    }
                }else if (c=='}'){
                    return temp!='{'? false:true;
                }else if (c==']'){
                    return temp!='['? false:true;
                }
            }
        }
        return stack.isEmpty() ? true :false;
    }

    public static void main(String[] args) {
        String s = "([)]";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
