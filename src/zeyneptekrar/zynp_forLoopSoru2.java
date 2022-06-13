package zeyneptekrar;

public class zynp_forLoopSoru2 {

    public static void main(String[] args) {

        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin


        for (int i = 10; i <=29; i++) { //eger 30 yaarsak 30un yanina da virgul koyar
            System.out.print(i +", "); // 29a kadar yazdirip manuel olarak loop bodysinin sonuna soutla 30 da yazdirabilir.

        }
        System.out.println(30 );
         // body bitimine 30 soutla yazdirilabilir yani buraya






        int baslangic=10; // bunu 15
        int bitis=30; // bunu 15 yaparsam ve calistirisam yine virgul son sayidan sonra olmaz yani dinamik olur

        for (int i = baslangic; i <= bitis ; i++) {

            if (i<bitis){
                System.out.print(i+ ", ");
            }else {
                System.out.print(i);
            }

        }

    }
}
