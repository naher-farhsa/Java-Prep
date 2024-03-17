package javaprep.collectionframework.map;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<>();
      // In Hashmap (key) must be unique but value need not.
        hm.put("i",1001);
        hm.put("ii",1002);
        hm.put("iii",1003);
        hm.put("iv",1004);
        hm.put("v",1005);
        hm.put("vi",1002);
        System.out.println(hm);
        System.out.println(hm.get("v"));
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        for (String key:hm.keySet()){
            System.out.println("key: "+key+" Value: "+hm.get(key));
        }
    }
}
