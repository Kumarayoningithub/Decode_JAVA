package Methods;
class Calculator1{
    int a;
    int b;
    int res;
    void add(){
        a=10;
        b=20;
        res=a+b;
        System.out.println(res);
    }
}

public class Type1MethodNoParameterNoREturn {
    public static void main(String[] args) {

        Calculator1 cl= new Calculator1();
        cl.add();


    }
}
