package day19_tahmin;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak üzere sayilar isteyin
        //islemi bitirmek icin 0a basmasini soyleyin
        //kullanici negatif sayi girerse dikkate almayin ve negatif sayi giremezsiniz yazdirin
        //kullanici 0 a bastiginda toplam kac sayi girdigin
        //ve yanlislikla kac negatif sayi girdigini
        //ve pozitif sayilarin toplamini yazdırın

        Scanner scan=new Scanner(System.in);
        int sayi=1000;
        int toplam=0;
        int sayacPozitif=0;
        int sayacNegatif=0;


        do {
            System.out.println("lutfen pozitif bir tam sayi giriniz \nişlemi bitirmek icin 0 a basin:");
            sayi=scan.nextInt();
            if (sayi<0){
                System.out.println("negatif sayi giremezsiniz");
                sayacNegatif++;
            } else if (sayi>0){
                toplam+=sayi;
                sayacPozitif++;
            }

        } while (sayi!=0);
        System.out.println("yanlislikla girilen negatif sayi adedi: " + sayacNegatif);
        System.out.println("girilen pozitif sayi adedi: " + sayacPozitif);

        System.out.println("girilen sayilarin toplami: " + toplam);























    }}