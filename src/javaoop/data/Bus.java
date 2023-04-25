package javaoop.data;

public class Bus implements Car{

    public void drive() {

        System.out.println("Bus Drive ");
    }

    public int getTire() {
        return 8;
    }

    public boolean isBig() {
        return true;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMaintenance() {
        return false;
    }
}
