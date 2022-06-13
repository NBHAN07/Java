package Day27_constructor;

public class Z {

    String isim;
    String soyIsim;
    int numara;
    boolean gercekMi;

    public Z(String ism, String soyism, int no, boolean grckmi) {
        isim=ism;
        soyIsim=soyism;
        numara=no;
        gercekMi=grckmi;
    }

    public Z(String isim, String soyIsim, int numara) {
        this.isim=isim;
        this.soyIsim=soyIsim;
        this.numara=numara; //karisiklik olmasin diye verilen isimleri birbirine esit olusturursam
        //java once locale bakacagi icin buradaki "ayni" iki ismi birbirine esditledigimi sanir
        //farki anlamasi icin basina .this demeliyiz
        //o this bizi yukaridaki isme goturur

    }


    public String toString(){

        return ("isim: "+ isim+ ", soyisim: "+ soyIsim+
                ", numara: "+numara+", gercekmi: "+ gercekMi );

    }
}
