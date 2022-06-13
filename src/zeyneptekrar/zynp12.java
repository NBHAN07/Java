package zeyneptekrar;

public class zynp12 {

    public static void main(String[] args) {

        int sayi=20;
        System.out.println(sayi+ 10); // 30
        // bu satirda sayiyi 10 artirmadim
        // sayinin 10 fazlasini yazdirdim

        System.out.println(sayi); // 20
        // eger atama yapmazsak sayida yaptigimiz artirma veya azaltma kalici olmaz
        sayi=sayi+10;
        System.out.println(sayi); //30

        System.out.println(sayi=sayi+=10); // 40
        System.out.println(sayi); // 40

        System.out.println(sayi+=10); // 50
        System.out.println(sayi); // 50

        // bir variable'in degerini kalici olarak artirmak veya azaltmak isterseniz assignment sarttir
        System.out.println("24.satir : "+ sayi++); // 50
        System.out.println("25.satir : " + sayi); // 51
        System.out.println("26.satir : " + ++sayi); // 52
        System.out.println("27.satir : " + sayi); // 52


       // KALDIGIM YER:24th thursday hocanın 10.26 DA GÖNDİRDİGİ KOD


    }
}
