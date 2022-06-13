package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {


        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);//2022-04-04T15:18:16.380198500 aradaki T bundan sonrasi time demek

        System.out.println(tarihSaat.plusYears(1).plusMonths(3).plusDays(7).plusHours(77));//2023-07-14T20:22:13.882126

    }
}
