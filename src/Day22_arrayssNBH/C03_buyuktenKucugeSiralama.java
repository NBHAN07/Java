package Day22_arrayssNBH;

import java.util.Arrays;

public class C03_buyuktenKucugeSiralama {
    public static void main(String[] args) {
        //verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun

        int arr[]={3,6,5,9,45,25,1};

        terstenSiralaYazdirma(arr);





    }//main sonu

    public static void terstenSiralaYazdirma(int[] arr) {

        Arrays.sort(arr); //[1, 3, 5, 6, 9, 25, 45]

        int tersArr[]=new int[arr.length];//[0, 0, 0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(tersArr));

        //arr dekileri tek tek alip tersArr e yerlestirecegiz

        for (int i = 0; i < arr.length ; i++) {

            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));






    }
}
