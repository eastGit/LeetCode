package linklist.happynum;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:快乐数
 * Created by ldc on 2021/3/5 上午11:20.
 *
 * @author ldc
 */
public class HappyNum {

    /**
     * 是否快乐数
     * @param n
     * @return
     */
    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do {
            slow = getNextNode(slow);
            fast = getNextNode(getNextNode(fast));
        }while (slow != fast);

        return slow == 1;
    }

    private static int getNextNode(int n) {
        int sum = 0;
        while (n > 0){
            sum += (n%10)*(n%10);
            n = n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 100000;
        int sum = 0;
        List<Integer> happyList = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
            if (isHappy(i)){
                happyList.add(i);
                sum += i;
            }
        }
        System.out.println(sum);
        System.out.println(happyList.toString());
    }
}
