package Day33_varargs_StringBuilder;

import java.util.Locale;

public class C04_StringBuilder {
    public static void main(String[] args) {

       StringBuilder sb1=new StringBuilder("yasasin java");

        System.out.println(sb1.indexOf("java"));//8

        System.out.println(sb1.lastIndexOf("s"));//4 , sondan s

        System.out.println(sb1.replace(0,7,"ne guzel"));//ne guzel java

        System.out.println(sb1);//ne guzel java. // string olsaydi yasasin java yazacakti

        System.out.println(sb1.toString().toUpperCase());//NE GUZEL JAVA

        System.out.println(sb1);//ne guzel java
        // toString kullanarak stringe cevirdigimiz icin artik degisiklikler kalici degil

        System.out.println(sb1.delete(0,3));//guzel java
        System.out.println(sb1.deleteCharAt(5));//guzeljava





    }
}
