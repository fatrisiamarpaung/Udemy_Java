package javageneric.util;

//Generic Method
public class ArrayHelper {

    public static <T> int count(T[] array) {
        return array.length;
    }
}
