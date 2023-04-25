package javadasar;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "eta", "fatri", "marpaung", "joko",
                "udin", "budi"
        };

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //for each
        for (var name: names){
            System.out.println(name);
        }
    }
}
