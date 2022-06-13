package zeyneptekrar;

public class zynp_sifre {

    public static void main(String[] args) {

        // Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //  - Ilk harf buyuk harf olmali
        //  - Son harf kucuk harf olmali
        //  - Sifre bosluk icermemeli
        //  - Sifre uzunlugu en az 8 karakter olmali

        String sifre= "asdf12345";


        boolean ilkHarf= false;

        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<= 'Z'){
            ilkHarf= true;
        }else {
            System.out.println("sifrenizin ilk harfi buyuk harf olmali");
        }

        boolean sonHarf= false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.length()<='z');

        System.out.println("sifrenizin ilk harfi kucuk harf olmali");

        boolean bosluk= false;
        if (!sifre.contains(" ")){
            bosluk=true;
        } else {
            System.out.println("sifre bosluk icermemeli");

        }

        boolean uzunluk= false;

        if ((sifre.length()>=8)){
            uzunluk= true;
        }else {
            System.out.println("sifrenizin son harfi kucuk harf olmali");
        }

        if(ilkHarf && sonHarf&& uzunluk && bosluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }











    }
}
