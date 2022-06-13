package zeyneptekrar;

public class zynp_index {
    public static void main(String[] args) {
        String str3="java bir baska guzel ";
        // istersek char olarak verdigimiz bir harfin indexini bize dondurur
        System.out.println(str3.indexOf('J')); //0

        //istersek bir harf ya da metin olarak verdigimiz stringin indexinş dondurur

        System.out.println(str3.indexOf("l")); //19
        System.out.println(str3.length()-1);  //19
        System.out.println(str3.indexOf("aska")); //10

        // ayni harften birden fazla varsa ?
        System.out.println(str3.indexOf("b")); //5 buldugu ilk dogru eslesnmeyi dondurur

        System.out.println(str3.indexOf('b', 5)); //9
        // bu methodda java aramaya fromindex olarak yazdigimi indexdeb baslar
        //(inclusive)

        // verilen String'deki 2.a harfinin indexini bulalim
        int ilkindex=str3.indexOf('a');
        System.out.println(str3.indexOf('a', ilkindex+1));









    }
}
