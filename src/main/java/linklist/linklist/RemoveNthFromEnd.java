package linklist.linklist;

/**
 * Description: LeetCode 19. 删除链表的倒数第 N 个结点
 * Created by ldc on 2021/3/15 下午5:12.
 *
 * @author ldc
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hair = new ListNode(0, head), slow = hair, fast = head;
        while (n > 0){
            fast = fast.next;
            n--;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return hair.next;
    }
}
