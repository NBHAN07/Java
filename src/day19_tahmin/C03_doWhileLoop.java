package day19_tahmin;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif tam sayi alip
        //while loop ile o sayidan kücük tam sayilari yazdiralim

        int input=5;
        int sayi=1;

        while (sayi<input){
            System.out.println(sayi);
            sayi++;
        }

        //do while loop ile yapalim
        sayi=1;


        do {
            System.out.println(sayi);
            sayi++;
        } while (sayi<input);




    }







}
