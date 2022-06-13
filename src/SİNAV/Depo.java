package SİNAV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Depo {
    /* TASK :
 * Basit bir 5 ürünlü manav alisveris programi yaziniz.
 *
 * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
 * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
 * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
 * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
 *
 * */

    static int sepet=0;
    static int toplamFiyat=0;
    static Scanner scan=new Scanner(System.in);

    public static void anaMenu() {


        System.out.println("********* MANAVİMİZA HOS GELDİNİZ******");
       /* List<String> urunListesi=new ArrayList<>();

        urunListesi.add("Domates");
        urunListesi.add("Biber");
        urunListesi.add("Patlican");
        urunListesi.add("Karpuz");
        urunListesi.add("Cilek");

       // System.out.println(urunListesi);

        */

        String tercih="";
        do {
            System.out.println(
                    "========== URUN LİSTEMİZ ===========\n" +
                    "1-Domates\n" +
                    "2-Biber\n" +
                    "3-Patlican\n" +
                    "4-Karpuz\n" +
                    "5-Cilek\n" );

            System.out.println("Lutfen almak istediginiz urunun yaninda bulunan sayiyi tuslayiniz\n" +
                    "alisverisi sonlandirmak istediginizde \" q \" harfini tuslayiniz");
            tercih=scan.nextLine();

            switch (tercih){

                case "1": //"Domates"
                    domatesAl();
                    break;
                case "2":
                    biber();
                    break;
                case "3":
                    patlican();
                    break;
                case "4":
                    karpuz();
                    break;
                case "5":
                    cilek();
                    break;
                case "q":

                case "Q":
                    break;

                default:

                 System.out.println("lutfen gecerli bir sayi/harf giriniz");

            }

        }while (!tercih.equalsIgnoreCase("q"));

        calismayiDurdur();


    }

    public static void cilek() {
        System.out.println("Cilegin birim fiyati 50 TL'dir\n" +
                " kac kg cilek almak istediginizi tuslayiniz: ");
        double kg=0;
        kg=scan.nextDouble();
        System.out.println(kg+"kg cilek sepetinize eklendi\n" +
                "su ana kadar yaptiginiz cilek alis verisin toplam tutari: "+50*kg+" TL'dir.");
        sepet+=kg;
        toplamFiyat+=50*kg;
        System.out.println("Alis verise devam etmek istiyor musunuz?");


    }

    public static void karpuz() {
        System.out.println("Karpuzun birim fiyati 40 TL'dir\n" +
                " kac kg karpuz almak istediginizi tuslayiniz: ");
        double kg=0;
        kg=scan.nextDouble();
        System.out.println(kg+"kg karpuz sepetinize eklendi\n" +
                "su ana kadar yaptiginiz karpuz alis verisin toplam tutari: "+40*kg+ " TL'dir.");

        sepet+=kg;
        toplamFiyat+=40*kg;
        System.out.println("Alis verise devam etmek istiyor musunuz?");

    }

    public static void patlican() {
        System.out.println("Patlican birim fiyati 30 TL'dir\n" +
                " kac kg patlican almak istediginizi tuslayiniz: ");
        double kg=0;
        kg=scan.nextDouble();
        System.out.println(kg+"kg patlican sepetinize eklendi\n"+
                "su ana kadar yaptiginiz patlican alis verisin toplam tutari: "+30*kg+" TL'dir.");

        sepet+=kg;
        toplamFiyat+=30*kg;
        System.out.println("Alis verise devam etmek istiyor musunuz?");
    }

    public static void biber() {
        System.out.println("Patlican birim fiyati 35 TL'dir\n" +
                " kac kg patlican almak istediginizi tuslayiniz: ");
        double kg=0;
        kg=scan.nextDouble();
        System.out.println(kg+"kg patlican sepetinize eklendi\n" +
                "su ana kadar yaptiginiz biber alis verisin toplam tutari: "+35*kg+" TL'dir.");

        sepet+=kg;
        toplamFiyat+=35*kg;
        System.out.println("Alis verise devam etmek istiyor musunuz?");
    }

    public static void domatesAl() {
        System.out.println("Domatesin birim fiyati 30 TL'dir\n" +
                " kac kg domates almak istediginizi tuslayiniz: ");
        double kg=0;
        kg=scan.nextDouble();
        System.out.println(kg+"kg domates sepetinize eklendi\n" +
                "su ana kadar yaptiginiz domates alis verisin toplam tutari: "+30*kg+" TL'dir.");
        sepet+=kg;
        toplamFiyat+=30*kg;
        System.out.println("Alis verise devam etmek istiyor musunuz?");


    }

    public static void calismayiDurdur() {
        System.out.println("alisverisiniz sonlandi");
        System.out.println("sepetinizde "+sepet+" kg urun bulunmaktadir\n" +
                "bu urunterin toplam fiyati: "+ toplamFiyat+" TL'dir.\n" +
                "Bizi tercih ettiginiz icin tesekkur ederiz, keyifli alis verisler." );

    }
}
