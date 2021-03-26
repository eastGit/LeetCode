package interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * Created by ldc on 2021/3/23 下午4:17.
 *
 * @author ldc
 */
public class KthToLast1 {

    public int kthToLast(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        while (k-- > 0) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.val;
    }
}
