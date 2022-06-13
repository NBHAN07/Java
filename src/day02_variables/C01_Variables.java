package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        //bir variable olustururken icerisine koyacagımız datanın alabilecegi degerlere uygun
        // bir data turu secmeliyiz
        // örneğin bir şehrin nufusundan bahsediyorsak
        // variable'imizin data türü String, boolean, char veya double olmaz
        // geriye kalan tam sayı türlerinden şehrin nüfusunu içine alabilcek büyüklükte bir data türü seçebiliriz
        // biz kurs boyunca genelde tam sayılar için int, ondalıklı sayıllar için double kullanacağız

        System.out.println("Hello world yazan javayı halleder");

        int level=1;

        System.out.println(level);

        boolean ogrenciMi= true;

        boolean yagisVarMi = false;

        System.out.println(ogrenciMi);

        char ozelSembol= '2';
        char sayi='&';

        System.out.println(sayi);



    }
}
