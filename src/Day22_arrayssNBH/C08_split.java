package Day22_arrayssNBH;

public class C08_split {
    public static void main(String[] args) {

        //verilen cumlede istenen bir harfin kac defa kullanildigini bulan bir method yaziniz

        String cumle="nerede o 'hello world' yazdiramayan ogrenciler";
        String harf="e";

        birHarfKacDefaKullanilmis(cumle, harf);


    }

    public static void birHarfKacDefaKullanilmis(String cumle, String harf) {

        int sayac=0;

        String karakterler[]=cumle.split("");

        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }

        }//for loop burada bitti
        System.out.println("aradiginiz " + harf+ " verilen cumlede "+ sayac+" adet kullanilmistir");


    }
}
