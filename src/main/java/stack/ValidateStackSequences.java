package stack;

import java.util.Stack;

/**
 * Description: 946. 验证栈序列
 * Created by ldc on 2021/3/19 下午9:22.
 *
 * @author ldc
 */
public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<Integer>();
        int pos = 0;
        for (int n : pushed) {
            stack.push(n);
            while (stack.empty() && pos < popped.length && stack.peek() == popped[pos]){
                stack.pop();
                pos++;
            }
        }
        return stack.isEmpty();
    }
}
