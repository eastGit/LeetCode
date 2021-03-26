package stack;

import java.util.Stack;

/**
 * Description: 682. 棒球比赛
 * Created by ldc on 2021/3/19 下午8:15.
 *
 * @author ldc
 */
public class CalPoints {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for (String  op : ops) {
            if ("D".equals(op)) {
                stack.push(2 * stack.peek());
            } else if ("+".equals(op)) {
                int a = stack.pop();
                int b = stack.peek() + a;
                stack.push(a);
                stack.push(b);
            } else if ("C".equals(op)) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        while (!stack.empty()){
            result += stack.pop();
        }
        return result;
    }
}
