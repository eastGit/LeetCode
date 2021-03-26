package interview;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: 面试题 02.08. 环路检测
 * Created by ldc on 2021/3/24 上午10:33.
 *
 * @author ldc
 */
public class DetectCycle {

    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> hashSet = new HashSet<ListNode>();
        while (pos != null){
            if (hashSet.contains(pos)){
                return pos;
            }else {
                hashSet.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
}
