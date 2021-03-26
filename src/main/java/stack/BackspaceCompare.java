package stack;

/**
 * Description: 844. 比较含退格的字符串
 * Created by ldc on 2021/3/19 下午8:31.
 *
 * @author ldc
 */
public class BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        return backspace(S).equals(backspace(T));
    }

    public String  backspace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#'){
                if (sb.length() != 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
