package Linked_List;
class dNode{
    int val;
    dNode next;
    dNode prev;

    dNode(int val){
        this.val=val;
    }
}



public class doublyLinkedListimplementation {
    public static void  print(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void reverseprint (dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void display(dNode k){
        dNode temp =k;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        print(temp);

    }
    public static void main(String[] args) {
//      dNode a = new dNode(10);
//      dNode b= new dNode(20);
//      dNode c = new dNode(30);
//      dNode d = new dNode(40);
//
//      a.next=b;
//      b.next=c;
//      c.next=d;
//      d.next=null;
//
//      d.prev=c;
//      c.prev=b;
//      b.prev=a;
//      a.prev=null;
//      print(a);
//      reverseprint(d);
//      display(c);
    }
}
