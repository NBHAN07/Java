package day40_overridding_polymorphism;

import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi alip toplayan bir program yaziniz
        //toplam 500'u gecerse bitirsin veya
        //kullanici bitirmek istediginde Q'ya basmalidir

        Scanner scan =new Scanner(System.in);
        int toplam=0;

        do {
            System.out.println("lutfen toplamak istediginiz sayiyi giriniz \nbitirmek icin Q'ya basiniz");
            int sayi= 0;


            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                String hataliGiris=scan.next();
                if (hataliGiris.equalsIgnoreCase("q")){
                    System.out.println("girdiginiz sayilarin toplami: "+ toplam);
                }else {
                    System.out.println("hatali giris");
                }
            }




        } while (toplam<500);
        System.out.println("girdiginiz sayilarin toplami: "+ toplam);

    }



}
