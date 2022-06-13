package Day18;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {
        //kullanicidan aldigin sayilari topla
        //500 u gecince cok fazla oldu deyip toplami yazdir

        Scanner scan=new Scanner(System.in);

        int sayi=0;
        int sayiToplami=0;

        while (sayiToplami<500){
            System.out.println("lutfen bir sayi giriniz: ");
            sayi=scan.nextInt();
            sayiToplami+=sayi;
        }
        System.out.println("artik yeter cok fazla sayi girdin, toplam: " + sayiToplami+ " oldu");



    }
}
