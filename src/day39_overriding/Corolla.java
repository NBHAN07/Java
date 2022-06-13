package day39_overriding;

public class Corolla extends Toyota {
    protected  String hiz="Corolla max 200 hiz yapar";
    protected String yakit="Corolla benzinli veya elektiriklidir";
    protected String model="corolla";


    public void motor(){
        System.out.println("corolla cevreci motor kullanir");

    }

    public void yakitTuketimi(){
        System.out.println("corolla 5.6 lt yakit kullanirlar");

    }
    public void vitesSayisi(){
        System.out.println("corolla 5 viteslidir");

    }

    public static void main(String[] args) {

        //data turu ve cons. farkli oldugunda
        //const. calistigi icin
        //obje const.in oldugu class ozelliklerini tasir
        //ancak data turu parent class secildigi icin
        //variable lar data turunun secildigi class ve
        //onun parent class larından deger alabilir
        /*
        methodlar icin ise yine data turunun oldugu class a gideriz
        ancak direkt metdodu calistirmadan once
        method override edilmis mi diye kontrol ederiz
         */


        Corolla arb1=new Corolla();
        System.out.println(arb1.hareket); //araba
        System.out.println(arb1.hiz);//corolla
        System.out.println(arb1.yakit);//corolla
        System.out.println(arb1.marka);//toyota
        System.out.println(arb1.sirketMerkezi);//toyota
        System.out.println(arb1.model);//corolla
        arb1.motor(); //corolla

        Toyota arb2=new Corolla();
        System.out.println(arb2.hareket);//araba
        System.out.println(arb2.hiz);//toyota
        System.out.println(arb2.yakit);//araba
        System.out.println(arb2.marka);//toyota
        System.out.println(arb2.sirketMerkezi);//toyota
       // System.out.println(arb2.model); CTE data turu toyota ve onda model yok parent inda da yok
        arb2.motor();//corolla
        arb2.garanti();//toyota
        arb2.yakitTuketimi();//corolla. once toyotaya bakti onda yok. sonra arabaya bakti onda var
        // en kotu bunu calistirirm ama bir bakayim child da override edilmis mi dedi
        //bakti edilmis corolla dakini yazdirdi
        //yoksa arabadakini yazdiracakti

        //arb2.vitesSayisi(); data turu toyotadan baslayinca boyle bir method bulamadil
        //dolayisiyla CTE


        Araba arb3=new Corolla();
        System.out.println(arb3.hareket);//araba
        System.out.println(arb3.hiz);//araba
        System.out.println(arb3.yakit);//araba
        System.out.println(arb3.marka);//araba
       // System.out.println(arb3.sirketMerkezi);// CTE
       // System.out.println(arb3.model);//CTE
        arb3.yakitTuketimi();//corolla
        arb3.motor();//corolla
        //arb3.garanti(); //CTE. aramaya araba classindan basladi ve metodu bulamadi.
        //yani bulamadim onceki calssa bakayim orada var mı DEGİL direkt CTE
        //arb3.vitesSayisi(); CTE

    }

}
