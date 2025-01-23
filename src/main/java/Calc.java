public class Calc {

    public static int plus(int a, int b){
        return a+b;
    }

    public static int substract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        if(b==0) throw new RuntimeException("Divide By Zero");

        return a/b;
    }
}
