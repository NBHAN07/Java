package Day22_arrayssNBH;

import java.util.Arrays;

public class C04_terstenSiralayipKaydetme {
    public static void main(String[] args) {
        //verilen bir arrayi buyukten kucuge siralayip kaydeden bir method olusturun

        int arr[] = {3, 6, 5, 9, 45, 25, 1};

        arr = terstenSiralama(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("en buyuk element: " + arr[0]);

    } //main sonu

    public static int[] terstenSiralama(int[] arr) {

        Arrays.sort(arr); //[1, 3, 5, 6, 9, 25, 45]

        int tersArr[] = new int[arr.length];//[0, 0, 0, 0, 0, 0, 0]

        System.out.println(Arrays.toString(tersArr));

        //arr dekileri tek tek alip tersArr e yerlestirecegiz

        for (int i = 0; i < arr.length; i++) {

            tersArr[i] = arr[arr.length - 1 - i];
        }

        return tersArr;


    }

}
