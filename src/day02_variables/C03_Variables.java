package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";

        // bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        // ancak declare edilen bir variable tekrar declare edilemez
        // string ogrenciIsmi = "Abdullah";

        String isim,soyisim,dogumYeri;

        isim="Nihad";
        soyisim="ozel";
        dogumYeri="ankara";

        System.out.println(dogumYeri);


        String tcNo ="123456789";
        String hiclik="";

        //String nun-primitive oldugu için biz sadece data saklamak degil
        // ekstra bazı özelliklerini de kullanabiliyoruz
        //eger tc no veya tel, okul no gibi
        //kendisi sayısal olan ancak matematiksel bir islemde kullanılmayan
        //degerler icin de string kullanılabilir


        String harf= "A";

        char harf2= 'A';

        // bu ikisi icin de ayni durum gecerli
        //ben A harfi icin bir variable char olarak da string olarak da olusturabilirim
        // eger sadece saklayacaksak char olur ama
        // string'in özelliklerinden istifade etmek icin string daha avantajlı

    }
}
