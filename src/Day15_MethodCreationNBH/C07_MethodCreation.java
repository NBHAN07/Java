package Day15_MethodCreationNBH;

public class C07_MethodCreation {
    public static void main(String[] args) {


        //stringi yazdiran method olusturalim

        //hos geldiniz diyen bir method olusturun

        //kapanma yazisi olan bir method

        hosgeldinYazdirma();
        stringYazdirma("slm cnm nbr");
        kapanmaMethoduu();







    }

    private static void kapanmaMethoduu() {
        System.out.println("bizi tercih ettiginiz icin tesekkür ederiz");
    }

    public static void hosgeldinYazdirma() {
        System.out.println("hosgeldiniz");
        stringYazdirma("böyle de olur");

    }

    private static void stringYazdirma(String str) {
        System.out.println(str);
        kapanmaMethoduu();
    }
}
