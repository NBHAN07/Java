package day23_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        //kullaniciya kac elementlik bir array olusturacagini sorun
        //arrayi olusturup elementleri kullanicidan alip arraya atayin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kac elementli bir array isteiginizi yaziniz");

        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin "+(i+1)+". elemani giriniz: ");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
}
