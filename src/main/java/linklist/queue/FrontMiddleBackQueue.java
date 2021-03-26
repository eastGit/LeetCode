package linklist.queue;

/**
 * Description:
 * Created by ldc on 2021/3/12 下午9:51.
 *
 * @author ldc
 */
public class FrontMiddleBackQueue {
    MyQueue left = new MyQueue(), right = new MyQueue();

    public FrontMiddleBackQueue() {

    }

    public void pushFront(int val) {
        left.pushFront(val);
        reBalance();
    }

    public void pushMiddle(int val) {
        if (left.size() > right.size()) {
            right.pushFront(left.popBack());
        }
        left.pushBack(val);
    }

    public void pushBack(int val) {
        right.pushBack(val);
        reBalance();
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int front = left.popFront();
        reBalance();
        return front;
    }

    public int popMiddle() {
        if (isEmpty()) {
            return -1;
        }
        int val = left.popBack();
        reBalance();
        return val;
    }

    public int popBack() {
        int val = 0;
        if (isEmpty()) {
            return -1;
        }
        if (right.isEmpty()) {
            val = left.popBack();
        } else {
            val = right.popBack();
        }
        reBalance();
        return val;
    }

    public void reBalance() {
        if (left.size() < right.size()) {
            left.pushBack(right.popFront());
        }
        if (left.size() == right.size() + 2) {
            right.pushFront(left.popBack());
        }
    }

    public boolean isEmpty() {
        return left.size() == 0;
    }

}

class Node {
    int val;
    Node pre;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public void insertPre(Node node) {
        node.pre = pre;
        node.next = this;
        if (this.pre != null) {
            this.pre.next = node;
        }
        this.pre = node;
    }

    public void insertNext(Node node) {
        node.next = this.next;
        node.pre = this;
        if (this.next != null) {
            this.next.pre = node;
        }
        this.next = node;
    }

    public void deletePre() {
        if (this.pre == null) {
            return;
        }
        Node pointer = this.pre;
        this.pre = pointer.pre;
        if (pointer.pre != null) {
            pointer.pre.next = this;
        }
    }

    public void deleteNext() {
        if (this.next == null) {
            return;
        }
        Node pointer = this.next;
        this.next = pointer.next;
        if (pointer.next != null) {
            pointer.next.pre = this;
        }
    }
}

class MyQueue {
    Node dummyHead = new Node(), dummyTail = new Node();
    int count;

    public MyQueue() {
        dummyHead.next = dummyTail;
        dummyHead.pre = null;
        dummyTail.pre = dummyHead;
        dummyTail.next = null;
        count = 0;
    }

    public void pushFront(int val) {
        dummyHead.insertNext(new Node(val));
        count++;
    }

    public void pushBack(int val) {
        dummyTail.insertPre(new Node(val));
        count++;
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int val = dummyHead.next.val;
        count--;
        dummyHead.deleteNext();
        return val;
    }

    public int popBack() {
        if (isEmpty()) {
            return -1;
        }
        int val = dummyTail.pre.val;
        count--;
        dummyTail.deletePre();
        return val;
    }


    public boolean isEmpty() {
        return dummyHead.next == dummyTail;
    }

    public int size() {
        return count;
    }

}


