package Day26_foreachLoop_constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_forEachLoop {
    public static void main(String[] args) {
        //10 elementli bir list olusturalim

        int arr[]={2,4,5,1,4,7,8,9,6,3};

        List<Integer> sayilar= new ArrayList<>();

        for (int each: arr
             ) {
            sayilar.add(each);
        }
        System.out.println(sayilar);


        //sayilar listesinde 3e bolunemeyen sayilari for each ile yazalim

        for (int each: arr
             ) {
            if (each%3!=0){
                System.out.print(each+" ");
            }
        }
    }
}
