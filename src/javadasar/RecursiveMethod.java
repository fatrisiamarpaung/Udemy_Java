package javadasar;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1*2*3*4*5);

        System.out.println(factorialRecursive(5));

        loop(100);


    }

    //peny factorial dengan loop biasa
    static int factorialLoop(int value){
        var result = 1;
        for (int i=1; i<=value; i++){
            result *=i;
        }
        return result;
    }

    //dengan recursive method
    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }

    //error StackOverFlow
    static void loop(int value){
        if (value==0){
            System.out.println("selesai");
        } else {
            System.out.println("loop-"+value);
            loop(value-1);
        }
    }
}
