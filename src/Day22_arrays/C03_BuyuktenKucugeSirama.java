package Day22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSirama {
    public static void main(String[] args) {
        //verilen bir array i buyukten  kucuge siralayip yazdiran bir method

        int arr []= {3,5,6,1,9,45,25,4,9,0};

        terstenSiralaYazdir(arr);

    }

    private static void terstenSiralaYazdir(int[] arr) {

        Arrays.sort(arr);

        int tersArr[]=new int[arr.length];
        System.out.println(Arrays.toString(tersArr));

        for (int i = 0; i < arr.length; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));




    }
}
