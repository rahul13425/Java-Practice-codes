package LIst_vs_Set.MAP;

import java.util.HashMap;
import java.util.Map;

public class Map_demo {

    public static void main(String[] args) {

        Map map = new HashMap();

        // not follow the inseration and sorting order
        map.put(101,"Rahul");
        map.put(102,"kumar");
        map.put(103,"TX");
        map.put(null,null);  // we can't provide multiple null value in key but provide in values
        map.put(null,"ok");

        System.out.println(map.containsValue("RAhul"));

        System.out.println(map.get(102));  // particular value according to key show

//        System.out.println(map.remove(102));  // to remove element

        System.out.println(map.replace(101,"Rahul","RAHULKUMAR"));


        System.out.println(map.size());
        map.put(102,"singh");  // not print duplicate value but replace the value with the old one like kumar replace with singh

        System.out.println(map);


    }
}
