package day20_scope;

public class C02_Static {
    /*
    instance variable lar objeye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari ve ogretme branslari gibi
    bir objeye ait bir variable nin son degerini bulmak icin sadece o objeyi dikkate aliriz

    static variablelar ise class variable olarak tanimlanir
    ve tüm class üyeleri icin aynidir
    okul ismi, okul müdürünün addi gibi
    eger static variablenin degeri degistirilirse herkes icin degisir

     */

    static String okulismi="yildiz koleji";
    static int okulNo;
    static boolean okulAcikMi;
    public static void main(String[] args) {

        System.out.println(okulismi); //yildiz koleji
        System.out.println(okulNo); //0 ; default degeri
        okulNo=585;
        System.out.println(okulNo); //585
        System.out.println(okulAcikMi);// false

        staticMethod(); //bunu cagirmazsam alttaki method calismaz

    }
    public static void staticMethod (){

        okulNo=200;
        System.out.println(okulNo);//200
    }
}
