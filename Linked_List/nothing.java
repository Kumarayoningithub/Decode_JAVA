package Linked_List;
 class Fode{
    int val;
    Fode next;

    Fode(int val){
        this.val=val;
    }


}
public class nothing {
    public static void main(String[] args) {
        Fode a = new Fode(10);
        Fode b = new Fode(20);

        a.next=b;
        System.out.println(a.val);
    }
}
