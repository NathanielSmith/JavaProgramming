//Nathaniel Smith 
//Date:2-18-13
/*** This program uses the while and do while loop
       uses a little swing too**/


import javax.swing.JOptionPane;

class SentinelValue{
    public static void main(String[] args) {

	//int value;
	int sum =0;
	String output = "";

	String strIn = JOptionPane.showInputDialog(null,
			"Enter an integer and enter 0 when finished : ");
	int value = Integer.parseInt(strIn);

	while(value !=0) {
		output += value + ", ";
		sum = sum + value;
	strIn = JOptionPane.showInputDialog(null,
			"Enter an integer and enter 0 when finished : ");
	value = Integer.parseInt(strIn);
	}

	//print the result
	JOptionPane.showMessageDialog(null, " You entered "
	+ output + "\nThe sum is " + sum );

  }
}
