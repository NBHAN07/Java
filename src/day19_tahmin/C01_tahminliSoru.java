package day19_tahmin;

import java.util.Random;
import java.util.Scanner;

public class C01_tahminliSoru {
    public static void main(String[] args) {
        //bilgisayara 1-100 arasi bir soru tutturun
        //kullanicidan bu sayiyi tahmin etmesini isteyin
        //girilen her tahminde kullaniciya sayiyi buyut ya da kucult diye yol gosterin
        //kullanici sayiyi buldugunda kac tahminde buldugunu yazdirin

        Random rnd=new Random();
        int sayi=rnd.nextInt(100); //burasi 100 den kucuk rastgele bir sayi olusturur

        //System.out.println(sayi); // bilgisayarin tuttugu sayi

        Scanner scan=new Scanner(System.in);
        int tahmin=0;
        int sayac=1; //tek seferde buursa diye 1den baslattik

        while (tahmin!=sayi){
            System.out.println("lutfen bir sayi giriniz: ");
            tahmin=scan.nextInt();

            if (tahmin<sayi){
                System.out.println("lutfen daha buyuk bir sayi giriniz");
            } else if (tahmin>sayi){
                System.out.println("lutfen daha kucuk bir sayi giriniz");
            }
            sayac++;

        }
        System.out.println(sayac-1+ " tahminde sayiyi buldunuz");





    }
}
