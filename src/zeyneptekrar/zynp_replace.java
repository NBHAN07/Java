package zeyneptekrar;

public class zynp_replace {
    public static void main(String[] args) {

        String str= "Bugun ne cok sey ogrendik";

        // bu cumledeki  bosluk dısındaki karakter sayisini bulunuz

        System.out.println("space haric karakter sayisi " +str.replace(" ", "").length());
        System.out.println(str);

        // atama yaplmadigi surece orijinal string kalici  olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilimis olur

        System.out.println("orijinal str karakter sayisi : "+ str.length());


        // str da kalici degisiklik yapalim
        //bugun yerine yarin yazdiralim
        //ogrendik yerine ogrenecegiz yazalim

        str=str.replace("Bugun", "yarin");

        str=str.replace(" ogrendik ", " ogrenecegiz ");

        // atama yapildi kalici olarak degisti

        System.out.println("kalici degisikliikten sonra :" +str);

    }
}
