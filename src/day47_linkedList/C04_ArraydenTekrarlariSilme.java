package day47_linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir arrayden tekrar eden elementleri silip
        //unique elementler olusan bir array haline donduren bir method olusturun

       Integer arr[]={3,5,6,1,2,8,9,9,7,4,4,5,3};

       arr= benzersizYap(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static Integer[] benzersizYap(Integer[] arr) {

        Set<Integer> benzersizSet= new TreeSet<>(); //treeset secersek sirali yazdirir

        for (Integer each :  arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet); //benzersizSet yaptik ama bu su an set bze array lazim

        //seti array e cevirelim
        //setlerde index yoktur o yuzden for loop kullanamayiz
        //for each kullanmaliyiz

        Integer arrBenzersiz[]=new Integer[benzersizSet.size()];
        int index=0;
        for (Integer each: benzersizSet
             ) {
            arrBenzersiz[index]=each;
            index++;
            
        }
        




        return arrBenzersiz;
    }
}
