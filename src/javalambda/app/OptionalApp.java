package javalambda.app;

import java.util.Optional;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello(" Eko");

        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name){
        //cara 2
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                    value -> System.out.println("HELLO " + value),
//                            () -> System.out.println("HELLO")
//                );
//        }

                Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");
        }

//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpper.ifPresent(value -> System.out.println("HELLO" + value));

//        if(name != null){
//            String upperName = name.toUpperCase();
//            System.out.println("HELLO " + upperName);
//        }

    }

