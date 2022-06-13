package zeyneptekrar;

import java.util.Scanner;

public class zynp_swich_string {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        // bu soruyu if else ile yapabiliriz ama art arda 12 if else
        // cok kalabalık ve anlasılması zor olabilir
        // bunun yerinne switch - case yapisini kullnabiliriz

        switch (ayNo){
                case 1:
                System.out.println("ocak ");
                break;
                case 2:
                System.out.println("subat");
                break;
                case 3:
                System.out.println("mart");
                break;
                case 4:
                System.out.println("nisan ");
                break;
                case 5:
                System.out.println("mayis");
                break;
                case 6:
                System.out.println("haziran");
                break;
                case 7:
                System.out.println("temmuz");
                break;
                case 8:
                System.out.println("agustos");
                break;
                case 9:
                System.out.println("eylül");
                break;
                case 10:
                System.out.println("ekim ");
                break;
                case 11:
                System.out.println("kasim ");
                break;
                case 12:
                    System.out.println("aralik");
                 break;
            default:
                System.out.println("lutfen gecerli bir ay numarası giriniz ");

                    // switch icine yazilan ariablein degerine göre
                    // ilgili casei bulur ve  break gorene kadar kodu calıstırı
                    //eger break yoksa ilgili caseden asagi dogru  tum caseler calısır
                    //if elseki son else gibi geriye kalan durumlari tamamen
                    // kapsayacak bir satir daha ekleyebiliriz








        }


    }
}
