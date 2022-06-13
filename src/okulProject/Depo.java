package okulProject;

import java.util.Scanner;

public class Depo {

   static Scanner scan=new Scanner(System.in); //bir cok kez kullanacagim icin class a yaziyorum methoda degi
    //hem de static olsun ki her yerden ulasabileyim

    public static void anaMenu() throws InterruptedException {

        String tercih="";
        do{
        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************ANA MENU***************\n" +
                "\n" +
                "\t 1- Okul Bilgileri Goruntule\n" +
                "\t 2-Ogretmen Menu\n" +
                "\t 3-Ogrenci Menu\n" +
                "\t Q-Cıkıs\n");

        System.out.println("Lutfen menuden tercihinizi yapiniz");
        tercih=scan.nextLine();

        switch (tercih){
            case "1": //okul bilgileri
                okulBilgileriniYazdir();
                    break;

            case "2"://ogretmen menu
                Ogretmen.ogretmenMenu();
                    break;

            case "3": //ogrenci menu
                Ogrenci.ogrenciMenu();
                    break;
            case "q":
            case "Q":
                break;
            default:
                System.out.println("Lutfen gecerli bir tercih giriniz");

        }



        }while (!tercih.equalsIgnoreCase("q"));

        projeDurdur();





    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("==========YİLDİZ KOLEJİ=============\n"+
         "\t\t Adres : "+ Okul.adres+
                "\n\t\t Telefon : " +Okul.telefon);
        Thread.sleep(5000);


    }

    public static void projeDurdur() {

        System.out.println("okul projesinden ciktiniz");
        System.exit(0);
    }

}

