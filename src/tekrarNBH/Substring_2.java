package tekrarNBH;

public class Substring_2 {
    public static void main(String[] args) {
        //1-48 of 104 results  for "nutella"
        //bu arama sonucundaki butun sonuc sayisi 100den cok ise super
        //az ise az sonuc bulundu


        //104 sınucunu nasil yazdiririz?
        // ya iki space arasi ya da f ve r arasini

        String str="1-48 of 4 results  for \"nutella\"";

        int ilkSpace=str.indexOf(" ");
        int ikinciSpace=str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ", ikinciSpace+1);

        String aramaSonucSayisi=str.substring(ikinciSpace+1,ucuncuSpace);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisi);

        if (aramaSonucSayisiInt>100){
            System.out.println("spr");
        } else {
            System.out.println("az snc");
        }




















    }
}
