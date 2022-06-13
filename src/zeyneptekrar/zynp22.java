package zeyneptekrar;

import java.util.Scanner;

public class zynp22 {

    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas>=65){
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsın");
            System.out.println(65-yas + "yıl daha calısmalısın");
        }

        // if else statement'larda iki durumdan sadece ve sadece biri calisir
        // ikisinin birden calisma ihtimali ====> YOK
        // ikisinin de calismama ihtimali =====> YOK


         //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici gun ismini yanlis girerse "Yanlis giris" yazdirin
        //  Ornek:      gun=Pazar output = “Hafta sonu”
        //      gun=Sali output = “Hafta ici”
        //  *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici


        Scanner scann= new Scanner(System.in);
        System.out.println("Lutfen gun ismini yaziniz");
        String gunIsmi= scan.next().toLowerCase();


        // hatali girisleri de yazdirmak icin
        // olasiliklari 3'e cikardim
        // hafta sonu - hafta ici - yanlis giris

        if (gunIsmi.equalsIgnoreCase("PAZAR") || gunIsmi.equalsIgnoreCase("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
            //eger sadece equals yaparsak " " icersindeki gibi kabul ediyor büyük harf kucuk harf yada arada buyuk
            // kucuk karisik kullandıgımızda da kabul etmiyor
            // FAKAT EQUALSIGNORECASE YAPARSAK KUCUK HARF BUYUK HARF YADA KARİSİK YAZILMASINA BAKMAZSIZIN DOGRU CEVABI VERİR.
        }

        else if (gunIsmi.equals("pazartesi")|| gunIsmi.equals("sali")|| gunIsmi.equals("carsamba")|| gunIsmi.equals("persembe")||
        gunIsmi.equals("cuma")){
            System.out.println( "girdiginiz gun ismi hastaici");
        } else{
            System.out.println( "yanlis gun ismi girdinzi");
        }

        // eger if else if .... statement else ile bitiyorsa
        // olasiliklardan sadece bir tanesi mutlaka calisir
        // Java ilk buldugu true'a ait sonucu yazdirir
        // ve kalan sartlara bakmaz
        // if else if.... cumleleri else ile bitmese de calisir
        // ancak bu durumda sadece bir olasilik calisabilir VEYA hic bir islem yapilmayabilir



    }
}
