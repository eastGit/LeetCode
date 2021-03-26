package stack;

import java.util.HashMap;

/**
 * Description: 1124. 表现良好的最长时间段
 * Created by ldc on 2021/3/22 下午10:40.
 *
 * @author ldc
 */
public class LongestWPI {

    public int longestWPI(int[] hours) {
        int sum = 0;
        int res = 0;
        HashMap<Integer, Integer> sumToIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] > 8) {
                sum++;
            } else {
                sum--;
            }

            if (sum > 0) {
                res = i + 1;
            } else {
                if (!sumToIndex.containsKey(sum)) {
                    sumToIndex.put(sum, i);
                }

                if (sumToIndex.containsKey(sum - 1)) {
                    res = Math.max(res, i - sumToIndex.get(sum - 1));
                }
            }
        }

        return res;

    }
}
