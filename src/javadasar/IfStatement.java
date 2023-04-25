package javadasar;

public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        if (nilai >= 75 &&  absen >= 75){
            System.out.println("Anda LULUS");
        } else if (nilai >= 80 && absen >= 88){
            System.out.println("Nilai Anda A");
        }else if (nilai >= 70 && absen >= 78){
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 68){
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 58){
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Anda TIDAK LULUS");
        }
    }
}
