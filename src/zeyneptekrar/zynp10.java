package zeyneptekrar;

public class zynp10 {
    public static void main(String[] args) {

        int sayi1=8;
        int sayi2=4;

        System.out.println(sayi1/sayi2); //2

        sayi2=3;

        System.out.println(sayi1/sayi2); //2.6666666> 2

        sayi1=22;

        System.out.println(sayi1/sayi2); //7.3333> 7

        //java iki integer sayiyi birbirine bolerse sonucu da integer olarak verir
        //eger virgulden sonra kusurat varsa siler


        int sayi3 = 4786;
        int sayi4 = 10;

        sayi3= sayi3/sayi4; //478.6
        System.out.println(sayi3); //478


        sayi3= sayi3/sayi4; //47.8
        System.out.println(sayi3); //47


        sayi3= sayi3/sayi4; //4.7
        System.out.println(sayi3); //4


        sayi3= sayi3/sayi4; //4
        System.out.println(sayi3); //0

    }
}
