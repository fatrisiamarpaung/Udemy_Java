package javadasar;

public class OperasiArray {
    public static void main(String[] args) {
        long[] arrayLong = {
                10, 90, 20, 30, 40
        };

        arrayLong[0] = 60;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);
    }
}
