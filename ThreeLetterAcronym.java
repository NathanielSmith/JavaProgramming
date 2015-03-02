//Nathaniel Smith
/* 4-15-13
Three-letter acronyms are common in the business world.
For example, in Java you use the IDE(Integrated Development Environment)
in the JDK(Java Development Kit) to write programs used
by the JVM(Java Virtual Machine)
that you might send over a LAN(Local Area Network).
Programmers even use the acronym TLA to stand for
three-letter acronym.
Write a program that allows a user to enter three words,
and display
the appropriate three-letter acronym in all uppercase letters.
If the user
enters more than three words, ignore the extra words. */



public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
		System.out.println(TLA("Local area network Abcde CDE"));
		//System.out.println(TLA("Three letter acronym"));

   }//end main()


   public static String TLA(String s)
   {
	   String result = " ";
	   int count = 0;
		//assign the first character of s to the result
		result += s.charAt(0);
		//check each character in s using a loop
		for(int i=1; i<s.length(); i++)
		{
			if(s.charAt(i) == ' ' )
			{
				result += s.charAt(i+1);
			}
		}
		return result.toUpperCase();
	}//end TLA()






}//end class
