package LIst_vs_Set.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map {
    public static void main(String[] args) {

        HashMap<Integer,String> hsm = new HashMap();   // <Integer,String> provide "generics" Generics allow you to define classes, interfaces, and methods with placeholder types that can be specified later. This provides stronger type-checking at compile time and eliminates the need for typecasting.

        hsm.put(201,"Ajinkya");
        hsm.put(202,"Rahane");
        hsm.put(203,"legend");
        hsm.put(204,"cricketer");

        System.out.println(hsm);


        // values reterives by using generics
        for (Map.Entry me : hsm.entrySet())
        {
            System.out.println(me.getKey() + " --> "+ me.getValue() );
        }

//        Set st = hsm.entrySet();  // entrySet method belongs to SET interface and return the value in set

//        System.out.println(st);  // return the value in Set [201=Ajinkya, 202=Rahane, 203=legend, 204=cricketer]

//        Iterator itr = st.iterator();
//        while (itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }




    }
}
