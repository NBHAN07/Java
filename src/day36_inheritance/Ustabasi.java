package day36_inheritance;

public class Ustabasi extends Isci{
    public static void main(String[] args) {

        Ustabasi ustabasi1=new Ustabasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="murat";
        ustabasi1.soyisim="gök";
        ustabasi1.maas= ustabasi1.maasHesapla();
        ustabasi1.statu="isci";
        ustabasi1.isciStatu="ustabasi";

        System.out.println(ustabasi1);

    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "isciStatu='" + isciStatu + '\'' +
                ", saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
