package linklist.linklist;

/**
 * Description: LeetCode 83. 删除排序链表中的重复元素
 * Created by ldc on 2021/3/15 下午5:17.
 *
 * @author ldc
 */
public class DeleteDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
