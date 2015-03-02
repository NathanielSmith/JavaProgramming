/** Nathaniel D. Smith 
	Date: 3-25-13
	Assignment #3, problem 2
	 * Lottery Application- Write a Lottery application that simulates a lottery.
	 * Program should generate a random
	 * number in the range of 0 through 9 for each element in the array.
	 */

	import java.util.Scanner;
	import java.util.Random;

	class Lottery {
	 	    /**
	     * The lottery numbers.
	     */
	    private int lotteryNumbers[];

	    /**
	     * Default Constructor.
	     */
	    public Lottery() {
	        Random rand = new Random(System.currentTimeMillis());
	        lotteryNumbers = new int[5];
	        for (int i = 0; i < lotteryNumbers.length; i++) {
	            lotteryNumbers[i] = Math.abs(rand.nextInt()) % 10;
	        }
	    }

	    public int compareNumbers(int[] usersNumbers) {
	        int match = 0;
	        if (usersNumbers.length == lotteryNumbers.length) {
	            for (int i = 0; i < lotteryNumbers.length; i++) {
	                if (usersNumbers[i] == lotteryNumbers[i]) {
	                    match++;
	                }
	            }
	        }
	        return match;
	    }

	    public int[] getLotteryNumbers() {
	        return lotteryNumbers;
	    }
	}
	public class LotteryApplication {
	    public static void main(String[] args) {
	        Lottery lottery = new Lottery();
	        int lotteryNumbersCount = lottery.getLotteryNumbers().length;


	        // Asks the user to enter five numbers.
	        System.out.println("Enter your 5 single digit lottery numbers ");
			System.out.println("<Use the spacebar to separate digits> : ");
			System.out.println("Your inputs: " + lotteryNumbers);
			System.out.println("Lottery Numbers :" + lotteryNumbersCount);

	        Scanner kb = new Scanner(System.in);
	        int numbers[] = new int[lotteryNumbersCount];

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print(String.format("Enter Number %d: ", i + 1));
	            numbers[i] = kb.nextInt();
	        }

	        // Display the number of digits that match the randomly generate
	        // lottery numbers.

	        int match = lottery.compareNumbers(numbers);

	        if (match == lotteryNumbersCount) {

	            // If all of the digits match, display a message proclaiming the
	            // user a grand prize winner.
	            System.out.println("\nWOHOO! ALL CORRECT! YOU WON THE BIG PRIZE!");

	        } else {

	            System.out.println("\nUh-oh! You hit " + match + " number(s).");
	            System.out.println("Do you want to play again <Enter Y or N>? " );
	        }

	    }
}
