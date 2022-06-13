package day15;

import java.util.Scanner;

public class methodOlusturma2 {
    public static void main(String[] args) {


        // kullanicidan bir kelime iteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa " yazdirin
        // kelime 3,4 veya 5 harfli ise harf sayisinive kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime =scan.next();
        String tersKelime="";
        int harfSayisi= kelime.length();

        if (harfSayisi<3 ){
            System.out.println("kelime cok kisa");

        }else if (harfSayisi==3){
            ucHarfiTersineCevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersineCevir();
        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);
        }else{
            System.out.println("kelime cok uzun " );
        }

    }

    private static void ucHarfiTersineCevir(String kelime) {
    }

    private static void besHarfiTersineCevir(String kelime) {
         String tersKelime=kelime.substring(4)+
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);
    }

    private static void dortHarfiTersineCevir() {
    }

   
}
