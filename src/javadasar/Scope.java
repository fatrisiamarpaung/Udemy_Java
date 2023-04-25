package javadasar;

public class Scope {
    public static void main(String[] args) {
    sayHello(" Fatri");
    }

    static void sayHello(String name){
        String hello = "Hello" + name;
        if (!name.isBlank()){
            String hi ="Hi" + name;
            System.out.println(hi);
        }

        System.out.println(hello);

    }
}
