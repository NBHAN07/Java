package Day15_MethodCreationNBH;

import javax.swing.*;
import java.util.Scanner;

public class C02_MethodCreationNBH {
    public static void main(String[] args) {

        //kullanicidan bir kelime isteyin
        //3 harften kisa ise " kelime cok kisa"
        //3-4-5 harf ise "harf sayisini ve kelimenin tersten yazilisini yazdirin"
        //5 ten fazla ise "kelime cok uzun" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime= scan.next();
        String tersKelime="";


        if (kelime.length()<3){
            System.out.println("kelime cok kisa");

        } else if (kelime.length()<=5){

            if (kelime.length()==3){
                tersKelime=kelime.substring(2)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }
            else if (kelime.length()==4){
                tersKelime=kelime.substring(3)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }
            else {
                tersKelime=kelime.substring(4)+
                        kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);

            }

            System.out.println("kelimenin tersten yazilisi: " + tersKelime);
            System.out.println("girdiginiz kelimedekki harf sayisi: " + kelime.length());

        } else {
            System.out.println("kelime cok uzun");
        }






    }
}
