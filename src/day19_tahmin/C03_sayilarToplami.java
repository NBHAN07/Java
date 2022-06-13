package day19_tahmin;

public class C03_sayilarToplami {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin ve rakamlar toplamini yazdirin

        int sayi=254585626;
        int rakam=0;
        int rakamlarToplami=0;

        while (sayi>0){
           rakam= sayi%10;
           rakamlarToplami+=rakam;
           sayi/=10;

        }
        System.out.println(rakamlarToplami);







    }
}
