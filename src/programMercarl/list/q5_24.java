package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午4:22
 */
public class q5_24 {
    ListNode one,two,three;
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = new ListNode(0,head);
        ListNode cur=newHead;
        while (cur.next!=null&&cur.next.next!=null){
            one=cur.next;
            two=one.next;
            three=two.next;
            cur.next=two;
            two.next=one;
            one.next=three;
            cur=one;
        }
        return newHead.next;
    }
}
