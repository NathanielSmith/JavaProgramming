//Nathaniel Smith
// ConstructID.java
//4-15-13
/**** Write an application that prompts a user for a full name and
street address and construct an ID from the user's initials and numeric
part of the address.
for example, the user William Henry Harrison who lives at 34 Elm would
have an ID of WHH34, whereas user Addison Mitchell who lives at 1778 Monroe
would have an ID of AM1778.****/


import java.util.*;

public class ConstructID
{
   public static void main(String[] args)
   {

      Scanner s = new Scanner(System.in);

      System.out.println("Enter your full name - first, middle, and last");
      String name =s.nextLine();

      System.out.println("Enter your complete street address");
      String address =s.nextLine();


       System.out.println("\n\nID is " + GetId(name, address));

     }//end main()


/*** Defind a method that returns the user's Id.
The ID contains the user's initials and numeric part of the address. ****/

    public static String GetId(String name, String address)
    {
		String id ="";


		int count = 0;
				//assign the first character of s to the result
				id += name.charAt(0);
				//check each character in s using a loop
				for(int i=0; i<name.length(); i++)
				{
					if(s.charAt(i) == ' ' )
					{
						id += name.charAt(i+1)
						count += 1;
					}
					if(count == 2)
					{
						break
					}
				}//end the for loop

		for(int i=0; i<address.length();i++)
		{
			if(s.isDigit(s.charAt(i)));



	return id;



}//end the GetId

}//end class
