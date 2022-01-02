package 集合.Arraylist和Linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*
两者底层的数据结构不相同
 */
public class demo {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        LinkedList<Integer> l = new LinkedList<>();

        for(int i=0;i<3;i++){
            a.add(i);
        }

        for(int i=3;i<6;i++){
            l.add(i);
        }
        Iterator<Integer> it_a = a.iterator();
        Iterator<Integer> it_l = l.iterator();

        System.out.println("Arraylist");
        while (it_a.hasNext()){
            System.out.println(it_a.next());
        }
        System.out.println("Linkedlist");
        while (it_l.hasNext()){
            System.out.println(it_l.next());
        }
    }

}
