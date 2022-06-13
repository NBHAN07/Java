package Day26_foreachLoop_constructor;

public class Araba {
    /* java da her class olusturdugumuzda
    java o class dan ileride objeler uretmek gerekecegini bilir
    biz ozellikle belirtmesek de
    java her olusturulan class a bir constructor koyar
.
    javanin class olustururken olusturdugu constructor a DEFAULT CONSTRUCTOR denir
    ve bu gorunmez

    eger biz gorunur bir c. olsun istersek default c. ile ayni gorevi yapan bir c. olusturabiliriz
    veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
    farkli ozelliklerde c. da olusturabiliriz

    c.lari birbirinden farklilastiran tek ayricalik
    kullanilan parametre sayisi ve data turudur
     */

    public Araba(){

        System.out.println("parametresiz constructor calisti ");
    }
    /*
    bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
    iki seye dikkat etmelisiniz
    1-Constructor larin ismi class ismi ile ayni olmak zorundadir, buyuk harfle baslar
    2-Constructorlarin return type i olmaz
     */

    public Araba(String renk) {
        System.out.println(renk+ " renk araba uretildi");

    }
    public Araba(int yil){

        System.out.println(yil+" model araba uretildi");
    }
    public Araba(String renk,int yil){

        System.out.println(renk+" renk ve "+ yil+" model araba uretildi");
    }


}
