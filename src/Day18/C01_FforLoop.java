package Day18;

public class C01_FforLoop {
    public static void main(String[] args) {
        //soru11- kullanicidan 10 dan kucuk bir tam sayi isteyin
        // ve girilen sayinin faktoriyelini bulun

        int input=9;

        int faktoriyel=1; //kendimiz atadik

        String faktoriyelAcikYazim="";

        for (int i = input; i >=1 ; i--) {

            faktoriyel*=i;

            if (i==input){
                faktoriyelAcikYazim= faktoriyelAcikYazim+ i;
            }
           else{ faktoriyelAcikYazim= faktoriyelAcikYazim+"*"+ i ;}
            
        }
        System.out.println(input + "!= "+ faktoriyelAcikYazim+ "= "+ faktoriyel);//bunu for un icine yazmiyoruz onemli bir detay.
        // aksi halde her adimi yazdiriyor. disaridayken sadece sonucu yazdiriyor
        
        







    }
}
