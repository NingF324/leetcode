package programMercarl.list;

/**
 * @description:
 * @author: Lenovo
 * @time: 2024/10/12 上午10:32
 */
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val=val;
    }
}

public class MyLinkedList {
    int size;
    Node head;

    public MyLinkedList() {
        size=0;
        head=new Node(0);
    }

    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }else {
            Node current=head;
            //包含一个虚拟头节点，所以遍历到index+1
            for (int i = 0; i <= index; i++) {
                current = current.next;
            }
            return current.val;
        }
    }

    public void addAtHead(int val) {
        Node newHead =new Node(val);
        newHead.next=head.next;
        head.next=newHead;
        size++;
    }

    public void addAtTail(int val) {
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(val);
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index>size){
            return;
        }
        if (index<0){
            index=0;
        }
        size++;
        Node current=head;
        for (int i = 0; i < index; i++) {
            current=current.next;
        }
        Node newNode=new Node(val);
        newNode.next=current.next;
        current.next=newNode;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        //因为有虚拟头节点，所以不用对Index=0的情况进行特殊处理
        Node pred = head;
        for (int i = 0; i < index ; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}
