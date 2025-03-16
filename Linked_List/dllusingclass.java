package Linked_List;
class nNode {
    nNode next;
    nNode prev;
    int val;
    nNode(int val){
        this.val=val;
    }
}
class DLL{
    nNode head;
    nNode tail;
    int size=0;
    void display(){
        nNode temp =head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertTail(int val){

        nNode x = new nNode (val);
        if(size==0){
            head=tail=x;
            size++;
        }
        else{
            tail.next=x;
            x.prev=tail;
            x.next=null;
            tail=x;
            size++;}
    }
    void insertHead(int val){
        nNode k = new nNode(val);
        if(size==0){
            head=tail=k;
            size++;
        }
        else{
            head.prev=k;
            k.next=head;
            head=k;
            k.prev=null;
        }

    }
    void insert(int idx, int val){
        nNode b = new nNode(val);
        if(size==0) {
            head = tail = b;
            size++;
        }
        else if(idx==0) {
            insertHead(val);
        }
        else if(idx>size){
            insertTail(val);
        }
        else{

            nNode x = head;
            for(int i =0; i<idx-1;i++){
                x=x.next;
            }
            nNode y = x.next;
            b.next=y;
            y.prev=b;
            x.next=b;
            b.prev=x;
            size++;


        }


    }

    void deletehead() throws Error{
        if(head==null) throw new Error("list is empty");
        head=head.next;
        head.prev=null;
        size--;
    }
    void deletetail() throws Error{
        if(head==null) throw new Error("list is empty");
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    void delete (int idx) throws Error{
        if(idx==0){ deletehead();
        return;}
        if(idx== size-1){
            deletetail();
            return;
        }
        if(idx<0 || idx>=size){
            throw new Error("invalid index");

        }
        nNode temp = head;
        for(int i =0; i <idx-1;i++){
            temp = temp.next;
        }
        temp.next=temp.next.next;
        temp=temp.next;
        temp.prev=temp.prev.prev;
        size--;



    }



}
public class dllusingclass {
    public static void main(String[] args) {
            DLL list = new DLL();
            //list.display();
            list.insertTail(5);
            list.insertTail(6);
            list.insertTail(99);
             list.insertTail(68);
             list.display();
             list.insertHead(5);
             list.insertHead(99);
             list.display();
             list.insert(2,22);
             list.display();
             list.deletehead();
             list.display();
             list.deletetail();
             list.display();


    }
}
