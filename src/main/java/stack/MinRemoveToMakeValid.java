package stack;

/**
 * Description: 1249. 移除无效的括
 * Created by ldc on 2021/3/21 上午11:29.
 *
 * @author ldc
 */
public class MinRemoveToMakeValid {

    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int len = 0;
        for (int i = 0, cnt = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) != ')') {
                if (s.charAt(i) == '(') {
                    cnt += 1;
                }
                sb.append(s.charAt(i));
            } else {
                if (cnt == 0) {
                    continue;
                }
                cnt -= 1;
                sb.append(')');
            }
        }

        StringBuilder reverse = sb.reverse();
        for (int i = 0, cnt = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) == ')' || reverse.charAt(i) != '(') {
                if (reverse.charAt(i) == ')') {
                    cnt += 1;
                }
                result.append(reverse.charAt(i));
            } else {
                if (cnt == 0) {
                    continue;
                }
                cnt -= 1;
                result.append('(');
            }
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        MinRemoveToMakeValid makeValid = new MinRemoveToMakeValid();
        System.out.println(makeValid.minRemoveToMakeValid("lee(t(c)o)de)"));
    }
}
