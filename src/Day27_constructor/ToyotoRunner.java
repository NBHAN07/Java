package Day27_constructor;

public class ToyotoRunner {
    public static void main(String[] args) {
        Toyota t1= new Toyota();
        System.out.println(t1.marka); //toyota
        System.out.println(t1.tekerAdedi); //4
        System.out.println(t1.model); //null . herhangi bir deger atamadigimiz icin
        //ki bunlar instead variable lar o yuzden null yazdirir
        t1.model="corolla";
        t1.yakit="benzin";
        t1.yil=2022;
        System.out.println("t1: "+ t1.motoruVarMi+" "+ t1.marka+" "+t1.model+ " "+ t1.yakit+ " "+t1.yil);
        t1.maxHiz();

        Toyota t2=new Toyota();
        System.out.println(t2.model);
        t2.model="yaris";
        t2.yakit="dizel";
        t2.yil=2050;
        System.out.println("t2: "+ t2.motoruVarMi+" "+ t2.marka+" "+t2.model+ " "+ t2.yakit+ " "+t2.yil);
        t2.renkTercihi();
    }
}
