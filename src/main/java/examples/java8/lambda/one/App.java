package examples.java8.lambda.one;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/15/2021, Friday
 **/

/**
 What this program snippet doing?
 Java Lambda Expression Example with Functional Interface: No Parameter
 **/

@FunctionalInterface
interface Sayable{
        public String say();  // one abstract method only.

}

public class App  {

    // 1. Old way of overriding method and implementing interface
    /* This is old way of implementation

    @Override
    public String say() {
        System.out.println("I have nothing to Say");

        return null;
    }

    public static void main(String[] args) {
        Sayable sayable = new MyApp1();
        sayable.say();    //  this call will print:  I have nothing to Say
    }

     */

    // 2. Old way of overriding method and implementing interface using anonymous class

    /*
    @Override
    public String say() {
        return null;
    }

    public static void main(String[] args) {
        Sayable sayable = new Sayable() {
            @Override
            public String say() {
                return null;
            }
        };
    }


     */

    // 3. implementation using lambda expression
//    @Override
//    public String say() {
//        return null;
//    }

    public static void main(String[] args) {
        // Following is lambda expression implementation of above Functional Interface
        Sayable sayable = () ->{
        System.out.println("I have nothing to say in lambda expression");
        return null;
        };
        sayable.say();
    }

}
