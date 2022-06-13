package Day26_foreachLoop_constructor;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        //iki string array olusturunuz
        //ve bu arraydeki ortak elemanlari for each ile bulunuz
        //sonucu ekrana yazdiriniz
        //ortak eleman yoksa ekrana ortak eleman yok yazdirin

        String arr1[]={"Nur","Betul","Han"};
        String arr2[]={"Yusuf","Erkan","Han"};

        List<String> ortakEleman=new ArrayList<>();


        for (String each1: arr1
             ) {
            for (String each2: arr2
                 ) {
                if (each1.equals(each2)){
                    ortakEleman.add(each1);
                }

            }

        }

        if (ortakEleman.isEmpty()){
            System.out.println("ortak eleman yok");
        }else {
            System.out.println("verilen listelerdeki ortak elemanlar: "+ ortakEleman);
        }









    }
}
