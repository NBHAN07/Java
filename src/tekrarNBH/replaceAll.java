package tekrarNBH;

import java.util.Scanner;

public class replaceAll {
    public static void main(String[] args) {
        //kullanicidan isim soyisim bilgisi alip
        //bütün harfleri * yapalim

        Scanner scan=new Scanner(System.in);
        System.out.println("isim soyisim giriniz");
        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));//*** **






    }
}
