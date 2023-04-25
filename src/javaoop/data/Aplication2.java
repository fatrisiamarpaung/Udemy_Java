package javaoop.data;

public class Aplication2 {

    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
