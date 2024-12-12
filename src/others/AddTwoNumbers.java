package others;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/9/24 上午8:36
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ls=new ListNode();
        ListNode current=ls;
        boolean isMore=false;
        while(true){
            current.val=l1.val+l2.val;
            if(l1.next==null&&l2.next==null){
                break;
            }
            if(l1.next==null){
                l1.val=0;
            }else{
                l1=l1.next;
            }
            if(l2.next==null){
                l2.val=0;
            }else{
                l2=l2.next;
            }
            current.next=new ListNode();
            current=current.next;
        }
        current=ls;
        while(true){
            if(isMore){
                current.val+=1;
                isMore=false;
            }
            if(current.val>=10){
                current.val=current.val%10;
                isMore=true;
            }
            if(current.next==null&&isMore==false){
                break;
            } else if(current.next==null&&isMore==true){
                current.next=new ListNode(0);
                current=current.next;
            } else{
                current=current.next;
            }
        }
        return ls;
    }
}
