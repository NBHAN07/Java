package Day18;

public class C02_nestedForLoop {
    public static void main(String[] args) {
        //kullanicidan bir rakam alip carpm tablosu olusturalim

        int input=3;

        //1*1 1*2 1*3    1 2 3
        //2*1 2*2 2*3    2 4 6
        //3*1 3*2 3*3    3 6 9

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input ; j++) {

                System.out.print((i*j)+ " ");

            }
            System.out.println(" ");
        } //outer loopun sonu

        /* outer loop (dıstaki loop) bir deger aldiginda
        inner loop (icteki loop) bastan sona calisir. sonra outer loop
        deger degistirir.
         */



    }
}
