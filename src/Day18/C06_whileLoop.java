package Day18;

public class C06_whileLoop {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi alip
        //aradaki, o sayilar dahil, hepsini yazdiran bir kod olusturun

        int baslangic=40;
        int bitis=60;

        for (int i = baslangic; i <=bitis ; i++) {
            System.out.print(i+ " ");

        }
        System.out.println(" ");

        //while loop ile yapalim

        int i=baslangic;
        while (i<=bitis){
            System.out.print(i+" ");
            i++;

        }
        System.out.println(" ");
        System.out.println(baslangic);// baslangici i ye atayarak aslangic degerini degistirmeden soruyu cozduk






    }
}
