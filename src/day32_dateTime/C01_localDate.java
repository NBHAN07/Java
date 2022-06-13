package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_localDate {
    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();//objenin olusturuldugu tarihi trh ye assign eder
        LocalDate baskaTrh=LocalDate.of(1995,6,13);
        //istedigimiz yil ay  gun degerlerine gore bize obje olusturulur

        System.out.println(trh);//2022-04-04
        //get'li method'larla tarih ile ilgili detay bilgileri bulabiliriz

        System.out.println(trh.getDayOfMonth());//4
        System.out.println(trh.getDayOfWeek());//MONDAY
        System.out.println(trh.getMonthValue());//4
        System.out.println(trh.getYear());//2022
        System.out.println(trh.getDayOfYear());//94

        //bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20));//20 hafta once tarih nedir?
        //2021-11-15

        System.out.println(trh.minusDays(3));//3 gun once ? 2022-04-01

        System.out.println(trh.plusMonths(10).plusDays(3));//2023-02-07



        //istedigimiz ulkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);//2022-04-04

        //is ile baslayan methodlar boolean sonuclr dondurur

        System.out.println(LocalDate.now().isLeapYear());//false. "artik yil mi?"
        System.out.println(trh.isAfter(baskaTrh));// true









    }
}
