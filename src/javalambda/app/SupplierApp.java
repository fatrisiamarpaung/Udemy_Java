package javalambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        //versi anonim func
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Fatrisia Marpaung";
            }
        };
        System.out.println(supplier.get());

        //ver lambda/ver dipersingkat
        Supplier<String> supplier2 = () -> "Fatrisia Lambda";
        System.out.println(supplier2.get());
    }
}
