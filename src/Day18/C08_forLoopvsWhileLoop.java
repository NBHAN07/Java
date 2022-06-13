package Day18;

import java.util.Scanner;

public class C08_forLoopvsWhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak istedigi sayilari alin
        //ve kullanici 0'a basana kadar devam edin
        // kullanici 0 a bastiginda girdigi sayilarin toplamini yazdirin

        
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int sayiToplami=0;

      /*  for (int i = 1; i <100000 ; i++) {
            System.out.println("lutfen bir sayi giriniz: ");
            sayi=scan.nextInt();
            if (sayi==0){
                break;
            } else {
                sayiToplami+=sayi;
            }
            
        } */
        System.out.println("girdiginiz sayilarin toplami: "+ sayiToplami);


        // whilw ile yapalim

        sayi=1; // degeri iceride atayacagimiz icin kac girdigimizin onemi yok ama eger 0 girersek sistem olu dogardi
        sayiToplami=0;

        while (sayi!=0){
            System.out.println("lutfen bir sayi giriniz: ");
            sayi=scan.nextInt();
            sayiToplami+=sayi;

        }
        System.out.println(sayiToplami);

//baslangıc ve bitis, degisim degerleri net olan durumlarda for loop daha mantiklidir
        //fakat adim sayisi belli olmayan durumlarda while loop daha mantiklidir












    }}
