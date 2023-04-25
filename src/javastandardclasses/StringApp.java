package javastandardclasses;

public class StringApp {
    public static void main(String[] args) {

        String name = "Eko Kurniawan Khannedy";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Eko"));
        System.out.println(name.endsWith("Khannedy"));

        String[] names = name.split(" ");
        System.out.println(names);
        for (var value : names){
            System.out.println(value);
        }

        char[] chars = name.toCharArray();
        System.out.println(chars);
    }
}
