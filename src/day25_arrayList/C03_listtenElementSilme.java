package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_listtenElementSilme {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementi silip kalanlari
        // yeni bir array olarak yazdiran bir methodolusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenElement=3;

        istenmeyenElementiSilveYaazdir(arr,istenmeyenElement);


    }

    public static void istenmeyenElementiSilveYaazdir(int[] arr, int istenmeyenElement) {

        List<Integer> yeniList= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] != istenmeyenElement){
                yeniList.add(arr[i]);
            }

        }
        System.out.println(yeniList); //[4, 2, 5, 7, 8, 5, 2, 4]







    }
}
