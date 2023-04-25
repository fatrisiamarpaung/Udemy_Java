package javalambda.app;

import java.util.function.Consumer;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        };

        consumer.accept("Eko Kurniawan");

        //Membuat lambda yang khusus untuk menerima data
        Consumer<String> consumer2 = value -> System.out.println(value);

        consumer.accept("Eko Kurniawan");
    }
}
