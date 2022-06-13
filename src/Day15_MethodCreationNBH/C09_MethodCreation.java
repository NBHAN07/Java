package Day15_MethodCreationNBH;

public class C09_MethodCreation {
    public static void main(String[] args) {
        String isim="nur betul";
        String soyİsim="HAN";
        String kKartNo="1234567891231234";



        String gizlenmisİsimSoisim= isimSoyisimGizle(isim,soyİsim);
        String gizlenmisKkNo= kKartNoGizle(kKartNo);

        System.out.println(gizlenmisİsimSoisim);
        System.out.println(gizlenmisKkNo);







    }

    private static String kKartNoGizle(String kKartNo) {
        String yeniKKno="**** **** **** "+ kKartNo.substring(12);
        return yeniKKno;


    }

    private static String isimSoyisimGizle(String isim, String soyİsim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\S","*"); //iki isim icin bosluk haric hepsi * yapabiliriz


        String yeniSoyisim=soyİsim.substring(0,1).toUpperCase()
                +soyİsim.replaceAll("\\S","*");


        //method olusturmada 3. adim
        //method yalnizca bir sey mi yazdiracak yoksa dondurecek mi?

        return yeniIsim+" "+yeniSoyisim;

        //isim soyisim dondur dedigimiz icin String sectik return type'i; void degil

    }


}
