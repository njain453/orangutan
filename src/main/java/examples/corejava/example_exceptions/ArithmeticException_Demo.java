package examples.corejava.example_exceptions;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/4/2022, Friday
 **/

/**
 What this program snippet doing?
 **/
// Java program to demonstrate ArithmeticException
class ArithmeticException_Demo
{
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b; // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
        finally {
            System.out.println("This is finally block which is always executed ");
            System.out.println("choose another number");
        }
    }
}
