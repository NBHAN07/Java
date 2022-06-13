package tekrarNBH;

public class autowidening {
    public static void main(String[] args) {
       byte sayi1= 44;
        System.out.println(sayi1);

        short sayi2=sayi1; // sol short sag byte olmasina ragmen java itiraz etmiyor (auto widening)
        System.out.println(sayi2);

        double sayi3=sayi2;
        System.out.println(sayi3);









    }


}
