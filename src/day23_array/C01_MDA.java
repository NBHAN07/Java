package day23_array;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {


        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]); //7

        //ilk inner array in tüm elemanlarini yazdirin

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr)); //[[I@58372a00, [I@4dd8dc3]

        System.out.println(Arrays.deepToString(arr));//[[3, 1, 7], [6, 10, 2]]




    }






}
