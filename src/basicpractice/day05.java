package basicpractice;

import java.util.Scanner;

public class day05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3 veya bir kelime giriniz");
        String str= scan.next();



        if (str.length()>=3){
            System.out.print(str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2) );
        }else
            System.out.println(str);




    }


    }

