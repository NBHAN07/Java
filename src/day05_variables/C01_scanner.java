package day05_variables;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {

        // 7. kullanicidan ismini alip isminin bas harfini yazdirin

        System.out.println("lutfen isminizi giriniz: ");
        Scanner scan=new Scanner(System.in);

        String isim=scan.nextLine();

        System.out.println("isminizin bas harfi: "+ isim.substring(0,1));






    }




}
