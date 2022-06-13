package day23_arrays;

import java.util.Arrays;

public class C01_multiDimensionalArrays {
    public static void main(String[] args) {

        int arr[][]={{3,1,7},{6,10,2}};

        System.out.println(arr[0][2]); //7

        //ilk inner in tamamini yazdirmak istersek

        System.out.println(Arrays.toString(arr[0]));//arr[0] dersek bu bir array oldugundan direkt yazdirilamaz
        // o yuzden boyle yaptık

        System.out.println(Arrays.toString(arr)); //yine ayni mantikla referans yazdirir

        //MDA da tüm elementleri bir array olarak yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); //[[3, 1, 7], [6, 10, 2]] derinlemesine yazdir demis olduk

    }
}
