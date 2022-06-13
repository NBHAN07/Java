package day23_arrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method olusturun

        int arr[]={3,4,7};
        int eklenecekElement=4;

        arr= arrayeElemanEkle(arr,eklenecekElement);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElemanEkle(int[] arr, int eklenecekElement) {

        int yeniArray[]=new int[arr.length+1]; //[0,0,0,0] once yeni bir array olusturuyoruz

        for (int i = 0; i < arr.length ; i++) {

            yeniArray[i]=arr[i];

        }

        yeniArray[yeniArray.length-1]=eklenecekElement;

        return yeniArray;
    }
}

