package stack;

/**
 * Description: 1021. 删除最外层的括号
 * Created by ldc on 2021/3/19 下午9:51.
 *
 * @author ldc
 */
public class RemoveOuterParentheses {

    public String removeOuterParentheses(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0, pre = 0, count = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count != 0) {
                continue;
            }
            stringBuilder.append(S.substring(pre + 1, i));
            pre = i + 1;
        }

        return stringBuilder.toString();
    }
}
