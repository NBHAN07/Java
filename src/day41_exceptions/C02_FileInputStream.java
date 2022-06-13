package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStream {
   // private static int ;

    public static void main(String[] args)  {
        /*
        bir kod yazilirken olasi exceptionlar ongorulup exc. olustugunda
        java nin ne yapmasini istedigimiz
        belirtilmelidir

        1- eger exce. olustugunda kodun calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exc. . deklare edebiliriz
        2-
         */

        String dosyaYolu="src/day41_exceptions/dosya";

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);
            int k =0;
            while ((k = fis.read()) != -1 ){
                System.out.print((char) k);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        /*
        Exceptionlar icin de parent cihld iliskisi mevcuttur
        eger bir kod icin birden fazla exce. olusma ihtimali varsa
        oncelikle olasi excep. lar parent-child iliskisi tasiyor mu bakmamiz gerekir
        eger parent child iliskisi yoksa, istedigimiz sirada catch cumleleri olusturabiliriz

        eger parent child iliskisi varsa
        sadece parent expection 'i yazabiliriz
        veya ikisini de yazmak istersek



         */
    }
}
