package Day29;

public class C02_staticKeyword {
    public static void main(String[] args) {
        //baska class daki static class uyelerine
        //ulasabilmek icin sadece clasIsmi.statikUyeIsmi
        //yazmamiz yeterlidir

        System.out.println(C01_Static.okulTelefonu);//123456789

        C01_Static.okulTelefonu="987654321";
        //bu degisiklik java durana kadar kalici artik

        System.out.println(C01_Static.okulTelefonu);//987654321

        //baska class daki static olmayan clas uyelerine ancak
        // o clas dan obje olusturarak ulasabiliriz
        //ve obje ile yapilan atamalar sadece o obje icin
        //gecerli olur

        C01_Static obj1=new C01_Static();
        C01_Static obj2=new C01_Static();

        System.out.println(obj2.okulIsmi);//yildiz koleji
        obj2.okulIsmi="sabir koleji";
        System.out.println(obj1.okulIsmi);//yildiz koleji





    }
}
