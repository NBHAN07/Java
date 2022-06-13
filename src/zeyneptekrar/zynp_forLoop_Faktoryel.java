package zeyneptekrar;

public class zynp_forLoop_Faktoryel {

    // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
    // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)


    public static void main(String[] args) {

        int input= 9 ;
        int faktoriyel=1;
        String faktoriyelAcikYazim=""; // +input;input int oldugu icin hiclik ekleyip string yapiyoruz



        for (int i = input; i >=1 ; i--) {

            faktoriyel*=i;

            if( i== input){
                faktoriyelAcikYazim= faktoriyelAcikYazim+ i ;
            } else {
                faktoriyelAcikYazim= faktoriyelAcikYazim+ "*" +i ;
            }

         // eger soutu loopun icinde yazarsak ilk basta 9!= 72 yazar cunku 9*8i hesaplar ve yazdiri ve 72*7 den devam eder
        }
        System.out.println(input+ "!=" + faktoriyelAcikYazim+ " : " +faktoriyel);
    }
}
