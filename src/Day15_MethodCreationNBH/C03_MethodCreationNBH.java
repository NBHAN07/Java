package Day15_MethodCreationNBH;

import java.util.Scanner;

public class C03_MethodCreationNBH {
    public static void main(String[] args) {
        //kullanicidan bir kelime isteyin
        //3 harften kisa ise " kelime cok kisa"
        //3-4-5 harf ise "harf sayisini ve kelimenin tersten yazilisini yazdirin"
        //5 ten fazla ise "kelime cok uzun" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime= scan.next();
        int harfSayisi=kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");

        } else if (harfSayisi==3){

            ücHarfitersineCevir(kelime);

        }else if (harfSayisi==4){

            dortHarfitersineCevir(kelime);

        }else if (harfSayisi==5) {

            besHarfitersineCevir(kelime);

        }else {
            System.out.println("kelime cok uzun");
        }











    }

    private static void besHarfitersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
        System.out.println("girdiginiz kelimedekki harf sayisi: 5 ");

    }

    private static void dortHarfitersineCevir(String kelime) {
      String  tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
        System.out.println("girdiginiz kelimedekki harf sayisi: 4 ");



    }

    private static void ücHarfitersineCevir(String kelime) {
       String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
        System.out.println("girdiginiz kelimedekki harf sayisi: 3 ");

    }


}
