package zeyneptekrar;

public class zynp13 {

    public static void main(String[] args) {

        int sayi=10;
        sayi++;
        System.out.println(sayi); // 11


        sayi++;
        System.out.println("pre-incrementten once "+ sayi); // 12


        // eger 11. ve 12. satirda yaptigim 2 islemi tek satirda yaparsam
        // java iki islemden once hangisini yapacagini bilmek ister
        //  once artirir sonra yazdirirsak java yeni degeri yazdirir
        // ama once yazdirir sonra artirirsak, bu durumda eski deger yazdirilir

        System.out.println("pre-increment satirinda " +  ++sayi); // 13 once artir sonra yazdir
        System.out.println("pre-incrementden sonra "  +  sayi); // 13

        System.out.println("pre-increment satirinda " + sayi++); //13
        System.out.println("pre-incrementden sonra "+ sayi); //14

        int a= 15;
        int b= ++a;
        System.out.println(a);
        System.out.println(b);

        int c= 15;
        int d= a++;
        System.out.println(c);
        System.out.println(d);










    }
}
