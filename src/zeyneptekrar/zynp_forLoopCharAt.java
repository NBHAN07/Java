package zeyneptekrar;

public class zynp_forLoopCharAt {

    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran
        //bir kod yazalim


        char ilkHarf='m';
        char sonHarf='t';

        for ( char i= ilkHarf; i <=sonHarf ; i++) {
            System.out.print(i + " "); // forun parantez icindeki int yazisini yeni kullandigin
            // data turune cevirmeyi unutma

        }


        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        // baslangic ve bitis sayilari arasindaki artis miktari ile olusacak
        // tum sayilari yazdirin

        for (double i =baslangic ; i <= bitis ; i+=0.2) { // artiste yazabiliriz
            System.out.print(i + "  ");
        }
    }
}
