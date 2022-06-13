package tekrarNBH;

public class lastIndexOf {
    public static void main(String[] args) {

        //kullanicidan bir kelime ve bir cümle isteyin
        //kelimenin cümledeki kullanimina bakarak su 3 cumleyi yazdir
        //girilen kelime cümlede kullanilmamiş
        //1 kez kullanilmis
        //birden fazla kullanilmis

        String cumle="java ögren, yeni program ile yeni bir sayfa ac ";
        String kelime="ja";

        int ilkKullanim=cumle.indexOf(kelime); //-1 veya index
        int sonKullanim=cumle.lastIndexOf(kelime);





    }
}
