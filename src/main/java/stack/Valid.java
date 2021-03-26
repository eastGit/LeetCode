package stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * Description:
 * Created by ldc on 2021/3/19 下午9:31.
 *
 * @author ldc
 */
public class Valid {

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)){
                case '(':
                case '{':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty() || map.get(s.charAt(i)).equals(stack.peek())){
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }
}
