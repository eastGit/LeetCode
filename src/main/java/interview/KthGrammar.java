package interview;

/**
 * Description: 779. 第K个语法符号
 * Created by ldc on 2021/3/24 下午7:31.
 *
 * @author ldc
 */
public class KthGrammar {

    public int kthGrammar(int N, int K) {
        return Integer.bitCount(K-1);
    }
}
