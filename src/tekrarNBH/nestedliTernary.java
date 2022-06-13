package tekrarNBH;

public class nestedliTernary {
    public static void main(String[] args) {
        // verilen sayinin pozitif mi negatif mi old. kontrol edip
        //poz. ise tek veya cift
        //negatif ise -100den kücük büyük
        //old. belirleyen bir ternary yaz

        int sayi=-198;

        System.out.println(sayi>0 ? (sayi%2==0? "sayi cift":"sayi tek" ):(sayi<=-100? "-100 den kücük" : "-100den büyük"));



        //hoocanin cözümü

        String sonuc= sayi>=0? (sayi%2==0? "sayi cift":"sayi tek"):
                (sayi<=-100? "-100 den kücük" : "-100den büyük");
        System.out.println(sonuc);








    }
}
