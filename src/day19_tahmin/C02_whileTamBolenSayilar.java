package day19_tahmin;

public class C02_whileTamBolenSayilar {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
        // ve toplma kac tane olduklarini ekrana yazdirin

        int input=8;

        // for loop ile de olur

        int bolen=1;
        int sayac=0;

        while (bolen<=input){

            if (input % bolen==0){
                System.out.print(bolen+ " ");
                sayac++;

            }
            bolen++; //bunu artırmayı unutma yoksa sonsuz donguye girer
        }
        System.out.println(" ");
        System.out.println(input+" sayisinin " + sayac+ " tane pozitif tam sayi boleni vardir");



    }

}
