//Nathaniel Smith
/** 4-10-13
//assignment #5
This program sorts an array's values into
ascending order.
The technique is to make several passes through
the array. On each pass, successive pairs of elements
are compared. If a pair is in increasing order (or the value
are identical), we leave the values as they are. If a pair is
in decreasing order, their values are swapped in
the array. ***/


class BubbleSorting {
    public static void main(String[] args ) {

        int[] data = {16, 12, 3, 6, 99, 102, 5, 8, 12, 67};
		bubbleSort(data);
		for (int i=0; i<data.length; i++)
		System.out.print(data[i] + " " );
        //display the sorted array


    }

//Sort elements of array with bubble sort
    	public static void bubbleSort(int[] x){//no return value just sorting.

			for (int pass=0; pass<x.length-1; pass++){
			for (int i=0; i<x.length-1;i++){
			if(x[i]>x[i+1]){
				//swap
				int temp;
				temp = x[i];
				x[i] = x[i+1];
				x[i+1] = temp;}

		}//end for i
	}// end for pass

		}//end binarySearch()




}//end class
