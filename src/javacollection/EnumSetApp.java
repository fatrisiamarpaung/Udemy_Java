package javacollection;

import java.util.EnumSet;

public class EnumSetApp {

    public static void main(String[] args) {
        EnumSet<Genders> genders = EnumSet.allOf(Genders.class);
        // EnumSet<Genders> genders = EnumSet.of(Genders.FEMALE, Genders.FEMALE, Genders.MALE);

        for (var gender : genders){
            System.out.println(gender);
        }
    }

    public static enum Genders{
        MALE, FEMALE, NOT_MENTION
    }
}
