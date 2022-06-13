package tekrarNBH;

import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        //kullanicidan 4 bas. bir sayi girmesini  isteyin
        //sayi 5 e bölünüyorsa; 1ler bas 0sa 5e bölünen cift sayi yazdir
        //0 degilse 5e bölünen tek sayi yazdirin
        //e bölünmüyorsa tekrar deneyin yazdir

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi<1000 || 9999<sayi ){
            System.out.println("lütfen 4 bas. sayi giriniz");
        }

        else if (sayi%5 == 0) {
            if (sayi % 10 == 0) System.out.println("5e bölünen cift sayi");
            else if (sayi % 10 != 0) {
                System.out.println("5e bölünen tek sayi");
            }
        }
        else {
                System.out.println("tekrar deneyin");
            }
        }
}


// KENDİME YİLDİZLİ PEKİYİİİİİİİİĞĞĞĞĞĞĞĞĞĞĞĞĞĞĞĞĞ***********************************************

