package examples.corejava.example_abstract.two;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/9/2021, Saturday
 * Reference: https://www.geeksforgeeks.org/can-we-instantiate-an-abstract-class-in-java/
 **/

/**
 What this program snippet doing?
 This demonstrates that abstract class object cannot be created
 **/

abstract class ClassOne{

    public ClassOne(){
        System.out.println("Abstract Class Constructor called"); // Every time implementing class( here anonymous subclass) object
        // create, this Constructor would be called.
        }

    public void printSomething(){
        System.out.println("This statement is printed from Abstract class");
    }
}

public class App {

    public static void main(String[] args) {
       // Case1
        // obj points to anonymous subclass
        ClassOne obj1 = new ClassOne() {};

        // calls the implementation provided by ClassOne which is Abstract Class
        obj1.printSomething();
       // Case2:
        ClassOne obj2 = new ClassOne() {
            @Override
            public void printSomething() {
                System.out.println("This statement is printed from Anonymous Class");
            }
        };
        // calls the implementation provided by Anonymous Class
        obj2.printSomething();

    }

    /*
    Explanation:
    ClassOne is not created but the instance of an Anonymous Subclass of the abstract class. And then you are invoking the method printSomething() on the abstract class reference pointing to subclass object obj. When you have added { } while creating the object in second class, the compiler takes it as an anonymous class where { } denotes the body of the anonymous class.
     */


}
