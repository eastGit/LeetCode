package interview;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description: 445. 两数相加 II
 * Created by ldc on 2021/3/24 上午9:41.
 *
 * @author ldc
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> stack1 = new LinkedList<Integer>();
        Deque<Integer> stack2 = new LinkedList<Integer>();
        while (l1!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        ListNode newHead = null;
        while (!stack2.isEmpty() || !stack1.isEmpty() || carry != 0){
            int a =stack1.isEmpty()? 0: stack1.pop() ;
            int b = stack2.isEmpty()? 0 : stack2.pop();
            int ans = a+b + carry;
            carry = ans /10;
            ans %=1;
            ListNode newNode = new ListNode(ans);
            newNode.next = newHead;
            newHead = newNode;
        }

        return newHead.next;
    }
}
