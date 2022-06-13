package day39_overriding;

public class Araba {

    protected  String hiz="arabalar motor gucune gore hiz yaparlar";
    protected String yakit="arabalar farkli yakitlar kullanabilir";
    protected  String marka="arabalar uretildikleri markaya sahiptir";
    protected String hareket="adeta bir ordek gibi yuruyebilezeiim";


    public void motor(){
        System.out.println("arabalar farkli markalarda motor kullanirlar");

    }

    public void yakitTuketimi(){
        System.out.println("arabalar motor gucune ve yakit turune gore yakit kullanirlar");

    }
}

