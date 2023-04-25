package studikasus.util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scan = new Scanner(System.in);

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scan.nextLine();
        return data;
    }
}

