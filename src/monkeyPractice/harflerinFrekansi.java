package monkeyPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class harflerinFrekansi {
     /*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
     public static void main(String[] args) {

         String input="AAABBCDD";
         harflerinFrekansiMethodu(input);

     }

    public static void harflerinFrekansiMethodu(String input) {

        Map<String,Integer> frekansSayisi = new HashMap<>();
        String harflerArr[]=input.split("");

        for (String each: harflerArr
             ) {
            if (frekansSayisi.containsKey(each)){
                frekansSayisi.put(each,frekansSayisi.get(each)+1);

            }else {
                frekansSayisi.put(each,1);
            }
        }

        System.out.println(frekansSayisi);

    }


}
