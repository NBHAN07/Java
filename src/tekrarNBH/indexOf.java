package tekrarNBH;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";

        System.out.println(str1.indexOf('J')); //0
        //istersek char olarak verdigimiz bir harfin indexini bize döndürür


        System.out.println(str1.indexOf("aska")); //10
        System.out.println(str1.indexOf("l")); //19
        //istersek bir harf ya da metin olarak verdigimiz stringin baslangic indexini bize döndürür
        System.out.println(str1.length()-1); //19

        //ayni harften birden fazla varsa

        System.out.println(str1.indexOf("b")); //5 (buldugu ilk dogru cevabi getirir. soldan saga calisir)

        System.out.println(str1.indexOf('b',5)); //5 gelir yine cunku 5 dahilde ariyor

        //java fromIndex olarak yazdigimiz indexten aramaya baslar
        //inclusive demektir yani dahil demek

        // verilen stringdeki 2. a harfinin indexini bulalim

        int ilkIndex=str1.indexOf('a');//1

        System.out.println(str1.indexOf('a',ilkIndex+1)); // ilkindex ten sonrasını arayacak artık. 3 verir

        int ilkbIndex=str1.indexOf("b");//5

        System.out.println(str1.indexOf("b",ilkbIndex+1)); //9

        //20. indexten sonra guzel aratalim

        System.out.println(str1.indexOf("guzel",20)); //31

        //olmayan bir harf aratalim

        System.out.println(str1.indexOf("w")); //-1; yok demenin matematiksel karsiligi

        //kullanicidan mail adresi isteyin ve @ yoksa gecersiz
        //iceriyorsa mail kaydedildi yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("mail giriniz");
        String mail= scan.nextLine();
        int sonuc=mail.indexOf('@');

        if (sonuc==-1){
            System.out.println("gecersiz adres");
        }
        else {
            System.out.println("mail adresiniz kaydedildi");
        }

        //bunu da yaptım yaa masallah!!

        //hocaninki de söyle

        Scanner scan2=new Scanner(System.in);
        System.out.println("mail giriniz");
        String maail= scan2.nextLine();

        if (maail.indexOf('@')==-1){
            System.out.println("gecersiz adres");
        }
        else {
            System.out.println("mail adresiniz kaydedildi");
        }
























    }
}
