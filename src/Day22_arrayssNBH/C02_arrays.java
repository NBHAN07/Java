package Day22_arrayssNBH;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {
        //verilen bir array de en kücük ve en büyük degerleri yazdirin


        int arr1[]={3,5,8,4,12,56,12,7,0,1,8,9,-8};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(arr1[0]+" , "+arr1[arr1.length-1]);


        //sortsuz cozum

        int enKucukDeger=Integer.MAX_VALUE;
        int enBuyukDeger=Integer.MIN_VALUE;

        for (int i = 0; i < arr1.length ; i++) {

            if (enKucukDeger>arr1[i]){
                enKucukDeger=arr1[i];
            }
            if (enBuyukDeger<arr1[i]){
                enBuyukDeger=arr1[i];
            }

        }
        System.out.println(enKucukDeger+","+enBuyukDeger);




    }
}
