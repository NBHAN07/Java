package day19_tahmin;

public class C05_scop {
    /* 1- bir method icinde olusturulan variablelar sadece olusturldukları
    method icinde kullanilabilirler
    baska methodlarda kullanılamazlar
    2- tum methodların kullanmasını istedigimiz variabllari
    Class Level da olustururuz
    Class Level da olusturdugumuz variable i
    ---- static yaparsak tum methodlar kullanabilir
    ---- static yapmazsak (instance) o zaman sadece static olmayan methodlarda kullanabiliriz
    3-veriable i loop un icinde olusturursak disinda kullanamayiz

         */
    static int sayi4;

    static String kurs="Java";
    int level=10;



    public static void main(String[] args) {
        int sayi=10;
        System.out.println(kurs);
       // System.out.println(level);

        int sayi2;

        sayi4++; // class seviyesinde olusturup deger atamadigim sayi4 ü artirmama java itiraz etmiyor
        // sayi2++; // ama main method icinde olusturup deger atamadigim sayiyi artirmama java izin vermiyor





    }
    public static void method1(){
        System.out.println(kurs);
       // System.out.println(level); kullanamadi cunku static
    }
    public  void method2(){
        System.out.println(kurs);
        System.out.println(level);
    }
}
