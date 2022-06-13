package practice;

public class practice04 {

    public static void main(String[] args) {

        //koordinat nok. al ve hangi bölgede old. yazdir

        int sayi1=0; //x desek daa mantıklıymıs
        int sayi2=5; // y desek daa mantıklıymıs

        if (sayi1>0 && sayi2>0){
            System.out.println("1. bölge");
        }
        else if (sayi1<0 && sayi2>0){
            System.out.println("2. bölge");
        }
        else if (sayi1<0 && sayi2<0){
            System.out.println("3. bölge");
        }
        else if (sayi1>0 && sayi2<0){
            System.out.println("4. bölge");
        }
        else if (sayi1!=0 && sayi2==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }
        else if (sayi1==0 && sayi2!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }
        else {
            System.out.println("girdiginiz degerler orjin'dedir");
        }





    }
}
