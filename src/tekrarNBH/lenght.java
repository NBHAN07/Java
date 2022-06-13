package tekrarNBH;

import javax.security.sasl.SaslClient;
import java.util.Locale;
import java.util.Scanner;

public class lenght {
    public static void main(String[] args) {
        // kullanicidan ismini alip ilk ve son harfini büyük yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk harf: " +isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf: " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); //0 verir

        String str2=null;
        System.out.println(str2); // calistirildiginda hata verir

        String str3;

        // str2 ve str3 e deger atanmamıstır.
        //str2 null ile isaretlendiginden java durumun kontrol altında oldugunu bilir
        //ve geriye kalan kodun calismasina engel olmaz
        //ancak str3 e deger atamasi olmadigindan java altını kirmizi cizer
        //ve bu düzeltilinceye kadar kodun geriye kalaninin calismasina izin vermez










    }
}
