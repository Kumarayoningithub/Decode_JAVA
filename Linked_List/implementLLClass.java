package Linked_List;
//class Node{
//    int val;
//    Node next;
//
//    Node(int val){
//        this.val = val;
//    }
//}
class SLL{
    Node head;
    Node tail;
    int size =0;
    void insertAtEnd(int val){
       Node temp = new Node(val);
       if(head==null){
           head=temp;
           tail=temp;
       }else{
           tail.next=temp;
           tail=temp;
       }
       size=size+1;
    }

    void insertAtBegin(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size=size+1;
    }

    void set (int idx, int val) throws Error{
        if(idx==0) head.val=val;
        if(idx==size-1) tail.val=val;
        if(idx<0 || idx>=size){
            throw new Error("invalid");
        }
        Node x = head;
        for (int i = 0; i < size-1 ; i++) {
                 x=x.next;
        }
        x.val=val;
        return;
    }
    void insert(int idx, int val){
        if(idx==0){
            insertAtBegin(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size|| idx<0){
            System.out.println("error invalid insertion caught");
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for (int i = 0; i <idx ; i++) {
            x=x.next;
        }
          temp.next=x.next;
          x.next=temp;
        size=size+1;
    }

      int get(int idx) throws Error{

        if(idx==0){
           return head.val;
        }
        if(idx==size-1){
            return tail.val;
        }
          if(idx>=size || idx<0){
              throw new Error("invalid index");
          }

          Node x = head;
          for (int i = 0; i <idx ; i++) {
              x=x.next;
          }
          return x.val;
    }

    void deleteAtHead() throws Error{
        head=head.next;
        size--;
        if (head == null) throw new Error("list is already empty");
    }

    void deleteNode(int idx) throws Error{
        if (idx==0) deleteAtHead();
        if(idx<0 || idx>=size) throw new Error("invalid index");
//        if (idx==size-1){
//            Node x = head;
//            for (int i = 0; i < idx-1; i++) {
//                x=x.next;
//            }
//            x.next=x.next.next;
//            tail=x.next;
//            size--;
        // }

        Node x = head;
        for (int i = 0; i < idx-1; i++) {
            x=x.next;
        }
        if(x.next==tail){
            tail=x;
        }
        x.next=x.next.next;
        size--;
    }

      void length(){
          System.out.println(size);
      }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
public class implementLLClass {
    public static void main(String[] args) {
      SLL list = new SLL();
     list.insertAtEnd(69);
        list.insertAtEnd(67);
     list.insertAtBegin(11);

     //list.display();
        list.insertAtBegin(22);
     //list.length();
        //list.display();
        //list.length();
        list.insert(1,99);
        //list.display();
        // get function
        //System.out.println(list.get(2));
        list.display();
        list.set(0,121);
        list.display();
        list.deleteAtHead();
        list.deleteNode(2);
    }
}
