package day40_overridding_polymorphism;

public class C02 extends C01 {

    private void method4(){
        /*
        override notasyonu overridden mehod ile overiding methodu
        birbirine baglar
        farkinda olmadan overridden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        notasyon kullanilmzsa java bunlarin iliskisini bilir ama overridden method
        silirse sesii cikarmaz

         */
        System.out.println("parent method 4");
        //parent class daki private!! method4 e
        //child class dan ulasmamiz mumkun olmadigindan
        //java bu iki methodu
        //TAMAMEN FARKLİ 2 METHOD olarak kabul eder
        //@override kullanmak istersek java kabul etmez CTE verir
    }

    @Override
    protected String method3(){
        //Covariant icin yazildi
        return "java";
    }

    @Override
    public void method2() {
       // super.method2(); buna gerek yok otomatik geliyor
        System.out.println("child method 2");
    }

    public static void main(String[] args) {
        /*
        @Override notasyonu ovirriden method ile overriding methodu birbirine baglar
        dolayisiyla farkinda olunmadan overriden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java CTE verir

        notasyon kullunailmazsa java bunlari iliskisini bilir ama
        overriden method silinirse sesini cikarmaz

         */

        C02 obj1 = new C02();

        obj1.method1();//parent method1
        obj1.method2();//child method 2

        C01 obj2=new C02();
        obj2.method1();//parent method1
        obj2.method2();//child method 2

        C01 obj3=new C01();
        obj3.method1();//parent method1
        obj3.method2();//parent method2




    }

}
