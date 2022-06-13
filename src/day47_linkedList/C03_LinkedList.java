package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();

        System.out.println(ll1.peek());//bosken kullanirsak null dondurur

       // System.out.println(ll1.element());//bosken kullanirsak exception firlatir

        System.out.println(ll1.poll());//bosken kullanirsak null dondurur
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

        //System.out.println(ll1.pop());//ilk elementi silip dondurur
        //ilk elementi bulamazsa exceptio firlatir

        ll1.push(30);// listenin basina element ekler
        ll1.push(20);
        System.out.println(ll1);

        System.out.println(ll1.remove()); //ilk elementi siler ve bize dondurur

        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);//object olarak 50 yi siler. index olarak degil (listte index i alirdi)
        ll1.push(30);
        System.out.println(ll1);
        ll1.removeLastOccurrence(30);//sondaki 30 u sildi
        System.out.println(ll1);
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);











    }
}
