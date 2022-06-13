package tekrarNBH;

import java.util.Scanner;

public class ifIleTekciftOrnek {
    public static void main(String[] args) {

        //kullanicidan bir sayi isteyin ve tek veya cift oldugunu yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir tam sayı giriniz: ");
        int sayi=scan.nextInt();

        if (sayi%2 ==0) {
            System.out.println("sayiniz cifttir");
        }

        if (sayi%2 != 0){
            System.out.println("sayiniz tektir");
        }



    }
}
