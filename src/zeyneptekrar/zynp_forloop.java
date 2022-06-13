package zeyneptekrar;

public class zynp_forloop {


    public static void main(String[] args) {

        // verilen stringi tersten yazdiran bir kod yaziniz

        String str= "Java cok zevkli";


        for (int i = str.length()-1; i >=0 ; i++) { //eger -2 yazarsak java sondaki i yi almiyor -1 yazdigimizda cumlenin hepsini aliyor
            System.out.print(str.substring(i,i+1)); // + dan sonrasini degistirmeyi kabul etmiyor
        }
    }


}
