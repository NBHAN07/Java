package day36_inheritance;

public class Child extends Parent{

     Child(){
        super(); //gormuyoruz bunu
        System.out.println("child const. calisti");
    }

    //tum class larda biz gormesek bile
    //javanin olusturdugu default consr. vardir

    //extends keyworda sahip classlardaki tum const. larin ilk satirinda
    //biz gormesek de super()
    //constr. call vardir
    //yani parent class in parametresiz const. call

    public static void main(String[] args) {
        Child child=new Child();

    }

}

