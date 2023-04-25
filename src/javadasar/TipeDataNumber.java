package javadasar;

public class TipeDataNumber {
    public static void main(String[] args) {

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        int decimalInt = 34;
        int hexaDecimal = 0xFFFFF;
        int binaryDecimal = 0b101010;

        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort2;
        long iniLong1 = iniInt2;
        float iniFloat2 = iniLong1;
        double iniDouble2 = iniFloat2;

        float iniFloat3 = (float) iniDouble2;
        long iniLong3 = (long) iniFloat3;

    }

}
