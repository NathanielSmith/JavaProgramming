/****  Nathaniel D. Smith
Date: 2-8-13.
Use switch statement to rewrite the following if statement. **/


class IfVsSwitch {
    public static void main(String[] args) {

    int a, x;

    a = 1;
    x = 0;

    /*if (a == 1)
        x += 5;
    else if (a == 2)
        x += 10;
    else if (a == 3)
        x += 16;
    else if (a ==4)
        x += 34;*/

        switch(a) {
			case 1:
			x += 5;
			break;//remember to break b/c java will go to the next case.
			case 2:
			x += 10;
			break;
			case 3:
			x += 16;
			break;
			case 4:
			x += 34;
			break;
			default:
			x = 0;

}



    System.out.println("x is : " + x);


    }//end main method
}//end class
