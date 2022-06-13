package Day29;

public class C01_Static {


    String okulIsmi="yildiz koleji";
    static String okulTelefonu="123456789";

    public static void staticMethod(){
        System.out.println("static method calisti");
    }
    public void staticOlmayanMethod() {
            System.out.println("static olmayan method calisti");

            System.out.println(okulTelefonu);
        }
    }

