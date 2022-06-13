package zeyneptekrar;

import java.util.Scanner;

public class zynp_MethodOlusturma6 {

    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        //eger kelime 3 harften kisa  ise "kelime cok kisa "
        // eger  kelime 3,4 veya 5 harfli ise harf sayisini ve kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa " kelime cok uzun yazdirin"

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.next();
        int harfSayisi= kelime.length();

        if (harfSayisi<3){

        }else if(harfSayisi==3 ){
            ucHarfiTersineCevir1(kelime);

        }else if (harfSayisi==4){
            dortHarfiTersineCevir2(kelime);

        }else if (harfSayisi==5){
            besHarfiTersineCevir3(kelime);

        }else{
            System.out.println("kelime cok uzun ");
        }

    }

    public static void besHarfiTersineCevir3(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi: 5 ");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }



    public static void dortHarfiTersineCevir2(String kelime) {
        String tersKelime= kelime.substring(3)+
                           kelime.substring(2,3)+
                          kelime.substring(1,2)+
                          kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi: 4 ");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void ucHarfiTersineCevir1(String kelime) {
         String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi: 3" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }

}
