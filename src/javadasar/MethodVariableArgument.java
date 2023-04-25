package javadasar;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 80, 78, 85, 79};
        sayCongrats("Eta", values);

        //dgn variabel argument
        sayCongrats("Eta", 80,60,70,80,70);


    }

    static void sayCongrats(String name, int... values){

        int total=0;
        for (var value:values){
            total += value;
        }
        int finalValue = total/values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name  + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak Lulus");
        }
    }
}
