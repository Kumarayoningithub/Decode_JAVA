package Methods;
class Calculator2{
    int a;
    int b;
    int res;
    int add(){
        a=10;
        b=20;
        res=a+b;
        return res;
    }
}

public class Type2MethodnoINputONLYoutput {
    public static void main(String[] args) {
        Calculator2 cl= new Calculator2();
        int sum=cl.add();
        System.out.println(sum);

    }
}
