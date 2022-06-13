package monkeyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};

        uniqeArray(arr);



    }

    private static void uniqeArray(int[] arr) {

        List<Integer> liste=new ArrayList<>();



        for (Integer each: arr
             ) {
            for (int i = 0; i < arr.length-1 ; i++) {
                if (!liste.contains(arr[i])){
                    liste.add(arr[i]);
                }
            }

            }
        System.out.println(liste);

        }
    }



