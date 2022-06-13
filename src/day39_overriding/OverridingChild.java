package day39_overriding;

public class OverridingChild extends OverridingParent{

    public void method1(){
        System.out.println("child class method1");

    }

    public static void main(String[] args) {

        //method1(); //ayni class icinde direkt cagirabilirimm. ama static olmalari gerekir.
        // child class method1
        //method2();//parent class method2

        //methodlar static olmadigi zaman obje olusturarak onlari cagiracagim

        /*
        bir obje ollustururken data turu ve const. ayni class dan secilmisse
        java direkt o class a gider
        hem variable hem method icin
        o class da varsa kullanir yoksa o class in
        parent larina bakar
        (geriye donus yoktur)
         */

        OverridingChild obj1 = new OverridingChild();
        obj1.method1();//child class method1
        obj1.method2();//parent class method2


        OverridingParent obj2 = new OverridingChild();
        obj2.method1();//child class method1
        obj2.method2();//parent class method2. bu method override edilmedi

        /*
        eger data turu parent consr. child class dan secildyse
        variable larda yukaridaki sekilde calismaya devam eder
        ancak methodlar icin data turunun oldugu class daki method child class trf. override edilmis mi diye
        kontrol etmemiz gerekir
        eger child clas larda bu method override edilmisse
        override eden method calsisir

         */

        //once parent a gider data turu ovriprnt oldugu icin
        // orada method1 gorunce hemen yazdirmaz.
        //child a gider bakar overriding edilmis mi diye
        //edilmisse child i edilmemisse parent takini yazdirir

        OverridingParent obj3 = new OverridingParent();
        obj3.method1();//parent class method1
        obj3.method2();//parent class method2
    }
}
