package practice;

import java.util.Scanner;

public class practice06 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("hangi ayi ogrenmek istiyorsunuz");
        int ay = scan.nextInt();


        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("giridiginiz ayda 31 gun var ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("giridiginiz ayda 31 gun var");
                break;
            case 2:
                System.out.print("bulundugunuz yili yaziniz");
                int yil= scan.nextInt();
                if (yil %4 ==0 ){
                    System.out.println("giridiginiz ayda 29 gun var");
                }else {
                    System.out.println("giridiginiz ayda 28 gun var" );
                }
                break;
            default:
                System.out.println("salak salak isler yapma");




            
        }
    }
}
