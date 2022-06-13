package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; //kabul eder ama deger atamadan kullanmamiza izin vermez

        arr=new int[6];
        System.out.println(Arrays.toString(arr)); // [0,0,0,0,0,0]
        System.out.println(arr.length); //6
        // string deki lenght de () vardi bunda yok

        // array deki her bir elemani indeks sayisi kadar artiralim

        for (int i = 0; i < arr.length ; i++) {

            arr[i]+=i;
        }

        System.out.println(Arrays.toString(arr));

        // son indexteki elementi yazdiralim

        System.out.println(arr[arr.length-1]); //5














    }
}
