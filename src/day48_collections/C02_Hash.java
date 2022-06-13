package day48_collections;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {

        String str ="Java cok guzel";

        System.out.println(str.hashCode());//-481588044

        String str2="hava cok guzel";

        System.out.println(str2.hashCode());//1531522390

        Set<Integer> sayiKumesi=new HashSet<>();

        System.out.println(sayiKumesi.hashCode());//0

        sayiKumesi.add(10);

        System.out.println(sayiKumesi.hashCode());//10

        sayiKumesi.add(65);

        System.out.println(sayiKumesi.hashCode());//75

    }
}
