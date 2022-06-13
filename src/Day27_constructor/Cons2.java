package Day27_constructor;

public class Cons2 {
    public static void main(String[] args) {

        Cons1 obj1= new Cons1(); //default constructor devrede
        /*
        Cons1 class inda hic constructor olusturmazsak
        java default constructor kullandigindan obj1'i uretebiliriz

        ancak biz parametreli veya parametresiz bir constructor yazdigimizda
        java default constructor i siler

        dolayisiyla biz herhangi bir constructor olusturdugumuzda
        daha once baska classlar veya kullanicilarin olusturmus olabilecegi objeleri
        kullanabilmeleri icin default c. in isini yapacak parametresiz bir constructor olusturmaliyiz

         */

        Cons1 obj2=new Cons1("java");


    }


}
