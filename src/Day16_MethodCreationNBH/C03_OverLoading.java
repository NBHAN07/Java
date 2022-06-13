package Day16_MethodCreationNBH;



public class C03_OverLoading {
    public static void main(String[] args) {
        // verilen iki sayiyi toplayan ve yazdiran bir method olusturalim

        int sayi1=10;
        int sayi2=20;

        ikiSayiToplami(sayi1,sayi2);

        // double 2 sayiyi toplayan ve yazdiran bir method olusturalim

        double sayi3=15.2;
        double sayi4=16.8;

        ikiSayiToplami(sayi3,sayi4); //kirmizi isaret geldi onun izerinden yaptik dedik ki methodu double icin cevir

        // eger variable olusturmadan direkt sayilari yazarak method call yaparsam;

        ikiSayiToplami(15.2, 19.4); // kendi sayi turune gore degistirir

        //bir int ve double toplayan metod olusturalim

     //örnek
        int sayi5=30;
        double sayi6=8.8;

        ikiSayiToplami(sayi5,sayi6); // kutu misali hangisine sigiyorsa o methodda toplar

        //int ve double li method ekstra hicbir islem olmadan calisir
        //double double olan ikinci method ise bir casting ile calisir
        //son methodda ise zaten double int e sigmayacagindan calismaz

        // 1 ve 2 arasindaki secimi hic ugrasmayacagi islem yonunde kullanir













    }

    private static void ikiSayiToplami(int sayi3, double sayi4) {
        System.out.println("iki double top: "+ (sayi3+sayi4));
    }

    private static void ikiSayiToplami(double sayi3, double sayi4) {
        System.out.println("iki double top: "+ (sayi3+sayi4));
    }

    private static void ikiSayiToplami(int sayi1, int sayi2) {
        System.out.println("iki int sayi toplami: "+ (sayi1+sayi2));
    }
}
