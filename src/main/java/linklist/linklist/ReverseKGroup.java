package linklist.linklist;

/**
 * Description: K个为一组旋转
 * Created by ldc on 2021/3/7 下午11:18.
 *
 * @author ldc
 */
public class ReverseKGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(0, head), p = newHead, q = p.next;
        while ((p.next = reverseK(q, k)) != q) {
            p = q;
            q = p.next;
        }
        return newHead.next;
    }

    public static ListNode reverseK(ListNode head, int n) {
        ListNode p = head;
        int cnt = n;
        while (n > 1 && p != null) {
            p = p.next;
            --n;
        }
        if (p == null){
            return head;
        }
        return reverseN(head, cnt);
    }

    public static ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            return head;
        }
        ListNode tail = head.next, con = reverseN(head.next, n - 1);
        head.next = tail.next;
        tail.next = head;
        return con;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.setNext(node2);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        ListNode node4 = new ListNode(4);
        node3.setNext(node4);
        ListNode node5 = new ListNode(5);
        node4.setNext(node5);
        ListNode listNode = reverseKGroup(head, 2);
        System.out.println(listNode);

    }
}
