//Nathaniel Smith

/**
3-22-13 & 4-1-13
Define a method that takes two integer arrays as
parameters and returns true if both arrays are the same
length and have equal values at corresponding indices. ****/


class TestEqualArrays{
	public static void main(String[] args){
		int[] a = {2, 1, 4}; //change to check either t/f
		int[] b = {2, 1, 4};


		System.out.println(equalArrays(a,b));

	}//end main method


	//define equalArrays method here, either a or b are true or false
	public static boolean equalArrays(int[] x, int[] y){

		if (x.length != y.length) return false; //for sure! then they are equal

		for (int i = 0; i < x.length; i++)
		if (x[i] != y[i]) return false;

		return true;//go thro each element to check if true or not



	}
}//end TestEqualArrays class
