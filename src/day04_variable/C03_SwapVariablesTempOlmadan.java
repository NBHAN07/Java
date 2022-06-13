package day04_variable;

public class C03_SwapVariablesTempOlmadan {
    // sayi1 ve sayi2 variable degerlerini 3. bir variable olmadan degistiren (SWAP) ÖDEV
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;

        System.out.println("önce sayi=1: " + sayi1 + " , sayi2 : " + sayi2);

        int toplam=sayi1+sayi2;

        sayi2=toplam-sayi2;
        sayi1=toplam-sayi1;

        System.out.println("sonra sayi=1: " + sayi1 + " , sayi2 : " + sayi2);






    }
}
