package javageneric.application;

import javageneric.util.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {

        MyData myData = new MyData("Eta");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
