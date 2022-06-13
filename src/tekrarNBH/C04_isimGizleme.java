package tekrarNBH;

public class C04_isimGizleme {
    public static void main(String[] args) {

        //kullanicidan isim soyisim ve kartno isteyin ve
        // isimlerin ilk harfi kartin son 4 hanesi gözükecek
        // kalanın da yıldızlı olmasını saglayacak sekilde yazdirin

        String isim="nur betul";
        String soyİsim="HAN";
        String kKartNo="1234567891231234";

        String yeniIsim=isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\S","*"); //iki isim icin bosluk haric hepsi * yapabiliriz


        String yeniSoyisim=soyİsim.substring(0,1).toUpperCase()
                +soyİsim.replaceAll("\\S","*");

        String yeniKKno="**** **** **** "+ kKartNo.substring(12);

        System.out.println("isim-soyisim: " + yeniIsim+ " " + yeniSoyisim
                           +"\nkart no: "+ yeniKKno);
















    }
}
