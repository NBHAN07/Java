package monkeyPractice;

public class Monkey {
    /*
    Adada yalnız bir maymun var
         Her gün 4 muz yemesi gerekiyor
         o adada sadece 165 muz var
         Aşağıdaki değişkenleri oluşturun ve kaç gün olduğunu bulun
         maymun hayatta kalabilir.
         Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
         int Muz Sayısı =165, hayatta kalmaDays = 1;
         boole maymunuAlive = true
     */
    public static void main(String[] args) {
        int muzSayisi=165;
        int hayattaKalma=1;

        boolean maymunyasiyorMu=true;


        do {
            muzSayisi-=4;
            hayattaKalma++;

            if (muzSayisi<4){
                maymunyasiyorMu=false;

                System.out.println("bugun "+ hayattaKalma+ ". gun. maymun vefat.");

            } else {
                System.out.println("bugun "+ hayattaKalma + ". gun. maymun hala yasiyor");
            }


        }while (maymunyasiyorMu);

        System.out.println("tüm muzlar tükedi. hayatta kaldigi gun sayisi: " +hayattaKalma);
    }
}
