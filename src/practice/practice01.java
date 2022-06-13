package practice;

import java.util.Scanner;

public class practice01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" toplama icin 1\n cikarma icin 2\n bolme icin 3\n carpma icin 4 ");
        System.out.println("lutfen iki tam sayi giriniz");
        int islem= scan.nextInt();
        double num1= scan.nextDouble(); // ctrl D alt satira bulundugumuz satiri  kopyalar
        double num2= scan.nextDouble(); //birden fazla kelimeye alt tüsüna basıp data type degistirebiliriz.

     if (islem==1){
         System.out.println("toplama isleminin sonucu : " + num1 +"+ " +num2+"=" + (num1+num2));

     }else if (islem==2){
         System.out.println("cikartma isleminin sonucu : " + num1 +"-" +num2+"=" + (num1-num2));

     }else if (islem==3){
         System.out.println("bolme isleminin sonucu : " + num1 +"/ " +num2+"=" + (num1/num2));

     }else if (islem==4){
         System.out.println("carpma isleminin sonucu : " + num1+ "+ " +num2+"=" + (num1*num2));
     } else System.out.println("hatali secim yaptıgınız icin tekrar deneyiniz ulan" );



    }
}
