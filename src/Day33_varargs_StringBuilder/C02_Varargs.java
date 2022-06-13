package Day33_varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int
        //ve istedigimiz kadar string alan
        //en uzun kelimenin harf sayisi ile int parametre degerini
        //carpip sonucu yazdiran bir parametre


        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Ali";

        carpim(sayi,str1,str2,str3);
        //sayi gonderdim methodda parantez ici ilk int olmali
        //sira onemli!!

        //bir methodda varargs disinda parametre kullanacaksak
        //once diger parametreleri yazip varargsi en sona yazmaliyiz
        //bu sebeple bir methodda birden fazla varargs olamaz


    }

    private static void carpim(int sayi, String...str) {
        String enUzunStr="";
        for (String each: str
             ) {
            if (enUzunStr.length()<each.length()){
                enUzunStr=each;
            }

        } System.out.println("en uzun kelime uzunlugu ve giilen sayinin carpim: "+sayi*(enUzunStr.length()));
    }
}
