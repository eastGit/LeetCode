package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 331. 验证二叉树的前序序列化
 * Created by ldc on 2021/3/21 下午5:59.
 *
 * @author ldc
 */
public class ValidSerialization {

    public boolean isValidSerialization(String preorder) {
        String[] strings = preorder.split(",");
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i]);
            int lastIndex = list.size() -1;
            while (list.size() >=3 && list.get(lastIndex).equals("#")
                    && list.get(lastIndex-1).equals("#") && !list.get(lastIndex-2).equals("#")){
                list.set(lastIndex -2, "#");
                list.remove(lastIndex);
                list.remove(lastIndex-1);
                lastIndex = list.size() -1;
            }
        }
        return list.size() == 1 && list.get(0).equals("#");
    }

    public static void main(String[] args) {
        ValidSerialization serialization = new ValidSerialization();
        boolean validSerialization = serialization.isValidSerialization("#");
        System.out.println(validSerialization);
    }
}
