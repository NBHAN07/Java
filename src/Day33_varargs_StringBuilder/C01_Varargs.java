package Day33_varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        //kac tane string verilirse verilsin
        //içlerinden en uzun olani yazdiran bir method olusturun

        String str1="ali";
        String str2="veli";
        String str3="oguzhan";
        String str4="samet";

        /*
        Yazilan argument sayisi sabitse her zamanki gibi bir method olusturabiliriz
        ancak argument sayisinin degisme ihtimali varsa
        o zaman varargs tercih edilir
         */


        enUzunKelime(str1,str2,str3);
    }

    private static void enUzunKelime(String... str) {
        String enUzunStr="";

        for (String each: str
             ) {
            if (enUzunStr.length()<each.length()){
            enUzunStr=each;
            }
        }
        System.out.println("en uzun kelime: "+enUzunStr);

    }
}
