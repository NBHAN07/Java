package zeyneptekrar;

public class zynp_MethodOlusturma4 {

    public static void main(String[] args) {

        // String str= "ali"; ilk basta vardi hoc soradan sildi
        // String yazdiran metthod olusturma
        // hosgeldiniz diyen bir mehod olusturunuz
        // kapanma mesaji yazan bir method olustur



        hosgeldinYazdir();
        // stringYazdir("java gun gectikce guzellesiyor");
        // kapanmaMethodu();
    }

    public static void kapanmaMethodu() {

        System.out.println("bizi tercih ettiginiz icin tesekkr ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin");
        stringYazdir("boyle de olur ");
    }

    public static void stringYazdir(String str) {

        System.out.println(str);
        kapanmaMethodu();
    }
}
