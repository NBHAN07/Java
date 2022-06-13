package zeyneptekrar;

public class zynp4 {

    public static void main(String[] args) {

         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int sayi1= 10;
        int sayi2= 20;

        System.out.println( "SWAP'dan önce sayi1: " + sayi1 + ", sayi2: " + sayi2 );

        int temp= sayi1;
        sayi1= sayi2;
        sayi2= temp;

        System.out.println( "SWAP'dan sonra sayi1: " + sayi1 + ", sayi2: " + sayi2 );

        //1.adim bos bir variable olusturup sayi1'i ona atayalim
        // 2.adim sayi1'e yeni degerini atayalim
        // 3. adim sayi2'ye temp'e yedekledigimiz sayi1 degerini atayalim




        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin

        String hastaTahlili= "hemogram";
        char tupRengi= 'S';
        boolean sicakMi= false;

        System.out.println(hastaTahlili);
        System.out.println(tupRengi);
        System.out.println(sicakMi);


        //2- isim ve soyisim icin iki variable olusturun ve bunlari
        //  isminiz : Mehmet
        //  soyisminiz : Bulutluoz
        //  seklinde yazdirin

        String isim= "zeynep";
        String soyIsim= "han";

        System.out.println("Isminiz : " + isim);
        System.out.println( "Soyisminiz: " + soyIsim);


        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin

        byte sayi3= 20;
        short sayi4= 10000;

        System.out.println("iki sayinin toplami: " + (sayi3 + sayi4));

        //4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin

        int sayi5= 10;
        double sayi6= 1.20;

        System.out.println("iki sayinin toplami " + (sayi5 + sayi6));

        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.

        int sayi7=70;
        char harf= 'a';

        System.out.println( sayi7 + harf); // 167

        // char data turundeki degiskenler matematetiksel islemlerde kullanilirsa
        // o char degerinin ASCII karsiligi ileme alinir





    }
}
