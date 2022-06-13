package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(1995,6,13);

        System.out.println(Period.between(dogumGunu,bugun));//yazmak istemiyorum yanlis bence

        System.out.println(Period.between(dogumGunu,bugun).getYears());//26 cok da sey diil bence



    }

}
