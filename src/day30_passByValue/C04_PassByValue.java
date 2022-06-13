package day30_passByValue;

public class C04_PassByValue {
    //eger bir methodda yapilan degisikliigin kalici olmasini istersek
    //2 yontem kullanabiliriz
    //1- variable i class level da static olarak olusturabiliriz
    //2-C05

    static double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();//argument yollamadik ama kullanabildik etiket fiyati vs cunku statik
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=20;
        kaliciIndirimYap();


    }
    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat: "+ etiketFiyati);

    }
}
