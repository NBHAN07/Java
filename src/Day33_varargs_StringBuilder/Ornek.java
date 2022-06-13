package Day33_varargs_StringBuilder;

public class Ornek {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();

        sb1.append("aaa").insert(1,"bb").insert(4,"ccc");
        System.out.println(sb1);

    }
}
