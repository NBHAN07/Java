package Day17_forLoop;

public class C06_ikiHarfinArasiniYazdirma {
    public static void main(String[] args) {
        //verilen iki harf arasini yazdiralim

        char harf1='m';
        char harf2='t';
        //string degil char almamizin sebebi stringlerde harfler arasinda ilerleyememem
        //char ascii kullandigi icin gidebilirim ama

        for (char i = harf1; i <= harf2 ; i++) {
            System.out.print(i+ " ");

        }


        double baslangic=10;
        double bitis=20;
        double artis=0.2;

        //baslangic ve bitis arasini artis miktarina göre alip tam sayilari yazdir

        for (double i = baslangic; i <= bitis ; i+=artis) {

                System.out.print(i+ " ");
            }

        } //tam sayi dedi ama ona göre yapmadi ben de tam sayiya gore yazdiramadim








    }

