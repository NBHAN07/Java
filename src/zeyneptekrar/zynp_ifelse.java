package zeyneptekrar;

import java.util.Scanner;

public class zynp_ifelse {

    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetizi giriniz" + "\n kadin icin K erkek icin E harfi giriniz ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("lutfen yasınızı giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yasi kontrol ediniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsınız \n daha " + (60-yas) + " calısmalısın");
            } else if (yas > 60) {
                System.out.println("emekli olabilirsiniz ");
            }
        } else if (cinsiyet == 'E') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yasi kontrol ediniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsınız \n daha " +(65-yas) + "calısmalısın");
            } else if (yas > 65) {
                System.out.println("emekli olabilirsiniz ");
            }

        }
    }
}