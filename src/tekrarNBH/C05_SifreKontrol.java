package tekrarNBH;

public class C05_SifreKontrol {
    public static void main(String[] args) {
        //kullanicidan bir sifre girmesini isteyin
        //asagidaki sartlari sagliyorsa "sifre basari ile tamamlandi" yazdirin
        //saglamazsa "sifre basarisiz, lütfen yeni bir sifre girin" yazdirin
        //-ilk harf büyük olmali
        //-son harf kücük olmali
        //-sifre bosluk icermemeli
        //-sifre uzunlugu en az 8 karakter olmali

        //bir anda bütün hatalari görmek istiyorsak if leri bagimsiz yapmaliyiz

        String sifre="Ajcd13ic";

        boolean ilkHarf=false;

        if (sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
            ilkHarf=true;
        } else {
            System.out.println("sifre büyük harfle baslamali ");
        }

        boolean sonHarf=false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        } else {
            System.out.println("sifre kücük harfle bitmeli ");
        }

        boolean bosluk=false;

        if (!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("sifre bosluk icermemeli");
        }

        boolean uzunluk=false;

        if (sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("sifre 8 karakterden olusmali");
        }

        if (uzunluk && bosluk && ilkHarf && sonHarf ){
            System.out.println("sifre basari ile tamamlandi");
        }










    }
}
