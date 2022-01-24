package examples.java8.lambda.two;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/15/2021, Friday
 **/

/**
 What this program snippet doing?
 Java Lambda Expression Example: Single Parameter
 **/

@FunctionalInterface
interface Sayable{
    public String say(String name);
}

public class App1 {

    public static void main(String[] args) {

        Sayable sayable = (name) -> {

            System.out.println("This lambda output is with parameter " +name);

            return null;
        };

        sayable.say("Nitin");
    }



}
