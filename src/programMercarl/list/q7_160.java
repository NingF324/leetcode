package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/14 下午4:41
 */
public class q7_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=0,lenB=0;
        ListNode curA=headA;
        ListNode curB=headB;
        while(curA!=null){
            lenA++;
            curA=curA.next;
        }
        while(curB!=null){
            lenB++;
            curB=curB.next;
        }
        curA=headA;
        curB=headB;
        if(lenA>lenB){
            for (int i = 0; i < lenA-lenB; i++) {
                curA=curA.next;
            }
        } else if (lenB>lenA) {
            for (int i = 0; i < lenB - lenA; i++) {
                curB=curB.next;
            }
        }
        while(curA!=null&&curB!=null){
            if(curA == curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
