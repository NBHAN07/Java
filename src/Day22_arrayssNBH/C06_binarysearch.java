package Day22_arrayssNBH;

import java.util.Arrays;

public class C06_binarysearch {
    public static void main(String[] args) {

        //verilen arrayde istenen bir elementin  var olup olmadigini true false olarak yazdiran method

        // eger javadan hazir binarysearch ile yapmak istersek(bir onceki classtan farkli olarak)
        //once sort methodunu kullanip sonra onu yapmaliyiz
        //binarySearch() methodu bize istenen sayinin oldugu ""indeksi"!! verir
        //olmayan bir elementi aratmamiz gerekirse cevap su olur:
        //- isareti koyar ve o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir
        //diyelim ki asagidaki seri icin 4 aratmak istersek -3 dondurur
        //Dikkat!!! olmasi gereken SIRA. indeks degil!!!
        // 0. indekste olmasi gereken bir sayi aratirsak yani 1. sirada olmasi gereken
        //o zaman bize -1 dondurur!!!!


        int arr[] = {3, 6, 5, 9, 45, 25, 1};
        int istenenSayii=40;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 3, 5, 6, 9, 25, 45]
        Arrays.binarySearch(arr,istenenSayii); //indeksi dondurur. mesela 3 icin 1 dondurur
        System.out.println( Arrays.binarySearch(arr,istenenSayii));//bu da indeksi yaziyor











    }
}
