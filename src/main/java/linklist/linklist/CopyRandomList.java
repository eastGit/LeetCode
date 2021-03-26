package linklist.linklist;

/**
 * Description:LeetCode 138 复制链表
 * Created by ldc on 2021/3/12 下午8:23.
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
        Node pointerOldList = head;
        Node pointerNewList = head.next;
        Node newHead = head.next;
        while (pointerOldList != null) {
            pointerOldList.next = pointerOldList.next.next;
            pointerNewList.next = (pointerNewList.next != null) ? pointerNewList.next.next : null;
            pointerOldList = pointerOldList.next;
            pointerNewList = pointerNewList.next;
        }

        return newHead;
    }
}
