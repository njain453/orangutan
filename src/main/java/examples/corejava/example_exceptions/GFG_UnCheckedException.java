package examples.corejava.example_exceptions;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 3/4/2022, Friday
 **/

/**
 What this program snippet doing?
 **/
// Java Program to Illustrate Un-checked Exceptions

// Main class
class GFG {

    // Main driver method
    public static void main(String args[])
    {
        // Here we are dividing by 0
        // which will not be caught at compile time
        // as there is no mistake but caught at runtime
        // because it is mathematically incorrect
        int x = 0;
        int y = 10;
        int z = y / x;
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at examples.corejava.example_exceptions.GFG.main(GFG_UnCheckedException.java:24)

	In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked.
 */