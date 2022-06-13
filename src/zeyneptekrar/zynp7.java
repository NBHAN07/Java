package zeyneptekrar;

import java.util.Scanner;

public class zynp7 {

    public static void main(String[] args) {

        /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int sayi1= 10;
        int sayi2= 20;

        System.out.println("SWAP'dan önce sayi1:" + sayi1+ " , sayi2:" +sayi2);
        sayi1= sayi1+sayi2; //30
        sayi2= sayi1-sayi2; //10
        sayi1= sayi1-sayi2; //20
        System.out.println("SWAP'dan sonra sayi1:" + sayi1+ " , sayi2:" +sayi2);


        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner isim= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        char ilkHarf= isim.next().charAt(0);
        // charAt(index) method'u parametre olarak yazdigimiz index'deki char'i bize getirir
        // String'de index 0'dan baslar
        // E0 r1 s2 i3 n4

        System.out.println("giridiginiz ismin ilk harfi : " + ilkHarf);






    }
}
