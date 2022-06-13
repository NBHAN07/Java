package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

import static day25_arrayList.C04_ListedenTekrarliElemanSilme.tekrarsizListeOlustur;

public class C05_listiTekrarsizYap {
    public static void main(String[] args) {
        //verilen bir listede tekrar eden sayilari yalnizca bir kez yazdiran
        // bir method yazdirin
        //[1,3,5,3,5,6,1,7] den [1,3,5,6,7] ye donustur

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        sayilar = tekrarsizListeOlusturma(sayilar);

        System.out.println(sayilar);//[1, 3, 5, 6, 7]

        //az oncekinden tek farki
        //o sadece yazdiriyordu
        //bu ise listeyi degistiriyor
        //bunu yapmak icin de atama yaptik
        //sayilar listesine atadik
        //metodu yeniden yaptik
        //atama yaptigim icin main icinde java metodu void olarak olusturmadi zaten en basta
        //List<Integer> olarak yapti

    }

    public static List<Integer> tekrarsizListeOlusturma(List<Integer> sayilar) {

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))) {
                tekrarsizList.add(sayilar.get(i));
            }

        }
        return tekrarsizList;
    }
}