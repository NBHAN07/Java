package tekrarNBH;

public class indexofLastindexof {
    public static void main(String[] args) {
        //kullanicidan bir kelime ve bir cümle isteyin
        //kelimenin cümledeki kullanimina bakarak su 3 cumleyi yazdir
        //girilen kelime cümlede kullanilmamiş
        //1 kez kullanilmis
        //birden fazla kullanilmis

        String cumle="java ögren, yeni program ile yeni bir sayfa ac ";
        String kelime="java";

        int ilkkullanim=cumle.indexOf(kelime);
        int sonkullanim=cumle.lastIndexOf(kelime);

        if (ilkkullanim==(-1)){
            System.out.println("girilen kelime cümlede kullanilmamis");
        } else if (ilkkullanim==sonkullanim){
            System.out.println("kelime cumlede bir kez kullanilmis");
        } else {
            System.out.println("kelime cümlede birden fazla kullanilmis");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf('l',1));








    }
}
