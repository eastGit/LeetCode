package linklist.queue;

/**
 * Description:
 * Created by ldc on 2021/3/12 下午9:05.
 *
 * @author ldc
 */
public class MyCircularQueue1 {

    Node head, tail;
    int count, capacity;

    public MyCircularQueue1(int k) {
        capacity = k;
        count = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (count == 0) {
            head = tail = newNode;
        } else {
            tail.nextNode = newNode;
            tail = newNode;
        }
        count++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = head.nextNode;
        count--;
        return true;
    }

    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return head.value;
    }

    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        return tail.value;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }
}


