//Nathaniel Smith
/**4-10-13
//assignment #5
Write a program that creates an integer array
and then use a for loop to check whether the array
is sorted from smallest to largest. If so, it prints
"Sorted", otherwise, it prints "Not Sorted". **/


class CheckSorting {
  public static void main(String[] args) {
    int[] data = { 1, 2, 3, 6, 99 ,102};
	System.out.println(checking(data));

}//end main()


    // check if data is sorted
	public static boolean checking(int[] x){
		for(int i=0; i<x.length-1; i++)
		if (x[i] > x[i+1] ) return false;

		return true;

	}


}//end class
