package Day27_constructor;

public class Volvo {
    String marka="volvo";
    String mensei="isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean  otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgusu();

    }

    public Volvo(){
        //parametreli olusturdugum icin parametresiz olusturmak zorunda kaldim
    }

    public int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        } else {
            maxHiz=240;
        }
        return maxHiz;
    }


    private boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if (elektrikliMi){
           sonuc=true;
        } else {
            sonuc=false;
        }
        return sonuc;
    }

    public String toString(){
        String ortakArabaOzellikleri="model : " + model+
                                     " yakit : " + yakit+
                                     " max hiz: " + maxHiz;
        //artik ortak ozellikler icin tek tek yazmamiza gerek yok
        //sadece bu methodu calistirmamiz yeterli olur


        return ortakArabaOzellikleri;
    }

}
