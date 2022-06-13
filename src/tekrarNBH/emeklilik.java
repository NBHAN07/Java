package tekrarNBH;

import java.util.Scanner;

public class emeklilik {
    public static void main(String[] args) {
        //kullanıcıdan yasını isteyin >65 ise emekli olabilir yoksa olamaz

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yasınızı giriniz");
        int yas=scan.nextInt();

        if (yas<=65){
            System.out.println("emekli olamazsınız");
            System.out.println( 65-yas + "sene daha calismalisinız"); }
        else {
            System.out.println("emekli olabilirsiniz");
        }

        // if ve else varsa ikisinden biri calisir.
        // ikisinin de calışmama ihtimali ve ikisinin de ayni anda calisma ihtimali yok


















    }
}
