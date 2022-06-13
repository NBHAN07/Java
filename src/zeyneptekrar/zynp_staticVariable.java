package zeyneptekrar;

public class zynp_staticVariable {

    static String okulIsmi= "yildiz koleji";
    static int okulNo;
    static  boolean okulAcikMi;
    // instance variabellar objeye bagimlidir ve her obje farkli degerler alabilir
    // ogrenci notlari ve ogretmen branslari gibi
    // bir objete ait bir vareabilenin son degerini bulmak icin sadece o objeyi dikkate aliriz


    // static veriabeler ise class variable olarak tanimlanir
    //ve tüm class uyeleri icin aynidir okul ismi okul mudurunun adi gibi
    // eger static vaeriablein degeri


    public static void main(String[] args) {
        System.out.println(okulIsmi);// "yildiz koleji";
        System.out.println(okulNo);//0
        okulNo=102;
        System.out.println(okulNo); //102
        System.out.println(okulAcikMi);// false


        staticMethod(); // 200 de ekranda gozukur

        System.out.println(okulNo);

    }

    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo);//200

    }


}

