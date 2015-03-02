//Nathaniel D. Smith 
//4-13-13
//Assignment #4, problem 2
//This program performs arithmetic with complex numbers


import java.io.*;

class Complex {

    // Define variables for real part, imaginary part
    double real,imag;  // Complex Number is real + i imag
    double product,creal,cimag;
    String print;
    Complex c;

   public Complex(double x,  double y)
    {this.real = x;this.imag = y;}

void setReal (double realIn) {
  this.real = realIn;
  }

void setImag (double imagIn) {
  this.imag = imagIn;
  }
    //  getter methods for real an imaginary
double getReal () { return this.real;  }
double getImag () { return this.imag;  }

 public static Complex times(Complex a, Complex b) {
        Complex c = new Complex(0,0);
        c.real = (a.real*b.real-a.imag*b.imag);
        c.imag = (a.real*b.imag+a.imag*b.real);
        return (c);
 }

    // Add Complex
 public static Complex add(Complex a, Complex b) {
        Complex c = new Complex(0,0);
        c.real = (a.real+b.real);
        c.imag = (a.imag+b.imag);
        return (c);
 }
    // Subtract Complex
 public static Complex subtract(Complex a, Complex b) {
        Complex c = new Complex(0,0);
        c.real = (a.real-b.real);
        c.imag = (a.imag-b.imag);
        return (c);
 }
void printString () {
   this.print = "{" + real + "+" + imag + "i" + "}" ;
      System.out.println(this.print);
   }

}
// End of the complex class
