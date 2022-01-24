package examples.corejava.example_enum.four;/**
 * @author : Nitin Jain
 * @mailto : official.nitinjain@gmail.com
 * @created : 1/24/2022, Monday
 **/

/**
 What this program snippet doing?
 // Java program to demonstrate working of values(),
 // ordinal() and valueOf()

 **/

enum Day {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class App {

    public static void main(String[] args) {
        // print all enum values
        Day day[] = Day.values();  // can create enum object here directly as
        for(Day d:day){
            System.out.println(d);
        }

        // print ordinal
        // By using the ordinal() method, each enum constant index can be found, just like an array index.
        for(Day d:day){
            System.out.println(d + " at index " + d.ordinal());
        }

        // valueOf() method returns the enum constant of the specified string value if exists.

        String str = "MONDAY";

        // Using valueOf(). Returns an object of
        // Day with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException

        System.out.println(Day.valueOf(str));
        //System.out.println(Day.valueOf("NODAY"));

        // directly printing enum object
        System.out.println(Day.MONDAY);
        System.out.println(Day.MONDAY.getClass()); // from enum class




    }
}
