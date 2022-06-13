package day13;

public class substring1 {
    public static void main(String[] args) {

        String str= "Java ile IT cok guzel";

        System.out.println(str.substring(5));
        //yukaridaki stringi Mehmet hoca ile IT cok guzel

        System.out.println(str.replace("Java", "Mehmet Hoca"));
        System.out.println("Mehmet Hoca " + str.substring(5));

        System.out.println(str.substring(9)); // yazilan index inclusive

        // eger bir index den sona kadar olan parcayi degil
        //belirli bir parcayı almak istersek
        //2 parametre yazmak gerekir str.substring(baslangıcIndexi, bitisIndeksi)
        //baslangıc indexi ===> inclusive/dahil
        //bitiş      "" ====> eclusive/hariç

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,1));
        String harf=str.substring(5,6); //bana 6. harfi String olarak bulun













    }
}
