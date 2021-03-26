package interview;

/**
 * Description: 面试题 02.03. 删除中间节点
 * Created by ldc on 2021/3/23 下午5:02.
 *
 * @author ldc
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
