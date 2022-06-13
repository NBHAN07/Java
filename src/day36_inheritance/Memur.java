package day36_inheritance;

public class Memur extends Muhasebe{


    public static void main(String[] args) {
        // memur1 objesi Memur class'inin objesi olmasina ragmen
        // inherit ettigi Muhasebe ve onun da Parent'i olan Personel
        // class'larindaki tum datalari alabilir

        Memur memur1=new Memur();

        //personel classindan
        memur1.persNo=1001;
        memur1.isim="ahmet";
        memur1.soyisim="tepe";
        memur1.adres="ankara";
        memur1.tel="123456";

        //muhasebe class indan
        memur1.saatUcreti=10;
        memur1.maas=memur1.maasHesapla();
        memur1.statu="memur";

        System.out.println(memur1);

        //bir obje daha olusturalim

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();
        System.out.println(memur2);



    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
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
