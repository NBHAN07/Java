package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_list {
    public static void main(String[] args) {
        //bir listede ortalama deger üstündeki element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();

        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);

        System.out.println(sayilar); //[1.0, 3.0, 5.0, 3.0, 5.0, 6.0, 1.0, 7.0]

        //adimlar 1- once ortalamayi bul
        //2-ortalamanin ustunde olanlaribir liste at


        //adim 1;

        double toplam=0.0;
        double ortalama=0.0;

        for (int i = 0; i < sayilar.size() ; i++) {
            toplam+= sayilar.get(i); //dikkat!! bu kismi hatirlamamistim
        }

        ortalama=toplam/sayilar.size();

        System.out.println(ortalama); //3.875 oldu

        List<Double> ortalamaninUstundekiler=new ArrayList<>();

        for (int i = 0; i < sayilar.size() ; i++) {
            if (sayilar.get(i)>ortalama){
                ortalamaninUstundekiler.add(sayilar.get(i));
            }

        }

        System.out.println(ortalamaninUstundekiler);//[5.0, 5.0, 6.0, 7.0]
        System.out.println(ortalamaninUstundekiler.size());//4


















    }
}
