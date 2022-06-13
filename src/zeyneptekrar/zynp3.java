package zeyneptekrar;

public class zynp3 {

    public static void main(String[] args){


        String ogrenciIsmi="Melih";
        ogrenciIsmi="Furkan";

        System.out.println(ogrenciIsmi); // furkan

        // bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        // Ancak declare edilen bir variable tekrar declare edilemez


        // String ogrenciIsmi="ZEYNEP"; calısmaz zaten yukarida string ogrenciIsmi olusturduk


        String isim, soyIsim, dogumYeri;

        isim="zeynep";
        soyIsim="han";
        dogumYeri="ankara";

        // yine soutla hepsini tek tek yazdirmak gerekir
        System.out.println(isim);
        System.out.println(soyIsim);
        System.out.println(dogumYeri);

        String tcNo= "10303223910";
        String telNo= "5079805420";
        String hiclik=" ";

        // String non-primitive oldugu icin biz sadece data saklamak degil
        // ekstra bazi ozellikleri de kullanabiliyoruz
        // Eger Tc No, okul numarasi veya Tel numarasi gibi
        // kendisi sayisal olan ancak matematiksel bir islemde kullanilmayan
        // degerler icin de String kullanilabilir

        String harf= "A";
        char harf2='A';

        // bu ikisi icin de ayni durum gecerli
        // ben A harfi icin bir variable'i char olarak da olusturabilirim String olarak da olusturabilirim
        // Eger sadece saklayacaksak char kullanilabilir ama
        // String'in ozelliklerinden istifade etmek icin String olarak tanimlamak daha avantajli olabilir






    }

}
