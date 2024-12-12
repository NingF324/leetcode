package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午4:58
 */
public class q8_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                ListNode node1=fast;
                ListNode node2=head;
                while (node1!=node2){
                    node1=node1.next;
                    node2=node2.next;
                }
                return node1;
            }
        }
        return null;
    }
}
