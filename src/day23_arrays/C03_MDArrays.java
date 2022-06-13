package day23_arrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //boyutlari belirli olan bir array i elementleri girmeden olusturalim

        //bir okul 8 sinif 24 er ogrenci

        int arr [][] =new int[8][24];

        //bir ilçede her birinde 24 ogrenci olan 8 sinif 5 okul varsa

        int arr2[][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kisilik, 2 tane de 22 kisilik sinif vardir
        //bunu yapamayiz cunku arraylerde toplama cıkarma yok
        //ancak 2 farkli array ile yapariz

        int arr24[][]=new int[3][24];
        int arr22[][]=new int[2][22];

        //array olustururken elementleri atama yaparsak farkli uzunlukta inner arrayler tanimlanabilir

        int arr1[][]={{3,1,7,5},{6,10}}; //gibi








    }
}
