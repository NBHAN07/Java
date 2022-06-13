package tekrarNBH;

import java.util.Scanner;

public class ternaryOperator_ifElseinKisasi {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi al ve tek mi cift mi yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2 ==0){
            System.out.println("cift");
        } else if (sayi%2 != 0){
            System.out.println("tek");
        }

        System.out.println(sayi%2==0 ? "cift":"tek");//ternary







    }
}
