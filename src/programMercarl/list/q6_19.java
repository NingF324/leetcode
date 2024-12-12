package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午4:35
 */
public class q6_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =new ListNode(0,head);
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
