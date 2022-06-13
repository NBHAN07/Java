package day21_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        String arr1[]={"Nur", "Betul","Han"};
        //array icindeki elementlere ulasabilmek icin index kullaniriz

        System.out.println(arr1[0]);//Nur


        arr1[1]="Kurt";
        System.out.println(arr1[1]); //Kurt

        //yani biz arrayin icindeki indexi  kullanarak elementlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];
        System.out.println(arr2[0]); //0
        System.out.println(arr2[2]);//0
       // System.out.println(arr2[5]);//out of bounds verir


        //tamamini yazdirmak istersek

        System.out.println(arr2); //[I@58372a00; referansi yazdirir.
        // java; array non pritive obcekt oldugu icin steak teki adresine gider ve orada ne varsa onu yazdirir.
        // orada da referans vardir

        // array i yazdirmak icin java daki array class indan toString() kullanilir

        System.out.println(Arrays.toString(arr2));

        arr2[1]=11;
        arr2[2]=22;
        System.out.println(Arrays.toString(arr2));


    }
}
