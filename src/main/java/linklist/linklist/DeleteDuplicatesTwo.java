package linklist.linklist;

/**
 * Description:  82. 删除排序链表中的重复元素 II
 * Created by ldc on 2021/3/15 下午5:22.
 *
 * @author ldc
 */
public class DeleteDuplicatesTwo {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode hair = new ListNode(0, head), pre = hair, curr = head;
        while (curr != null){
            while (curr.next != null && curr.val == curr.next.val){
                curr = curr.next;
            }
            //判断头节点是否出现重复数
            if (pre.next == curr){
                pre = pre.next;
            }else {
                pre.next = curr.next;
            }
            curr = curr.next;
        }

        return hair.next;
    }
}
