//2-18-13, more tests...

/**In this program, the continue statement forces the
current iteration to end when number equals 10 or 11.**/


public class TestContinue {
public static void main(String[] args) {
    int sum=0;
    int number=0;

    while (number < 20){
        number ++;
        sum += number;

        if (sum >= 100) break;

	//if (number == 10 || number == 11) continue;

        //sum += number;

    }//end while loop

    System.out.println("The sum is " + sum);

    }//end main()
}//end class
