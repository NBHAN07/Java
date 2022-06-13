package zeyneptekrar;

public class zynp9 {

    public static void main(String[] args) {


        int sayi1=4895;
        double sayi2=10;

        // sayi1=sayi1/sayi3; // iki farkli sayi data turunu isleme koydugumuzda
        // Java kucuk olan data turu icin autoWidening yapar
        // bu islemi dusunursek sayi1/sayi3 => islemin sonucunu double kabul eder

        System.out.println(sayi1/sayi2); // 489.5

        System.out.println(sayi2/sayi1); // 0.0020429009193054137




    }
}
