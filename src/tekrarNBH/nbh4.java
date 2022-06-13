package tekrarNBH;

import java.util.Scanner;

public class nbh4 {

    public static void main(String[] args) {
        //soru3. kullanıcıdan yaricap isteyip cember cevresi ve daire alani olusturun

        Scanner scan= new Scanner(System.in);
        System.out.println("cemberin yaricapini giriniz: ");

        double yaricap= scan.nextDouble();

        System.out.println("girdiginiz yaricap: " + yaricap);
        System.out.println("cemberin cevresi: " + 2*3.14*yaricap);
        System.out.println("dairenin alani: " + 3.14*yaricap*yaricap);
















    }
}
