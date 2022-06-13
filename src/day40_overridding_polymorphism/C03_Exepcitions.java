package day40_overridding_polymorphism;

import java.util.Scanner;

public class C03_Exepcitions {
    public static void main(String[] args) {
        //kullanicidan 2 sayi alip bolerek
        //sonucu yazdiran bir program


        Scanner scan =new Scanner(System.in);
        int kontrol=0;
        while (kontrol !=2){
            System.out.println("bolmek istediginiz sayiyi yazin");
            int sayi1= scan.nextInt();

            System.out.println("kaca bolmek istediginizi yazin");
            int sayi2= scan.nextInt();


            try {
                System.out.println("sonuc= " + sayi1/sayi2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("girdiginiz sayilar sorunlu");
            }

            System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basin");
            kontrol=scan.nextInt();
        }



        /*
        sayi2 0 olacagindan sayi1/0 tanimsiz olacagindan
        java bu durumla karsilasinca exception firlatir
        javanin yazdigi mesajda exception ne tur bir sorun oldugu
        neden kaynaklandigi
        ve hangi satirda olustugu yazar

        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overridding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:19)

        bunu cozmek icin sayi2 yi if ile kontrol edebiliriz



        if (sayi2==0){
            System.out.println("sayi/0 tanimsizdir");
        } else  {System.out.println("sonuc= " + sayi1/sayi2);}

        ama bu yontem her zaman calismaz
         */




    }
}
