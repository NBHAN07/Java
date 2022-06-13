package day30_passByValue;

public class C01_StaticBlocks {
    static {
        /*

        static block calss ilk calismaya basladiginda devreye girer
        ve class in calismasi icin gerekli on hazirliklar icin kullanilir
        yazildigi satirin hicbir onemi yoktur, class icinde istenen yere yazilabilir
        static blok birden fazla olursa (ki buna gerek yoktur), blocklar yukaridan asagiya dogru calisir

        */
        System.out.println("static block calisti");

    }
    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici ");

        C01_StaticBlocks obj1;//obje olusturduk ama constructor calistirmadik

        new C01_StaticBlocks();//constructor nerede cagrlirsa orada calisir.
        // burada cagirdik o halde burada calisir

    }
}
