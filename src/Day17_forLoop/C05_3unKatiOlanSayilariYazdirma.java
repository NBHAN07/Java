package Day17_forLoop;

public class C05_3unKatiOlanSayilariYazdirma {
    public static void main(String[] args) {

        //kullanicidan 100 den kucuk bir sayi isteyin
        //1den baslayip girilen sayiya kadar 3un katlarini yazdirin

        int sayi=55;

        for (int i = 1; i <sayi ; i++) {

            if(i%3==0){

                System.out.print(i + " ");
            }
            
        }


    }

}
