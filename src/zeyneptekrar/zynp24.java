package zeyneptekrar;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class zynp24 {
    public static void main(String[] args) {


        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        double notSayi=scan.nextDouble();

        if (notSayi<0 || notSayi>100){
            System.out.println("gecerli bir not giriniz");
        } else if (notSayi<50){
            System.out.println("harf notunuz D");
        } else if (notSayi<60){
            System.out.println("harf notunuz C");
        } else if (notSayi<80){
            System.out.println("harf notunuz B");
        } else {
            System.out.println("harf notunuz A");
        }






    }
}
