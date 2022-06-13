package tekrarNBH;

import java.util.Locale;

public class charArt2 {
    public static void main(String[] args) {

        // Stringde herhangi bir karakteri almak istedigimizde
        //o harfin index i kullanarak
        //str.charArt.(IstenenIndex) yazdirabiliriz

        String str= "Java Cok Guzel";

        System.out.println(str.charAt(0)); // J yi yazdiralim

        System.out.println(str.charAt(9)); // G yazar

        // va yazdiralim

        System.out.println(str.charAt(2)+str.charAt(3)); // böyle yaparsak ascii degerleri devreye girer

        // o yüzden basına ya da sonuna hiclik eklemeliyiz

        System.out.println(""+ str.charAt(2)+str.charAt(3)); // va yazdirir

        //cOK seklinde yazdiralim

        System.out.println(""+ str.toLowerCase(Locale.ROOT).charAt(5)+
                str.toUpperCase().charAt(6)+str.toUpperCase().charAt(7)); //hiçlik ilk elemanla isleme girmeli






















    }
}
