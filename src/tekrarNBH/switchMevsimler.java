package tekrarNBH;

import java.util.Scanner;

public class switchMevsimler {
    public static void main(String[] args) {
        //kullanicidan kacinci ay old. alip mevsimini bul

        Scanner scan=new Scanner(System.in);
        System.out.println("ay no giriniz");
        int sayi= scan.nextInt();

        switch (sayi) {
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilk bahar");
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
                System.out.println("lütfen gecerli bir ay no giriniz");
        }










        }
}
