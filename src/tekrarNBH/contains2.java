package tekrarNBH;

public class contains2 {
    public static void main(String[] args) {
        //kullanicidan mail adresi girmesi isteyin
        //mail @gmail.com içermiyorsa "lütfen gmail adresi giriniz" yazdir
        //@gmail.com ile bitiyorsa "gmail adresniz kaydedildi" yazin
        //@gmail.com ile bitmiyorsa "lütfen girdiginiz veriyi kontrol edin yazdir"

        String email="dasgfa@gmail.com";
        String arananMetin="@gmail";

        if (!email.contains(arananMetin)){
            System.out.println("lütfen gmail adresi giriniz");
        } else if(email.lastIndexOf(arananMetin)==email.length()-10){
             //lastindex bize son @gmail.com un indexini verir
            //esitligin öteki tarafında da gmailin toplam uzunlugu (-10) cıkınca kalanı verir
            //ikisi esitse true olur

            System.out.println("gmail adresiniz kaydedildi");
        } else {
            System.out.println("lütfen girdiginiz veriyi kontrol edin");
        }


















    }

}
