package tekrarNBH;

import java.util.Scanner;

public class notuHarfeCevirme {
    public static void main(String[] args) {

        // kullanicidan notu isteyip harf sistemine cevirin
        //<50 D
        //50-60 C
        //60-80 B
        //<80 A
        // en önemli sarti en basa koymak en dogru yontemdir
        // durum sayisi-1=if sayisi


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not= scan.nextDouble();


        if (0<=not && not<=50){
            System.out.println("notunuz D");
        }
        else if (not<=60 && 50<not) {
            System.out.println("harf notunuz C");
        }
        else if (60<not && not<80){
            System.out.println("harf notunuz B");
        }
        else if (80<=not && not<=100){
            System.out.println("harf notunuz A");
        }

        else {
            System.out.println("lütfen gecerli bir not giriniz"); }




    }
}
