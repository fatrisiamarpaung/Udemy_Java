package javadasar;

public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "Fatrisia";
        arrayString[1] = "Marpaung";
        arrayString[2] = "Lorenta";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        //ngubah data
        arrayString[1] = "Lorenta";
        System.out.println(arrayString[1]);

        //bisa inisialisasi langsung
        String[] stringArray2 = new String[3];

        //inisialisasi dengan data langsung

        //1
        int[] arrayInt = new int[]{
                10, 20, 30, 40
        };

        //2. termudah
        long[] arrayLong = {
                10, 20, 40, 90
        };
    }
}
