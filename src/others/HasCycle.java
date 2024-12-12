package others;

import java.util.HashSet;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/19 下午7:43
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        HashSet<ListNode> set=new HashSet<>();
        ListNode current = head;
        while (!set.contains(current)){
            set.add(current);
            if(current.next==null){
                return false;
            }
            current=current.next;
        }
        return true;
    }
}
