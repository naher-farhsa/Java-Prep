package javaprep.collectionframework.list;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(5);
        ArrayList<Integer> al2=new ArrayList<>();
        al1.add(101);
        al1.add(102);
        al1.add(103);
        al1.add(104);
        al1.add(105);
        al2.add(201);
        al2.add(301);
        al2.add(401);
        al2.add(501);
        al2.add(104);
        al1.addAll(al2);
        System.out.println(al1.hashCode());
        System.out.println(al2.hashCode());
        System.out.println(al1.isEmpty());
        System.out.println(al1.indexOf(201));
        System.out.println(al1.indexOf(107));
        System.out.println(al1.lastIndexOf(104));
        for (int i=0;i<al1.size();i++){
           System.out.print(al1.get(i));
            System.out.print(",");
        }
    }

}
