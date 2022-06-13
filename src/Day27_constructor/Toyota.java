package Day27_constructor;

public class Toyota {
    String marka="toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){
        if (yakit.equals("benzin")){
            System.out.println("benzinli araclar max 230 km hiz yabilir");
        }else if (yakit.equals("dizel")){
            System.out.println("dizel araclar max 290 km hiz yabilir");
        }
    }
    public void renkTercihi(){
        if (model.equals("corolla")){
            System.out.println("kirmizi ve yesil secebilirsiniz");
        }else if (model.equals("yaris")){
            System.out.println("mavi, siyah ve beyaz secebilirsiniz");
        }
    }

    }

