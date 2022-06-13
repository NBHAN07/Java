package tekrarNBH;

public class concat {
    public static void main(String[] args) {

        //concatenation yapmak için iki ihtimalimiz var
        //istersek daha önce yaptıgımız gibi + metodunu kullanabilirz
        //veya string class indan gelen concat methodunu kullanabiliriz

        String str1= "Java";
        String str2= "Candir";

        // Java Candir yazdiralim

        System.out.println(str1 +""+ str2);

        String cumle=str1.concat(str2); //JavaCandir
        String cumle2=str1.concat("").concat(str2); //Java Candir

        //concat data türü icine string ister. string harici bir sey yazdıgında onu stringlestirmen gerekir













    }
}
