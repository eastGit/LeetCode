package stack;

import java.util.Stack;

/**
 * Description: 面试题 03.04 化栈为队
 * Created by ldc on 2021/3/19 下午8:05.
 *
 * @author ldc
 */
public class MyQueue {

    Stack<Integer> inStack = new Stack<Integer>();

    Stack<Integer> outStack =  new Stack<Integer>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    public void transfer(){
        if (!outStack.empty()){
            return;
        }
        while (!inStack.empty()){
            outStack.push(inStack.pop());
        }
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        transfer();
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        transfer();
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return outStack.empty() && inStack.empty();
    }
}
