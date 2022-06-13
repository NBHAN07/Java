package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_listedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        //verilen bir listede, istenen iki indexteki elementlerin yerini
        //kalici olarak degistiren bir method olusturun

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;

        //kalici olarak dedigi icin atamali olmali

        System.out.println(sayilar);//[1, 3, 5, 3, 5, 6, 1, 7]

        sayilar = swapElements(sayilar,ilkIndex,ikinciIndex);

        System.out.println(sayilar);//[1, 3, 6, 3, 5, 5, 1, 7]


    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        //ilk adim: bir temp sayi olusturup
        // verilen indexdeki sayilarin yerini degistirelim
        //indexleri kontrol edip sinirin otesinde index verildiyse
        //uyari mesaji yazdirin

        if (!sayilar.contains(sayilar.get(ikinciIndex))){
            System.out.println("sinirlar dahilinde bir sayi giriniz");

        } else if (!sayilar.contains(sayilar.get(ilkIndex))){
            System.out.println("sinirlar dahilinde bir sayi giriniz");
        }else {

            int temp=sayilar.get(ilkIndex);

            ikinciIndex=temp;

            sayilar.set(ilkIndex,sayilar.get(ikinciIndex));

            sayilar.set(ikinciIndex,temp);

        }

        return sayilar;
    }
}
