package zeyneptekrar;

import java.util.Locale;
import java.util.Scanner;

public class zynp21 {

    public static void main(String[] args) {

        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2 == 0) {

            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi%2 != 0){
            System.out.println("Girilen sayi tek sayi");
        }
        // normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        // o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement'da yapmak daha guzel olur


        // ======== if else ile cozum=======
        if (sayi%2==0){
            System.out.println("girdiginiz sayi cift sayidir");
        } else {
            System.out.println("girdiginiz sayi tek sayidir");

        }

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici
        // String case sensitive'dir
        // yani pazar, PAZAR,Pazar, PAzar bunlar hep farkli kelimelerdir
        // bu durumda String methodlarindan yardim aliriz

        Scanner gun= new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi=scan.next().toLowerCase(Locale.ROOT);

        //26.02 /11.23

        // String ifadelerde == kullanilmasi tavsiye edilmez
        // cunku bekledigimizden farkli sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals ("cumartesi")){
            System.out.println("girdiginiz gun ismi haftasonu");
        }

        if (gunIsmi.equals("pazartesi") || gunIsmi.equals ("sali") || gunIsmi.equals("carsamba")
                || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun ismi haftaici");

        }



    }
}
