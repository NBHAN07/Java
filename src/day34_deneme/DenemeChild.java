package day34_deneme;

import day34_accessModifier_encapsulation.C01;

public class DenemeChild extends C01 {
    public static void main(String[] args) {

        System.out.println(halkaAcikSayi);//15
        halkaAcikSayi=30;
        System.out.println(halkaAcikSayi);//30

        C01.aileyeOzel=25;//protected oldugu icin ve biz de cocugu oldugumuz icin alabildik

        aileyeOzel=5;
        System.out.println(aileyeOzel);
    }
}
