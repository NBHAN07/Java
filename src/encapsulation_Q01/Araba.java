package encapsulation_Q01;

public class Araba {//POJO. planning old java object---> modal class

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba(int motor, int yil) {//2 p.li const.
        //this.motor = motor;
        //this.yil = yil;
        setMotor(motor);
        setYil(yil);
    }

    @Override
    public String toString() { //bu method bu class da create edilen objeleri
        // stringe cevirir ve direkt yazdirmamizi saglar
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }

    public Araba(){//p. siz cons.

    }

    public Araba(String model, String renk, int motor, int yil) { //p.li cons.
        this.model = model;
        this.renk = renk;
        //this.motor = motor;
        //this.yil = yil;

        setMotor(motor);
        setYil(yil);

        //cons. obj. create etmek icin parametre olarak girilen
        //motor datasi setMotor() methoduna parametre
        //olarak calisti degerini aldi
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor<1000){
            System.out.println("1000 cc den dusuk guzte motor olmamali");
            this.motor=500+motor;
        }else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil<0){

            this.yil=-1*yil;

            System.out.println("milattan once araba icat edilmemisti :)");
        }

    }
}
