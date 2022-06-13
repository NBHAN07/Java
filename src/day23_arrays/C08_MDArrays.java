package day23_arrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        //MDA nin ic arraylerinin son elemanlarinin carpimini yazdiran bir program
        //{{1,2,3},{4,5},{6}}

        int arr[][]={{1,2,3}, {4,5}, {6}};
        int carpim=1;

        for (int i = 0; i < arr.length ; i++) {
            carpim *= arr[i][arr[i].length-1];

        }



        System.out.println("son elemanlarin carpimi: " + carpim);



    }
}
