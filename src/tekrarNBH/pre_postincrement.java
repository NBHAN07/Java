package tekrarNBH;

public class pre_postincrement {
    public static void main(String[] args) {

        int sayi1=10;
        //bu sayiyi bir artirmak istersek

        sayi1++;
        System.out.println(sayi1); //11

        sayi1++;
        System.out.println("pre incrementten once sayi:" + sayi1);//12

        System.out.println("pre increment satirinda sayi: " +  ++sayi1); // 13; once artir sonra yazdir demek

        System.out.println("pre incrementten sonra sayi: " + sayi1); //13

        System.out.println("post increment satirinda: " + sayi1++); //13; once yazdir sonra artir demek
        System.out.println("post inc den sonra" + sayi1); //14;























    }


}
