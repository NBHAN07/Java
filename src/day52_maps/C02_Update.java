package day52_maps;

import day49_maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    //verilen map deki tum branslari java yapalim
    /*
    map de value kompleks olabildigi icin value icerisinden bir bolumu
    degistirmek istersek
    once value e ulasmak sonra onu anipule ederek istedigimiz degisikligi yapmak
    ve en son degismis halini map e eklemek gerekir

     */
    public static void main(String[] args) {
        Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);

       Set<Map.Entry<Integer,String>> sinifEntrySet= sinifListMap.entrySet();




        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            Integer keyEntry= each.getKey();
            String valuEntry= each.getValue();

            String valueArr[]= valuEntry.split("");
            valueArr[2]="Java";
            String valueYeni= valueArr[0]+", "+ valueArr[1]+ ", "
                    + valueArr[2]+", "+valueArr[3];

            sinifListMap.put(keyEntry,valueYeni);

        }
        System.out.println(sinifListMap);

    }
}
