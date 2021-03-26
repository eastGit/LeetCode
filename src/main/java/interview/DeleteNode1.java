package interview;

/**
 * Description: 剑指 Offer 18. 删除链表的节点
 * Created by ldc on 2021/3/24 上午11:16.
 *
 * @author ldc
 */
public class DeleteNode1 {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode hair = new ListNode(0, head), pre = hair;
        while (pre.next != null){
            if (pre.next.val == val){
                pre.next = pre.next.next;
            }else {
                pre = pre.next;
            }
        }
        return hair.next;
    }
}
