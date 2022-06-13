package tekrarNBH;

public class replace {
    public static void main(String[] args) {

        String str="bugun ne cok sey ogrendik";

        // bosluk disindaki karakter sayisini bulunuz

        //replace degistirmek demek
        //boslugu hiclik ile degistirip uzunlugu bulduk
        System.out.println("space haric karakter sayisi: "+str.replace(" ","").length()); //21

        //atama yapilmadigi surece orjinal str degismez
        //sadece o satir icin degisiklik yapilmis ve yazdirilmis olur

        System.out.println("orijinal karakter sayisi: "+ str.length());//25

        // str da kalici degisiklik yapalim
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("bugun","yarin");
        str=str.replace("ogrendik","ogrenecegiz");

        System.out.println("kalici degisiklikten sonra str: " + str);









    }
}
