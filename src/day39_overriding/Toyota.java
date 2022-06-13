package day39_overriding;

public class Toyota extends Araba{
    protected  String hiz="toyota max 220 hiz  yapar";
    protected String sirketMerkezi="Japonya";
    protected  String marka="toyota";


    public void motor(){
        System.out.println("Toyota arabalar toyota marka motor kullanirlar");

    }

    public void garanti(){
        System.out.println("toyota arabalar 10 yil garantilidir");

    }
}
