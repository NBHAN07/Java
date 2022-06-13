package zeyneptekrar;

import java.util.Scanner;

public class  zynp25 {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse
        // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        // sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin

        if(sayi1>0 && sayi2>0) {
            System.out.println("iki pozitif tam sayinin toplami " +  (sayi1 + sayi2));

        } else if (sayi1<0 && sayi2<0) {
            System.out.println("iki sayinin carpımı: " + (sayi1*sayi2));

        } else if (sayi1<0 && sayi2 >0 || sayi1>0 && sayi2 <0 ){
            // else if (sayi1*sayi2<0) yazarsakta farklı isaretler oldugu anlasılır ve ıslem yapılmaz
            System.out.println("farkli isaretlerde sayilarla islem yapamazsiniz");
        } else {
            System.out.println("0 çarpmaya gore yutan elemandır islem yapilmaz düdük");
        }







    }
}
