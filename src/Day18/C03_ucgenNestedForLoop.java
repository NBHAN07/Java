package Day18;

public class C03_ucgenNestedForLoop {
    public static void main(String[] args) {
        //kullanicidan bir rakam isteyin ve o rakama gore su sekli yazdirin
        //*
        //**
        //***
        //****

        int input= 5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
                //nested for loop ya kare ya dıkdortgen
                //ya da ucgen
                //d.dortgen istedigimizde iki loop icin de bagimsiz end point belirleriz
                //ucgen sekil vermek icin inner loopun end poimnt olarak outer degiskene bagli yapariz

            }

            System.out.println(" ");

        }










    }
}
