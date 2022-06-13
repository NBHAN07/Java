package basicpractice;


import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class day04 {
    public static void main(String[] args) {

        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        // subring 0,1 sifiri al gerisini birak

        Scanner scan= new Scanner(System.in);
        System.out.println("String 1: ");
        String str1 = scan.nextLine();
        System.out.println("String 2 : ");
        String str2= scan.nextLine();

        System.out.println("Striglerin 1. method ile birlesimi: "+ str1+" "+str2);
        System.out.println("Striglerin 1. method ile birlesimi: " + str1.concat(""+str2));

        String str1ilksiz= str1.substring(1);
        String str2ilksiz= str2.substring(1);

        System.out.println("string lerin ilk harfsiz halleri : " + str1ilksiz+ " "+str2ilksiz);


    }


}




