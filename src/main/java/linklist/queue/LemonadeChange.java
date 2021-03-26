package linklist.queue;

/**
 * Description:LeetCode 860
 * Created by ldc on 2021/3/15 上午12:56.
 *
 * @author ldc
 */
public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (bills[i] == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        LemonadeChange lemonadeChange = new LemonadeChange();
        int[] bills = new int[]{5, 5, 5, 10, 5, 5, 10, 20, 20, 20};
        System.out.println(lemonadeChange.lemonadeChange(bills));
    }
}
