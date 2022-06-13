package zeyneptekrar;

import java.util.Locale;

public class zynp_forLoopSoru9 {

    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden
        // bir method olusturun.


        String input= "java ";
        // java kelimesini ters cevirdigimizde ikisi birbirine esitse palindromedur
        palindromeKontrolEt(input);



    }

    private static void palindromeKontrolEt(String input) { // bir sey dondrmasine gerek yoksa void

        String terstenInput="";

        for (int i = input.length()-1; i >=0 ; i--) { // sondan basa
            terstenInput+= input.charAt(i);

        }

        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);

        if ( input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz kelime palindrome  ");
        }else {
            System.out.println("Girdiginiz kelime palindrome degil ");
        }

    }


}
