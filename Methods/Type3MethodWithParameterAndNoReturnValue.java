package Methods;
class Calculator3{
    int res;
    void add(int x, int y){
        res=x+y;
        System.out.println(res);
    }

}

public class Type3MethodWithParameterAndNoReturnValue {
    public static void main(String[] args) {

        Calculator3 cl= new Calculator3();
        int a=20;
        int b=10;
        cl.add(a, b);
    }
}
