package examples.corejava.example_enum.five;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 1/24/2022, Monday
 **/

/**
 What this program snippet doing?
 // Java program to demonstrate that enums can have
 // constructor and concrete methods.

 **/

// enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
// We can’t create enum objects explicitly and hence we can’t invoke enum constructor directly.
// An enum can, just like a class , have attributes and methods.
// The only difference is that enum constants are public , static and final (unchangeable - cannot be overridden).
// An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).



enum Day {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    // enum constructor called separately for each
    // constant
    private Day(){
        System.out.println("constructor called for : "+ this.toString());
    }

    public void display(){
        System.out.println("Display Method");
    }



}
public class App {

    public static void main(String[] args) {

        Day day = Day.MONDAY;
        System.out.println(day);
        day.display(); // calling method

    }



}
