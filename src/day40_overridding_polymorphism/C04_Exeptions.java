package day40_overridding_polymorphism;

public class C04_Exeptions {
    public static void main(String[] args) {
        //String olarak verilen bir sayiyi, integer a cevirip
        //2 katini ekrana yazdiralim

        String str ="12345a";

       // int sayi1= Integer.parseInt(str);
        //str icinde sayi olmayan bir karakter olursa
        //NumberFormatException.forInputString verir


       // System.out.println("girilen sayinin 2 kati: "+ 2*sayi1);


        try {
            int sayi= Integer.parseInt(str);
            System.out.println("girilen sayinin 2 kati: "+ 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("girdiginiz string sayi olmayan elementler iceriyor");
        }

    }


}
