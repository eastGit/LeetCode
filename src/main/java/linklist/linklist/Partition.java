package linklist.linklist;


/**
 * Description: leetCode 86
 * Created by ldc on 2021/3/12 下午8:19.
 *
 * @author ldc
 */
public class Partition {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0, head);
        ListNode smallHair = small;
        ListNode large = new ListNode(0, head);
        ListNode largeHair = large;
        while (head != null){
            if (head.val < x){
                small.next = head;
                small = small.next;
            }else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHair.next;
        return  smallHair.next;
    }

}
