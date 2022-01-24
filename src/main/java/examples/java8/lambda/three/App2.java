package examples.java8.lambda.three;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/15/2021, Friday
 **/

/**
 What this program snippet doing?
 Java Lambda Expression Example: Multiple Parameters
 **/

interface Addable{
   int add(int a,int b);
}
public class App2 {

    public static void main(String[] args) {
        Addable addable = (x,y) -> {

            return x+y;
        };
        System.out.println("Sum of two given number is " +addable.add(3,5));
    }

}
