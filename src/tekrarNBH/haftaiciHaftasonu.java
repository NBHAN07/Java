package tekrarNBH;

import java.util.Locale;
import java.util.Scanner;

public class haftaiciHaftasonu {
    public static void main(String[] args) {
        // kullanıcıdan aldıgın gunu hafta ici mi sonu mu yazdir
        //*** string icin equals methodu kullan

        // cumartesi, pazar; hafta sonu
        // pazartesi-cuma hafta ici

        //string case sensitivedir
        //pazar,Pazar,PAZAR farklıdır string icin farklı kelimelerdir

        //bu durumda string metodlarından yardım alırız


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz");
        String gunİsmi=scan.next().toLowerCase(); //kullanıcı nasıl yazarsa yazsın biz kucuk harfle yadırıyoruz

        if (gunİsmi.equals("cumartesi") || gunİsmi.equals("pazar")){
            System.out.println("girdiğiniz gün hafta sonu");}

         if (gunİsmi.equals("pazartesi")||gunİsmi.equals("sali")||gunİsmi.equals("carsamba")||
                 gunİsmi.equals("persembe")||gunİsmi.equals("cuma")){
            System.out.println("girdiginiz gün haftaici");}




























    }
}
