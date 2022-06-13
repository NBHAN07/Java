package Day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //her obje olusturdugumuzda model yakit gibi degerlere
        // atama yapmak istemiyorsak

        Volvo arb1=new Volvo("Xc90", false, 2023, "benzin");
        System.out.println(arb1.toString());//model : Xc90 yakit : benzin max hiz: 240
        System.out.println(arb1);//  metodun adini toString koyarsak sadece arb1 yazmak yetiyor yazdirmak icin

    }
}
