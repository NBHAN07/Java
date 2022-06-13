package zeyneptekrar;

public class zynp_MethodOlusturma3 {

    public static void main(String[] args) {

        int a =10;
        int b =20;

        // iki variablein degerini toplayan bir method olusturalim
        // 1.adim : method adi yazalim
        // 2.adim : methoda gondermem gereken argument  var mi ?

        ikiSayiTola(a,b);

    }
    // bir methodu olusturmak calismasi icin yeterli deggildir
    // method ancak cagirildigi  zaman calisir
    // ayni class veya baska classta olmasinin hicbir farki yoktur
    //java main  method da yukaridan asagiya dogru calisir
    // ve geldigi satiri calistirir
    private static void ikiSayiTola(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a+b ));
    }


}
