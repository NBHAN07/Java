package tekrarNBH;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {

        int a=15 %4;
        System.out.println(a);

        // kullanicidan aldiginiz dort basamakli sayinin rakamlari tolamini bulunuz

        Scanner scn= new Scanner(System.in);
        System.out.println("lütfen dört basamaklı bir tam sayı giriniz: ");
        int sayi=scn.nextInt();

        int rakam=0;
        int rakamlartolami=0;

        // 1. adim r=0 rakamlar top.=0 sayı=7532

        rakam=sayi%10; //2
        rakamlartolami +=rakam; //2
        sayi/=10; //753

        // 2. adim r=2 rt=2 s=753

        rakam=sayi%10; //3
        rakamlartolami +=rakam; //5
        sayi/=10; //75

        // 3. adim r=3 rt=5 s=75

        rakam=sayi%10; //5
        rakamlartolami +=rakam; //10
        sayi/=10; //7

        // 4. adim r=5 rt=10 s=7

        rakam=sayi%10; //7
        rakamlartolami +=rakam; //17

        System.out.println("girdiginiz sayinin rakamlar toplami: " + rakamlartolami);












    }
}
