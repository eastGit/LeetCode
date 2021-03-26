package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description: 636. 函数的独占时间
 * Created by ldc on 2021/3/22 下午4:55.
 *
 * @author ldc
 */
public class ExclusiveTime {

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<Integer> vID = new LinkedList<Integer>();
        for (int i = 0, pre = 0; i < logs.size(); i++) {
            String[] split = logs.get(i).split(":");
            int id = Integer.valueOf(split[0]);
            String status = split[1];
            Integer time = Integer.valueOf(split[2]);
            if (!vID.isEmpty()) {
                int stamp = 0;
                if (status.equals("end")) {
                    stamp = 1;
                }
                ans[vID.peek()] += time - pre + stamp;
                pre = time + stamp;
            }

            if (status.equals("start")) {
                vID.push(id);
            } else {
                vID.pop();
            }

        }

        return ans;

    }
}
