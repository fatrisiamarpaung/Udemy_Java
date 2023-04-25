package javageneric.application;

import javageneric.util.MyData;

public class GenericClassApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
        MyData<Integer> integerMyData = new MyData<>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}
