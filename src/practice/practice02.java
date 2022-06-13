package practice;

import java.util.Scanner;

public class practice02 {

    public static void main(String[] args) {
        //boy ve kilo alıp BMI hesapla
        //BMI=kilo/boykare(cm)

        Scanner scan= new Scanner(System.in);

        System.out.println("boyunu gir cm olsun: ");
        double boy=scan.nextDouble();

        System.out.println("kilonu gir cnm");
        double kilo=scan.nextDouble();

        double bmi=kilo/(boy/100)*(boy/100);

        if (bmi<=20){
            System.out.println("kız bu ne hal cöp gibisin");}
        else if (20<bmi && bmi<=25) {
            System.out.println("herkes gibisin iste");
        }
        else if (bmi>=25 && bmi<30 ) {
            System.out.println("şişko bir patatessin");
        }
        else if (bmi>=30) {
            System.out.println("ölmüşsün sen geçmiş olsun.s.s.s");
        }



    }
}
