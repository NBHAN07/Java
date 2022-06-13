package day25_arrayList;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {
        //verilen bir arrayden istenen elementi silip kalanlari
        // yeni bir array olarak yazdiran bir methodolusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenElement=3;

        istenmeyenElementiSil(arr,istenmeyenElement);




    }

    public static void istenmeyenElementiSil(int[] arr, int istenmeyenElement) {

        //1- istenmeyen eleman sayisini bulalim
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == istenmeyenElement) {
                sayac++;
            }
        }

        //2- yeni arrayi olusturalim
            int arrYeni[]=new int[arr.length-sayac];

        //3- eski arrayden uygun elementleri yeniye tasiyalim

        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != istenmeyenElement){
                arrYeni[index]=arr[i];
                index++;
            }
        }

        //4- listeyi yazdiralim
        System.out.println(Arrays.toString(arrYeni));

      
                
            }    

        }


