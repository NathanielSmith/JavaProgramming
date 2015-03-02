/**In this program, the break statement forces the
while loop to exit when sum is greater than or equal
to 100.***/


public class TestBreak{
public static void main(String[] args) {
    int sum=0;
    int number=0;

    while (number < 20){
        number ++;
        sum += number;


    }//end while loop

    System.out.println("The number is " + number);
    System.out.println("The sum is " + sum);

    }//end main()
}//end class
