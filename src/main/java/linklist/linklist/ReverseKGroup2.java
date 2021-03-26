package linklist.linklist;

/**
 * Description: K个为一组旋转
 * Created by ldc on 2021/3/15 下午5:35.
 *
 * @author ldc
 */
public class ReverseKGroup2 {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode hair = new ListNode(0, head), pre = hair, tail = null;
        ;
        while (head != null) {
            tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return hair.next;
                }
            }

            ListNode[] reverse = reverse(head, tail);
            head = reverse[0];
            tail = reverse[1];
            pre.next = head;
            pre = tail;
            head = pre.next;
        }
        return hair.next;
    }

    /**
     * 反转tail
     * @param head
     * @param tail
     * @return
     */
    private ListNode[] reverse(ListNode head, ListNode tail) {
        ListNode pre = tail.next, curr = head, next = null;
        while (pre != tail) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return new ListNode[]{tail, head};
    }
}
