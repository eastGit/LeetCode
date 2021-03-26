package linklist.linklist;


/**
 * Description: LeetCdde61 链接右移k位
 * Created by ldc on 2021/3/15 下午4:43.
 *
 * @author ldc
 */
public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return null;
        }
        int length = 0;
        ListNode oldTail = head;
        while (head.next != null) {
            oldTail = oldTail.next;
            length++;
        }
        //形成闭环
        oldTail.next = head;
        ListNode newTail = head;
        for (int i = 0; i < length - k % length - 1; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        //断开环
        newTail.next = null;
        return newHead;
    }
}
