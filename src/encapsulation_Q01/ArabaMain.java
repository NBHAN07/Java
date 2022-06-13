package encapsulation_Q01;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda=new Araba();// p.siz obje create edildi
        honda.setModel("accord");
        honda.setYil(2018);
        honda.setMotor(1600);
        honda.setRenk("kirmizi");
        Araba toyota=new Araba("avensis","beyaz",500,-2020);// p.li obje create edildi
        Araba volvo=new Araba("s80","füme",2400,2010);// p.li obje create edildi
        Araba haciMurat=new Araba(1200,1974);

        System.out.println("honda: "+honda); // toString metodu olmzsa bu obje referans degeri print eder
        System.out.println("volvo: "+volvo); //pojo da toString yaptik oyuzden artik yazdiriyor
        System.out.println("sectiginiz arac modeli :" + toyota.getModel()+" rengi: "+ toyota.getRenk()+
                " yili: "+ toyota.getYil()+" motoru: "+ toyota.getMotor());

    }
}
