package zeyneptekrar;

public class zynp_charAt {

    public static void main(String[] args) {


        //Stringde herhangi bir karakteri olmak istedigmizde
        // o hrfin indeksini  kullanarak
        //str.charAt(istenenIndex) yazabiliriz

        String str= "Java Cok Guzel";
        //j yi yazdiralim

        System.out.println(str.charAt(0));

        //G yi yazdiralim
        System.out.println(str.charAt(9));

        //va yazdiralim
        System.out.println(""+str.charAt(2)+str.charAt(3)); // eger bosluk koymazsak ascıı devreye girer

        //cOK seklinde yazdiralim
        System.out.println(str.toLowerCase().charAt(5)+
                            ""+str.toUpperCase().charAt(6)+
                               str.toUpperCase().charAt(7));

        // so harfi yazdir
        // String de 14 harf var , son harfin indexi 14-1
        System.out.println(str.charAt(14-1)); // uzunluk -1






    }
}
