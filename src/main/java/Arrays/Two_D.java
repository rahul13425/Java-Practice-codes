package Arrays;

public class Two_D {

    public static void main(String[] args) {

//        int [] [] arr = new int[2][3];  // Declare, create 2D array

//        int [] [] arr = {{10,20,30},{40,50,50}};  //Declare, create, and initialize a 2D integer array in one line

        int [][] a = {{10,20,30}
                      ,{40,50},
                       {60,70}};   // 3 row 2 column

//        System.out.println(a[0][0]);  // Index 0,0 value show =10
//        System.out.println(a[0][1]);
//        System.out.println(a[1][0]);
//        System.out.println(a[1][1]);
//        System.out.println(a[1][2]);  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2

//        System.out.println(a.length);  // show no of row that is 3


        // with the help of two for loop we can print all the array element 
        for (int i=0; i< a.length; i++ )
        {
            for (int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
