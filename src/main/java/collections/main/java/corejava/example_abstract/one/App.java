
/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 10/9/2021
 **/

/**
 What this program snippet doing?

 This program demo on Abstract class usage.
 Machine is Abstract class and Camera and Car are another class extending this Abstact class.
 wE are creating objects of Camera class and Car class and calling methods of implementing class.
 **/

package collections.main.java.corejava.example_abstract.one;
public class App {
 
    public static void main(String[] args) {
        Camera cam1 = new Camera();  // we are not instantiating Machine class which is Abstract but only Car and Camera which are child classes.
        cam1.setId(5);
         
        Car car1 = new Car();
        car1.setId(4);

        Machine car2= new Car(); // this is perfectly valid as we can use reference of abstract class.
         
        car1.run(); //  object calling run method of Machine class.
        car2.run(); // Car object is again instantiated.

       //Machine machine1 = new Machine(); // Machine class cannot be instantiated as its Abstract class.


    }
 }