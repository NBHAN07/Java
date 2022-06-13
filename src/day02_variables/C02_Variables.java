package day02_variables;

public class C02_Variables {

    public static void main(String[] args) {

        // Java çalışmaya main methot'dan başlar
        // sonra yukarıdan asagı, soldan saga dogru calisir
        // eger istersek bir veriable'i once declare edip sonra deger atayabiliriz

        String okulIsmi;

        // Java deger ataması yapmadığımız bir variable oluşturmamıza itiraz etmez
        // ancak deger ataması yapıncaya kadar o veriable'yi kullanmamıza izin vermez

        okulIsmi="Yıldız Koleji";
        System.out.println(okulIsmi); // yildiz Koleji
        okulIsmi="Star Koleji";
        System.out.println(okulIsmi); // Star koleji

        okulIsmi="Java koleji";

        // println ile print arasındaki fark
        //println dediginizde yazdırma isleminden sonra alt satıra gecerken
        // sadece print dersen gecmez

        System.out.println(okulIsmi); // Java koleji


    }
}
