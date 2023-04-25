package javadasar;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;
        Boolean iniBoolean = true;

        Short iniShort; //null
        iniShort = 100;
        System.out.println(iniShort);

        //konversi primitif ke bukan primitif
        int iniInt = 100;
        Integer iniInteger2 = iniInt;

        //Konversi dari tipe primitif
        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
    }
}
