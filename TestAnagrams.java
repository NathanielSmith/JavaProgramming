//Nathaniel Smith
/***4-22-13
Use this for assignment #5
Write a method that checks whether two words
are anagrams. Two words are anagrams if they contain
the same letters in any order. For example, "silent" and
"listen", are anagrams. The header of the method is as follows:

public static boolean isAnagram(String s1, String s2)   **/

import java.util.*;

public class TestAnagrams {
  public static void main(String args[]) {


  }//end main()


	//check if two words are anagrams
  public static boolean isAnagram(String s1, String s2) {
	String str1 = bubbleSort(s1);
	String str2 = bubbleSort(s2);

	if (str1.equalsIgnoreCase(str2))
	return true;
	else
	return false;
  }
	public static String bubbleSort(String s) {
		StringBuffer bufferStr1 = new StringBuffer(s);

		(int pass = 0; pass<bufferS.length()-1; pass++) { //passes

		for (int i= 0; i<bufferS.length()-1; i++) { //one pass
		 if (bufferS.charAt(i)>bufferS.charAt(i+1)) {   //comparison
				  char temp;
				   temp = bufferS(i);

				    bufferS.setCharAt(i, bufferS.charAt(i+1);
		            bufferS.charAt(i+1, temp);}

				}//end if
		}//end for i


	return bufferS.toString();

}


}//end class
