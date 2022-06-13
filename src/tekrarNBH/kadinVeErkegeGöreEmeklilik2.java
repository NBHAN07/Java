package tekrarNBH;

import java.util.Locale;
import java.util.Scanner;

public class kadinVeErkegeGöreEmeklilik2 {
    public static void main(String[] args) {
        // eger calisan kadinsa 60 yasindan sonra emekli olabilir
        //erkekse 65.
        //cinsiyet yanlis girilirse ve yas 0dan kücük ve 130 dan büyük ihtimalleri de göz önüne al


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi kadın iseniz K, \n erkek iseniz E olarak giriniz");
        char cinsiyet = scan.next().toLowerCase(Locale.ROOT).charAt(0);
        System.out.println("lütfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'k') {

            if (yas<=0 || yas>130){
                System.out.println("lütfen gecerli bir yas giriniz");
            }

            else if (yas < 60) {
                System.out.println("emekli olamazsin cnm\n" + (60 - yas) + "yil daha kölelik yapacaksin :((");
            } else if (yas > 60) {
                System.out.println("emekli olabilersin tebrikss ;)");
            }
        }


        else if (cinsiyet == 'e') {
            if (yas<=0 || yas>130){
                System.out.println("lütfen gecerli bir yas giriniz");}

            if (yas < 65) {
                System.out.println("emekli olamazsin cnm");
                System.out.println(65 - yas + " yil daha kölelik yapacaksin :((");
            } else if (yas > 65) {
                System.out.println("emekli olabilersin tebrikss ;) ");}

            }

        else {
            System.out.println("lütfen gecerli bir cinsiyet kodu giriniz ");}




























        }
    }
