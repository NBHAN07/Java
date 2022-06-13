package day23_arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //verilen bir arraye yeni bir element ekleyen bir method olusturun

        int arr[]={3,4,7};

        //arr[3]=8; olmayan indekse yeni deger atayamayiz

       // arr={3,4,8}; var olan bir arraye ayni boyutta bile olsa direkt yeni degerler içeren bir array atayamayiz

        arr=new int[4]; //[0, 0, 0, 0] //yepyeni bir array oldu
        System.out.println(Arrays.toString(arr));

        int arrYeni[]=new int[5];

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0]

        arrYeni[2]=5;
        arrYeni[1]=8;

        System.out.println(Arrays.toString(arr));//[0, 8, 5, 0, 0]

        //bir array e icinde hazir elementlerin oldugu yeni bir array atamak istersek
        //bunu {1,2,3} diye yazarak degil
        //new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir arrayi
        //assign ederek yapariz

        int arrEnYeni[]={1,2,3,4}; //ya da boyle yapabilirizz!!!
        arr=arrEnYeni;
        System.out.println(Arrays.toString(arr));




    }
}
