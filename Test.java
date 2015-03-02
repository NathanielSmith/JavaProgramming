//2-27-13
//Exercise #2  prob 1 ch 5

class Test{
	public static void main(String[] args) {

//print all perfect numbers b/w 1 and 1000

	for (int i = 1; i<1000; i++){
	if (Perfect(i) == true)
	System.out.print(i + "  ");}


	}//end main()

//define a method that checks if an integer is a perfect number
public static boolean Perfect(int x) {
	int sum = 0;

	for (int i = 1; i<x; i++){
	if (x % i ==0)
		sum +=i;} //end for

		if (sum == x)
		return true;
		else
		return false;

}//end perfect()


}//end class
