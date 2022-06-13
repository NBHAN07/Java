package tekrarNBH;

import java.util.Locale;
import java.util.Scanner;

public class kadinVeErkegeGöreEmeklilik {
    public static void main(String[] args) {
        // eger calisan kadinsa 60 yasindan sonra emekli olabilir
        //erkekse 65

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi kadın iseniz K, erkek iseniz E olarak giriniz");
        char cinsiyet= scan.next().toLowerCase(Locale.ROOT).charAt(0);
        System.out.println("lütfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='k' && yas<60){
            System.out.println("emekli olmazsin cnm");
            System.out.println(60-yas + "yil daha calişman lazim");}

        else if (cinsiyet=='k' && yas>60){
            System.out.println("emekli olabilersin cnm");}
        else if (cinsiyet=='e' && yas<65 ) {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas + "yil daha calişman lazim");}
        else if (cinsiyet=='e' && yas>65 ) {
            System.out.println("emekli olabilersin");}

        // benim kodum cinsiyetin dogru girilmesi halinde calisiyor!!!!!















    }
}
