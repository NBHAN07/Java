package zeyneptekrar;

public class zynp_Method_iceren {
    public static void besHarfiTersineCevir3(String kelime) {
        String tersKelime= kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi: 5 ");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }



    public static void dortHarfiTersineCevir2(String kelime) {
        String tersKelime= kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi: 4 ");
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);
    }

    public static void ucHarfiTersineCevir1(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi: 3" );
        System.out.println("kelimenin tersten yazilisi : " + tersKelime);

    }
}
