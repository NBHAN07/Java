package tekrarNBH;

public class conditionalOperators {
    public static void main(String[] args) {

        boolean sonuc1=(5+2 != 15) && (5>7);
        System.out.println(sonuc1);

        boolean sonuc2=(2/2==1) || (2*2==9);

        System.out.println(sonuc2);

        int sayi3=15;

        // sayi3 ün 10-20 arasında oldugunu ispatla
        // java 3lü karsılastırma kabul etmez
        //ikili karsilastirmalar yapıp mantıksal operatorlerle birlestirmeliyiz

        System.out.println(10<sayi3 && sayi3<20); // true

        // bir aralıkta olmadığını

        int sayi4=5;

        System.out.println(sayi4<10 || sayi4>20); // true












    }
}
