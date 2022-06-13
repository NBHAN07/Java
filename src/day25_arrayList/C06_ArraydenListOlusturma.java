package day25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydenListOlusturma {
    public static void main(String[] args) {
        //verilen arrayi listeye cevirin

        String arr[]={"N","B","H"};

        List<String> arraydenList= Arrays.asList(arr);

        //arraydenList.add("J"); // eklemez

        //anlamsiz ve kullanissiz bir method
        //array den liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        //yeni list ile add(), remove(), clear() gibi methodlar calistirmak
        //istedigimizde exception olusur

        System.out.println("21. satirda list: "+arraydenList);

        arr[1]="F";

        System.out.println("25. satirda Array: "+ Arrays.toString(arr));
        System.out.println("26. satirda list: "+ arraydenList);

        arraydenList.set(0,"Y");

        System.out.println("30. satirda Array: "+ Arrays.toString(arr));
        System.out.println("31. satirda list: "+ arraydenList);

        //birini degistirince otomatik olarak digeri de degisiyor
        //yine cok kullanilan bir sey degil





    }
}
