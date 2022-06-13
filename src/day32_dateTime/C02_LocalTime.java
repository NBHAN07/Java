package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);//14:46:17.815462900

        //bir islemin ne kadar surede bittigini bulmak istersek islemden
        // once ve sonra birer time objesi olusturup
        //aradki farki hesaplayabiliriz


        int sayi=0;

        for (int i = 0; i <10000000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);//14:57:35.562227800

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem "+ (nano2-nano1)+" nanosaniye sonra bitti");
        //islem 3.30019E7 nanosaniye sonra bitti


        //ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(450));//22:35:42.684089500

        //istersek zone ıd kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz



    }
}
