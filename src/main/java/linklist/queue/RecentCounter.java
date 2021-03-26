package linklist.queue;

import java.util.LinkedList;

/**
 * Description: LeetCode 933. 最近的请求次数
 * Created by ldc on 2021/3/15 下午8:04.
 *
 * @author ldc
 */
public class RecentCounter {

    LinkedList<Integer> queue = new LinkedList<Integer>();

    public RecentCounter() {

    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
