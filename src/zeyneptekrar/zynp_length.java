package zeyneptekrar;

import java.util.Locale;
import java.util.Scanner;

public class zynp_length {
    public static void main(String[] args) {
        //kullanicidan ismini alip bas harfini ve son harfini buyuk harflerle yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen ismini giriniz");
        String ad= scan.nextLine();

        System.out.println("ilk harf : " + ad.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+ ad.toUpperCase(Locale.forLanguageTag("tr")).charAt(ad.length()-1));

        String str1="";
        System.out.println(str1.length()); //0

        String str2= null;
        System.out.println(str2.length()); // calistirildiginda hata verir
        //sondan 3 . harf icin length -3 yazılır










    }
}
