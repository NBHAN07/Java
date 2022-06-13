package day35_inheritance;

public class Child01 extends Parent{
    public static void main(String[] args) {
        /*
        child class hicbir objeye ihtiyac duymadan
        parent class daki variable methodlara ulasabilir
         */
        System.out.println(isim);
        System.out.println(soyIsim);
        System.out.println(fabrika);
        method1();
        method2();

    }
}
