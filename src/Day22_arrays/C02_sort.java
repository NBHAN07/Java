package Day22_arrays;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {
        //verilen array de en kucuk ve en buyuk degeri yazdir

        int arr []= {3,5,6,1,9,45,25,4,9,0};

        // sort methodu olmadan yapalim

        int enKucukSayi=Integer.MAX_VALUE;
        int enBuyuksayi=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<enKucukSayi){
                enKucukSayi=arr[i];

            }

            if (arr[i]>enBuyuksayi){
                enBuyuksayi=arr[i];
            }


        }

        System.out.println("Arraydeki en kucuk sayi: " + enKucukSayi);
        System.out.println("Arraydeki en buyuk sayi: " + enBuyuksayi);

        Arrays.sort(arr);
        System.out.println("Arraydeki en kucuk sayi: "+ arr[0]);
        System.out.println("Arraydeki en kucuk sayi: " + arr[arr.length-1]);


    }
}
