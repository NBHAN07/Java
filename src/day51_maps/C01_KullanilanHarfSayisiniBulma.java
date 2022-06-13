package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
         /*
    Soru 1 ) Verilen bir String’deki harfleri
    ve harflerin kacar kez kullanildigini return eden bir method yaziniz
    Ornek : Input : Hellooo   output : H=1, e=1, l=2, o=3
     */

        String input="Helloooğğğğğğ";
        String harflerArr[]=input.split(""); //harfleri ayiriyoruz

        Map<String,Integer> kullanimSayilari= new HashMap<>();//bos bir map olusturduk

        //array ve list yapiyorsak for each daha mantikli

        for (String each: harflerArr
             ) {
            if (kullanimSayilari.containsKey(each)) {
                kullanimSayilari.put(each, kullanimSayilari.get(each)+1); //kullanimSayilari.get(each) bize aradigimiz elemtin kac kez kullanildigini gosteriyor

            }else {
                kullanimSayilari.put(each,1);
            }

        }
        System.out.println(kullanimSayilari);
        }

    }





