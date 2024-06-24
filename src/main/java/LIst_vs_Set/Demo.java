package LIst_vs_Set;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Rahul");
        al.add(10);
        al.add(true);
//

        HashSet hs = new HashSet();

        hs.add("kumar");
        hs.add('D');
        hs.add(989.9);
       hs.addAll(al);  // add all the lements of al in hs
//        al.addAll(hs);


        System.out.println(hs);


    }



}
