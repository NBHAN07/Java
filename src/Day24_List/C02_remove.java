package Day24_List;

import java.util.ArrayList;
import java.util.List;

public class C02_remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("nur");
        isimler.add("betul");
        isimler.add("han");
        System.out.println(isimler); //[nur, betul, han]


        //remove(istenenObject) methodu istenen elementi kaldirip
        //bize true false doner
        //eger remove isleminin yapildigini kontrol etmek istersek
        //methodu boolean bir variable'a atayabiliriz

        boolean sonuc=isimler.remove("nur");//true //remove object o olan

        //sonucu kullaniciya yazdirmak isterseniz
        //if/else ile istediginiz degerlendirmeyi yazabilirsiniz

        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan slinemedi");
        }
        System.out.println(isimler);

        sonuc=isimler.remove("asdf");

        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        } else {
            System.out.println("istediginiz isim listede olmadigindan slinemedi");
        }
        System.out.println(isimler);

        //remove (index) yazdigimizda sildim silmedim ihtimali kalmaz
        //bize remove edilen elementi doner
        System.out.println(isimler.remove(1)); // han ı siler ve bize delil olarak han i dondurur

        //yazdirsak da yazdirmasak da liste degisti ve 1. indexteki eleman silindi
        System.out.println(isimler);











    }
}
