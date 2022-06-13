package basicpractice;

import javax.lang.model.SourceVersion;

public class day01 {
    public static void main(String[] args) {
        //Konsolda asagidaki ciktiyi yazdiriniz

        /*
        T
                E
        C
                H
        P
                R
        O
                E
        D
                U
        C
                A
        T
                I
        O
                N
         */

        System.out.println(""); //ctrl+d kopyalar
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();



        System.out.println("println");
        System.out.println("alt"); //PRRINTLN OLDUGU İCİN
        System.out.println("alta");
        System.out.println("yaziyor");



        System.out.print("yan"); //PRINT OLDUGU İCİN
        System.out.print("yana");
        System.out.print("yaziyor");

        byte byteMAX = Byte.MAX_VALUE;
        System.out.println("byteMAX = " + byteMAX);

        byte byteMin = Byte.MIN_VALUE; // !SOUTV otomatik olarak yazdiriyor!
        System.out.println("byteMin = " + byteMin);


        int intMax = Integer.MIN_VALUE;
        System.out.println("intMax = " + intMax);
        short shortMax= Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);

        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
        //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float  laptopFiyat = 9999.99F;
        double kilometre =579.6;
        char cinsiyet = 'E';
        boolean dogruMu =true;
        
        System.out.println(laptopFiyat); // alt satırla aynı islemi görür.
        System.out.println("laptopFiyat = " + laptopFiyat); //soutv yazinca bu sekilde cikiyor
        System.out.println(kilometre);
        System.out.println(cinsiyet);
        System.out.println(dogruMu);
        System.out.println(laptopFiyat +" " + kilometre + " " + cinsiyet + " " + dogruMu);


        //Bir degisken tanimlayin : x
        //Baska bir degiskeni initialize edin : y
        //x degiskenini initialize  (deger atama)edin
        //y degiskenini yeni bir degerle guncelleyin
        
        int x;
        int y = 2000;
        x= 123;
        y=234;
        System.out.println("y = " + y);
        System.out.println("x = " + x);

        /*
         \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
              \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
              \\: prints a back slash :\ (ters slash) yazdirir
              \': prints single quote :' tek tirnak yazdirir. örn: ("\'Java\'")
              \": prints double quote :"" cift tirnak yazdirir.
       \: backslash
       /:front slash
      */
            //  Soru-1 :   konsola      "Hello ", "World  \ //"        seklinde yazdiriniz
            // Soru-2 : Pazartesi kelimesini her harfini ayri bir satira gelecek sekilde yazdırınız.
            //Soru-3 : "Java" ile hayat cok 'afilli'   yazdiriniz
            //Soru-4 : "Zaruret" insani
            //         'kasif'  yapar   yazdiriniz
            // sonraki "TechProEd ile java cok kolay ..." ifadesi  3 satir sonra ve satir basindan 1 tab ileride yazilsin.


        System.out.println("     \" Hello \" , \" World  \\ //\"" );


        System.out.println("\nP\n\na\n\nz\n\na\n\nr\n\nt\n\ne\n\ns\n\ni\n");


        System.out.println("\"Zaruret\" insani \n \'kasif\' yapar  \n\n\n\t \"techProEd ile java cok kolay...\" ");





    }
}
