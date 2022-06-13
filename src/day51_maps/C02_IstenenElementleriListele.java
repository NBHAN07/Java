package day51_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {
    /*
    soru 2) verilen map'te istenen programlama dilini bilen kisileri
    list olarak donduren bir method yazdirin
    map-> { 101= Ali, Can, java, 102=Veli, yan, java, 103=Ali, Yan, C#}
    istenen dil-> java
    sonuc-> [Ali, Veli]
     */
    public static void main(String[] args) {

      Map<Integer,String> sinifMapi= MapOlustur.myMap();
      String istenenDil="java";

      List<String> istenenDiliBilenlerListesi= istenenDiliBilenListesiOlustur(sinifMapi,istenenDil);

        System.out.println(istenenDiliBilenlerListesi);





    }

    public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMapi, String istenenDil) {

        List<String> istenenDiliBilenlerListesi=new ArrayList<>();
        Collection<String> sinifValueColl=sinifMapi.values();
        List<String> sinifValueList=new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        int outerArrayBoyut= sinifValueList.size();
        String ilkValue= sinifValueList.get(0);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;
        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {

            String temp[]=sinifValueList.get(i).split(", ");

            for (int j = 0; j <innerArrayBoyut ; j++) {

                valueMDArr[i][j]=temp[j];

            }

        }


        for (int i = 0; i <outerArrayBoyut ; i++) {


                if (valueMDArr[i][2].equals(istenenDil)){
                    istenenDiliBilenlerListesi.add(valueMDArr[i][0]);
                }

            }





        return istenenDiliBilenlerListesi;
    }
}
