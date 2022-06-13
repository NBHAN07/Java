package zeyneptekrar;

public class zynp_lastIndex {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        // - Girilen kelime cumlede kullanilmamis.
        //       - Girilen kelime cumlede 1 kere kullanilmis.
        // - Girilen kelime cumlede 1’den fazla kullanilmis.


        String cumle ="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime = "yeni"; // illa anlamli bir kelime olmayabilir

        int ilkKullanim= cumle.indexOf(kelime); // -1 veya index
        int sonKullanim= cumle.lastIndexOf(kelime);
        System.out.println(ilkKullanim);// 11 verir
        System.out.println(sonKullanim);// sondan aramaya baslar 28 verir
        // ne kadar last olsada aramayi soldan saga dogru yapar

        if (ilkKullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ilkKullanim==sonKullanim){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

        String str = "eclipce ";
        System.out.println(str.lastIndexOf("p",  4)); // 4 dahil





    }
}
