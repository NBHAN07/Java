package tekrarNBH;

public class nbh {

    public static void main(String[] args) {
        // 1. farklı 3 data türünde variable olusturun ve bunları yazdırın

        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='N';
        System.out.println(ilkHarf);

        int sayi1=10; int sayi2=20;
        System.out.println(sayi1+sayi2);

        // 2. isim ve soyisim icin 2 variable olusturun ve bunları
        // isim nurbetul
        // soyisim han olarak yazdırın

        String isim="nurbetul";
        String soyisim="han";

        System.out.println("isminiz : " + isim);
        System.out.println("soyisminiz : " + soyisim);

        //3. iki farkli tamsayi data turunde 2 variable olusturun ve bunlarin toplamini yazdirin

        short sayi3=20;
        double sayi4=30;

        System.out.println("iki sayinin toplami" + (sayi3 + sayi4)); // 50.0

        //4. char data turunde bir variable olusturun ve yazdirin

        char ozelKarakter='&';
        System.out.println(ozelKarakter);

        // Bir tam sayi ve bir de char degisken olusturun ve toplamini yazdirin

        int sayi5=20;
        char harf='a';

        System.out.println(sayi5+harf);//117

        // char data turundeki degiskenler matematiksel islemlerde kullanilirsa
        // o char degerinin ASCII degeri alinir












    }
}
