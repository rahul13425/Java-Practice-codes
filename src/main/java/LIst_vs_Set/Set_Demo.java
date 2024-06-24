package LIst_vs_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Demo {

    public static void main(String[] args) {


        Set s = new HashSet();

        //this not folow the inseration order
        s.add(100);
        s.add(200);
        s.add(55);
        s.add(100); // Duplicate value not allowed

        s.add(null);  // only one null value allow
        s.add(null);

        System.out.println(s);

        // Iterate element get data in forward direction one by one

        Iterator itr2 = s.iterator();

        while (itr2.hasNext())
        {
            System.out.println(itr2.next());
        }
    }
}
