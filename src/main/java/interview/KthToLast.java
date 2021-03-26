package interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description: 面试题 02.02. 返回倒数第 k 个节点
 * Created by ldc on 2021/3/23 下午3:15.
 *
 * @author ldc
 */
public class KthToLast {

    public int kthToLast(ListNode head, int k) {
        Deque<Integer> stack = new LinkedList<Integer>();
        ListNode pre = head;
        while (pre != null){
            stack.push(pre.val);
            pre = pre.next;
        }
        int result = 0;
        for (int i=0; i<k; i++){
            result = stack.pop();
        }

        return result;
    }
}
