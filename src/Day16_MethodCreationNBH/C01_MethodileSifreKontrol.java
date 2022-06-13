package Day16_MethodCreationNBH;

public class C01_MethodileSifreKontrol {
    public static void main(String[] args) {
        //kullanicidan bir sifre girmesini isteyin
        //asagidaki sartlari sagliyorsa "sifre basari ile tamamlandi" yazdirin
        //saglamazsa "sifre basarisiz, lütfen yeni bir sifre girin" yazdirin
        //-ilk harf büyük olmali
        //-son harf kücük olmali
        //-sifre bosluk icermemeli
        //-sifre uzunlugu en az 8 karakter olmali

        //bunlari method ile yap

        String sifre="Abc1234";

        boolean ilkHarfKontrol= ilkHarfKontrolEt(sifre);
        boolean sonHarfKontrol= sonHarfKontrolEt(sifre);
        boolean boslukkontrol= boslukKontrolEt(sifre);
        boolean uzunlukKontrol=uzunlukKontrolEt(sifre);

        if (ilkHarfKontrol && sonHarfKontrol && boslukkontrol && uzunlukKontrol) {
            System.out.println("sifre basari ile tanimlandi");
        } else {
            System.out.println("islem basarisiz, lütfen yeni bir sifre girin");
        }


    }



    private static boolean uzunlukKontrolEt(String sifre) {
        boolean uzunlukKontrolSonuc=false;

        if (sifre.length()>=8){
            uzunlukKontrolSonuc=true;
        }else {
            System.out.println("sifre 8 karakterden olusmali");
        }

        return uzunlukKontrolSonuc;
    }





    private static boolean boslukKontrolEt(String sifre) {
        boolean boslukKontrolSonuc=false;

        if (!sifre.contains(" ")){
            boslukKontrolSonuc=true;
        }else {
            System.out.println("sifre bosluk icermemeli");
            boslukKontrolSonuc=false;
        }

        return boslukKontrolSonuc;
    }





    private static boolean sonHarfKontrolEt(String sifre) {
        char sonHarf=sifre.charAt(sifre.length()-1);
        boolean sonHarfsonuc=false;

        if (sonHarf>='a' && sonHarf<='z'){
            sonHarfsonuc=true;
        } else {
            System.out.println("sifre kücük harfle bitmeli ");
            sonHarfsonuc=false;
        }
        return sonHarfsonuc;
    }






    private static boolean ilkHarfKontrolEt(String sifre) {
        //önce sifreden ilk harfi alalim


        char ilkHarf=sifre.charAt(0);
        boolean ilkHarfSonuc=false; //return kirmizi yanmasin diye true ya da false olmasi onemli degil bir deger atiyoruz

        if (ilkHarf >='A' && ilkHarf<='Z'){
            ilkHarfSonuc=true;
        } else {
            System.out.println("sifre büyük harfle baslamali ");
            ilkHarfSonuc=false; // bunu yazmasak da calisir
        }

        return ilkHarfSonuc;
    } //bu parantez return yazana kadar kirmizi yanar




}
