package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        //siniftaki ogrenci listesini duzenli olarak yazdiralim

      Map<Integer,String> sinifListMap= MapOlustur.myMap();
        System.out.println(sinifListMap);//{101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, ....

        /*
        eger key lere tek tek ulasmak istersek
        index yapisina ihtiyacimiz var.
        ancak map index yapisini desteklemez
        bunun icin key leri once bir sete
        sonra da set in tum elementlerini bir liste ekledik

         */
        Set<Integer> sinifKeySeti= sinifListMap.keySet(); //keyset ile map ten keyleri set olarak getirip, sinifkeysetine atadik (set olarak)
        List<Integer> keyList=new ArrayList<>(); //bos list

        keyList.addAll(sinifKeySeti); //elimizdeki seti alip kullanabilmek icin olusturdugumuz bos list'e addAll ile attik

        System.out.println(keyList);//[101, 102, 103, 104, 105] . artik keyList dolu
        System.out.println(keyList.get(0));//101 ; 0. indexdeki element


        //simdi de value lari index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueColl=sinifListMap.values(); // value lari collection yaptik
        System.out.println(sinifValueColl.size());//5

        List<String> sinifValueList=new ArrayList<>();//bos list olusturduk
        sinifValueList.addAll(sinifValueColl);//collection a atadigimiz value lari simdi de addAll ile bos liste atadik

        System.out.println(sinifValueList);//[Ali, Can, Dev, 1453, Veli, Yan, QA, 1990, Ali, Yan....

        /*

        her bir value birden fazla bilgiyi iceriyor
        onun icin value leri multidimensionel bir array e atmak mantikli duruyor
        ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var

         */

        int outerArrayBoyut= sinifValueList.size();//en son value lari barindiran listin boyutunu int olarak bir variable a atadik
        System.out.println(outerArrayBoyut);//5

        //inner array lerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue= sinifValueList.get(0);//value lari atadigimiz listi get ile ilkvalue stringine atadik
        System.out.println(ilkValue);//Ali, Can, Dev, 1453
        String ilkValueArray[]=ilkValue.split(", ");//value lari ayirdik split ile ardindan array e atadik
        int innerArrayBoyut=ilkValueArray.length;//value nın boyutunu belirledik

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {

            String temp[]=sinifValueList.get(i).split(", ");

            for (int j = 0; j <innerArrayBoyut ; j++) {

             valueMDArr[i][j]=temp[j];

            }

        }
        System.out.println(Arrays.deepToString(valueMDArr));//[[Ali, Can, Dev, 1453], [Veli, Yan, QA, 1990], [Ali, Yan, C#, 2000],...

        //bu satira kadar key'leri index ile ulasabildigim keylist'e atadim
        //value leri valueMDA'e atadim
        //simdi bu key ve value'leri istedigim gibi manupule edebilirim


        System.out.println("numara isim soyisim brans");
        System.out.println("*************************");
        for (int i = 0; i < keyList.size() ; i++) {
            System.out.print(keyList.get(i)+" ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+" ");
            }
            System.out.println(" ");
        }










    }
}
