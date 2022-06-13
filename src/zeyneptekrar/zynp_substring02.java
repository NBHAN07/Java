package zeyneptekrar;

public class zynp_substring02 {

    public static void main(String[] args) {
        //amazonda nutella aramasi
        // 1-48 of 104 results for nutella
        //bu arama sonucundaki bulunan sonuc sayisi 100den cok ise super
        // az ise "az sonuc bulundu"

       String str= "1-48 of 104 results for \"nutella\"";
       System.out.println(str);// flashlar cıkmaz \ \ yani bunlar
        System.out.println(str.substring(7,11)); // gordugumuz icin bunu hoca kabul etmedi
        int ilkSpace= str.indexOf(" ");
        int ikinciSpace= str.indexOf(" ", ilkSpace+1);
        int ucuncuSpace= str.indexOf(" ",ikinciSpace+1);

        String aramaSonucSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace); // bu string
        //System.out.println(aramaSonucSayisiStr);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucSayisiStr); // bu integer avantaji integer karsilaastirilir.

        if(aramaSonucSayisiInt>100){
            System.out.println("super");
        }else {
            System.out.println(" az sonuc bulundu ");
        }


    }
}
