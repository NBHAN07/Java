package Day17_forLoop;

public class C07_katlaraGoreKelimeYazdirma {
    public static void main(String[] args) {
        //soru6) interview question: 100'den kucuk bir tam sayi isteyin.
        // 1'den baslayarak girilen tüm sayilari yazdir ancak
        //-sayi 3 un kati ise sayi yerine "Java" yazdirin
        //-sayi 5 in kati ise "guzeldir" yazdirin
        //-sayi hem 3 ün hem 5 in kati ise "Java Guzeldir" yazdirin

        int sayi=15;

        for (int i = 1; i <=sayi ; i++) {

            if (i%3== 0 && i%5==0){
                System.out.print("Java Guzeldir ");
            }
            else if (i%3==0){
                System.out.print("Java ");

            } else if (i%5==0){
                System.out.print("guzeldir ");

            } else {
                System.out.print(i + " ");
            }
        }
    }
}
