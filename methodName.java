
//Nathaniel Smith
//draft
//2-25-13


//define a mehtod that computes the sum of the digits
// in an int
public static int sumDigits(int n) {
//method body goes here
int sum =0;

while (n != 0){
//extract out the ones digit, removes the number in the ones postion
int lastDigit = n %10;
//add the extract digit to sum
sum = sum + lastDigit;
//remove the extract digit from n
n = n /10;
}//end while loop

return sum;

}//end method()
