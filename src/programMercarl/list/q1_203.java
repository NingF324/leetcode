package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午10:25
 */
public class q1_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode current=dummy;
        while (current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return dummy.next;
    }
}
