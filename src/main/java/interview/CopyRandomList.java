package interview;

/**
 * Description: 剑指 Offer 35. 复杂链表的复制
 * Created by ldc on 2021/3/23 下午4:52.
 *
 * @author ldc
 */
public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node pointer = head;
        while (pointer != null) {
            Node newNode = new Node(pointer.val);
            newNode.next = pointer.next;
            pointer.next = newNode;
            pointer = newNode.next;
        }

        pointer = head;
        while (pointer != null) {
            pointer.next.random = (pointer.random != null) ? pointer.random.next : null;
            pointer = pointer.next.next;
        }

        Node oldNodeList = head;
        Node newNodeList = head.next;
        Node newHead = head.next;
        while (oldNodeList != null){
            oldNodeList.next = oldNodeList.next.next;
            newNodeList.next = (newNodeList.next != null)? newNodeList.next.next : null;
            oldNodeList = oldNodeList.next;
            newNodeList = newNodeList.next;
        }

        return newHead;
    }
}
