package day04_variable;

public class C02_SwapVariables {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("Swap'dan önce sayi=1: " + sayi1 + " , sayi2 : " + sayi2);

        // 1. adim bos bir variable olusturup
        //sayi1'i ona atayalim

        int temp=sayi1;

        // 2. adim sayi1 e yeni değerini atayalim

        sayi1=sayi2;

        //3. adim sayi2'ye temp'e yedeklediğimiz sayi1'yi yazalim

        sayi2= temp;

        System.out.println("Swap'dan sonra sayi=1: " + sayi1 + " , sayi2 : " + sayi2);



    }
}
