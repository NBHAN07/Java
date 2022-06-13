package tekrarNBH;

import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        //kullanicidan bir kelime ve bir cümle isteyin
        //kelimenin cümledeki kullanimina bakarak su 3 cumleyi yazdir
        //girilen kelime cümlede kullanilmamiş
        //1 kez kullanilmis
        //birden fazla kullanilmis

        String cumle="java ögren, yeni program ile yeni bir sayfa ac ";
        String kelime="yeni";

        int ilkKullanim=cumle.indexOf(kelime); //-1 veya index
        int ikinciKullanim=cumle.indexOf(kelime,ilkKullanim+1);

        if (ilkKullanim==(-1)) {
            System.out.println("girilen kelime cümlede kullanilmamiş");
        } else if (ikinciKullanim==(-1)){
            System.out.println("girilen kelime cümlede bir kez kullanilmis");
        } else {
            System.out.println("girilen kelime cümlede birden fazla kullanilmis");
        }






    }
}
