package Day28;

public class StaticKeyword {
    static int sayi1;
    int sayi2;
     /*
        Static variable lar direkt class a baglidir
        class icinde yapilan her turlu degisiklik static variable larda kalici olur

        Instance variable lar ise objeye baglidir
        Instnce variable lara  sadece  obje uzerinden erisilebilir
        ve bir obje uzerinden erisilerek yapilan degisiklik
        instance variable in degerini tum objeer icin kalici olarak degistirmez
        sadece o obje icin instance variable in degerini kalici olarak egistirir
         */

    public static void main(String[] args) {
        System.out.println("sayi1: "+ sayi1); //0

        StaticKeyword obj1=new StaticKeyword();
        System.out.println(obj1.sayi2);//0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1: "+sayi1);//1
        System.out.println(obj1.sayi2);//1
        System.out.println(obj1.sayi1);//hata vermez ama yine de gereksiz bir hamle cunku zaten sayi1 i direkt getirebiliyoruz
        //obj1 uzerinden getirmemize gerek yok
        //o yuzden ustunu boyadi

        StaticKeyword obj2= new StaticKeyword();

        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//2

        System.out.println(obj1.sayi1);//2
        System.out.println(obj1.sayi2);//1

        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi1);//3
        System.out.println(obj1.sayi2);//2

        System.out.println(obj2.sayi2);//1
        System.out.println(obj2.sayi1);//3







    }
}
