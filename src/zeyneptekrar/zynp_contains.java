package zeyneptekrar;

public class zynp_contains {
    public static void main(String[] args) {

        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // mehmet@gmail.com.tr


        String email= "zeynephan9906@gmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){  // basinda unlem olmazsa iceriyorsa dmek
            //basinda unlem varsa icermiyorsa demek
            System.out.println("lutfen gmail aresi giriniz");

        }else if (email.lastIndexOf(arananMetin)==email.length()-10){
            // email icerisinde gmail.comun indexi lengthden 10 eksik olmali
            System.out.println("Email adresiniz kaydedildi ");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }




    }
}
