package javageneric.application;

import javageneric.util.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("EKo");
        MyData<?super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("Process Parameter " + value);
        myData.setData("Eko");
    }
}
