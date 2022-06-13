package tekrarNBH;

public class wrapperClass {
    public static void main(String[] args) {

        String str="Java";
        int sayi1=10;

        System.out.println(str.toUpperCase()); //JAVA

        double sayi2=20.5;

        Double sayi3=15.2;

               // sayi3. dersek artik bircok method gelir.

        short sayi4=20;
        Short sayi5=30;

        sayi4=sayi5; // wrapper class ile aynı isimdeki primitive data türleri arasındaki geçişi java kabul eder

        System.out.println(sayi4); //30

        System.out.println(Short.MAX_VALUE); // short en fazla kaç olur bunu gösterir

        System.out.println(Short.MIN_VALUE); // min kac olur bunu gösterir

        System.out.println(Short.BYTES); // kac byte. 2 gösterir






















    }
}
