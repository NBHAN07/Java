package day38_inheritance_overriding;

import java.util.ArrayList;
import java.util.List;

public class Ustabasi extends Isci {
    public String statu="ustabasi";
    public String haklar="ustabasi hftada 1 gun fazla tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("ariza varsa ustabasi ekstra ucret almadan calisir");
    }

    public void maasHesapla(){
        System.out.println("tum personel 30 gun * 8 saat * 12 euro = "+ (30*8*12)+"euro maas alir");
    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz class dan klasik haliyle bir obje olusturursak
        o obje ile cagirdigimiz variable ve methodlarda
        java once icinde bulundugumuz class a bakar
        aradigimiz class uyesi, icinde bulundugumuz class da varsa
        bize onu getirir
        YOKSA,
        parent class lara bakar ve ilk buldugunu bize getirir
         */
        Ustabasi yasin= new Ustabasi();
        System.out.println(yasin.statu);//"ustabasi"
        System.out.println(yasin.haklar);//ustabasi hftada 1 gun fazla tatil hakkina sah....
        System.out.println(yasin.ikramiye);//isciler yilda bir ikramiye alir
        System.out.println(yasin.izin);//personel yilda 4 hafta izin kullanir
        yasin.maasHesapla();
        yasin.mesai();

        /*

        eger isci olarak ozelliklerini gormek istersek
        class adini (Data turu) isci seceriz

        */

        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);//isci
        System.out.println(ahmet.haklar);//isciler kıdem tazminati alir
        System.out.println(ahmet.ikramiye);//isciler yilda bir ikramiye alir
        System.out.println(ahmet.izin);//personel yilda 4 hafta izin kullanir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        siz bir objeyi hangi classdan tanimlarsaniz o class a ait ozelliklere sahip olur
         */

        Personel adem=new Ustabasi();
        System.out.println(adem.statu);//personel
        System.out.println(adem.haklar);//tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye);//CTE verir. personel de ikramiyeye ait bir variable yok.
        // personel child olmadigi icin parentlarina da bakamiyorz
        System.out.println(adem.izin);//personel yilda 4 hafta izin kullanir
        adem.maasHesapla();
        adem.mesai();

       /*

       bu ikisi kesinlikle farklidir. farki overridding de anlayacagiz

       Personel adem=new Ustabasi(); bir ustabasi objesidir


        Personel adem=new Personel(); bir personel objesidir

        */

        /*
         Personel adem=new Ustabasi();

         ademin data turu personeldir.
          boylece biz ademi ne olarak isimlendirdigimizi bilebiliriz
          ancak biz ademin ustabasi oldugunu biliyoruz
          cunku constr.i ustabasi
          ama bu yazim formati ile
          ademin tum personel ile birlikte sahip oldugu
          ortak ozellikleri vurgulamak istiyoruz

          bu kullanim seklinde olusturulan obje
          data turu olarak secilen class ve onun parent class larindaki variable lari kullanabilir.

         */

        List<String> Liste=new ArrayList<>(); // listeyi rraylist olarak olusturduk ama
        // liste ozelliklerini gormek istiyoruz
        //liste temelde hala arraylist  yani



    }
}
