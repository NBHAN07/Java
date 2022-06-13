package tekrarNBH;

import java.util.Locale;
import java.util.Scanner;

public class switchSdet {
    public static void main(String[] args) {

        // kullancıdan SDET harflerinden birini girmesini isteyin
        //S=Software
        //D=Developer
        //E=Engineer
        //T=In Testing yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("SDET harflerinden birini giriniz");
        char harf= scan.next().toLowerCase(Locale.ROOT).charAt(0);

        switch (harf) {
            case 's':
                System.out.println("S=Software");
                break;
            case 'd':
                System.out.println("D=Developer");
                break;
            case 'e':
                System.out.println("E=Engineer");
                break;
            case 't':
                System.out.println("T=In Testing");
                break;

            default:
                System.out.println("gecerli bir harf giriniz");


        }

    }
}
