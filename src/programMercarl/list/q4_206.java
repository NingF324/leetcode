package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午4:11
 */
public class q4_206 {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
