package monkeyPractice;

import java.util.Scanner;

public class sayiToplamii {
    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...

    static int toplam;
    public static void main(String[] args) {


        int sayi=1;

        while (sayi>0){

            System.out.println("toplamak istediginiz sayilari giriniz\n \nsayilarin toplamini gormek icin 0'a basiniz");
            Scanner scan=new Scanner(System.in);
            sayi=scan.nextInt();
            sayilarinToplami(sayi);

        }
    }

    private static void sayilarinToplami(int... sayi) {

        for (int each: sayi
             ) {
            toplam+=each;
        }
        System.out.println("girdiginiz sayilarin toplami: "+toplam);
        
    }


}



