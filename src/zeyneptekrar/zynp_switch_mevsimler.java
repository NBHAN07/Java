package zeyneptekrar;

import java.util.Scanner;

public class zynp_switch_mevsimler {

    public static void main(String[] args) {
        // kullanicidan kacinci a oldugunu alip mevsimi yazdiran bir switch yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();


        switch (ayNo) {

            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;

            default:
                System.out.println("lutfen gecerli bir ay numarası giriniz ");

        }
    }
}
