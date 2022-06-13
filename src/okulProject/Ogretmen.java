package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scan=new Scanner(System.in);
    static Map<String,String> ogretmenlerMap=new HashMap<>();
    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("12345678900","Ali, Tan, 1980, Matematik");
        ogretmenlerMap.put("12345678911","Alp, Can, 1980, Turkce");
        ogretmenlerMap.put("12345678922","Alim, Kan, 1980, Fizik");
        ogretmenlerMap.put("12345678933","Ali, Can, 1980, Matematik");






    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                    "************Ogretmen MENU***************\n" +
                    "\n" +
                    "\t 1- Ogretmen Listesi\n" +
                    "\t 2- Soyisimden Ogretmen \n" +
                    "\t 3- Branstan Ogretmen\n" +
                    "\t 4- Ogretmen Ekleme\n" +
                    "\t 5- Kimlik no ile kayit silme\n" +
                    "\t A- Ana Menu\n" +
                    "\t Q- Cıkıs\n");
            tercih= scan.nextLine();

            switch (tercih) {
                case "1"://ogretmen listesi
                    ogretmenListesiYazidir();
                    break;
                case "2": //soy isimden ogretmen bulma
                    soyIsimdenOgretmenBulma();
                    break;
                case "3": //soy isimden ogretmen bulma
                    branstanOgretmenBulma();
                    break;
                case "4": //Ogretmen Ekleme
                    ogretmenEkleme();
                    break;
                case "5"://Kimlik no ile kayit silme
                    kimlikNoKayitSilme();
                    break;
                case"a":
                case "A":
                    Depo.anaMenu();
                    break;
                case"q":
                case "Q":
                    break;
                default:
                    System.out.println("lutfen gecerli bir tercih yapiniz");
            }


        }while(!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void kimlikNoKayitSilme() {
        System.out.println("silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen=scan.nextLine();

        String silinecekValue= ogretmenlerMap.get(silinecekOgretmen);//bu bana silinecekOgretmen in value sunu getirir


        String sonucValue= ogretmenlerMap.remove(silinecekOgretmen);

        try {
            sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("verilen kimlik no ile eslesen ogretmen bulunamadi");
        }

    }

    public static void ogretmenEkleme() {
        System.out.println("tcNo:"); //key bu
        String tcNo=scan.nextLine();
        System.out.println("isim:");//kalanlarin hepsi value
        String isim=scan.nextLine();
        System.out.println("soyIsim:");
        String soyIsim=scan.nextLine();
        System.out.println("dogumYili:");
        String dogumYili=scan.nextLine();
        System.out.println("brans:");
        String brans=scan.nextLine();

        String eklenecekValue=isim+", "+soyIsim+", "+dogumYili+", "+brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);

    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("lutfen aradiginiz ogretmenin bransini giriniz");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet =ogretmenlerMap.entrySet();

        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************Ogretmen Brans Listesi***************\n"+
                "TcNo       Isim   Soyisim  D.Yili   Brans");
        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey= each.getKey();
            String eachValue= each.getValue();

            String eachValueArr[]= eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[3])){
                System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2], eachValueArr[3]);
            }


        }
        Thread.sleep(3000);

    }

    public static void soyIsimdenOgretmenBulma() throws InterruptedException {
        System.out.println("lutfen aradiginiz ogretmenin soy ismini giriniz");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet =ogretmenlerMap.entrySet();

        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************Ogretmen Soyisim Listesi***************\n"+
                "TcNo       Isim   Soyisim  D.Yili   Brans");
        for (Map.Entry<String,String> each: ogretmenEntrySet
        ) {
            String eachKey= each.getKey();
            String eachValue= each.getValue();

            String eachValueArr[]= eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[1])){
                System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey,eachValueArr[0],eachValueArr[1],
                        eachValueArr[2], eachValueArr[3]);
            }


        }
        Thread.sleep(3000);








    }

    public static void ogretmenListesiYazidir() throws InterruptedException {
       // System.out.println(ogretmenlerMap); //map olarak yazdiriyor. liste olarak yazdirmak istiyoruz

        Set<Map.Entry<String,String>> ogretmenEntrySet =ogretmenlerMap.entrySet();

        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************Ogretmen Listesi***************\n"+
                "TcNo       Isim   Soyisim  D.Yili   Brans");
        for (Map.Entry<String,String> each: ogretmenEntrySet
             ) {
            String eachKey= each.getKey();
            String eachValue= each.getValue();

            String eachValueArr[]= eachValue.split(", ");

            System.out.printf("%11s %-6s %-8s %4s %s \n", eachKey,eachValueArr[0],eachValueArr[1],
                    eachValueArr[2], eachValueArr[3]);
        }
        Thread.sleep(3000);



    }
}
