package Day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arb1= new Volvo();
        System.out.println(arb1.marka);//volvo
        arb1.yakit="dizel";
        arb1.elektrikliMi=false;
        System.out.println(arb1.maxHiz);//240
        System.out.println(arb1.toString());

        Volvo arb2=new Volvo();
        arb2.yakit="elektrikli";
        arb2.elektrikliMi=true;
        arb2.model="XC90";
        System.out.println(arb2.toString());

        Volvo arb3=new Volvo("volvok",true,2022,"elektrik");
        System.out.println(arb3);//model : volvok yakit : elektrik max hiz: 160


    }
}
