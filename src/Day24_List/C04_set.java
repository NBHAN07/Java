package Day24_List;

import java.util.ArrayList;
import java.util.List;

public class C04_set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("nur");
        isimler.add("betul");
        isimler.add("han");
        isimler.add("kurt");
        System.out.println(isimler);

        isimler.set(3,"sarp"); //bize kurt u dondurur
        System.out.println(isimler);//[nur, betul, han, sarp]

        // daha once de listede var olanlari arsiv gibi tutmak istersek

        List<String> logListesi=new ArrayList<>();
        logListesi.add(isimler.set(2,"Cosmos"));
        System.out.println(isimler);
        System.out.println(logListesi);


    }
}
