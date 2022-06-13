package zeyneptekrar;

public class zynp_trim {

    public static void main(String[] args) {


        String isim= " zeynep han ";


        isim.trim();
        System.out.println(); // atama yapmadik bosluklu yazdiri
        System.out.println(isim.length());

        isim= isim.trim();
        System.out.println(isim); // atama yapildigi icin bosluksuz yazdirir
        System.out.println(isim.length());

    }
}
