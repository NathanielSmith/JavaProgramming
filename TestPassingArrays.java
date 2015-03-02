//Nathaniel Smith

/*** 4-8-13 You can pass arrays to methods.
There are important differences between passing
the value of variables of primitive data types
and passing arrays.
   1) For an argument of a primitive type, the argument's
   value is passed.
   2) for an argument of an array type, the value of the
   argument contains a reference to an array; this reference
   is passed to the method. *****/


 public class TestPassingArrays {
    public static void main(String[] args) {

        int x = 1;  //x represents an int value
        int[] y = new int[10];  //y represents an array of int values
        //y[0] = 0

        m(x, y); //invoke m with arguemtns x and y

        System.out.println("x is " + x);
        System.out.println("\ny[0] is " + y[0]);

        System.out.println("\n\n");

    }

    public static void m(int number, int[] numbers) {
        number = 1001;      //assign a new value to number
        numbers[0] = 5555;  //assign a new value to numbers[0]

    }//end m()
 }//end class
