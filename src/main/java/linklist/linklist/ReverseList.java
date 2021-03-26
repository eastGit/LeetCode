package linklist.linklist;

/**
 * Description:
 * Created by ldc on 2021/3/7 下午5:07.
 *
 * @author ldc
 */
public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode tail = head.next;
        ListNode newHead = reverseList(head.next);
        head.next = tail.next;
        tail.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new  ListNode(1);
        ListNode node2= new ListNode(2);
        head.setNext(node2);
        ListNode node3 = new ListNode(3);
        node2.setNext(node3);
        ListNode node4  = new ListNode(4);
        node3.setNext(node4);
        ListNode listNode = reverseList(head);
        System.out.println(listNode);
    }
}
