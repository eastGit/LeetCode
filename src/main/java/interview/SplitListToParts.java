package interview;

/**
 * Description:725. 分隔链表
 * Created by ldc on 2021/3/24 下午7:03.
 *
 * @author ldc
 */
public class SplitListToParts {

    public ListNode[] splitListToParts(ListNode root, int k) {
        ListNode pre = root;
        int length = 0;
        while (pre != null) {
            pre = pre.next;
            length++;
        }
        ListNode[] result = new ListNode[k];
        ListNode curr = root;
        int size = length / k;
        int rem = length % k;
        for (int i = 0; i < k; i++) {
            ListNode head = curr;
            for (int j = 0; j < size + (i < rem ? 1 : 0) - 1; j++) {
                if (curr != null) {
                    curr = curr.next;
                }
            }
            if (curr != null) {
                ListNode node = curr;
                curr = curr.next;
                node.next = null;
            }

            result[i] = head;
        }

        return result;
    }
}
