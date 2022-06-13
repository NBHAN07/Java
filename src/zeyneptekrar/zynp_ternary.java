package zeyneptekrar;

import java.util.Scanner;

public class zynp_ternary {

    public static void main(String[] args) {

        // Ternary ile yapilan tum islemler if else ile de yapilabilir
        // If else yerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        // Ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir
        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim


        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        if (sayi%2==0){
            System.out.println("girdiginiz tam sayi bir cift sayidir");
        } else {
            System.out.println("girdiginiz tam sayi bir tek sayidir");
        }

        System.out.println(sayi%2==0 ? "cift sayi" : " tek sayi");



        int sayi1=1400;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

        String sonuc= sayi1 >=100 ? "sayi 3 veya daha fazla basamakli " : "sayi 3 den daha az basamakli veya negatif bir sayi ";
        System.out.println("girdiginiz sayi analizi: " + sonuc);







    }
}
