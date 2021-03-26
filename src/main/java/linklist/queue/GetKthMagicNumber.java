package linklist.queue;


/**
 * Description: LeetCode 17.09 第k个数
 * Created by ldc on 2021/3/15 上午12:11.
 *
 * @author ldc
 */
public class GetKthMagicNumber {

    public int getKthMagicNumber(int k) {
        int[] arr = new int[k];
        arr[0] = 1;
        int p3 = 0, p5 = 0, p7 = 0;
        for (int i = 1; i < k; i++) {
            int ans = 3 * arr[p3];
            ans = Math.min(ans, 5 * arr[p5]);
            ans = Math.min(ans, 7 * arr[p7]);
            arr[i] = ans;
            if (3 * arr[p3] == ans) {
                p3++;
            }
            if (5 * arr[p5] == ans) {
                p5++;
            }
            if (7 * arr[p7] == ans) {
                p7++;
            }
        }

        return arr[k-1];
    }

    public static void main(String[] args) {
        GetKthMagicNumber k = new GetKthMagicNumber();
        System.out.println(k.getKthMagicNumber(5));

    }
}
