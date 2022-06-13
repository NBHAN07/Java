package tekrarNBH;

public class StringSayiToplama {
    public static void main(String[] args) {

        //String seklinde verilen iki sayinin toplamini bulunuz
        //ipucu: Double.parsedouble() methodunu kullanabilirsiniz

        String str1="$13.99";
        String str2="10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);

        double sonuc=(str1Sayi+str2Sayi)/100;

        System.out.println("verilen iki string sayinin toplami: $" +sonuc);


























    }
}
