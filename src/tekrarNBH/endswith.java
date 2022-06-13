package tekrarNBH;

public class endswith {
    public static void main(String[] args) {
        //kullanicidan mail adresi girmesi isteyin
        //mail @gmail.com içermiyorsa "lütfen gmail adresi giriniz" yazdir
        //@gmail.com ile bitiyorsa "gmail adresniz kaydedildi" yazin
        //@gmail.com ile bitmiyorsa "lütfen girdiginiz veriyi kontrol edin" yazdir

        String email="dasgfa@gmail.com";
        String arananMetin="@gmail.com";


        if (!email.contains(arananMetin)){
            System.out.println("lütfen gmail adresi giriniz");
        } else if (email.endsWith(arananMetin)) {
            System.out.println("mail adresiniz kaydedildi");
        } else {
            System.out.println("lütfen girdiginiz veriyi kontrol edin");
        }

        System.out.println(email.startsWith("s",2));














    }
}
