package interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 143. 重排链表
 * Created by ldc on 2021/3/24 上午10:20.
 *
 * @author ldc
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<ListNode>();
        while (head != null){
            nodeList.add(head);
            head = head.next;
        }

        int i = 0, j = nodeList.size() -1;
        while (i<j){
            nodeList.get(i).next = nodeList.get(j);
            i++;
            if (i==j){
                break;
            }
            nodeList.get(j).next = nodeList.get(i);
            j--;
        }
        nodeList.get(i).next = null;
    }
}
