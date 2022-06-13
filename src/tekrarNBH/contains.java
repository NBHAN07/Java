package tekrarNBH;

import java.util.Scanner;

public class contains {
    public static void main(String[] args) {
        //kullanicidan mail adresi girmesi isteyin
        //mail @gmail.com içermiyorsa "lütfen gmail adresi giriniz" yazdir
        //içeriyorsa "gmail adresniz kaydedildi" yazin
        //@gmail.com ile bitmiyorsa "lütfen girdiginiz veriyi kontrol edin yazdir"

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir gmail adresi giriniz");
        String mail= scan.next();

        boolean iceriyor=mail.contains("@gmail");
        if (iceriyor==true){
            System.out.println("gmail adresiniz kaydedildi");
        } else {
            System.out.println("lütfen gmail adresi giriniz");
        }

        // yarisini yapabildim.**












    }
}
