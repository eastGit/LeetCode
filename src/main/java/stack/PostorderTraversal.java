package stack;

import java.util.*;

/**
 * Description: 145. 二叉树的后序遍历
 * Created by ldc on 2021/3/21 下午5:28.
 *
 * @author ldc
 */
public class PostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        Deque<Integer> statusStack = new LinkedList<Integer>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        statusStack.push(0);
        while (!stack.isEmpty()) {
            int status = statusStack.peek();
            statusStack.pop();
            switch (status) {
                case 0: {
                    statusStack.push(1);
                    if (stack.peek().left != null) {
                        stack.push(stack.peek().left);
                        statusStack.push(0);
                    }
                    break;
                }
                case 1: {
                    statusStack.push(2);
                    if (stack.peek().right != null) {
                        stack.push(stack.peek().right);
                        statusStack.push(0);
                    }
                    break;
                }
                case 2: {
                    result.add(stack.peek().val);
                    stack.pop();
                    break;
                }
            }
        }

        return result;
    }
}
