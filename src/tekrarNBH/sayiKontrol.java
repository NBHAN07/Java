package tekrarNBH;

import java.util.Scanner;

public class sayiKontrol {
    public static void main(String[] args) {
        // iki sayi iste
        // ikisi de pozitif ise toplami yazdir
        // ikisi de negatif ise carpım yazdir
        // farkli ise farkli isaret ile islem yapilmaz yazdir
        // sayilardan biri sıfır ise sıfır yutan eleman yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi gir");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitif odugundan toplamlari" + (sayi1+sayi2));}
        else if (sayi1<0 && sayi2<0) {
            System.out.println("girdiginiz iki sayi da negatif odugundan carpimlari" + (sayi1*sayi2));}
        else if (sayi1<0 && sayi2>0 || sayi1>0 && sayi2<0) {
            System.out.println("farkli isaret ile islem yapilmaz");}
        else if (sayi1==0 || sayi2==0){
            System.out.println("sifir yutan eleman");}










    }
}
