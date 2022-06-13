package tekrarNBH;

public class substring {
    public static void main(String[] args) {

        String str="Java ile IT cok guzel";

        System.out.println(str.substring(5));//ile IT cok guzel

        System.out.println(str.replace("Java","Mehmet Hoca"));

        System.out.println("mehmet hoca " + str.substring(5)); //yazilan index inclusive

        System.out.println(str.substring(0,5)); //Java yazdirir

        System.out.println(str.substring(0,1)); //J

        // bana 5. harfi sting olarak bul

        System.out.println(str.substring(5,6));
        
        str="Java gun gectikce guzellesiyor";

        System.out.println(str.substring(7,7));

       // System.out.println(str.substring(9,7)); böyle  bir sey olmaz

        System.out.println(str.substring(str.length()-1)); // son harfi verir string olarak

        System.out.println(str.substring(str.length()-5)); //son bes harfi verir

        System.out.println(str.substring(str.length())); //son harften sonrasini yani hiclik verir


    }
}
