package zeyneptekrar;

public class zynp_scope{

    int sayi;
    String bransIsmi= "java";
    boolean okuldaMi;

    public static void main(String[] args) {

        // sayi=10 sayi verablei static olmadigi icin main method dan direk kullanilmaz
        // intance variablelara static methodlardan ulasabilmek icin obje olusturmamiz gerekir

        zynp_scope obj1=new zynp_scope();
        System.out.println(obj1.sayi); // 0 deger atamadik
        obj1.sayi=10; // direk sayiya atama yapamayiz yanina obj1 eklememiz gerekir
        System.out.println(obj1.sayi);  // atama oldugu icin 10 yazar
        obj1.bransIsmi="sql";
        System.out.println(obj1.okuldaMi); // false


        zynp_scope obj2= new zynp_scope();
        System.out.println(obj2.sayi);  //0
        System.out.println(obj2.bransIsmi); // ilk basta kendi sütünuna bakar sonra class methoduna gider

        obj1.okuldaMi= true;
        System.out.println(obj2.okuldaMi);

    }
}
