package javaprep.collectionframework.set;
import java.util.*;
public class Hashset {
    public static void main(String[] args) {

     HashSet<Integer> hs1=new HashSet<>();
     HashSet<Integer> hs2=new HashSet<>();
        hs1.add(101);
        hs1.add(202);
        hs1.add(303);
        hs1.add(404);
        hs1.add(505);
        hs2.add(1001);
        hs2.add(1002);
        hs2.add(1003);
        hs2.add(1004);
        hs2.add(1005);
         hs1.addAll(hs2);
        hs1.remove(303);
        /*Hashset doesn't follow any order/sequence to store element
          Treeset follows the order element get stored
         */
        Object []arr=hs1.toArray();
        for (Object e:arr) {
            System.out.println(e);

        }

    }
}
