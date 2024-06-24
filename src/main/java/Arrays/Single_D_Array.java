package Arrays;

public class Single_D_Array {

    public static void main(String[] args) {

//        int[] a;  // Declaration
//        a= new int[3];   // creation , size declare is must during creation

//        int [] a= new int[3];  // Declartion + cration in one line

//        a[0]= 10;  // initalization of array
//        a[1]= 20;
//        a[2]= 30;

        int[] a = {10,20,30,40,30};  // Declare, create, and initialize an integer array in one line



        //using for loop
//        for(int i=0; i<a.length; i++)    // or  for(int i=0; i<=2; i++)
//        {
//            System.out.println(a[i]);
//        }

        // using for each loop

        for (int i : a)
        {
            System.out.print(i+ ",");
        }





    }
}
