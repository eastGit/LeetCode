package stack;

/**
 * Description:  331. 验证二叉树的前序序列化
 * Created by ldc on 2021/3/22 下午9:35.
 *
 * @author ldc
 */
public class ValidSerialization1 {

    public boolean isValidSerialization(String preorder) {
        int i=0;
        int slots = 1;
        int length = preorder.length();
        while (i< length){
            if (slots == 0){
                return false;
            }
            if (preorder.charAt(i) == ','){
                i++;
            }else if(preorder.charAt(i) == '#'){
                slots--;
                i++;
            }else {
                while (i<length && preorder.charAt(i) == ','){
                    i++;
                }
                slots++;
            }
        }
        return slots == 0;
    }
}
