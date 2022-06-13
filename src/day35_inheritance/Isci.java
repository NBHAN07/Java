package day35_inheritance;

public class Isci extends Personel {

    public static void main(String[] args) {

        Personel objPers= new Personel();
        objPers.isim="Eren";
        objPers.soyisim="Terzioglu";
        objPers.adres="Amsterdam";
        //buraya kadar personel olusturduk isci degil,
        //simdi isci olusturalim


        Isci objIsci= new Isci();
        objIsci.isim="Huseyin";
        objIsci.soyisim="Efe";
        objIsci.adres="Ankara";


    }
}
