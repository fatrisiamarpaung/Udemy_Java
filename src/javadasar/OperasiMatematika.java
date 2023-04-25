package javadasar;

public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        b += 20;
        System.out.println(b);

        b -= 10;
        System.out.println(b);

        b *= 2;
        System.out.println(b);

        //Unary operator
        int d = 100;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);


    }
}
