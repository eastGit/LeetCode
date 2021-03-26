package interview;

/**
 * Description:  剑指 Offer 10- I. 斐波那契数列
 * Created by ldc on 2021/3/24 下午7:20.
 *
 * @author ldc
 */
public class Fib {

    public int fib(int n) {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a+b) % 1000000007;
            a = b;
            b = sum;
        }

        return a;
    }
}
