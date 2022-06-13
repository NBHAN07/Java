package tekrarNBH;

public class equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali" + " Can";

        String str3=str1+"";

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        System.out.println("== ile karsilastir: "+ (str1==str2)); //true
        System.out.println("equals ile karsilastir: " + str1.equals(str2));//true

        System.out.println("str3: " + str3);
        System.out.println("== ile karsilastir: "+ (str3==str2));//false
        System.out.println("equals ile karsilastir: " + str3.equals(str2));//true

        String str4="hasan";
        String str5="HASAN";
        System.out.println(str4.equals(str5)); // false
        System.out.println(str4.toUpperCase().equals(str5)); //true










    }
}
