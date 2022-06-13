package zeyneptekrar;

import java.util.Locale;
import java.util.Scanner;

public class zynp_string_manipulations_equals {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        // Biz string metotlarini arka arkaya kullanabiliriz
        // mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        //str.charAt(5) boyle yadigimizde sonuc artik string degil char olacaktır
        //dolayısıyla strinde yapmak istedigim tum degisiklikleri
        //once yapıp sonra charAt methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));

        String str1= "Ali Can";
        String str2= "Ali" + " Can";
        System.out.println("str1: "+ str1);
        System.out.println("str2: "+ str2);


        System.out.println("== ile karsilastir:" + (str1==str2));
        System.out.println("equals ile karsilastir:" + str1.equals(str2));

        String str3 =str1+ "";
        System.out.println("str3:" + str3); //(str3 de olabilir ayni seyi yazdirir)
        System.out.println("== ile karsilastir:" + (str3==str2));
        System.out.println("equals ile karsilastir:" + str3.equals(str2));

        // stringde == (double equals) her zaman dogru sonuc vermez
        // bunun icin emin oldugmuz equals methodunu kullanmayi tercih ederiz

        String str5= "hasan";
        String str6= "HASAN";

        System.out.println(str5.equals(str6)); // false buyuk harf kucuk harf duyarlidir
        System.out.println(str5.toUpperCase().equals(str6)); // true

        // kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse cevabini ve katiliminiz alınmistir yazdirin
        // hayir derse cevabini ve "sonraki derslerimize bekleri" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("derse katilmak ister misiniz? \n Evet veya Hayir  yaziniz");
        String cevap = scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz :" + cevap+ "derse katiliminiz onaylanmistir");

        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " +cevap+ " sonraki dersimize bekleriz");

        }else {
            System.out.println("lutfen gecerli bir yanit giriniz");
        }
















    }
}
