package Day15_MethodCreationNBH;

public class C04 {
    public static void besHarfitersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
        System.out.println("girdiginiz kelimedekki harf sayisi: 5 ");

    }

    public static void dortHarfitersineCevir(String kelime) {
        String  tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);

        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
        System.out.println("girdiginiz kelimedekki harf sayisi: 4 ");



    }

    public static void ücHarfitersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("kelimenin tersten yazilisi: " + tersKelime);
        System.out.println("girdiginiz kelimedekki harf sayisi: 3 ");

    }

}

//bu class calismaz cunku main method olmadigi icin direkt calismaz
//bu class sadece depo gorevi gorur
//baska class lardan kullanilabilecek method veya variable lari barindirir
