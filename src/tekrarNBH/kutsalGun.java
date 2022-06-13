package tekrarNBH;

import javax.security.sasl.SaslClient;
import java.util.Locale;
import java.util.Scanner;

public class kutsalGun {
    public static void main(String[] args) {
         //kullanıcıdan cuma, cumartesi ya da pazar al ve hangi günde kutsal oldugunu yazdır
         // equals kullanmayı unutma!!!!!!!!!!!!!!!!!!!!!!!!

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen cuma, cumartesi ya da pazar günlerinden biriniz giriniz: ");

        String gun= scan.next().toLowerCase(Locale.ROOT);

        if (gun.equals("cuma") ) {
            System.out.println("cuma müslümanlar icin kutsal gundur");}
        
        if (gun.equals("cumartesi") ){
            System.out.println("cumartesi yahudiler icin kutsal gundur");
        }

        if (gun.equals("pazar")){
            System.out.println("pazar hristiyanlar icin kutsaldır");
        }











    }
}
