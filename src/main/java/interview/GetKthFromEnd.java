package interview;

/**
 * Description: 剑指 Offer 22. 链表中倒数第k个节点
 * Created by ldc on 2021/3/23 下午4:21.
 *
 * @author ldc
 */
public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, fast = head;
        while (k-->0){
            fast = fast.next;
        }

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
