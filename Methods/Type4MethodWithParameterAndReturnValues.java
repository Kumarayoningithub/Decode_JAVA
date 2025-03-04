package Methods;
class Calculator4{
    int res;
    int add(int x, int y){
        res=x+y;
        return res;
    }
}

public class Type4MethodWithParameterAndReturnValues {
    public static void main(String[] args) {

        Calculator4 cl= new Calculator4();
        int a=20;
        int b=10;
        int sum= cl.add(a, b);
        System.out.println(sum);
    }
}
