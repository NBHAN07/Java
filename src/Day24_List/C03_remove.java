package Day24_List;

import java.util.ArrayList;
import java.util.List;

public class C03_remove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5); //[5]
        sayilar.add(3);//[5,3]
        sayilar.add(0, 7);//[7,5,3]
        sayilar.add(2, 7);//[7,5,7,3]

        sayilar.remove(3);//indeks olarak alir 3 ü ve orada ne varsa onu siler

        /*
        sayilardan olusan bir listte objeyi vererek element silme methodu calismaz
        sayi degeri girdigimizde java bunu otomatik olarak index kabul eder
         */


         //int sayi=5;
        // sayilar.remove(sayi);
        // System.out.println(sayilar); IndexOutOfBounds verir

        Integer sayi=5; //Integer wrapper class i kullaninca sayi obje oldugundan bu method calisti
        sayilar.remove(sayi);
        System.out.println(sayilar); // [7, 7]. Calisti.

        //yukaridaki primitive. ama ikinci ornek obje.






    }
}
