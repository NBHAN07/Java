package tekrarNBH;

import java.util.Locale;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        //  else ile hafta içi hafta sonu yaz

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen gün ismi giriniz: ");

        String gunismi=scan.next().toLowerCase(Locale.ROOT);

        if (gunismi.equals("cumartesi") || gunismi.equals("pazar")){
            System.out.println("girdiginiz gün haftasonu");
        }
        else {
            System.out.println("girdiginiz gün hafta ici");
        }












    }
}
