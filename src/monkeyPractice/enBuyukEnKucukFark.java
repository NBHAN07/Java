package monkeyPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class enBuyukEnKucukFark {
   /* kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
   public static void main(String[] args) {


       List<Integer> myArray=new ArrayList<>();
       Scanner scan=new Scanner(System.in);
       int sayilar=1;
       int enkucukEleman=10000;
       int enBuyukEleman=-1;
       int fark=0;


       do {
           System.out.println("lütfen listenizdeki sayilari giriniz: \n" +
                   "listenizde girilecek eleman kalmayinca 0'e basiniz");
           sayilar= scan.nextInt();
           myArray.add(sayilar);



       }while (sayilar!=0);

       for (int each: myArray
            ) {
           if (enkucukEleman>each){
               enkucukEleman=each;
           }
       }
       for (int eachh: myArray
       ) {
           if (enBuyukEleman<eachh){
               enBuyukEleman=eachh;
           }
       }



       fark=enBuyukEleman-enkucukEleman;


       System.out.println(myArray);
       System.out.println("en buyuk ve en kucuk sayi arasindaki fark: "+ fark);

   }

   }









