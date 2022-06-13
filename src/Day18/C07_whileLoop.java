package Day18;

import java.util.Scanner;

public class C07_whileLoop {
    public static void main(String[] args) {
        //kullanicidan kac sayi toplamak istedigini alin
        //sayi alin ve bu sayilarin toplamini ekrana yazdirin

        int sayiAdedi=2;
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayiToplami=0;


        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lutfen bir sayi giriniz: ");
            sayi=scan.nextInt();
            sayiToplami+=sayi;

        }
        System.out.println("girilen "+ sayiAdedi+ " sayinin toplami: "+ sayiToplami);
        System.out.println(" ");

        //while ile yapalim

        sayi=0;
        sayiToplami=0; //bunlara yeniden 0 i atamazsak kaldigi yerden devam eder

        int sayac=1;

        while (sayac<=sayiAdedi){
            System.out.println("lutfen bir sayi giriniz: ");
            sayi=scan.nextInt();
            sayiToplami+=sayi;
            sayac++; // bu cok onemli yoksa sonsuz donguye girer . for loopdan farki da bu zaten

        }
        System.out.println("girilen "+ sayiAdedi+ " sayinin toplami: "+ sayiToplami);


    }
}
