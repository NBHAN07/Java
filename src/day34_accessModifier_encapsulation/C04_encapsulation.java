package day34_accessModifier_encapsulation;

public class C04_encapsulation {
    public static void main(String[] args) {
        /*
        bir variable i encapsule etmek icin
        1- Access modifieri private yapariz
        2- sonra okuma ve yazma ozelliklerinin kullanilmasini istedigimiz gibi sinirlayabiliriz
            -eger sadece okunmasini istiyorsak, degiştirilmesini istemiyorsak, "getter"
            - sadece degerin degistirilebilmesini istiyorsak, okunmasini istemiyorsak, "setter"

         bir variable icin hem getter hem de setter olusturursak
         o variable public olmus gibi hem okunmasin hem de yazilmasini saglayabiliriz

         piyasada developer lar arasinda genel uygulama da boyledir.
          public yerine bunu kullanirlar
         */

        C03 obj=new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("java");

        System.out.println(obj.getStr());//java

        System.out.println(obj);//C03{sayi=0, str='java'}
        // toString old. icin degerleri direkt yazdirabilik

    }
}
