package Day17_forLoop;

public class C08_palindrome {
    public static void main(String[] args) {
        //soru9) interview question:
        //kullanicidan bir string isteyin
        //palindrome olup olmadigini kontrol eden bir method olusturun
        // (kelimenin tersten okunusu kelimeye esit olmasi)

        String input="121";

        palindromeKontrolEtt(input);


    }

    private static void palindromeKontrolEtt(String input) {

        String terstenInput="";

        for (int i = input.length()-1 ; i >=0 ; i--) {

            terstenInput += input.charAt(i);
        }

        System.out.println("girdiginiz kelimenin tersten yazilisi: " + terstenInput);

        if(input.equalsIgnoreCase(terstenInput)){
                System.out.println("girdiginiz kelime palindrom");
        } else {
            System.out.println("girdiginiz kelime palindrom degil");
        }

        }
    }

