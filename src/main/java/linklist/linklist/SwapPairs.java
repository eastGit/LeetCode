package linklist.linklist;

/**
 * Description: LeetCode 24 两两交换链表中的节点
 * Created by ldc on 2021/3/15 下午5:02.
 *
 * @author ldc
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode hair = new ListNode(0, head), pre = hair;
        while (pre.next != null && pre.next.next != null){
            ListNode one = pre.next;
            ListNode two = pre.next.next;
            one.next = two.next;
            two.next = one;
            pre.next = two;
            pre = one;
        }

        return hair.next;
    }
}
