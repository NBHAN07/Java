package zeyneptekrar;

public class zynp20 {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        if (a == b) {
            System.out.println("verilen sayilar esit");
        }
        if (a > 100) {
            System.out.println("a yuzden buyuk");
        }
        if (a * b > 1) {
            System.out.println("sayilarin carpimi 5 ten buyuk");
        }
        // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklidir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin body calisabilecegi gibi
        //  hicbirisinin body'si calismayada bilir

        int c=10;
        int d= 20;
        if (c>d && b<100){
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisir");
        }
        if (c<0)
            System.out.println("suslu parantez olmazsa sadece bir satir calisir");
        // bir if cumlesinin daha anlasilir olmasini istiyorsaniz
        // if body'sini {} icine yazmalisiniz
        // body'yi {} icine yazmazsak da if cumlesi calisir
        // ancak ilk ; gordugunde if cumlesi bitmis olur
        // 24.satirdaki kod 15.satirdaki if dogru olsada calisir false olsa da calisir
        System.out.println("2.satir calisti");



    }
}
