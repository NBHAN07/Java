package tekrarNBH;

import java.util.Scanner;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        // kullanıcıya derse katılmayı isteyip istemedigini soun
        //evet derse cevabını ve derse ktılımınız onaylnmıstır yazdırın
        //hayır derse cevabı ve sonraki derslerimize bekleriz yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("derse katılmak istiyorsanız \"evet\" istemiyorsanız \"hayır\" yazınız");
        String cevap= scan.next(); //EVet hAYir

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz: " +cevap.toUpperCase()+ " derse katiliminiz onaylanmistir");
        }
        else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz: "+ cevap.toUpperCase() +" sonraki derslerimize bekleriz");
        }
        else {
            System.out.println("lütfen gecerli bir kelime giriniz");
        }
    }
}
