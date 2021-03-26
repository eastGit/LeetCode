package linklist.linklist;

/**
 * Description:
 * Created by ldc on 2021/3/7 下午4:59.
 *
 * @author ldc
 */
public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode hair = new ListNode(0, head), con = hair;
        int n = right-left +1;
        while(left > 1){
            con = con.next;
            left--;
        }
        con.next = reverse(con.next, n);
        return hair.next;
    }

    public ListNode reverse(ListNode head, int n){
        ListNode pre = new ListNode(), curr = head, next = null;
        while(n > 0){
            next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = next;
            n--;
        }
        head.next = curr;
        return pre.next;
    }
}
