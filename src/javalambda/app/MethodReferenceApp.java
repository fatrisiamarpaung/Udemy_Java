package javalambda.app;

import javalambda.util.StringUtil;

import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

      //  Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value); //lambda versi
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase; //method reference (static)

        System.out.println(predicateIsLowerCase.test("eta"));
        System.out.println(predicateIsLowerCase.test("Eta"));
    }

    public void run(){
      //  Predicate<String> predicateIsLowerCase = value -> MethodReferenceApp.this.isLowerCase(value);
        Predicate<String> predicateIsLowerCase =this::isLowerCase; //atau seperti ini (bukan static)
        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    //akses object lain
    public void run2(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase =this::isLowerCase; //atau seperti ini (bukan static)

        System.out.println(predicateIsLowerCase.test("eko"));
        System.out.println(predicateIsLowerCase.test("Eko"));
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()){
            if (!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }
}
