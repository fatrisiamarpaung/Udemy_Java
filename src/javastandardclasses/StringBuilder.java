package javastandardclasses;

public class StringBuilder {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
//        builder.append("Eko"); //ERROR
//        builder.append(" ");
//        builder.append("Kurniawan");
//        builder.append(" ");
//        builder.append("Khannedy");

        String name = builder.toString();
        System.out.println(name);
    }

}
