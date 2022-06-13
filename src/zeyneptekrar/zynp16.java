package zeyneptekrar;

public class zynp16 {

    public static void main(String[] args) {


        // primitive data turu ile non-primitive arasindaki farklar nelerdir ?

        String str= "Java";
        int sayi=10;

        System.out.println(str.toUpperCase()); // JAVA
        System.out.println(str);

        // non-primitive data turleri data depolamak yaninda bir cok faydali method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container)
        // primitive data turleri icin de bazi method'lar gerekli oldugunda
        // Java ara bir cozum uretmistir
        // Java her bir primitive data turunu, non-primitive  olarak kullanabilmek icin
        // ozel Class'lar olusturmus ve bunlara Wrapper Class adini vermistir

        double sayi2=20.5;
        // sayi2 primitive oldugundan sayi2. dedigimizde hic bir method gelmez

        Double sayi3= 15.2;
        // sayi3 wrapper Class olan Double class'ini kullandigindan
        // sayi3. dedigimizde bircok method gelir


        short sayi4=20;
        Short sayi5=30;
        sayi4=sayi5;  // wrapper class ile ayni isimdeki primitive data turu arasinda gecis olabilir
        System.out.println(sayi4); // 30
        System.out.println(Short.MAX_VALUE); // 32767
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.BYTES); // 2 Byte=16 bit

        // bunu yazdirabilmek icin short. yapmak gerekir

        String str1="12345";
        String str2="23456";

        // verilen iki string'deki syilari toplayin
        // Integer.valueOf iki string sayıyı toplamaya yarar
        System.out.println( str1 + str2 ); // 1234523456
        System.out.println(Integer.valueOf(str1) +  Integer.valueOf(str2) ); // 35801
        // Integer.valueOf(str1) methodu sadece sayisal deger iceren String'lerde kullanilabilir
        // bir tane bile sayi disinda karakter olursa Java hata verir


    }
}
