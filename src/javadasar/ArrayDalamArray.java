package javadasar;

public class ArrayDalamArray {
    public static void main(String[] args) {
        String[][] members = {
                {"Aku", "Dia", "Kamu"},
                {"Anda", "Mereka"},
                {"Dan", "Tapi"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);
    }
}
