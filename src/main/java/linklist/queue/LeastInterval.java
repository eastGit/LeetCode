package linklist.queue;

import java.util.Arrays;

/**
 * Description:LeetCode 621 任务调度器
 * Created by ldc on 2021/3/15 上午10:39.
 *
 * @author ldc
 */
public class LeastInterval {

    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            cnt[tasks[i] - 'A']++;
        }
        Arrays.sort(cnt);
        int m = 0;
        for (int i = 25; i > 0 && cnt[i] == cnt[25]; i--, m++){}

        return Math.max(tasks.length, (cnt[25] - 1) * (n + 1) + m);
    }

    public static void main(String[] args) {
        LeastInterval leastInterval = new LeastInterval();
        char[] tasks = new char[]{'A','A','A','A','A','B','B','B', 'B','B','C', 'D'};
        System.out.println(leastInterval.leastInterval(tasks, 2));
    }
}
