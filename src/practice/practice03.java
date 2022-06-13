package practice;

import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı girin ulan:");
        double yas=scan.nextDouble();
        System.out.println("kilonu gir cnm:");
        double kilo=scan.nextDouble();


        if (yas>0 && yas<18){
            System.out.println("kan bagisi yapamazsiniz");

        }else if (yas>=18){

            if (kilo> 0 && kilo<50) {
                System.out.println("kan bagisi yapamazsiniz ");

            }else if (kilo>=50){
                System.out.println("kan bagısı yapabilirssiniz");

            }else System.out.println("kilonuzu hatali girdiniz");

        }else{
            System.out.println("hatali bir veri girdiniz");
        }


    }
}
