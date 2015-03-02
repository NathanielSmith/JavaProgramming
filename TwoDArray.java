//Nathaniel Smith
/***4-12-13
//*** assignment#5
Processing 2-D arrays **/

public class TwoDArray
{
	public static void main(String[] args)
	{

    //declare and create a 10x12 2-D integer array
   		double[][]matrix = new double[10][12];//[# of rows][#of cols]

    //initializing the array with random values
		for(int row = 0; row < matrix.length ; row++){
		for( int col = 0; col < matrix[0].length; col++){
			matrix[row][col] = (Math.random()*100);//assign random number here
		}//end for col
}//end for row

    //printing the array
    System.out.println("The two dimensional array is: \n" );
		for(int row = 0; row < matrix.length ; row++)
		{
			for( int col = 0; col < matrix[0].length; col++){
		System.out.printf("%6.1f", matrix[row][col]);
	}//end for col

	//start a new line
	System.out.println();

}//end for row


    System.out.println("\n\n");


    //summing elements by column
	double col0sum = 0;//column zero sum

	for(int i = 0; i<matrix.length; i++)
	col0sum += matrix[i][0];

	System.out.println("\n\nColumn 0's sum is " + col0sum);


        System.out.println("\n\n\n");

    }//end main()
}//end class
