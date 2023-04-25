package javageneric.application;

import javageneric.util.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("eko", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
