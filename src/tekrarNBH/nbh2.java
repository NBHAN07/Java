package tekrarNBH;

public class nbh2 {
    public static void main(String[] args) {
         // verilen sayi1 ve sayi2 variable lerin degerlerini degistiren bir program (swap) yaziniz
         // or. sayi1=10 sayi2=20 kod calistikten sonra sayi1=20 ve sayi2=10 olsun.

        int sayi1=10;
        int sayi2=20;

        System.out.println("swap'tan önce sayi1: " + sayi1 + " sayi2: " +sayi2);

        //1. adim bos bir variable olusturup sayi1i ona atayalim

        int temp=sayi1;

        //2. adim sayi1 e yeni deger ataylim

        sayi1=sayi2;

        //3. adim sayi2 ye tempe yedekledigimiz sayi1 i atayalim

        sayi2=temp;

        System.out.println("swaptan sonra sayi1: " + sayi1 + " sayi2: " + sayi2);

























    }

}
