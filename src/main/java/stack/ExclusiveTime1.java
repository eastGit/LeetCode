package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * Created by ldc on 2021/3/22 下午10:26.
 *
 * @author ldc
 */
public class ExclusiveTime1 {
    class Task{
        int id=0;
        int time = 0;
        boolean isStart =true;
        Task(String[] split){
            id = Integer.valueOf(split[0]);
            time = Integer.valueOf(split[2]);
            isStart = split[1].equals("start");
        }
    }

    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<Task> stack = new LinkedList<Task>();
        for (String log : logs) {
            Task task = new Task(log.split(":"));
            if (task.isStart){
                stack.push(task);
            }else {
                Task last = stack.pop();
                int duration = task.time - last.time + 1;
                ans[task.id] += duration;
                if (!stack.isEmpty()){
                    ans[stack.peek().id] -= duration;
                }

            }
        }
        return ans;
    }
}
