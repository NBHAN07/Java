package tekrarNBH;

import java.util.Scanner;

public class nbh3 {
    public static void main(String[] args) {

        // 1. adim bir scanner olusturmak

        Scanner scan= new Scanner(System.in); // esitligin sagında yeni bir scanner olusturulu
                                              // ve olusturulan bu scanner, scan variable ina assign edilir

        //2. adim kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdir

        System.out.println("lütfen isminizi giriniz: ");

        // 3. adim kullanicinin girdigi degeri uygun bir variable olusturup kaydet

        //String kullaniciIsmi= scan.next(); // sadece ilk kelimeyi alir yani ilk bosluga kadar


        String kullaniciIsmi= scan.nextLine();
        System.out.println("kullanicinin girdigi isim : " + kullaniciIsmi);













    }

}
