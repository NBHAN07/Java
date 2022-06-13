package zeyneptekrar;

public class zynp_endswith {
    public static void main(String[] args) {


        // Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // mehmet@gmail.com.tr

        String email= "zeynephan9906@gmail.com";
        String arananMetin= "@gmail.com";

        if (!email.contains(arananMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.endsWith(arananMetin)){
            System.out.println("Email adresiniz kaydedildi ");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }

        String isim= "java ögreniyorum";
        String icerik= "jav";

        if (!isim.contains(icerik)){
            System.out.println("tekrar kontrol edin");

        }else if (isim.startsWith(icerik)){
            System.out.println("dogru sonuc");
        }else {
            System.out.println("tekrar yaz");
        }




    }


}
