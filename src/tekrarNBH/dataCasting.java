package tekrarNBH;

public class dataCasting {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=3;
        System.out.println(sayi1/sayi2); // 2 inti birbirine bölersek sonuc int olur; kusuratsiz

        sayi1=4786;
        sayi2=10;

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);

        sayi1=sayi1/sayi2;

        System.out.println(sayi1);

        sayi1=4786;
        double sayi3=10;

        //sayi1=sayi1/sayi3;   // iki farkli data sayi turunu isleme koydugumuzda
        // java kucuk data turu icin auto widening yapar
        //sayi1/sayi3; islrminin sonucunu double kabul eder

        System.out.println(sayi1/sayi3);















    }
}
