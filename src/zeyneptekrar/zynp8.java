package zeyneptekrar;

public class zynp8 {

    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str= dogruMu sag taraf string sol taraf boolean olduğu için kabul etmez

        byte sayi1= 44;
        System.out.println( sayi1);

        short sayi2= sayi1;
        // esitligin solu short, sagi ise byte olmasina ragmen java itiraz etmiyor SHORT> BYTE
        // deger olarak atanan data turu variable data turunden kucuk oldugu icin java sorun yapmaz
        // Auto Widening

        System.out.println(sayi2); // 44
        double sayi3 =sayi2;
        System.out.println(sayi3); // 44.0















    }
}
