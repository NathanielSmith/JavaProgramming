//Nathaniel Smith
//2-22-13
//Nested loops.java
//Methods Power point #5
//Exercise: Chapter 5 Exercises problem #1

class NestedLoops2pt1
{
	public static void main(String [] args){

	//call nPrint()
		nPrint("Hello!", 5); //if u put this inside the main u can change the outcome
			//watch order, string first then integer!, follow the order!
			//So any string , followed by how many times.

		}//end main()

		// define a method to print "Hello" n time
		public static void nPrint(String s, int n){
		for (int i=1 ; i<= n; i++)

		System.out.println(s);
			}//end nprint()

}
