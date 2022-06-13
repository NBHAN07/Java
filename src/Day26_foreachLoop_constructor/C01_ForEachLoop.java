package Day26_foreachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        //elementleri forloop ile yazdiralim

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" "); // 2 4 6 8 11

        }
        System.out.println(" ");

        //bunu for each loop ile yapalim
        //for-each loop u calistirmak icin hedef bir collection vermeliyiz

        for (int each: arr) {
            System.out.print(each+" ");
            
        }

        //avantaji: index, baslangic degeri, bitis degeri gibi detaylarla
        //ugrasmamiza gerek kalmadan colections'tan tum elementleri bize getirir
        //dezavantaji indexe bagli islem yapamayiz


    }
}
