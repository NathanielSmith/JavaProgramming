//Nathaniel Smith

/*** 4-10-13
The linear search approach compares the key
element key sequentially with each element in
the array. The method continues to do so until
the key matches an element in the array or the
array is exhausted without a match being found.
If a match is made, the linear search returns
the index of the element in the array that matches
the key. If no match is found, the search returns -1. ***/


public class LinearSearch {
public static void main(String[] args ) {

    int[] a = {1,4,4,2,5,-3,6,2};
	int key = 5;//finds the index position.  so if 5 , then 4 index position...

	System.out.println(linearSearch(a, key));

}//end main()

    //Define a method that searches an array for sepcified key value
	public static int linearSearch(int[] x, int key){
		for(int i =0; i < x.length; i++){
		if(x[i] == key) //found the key
		return i; }

		return -1; //key not found


	}

}//end LinearSearch
