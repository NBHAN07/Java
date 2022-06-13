package day30_passByValue;

public class C05_PassByValue {
    //kalici degisiklik icin 2. yontem
    public static void main(String[] args) {
        double etiketFiyati=100;
        double indirimYuzdesi=10;

       etiketFiyati= kaliciIndirimYap(etiketFiyati,indirimYuzdesi);
        System.out.println("main methodda indirim sonrasi etiket fiyati"+etiketFiyati);
        etiketFiyati = kaliciIndirimYap(etiketFiyati,indirimYuzdesi);// ikinci kez indirim yaptik ve atadik.
        // atamasak da sonraki sout 90 yazdirir. atananda kalir deger
        System.out.println(etiketFiyati);

        }

    public static double kaliciIndirimYap(double etiketFiyati, double indirimYuzdesi) {
        etiketFiyati = etiketFiyati * (100 - indirimYuzdesi) / 100;
        System.out.println("indirimli fiyat: " + etiketFiyati);

        return etiketFiyati;
    }



}
