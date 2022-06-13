package Day33_varargs_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java cok kizel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println("sb1 lenght: " + sb1.length());//0
        System.out.println("sb1 capacity: "+ sb1.capacity());//16

        System.out.println("sb2 lenght: " + sb2.length());//14
        System.out.println("sb2 capacity: "+ sb2.capacity());//30

        System.out.println("sb3 lenght: " + sb3.length());//0
        System.out.println("sb3 capacity: "+ sb3.capacity());//10

        //append methodu ile sb'e ekleme yapabiliriz

        sb1.append("java").append(" ").append("cok").append(" ").append("guzel");

        System.out.println("sb1 lenght: " + sb1.length());//14
        System.out.println("sb1 capacity: "+ sb1.capacity());//16

        sb1.append(3);
        System.out.println(sb1);//java cok guzel3
        sb1.append(true);
        System.out.println(sb1);//java cok guzel3true

        System.out.println("sb1 lenght: " + sb1.length());//19
        System.out.println("sb1 capacity: "+ sb1.capacity());//34 , eski kapasitenin 2 katinin 2 fazlasi,
        // ama cok onemli degil

        //fazla kapasiteye ihtiyac yok deersek bu ikisini esitleyebiliriz trimToSize ile

        sb1.trimToSize();
        System.out.println("sb1 lenght: " + sb1.length());//19
        System.out.println("sb1 capacity: "+ sb1.capacity());//19





    }
}
