package zeyneptekrar;

public class zynp_indexOf {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
         // - Girilen kelime cumlede kullanilmamis.
        //       - Girilen kelime cumlede 1 kere kullanilmis.
       // - Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle ="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "va"; // illa anlamli bir kelime olmayabilir

        int ilkKullanim= cumle.indexOf(kelime); // -1 veya index
        int ikinciKullanim= cumle.indexOf(kelime, ilkKullanim+1);

        if (ilkKullanim==(-1)){
            System.out.println( "Girilen kelime cumlede kullanilmamis.");

        }else if (ikinciKullanim==(-1)){
            System.out.println(" Girilen kelime cumlede 1 kere kullanilmis");

        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }



        String isim= "zeynep"; // 0. indexten z harfini aramaya başlar ve ilk buldugu indexi bize verir.
        System.out.println(isim.indexOf('z',0));
        // e harfini yzdirip 2. indexten basla dersek bize 4 verir










    }
}
