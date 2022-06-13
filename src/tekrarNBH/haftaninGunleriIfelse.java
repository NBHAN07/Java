package tekrarNBH;

import java.util.Scanner;

public class haftaninGunleriIfelse {
    public static void main(String[] args) {

        //hatalı girisleri de yazdıracagız

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String gunİsmi=scan.next().toLowerCase();

        if (gunİsmi.equals("cumartesi") || gunİsmi.equals("pazar")) {
                       System.out.println("girdiğiniz gün hafta sonu");
        }


        else if (gunİsmi.equals("pazartesi")||gunİsmi.equals("sali")||gunİsmi.equals("carsamba")||
                gunİsmi.equals("persembe")||gunİsmi.equals("cuma")) {
            System.out.println("girdiginiz gun haftaici");

        }

        else {
            System.out.println("lütfen gecerli bir gun ismi giriniz");
        }
        //else ile bitmese de calısır ama bu durumda illaki biri calısır diyemeyiz


















    }
}
