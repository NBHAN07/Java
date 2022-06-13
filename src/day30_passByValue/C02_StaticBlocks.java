package day30_passByValue;

public class C02_StaticBlocks {
    {
        /*
        static olmayan block lar ise obje olusturulurken calisir

        static blocklar sadece 1 kere en basta calisir ama
        statik olmayan block lar her obje icin calisir
         */
        System.out.println("statik olmayan block calisti");
    }
    static {
        System.out.println("static block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
        C02_StaticBlocks obj2=new C02_StaticBlocks();



    }
}
