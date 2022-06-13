package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        Java pass by value bir programlama dilirdir
        Yani; bir primitive variable i argument olarak bir methoda yollarsak
        java o variable i degil, degerini (value) methoda aktarir(pass)

         */

       double etiketFiyati=100;

        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.9;
        System.out.println("sizin icin yuzde 10 indirimli fiyatimiz:" + etiketFiyati);
    }
}
