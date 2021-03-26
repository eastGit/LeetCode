package linklist.linklist;

/**
 * Description:
 * Created by ldc on 2021/3/5 下午4:34.
 *
 * @author ldc
 */
public class DetectCycle {

    public static ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        do{
            if (fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;

        }while(slow != fast);

        fast = head;
        while(slow != fast ){
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    public static void main(String[] args) {
        ListNode head = new  ListNode(3);
        ListNode node2= new ListNode(2);
        head.setNext(node2);
        ListNode node3 = new ListNode(0);
        node2.setNext(node3);
        ListNode node4  = new ListNode(-4);
        node3.setNext(node4);
        node4.setNext(node2);
        ListNode listNode = detectCycle(head);
        System.out.println(listNode);
    }
}

