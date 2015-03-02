//Nathaniel Smith
/** This program sorts an array's values into
ascending order.
The technique is to make several passes through
the array. On each pass, successive pairs of elements
are compared. If a pair is in increasing order (or the value
are identical), we leave the values as they are. If a pair is
in decreasing order, their values are swapped in
the array. ***/


public class BubbleSort2 {
    public static void main(String[] args ) {

        int[] x = {2, 9, 5, 4, 8, 1, 6};

        //display the sorted array
        bubbleSort(x);
        for (int i=0; i<x.length; i++)
        System.out.print(x[i]+",  ");

    }

    public static void bubbleSort(int[] a) {

        for (int pass = 0; pass<a.length-1; pass++) { //passes

            for (int i= 0; i<a.length-1; i++) { //one pass
                if (a[i] >a[i+1]) {   //comparison
                    int temp;
                    temp = a[i];        //swap
                    a[i] = a[i+1];
                    a[i+1] = temp;} //end if

                }//end for i
            }//end for pass

    }//end bubbleSort()

}//end class
