package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description: 1249. 移除无效的括
 * Created by ldc on 2021/3/22 下午8:35.
 *
 * @author ldc
 */
public class MinRemoveToMakeValid1 {

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Deque<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i) == '('){
                stack.push(i);
            }else if (s.charAt(i) == ')'){
                if (!stack.isEmpty() && s.charAt(stack.peek()) == ')'){
                    stack.pop();
                }
            }else {
                stack.push(i);
            }
        }

        for (Integer index : stack){
            sb.deleteCharAt(index);
        }

        return sb.toString();
    }
}
