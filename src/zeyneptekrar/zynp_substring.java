package zeyneptekrar;


public class zynp_substring {
    public static void main(String[] args) {

        String str= "java ile IT cok guzel ";

        System.out.println(str.substring(5)); // ile IT cok guzel
        System.out.println("mehmet hoca :" +str.substring(5));

        System.out.println(str.substring(9));// yazilan index inclusive yani dahil


        // eger bir index'den sona kadar olan parcayi degil
        //belirli bir parcayi almak istersek
        //2 parametre yazmak gerekir str.substring (baaslangicIndexi, bitisIndexi)
        // baslangic indexi ==> inclusive/ dahl
        // bitis indexi ==> eclusive/haric

        System.out.println(str.substring(0,5)); //java
        System.out.println(str.substring(0,1));  //j
        // bana 6. harfi string olarak bulun
        System.out.println(str.substring(5,6));

        System.out.println(str.substring(7,7)); // "" (hiclik)

        //System.out.println(str.substring(4,2)); bitis indexsi baslangic indexinden kucuk olamaz

        System.out.println(str.substring(str.length()-1)); //son harfi yadirir
        System.out.println(str.substring(str.length()-5)); // son 5 harfi yazdirir
        System.out.println(str.substring(str.length())); // son harfte sonraki hicligi verir.







    }



}
