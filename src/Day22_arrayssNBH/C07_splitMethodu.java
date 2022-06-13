package Day22_arrayssNBH;

import java.util.Arrays;

public class C07_splitMethodu {
    public static void main(String[] args) {
        //bir stringi nasil array e ceviririz

        String str="Java gun gectikce guzelleşiyor";

        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Java, gun, gectikce, guzelleşiyor]

        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));//[Java gun ,  guzelleşiyor] iki bosluk olmasinin
        // sebebi hem metinde bosluk olmasi hem de metodun kendisi bir bosluk kullanmasi

        String harfler[]=str.split(""); //hiclik kullaniyoruz ki harfler arasindaki boslugu kullansin
        System.out.println(Arrays.toString(harfler));// [J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, ş, i, y, o, r]
        //bosluklari da karakter olarak aliyor. virgül olsa onu da ayri karakter olarak alirdi











    }
}
