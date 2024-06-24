package LIst_vs_Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Demo {

    //** Arraylist & linked list are the implimented classes of Set interface

    public static void main(String[] args) {

      //this is folow the inseration order
        List l = new ArrayList();
        l.add(10);
        l.add(0,20);
        l.add(1,30);
        l.add(10);  // Duplicate value allow
        l.add(1,30);
        l.addFirst("first");
        l.addLast("last");

        // Multiple null values allow
        l.add(null);
        l.add(null);

        //        l.add(4,40);  // showing error because index 2,3 are vacant so, we can't jump to 4
                 System.out.println(l);

        //**Iterate element get data in forward direction one by one


        //ListIterate element get data in forward & backward both direction(as per choice) one by one
       ListIterator itr = l.listIterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("-----------------------------------------------------");


        while (itr.hasPrevious())  //has previous method use for get data in back word direction
        {
            System.out.println(itr.previous());
        }
    }
}
