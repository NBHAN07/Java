package Day17_forLoop;

public class C04_1030arasisayilar {
    public static void main(String[] args) {
        //10 ve 30 dahil arasindaki sayilari aralarinda virgülle ayni satirda yazdir

        for (int i = 10; i <=29; i++) {
            System.out.print(i+",");
            }

        System.out.println(30);

        //kullanicidan alirsak sayilari, yan daha dinamik seyler

        int baslangic=10;
        int bitis=30;

        for (int i = baslangic; i <=bitis; i++) {
            if (i<bitis){
                System.out.print(i+",");
            }
            else {
                System.out.println(i);
            }

        }




        }


    }

