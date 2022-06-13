package practice;

import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("ehliyetiniz var ise ->1 yok ise ->0 yaziniz");
        int ehliyetiniz = scan.nextInt();

        System.out.println("hizinizi giriniz");
        int hiz= scan.nextInt();

        if ( ehliyetiniz == 1) {

            if (hiz < 0) {
                System.out.println("hiziniz negatif olamaz");
            } else if (hiz > 55 && hiz < 74) {
                System.out.println("cezaniz 100$");
            } else if (hiz > 75 && hiz < 85) {
                System.out.println("cezaniz 150$");
            } else if (hiz > 85 && hiz < 94) {
                System.out.println("cezaniz 320$");
            } else if (hiz >= 95) {
                System.out.println("cezaniz 500$");
            }else System.out.println("hiz sinirinde seyahat ediyorsunuz");


        }else if (ehliyetiniz==0){

            if (hiz < 0) {
                System.out.println("hiziniz negatif olamaz");
            } else if (hiz > 55 && hiz < 74) {
                System.out.println("cezaniz 300$");
            } else if (hiz > 75 && hiz < 85) {
                System.out.println("cezaniz 550$");
            } else if (hiz > 85 && hiz < 94) {
                System.out.println("cezaniz 520$");
            } else if (hiz >= 95) {
                System.out.println("cezaniz 700$");
            }else System.out.println("hiz sinirinde seyahat ediyorsunuz");

        }else {
            System.out.println ("ehliyet var mi yok mu");
        }



    }
}
