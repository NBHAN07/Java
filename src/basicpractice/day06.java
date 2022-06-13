package basicpractice;

import java.util.Locale;
import java.util.Scanner;

public class day06 {

    public static void main(String[] args) {

        //goat        gat
        //photo        hoto
        //ghost        ghost
        //kalem        lem

        Scanner scan = new Scanner(System.in);
        System.out.print(" bir string giriniz");
        String str= scan.next().toLowerCase();

        if (str.startsWith("gh")){
            System.out.println(str);
        }else if (str.startsWith("g")){
            System.out.println(str.charAt(0)+ str.substring(2));
        }else if(str.charAt(1)== 'h'){
            System.out.println(str.substring(1));
        }else {
            System.out.println(str.substring(2));
        }

    }
}
