package day20_scope;

public class C01_instance {

    int sayi;
    String bransIsmi="java";
    boolean okulAcikMi;

    //bunlar static degil yani instance. o halde main static old. icin icinde buna deger atayamam


    public static void main(String[] args) {

       // sayi=10; sayi variable i static olmadigi icin main methoddan direkt kullanilamaz
        //instance variable lara static methodlardan ulasabilmek icin obje olusturmamiz gerekir

        C01_instance obje1=new C01_instance(); //iste böyle de objeyi olusturduk ögretmen veya ögrenci gibi
        System.out.println(obje1.sayi); // sayiya deger atamadigim icin 0 yazdirir.

        // sayi=10; diyemeyiz
        System.out.println(obje1.sayi); //0
        obje1.sayi=10;  // diyebiliriz sayiya yeni deger atadik artik
        System.out.println(obje1.sayi); //10
        obje1.bransIsmi="SQL";
        System.out.println(obje1.okulAcikMi); // atama olmadiği icin false döndürür

        C01_instance obje2=new C01_instance();
        System.out.println(obje2.sayi); //obje2 baska bir ögrenci artik. yani yeni atama yapilmadi ona o yuzden 0 yazdirir
        System.out.println(obje2.bransIsmi); //java yazdirir cunku obje2 de bransismi icin yeni atama yapmadik

        obje1.okulAcikMi=true;
        System.out.println(obje2.okulAcikMi);











    }
}
