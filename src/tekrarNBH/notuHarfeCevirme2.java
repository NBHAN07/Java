package tekrarNBH;

import java.util.Scanner;

public class notuHarfeCevirme2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("not gir");

        double not=scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("gecerli not gir");
        }
        else if (not<=50){
            System.out.println("D");
        }
        else if (50<not && not<75){
            System.out.println("C");}
        else if (75<=not && not<90){
            System.out.println("B");}
        else {
            System.out.println("A");}












    }
}
