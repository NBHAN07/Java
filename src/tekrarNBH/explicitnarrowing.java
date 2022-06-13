package tekrarNBH;

public class explicitnarrowing {
    public static void main(String[] args) {
        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2; // problemsiz yazar

        System.out.println(sayi3);

        int sayi4=(int)(sayi1/sayi2); // 87.9
        System.out.println(sayi4); //87

                               // deger double, variable int
                              // java bunu otomatik yapmaz
                              // sorumlulugu almamizi ister
        int sayi5=140;
        byte sayi6=(byte) sayi5; // sag trf > soldaki variable,byte,dan
        System.out.println(sayi6); // byte -128 ve +127 arasinda cember cizer
                                   // cevap o yuzden -116. +127 den sonra -127 ye gider


        sayi5=520;
        sayi6=(byte) sayi5;
        System.out.println(sayi6); // 8














    }
}
