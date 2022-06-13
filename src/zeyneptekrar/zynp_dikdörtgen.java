package zeyneptekrar;

import java.util.Scanner;

public class zynp_dikdörtgen {
    public static void main(String[] args) {

        //kullanicidan dikdörtgenin kenarlarını al ve kare mi dikdörtgen mi onu yazdir

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen iki kenar uzunlugunu giriniz");
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();

        if (kenar1==kenar2){
            System.out.println(" sekliniz kare ");
        }else{
            System.out.println(" sekliniz dikdortgen" );
        }


    }
}
