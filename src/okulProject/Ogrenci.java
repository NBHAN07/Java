package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Scanner scan=new Scanner(System.in);

    static Map<String,String> ogrenciMap=new HashMap<>();
    public static void feykogrenciEkle(){
        ogrenciMap.put("78945612311","Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("78945612322","Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("78945612333","Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("78945612344","Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("78945612355","Alp, Yan, 2009, 3769, 11, A");
    }
public static void ogrenciMenu() throws InterruptedException {

        String tercih="";

        do {
            System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                    "************Ogrenci MENU***************\n" +
                    "\n" +
                    "\t 1- Ogrenci Listesi\n" +
                    "\t 2- Soyisimden Ogrenci Bulma \n" +
                    "\t 3- Sınıf ve Sube ile Ogrenci Bulma\n" +
                    "\t 4- Ogrenci Ekleme\n" +
                    "\t 5- Kimlik no ile kayit silme\n" +
                    "\t A- Ana Menu\n" +
                    "\t Q- Cıkıs\n");
            tercih= scan.nextLine();

            switch (tercih){
                case "1" :
                    ogrenciLİsteleYazdir();
                    break;
                case "2" :
                    soyIsimdenOgrenciBulma();
                    break;
                case "3" :
                    sinifveSubeileOgrenciBulma();
                    break;
                case "4" :
                    bilgileriniGirerekOgrenciEkleme();
                    break;
                case "5" :
                    tcNoileOgrenciSİlme();
                    break;
                case "A" :
                case "a" :
                    Depo.anaMenu();
                    break;
                case "q" :

                case "Q" :
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("lütfen gecerli bir tercih giriniz");
            }

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
}

    private static void tcNoileOgrenciSİlme() {
        System.out.println("silinecek ogrenci kimlik no giriniz");
        String silinecekOgrenci=scan.nextLine();

        String silinecekValue= ogrenciMap.get(silinecekOgrenci);//bu bana silinecekOgretmen in value sunu getirir


        String sonucValue= ogrenciMap.remove(silinecekOgrenci);

        try {
            sonucValue.equals(silinecekValue);
        } catch (Exception e) {
            System.out.println("verilen kimlik no ile eslesen ogrenci bulunamadi");
        }
    }

    private static void bilgileriniGirerekOgrenciEkleme() {
        System.out.println("lütfen tc no giriniz");
        String tc=scan.nextLine();
        System.out.println("lütfen isim giriniz");
        String isim=scan.nextLine();
        System.out.println("lütfen soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println("lütfen dogum yilini giriniz");
        String dogumYili=scan.nextLine();
        System.out.println("lütfen okul no giriniz");
        String okulNo=scan.nextLine();
        System.out.println("lütfen sinif giriniz");
        String sinif=scan.nextLine();
        System.out.println("lütfen sube giriniz");
        String sube=scan.nextLine();

        String key=tc;
        String value=isim+", "+soyisim+", "+dogumYili+", "+okulNo+", "+
                sinif+", "+sube;
        ogrenciMap.put(key,value);



    }

    private static void sinifveSubeileOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String,String>> myEntrySet=ogrenciMap.entrySet();

        System.out.println("istediginiz ogrenci sinifini yaziniz");
        String istenilenSinif=scan.nextLine();
        System.out.println("istediginiz ogrenci subesini yaziniz");
        String istenilenSube=scan.nextLine();
        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************Ogrenci LİSTESİ***************\n " +
                "TC No      Isim   Soyisim   D.Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each: myEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
            if ( istenilenSinif.equalsIgnoreCase(eachValueArr[4]) && istenilenSube.equalsIgnoreCase(eachValueArr[5]) ){
                System.out.printf("%-12s %-6s %-9s %-6s %-8s %-6s %-4s \n",eachKey, eachValueArr[0], eachValueArr[1],eachValueArr[2],
                        eachValueArr[3],eachValueArr[4],eachValueArr[5]);
            }
        }

        Thread.sleep(3000);

    }

    private static void soyIsimdenOgrenciBulma() throws InterruptedException {
        Set<Map.Entry<String,String>> myEntrySet=ogrenciMap.entrySet();

        System.out.println("istediginiz ogrenci soismini yaziniz");
        String istenilenSoyisim=scan.nextLine();
        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************Ogrenci LİSTESİ***************\n " +
                "TC No      Isim   Soyisim   D.Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each: myEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
           if (istenilenSoyisim.equalsIgnoreCase(eachValueArr[1])){
               System.out.printf("%-12s %-6s %-9s %-6s %-8s %-6s %-4s \n",eachKey, eachValueArr[0], eachValueArr[1],eachValueArr[2],
                       eachValueArr[3],eachValueArr[4],eachValueArr[5]);
           }
        }

        Thread.sleep(3000);
    }

    private static void ogrenciLİsteleYazdir() throws InterruptedException {
        Set<Map.Entry<String,String>> myEntrySet=ogrenciMap.entrySet();
        System.out.println(ogrenciMap);
        System.out.println("==========YİLDİZ KOLEJİ=============\n" +
                "************Ogrenci LİSTESİ***************\n " +
                "TC No      Isim   Soyisim   D.Yili  Okul No  Sinif  Sube");
        for (Map.Entry<String,String> each: myEntrySet
             ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            String eachValueArr[]=eachValue.split(", ");
            System.out.printf("%-12s %-6s %-9s %-6s %-8s %-6s %-4s \n",eachKey, eachValueArr[0], eachValueArr[1],eachValueArr[2],
                    eachValueArr[3],eachValueArr[4],eachValueArr[5]);
        }

        Thread.sleep(5000);
    }
}
