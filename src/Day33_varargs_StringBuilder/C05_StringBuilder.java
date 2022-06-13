package Day33_varargs_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin
        ilk harften baslayarak tum karakterleri karsilastirir
        ayni olan karakterler icin bir sey yazdirmaz
        farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
        oldugunu yazdirir
        tamamen ayni ise 0 yazdirir

        bir sb ile bir stringi compare edersek java CTE verir
        */

        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("ali can");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));
        //System.out.println(sb1.compareTo(str));

        System.out.println(sb1.equals(sb2));//her seyiyle ayni iki objeyi karsilastiriyoruz
        //string olsaydi true verirdi
        //2 tane obje olarak dusundugu icin false donuyor
        //equals mantiksiz sb'de

        //ancak su durumda true verir
        System.out.println(sb1.equals(sb1));//true

        System.out.println(sb1.equals(str));//yine false

        // System.out.println(sb1==str); farkli turden iki objeyi kiyaslayamayiz


    }

}
