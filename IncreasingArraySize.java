//Nathaniel Smith

/*** Increasing array size ****/
/***
4-1-13
Once an array is created, its size is fixed.
Occasionally, you need to add more values to an
array, but it is full. In such cases, you can create
a new, larger array to replace the existing array.
Write a method with the following header:

public static int[] doubleCapacity(int[] list)

The method returns a new array that doubles the size
of the parameter list. *****/

public class IncreasingArraySize{
	public static void main(String[] args){
		int[] x = {2, 3, 1, 5, 6};

		x = doubleCapacity(x);
		for(int i=0; i<x.length; i++)
		System.out.print(x[i] + "  ");
	}

public static int[] doubleCapacity(int[] x){
	int[] newX = new int[(x.length)*2];//double the length of x
	for (int i = 0; i<x.length; i++)
	newX[i] = x[i];

	return newX; //returns newX and inputs (int[] x)
}

}
