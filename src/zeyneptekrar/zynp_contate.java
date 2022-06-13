package zeyneptekrar;

public class zynp_contate {

    public static void main(String[] args) {
        // concatention yapmak icin iki secenegimiz var istersek daha once yaptıgımız gıbı+ operatorunu kullanabiliriz
        // veya String

        String str1= "java";
        String str2= "Candir";

        // java candi yazdiralim

        System.out.println(str1 + " "+ str2);

        String cumle= str1.concat(str2); // javacandir

        cumle=str1.concat(" ").concat(str2);

        System.out.println(cumle);

        // concat icine string degil de sayi veya boolean deger yazarsak ?
        //cumle =str1.concat(5); kabul etmez fakat 5 stringlestirilir
        //cumle=str1.concat(" "+5) GİBİ

        //cumle= str1.concat(true); kabul etmez






    }
}
