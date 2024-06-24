package collections;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);  //add method  is used to add value in collection object
        al.add(0, "Rahul");
        al.add(1, "kumar");
        al.add("Rahul");

        System.out.println(al.add("me"));  // to check me is added the it show the output true , otherwise false
        System.out.println(al);

        System.out.println(al.contains("Rahul"));// contains check for that particular object present in the al(object) or not if yes it print true else false
        System.out.println(al.containsAll(al));   // conatinall is to check the collection objects

        System.out.println(al.isEmpty());// to check al object is empty or not if yes print true else false

        System.out.println(al.size());  // to check the size of the al object

        System.out.println(al.remove(0));
        System.out.println(al);




        ArrayList al2 = new ArrayList();
        al2.add("TX");
        // we add all the elements of al2 object  in al object by using addall method
        al.addAll(al2);   // add all used for add collection object in other collection object
        System.out.println(al);  // print all to see all the al2 element add in al

        al.removeAll(al2);  // remove the al2 object in al object collection
        System.out.println(al);


        //** clear method use to clear all the object (empty collection )it doesn't return anything (return void)



        HashSet hs = new HashSet();
        hs.add("ok done");
        hs.add(24);
        al.addAll(hs);

        System.out.println(hs);
        // create refrence variable of interfaces (List , Set)

        List l = new ArrayList();
        l.add("List");

        System.out.println(l);

        Set t = new HashSet();
        t.add("Set");

        System.out.println(t);
        // Map elements

        HashMap hm = new HashMap();
        hm.put(101, "singh");  // Put method  is used to add value in collection object

        System.out.println(hm);


    }
}
