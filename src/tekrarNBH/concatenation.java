package tekrarNBH;

public class concatenation {
    public static void main(String[] args) {

        String str1="java";
        String str2="güzel";
        int sayi1=5;
        int sayi2=3;

        // variable ların degerlerini degistirmeden asagıdaki ifadeleri
        //bu variable ları kullanarak yazdır

        //java5güzel

        System.out.println(str1+sayi1+str2);

        //2güzel15

        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2)); // parantez olmasa da aynısı olurdu bu örnekte

        //java22

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        //53güzel

        System.out.println(sayi1+(sayi2+str2));

        // 2. yol. sayıyı stringe cevirmis oluruz

        System.out.println(""+sayi1+sayi2+str2);













    }
}
