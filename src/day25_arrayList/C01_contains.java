package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {

        List<String> harfler=new ArrayList<>();

        harfler.add("N");
        harfler.add("B");
        harfler.add(2,"H");

        System.out.println(harfler); //[N, B, H]

        System.out.println(harfler.contains("H")); //true
        System.out.println(harfler.contains("K")); //false

        List<String> karakterler=new ArrayList<>();

        karakterler.add("K");
        karakterler.add("M");

        System.out.println(harfler.containsAll(karakterler)); // false. K ve M var mi?

        List<String> karakterler1=new ArrayList<>();

        karakterler1.add("N");
        karakterler1.add("H");
        System.out.println(harfler.containsAll(karakterler1));//true







    }
}
