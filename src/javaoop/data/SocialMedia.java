package javaoop.data;

//Final Class & Final Method

 class SocialMedia {
     String name;

}

 class Facebook extends SocialMedia {

    final void login(String username, String password){

     }
}

class FakeFacebook extends Facebook{

     //ERROR
//    void login(String username, String password){
//
//    }
}
