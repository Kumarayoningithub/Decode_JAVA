package Linked_List;
//class Node {
//    int val ;
//    Node next;
//    Node(int val){
//        this.val = val;
//    }
//}

class Link{
    Node head;
    Node tail;
    int size =0;

    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head== null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            temp=tail;
        }
        size++;
    }
    void size(){
        System.out.println(size);
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
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
        size++;
    }

    void insert(int idx, int val) throws Error {
        Node temp = new Node(val);
        if(idx==0) insertAtBegin(val);
        else if (idx<0 || idx>=size){
            throw new Error("invalid");
        }
        else if (idx==size) insertAtEnd(val);
        else{
            Node x = head;
            for (int i = 0; i <idx-1; i++) {
                  x=x.next;
            }
            temp.next=x.next;
            x.next=temp;
            size++;
        }

    }

    int getElement(int idx) throws Error{
        if(idx==0) return head.val;
        if(idx==size) return tail.val;
        if(idx<0|| idx>size) throw new Error("invalid");
        else{
            Node x=head;
            for (int i = 0; i < idx; i++) {
                x=x.next;
            }
            return x.val;
        }
    }

    void setElement(int idx,int val)throws Error{
                 if(idx==0) head.val=val;
                 if(idx==size) tail.val=val;
                 if(idx<0 || idx>size) throw new Error("invalid");
                 else{
                     Node x = head;
                     for (int i = 0; i < idx; i++) {
                         x=x.next;
                     }
                     x.val=val;
                 }
    }

    void deleteAtBegin() throws Error{
        head=head.next;
        size--;
        if(head== null) throw new Error("invalid");
    }
    void deleteNode(int idx) throws Error{
        if(idx==0) deleteAtBegin();
        if(idx<0 || idx>size) throw new Error("invalid");
        if(idx==size){
            Node x = head;
            for (int i = 0; i < idx-1; i++) {

                x=x.next;
            }
            x.next=x.next.next;
            tail=x.next;

            size--;
        }
        Node x = head;
        for (int i = 0; i < idx-1; i++) {

            x=x.next;
        }
        x.next=x.next.next;

        size--;
    }





}
public class homework {
    public static void main(String[] args) {
        Link list = new Link();
        list.insertAtEnd(10);
        list.insertAtEnd(18);
        list.insertAtBegin(69);
        list.insert(2,55);

       // list.size();
        //list.display();
        //System.out.println();
        //System.out.print(list.getElement(3));
        list.setElement(1,100);
        //list.display();
        //list.deleteAtBegin();
        list.insertAtEnd(99);
        //list.display();
        //list.deleteNode(2);
        list.display();




    }
}
