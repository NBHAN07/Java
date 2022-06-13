package Day22_arrayssNBH;

public class C05_BinarySearch {
    public static void main(String[] args) {

        //verilen arrayde istenen bir elementin  var olup olmadigini true false olarak yazdiran method


        int arr[] = {3, 6, 5, 9, 45, 25, 1};
        int istenenSayii=8;

        ıstenenElemaninVarligi(arr,istenenSayii);




    }

    public static void ıstenenElemaninVarligi(int[] arr, int istenenSayii) {
        
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenSayii){
                sonuc=true;
                break;
            }
            
        }
        System.out.println(sonuc);
    }
}
